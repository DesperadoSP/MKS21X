class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    public CirculatingBook(String a, String t, String i, String c){
	super(a, t, i, c);
	currentHolder = null;
	dueDate = null;
    }

    public String getDueDate(){
	return dueDate;
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public void setDueDate(String a){
	dueDate = a;
    }

    public void setCurrentHolder(String a){
	currentHolder = a;
    }

    public void checkout(String patron, String due){
	setDueDate(due);
	setCurrentHolder(patron);
    }

    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus(){
	if (currentHolder != null && dueDate != null){
	    return "Current holder is "+getCurrentHolder()+"\nDue date is "+getDueDate()+"";}
	else{
	    return "Book is available on shelves.";
	}
    }

    public String toString(){
       String a = "Author is "+getAuthor()+"\nTitle is "+getTitle()+"\nISBN is "+getISBN()+"\nCall Number is "+getCallNumber()+"\n"+circulationStatus()+"";
	return a;
    }
}
	    
    
