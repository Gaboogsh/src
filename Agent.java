public class Agent {
    String name;
    int age;
    double sales;

    public Agent(String name, int age, double sales) {
        this.name = name;
        this.age = age;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSales() {
        return sales;
    }

    public static double averageAgent(Agent[] agentArr) {
        double sum = 0;
        double average = 0;

        for (int i = 0; i < agentArr.length; i++) {
            sum += agentArr[i].getSales();
        }
        average = sum / agentArr.length;
        return average;
    }
    public static Agent highestAgent(Agent[] agentArr) {
        Agent highestAgent = agentArr[0];

        for (int i = 0; i < agentArr.length; i++) {
            if (agentArr[i].getSales() > highestAgent.getSales()) {
                highestAgent = agentArr[i];
            }
        }
        return highestAgent;
    }


}
