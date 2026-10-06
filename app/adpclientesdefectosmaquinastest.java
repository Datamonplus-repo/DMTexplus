package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpclientesdefectosmaquinastest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpclientesdefectosmaquinastest pgm = new adpclientesdefectosmaquinastest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpclientesdefectosmaquinastest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpclientesdefectosmaquinastest.class ), "" );
   }

   public adpclientesdefectosmaquinastest( int remoteHandle ,
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
      AV10Emprcod = "001" ;
      AV13HisEstReo = (byte)(1) ;
      AV9ClicodIni = 0 ;
      AV11FechaFin = GXutil.resetTime(GXutil.now( )) ;
      AV12FechaIni = GXutil.addmth( AV11FechaFin, (short)(-3)) ;
      GXt_objcol_SdtSDTClientesDefectosMaquinas1 = AV14sdtClientesDefectosMaquinasCollection ;
      GXv_objcol_SdtSDTClientesDefectosMaquinas2[0] = GXt_objcol_SdtSDTClientesDefectosMaquinas1 ;
      new app.dpclientesdefectosmaquinas(remoteHandle, context).execute( AV10Emprcod, AV12FechaIni, AV11FechaFin, AV9ClicodIni, 999999, AV13HisEstReo, GXv_objcol_SdtSDTClientesDefectosMaquinas2) ;
      GXt_objcol_SdtSDTClientesDefectosMaquinas1 = GXv_objcol_SdtSDTClientesDefectosMaquinas2[0] ;
      AV14sdtClientesDefectosMaquinasCollection = GXt_objcol_SdtSDTClientesDefectosMaquinas1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV14sdtClientesDefectosMaquinasCollection.toxml(false, true, "SDTClientesDefectosMaquinasCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpclientesdefectosmaquinastest.class);
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
      AV10Emprcod = "" ;
      AV11FechaFin = GXutil.nullDate() ;
      AV12FechaIni = GXutil.nullDate() ;
      AV14sdtClientesDefectosMaquinasCollection = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>(app.SdtSDTClientesDefectosMaquinas.class, "SDTClientesDefectosMaquinas", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTClientesDefectosMaquinas1 = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>(app.SdtSDTClientesDefectosMaquinas.class, "SDTClientesDefectosMaquinas", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTClientesDefectosMaquinas2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13HisEstReo ;
   private short Gx_err ;
   private int AV9ClicodIni ;
   private String AV10Emprcod ;
   private java.util.Date AV11FechaFin ;
   private java.util.Date AV12FechaIni ;
   private GXBaseCollection<app.SdtSDTClientesDefectosMaquinas> AV14sdtClientesDefectosMaquinasCollection ;
   private GXBaseCollection<app.SdtSDTClientesDefectosMaquinas> GXt_objcol_SdtSDTClientesDefectosMaquinas1 ;
   private GXBaseCollection<app.SdtSDTClientesDefectosMaquinas> GXv_objcol_SdtSDTClientesDefectosMaquinas2[] ;
}

