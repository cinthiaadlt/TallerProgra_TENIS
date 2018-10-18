<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Registrar nuevo jugador
</h2>
<%= session.getAttribute("ini.usu")%>

<html:form action="/altj">
<table  cellspacing="2" cellpadding="2" border="1" width="100%" align="center">
<!--En el archivo AplicationResources.properties se definen las etiquetetas textuales que se mostrara en el formulario para cada caja. 
se utiliza el key para identificar el campo que se etiquetara: ej
altas_j.nom=Nombre Jugador-->
<tr>
    <td><bean:message key="altj.nom" />:</td>
    <td><html:text property="nombre_j" /></td>
</tr>
<tr>
    <td><bean:message key="altj.ap" />:</td>
    <td><html:text property="apellido_j" /></td>
</tr>
<tr>
    <td><bean:message key="altj.gen" />:</td>
    <td><html:text property="genero_j" /></td>
</tr>
<tr>
    <td><bean:message key="altj.nac" />:</td>
    <td><html:text property="nacionalidad_j" /></td>
</tr>
<tr>
    <td><bean:message key="altj.gana" />:</td>
    <td><html:text property="ganancia_j" /></td>
</tr>
<tr>
    <td colspan="2" align="center"><html:submit value="Registrar" />
</td>
</tr>
</table>
</html:form>
</body>
</html>
