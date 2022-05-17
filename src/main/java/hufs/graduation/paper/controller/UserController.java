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

    @GetMapping("/user/detail/{userId}")
    public ResponseEntity<UserDetailDTO> getUserDetail(@PathVariable("userId") int userId) {
        try {
            return ResponseEntity.ok(userService.getUserDetail(userId));
        } catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
