package chapter_1;

/**
 *   The U.S. Census Bureau projects population based on the
 following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
 Write a program to display the population for each of the next five years. Assume the
 current population is 312,032,486 and one year has 365 days.
 *
 *
 * By Francis Miyoba on 05/feb/2018
 */

public class exercise11 {
    /**
     * algorithm to solve this problem
     * find number of births, deaths and immigrants for each year
     * by dividing number of seconds in a year with number of seconds for birth, death and immigrants
     * for each year in the range 1 to 5 add currentPopulation to number of births + immigrants - deaths
     * @param args
     */
    public static void main (String[] args ) {
        double birthSeconds = 7.0 ;
        double deathSeconds = 13.0 ;
        double immigrantSeconds = 45.0 ;

        double currentPopulation = 312032486 ;
        // 60 seconds in a minute, 60 minutes in an hour, 24 hours in a day, 365 days in a year
        double numberOfSecondsYear = 60 * 60 * 24 * 365 ;

        double births = numberOfSecondsYear / birthSeconds ;
        double immigrants = numberOfSecondsYear / immigrantSeconds ;
        double deaths = numberOfSecondsYear / deathSeconds ;
    for (int i =1 ; i <=5 ; i++) {
        currentPopulation += births + immigrants - deaths ;

        System.out.println("Year " + i + " had " + (int)currentPopulation + " population ");
    }

    }
}
