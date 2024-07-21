package io.nerdbyteslns.personalfinancetracker.services;

import io.nerdbyteslns.personalfinancetracker.dtos.AppUserResponseDto;
import io.nerdbyteslns.personalfinancetracker.dtos.CreateAppUserDto;
import io.nerdbyteslns.personalfinancetracker.dtos.UpdateUserDetailsDto;
import io.nerdbyteslns.personalfinancetracker.utils.ApiResponseUtil;
import io.nerdbyteslns.personalfinancetracker.utils.DtosUtils;
import io.nerdbyteslns.personalfinancetracker.helper.IApiResponse;
import io.nerdbyteslns.personalfinancetracker.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public IApiResponse<AppUserResponseDto> findByEmail(String email) {
        var user = appUserRepository.findByEmail(email);
        if (user == null) {
            return ApiResponseUtil.toNotFoundApiResponse();
        }

        return ApiResponseUtil.toOkApiResponse(DtosUtils.createAppUserResponseDtoFromAppUser(user));
    }

    public IApiResponse<AppUserResponseDto> findById(String id) {
        var user = appUserRepository.findById(id);
        return user.map(
                appUser -> ApiResponseUtil.toOkApiResponse(DtosUtils.createAppUserResponseDtoFromAppUser(appUser)))
                .orElseGet(ApiResponseUtil::toNotFoundApiResponse);

    }

    public IApiResponse<AppUserResponseDto> createAppUser(CreateAppUserDto request) {
        var user = DtosUtils.createUserFromDto(request);
        var savedUser = appUserRepository.save(user);
        return ApiResponseUtil.toCreatedApiResponse(DtosUtils.createAppUserResponseDtoFromAppUser(savedUser));
    }

    public IApiResponse<AppUserResponseDto> updateAppUser(String id, UpdateUserDetailsDto request) {
        var result = appUserRepository.findById(id);
        if (result.isEmpty()) {
            return ApiResponseUtil.toNotFoundApiResponse();
        }

        var user = result.get();

        user.setFirstName(request.firstName());
        user.setFirstName(request.lastName());
        user.setFirstName(request.email());

        var savedUser = appUserRepository.save(user);
        return ApiResponseUtil.toOkApiResponse(DtosUtils.createAppUserResponseDtoFromAppUser(savedUser));
    }
}
