package com.example.pictgram.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
@Date
public class AbstractEntity {
	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "update_at")
	private Date updateAt;

	@PrePersist
	public void onPrepersist() {
		Date date = new Date();
		setCreatedAt(date);
		setupdatedAt(date);
	}

	@PreUpdate
	public void onPreUpdate() {
		setUpdatedAt(new Date());
	}

}
