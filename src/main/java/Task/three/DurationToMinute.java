// Create a class called "Song" that has the following attributes: title, artist, and duration (in seconds).
// Include methods for getting and setting these attributes, as well as a method for converting the duration to minutes and seconds.

package Task.three;
public class DurationToMinute {
    public static void main(String[] args) {

        Song song = new Song();
        song.setArtist("Taylor Swift ft. Ice Spice");
        song.setTitle("Karma");
        song.setDuration(265);
        String duration = song.getDurationInMinutesAndSeconds();
        System.out.println("Song duration is: " + duration);
    }
}