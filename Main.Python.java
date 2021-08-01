import random
#תשובה לשאלה 1

number = 4
mp = (12 * 12)
f = 2.4
word = 'Hello'
print(number)
print(mp)
print(f)
print(word)

# תשובה לשאלה 2
name = "Sanaz"
print(len(name))

print(name.upper())

print(name.casefold())

print(name[0])

print(name.count('a'))

# שאלה 3
txt = "My name is {name} "
print(txt.format(name='Sanaz'))


name = 'Sanaz'
fstring = f'My name is {name}.'
print(fstring)



#שאלה 4
def add_calc(a=0, b=0):
    return a+b


a = int(input())
b = int(input())

print(add_calc(a,b))


#שאלה 5:
number = int(input())
if number %2 == 0:
    print('zugi')
else:
    print('i zugi')


#שאלה 6:
list = [1 , 2 , 3 , 4 , 5]
list.append(6)
print(list)
print(sum(list))


# שאלה 7:
film_list = ['Tom and Jerry', 'Dambo', 'Pinokiyo', 'Avatar', 'Halleliuyah']
my_lovely_film = 'Avatar'
if my_lovely_film in film_list:
    print("I Love Avatar")
else:
    print('no avatar')




#שאלה 8
my_randoms = random.sample(range(1, 101), 10)
print(my_randoms)

for hiuvi in my_randoms:
    if hiuvi > 0:
        print("חיובי")
    elif hiuvi < 0:
        print('שלילי')
    else:
        print('אפס')

 # שאלה 12
for n in range(0, 51, 3):
    print(n)

# שאלה 14
x = random.randint(1,10)
y = input('אנא נחש מספר')
if y == x:
    print('Very good')
else:
    print("Wrong")

print(x)

#שאלה 15
def double_it(x=0):
    return x * 2

number = double_it(2)
print(number)

# שאלה 19
my_tuple = ('I', 'Love', 'Java')
my_tuple[0] = "We"

#שאלה 18

my_list_dic = {"הקוסם מארץ עוץ":402, "לילה מאוחר": 357,"הללויה": 805,"שבלולון": 154, "שלוש בלילה": 244}
def my_dic(key):
    keys = my_list_dic.keys()
    if key in keys:
        print(my_list_dic[key])
    else:
        print("dosen't exist")

my_dic("הקוסם מארץ עוץ")
