public class spcount {
 public static void main(String[] args) {
int count=0;
        String n= "#@ Hello! & How are you?";
        for (int i = 0; i < n.length(); i++) {
            char c =n.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                continue;
            }
            count++;
        }
       System.out.print("num of sp"+count);
    }
}
