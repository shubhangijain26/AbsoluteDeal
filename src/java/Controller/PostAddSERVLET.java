
package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class PostAddSERVLET extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       response.setContentType("text/html");
        
       
        PrintWriter out = response.getWriter();
        
         String url = "jdbc:mysql://localhost:3306/website?user=root&password=arun4&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
         
         String m = request.getParameter("category");
        String n = request.getParameter("year");
        String o = request.getParameter("descrip");
        String p = request.getParameter("color");
        String q = request.getParameter("city");
        String r = request.getParameter("price");
        String s = request.getParameter("name");
        String t = request.getParameter("mobno");
        String u = request.getParameter("email");
        

        
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
            
             
            Connection con = DriverManager.getConnection(url);
            
            String query = "insert into advertisement(category,year,description,color,city,SellingPrice,name,mobileNo,email) values(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1,m);
            
            pstmt.setString(2,n);
            
            pstmt.setString(3,o);
            
             pstmt.setString(4,p);
            
            pstmt.setString(5,q);
            
            pstmt.setString(6,r);
            
             pstmt.setString(7,s);
            
            pstmt.setString(8,t);
            
            pstmt.setString(9,u);
            
            
                    
            int i = pstmt.executeUpdate();
            
            if(i>0)  
            out.print("Your advertisement is posted..."); 
            
           // request.setAttribute("name",s);
            
             HttpSession session = request.getSession(); 
             session.setAttribute("category",m);
             
             session.setAttribute("year", n);
             
             
             session.setAttribute("descrip", o);
             
             session.setAttribute("color", p);
             
             session.setAttribute("city", q);
             
             session.setAttribute("price", r);
             
             session.setAttribute("name", s);
             
             session.setAttribute("mobno", t);
             
             session.setAttribute("email", u);
             
             RequestDispatcher rd=request.getRequestDispatcher("postImg.html");  
        
             rd.forward(request,response);  
            
        }
        catch(Exception b)
        {
            System.out.println(b);
        }
        
        
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
