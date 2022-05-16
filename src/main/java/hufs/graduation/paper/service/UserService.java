package hufs.graduation.paper.service;

import hufs.graduation.paper.dto.UserDTO;
import hufs.graduation.paper.entity.User;
import hufs.graduation.paper.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDTO getUserDetail(int userId) {
        User user = userRepository.getById(userId);

        return new UserDTO(user.getId(), user.getName(), user.getPassword(), user.getTel());
    }

    public List<UserDTO> getUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(u -> new UserDTO(u.getId(), u.getName(), u.getPassword(), u.getTel()))
                .collect(Collectors.toList());
    }
}
