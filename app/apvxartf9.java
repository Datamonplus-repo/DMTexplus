package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apvxartf9 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apvxartf9 pgm = new apvxartf9 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public apvxartf9( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apvxartf9.class ), "" );
   }

   public apvxartf9( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      apvxartf9.this.AV10EmprCod = aP0;
      apvxartf9.this.AV11CliCodS = aP1;
      apvxartf9.this.AV8ArtCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9CliCod = (int)(GXutil.lval( AV11CliCodS)) ;
      new app.pvxdbcon(remoteHandle, context).execute( ) ;
      httpContext.wjLoc = formatLink("app.tarttej", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pvxartf9.class);
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
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9CliCod ;
   private String AV10EmprCod ;
   private String AV11CliCodS ;
   private String AV8ArtCod ;
}

