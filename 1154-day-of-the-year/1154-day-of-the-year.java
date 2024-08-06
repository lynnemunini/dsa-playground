class Solution {
    public int dayOfYear(String date) {
        String[] dateArray = date.split("-");
        List<Integer> days = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);
        int dayNum = 0;

        if (month > 1) {
            boolean isLeapYear = false;
            int year = Integer.parseInt(dateArray[0]);

            if (year % 4 == 0 && year % 100 != 0) isLeapYear = true;
            else if (year % 400 == 0) isLeapYear = true;
            else isLeapYear = false;

            if (isLeapYear) {
                days.set(1, days.get(1) + 1);
            }

            for (int i = 0; i < month - 1; i++) {
                dayNum += days.get(i);
            }
        }
        dayNum += day;
        return dayNum;
    }
}