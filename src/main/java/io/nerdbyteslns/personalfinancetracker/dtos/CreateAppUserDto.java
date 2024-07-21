package io.nerdbyteslns.personalfinancetracker.dtos;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class CreateAppUserDto {

    @Size(min = 8, message = "Password should have at least 8 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Password should have at least one digit, one lowercase letter, one uppercase letter, one special character and no whitespace")
    private String password;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "Invalid email address")
    private String email;

    @Size(min = 2, message = "First name should have at least 2 characters")
    private String firstName;

    @Size(min = 2, message = "Last name should have at least 2 characters")
    private String lastName;

    @Past(message = "Date of birth can't be in the future")
    private LocalDate dateOfBirth;

    public CreateAppUserDto() {
    }

    public CreateAppUserDto(String password, String email, String firstName, String lastName, LocalDate dateOfBirth) {
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
