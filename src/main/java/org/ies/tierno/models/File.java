package org.ies.tierno.models;

@Data
@AllArgsConstructor
public abstract class File {
    protected int size;
    protected String path;

    public abstract void open();

    public void move (String newPath){
        if (path.equals(newPath)){
            System.out.println("no hay cambios");
        }else {
            path=newPath;
            System.out.println(" el fichero se ha movido a " + newPath);
        }
    }
}
