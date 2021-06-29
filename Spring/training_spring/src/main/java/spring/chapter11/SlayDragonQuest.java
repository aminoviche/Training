/**
 *
 */
package spring.chapter11;

import java.io.PrintStream;

/**
 * @author amine Fouzi <amine.fouzi@capgemini.com>
 *
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon! DEV");
    }
}
