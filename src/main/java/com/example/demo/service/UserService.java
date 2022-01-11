package com.example.demo.service;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    UserRepository userRepository;
    
    @PersistenceContext
    EntityManager emtmp;
    
    public List<User> searchAll() {
        // ユーザーTBLの内容を全検索
        return userRepository.findAll();
    }
}