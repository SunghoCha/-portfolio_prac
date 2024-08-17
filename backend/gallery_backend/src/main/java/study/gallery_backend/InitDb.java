package study.gallery_backend;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import study.gallery_backend.domain.Item;
import study.gallery_backend.domain.Member;

@Slf4j
@Component
@RequiredArgsConstructor
public class InitDb {


    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInitItem();
        initService.dbInitMember();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInitItem() {
            log.info("==== dbInitItem start ====");
            log.info("InitItem : {}", this.getClass());

            Item itemA = createItem("itemA", 1000, "/img/cat-generated-8682714_1280.png", 10);
            em.persist(itemA);

            Item itemB = createItem("itemB", 2000, "/img/post-impressionist-1428136_1280.jpg", 20);
            em.persist(itemB);

            Item itemC = createItem("itemC", 3000, "/img/starry-8450454_1280.jpg", 30);
            em.persist(itemC);

            Item itemD = createItem("itemD", 4000, "/img/starry-night-1093721_1280.jpg", 40);
            em.persist(itemD);

            Item itemE = createItem("itemE", 5000, "/img/street-generated-8723974_1280.png", 50);
            em.persist(itemE);
        }

        private static Item createItem(String name, int price, String path, int discountPer) {
            return Item.builder()
                    .name(name)
                    .price(price)
                    .imgPath(path)
                    .discountPer(discountPer)
                    .build();
        }

        public void dbInitMember() {
            log.info("==== dbInitMember start ====");
            log.info("InitMember : {}", this.getClass());

            Member member1 = createMember("example1@gmail.com", "password1");
            em.persist(member1);

            Member member2 = createMember("example2@gmail.com", "password2");
            em.persist(member2);

            Member member3 = createMember("example3@gmail.com", "password3");
            em.persist(member3);
        }

        private static Member createMember(String email, String password) {
            return Member.builder()
                    .email(email)
                    .password(password)
                    .build();
        }
    }
}
