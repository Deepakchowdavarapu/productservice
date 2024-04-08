package deepak.dev.fakestoreapi.controllers;


import deepak.dev.fakestoreapi.models.Product;
import deepak.dev.fakestoreapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/sayhello")
    public String sayHello(){
        return  "Hello Wolrd";
    }

    // this {ID}is PathURL
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        System.out.println(id);
        return productService.getSingleProduct(id);
//        return new Product();
    }


    @PostMapping("products")
    public Product CreateProduct(@RequestBody Product product){
        System.out.println("heoo");
        return null;
    }


}
