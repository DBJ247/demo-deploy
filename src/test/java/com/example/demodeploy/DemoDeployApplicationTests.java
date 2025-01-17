package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // 에러 강제 발생 시킴 -> 중단여부 체크
        // 테스트 실패되면 반영 x
        int a = 1/0;
        throw new RuntimeException("오류발생");
        // MVC 테스트 -> 목업통해서 가상 처리 가능
        // RestAPI 테스트 가능
        // 메시지가 보이지는 않지만, 차후 코드로 확인
        // System.out.println("단위 테스트 호출!! echo");
    }

}
