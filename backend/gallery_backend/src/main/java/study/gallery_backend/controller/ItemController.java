package study.gallery_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.gallery_backend.dto.ItemResponse;
import study.gallery_backend.service.ItemService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/api/items")
    public ResponseEntity<List<ItemResponse>> getItems() {
        List<ItemResponse> itemResponses = itemService.getItems();
        return ResponseEntity.ok().body(itemResponses);
    }
}
