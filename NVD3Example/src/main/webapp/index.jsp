<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script   src="https://code.jquery.com/jquery-3.2.1.min.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
$(document).ready(function(){
	
	$("#butt1").click(function(){
		
		$.ajax({
			url:"D3servlet",
		    success:function(result){
		    console.log(result);	
		    }});
	});
	
});
</script>
</head>
<body>
<button id="butt1">click</button>
</body>
</html>