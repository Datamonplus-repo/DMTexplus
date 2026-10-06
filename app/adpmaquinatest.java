package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpmaquinatest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpmaquinatest pgm = new adpmaquinatest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpmaquinatest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpmaquinatest.class ), "" );
   }

   public adpmaquinatest( int remoteHandle ,
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
      GXt_objcol_SdtSDTMaquina1 = AV9SDTMaquinaCollection ;
      GXv_objcol_SdtSDTMaquina2[0] = GXt_objcol_SdtSDTMaquina1 ;
      new app.dpmaquina(remoteHandle, context).execute( "001", AV10MaqCodCollection, true, GXv_objcol_SdtSDTMaquina2) ;
      GXt_objcol_SdtSDTMaquina1 = GXv_objcol_SdtSDTMaquina2[0] ;
      AV9SDTMaquinaCollection = GXt_objcol_SdtSDTMaquina1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV9SDTMaquinaCollection.toxml(false, true, "SDTMaquinaCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpmaquinatest.class);
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
      AV9SDTMaquinaCollection = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTMaquina1 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      AV10MaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_objcol_SdtSDTMaquina2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXSimpleCollection<String> AV10MaqCodCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> AV9SDTMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> GXt_objcol_SdtSDTMaquina1 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXv_objcol_SdtSDTMaquina2[] ;
}

