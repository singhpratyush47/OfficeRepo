package com.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.controller.Persons;

public class ConnectionHelper {

	Connection con;
	private final static Logger log=Logger.getLogger(ConnectionHelper.class.getName());
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		} catch (Exception e) {
         log.info("!!!!!Exception Occured!!!!!!");
		}
		return con;
	}
	
	public List<Persons> getData()
	{
	List<Persons> l=new ArrayList<Persons>();
	ResultSet rs;
	try {
		con=getConnection();
		Statement s=con.createStatement();
		String sql="select * from persons";
		rs=s.executeQuery(sql);
		while(rs.next())
		{
			Persons p=new Persons();
			p.setName(rs.getString("name"));
			p.setAge(rs.getInt("age"));
			l.add(p);
		}
	} catch (Exception e) {
		log.info("!!!!!Exception occured!!!!!!!");
	}
	return l;
	}
	
}
