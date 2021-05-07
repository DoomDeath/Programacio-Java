package test;

import domain.Album;

import java.util.Date;

public class TestAlbum {

    public static void main(String[] args) {
        Date firstDate1 = new Date(1992, 10, 12);
        Album album1 = new Album("Fear of the dark", "full album", firstDate1,
                12, "EMI", "Cassette");
        Album album2 = new Album("Fear of the dark", "full album", firstDate1,
                12, "EMI", "Cassette");

        System.out.println("album1 = " + album1);
        System.out.println("album2 = " + album2);
    }
}
