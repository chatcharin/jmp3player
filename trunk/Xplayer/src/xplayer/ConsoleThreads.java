package xplayer;
/*
 * ConsoleThreads.java
 *
 * Created on September 7, 2006, 11:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import org.netbeans.modules.nbplayer.lib.*;
import org.netbeans.modules.nbplayer.module.*;
/**
 *
 * @author Phacharee
 */
import java.io.*;

// Referenced classes of package org.netbeans.modules.nbplayer.lib:
//            FilePlayer, NBPlayerException

public class ConsoleThreads extends Thread
{

    public ConsoleThreads()
    {
        finish = false;
    }

    public synchronized void run()
    {
        String input = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        pl = new FilePlayer();
        do
        {
            if(finish)
                break;
            try
            {
                input = reader.readLine();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
            if(input.equals("play"))
                play();
            if(input.equals("exit"))
            {
                exit();
                finish = true;
            }
            if(input.equals("pause"))
                pause();
            if(input.startsWith("open"))
                openFile(input.substring(5));
            if(input.equals("default"))
                openDef();
            if(input.startsWith("volume"))
                setVolume(Float.parseFloat(input.substring(7)));
            if(input.equals("stop"))
                stopPlayback();
            if(input.equals("next"))
                next();
            if(input.equals("prev"))
                prev();
            if(input.equals("help"))
            {
                System.out.println("Available commands:");
                System.out.println("open [filename]: opens specified mp3 file or playlist");
                System.out.println("default: opens default file");
                System.out.println("play: plays the mp3 file");
                System.out.println("pause: pauses playback or resumes it");
                System.out.println("next: next song");
                System.out.println("prev: previous song");
                System.out.println("volume [0-1]: changes the volume to specified value");
                System.out.println("help: prints this help");
                System.out.println("finish: finishes the playback");
                System.out.println("exit: exits the application");
            }
        } while(true);
    }

    public void play()
    {
        try
        {
            pl.play();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    public void stopPlayback()
    {
        try
        {
            pl.stop();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void pause()
    {
        try
        {
            pl.pause();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void setVolume(float volume)
    {
        try
        {
            pl.setVolume(volume);
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void openFile(String filename)
    {
        try
        {
            pl.openFile(filename, true);
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void openDef()
    {
        try
        {
            pl.openDef();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void exit()
    {
        try
        {
            pl.exit();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void next()
    {
        try
        {
            pl.next();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    private void prev()
    {
        try
        {
            pl.prev();
        }
        catch(NBPlayerException ex)
        {
            ex.printStackTrace();
        }
    }

    boolean finish;
    FilePlayer pl;
}