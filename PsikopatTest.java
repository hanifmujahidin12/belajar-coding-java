import java.util.Scanner;

public class PsikopatTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ulangPsikopatTest = false;
        do{
            System.out.println("Apakah Anda berhati dingin? \na. Ya \tb. Gak");
            String jawaban1 = scan.nextLine();
    
            if (!jawaban1.equalsIgnoreCase("a") && !jawaban1.equalsIgnoreCase("b")){
                System.out.println("Masukkan jawaban A atau B saja!\n");
                ulangPsikopatTest = true;
                continue;
            }
    
            System.out.println("Apakah Anda tidak berperasaan? \n a. Ya \t b.Gak");
            String jawaban2 = scan.nextLine();

            if (!jawaban2.equalsIgnoreCase("a") && !jawaban2.equalsIgnoreCase("b")){
                System.out.println("Masukkan jawaban A atau B saja!\n");
                ulangPsikopatTest = true;
                continue;
            }
    
            boolean psikopat100 = jawaban1.equalsIgnoreCase("a") && jawaban2.equalsIgnoreCase("a");
            
            boolean psikopat50 = (jawaban1.equalsIgnoreCase("a") && jawaban2.equalsIgnoreCase("b") 
                               || (jawaban1.equalsIgnoreCase("b") && jawaban2.equalsIgnoreCase("a")));
            
            boolean psikopat0 = jawaban1.equalsIgnoreCase("b") && jawaban2.equalsIgnoreCase("b");
        
            if (psikopat100) 
                System.out.println("Selamat Anda psikopat!");
            else if (psikopat50)
                System.out.print("Ayo sedikit lagi Anda jadi kimin");
            else if (psikopat0)
                System.out.print("Ah cupu, lu!");

            
            boolean ulangPertanyaan = true;
            do{
                System.out.println("\nApakah Anda ingin mengulang lagi? (Y/N)");
                String ulang = scan.nextLine();
                if(ulang.equalsIgnoreCase("y")){
                    ulangPertanyaan = false;
                    ulangPsikopatTest = true;
                }
                else if(ulang.equalsIgnoreCase("n")){
                    ulangPertanyaan = true;
                    ulangPsikopatTest = false;
                    break;
                }
                else
                    System.out.println("Jawaban Anda Salah, Mohon Isi Y/N!!");

                System.out.println();
    
            } while(ulangPertanyaan);

        }while(ulangPsikopatTest);
    }

}
