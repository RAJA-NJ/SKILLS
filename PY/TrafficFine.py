# -*- coding: utf-8 -*-
"""
Created on Thu Mar  5 18:46:31 2026

@author: RAJA

traffic management fine system

"""

speed = int(input("Enter vehicle speed: "))

if speed <= 60 :
    print("No Fine...")
elif speed > 60 and speed <= 80 :
    print("Warning...")
elif speed >= 81 :
    print("Fine!!!")
