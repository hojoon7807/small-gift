package com.sgwannabig.smallgift.springboot.dto.order;

import com.sgwannabig.smallgift.springboot.domain.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcouponDto {

    //Ecoupon 아이디.
    @Id
    private long id;
    //어떤 상품을 샀는지 (동일 상품을 다음에 또 주문할 수 있음.)

    @ApiModelProperty(name = "productName",value = "상품명",example = "아이스 아메리카노",dataType = "String")
    String productName;

    @ApiModelProperty(name = "productImage",value = "상품이미지",example = "http://~~",dataType = "String")
    String productImage;


    //주문내역을 근거할 결제번호.
    @ApiModelProperty(name = "paymentId",dataType = "long",example = "1021623")
    private long paymentId;


    //이건 테스팅 해봐야함. 사용여부를 enum으로 받는다.   Y, N, R 값만 갖도록 함       //사용, 미사용, 환불  <- enum호환성때문에 그냥 로직으로 구분하기.
    @ApiModelProperty(example = "Y", dataType = "String")
    private String useState;


    //생성된 쿠폰번호.
    @ApiModelProperty(example = "100352432", dataType = "String")
    private String couponNumber;

    //사용기한.
    private LocalDateTime expirationTime;

    //사용일자.
    private LocalDateTime usedTime;
}
