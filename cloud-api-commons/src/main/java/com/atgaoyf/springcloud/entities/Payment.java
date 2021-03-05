package com.atgaoyf.springcloud.entities;

import lombok.*;

import java.io.Serializable;

/**
 * @author gaoyf
 * @Desc 订单实体类
 * @Date 2021/3/3 15:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Payment implements Serializable {
    private int id;
    @NonNull
    private String serial;
}
