package com.revature.services;


import com.revature.dao.IUserDao;
import com.revature.exceptions.PasswordIncorrectException;
import com.revature.exceptions.UsernameIncorrectException;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;
import com.revature.models.User;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class UserServiceTest {
    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("Before class");
    }
    @Before
    public void setupBeforeMethods(){
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    static IUserDao userDao;
    @InjectMocks
    static UserService userService;
    @Test
    public void registerUserTest(){
        User user = new User("John", "Dao", "manager", "john@dao.com","john","password");
        //when(iUserDao.createUser(any())).thenReturn();
        userService.registerUser(user);
        verify(userDao).createUser(any());
    }
    @Test
    public void validLoginCredentialsTest() throws UsernameOrPasswordIncorrectException{
        User user = new User("John", "Dao", "manager", "john@dao.com","john","password");
        when(userDao.getUserByUserName(any())).thenReturn(user);
        User loggedin  = userService.loginUser("john","password");
        verify(userDao).getUserByUserName(any());
        assertEquals("The Last name should be Dao","Dao",loggedin.getLastName());
        assertEquals("The user name should be john","john",loggedin.getUsername());
    }
    @Test(expected = UsernameIncorrectException.class)
    public void wrongUsernameTest() throws UsernameOrPasswordIncorrectException{
        User user = null;
        when(userDao.getUserByUserName(any())).thenReturn(user);
        userService.loginUser("","");
    }
    @Test(expected = PasswordIncorrectException.class)
    public void wrongPasswordTest() throws UsernameOrPasswordIncorrectException{
        User user = new User("John", "Dao", "manager", "john@dao.com","john","password");
        when(userDao.getUserByUserName(any())).thenReturn(user);
        userService.loginUser("john","passwor");
    }
}