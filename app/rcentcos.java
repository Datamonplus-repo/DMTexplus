package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcentcos extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rcentcos pgm = new rcentcos (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      short aP1 = 0;
      short aP2 = 0;
      java.util.Date aP3 = GXutil.nullDate();
      java.util.Date aP4 = GXutil.nullDate();

      try
      {
         aP0 = (String) args[0];
         aP1 = (short) GXutil.lval( args[1]);
         aP2 = (short) GXutil.lval( args[2]);
         aP3 = (java.util.Date) localUtil.ctod( args[3], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP4 = (java.util.Date) localUtil.ctod( args[4], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public rcentcos( )
   {
      super( -1 , new ModelContext( rcentcos.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rcentcos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcentcos.class ), "" );
   }

   public rcentcos( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 )
   {
      rcentcos.this.AV2EmprCod = aP0;
      rcentcos.this.AV3PCcoco = aP1;
      rcentcos.this.AV4UCcoco = aP2;
      rcentcos.this.AV5PFecha = aP3;
      rcentcos.this.AV6UFecha = aP4;
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

   private short AV3PCcoco ;
   private short AV4UCcoco ;
   private short Gx_err ;
   private String AV2EmprCod ;
   private java.util.Date AV5PFecha ;
   private java.util.Date AV6UFecha ;
}

