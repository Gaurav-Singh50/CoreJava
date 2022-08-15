package com.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class UserDetails implements Externalizable
{

	private String id,pass,name,email,phone;
	private long adharno;
	
	
	
	public long getAdharno() {
		return adharno;
	}

	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeLong(adharno);
		out.writeObject(id);
		out.writeObject(pass);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

			//downcasting
			pass=(String)in.readObject();
			adharno=in.readLong();
			id=(String)in.readObject();
		
	}
	
	
	

}
