package co.edu.ue.BlackList.domain;

import java.util.List; 
import org.springframework.data.repository.Repository; 


public interface BlackListRepository extends Repository<BlackList, Integer> {
    
        List<BlackList> findAll();

    BlackList findById(int id);

    BlackList save(BlackList p);

    void delete(BlackList p);
    
}
