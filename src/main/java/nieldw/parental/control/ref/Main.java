package nieldw.parental.control.ref;

import nieldw.parental.control.ParentalControlLevelComparator;
import nieldw.parental.control.ParentalControlService;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * The main entry point for the reference implementation.
 */
public class Main {
    public static void main(String[] args) {
        final List<String> validLevels = asList("U", "PG", "12", "15", "18");

        System.out.println("\n############################################");
        System.out.println("Available movie ids: 1, 2, 3");
        System.out.print("Valid Parental control levels:");
        validLevels.stream().map(level -> " " + level).forEach(System.out::print);
        System.out.println("\n############################################\n");

        final ParentalControlService parentalControlService =
                new ParentalControlService(new FakeMovieService(), new ParentalControlLevelComparator(validLevels));

        new CommandLineClient(System.out, System.in, parentalControlService)
                .start();
    }
}
