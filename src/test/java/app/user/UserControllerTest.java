package app.user;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class UserControllerTest {

    @Test
    public void getHello() throws Exception {
        UserController userController = new UserController();
        User first = userController.user("Name","Surname");
        User second = userController.user("Name2","Surname2");

        assertEquals(first.getId(),1);
        assertEquals(second.getId(),2);

    }
}
