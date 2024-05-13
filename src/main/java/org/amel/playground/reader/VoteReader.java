package org.amel.playground.reader;

import org.amel.playground.model.Vote;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

public class VoteReader {
    public static List<Vote> read(String resourceFile) throws FileNotFoundException {
        URL file = VoteReader.class.getResource(resourceFile);
        if (file == null) {
            throw new FileNotFoundException();
        }

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(file.toURI()))) {
            return reader.lines()
                    .map(line -> Arrays.asList(line.split(";")))
                    .map(line -> new Vote(OffsetDateTime.parse(line.get(0)), line.get(1), Boolean.parseBoolean(line.get(2))))
                    .toList();

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
