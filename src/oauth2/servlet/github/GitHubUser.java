package oauth2.servlet.github;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubUser {
	private String login;
	private long id;
	
	@JsonProperty("node_id")
	private String nodeId;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;
	
	@JsonProperty("gravatar_id")
	private String gravatarId;
	private String url;
	
	@JsonProperty("html_url")
	private String htmlUrl;
	
	@JsonProperty("followers_url")
	private String followersUrl;
	
	@JsonProperty("following_url")
	private String followingUrl;
	
	@JsonProperty("gists_url")
	private String gistsUrl;
	
	@JsonProperty("starred_url")
	private String starredUrl;
	
	@JsonProperty("subscriptions_url")
	private String subscriptionsUrl;
	
	@JsonProperty("organizations_url")
	private String organizationsUrl;
	
	@JsonProperty("repos_url")
	private String reposUrl;
	
	@JsonProperty("events_url")
	private String eventsUrl;
	
	@JsonProperty("received_events_url")
	private String receivedEventsUrl;
	private String type;
	
	@JsonProperty("site_admin")
	private String siteAdmin;
	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;
	private String hireable;
	private String bio;
	
	@JsonProperty("public_repos")
	private int publicRepos;
	
	@JsonProperty("public_gists")
	private int publicGists;
	private int followers;
	private int following;
	
	@JsonProperty("created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Date createdAt;

	@JsonProperty("updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Date updatedAt;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getGravatarId() {
		return gravatarId;
	}
	public void setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHtmlUrl() {
		return htmlUrl;
	}
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
	public String getFollowersUrl() {
		return followersUrl;
	}
	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}
	public String getFollowingUrl() {
		return followingUrl;
	}
	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}
	public String getGistsUrl() {
		return gistsUrl;
	}
	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}
	public String getStarredUrl() {
		return starredUrl;
	}
	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}
	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}
	public void setSubscriptionsUrl(String subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}
	public String getOrganizationsUrl() {
		return organizationsUrl;
	}
	public void setOrganizationsUrl(String organizationsUrl) {
		this.organizationsUrl = organizationsUrl;
	}
	public String getReposUrl() {
		return reposUrl;
	}
	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}
	public String getEventsUrl() {
		return eventsUrl;
	}
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}
	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}
	public void setReceivedEventsUrl(String receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSiteAdmin() {
		return siteAdmin;
	}
	public void setSiteAdmin(String siteAdmin) {
		this.siteAdmin = siteAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHireable() {
		return hireable;
	}
	public void setHireable(String hireable) {
		this.hireable = hireable;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public int getPublicRepos() {
		return publicRepos;
	}
	public void setPublicRepos(int publicRepos) {
		this.publicRepos = publicRepos;
	}
	public int getPublicGists() {
		return publicGists;
	}
	public void setPublicGists(int publicGists) {
		this.publicGists = publicGists;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getFollowing() {
		return following;
	}
	public void setFollowing(int following) {
		this.following = following;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
