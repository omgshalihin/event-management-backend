package com.salt.hackday.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Objects;

@Document("users")
public class User {

    @Id
    @MongoId(value = FieldType.OBJECT_ID)
    private String id;
    private String username;
    private String email;
    private String image;
    private String city;
    private String country;
    private boolean status;

    public User() {
    }

    public User(String id, String username, String email, String image, String city, String country, boolean status) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.image = image;
        this.city = city;
        this.country = country;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return status == user.status && id.equals(user.id) && username.equals(user.username) && email.equals(user.email) && image.equals(user.image) && city.equals(user.city) && country.equals(user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, image, city, country, status);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", status=" + status +
                '}';
    }
}
