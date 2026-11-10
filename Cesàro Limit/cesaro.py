n = input()
l = input().split()

s = sum(map(int, l))

if s < 0:
    print("-INFINITY")
elif s > 0:
    print("INFINITY")
else:
    su = 0
    sumTotal = 0
    for i in range(len(l)):
        su += int(l[i])
        sumTotal += su
    print(sumTotal / int(n))




