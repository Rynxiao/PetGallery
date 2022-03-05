package com.tutorials.mypets.model

enum class Species(val category: Category) {
    Husky(Category.DOG),            // 哈士奇
    GoldenHair(Category.DOG),       // 金毛
    Alaska(Category.DOG),           // 阿拉斯加
    TexasShepherd(Category.DOG),    // 德州牧羊犬
    Samoyed(Category.DOG),          // 萨摩耶
    ChineseField(Category.DOG),     // 中华田园犬
    Chenille(Category.DOG),         // 雪纳瑞
    Akita(Category.DOG),            // 秋田犬
    ShibaInu(Category.DOG),         // 柴犬
    Corgi(Category.DOG),            // 柯基
    Teddy(Category.DOG),            // 泰迪
    AmericanShort(Category.CAT),    // 美短
    BritishShort(Category.CAT),     // 英短
}