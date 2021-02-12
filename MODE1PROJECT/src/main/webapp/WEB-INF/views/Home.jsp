
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> HOME PAGE</title>
</head>
<body>
<h4 align="right"><a href="<%=request.getContextPath()+"/mvc/logout"%>"><span style="color:blue"><b>Logout</b></span></a></h4><pre></pre>
<center>
<h2><font color="orange"> HOME PAGE</font></h2>

<h4><a href="<%=request.getContextPath()+"/mvc/showRegister"%>"><span style="color:blue"><b>CREATE NEW ACCOUNT</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/getAllAccDetails"%>"><span style="color:blue"><b>ACC INFO</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/getAllTxnDetails"%>"><span style="color:blue"><b>TRANSACTION</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/amtWithDraw"%>"><span style="color:blue"><b> WITHDRAWL</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/amtDeposit"%>"><span style="color:blue"><b> DEPOSIT</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/fundTrans"%>"><span style="color:blue"><b>FUND TRANSFER</b></span></a></h4><pre></pre>
</center>
</body>
</html>