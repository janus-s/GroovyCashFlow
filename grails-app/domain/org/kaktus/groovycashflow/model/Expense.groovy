package org.kaktus.groovycashflow.model

class Expense {
    Date date
    BigDecimal value

    static belongsTo = [account: Account, place: Place, expenseType: ExpenseType]

    static mappedBy = [date: "expense_date", value: "expense_vale"]

    static constraints = {
        value blank: false
    }
}
