package com.example.quizwiz

object Constants {

    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTIONS : String ="total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1, "What country does this flag belong to ?",R.drawable.africa, "India",
            "Australia","Africa","Pakistan", 3
        )

        questionList.add(que1)


        val que2 = Questions(
            1, "What country does this flag belong to ?",R.drawable.australia, "India",
            "Australia","Africa","Pakistan", 2
        )

        questionList.add(que2)

        val que3 = Questions(
            1, "What country does this flag belong to ?",R.drawable.brazil, "India",
            "Australia","Africa","Brazil", 4
        )

        questionList.add(que3)

        val que4 = Questions(
            1, "What country does this flag belong to ?",R.drawable.england, "India",
            "England","Africa","Pakistan", 2
        )

        questionList.add(que4)

        val que5 = Questions(
            1, "What country does this flag belong to ?",R.drawable.france, "Indonesia",
            "Australia","Africa","France", 4
        )

        questionList.add(que5)

        val que6 = Questions(
            1, "What country does this flag belong to ?",R.drawable.india, "India",
            "Australia","Africa","Pakistan", 1
        )

        questionList.add(que6)

        val que7 = Questions(
            1, "What country does this flag belong to ?",R.drawable.indonesia, "Brazil",
            "Australia","Indonesia","Pakistan", 3
        )

        questionList.add(que7)

        val que8 = Questions(
            1, "What country does this flag belong to ?",R.drawable.mexico, "Japan",
            "Australia","Africa","Mexico", 4
        )

        questionList.add(que8)

        val que9 = Questions(
            1, "What country does this flag belong to ?",R.drawable.russia, "India",
            "Russia","Africa","Pakistan", 2
        )

        questionList.add(que9)

        val que10 = Questions(
            1, "What country does this flag belong to ?",R.drawable.shrilanka, "India",
            "Australia","Africa","Shri Lanka", 1
        )

        questionList.add(que10)

        return questionList
    }
}