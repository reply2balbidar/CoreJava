package com.javaworld;

public class Department {

	Integer deptid;
	String name;
	public Department(Integer deptid, String name) {
		super();
		this.deptid = deptid;
		this.name = name;
	}
	
	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptid == null) ? 0 : deptid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptid == null) {
			if (other.deptid != null)
				return false;
		} else if (!deptid.equals(other.deptid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + "]";
	}
	
}
