package com.silvercat.service.impl;

import com.silvercat.mapper.ArtMapper;
import com.silvercat.pojo.Art;
import com.silvercat.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArtServiceImpl implements ArtService {
    @Autowired
    private ArtMapper artMapper;
    @Override
    public List<Art> list() {
        return artMapper.list();
    }
}
