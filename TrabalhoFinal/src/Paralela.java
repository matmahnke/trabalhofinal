/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Paralela extends Dispositivo{
    private boolean MidiaCD;
    protected boolean MidiaDVD;

    public boolean isMidiaCD() {
        return MidiaCD;
    }

    public void setMidiaCD(boolean MidiaCD) {
        this.MidiaCD = MidiaCD;
    }

    public boolean isMidiaDVD() {
        return MidiaDVD;
    }

    public void setMidiaDVD(boolean MidiaDVD) {
        this.MidiaDVD = MidiaDVD;
    }
}
