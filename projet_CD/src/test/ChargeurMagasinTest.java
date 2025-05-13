package test;

import XML.ChargeurMagasin;

import static org.junit.jupiter.api.Assertions.*;

class ChargeurMagasinTest {

    @org.junit.jupiter.api.Test
    void TestchargerMagasinF_fonctionnel() {
        assertDoesNotThrow(() -> {
            new ChargeurMagasin("musicbrainzSimple");});
    }

    @org.junit.jupiter.api.Test
    void TestchargerMagasin_erreur() {
        assertDoesNotThrow(FileNotFoundException() -> {
            new ChargeurMagasin("hhhj");});
    }
}