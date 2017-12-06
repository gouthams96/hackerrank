def array_sum(array,size):
	sum = 0
	for num in range(int(size)):
		sum += int (array[num])
	print sum

size = raw_input().strip()
array = raw_input().strip().split(" ")
array_sum(array,size)
