package com.mthaler.bankapp.event

import java.util.Properties

class DatabaseEventSender : EventSender {

    private var databaseProperties: Properties? = null

    fun setDatabaseProperties(databaseProperties: Properties?) {
        this.databaseProperties = databaseProperties
    }

    override fun sendEvent(e: Event) {
        // -- save events in the database
    }
}