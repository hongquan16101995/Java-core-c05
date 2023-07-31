package baitap.btvn_31_07.io;

import java.util.List;

public interface IOFile<E> {
    void write(List<E> es, String path);

    List<E> read(String path);
}
