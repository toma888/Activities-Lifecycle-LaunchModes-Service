# Activities-Lifecycle-LaunchModes-Service
It is the implementation of Basic Android Task:
1.	Create 4 activities (Activity1, Activity2, Activity3, Activity4), that could be launched step by step using single Button 
on each activity. 
Each activity must have title with its name and two buttons – go forward, go back. Go forward must open next activity, go back – 
previous one. Forward on Activity4 must navigate to Activity1.
2. Create custom application class, which will contain lifecycle listener for activities.
3. Print to Log all activities lifecycle calls in this custom app class without implementing logs directly in activities.
4. Using launch modes, make next behavior of app navigation:
-> is Forward press
<- is Back press
Activity1->Activity2->Activity3->Activity4->Activity1->Activity2 <- Activity1 <- App is closed
5. Create two new activities called MenuActivity and ServiceActivity. Make app launch from MenuActivity by default and add there two buttons: “First part” and “Second part”.
“First part” click must navigate to Activity1
“Second part” must navigate to ServiceActivity
6. Create separate Service with binder, that will handle counter member variable. 
Also, create Binder implementation for this service, that will provide public 
int getHowManyTimesWasAccessed() method. This method will return current counter value and increment it.
7. Start created service from ServiceActivity. 
Add button, by pressing on it Activity will ask service how many times counter was already accessed and 
show this value in Toast message.


