def handshake(people):
	totalhandshake = 0
	for i in range(1,people):
		totalhandshake += people - i
	return totalhandshake

n = int(raw_input().strip())
for i in range(n):
	people = int(raw_input().strip())
	print handshake(people)
