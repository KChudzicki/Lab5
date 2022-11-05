public class xd {
    public static void main(String[] args) {
        float a = 14000;
        System.out.println("inwestycja początkowa: "+ a +"zł");
        a = a + (a * .4F);
        System.out.println(" wartość w pierwszym roku: "+ a +"zł" );
        a = a - 1500;
        System.out.println("wartość w drugim roku: "+ a + "zł") ;
        a = a + (a*.12F);
        System.out.println("wartość w trzecim roku: "+ a + "zł");
    }
}
