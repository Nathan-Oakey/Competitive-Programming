n = int(input())
print(n * (n + 1) // 2 if n >= 1 else 1 - (abs(n) * (abs(n) + 1) // 2))