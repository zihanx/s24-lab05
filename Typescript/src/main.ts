
/**
 * Main class for Recitation 5. This can be used as sandbox to experiment in.
 * @author Nora Shoemaker
 *
 */

import { InheritanceSortedIntList } from "./InheritanceSortedIntList";
import { IntegerList } from "./IntegerList";


/**
 * A helper function that prints out the contents of an IntegerList.
 * @param list IntegerList to be printed out.
 */
function printList(list: IntegerList) {
    console.log();
    for (let i = 0; i < list.size(); i++) {
        process.stdout.write(list.get(i).toString());
        process.stdout.write(", ");
    }
    console.log();
}

export { printList };