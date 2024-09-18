package com.chamith.Repository;

import java.util.List;

public interface CrudRepository<T> {

    List<T> findAll();
}
