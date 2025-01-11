
# Customer-JSP  

This repository demonstrates a simple **CRUD (Create, Read, Update, Delete)** application using **JavaServer Pages (JSP)**. It is a basic project designed to understand how JSP works with CRUD operations to manage customer data.

---

## 🚀 Features  

- **CRUD Functionality:**  
  - Create new customers.  
  - View customer details.  
  - Update existing customer records.  
  - Delete customer records.  
- **Dynamic JSP Integration:** Learn how to perform database operations using JSP.  

---

## 🛠️ Technologies  

- **JavaServer Pages (JSP)**  
- **HTML**  
- **JDBC (Java Database Connectivity)**  
- **MySQL**  

---

## 📂 Folder Structure  

```plaintext
Customer-JSP/
│
├── customer-save.jsp         # Page to create new customer records  
├── all-customer.jsp          # Page to display customer records  
├── update-customer.jsp       # Page to update customer details  
├── delete-customer.jsp       # Page to delete a customer   
├── index.jsp                 # Entry point  
└── README.md                 # Project documentation  
```

---

## 🔧 Prerequisites  

To run this project, you need:  

- **Java Development Kit (JDK)** installed (preferably JDK 8 or later).  
- **Apache Tomcat** or another servlet container.  
- **MySQL Database** to store customer data.  

---

## ⚙️ How to Set Up  

1. **Clone the Repository:**  
   ```bash
   git clone https://github.com/Charithharsha08/Customer-JSP.git
   cd Customer-JSP
   ```

2. **Set Up the Database:**  
   - Create a MySQL database (e.g., `customer_db`).  
   - Use the following query to create a `customers` table:  
     ```sql
     CREATE TABLE customers (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       address VARCHAR(255) NOT NULL,
       email VARCHAR(100) NOT NULL
     );
     ```
   - Update the `dbconnection.jsp` file with your MySQL credentials.  

3. **Deploy the Project:**  
   - Place the project folder in the `webapps` directory of your server.  
   - Start the server.  

4. **Access the Application:**  
   ```
   http://localhost:8080/Customer-JSP/index.jsp
   ```

---

## 📖 Features in Detail  

- **Create:** Add new customer data through a user-friendly form.  
- **Read:** Display all customer records dynamically using JSP.  
- **Update:** Modify existing customer details.  
- **Delete:** Remove customer records from the database.  

---

## 🤝 Contribution  

Contributions, issues, and feature requests are welcome! Check the [issues page](https://github.com/Charithharsha08/Customer-JSP/issues) for more details.

---


## 🙌 Acknowledgments  

This project was created as part of learning **JSP CRUD operations** with database integration.  

--- 

Feel free to adjust the content as necessary to suit your project!
