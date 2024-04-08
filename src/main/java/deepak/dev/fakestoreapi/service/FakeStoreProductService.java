package deepak.dev.fakestoreapi.service;

import deepak.dev.fakestoreapi.dtos.FakeStoreDto;
import deepak.dev.fakestoreapi.models.Category;
import deepak.dev.fakestoreapi.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Product getSingleProduct(Long id){
        FakeStoreDto fakeStoreDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+id,
                FakeStoreDto.class
        );
//        System.out.println("runnig");
        Product product = new Product();
        product.setId(fakeStoreDto.getId());
        product.setTitle(fakeStoreDto.getTitle());
        product.setPrice(fakeStoreDto.getPrice());
        product.setImageURL(fakeStoreDto.getImage());
        product.setDescription(fakeStoreDto.getDescription());
        product.setCategory(new Category());
        product.getCategory().setName(fakeStoreDto.getCategory());
        System.out.println("running");
        return product;
    };

    @Override
    public Product getAllProducts(){
        return null;
    };


}
