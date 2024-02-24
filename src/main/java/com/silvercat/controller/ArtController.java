package com.silvercat.controller;

import com.silvercat.pojo.Art;
import com.silvercat.pojo.Result;
import com.silvercat.service.ArtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/article")
@CrossOrigin//支持跨域
@RestController
public class ArtController {
    @Autowired
    private ArtService artService;
    @GetMapping("/getAll")
    public Result list(){
        log.info("查询全部数据");
        List<Art> artList = artService.list();
        return Result.success(artList);

    }
}
