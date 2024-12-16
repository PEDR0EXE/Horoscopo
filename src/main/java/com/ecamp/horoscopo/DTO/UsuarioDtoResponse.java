package com.ecamp.horoscopo.DTO;

public class UsuarioDtoReponsibe {
    private String username;
    private String email;
    private String animal;

    // Constructores

    public UsuarioDtoReponsibe() {
    }

    public UsuarioDtoReponsibe(String username, String email, String animal) {
        this.username = username;
        this.email = email;
        this.animal = animal;
    }
    // Getter & Setter

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

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    // toString

    @Override
    public String toString() {
        return "UsuarioResponseDTO{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", animal=" + animal +
                '}';
    }
}
