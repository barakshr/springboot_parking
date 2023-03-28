package com.practise.spring.reposervice;

import java.util.List;
import java.util.Optional;

public interface DBRepoService<T> {

    Optional<T> findById(long id);

    List<T> findAll();
}
