import java.util.ArrayList;
public class bigInt
{
    public static void main(String[] args){
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(9);
        n1.add(9);
        n1.add(9);
        n1.add(9);
        n1.add(9);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        System.out.println(addBigInt(n1,n2));
    }
    
    public static ArrayList<Integer> addBigInt(ArrayList<Integer> n1, ArrayList<Integer> n2){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(n1.size()>n2.size()){
            for(int i = 1;i<=n2.size();i++){
                ans.add(0,n1.get(n1.size()-i) + n2.get(n2.size()-i));
            }
            for(int i = 1; i<=n1.size()-n2.size();i++){
                ans.add(0,n1.get(n1.size() - n2.size() - i));
            }
        }else{
            for(int i = 1;i<=n1.size();i++){
                ans.add(0,n1.get(n1.size()-i) + n2.get(n2.size()-i));
            }
            for(int i = 1; i<=n1.size()-n2.size();i++){
                ans.add(0,n1.get(n1.size() - n2.size() - i));
            }
        }
        for(int i = ans.size()-1;i>=1;i--){
            if(ans.get(i) >= 10){
                ans.set(i-1,ans.get(i-1) + 1);
                ans.set(i,ans.get(i)-10);
            }
        }
        if(ans.get(0)>=10){
            ans.add(0,1);
            ans.set(1,ans.get(1)-10);
        }
        return ans;
    }
}
