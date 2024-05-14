package com.neurogine.store.neuroginestoreapp.services;

import com.neurogine.store.neuroginestoreapp.configurations.BodyRecord;
import com.neurogine.store.neuroginestoreapp.configurations.HeaderRecord;
import com.neurogine.store.neuroginestoreapp.configurations.TrailerRecord;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@Service
public class FlatFileService {

    public void generateFlatFile() throws IOException {
        StreamFactory factory = StreamFactory.newInstance();
        factory.load(new ClassPathResource("mapping.xml").getInputStream());

        Writer writer = new FileWriter("output.txt");
        BeanWriter beanWriter = factory.createWriter("flatFile", writer);

        // Write header record
        HeaderRecord header = new HeaderRecord();
        header.setRecordType("H");
        header.setFileType("FLAT_FILE");
        beanWriter.write("header", header);

        // Write body records
        BodyRecord record1 = new BodyRecord();
        record1.setRecordType("1");
        record1.setReferenceNo("6813162459");
        record1.setAmount("RM2.00");
        beanWriter.write("body", record1);

        BodyRecord record2 = new BodyRecord();
        record2.setRecordType("1");
        record2.setReferenceNo("2039229524");
        record2.setAmount("RM10.00");
        beanWriter.write("body", record2);

        BodyRecord record3 = new BodyRecord();
        record3.setRecordType("1");
        record3.setReferenceNo("2299488320");
        record3.setAmount("RM5.00");
        beanWriter.write("body", record3);

        // Write trailer record
        TrailerRecord trailer = new TrailerRecord();
        trailer.setRecordType("T");
        trailer.setFileType("FLAT_FILE");
        beanWriter.write("trailer", trailer);

        beanWriter.flush();
        beanWriter.close();
        writer.close();
    }
}

