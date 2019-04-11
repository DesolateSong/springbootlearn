package com.suxs.web.modules.sys.dao;

import com.suxs.common.base.BaseDao;
import com.suxs.web.modules.sys.entity.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseDao<User, String> {

}
