import math
a = 0
c = 2
while (a < 100):
    p = True
    for i in range(2, math.isqrt(c) + 1):
        if c % i == 0: 
            p = False
            break
    if p: 
        print(c)
        a += 1

    c += 1
