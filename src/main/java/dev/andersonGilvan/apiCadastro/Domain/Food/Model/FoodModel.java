package dev.andersonGilvan.apiCadastro.Domain.Food.Model;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.CreateFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.UpdateFoodDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Table(name = "tb_foods")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FoodModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;


    public FoodModel(CreateFoodDTO dto) {
        this.name = dto.name();
        this.imgUrl = dto.imgUrl();
        this.description = dto.description();
        this.price = dto.price();
    }

    public void UpdateFood(UpdateFoodDto dto) {
        this.name = dto.name();
        this.imgUrl = dto.imgUrl();
        this.description = dto.description();
        this.price = dto.price();
    }

}
