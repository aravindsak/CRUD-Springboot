package com.spirngcrud.crudapp.item;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository repository;

    public String save(Item item) {

        return repository.save(item).getId();
    }

    public Item findById(String id) {
        return repository.findById(id)
                .orElse(null);
    }

    public List<Item> findAll() {
        return repository.findAll();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
