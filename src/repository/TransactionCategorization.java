package repository;

import model.CategoryAmount;
import model.Transaction;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionCategorization {

    private static final String TABLE_TRANSACTION = "\"transaction\"";
    private static final String COLUMN_CATEGORY_ID = "\"category_id\"";
    private static final String COLUMN_ID = "\"id\"";

    public static void associerTransactionACategorie(String transactionId, String categoryId) {
        // Associer la transaction à la catégorie dans la base de données
        updateTransactionCategory(transactionId, categoryId);
//
//        // Mettre à jour les montants de catégorie
//        updateCategoryAmounts(transactionId);
    }

    private static void updateTransactionCategory(String transactionId, String categoryId) {
        String updateQuery = String.format("UPDATE %s SET %s = ? WHERE %s = ?", TABLE_TRANSACTION, COLUMN_CATEGORY_ID, COLUMN_ID);

        try (Connection connection = PostgresqlConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, categoryId);
            preparedStatement.setString(2, transactionId);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Transaction associée à la catégorie avec succès.");
            } else {
                System.out.println("Aucune transaction mise à jour. Vérifiez l'ID de transaction.");
            }

        } catch (SQLException e) {
            throw new RuntimeException();
        } finally {
            PostgresqlConnection.closeConnection();
        }


//    private static void updateCategoryAmounts(String transactionId) {
//        try {
//            // Récupérer la transaction mise à jour
//            Transaction updatedTransaction = getUpdatedTransaction(transactionId);
//
//            // Récupérer la catégorie associée à la transaction
//            String categoryId = updatedTransaction.getCategoryId();
//
//            // Récupérer le montant de la transaction
//            BigDecimal transactionAmount = updatedTransaction.getAmount();
//
//            // Mettre à jour le montant de la catégorie
//            CategoryRepository categoryRepository = new CategoryRepository();
//            CategoryAmount categoryAmount = categoryRepository.findCategoryAmount(categoryId);
//            BigDecimal updatedAmount = categoryAmount.getAmount().add(transactionAmount);
//            categoryRepository.updateCategoryAmount(categoryId, updatedAmount);
//
//            System.out.println("Montant de catégorie mis à jour avec succès.");
//
//        } catch (SQLException e) {
//            throw new RuntimeException();
//        }

    }
}
