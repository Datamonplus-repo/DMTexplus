package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class approdutossedomaster extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      approdutossedomaster pgm = new approdutossedomaster (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public approdutossedomaster( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( approdutossedomaster.class ), "" );
   }

   public approdutossedomaster( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      approdutossedomaster.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      approdutossedomaster.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprodutossedomaster.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = approdutossedomaster.this.AV15EmprCod;
      CloseOpenCursors();
      exitApp();
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
   private String AV15EmprCod ;
   private String[] aP0 ;
}

