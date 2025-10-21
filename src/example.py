"""
Example Python module for testing purposes.
"""

def greet(name):
    """
    Return a greeting message.
    
    Args:
        name (str): The name to greet
        
    Returns:
        str: A greeting message
    """
    return f"Hello, {name}!"


def add_numbers(a, b):
    """
    Add two numbers together.
    
    Args:
        a (int/float): First number
        b (int/float): Second number
        
    Returns:
        int/float: Sum of the two numbers
    """
    return a + b


def multiply_numbers(a, b):
    """
    Multiply two numbers together.
    
    Args:
        a (int/float): First number
        b (int/float): Second number
        
    Returns:
        int/float: Product of the two numbers
    """
    return a * b


if __name__ == "__main__":
    # Example usage
    print(greet("World"))
    print(f"2 + 3 = {add_numbers(2, 3)}")
    print(f"4 * 5 = {multiply_numbers(4, 5)}")
