public class Sorts{
    public static String name(){
	return "06.Zhu.Edwin";
    }
   
    public static void selectionSort(int[] data){
	for (int i = 0; i < data.length; i++){
	    int z = data[i];
	    int e = 0;
	    for (int j = i; j < data.length; j++){
		if (data[j] <= z){
		    z = data[j];
		    e = j;
		}
		if(j == data.length - 1){
		    data[e] = data[i];
		}
    

	    }
	    data[i] = z;
	}
    }

    public static void insertionSort(int[]data){
        for(int i = 1; i < data.length; i++){
	    int z = data[i];
	    
	    for (int j = i; j > 0; j--){
		if (data[j] < data[j - 1]){
		    z = data[j];
		    data[j] = data[j - 1];
		    data[j - 1] = z;
	        
	       
		}
	    }
	}
    }

    public static void bubbleSort(int[]data){
        String x = "2";
        while (!"1".equals(x)){
	    x  = "1";
        for (int i = 0; i < data.length - 1; i++){
	     if (data[i] > data[i + 1]){
		x = "0";
		int z = data[i];
		data[i] = data[i + 1];
		data[i + 1] = z;
	    }
	}
    }
    }
     
	public static void main(String[]args){
	int[] q = {5675, 1446, 8975, 4, 0, 65747, 43};
	bubbleSort(q);
        for(int i : q){
	    System.out.println(i);
	}
        
        



    }
}

        

	    
        











    
