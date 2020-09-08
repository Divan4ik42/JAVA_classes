package com.company;

public class Window extends Rectangle {
    private int fating;
    private String material;
    private int layers;
    private int glassFat;
    private String lock;

    public Window() {
    }

    public Window(int fating, String material, int layers, int glassFat, String lock) {
        this.fating = fating;
        this.material = material;
        this.layers = layers;
        this.glassFat = glassFat;
        this.lock = lock;
    }

    public Window(int length, int width, int fating, String material, int layers, int glassFat, String lock) {
        super(length, width);
        this.fating = fating;
        this.material = material;
        this.layers = layers;
        this.glassFat = glassFat;
        this.lock = lock;
    }

    public int getFating() {
        return fating;
    }

    public void setFating(int fating) {
        this.fating = fating;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getGlassFat() {
        return glassFat;
    }

    public void setGlassFat(int glassFat) {
        this.glassFat = glassFat;
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "Window{" +
                super.toString() +
                "length=" + super.getLength() + 
                ", width=" + super.getWidth() +
                ", fating=" + this.getFating() +
                ", material='" + this.getFating() + '\'' +
                ", layers=" + this.getLayers() +
                ", glassFat=" + this.getGlassFat() +
                ", lock='" + this.getLock() + '\'' +
                '}';
    }
    
}
