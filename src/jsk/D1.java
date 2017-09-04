package jsk;

/**
 * Created by Wean on 2017/8/2.
 */
public class D1 {
    public String[] findWords(String[] words) {
        String[] a=new String[]{"a","s","d","f","g","h","j","k","l"};
        String[] b=new String[]{"q","w","e","r","t","y","u","i","o","p"};
        String[] c=new String[]{"z","x","c","v","b","n","m"};
        String[] temp = new String[0];
        String d="qwertyuiop";
        String e="asdfghjkl";
        String f="zxcvbnm";
        if (d.contains(words[0])){
            int count=0;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (words[i]==b[j]){
                        count++;
                    }
                }
//                if (count==)
            }
        }else if (e.contains(words[0])){
            
        }else if (f.contains(words[0])){
            
        }
        return temp;
    }
}
