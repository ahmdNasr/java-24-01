public class MultiDimensionaleArrays {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
  


    // ####
    // #  #
    // ####
    public static void main(String[] args) {
        int[][] monitor = {
            { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 3, 3, 3, 4, 3, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 3, 4, 3, 3, 3, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 1 },
        };
        

        // printDisplay(monitor);
        
        int[][] pic = {
            { 1, 0 },
            { 1, 0 },
        };
        monitor = draw(monitor, pic, 3, 2);
            
        int[][] actor = {
            { 0, 0, 1, 1, 1, 0},
            { 0, 0, 1, 1, 1, 0},
            { 0, 0, 0, 1, 0, 0},
            { 0, 1, 1, 1, 1, 1},
            { 0, 1, 0, 1, 0, 1},
            { 0, 0, 0, 1, 0, 0},
            { 0, 0, 1, 1, 1, 0},
            { 0, 0, 1, 0, 1, 0}};
        monitor = draw(monitor, actor, 1, 1);

        printDisplay(monitor);


        System.out.println(hasBorder(monitor)); // true

        monitor[2][3] = 0;
        System.out.println(hasBorder(monitor)); // false
        // int [][] monitor2 = new int[3][4];
        // monitor[0][0] = 1; 
        // monitor[0][1] = 1;
        // // ... 
        // monitor[1][1] = 0; 

        // 0 = Schwarz --- 1-4 Weiß
        // 1 = rot
        // 2 = grün
        // 3 = blau
        // 4 = weiß
        // int[][] display
    }

    public static int[][] draw(int[][] canvas, int[][] pic, int row, int col) {
        int rowBoundry = Math.min(canvas.length, row + pic.length);
        int colBoundry = Math.min(canvas[0].length, col + pic[0].length);
        for(int rowIndex = row; rowIndex < rowBoundry; rowIndex++) {
            for(int colIndex = col; colIndex < colBoundry; colIndex++) {
                // simple: canvas[rowIndex][colIndex] = pic[rowIndex - row][colIndex - col] 
                canvas[rowIndex][colIndex] += pic[rowIndex - row][colIndex - col];
                canvas[rowIndex][colIndex] %= 5;
            }
        }
        return canvas;
    }

    public static void printDisplay(int[][] display){
        for (int y = 0; y < display.length; y++) {
            for (int x = 0; x < display[y].length; x++){
                switch (display[y][x]) {
                    case 1 :
                    System.out.print(ANSI_BLACK_BACKGROUND + " " + ANSI_RESET );
                    break;
                    case 2 :
                    System.out.print(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET );
                    break;
                    case 3 :
                    System.out.print(ANSI_GREEN_BACKGROUND + " " + ANSI_RESET );
                    break;
                    case 4 :
                    System.out.print(ANSI_RED_BACKGROUND + " " + ANSI_RESET );
                    break;
                    case 5 :
                    System.out.print(ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET );
                    break;
                    default : 
                    System.out.print(ANSI_WHITE_BACKGROUND + " " + ANSI_RESET );

                }
            }
                
            System.out.println("");
        }
    }



    // jeder pixel hat entweder eine 1 oder eine 0
    // 1 = '#' (weiß)
    // 0 = ' ' (schwarz)
    // Beispiel: int[][] display = {
    //     { 1, 1, 1, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 1, 1, 1 },
    // }
    public static void printDisplayBlackAndWhite(int[][] display) {
        for(int row = 0; row < display.length; row ++) {
            for(int col = 0; col < display[0].length; col ++) {
                if(display[row][col] == 1) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // int[][] monitor = {
    //     { 1, 1, 1, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 0, 0, 1 },
    //     { 1, 1, 1, 1 },
    // }
    public static boolean hasBorder(int[][] display) {
        int zeilen = display.length;
        int spalten = display[0].length;

        int[] ersteZeile = display[0];
        for(int i = 0; i < spalten; i++) {
            if(ersteZeile[i] != 1) return false; 
        }

        int[] letzteZeile = display[display.length -1];
        for(int i = 0; i < spalten; i++) {
            if(letzteZeile[i] != 1) return false; 
        }

        for(int i=1; i < zeilen -1; i++) {
            if(display[i][0] != 1 || display[i][spalten - 1] != 1) return false;
        }

        return true;
    }

    // public static void mainArrayReview(String[] args) {
    //     int[] zahlen = { 1, 2, 3 };
    //     // zahlen[0]
    //     // zahlen[1]
    //     // zahlen[2]
    //     // zahlen[3] // index out of bounds exception
    //     int[] zahlen2 = new int[10];

    //     String[] texte = { "Hallo", " ", "Welt", "!" };
    //     String[] texte2 = new String[4];
    //     texte2[0] = "Hallo";
    //     texte2[1] = " ";
    //     texte2[2] = "Welt";
    //     texte2[3] = "!";
    // }
}
