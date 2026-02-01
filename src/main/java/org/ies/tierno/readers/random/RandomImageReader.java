package org.ies.tierno.readers.random;

import org.ies.tierno.models.Image;

import java.util.Random;

public class RandomImageReader implements Reader <Image> {
    private final static String[] PATHS = {
            "/home/luis/Imágenes/", "/home/Luis/ImágenesImportantes/", "/home/mikel/Imágenes/"
    };
    private final Random random;

    @Override
    public Image read() {
        return new Image(
                random.nextInt(1, 1000),
                PATHS[random.nextInt(PATHS.length)],
                random.nextInt(1, 1080),
                random.nextInt(1, 1920)
        );
    }
}
