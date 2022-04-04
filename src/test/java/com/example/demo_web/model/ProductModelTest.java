package com.example.demo_web.model;

import com.example.demo_web.entity.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductModelTest {

    @Test
    void findById() {
        ProductModel obj = new ProductModel();
        Product product = obj.findById(1);
        System.out.println(product.toString());
    }

    @Test
    void save() {
        ProductModel productModel = new ProductModel();
        productModel.save(new Product("Meo Meo", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fbaoquocte.vn%2Fnhung-buc-anh-dep-tuyet-voi-ve-tinh-ban-108518.html&psig=AOvVaw18ZTAdbfg_WbTiUeQd8scj&ust=1648438080183000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMDDrMSs5fYCFQAAAAAdAAAAABAJ", 200.0));
    }

    @Test
    void findAll() {
        ProductModel productModel = new ProductModel();
        List<Product> product = productModel.findAll();
        System.out.println(product.toString());
    }

    @Test
    void update() {
        ProductModel obj = new ProductModel();
        Product product = obj.findById(1);
        System.out.println(product.toString());
        product.setThumbnail("https://kenh14cdn.com/thumb_w/660/2020/7/17/brvn-15950048783381206275371.jpg");
        obj.update(1,product);
    }

    @Test
    void delete() {
        ProductModel obj = new ProductModel();
        obj.delete(4);
    }
}