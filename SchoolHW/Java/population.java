public class population {
    public static void main(String[] args) {
        int currentPopulation = 312032486;

        int secondsYear = 365 * 24 + 60 + 60;
        int birthRate = 7;
        int deathRate = 13;
        int migrantRate = 45;

        int yearlyBirths = secondsYear / birthRate;
        int yearlyDeaths = secondsYear / deathRate;
        int yearlyMigrants = secondsYear / migrantRate;
        // substracting the deaths out and doing a for loop for the 5 years
        for (int i = 1; i <= 5; i++) {
            currentPopulation += yearlyBirths + yearlyMigrants - yearlyDeaths;
            System.out.println("Year" + i + "Population is " + currentPopulation);

        }


    }
}