package com.mthaler.bankapp.postprocessor

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.Ordered
import kotlin.Throws
import org.springframework.beans.BeansException
import com.mthaler.bankapp.common.InstanceValidator
import org.apache.logging.log4j.LogManager

class InstanceValidationBeanPostProcessor : BeanPostProcessor, Ordered {

    private var order = 0

    init {
        logger.info("Created InstanceValidationBeanPostProcessor instance")
    }

    @Throws(BeansException::class)
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any {
        logger.info("InstanceValidationBeanPostProcessor's postProcessBeforeInitialization method invoked for bean " + beanName + " of type " + bean.javaClass)
        return bean
    }

    @Throws(BeansException::class)
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any {
        logger.info("InstanceValidationBeanPostProcessor's postProcessAfterInitialization method invoked for bean " + beanName + " of type " + bean.javaClass)
        if (bean is InstanceValidator) {
            bean.validateInstance()
        }
        return bean
    }

    fun setOrder(order: Int) {
        this.order = order
    }

    override fun getOrder(): Int {
        return order
    }

    companion object {
        private val logger = LogManager
            .getLogger(InstanceValidationBeanPostProcessor::class.java)
    }
}