public class Sorts{
    public static String name(){
	return "06.Zhu.Edwin";
    }
   
    public static void selectionSort(int[] data){
	for (int i = 0; i < data.length; i++){
	    int z = data[i];
	    for (int j = i; j < data.length; j++){
		if (data[j] <= z){
		    z = data[j];
		}
		if(j == data.length - 1){
		    data[indexOf(z)] = data[i];
		}
    

	    }
	    data[i] = z;
	}
    }

    public static void main(String[]args){
	int[] q = {5, 7, 2, 6};
	selectionSort(q);
	for(int i : q){
	    System.out.println(i);
	}


    }
}

        

	    
        











    
