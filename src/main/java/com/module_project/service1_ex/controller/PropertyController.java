
package com.module_project.service1_ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.module_project.service1_ex.service.PropertyService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.poi.xwpf.usermodel.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("property")
public class PropertyController {

@Autowired
private PropertyService propertyService;


@PostMapping("/extract-docx")
    public Map<String, String> extractFromDocx(@RequestParam("file") MultipartFile file) {
        Map<String, String> details = new HashMap<>();

        try {
            // Lire le fichier DOCX
            InputStream inputStream = file.getInputStream();
            XWPFDocument document = new XWPFDocument(inputStream);

            // Lire les paragraphes un par un
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                String text = paragraph.getText();

                 if (text.startsWith("Nom complet de Propriété")) {
                    details.put("Nom complet", text.split(":")[1].trim());
                } else if (text.startsWith("type")) {
                    details.put("Type", text.split(":")[1].trim());
                } else if (text.startsWith("Référence cadastrale")) { // Nouveau champ ajouté
                    details.put("Référence cadastrale", text.split(":")[1].trim());
                }
            }

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
            details.put("error", "Erreur lors de la lecture du fichier DOCX");
        }

        return details;
    }

}
