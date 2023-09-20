# Inheritance and Delegation

This repository is set up for discussion on relative strengths and weaknesses of 
`inheritance` and `delegation` in 17214 23 fall recitation 05.

Lab05 Handout can be found at: [https://github.com/CMU-17-214/f2023/blob/main/labs/lab05.md](https://github.com/CMU-17-214/f2023/blob/main/labs/lab05.md)


# Guide on Testing Infrastructure in Jest and TypeScript

Guide for testing with _Jest_ (_ts-jest_ to be precise), automated through _npm_.

Note how _Jest_ is set up in `package.json`: It adds development dependencies for `jest`, `ts-jest` and `@types/jest` (all three needed for _Jest_ in _TypeScript_). It also adds a `test` script to tell npm what to execute with `npm test`.

Finally `jest.config.js` indicates to _Jest_ where to find the tests.

----

You will likely want to explore IDE integration for test execution and coverage in your IDE, but also ensure that tests still execute with *npm* in a Continuous Integration environment (e.g. github actions).

The following commands might be useful:
* `npx ts-standard --fix` fix style problem (e.g. indentation, single quotes)
* `npm install` install all dependencies, including TypeScript and Jest.
* `npm test` runs jest and prints a coverage report. It also creates a html report in `coverage/lcov-report/index.html`
* `npx jest --watch --collect-coverage` runs Jest from the command line with extra arguments, here to continue watching for changes (will rerun tests immediately when changes in files are detected) and reporting coverage


