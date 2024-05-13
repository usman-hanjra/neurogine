package com.neurogine.store.neuroginestoreapp.repositories;

import com.neurogine.store.neuroginestoreapp.entity.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StoreRepository extends MongoRepository<Store, String> {


    List<Store> findByName(String name);
}

