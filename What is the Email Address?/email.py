s = input().split(" ")
s1 = s[-1].split("@")
s2 = s1[0].split("+")
print(s2[0] + "@" + s1[-1])