package io.nerdbyteslns.personalfinancetracker.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AppUserResponseDto(String id, String email, String firstName, String lastName, LocalDate dateOfBirth, boolean isActive,
                                 LocalDateTime createdAt) {
}
