package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pncl001 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pncl001 pgm = new pncl001 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public pncl001( )
   {
      super( -1 , new ModelContext( pncl001.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pncl001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pncl001.class ), "" );
   }

   public pncl001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      pncl001.this.AV2EmprCod = aP0;
      pncl001.this.AV3HisReoTn = aP1;
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

   private short Gx_err ;
   private int AV3HisReoTn ;
   private String AV2EmprCod ;
}

