public class Content {
    public static final String content = "abcdefghijklmnopqrstuvwxyz";

    public static String getContent(int index) {
        String character = String.valueOf(content.charAt(index));
        return character;
    }

    public static boolean canPrint(int index) {
        return index < content.length();
    }
}
