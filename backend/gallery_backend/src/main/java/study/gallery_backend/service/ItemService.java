package study.gallery_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.gallery_backend.domain.Item;
import study.gallery_backend.dto.ItemResponse;
import study.gallery_backend.repository.ItemRepository;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<ItemResponse> getItems() {
        List<Item> items = itemRepository.findAll();
        return items.stream().map(ItemResponse::of).collect(toList());
    }

}

