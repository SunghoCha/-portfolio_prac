package study.gallery_backend.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name", "price"})
public class Item extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    private int price;

    @Column(length = 100)
    private String imgPath;

    private int discountPer; // 추후에 할인정책으로 분리할수도

    @Builder

    public Item(Long id, String name, String imgPath, int price, int discountPer) {
        this.id = id;
        this.name = name;
        this.imgPath = imgPath;
        this.price = price;
        this.discountPer = discountPer;
    }
}
