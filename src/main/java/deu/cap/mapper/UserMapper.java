package deu.cap.mapper;

import deu.cap.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    UserDto getUserByUserNumber(@Param("usernumber") Long usernumber);
    void insertUser(UserDto user);
    // 다른 데이터베이스 작업을 위한 메소드를 정의할 수 있음
}
