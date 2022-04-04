package com.example.demo_web.controller.shoppingcart;

import com.example.demo_web.entity.ShoppingCart;
import com.example.demo_web.util.ShoppingCartFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowShoppingCartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShoppingCart shoppingCart = ShoppingCartFactory.getShoppingCartFromSession(req);
        req.setAttribute("shoppingCart", shoppingCart);
        req.getRequestDispatcher("/admin/carts/show.jsp").forward(req, resp);
    }
}
