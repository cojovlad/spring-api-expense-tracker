package com.example.spring_api_expense_tracker.repository;

import com.example.spring_api_expense_tracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    // Find expenses for a specific date
    List<Expense> findByDate(Date date);

    // Find expenses between two dates
    @Query("SELECT e FROM Expense e WHERE e.date BETWEEN :startDate AND :endDate")
    List<Expense> findByDateBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}