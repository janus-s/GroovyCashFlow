package org.kaktus.groovycashflow.model

class Place {
    String name

    static mappedBy = [name: "place_name"]

    static constraints = {
        name blank: false, unique: true
    }

    String toString() {
        return name
    }
}
