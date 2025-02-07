package com.admin4j.framework.security.jwt;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

/**
 * @author andanyang
 * @since 2023/5/30 14:51
 */
public interface JwtUserDetails extends UserDetails {


    //private static final long serialVersionUID = -5943535608623539244L;
    //private String password;
    //private String username;
    //private Set<GrantedAuthority> authorities;
    //private boolean accountNonExpired = true;
    //private boolean accountNonLocked = true;
    //private boolean credentialsNonExpired = true;
    //private boolean enabled = true;

    /**
     * jwt 盐
     */
    String getJwtSalt();

    /**
     * 用户ID
     */
    Long getUserId();

    boolean isAdmin();

    /**
     * 租户
     *
     * @return
     */
    default Long getTenantId() {
        return 0L;
    }

    /**
     * 登录方式
     */
    String getAuthType();

    /**
     * 权限列表
     */
    Set<String> getPermissions();

}
