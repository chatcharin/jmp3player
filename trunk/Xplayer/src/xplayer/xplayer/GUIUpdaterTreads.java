package xplayer;
/*
 * GIUUpdaterTreads.java
 *
 * Created on September 5, 2006, 4:35 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import org.netbeans.modules.nbplayer.lib.FilePlayer; 
import org.netbeans.modules.nbplayer.lib.*; 
import org.netbeans.modules.nbplayer.module.*;
// Referenced classes of package org.netbeans.modules.nbplayer.module:
//            PlayerWindowTopComponent

public class GUIUpdaterTreads extends Thread
{

    public GUIUpdaterTreads(GUIMP3Player pwtc, JFilePlayer fp)   
    {
        moveProgress = true;
        this.pwtc = pwtc;
        this.fp = fp;
    }

    private String zeroize(int n)
    {
        if(n < 10)
            return "0" + String.valueOf(n);
        else
            return String.valueOf(n);
    }

    public void run()
    {
        do
        {
            if(moveProgress)
                pwtc.setSliderPosition(fp.getPosition());
            min = (int)fp.getLength() / 0x3938700;
            sec = (int)fp.getLength() / 0xf4240 - min * 60;
            pmin = (int)fp.getPositionInMSec() / 0x3938700;
            psec = (int)fp.getPositionInMSec() / 0xf4240 - pmin * 60;
            pwtc.setProgress(zeroize(pmin) + ":" + zeroize(psec) + " / " + zeroize(min) + ":" + zeroize(sec));
            pwtc.refreshStatus();
            try
            {
                sleep(100L);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        } while(true);
    }

    public void turnProgress(boolean value)
    {
        moveProgress = value;
    }

    GUIMP3Player pwtc;
    JFilePlayer fp;
    int psec;
    int pmin;
    int sec;
    int min;
    private boolean moveProgress;
}