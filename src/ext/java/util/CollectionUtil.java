package ext.java.util;

import java.util.ArrayList;
import java.util.List;

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
        List<E> retList = new ArrayList<>();
        inputList.stream().filter(filter -> filter.equals(compare)).forEach(retList::add);
        return retList;
    }
}
