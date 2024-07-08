package com.roma.webflux_init.api.controller;


import com.roma.webflux_init.api.entity.Role;
import com.roma.webflux_init.infrastructure.abstracts.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping
    public Flux<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public Mono<Role> getRoleById(@PathVariable Integer id) {
        return roleService.getRoleById(id);
    }
}