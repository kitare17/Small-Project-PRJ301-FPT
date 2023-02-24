package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <h2>\n");
      out.write("        Chào mừng tân sinh viên đến với Đại học FPT\n");
      out.write("    </h2>\n");
      out.write("    <h2 style=\"color: red;text-align: center \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("    <form action=\"register\" method=\"post\"   >\n");
      out.write("        <table border=\"1\">\n");
      out.write("        <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tên</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"ten\"> </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Giới tính</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"gioiTinh\">\n");
      out.write("                            <option value=\"true\">Nam</option>\n");
      out.write("                            <option value=\"false\">Nữ</option>\n");
      out.write("                        </select>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ngày sinh</td>\n");
      out.write("                    <td><input type=\"date\" name=\"ngaySinh\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Quốc tịch</td>\n");
      out.write("                    <td><input type=\"text\" name=\"quocTich\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Địa chỉ</td>\n");
      out.write("                    <td><input type=\"text\" name=\"diaChi\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Điện thoại</td>\n");
      out.write("                    <td><input type=\"text\" name=\"dienThoai\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ngành học</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"nganhHoc\">\n");
      out.write("                            <option value=\"CNTT\">CNTT</option>\n");
      out.write("                            <option value=\"Quản trị kinh doanh\">Quản trị kinh doanh</option>\n");
      out.write("                            <option value=\"Ngôn ngữ Hàn\">Ngôn ngữ Hàn</option>\n");
      out.write("                            <option value=\"Ngôn ngữ Anh\">Ngôn ngữ Anh</option>\n");
      out.write("                            <option value=\"Đa cấp\">Đa cấp</option>\n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ảnh đính kèm</td>\n");
      out.write("                    <td> <input type=\"file\" name=\"file\"> </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <input type=\"submit\" value=\"Đăng kí\">\n");
      out.write("           \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</section>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
