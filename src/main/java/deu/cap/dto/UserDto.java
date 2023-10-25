package deu.cap.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter@Setter
public class UserDto {
        private Long usernumber;
        private String id;
        private String username;
        private String password;
        private String email;
        private String address;
        private String phone;
        private Integer grade;
        private Timestamp createDate;

        public UserDto(Long usernumber, String id, String username, String password, String email, String address, String phone, Integer grade, Timestamp createDate) {
                this.usernumber = usernumber;
                this.id = id;
                this.username =username;
                this.password = password;
                this.email = email;
                this.address = address;
                this.phone = phone;
                this.grade = grade;
                this.createDate = createDate;
        }
        // 생성자, getter 및 setter, 그리고 다른 메소드들
    }








