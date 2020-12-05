package com.mthaler.bankapp.service

import com.mthaler.bankapp.Constants
import org.springframework.core.io.ClassPathResource
import java.io.FileOutputStream
import java.io.OutputStream
import java.util.*

class EventSenderSelectorServiceImpl(configFile: String?) {

    init {
        val resource = ClassPathResource(configFile)
        val os: OutputStream = FileOutputStream(resource.file)
        val properties = Properties()
        properties.setProperty(Constants.EVENT_SENDER_CLASS_PROPERTY, "sample.spring.chapter04.bankapp.event.DatabaseEventSender")
        properties.store(os, null)
        properties.list(System.out)
        os.flush()
        os.close()
    }
}