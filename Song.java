/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song 
{
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private String duration;
    private boolean liked = false;
    public Song(String myTitle, String myArtist, String myDuration)
    {
        title=myTitle;artist=myArtist;duration=myDuration;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getDuration()
    {
        return duration;
    }
    public boolean isLiked()
    {
        return liked;
    }
    public void like()
    {
        liked = true;
    }
    public void unLike()
    {
        liked = false;
    }
}