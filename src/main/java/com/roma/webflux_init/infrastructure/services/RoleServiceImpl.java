package com.roma.webflux_init.infrastructure.services;


import com.roma.webflux_init.api.entity.Role;


import com.roma.webflux_init.domain.RoleRepository;
import com.roma.webflux_init.infrastructure.abstracts.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {


    private final RoleRepository roleRepository;

    @Override
    public Flux<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Mono<Role> getRoleById(Integer id) {
        return roleRepository.findById(id);
    }

}