package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ainformealmacentejidocrudo_clientetest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ainformealmacentejidocrudo_clientetest pgm = new ainformealmacentejidocrudo_clientetest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public ainformealmacentejidocrudo_clientetest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ainformealmacentejidocrudo_clientetest.class ), "" );
   }

   public ainformealmacentejidocrudo_clientetest( int remoteHandle ,
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
      AV9FechaInicial = localUtil.ctod( "02/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV10FechaFinal = localUtil.ctod( "02/08/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(informealmacentejidocrudo_clientetest.class);
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
      AV9FechaInicial = GXutil.nullDate() ;
      AV10FechaFinal = GXutil.nullDate() ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV9FechaInicial ;
   private java.util.Date AV10FechaFinal ;
}

