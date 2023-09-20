package com.faculdade.buspointbackend.services;

import com.faculdade.buspointbackend.dto.ResponseBase;
import com.faculdade.buspointbackend.dto.UsersDTO;
import com.faculdade.buspointbackend.dto.UsersResponseDTO;
import com.faculdade.buspointbackend.entity.UsersEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.faculdade.buspointbackend.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServices {
    private  static List<UsersEntity> listUsers;
    private final UsersRepository usersRepository;

      public UsersServices(final UsersRepository usersRepository){
          this.usersRepository = usersRepository;
          if(listUsers == null){
              listUsers = new ArrayList<>();
          }
      }


    public UsersResponseDTO createUsers(UsersDTO usersDTO) {
        BCryptPasswordEncoder criptografar = new BCryptPasswordEncoder();
        var newUser = new UsersEntity(usersDTO);

        String senhaCriptografada = criptografar.encode(newUser.getPassword());
        newUser.setPassword(senhaCriptografada);

        UsersEntity userSave = usersRepository.save(newUser);

        return new UsersResponseDTO(userSave);
    }


    public ResponseBase<List<UsersEntity>> listAllUsers(){

       this.listUsers = usersRepository.findAll();

        return new ResponseBase<List<UsersEntity>>(this.listUsers);
    }
}
