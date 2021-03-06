package StringEasy;

public class No38CountandSay {

	public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            String prev = res;
            res = "";
            int count = 1;
            char say = prev.charAt(0);
            
            for (int j = 1; j < prev.length(); j++) {
                if (prev.charAt(j) != say) {
                    res =  res + count + say; //can not += 
                    count = 1;
                    say = prev.charAt(j);
                } else {
                    count++;
                }
            }
            res = res + count + say;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
