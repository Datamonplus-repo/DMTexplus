package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpdetallleentradastest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpdetallleentradastest pgm = new adpdetallleentradastest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      java.util.Date[] aP3 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP4 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      byte[] aP7 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (java.util.Date) localUtil.ctod( args[3], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP4[0] = (java.util.Date) localUtil.ctod( args[4], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (byte) GXutil.lval( args[7]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public adpdetallleentradastest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpdetallleentradastest.class ), "" );
   }

   public adpdetallleentradastest( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           java.util.Date[] aP3 ,
                           java.util.Date[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      adpdetallleentradastest.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      adpdetallleentradastest.this.AV12Emprcod = aP0[0];
      this.aP0 = aP0;
      adpdetallleentradastest.this.AV11ClienteInicial = aP1[0];
      this.aP1 = aP1;
      adpdetallleentradastest.this.AV10ClienteFinal = aP2[0];
      this.aP2 = aP2;
      adpdetallleentradastest.this.AV14FechaInicial = aP3[0];
      this.aP3 = aP3;
      adpdetallleentradastest.this.AV13FechaFinal = aP4[0];
      this.aP4 = aP4;
      adpdetallleentradastest.this.AV9ArticuloInicial = aP5[0];
      this.aP5 = aP5;
      adpdetallleentradastest.this.AV8ArticuloFinal = aP6[0];
      this.aP6 = aP6;
      adpdetallleentradastest.this.AV16Albrest = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FechaFinal = GXutil.resetTime(GXutil.now( )) ;
      AV14FechaInicial = GXutil.addmth( AV13FechaFinal, (short)(-1)) ;
      AV16Albrest = (byte)(9) ;
      GXt_objcol_SdtSDTDetalleEntradas1 = AV15sdtDetalleEntradasCollection ;
      GXv_objcol_SdtSDTDetalleEntradas2[0] = GXt_objcol_SdtSDTDetalleEntradas1 ;
      new app.dpdetalleentradas(remoteHandle, context).execute( "001", 1, 999999, AV14FechaInicial, AV13FechaFinal, " ", httpContext.getMessage( "zzzzzzzzzzzzzzzz", ""), (byte)(9), GXv_objcol_SdtSDTDetalleEntradas2) ;
      GXt_objcol_SdtSDTDetalleEntradas1 = GXv_objcol_SdtSDTDetalleEntradas2[0] ;
      AV15sdtDetalleEntradasCollection = GXt_objcol_SdtSDTDetalleEntradas1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV15sdtDetalleEntradasCollection.toxml(false, true, "SDTDetalleEntradasCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpdetallleentradastest.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = adpdetallleentradastest.this.AV12Emprcod;
      this.aP1[0] = adpdetallleentradastest.this.AV11ClienteInicial;
      this.aP2[0] = adpdetallleentradastest.this.AV10ClienteFinal;
      this.aP3[0] = adpdetallleentradastest.this.AV14FechaInicial;
      this.aP4[0] = adpdetallleentradastest.this.AV13FechaFinal;
      this.aP5[0] = adpdetallleentradastest.this.AV9ArticuloInicial;
      this.aP6[0] = adpdetallleentradastest.this.AV8ArticuloFinal;
      this.aP7[0] = adpdetallleentradastest.this.AV16Albrest;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15sdtDetalleEntradasCollection = new GXBaseCollection<app.SdtSDTDetalleEntradas>(app.SdtSDTDetalleEntradas.class, "SDTDetalleEntradas", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTDetalleEntradas1 = new GXBaseCollection<app.SdtSDTDetalleEntradas>(app.SdtSDTDetalleEntradas.class, "SDTDetalleEntradas", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTDetalleEntradas2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Albrest ;
   private short Gx_err ;
   private int AV11ClienteInicial ;
   private int AV10ClienteFinal ;
   private String AV12Emprcod ;
   private String AV9ArticuloInicial ;
   private String AV8ArticuloFinal ;
   private java.util.Date AV14FechaInicial ;
   private java.util.Date AV13FechaFinal ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private GXBaseCollection<app.SdtSDTDetalleEntradas> AV15sdtDetalleEntradasCollection ;
   private GXBaseCollection<app.SdtSDTDetalleEntradas> GXt_objcol_SdtSDTDetalleEntradas1 ;
   private GXBaseCollection<app.SdtSDTDetalleEntradas> GXv_objcol_SdtSDTDetalleEntradas2[] ;
}

