import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDDSetTest {

    @Test
    @DisplayName("should return true if empty")
    void shouldReturnTrueIfEmpty () {
        TDDSet<Object> set = new TDDSet<>();
        assertTrue(set.isEmpty());
    }
    
    @Test
    @DisplayName("should return false if not empty")
    void shouldReturnFalseIfNotEmpty () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        assertFalse(set.isEmpty());
    }

}
