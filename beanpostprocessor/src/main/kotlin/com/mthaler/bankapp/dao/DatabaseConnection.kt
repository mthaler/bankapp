package com.mthaler.bankapp.dao

import com.mthaler.bankapp.dao.DatabaseConnection

class DatabaseConnection {

    fun releaseConnection() {
        //-- release the connection
    }

    companion object {
        val instance: DatabaseConnection
            get() = DatabaseConnection()
    }
}