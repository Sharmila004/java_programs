public class practise12 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sharmila");
        System.out.println(letter);
    }
}
