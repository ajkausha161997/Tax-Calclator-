<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">

<title>Insert title here</title>
<style type="text/css">
label {
	margin-right: 3px;
}
</style>
</head>
<body>
<div class="main-w3layouts wrapper">
		<h1>Tax Cacluator</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
			<label>Anula Income</label><%String s = request.getParameter("anualincome").toString(); 
			//request.getAttribute("age").toString();
out.println(s);
%><br>
<label>Rebate On New Slab :</label><%out.println(request.getAttribute("rebatenew")); %><br>
<label>Rebate On Existing Slab :</label><%out.println(request.getAttribute("rebate_ex")); %><br>
<label>Tax According TO Existing Slab :</label><%out.println(request.getAttribute("ex_slab")); %><br>
<label>Tax According TO New Slab:</label><%out.println(request.getAttribute("new_slab")); %>
	</div>
	</div>
	</div>
	

</body>
</html>