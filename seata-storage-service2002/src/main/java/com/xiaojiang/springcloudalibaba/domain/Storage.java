package com.xiaojiang.springcloudalibaba.domain;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage
{
    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;
}

