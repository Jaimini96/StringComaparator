package hello;

import org.apache.commons.lang.StringUtils;

/**
 * @author Abhishek Jaimini
 *
 */
public class Strings {

    private String string1;
    private String string2;
    private String diffrence;
    
	public Strings() {
		super();
	}
	/**
	 * 
	 * @param temp
	 * @param string2
	 */
	public Strings(String temp, String string2) {
		// TODO Auto-generated constructor stub
	this.string1=temp;
	this.string2=string2;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}

	/**
	 * 
	 * @return
	 */
	public String getDifference(){
		if(getString1().equals(getString2())){
			return "TRUE";
		}
		else return "FALSE, Difference: " +StringUtils.difference(getString1(), getString2());
	}
	
   
}
