package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumentipoarticulo_usuwcexport extends GXProcedure
{
   public informeproduccionresumentipoarticulo_usuwcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumentipoarticulo_usuwcexport.class ), "" );
   }

   public informeproduccionresumentipoarticulo_usuwcexport( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String[] aP6 )
   {
      informeproduccionresumentipoarticulo_usuwcexport.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      informeproduccionresumentipoarticulo_usuwcexport.this.AV16Emprcod = aP0;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV17HisEstReo = aP1;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV90MaqCod_From = aP2;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV91MaqCod_To = aP3;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV92DateTime_From = aP4;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV93DateTime_To = aP5;
      informeproduccionresumentipoarticulo_usuwcexport.this.aP6 = aP6;
      informeproduccionresumentipoarticulo_usuwcexport.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'TOTALES' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTER' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
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
      AV11Filename = "InformeProduccionResumenTipoArticulo-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTER' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells((int)(AV13CellRow), 1, 1, 1).setText( AV105EmprNom+" "+"("+AV112Pgmdesc+")" );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 2, 1, 1).setText( httpContext.getMessage( "Estado: ", "")+" "+AV86TipoTxt );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 3, 1, 1).setText( httpContext.getMessage( "Maquina inicial: ", "")+" "+AV90MaqCod_From+" "+AV108MaqDscInicial );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 4, 1, 1).setText( httpContext.getMessage( "Maquina final: ", "")+" "+AV91MaqCod_To+" "+AV109MaqDscFinal );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 5, 1, 1).setText( httpContext.getMessage( "Periodo desde: ", "")+" "+localUtil.ttoc( AV92DateTime_From, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " hasta: ", "")+localUtil.ttoc( AV93DateTime_To, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV13CellRow = 3 ;
      AV87CellCol = (short)(1) ;
      while ( AV87CellCol <= 40 )
      {
         AV10ExcelDocument.Cells((int)(AV13CellRow), AV87CellCol, 1, 1).setBold( (short)(1) );
         AV87CellCol = (short)(AV87CellCol+1) ;
      }
      AV10ExcelDocument.Cells((int)(AV13CellRow), 1, 1, 1).setText( httpContext.getMessage( "Tipo Articulo", "") );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 3, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 4, 1, 1).setText( "%" );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 5, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 6, 1, 1).setText( "%" );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV13CellRow = 4 ;
      AV89TipArtDsc = "" ;
      AV88HisProTip = (short)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV17HisEstReo) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A602MaqCod ,
                                           AV90MaqCod_From ,
                                           AV91MaqCod_To ,
                                           A4441HisProDTF ,
                                           AV92DateTime_From ,
                                           AV93DateTime_To ,
                                           Short.valueOf(A656ParCod) ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A942 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV90MaqCod_From, AV91MaqCod_To, AV92DateTime_From, AV93DateTime_To, Byte.valueOf(AV17HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA942 = false ;
         A396EmprCod = P0A942_A396EmprCod[0] ;
         A656ParCod = P0A942_A656ParCod[0] ;
         n656ParCod = P0A942_n656ParCod[0] ;
         A2247HisProTip = P0A942_A2247HisProTip[0] ;
         A1525HisProKgr = P0A942_A1525HisProKgr[0] ;
         A1526HisProMtr = P0A942_A1526HisProMtr[0] ;
         A3612HisProReo = P0A942_A3612HisProReo[0] ;
         A4441HisProDTF = P0A942_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A942_n4441HisProDTF[0] ;
         A602MaqCod = P0A942_A602MaqCod[0] ;
         A558HisProFec = P0A942_A558HisProFec[0] ;
         A561HisProLin = P0A942_A561HisProLin[0] ;
         AV98HisProKgr = DecimalUtil.ZERO ;
         AV99HisProMtr = DecimalUtil.ZERO ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A942_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A942_A2247HisProTip[0] == A2247HisProTip ) )
         {
            brkA942 = false ;
            A1525HisProKgr = P0A942_A1525HisProKgr[0] ;
            A1526HisProMtr = P0A942_A1526HisProMtr[0] ;
            A602MaqCod = P0A942_A602MaqCod[0] ;
            A558HisProFec = P0A942_A558HisProFec[0] ;
            A561HisProLin = P0A942_A561HisProLin[0] ;
            AV98HisProKgr = AV98HisProKgr.add(A1525HisProKgr) ;
            AV99HisProMtr = AV99HisProMtr.add(A1526HisProMtr) ;
            brkA942 = true ;
            pr_default.readNext(0);
         }
         AV88HisProTip = A2247HisProTip ;
         GXt_char1 = AV89TipArtDsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char2) ;
         informeproduccionresumentipoarticulo_usuwcexport.this.GXt_char1 = GXv_char2[0] ;
         AV89TipArtDsc = GXt_char1 ;
         AV100PorKilo = ((AV102TTotk.doubleValue()>0) ? (AV98HisProKgr.divide(AV102TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV101PorMetro = ((AV103TTotMt.doubleValue()>0) ? (AV99HisProMtr.divide(AV103TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         GXt_char1 = AV89TipArtDsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( AV16Emprcod, AV88HisProTip, GXv_char2) ;
         informeproduccionresumentipoarticulo_usuwcexport.this.GXt_char1 = GXv_char2[0] ;
         AV89TipArtDsc = GXt_char1 ;
         AV10ExcelDocument.Cells((int)(AV13CellRow), 1, 1, 1).setNumber( A2247HisProTip );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 2, 1, 1).setText( AV89TipArtDsc );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV98HisProKgr)) );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV100PorKilo)) );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99HisProMtr)) );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV101PorMetro)) );
         AV13CellRow = (long)(AV13CellRow+1) ;
         if ( ! brkA942 )
         {
            brkA942 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S161( )
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

   public void S171( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV102TTotk = DecimalUtil.doubleToDec(0) ;
      AV103TTotMt = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0A943 */
      pr_default.execute(1, new Object[] {AV16Emprcod, AV90MaqCod_From, AV92DateTime_From, AV93DateTime_To, Byte.valueOf(AV17HisEstReo), Byte.valueOf(AV17HisEstReo), AV91MaqCod_To});
      c1525HisProKgr = P0A943_A1525HisProKgr[0] ;
      c1526HisProMtr = P0A943_A1526HisProMtr[0] ;
      pr_default.close(1);
      AV102TTotk = AV102TTotk.add(c1525HisProKgr) ;
      AV103TTotMt = AV103TTotMt.add(c1526HisProMtr) ;
      /* End optimized group. */
   }

   public void S181( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char1 = AV104Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumentipoarticulo_usuwcexport.this.GXt_char1 = GXv_char2[0] ;
      AV104Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV105EmprNom ;
      GXv_char4[0] = AV106UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV104Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV16Emprcod = GXv_char2[0] ;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV105EmprNom = GXv_char3[0] ;
      informeproduccionresumentipoarticulo_usuwcexport.this.AV106UsurCod = GXv_char4[0] ;
      AV86TipoTxt = ((AV17HisEstReo==9) ? httpContext.getMessage( "Todo", "") : ((AV17HisEstReo==0) ? httpContext.getMessage( "Produccion Normal", "") : ((AV17HisEstReo==1) ? httpContext.getMessage( "Reoperado I", "") : httpContext.getMessage( "Reoperado E", "")))) ;
   }

   protected void cleanup( )
   {
      this.aP6[0] = informeproduccionresumentipoarticulo_usuwcexport.this.AV11Filename;
      this.aP7[0] = informeproduccionresumentipoarticulo_usuwcexport.this.AV12ErrorMessage;
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
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV105EmprNom = "" ;
      AV112Pgmdesc = "" ;
      AV86TipoTxt = "" ;
      AV108MaqDscInicial = "" ;
      AV109MaqDscFinal = "" ;
      AV89TipArtDsc = "" ;
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P0A942_A396EmprCod = new String[] {""} ;
      P0A942_A656ParCod = new short[1] ;
      P0A942_n656ParCod = new boolean[] {false} ;
      P0A942_A2247HisProTip = new short[1] ;
      P0A942_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A942_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A942_A3612HisProReo = new byte[1] ;
      P0A942_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A942_n4441HisProDTF = new boolean[] {false} ;
      P0A942_A602MaqCod = new String[] {""} ;
      P0A942_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A942_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      AV98HisProKgr = DecimalUtil.ZERO ;
      AV99HisProMtr = DecimalUtil.ZERO ;
      AV100PorKilo = DecimalUtil.ZERO ;
      AV102TTotk = DecimalUtil.ZERO ;
      AV101PorMetro = DecimalUtil.ZERO ;
      AV103TTotMt = DecimalUtil.ZERO ;
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      P0A943_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A943_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV104Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV106UsurCod = "" ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumentipoarticulo_usuwcexport__default(),
         new Object[] {
             new Object[] {
            P0A942_A396EmprCod, P0A942_A656ParCod, P0A942_n656ParCod, P0A942_A2247HisProTip, P0A942_A1525HisProKgr, P0A942_A1526HisProMtr, P0A942_A3612HisProReo, P0A942_A4441HisProDTF, P0A942_n4441HisProDTF, P0A942_A602MaqCod,
            P0A942_A558HisProFec, P0A942_A561HisProLin
            }
            , new Object[] {
            P0A943_A1525HisProKgr, P0A943_A1526HisProMtr
            }
         }
      );
      AV112Pgmdesc = httpContext.getMessage( "Informe Produccion Resumen Tipo Articulo", "") ;
      /* GeneXus formulas. */
      AV112Pgmdesc = httpContext.getMessage( "Informe Produccion Resumen Tipo Articulo", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV17HisEstReo ;
   private byte A3612HisProReo ;
   private short AV87CellCol ;
   private short AV88HisProTip ;
   private short A656ParCod ;
   private short A2247HisProTip ;
   private short Gx_err ;
   private int AV15Random ;
   private int A561HisProLin ;
   private long AV13CellRow ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV98HisProKgr ;
   private java.math.BigDecimal AV99HisProMtr ;
   private java.math.BigDecimal AV100PorKilo ;
   private java.math.BigDecimal AV102TTotk ;
   private java.math.BigDecimal AV101PorMetro ;
   private java.math.BigDecimal AV103TTotMt ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private String AV16Emprcod ;
   private String AV90MaqCod_From ;
   private String AV91MaqCod_To ;
   private String AV105EmprNom ;
   private String AV112Pgmdesc ;
   private String AV86TipoTxt ;
   private String AV108MaqDscInicial ;
   private String AV109MaqDscFinal ;
   private String AV89TipArtDsc ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String AV104Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV106UsurCod ;
   private String GXv_char4[] ;
   private java.util.Date AV92DateTime_From ;
   private java.util.Date AV93DateTime_To ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brkA942 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A942_A396EmprCod ;
   private short[] P0A942_A656ParCod ;
   private boolean[] P0A942_n656ParCod ;
   private short[] P0A942_A2247HisProTip ;
   private java.math.BigDecimal[] P0A942_A1525HisProKgr ;
   private java.math.BigDecimal[] P0A942_A1526HisProMtr ;
   private byte[] P0A942_A3612HisProReo ;
   private java.util.Date[] P0A942_A4441HisProDTF ;
   private boolean[] P0A942_n4441HisProDTF ;
   private String[] P0A942_A602MaqCod ;
   private java.util.Date[] P0A942_A558HisProFec ;
   private int[] P0A942_A561HisProLin ;
   private java.math.BigDecimal[] P0A943_A1525HisProKgr ;
   private java.math.BigDecimal[] P0A943_A1526HisProMtr ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
}

final  class informeproduccionresumentipoarticulo_usuwcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A942( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV17HisEstReo ,
                                          byte A3612HisProReo ,
                                          String A602MaqCod ,
                                          String AV90MaqCod_From ,
                                          String AV91MaqCod_To ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV92DateTime_From ,
                                          java.util.Date AV93DateTime_To ,
                                          short A656ParCod ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, ParCod, HisProTip, HisProKgr, HisProMtr, HisProReo, HisProDTF, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MaqCod >= ?)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(ParCod = 0)");
      if ( ! ( AV17HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HisProTip" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A942(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A942", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A943", "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) AND (MaqCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

