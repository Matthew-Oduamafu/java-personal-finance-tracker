package io.nerdbyteslns.personalfinancetracker.helper;

import io.nerdbyteslns.personalfinancetracker.dtos.AppUserResponseDto;
import io.nerdbyteslns.personalfinancetracker.dtos.CreateAppUserDto;
import io.nerdbyteslns.personalfinancetracker.models.AppUser;

import java.util.UUID;

public class DtosUtils {

//    public static boolean isEmailValid(String email) {
//        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
//    }
//
//    public static boolean isPasswordValid(String password) {
//        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
//    }
//
//    public static boolean isNameValid(String name) {
//        return name.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
//    }
//
//    public static boolean isDateValid(String date) {
//        return date.matches("^\\d{4}-\\d{2}-\\d{2}$");
//    }

    public static AppUser createUserFromDto(CreateAppUserDto createAppUserDto) {
        return new AppUser(
                UUID.randomUUID().toString(),
                createAppUserDto.getPassword(),
                createAppUserDto.getEmail(),
                createAppUserDto.getFirstName(),
                createAppUserDto.getLastName(),
                createAppUserDto.getDateOfBirth()
        );
    }

    public static AppUserResponseDto createAppUserResponseDtoFromAppUser(AppUser appUser) {
        return new AppUserResponseDto(
                appUser.getId(),
                appUser.getEmail(),
                appUser.getFirstName(),
                appUser.getLastName(),
                appUser.getDateOfBirth(),
                appUser.isActive(),
                appUser.getCreatedAt()
        );
    }
}
