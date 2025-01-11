package lk.ijse.customerjsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "CustomerDelete", value = "/customer-delete")
public class CustomerDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerDB", "root", "Ijse@123");
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customer where id=?");
            preparedStatement.setString(1, id);
            int i = preparedStatement.executeUpdate();
            connection.close();
            if (i > 0) {
                resp.sendRedirect("customer-delete.jsp?message=Customer Delete Successfully");
            }else {
                resp.sendRedirect("customer-delete.jsp?error=Customer Delete Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
