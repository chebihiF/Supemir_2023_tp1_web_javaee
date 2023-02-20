import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateUtil;

public class HibernateTest {

    @Test
    public void connectionTest(){
        SessionFactory factory = HibernateUtil.getFactory();
        Assert.assertNotEquals(factory, null);
    }
}
