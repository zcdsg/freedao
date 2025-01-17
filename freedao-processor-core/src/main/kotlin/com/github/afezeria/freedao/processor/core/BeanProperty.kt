package com.github.afezeria.freedao.processor.core

import javax.lang.model.element.VariableElement
import javax.lang.model.type.DeclaredType
import javax.lang.model.type.TypeMirror

/**
 *
 */
class BeanProperty(
    val element: VariableElement,
) {
    val name: String = element.simpleName.toString()
    val type: TypeMirror = element.asType()

    val hasSetter by lazy {
        element.hasSetter()
    }

    //判断流程，方法上做了映射按方法的来
    //实体类做了映射按实体类的来
    //都没有就将变量名转成下划线风格
    val column: ColumnAnn

    var valueGenerator: DeclaredType? = null

    init {
        column = ColumnAnn(element)
    }

    fun toSelectItem(tableAlias: String = ""): String {
        return "${tableAlias.replace(".+".toRegex()) { it.value + "." }}${column.name.sqlQuote()} as ${column.name.sqlQuote()}"
    }

    override fun toString(): String {
        return "BeanProperty(name='$name', type=$type)"
    }

    val setterName: String by lazy { "set${name.replaceFirstChar { it.uppercaseChar() }}" }



}