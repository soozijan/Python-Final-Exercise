# שאלה 22

def calculate_avarage(list):
    resault = sum(list) / len(list)
    return resault

def add_bonus(list):
    list_bonus = []
    for n in list:
       list_bonus.append(n+5)

    return list_bonus


def get_resault(number):
    if number >= 60 and number <= 69:
        return "pass"
    elif number >= 70 and number <= 79:
        return "Good"
    elif number >= 80 and number <= 99:
        return "Very Good"
    elif number == 100:
        return "Excellent"
    else:
        return "fail"



print(calculate_avarage([65, 84,99,10,58]))

print(add_bonus([65,84,99,10,58]))


print(get_resault(57))
