package ext.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @since 11.0.2
 */
public class CollectionUtil {

    private CollectionUtil() {
    }

    /**
     * filtering List with compare parameter
     * @param <E>       attribute type
     * @param inputList filtered list
     * @param compare   filtering parameter
     * @return
     */
    public static <E> List<E> extract(List<E> inputList, E compare) {
        return inputList.stream().filter(filter -> filter.equals(compare)).collect(Collectors.toList());
    }
}
