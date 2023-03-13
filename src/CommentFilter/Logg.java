package CommentFilter;


import java.util.logging.*;


public class Logg {



    public static void main(String[] args) {

    }


    private static void configureLogging() {

        Logger LOGGER1 = Logger.getLogger("org.stepik.java.logging.ClassA");
        LOGGER1.setLevel(Level.ALL);
        Logger LOGGER2 = Logger.getLogger("org.stepik.java.logging.ClassB");
        LOGGER2.setLevel(Level.WARNING);
        Logger LOGGER3 = Logger.getLogger("org.stepik.java");
        LOGGER3.setUseParentHandlers(false);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.OFF);
        LOGGER3.addHandler(consoleHandler);
        XMLFormatter xmlFormatter = new XMLFormatter();
        consoleHandler.setFormatter(xmlFormatter);
    }

}
class ClassA {

}
class ClassB {

}


