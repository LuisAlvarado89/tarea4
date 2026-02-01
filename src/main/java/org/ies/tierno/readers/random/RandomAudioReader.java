package org.ies.tierno.readers.random;

import org.ies.tierno.models.Audio;

import java.util.Random;
@AllArgsConstructor
public class RandomAudioReader implements Reader<Audio> {
    private final static String[] PATHS = {
            "/home/luis/Music/", "/home/luis/Audio/", "/home/mikel/Music"
    };
    private final Random random;

    @Override
    public Audio read() {
        return new Audio(
                random.nextInt(1, 1000),
                PATHS[random.nextInt(PATHS.length)],
                random.nextDouble(0.1, 60.0)
        );
    }
}
