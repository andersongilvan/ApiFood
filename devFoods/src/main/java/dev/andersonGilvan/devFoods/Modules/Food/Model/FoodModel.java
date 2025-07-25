package dev.andersonGilvan.devFoods.Modules.Food.Model;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.CreateFoodDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_foods")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class FoodModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;


    public FoodModel(CreateFoodDTO createFoodDTO) {
        this.name = createFoodDTO.name();
        this.description = createFoodDTO.description();
        this.imgUrl = createFoodDTO.imgUrl();
        this.price = createFoodDTO.price();
    }

}
