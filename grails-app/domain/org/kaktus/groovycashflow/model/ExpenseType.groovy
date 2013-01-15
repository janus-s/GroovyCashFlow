package org.kaktus.groovycashflow.model

class ExpenseType {
    String name

    static mappedBy = [name: "expense_type_name"]

    static constraints = {
        name blank: false, unique: true
    }

    String toString() {
        return name
    }
}
