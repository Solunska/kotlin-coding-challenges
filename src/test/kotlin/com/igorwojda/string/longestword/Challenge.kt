package com.igorwojda.string.longestword

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun longestWord(str: String): String {
    val list: List<String> = str.split(" ")
    var string: String = ""

    for (i in list.indices){
        if(string.length < list[i].length){
            string = list[i]
        } else
            continue
    }

    return string
}

private class Test {
    @Test
    fun `'flower' return 'flower'`() {
        longestWord("flower") shouldBeEqualTo "flower"
    }

    @Test
    fun `'flower is growing fast' return 'growing'`() {
        longestWord("flower is growing fast") shouldBeEqualTo "growing"
    }

    @Test
    fun `'This is my jeep' return 'jeep'`() {
        longestWord("This is my jeep") shouldBeEqualTo "This"
    }

    @Test
    fun `'Home!@#&sweet home' return 'sweet'`() {
        longestWord("Home!@&#sweet home") shouldBeEqualTo "sweet"
    }
}
