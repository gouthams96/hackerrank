n = int(input())
pylist = []
while n > 0:
    command = input().split(" ")
    if "pop" in command:
        pylist.pop()

    if "print" in command:
        print(pylist)

    if "insert" in command:
        pylist.insert(int(command[1]),int(command[2]))

    if "append" in command:
        pylist.append(int(command[1]))

    if "remove" in command:
        pylist.remove(int(command[1]))

    if "reverse" in command:
        pylist.reverse()

    if "sort" in command:
        pylist.sort()

    n = n - 1
