package misaka.whois;

public interface WhoisProvider {

    WhoisObject findWhois(String domainName);

}
