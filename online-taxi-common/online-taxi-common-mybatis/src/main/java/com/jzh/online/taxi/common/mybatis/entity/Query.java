package com.jzh.online.taxi.common.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Query {

    /**
     * 页码
     */
    private final Integer pageNo;

    /**
     * 每页数量
     */
    private final Integer pageSize;

    /**
     * 排序字段
     */
    private final List<String> sortByList;

    /**
     * 排序方式
     */
    private final List<String> sortDirectionList;
}
