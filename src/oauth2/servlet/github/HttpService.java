package oauth2.servlet.github;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpService {
    
	private static final String URL_GITHUB_TOKEN = "https://github.com/login/oauth/access_token";
    private static final String URL_GITHUB_USER = "https://api.github.com/user";
    private static final String CLIENT_ID_GITHUB = "25efc3087ad22ab024df";
    private static final String CLIENT_SECRET_GITHUB = "8b436ee900f26459d8fa0d445d3e435768c28998";
    
    public static String getGitHubToken(String code) throws UnsupportedEncodingException, IOException {
        HttpPost post = new HttpPost(URL_GITHUB_TOKEN);
        
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("client_id", CLIENT_ID_GITHUB));
        urlParameters.add(new BasicNameValuePair("client_secret", CLIENT_SECRET_GITHUB));
        urlParameters.add(new BasicNameValuePair("code", code));
        
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {
            String returnString = EntityUtils.toString(response.getEntity());
            String[] returns = returnString.split("&");
            for (int i=0;i<returns.length;i++) {
                if (returns[i].startsWith("access_token")) {
                    return returns[i].substring(13);
                }
            }
            
            return null;
        }
    }
    
    public static GitHubUser getGitHubUser(String token) throws IOException {
        HttpGet request = new HttpGet(URL_GITHUB_USER);
        
        request.addHeader("accept", "application/json");
        request.addHeader(HttpHeaders.AUTHORIZATION, "token " + token);
        
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {
            String returnString = EntityUtils.toString(response.getEntity());
            System.out.println(returnString);
            
            ObjectMapper mapper = new ObjectMapper();
            GitHubUser user = mapper.readValue(returnString, GitHubUser.class);
            return user;
        }
    }
}
