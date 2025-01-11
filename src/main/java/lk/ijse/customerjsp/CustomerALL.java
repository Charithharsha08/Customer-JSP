package lk.ijse.customerjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerALL", value = "/customer-all")
public class CustomerALL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerDB", "root", "Ijse@123");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customer");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<CustomerDTO> customerDTOList = new ArrayList<>(); // <CustomerDTO>
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);
                String email = resultSet.getString(4);
                CustomerDTO customerDTO = new CustomerDTO(id, name, address, email);
                customerDTOList.add(customerDTO);
            }
            connection.close();
            req.setAttribute("customerList", customerDTOList);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("customer-list.jsp");
            requestDispatcher.forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
