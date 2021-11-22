import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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

    @Test
    @DisplayName("should not exist and be empty when removed ")
    void shouldNotExistAndBeEmptyWhenRemoved () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("should return true when add and then remove ")
    void shouldReturnTrueWhenAddAndThenRemove () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        set.remove(1);
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("should keep only one when inserting duplicates")
    void shouldKeepOnlyOneWhenInsertingDuplicates () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        set.add(1);
        assertNotEquals(set.size(), 2);
    }

    @Test
    @DisplayName("should skip deletion when empty")
    void shouldSkipDeletionWhenEmpty () {
        TDDSet<Object> set = new TDDSet<>();
        assertFalse(set.remove(1));
    }

    @Test
    @DisplayName("should skip deletion when not found")
    void shouldSkipDeletionWhenNotFound () {
        TDDSet<Object> set = new TDDSet<>();
        set.add(1);
        assertFalse(set.remove(2));
    }

    @Test
    @DisplayName("should grow when adding more than size")
    void shouldGrowWhenAddingMoreThanSize () {
        TDDSet<Object> set = new TDDSet<Object>();
        for (int i = 0; i < 12; i++) {
            set.add(i);
        }
        assertEquals(set.size(), 11);
    }
}
