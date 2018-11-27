package com.hiya.sa.many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class NameService {/*

    @Autowired
    NameQaMapper qaMapper;
    @Autowired
    NameDevMapper devMapper;

    @Transactional(rollbackFor=Exception.class)
    public void addQaAndDev(boolean hasException) throws Exception{

        NameQa nameQa = new NameQa();
        nameQa.setNameQa("hello qa");       
        qaMapper.insert(nameQa);

        NameDev dev = new NameDev();
        dev.setNameDev("hello dev");
        devMapper.insert(dev);

        if (hasException) {
            throw new Exception();
        }
    }
*/}