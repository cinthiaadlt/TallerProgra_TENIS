package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltasJForm extends ActionForm 
{
  String nombre_j;
  String apellido_j;
  String genero_j;
  String nacionalidad_j;
  String ganancia_j;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getNombre_j()
  {
    return nombre_j;
  }

  public void setNombre_j(String newNombre_j)
  {
    nombre_j = newNombre_j;
  }

  public String getApellido_j()
  {
    return apellido_j;
  }

  public void setApellido_j(String newApellido_j)
  {
    apellido_j = newApellido_j;
  }

  public String getGenero_j()
  {
    return genero_j;
  }

  public void setGenero_j(String newGenero_j)
  {
    genero_j = newGenero_j;
  }

  public String getNacionalidad_j()
  {
    return nacionalidad_j;
  }

  public void setNacionalidad_j(String newNacionalidad_j)
  {
    nacionalidad_j = newNacionalidad_j;
  }

  public String getGanancia_j()
  {
    return ganancia_j;
  }

  public void setGanancia_j(String newGanancia_j)
  {
    ganancia_j = newGanancia_j;
  }
}