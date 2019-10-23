# oauth2-servlet-github

This is to demo how to authenticate against GitHub with OAuth2.

## How does it work?

1) index.html contains some javascript code to navigate to the GitHub OAuth2 end point.

2) Upon successful authentication, GitHub redirects to the servlet - OauthClientServlet with a "code".

3) The servlet makes a HTTP post to GitHub with the "code" and our identity.

4) GitHub returns with a "token".

5) With the "token", we can get the user information from GitHub

## Dependencies

* Apache HttpClient (https://hc.apache.org/httpcomponents-client-ga/) - To make HTTP requests from the backend.
* Jackson (https://github.com/FasterXML/jackson) - Java JSON
