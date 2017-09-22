package com.zhongcw.shop.shared.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
// @SuppressWarnings("serial")
@Entity
@Table(name = "t_commodity")
public class Commodity extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column(name = "commodity_code")
	private String commodityCode; //

	@Column(name = "commodity_name")
	private String commodityName; //

	@Column(name = "commodity_price")
	private String commodityPrice; //

	@Column(name = "shop_code")
	private String shopCode; //

	public Commodity()
	{
	}

	public Commodity(String commodityCode)
	{
		this.commodityCode = commodityCode;
	}

}
