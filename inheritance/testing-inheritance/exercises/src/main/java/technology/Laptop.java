package technology;

public class Laptop extends Computer{
    private double weight;

    public Laptop(double storage, double memory, boolean keyBoard,int id, double weight) {
        super(storage, memory, keyBoard,id);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static boolean checkWeight(double x){
        if (x < 4.0){
            return true;
        }else{
            return false;
        }
    }
}
