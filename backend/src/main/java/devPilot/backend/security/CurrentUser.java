package devPilot.backend.security;


import devPilot.backend.exceptions.Unauthorizedexception;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CurrentUser {
    public AppUserPrincipal require(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth == null || !(auth.getPrincipal() instanceof AppUserPrincipal principal)){
            throw new Unauthorizedexception("Not authenticated");
        }
        return principal;
    }


}
