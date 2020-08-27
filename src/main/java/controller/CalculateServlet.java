package controller;

import model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int firstNumb = Integer.parseInt(request.getParameter("firstNumb"));
        int secondNumb = Integer.parseInt(request.getParameter("secondNumb"));
        String operand = request.getParameter("operand");
        double result = Calculator.calculate(operand,firstNumb,secondNumb);
        request.setAttribute("result", result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/calculate.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}