package com.neurogine.store.neuroginestoreapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FlatFileController {

  /*  @Autowired
    private FlatFileService flatFileService;
*/
    @GetMapping("/generateFlatFile")
    public String generateFlatFile() {
        List<Object> records = new ArrayList<>();
        // Add your records here (e.g., header, body, trailer)
      /*  String outputFile = "output.txt";
        try {
            flatFileService.generateFlatFile(records, outputFile);
            return "Flat file generated successfully.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to generate flat file.";
        }*/
        return null;
    }
}

