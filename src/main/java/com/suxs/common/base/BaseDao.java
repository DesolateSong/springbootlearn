package com.suxs.common.base;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T, E> extends JpaRepository<T, E> {

}
