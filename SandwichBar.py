# Note: this function name should be `which_order` (in snakecase) <https://www.python.org/dev/peps/pep-0008/>
def whichOrder(available, orders):
  ingredients = set(available)

  for i, order in enumerate(orders):
    request = set(order.split(" "))

    if ingredients >= request:
      return i

  return -1
