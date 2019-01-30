<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<%
    
    if(session.getAttribute("nm")== null)
    {
        RequestDispatcher rd = request.getRequestDispatcher("login.html");
        rd.forward(request, response);
    }
    HttpSession nsession = request.getSession(false);
    if(nsession !=null){
    %>
<html>  
<head>
    <title>Online Buying And Selling Site | abc.com</title>
    <link rel=stylesheet type=text/css href="a.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel=stylesheet type=text/css href="slideshow.css">
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.5.0/css/all.css' integrity='sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU' crossorigin='anonymous'>
<style>
    .log{
        margin-left: 1200px;
        margin-top:-35px;
     }
      
     font{
        
        margin-top:-50px;
        color:#f2f2f2;
        font-size: 20px;
        font-weight: bold;
     }
     
     .btn
      {
        background-color:#999999;
        margin-top: 80px;
        margin-bottom: 50px;
        margin-left: 350px;
        color:white;
        height:50px;
        width:50%;
        border:none;
        padding:10px;
        
      }
</style>
</head>
<body>
       
    

<div class="navbar" style="height:80px;">

  <a href="home.jsp" style="margin-left:40px;font-family: Comic Sans MS;font-size:30px">AbsoluteDeal</a>
  <%
      String url = "jdbc:mysql://localhost:3306/website?user=root&password=arun4&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
      
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
            
             
            Connection con = null;
       }
        catch(Exception b)
        {
            System.out.println(b);
        }
  
       Statement statement = null;
       ResultSet rs = null;
  %>
 
<select style="width:35%;padding:10px">
<option> All Categories</option>
<option> Cars</option>
<option> Furniture</option>
<option> Furniture</option>
<option> Furniture</option>
<option> Furniture</option>
<option> CONSULTANT</option>
<option> SECRETARY</option>
</select>

  <font  style="margin-left:72px;">Welcome <%=   
        request.getSession().getAttribute("nm").toString()
    %></font>
    
    <a href="PostAdd.html" style="margin-left:35px;">Post Add</a>
 
    
    
 <form class="log" action = "LogoutServer" method  = "post"> 
  <input type = "submit" value = "Logout" id = "form">
 </form>
</div>

    
    <div style="clear:both;"></div>
    <br>
    
 

<div class="slideshow-container" style="margin-top:100px;" >

  
  <div class="mySlides fade">
    <img src="s1.jpg" style="width:100%">
   
  </div>

  <div class="mySlides fade">
    <img src="s2.jpg" style="width:100%">
  </div>

<div class="mySlides fade">
    <img src="s3.png" style="width:100%">
    
  </div>

<div class="mySlides fade">
    <img src="s4.jpg" style="width:100%">
    
  </div>

<div class="mySlides fade">
    <img src="s5.jpg" style="width:100%">
    
  </div>

</div>
<br>



<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>  
 
var request=new XMLHttpRequest(); 
function sendInfo()  
{  
    
var v=document.vinform.t1.value;  
var url="index.jsp?x="+v;  
  

  
try  
{  
request.onreadystatechange=getInfo;  
request.open("GET",url,true);  
request.send();  
}  
catch(e)  
{  
alert("Unable to connect to server");  
}  
}  

 
function getInfo(){ 
    
if(request.readyState==4){    
document.getElementById('amit').innerHTML=request.responseText;  
}  
}  
  
</script> 


<div class="btn">
<form name="vinform">
    <input style="background-color:white;color:#585858;padding:5px;margin-left: 120px;" type="text" name="t1" onkeyup="sendInfo()" placeholder="search for products"  >
 </form> 

    </div>
 

  

 

 <span id="amit"></span>
 
 <br>
 <table border="0" cellspacing="40" align="center" width="70%" >
<tr>


<%
    try
    {
        Connection con =DriverManager.getConnection(url);
        statement=con.createStatement();
        String query="select * from advertisement";
         rs=statement.executeQuery(query);
         while(rs.next()){
    
    %>
    
<script>
    function dis()
    {
        <input type="button" value="view">
    }
    </script>
<td>
<a href=" mobile.html">
    <img class="h" onmouseover="dis()" src=<%=rs.getString("img") %>> <br>
<h3>Name: <%=rs.getString("name") %></h3>  
<p>Category: <%=rs.getString("category") %></p>
<p>Year of Purchase: <%=rs.getString("year") %></p>
<p>Description of Product: <%=rs.getString("description") %></p>
<p>Color: <%=rs.getString("color") %></p>
<p>City: <%=rs.getString("city") %></p>
<p>Expected Selling Price:<%=rs.getString("SellingPrice") %></p>
<p>Contact Number: <%=rs.getString("mobileNo") %></p>
<p>Email Address: <%=rs.getString("email") %></p>


</a>
</td>
</tr>


<%
    }
con.close();
} catch (Exception e) {
e.printStackTrace();
}

    %>

    

</table>
    
    
 
    
    
    
  
<script>
var slideIndex = 0;
showSlides();


function showSlides() {
 var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 4000); 
}

function cart() {
    var item;
    item++;
}


</script>
<div class="footer" style="margin-bottom:0px">
<p>
<table cellspacing="20">
<tr>
<td>CONTACT </td> <td>CONNECT</td>  <td rowspan="5">Mail Us:
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

<% }
%>