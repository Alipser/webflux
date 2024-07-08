package com.roma.webflux_init.domain;


import com.roma.webflux_init.api.entity.Role;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RoleRepository extends ReactiveCrudRepository<Role, Integer> {
}