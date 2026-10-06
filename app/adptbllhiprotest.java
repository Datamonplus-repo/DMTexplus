package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adptbllhiprotest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adptbllhiprotest pgm = new adptbllhiprotest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adptbllhiprotest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adptbllhiprotest.class ), "" );
   }

   public adptbllhiprotest( int remoteHandle ,
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
      AV8HisProDTF = GXutil.now( ) ;
      AV9HisProDTI = GXutil.addmth( AV8HisProDTF, (short)(-2)) ;
      GXt_objcol_SdtSDTtblLhipro1 = AV10sdttblLhiproCollection ;
      GXv_objcol_SdtSDTtblLhipro2[0] = GXt_objcol_SdtSDTtblLhipro1 ;
      new app.dptbllhipro(remoteHandle, context).execute( "001", "ACRM01", "ACRM04", AV9HisProDTI, AV8HisProDTF, (byte)(9), GXv_objcol_SdtSDTtblLhipro2) ;
      GXt_objcol_SdtSDTtblLhipro1 = GXv_objcol_SdtSDTtblLhipro2[0] ;
      AV10sdttblLhiproCollection = GXt_objcol_SdtSDTtblLhipro1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10sdttblLhiproCollection.toxml(false, true, "SDTtblLhiproCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dptbllhiprotest.class);
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
      AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV10sdttblLhiproCollection = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTtblLhipro1 = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTtblLhipro2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV8HisProDTF ;
   private java.util.Date AV9HisProDTI ;
   private GXBaseCollection<app.SdtSDTtblLhipro> AV10sdttblLhiproCollection ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXt_objcol_SdtSDTtblLhipro1 ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXv_objcol_SdtSDTtblLhipro2[] ;
}

