package misaka.company;

import artoria.logging.Logger;
import artoria.logging.LoggerFactory;
import artoria.util.Assert;

import java.util.List;

public class CompanyUtils {
    private static Logger log = LoggerFactory.getLogger(CompanyUtils.class);
    private static CompanyProvider companyProvider;

    public static CompanyProvider getCompanyProvider() {

        return companyProvider;
    }

    public static void setCompanyProvider(CompanyProvider companyProvider) {
        Assert.notNull(companyProvider, "Parameter \"companyProvider\" must not null. ");
        log.info("Set company provider: {}", companyProvider.getClass().getName());
        CompanyUtils.companyProvider = companyProvider;
    }

    public static Company findByCompanyName(String companyName) {

        return getCompanyProvider().findByCompanyName(companyName);
    }

    public static List<Company> findListByCompanyName(String companyName) {

        return getCompanyProvider().findListByCompanyName(companyName);
    }

}
