package misaka.geo;

import artoria.logging.Logger;
import artoria.logging.LoggerFactory;
import artoria.util.Assert;

import java.util.List;

public class GeolocationUtils {
    private static Logger log = LoggerFactory.getLogger(GeolocationUtils.class);
    private static GeolocationProvider geolocationProvider;

    public static GeolocationProvider getGeolocationProvider() {

        return geolocationProvider;
    }

    public static void setGeolocationProvider(GeolocationProvider geolocationProvider) {
        Assert.notNull(geolocationProvider, "Parameter \"geolocationProvider\" must not null. ");
        log.info("Set geolocation provider: {}", geolocationProvider.getClass().getName());
        GeolocationUtils.geolocationProvider = geolocationProvider;
    }

    public static Geolocation findFirst(String nameOrCode) {

        return getGeolocationProvider().findFirst(nameOrCode);
    }

    public static List<Geolocation> findLocations(String nameOrCode) {

        return getGeolocationProvider().findLocations(nameOrCode);
    }

    public static List<Geolocation> findCountries() {

        return getGeolocationProvider().findCountries();
    }

    public static List<Geolocation> findRegions(String country) {

        return getGeolocationProvider().findRegions(country);
    }

    public static List<Geolocation> findCities(String provinceOrState) {

        return getGeolocationProvider().findCities(provinceOrState);
    }

    public static List<Geolocation> findDistricts(String city) {

        return getGeolocationProvider().findDistricts(city);
    }

    public static List<Geolocation> findStreets(String county) {

        return getGeolocationProvider().findStreets(county);
    }

}
