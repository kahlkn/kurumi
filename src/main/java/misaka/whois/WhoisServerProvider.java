package misaka.whois;

public interface WhoisServerProvider {

    WhoisServer findWhoisServer(String domainName);

}
