  /*@lineinfo:filename=/Bueno.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _Bueno extends oracle.jsp.runtime.HttpJsp {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _Bueno page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:user-code*//*@lineinfo:14^1*/      out.print( session.getAttribute("ini.usu"));
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:15^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/menu");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:19^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_2=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("boton");
              __jsp_taghandler_2.setValue("Registrar Jugador");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:20^10*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_3=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("boton");
              __jsp_taghandler_3.setValue("Listar Jugador");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:25^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_4=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setProperty("boton");
              __jsp_taghandler_4.setValue("Registrar Entrenador");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:26^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_5=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("boton");
              __jsp_taghandler_5.setValue("Listar Entrenador");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:30^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_6=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setProperty("boton");
              __jsp_taghandler_6.setValue("Registrar Arbitro");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:31^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_7=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("boton");
              __jsp_taghandler_7.setValue("Listar Arbitro");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:35^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setProperty("boton");
              __jsp_taghandler_8.setValue("Regsitrar Partido");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:36^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("boton");
              __jsp_taghandler_9.setValue("Listar Partido");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:40^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_10=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_1);
              __jsp_taghandler_10.setProperty("boton");
              __jsp_taghandler_10.setValue("Regsitrar Torneo");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:41^9*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setProperty("boton");
              __jsp_taghandler_11.setValue("Listar Torneo");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[13]);
          /*@lineinfo:translated-code*//*@lineinfo:41^63*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[14]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final char text[][]=new char[15][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<title>\nHello World\n</title>\n</head>\n<body>\n<h2>\nMenu para Gestionar el torneo Gran Slam\n</h2>\n".toCharArray();
      text[2] = 
      "\n".toCharArray();
      text[3] = 
      "\n<table  cellspacing=\"2\" cellpadding=\"2\" border=\"1\" width=\"60%\" align=\"center\">\n<tr><td colspan=2>Gestion de Jugadores</td></tr>\n<tr align=\"center\">\n    <td>".toCharArray();
      text[4] = 
      "</td>\n     <td>".toCharArray();
      text[5] = 
      "</td>\n     \n</tr>\n<tr align=\"center\"><td colspan=2>Gestion de Entrenadores</td></tr>\n<tr>\n    <td>".toCharArray();
      text[6] = 
      "</td>\n    <td>".toCharArray();
      text[7] = 
      "</td>\n</tr>\n<tr align=\"center\"><td colspan=2>Gestion de Arbitros</td></tr>\n<tr>\n    <td>".toCharArray();
      text[8] = 
      "</td>\n    <td>".toCharArray();
      text[9] = 
      "</td>\n</tr>\n<tr align=\"center\"><td colspan=2>Gestion de Partidos</td></tr>\n<tr>\n    <td>".toCharArray();
      text[10] = 
      "</td>\n    <td>".toCharArray();
      text[11] = 
      "</td>\n</tr>\n<tr align=\"center\"><td colspan=2>Gestion de Torneos</td></tr>\n<tr>\n    <td>".toCharArray();
      text[12] = 
      "</td>\n    <td>".toCharArray();
      text[13] = 
      "</td>\n</tr>\n</table>\n".toCharArray();
      text[14] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
