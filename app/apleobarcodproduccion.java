package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apleobarcodproduccion extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apleobarcodproduccion pgm = new apleobarcodproduccion (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apleobarcodproduccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apleobarcodproduccion.class ), "" );
   }

   public apleobarcodproduccion( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      GXv_char1[0] = AV15EmprCod ;
      new app.ptosedomaster(remoteHandle, context).execute( GXv_char1) ;
      apleobarcodproduccion.this.AV15EmprCod = GXv_char1[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pleobarcodproduccion.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15EmprCod = "" ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV15EmprCod ;
   private String GXv_char1[] ;
}

