import com.lxl.dao.UserDao;
import com.lxl.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserDao 的测试类
 *
 * @author: @我没有三颗心脏
 * @create: 2018-04-23-上午 9:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUserById() {
        int id = 1;
        User user = userDao.findUserById(id);
        System.out.println(user.getId() + ":" + user.getUsername());
    }
}