s = input()
a = 0
g = s.startswith("-")
if g: s = s[1:]
if "." in s: 
    a = len(s) - s.index(".") - 1
    s = s.replace(".", "")

r = []
c = 0

for b in s: 
    n = c * 10 + int(b)
    r.append(str(n // 2))
    c = n % 2

r = "".join(r)

r = r.lstrip("0") or "0"

if c: 
    r += "5"
    a += 1

while len(r) <= a:
    r = "0" + r

if a > 0:
    r = r[:-a] + "." + r[-a:]

if g and r.strip("0.") != "":
    r = "-" + r

print(r)