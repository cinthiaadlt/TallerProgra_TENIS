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
Los jugadores registrados se muestran a continuacion
</h2>
<%= session.getAttribute("ini.usu")%>
</body>
</html>
