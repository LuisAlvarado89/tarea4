package org.ies.tierno.readers.random;

import org.ies.tierno.models.Audio;
import org.ies.tierno.models.File;
import org.ies.tierno.models.TextFile;

import java.util.Random;

public class RandomFileReader implements Reader<File> {
    private final Random random;
    private final Reader<Audio> audioReader;
    private final Reader<Image> imageReader;
    private final Reader<TextFile> textReader;

    @Override
    public File read() {
        int choice = random.nextInt(3);
        if (choice == 0) {
            return audioReader.read();
        } else if (choice == 1) {
            return imageReader.read();
        } else {
            return textReader.read();
        }
    }
}
