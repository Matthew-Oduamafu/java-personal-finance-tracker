package io.nerdbyteslns.personalfinancetracker.controllers;


import io.nerdbyteslns.personalfinancetracker.dtos.AppUserResponseDto;
import io.nerdbyteslns.personalfinancetracker.dtos.CreateAppUserDto;
import io.nerdbyteslns.personalfinancetracker.dtos.UpdateUserDetailsDto;
import io.nerdbyteslns.personalfinancetracker.helper.IApiResponse;
import io.nerdbyteslns.personalfinancetracker.services.AppUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping( path = "/by/{email}", produces = "application/json", headers = {"X-API-VERSION=1"})
    public IApiResponse<AppUserResponseDto> findByEmail(@PathVariable String email) {
        return appUserService.findByEmail(email);
    }

    @GetMapping( path = "/{id}", produces = "application/json", headers = {"X-API-VERSION=1"})
    public IApiResponse<AppUserResponseDto> findById(@PathVariable String id) {
        return appUserService.findById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json", headers = {"X-API-VERSION=1"})
    public IApiResponse<AppUserResponseDto> createAppUser(@Valid @RequestBody CreateAppUserDto request) {
        return appUserService.createAppUser(request);
    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json", headers = {"X-API-VERSION=1"})
    public IApiResponse<AppUserResponseDto> updateAppUser(@PathVariable String id, @Valid @RequestBody UpdateUserDetailsDto request) {
        return appUserService.updateAppUser(id, request);
    }
}

