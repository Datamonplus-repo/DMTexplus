package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class petcarvitinprinter extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      petcarvitinprinter pgm = new petcarvitinprinter (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      short[] aP2 = new short[] {0};
      String[] aP3 = new String[] {""};
      java.math.BigDecimal[] aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      byte[] aP5 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (short) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[4]);
         aP5[0] = (byte) GXutil.lval( args[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public petcarvitinprinter( )
   {
      super( -1 , new ModelContext( petcarvitinprinter.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public petcarvitinprinter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( petcarvitinprinter.class ), "" );
   }

   public petcarvitinprinter( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 )
   {
      byte[] aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.apetcarvitinprinter(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5 );
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

