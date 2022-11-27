import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Java11Features {
    
    private static void collectionToArray() {
        //convert Collection to an Array using .toArray() in java11
        List<String> list = new ArrayList<>(Arrays.asList("Karan","Suman","Pawan"));
        System.out.println(list);

        String[] strings = list.toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }

    public static void stringopr(String str){
        //repeats the string that many numbers of times as mentioned as int
        System.out.println(str.repeat(10));
        //return boolean if String is Blank.
        System.out.println(str.isBlank());
        //remove the white space at beginning of string
        System.out.println(str.stripLeading());
        //remove the white space at end of string
        System.out.println(str.stripTrailing());
        //remove the white space.
        System.out.println(str.strip());
    }

    public static void readString() throws IOException {
        String readString = Files.readString(Path.of("C://Users//gourav.jain1//OneDrive - IHS Markit//Desktop//basicnotesabcd.txt"));
        System.out.println(readString);

        Files.writeString(Path.of("C://Users//gourav.jain1//OneDrive - IHS Markit//Desktop//basicnotesabcd.txt"),"Adding Through Java11");

        boolean sameFile = Files.isSameFile(Path.of("C://Users//gourav.jain1//OneDrive - IHS Markit//Desktop//basicnotesabcd.txt"), Path.of("C://Users//gourav.jain1//OneDrive - IHS Markit//Desktop//basic notes.txt"));
        System.out.println(sameFile);
    }

    public static void patternMatch(String str){
        Predicate<String> stringPredicate = Pattern.compile("aaaa").asMatchPredicate();
        System.out.println(stringPredicate.test(str));

    }

    public static void timeUnitConversion(){
        TimeUnit minutes = TimeUnit.SECONDS;
        System.out.println(minutes.convert(Duration.ofDays(3)));

    }

    public static void main(String[] args) throws IOException {
        collectionToArray();
        stringopr("   java11   ");
        readString();
        patternMatch("aaaa");
        timeUnitConversion();

    }
    
}
