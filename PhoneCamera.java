

public class PhoneCamera {

    public static void main(String[] args) {
        PhoneCameraApp cam1 = new BasicCameraApp();
        PhoneCameraApp cam2 = new CameraPlusApp();

        cam1.take();
        cam1.save();
        cam1.edit();
        cam1.performShare();

        cam2.take();
        cam2.save();
        cam2.edit();
        cam2.performShare();

    }    
}