package co.edu.ue.BlackList.infraestructura;

import co.edu.ue.BlackList.domain.BlackList;
import co.edu.ue.BlackList.domain.BlackListService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 


@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController 
@RequestMapping({"/blacklist"}) 

public class BlackListRest {
    
    @Autowired
    BlackListService service;
    
            @GetMapping("/blacklist")
    public List<BlackList> listar() {
        return service.listar();
    }

    @PostMapping("/blacklist/add")
    public BlackList agregar(@RequestBody BlackList p) {
        return service.add(p);
    }

    @GetMapping("/blacklist/{id}")
    public BlackList listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/blacklist/{id}")
    public BlackList editar(@RequestBody BlackList p, @PathVariable("id") int id) {
        p.setId_blacklist(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/blacklist/{id}")
    public BlackList delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
    
    
    
}
