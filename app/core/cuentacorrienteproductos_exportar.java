package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cuentacorrienteproductos_exportar extends GXProcedure
{
   public cuentacorrienteproductos_exportar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cuentacorrienteproductos_exportar.class ), "" );
   }

   public cuentacorrienteproductos_exportar( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             java.math.BigDecimal aP8 ,
                             String[] aP9 )
   {
      cuentacorrienteproductos_exportar.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        java.math.BigDecimal aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             java.math.BigDecimal aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      cuentacorrienteproductos_exportar.this.AV8Emprcod = aP0;
      cuentacorrienteproductos_exportar.this.AV9Prdnum = aP1;
      cuentacorrienteproductos_exportar.this.AV25Prdnom = aP2;
      cuentacorrienteproductos_exportar.this.AV10CCstkfec = aP3;
      cuentacorrienteproductos_exportar.this.AV11CCstkfec_to = aP4;
      cuentacorrienteproductos_exportar.this.AV13Existencias = aP5;
      cuentacorrienteproductos_exportar.this.AV14compras = aP6;
      cuentacorrienteproductos_exportar.this.AV15consumos = aP7;
      cuentacorrienteproductos_exportar.this.AV16devoluciones = aP8;
      cuentacorrienteproductos_exportar.this.aP9 = aP9;
      cuentacorrienteproductos_exportar.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 = AV27CuentaCorrienteProductos2_SDTs ;
      GXv_objcol_SdtCuentaCorrienteProductos2_SDT2[0] = GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 ;
      new app.cuentacorrienteproductos2_dp(remoteHandle, context).execute( AV8Emprcod, AV9Prdnum, AV10CCstkfec, AV11CCstkfec_to, " ", AV13Existencias, GXv_objcol_SdtCuentaCorrienteProductos2_SDT2) ;
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 = GXv_objcol_SdtCuentaCorrienteProductos2_SDT2[0] ;
      AV27CuentaCorrienteProductos2_SDTs = GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV28CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV22ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV22ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV22ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV22ExcelDocument.Cells(1, 4, 1, 1).setText( AV9Prdnum+" "+AV25Prdnom );
      AV22ExcelDocument.Cells(1, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV13Existencias)) );
      AV22ExcelDocument.Cells(1, 9, 1, 1).setBold( (short)(1) );
      AV22ExcelDocument.Cells(1, 9, 1, 1).setColor( 11 );
      AV22ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "<-Existencias hasta Fecha<= ", "")+GXutil.trim( localUtil.dtoc( AV10CCstkfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
      AV24i = (short)(1) ;
      while ( AV24i <= 11 )
      {
         AV22ExcelDocument.Cells(2, AV24i, 1, 1).setBold( (short)(1) );
         AV22ExcelDocument.Cells(2, AV24i, 1, 1).setColor( 11 );
         AV24i = (short)(AV24i+1) ;
      }
      AV22ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Linea", "") );
      AV22ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Dia", "") );
      AV22ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Tipo", "") );
      AV22ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV22ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Entrada", "") );
      AV22ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Salida", "") );
      AV22ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV22ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Saldo", "") );
      AV22ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV22ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Nº Documento", "") );
      AV22ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Usuario", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV27CuentaCorrienteProductos2_SDTs.size() )
      {
         AV26CuentaCorrienteProductos2_SDT = (app.SdtCuentaCorrienteProductos2_SDT)((app.SdtCuentaCorrienteProductos2_SDT)AV27CuentaCorrienteProductos2_SDTs.elementAt(-1+AV31GXV1));
         AV22ExcelDocument.Cells(AV28CellRow, 1, 1, 1).setNumber( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin() );
         AV22ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV22ExcelDocument.Cells(AV28CellRow, 2, 1, 1).setDate( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora() );
         AV22ExcelDocument.Cells(AV28CellRow, 3, 1, 1).setText( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc() );
         AV22ExcelDocument.Cells(AV28CellRow, 4, 1, 1).setText( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc() );
         AV22ExcelDocument.Cells(AV28CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane())) );
         AV22ExcelDocument.Cells(AV28CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans())) );
         AV22ExcelDocument.Cells(AV28CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre())) );
         AV22ExcelDocument.Cells(AV28CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias())) );
         AV22ExcelDocument.Cells(AV28CellRow, 9, 1, 1).setText( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot() );
         AV22ExcelDocument.Cells(AV28CellRow, 10, 1, 1).setText( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr() );
         AV22ExcelDocument.Cells(AV28CellRow, 11, 1, 1).setText( AV26CuentaCorrienteProductos2_SDT.getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu() );
         AV28CellRow = (int)(AV28CellRow+1) ;
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV20Random = (int)(GXutil.random( )*10000) ;
      AV21Filename = "CuentaCorrienteProductosExport-" + GXutil.trim( GXutil.str( AV20Random, 8, 0)) + ".xlsx" ;
      AV22ExcelDocument.Open(AV21Filename);
      AV22ExcelDocument.setAutoFit( (short)(0) );
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV22ExcelDocument.Clear();
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV22ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV22ExcelDocument.Close();
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV22ExcelDocument.getErrCode() != 0 )
      {
         AV21Filename = "" ;
         AV23ErrorMessage = AV22ExcelDocument.getErrDescription() ;
         AV22ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP9[0] = cuentacorrienteproductos_exportar.this.AV21Filename;
      this.aP10[0] = cuentacorrienteproductos_exportar.this.AV23ErrorMessage;
      CloseOpenCursors();
      AV22ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Filename = "" ;
      AV23ErrorMessage = "" ;
      AV27CuentaCorrienteProductos2_SDTs = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtCuentaCorrienteProductos2_SDT2 = new GXBaseCollection[1] ;
      AV22ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV26CuentaCorrienteProductos2_SDT = new app.SdtCuentaCorrienteProductos2_SDT(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV24i ;
   private short Gx_err ;
   private int AV28CellRow ;
   private int AV31GXV1 ;
   private int AV20Random ;
   private java.math.BigDecimal AV13Existencias ;
   private java.math.BigDecimal AV14compras ;
   private java.math.BigDecimal AV15consumos ;
   private java.math.BigDecimal AV16devoluciones ;
   private String AV8Emprcod ;
   private String AV9Prdnum ;
   private String AV25Prdnom ;
   private java.util.Date AV10CCstkfec ;
   private java.util.Date AV11CCstkfec_to ;
   private boolean returnInSub ;
   private String AV21Filename ;
   private String AV23ErrorMessage ;
   private String[] aP10 ;
   private String[] aP9 ;
   private com.genexus.gxoffice.ExcelDoc AV22ExcelDocument ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> AV27CuentaCorrienteProductos2_SDTs ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> GXt_objcol_SdtCuentaCorrienteProductos2_SDT1 ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> GXv_objcol_SdtCuentaCorrienteProductos2_SDT2[] ;
   private app.SdtCuentaCorrienteProductos2_SDT AV26CuentaCorrienteProductos2_SDT ;
}

