package com.spirngcrud.crudapp.item;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService service;

    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody Item item
    ) {
        return ResponseEntity.ok(service.save(item));
    }

    @GetMapping
    public ResponseEntity<List<Item>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{item-id}")
    public ResponseEntity<Item> findById(
            @PathVariable("item-id") String itemID
    ) {
        return ResponseEntity.ok(service.findById(itemID));
    }

    @DeleteMapping("/{item-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("item-id") String itemID
    ) {
        service.delete(itemID);
        return ResponseEntity.accepted().build();
    }
}
