package bg.softuni.pathfinder.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class IpBlackListInterceptor implements HandlerInterceptor {
    private List<String> blackListedIpAddresses = new ArrayList<>();

    public IpBlackListInterceptor() {
        blackListedIpAddresses.add("0.0.0.1.1.1.1");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ipAddress = request.getRemoteAddr();
        System.out.println(ipAddress);
        if (blackListedIpAddresses.contains(ipAddress)) {
            response.sendRedirect("/error");
        }
        return true;
    }
}
