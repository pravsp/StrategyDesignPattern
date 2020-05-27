// Phone camera App super class


public abstract class PhoneCameraApp {
    public ShareBehaviour shareBehaviour;
    abstract void edit();
    public PhoneCameraApp() {}
    public void performShare(){
        shareBehaviour.share();
    }
    public void take(){
        System.out.println("Taking Photo");
    }
    public void save(){
        System.out.println("Save Photo");
    }
    public void setShare(ShareBehaviour new_share){
        shareBehaviour = new_share;
    }
}