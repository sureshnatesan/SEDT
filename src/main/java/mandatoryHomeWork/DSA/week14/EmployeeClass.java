package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.Map;

public class EmployeeClass {
	public String ename;
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int eage;
	public int eid;

	EmployeeClass(String ename, int eage, int eid){
		this.ename=ename;
		this.eage=eage;
		this.eid=eid;
	}
	
	public class Employee {
		
		
		public static void main(String[] args) {
			EmployeeClass sd = new EmployeeClass("Suresh",29,35464);
			Map<Integer, EmployeeClass> map= new HashMap<>();
			
			map.put(1,new EmployeeClass("Suresh",29,35464));
		}
		
		
		
		
		
	}

}
