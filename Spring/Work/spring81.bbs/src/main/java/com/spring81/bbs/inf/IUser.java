package com.spring81.bbs.inf;

import java.util.List;

import com.spring81.bbs.model.ModelUser;

public interface IUser {

   int insertUser(ModelUser user);
   
   ModelUser login(String userid, String passwd);
   
   int logout(String userid);
   
   int updateUserInfo(ModelUser setValue, ModelUser whereValue);
   
   int updatePasswd(String userid, String currentPasswd, String newPasswd);
   
   int updateRetire(ModelUser user);
   
   ModelUser selectUserOne(ModelUser user);
   
   List<ModelUser> selectUserList(ModelUser user);
   
   int checkuserid(String userid); // id 중복확인
   
   //password 확인, 이유는 pw는 암호화 되기 때문.
   int checkpassword(String id, String curpw);
   
}
