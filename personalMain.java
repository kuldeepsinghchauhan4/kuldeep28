import 
public class personalMain {
String firstName;
String lastName;
//char gender;
int phnNo;
private LocalDate studBirthDate;

enum Gender{
	M,F
}
Gender gender;
public personalMain(Gender gender) {
	this.gender=gender;
	
}
public void genderIsLike() {
	switch(gender)
	{
	case M:
		System.out.println("your gender is male");
	
    case F:
		System.out.println("your gender is female");
    Default:
    	System.out.println("no gender");
		break;
}
}
public int getPhnNo() {
	return phnNo;
}
public void setPhnNo(int phnNo) {
	this.phnNo = phnNo;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
/*public char getGender() {
	return gender;
}*/
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/*public void setGender(char gender) {
	this.gender = gender;
}*/
public static void main(String args[]) {
	personalMain p=new personalMain();
	
	//Gender g= Gender.M;
	p.setFirstName("kuldeep");
	p.setLastName("singh");
	//p.setGender('M');
	//System.out.println(g);
	System.out.println("person firstname is :"+p.getFirstName());
	System.out.println("person lastname is :"+p.getLastName());
	//System.out.println("person gender is :"+p.getGender());
}
}
