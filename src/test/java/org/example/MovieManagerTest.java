package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void shouldAddNewFilms() {

        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastFilms() {
        MovieManager manager = new MovieManager();

        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");

        String[] expected = {"film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastTenAddedFilm() {
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");
        manager.add("film 7");
        manager.add("film 8");
        manager.add("film 9");
        manager.add("film 10");
        manager.add("film 11");
        manager.add("film 12");
        manager.add("film 13");
        manager.add("film 14");

        String[] expected = {"film 14", "film 13", "film 12", "film 11", "film 10", "film 9", "film 8", "film 7", "film 6", "film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
