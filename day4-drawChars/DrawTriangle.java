public class DrawTriangle {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        // Schleife für die zeilen (height mal)
        for (int lines = 1; lines <= height; lines++) {
            // Schleife für charachter einer zeile (lines mal)
            for (int charCounter = 0; charCounter < lines; charCounter++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    public static void mainWhile(String[] args) {
        int height = Integer.parseInt(args[0]);
        
        int lines = 1; // 1 bis height
        while (lines <= height) {

            int charCounter = 0;
            while (charCounter < lines) {
                System.out.print("#");
                charCounter++;
            }

            System.out.print("\n");
            lines++;
        }
    }
}
        
        /*
        $ java DrawTriangle 5
        #
        ##
        ###
        ####
        #####
        $
        */
