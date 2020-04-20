package app;

/**
 *  
* <p><strong><em>Application Name: </em></strong>Class_Porject-Stacks_Queues</p>
 * <p><strong><em>Class Name: </em></strong>App</p>
 * 
 * <p><strong><em>Application Notes: </em></strong>none</p>
 *  
 * <p><strong><em>Class Notes: </em></strong>none</p>
 * 
 * <p><strong><em>Pre-Conditions: </em></strong>none</p>
 * 
 * <p><strong><em>Post-Conditions: </em></strong>none</p>
 * 
 * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
 * <p><strong><em>Instructor: </em></strong>Dr. Robert Walsh</p>
 * <p><strong><em>Course: </em></strong>SP20-SE-CSCI-C202-17057</p>
 * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
 * <p><strong><em>Due Date: </em></strong>04.23.2020</p>
 * 
 */

import java.time.Duration;
import java.time.Instant;

public class App {
    /**
     * 
     * <p><strong><em>Description: </em></strong>application entry point</p>
     * 
     * <p><strong><em>Method Name: </em></strong>main</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>none</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
     *
     * @param args not used
     * @throws Exception error handling 
     */
    public static void main(String[] args) throws Exception {
        
        // variables
        Instant _tStart = null;
        Instant _tEnd = null;
        Duration _tElapsed = null;

        try {

            _tStart = Instant.now();
            
            System.out.println();
            lineSeperator(80, '*');
            System.out.println();
            System.out.println("\tSTART TIME: " + _tStart);
            System.out.println();  
            lineSeperator(80, '*');

        } // end try
        catch (Exception e) {

            // error handeling so the program will terminate gracefully regardless

            System.out.println("***** ERROR *****\n");
            System.out.println(e.getMessage());

        } // end catch
        finally {
            
            lineSeperator(80, '*');

            _tEnd = Instant.now();
            _tElapsed = Duration.between(_tStart, _tEnd);

            System.out.println();
            System.out.println("\tEND TIME: " + _tEnd);
            System.out.println("\tTime for completion (milliseconds): " + _tElapsed.toMillis());
            System.out.println();

            System.out.println(">>>>>>>>>> PROGRAM TERMINATED <<<<<<<<<<\n");
            System.out.println("END OF LINE");

        } // end finally

    } // end main

    /**
    * <p><strong><em>Description: </em></strong>Displays Character N times</p>
    *
    * <p><strong><em>Method Name: </em></strong>Show</p>
    *
    * <p><strong><em>Method Notes: </em></strong>recursive display of character</p>
    *
    * <p><strong><em>Pre-Conditions: </em></strong>none</p>
    *
    * <p><strong><em>Post-Conditions: </em></strong>none</p>
    *
    * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
    * <p><strong><em>Start Date: </em></strong>03.02.2020</p>
    *
    * @param N number of times to display character
    * @param ch character to show
    */
    public static void lineSeperator(int N, char ch) {
        if(N > 1) {
            System.out.print(ch);
            lineSeperator(N - 1, ch);
        } // end if
        else { System.out.println(""); } // end else
    } // end lineSeperator
}