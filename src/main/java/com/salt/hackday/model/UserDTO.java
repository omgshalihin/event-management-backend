package com.salt.hackday.model;

public record UserDTO(
        String username,
        String email,
        String image,
        String city,
        String country
) {
}
