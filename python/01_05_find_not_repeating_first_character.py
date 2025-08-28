input = "abadabac"

def find_not_repeating_first_character(string):
    counter = {}

    for ch in string:
        if ch in counter:
            counter[ch] += 1
        else:
            counter[ch] = 1

    for ch in string:
        if counter[ch] == 1:
            return ch
    return "_"


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 =_ 현재 풀이 값 =", result("aaaaaaaa"))