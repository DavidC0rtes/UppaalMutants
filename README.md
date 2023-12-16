# Time for Networks: Mutation Testing for Timed Automata Networks

This repository contains the tools used in the article to perform MBMT in UPPAAL NTAIO models.

## Requirements

In order to use the tool you must have the following tools installed :

- OpenJDK 11
- UPPAAL 5.0

However, our tool may run on other versions of java. 
Although in case of problems, we recommend using this version.

## UppaalMutants
Mutates the specified model using the given mutation operators.

### Usage
To use the Model-Based Mutation Testing prototype, follow the instructions:
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
 -broadChan                Enable broadChan operator. Adds the broadcast
                           prefix to an existing channel.
 -delSync                  Enables the DelSync operator. Deletes an
                           arbitrary input action.
 -syncSeq                  Enables the SyncSeq operator. Two parallel
                           actions become sequential.
 -maskVarClocks            Enables the maskvar operator over clocks.
 -maskVarChannels          Enables the maskvar operator over channels.
 -urgChan                  Enable the urgChan operator. Adds the urgent
                           prefix to an existing channel.
 -commLoc                  Enables the commLoc operator. One location
                           becomes commited.
 -urgLoc                   Enables the urgLoc operator. One location
                           becomes urgent.
 -env <action>             Specify the name of the automaton to make the
                           mutants
 -all                      Enables all operators.
```
#### Example
`java -jar UppaalMutants.jar -m=CA.xml -all -p=Mutant/CA`
## NTAMorphosis
This tool can perform a bisimulation comparison between sets of mutants and a given model, by calling a 
3rd party bisimulation algorithm, usually loaded via CLI argument.
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
`java -jar NTAMorphosis.jar -m=CA.xml -dir=src/CA-mutants -dup -csvb=reports/ca-dups-nta.csv`
