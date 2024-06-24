public class practise13 {
    public static void main(String[] args) {
        String line = "Hello! My name is Sharmila and i love java";
        String myline = "Hello! My name  is Sharmila and   i love java";
        System.out.println(myline);
        String correctline = myline.replace("   ", " ");
        System.out.println(correctline);
        String correctedline = correctline.replace("  ", " ");
        System.out.println(correctedline);
        System.out.println(line);
    }
}
