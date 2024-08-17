package study.gallery_backend.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import study.gallery_backend.domain.Item;

@Getter @Setter
public class ItemResponse {

    private Long id;
    private String name;
    private int price;
    private String imgPath;
    private int discountPer;

    @Builder
    public ItemResponse(Long id, String name, int price, String imgPath, int discountPer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgPath = imgPath;
        this.discountPer = discountPer;
    }

    public static ItemResponse of(Item item) {
        return ItemResponse.builder()
                .id(item.getId())
                .name(item.getName())
                .price(item.getPrice())
                .imgPath(item.getImgPath())
                .discountPer(item.getDiscountPer())
                .build();
    }
}
