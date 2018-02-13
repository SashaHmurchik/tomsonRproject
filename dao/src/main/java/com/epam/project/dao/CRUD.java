package com.epam.project.dao;

import java.util.List;

interface CRUD<K, E> {

        void save(E e);

        E findById(K k);

        List<E> findAll();

        void update(E e);

        void delete(E e);
}
