package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prtftinte extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      prtftinte pgm = new prtftinte (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[][] AV3MaqHdrs;
      {
         int GX_I, GX_J;
         AV3MaqHdrs = new String[100][1000] ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            GX_J = 1 ;
            while ( GX_J <= 1000 )
            {
               AV3MaqHdrs[GX_I-1][GX_J-1] = "" ;
               GX_J = (int)(GX_J+1) ;
            }
            GX_I = (int)(GX_I+1) ;
         }
      }
      short[] aP2 = new short[] {0};
      String[] AV5Tab_maqOut;
      {
         int GX_I;
         AV5Tab_maqOut = new String[100] ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV5Tab_maqOut[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
      }
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};

      execute(aP0, AV3MaqHdrs, aP2, AV5Tab_maqOut, aP4, aP5, aP6);
   }

   public prtftinte( )
   {
      super( -1 , new ModelContext( prtftinte.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public prtftinte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prtftinte.class ), "" );
   }

   public prtftinte( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[][] AV3MaqHdrs ,
                             short[] aP2 ,
                             String[] AV5Tab_maqOut ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      String[] aP6 = new String[] {""};
      execute_int(aP0, AV3MaqHdrs, aP2, AV5Tab_maqOut, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[][] AV3MaqHdrs ,
                        short[] aP2 ,
                        String[] AV5Tab_maqOut ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, AV3MaqHdrs, aP2, AV5Tab_maqOut, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[][] AV3MaqHdrs ,
                             short[] aP2 ,
                             String[] AV5Tab_maqOut ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.aprtftinte(remoteHandle, context).execute( aP0, AV3MaqHdrs, aP2, AV5Tab_maqOut, aP4, aP5, aP6 );
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private String AV3MaqHdrs[][] ;
   private String AV5Tab_maqOut[] ;
}

