package oauth2.servlet.github;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OauthClientServlet
 */
public class OauthClientServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
     
	private static final String CONTENT_TYPE = "text/html; charset=windows-1252";
	
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        
        String token = HttpService.getGitHubToken(code);
        
        GitHubUser user = HttpService.getGitHubUser(token);
        
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>OauthClientServlet</title></head>");
        out.println("<body>");
        out.println("<p>Current user:</p>");
        out.println("<table>");
        out.println("<tr><td>login:</td><td>" + user.getLogin() + "</td></tr>");
        out.println("<tr><td>id:</td><td>" + user.getId() + "</td></tr>");
        out.println("<tr><td>node_id:</td><td>" + user.getNodeId() + "</td></tr>");
        out.println("<tr><td>avatar_url:</td><td>" + user.getAvatarUrl() + "</td></tr>");
        out.println("<tr><td>url:</td><td>" + user.getUrl() + "</td></tr>");
        out.println("<tr><td>html_url:</td><td>" + user.getHtmlUrl() + "</td></tr>");
        out.println("<tr><td>followers_url:</td><td>" + user.getFollowersUrl() + "</td></tr>");
        out.println("<tr><td>following_url:</td><td>" + user.getFollowingUrl() + "</td></tr>");
        out.println("<tr><td>gists_url:</td><td>" + user.getGistsUrl() + "</td></tr>");
        out.println("<tr><td>starred_url:</td><td>" + user.getStarredUrl() + "</td></tr>");
        out.println("<tr><td>subscriptions_url:</td><td>" + user.getSubscriptionsUrl() + "</td></tr>");
        out.println("<tr><td>organizations_url:</td><td>" + user.getOrganizationsUrl() + "</td></tr>");
        out.println("<tr><td>repos_url:</td><td>" + user.getReposUrl() + "</td></tr>");
        out.println("<tr><td>events_url:</td><td>" + user.getEventsUrl() + "</td></tr>");
        out.println("<tr><td>received_events_url:</td><td>" + user.getReceivedEventsUrl() + "</td></tr>");
        out.println("<tr><td>type:</td><td>" + user.getType() + "</td></tr>");
        out.println("<tr><td>site_admin:</td><td>" + user.getSiteAdmin() + "</td></tr>");
        out.println("<tr><td>name:</td><td>" + user.getName() + "</td></tr>");
        out.println("<tr><td>company:</td><td>" + user.getCompany() + "</td></tr>");
        out.println("<tr><td>blog:</td><td>" + user.getBlog() + "</td></tr>");
        out.println("<tr><td>location:</td><td>" + user.getLocation() + "</td></tr>");
        out.println("<tr><td>email:</td><td>" + user.getEmail() + "</td></tr>");
        out.println("<tr><td>hireable:</td><td>" + user.getHireable() + "</td></tr>");
        out.println("<tr><td>bio:</td><td>" + user.getBio() + "</td></tr>");
        out.println("<tr><td>public_repos:</td><td>" + user.getPublicRepos() + "</td></tr>");
        out.println("<tr><td>public_gists:</td><td>" + user.getPublicGists() + "</td></tr>");
        out.println("<tr><td>followers:</td><td>" + user.getFollowers() + "</td></tr>");
        out.println("<tr><td>following:</td><td>" + user.getFollowing() + "</td></tr>");
        out.println("<tr><td>created_at:</td><td>" + new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(user.getCreatedAt()) + "</td></tr>");
        out.println("<tr><td>created_at:</td><td>" + new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(user.getUpdatedAt()) + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
        out.close();
    }

}
