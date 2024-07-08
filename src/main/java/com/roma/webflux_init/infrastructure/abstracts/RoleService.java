package com.roma.webflux_init.infrastructure.abstracts;

import com.roma.webflux_init.api.entity.Role;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RoleService {
    Flux<Role> getAllRoles();
    Mono<Role> getRoleById(Integer id);
}