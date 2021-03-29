package misaka.company;

import artoria.data.AbstractExtraData;
import artoria.data.RawData;

import java.io.Serializable;

public class Company extends AbstractExtraData implements RawData, Serializable {
    private Object rawData;
    private String id;
    private String name;
    /**
     * Unify the social credit code.
     */
    private String code;
    private String logo;
    private String telephone;
    private String website;
    private String email;
    private String address;
    private String industry;

    @Override
    public Object rawData() {

        return rawData;
    }

    @Override
    public void rawData(Object rawData) {

        this.rawData = rawData;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public String getLogo() {

        return logo;
    }

    public void setLogo(String logo) {

        this.logo = logo;
    }

    public String getTelephone() {

        return telephone;
    }

    public void setTelephone(String telephone) {

        this.telephone = telephone;
    }

    public String getWebsite() {

        return website;
    }

    public void setWebsite(String website) {

        this.website = website;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getIndustry() {

        return industry;
    }

    public void setIndustry(String industry) {

        this.industry = industry;
    }

}
