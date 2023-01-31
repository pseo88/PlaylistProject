/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class playlistTester 
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Initializing playlist...");
        System.out.println();
        System.out.println("Adding songs to the playlist...");
        System.out.println();
        Playlist goodSoup = new Playlist();
        Song one = new Song("Die For You", "Joji", "3:32");
        goodSoup.addSong(one);
        System.out.println("Added \"Die For You\" by Joji (3:32)"); 
        Song two = new Song("sweet decay 부패", "Chasu", "3:20");
        goodSoup.addSong(two);
        System.out.println("Added \"sweet decay 부패\" by Chasu (3:20)");
        Song three = new Song("Nothing", "Bruno Major", "2:43");
        goodSoup.addSong(three);
        System.out.println("Added \"Nothing\" by Bruno Major (2:43)");
        Song four = new Song("last day on earth", "Tai Verdes", "2:53");
        goodSoup.addSong(four);
        System.out.println("Added \"last day on earth\" by Tai Verdes (2:53)");
        Song five = new Song("White Ferrari", "Frank Ocean", "2:57");
        goodSoup.addSong(five);
        System.out.println("Added \"Godspeed\" by Frank Ocean (2:57)");
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        goodSoup.getPlaylist();
        System.out.println();
        System.out.println("Liking \"sweet decay 부패\" and \"Godspeed\"...");
        goodSoup.likeSong(1);
        goodSoup.likeSong(4);
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        goodSoup.getPlaylist();
        System.out.println();
        System.out.println("Printing total playlist duration...");
        System.out.println();
        System.out.println(goodSoup.getTotal());
        System.out.println("Removing \"Nothing\" from the playlist...");
        goodSoup.removeSong(2);
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        goodSoup.getPlaylist();
        System.out.println();
        System.out.println("Printing only the liked songs...");
        System.out.println();
        goodSoup.getLikedSongs();
        System.out.println();
        System.out.println("Removing liked songs...");
        goodSoup.removeLiked();
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        goodSoup.getPlaylist();
    }
}
