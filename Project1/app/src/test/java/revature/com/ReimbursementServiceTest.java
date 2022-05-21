package revature.com;

import org.checkerframework.checker.units.qual.A;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import revature.com.dao.IReimbursementDao;
import revature.com.dao.IUserDao;
import revature.com.models.ApproveOrDenyReimbursement;
import revature.com.models.RegisterUsers;
import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;
import revature.com.services.ReimbursementService;
import revature.com.services.UserService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ReimbursementServiceTest {

    // Need to add this setup before testing
    @Before
    public void setupBeforeMethods(){
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    static IReimbursementDao rd;

    @InjectMocks
    static ReimbursementService rs;

    @Test
    public void submitReimbursementRequestTest(){
        // Since submitReimbursementRequest is void method, didn't return anything
        // Only need to test it from verify(rd).submitReimbursementRequest(any());
        rs.submitReimbursementRequest(new SubmitReimbursement( 200,  "Travelling", 1));

        verify(rd).submitReimbursementRequest(any());

    }

    @Test
    public void viewPendingReimbursementTest(){
        List<Reimbursement> viewPendingList = new ArrayList<>();
        Date today = new Date(Instant.now().toEpochMilli());
        Reimbursement pending1 = new Reimbursement(1, 300, today, "travelling", 2, 1, 2);
        Reimbursement pending2 = new Reimbursement(2, 4130, today, "Other thing during travelling", 2, 1, 4);
        viewPendingList.add(pending1);
        viewPendingList.add(pending2);
        when(rd.viewPendingReimbursement(2)).thenReturn(viewPendingList);
        List<Reimbursement> expectedList =  viewPendingList;
        List<Reimbursement> actualList = rs.viewPendingReimbursement(2);
        verify(rd).viewPendingReimbursement(2);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void viewPendingReimbursementEmptyTest(){
        List<Reimbursement> viewPendingList = new ArrayList<>();
        when(rd.viewPendingReimbursement(3)).thenReturn(viewPendingList);
        List<Reimbursement> expectedList =  viewPendingList;
        List<Reimbursement> actualList = rs.viewPendingReimbursement(3);
        verify(rd).viewPendingReimbursement(3);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void viewResolvedReimbursementTest(){

        List<Reimbursement> viewResolvedList = new ArrayList<>();
        Date today = new Date(Instant.now().toEpochMilli());
        Reimbursement resolved1 = new Reimbursement(1, 300, today, today, "travelling", 2, 1,  3, 2);
        Reimbursement resolved2 = new Reimbursement(2, 4130, today, today, "Other thing during travelling", 2, 1, 2, 4);
        viewResolvedList.add(resolved1);
        viewResolvedList.add(resolved2);
        when(rd.viewResolvedReimbursement(2)).thenReturn(viewResolvedList);
        List<Reimbursement> expectedList =  viewResolvedList;
        List<Reimbursement> actualList = rs.viewResolvedReimbursement(2);
        verify(rd).viewResolvedReimbursement(2);
        assertEquals(actualList, expectedList);



    }
    @Test
    public void viewResolvedReimbursementEmptyTest(){

        List<Reimbursement> viewResolvedList = new ArrayList<>();

        when(rd.viewResolvedReimbursement(2)).thenReturn(viewResolvedList);
        List<Reimbursement> expectedList =  viewResolvedList;
        List<Reimbursement> actualList = rs.viewResolvedReimbursement(2);
        verify(rd).viewResolvedReimbursement(2);
        assertEquals(actualList, expectedList);
    }
    @Test
    public void approveReimbursementTest(){
        // Since approveReimbursement is void method, didn't return anything
        // Only need to test it from verify(rd).approveReimbursement(any());
        ApproveOrDenyReimbursement approveRequest = new ApproveOrDenyReimbursement(12, 2);
        rs.approveReimbursement(1, approveRequest);

        verify(rd).approveReimbursement(1, approveRequest);
    }

    @Test
    public void denyReimbursementTest(){
        // Since approveReimbursement is void method, didn't return anything
        // Only need to test it from verify(rd).approveReimbursement(any());
        // 3 is the deny number
        ApproveOrDenyReimbursement approveRequest = new ApproveOrDenyReimbursement(12, 3);
        rs.approveReimbursement(2, approveRequest);

        verify(rd).approveReimbursement(2, approveRequest);
    }


    @Test
    public void viewAllPendingReimbursementByManagerTest(){
        List<Reimbursement> viewPendingList = new ArrayList<>();
        Date today = new Date(Instant.now().toEpochMilli());
        Reimbursement pending1 = new Reimbursement(1, 300, today, "travelling", 2, 1, 2);
        Reimbursement pending2 = new Reimbursement(2, 4130, today, "Other thing during travelling", 2, 1, 4);
        Reimbursement pending3 = new Reimbursement(3, 300, today, "Food", 4, 1, 3);
        Reimbursement pending4 = new Reimbursement(4, 4130, today, "Hotel", 5, 1, 1);

        viewPendingList.add(pending1);
        viewPendingList.add(pending2);
        viewPendingList.add(pending3);
        viewPendingList.add(pending4);

        when(rd.viewAllPendingRequests()).thenReturn(viewPendingList);
        List<Reimbursement> expectedList =  viewPendingList;
        List<Reimbursement> actualList = rs.viewAllPendingRequests();
        verify(rd).viewAllPendingRequests();
        assertEquals(actualList, expectedList);
    }

    @Test
    public void viewAllResolvedReimbursementByManagerTest(){

        List<Reimbursement> viewResolvedList = new ArrayList<>();
        Date today = new Date(Instant.now().toEpochMilli());
        Reimbursement resolved1 = new Reimbursement(1, 300, today, today, "travelling", 2, 1,  2, 2);
        Reimbursement resolved2 = new Reimbursement(2, 4130, today, today, "Other thing during travelling", 2, 1, 3, 4);
        Reimbursement resolved3 = new Reimbursement(3, 3010, today, today, "travelling in Japan", 2, 1,  2, 2);
        Reimbursement resolved4 = new Reimbursement(4, 123, today, today, "Hotel", 2, 5, 3, 1);


        viewResolvedList.add(resolved1);
        viewResolvedList.add(resolved2);
        viewResolvedList.add(resolved3);
        viewResolvedList.add(resolved4);

        when(rd.viewAllResolvedRequests()).thenReturn(viewResolvedList);
        List<Reimbursement> expectedList =  viewResolvedList;
        List<Reimbursement> actualList = rs.viewAllResolvedRequests();
        verify(rd).viewAllResolvedRequests();
        assertEquals(actualList, expectedList);



    }
    @Test
    public void viewAllSpecificRequestsTest(){
        List<Reimbursement> viewAllRequestByuserID = new ArrayList<>();
        Date today = new Date(Instant.now().toEpochMilli());
        Reimbursement pending1 = new Reimbursement(1, 300, today, "travelling", 2, 1, 2);
        Reimbursement pending2 = new Reimbursement(2, 4130, today, "Other thing during travelling", 2, 1, 4);

        Reimbursement resolved1 = new Reimbursement(4, 300, today, today, "travelling", 2, 1,  2, 2);
        Reimbursement resolved2 = new Reimbursement(6, 4130, today, today, "Other thing during travelling", 2, 1, 3, 4);

        viewAllRequestByuserID.add(pending1);
        viewAllRequestByuserID.add(pending2);
        viewAllRequestByuserID.add(resolved1);
        viewAllRequestByuserID.add(resolved2);

        when(rd.viewAllSpecificRequests(2)).thenReturn(viewAllRequestByuserID);
        List<Reimbursement> getActualList = rs.viewAllSpecificRequests(2);
        verify(rd).viewAllSpecificRequests(2);

        assertEquals(viewAllRequestByuserID, getActualList);


    }

    @Test
    public void viewAllSpecificEmptyRequestsTest(){
        List<Reimbursement> viewAllRequestByuserID = new ArrayList<>();

        when(rd.viewAllSpecificRequests(3)).thenReturn(viewAllRequestByuserID);
        List<Reimbursement> getActualList = rs.viewAllSpecificRequests(3);
        verify(rd).viewAllSpecificRequests(3);

        assertEquals(viewAllRequestByuserID, getActualList);


    }




}
