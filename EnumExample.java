/*
* This program uses enum to display
* the positions of a planet.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-04
*/

import java.util.Scanner;

final class EnumExample {
    private EnumExample() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    enum PlanetData {
        /** First planet is Mercury. */
        Mercury("1st"),
        /** Second planet is Venus. */
        Venus("2nd"),
        /** Third planet is Earth. */
        Earth("3rd"),
        /** Fourth planet is Mars. */
        Mars("4th"),
        /** Fifth planet is Jupiter. */
        Jupiter("5th"),
        /** Sixth planet is Saturn. */
        Saturn("6th"),
        /** Seventh planet is Uranus. */
        Uranus("7th"),
        /** Eighth planet is Neptune. */
        Neptune("8th"),
        /** Ninth planet is Pluto. */
        Pluto("9th");

        /** Planet position. */
        private String position;

        PlanetData(final String place) {
            position = place;
        }
        String showPosition() {
            // return the planet's positions
            return position;
        }
    }

    public static void main(final String[] args) {
        PlanetData planetName;

        System.out.println("This program figures out the "
                           + "position of a planet.");
        // input
        Scanner planetScanner = new Scanner(System.in);
        System.out.println("Enter the planet's name: ");

        String userPlanet = planetScanner.nextLine();

        try {
            // check if user input is in the enum
            planetName = PlanetData.valueOf(userPlanet);
            // output
            System.out.println("\n" + planetName + " is the "
                               + planetName.showPosition()
                               + " planet in our solar system.");

        } catch (Exception ex) {
            System.err.print("\nThis is not the proper name for a planet");
        }
    }
}
