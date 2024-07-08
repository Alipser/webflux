package com.roma.webflux_init.domain;


import com.roma.webflux_init.api.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
}