package cl.examen.restaurant.web.controller;

import cl.examen.restaurant.model.domain.dto.Order;
import cl.examen.restaurant.model.domain.dto.Waiter;
import cl.examen.restaurant.model.persistence.entity.WaiterEntity;
import cl.examen.restaurant.web.service.OrderService;
import cl.examen.restaurant.web.service.TableService;
import cl.examen.restaurant.web.service.WaiterService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {
    private final OrderService service;
    private final WaiterService waiterService;
    private final TableService tableService;

    @GetMapping
    public String listorders(Model model){

        model.addAttribute("orders",service.findAll());
        model.addAttribute("waiters",waiterService.finAll());
        model.addAttribute("tables",tableService.findAll());
        return "orders";
    }
    @GetMapping("/search")
    public String search(@ModelAttribute Order order, HttpServletRequest request, Model model){
          int or=  order.getWaiter().getId();
        Waiter w = waiterService.findById(Integer.parseInt(request.getParameter("waiterId")));
       model.addAttribute("waiter", waiterService.findById(w.getId()));
       model.addAttribute("order",service.findById(order.getId()));

        return "orders";
    }

}
