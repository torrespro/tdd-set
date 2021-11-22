import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    @DisplayName("should return size two when add two")
    void shouldReturnSizeTwoWhenAddTwo () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        set.add(2);
        assertEquals(2,set.size());
    }
    
    @Test
    @DisplayName("should return true when element exists")
    void shouldReturnTrueWhenElementExists () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("should return false when element doesnt exists")
    void shouldReturnFalseWhenElementDoesntExists () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        assertFalse(set.contains(2));
    }

}
