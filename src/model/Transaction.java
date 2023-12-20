    package model;

<<<<<<< HEAD
    import lombok.Data;
    import lombok.NoArgsConstructor;
=======
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> 326c89dd8e14dcf3de0509d4bc0794d0010e8d9c

    import java.math.BigDecimal;
    import java.time.LocalDateTime;

<<<<<<< HEAD
    @Data
    @NoArgsConstructor
    public class Transaction {
        private String id;
        private String label;
        private BigDecimal amount;
        private LocalDateTime transactionDatetime;
        private TransactionType type;



        public Transaction(String id, String label, BigDecimal amount, LocalDateTime transactionDatetime, TransactionType type) {
            this.id = id;
            this.label = label;
            this.amount = amount;
            this.transactionDatetime = transactionDatetime;
            this.type = type;

        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getLabel() {
            return label;
        }
        public void setLabel(String label) {
            this.label = label;
        }
        public BigDecimal getAmount() {
            return amount;
        }
        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }
        public LocalDateTime getTransactionDatetime() {
            return transactionDatetime;
        }
        public void setTransactionDatetime(LocalDateTime transactionDatetime) {
            this.transactionDatetime = transactionDatetime;
        }
        public TransactionType getType() {
            return type;
        }
        public void setType(TransactionType type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return "Transaction{" +
                    "id='" + id + '\'' +
                    ", label='" + label + '\'' +
                    ", amount=" + amount +
                    ", transactionDatetime=" + transactionDatetime +
                    ", type=" + type +
                    '}';
        }
    }
=======
@Data
@NoArgsConstructor
public class Transaction {
    private String id;
    private String label;
    private BigDecimal amount;
    private LocalDateTime transactionDatetime;
    private TransactionType type;
    private String categoryId;



    public Transaction(String id, String label, BigDecimal amount, LocalDateTime transactionDatetime, TransactionType type) {
        this.id = id;
        this.label = label;
        this.amount = amount;
        this.transactionDatetime = transactionDatetime;
        this.type = type;
        this.categoryId = categoryId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public LocalDateTime getTransactionDatetime() {
        return transactionDatetime;
    }
    public void setTransactionDatetime(LocalDateTime transactionDatetime) {
        this.transactionDatetime = transactionDatetime;
    }
    public TransactionType getType() {
        return type;
    }
    public void setType(TransactionType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", amount=" + amount +
                ", transactionDatetime=" + transactionDatetime +
                ", type=" + type +
                '}';
    }
}
>>>>>>> 326c89dd8e14dcf3de0509d4bc0794d0010e8d9c
