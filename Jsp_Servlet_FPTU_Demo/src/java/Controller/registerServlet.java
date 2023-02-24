/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import Model.User;
import Model.UserDB;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author PC
 */
@WebServlet(name = "registerServlet", urlPatterns = {"/register"})

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class registerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private static String ramdomID() {
        String maNganh = "DE";
        int khoa = 160000;
        Random rd = new Random();
        String maSV = "";
        do {
            khoa = 160000 + rd.nextInt(10000);
            maSV = maNganh + khoa;
        } while (UserDB.findUser(maSV) != null);

        return maSV;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = ramdomID();
            String ten = request.getParameter("ten");
            boolean gioiTinh = Boolean.parseBoolean(request.getParameter("gioiTinh"));
            String ngaySinh = request.getParameter("ngaySinh");
            String quocTich = request.getParameter("quocTich");
            String diaChi = request.getParameter("diaChi");
            String dienThoai = request.getParameter("dienThoai");
            String nganhHoc = request.getParameter("nganhHoc");
            request.setAttribute("thongbao", "Đăng kí thành công");
            User user = new User(id, ten, gioiTinh, ngaySinh, quocTich, diaChi, dienThoai, nganhHoc);
            UserDB.insertUser(user);
            
            System.out.println(id+" "+ten + " " + gioiTinh + " " + ngaySinh + " " + quocTich + " " + diaChi + " " + dienThoai + " " + nganhHoc + " ");
            String savePath = "E:\\FPTU_Website_Jsp (1)\\Jsp_Servlet_FPTU_Demo\\Jsp_Servlet_FPTU_Demo\\web\\images\\student";

            File f = new File(savePath);

            for (Part part : request.getParts()) {
                System.out.println(part.getHeader("content-disposition"));
                if (!part.getHeader("content-disposition").contains("filename")) {
                    continue;
                }

                String fileName = id + ".jpg";

                if (fileName != null && fileName.length() > 0) {
                    String filePath = savePath + File.separator + fileName;
                    part.write(filePath);
                }

            }
          // User newStudent=new User(id,ten,gioiTinh,ngaySinh,quocTich,diaChi,dienThoai,nganhHoc);

            request.getRequestDispatcher("register.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
