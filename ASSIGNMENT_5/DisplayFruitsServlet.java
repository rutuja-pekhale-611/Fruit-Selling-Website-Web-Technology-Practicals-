import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/displayFruits")
public class DisplayFruitsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Fruit List</title></head><body>");
        out.println("<h2>Fruit List</h2>");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/fruitshop", "username", "password");

            // Execute SQL query
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM fruits");

            // Display the result set
            out.println("<table border='1'>");
            out.println("<tr><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th></tr>");
            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("fruit_id") + "</td><td>" + rs.getString("fruit_name") + "</td><td>" +
                        rs.getDouble("fruit_price") + "</td><td>" + rs.getInt("quantity") + "</td></tr>");
            }
            out.println("</table>");

        } catch (Exception e) {
            out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the resources
            try { if (rs != null) rs.close(); } catch (SQLException e) { /* ignored */ }
            try { if (stmt != null) stmt.close(); } catch (SQLException e) { /* ignored */ }
            try { if (conn != null) conn.close(); } catch (SQLException e) { /* ignored */ }
        }

        out.println("</body></html>");
    }
}
