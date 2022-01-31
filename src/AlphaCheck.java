import java.util.Locale;

public class AlphaCheck {
    public static boolean check(String input){
        boolean[] exist=new boolean[26];
        input=input.toLowerCase();
        for(char x:input.toCharArray()){
            if(x>='a' && x<='z'){
                exist[x-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!exist[i]){
                return false;
            }
        }
        return true;
    }
}
