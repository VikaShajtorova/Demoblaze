package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Contact {
    String name;
    String country;
    String city;
    String creditCard;
    String month;
    String year;
}
