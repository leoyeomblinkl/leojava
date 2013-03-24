package c_algorithmNdatabases4java;

public class LinearSearch {
	
	class Entry {
		
		int key; // compare key
		Object data; // other info
		
		/**
		 * @param key
		 * @param data
		 */
		public Entry(int key, Object data){
			this.key = key;
			this.data =data;
			
		}
	}
	
	final static int MAX=100; // maximum numbers of data
	Entry[] table = new Entry[MAX]; //array to put data
	int n=0; // numbers of registered table
	
	 /* 
	 * @param key
	 * @param data 
	 */
	
	public void add(int key, Object data){
		if (n>= MAX) {
			System.err.println("Data Overflow");
			System.exit(1);
		}
		table[n++]= new Entry(key, data);
		
	}
	
	/*
	 * 
	 * @param key
	 * @return
	 */
	
	public Object search(int key){
		int i;
		
		i=0;                                 //(1)
											//
		while (i<n) {						//(2)
			
			if (table[i].key ==key) {		//(3)
				return(table[i].data);		//(4)
				
										//(5)
			} else {
				i++;
			}
			
		}
		return null;						//(6)
	}
}
