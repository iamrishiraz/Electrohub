package com.rishi.electrohub.services;

import com.rishi.electrohub.dtos.AuthenticationRequestDto;
import com.rishi.electrohub.dtos.AuthenticationResponseDto;

public interface AuthenticationService {

	AuthenticationResponseDto authenticate(AuthenticationRequestDto authenticationRequestDto);
}
