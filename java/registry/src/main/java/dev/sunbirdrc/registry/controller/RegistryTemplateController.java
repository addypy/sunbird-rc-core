package dev.sunbirdrc.registry.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

// This class handles the REST API requests related to registry templates
@RestController
public class RegistryTemplateController {

    // The path to the folder containing the certificate templates
    @Value("${certificate.templateFolderPath}")
    private String templatesFolderPath;

    // This method handles the GET request to retrieve a specific template by its file name
    @RequestMapping(value = "/api/v1/templates/{fileName}", method = RequestMethod.GET)
    public String getTemplate(@PathVariable String fileName) {
        String content = "";
        try {
            // Load the requested template file from the templates folder
            File file = new ClassPathResource(templatesFolderPath + fileName).getFile();
            // Read the content of the template file
            content = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            // Print the stack trace if an exception occurs while reading the template file
            e.printStackTrace();
        }
        // Return the content of the template file as a string
        return content;
    }
}