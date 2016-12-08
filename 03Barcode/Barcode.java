public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    public Barcode(String zip){
	if (zip.length() != 5){
	    System.out.println("Zip code has to be 5 digits");
	}
	else{
	    _zip = zip;
	    try{
	    _checkDigit = checkSum();
	    }catch (NumberFormatException e){
		System.out.println("Zip code has to be made up of digits");
	    }
	}
	}
    

    public Barcode clone(){
	Barcode a = new Barcode(this._zip);
	return a;    
    }

    private int checkSum(){

	    int i = 0;
	    for (int q = 0; q < _zip.length(); q++){
		i += Integer.parseInt(String.valueOf(_zip.charAt(q))) % 10;
	    }
	    i = i % 10;
	    return i;
		
	    
	    
    }

    public String toString(){
	String zel = "|";
        String z = _zip + _checkDigit;
	int a = 0;
	for (int q = 0; q < z.length(); q++){
	    a = Integer.parseInt(String.valueOf(z.charAt(q)));
	    if (a == 1){
		zel += ":::||";}
	    else if (a == 2){
	    
		zel += "::|:|";}
	    else if (a == 3) {
		zel += "::||:";}
	    else if (a == 4){
		zel += ":|::|";}
	    else if (a == 5){
		zel += ":|:|:";}
	    else if (a == 6){
		zel += ":||::";}
	    else if (a == 7){
		zel += "|:::|";}
	    else if (a == 8){
		zel += "|::|:";}
	    else if (a == 9){
		zel += "|:|::";}
	    else if (a == 0){
		zel += "||:::";
	    }
	}
	zel += "|";
	return zel;
    }

    public int compareTo(Barcode other){
	int a = Integer.parseInt(_zip + _checkDigit);
	int b = Integer.parseInt(other._zip + other._checkDigit);
	if (a == b){
	    return 0;
	}else if(a > b){
	    return 1;
	}else{return -1;
	}
    }
    public static void main(String[]args){
	Barcode f = new Barcode("08451");
	System.out.println(f._checkDigit);
        
	System.out.println(f);
    }

}


	    

    



      









