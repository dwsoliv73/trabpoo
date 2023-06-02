package app.musicmanager;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lyric {
    
    private ArrayList<String> lyricLines;

    public Lyric(String lyricPath) {
        this.lyricLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(lyricPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                this.lyricLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public ArrayList<String> getLyricLines() {
        return lyricLines;
    }

    public void setLyricLines(ArrayList<String> lyricLines) {
        this.lyricLines = lyricLines;
    }

    public String toString() {
        String lyric = "";
        for (String line : this.lyricLines) {
            lyric += line + "\n";
        }
        return lyric;
    }
}
