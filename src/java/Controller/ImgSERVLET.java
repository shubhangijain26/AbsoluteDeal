
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;  
import java.util.Enumeration;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

public class ImgSERVLET extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
         String url = "jdbc:mysql://localhost:3306/website?user=root&password=arun4&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";

         MultipartRequest a = new MultipartRequest(request,"C:/Users/Shubhangi Jain/Documents/NetBeansProjects/Quikr clone/web");
         Enumeration e =a.getFileNames();
        String imgname=new String();
        String n=new String();
        while(e.hasMoreElements())
        {
            
            String param = (String) e.nextElement();
            
             imgname = a.getFilesystemName(param);
            
            out.print(imgname);
        }
        
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
            
             
            Connection con = DriverManager.getConnection(url);
            
             n=request.getSession().getAttribute("name").toString();
            
            
            
            String query = "update advertisement set img=? where name=?" ;
            
            
            out.print(n);
            
         PreparedStatement pstmt = con.prepareStatement(query);

         pstmt.setString(1, imgname);
         
         pstmt.setString(2, n);
         
          pstmt.executeUpdate();
          con.close();
        }
       catch(Exception b)
        {
            System.out.println(b);
        }
         HttpSession session = request.getSession(); 
         
         session.setAttribute("iname", imgname);
         RequestDispatcher rd=request.getRequestDispatcher("/add.jsp");  
        
             rd.forward(request,response);  
            
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
