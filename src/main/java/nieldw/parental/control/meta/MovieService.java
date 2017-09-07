package nieldw.parental.control.meta;

public interface MovieService {
    String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException;
}