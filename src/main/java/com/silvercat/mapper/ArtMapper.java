package com.silvercat.mapper;

import com.silvercat.pojo.Art;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface ArtMapper {
    List<Art> list();

}
