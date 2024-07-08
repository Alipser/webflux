package com.roma.webflux_init.infrastructure.abstracts;

import com.roma.webflux_init.api.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Flux<User> findAll();
    Mono<User> createUser(User user);
    Mono<User> updateUser(Integer id, User user);
    Mono<Void> deleteUser(Integer id);
    Mono<User> findUserById(Integer id);
}
