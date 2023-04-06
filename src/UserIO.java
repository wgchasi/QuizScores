public interface UserIO {
    /**
     * Print a given String to the console
     * @param msg the String to be printed to console
     */
    void print(String msg);

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    String readString(String prompt);

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    int readInt(String prompt);

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @param min The minimum value that user's input must fall under
     * @param max The maximum value that user's input can be
     * @return The input from user
     */
    int readInt(String prompt, int min, int max);

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    double readDouble(String prompt);

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @param min The minimum value that user's input must fall under
     * @param max The maximum value that user's input can be
     * @return The input from user
     */
    double readDouble(String prompt, double min, double max);

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    float readFloat(String prompt);

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @param min The minimum value that user's input must fall under
     * @param max The maximum value that user's input can be
     * @return The input from user
     */
    float readFloat(String prompt, float min, float max);

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    long readLong(String prompt);

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     * @param prompt The prompt to be printed to console
     * @param min The minimum value that user's input must fall under
     * @param max The maximum value that user's input can be
     * @return The input from user
     */
    long readLong(String prompt, long min, long max);
}
