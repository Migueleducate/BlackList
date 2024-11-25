package co.edu.ue.BlackList.domain;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

@Service
public class BlackListServiceImp implements BlackListService {
    @Autowired
    private BlackListRepository repositorio;
    
    @Override
    public List<BlackList> listar(){
        return repositorio.findAll();
    }
    @Override 
    public BlackList listarId(int id) { 
        return repositorio.findById(id); 
    } 
 
    @Override 
    public BlackList add(BlackList p) { 
        return repositorio.save(p); 
    } 
 
    @Override 
    public BlackList edit(BlackList p) { 
        return repositorio.save(p); 
    } 
 
    @Override
    public BlackList delete(int id) {
        BlackList blacklist = repositorio.findById(id);
        if (blacklist != null) {
            repositorio.delete(blacklist);
        }
        return blacklist;
    }    
        
    
    
}
