package app.musicmanager;
public class Song extends Music{
    private Lyric lyric;

    public Song(String title, String artist, Lyric lyric) {
        super(title, artist);
        this.lyric = lyric;
    }

    public String toString() {
        return super.toString() + "\n" + this.lyric.toString();
    }

    public Lyric getLyric() {
        return lyric;
    }

    public void setLyric(Lyric lyric) {
        this.lyric = lyric;
    }
}
