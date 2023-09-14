package com.jungmin.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jungmin.task.dto.reuqest.PostReuqestBodyDto;

@RestController
@RequestMapping("/api/v1/task")
public class MainController {

    @GetMapping("/{taskNumber}")
    public String getSchedule(
        @PathVariable("taskNumber") String taskNumber
    ) {
        return "/ : " + taskNumber; 
    }

    @PostMapping("")
    public String postSchedule() {
        return "일정 작성하기";
    }

    @PatchMapping("/{taskNumber}")
    public String patchSchedule() {
        return "일정 수정하기";
    }

    @DeleteMapping("/{taskNumber}")
    public String deleteSchedule() {
        return "일정 삭제하기";
    }

    @PostMapping
    public String CreateSchedule(
        @RequestBody PostReuqestBodyDto createSchedule
    ) {
        return "일정 작성하기는 " + 
            createSchedule.getSchedule() + 
            createSchedule.getCategory() + 
            createSchedule.getExplanation() + 
            createSchedule.getDate() + 
            createSchedule.getTime() + "을 작성해 주세요.";
    }

}
