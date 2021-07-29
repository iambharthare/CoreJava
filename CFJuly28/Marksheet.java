package CFJuly28;

public class Marksheet implements Comparable<Marksheet> {
	private String rollNo;
	private String firstname ;
	private String lastname;
	private int physics=0;
	private int chemistry=0;
	private int maths =0;
	
	
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "Marksheet [rollNo=" + rollNo + ", firstname=" + firstname + ", lastname=" + lastname + ", physics="
				+ physics + ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}
	public boolean equals (Object o) {
		if (o==null) return false;
		if (!(o instanceof Marksheet)) return false ;
		
		Marksheet other= (Marksheet) o;
		return this.getRollNo().equals(other.getRollNo());
	}
   public int hashcode() {
	return rollNo.hashCode();
}
@Override
public int compareTo(Marksheet o) {
	return this.getRollNo().compareTo(getRollNo());
}

	

}
