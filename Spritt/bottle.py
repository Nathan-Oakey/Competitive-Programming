c, b = input().split()
s = 0
for _ in range(int(c)): s += int(input())
print("Jebb" if s <= int(b) else "Neibb")