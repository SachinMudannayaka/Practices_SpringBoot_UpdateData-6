package com.updatedata.demo.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.updatedata.demo.Entity.User;
import com.updatedata.demo.ODT.Odt;
import com.updatedata.demo.Repo.Repo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class service {
@Autowired
private Repo repo;
@Autowired
private ModelMapper modelMapper;

   public Odt postUser(Odt odt){
      repo.save(modelMapper.map(odt,User.class));
       return odt;  
    } 

    public List<Odt> getAllUser(){
        List<User>allusers=repo.findAll();
        return modelMapper.map(allusers,new TypeToken<List<Odt>>(){}.getType());
    }

    public Odt updateUser(Odt odt){
     repo.save(modelMapper.map(odt,User.class));
     return odt;
    }

}
