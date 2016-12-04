import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
    private SuperArray x;
    private int now;

    public SuperArrayIterator(SuperArray y){
	x = y;
	now = 0;
    }

    public boolean hasNext(){
	return now < x.size();
    }

    public String next(){
	if(hasNext()){
	    now++;
	    return (x.data())[now - 1];
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
       
