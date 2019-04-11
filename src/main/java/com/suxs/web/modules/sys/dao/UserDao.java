package com.suxs.web.modules.sys.dao;

import com.suxs.web.modules.sys.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String> {

}
