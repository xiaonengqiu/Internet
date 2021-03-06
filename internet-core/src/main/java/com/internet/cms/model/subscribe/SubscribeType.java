package com.internet.cms.model.subscribe;

import java.util.List;

public class SubscribeType {
	/**
	 * 公共连接类型id
	 */
	private String id;
	/**
	 * 公共连接类型名称
	 */
	private String name;

	/**
	 * 公共连接类型创建者
	 */
	private String userId;

	/**
	 * 公共连接类型创建时间
	 */
	private String createDate;

	/**
	 * 公共连接类型最后修改时间
	 */
	private String lastmodifyDate;

	/**
	 * 最大排序id
	 */
	private Integer orderId;

	private List<Subscribe> subscribes = null;

	public SubscribeType() {
	}

	/**
	 * @param id
	 * @param name
	 * @param userId
	 * @param createDate
	 * @param lastmodifyDate
	 */
	public SubscribeType(String id, String name, String userId,
			String createDate, String lastmodifyDate) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.createDate = createDate;
		this.lastmodifyDate = lastmodifyDate;
	}

	/**
	 * @param id
	 * @param userId
	 */
	public SubscribeType(String id, String userId) {
		super();
		this.id = id;
		this.userId = userId;
	}

	/**
	 * @param userId
	 */
	public SubscribeType(String userId) {
		super();
		this.userId = userId;
	}

	/**
	 * @param id
	 * @param name
	 * @param userId
	 * @param lastmodifyDate
	 */
	public SubscribeType(String id, String name, String userId,
			String lastmodifyDate) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.lastmodifyDate = lastmodifyDate;
	}

	/**
	 * @param id
	 * @param name
	 * @param userId
	 */
	public SubscribeType(String id, String name, String userId) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getLastmodifyDate() {
		return lastmodifyDate;
	}

	public void setLastmodifyDate(String lastmodifyDate) {
		this.lastmodifyDate = lastmodifyDate;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<Subscribe> getSubscribes() {
		return subscribes;
	}

	public void setSubscribes(List<Subscribe> subscribes) {
		this.subscribes = subscribes;
	}

}
