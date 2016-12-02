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
	return ((this.callNumber).compareTo(a.callNumber));
        
	
    }

    public String toString(){
	String a = "Author is "+getAuthor()+"\nTitle is "+getTitle()+"\nISBN is "+getISBN()+"\nCall Number is "+getCallNumber()+"\n"+circulationStatus()+"";
	return a;
    }
}
	
	
