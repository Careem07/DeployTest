package gov.iti.jets.services.controllers;

import gov.iti.jets.services.atm.Atm;
import gov.iti.jets.services.atm.AtmService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class BalanceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AtmService atmService = new AtmService();
        Atm atm = atmService.getAtmPort();
        double balance = atm.viewBalance();
        req.setAttribute("balance" ,balance);
        req.getRequestDispatcher("balance.jsp").forward(req,resp);
    }
}
