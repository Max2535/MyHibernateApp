package com.example.web;


import com.example.dao.UserDAO;
import com.example.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private UserDAO userDao = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("users", userDao.getAllUsers());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setEmail(request.getParameter("email"));

        userDao.saveUser(user);
        response.sendRedirect("user");
    }
}

