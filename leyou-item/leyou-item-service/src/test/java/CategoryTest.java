import com.leyou.LeyouItemApplication;
import com.leyou.item.controller.CategoryController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = LeyouItemApplication.class)
@RunWith(SpringRunner.class)
public class CategoryTest {

    @Autowired
    private CategoryController categoryController;

    @Test
    public void categoryTest(){
        ResponseEntity<List<String>> listResponseEntity = categoryController.queryNamesByIds(Arrays.asList(1L, 2L));

        listResponseEntity.getBody().forEach(
                System.out::println);
    }
}
