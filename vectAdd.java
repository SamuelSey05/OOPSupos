class Main {
    public static int[] vectorAdd(int x, int y, int dx, int dy){
        x = x + dx;
        y = y + dy;
        int[] ans = {x,y};
        return ans;
    }
    
    public static void main(String[] args) {
        int a=0;
        int b=2;
        int[] result = vectorAdd(a,b,1,1);
        System.out.println(result[0] + " " + result[1]);
    }
}