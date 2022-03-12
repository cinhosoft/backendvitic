package co.com.vitic.apivitic.service;

import java.util.List;
import java.util.Optional;

import  co.com.vitic.apivitic.model.Usuario;

public interface IUsuarioService {
	public List<Usuario> findAll();
	public Optional<Usuario> findById(Long id);
	public List<Usuario> login(String username, String password);
	public Usuario save(Usuario Usuario);
	public void deleteById(Long id);
	
}
