package revature.com;
import org.junit.Before;
import org.junit.Test;
import revature.com.models.ChangeInfoUser;
import revature.com.models.LoginUsers;
import revature.com.models.RegisterUsers;
import revature.com.models.Users;
import revature.com.services.*;
import revature.com.dao.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Before
    public void setupBeforeMethods(){
        MockitoAnnotations.openMocks(this);
    }


    @Mock
    static IUserDao ud;

    @InjectMocks
    static UserService us;

    // Register

    @Test
    public void registerCreateNewUserTest(){
        // Since the registerUser is void method, it doesn't return anything
        us.registerUser(new RegisterUsers("Username", "password", "firstName", "lastName", "test@email.com", 2));

        verify(ud).registerUser(any());
    }

    @Test
    public void validLoginCredentialsTest(){
        Users user1 = new Users(1,"Username", "password", "firstName", "lastName", "test@email.com", 1);
        when(ud.getUserInfo("username")).thenReturn(user1);

        Users loggedInUser = us.loginUser("username", "password");
        verify(ud).getUserInfo("username");

        assertEquals(user1, loggedInUser);

    }

    //
    @Test
    public void getUserInfoTest(){
        Users expectedUser = new Users(3,"Username", "password", "firstName", "lastName", "test@email.com", 2);
        when(ud.getUserInfo("Username")).thenReturn(expectedUser);

        Users getUserInfo = us.getUserInfo("Username");
        verify(ud).getUserInfo(any());
        assertEquals(expectedUser, getUserInfo);
    }

    // Method to update account information
    @Test
    public void updateUserInfoTest(){
        Users expectedUser = new Users(121,"Username", "password", "firstName", "lastName", "test@email.com", 2);
        ChangeInfoUser updateUserInfo = new ChangeInfoUser("Username", "password", "firstName", "lastName", "test@email.com");

        when(ud.updateUserInfo(121, updateUserInfo)).thenReturn(expectedUser);
        Users actualNewUser = ud.updateUserInfo(121, updateUserInfo);
        verify(ud).updateUserInfo(121, updateUserInfo);

        assertEquals(expectedUser, actualNewUser);
    }

    //Manage role service class

    // Method to view all employees
    @Test
    public void viewAllEmployeesTest(){
        List<Users> employeeList = new ArrayList<>();
        Users user1 = new Users(1,"Username", "password", "firstName", "lastName", "test@email.com", 1);
        Users user2 = new Users(2,"Username2", "password2", "firstName2", "lastName2", "test2@email.com", 2);
        Users user3 = new Users(3,"Username3", "password3", "firstName3", "lastName3", "test3@email.com", 2);
        employeeList.add(user1);
        employeeList.add(user2);
        employeeList.add(user3);
        when(ud.viewAllEmployees()).thenReturn(employeeList);
        List<Users> actualList = us.viewAllEmployees();
        verify(ud).viewAllEmployees();
        assertEquals(employeeList, actualList);

    }

    @Test
    public void viewAllEmployeesEmptyListTest(){
        List<Users> employeeList = new ArrayList<>();

        when(ud.viewAllEmployees()).thenReturn(employeeList);
        List<Users> actualList = us.viewAllEmployees();
        verify(ud).viewAllEmployees();
        assertEquals(employeeList, actualList);

    }
}
