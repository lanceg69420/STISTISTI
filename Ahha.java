public class Ahha {
    public static void main(String[] args) {
        String[] lyrics = {
                " ",
                " ",
                " ",
                "....Lyrics here...",
                "....Lyrics here...",
                "....Lyrics here...",
                "....Lyrics here...",
                "....Lyrics here..."

        };

        int delay = 140;
        System.out.println("");
        System.out.println("");
        RensUniverse(lyrics, delay);
        System.out.println("<3");
        System.out.println("<3");
        System.out.println("<3");
        System.out.println("<3");
    }

    private static void RensUniverse(String[] lyrics, int delay) {
        try {
            for (String line : lyrics) {
                // Clear the previous line
                System.out.print("\r");

                for (char c : line.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(delay);
                }
                // Wait for a moment before showing the next line
                Thread.sleep(delay * 10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
