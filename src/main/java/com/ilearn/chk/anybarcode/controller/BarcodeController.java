package com.ilearn.chk.anybarcode.controller;

import com.ilearn.chk.anybarcode.service.BarCodeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/barcode")
public class BarcodeController {

    @Autowired
    private BarCodeReadService barcodeService;

    @PostMapping("/decode")
    public ResponseEntity<String> decodeBarcode(@RequestParam("file") MultipartFile file) {
        try {
            String decodedText = barcodeService.decodeBarcode(file);
            return ResponseEntity.ok(decodedText);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to decode barcode: " + e.getMessage());
        }
    }
}

