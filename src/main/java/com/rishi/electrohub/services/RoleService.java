package com.rishi.electrohub.services;

import com.rishi.electrohub.dtos.RoleDto;

public interface RoleService {

	RoleDto getNormalRole();
	RoleDto getAdminRole();
}
