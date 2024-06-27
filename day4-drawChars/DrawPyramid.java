public class DrawPyramid {
    public static void main(String[] args) {
/*
h=4
   #
  ###
 #####
#######
*/


        int height = Integer.parseInt(args[0]);
        // height = 4
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

/*
h=1
#

h=2
 #
###

h=3
  #
 ###
#####

h=4
   #
  ###
 #####
#######
*/