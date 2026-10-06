package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appackingclimts extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appackingclimts pgm = new appackingclimts (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appackingclimts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appackingclimts.class ), "" );
   }

   public appackingclimts( int remoteHandle ,
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
      AV8UsurCod = " " ;
      AV11Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char1, GXv_char2, GXv_char3) ;
      appackingclimts.this.AV9EmprCod = GXv_char1[0] ;
      appackingclimts.this.AV10EmprNom = GXv_char2[0] ;
      appackingclimts.this.AV8UsurCod = GXv_char3[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppackingclimts.class);
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
      AV8UsurCod = "" ;
      AV11Station = "" ;
      AV9EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8UsurCod ;
   private String AV11Station ;
   private String AV9EmprCod ;
   private String GXv_char1[] ;
   private String AV10EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
}

