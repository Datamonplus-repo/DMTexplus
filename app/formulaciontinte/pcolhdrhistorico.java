package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcolhdrhistorico extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pcolhdrhistorico pgm = new pcolhdrhistorico (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;
      String aP2 = "";
      String aP3 = "";
      int aP4 = 0;
      byte aP5 = 0;

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
         aP2 = (String) args[2];
         aP3 = (String) args[3];
         aP4 = (int) GXutil.lval( args[4]);
         aP5 = (byte) GXutil.lval( args[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public pcolhdrhistorico( )
   {
      super( -1 , new ModelContext( pcolhdrhistorico.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pcolhdrhistorico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolhdrhistorico.class ), "" );
   }

   public pcolhdrhistorico( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 )
   {
      pcolhdrhistorico.this.AV2EmprCod = aP0;
      pcolhdrhistorico.this.AV3Clicod = aP1;
      pcolhdrhistorico.this.AV4Forser = aP2;
      pcolhdrhistorico.this.AV5Forcolnom = aP3;
      pcolhdrhistorico.this.AV6Forcolnum = aP4;
      pcolhdrhistorico.this.AV7Tipcolcod = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
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

   private byte AV7Tipcolcod ;
   private short Gx_err ;
   private int AV3Clicod ;
   private int AV6Forcolnum ;
   private String AV2EmprCod ;
   private String AV4Forser ;
   private String AV5Forcolnom ;
}

