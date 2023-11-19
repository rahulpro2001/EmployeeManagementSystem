package com.xyz.Helper;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpSession;
@Component
public class SessionManagement {

	public void removeAttributefromSession() {
		try {
			HttpSession session= ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
			session.removeAttribute("mymsg");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void removeAttributefromSessionA() {
		try {
			HttpSession session= ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
			session.removeAttribute("msg");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
