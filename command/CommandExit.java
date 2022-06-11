package command;

import element.Worker;
import java.util.TreeSet;
import tools.Speaker;

/**
 * Класс-команда exit.
 */
public class CommandExit extends Command{

    /**
     * Выходит из программы.
     */
    public CommandExit(String ... args){
        this.ready = true;
    }
    
    @Override
    public Speaker event(TreeSet<Worker> collection) {
        return new Speaker("exit");
    }
}
