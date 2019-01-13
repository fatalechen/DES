package cn.des.controller;

import cn.des.domian.LoginInfo;
import cn.des.utils.DesCrypt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:cgz
 * @Description:
 * @Date: create in 17:48 2019/1/13
 * @Version:
 * @Modified by:
 */
@RestController
@Slf4j
public class DESController {
    @RequestMapping("/testDES")
    public  Object  testDES(@RequestBody LoginInfo  loginInfo) throws Exception {
        String decode = DesCrypt.decode(loginInfo.getMessage());
        log.info(decode);
        return loginInfo;
    }
}
