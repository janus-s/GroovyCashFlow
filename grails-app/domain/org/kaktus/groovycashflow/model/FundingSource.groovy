package org.kaktus.groovycashflow.model

class FundingSource {
    String name

    static constraints = {
        name blank: false, unique: true
    }

    String toString() {
        return name
    }
}
