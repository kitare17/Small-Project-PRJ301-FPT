package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/register_form.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>FPTU_Website Demo </title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"is-preload\">\n");
      out.write("\n");
      out.write("        <!-- Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Main -->\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <div class=\"inner\">\n");
      out.write("\n");
      out.write("                    <!-- Header -->\n");
      out.write("                    <header id=\"header\">\n");
      out.write("                        <img src=\"images/fpt_logo.png\" alt=\"\" />\n");
      out.write("\n");
      out.write("                        <ul class=\"icons\">\n");
      out.write("                            <li><a href=\"#\" class=\"icon brands fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icon brands fa-facebook-f\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icon brands fa-snapchat-ghost\"><span class=\"label\">Snapchat</span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icon brands fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icon brands fa-medium-m\"><span class=\"label\">Medium</span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </header>\n");
      out.write('\n');
      out.write('\n');
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
      out.write("    <form action=\"register\" method=\"post\"  >\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
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
      out.write("                    <td> <input type=\"file\" name=\"anh\"> </td>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer id=\"footer\">\n");
      out.write("    <p class=\"copyright\">&copy; Java Website Demo </a>. Design by: HOAINTT40 </a>.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Scripts -->\n");
      out.write("<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("<script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("<script src=\"assets/js/util.js\"></script>\n");
      out.write("<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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
