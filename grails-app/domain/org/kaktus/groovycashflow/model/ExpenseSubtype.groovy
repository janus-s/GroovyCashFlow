package org.kaktus.groovycashflow.model

class ExpenseSubtype {
    String name

    static constraints = {
        name blank: false, unique: true
    }

    String toString() {
        return name
    }
}
