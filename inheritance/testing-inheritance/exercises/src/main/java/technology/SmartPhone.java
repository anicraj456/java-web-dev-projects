package technology;

public class SmartPhone extends Computer{
    private double size;

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public SmartPhone(double storage, double memory, boolean keyBoard, int id, double size) {
        super(storage,memory,keyBoard,id);
        this.size = size;
    }
    public static boolean screenSize(double x){
        if ( x > 6){
            return true;
        }else {
            return false;
        }
    }
}
