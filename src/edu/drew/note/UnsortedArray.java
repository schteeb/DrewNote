package edu.drew.note;

public class UnsortedArray<T> implements NoteCollection {
private Note [] s;
private int numEntries;
public UnsortedArray(){
	 s = new Note[numEntries];
	 numEntries = 0;
	
	 
	
}
public boolean add(Note newNote) {
	if(isEmpty()){
	s [numEntries] = newNote;
	numEntries ++;
	
	return true;
}
	return false;
}
public Note lookup(long ID) {
	// TODO Auto-generated method stub
	return null;
}
public boolean remove(long ID) {
	// TODO Auto-generated method stub
	return false;
}
public boolean remove(Note note) {
	// TODO Auto-generated method stub
	for(int i = 0; i< numEntries; i ++){
		if(s[i].equals(note)){
			s[i] = s[numEntries -1];
			numEntries--;
			s[numEntries] = null;
			return true;
		}
			
	}
	return false;
}
public boolean isEmpty() {
	
	return numEntries == 0;
}
public int getSize() {
	// TODO Auto-generated method stub
	return numEntries;
}
public boolean contains(Note note) {
	// TODO Auto-generated method stub
	boolean found = false;
	int i = 0;
	while(!found && (i < s.length))
	{
		if(note.equals(s[i]))
			found = true;
		    i++;
	}
	return found;
	
}
public boolean contains(long ID) {
	// TODO Auto-generated method stub
	
	return false;
}
public Note[] toArray() {
	// TODO Auto-generated method stub
	Note[] result = (Note[]) new Object[numEntries];
	for(int i= 0; i < numEntries; i++)
		result[i] = s[i];
	return result;
	
}

	
}
