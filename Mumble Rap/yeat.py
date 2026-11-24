import re
input()
n = list(map(int, re.findall(r"\d+", input())))
print(max(n))
