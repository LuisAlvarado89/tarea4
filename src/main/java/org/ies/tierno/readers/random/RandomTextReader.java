package org.ies.tierno.readers.random;

import org.ies.tierno.models.TextFile;

import java.util.Random;

public class RandomTextReader implements  Reader<TextFile> {
    private final static String[] PATHS = {
            "/home/erick/Documentos/", "/home/erick/DocumentosImportantes/", "/home/mikel/Examenes/"
    };
    private final static String[] CONTENTS = {
            "Hello", "Error: Success"
    };
    private final Random random;

    @Override
    public TextFile read() {
        return new TextFile(
                random.nextInt(1, 1000),
                PATHS[random.nextInt(PATHS.length)],
                CONTENTS[random.nextInt(CONTENTS.length)]
        );
    }

}
