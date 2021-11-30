package cicd.learn.tp1;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        String param = reader.readLine();

        WordCounter count = new WordCounter();
        System.out.println( "CICD rocks! " + param );
        System.out.println("Le nombre de lettre dans 'CICD rocks!' est de : " + count.counter("CICD rocks!"));
    }
}
