package misaka.geo;

import artoria.data.GeoCoordinate;
import artoria.util.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;

import static artoria.common.Constants.EMPTY_STRING;

/**
 * Geographical location object.
 * @see <a href="https://en.wikipedia.org/wiki/Geolocation">Geolocation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Geocode">Geocode</a>
 * @author Kahle
 */
public class Geolocation implements GeoCoordinate, Serializable {
    /**
     * Country.
     */
    private String country;
    /**
     * Country code.
     */
    private String countryCode;
    /**
     * Province or state.
     */
    private String region;
    /**
     * Region code.
     */
    private String regionCode;
    /**
     * City.
     */
    private String city;
    /**
     * City code.
     */
    private String cityCode;
    /**
     * County, town or district.
     */
    private String district;
    /**
     * District code.
     */
    private String districtCode;
    /**
     * Street.
     */
    private String street;
    /**
     * Street code.
     */
    private String streetCode;
    /**
     * Longitude.
     */
    private BigDecimal longitude;
    /**
     * Latitude.
     */
    private BigDecimal latitude;
    /**
     * Elevation.
     */
    private BigDecimal altitude;

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getCountryCode() {

        return countryCode;
    }

    public void setCountryCode(String countryCode) {

        this.countryCode = countryCode;
    }

    public String getRegion() {

        return region;
    }

    public void setRegion(String region) {

        this.region = region;
    }

    public String getRegionCode() {

        return regionCode;
    }

    public void setRegionCode(String regionCode) {

        this.regionCode = regionCode;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getCityCode() {

        return cityCode;
    }

    public void setCityCode(String cityCode) {

        this.cityCode = cityCode;
    }

    public String getDistrict() {

        return district;
    }

    public void setDistrict(String district) {

        this.district = district;
    }

    public String getDistrictCode() {

        return districtCode;
    }

    public void setDistrictCode(String districtCode) {

        this.districtCode = districtCode;
    }

    public String getStreet() {

        return street;
    }

    public void setStreet(String street) {

        this.street = street;
    }

    public String getStreetCode() {

        return streetCode;
    }

    public void setStreetCode(String streetCode) {

        this.streetCode = streetCode;
    }

    @Override
    public BigDecimal getLongitude() {

        return longitude;
    }

    @Override
    public void setLongitude(BigDecimal longitude) {

        this.longitude = longitude;
    }

    @Override
    public BigDecimal getLatitude() {

        return latitude;
    }

    @Override
    public void setLatitude(BigDecimal latitude) {

        this.latitude = latitude;
    }

    @Override
    public BigDecimal getAltitude() {

        return altitude;
    }

    @Override
    public void setAltitude(BigDecimal altitude) {

        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return (StringUtils.isNotBlank(country) ? country : EMPTY_STRING)
                + (StringUtils.isNotBlank(region) ? region : EMPTY_STRING)
                + (StringUtils.isNotBlank(city) ? city : EMPTY_STRING)
                + (StringUtils.isNotBlank(district) ? district : EMPTY_STRING)
                + (StringUtils.isNotBlank(street) ? street : EMPTY_STRING);
    }

}
