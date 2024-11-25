package co.edu.ue.BlackList.domain;

import java.util.List;

public interface BlackListService {
    
    
    List<BlackList> listar();

    BlackList listarId(int id);

    BlackList add(BlackList p);

    BlackList edit(BlackList p);

    BlackList delete(int id);
    
    
    
    
    
}
