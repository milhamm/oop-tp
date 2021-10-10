package dev.aang.TP.TP4.arts;

import dev.aang.TP.TP4.jobs.Artist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Song {

    private String title;
    private Artist artist;
    private Date release;

    public Song(String title, Artist artist, String release) {
        try {
            setTitle(title);
            setArtist(artist);
            setRelease(new SimpleDateFormat("yyyy-MM-dd").parse(release));
        } catch (ParseException e) {
            System.out.println("Parse Error");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getRelease() {
        return  new SimpleDateFormat("dd MMMM yyyy").format(release);
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public void displayInfo() {
        try {
            LocalDate ageToRelease = new SimpleDateFormat("dd MMMM yyyy")
                    .parse(artist.getBirthdate())
                    .toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            LocalDate _release = release
                    .toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();

            System.out.printf("Title: %s\nArtist: %s\nRelease: %s\nArtist age is %d when released\n\n",
                    getTitle(),
                    getArtist().getName(),
                    getRelease(),
                    Period.between(ageToRelease, _release).getYears());
        } catch (ParseException e) {
            System.out.println("Parse Error");
        }
    }
}
