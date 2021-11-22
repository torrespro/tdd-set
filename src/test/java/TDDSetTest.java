import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDDSetTest {

    @Test
    @DisplayName("should return true if empty")
    void shouldReturnTrueIfEmpty () {
        TDDSet<Object> set = new TDDSet<Object>();
        assertTrue(set.isEmpty());
    }

}
