package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxhrcos extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pvxhrcos pgm = new pvxhrcos (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;
      byte aP2 = 0;
      String aP3 = "";
      java.math.BigDecimal[] aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      java.math.BigDecimal[] aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
         aP2 = (byte) GXutil.lval( args[2]);
         aP3 = (String) args[3];
         aP4[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[4]);
         aP5[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public pvxhrcos( )
   {
      super( -1 , new ModelContext( pvxhrcos.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pvxhrcos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxhrcos.class ), "" );
   }

   public pvxhrcos( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      java.math.BigDecimal[] aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.apvxhrcos(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5 );
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

