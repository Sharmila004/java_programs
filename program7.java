public class program7 {
    public static void main(String[] args) {
        String name = "Sharmila";
        System.out.println(name);
        int length = name.length();
        System.out.println(length);
        String namelower = name.toLowerCase();
        System.out.println(namelower);
        String nameupper = name.toUpperCase();
        System.out.println(nameupper);
        String trimmed = name.trim();
        System.out.println(trimmed);
        String subname = name.substring(3);
        System.out.println(subname);
        String wrngname = name.replace('h', 's');
        System.out.println(wrngname);
        Boolean starts = name.startsWith("Sha");
        System.out.println(starts);
        Boolean ends = name.endsWith("la");
        System.out.println(ends);
        Character charat = name.charAt(4);
        System.out.println(charat);
        int index = name.indexOf('a');
        System.out.println(index);
        int lastindex = name.lastIndexOf('a');
        System.out.println(lastindex);
        Boolean same = name.equals("sharmila");
        System.out.println(same);
        Boolean same1 = name.equalsIgnoreCase("sharmila");
        System.out.println(same1);
    }
}
