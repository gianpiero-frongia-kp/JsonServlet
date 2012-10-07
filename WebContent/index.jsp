
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%
	String context = request.getContextPath();
	System.out.println("context->" + context);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.7.1.js"></script>

<title>JSON</title>
</head>
<body>


	
		<h2 class="">JSON</h2>
		<h3 class="">Esempio Servlet JSON toGet()</h3>
		<div id="tabs">
			<ul>
				
				<li>String to JSON: <a href="JavaStringToJson">http://localhost:8080/JsonServlet/JavaStringToJson</a></li>
				<li>JSON Object: <a href="JavaToJsonObj">http://localhost:8080/JsonServlet/JavaToJsonObj</a></li>
				<li>JSON Array: <a href="JavaToJsonArray">http://localhost:8080/JsonServlet/JavaToJsonArray</a></li>
			</ul>
			
		</div>


</body>


</html>