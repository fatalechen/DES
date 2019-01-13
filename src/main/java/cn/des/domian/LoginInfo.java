package cn.des.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author:cgz
 * @Description:
 * @Date: create in 14:56 2019/1/13
 * @Version:
 * @Modified by:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class LoginInfo {
    private  String message;
    private  String  name;
    private  String password;
    private  String  key="1a2b3c1a2b3c1a2b";
}
