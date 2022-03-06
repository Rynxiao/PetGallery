package com.tutorials.mypets.data

import com.tutorials.mypets.R
import com.tutorials.mypets.model.Pet
import com.tutorials.mypets.model.Sample
import com.tutorials.mypets.model.Species
import java.util.*

val pets = listOf(
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.Akita,
        description = "The Akita (Akita-inu, Japanese pronunciation: [akʲita.inɯ]) is a large breed of dog originating from the mountainous regions of northern Japan. The two separate varieties of Akita are a Japanese strain, commonly called Akita Inu (inu means dog in Japanese) or Japanese Akita, and an American strain, known as the Akita or American Akita.",
        samples = listOf(
            Sample(name = "Akira", imageRes = R.drawable.img_akita_1, brief = "I'm cute!"),
            Sample(name = "Akira2", imageRes = R.drawable.img_akita_2, brief = "I'm cute!"),
            Sample(name = "Akira3", imageRes = R.drawable.img_akita_3, brief = "I'm cute!"),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.Alaskan,
        description = "The Alaskan Malamute is a large breed of dog that was originally bred for their strength and endurance to haul heavy freight as a sled dog and hound.[2] They are similar to other arctic, husky, and spitz breeds such as the Greenland Dog, Canadian Eskimo Dog, the Siberian Husky, and the Samoyed.",
        samples = listOf(
            Sample(name = "Alaska", imageRes = R.drawable.img_alaskan_1, brief = ""),
            Sample(name = "Alaska2", imageRes = R.drawable.img_alaskan_2, brief = ""),
            Sample(name = "Alaska3", imageRes = R.drawable.img_alaskan_3, brief = ""),
            Sample(name = "Alaska4", imageRes = R.drawable.img_alaskan_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.AmericanShort,
        description = "The American Shorthair (ASH) is a breed of domestic cat believed to be descended from European cats brought to North America by early settlers to protect valuable cargo from mice and rats.[1] According to the Cat Fanciers' Association, in 2020, it was the eighth most popular pedigreed cat in the world.",
        samples = listOf(
            Sample(name = "AmericanShort", imageRes = R.drawable.img_ashort_1, brief = ""),
            Sample(name = "AmericanShort2", imageRes = R.drawable.img_ashort_2, brief = ""),
            Sample(name = "AmericanShort3", imageRes = R.drawable.img_ashort_3, brief = ""),
            Sample(name = "AmericanShort4", imageRes = R.drawable.img_ashort_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.BritishShort,
        description = "The British Shorthair is the pedigreed version of the traditional British domestic cat, with a distinctively stocky body, dense coat, and broad face. The most familiar colour variant is the \"British Blue\", with a solid grey-blue coat, orange eyes, and a medium-sized tail. ",
        samples = listOf(
            Sample(name = "BritishShort", imageRes = R.drawable.img_bshort_1, brief = ""),
            Sample(name = "BritishShort2", imageRes = R.drawable.img_bshort_2, brief = ""),
            Sample(name = "BritishShort3", imageRes = R.drawable.img_bshort_3, brief = ""),
            Sample(name = "BritishShort4", imageRes = R.drawable.img_bshort_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.StandardSchnauzer,
        description = "Standard Schnauzers were originally bred to be ratters, guard dogs, and all-purpose dogs on German farms. Their versatility, medium size, protective nature, and love of family make them an excellent companion dog breed.",
        samples = listOf(
            Sample(name = "Chenille", imageRes = R.drawable.img_ss_1, brief = ""),
            Sample(name = "Chenille2", imageRes = R.drawable.img_ss_2, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.ChineseField,
        description = "The Chinese Field Dog, traditionally called the \"earth dog\" or \"wood dog\" in some places in the north, is a mammal belonging to the order Carnivora, family Canidae, subfamily Canidae, with a height of about 25-55 cm at the shoulder and a weight of about 10-30 kg when it grows up.",
        samples = listOf(
            Sample(name = "ChineseField", imageRes = R.drawable.img_chinese_1, brief = ""),
            Sample(name = "ChineseField2", imageRes = R.drawable.img_chinese_2, brief = ""),
            Sample(name = "ChineseField3", imageRes = R.drawable.img_chinese_3, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.Corgi,
        description = "The Welsh Corgi or Corgi, plural Corgis, or occasionally the etymologically consistent Corgwn; /ˈkɔːrɡuːn/) is a small type of herding dog that originated in Wales. The name \"corgi\" is derived from the Welsh words \"cor\" and \"ci\" (which is mutated to ‘gi’), meaning \"dwarf\" and \"dog\", respectively.",
        samples = listOf(
            Sample(name = "Corgi", imageRes = R.drawable.img_corgi_1, brief = ""),
            Sample(name = "Corgi2", imageRes = R.drawable.img_corgi_2, brief = ""),
            Sample(name = "Corgi3", imageRes = R.drawable.img_corgi_3, brief = ""),
            Sample(name = "Corgi4", imageRes = R.drawable.img_corgi_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.GoldenRetriever,
        description = "The Golden Retriever is one of the most popular dog breeds in the United States. The breed’s friendly, tolerant attitude makes them great family pets, and their intelligence makes them highly capable working dogs.",
        samples = listOf(
            Sample(name = "GoldenHair", imageRes = R.drawable.img_golden_1, brief = ""),
            Sample(name = "GoldenHair2", imageRes = R.drawable.img_golden_2, brief = ""),
            Sample(name = "GoldenHair3", imageRes = R.drawable.img_golden_3, brief = ""),
            Sample(name = "GoldenHair4", imageRes = R.drawable.img_golden_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.Husky,
        description = "Husky is a general term for a dog used in the polar regions, primarily and specifically for work as sled dogs. It refers to a traditional northern type, notable for its cold-weather tolerance and overall hardiness.",
        samples = listOf(
            Sample(name = "Husky", imageRes = R.drawable.img_husky_1, brief = ""),
            Sample(name = "Husky2", imageRes = R.drawable.img_husky_2, brief = ""),
            Sample(name = "Husky3", imageRes = R.drawable.img_husky_3, brief = ""),
            Sample(name = "Husky4", imageRes = R.drawable.img_husky_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.Samoyed,
        description = "The Samoyed SAM-ə-yed or sə-MOY-ed; Russian: Самое́дская соба́ка or Самое́д) is a breed of medium-sized herding dogs with thick, white, double-layer coats. They are a spitz-type dog which takes its name from the Samoyedic peoples of Siberia.",
        samples = listOf(
            Sample(name = "Samoyed", imageRes = R.drawable.img_samoyed_1, brief = ""),
            Sample(name = "Samoyed2", imageRes = R.drawable.img_samoyed_2, brief = ""),
            Sample(name = "Samoyed3", imageRes = R.drawable.img_samoyed_3, brief = ""),
            Sample(name = "Samoyed4", imageRes = R.drawable.img_samoyed_4, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.ShibaInu,
        description = "The Shiba Inu (Japanese: [ɕiba inɯ]) is a breed of hunting dog from Japan. A small-to-medium breed, it is the smallest of the six original and distinct spitz breeds of dog native to Japan.",
        samples = listOf(
            Sample(name = "ShibaInu", imageRes = R.drawable.img_shibainu_1, brief = ""),
            Sample(name = "ShibaInu2", imageRes = R.drawable.img_shibainu_2, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.Poodle,
        description = "The Poodle, called the Pudel in German and the Caniche in French, is a breed of water dog. The breed is divided into four varieties based on size, the Standard Poodle, Medium Poodle, Miniature Poodle and Toy Poodle, although the Medium Poodle variety is not universally recognised.",
        samples = listOf(
            Sample(name = "Teddy", imageRes = R.drawable.img_poodle_1, brief = ""),
            Sample(name = "Teddy2", imageRes = R.drawable.img_poodle_2, brief = ""),
            Sample(name = "Teddy3", imageRes = R.drawable.img_poodle_3, brief = ""),
        )
    ),
    Pet(
        id = UUID.randomUUID().toString(),
        species = Species.GermanShepherd,
        description = "The German Shepherd or German Shepherd Dog,[2][a] (now rarely Alsatian), is a German breed of working dog of medium to large size. It is a modern breed, developed by Max von Stephanitz from various traditional German herding dogs from 1899.",
        samples = listOf(
            Sample(name = "TexasShepherd", imageRes = R.drawable.img_gs_1, brief = ""),
            Sample(name = "TexasShepherd2", imageRes = R.drawable.img_gs_2, brief = ""),
            Sample(name = "TexasShepherd3", imageRes = R.drawable.img_gs_3, brief = ""),
        )
    )
)

