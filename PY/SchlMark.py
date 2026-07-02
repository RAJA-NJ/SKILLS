# -*- coding: utf-8 -*-
"""
Created on Thu Mar  5 18:53:59 2026

@author: RAJA

school mark system

"""
def avg(m1,m2,m3):
    avg=m1+m2+m3/m3
    return avg

mark1=int(input("Enter Sub 1 mark: "))

mark2=int(input("Enter Sub 2 mark: "))

mark3=int(input("Enter Sub 3 mark: "))

result=avg(mark1,mark2,mark3)

print(result)