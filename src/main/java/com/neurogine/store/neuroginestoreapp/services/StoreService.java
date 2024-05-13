package com.neurogine.store.neuroginestoreapp.services;

import com.neurogine.store.neuroginestoreapp.entity.Store;
import com.neurogine.store.neuroginestoreapp.exceptions.StoreNotFoundException;
import com.neurogine.store.neuroginestoreapp.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getAllStores() {
        List<Store> stores = storeRepository.findAll();
        if (!CollectionUtils.isEmpty(stores)) {
            return stores;
        }
        throw new StoreNotFoundException("No Data Found.");
    }

    public List<Store> findStoreByName(String name) {
        List<Store> stores = storeRepository.findByName(name);
        if (stores != null  && !CollectionUtils.isEmpty(stores)) {
            return stores;
        }
        throw new StoreNotFoundException("Store not found with Name: " + name);
    }


}

