public class DrawCharsRevisited {
    
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        drawRect(width, height);
    }

    public static void drawRect(int width, int height) {
        for (int i = 0; i < height; i++) {
            drawLine(width, '#');
            System.out.println();
        }
    }
            
            
    public static void mainPyramid(String[] args) {
        int height = Integer.parseInt(args[0]);
        drawPyramid(height);
        // drawPyramid(height);
        // drawPyramid(height);
    }
    public static void drawPyramid(int height) {
        int offset = height - 1;
        int character = 1;

        while (offset >= 0) {
            drawLine(offset, ' ');      //     #\n    ###\n   #####
            drawLine(character, '#');
            System.out.print("\n");

            offset -= 1;
            character += 2;
        }
    }

    public static void drawLine(int length, char lineChar) {
        for(int i = 0; i < length; i++) {
            System.out.print(lineChar);
        }
    }
    public static void drawLineCut(int length, char lineChar) {
        drawLine(length, lineChar);
        System.out.println();
    }

    /*
        h=4
           #
          ###
         #####
        #######
        */
    public static void mainOld(String[] args) {
        int height = Integer.parseInt(args[0]);
        int offset = height - 1;
        int character = 1;

        while (offset >= 0) {
            for(int o = 0; o < offset; o++) {
                System.out.print(" ");
            }
            for(int c = 0; c < character; c++) {
                System.out.print("#");
            }
            System.out.print("\n");
            offset -= 1;
            character += 2;
        }

        
    }
}



