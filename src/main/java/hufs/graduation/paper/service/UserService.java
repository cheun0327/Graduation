package hufs.graduation.paper.service;

import hufs.graduation.paper.dto.OrderDTO;
import hufs.graduation.paper.dto.OrderProductDTO;
import hufs.graduation.paper.dto.UserDTO;
import hufs.graduation.paper.dto.UserDetailDTO;
import hufs.graduation.paper.entity.Order;
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

    public List<UserDTO> getUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(u -> new UserDTO(u.getId(), u.getName(), u.getPassword(), u.getTel()))
                .collect(Collectors.toList());
    }

    public UserDTO getUser(Integer userId) {
        User user = userRepository.findById(userId).orElseThrow();

        return new UserDTO(
                user.getId(), user.getName(), user.getPassword(), user.getTel()
        );
    }

    public UserDetailDTO getUserDetail(Integer userId) {
        User user = userRepository.getById(userId);
        List<Order> orders = user.getOrders();

        return new UserDetailDTO(
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getTel(),
                orders
//                orders.stream().map(
//                        o -> o.getOrderProducts().stream().map(op -> op.getProduct().getId())).collect(Collectors.toList())
//                                new OrderDTO(o.getId(), o.getUser().getId(), o.getOrderDate(),
//                                o.getOrderProducts().stream().map(
//                                        op -> new OrderProductDTO(op.getId(), op.getOrder().getId(), op.getProduct().getId(), op.getCount())
//                                ).collect(Collectors.toList())))

        );
    }
}
