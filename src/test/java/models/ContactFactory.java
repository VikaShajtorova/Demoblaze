package models;

import com.github.javafaker.Faker;

public class ContactFactory {
    static Faker faker = new Faker();

    public static Contact get() {
        return Contact.builder()
                .name(faker.name().firstName())
                .country(faker.country().name())
                .city(faker.address().city())
                .creditCard(faker.finance().creditCard())
                .month(faker.date().toString())
                .year(faker.date().toString())
                .build();
    }
}
