n = int(input())
t = 0
for _ in range(n):
    s = input()
    t += pow(int(s[:-1]), int(s[-1]))
print(t)