package org.gddt.address.controller;

import org.gddt.address.util.GouldUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/getAddress")
public class UserAddressController {
    @PostMapping("/getByJw")
    public Object getByJw(@RequestBody Map<String, String> map2) {
        GouldUtil util = new GouldUtil();
        long distanceByAddress = 0;
        try {
            distanceByAddress = util.getDistance(map2.get("Jd") + "," + map2.get("Wd"), "113.29431,33.73741");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return distanceByAddress;
    }
}
