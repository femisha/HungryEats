package com.cgi.hungryeats.order;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.cgi.hungryeats.order.entity.Order;
import com.cgi.hungryeats.order.repository.OrderRepository;
import com.cgi.hungryeats.order.service.IOrderService;
@ExtendWith(MockitoExtension.class)
public class ServiceTestingOrder {
	@Mock
	OrderRepository repo;
	
	
	
	@InjectMocks
	IOrderService service;
	private Order order1,order2;
    private List<Order> orderList;
    private Optional optional;
    @AfterEach
    public void tearDown() {
        order1=null;
        order2=null;
    }
   /* @Test
    public void givenOrderToSaveThenShouldReturnSavedOrder()   {
    	order1 = new Order(1,"biryani",450,20,"confirmed");
    	
    	 when(repo.save(any())).thenReturn(order1);
         Assertions.assertEquals(order1, service.addOrder(order1));
    	 OrderDto i=service.addOrder(order1);
         verify(repo, times(1)).save(any());
    }*/
    @Test
    public void givenOrderToSaveThenShouldNotReturnSavedOrder() throws Exception {
    	order1 = new Order(1,"briyani",1,230);
         when(repo.save(any())).thenThrow(new RuntimeException());
         Assertions.assertThrows(RuntimeException.class,() -> {
            service.addOrder(order1);
         });
         verify(repo, times(1)).save(any());
     }
    @Test
    public void givenGetAllOrdersThenShouldReturnListOfAllOrders() throws Exception {
    	
    	repo.save(order1);
    	when(repo.findAll()).thenReturn(orderList);
        List<Order> prolist1 = service.getAllOrders();
        assertEquals(orderList, prolist1);
        verify(repo, times(1)).save(order1);
       verify(repo, times(1)).findAll();
    }
   /* @Test
    void negativeTestCasesForFoodName() {
     	order2 = new Order(2,"dosa",1,250);
     	String string=order2.getFoodName();
     	Assertions.assertNotEquals("icecream",string );
     }
    @Test
    void positiveTestCasesForFoodName() {
    	order2 = new Order(1,"biryani",420,20);
     	String string=order2.getFoodName();
     	Assertions.assertEquals("biryani",string );
     }
    @Test
    void negativeTestCasesForQuantity() {
     	order2 = new Order(1,"biryani",420,20);
     	Integer integer=order2.getQuantity();
     	Assertions.assertNotEquals("icecream",integer );
     }*/
    @Test
    void negativeTestCaseForFoodName() {
    	order2=new Order(2,"dosa",1,250);
    	String string =order2.getFoodName();
    	Assertions.assertNotEquals("icecream", string);
    }
    
    @Test
    void positiveTestCaseForFoodName() {
    	order2=new Order(2,"dosa",1,250);
    	String string =order2.getFoodName();
    	Assertions.assertEquals("dosa", string);
    }
    @Test
    void positiveTestCaseForQuantity() {
    	order2=new Order(2,"dosa",1,250);
    	Integer integer =order2.getQuantity();
    	Assertions.assertEquals(1, integer);
    }
    
    @Test
    void negativeTestCaseForQuantity() {
    	order2=new Order(2,"dosa",1,250);
    	Integer integer =order2.getQuantity();
    	Assertions.assertNotEquals("dosa", integer);
    }


}