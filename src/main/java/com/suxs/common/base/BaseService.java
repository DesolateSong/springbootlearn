package com.suxs.common.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public abstract class BaseService<T extends BaseDao, E extends BaseEntity> {

    @Autowired
    private T dao;

    @Modifying
    public List<E> findAll() {
        return dao.findAll();
    }

    @Modifying
    public E save(E entity) {
        return (E) dao.save(entity);
    }

    @Modifying
    public E saveAndFlush(E entity) {
        return (E) dao.saveAndFlush(entity);
    }

    public List<E> findList(E entity) {
        return dao.findAll(Example.of(entity));
    }

    @Modifying
    public void delete(E entity) {
        dao.delete(entity);
    }

}
