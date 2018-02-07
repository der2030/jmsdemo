package der.rabbitmq.manytoone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @FileName:ManytooneTest
* @Description:
* @Author: Derrick Ye
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ManytooneTest {

    @Autowired
    private ManytooneSend1 manytooneSend1;
    @Autowired
    private ManytooneSend2 manytooneSend2;
    @Test
    public void testOneToMany(){
        for(int i=0;i<100;i++)
            manytooneSend1.send(i);
    }
    @Test
    public void testManyToOne(){

        for (int i=0;i<100;i++){
            manytooneSend1.send(i);
            manytooneSend2.send(i);
        }

    }
}
