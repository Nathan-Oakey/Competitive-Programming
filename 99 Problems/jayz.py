n = int(input())
if (n < 149): print(99)
else: 
    m = n // 100
    r = n % 100
    if r < 49: r = -1
    else: r = 99
    print(int(m * 100) + r)