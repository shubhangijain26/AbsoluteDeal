<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%  
    String url = "jdbc:mysql://localhost:3306/website?user=root&password=arun4&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
   
    String id=request.getParameter("x");  
if(id==null || id.trim().equals("")){  
  
}else{  
// int id=Integer.parseInt(request.getParameter("val"));
  
  
try{  
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    
    Connection con = DriverManager.getConnection(url);
PreparedStatement ps=con.prepareStatement("select * from advertisement where year like '%"+id+"%' OR name like '%"+id+"%'  OR category like '%"+id+"%'  OR description like '%"+id+"%'  OR color like '%"+id+"%' OR city like '%"+id+"%'        ");  
//ps.setString(1,id); 
ResultSet rs=ps.executeQuery();  

if(!rs.isBeforeFirst()) {      
 out.println("<p>No Record Found!</p>");
}else{ 
out.print("<table border='1' cellpadding='2' width='100%'>");  
out.print("<tr><th>Category</th><th>Year</th><th>Desc</th>  <th>Color</th><th>City</th><th>SP</th><th>Name</th></tr>");  
while(rs.next()){  
out.print("<tr><td>"+rs.getString("category")+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td>  <td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td>  <td>"+rs.getString(7)+"</td></tr>");  
}  
out.print("</table>");  
}
con.close();  
}catch(Exception e){e.printStackTrace();}  
}


  
%>  
<br>