
package app.musicmanager;
public class Main {
    public static void main(String[] args) {
        Lyric liric = new Lyric("lyrics.txt");
        System.out.println(liric.toString());
    }
}