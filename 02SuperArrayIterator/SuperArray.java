import java.util.*;
public class SuperArray implements Iterable<String>{
  private String[] data;
  private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;}

    public SuperArray(int initialCapacity){
	size = 0;
	data = new String[initialCapacity];}
  //0
  //constructor make an empty superArray should make size 0, 
  //but the data capacity 10.
    public String get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
	else{
	return data[index];}
    }
    
  public int size(){
    return size;}
 
  public void add(String n){
      if (size == data.length) {
	  grow();
	  data[size] = n;
	  size += 1;}
      else {data[size] = n;
	  size += 1;}}
  

  //2
/**Resize the data, by making a new array, then copying over elements, use this as your data.
*/

  private void grow(){
      String[]zel;
      zel = new String[data.length + 1];
      for (int i = 0; i < data.length; i++){
	  zel[i] = data[i];}
      data = zel;}

  //3
   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/
  public String toString(){
      String w = "[ ";
      if (size == 0){
	  return "[ ]";
      }
      else {
	  if (size == 1){
	      w += data[0]+"]" ;
	      return w;}
	  else {
	      for(int q = 0; q <= size - 2; q++){
		  w += data[q]+", " ;
	      }
	      w += data[size - 1]+"]" ;
	      return w;
	  }
      }
  }
    
    public String toStringDebug(){
	String hello = "[ ";
	for (int q = 0; q < data.length - 1; q++){
	    if(q > size - 1){
		hello += "_, ";
	    }
	    else{hello += data[q]+", ";}}
	if (size == data.length){
	    hello += data[size - 1]+"]";
	    return hello;}
	else{
	    hello += "_]";
	    return hello;}
    }
    
	public void clear(){
	size = 0;
    }
    
    public boolean isEmpty(){
	return (size == 0);
    }
    
    public String set(int index, String element){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
	else{
	String karma = data[index];
	data[index] = element;
	return karma;}
    }
    
    
    
    public String remove(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
	else{
	String zel = data[index];
	for(int i = index; i < size - 1; i++) {
	    data[i] = data[i + 1];}
	size -= 1;
        return zel;}
    }
    
    public String[] toArray(){
	String[]hisui;
	hisui = new String[size];
	for(int i = 0; i < size; i++) {
	    hisui[i] = data[i];}
	return hisui;
    }
    
    public int indexOf(String i){
	int zel = -1;
	for (int w = size - 1; w >= 0; w--){
	    if (data[w] == i) {
		zel = w;}}
	return zel;}
    
    public int lastIndexOf(String i){
	int zel = -1;
	for (int w = 0; w < size ; w++){
	    if (data[w] == i) {
		zel = w;}}
	return zel;}

    public void add(int index, String element){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();}
	else {
	    for (int i = size(); i > index; i--){
		if (size() == data.length){
		    grow();
		    data[i] = data[i - 1];}
		else {
		    data[i] = data[i - 1];}}
	    data[index] = element;
	    size += 1;
	    }
    }

    public String[] data(){
	return data;
    }

    public Iterator<String> iterator(){
	return new SuperArrayIterator(this);
	




    }
	    }


	   
	
     
	
	    
    
	
    
	      
		  
	  
     
    

