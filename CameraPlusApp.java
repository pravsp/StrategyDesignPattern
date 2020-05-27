

public class CameraPlusApp extends PhoneCameraApp{
    public CameraPlusApp(){
        shareBehaviour = new SocialMediaSharing();
    }
    public void edit(){
        System.out.println("Perform Cameraplus editing");
    }
    
}