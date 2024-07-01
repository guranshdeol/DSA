public class ShortestDistance{

    public static float displacement(String str){
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'N') {
                y++;
            }
            else if (ch == 'S') {
                y--;
            }
            else if (ch == 'W') {
                x--;
            }
            else if(ch == 'E'){
                x++;
            }

        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(displacement(str));
    }
}