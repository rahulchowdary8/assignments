package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.models.Order;
import com.order.repo.OrderRepository;
import com.order.service.OrderServiceImpl;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@Autowired
	private OrderRepository orderRepository;

//	Method to place order
//  http://localhost:9003/order/place-order
	@PostMapping("/place-order")
	public Order bookWash(@RequestBody Order order) {
		return orderServiceImpl.placeOrder(order);
	}

	// Method to get orders by customer name
	//http://localhost:9003/order/get-orders/gokul
	@GetMapping("/get-orders/{name}")
	public ResponseEntity<List<Order>> getOrderByName(@PathVariable("name") String name) {
		return new ResponseEntity<>(orderServiceImpl.getOrderListByName(name), HttpStatus.OK);
	}

	// Method to get all the orders
	//http://localhost:9003/order/get-all-orders
	@GetMapping("/get-all-orders")
	public ResponseEntity<List<Order>> getOrders() {
		List<Order> orderList = orderRepository.findAll();
		return new ResponseEntity<>(orderList, HttpStatus.OK);
	}

	// Method to update the payment status
	//http://localhost:9003/order/update-status
	@PostMapping("/update-status")
	public Order updatePaymentStatus(@RequestBody Order order) {
		return orderRepository.save(order);
	}

	// Method to test order
	//http://localhost:9003/order/test-order
	@GetMapping("/test-order")
	public String testOrder() {
		return "Order service running";
	}

//	Deleting washpack by id
	@DeleteMapping("/delete/{orderId}")
    public void deleteById(@PathVariable("orderId") int orderId) {
        this.orderServiceImpl.deleteOrderById(orderId);
    }
	

}