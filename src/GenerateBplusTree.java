import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class GenerateBplusTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateBplusTree tree1 = new GenerateBplusTree();
		
		int order =4;
		
        try {
            String value = readUserInput();
            
            if(isNumeric(value)){
            	System.out.println("you type in " + value);
            	order=Integer.parseInt(value);
            	}
            
            else{System.out.println("please type in an int number ");}
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    	tree1.generate(order);
    	
		BPlusTree myTree = new BPlusTree(); 
		myTree.insert(1, "1");
		myTree.insert(2, "2");
		myTree.insert(3, "3");
		myTree.insert(4, "4");
		myTree.insert(5, "5");
		myTree.insert(6, "6");
		myTree.insert(7, "7");
		myTree.insert(8, "8");
		myTree.insert(9, "9");
		myTree.insert(10, "10");
		myTree.insert(11, "11");
		myTree.insert(12, "12");
		myTree.insert(13, "13");
		myTree.insert(14, "14");


		Utils.printTree(myTree);

	}
	
	public static boolean isNumeric(String str){
		  for (int i = str.length();--i>=0;){  
		   if (!Character.isDigit(str.charAt(i))){
		    return false;
		   }
		  }
		  return true;
	}
	
    private static String readUserInput() throws IOException {
        InputStreamReader is_reader = new InputStreamReader(System.in);
        return new BufferedReader(is_reader).readLine();
    }
	
	private void generate(int m){
		System.out.print(3*m+"\n"+4*m+"\n");
	}

}
