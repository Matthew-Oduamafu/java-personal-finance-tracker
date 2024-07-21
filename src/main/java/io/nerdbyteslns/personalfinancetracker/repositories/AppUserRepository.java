package io.nerdbyteslns.personalfinancetracker.repositories;

import io.nerdbyteslns.personalfinancetracker.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByEmail(String email);
}
