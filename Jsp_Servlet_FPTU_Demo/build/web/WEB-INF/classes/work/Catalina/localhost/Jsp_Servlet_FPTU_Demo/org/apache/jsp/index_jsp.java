/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-02-25 13:36:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/includes/banner_news.jsp", Long.valueOf(1677331829498L));
    _jspx_dependants.put("/includes/column_left_home.jsp", Long.valueOf(1677331829500L));
    _jspx_dependants.put("/includes/banner_hotnews.jsp", Long.valueOf(1677331829495L));
    _jspx_dependants.put("/includes/banner_major.jsp", Long.valueOf(1677331829497L));
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1677331829503L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1677331829505L));
    _jspx_dependants.put("/includes/login.jsp", Long.valueOf(1677331829508L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("Model");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\n");
      out.write("<section id=\"banner\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                    <header>\n");
      out.write("                            <h1>TUY???N SINH 2022\n");
      out.write("                                    <br />\n");
      out.write("                                    C???p nh???t h???c ph?? cho t??n sinh vi??n</h1>\n");
      out.write("\n");
      out.write("                    </header>\n");
      out.write("                    <p>\n");
      out.write("                            ?????i h???c FPT l?? c?? h???i tuy???t v???i cho sinh vi??n ???????c tr???i nghi???m th???c t??? m??i tr?????ng h???c t???p k???t n???i c??ng doanh nghi???p. H???c t???p l?? g???n li???n v???i s??? nghi???p v?? tr???i nghi???m th???c t???\n");
      out.write("                            <br />\n");
      out.write("                            T??? n??m 2020, ?????i h???c FPT s??? d???ng h??nh th???c tuy???n sinh theo ti??u ch?? TOP50 (50% h???c sinh c?? n??ng l???c h???c t???p t???t nh???t c??? n?????c.\n");
      out.write("                    </p>\n");
      out.write("                    <ul class=\"actions\">\n");
      out.write("                            <li><a href=\"#\" class=\"button big\">More</a></li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"image object\">\n");
      out.write("                    <img src=\"images/fpt_tuyensinh01.webp\" alt=\"\" />\n");
      out.write("            </span>\n");
      out.write("    </section>\n");
      out.write('\r');
      out.write('\n');
      out.write("<!-- Section -->\n");
      out.write("<section>\n");
      out.write("    <header class=\"major\">\n");
      out.write("        <h2>Ng??nh h???c</h2>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"features\">\n");
      out.write("        <article>\n");
      out.write("            <span class=\"icon fa-gem\"></span>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>C??ng ngh??? th??ng tin</h3>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    K?? thu???t Ph???n m???m</br>\n");
      out.write("                    An to??n Th??ng tin</br>\n");
      out.write("                    Tr?? tu??? Nh??n t???o</br>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <span class=\"icon solid fa-paper-plane\"></span>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>Qu???n tr??? kinh doanh</h3>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    Digital Marketing </br>\n");
      out.write("                    Kinh doanh Qu???c t???</br>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <span class=\"icon solid fa-rocket\"></span>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>Ng??n ng??? h???c</h3>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    Ng??n ng??? Anh </br>\n");
      out.write("                    Ng??n ng??? Nh???t </br>\n");
      out.write("                    Ng??n ng??? H??n (d??? ki???n) </br>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <span class=\"icon solid fa-signal\"></span>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>Du l???ch kh??ch s???n</h3>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    Qu???n tr??? Kh??ch s???n </br>\n");
      out.write("                    Qu???n tr??? D???ch v??? Du l???ch v?? L??? h??nh </br>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write('\r');
      out.write('\n');
      out.write("<!-- Section -->\n");
      out.write("<section>\n");
      out.write("    <header class=\"major\">\n");
      out.write("        <h2>Tin t???c n???i b???t</h2>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"posts\">\n");
      out.write("        <article>\n");
      out.write("            <a href=\"#\" class=\"image\"><img src=\"images/fpt_tuyensinh02.webp\" alt=\"\" /></a>\n");
      out.write("            <h3>?????i h???c FPT th??ng b??o tuy????n sinh H???? ??a??i ho??c chi??nh quy ??????t b???? sung n??m 2022 </h3>\n");
      out.write("            <p>Tr?????ng ?????i h???c FPT tr??n tr???ng th??ng b??o tuy???n sinh H??? ?????i h???c ch??nh quy ?????t b??? sung n??m 2022 nh?? sau: I. L???ch tr??nh tuy???n sinh ?????t b??? sung Th???i gian ????ng k?? v?? n???p h??? s??: t??? ng??y 16/9/2022. II. Th??? t???c ????ng k?? 1. H??? s?? ????ng</p>\n");
      out.write("            <ul class=\"actions\">\n");
      out.write("                <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <a href=\"#\" class=\"image\"><img src=\"images/fpt_tk01.jpg\" alt=\"\" /></a>\n");
      out.write("            <h3>Sinh vi??n ????? h???a ??H FPT ???v?????? app k???t n???i gia ????nh trong th???i s??? h??a</h3>\n");
      out.write("            <p>???Nh?? m??nh??? ??? ???ng d???ng g???n k???t v?? chia s??? c???m x??c c???a c??c th??nh vi??n trong gia ????nh ???????c ?????ng Minh Ph????ng v?? B??i ?????c Qu??n (Ng??nh Thi???t k??? M??? thu???t s???, ??H FPT ???? N???ng) tr??nh di???n th??nh c??ng tr?????c h???i ?????ng kh??a lu???n.</p>\n");
      out.write("            <ul class=\"actions\">\n");
      out.write("                <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <a href=\"#\" class=\"image\"><img src=\"images/fpt_news01.jpg\" alt=\"\" /></a>\n");
      out.write("            <h3>?????i s??? Hoa K??? Marc Evans Knapper ?????n th??m v?? l??m vi???c t???i ?????i h???c FPT</h3>\n");
      out.write("            <p>Chi???u ng??y 27/08/2022, Ng??i Marc Evans Knapper ??? ?????i s??? Hoa K??? t???i Vi???t Nam ???? c?? chuy???n th??m, l??m vi???c t???i ?????i h???c FPT ???? N???ng. PGS.TS. Tr????ng Gia Bi??nh ??? Ch??? t???ch H??QT T????p ??oa??n FPT ch??? tr?? bu???i ti???p ??o??n.</p>\n");
      out.write("            <ul class=\"actions\">\n");
      out.write("                <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <a href=\"#\" class=\"image\"><img src=\"images/fpt_news_totnghiep01.webp\" alt=\"\" /></a>\n");
      out.write("            <h3>Sinh vi??n ?????i h???c FPT ???? N???ng b???o v??? th??nh c??ng kh??a lu???n t???t nghi???p k??? Summer 2022</h3>\n");
      out.write("            <p>K??? b???o v??? ????? ??n k??? Summer 2022 c???a sinh vi??n ?????i h???c FPT ???? N???ng ???? di???n ra th??nh c??ng t??? 23/8/2022 ?????n 26/08/2022 v???i s??? tham gia c???a sinh vi??n thu???c c??c ng??nh K??? thu???t ph???n m???m, Thi???t k??? M??? thu???t s???, Qu???n tr??? kinh doanh v?? Qu???n tr??? Du l???ch ??? Kh??ch s???n.</p>\n");
      out.write("            <ul class=\"actions\">\n");
      out.write("                <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </article>										\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');
      out.write("	\n");
      out.write("<!-- Sidebar -->\n");
      out.write("<div id=\"sidebar\">\n");
      out.write("    <div class=\"inner\">\n");
      out.write("\n");
      out.write("        <!-- Search -->\n");
      out.write("        <section id=\"search\" class=\"alt\">\n");
      out.write("            <form method=\"post\" action=\"#\">\n");
      out.write("                <input type=\"text\" name=\"query\" id=\"query\" placeholder=\"Search\" />\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Menu -->\n");
      out.write("        <nav id=\"menu\">\n");
      out.write("            <header class=\"major\">\n");
      out.write("                <h2>Menu</h2>\n");
      out.write("            </header>\n");
      out.write("            <style>\n");
      out.write("                ul.navigation-menu>li>div{\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("                ul.navigation-menu>li:hover>div{\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <ul class=\"navigation-menu\">\n");
      out.write("                <li><a href=\"index.html\">Trang ch???</a></li>\n");
      out.write("                <li><a href=\"generic.html\">Tin t???c</a></li>\n");
      out.write("                <li>\n");
      out.write("                    <span class=\"opener\">Ng??nh h???c</span>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">C??ng ngh??? th??ng tin</a></li>\n");
      out.write("                        <li><a href=\"#\">Qu???n tr??? kinh doanh</a></li>\n");
      out.write("                        <li><a href=\"#\">Ng??n ng??? Anh</a></li>\n");
      out.write("                        <li><a href=\"#\">Ng??n ng??? Nh???t</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">?????i s???ng sinh vi??n</a></li>\n");
      out.write("                <li><a href=\"#\">Tuy???n sinh</a></li>\n");
      out.write("                <li><a href=\"#\">Li??n h???</a></li>\n");
      out.write("                <li><a href=\"list\">Login</a>\n");
      out.write("                    <div class=\"login-page\"> \n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"login-page\">\n");
      out.write("    <div class=\"form\">\n");
      out.write("        <form class=\"register-form\">\n");
      out.write("            <input type=\"text\" placeholder=\"name\"/>\n");
      out.write("            <input type=\"password\" placeholder=\"password\"/>\n");
      out.write("            <input type=\"text\" placeholder=\"email address\"/>\n");
      out.write("            <button>Create</button>\n");
      out.write("            <p class=\"message\">Already registered? <a href=\"#\">Sign In</a></p>\n");
      out.write("        </form>\n");
      out.write("        <form class=\"login-form\" action =\"login\" method=\"GET\">\n");
      out.write("            <input type=\"text\" placeholder=\"username\" name=\"user\"/>\n");
      out.write("            <input type=\"password\" placeholder=\"password\" name=\"pass\"/>\n");
      out.write("            <button>Login</button>\n");
      out.write("            <p class=\"message\">Not registered? <a href=\"#\">Create an account</a></p>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"list\">Danh s??ch sinh vi??n</a></li>\n");
      out.write("                <li><a href=\"register\">????ng k?? nh???p h???c</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Section -->\n");
      out.write("        <section>\n");
      out.write("            <header class=\"major\">\n");
      out.write("                <h2>S??? ki???n</h2>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"mini-posts\">\n");
      out.write("                <article>\n");
      out.write("                    <a href=\"#\" class=\"image\"><img src=\"images/fpt_sukien01.webp\" alt=\"\" /></a>\n");
      out.write("                    <p>H???i th???o v?? kh??a h???c b???o m???t th??ng tin d??nh cho sinh vi??n FPTU ???? N???ng </p>\n");
      out.write("                </article>\n");
      out.write("                <article>\n");
      out.write("                    <a href=\"#\" class=\"image\"><img src=\"images/fpt_sukien02.webp\" alt=\"\" /></a>\n");
      out.write("                    <p>H???c t???p su???t ?????i ??? ?????i h???c FPT c???p t??i kho???n Coursera mi???n ph?? cho c???u sinh vi??n</p>\n");
      out.write("                </article>\n");
      out.write("                <article>\n");
      out.write("                    <a href=\"#\" class=\"image\"><img src=\"images/fpt_sukien03.webp\" alt=\"\" /></a>\n");
      out.write("                    <p>?????i h???c FPT n???ng nhi???t ch??o ????n T???p ??o??n Jardines Matheson (JM)</p>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"actions\">\n");
      out.write("                <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Section -->\n");
      out.write("        <section>\n");
      out.write("            <header class=\"major\">\n");
      out.write("                <h2>Li??n h???</h2>\n");
      out.write("            </header>\n");
      out.write("            <!--<p>Sed varius enim .</p>-->\n");
      out.write("            <ul class=\"contact\">\n");
      out.write("                <li class=\"icon solid fa-envelope\"><a href=\"#\">dnuni@fe.edu.vn</a></li>\n");
      out.write("                <li class=\"icon solid fa-phone\">(0236) 730 0999</li>\n");
      out.write("                <li class=\"icon solid fa-home\">Khu ???? Th??? FPT ???? N???ng,<br /> P. H??a H???i, Q.Ng?? H??nh S??n, TP ???? N???ng</li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write('\r');
      out.write('\n');
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
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
