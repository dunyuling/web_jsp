package com.rc.springbootwebjsp.repository;

import com.rc.springbootwebjsp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description JPA 方式连接数据库
 * @Author liux
 * @Date 19-7-24 上午12:40
 * @Version 1.0
 */
//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
