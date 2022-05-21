package com.revature.services;

import com.revature.dao.IGroceryDao;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class GroceryServiceTest {
    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("This runs once before the entire class");
    }
    @Before
    public void setupBeforeMethods(){
        System.out.println("This runs once before each method in this class");
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    static IGroceryDao groceryDao;
    @InjectMocks
    static GroceryService groceryService;

}