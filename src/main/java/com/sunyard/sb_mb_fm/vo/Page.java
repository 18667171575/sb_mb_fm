package com.sunyard.sb_mb_fm.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Page<T> implements Serializable{
    private Integer code=0;
    private String msg;
    private Integer count=0;
    private List<T>data;
}
