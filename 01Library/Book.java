class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book(){}

    public Book(String A, String T, String I){
	author = A;
        title = T;
	ISBN = I;
    }

    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }

    public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String A){
	author = A;
    }

    public void setTitle(String A){
	title = A;
    }

    public void setISBN(String A){
	ISBN = A;
    }

    public String toString(){
	String a = "Author is "+this.author+"\nTitle is "+this.title+"\nISBN is "+this.ISBN+"";
	return a;
    }
}
