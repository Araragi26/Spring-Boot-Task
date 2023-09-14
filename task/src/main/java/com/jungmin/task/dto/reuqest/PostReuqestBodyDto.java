package com.jungmin.task.dto.reuqest;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostReuqestBodyDto {
    private String schedule;
    private String category;
    private String explanation;
    private String date;
    private String time;
}
