package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpoperariostest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpoperariostest pgm = new adpoperariostest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpoperariostest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpoperariostest.class ), "" );
   }

   public adpoperariostest( int remoteHandle ,
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
      AV9HisProDTI = GXutil.addmth( AV8HisProDTF, (short)(-1)) ;
      GXt_objcol_SdtSDTOperarios1 = AV10sdtOperariosCollection ;
      GXv_objcol_SdtSDTOperarios2[0] = GXt_objcol_SdtSDTOperarios1 ;
      new app.dpoperarios(remoteHandle, context).execute( "001", "ACRM01", "ACRM04", AV9HisProDTI, AV8HisProDTF, (byte)(9), GXv_objcol_SdtSDTOperarios2) ;
      GXt_objcol_SdtSDTOperarios1 = GXv_objcol_SdtSDTOperarios2[0] ;
      AV10sdtOperariosCollection = GXt_objcol_SdtSDTOperarios1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10sdtOperariosCollection.toxml(false, true, "SDTOperariosCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpoperariostest.class);
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
      AV10sdtOperariosCollection = new GXBaseCollection<app.SdtSDTOperarios>(app.SdtSDTOperarios.class, "SDTOperarios", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTOperarios1 = new GXBaseCollection<app.SdtSDTOperarios>(app.SdtSDTOperarios.class, "SDTOperarios", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTOperarios2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV8HisProDTF ;
   private java.util.Date AV9HisProDTI ;
   private GXBaseCollection<app.SdtSDTOperarios> AV10sdtOperariosCollection ;
   private GXBaseCollection<app.SdtSDTOperarios> GXt_objcol_SdtSDTOperarios1 ;
   private GXBaseCollection<app.SdtSDTOperarios> GXv_objcol_SdtSDTOperarios2[] ;
}

