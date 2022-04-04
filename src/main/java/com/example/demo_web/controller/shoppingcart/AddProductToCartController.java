package com.example.demo_web.controller.shoppingcart;

import com.example.demo_web.entity.Product;
import com.example.demo_web.entity.ShoppingCart;
import com.example.demo_web.model.ProductModel;
import com.example.demo_web.util.ShoppingCartFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddProductToCartController extends HttpServlet {
    private ProductModel productModel;

    public AddProductToCartController(){
        productModel = new ProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int productId = 0;
        int quantity = 0;
        try {
            productId = Integer.parseInt(req.getParameter("productId"));
            quantity = Integer.parseInt(req.getParameter("quantity"));
        }catch (Exception e){

        }

        if (productId <= 0 || quantity <= 0){
            resp.getWriter().println("Invalid Product id or quantity.");
            return;
        }
        Product product = productModel.findById(productId);
        if (product == null){
            resp.getWriter().write("Product not found.");
        }

        ShoppingCart shoppingCart = ShoppingCartFactory.getShoppingCartFromSession(req);
        shoppingCart.addItemToCart(product, quantity);
        ShoppingCartFactory.setShoppingCartToSession(req, shoppingCart);
        resp.sendRedirect("/shopping-cart/show");
    }
}
