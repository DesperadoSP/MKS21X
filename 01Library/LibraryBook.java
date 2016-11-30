abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	super(a, t, i);
	callNumber = c;
    }

    public String getCallNumber(){
	return callNumber;
    }
    public void setCallNumber(String a){
	callNumber = a;
    }

    abstract void checkout(String patron, String due);

    abstract void returned();

    abstract String circulationStatus();

    public int compareTo(LibraryBook a){
	int zel = 0;
	if (Integer.parseInt(this.callNumber) > Integer.parseInt(a.callNumber)){
	    zel = 1;
	}
	else{
	    if (Integer.parseInt(this.callNumber) != Integer.parseInt(a.callNumber)){
		zel = -1;
	    }}
	return zel;
    }

    public String toString(){
	String a = "Author is "+getAuthor()+"\nTitle is "+getTitle()+"\nISBN is "+getISBN()+"\nCall Number is "+getCallNumber()+"\n"+circulationStatus()+"";
	return a;
    }
}
	
	
