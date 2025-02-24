package entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CookieValue;

import java.util.Date;

@Entity
@Table(name = "expense")  // Ensure table name matches MySQL
public class Expense {

    public Expense() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    @Column(name = "id")
    private int id;

    @Column(name = "expense_name", nullable = false, length = 255)
    private String expenseName;

    @Column(name = "expense_type", nullable = false, length = 255)
    private String expenseType;

    @Column(name = "expense_price", nullable = false)
    private int expensePrice;

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Ensures proper format handling
    private Date date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public int getExpensePrice() {
        return expensePrice;
    }

    public void setExpensePrice(int expensePrice) {
        this.expensePrice = expensePrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
