package com.zhongcw.shop.shared.po;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(length = 50)
	private String id; //

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
	private Date createTime; //

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_time")
	private Date lastUpdateTime; //

	public BaseEntity()
	{
		this.createTime = new Date();
		this.id = UUID.randomUUID().toString();
		this.lastUpdateTime = new Date();
	}

}