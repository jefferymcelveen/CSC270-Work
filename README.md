# Narrative of the Life of Frederick Douglass,

A citable digital edition.

**Status**: <span style="color: red;">In progress</span>.

## Bibliography

Text: `urn#urn:cite2:cex:fufolio.2019a:texts`

*Narrative of the Life of Frederick Douglass: An American Slave*, by Frederick Douglass. Released in 2006.

Plain-text, citable edition following the protocols of the [CITE Architecture](http://cite-architecture.org).

Edited, 11/5/2019

## Running Scripts for Validation, Publication, and Analysis

This repository is an SBT project for running Scala code. Everything should be reproducible.

### Requirements

- A Java JDK 1.8 or higher.
- [SBT](https://www.scala-sbt.org) Installed and on the PATH.

### Running

- Clone this repository.
- Navigate to this repository's root level.
- `$ sbt console`
- `scala> :load scripts/corpus-char-validation.sc`
- etc.

## Character Validation

The text has been machine validated as to character-set using [a Scala script](https://github.com/Eumaeus/CSC-270-Work/blob/master/scripts/corpus-char-validate.sc). The following is a complete inventory of the characters present in this text:

| Character | Character | Character | Character | Character |
|-----------|-----------|-----------|-----------|-----------|
| `space` (20) | `!` (21) | `"` (22) | `&` (26) | `'` (27) |
| `(` (28) | `)` (29) | `*` (2a) | `,` (2c) | `-` (2d) |
| `.` (2e) | `1` (31) | `2` (32) | `3` (33) | `4` (34) |
| `5` (35) | `8` (38) | `:` (3a) | `;` (3b) | `?` (3f) |
| `A` (41) | `B` (42) | `C` (43) | `D` (44) | `E` (45) |
| `F` (46) | `G` (47) | `H` (48) | `I` (49) | `J` (4a) |
| `K` (4b) | `L` (4c) | `M` (4d) | `N` (4e) | `O` (4f) |
| `P` (50) | `R` (52) | `S` (53) | `T` (54) | `U` (55) |
| `V` (56) | `W` (57) | `X` (58) | `Y` (59) | `a` (61) |
| `b` (62) | `c` (63) | `d` (64) | `e` (65) | `f` (66) |
| `g` (67) | `h` (68) | `i` (69) | `j` (6a) | `k` (6b) |
| `l` (6c) | `m` (6d) | `n` (6e) | `o` (6f) | `p` (70) |
| `q` (71) | `r` (72) | `s` (73) | `t` (74) | `u` (75) |
| `v` (76) | `w` (77) | `x` (78) | `y` (79) | `z` (7a) |
