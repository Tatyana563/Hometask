public class Device extends BasicDevice {

}
class BasicDevice{
    private String s = "Original";

    public BasicDevice() {
       s = "original";
    }
protected String change(String c){
     s=c;
     return c;
   }

    public static void main(String[] args) {
        BasicDevice basicDevice = new BasicDevice();
        System.out.println(basicDevice.s);
        System.out.println(basicDevice.change("oooooo"));
        Device device = new Device();
        System.out.println(device.change("changedDevice"));
    }
}