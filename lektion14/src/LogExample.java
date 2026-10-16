import java.util.*;
import java.util.random.*;

import org.slf4j.*;

public class LogExample {
    static final Logger logger = LoggerFactory.getLogger(LogExample.class);

    public static void main() {
        int someData = 3;
        logger.debug("Detta är debuginfo");
        logger.info("Detta är bra information");
        logger.warn("Detta är en varning med data: {}", someData);

        try {
            processOrder();
        } catch (RuntimeException ex) {
            logger.error("Something went wrong.", ex);
        }
    }

    private static void processOrder() {
        validateOrderItems();
    }

    private static void validateOrderItems() {
        calculateOrderTotal();
    }

    private static void calculateOrderTotal() {
        computeItemPrice();
    }

    private static int computeItemPrice() {
        int[] array = { 1, 0 };
        List<Integer> list = new LinkedList<>(List.of(1, 2, 3));
        int random = RandomGenerator.getDefault().nextInt(4);
        return list.get(random) + 1234 / array[random] / random;
    }
}
