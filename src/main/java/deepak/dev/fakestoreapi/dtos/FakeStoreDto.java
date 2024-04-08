package deepak.dev.fakestoreapi.dtos;

import deepak.dev.fakestoreapi.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private Long id;
    private String title;
    private double price;

    private String category;
    private String description;
    private String image;
}
