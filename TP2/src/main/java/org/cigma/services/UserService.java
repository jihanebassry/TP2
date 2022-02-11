package org.cigma.services;

import org.cigma.dtos.User;
import org.cigma.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public List<User> all(){
        return userRepository.findAll();
    }

    public Page<User> pageable(int size, int page) {
        return userRepository.allUsers(PageRequest.of(page, size));
    }
}
