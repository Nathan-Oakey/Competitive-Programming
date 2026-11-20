s = input()
print("correct") if s[((len(s) - 1) // 2)] == '(' and s[(len(s) // 2)] == ')' else print("fix")