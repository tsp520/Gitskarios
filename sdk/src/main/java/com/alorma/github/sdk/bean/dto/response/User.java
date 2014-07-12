package com.alorma.github.sdk.bean.dto.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class User {

	public static final String TYPE_USER = "User"; //$NON-NLS-1$

	/**
	 * TYPE_ORG
	 */
	public static final String TYPE_ORG = "Organization"; //$NON-NLS-1$

	private boolean hireable;

	private Date createdAt;

	private int collaborators;

	private int diskUsage;

	private int followers;

	private int following;

	private int id;

	private int ownedPrivateRepos;

	private int privateGists;

	private int publicGists;

	private int publicRepos;

	private int totalPrivateRepos;

    @SerializedName("avatar_url")
	private String avatarUrl;

	private String blog;

	private String company;

	private String email;

	private String gravatarId;

	private String htmlUrl;

	private String location;

	private String login;

	private String name;

	private String type;

	private String url;

	private UserPlan plan;

	private UserPlan owner;

	/**
	 * @return hireable
	 */
	public boolean isHireable() {
		return hireable;
	}

	/**
	 * @param hireable
	 * @return this user
	 */
	public User setHireable(boolean hireable) {
		this.hireable = hireable;
		return this;
	}

	/**
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 * @return this user
	 */
	public User setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	/**
	 * @return collaborators
	 */
	public int getCollaborators() {
		return collaborators;
	}

	/**
	 * @param collaborators
	 * @return this user
	 */
	public User setCollaborators(int collaborators) {
		this.collaborators = collaborators;
		return this;
	}

	/**
	 * @return diskUsage
	 */
	public int getDiskUsage() {
		return diskUsage;
	}

	/**
	 * @param diskUsage
	 * @return this user
	 */
	public User setDiskUsage(int diskUsage) {
		this.diskUsage = diskUsage;
		return this;
	}

	/**
	 * @return followers
	 */
	public int getFollowers() {
		return followers;
	}

	/**
	 * @param followers
	 * @return this user
	 */
	public User setFollowers(int followers) {
		this.followers = followers;
		return this;
	}

	/**
	 * @return following
	 */
	public int getFollowing() {
		return following;
	}

	/**
	 * @param following
	 * @return this user
	 */
	public User setFollowing(int following) {
		this.following = following;
		return this;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this user
	 */
	public User setId(int id) {
		this.id = id;
		return this;
	}

	/**
	 * @return ownedPrivateRepos
	 */
	public int getOwnedPrivateRepos() {
		return ownedPrivateRepos;
	}

	/**
	 * @param ownedPrivateRepos
	 * @return this user
	 */
	public User setOwnedPrivateRepos(int ownedPrivateRepos) {
		this.ownedPrivateRepos = ownedPrivateRepos;
		return this;
	}

	/**
	 * @return privateGists
	 */
	public int getPrivateGists() {
		return privateGists;
	}

	/**
	 * @param privateGists
	 * @return this user
	 */
	public User setPrivateGists(int privateGists) {
		this.privateGists = privateGists;
		return this;
	}

	/**
	 * @return publicGists
	 */
	public int getPublicGists() {
		return publicGists;
	}

	/**
	 * @param publicGists
	 * @return this user
	 */
	public User setPublicGists(int publicGists) {
		this.publicGists = publicGists;
		return this;
	}

	/**
	 * @return publicRepos
	 */
	public int getPublicRepos() {
		return publicRepos;
	}

	/**
	 * @param publicRepos
	 * @return this user
	 */
	public User setPublicRepos(int publicRepos) {
		this.publicRepos = publicRepos;
		return this;
	}

	/**
	 * @return totalPrivateRepos
	 */
	public int getTotalPrivateRepos() {
		return totalPrivateRepos;
	}

	/**
	 * @param totalPrivateRepos
	 * @return this user
	 */
	public User setTotalPrivateRepos(int totalPrivateRepos) {
		this.totalPrivateRepos = totalPrivateRepos;
		return this;
	}

	/**
	 * @return avatarUrl
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}

	/**
	 * @param avatarUrl
	 * @return this user
	 */
	public User setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
		return this;
	}

	/**
	 * @return blog
	 */
	public String getBlog() {
		return blog;
	}

	/**
	 * @param blog
	 * @return this user
	 */
	public User setBlog(String blog) {
		this.blog = blog;
		return this;
	}

	/**
	 * @return company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 * @return this user
	 */
	public User setCompany(String company) {
		this.company = company;
		return this;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return this user
	 */
	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @return gravatarId
	 */
	public String getGravatarId() {
		return gravatarId;
	}

	/**
	 * @param gravatarId
	 * @return this user
	 */
	public User setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
		return this;
	}

	/**
	 * @return htmlUrl
	 */
	public String getHtmlUrl() {
		return htmlUrl;
	}

	/**
	 * @param htmlUrl
	 * @return this user
	 */
	public User setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	/**
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 * @return this user
	 */
	public User setLocation(String location) {
		this.location = location;
		return this;
	}

	/**
	 * @return login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 * @return this user
	 */
	public User setLogin(String login) {
		this.login = login;
		return this;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return this user
	 */
	public User setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 * @return this user
	 */
	public User setType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this user
	 */
	public User setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return plan
	 */
	public UserPlan getPlan() {
		return plan;
	}

	/**
	 * @param plan
	 * @return this user
	 */
	public User setPlan(UserPlan plan) {
		this.plan = plan;
		return this;
	}

    public UserPlan getOwner() {
        return owner;
    }

    public void setOwner(UserPlan owner) {
        this.owner = owner;
    }
}