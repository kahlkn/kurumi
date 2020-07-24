package misaka.geo;

import java.util.List;

public interface GeolocationProvider {

    Geolocation findFirst(String nameOrCode);

    List<Geolocation> findLocations(String nameOrCode);

    List<Geolocation> findCountries();

    List<Geolocation> findRegions(String country);

    List<Geolocation> findCities(String subdivision);

    List<Geolocation> findDistricts(String city);

    List<Geolocation> findStreets(String county);

}
