<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/Maps.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function noBack()
{
	window.history.forward();
}
	setTimeout("noBack()", 0);
	window.onunload=function(){null;};

</script>
</head>
<body onload="if(event.persisted) noBack();" bgcolor="White">
<%session.invalidate();

%>
<div style="float: right;">
  <a href="${pageContext.request.contextPath}/Logout">LOGOUT</a>
</div>

<div align="center"> 

<!-- <br><br><br>Place Name:</td><td> <td><input type="text" name="placename" id="placename"><div id="error1" class="Err">  </div>
 <input type="submit" value="Submit" onclick="showMap()"> -->
 <a href="${pageContext.request.contextPath}/maps">Click to find a place and get recommendation</a>
 
 </td>
 </div>

</body>
</html>