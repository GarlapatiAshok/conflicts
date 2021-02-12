
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> WITHDRAWL</title>



</head>
<body style="color:green">
<h4><a href="<%=request.getContextPath()+"/mvc/home"%>"><span style="color:blue"><b> HOME</b></span></a></h4><pre></pre>
<center>
<h2><font color="orange"> WITHDRAWL</font></h2>
</center>
<div id="mainDiv">
<form action="amtWthdrawlValidate" method="post">
<fieldset style="padding-left: 180px;width:  500px;">
		<pre></pre>
		
   <label class="mandatory">*</label><label><b>Acc Num:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="accnum" id="accnum" required></input><pre></pre>	
   
    <label class="mandatory">*</label><label><b>Amount:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="amtWithdrawl" id="amtWithdrawl" required></input><pre></pre>	
   
		      <div style="padding-left: 188px;">
              <input type="submit"  value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
              <input type="reset" value="clear">
              </div>
      
      
</fieldset>
</form>

</div>
<span style="color:blue">${message}</span>
<pre></pre>

</body>
</html>