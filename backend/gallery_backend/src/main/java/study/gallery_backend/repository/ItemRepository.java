package study.gallery_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.gallery_backend.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
