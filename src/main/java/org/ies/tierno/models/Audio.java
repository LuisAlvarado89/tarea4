package org.ies.tierno.models;
@Data
public class Audio extends File {
    private double duration;

    public Audio(int size, String path, double duration) {
        super(size, path);
        this.duration = duration;
    }

    @Override
    public void open() {
        System.out.println("Duracion: " + duration + ", Tamaño: " + size + " (MB), Ruta: " + path);
    }


}
