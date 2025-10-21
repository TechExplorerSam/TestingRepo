"""
Unit tests for example.py module.
"""

import sys
import os

# Add the src directory to the path
sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..', 'src'))

from example import greet, add_numbers, multiply_numbers


def test_greet():
    """Test the greet function."""
    assert greet("Alice") == "Hello, Alice!"
    assert greet("Bob") == "Hello, Bob!"
    print("✓ test_greet passed")


def test_add_numbers():
    """Test the add_numbers function."""
    assert add_numbers(2, 3) == 5
    assert add_numbers(-1, 1) == 0
    assert add_numbers(0, 0) == 0
    assert add_numbers(10, 20) == 30
    print("✓ test_add_numbers passed")


def test_multiply_numbers():
    """Test the multiply_numbers function."""
    assert multiply_numbers(2, 3) == 6
    assert multiply_numbers(-1, 5) == -5
    assert multiply_numbers(0, 10) == 0
    assert multiply_numbers(4, 5) == 20
    print("✓ test_multiply_numbers passed")


if __name__ == "__main__":
    print("Running tests...")
    test_greet()
    test_add_numbers()
    test_multiply_numbers()
    print("\nAll tests passed! ✓")
