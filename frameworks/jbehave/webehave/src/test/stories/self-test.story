Meta:
@toplevel

Narrative: 
In order to quickly verify the functionality of the bridge
As a developer
I want to use it for testing a simple Web page interaction

Scenario: Clicking a test button on a test page should pop up an alert box.

Given url is set to 'test page'

When clicking test

Then alert text should be 'ok'

Then wait 1 seconds since now

When clicking alert ok

Then alert should not exist
And do-nothing is fine according to:
arg1 | arg2
0    | 1
