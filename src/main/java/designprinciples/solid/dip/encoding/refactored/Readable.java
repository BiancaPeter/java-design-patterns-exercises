package designprinciples.solid.dip.encoding.refactored;

import java.io.IOException;

public interface Readable {
    String read() throws IOException;
}