package misaka.company;

import artoria.logging.Logger;
import artoria.logging.LoggerFactory;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

@Ignore
public class CompanyUtilsTest {
    private static Logger log = LoggerFactory.getLogger(CompanyUtilsTest.class);

    @Test
    public void test1() {
        Company company = CompanyUtils.findByCompanyName("Apple");
        List<Company> companyList = CompanyUtils.findListByCompanyName("Apple");
    }

}
