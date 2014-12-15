package com.androidbook.stockquoteservice.stock2;

import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable{

	private String name;
	private Date birthday;
	private Double salary;
	
	public static final Parcelable.Creator<Person> CREATOR= new Parcelable.Creator<Person>() {

		@Override
		public Person createFromParcel(Parcel source) {
			return new Person(source);
		}

		@Override
		public Person[] newArray(int size) {
			return new Person[size];
		}
		
	};
	
	public Person(){}

	public Person(Parcel in){
		readFromParcel(in);
	}
	
	@Override
	public int describeContents() {
		return 1;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeSerializable(birthday);
		dest.writeDouble(salary);
	}
	
	public void readFromParcel(Parcel in){
		name = in.readString();
		birthday = (Date)in.readSerializable();
		salary = in.readDouble();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
}
