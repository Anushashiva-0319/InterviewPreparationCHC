package com.example.jdbc.utility;

public class AppConstants {

	public static final String EMP_INSERT_QUERY = "INSERT INTO EMPLOYEE(eid,ename,dept) VALUES(?,?,?)";
	public static final String EMP_SELECTONE = "SELECT * FROM EMPLOYEE WHERE eid = ?";

	public static final String EMP_GETALL = "SELECT * FROM EmPLOYEE";
	public static final String EMP_UPDATE = "update employee set ename=?,dept=? where eid=?";
	public static final String EMP_DELETE = " DELETE  FROM EMPLOYEE WHERE eid=?";

	/*
	 * private static final String ADDRESS_INSERT_QUERY
	 * ="INSERT INTO ADDRESS(city ,pincode) values(?,?)"; private static final
	 * String ADDRESS_SELECTALL = "SELECT * FROM ADDRESS ";
	 */
}
