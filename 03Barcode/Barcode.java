public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    public Barcode(String zip){
	if (zip.length() != 5){
	    throw new IllegalArgumentException("Zip has to have a length of 5");
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

    public static String toCode(String z){
	Barcode t = new Barcode(z);
	String p = t.toString();
	return p.substring(6);
    }

    public static String toZip(String q){
	String b = "";
	String w = q;
	if(w.length() == 32){
	    if (w.charAt(0) == '|' && w.charAt(31) == '|'){
		w = w.substring(1, 31);
		while(w.length() > 5){
		    String x = w.substring(0, 5);
		    w = w.substring(5);
		    for (int d = 0; d < x.length(); d++){
			if (x.charAt(d) != '|' && x.charAt(d) != ':'){
			    throw new IllegalArgumentException("Non-barcode characters were used");}}
		    if (x.equals(":::||")){
			b += 1;
		    }else if (x.equals("::|:|")){
			b += 2;
		    }else if (x.equals("::||:")){
			b += 3;
		    }else if (x.equals(":|::|")){
			b += 4;
		    }else if (x.equals(":|:|:")){
			b += 5;
		    }else if (x.equals(":||::")){
			b += 6;
		    }else if (x.equals("|:::|")){
			b += 7;
		    }else if (x.equals("|::|:")){
			b += 8;
		    }else if (x.equals("|:|::")){
			b += 9;
		    }else if (x.equals("||:::")){
			b += 0;
		    }else {
			throw new IllegalArgumentException("Pattern mismatch");
		    }
		}
		Barcode h = new Barcode(b);
		int u = h._checkDigit;
		if (u == 1 && w.equals(":::||")){
		    b += u;
		}else if (u == 2 && w.equals("::|:|")){
		    b += u;
		}else if (u == 3 && w.equals("::||:")){
		    b += u;
		}else if (u == 4 && w.equals(":|::|")){
		    b += u;
		}else if (u == 5 && w.equals(":|:|:")){
		    b += u;
		}else if (u == 6 && w.equals(":||::")){
		    b += u;
		}else if (u == 7 && w.equals("|:::|")){
		    b += u;
		}else if (u == 8 && w.equals("|::|:")){
		    b += u;
		}else if (u == 9 && w.equals("|:|::")){
		    b += u;
		}else if (u == 0 && w.equals("||:::")){
		    b += u;
		}else {throw new IllegalArgumentException("CheckDigit is not correct");
		}
		return b.substring(0, 5);
	    }else {throw new IllegalArgumentException("Beginning and end are not barcodes");
	    }
	}else {throw new IllegalArgumentException("Barcode is not correct length");
	}
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
        z += zel;
      return z;
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
        Barcode a = new Barcode("02345");
        Barcode b = new Barcode("12345");
	System.out.println(a.compareTo(b));
       
    }
}


	    

    



      









