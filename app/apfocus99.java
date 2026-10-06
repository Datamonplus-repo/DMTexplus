package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfocus99 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfocus99 pgm = new apfocus99 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfocus99( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfocus99.class ), "" );
   }

   public apfocus99( int remoteHandle ,
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
      AV43UsurCod = " " ;
      AV44Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV29emprcod ;
      GXv_char2[0] = AV45EmprNom ;
      GXv_char3[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char1, GXv_char2, GXv_char3) ;
      apfocus99.this.AV29emprcod = GXv_char1[0] ;
      apfocus99.this.AV45EmprNom = GXv_char2[0] ;
      apfocus99.this.AV43UsurCod = GXv_char3[0] ;
      new app.pfocus03(remoteHandle, context).execute( ) ;
      new app.pfocus04(remoteHandle, context).execute( ) ;
      new app.pfocus05(remoteHandle, context).execute( ) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pfocus99.class);
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
      AV43UsurCod = "" ;
      AV44Station = "" ;
      AV29emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV45EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV43UsurCod ;
   private String AV44Station ;
   private String AV29emprcod ;
   private String GXv_char1[] ;
   private String AV45EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
}

