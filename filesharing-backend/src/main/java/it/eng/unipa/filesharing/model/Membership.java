package it.eng.unipa.filesharing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Membership {
	
	@Id
	@SequenceGenerator(name="membership_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="membership_seq")
	private Long id;
	
	private String email;
	
	@ManyToOne
	private Bucket bucket;
	
	private boolean permissionCreate;
	private boolean permissionDelete;
	//private boolean notification;
	
	public Membership() {
		
	}
	
	public Membership(String email,Bucket bucket,boolean permissionCreate , boolean permissionDelete/*,boolean notification*/) {
		this.email = email;
		this.bucket = bucket;
		this.permissionCreate = permissionCreate;
		this.permissionDelete = permissionDelete;
		//this.notification = notification;
	}
	
	public String getEmail() {
		return email;
	}	
	
	public boolean isPermissionCreate() {
		return permissionCreate;
	}
	
	public boolean isPermissionDelete() {
		return permissionDelete;
	}
	
	public void setPermissionCreate(boolean permissionCreate) {
		this.permissionCreate = permissionCreate;
	}
	
	public void setPermissionDelete(boolean permissionDelete) {
		this.permissionDelete = permissionDelete;
	}
	
	/*public boolean isNotification() {
		return notification;
	}*/
	
	public Bucket getBucket() {
		return bucket;
	}
	

}
