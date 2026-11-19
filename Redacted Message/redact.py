s = input()
m = input().split(" ")
o = ""
for i in m:
    r = False
    for c in i:
        if c in s: 
            r = True
            break
    o += '*' * len(i) if r else i
    o += " "
print(o.rstrip())