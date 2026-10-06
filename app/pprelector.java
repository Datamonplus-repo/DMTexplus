package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprelector extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pprelector pgm = new pprelector (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      String[] aP2 = new String[] {""};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      String[] aP7 = new String[] {""};
      String[] aP8 = new String[] {""};
      String[] aP9 = new String[] {""};
      String[] aP10 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (String) args[2];
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (String) args[7];
         aP8[0] = (String) args[8];
         aP9[0] = (String) args[9];
         aP10[0] = (String) args[10];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   public pprelector( )
   {
      super( -1 , new ModelContext( pprelector.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pprelector( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprelector.class ), "" );
   }

   public pprelector( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      String[] aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.apprelector(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10 );
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
}

