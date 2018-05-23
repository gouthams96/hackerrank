n = int(input())
dictionary = {}

while n > 0:
    record = input().split(" ")
    name = str(record[0])
    math = float(record[1])
    phy  = float(record[2])
    che  = float(record[3])
    avg = format(((math+phy+che)/3),'.2f')
    dictionary[name] = avg
    n -= 1


student = input()
if student in dictionary:
    print(dictionary[student])

