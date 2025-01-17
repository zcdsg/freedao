package com.github.afezeria.freedao.processor.core.template.element

import com.github.afezeria.freedao.TrimHelper
import com.github.afezeria.freedao.processor.core.template.XmlElement
import com.github.afezeria.freedao.processor.core.type

open class Trim : XmlElement() {

    /**
     * 要添加到开头的文本
     */
    private val prefix by Attribute("")

    /**
     * 要从开头移除的文本
     */
    private val prefixOverrides by Attribute()

    /**
     * 要从末尾移除的文本
     */
    private val suffixOverrides by Attribute()

    fun getTrimWord(string: String): String {
        return string.split(splitRegex).map { it.replace(replaceRegex, "|") }
            .joinToString("\",\"", prefix = "\"", postfix = "\"") { it }
    }

    override fun render() {
        context.newScope { builderName ->
            super.render()
            val postfixArr = suffixOverrides.split(splitRegex).map { it.replace(replaceRegex, "|") }
                .sortedBy { it.length }
            val prefixArr = prefixOverrides.split(splitRegex).map { it.replace(replaceRegex, "|") }
                .sortedBy { it.length }
            addStatement("\$L = \$T.appendAndTrim(\$L,\$S,new String[]{${prefixArr.joinToString { "\$S" }}},new String[]{${postfixArr.joinToString { "\$S" }}})",
                builderName,
                TrimHelper::class.type,
                builderName,
                prefix,
                *prefixArr.toTypedArray(),
                *postfixArr.toTypedArray()
            )
        }
    }

    companion object {
        val splitRegex = "(?<!\\\\)\\|".toRegex()
        val replaceRegex = "(?<!\\\\)\\\\\\|".toRegex()
    }
}