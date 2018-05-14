package com.bruce.hellospring.demo2;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Resource
    private List<CompactDisc> compactDiscList;

    @Test
    public void cdShouldNotBeNull() {
//        compactDisc.play();
        System.out.println();
    }


}
