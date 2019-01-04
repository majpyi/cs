public class Demo {
    public static void main(String[] args) {
        String x = "c:\\a\\a.txt";
//        int lastindex = x.lastIndexOf("\\");
//        System.out.println(lastindex);
        int hcode = x.hashCode();
        System.out.println(hcode);
        System.out.println(0xF);
    }
}
