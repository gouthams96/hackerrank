#!/bin/python3
import math
def viralAdvertising(n):
    people = 5
    total = 0
    for i in range(0,n):
        liked  =  int(math.floor(people/2))
        total  += liked
        people = liked * 3
    return total
if __name__ == '__main__':
    days = int(input())
    print (viralAdvertising(days))
