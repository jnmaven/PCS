package nieldw.parental.control.stubs;

import nieldw.parental.control.ParentalControlService;

import java.util.Map;

public class AcceptanceTestParentalControlServiceClient {

    private ParentalControlService parentalControlService;
    private Map<String, String> movieNameToIdMap;
    private String preferredLevel;
    private boolean allowWatching;

    public AcceptanceTestParentalControlServiceClient(
            Map<String, String> movieNameToIdMap,
            String preferredLevel,
            ParentalControlService parentalControlService) {

        this.movieNameToIdMap = movieNameToIdMap;
        this.preferredLevel = preferredLevel;
        this.parentalControlService = parentalControlService;
    }

    public void requestToWatchMovie(String name) {
        allowWatching = parentalControlService.isAllowedToWatchMovie(preferredLevel, movieNameToIdMap.get(name), null);
    }

    public boolean isAllowedWatchingMovie() {
        return allowWatching;
    }
}
