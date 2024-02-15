public class LogLevels {

    private final static String TRIGGER_ERROR = ":";

    public static String message(String logLine) {
        int preMessageError = logLine.indexOf(TRIGGER_ERROR);
        if (preMessageError != -1) {
            String message = logLine.substring(preMessageError+1, logLine.length()).trim();
            return message;
        }
        else
            return logLine;
    }

    public static String logLevel(String logLine) {
        int indexIn = logLine.indexOf("[");
        int indexOut = logLine.indexOf("]", indexIn);

        if (indexIn != -1 && indexOut != -1){
            String message = logLine.substring(indexIn+1, indexOut).toLowerCase().trim();
            return message;
        }
        else
            return logLine;

    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
