# -*- coding: utf-8 -*-

import random

class Question:
  def __init__(self, question, answers, correct):
    self.question = question
    self.answers = answers
    self.correct = correct

p1 = Question("question", ["test1", "test2"], 2)

lines = []
questions = []

#$PSDefaultParameterValues['Out-File:Encoding'] = 'utf8'
#PS C:\Users\Elusive Fox\Desktop\LRC\LRC_quiz> $PSDefaultParameterValues['*:Encoding'] = 'utf8'


# with open('database_src.txt', encoding="UTF-8") as f:
#     lines = f.readlines()

# with open('database_english.txt', encoding="UTF-8") as f:
#     lines = f.readlines()

with open('database_Serial.txt', encoding="UTF-8") as f:
    lines = f.readlines()

for i in range(len(lines)):
    correect = 0
    if lines[i].startswith("?"):
       if(lines[i+1].startswith("XX")):
           correect = 1
           lines[i + 1] = lines[i+1][2:]
       if (lines[i + 2].startswith("XX")):
           correect = 2
           lines[i + 2] = lines[i + 2][2:]
       if (lines[i + 3].startswith("XX")):
           correect = 3
           lines[i + 3] = lines[i + 3][2:]
       questions.append(Question(lines[i].strip('\n'),[lines[i+1].strip('\n'),lines[i+2].strip('\n'),lines[i+3].strip('\n')],correect))


questions_count = len(questions)
correctt_count = 0
mistakes = []

# for i in range(len(questions)):
#     print(questions[i].question)
#     print(questions[i].correct)
#     print("-=-=-=-=-=")


for i in range(questions_count):
    random_item = random.choice(questions)

    print("-=-=-=- "+ str(i+1) + " out of " + str(questions_count) + " -=-=-=-=-")
    print (random_item.question[1:])

    for j in range(3):
        print(chr(65+j) + " " +random_item.answers[j])


    user_answer = input("\nEnter answer:")

    if(user_answer == chr(96+random_item.correct)):
        print("Correct\n")
        correctt_count += 1
    else:
        print("Wrong")
        print("correct answer: " + chr(96+random_item.correct)+"\n")
        mistakes.append(random_item)

    questions.remove(random_item)

print("Final result: ")
print(str(correctt_count)+"/"+str(questions_count))

for i in mistakes:
    print(i.question)