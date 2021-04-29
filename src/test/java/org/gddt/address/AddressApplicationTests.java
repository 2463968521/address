package org.gddt.address;

import org.gddt.address.util.GouldUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddressApplicationTests {

    @Test
    void contextLoads() throws Exception {
        GouldUtil util = new GouldUtil();

        String map = util.getAMapByLngAndLat("113.29431", "33.73741");
        System.out.println(map);
    }

}
