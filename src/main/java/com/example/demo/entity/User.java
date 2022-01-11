package com.example.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "user_tbl")
public class User {
//ID
    @Id
    @Column(name = "USER_ID")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String USER_ID;
//ユーザー名
    @Column(name = "USER_NAME")
    private String USER_NAME;
//ユーザーパスワード
    @Column(name = "USER_PASS")
    private String USER_PASS;
//性別
    @Column(name = "USER_SEX")
    private int USER_SEX;
//年齢
    @Column(name = "USER_AGE")
    private int USER_AGE;
//職業
    @Column(name = "USER_JOB")
    private String USER_JOB;
//メアド
    @Column(name = "USER_EMAIL")
    private String USER_EMAIL;
//自己紹介
    @Column(name = "USER_PROFILE")
    private String USER_PROFILE;
//好きなジャンル
    @Column(name = "USER_FAV")
    private String USER_FAV;
//登録日時
    @Column(name = "USER_ENTRY")
    private Date USER_ENTRY;
//ゲームアドレス
    @Column(name = "USER_GAME_ADDRESS")
    private String USER_GAME_ADDRESS;
//ログイン状況
    @Column(name = "USER_LOGIN")
    private int USER_LOGIN;
}