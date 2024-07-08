package com.roma.webflux_init.api.controller;

import com.roma.webflux_init.api.entity.User;
import com.roma.webflux_init.infrastructure.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public Flux<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<User> findUserById(@PathVariable Integer id) {
        return userService.findUserById(id);
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public Mono<User> updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}