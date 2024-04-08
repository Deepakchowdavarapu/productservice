package deepak.dev.fakestoreapi.service;

import deepak.dev.fakestoreapi.models.Product;

public interface ProductService {

    public Product getSingleProduct(Long id);

    public Product getAllProducts();

}
