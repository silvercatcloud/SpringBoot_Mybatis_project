package com.silvercat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Art {
    private String title;
    private String category;
    private String time;
    private String state;
}
