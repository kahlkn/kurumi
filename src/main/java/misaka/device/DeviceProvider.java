package misaka.device;

public interface DeviceProvider {

    Device findByDeviceModel(String deviceModel);

}
