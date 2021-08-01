import school
import pytest


def test_calculate_avarage():
  assert school.calculate_avarage(6, 9, 9, 4) == 7
  assert school.calculate_avarage(0, 0, 0, 0) == 0
  assert school.calculate_avarage() == 0


def test_add_bonus():
   assert school.add_bonus[6, 9, 9, 4] == [(6+5), (9+5) , (9+5) , (4+5)]
   assert school.add_bonus[0, 0, 0, 0] == [(0 + 5), (0 + 5), (0 + 5), (0 + 5)]


def test_get_resault():
    assert school.get_resault(62) == "pass"
    assert school.get_resault(60) == "pass"
    assert school.get_resault(69) == "pass"
    assert school.get_resault(70) == "Good"
    assert school.get_resault(79) == "Good"
    assert school.get_resault(75) == "Good"
    assert school.get_resault(80) == "Very Good"
    assert school.get_resault(99) == "Very Good"
    assert school.get_resault(90) == "Very Good"
    assert school.get_resault(100) == "Excellent"
    assert school.get_resault(59) == "fail"
