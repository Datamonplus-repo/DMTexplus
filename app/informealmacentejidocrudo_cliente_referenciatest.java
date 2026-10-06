package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informealmacentejidocrudo_cliente_referenciatest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      informealmacentejidocrudo_cliente_referenciatest pgm = new informealmacentejidocrudo_cliente_referenciatest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public informealmacentejidocrudo_cliente_referenciatest( )
   {
      super( -1 , new ModelContext( informealmacentejidocrudo_cliente_referenciatest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public informealmacentejidocrudo_cliente_referenciatest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealmacentejidocrudo_cliente_referenciatest.class ), "" );
   }

   public informealmacentejidocrudo_cliente_referenciatest( int remoteHandle ,
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
      new app.ainformealmacentejidocrudo_cliente_referenciatest(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(informealmacentejidocrudo_cliente_referenciatest.class);
      return new app.GXcfg();
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

