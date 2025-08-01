package dev.andersonGilvan.apiCadastro.Domain.Food.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateFoodDTO(

        @NotBlank(message = "Required field")
        String name,
        @NotBlank(message = "Required field")
        String imgUrl,
        @NotBlank(message = "Required field")
        String description,
        @NotNull(message = "Required field")
        double price) {
}
