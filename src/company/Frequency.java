package company;

import java.util.ArrayList;
import java.util.List;

public class Frequency {
	
	private Character name;
	private List<Integer> list = new ArrayList<>();
	
	public Frequency(Character name, List<Integer> list){
		this.name = name;
		this.list = list;
	}
	
	
	public Character getName() {
		return name;
	}


	public void setName(Character name) {
		this.name = name;
	}


	public List<Integer> getList() {
		return list;
	}


	public void setList(List<Integer> list) {
		this.list = list;
	}


	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
	           return false;
	       }
	       if (getClass() != obj.getClass()) {
	           return false;
	       }
	       final Frequency other = (Frequency) obj;
	       if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
	    hash = 47 * hash + this.name;
		return hash;
	}
}
