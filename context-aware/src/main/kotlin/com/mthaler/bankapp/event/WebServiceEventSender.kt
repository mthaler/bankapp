package com.mthaler.bankapp.event

import java.util.Properties

class WebServiceEventSender : EventSender {

    private var webServiceProperties: Properties? = null

    fun setWebServiceProperties(webServiceProperties: Properties?) {
        this.webServiceProperties = webServiceProperties
    }

    override fun sendEvent(e: Event) {
        // -- send the event to the remote web service
    }
}