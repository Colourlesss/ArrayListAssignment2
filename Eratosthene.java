import java.util.ArrayList;
public class Eratosthene
{
    public static void main(String[] args){
        System.out.println(findPrime(10));
    }
    public static ArrayList<Integer> findPrime(int n){
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 2;i<=n;i++){
            a.add(i);
        }
        int p=2;
        while(p<a.get(a.size()-1)){
            for(int i = 0;i<a.size();i++){
                if(a.get(i)!=p && a.get(i)%p==0){
                    a.remove(i);
                    i--;
                }
            }
            for(int j = 0;j<a.size();j++){
                if(a.get(j)>p){
                    p=a.get(j);
                    break;
                }
            }
        }
        return a;
    }
}
