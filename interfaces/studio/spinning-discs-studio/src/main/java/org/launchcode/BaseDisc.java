package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private String type;
    private int spin;

    public BaseDisc(String name, String type, int spin) {
        this.name = name;
        this.type = type;
        this.spin = spin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return type;
    }

    public void setDiscType(String discType) {
        this.type = type;
    }

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }

    @Override
    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", spin=" + spin +
                '}';
    }

}
