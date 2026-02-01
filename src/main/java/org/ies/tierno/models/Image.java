package org.ies.tierno.models;

public class Image {
    private int height;
    private int width;

    @Data
    public Image(int size, String path, int height, int width) {
        super(size, path);
        this.height = height;
        this.width = width;
    }

    @Override
    public void open() {
        System.out.println("Altura: " + height + ", Ancho: " + width + ", Tamaño: " + size + " (MB), Ruta: " + path);
    }
}
