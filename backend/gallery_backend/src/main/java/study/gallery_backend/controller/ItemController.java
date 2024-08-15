package study.gallery_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.gallery_backend.dto.ItemResponse;

import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/")
    public ResponseEntity<List<ItemResponse>> getItems() {
        return null;
    }
}
