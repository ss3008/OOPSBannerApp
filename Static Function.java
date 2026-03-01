public class OopsBannerApp {

    public static void main(String[] args) {
        // UC6 Goal: Use methods to populate the banner array at declaration.
        // Calling methods directly during array initialization as per UC6 requirements.
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Building the banner lines by combining method-returned patterns
        String[] bannerLines = {
            o[0] + "  " + o[0] + "  " + p[0] + "  " + s[0],
            o[1] + "  " + o[1] + "  " + p[1] + "  " + s[1],
            o[2] + "  " + o[2] + "  " + p[2] + "  " + s[2],
            o[3] + "  " + o[3] + "  " + p[3] + "  " + s[3],
            o[4] + "  " + o[4] + "  " + p[4] + "  " + s[4],
            o[5] + "  " + o[5] + "  " + p[5] + "  " + s[5],
            o[6] + "  " + o[6] + "  " + p[6] + "  " + s[6]
        };

        // Loop-Based Rendering: Using an enhanced for loop to print the banner.
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Generates the 7-line pattern for the character 'O'.
     * Returns an array of strings representing the vertical rows.
     */
    public static String[] getOPattern() {
        return new String[]{
            "  ***** ",
            " * * ",
            "* *",
            "* *",
            "* *",
            " * * ",
            "  ***** "
        };
    }

    /**
     * Generates the 7-line pattern for the character 'P'.
     */
    public static String[] getPPattern() {
        return new String[]{
            "******* ",
            "* * ",
            "* * ",
            "******* ",
            "* ",
            "* ",
            "* "
        };
    }

    /**
     * Generates the 7-line pattern for the character 'S'.
     */
    public static String[] getSPattern() {
        return new String[]{
            " ******* ",
            "* ",
            "* ",
            " ******* ",
            "        *",
            "        *",
            " ******* "
        };
    }
}