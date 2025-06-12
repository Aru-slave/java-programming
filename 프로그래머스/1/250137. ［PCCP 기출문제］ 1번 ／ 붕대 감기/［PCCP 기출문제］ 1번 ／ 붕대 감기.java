class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
    //1. t초동안 붕대를 감으면 1초마다 x만큼 체력 회복
    //2. t초동안 붕대 감기 성공 -> y만큼 체력 추가 회복
    //3. 붕대 감는 동안 몬스터한테 공격 당함 -> 초기화
    //4. 체력은 최대 체력 초과 불가
    //5. 주어진 정보 [시전 시간, 초당 회복량, 추가 회복량], 최대 체력, [시간, 데미지]
        int time = 0;//총 경과 시간
        int duration = 0;//붕대 감는 지속 시간
        int maxHealth = health;
        int index = 0;
        while(index < attacks.length)
        {
            System.out.println(time);

            if(attacks[index][0] == time)
            {
                health -= attacks[index][1];
                if(health <= 0) return -1;
                duration = 0;
                index++;
                duration++;
                time++;
                System.out.println(health);
                continue;
            }
            if(duration == bandage[0])
            {
                health += bandage[2];
                health += bandage[1];
                duration = 0;
                duration++;
                time++;
                if(health > maxHealth)
                    health = maxHealth;
                continue;
            }
            health += bandage[1];
            
            if(health > maxHealth)
                health = maxHealth;
            System.out.println(health);
            time++;
            duration++;
        }
        return health;
    }
}