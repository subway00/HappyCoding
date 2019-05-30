public class RegularExpressionDemo {
    public static void main(String[] args) {
    String text = "abcdebcadxbc  bty cyy yyy zzz";
    
    /*String [] tokens = text.split(".bc");
    for (String token : tokens) {
        System.out.print(token +"");
    }
        System.out.println("");
        tokens = text.split("..cd");
        for (String token : tokens) {
            System.out.println(token + "");
        }
        System.out.println();
    */
    String [] tokens = text.split(" "); //取出字穿中的空格，並傳回不符合空格的文字，傳回的值給tokens 參考.
    for (String token : tokens) {
        System.out.println(token);
    }
    System.out.println(tokens.length);
    }
}
