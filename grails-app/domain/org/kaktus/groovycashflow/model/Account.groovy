package org.kaktus.groovycashflow.model

class Account {
    BigDecimal value
    String name
    String owner

    static mappedBy = [value: "account_value", name: "account_name", owner: "account_owner"]

    static constraints = {
        name blank: false, unique: true
        owner blank: false
    }

    String toString() {
        return name + " [" + owner + "]"
    }
}
