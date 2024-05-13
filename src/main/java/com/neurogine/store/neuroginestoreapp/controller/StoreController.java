package com.neurogine.store.neuroginestoreapp.controller;


import com.neurogine.store.neuroginestoreapp.entity.Store;
import com.neurogine.store.neuroginestoreapp.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    @GetMapping("/search")
    public List<Store> findStoreByName(@RequestParam String name) {
        return storeService.findStoreByName(name);
    }
}

