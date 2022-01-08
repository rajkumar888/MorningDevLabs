package com.day9;



public class StringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		//
		// String[] strArrayDemo ={"Hello", "Welcome", "to", "Java"};
		//
		//
		// for(String str : strArrayDemo){
		// System.out.println(str);
		// }

		String[][] exceltable = { 
				{ "Ram", "Hello", "World", "Java" }, 
				{ "Text", "Test", "Computer", "Fan" },
				{ "Table", "Hero", "Mouse", "Laptop" } 
				};

		
//		exceltable.
		
		int row=exceltable.length;
//		int col=4;
		
					for(int i=0; i<row; i++){
						
						int col=exceltable[i].length;
						
							for(int j=0; j<col; j++){
								System.out.print(exceltable[i][j]+" ");
							}
							System.out.println();
					}
	}
		
	int[][] customer = new int[20][2];
		
		
	
	
	
}
