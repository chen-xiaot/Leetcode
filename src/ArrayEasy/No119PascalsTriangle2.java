package ArrayEasy;

import java.util.ArrayList;
import java.util.List;

public class No119PascalsTriangle2 {

	public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        
	    if (rowIndex < 0)
		    return list;

	for (int i = 0; i <= rowIndex; i++){
	    
		list.add(0, 1);
		
		for (int j = 1; j < list.size() - 1; j++) {
			list.set(j, list.get(j) + list.get(j + 1));
		}
	}
	 
	     return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
