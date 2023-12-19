package technology;

public class Computer extends AbstractEntity {
    double storage;
    double memory;
    boolean keyBoard;

    public Computer(double storage, double memory, boolean keyBoard, int id) {
        super();
        this.storage = storage;
        this.memory = memory;
        this.keyBoard = keyBoard;
    }
    public double getStorage() {
        return storage;
    }
    public double getMemory() {
        return memory;
    }
    public void setMemory(double memory) {
        this.memory = memory;
    }
    public void setStorage(double storage) {
        this.storage = storage;
    }
    public boolean getKeyBoard() {
        return keyBoard;
    }
    public void setKeyBoard(boolean keyBoard) {
        this.keyBoard = keyBoard;
    }
    public void storage(double storedItemSize){
        storage = storage + storedItemSize;
    }
    public void memory(double memoryUSedToStore){
        memory = memory + memoryUSedToStore;
    }
}
