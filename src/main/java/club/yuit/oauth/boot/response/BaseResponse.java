package club.yuit.oauth.boot.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuit
 * @date   2018/3/30 20:37
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public  class BaseResponse  {

    private int status;
    private String msg;

}
