package misaka.device;

import artoria.data.Device;

public interface DeviceProvider {

    Device findByDeviceModel(String deviceModel);

}
