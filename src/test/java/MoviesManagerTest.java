import org.example.MoviesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void testAddTwo() {
        MoviesManager manager = new MoviesManager(2);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddTen() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9", "Film10", "Film11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOne() {
        MoviesManager manager = new MoviesManager(2);

        manager.add("Film1");
        manager.add("Film2");

        String[] expected = {"Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastTen() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
