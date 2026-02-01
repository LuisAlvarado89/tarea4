package org.ies.tierno.readers.random;

import org.ies.tierno.models.Program;
import org.ies.tierno.models.TextFile;

import java.util.Random;

public class RandomProgramTextFileReader implements Reader<Program<TextFile>> {
    private final static String[] NAMES = {"MS-DOS Editor", "Windows 95 Word", "Vim"};
    private final Random random;
    private final Reader<TextFile> textFileReader;


    @Override
    public Program<TextFile> read() {
        TextFile[] textFiles = new TextFile[random.nextInt(2, 8)];
        for (int i = 0; i < textFiles.length; i++) {
            textFiles[i] = textFileReader.read();
        }
        return new Program<>(
                NAMES[random.nextInt(NAMES.length)],
                textFiles
        );
    }
}
