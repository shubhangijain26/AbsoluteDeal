<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel=stylesheet type=text/css href="a.css">
<style>
td
{
background-color: white;
border-bottom: 2px solid #000020;
border-top: 2px solid #000020;
}

tab
{
margin:0;
padding:0 0 5px;
font-family:"Trebuchet MS";
font-size:17px;
color:#787878;
}
tab1{
margin-bottom:16px;
font-size:25px;
font-family:"Trebuchet MS";
}
tab2
{
margin:0;
padding:0 0 5px;
font-family:"Trebuchet MS";
font-size:17px;
color:black;

}

font{
text-align: center;
color:#000058;
font-family: "Comic Sans MS";
font-size:30px;
color:green;
}

.h{
height:350px;
width:350px;
vspace:0;


}

</style>

</head>
<body style="background-color:#339966;">
   
<table border="0"  cellpadding="40" cellspacing="110" align="center" width="80%" >

<tr>
<td>
<font><center>Congratulations</font><br><br>
<tab>Your Ad (Ad Id: 314578827) is now Posted and the changes will be visible shortly</center></tab>
</td>
</tr>

<tr> 
<td>
     
  
     <img class="h" src=<%= request.getSession().getAttribute("iname").toString() %> alt="notfound"> <br>
   
</td>
</tr>

<tr>

<td>
<tab1>Your Add Summary</tab1><br><br><br><hr>
<pre>
<tab1><%=request.getSession().getAttribute("category").toString()%></tab1><br>
<tab>Mobile No.:</tab><tab2><%=request.getSession().getAttribute("mobno").toString()%> </tab2> <br><br><hr>
<tab>Located In:</tab><tab2><%=request.getSession().getAttribute("city").toString()%></tab2>                              <tab>Year:</tab><tab2><%=request.getSession().getAttribute("year").toString()%></tab2>                              <tab>Color:</tab><tab2><%=request.getSession().getAttribute("color").toString()%></tab2>     <br><br>
<tab>Selling Price:</tab><tab2><tab2><%=request.getSession().getAttribute("price").toString()%></tab2></tab2>                           <tab>Name:</tab><tab2><tab2><%=request.getSession().getAttribute("name").toString()%></tab2></tab2>                              <tab>Email:</tab><tab2><%=request.getSession().getAttribute("email").toString()%></tab2>   <br><br>
<tab>Description:</tab><br>
<tab2><%=request.getSession().getAttribute("descrip").toString()%></tab2>

</pre>
</td>
</tr>

</table>

<a href="home.jsp"><input type="button" style=" margin:100px ;padding: 10px;border:none;outline:none;color:#fff;border-radius:20px;height:40px;background:#1a53ff;font-size:18px;" name="submit" value="Go To HOME Page">
<div class="footer" style="margin-bottom:0px">
<p>
<table cellspacing="20">
<tr>
<td>CONTACT </td> <td>CONNECT</td>  <td  rowspan="5">Mail Us:
Flipkart Internet Pvt Ltd Block B (Begonia),

Ground Floor, Embassy Tech Village,

Outer Ring Road, Devarabeesanahalli Village,

Varthur Hobli, Bengaluru East Taluk,

Bengaluru District,

Karnataka, India, 560103.</td>
</tr>

<tr>
<td>Info@quikr.com </td>  <td>Facebook</td>                           
</tr>

<tr>
<td>Helpline number:65892309</td> <td>Twitter</td>
</tr>

<tr>
<td>Sarojini,Delhi</td> <td>Instagram</td>
</tr>

<tr>
<td>Suite 701</td> <td>Linkedin</td>
</tr>
</table>
</p>
</div>
</body>
</html>