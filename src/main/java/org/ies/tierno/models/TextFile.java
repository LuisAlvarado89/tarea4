package org.ies.tierno.models;

public class TextFile extends File{
    private String content;

    public TextFile(int size, String path, String content) {
        super(size, path);
        this.content = content;
    }

    @Override
    public void open() {
        System.out.println("Contenido: " + content + ", Tamaño: " + size + " (KB), Ruta: " + path);
    }
}
