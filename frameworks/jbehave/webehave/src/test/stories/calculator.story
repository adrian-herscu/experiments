Meta:
@toplevel

Narrative: 
In order to verify the full functionality of the bridge
As a developer
I want to use it for testing more complex Web page interactions

Scenario: Doing arithmetics on two numbers on a calculator page
yields the right result

Given url is set to 'calculator page'

When clicking <First_Operand>
And clicking  <Operator>
And clicking  <Second_Operand>
And clicking equal

Then display value should be <Result>

Examples:
| First_Operand | Operator | Second_Operand | Result |
| 7             | +        | 1              | 8      |
| 9             | -        | 2              | 7      |
| 0             | multiply | 3              | 0      |
| 1             | divide   | 2              | 0.5    |
