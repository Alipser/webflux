package com.roma.webflux_init.infrastructure.services;

import com.roma.webflux_init.api.entity.User;

import com.roma.webflux_init.domain.UserRepository;
import com.roma.webflux_init.infrastructure.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> findUserById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Mono<User> updateUser(Integer id, User user) {
        return userRepository.findById(id)
                .flatMap(existingUser -> {
                    existingUser.setFirstname(user.getFirstname());
                    existingUser.setLastname(user.getLastname());
                    existingUser.setPassword(user.getPassword());
                    existingUser.setPhone(user.getPhone());
                    existingUser.setEmail(user.getEmail());
                    existingUser.setRole(user.getRole());
                    return userRepository.save(existingUser);
                });
    }

    @Override
    public Mono<Void> deleteUser(Integer id) {
        return userRepository.deleteById(id);
    }
}