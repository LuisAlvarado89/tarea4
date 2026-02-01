package org.ies.tierno.models;

@Data
@AllArgsConstructor
public class Program<T extends File> {
    private String name;
    private T[] files;

    public void execute(String outputPath) {
        System.out.println("Programa " + name + ", Archivos: ");
        for (T file : files) {
            file.open();
            file.move(outputPath);
            System.out.println();
        }
    }
}
