package hufs.graduation.paper.controller;

import hufs.graduation.paper.dto.UserDTO;
import hufs.graduation.paper.dto.UserDetailDTO;
import hufs.graduation.paper.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<UserDTO>> getUsers() {
        try {
            return ResponseEntity.ok(userService.getUsers());
        } catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/user/orders")
    public void getUsersOrders() {
        try {
            userService.getUsersOrders();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("userId") Integer userId) {
        try {
            return ResponseEntity.ok(userService.getUser(userId));
        } catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/order/{userId}")
    public ResponseEntity<UserDetailDTO> getUserDetail(@PathVariable("userId") Integer userId) {
        try {
            return ResponseEntity.ok(userService.getUserDetail(userId));
        } catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
