package com.silvercat;

import com.silvercat.mapper.ArtMapper;
import com.silvercat.pojo.Art;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AbcMysqlApplicationTests {
    @Autowired
    private ArtMapper artMapper;

    @Test
    public void getAllArticles() {
        List<Art> actualList = artMapper.list();
        System.out.println(actualList);
    }
}
