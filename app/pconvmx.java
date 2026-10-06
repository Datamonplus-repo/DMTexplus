package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconvmx extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pconvmx pgm = new pconvmx (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      java.math.BigDecimal[] aP0 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      String[] aP1 = new String[] {""};
      short[] aP2 = new short[] {0};

      try
      {
         aP0[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[0]);
         aP1[0] = (String) args[1];
         aP2[0] = (short) GXutil.lval( args[2]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public pconvmx( )
   {
      super( -1 , new ModelContext( pconvmx.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pconvmx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconvmx.class ), "" );
   }

   public pconvmx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( java.math.BigDecimal[] aP0 ,
                            String[] aP1 )
   {
      short[] aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.apconvmx(remoteHandle, context).execute( aP0, aP1, aP2 );
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

