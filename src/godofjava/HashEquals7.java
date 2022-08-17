package godofjava;

import java.util.Objects;

public class HashEquals7 {
	public String name;
	public int age;
	public int defense;
	
	public static void main(String[] args) {
	

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, defense, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashEquals7 other = (HashEquals7) obj;
		return age == other.age && defense == other.defense && Objects.equals(name, other.name);
	}

}
