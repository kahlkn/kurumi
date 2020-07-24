package misaka.net;

/**
 * Network physical address provider.
 * @author Kahle
 */
public interface IpGeolocationProvider {

    IpGeolocation findIpGeolocation(String ipAddress);

}
