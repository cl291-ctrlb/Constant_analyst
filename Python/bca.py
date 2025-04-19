# print("intro")
# print("bca")
# from venv import create
# from wsgiref.validate import validator
# from turtle import config_dict
# from types import NoneType
# from operator import index
# from tkinter.font import names
from collections import defaultdict
from email.policy import default
from idlelib.pyparse import trans


# unit1 lab (complete)
# write and execute a simple python to add numbers and print out
# x= int(input("enter first number"))
# y= int(input("enter second number"))
# sum = x + y
# print("sum",sum)

# unit2 bca
# boolean datatype
# type(True)
# print(type)
# type(False)
# print(type(False))

# set
# a = {1,2,5,5,6}
# print(a)

# list
# a = [1,5,6,4]
# print(a)

# tuple
# kp = ("nitin" ,"iaf" )
# print(type(kp))

# string
# string = "bca*&&*&"
# print(string)
# print(type(string))

# taking input from user
# name = (input("chalaja"))
# print("wel done , "+ name)
# print(type(name))

# Write a python program implement variables based on different data types – int, float, string.

# mayank = 74 # lession dekho dhyab se
# print("Type of a :",type(mayank))
# azamgarhi = 853366.023
# print("type of azamgarhi ",type(azamgarhi))
# kp = " nitin "
# print("type of kp", type (kp))

# Write a python program to take an input from user and print it.
# python = input("enter number ")
# print("num is ", python) (completed)


# unit 3 operator
# logical operator
# a = True
# b = False
# print("a and b is ",a and b)
# print("a or b is ",a or b)
# print("not a  is ",not b)

# # . Write a Python program to implement different kinds of operations on different types of values
# kp = 789
# chomu = 987
# print("arithematic operator :")
# print("kp + chomu ",kp+chomu)
# print("comparison",kp==chomu)
# suar = True
# kukkur = False
# print("logical ")
# print(" suar and kukkur  ",suar and kukkur)
# print("suar or kukkur",suar or kukkur)
# chor = 78
# momo = 7
# samosa = " mast h "
# print("assignment")
# print(chor is not momo)
# print(momo is samosa)

# not operator
# age = 29
# print(not age < 30)

# or operator
# umar = 7032
# print(umar > 8000 or umar< 8000)

# and operator
# god = 78
# lord = 789
# kp = 758
# if god  < kp  and lord  < kp :
#     print("Both 'god ' AND 'lord' are less than 'kp '")
# else:
#     print("either 'god' or 'lord' or both 'god ' and 'lord' greater than 'kp'")
#complete


# uint 4
# membership operator
# a = 78
# b = 74
# list = [2,1,5,4,1,6]
# if (a in list ):
#     print("line a in list")
# else :
#     print(" b present int list ")

#  identity operator
# a = 7
# b = 78
# c = "welcome to constant learning"
# d = " stay physically mentally and financially healthy "
# e = [1,9,6,8,1,5,8]
# f = [1,9,6,8,5,5,7]
# print(a is not b)
# print(b is d)
# print(f is e)

# bitwise operator
# nitin = True
# kp = False
# print("nitin and kp ", nitin and kp)
# print("nitin or kp ", nitin or kp)
# print()

# membership operator(using operator and keyword)
# a = 7
# b = 4
# list = [4,5,6,2]
# if (a in list ):
#     print("a is present ")
# else :
#     print("b is absent")
# print()

# identity operators
# a = 78
# b= 87
# if (a is b):
#     print("a & b same identity")
# b = 45
# if (a is not b ):
#     print("a & b  have different identity")

# Implement membership and identity operators using Python programming.
#identity member
# list = [4,5,6,2,3]
# sec = 78
# vac = 98
# chimar = "chalaja "
# suar = "hello kp "
# gol = [4,5,6,5,2]
# print(sec is list )
# print(sec is vac )
# membership
# if (sec in list ):
#     print("sec present")
# else :
#     print("sec not present ")
# if (vac in list ):
#     print("vac present")
# else :
#     print("vac is absent")

# Write a Python code that solves a mathematical expression using different operations and keyword
# x = 54+3.6
# y = (546+96)*9
# print("x and y ",x and y )
# print("x or y ", x or y )
# print()

# membership operators
# x = 987
# y = 852
# list = [9,6,3,2,4]
# if (x in list ):
#     print("x present")
# else:
#     print("x absent")

# identity operartors
# list = [4,8,9,4]
# chor = 98
# chor2 = 852
# if (chor is chor2):
#     print("chor & chor2 same identity")
#
# if (chor is not chor2):
#     print("different identity")
#completed

# unit 5 phone me complete milgya
# unit  6  phone me complete milgya
# unit 7 phone me complete milgya
# unit8 phone me
# UNIT 8(BCCHA HUa)
# method 2 iteration over list while loop
# list = [1,2,4,5]
# index = 0
# while index< len(list):
#     element = list[index]
#     if element % 2 == 0:
#         print("even number ")
#     else :
#         print("odd numbers")
#     index += 2

# iterative over string
# using for loop
# string = "nitin kumar prajapati "
# for ch in string :
#     print("index of element ", string.index(ch))

#iterative over dict
# course_rollno = {"python": 47035,"matplotlib":48035}
# print("list of course_rollno : \n")
# for course_rollno in course_rollno:
#     print(course_rollno)
#completed













# unit 9 unconditinal branching statements
# from 10 to 1
# x = 10
# while x >=1:
#     print("x =",x)
#     x -=1
# print("out of the loop")

# Python program that display numbers from 25 to 20 and break the loop when the number
# displays 20 are as follows:
# x = 25
# while x>=1:
#     print("x = ",x)
#     x-=1
#     if x == 20 :
#         break
# print("out of looop ")

#  Python Pass Statement
# x = 25
# while x<30:
#     x+=1
#     if x>26:
#         pass
#     print("x = ",x)
# print("out of loop ")

# Python Continue Statement
# for letter in "information ":
#     if letter =="m":
#         continue
#     print("current letter ",letter)
#     t=9
#     while t >0:
#         t =t-1
#         if t ==4:
#             continue
#         print("current variable ",t)
#     print("good job ")

#  COMBINING CONDITIONAL AND LOOPING STATEMENT
# list = [1,4,5,6,1]
# generator = (number for number in list if type (number) is int)
# for number in generator:
#     print(number)

# lab
# Write python programs that implement looping constructs to solve repetitive problems such as
# printing Armstrong numbers, Factorial, Fibonacci sequence and Patterns.
# def fib(n):
#     x=0
#     y=1
#     if n==1:
#         print(x)
#     else:
#         print(x)
#         print(y)
#     for i in range(2,n):
#         z=x+y
#         x=y
#         y=z
#         print(z)
#
#
# print(fib(10))

# armstrong numbers
# num  = int(input("enter a number"))
# sum =0
# temp = num
# while temp>0:
#     digit = temp%10
#     sum += digit *3
#     temp//=10
# if num == sum:
#     print(num,"is an armstrong number ")
# else:
#     print(sum,"is not an armstrong number")

# printing pattern
# def patternprinting(n):
#     list = []
#     for i in range (1,n+1):
#         list.append("*"*i)
#     print("\n ".join(list))
#
# n=8
# patternprinting(n)

# Write a python program to demonstrate the usability of break, pass and continue statements under a
# loop. The following python program is used to demonstrate the usability of break, pass and continue
# statements under a loop:
# list = ["nitin", "kumar ", "prajapati", "chomu"]
# for i in range (len(list)):
#     print(list[i])
#     if list [i] == "guru":
#         print("found name guru")
#         break
#         print("after break statement")
# print("loop is terminated")
#
# for i in  range (5):
#     if i==5:
#         continue
#     print("nitin",list)
#
# test = "chomu"
# for list in test :
#     if list == "r":
#             print("pass executed")
#             pass
#     print(list)

# ctrl shift f10 se recording stop hora h
#completed





# unit 10 functions in python
# def printname():
#        print("nitin kumar prajapati ")
# printname()

# default arguments
# def defaultArg(Name,nitin = "aajao guys "):
#     print(Name,nitin)
#
#
# defaultArg("kumar")

#  VARIABLE-LENGTH ARGUMENTS
# abey niche wala code not work(abey return type krna bhul gya )
# def sum (*elements):
#     res=0
#     for a in elements:
#         res = res +a
#     return res
# print(sum(10,10))
# print(sum(5,6))
# print(sum(14))
# print(sum())

#alternate
# def sum(*elements):
#      res=0
#      for a in elements:
#             res=res+a
#      return res
#
# print(sum(12,28))
# print(sum(40,50,70))
# print(sum(14))
# print(sum())


#anonymous function
# Use of Lambda Function with Filter() Function
# list1 = [1,2,3,5,6,8,9,7,9]
# list2 = list(filter (lambda x: (x%2 == 0 ),list))
# print(list2)

# redo
# list1 =[1,5,6,4,6,4,1]
# list2 = list (filter(lambda x:(x%2 == 0),list1))
# print(list2)

# Use of Lambda Function with Map() Function
# list1 = [4,8,9,4,1,6,1]
# list2 = list(map(lambda x: x*2,list1))
# print(list2)

# FUNCTION RETURNING VALUES
# find the sum of two numbers and return the result from the
# # function
# def sum(a,b):
#     c= a +b
#     return c

# x = sum(26146146,48941)
# print(x)

# Returning Multiple Values
# have error
# class Test:
#              def__init__(self) :
#                          self.str = "nitin"
# redo                         self.x = 20
# class Test:
#         def init (self):  # init mai __ iski zarurt nhi
#                     self.str = "nitin kumar"
#                     self.x = 20
#

# def fun():
#         return Test ()
#
# t = fun()
# print(t.str)
# print(t.x)

#redo
# class Test:
#             def init (self):
#                     self.str = "Hello_world"
#                     self.x = 20
# # This function returns an object of Test
# def fun ():
#         return Test ()
# # Driver code to test above method
#
# t = fun ()
# print(t.str)
# print(t.x)

# redo (have error)
# class Test:
#         def init (self):
#                 self.str = "nitin_kumar"
#                 self.x = 20
# def fun ():
#             return Test ()
#
#
# t  = fun()
# print(t.str)
# print(t.x)

# Function Returning Another Function
# def create_add(x):
#     def adder(y):
#         return x +y
#
#
# add_15 = create_add(12)
# print("result ",add_15(17))
# def outer(x):
#     return x * 14
#
# def my_fun():
#     return outer
#
# res = my_fun()
# print("\n result is", res(13))

# redo (i was doing error in previous code below one is right)
# def create_adder(x):
#     def adder(y):
#         return x + y
#     return adder
#
# add_15 = create_adder(12)
# print("result is ", add_15(17))
#
# def outer(x):
#     return x *14
#
# def my_func():
#     return outer
#
# res = my_func()
# print("\n result is ",res(13))

# VARIABLE SCOPE (global variable and local variablr)
# a = 1
# b = 2
# def myfunction():
#          # b = 2
#          print("a = ",a)
#          print("b = ",b)
#
#
# myfunction()
# print(a)
# print(b)

#  lab
# Create, define and call python functions to demonstrate modular programming.
# The following python program is used to create, define and call python functions to demonstrate
# modular programming:
# def fun():
#     print("hello world ")
# # print(fun())
# x = fun ()
# print(x)
# fun()#(if we use print then none will show )

# Write a python program to implement anonymous functions – lambda.
#The following python program is used to implement anonymous functi
# def sum (value1,value2):
#     return (value2+value1)
#
#
# sum_lambda = lambda value1, value2 : value1 + value2
# print(sum_lambda(14, 21))

# redo (uper thoda space )
# def sum(value1, value2):
#         return (value1 + value2)
# sum_lambda = lambda value1, value2 : value1 + value2
# print(sum_lambda(14, 21))


#unit 11 built in function
# ABS() FUNCTION
# def cal_speed(dist,time):
#     print("distance in km ",dist)
#     print("time in hour ",time)
#     return dist/time
#
# def cal_dist(speed,time):
#     print("speed ",speed)
#     print("time ", time)
#     return speed * time
#
#
# def cal_time(dist,speed):
#     print("distance in km ",dist)
#     print("speed in km/hr  ", speed)
#     return speed*dist
#
#
# print("calculated speed",cal_speed(abs(12.9),abs(3.0)))
# print("calculated distance ",cal_dist(abs(30.9),abs(2.1)))
# print("calculated time ",cal_time(abs(50.0),abs(6.5)))

# BOOL() FUNCTION
# a = False
# print(bool(a))
# a = True
# print(bool(a))
# a = 25
# b = 12
# print(bool(a == b ))
# a = None
# print(bool(a))
# a = {}
# print(bool(a))
# a = 2.02
# print(bool(a))
# a = "nitin"
# print(bool(a))

# BYTES ()FUNCTION
# g python program is used to convert strings to bytes:
# string = "nitin kumar prajapati"
# array = bytes(string, 'utf-7')
# print(array)

# The following python program is used to convert array of bytes from an integer:
# number = int(input("enter a number "))
# result = bytes(number)
# print(result)

# SUM()FUNCTION
# number = [2,6,5,8,4,9,8]
# Sum = sum(number)
# print(Sum)
# Sum = sum(number, 12)
# print(Sum)

# EXEC() FUNCTION
# prog = 'print("sum  of  45 and 484", (45+484))'
# exec(prog)

# ASCII() FUNCTION
# Test_set = {"S", "Y", "S"}
# print("ascii on python:", ascii(Test_set))

# copy
# Test_set = {"Š", "Y", "S"}
# print("ascii on Python set:", ascii(Test_set))#value change after each run byte

#redo(abey copy paste kia to shi ascii value de rha h maine do baar try krlia sb shi h but ascii value nhi de rha)
# test_set = {"S", "Y", "S"}
# print("ascii on python set:", ascii(test_set))

#copy paste mai shi ara h
# Test_list = ["Ň", "ĕ", "Ŵ"]
# print("ascii on Python list:", ascii(Test_list))

#copy paste me kaam kr rha h but mere personal code nhi kr rha
# Test_tuple = ("t",  "o",  "o",  "H")
# print("ascii on tuple:", ascii((Test_tuple)))

# EVAL() FUNCTION
# a = 254
# print("value a ",a)
# print(eval('a'))
# print('value of a + 25 = ')
# print(eval('a+25'))
# print('value of a^ 6 = ')
# print(eval('a * a '))
# print('value of a ^9 = ')
# print(eval('a*a*a'))
# if (a%2==0):
#     print('a is even number ')
# if (a%2!=0):
#             if(a%3!=0):
#                  if(a%6!=0):
#                       if(a%10!=0):
#                                  print(eval('a'))
#                                  print('is a prime number ')
#                       else:
#                             print("a is not prime ")
#                  else:
#                          print("a is not prime ")
#             else:
#                     print("a is not prime ")
# else :
#               print("a is not prime ")

# FLOAT() FUNCTION
# number = float(56)
# print(number)

# FORMAT() FUNCTION
# print("{}, hello good morning "
#       .fomat ("welcome to nitin production"))
# string = " nitin {} "
# print(string.format("is a simple language "))
# print("welcome to constant learning , i am {} years old !" .format(22) )

# GLOBALS()
# FUNCTION
# a = 4
# def func():
#       c=6552
#       d=c+a
#
#       globals()['a']=d
#       print(d)
# func()

# ITER() FUNCTION
# list = [12,89,16,84]
# print("list of type "+str(type(list)))
# list1 = iter (list)
# print("iterator is of type "+ str(type(list)))
# print(next(list1))
# print(next(list1))
# print(next(list1))
# print(next(list1))
# print(next(list1))

# POW() FUNCTION
# print("value of (15**33 ) % 56 is : ", end=" ")
# print(pow(5,2,11))

# r.ANGE() FUNCTION
# for  a in range (1,23,10):
# #       print(a ,end = "  ")

# ROUND() FUNCTION
# print(round(25))
# print(round(14.03))
# print(round(15.1026))

# STR() FUNCTION
# s = str()
# print(s)
# s = str("nitin kumar prajapati")
# print(s)

# TYPE() FUNCTION
# a = ("nitin", "kumar ", "prajapati")
# b = ["nitin", "kumar ", "prajapati"]
# c = "nitin :5281", "kumar ", "prajapati"
# d = "nitin"
# e = 1205.2
# (print(type(a)))
# print(type(b))
# print(type(c))
# print(type(d))
# print(type(e))

# SLICE() FUNCTION
# string = "nitin kumar prajapati"
# s1 = slice(3)
# s2 = slice(2,4,2)
# print(string[s1])
# print(string[2])

# SORTED() FUNCTION
# x = ['n','i','t' ,'i','n']
# y = ('n','i','t' ,'i','n')
# z = "nitin kumar prajapati"
# a = {'n':3,'i':5,'t':4,'i':5,'n':6}
# b  = {'n','i','t' ,'i','n'}
# c = frozenset(('n','i','t','i','n'))
# print(sorted(x))
# print(sorted(y))
# print(sorted(z))
# print(sorted(a))
# print(sorted(b))
# print(sorted(c))

# NEXT() FUNCTION
# nkp = [12,65,11]
# nkp_iter = iter(nkp)
# while True:
#     item = next(nkp_iter, "end")
#     if item == "end":
#         break
#     print(item)

#  INPUT() FUNCTION
# name = (input("enter your name"))
# age = (input("enter your age"))
# print("name age",name,age)

# ISINTANCE() FUNCTION
# test_int= 48
# test_list = [11,56,14]
# print("integer "+ str(isinstance(test_int,int)))
# print("string "+ str(isinstance(test_int,str)))
# print("list "+ str(isinstance(test_list,int)))
# print("integer "+ str(isinstance(test_int,(list, int))))

# LAB EXERCISE
# to implement different types of built-in functions on different

# types of variables:
# x = 79
# y = 78
# z = 78451
# i = 789
# print(abs(x))
# print(abs(y))
# print(abs(z))
# print(abs(i))
# print(round(15415.23))
# print(round(125.23))
# print(bool(9))
# print(bool(None))
# print(bool("False"))
# print(pow(44,25))
# sample = (41,85,14,85)
# print(sorted(sample,reverse = True))
# dict = {'a':'b','c':'d'}
# print(sorted(dict,key = len))
# number = [16,91,96,81]
# numsum = sum(number)
# print(numsum)
# numsum2 = sum(number,66)
# print(numsum2)
# print(str("nitin kumar prajapati"))
# b = bytes('nitin',encoding = 'utf-8')
# print(str(b, encoding='ascii', errors = 'ignore'))
#completed





# unit 12
# Modules and Packages
# The Import Statement
# import math
# print("value of pi ", math.pi)

# import with renaming
# import sample as S

# S.say ("nitin")

# Python from...Import Statement
# from math import pi
# print("value of pi ",pi)

# Import All Names
#from math import *
# print("value of pi",pi)

# NAME SPACING
# g program shows the local and global variable:
# a =4 # global variable
# def function():
#     b= 5 # local variable
#     print("a= ",a)
#     print("b= ",b)
# function()
# print(a)

# INTRODUCTION TO PIP
# $ pip --version
# not work

# INSTALLING PACKAGES USING PIP
# accessdenied

# USING PYTHON PACKAGES
# , create a package named Laptop and build three modules in it namely, DELL, HP and ACER
# check other flies
#  lap.py not show any error not any code

#  LAB EXERCISE
# Create a python module and import it in a different python program file to demonstrate packages.

# Learn and code using pip to install, update and remove packages.
# ye wala nhi hora h ek baith k dekhna pdega

#completed



# Unit-13
# Numerical Python
# print("hello ")
# print("hello ")
# import numpy as np
#
# # Example: Create an array using numpy
# arr = np.array([1, 2, 3, 4])
# print(arr)
# # finally i got this

#  ARRAYS
# Creating Array in NumPy
# import numpy as np
# arr = np.array(["nitin","kumar","prajapati"])
# print(arr)

# import numpy as np
# arr = np.array([ [1,5,3],[ "nitin", "kumar", "prajapati"]])
# print(arr)
# 3 attribute matlab string name

# the array () function is used for creating multi-dimensional
# array:
# import numpy as np
# arr = np.array([["21,25,11"],["13,11,58"],["56,23,85"],["56,45,25"]])
# print(arr)

# Creating Array by using Empty Function
# import numpy as np
#  arr = np.empty(4,  dtype=int, order='C')
# print(arr)
#
# import numpy as np
# arr = np.empty(5,  dtype=float, order='c')
# print(arr)
#
# import numpy as np
# arr = np.empty(6,  dtype=bool, order='C')
# print(arr)
# yha pe order ka mtlb nhi samajh aaya

# Creating Array by using Zeros Function
# import  numpy as np
# # arr = np.zeros([4,4])#(row,column)
# # print(arr)

# Creating Array by using Arange Function
# import numpy as np
# # creating array with all range arguments
# arr1 = np.arrange(start=5, stop=55, step=5)
# print("output of first array is :",arr1)
# # creating array with two range arguments
# arr2=np.arrange(start=5, stop = 55)
# print("output of second array",arr2)
# # create array with one range argument
# arr3=np.arrange(10)
# print("output of third array",arr3)
# # creating array with negative arguments
# arr4=np.arrange(start=-55,stop =-5,step = 5)
# printd("output of fourth array",arr4)

# redo (abey copy paste mai run hora h lekin self code nhi run hora h)
# import numpy as np
# # Creating array with all the range arguments
# arr1=np.arange(start=5, stop=55, step=5)
# print("The output of first array is:",arr1)
# # Creating array with two range arguments
# arr2=np.arange(start=5, stop=55)
# print("The output of second array is:",arr2)
# # Creating array with one range argument
# arr3=np.arange(10)
# print("The output of third array is:",arr3)
# # Creating array with negative arguments
# arr4=np.arange(start=-55, stop=-5, step=5)
# print("The output of fourth array is:",arr4)

# Indexing
# import numpy as np
# arr = np.array([1,2,3,4,5])
# print("array is ",arr)#pycharm faltu mai mjje le rha h
# indexvalue = arr[2]
# print("indices value of the array at index 2 : ",indexvalue)

# Python program demonstrate the concept of indexing in a two-dimensional array:
# import numpy as np
# arr = np.array([["sec","ge ","vac"],["python","python 2","digital empoerment"]])
# print("array ",arr)
# indexvalue = arr[1,2]
# print("indices value array at index [3,2]",indexvalue)

#alternate

# import numpy as np
# arr = np.array([["Roll No.", "Name", "Father's Name"],[1,"nitin","prajapati"],[2,"chomu","chomu bhot bda"],[3,"ussey bda","constant learning"],[4,"ussey b bda","bhot bda "]])
# print("The array is",arr)
# indexvalue = arr[3,2] # This finds the array element at the index [3,2]
# print("The indices value of the array at index [3,2] is:",indexvalue)

# # Python program demonstrate the concept of indexing in a multi-dimensional array.
# import numpy as np
# arr = np.array([[11, 12, 13],[14, 15, 16]], [[17, 18, 19],[20, 21, 22]])
# print(arr)
# indexvalue = arr[1,0,1]
# print("indices value of array at index 1,0,1",indexvalue)

# import numpy as np
# arr = np.array([[[11, 12, 13], [14, 15, 16]], [[17, 18, 19], [20, 21,22]]])
# print(arr)
# indexvalue = arr[1,0,1] # This finds the array element at the index
# print("The indices value of the array at index [1,0,1] is:",indexvalue)
# bracket dyan do be

#  Slicing
# slice=array[start:end] syntax
# slice=array[start:end:step]

# slicing in a onedimensional array

# import numpy as np
# arr = np.array([1,2,3,4,5,6,7])
# print("array ",arr)
# slicevalue = arr[2:4]
# print("extracted",slicevalue)

# slicing for two-dimensional array
#slice=arr[startx:endx:stepx, starty:endy:stepy]
# import numpy as np
# arr = np.array([["chomu 1","chomu2","chomu3"],[1,"choota","suar"],[3,"nitin","kumar"],[4,"chupa","chupa2.0"]])
# slicevalue = arr[1:4, 1:3]
# print(arr)
# print("extracted array ",slicevalue)

# concept of slicing in multi-dimensional array.
# import numpy as np
# arr = np.array([[[11,12,13],[14,15,16],[17,18,19]],[[20,21,22],[23,24,25],[26,27,28]],[[29,30,31],[32,33,34],[35,36,37]]])
# print(arr)
# slicevalue = arr[0:2,0:2,1:2]
#
# print("extracted value",slicevalue)

# VECTORS
#  how to create a horizontal and a vertical vector:
# import numpy as np
# list1 = [101,102,103]
# list2=[[1110],
#        [1120],
#        [1130]]
# v1=np.array(list1)
# v2= np.array(list2)
# print("horizontal vector ",v1)
# print("vertical vector",v2)

# MATRICES
# how to create a matric in numpy:
# import numpy as np
# matric = [["s1","nitin","data analyst"],["s1","silansar","chomu friend"],["s3","chomu","fremd"]]
# v1 = np.asmatrix(matric)# np.mat ye purane version mai tha ab new version mai different h
# print("matrix",v1)

# DYNAMICALLY GENERATE MATRICES IN PYTHON
# generate matrices in numpy:
# a = 3
# b= 3
# matrix = [0] * a
# for i in range (a):
#    matrix [i] = [0] * b
# print(matrix)

# Obtaining Elements of Matrices
# List index:
# import numpy as np
# matric = [["s1001","Nitin","Manager"],["S1002","Kp","Sales"],["S1003","Nkp","Manager"]]
# v1 = np.array(matric)
# print (v1[2])
# print (v1[1][2]) # <> wrong syntax errror

# Negative indexing
# import numpy as np
# matric = [["s1001", " nitin ","data analyst"],["s1002", " kp ","business analyst"],["s1003", " nkp ","data scientist"]]
# v1 = np.array(matric)
# print(v1[2])
# print(v1[1][2])

# STANDARD LINEAR ALGEBRA OPERATIONS
# Vector Operations
# perform element-wise mathematical operations among two
#  equivalent vectors to produce a new vector that has the same length.
# import numpy as np
# list1 =[16,17,18,19]
# list2 =[12,13,15,1]
# v1 = np.array(list1)
# print("first vector is",str(v1))
# v2 = np.array(list2)
# print("second vector",str(v2))
# add = v1+v2
# print("additon of vectors",str(add))
# sub = v1-v2
# print("subtraction of vectors", str(sub))
# multiply = v1*v2
# print("multiply of vectors",str(multiply))
# divide = v1/v2
# print("division of vectors ",str(divide))
#  plust dont use it gives error

# Matrix Operations
# perform matrix operations:
# import numpy as np
# a = np.array([[5,7],[3,-10]])
# b = np.array([[1,-3],[30,26]])
# c = a + b
# print("additon  \n", c)
# print("mulitplication \n ",a.dot(b))
# print("transpose of a \n ",a.transpose())
# print("subtraction \n",a-b)
# print("division \n",a/(b))

# CONVERSION FROM ARRAY TO LIST OR TUPLE
# # convert the one-dimensional array into the list
# import numpy as np
# arr = np.array([20,30,40,50])
# print("array is ",arr)
# print(type(arr))
# list_array = arr.tolist()
# print("list is ",list_array)
# print(type(list_array))

# o convert the multidimensional array into list
# import numpy as np
# arr = np.array([["a","b","c"],["d","e","f"],["g","h","i"]])
# print("array \n",arr)
# print(type(arr))
# list_array= arr.tolist()
# print("list",list_array)
# print(type(list_array))

# convert the array into a tuple using the tuple()
# import numpy as np
# arr = np.array([[23,26],[56,45]])
# print("array\n ",arr)
# print(type(arr))
# tup = tuple([tuple(e) for e in arr])
# print("tuple is", (tup))
# print(type(tup))

# redo

# import numpy as np
# arr = np.array([[20, 23],[ 47, 35]])
# print("The array is:",arr)
# print(type(arr))
# tup = tuple([tuple(e) for e in arr])
# print("The tuple is:",tup)
# print(type(tup))

# convert the array into a tuple using the map()
# import numpy as np
# arr = np.array([[20,30],[56,45]])
# print("array ",arr)
# print(type(arr))
# tup = tuple(map(tuple, arr))
# print("tuple",tup)
# print(type(tup))

# redo copy paste
# import numpy as np
# arr = np.array([[20, 23],[ 47, 35]])
# print("The array is:",arr)
# print(type(arr))
# tup = tuple(map(tuple, array))
# print("The tuple is:",tup)
# print(type(tup))

# lab
# Write a python code that imports the NumPy library for array and matrix computations – add,
# subtract, multiply.
# import numpy as np
# a = np.array([[18,15],[21,60]])
# b = np.array([[88,12],[1,44]])
# c = a+b
# print("addition\n",c)
# print("multiplication\n" ,a.dot(b))
# print("multiplication\n" ,a.dot(b))
# print("subtraction\n" ,a-(b))
# print("division\n" ,a/(b))

# Write a python code to perform type conversion – array to list, array to tuple.
# import numpy as np
# arr = np.array([[1,2,3],["a","b","c"],["i","j","k"]])
# print("arrray is\n ",arr)
# print(type(arr))
# list_Array = arr.tolist()
# print("list is \n",list_Array)
# print(type(list_Array))
# tup = tuple(map(tuple,arr))
# print("tuple \n",tup)
# print(type(tup))  # not work as pdf
#completed




# Unit-14
# Object Oriented Programming - I

# Define a Class
# The syntax for creating a classis asfollows:
# class ClassName:

# #definition of the class#
# attributes
# constructor
# methods
# object(instance)

#  python programme depicts how a class is defined and an object is created:
# class employees:
#     def __init__(self):
#                     self.name = "nitin"
#                     self.role = "data analytics"
#                     self.another_role = "data science"
# # # instance method

#     def emp_details(self):
#                     print("hello i am ", self.name)
#                     print("my job role ", self.role)
#                     print("alternate role", self.another_role)

# # #  create instance to employee class
# e = employees()
# e.emp_details () # DOUBLE  underscore in "init"
# # CALL METHOD USING INSTANCE

# COPY PASTE
# class employee:
#         def __init__ (self):
#                 self.name= 'Yash'
#                 self.age= 35
#                 self.salary= 78000
# # this is an instance method.
#         def emp_details(self):
#                 print('Hello I am', self.name)
#                 print('My age is', self.age)
#                 print('My salary is', self.salary)
# # create an instance to employee class.
# e = employee()
# # call the method using the instance.
# e.emp_details()

# SELF-VARIABLE
# programme is used to self-variable keyword in Python:
# class bike():
#     def __init__ (self,model,engine):
#                         self.model = model
#                         self.engine = engine
#
#
#     def show(self):
#             print("model is ",self.model)
#             print("engine is ", self.engine)
#
#
# bajaj = bike("bajaj pulsar","2202cc")
# yamaha = bike(" yamaha456r ","27486cc")
# bajaj.show()
# yamaha.show()

# METHODS
# Instance Methods
# class  student:
#            def  __init__ (self,a = '' ,b = '',c= 0 ):
#                                self.name = a
#                                self.gender = b
#                                self.marks = int(c) # error was int
#
#            def display(self):
#                 print("hi ",self.name)
#                 print("you are ", self.gender)
#                 print("your marks ", self.marks)
#
#            def calculte(self):
#                 if (self.marks>=70):
#                     print("first grade")
#                 elif (self.marks>=50):
#                     print("second grade")
#                 elif(self.marks>=35):
#                     print("third grade")

# n = int(input("how many studens"))
# i = 0
# while (i<n):
#     name = input("enter name")
#     gender = input("gender")
#     marks = input("enter marks")
#     s = student(name,gender,marks)
#     s.display()
#     s.calculte()
#     i +=1
#     print('------')

# Class Method
#  programme is used to access the variable ‘age’ by using class method:

# class Person:
#     age = 25
#     @classmethod
#     def printAge(cls):
#         print("age is ", cls.age)
# Person.printAge()

# Static Methods
# programme is used to understand the concept of static method:
# class Myobject:
#     a = 0
#     def __init__(self):
#         Myobject.a= Myobject.a+1
#     @staticmethod
#     def coun_objects():
#         print("no of objects created",Myobject.a)
#
# obj1 = Myobject()
# obj2 = Myobject()
# obj3 = Myobject()
# obj4 = Myobject()
# Myobject.coun_objects()

# CONSTRUCTOR METHOD
# DEF INIT (SELF): # syntax
# python programme is used to show an example of default constructors:
# class books:
#     def __init__(self):
#         self.Book_Name = "python manager "
#     def print_book_Name(self):
#         print(self.Book_Name)
#
# objects = books()
# objects = books()
# objects.print_book_Name()

#  python programme is used to show an example of parameterised constructors:
# class add:
#     first = 0
#     second = 0
#     third = 0
#     def __init__(self,f,s):
#         self.first=f
#         self.second=s
#     def show(self):
#         print("first number"+ str(self.first))
#         print("second number" + str(self.second))
#         print(" addition of both number" + str(self.answer))
#     def calculate(self):
#         self.answer = self.first + self.second
#
# obj = add(150,2135)
# obj.calculate()
# obj.show()

# ABSTRACTION (hide the unnecessary data from the user)
# INHERITANCE
# Single-Level Inheritance
# syntax
# class class1:
# statement(s)
# class class2:
# statement(s)
#  Python code shows the single level inheritance:
# class Parent:
#     def func1(self):
#         print("funciton is in parent class")
# class Child(Parent):
#     def func2(self):
#         print("this is in child class")
# object = Child()
# object.func1()
# object.func2()

# Multilevel Inheritance
# class company :
#     def __init__(self, company):
#         self.company = company
#
# class BikeModel(company):
#     def __init__(self, bikemodel, company):
#         self.bikemodel = bikemodel
#
# super().__init__(company)
#
# class engine(BikeModel):
#     def __init__(self, engine ,bikemodel, company):
#          self.engine = engine
#
# super().__init__( BikeModel , company)
#                 def show(self):
#                     print("company",self.company)
#                     print("bike model", self.bikemodel)
#                     print("engine", self.engine)
# s1 = engine("12351cc","honda city","moye moye")
# print(s1.company)
# s1.show()

#copy paste
# Multilevel Inheritance
# class Company:
#     def __init__(self, company):
#         self.company = company
#
#
# class BikeModel(Company):
#     def __init__(self, bikemodel, company):
#         self.bikemodel = bikemodel
#         super().__init__(company)
#
#
# class Engine(BikeModel):
#     def __init__(self, engine, bikemodel, company):
#         self.engine = engine
#         super().__init__(bikemodel, company)
#
#     def show(self):
#         print("Company:", self.company)
#         print("Bike Model:", self.bikemodel)
#         print("Engine:", self.engine)
#
#
# # Example usage
# s1 = Engine("1235cc", "Honda City", "Hero Honda")
# s1.show()

# Multiple Inheritance
# Python code shows the multiple inheritance:
# class Bike1:
#     modelname1 = ("")
#     def bike(self):
#         print(self.modelname1)
# class Bike2:
#     modelname2 = ("")
#     def bike2(self):
#         print(self.modelname2)
# class Company(Bike1,Bike2):
#     def Company(self):
#         print("model name 1",self.modelname1)
#         print("model name 2", self.modelname2)
# b1 = Company()
# b1.modelname1 = "hornet"
# b1.modelname2 = "shine"
# b1.Company()

# Hierarchical Inheritance
# class Company :
#     def func1(self):
#         print("name of bike model is ")
# class Bike1(Company):
#     def func2(self):
#         print("hornet")
# class Bike2(Company):
#     def func3(self):
#         print("shine")
# obj1 = Bike1()
# obj2 = Bike2()
# obj1.func1()
# obj1.func2()
# obj2.func1()
# obj2.func3()

# Hybrid Inheritance
# class Company:
#     def function1(self):
#         print("name of bike model")
# class Bike1(Company):
#     def function2(self):
#         print("shine")
# class Bike2(Company):
#     def function3(self):
#         print("hornet")
# class Bike3(Bike1,Company):
#     def function4(self):
#         print("cb650")
# object = Bike3()
# object.function1()
# object.function2()

# POLYMORPHISM
# Duck Typing in Python
# x = "hello world"
# print(type(x))
# x =100
# print(type(x))

# Operator Overloading
# print(300+256)
# s1 = "python"
# s2 = "programming"
# print(s1+s2)

# Method Overloading
# class Shape:
#     def display(self, v= None,e=None,f=None):
#         if v!=None and e!=None and f!=None:
#             print("vertices ",v)
#             print("edges ", e)
#             print("faces ", f)
#         elif v!=None and e!=None:
#             print("vertices",v)
#             print("edges",e)
#         else:
#             print("you have enter either two or three arguments")
# print("display method is overload for square(2d)")
# square  = Shape()
# square.display(4,4)
# print("display method is overload for cube")
# cube = Shape()
# cube.display(3,4,6)

# lab
# programme to create a class and use objects to access class members and functions:
# class toc:
#     def __init__(self,title,price):
#         self._title = title
#
#         self._price = price
#     def _show(self):
#         print("book name",self._title)
#         print("book price ", self._price)
# class Author(toc):
#     def __init__(self,name,title,price):
#         toc.__init__(self,title,price)
#         self.name = name
#     def display(self):
#         print("author name ",self.name)
#         self._show()
# writer = Author("nitin","python",450)
# writer.display()

# a python script to implement inheritance using multiple classes and functions.
# class PC:
#     def PC_info(self,PC_Name,PC_Processor):
#         print("personal computer name ",PC_Name,"processor",PC_Processor)
# class Laptop:
#     def Laptop_info(self,Laptop_name,Laptop_processor):
#         print("laptop name",Laptop_name,"laptop processor",Laptop_processor)
# class Company(PC,Laptop):
#     def Company_info(self,Company_name,Location):
#         print("company name",Company_name,"location",Location)
#
# cmp = Company()
# cmp.PC_info('dell','i5')
# cmp.Laptop_info('lenevo ','i9')
# cmp.Company_info('constantlearning','Delhi')
#completed

# Unit-15
# Object Oriented Programming - II
# Self-Variable
# class Dog():
#
#         def __init__ (self,Breed):
#             self.breed = Breed
#         def Bark(self):
#             print(f"{self.breed} is Barking ")
# d = Dog("German shepherd")
# d.Bark()

#  python program is used to show an example of default constructors
# Constructor Method
# class books:
#         def __init__(self):
#             self.Book_Name = "python for nitin "
#         def print_Book_Name(self):
#             print(self.Book_Name) # chota error pura code barbaad
# objects = books()
# objects.print_Book_Name()

# PRINTING OBjECTS
# python program is used to implement object printing
# class HDFC :
#      def __init__(self,a,b):
#             self.a=a
#             self.b = b
#      def __repr__(self):
#             return "HDFC a : % s b : % s "% (self.a,self.b)
#      def __str__(self):
#          return "From str method of hdfc a is % s ,  b is % s " % (self.a,self.b)
#
# nitin = HDFC(2351,7890)
# t = nitin.a
# c  = int(t)
# print(c)

# redo
# class HDFC:
#         def __init__ (self, a, b):
#             self. a = a
#             self. b = b
#         def __repr__ (self):
#              return "HDFC a: % s b: % s" % (self. a, self. b)
#         def __str__ (self):
#              return "From str method of HDFC: a is % s, " \
#         "b is % s" % (self. a, self. b)
# t = HDFC (2345, 7890)
# print(t)
# print([t])

# THE INIT METHOD
# redo
# class Person:
# # Implementing init methoddef
#             def __init__ (self, name):
#                     self.name = name
#             def say_hi(self):
#                 print('Hello, My Name is', self.name)
# p = Person('nitin')
# p.say_hi()

# OPERaTOR OVERLOaDING
# print(12+56)
# print("hello "+ "kp")
# print(5*9)
# print("nitin"*5)

# POLYMORPHISM
#  Python program is used to show an example of inbuilt polymorphic functions
# print(len("function")) # string
# print(len([12,23,54])) # list

# user defined exception
# class MyError(Exception):
#         def __init__ (self, value):
#                 self.value = value
#
#         def __str__(self):
#             return(repr(self.value))
# try:
#     raise(MyError(6*2))
# # Value of Exception is stored in error
# except MyError as error:
#     print('A New Exception is: ',error.value)
# lab
# Write a python program to demonstrate class variables and instance variable and illustration of
# the self-variable.
# class Animal :
#     Terrestial = "tiger"
#     location = "jungle"
#     type = "carnivore"
#     population = 40000
# my_Animal = Animal()
# print("name of animal ", my_Animal.Terrestial)
# print(" animal is a  ", my_Animal.type)
# print(" animal  found in ", my_Animal.location)
# print("population of animal ", my_Animal.population)
# class student:
#          def __init__(self, id, Name, Age):
#                 self.id = id
#                 self.name = Name
#                 self.age = Age
# dbase = student(1235,"nitin kp ",19)
# print("student roll no ",dbase.id)
# print("student name ",dbase.name)
# print("student age  ",dbase.age)
#completed


# data mining sem4 unit 5
# Support (code having error)
# def calculate_support(transaction,itemset):
#     itemset_count = defaultdict(int)
#     for transaction in transaction:
#         if set(itemset).issubset(transaction):
#             itemset_count[itemset]+=1
#
#     support = itemset_count[itemset]/[len(transaction)]
#     return support
#
#
# transaction = ['milk','bread','butter'],
# ['milk','bread'],
# ['milk','bread','eggs']
# ['milk','bread','butter','eggs']
# ['milk','bread','butter']
# ['milk','bread','eggs']
# ['milk','bread','butter']
#
# itemset = ['milk','bread']
# support = calculate_support(transaction,itemset)
# print('support',support)


# Confidence(code having error)
# def calculate_confidence(transaction,rule):
#
#     itemsetitemset_count=defaultdict(int)
#     for transaction in transaction:
#         if set('antecedent').issubset(transaction):
#             itemsetitemset_count['antecedent']+=1
#         if set(rule).issubset(transaction):
#             itemset_count[rule]+=1
#
#     confidence = itemset_count[rule]/itemset_count[antecedent]
#     return confidence
#
# transaction = [['milk','bread','butter'],['milk','bread',],['milk','bread','eggs'],['milk','bread','butter','eggs'],['milk','bread','butter'],['milk','bread','eggs'],['milk','bread','butter']]
# confidence =calculate_confidence(transaction,rule)
# print('confidence',confidence)

# Lift
data = [['bread','butter'],
        ['bread', 'jam'],
        ['bread','butter','jam']
['bread','butter'],
        ['bread', 'jam'],
['Bread', 'Jam'],
['Bread', 'Jam'],
['Bread', 'Butter', 'Jam']

]
df =pd.Dataframe(data,columns=['items'])
frequent_itemsets = aprior()














