d = {}
n = int(input())
for i in range(n):
    s = input().split(" ")
    if s[0] in d: 
        if int(s[1]) in d[s[0]]: d[s[0]][int(s[1])] += 1
        else: d[s[0]][int(s[1])] = 1
    else: d[s[0]] = {int(s[1]) : 1}

for i in sorted(d):
    m = 0
    mk = None
    for j in d[i]:
        if d[i][j] > m or (d[i][j] == m and j < mk):
            m = d[i][j]
            mk = j
    
    print(i, mk)
