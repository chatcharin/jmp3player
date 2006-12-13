/*
 * JFilePlayer.java
 *
 * Created on September 9, 2006, 5:45 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package xplayer;
import org.netbeans.modules.nbplayer.lib.*;
import java.io.FileNotFoundException;

// Referenced classes of package org.netbeans.modules.nbplayer.lib:
//            PlayerThread, NBPlayerException

public class JFilePlayer 
{

    public JFilePlayer()
    {
        pt = null;
        pt = new JPlayerThread();
    }

    public synchronized void play()
        throws NBPlayerException
    {
        if(pt.getStatus().equals(PlayerThread.Status.playing))
            return;
        if(pt != null)
        {
            if(!pt.isAlive())
                pt.play();
            else
                pt.restart();
        } else
        {
            throw new NBPlayerException("Player thread doesn't exist.");
        }
    }

    public void stop()
        throws NBPlayerException
    {
        if(pt != null)
            pt.stopPlayback();
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void exit()
        throws NBPlayerException
    {
        if(pt != null)
            pt.exit();
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void pause()
        throws NBPlayerException
    {
        if(pt != null)
            pt.pause();
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void setVolume(float volume)
        throws NBPlayerException
    {
        if(pt != null)
            pt.setVolume(volume);
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void openFile(String filename, boolean resetPlaylist)
        throws NBPlayerException, FileNotFoundException
    {
        if(pt != null)
            pt.openFile(filename, resetPlaylist);
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void openDef()
        throws NBPlayerException
    {
        if(pt != null)
            try
            {
                pt.openDef();
            }
            catch(FileNotFoundException ex)
            {
                ex.printStackTrace();
            }
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void next()
        throws NBPlayerException
    {
        if(pt != null)
            pt.next();
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public void prev()
        throws NBPlayerException
    {
        if(pt != null)
            pt.prev();
        else
            throw new NBPlayerException("Player thread doesn't exist.");
    }

    public JPlayerThread.Status getStatus()
    {
        if(pt != null)
            return pt.getStatus();
        else
            return JPlayerThread.Status.stopped;
    }

    public int getPosition()
    {
        if(pt != null)
            return pt.getPosition();
        else
            return 0;
    }

    public long getLength()
    {
        if(pt != null)
            return pt.getLength();
        else
            return 0L;
    }

    public long getPositionInMSec()
    {
        if(pt != null)
            return pt.getPositionInMSec();
        else
            return 0L;
    }

    public String getTitle()
    {
        if(pt != null)
            return pt.getTitle();
        else
            return "";
    }

    public void moveProgress(int progress)
    {
        if(pt != null)
            pt.moveProgress(progress);
    }

    JPlayerThread pt;

    public JPlayerThread getPt() {
        return pt;
    }

    public void setPt(JPlayerThread val) {
        this.pt = val;
    }
}