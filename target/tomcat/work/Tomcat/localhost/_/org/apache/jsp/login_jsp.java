/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-03-10 06:56:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>NOTIFIER</title>\r\n");
      out.write("    <meta name=\"description\" content=\"SIGNUP NOTIFIER application\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"robots\" content=\"all,follow\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap CSS-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Font Awesome CSS-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom Font Icons CSS-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/font.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Google fonts - Muli-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Muli:300,400,700\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- theme stylesheet-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style.default.css\" id=\"theme-stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom stylesheet - for your changes-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/custom.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Favicon-->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"login-page\">\r\n");
      out.write("      <div class=\"container d-flex align-items-center\">\r\n");
      out.write("        <div class=\"form-holder has-shadow\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <!-- Logo & Information Panel-->\r\n");
      out.write("            <div class=\"col-lg-6\">\r\n");
      out.write("              <div class=\"info d-flex align-items-center\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <div class=\"logo\">\r\n");
      out.write("                    <h1>NOTIFIER</h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Form Panel    -->\r\n");
      out.write("            <div class=\"col-lg-6\">\r\n");
      out.write("              <div class=\"form d-flex align-items-center\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <form id=\"loginform\" name=\"loginform\" action=\"/login\" method=\"POST\" class=\"mb-4\">\r\n");
      out.write("                  <span><label id=\"login-error\" class=\"error\" for=\"loginform\">\r\n");
      out.write("                  ");
      out.print((request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage"));
      out.write("\r\n");
      out.write("                  </label></span>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <input id=\"email\" type=\"email\" name=\"email\" class=\"input-material\">\r\n");
      out.write("                      <label for=\"email\" class=\"label-material\">EMail</label>\r\n");
      out.write("                      <span><label id=\"email-error\" class=\"error\" for=\"email\"></label></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <input id=\"password\" type=\"password\" name=\"password\" class=\"input-material\">\r\n");
      out.write("                      <label for=\"password\" class=\"label-material\">Password</label>\r\n");
      out.write("                      <span><label id=\"password-error\" class=\"error\" for=\"password\"></label></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("                  </form><a href=\"#\" class=\"forgot-pass\">Forgot Password?</a><br><small>Do not have an account? </small><a href=\"register.html\" class=\"signup\">Signup</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t   <!-- JavaScript files-->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/popper.js/umd/popper.min.js\"> </script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/jquery.cookie/jquery.cookie.js\"> </script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/vendor/jquery-validation/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/front.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/custom.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("      <script>\r\n");
      out.write("      $(function() {\r\n");
      out.write("    \t  \r\n");
      out.write("    \t  \r\n");
      out.write("        $(\"form[name='loginform']\").validate({\r\n");
      out.write("          \r\n");
      out.write("          rules: {\r\n");
      out.write("            email: {required:true,\r\n");
      out.write("            email:true\r\n");
      out.write("          },\r\n");
      out.write("           password:{\r\n");
      out.write("        required:true,minlength:8,maxlength:15,\r\n");
      out.write("        pswcheck:true}\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          },\r\n");
      out.write("          messages: {\r\n");
      out.write("            email: {required:\"Please enter your email\",email:\"Please enter vaild email\"},\r\n");
      out.write("             password: {required:\"please enter your password\",minlength:\"minimum password lenght must be 8\",maxlenght:\"maximum password length must be 15\",pswcheck:\"minmum 1 lowercase,1 uppercase,1 special character,1 digit\"}\r\n");
      out.write("          \r\n");
      out.write("          }   \r\n");
      out.write("        });\r\n");
      out.write("      });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
