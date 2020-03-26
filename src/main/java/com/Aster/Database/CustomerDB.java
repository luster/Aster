package com.Aster.Database;

import com.Aster.Model.Cart;
import com.Aster.Model.Customer;
import com.Aster.Model.Order;
import java.util.List;

public interface CustomerDB {

  boolean addCustomer(Customer customer) throws Exception;

  Customer getCustomer(String email) throws Exception;

  boolean deleteCustomer(String email) throws Exception;

  boolean isValid(String email);

  // '/**' and enter for method commenting
  boolean addCart(String email, Order order);

  boolean removeCart(String email, String orderID) throws Exception;

  boolean emptyCart(String email) throws Exception;

  Cart viewCart(String email);

  boolean isInCart(String email, Order order) throws Exception;

  boolean updateCart(String email, Order order) throws Exception;

  int getQuantity(String email, Order order) throws Exception;

  List<Order> viewHistory(String email);

  List<Order> updateHistory(String email);

  int addOrder(Order order);

  int cancelOrder(Order order);
}
