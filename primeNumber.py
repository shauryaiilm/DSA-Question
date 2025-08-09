def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, n//2):
        if n % i == 0:
            return False
    return True

number = 29
if is_prime(number):
    print(f"{number} is prime.")
else:
    print(f"{number} is not prime.")
