package com.dwa.foro;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.dwa.foro.servicios.ServicioUsuario;

@Component
public class ProveedorAutenticacion implements AuthenticationProvider {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	
	@Override
	public Authentication authenticate (Authentication authentication) throws AuthenticationException
	{
		
		String usuario = authentication.getName();
		String clave = authentication.getCredentials().toString();
		HttpServletRequest request =
				((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		if(servicioUsuario.validar(usuario, clave, request.getSession())) 
		{
			return new UsernamePasswordAuthenticationToken(usuario + clave, clave, new ArrayList<>());
			
		}
		else 
		{
			throw new
			BadCredentialsException("Usuario o contraseña incorrecto.");
			
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
