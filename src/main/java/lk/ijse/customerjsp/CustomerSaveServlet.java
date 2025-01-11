package lk.ijse.customerjsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "CustomerSaveServlet", value = "/customer-save")
public class CustomerSaveServlet extends HelloServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String email = req.getParameter("email");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerDB", "root", "Ijse@123");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into customer(name,address,email) values (?,?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, address);
                preparedStatement.setString(3, email);

                int i = preparedStatement.executeUpdate();
                connection.close();
                if (i > 0) {
                    resp.sendRedirect("customer-save.jsp?message=Customer Save Successfully");
                }else {
                   resp.sendRedirect("customer-save.jsp?error=Customer Save Failed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
