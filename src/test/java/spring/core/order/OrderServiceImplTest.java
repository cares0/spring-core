package spring.core.order;

import org.junit.jupiter.api.Test;
import spring.core.discount.FixDiscountPolicy;
import spring.core.member.MemoryMemberRepository;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

/*    @Test
    void createOrder() { // 수정자 주입을 사용할 경우
        OrderServiceImpl orderService = new OrderServiceImpl();

        // 수정자를 통해 의존 관계를 넣어주어야 함, 어떤 객체가 필요한지 해당 클래스 코드를 봐야 파악 가능해짐
        orderService.setDiscountPolicy(new FixDiscountPolicy());
        orderService.setMemberRepository(new MemoryMemberRepository());

        orderService.createOrder(1L, "ID", 20000);
    }*/

    @Test
    void createOrder2() { // 생성자 주입을 사용할 경우
        // 생성자를 통해 어떤 객체가 필요한지 바로 파악 가능, 의존 관계를 바로 넣을 수 있음
        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());

        orderService.createOrder(1L, "ID", 20000);
    }

}