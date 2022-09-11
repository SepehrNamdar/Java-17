package mojodatZendeh;

import khodro.Keshti;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MojodatZendehBayad {

    // Sealed sub classes :
    //  - final --> Dige ers bari azashoun emkan pazir nist
    //  - sealed --> Bayad taiin konim che kelas haii zir majmoeye kelas pedar hastan
    //  - non-sealed --> har kelasi mitavanad az an ers bari konad

    @Test
    void az_ham_ers_bari_konand() {
        final Keshti keshti = new Keshti();
        final Giahan giahan = new Giahan();

        assertThat(giahan instanceof MojodatZendeh).isTrue();
        //Assertions.assertThat(keshti instanceof MojodatZendeh)
    }
}
