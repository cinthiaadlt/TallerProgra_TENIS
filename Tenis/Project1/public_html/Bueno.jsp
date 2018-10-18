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
Menu para Gestionar el torneo Gran Slam
</h2>
<%= session.getAttribute("ini.usu")%>
<html:form action="/menu">
<table  cellspacing="2" cellpadding="2" border="1" width="60%" align="center">
<tr><td colspan=2>Gestion de Jugadores</td></tr>
<tr align="center">
    <td><html:submit property="boton" value="Registrar Jugador"/></td>
     <td><html:submit property="boton" value="Listar Jugador" /></td>
     
</tr>
<tr align="center"><td colspan=2>Gestion de Entrenadores</td></tr>
<tr>
    <td><html:submit property="boton" value="Registrar Entrenador"/></td>
    <td><html:submit property="boton" value="Listar Entrenador" /></td>
</tr>
<tr align="center"><td colspan=2>Gestion de Arbitros</td></tr>
<tr>
    <td><html:submit property="boton" value="Registrar Arbitro" /></td>
    <td><html:submit property="boton" value="Listar Arbitro" /></td>
</tr>
<tr align="center"><td colspan=2>Gestion de Partidos</td></tr>
<tr>
    <td><html:submit property="boton" value="Regsitrar Partido" /></td>
    <td><html:submit property="boton" value="Listar Partido" /></td>
</tr>
<tr align="center"><td colspan=2>Gestion de Torneos</td></tr>
<tr>
    <td><html:submit property="boton" value="Regsitrar Torneo" /></td>
    <td><html:submit property="boton" value="Listar Torneo" /></td>
</tr>
</table>
</html:form>
</body>
</html>
