package nieldw.parental.control;

/**
 * A simple callback to the client of {@link ParentalControlService} to display extra information.
 */
public interface AdditionalMessageCallback {
    void showMessage(String message);
}
