import java.util.*;

public class ArrangeVowel{
    static int factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next().toLowerCase();
        int result;
        char[] ch = str.toCharArray();

        int consonants=0, voweles=0;

        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                voweles = voweles+1;
            else 
                consonants = consonants+1;

            hs.add(ch[i]);
        }

        result = (factorial(consonants+1)*factorial(voweles));

        Map<Character,Integer> tm = new TreeMap<>();

        for(char c : hs){
            int sum=0;
            for(int i=0;i<ch.length;i++){
                if(c==ch[i])
                    sum = sum+1;
            }
            tm.put(c,sum);
        }
        
        for(char c : hs){
            Integer count = tm.get(c);
            if(count > 1){
                result = result/(factorial(count));
            }
        }

        System.out.println(result);
        
    }
}