package com.spirngcrud.crudapp.item;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends
        MongoRepository <Item, String> {
}
