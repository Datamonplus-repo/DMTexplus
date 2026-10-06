package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class uti118_sdt_2export extends GXProcedure
{
   public uti118_sdt_2export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uti118_sdt_2export.class ), "" );
   }

   public uti118_sdt_2export( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      uti118_sdt_2export.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      uti118_sdt_2export.this.aP0 = aP0;
      uti118_sdt_2export.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV71InformeInditex = AV59WebSession.getValue(httpContext.getMessage( "InformeInditex", "")) ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
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
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "WWUti118_SDT_2Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV13CellRow = 1 ;
      AV57cellCol = 1 ;
      while ( AV57cellCol <= 30 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV57cellCol, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV57cellCol, 1, 1).setColor( 11 );
         AV57cellCol = (int)(AV57cellCol+1) ;
      }
      AV10ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV10ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Categoria", "") );
      AV10ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Funcion", "") );
      AV10ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "CAS", "") );
      AV10ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Nº EINECS", "") );
      AV10ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Nombre Quimico Sustancia", "") );
      AV10ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "ZDHC", "") );
      AV10ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV10ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Fabricante", "") );
      AV10ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Distribuidor", "") );
      AV10ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Consumos", "") );
      AV10ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Compras", "") );
      AV10ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Stock Inicial", "") );
      AV10ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Stock Final", "") );
      AV10ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Fecha Seguridad", "") );
      AV10ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Utilizacion", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV13CellRow = 2 ;
      AV60SdtInformeInditexCollection.fromJSonString(AV71InformeInditex, null);
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV60SdtInformeInditexCollection.size() )
      {
         AV61sdtInformeInditex = (app.SdtSDTInformeInditex)((app.SdtSDTInformeInditex)AV60SdtInformeInditexCollection.elementAt(-1+AV83GXV1));
         AV62PrdNum = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Producto() ;
         AV63Prdnom = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Descripcion() ;
         AV75Categoria = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Categoria() ;
         AV64PrdFuncion = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdfuncion() ;
         AV65PrdNroCAS = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdnrocas() ;
         AV66PrdEINECS = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdeinecs() ;
         AV67PrdNmQu = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdnmqu() ;
         AV68PrdZDHC = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdzdhc() ;
         AV76Lote = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Lote() ;
         AV69PrdFabNm = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Fabricante() ;
         AV70PrvNom = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Proveedor() ;
         AV73CantC = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Cantc() ;
         AV74CantCm = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Cantcm() ;
         AV77Stockfinal = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Stockfinal() ;
         AV78StockInicial = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Stockinicial() ;
         AV79PrdFHS = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdfhs() ;
         AV80LocUtiDc = AV61sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Locutidc() ;
         AV10ExcelDocument.Cells(AV13CellRow, 1, 1, 1).setText( AV62PrdNum );
         AV10ExcelDocument.Cells(AV13CellRow, 2, 1, 1).setText( AV63Prdnom );
         AV10ExcelDocument.Cells(AV13CellRow, 3, 1, 1).setText( AV64PrdFuncion );
         AV10ExcelDocument.Cells(AV13CellRow, 4, 1, 1).setText( AV64PrdFuncion );
         AV10ExcelDocument.Cells(AV13CellRow, 5, 1, 1).setText( AV65PrdNroCAS );
         AV10ExcelDocument.Cells(AV13CellRow, 6, 1, 1).setText( AV66PrdEINECS );
         AV10ExcelDocument.Cells(AV13CellRow, 7, 1, 1).setText( AV67PrdNmQu );
         AV10ExcelDocument.Cells(AV13CellRow, 8, 1, 1).setText( AV68PrdZDHC );
         AV10ExcelDocument.Cells(AV13CellRow, 9, 1, 1).setText( AV76Lote );
         AV10ExcelDocument.Cells(AV13CellRow, 10, 1, 1).setText( AV69PrdFabNm );
         AV10ExcelDocument.Cells(AV13CellRow, 11, 1, 1).setText( AV70PrvNom );
         AV10ExcelDocument.Cells(AV13CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73CantC)) );
         AV10ExcelDocument.Cells(AV13CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74CantCm)) );
         AV10ExcelDocument.Cells(AV13CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78StockInicial)) );
         AV10ExcelDocument.Cells(AV13CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77Stockfinal)) );
         GXt_dtime1 = GXutil.resetTime( AV79PrdFHS );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, 16, 1, 1).setDate( GXt_dtime1 );
         AV10ExcelDocument.Cells(AV13CellRow, 17, 1, 1).setText( AV80LocUtiDc );
         AV13CellRow = (int)(AV13CellRow+1) ;
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = uti118_sdt_2export.this.AV11Filename;
      this.aP1[0] = uti118_sdt_2export.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV71InformeInditex = "" ;
      AV59WebSession = httpContext.getWebSession();
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV60SdtInformeInditexCollection = new GXBaseCollection<app.SdtSDTInformeInditex>(app.SdtSDTInformeInditex.class, "SDTInformeInditex", "TexplusNET", remoteHandle);
      AV61sdtInformeInditex = new app.SdtSDTInformeInditex(remoteHandle, context);
      AV62PrdNum = "" ;
      AV63Prdnom = "" ;
      AV75Categoria = "" ;
      AV64PrdFuncion = "" ;
      AV65PrdNroCAS = "" ;
      AV66PrdEINECS = "" ;
      AV67PrdNmQu = "" ;
      AV68PrdZDHC = "" ;
      AV76Lote = "" ;
      AV69PrdFabNm = "" ;
      AV70PrvNom = "" ;
      AV73CantC = DecimalUtil.ZERO ;
      AV74CantCm = DecimalUtil.ZERO ;
      AV77Stockfinal = DecimalUtil.ZERO ;
      AV78StockInicial = DecimalUtil.ZERO ;
      AV79PrdFHS = GXutil.nullDate() ;
      AV80LocUtiDc = "" ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15Random ;
   private int AV13CellRow ;
   private int AV57cellCol ;
   private int AV83GXV1 ;
   private java.math.BigDecimal AV73CantC ;
   private java.math.BigDecimal AV74CantCm ;
   private java.math.BigDecimal AV77Stockfinal ;
   private java.math.BigDecimal AV78StockInicial ;
   private String AV62PrdNum ;
   private String AV63Prdnom ;
   private String AV75Categoria ;
   private String AV64PrdFuncion ;
   private String AV65PrdNroCAS ;
   private String AV66PrdEINECS ;
   private String AV68PrdZDHC ;
   private String AV76Lote ;
   private String AV69PrdFabNm ;
   private String AV70PrvNom ;
   private String AV80LocUtiDc ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV79PrdFHS ;
   private boolean returnInSub ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV71InformeInditex ;
   private String AV67PrdNmQu ;
   private com.genexus.webpanels.WebSession AV59WebSession ;
   private String[] aP1 ;
   private String[] aP0 ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private GXBaseCollection<app.SdtSDTInformeInditex> AV60SdtInformeInditexCollection ;
   private app.SdtSDTInformeInditex AV61sdtInformeInditex ;
}

