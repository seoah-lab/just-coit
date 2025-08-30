input = 20

# for x in ["위스키","위스키","위스키"]:
#     if x != "위스키":
#         break
# else:
#     print("그럼 위스키")

# 소수는 자신외 1외에는 나눌수 없다.
# N 제곱근 보다 크지 않은 어떤 소로도 나누어 떨어지지 않는다.

def find_prime_list_under_number(number):
    prime_list = []

    for n in range(2, number + 1): 
        # print(n)
        for i in prime_list:
            if i * i <= n and n % i == 0:
                break;
        else:
            prime_list.append(n)
    return prime_list


result = find_prime_list_under_number(input)
print("[2, 3, 5, 7, 11, 13, 17, 19]")
print(result)