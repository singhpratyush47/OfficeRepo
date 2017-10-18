<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script   src="https://code.jquery.com/jquery-3.2.1.min.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://d3js.org/d3.v3.min.js"></script>
<script>
$(document).ready(function(){
	
	$("#butt1").click(function(){
		
		$.ajax({
			url:"D3servlet",
		    success:function(result){
		    d3.json("D3servlet",function(data){
		    	console.log(data);
		    	
		    	var canvas=d3.
									    	select("body")
									    	.append("svg")
									    	.attr("width",700)
									    	.attr("height",700)
									    	
				    	canvas.
								    	selectAll("rect").
								    	data(data).enter().
								    	append("rect").
								    	attr("width",function(d){return d.age*10;})
								    	.attr("height",50).attr("y",function(d,i){return i*60;})
								    	.attr("fill","blue");
		    	canvas
								    	.selectAll("text")
								    	.data(data)
								    	.enter()
								    	.append("text").attr("fill","white")
								    	.attr("y",function(d,i){return i*60+25;})
								    	.text(function(d){return d.name;})
								    });
		    }});
	});
	
});
</script>
</head>
<body>
<button id="butt1">click</button>
</body>
</html>