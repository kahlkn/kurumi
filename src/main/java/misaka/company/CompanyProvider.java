package misaka.company;

import java.util.List;

public interface CompanyProvider {

    /**
     * Find company by company name.
     */
    Company findByCompanyName(String companyName);

    /**
     * Find company list by company name.
     */
    List<Company> findListByCompanyName(String companyName);

}
