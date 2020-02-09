package com.leyou.search.test;

import com.leyou.LeyouSearchApplication;
import com.leyou.item.pojo.Brand;
import com.leyou.search.client.BrandClient;
import com.leyou.search.client.CategoryClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeyouSearchApplication.class)
public class LeyouSearchTest {

    /**
     * 远程调用feign会 动态代理
     */
    @Autowired
    private CategoryClient categoryClient;

    @Autowired
    private BrandClient brandClient;

    @Test
    public void testQueryNamesByCids(){
        System.out.println(1);
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(1L);
        longs.add(2L);
       /* List<String> names = this.categoryClient.queryNamesByIds(longs);

        names.forEach(System.out::println);*/
        System.out.println(this.categoryClient.queryNameByIds(longs));
        Brand brand = brandClient.queryBrandById(4986L);
        System.out.println(brand.getName());
    }

}
