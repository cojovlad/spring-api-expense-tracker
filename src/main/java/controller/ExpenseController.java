package controller;

import entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import repository.ExpenseRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    // Get all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // Get expense by ID
    @GetMapping("/{id}")
    public Optional<Expense> getExpenseById(@PathVariable int id) {
        return expenseRepository.findById(id);
    }

    // Add a new expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }

    // Update an existing expense
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable int id, @RequestBody Expense updatedExpense) {
        if (expenseRepository.existsById(id)) {
            updatedExpense.setId(id);
            return expenseRepository.save(updatedExpense);
        }
        return null; // Handle this better with proper HTTP response codes
    }

    // Delete an expense by ID
    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable int id) {
        if (expenseRepository.existsById(id)) {
            expenseRepository.deleteById(id);
            return "Expense deleted successfully.";
        }
        return "Expense not found.";
    }

    // Get expenses for a specific date
    @GetMapping("/date/{date}")
    public List<Expense> getExpensesByDate(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return expenseRepository.findByDate(date);
    }

    // Get expenses within a date range
    @GetMapping("/date-range")
    public List<Expense> getExpensesByDateRange(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return expenseRepository.findByDateBetween(startDate, endDate);
    }
}
