l = ["abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]
n = int(input())
for _ in range(n):
    s = input().lower()
    t = ""
    for c in s:
        for i in range(len(l)):
            if c in l[i]: 
                t += str(i + 2)
                break
    print(t)