package vn.nhacvien.laptopshop.service;

import org.springframework.stereotype.Service;

import vn.nhacvien.laptopshop.domain.User;
import vn.nhacvien.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {
        User anhduy = this.userRepository.save(user);
        return anhduy;
    }
}
