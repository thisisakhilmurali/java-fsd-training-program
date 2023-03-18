import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Streaming primeMusic = new Streaming("WE2344EDF343", "Amazon Prime Music", "Maryland");
        Streaming netflix = new Streaming("WE543EDF123", "Netflix", "Virgina");
        Streaming spotify = new Streaming("WE547EDF439", "Spotify", "Manhattan");
        Streaming disneyPlus = new Streaming("WE677EDF839", "Disney Plus", "Queens");

        // serialization example
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("streaming_data");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(primeMusic);
            objectOutputStream.writeObject(netflix);
            objectOutputStream.writeObject(spotify);
            objectOutputStream.writeObject(disneyPlus);

            objectOutputStream.flush();
            objectOutputStream.close();

            System.out.println("\nSuccessfully converted to byte-stream\n");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // deserialization example
        try {

            FileInputStream fileInputStream = new FileInputStream("streaming_data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Streaming streaming_platform_1 = (Streaming) objectInputStream.readObject();
            Streaming streaming_platform_2 = (Streaming) objectInputStream.readObject();
            Streaming streaming_platform_3 = (Streaming) objectInputStream.readObject();
            Streaming streaming_platform_4 = (Streaming) objectInputStream.readObject();

            System.out.println("Streaming Platform 1: " + streaming_platform_1.getStreamingMedia());
            System.out.println("Streaming Platform 2: " + streaming_platform_2.getStreamingMedia());
            System.out.println("Streaming Platform 3: " + streaming_platform_3.getStreamingMedia());
            System.out.println("Streaming Platform 4: " + streaming_platform_4.getStreamingMedia());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}