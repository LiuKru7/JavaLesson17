package example_1.boilerplatecode;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Car {
    private String brand;
    private String country;
    private int price;
    private boolean isDamaged;
    private String firstOwner;
    private String[] additionalParts;
    private int vinCode;
}

