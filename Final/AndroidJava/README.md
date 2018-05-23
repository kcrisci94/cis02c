Android java is not the same as Oracle’s java
Try with resources does not work in Android
Diamond operators work (List<string> myList = new ArrayList<>);
Android Development Steps: 
1.	First create your code and libraries 
2.	Use javac command to compile code into class Files
3.	Run it through proguard (optional, shortens code and makes it more difficult to decompile)
4.	Must be compiled into DEX file
Android doesn’t have it’s own virtual machine. It has it’s own runtimes. 
1.	DALVIC: converts code to machine code just-in-time Android 4.4 and earlier
2.	ART: converts code to machine code ahead of time (apps run quicker and smoother) Android 5+
Apps launch activity is defined in the manifest
Activity Lifecycle States and Callback Methods
onCreate(): created
onStart(): Started
onResume(): resumed
onPause(): Paused
onStop(): Stopped
onDestroy(): destroyed
Tips: 
avoid creating unnecessary objects (Android devices have limited memory)
static methods are 15 percent faster 
use constant ints in variable declarations to save a lot of memory over ENUMs
ex(public static final int Thing1 = 1; 64 bytes