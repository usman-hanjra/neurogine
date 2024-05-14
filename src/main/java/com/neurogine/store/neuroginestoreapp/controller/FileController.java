package com.neurogine.store.neuroginestoreapp.controller;

import com.neurogine.store.neuroginestoreapp.services.FlatFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    private final FlatFileService flatFileService;

    @Autowired
    public FileController(FlatFileService flatFileService) {
        this.flatFileService = flatFileService;
    }

    @PostMapping("/generateFlatFile")
    public String generateFlatFile() {
        try {
            flatFileService.generateFlatFile();
            return "Flat file generated successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to generate flat file: " + e.getMessage();
        }
    }
}

