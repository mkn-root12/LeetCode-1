package _134;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int tank = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                total += tank;
                tank = 0;
            }
        }

        return (total + tank) < 0 ? -1 : start;
    }
}
