package com.pm.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {

    @NotBlank
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank
    private String address;

    @NotBlank
    private String dateOfBirth;

    @NotNull
    private String registeredDate;

    public @NotBlank @Size(max = 100, message = "Name cannot exceed 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank @Size(max = 100, message = "Name cannot exceed 100 characters") String name) {
        this.name = name;
    }

    public @NotBlank @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotBlank String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank String address) {
        this.address = address;
    }

    public @NotBlank String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @NotNull String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(@NotNull String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
