nm = input().split(" ")
t = 0
for i in range(int(nm[1])): t += int(input())
print(1) if t % int(nm[0]) == 0 else print(0)