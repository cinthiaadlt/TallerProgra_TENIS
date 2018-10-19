package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuenoAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    BuenoForm m=(BuenoForm) form;
    String bot=m.getBoton();
    String to="";
    request.getSession().setAttribute("botm",bot);
     if(bot.equals("Registrar Jugador") )
      to="altaj";
    if(bot.equals("Listar Jugador"))
      to="listaj";
   /* if(bot.equals("Jugadores"))
    to="jugador";
    if(bot.equals("Entrenadores"))
    to="entrenador";*/
    if(bot.equals("Registrar Entrenador") )
      to="altae";
   if(bot.equals("Listar Entrenador"))
      to="listae";
    if(bot.equals("Registrar Arbitro"))
    to="altaa";
     if(bot.equals("Listar Arbitro"))
      to="listaa";
    if(bot.equals("Regsitrar Partido"))
    to="altap";
    if(bot.equals("Listar Partido"))
      to="listap";
    if(bot.equals("Registra Torneo"))
    to="altat"; 
     if(bot.equals("Listar Torneo"))
      to="listat";

    return mapping.findForward(to);
  }
}