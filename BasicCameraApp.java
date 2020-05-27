
public class BasicCameraApp extends PhoneCameraApp {
    public BasicCameraApp() {
        shareBehaviour = new EmailSharing();
    }
    public void edit(){
        System.out.println("Perform basic editing");
    }
}