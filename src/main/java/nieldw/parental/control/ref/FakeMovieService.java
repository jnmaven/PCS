package nieldw.parental.control.ref;

import nieldw.parental.control.meta.MovieService;
import nieldw.parental.control.meta.TechnicalFailureException;
import nieldw.parental.control.meta.TitleNotFoundException;

/**
 * A fake implementation of {@link MovieService} for use in a reference implementation only.
 */
public class FakeMovieService implements MovieService {

    @Override
    public String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException {
        switch (movieId) {
            case "1":
                return "18";
            case "2":
                return "12";
            case "3":
                throw new TechnicalFailureException("Sorry, we have experience a technical failure.");
            default:
                throw new TitleNotFoundException("Sorry, we could not find the movie you are looking for.");
        }
    }
}
