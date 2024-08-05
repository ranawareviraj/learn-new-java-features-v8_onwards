package org.example.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Song> allSongsByGenre = getAllSongsByGenre(Songs.getSongs(), "Rock");
        System.out.println(allSongsByGenre);

        List<String> artists = getAllArtists(Songs.getSongs());
        System.out.println(artists);
    }

    /**
     * Lou’s Challenge #1: Find all the “rock” songs
     * a list of all the songs that fall under some genre of “rock.”
     */
    private static List<Song> getAllSongsByGenre(List<Song> songs, String genre) {
        return songs.stream()
                .filter(song -> song.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    /**
     * Lou’s Challenge #2: List all the genres
     * a list of all the genres of the songs that have been played.
     */
    private static List<String> getAllArtists(List<Song> songs) {
        return songs.stream()
                .map(song -> song.getArtist())
                .distinct()
                .collect(Collectors.toList());
    }
}
