import itertools


def fizzbuzz():
    for i in itertools.count(1):
        if i % 15 == 0:
            yield "FizzBuzz"
        elif i % 3 == 0:
            yield "Fizz"
        elif i % 5 == 0:
            yield "Buzz"
        else:
            yield i

if __name__ == "__main__":
    for s in itertools.islice(fizzbuzz(), 100):
        print(s)
