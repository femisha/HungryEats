package com.cgi.hungryeats;

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

import com.cgi.hungryeats.restaurant.entity.Food;
import com.cgi.hungryeats.restaurant.repository.FoodRepository;
import com.cgi.hungryeats.restaurant.service.FoodServiceImpl;
@ExtendWith(MockitoExtension.class)
public class RestaurantServiceTest {

	@Mock
	FoodRepository repo;
	
	
	
	@InjectMocks
	FoodServiceImpl service;
	private Food food1,food2;
    private List<Food> foodList;
    private Optional optional;
    @AfterEach
    public void tearDown() {
        food1=null;
        food2=null;
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
    	food1 = new Food(1,"briyani",1,230);
         when(repo.save(any())).thenThrow(new RuntimeException());
         Assertions.assertThrows(RuntimeException.class,() -> {
            service.addFood(food1);
         });
         verify(repo, times(1)).save(any());
     }
    /*@Test
    public void givenGetAllOrdersThenShouldReturnListOfAllOrders() throws Exception {
    	
    	repo.save(food1);
    	when(repo.findAll()).thenReturn(foodList);
        List<Food> prolist1 = service.getAllFood();
        assertEquals(foodList, prolist1);
        verify(repo, times(1)).save(food1);
       verify(repo, times(1)).findAll();
    }*/
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
    	food2=new Food(2,"dosa",1,250);
    	String string =food2.getFoodName();
    	Assertions.assertNotEquals("icecream", string);
    }
    
    @Test
    void positiveTestCaseForFoodName() {
    	food2=new Food(2,"dosa",1,250);
    	String string =food2.getFoodName();
    	Assertions.assertEquals("dosa", string);
    }
    @Test
    void positiveTestCaseForQuantity() {
    	food2=new Food(2,"dosa",1,250);
    	Integer integer =food2.getQuantity();
    	Assertions.assertEquals(250, integer);
    }
    
    @Test
    void negativeTestCaseForQuantity() {
    	food2=new Food(2,"dosa",1,250);
    	Integer integer =food2.getQuantity();
    	Assertions.assertNotEquals("dosa", integer);
    }


}
