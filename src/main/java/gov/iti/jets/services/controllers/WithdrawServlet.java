package gov.iti.jets.services.controllers;

import gov.iti.jets.services.atm.Atm;
import gov.iti.jets.services.atm.AtmService;
import gov.iti.jets.services.atm.Withdraw;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class WithdrawServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AtmService atmService = new AtmService();
        Atm atm = atmService.getAtmPort();
        String amount = req.getParameter("amount");
        Double am = Double.valueOf(amount);
        double with = atm.withdraw(am);
        req.setAttribute("user" ,( "Your Balance is "+ with));
        req.getRequestDispatcher("atm.jsp").forward(req,resp);
    }
}
