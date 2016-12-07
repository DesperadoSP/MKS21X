public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    public Barcode(String zip){
	if (zip.length != 5){
	    System.out.println("Zip code has to be 5 digits");
	}
	else{
	    _checkDigit = checkSum();
	    }
	}
    

    public Barcode clone(){
    }

    private int checkSum(){
	try {
	    int i = 0;
	    int j = Integer.parseInt(_zip);
	    while(j < 0 ){
		i += j % 10;
		j = j / 10;
	    }
	    i = i % 10;
	}catch(NumberFormatException e){
	    System.out.println("Zip code has to be made up of digits");
	}
    }

    public String toString(){
	String zel = "|";
        String z = _zip + _checkDigit;
	int a = 0;
	for (int q = 0; q < z.length(); q++){
	    a = Integer.parseInt(z.charAt(q));



      









