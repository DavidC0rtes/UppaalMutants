# Time for Networks: Mutation Testing for Timed Automata Networks

This repository contains the tools used in the article to perform MBMT in UPPAAL NTAIO models.

## Requirements

In order to use the tool you must have the following installed :

- OpenJDK 11
- UPPAAL 5.0
- Unix-like OS

However, our tool may run on other versions of java. 
Although in case of problems, we recommend using jdk 11.

## Installation
Before proceeding please unzip the contents of [bisimulation.zip](https://unamurbe-my.sharepoint.com/:u:/r/personal/david-santiago_cortescortes_student_unamur_be/Documents/bisimulation.zip?csf=1&web=1&e=3mmahs) into the tools directory, e.g:
```
cd tools & unzip bisimulation.zip
```
This will unzip the bisimulation tool as well as all it's dependencies.

## UppaalMutants
Mutates the specified model using the given mutation operators.

### Usage
```
usage: java -jar MutationUppaal.jar [OPTION]...
Where [-m <file>] model is a required option
If [-q <file>] query is missing, the execution of verifyta will be done
only with the model

 -h,--help                 Shows this help screen.
 -m,--model <path>         Required argument, specifies the file
                           containing the model to mutate.
 -q,--query <path>         Specifies the query file containing the
                           properties of the model.
 -v,--verifyTa <path>      Specifies the path where the uppaal verifyta
                           file is located to verify models.
 -p,--pathMutants <path>   Specifies the folder path where the mutants
                           will be located and the log file (if it is
                           indicated).
 -l,--log                  Produce a file that contains a record of
                           generated mutants in mutant folder.
-all                       Enables all operators.
-m,--model <path> is a required option
Try `java -jar MutationUppaal.jar -h' for more information.
```
#### Example
The following example will use all of the proposed operators to generate the mutants, using the Collision Avoidance (CA) case study
as input, and saving them in `mutants/ca`: 

```
java -jar tools/UppaalMutants.jar -m=models/ca.xml -all -p=mutants/ca
```
## NTAMorphosis
This tool can perform a bisimulation comparison between sets of mutants and a given model, by calling a 
3rd party bisimulation algorithm.

On your first usage, the application will prompt you for the verifyTa binary path (shipped with UPPAAL) and for the bisimulation tool's path (shipped with this repo).
Those paths will be saved in `./app.properties` for future reference. 

PS: to quickly find out the location of verifyTa's binary:
```bash
which verifyta
```

### Usage
```
Usage: NTAMorphosis [-htV] [-dup] [-eq] [--[no-]gui] [-csvb=<csvBisim>]
                    [-csvt=<csvTracesPath>] [-dir=<outPath>] [--how=<strategy>]
                    [-m=<model>] [--td=<tracesDir>] [-op=<operators>]...
                    [[-n=<nTraces>] [-k=<timeBound>]]
    -csvb, --csv-bisim=<csvBisim>
                             Path to the output CSV file for bisimulation
                               results.
    -dir, --mutants-dir=<outPath>
                             Directory containing mutant files.
    -dup, --duplicates     Compute bisimulation between mutants.
    -eq, --equivalent      Compute bisimulation w/ respect to the original
                               model.
  -h, --help                 Show this help message and exit.
  -m, --model=<model>        Path to model's file.
  -b, --bisim-tool           Path to bisimulation jar.
  -V, --version              Print version information and exit.
```
#### Example
To run the CA case study:
```
java -jar tools/NTAMorphosis.jar -m=models/ca.xml -dir=mutants/ca -dup -csvb=ca-report.csv
```
