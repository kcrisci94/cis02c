import java.io.*;

public class ExceptionTesterApp
{
    public static void main(String[] args)
    {
        System.err.println("In main: calling Method1.");
        Method1();
        System.err.println("In main: returned from Method1.");
    }

    public static void Method1()
    {
        System.err.println("\tIn Method1: calling Method2.");

        try {
            Method2();
        }
        catch (IOException e) {
            System.err.println("\tIn Method1: returned from Method2.");
            System.err.println(e.toString());
        }
    }

    public static void Method2() throws IOException
    {
        System.err.println("\t\tIn Method2: calling Method3.");
        Method3();
        System.err.println("\t\tIn Method2: returned from Method3.");
    }

    public static void Method3() throws IOException
    {
        System.err.println("\t\t\tIn Method3: Entering.");

        RandomAccessFile in = new RandomAccessFile( "products.ran", "r");
        //Add code to throw an exception here.

        System.err.println("\t\t\tIn Method3: Exiting.");
    }
}