# Spring Batch Processing

Spring Batch is the core module of spring framework and using this spring batch you can create robutch ***batch processing system***.

**USECASE:** For example we are having a **billing analysis system**, where we are having a csv file as a sourc file and database, where we have to dump this csv file , if we have to do manually then we need to write insert statment for each and ervery racord in the csv.<br><br>

For the **report generation**, like database is your source and csv file is as a destination<br>

**Job Launcher** -> **Job** -> **Step** -| **ItemReader** -> read the data from the source file (csv) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;-| **ItemProcessor** -> will help to process the data povide by the itemReader<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;-| **ItemWriter** -> will help to write the data in the destination (database)<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>
**Job Reposistory**(which hold the inforamtio of the state of whether a job is failed or success)<br>

A job Can have multiple steps.
