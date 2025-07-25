package dev.andersonGilvan.devFoods.Modules.Food.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CreateFoodDTO(
        @NotBlank(message = "This field is mandatory")
        String name,
        @NotBlank(message = "This field is mandatory")
        String imgUrl,
        @NotBlank(message = "This field is mandatory")
        String description,

        @Positive(message = "This field is mandatory")
        double price) {
}
