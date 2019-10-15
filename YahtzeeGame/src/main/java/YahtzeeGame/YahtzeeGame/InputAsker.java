package YahtzeeGame.YahtzeeGame;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputAsker {
	private Scanner scanner;
	private PrintStream printer;
	
	public InputAsker(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        printer = out;
    }

    public String ask(String message) {
        printer.println(message);
        return scanner.nextLine();
    }
}
