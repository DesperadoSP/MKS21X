class ReferenceBook extends LibraryBook{
    private String collection;
    public ReferenceBook(String a, String t, String i, String c, String co){
	super(a, t, i, c);
	collection = co;
    }

    public String getCollection(){
	return collection;
    }

    public void setCollection(String co){
	collection = co;
    }

    public void checkout(String patron, String due){
	System.out.println("Reference books can not be checked out.");
    }

    public void returned(){
	System.out.println("Reference books can't be checked out, return impossible.");
    }

    public String circulationStatus(){
	return "This is a non-circulating reference book.";
    }

    public String toString(){
	String a = "Author is "+getAuthor()+"\nTitle is "+getTitle()+"\nISBN is "+getISBN()+"\nCall Number is "+getCallNumber()+"\n"+circulationStatus()+"\nCollection is from "+getCollection()+"";
	return a;
    }
}
