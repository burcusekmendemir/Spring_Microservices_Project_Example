package com.burcu.utility;


import java.util.List;
import java.util.Optional;

public interface IService<T, ID>  {
        T save(T t);
        Iterable<T> saveAll(Iterable<T> t);
        T update(T t);
        void delete(T t);
        void deleteById(ID id);
        Iterable<T> findAll();
        Optional<T> findById(ID id);
}
