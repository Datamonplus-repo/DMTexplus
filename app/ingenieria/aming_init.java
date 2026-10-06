package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aming_init extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aming_init pgm = new aming_init (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aming_init( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aming_init.class ), "" );
   }

   public aming_init( int remoteHandle ,
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
      GXv_objcol_SdtDVelop_Menu_Item1[0] = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>() ;
      new app.wwpbaseobjects.menuoptionsdataing(remoteHandle, context).execute( GXv_objcol_SdtDVelop_Menu_Item1) ;
      callWebObject(formatLink("app.ingenieria.mrec_evaluar", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      GXv_char2[0] = "" ;
      GXv_char3[0] = "" ;
      new app.ingenieria.mrec_evaluarpr(remoteHandle, context).execute( "", "", "", GXv_char2, GXv_char3) ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_objcol_SdtMRec_AnalisisSDT7[0] = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>() ;
      new app.ingenieria.mrec_analisisdp(remoteHandle, context).execute( "", GXt_dtime4, GXt_dtime5, new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<Short>(Short.class, "internal", ""), false, "", "", GXt_dtime6, "", (byte)(0), GXv_objcol_SdtMRec_AnalisisSDT7) ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      GXv_objcol_SdtMRec_AlertaGraficaSDT8[0] = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>() ;
      new app.ingenieria.mrec_alertadp(remoteHandle, context).execute( "", GXt_dtime6, GXt_dtime5, new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<Short>(Short.class, "internal", ""), false, "", "", GXt_dtime4, "", GXv_objcol_SdtMRec_AlertaGraficaSDT8) ;
      callWebObject(formatLink("app.ingenieria.mrec_alerta", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      callWebObject(formatLink("app.ingenieria.mrec_alertamaquinawc", new String[] {}, new String[] {"EmprCod","ContCod","Segundos","MaqCodJSON","FasCodJSON","HdrJSON","ParFasCodJSON","FueraRango","Desde","Hasta","UsurCod","Ip","Now","MTkn"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      callWebObject(formatLink("app.ingenieria.mrec_alertamaquina", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      callWebObject(formatLink("app.ingenieria.mrec_analisis", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.wjLoc = formatLink("app.ingenieria.drec", new String[] {}, new String[] {"Mode","DRecId"})  ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      GXv_objcol_SdtMRec_AnalisisLineaSDT9[0] = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>() ;
      new app.ingenieria.mrec_analisisdp_v2(remoteHandle, context).execute( "", GXt_dtime6, GXt_dtime5, new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<String>(String.class, "internal", ""), new GXSimpleCollection<Short>(Short.class, "internal", ""), false, "", "", GXt_dtime4, "", (byte)(0), GXv_objcol_SdtMRec_AnalisisLineaSDT9) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ming_init.class);
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
      GXv_objcol_SdtDVelop_Menu_Item1 = new GXBaseCollection[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_objcol_SdtMRec_AnalisisSDT7 = new GXBaseCollection[1] ;
      GXv_objcol_SdtMRec_AlertaGraficaSDT8 = new GXBaseCollection[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      GXv_objcol_SdtMRec_AnalisisLineaSDT9 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date GXt_dtime4 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXv_objcol_SdtDVelop_Menu_Item1[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> GXv_objcol_SdtMRec_AnalisisSDT7[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT> GXv_objcol_SdtMRec_AlertaGraficaSDT8[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> GXv_objcol_SdtMRec_AnalisisLineaSDT9[] ;
}

