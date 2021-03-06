package hufs.graduation.paper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private String password;
    private String tel;
}
