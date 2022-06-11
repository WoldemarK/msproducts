package com.example.msproducts.dto;

import com.example.msproducts.validation.NamePrefix;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ProductDTO {

    @NamePrefix(message = "Name must start with PRD")
    @NotBlank(message = "Name is required!")
    private String name;

    @NotNull
    @Min(value = 20)
    @Positive(message = "Price cannot be Zero or negative")
    private int price;
}
