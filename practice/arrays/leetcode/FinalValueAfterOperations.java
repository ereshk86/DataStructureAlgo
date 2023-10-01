public class FinalValueAfterOperations {
	public static void main(String[] args) {
		String ops[] = {"--X","X++","X++"};
		int result = finalValueAfterOperations(ops);
		System.out.println(result);
	}
	public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                x = x+1;
            }
            if(operations[i].equals("X--") || operations[i].equals("--X")){
                x = x-1;
            }
        }
        return x;
    }
}
