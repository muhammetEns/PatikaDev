import java.util.*;


public class backEnd
    {
        Scanner input=new Scanner(System.in);
        ArrayList<String> clubs=new ArrayList<>();// Takımların ekleneceği arrayList
        ArrayList <String >coupleTeams=new ArrayList<>();// Fikstüre eklenmiş olan takımların eklendiği arrayList
        int fixtureValue=0;// O hafta takım sayasına göre kaç adet maç oynanacağını belirleyecek sayaçta kullanılacak sayaç(ileride anlatılacak)

        Random random=new Random();


        public void run()
        {

            boolean status=true;
            while (status)
            {

                System.out.println("""
                Lütfen yapmak istediğiniz işlemi seçiniz:\s
                1-Takım ekleme
                2-Fikstür oluşturma
                0-Çıkış""");

                System.out.println("--------------------");
                int choose=input.nextInt();


                switch (choose) {
                    case 1 -> {
                        System.out.print("Eklenecek olan takımın adını giriniz: ");
                        input.nextLine();
                        String clubName = input.nextLine();
                        clubs.add(clubName);
                        System.out.println("Takım eklendi: " + clubs.get(clubs.size() - 1));
                        System.out.println("--------------------");
                    }
                    case 2 -> createFixture();
                    case 0 -> status = false;
                    default -> System.out.println("Lütfen geçerli bir işlen giriniz..");
                }
            }
        }


        public void createFixture()
        {
            if (clubs.size()%2!=0)//Takım sayısı 'Bay' adında takım
                clubs.add("Bay");


            for (int i=0;i<clubs.size()-1;i++)//kulüp sayısının 1 eksiğinin 2 katı kadar fixtür olacaktır
            {
                String away;
                String home;
                int matchQuality=0;
                String selectedTeams="";// bir sonraki haftaya geçildiği için seçilen takımlar listesi boşaltılır(Kullanım amacı aşağıdadır)




                while (matchQuality<clubs.size()/2)//ilgilil haftada maç sayısının yarısı kadar maç vardır
                {
                    away=clubs.get(random.nextInt(clubs.size()));//random bir takım
                    home=clubs.get(random.nextInt(clubs.size()));//random bir takım
                    if (!away.equals(home))
                    {
                        if (!selectedTeams.contains(away) && !selectedTeams.contains(home))
                        {
                            String match1=(away+" vs "+home);
                            String match2=(home+" vs "+away);

                            if (!coupleTeams.contains(match1) && !coupleTeams.contains(match2))
                            {
                                coupleTeams.add(match1);
                                coupleTeams.add(match2);

                                selectedTeams+=home;
                                selectedTeams+=away;

                                matchQuality++;
                            }
                        }
                    }

                }
            }

            printFixtures();
        }

        public void printFixtures()
        {
            for (int bringMeet=0;bringMeet<coupleTeams.size();bringMeet+=2)
            {

                fixtureValue++;

                System.out.println("--------Fixture "+fixtureValue+"--------");
                int fixtureCounter=0;
                while (fixtureCounter<clubs.size()/2)
                {

                    System.out.println(coupleTeams.get(bringMeet));
                    fixtureCounter++;
                    bringMeet+=2;
                    if (bringMeet>=coupleTeams.size())
                        break;
                }

                bringMeet-=2;
            }


            for (int bringMeet=1;bringMeet<coupleTeams.size();bringMeet+=2)
            {
                //rövanş maççları yazdırılıyor
                fixtureValue++;
                System.out.println("--------Fixture "+fixtureValue+"--------");
                int fixtureCounter=0;
                while (fixtureCounter<clubs.size()/2)
                {
                    System.out.println(coupleTeams.get(bringMeet));
                    fixtureCounter++;
                    bringMeet+=2;

                    if (bringMeet>=coupleTeams.size())
                    {
                        break;
                    }
                }
                bringMeet-=2;
            }
        }
    }

