package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_export extends GXProcedure
{
   public upq_cuentacorriente_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_export.class ), "" );
   }

   public upq_cuentacorriente_export( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      upq_cuentacorriente_export.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      upq_cuentacorriente_export.this.AV14Emprcod = aP0[0];
      this.aP0 = aP0;
      upq_cuentacorriente_export.this.AV15Prdnum = aP1[0];
      this.aP1 = aP1;
      upq_cuentacorriente_export.this.AV32Prdnom = aP2[0];
      this.aP2 = aP2;
      upq_cuentacorriente_export.this.AV16CCstkfec = aP3[0];
      this.aP3 = aP3;
      upq_cuentacorriente_export.this.AV17CCstkfec_to = aP4[0];
      this.aP4 = aP4;
      upq_cuentacorriente_export.this.AV18saldoinicial = aP5[0];
      this.aP5 = aP5;
      upq_cuentacorriente_export.this.aP6 = aP6;
      upq_cuentacorriente_export.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV35EntSalInv) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV14Emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int2) ;
      upq_cuentacorriente_export.this.GXt_int1 = GXv_int2[0] ;
      AV35EntSalInv = GXt_int1 ;
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
      AV10Random = (short)(GXutil.random( )*10000) ;
      AV8Filename = "UPQ_CuentaCorriente_Export-" + GXutil.trim( GXutil.str( AV10Random, 4, 0)) + ".xlsx" ;
      AV11ExcelDocument.Open(AV8Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11ExcelDocument.getErrCode() != 0 )
      {
         AV8Filename = "" ;
         AV9ErrorMessage = AV11ExcelDocument.getErrDescription() ;
         AV11ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV11ExcelDocument.Cells(1, 3, 1, 1).setText( AV15Prdnum );
      AV11ExcelDocument.Cells(1, 4, 1, 1).setText( AV32Prdnom );
      AV11ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Saldo Inicial < ", "")+localUtil.dtoc( AV16CCstkfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+" = " );
      AV11ExcelDocument.Cells(1, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18saldoinicial)) );
      AV12CellRow = 2 ;
      AV13CellCol = 1 ;
      while ( AV13CellCol <= 100 )
      {
         AV11ExcelDocument.Cells(AV12CellRow, AV13CellCol, 1, 1).setBold( (short)(1) );
         AV11ExcelDocument.Cells(AV12CellRow, AV13CellCol, 1, 1).setColor( 11 );
         AV13CellCol = (int)(AV13CellCol+1) ;
      }
      AV11ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Linea", "") );
      AV11ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Dia Hora", "") );
      AV11ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Tipo", "") );
      AV11ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV11ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Cant. Entrada", "") );
      AV11ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Cant. Salida", "") );
      AV11ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV11ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Saldo", "") );
      AV11ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV11ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Fecha Caducidad", "") );
      AV11ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Nº HDR", "") );
      AV11ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Usuario", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV12CellRow = 3 ;
      AV22Exis = AV18saldoinicial ;
      /* Using cursor P09GP2 */
      pr_default.execute(0, new Object[] {AV14Emprcod, AV15Prdnum, AV16CCstkfec, AV17CCstkfec_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09GP2_A396EmprCod[0] ;
         A719PrdNum = P09GP2_A719PrdNum[0] ;
         A3345TipMovCc = P09GP2_A3345TipMovCc[0] ;
         A3348CCStkFec = P09GP2_A3348CCStkFec[0] ;
         A3343CCStkCanE = P09GP2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P09GP2_A3344CCStkCanS[0] ;
         A3352CCStkPar = P09GP2_A3352CCStkPar[0] ;
         A3351CCStkReo = P09GP2_A3351CCStkReo[0] ;
         A3350CCStkBar = P09GP2_A3350CCStkBar[0] ;
         A3342CCStkLin = P09GP2_A3342CCStkLin[0] ;
         A3357CCStkDsc = P09GP2_A3357CCStkDsc[0] ;
         A3349CCStkPre = P09GP2_A3349CCStkPre[0] ;
         A5722CCStkLot = P09GP2_A5722CCStkLot[0] ;
         A13979CCStkLotFe = P09GP2_A13979CCStkLotFe[0] ;
         A3355CCStkUsu = P09GP2_A3355CCStkUsu[0] ;
         A3356CCStkHor = P09GP2_A3356CCStkHor[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV25Recfec = A3348CCStkFec ;
            GXv_char3[0] = AV14Emprcod ;
            GXv_char4[0] = AV15Prdnum ;
            GXv_date5[0] = A3348CCStkFec ;
            GXv_decimal6[0] = AV33ComprasInv ;
            GXv_decimal7[0] = AV34ConsumosInv ;
            GXv_decimal8[0] = AV26RecExiRcc ;
            GXv_decimal9[0] = AV27RecExiRea ;
            GXv_decimal10[0] = AV28RecExiTcc ;
            GXv_decimal11[0] = AV29Recexiteo ;
            new app.recuento(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
            upq_cuentacorriente_export.this.AV14Emprcod = GXv_char3[0] ;
            upq_cuentacorriente_export.this.AV15Prdnum = GXv_char4[0] ;
            upq_cuentacorriente_export.this.A3348CCStkFec = GXv_date5[0] ;
            upq_cuentacorriente_export.this.AV33ComprasInv = GXv_decimal6[0] ;
            upq_cuentacorriente_export.this.AV34ConsumosInv = GXv_decimal7[0] ;
            upq_cuentacorriente_export.this.AV26RecExiRcc = GXv_decimal8[0] ;
            upq_cuentacorriente_export.this.AV27RecExiRea = GXv_decimal9[0] ;
            upq_cuentacorriente_export.this.AV28RecExiTcc = GXv_decimal10[0] ;
            upq_cuentacorriente_export.this.AV29Recexiteo = GXv_decimal11[0] ;
            AV22Exis = ((AV35EntSalInv==0) ? AV27RecExiRea : AV27RecExiRea.add(AV33ComprasInv).subtract(AV34ConsumosInv)) ;
         }
         AV19DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         AV23Ccstkcane = A3343CCStkCanE ;
         AV20CCStkCanS = A3344CCStkCanS ;
         AV23Ccstkcane = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV23Ccstkcane) ;
         AV20CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV20CCStkCanS) ;
         AV22Exis = AV22Exis.add((AV23Ccstkcane.subtract(AV20CCStkCanS))) ;
         AV24hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         AV11ExcelDocument.Cells(AV12CellRow, 1, 1, 1).setNumber( A3342CCStkLin );
         AV11ExcelDocument.Cells(AV12CellRow, 2, 1, 1).setText( AV19DiaHora );
         AV11ExcelDocument.Cells(AV12CellRow, 3, 1, 1).setText( A3345TipMovCc );
         AV11ExcelDocument.Cells(AV12CellRow, 4, 1, 1).setText( A3357CCStkDsc );
         AV11ExcelDocument.Cells(AV12CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23Ccstkcane)) );
         AV11ExcelDocument.Cells(AV12CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20CCStkCanS)) );
         AV11ExcelDocument.Cells(AV12CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3349CCStkPre)) );
         AV11ExcelDocument.Cells(AV12CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22Exis)) );
         AV11ExcelDocument.Cells(AV12CellRow, 9, 1, 1).setText( A5722CCStkLot );
         GXt_dtime12 = GXutil.resetTime( A13979CCStkLotFe );
         AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV11ExcelDocument.Cells(AV12CellRow, 10, 1, 1).setDate( GXt_dtime12 );
         AV11ExcelDocument.Cells(AV12CellRow, 11, 1, 1).setText( AV24hdr );
         AV11ExcelDocument.Cells(AV12CellRow, 12, 1, 1).setText( A3355CCStkUsu );
         AV12CellRow = (int)(AV12CellRow+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Close();
   }

   protected void cleanup( )
   {
      this.aP0[0] = upq_cuentacorriente_export.this.AV14Emprcod;
      this.aP1[0] = upq_cuentacorriente_export.this.AV15Prdnum;
      this.aP2[0] = upq_cuentacorriente_export.this.AV32Prdnom;
      this.aP3[0] = upq_cuentacorriente_export.this.AV16CCstkfec;
      this.aP4[0] = upq_cuentacorriente_export.this.AV17CCstkfec_to;
      this.aP5[0] = upq_cuentacorriente_export.this.AV18saldoinicial;
      this.aP6[0] = upq_cuentacorriente_export.this.AV8Filename;
      this.aP7[0] = upq_cuentacorriente_export.this.AV9ErrorMessage;
      CloseOpenCursors();
      AV11ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Filename = "" ;
      AV9ErrorMessage = "" ;
      GXv_int2 = new byte[1] ;
      AV11ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV22Exis = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09GP2_A396EmprCod = new String[] {""} ;
      P09GP2_A719PrdNum = new String[] {""} ;
      P09GP2_A3345TipMovCc = new String[] {""} ;
      P09GP2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09GP2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GP2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GP2_A3352CCStkPar = new String[] {""} ;
      P09GP2_A3351CCStkReo = new byte[1] ;
      P09GP2_A3350CCStkBar = new int[1] ;
      P09GP2_A3342CCStkLin = new long[1] ;
      P09GP2_A3357CCStkDsc = new String[] {""} ;
      P09GP2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GP2_A5722CCStkLot = new String[] {""} ;
      P09GP2_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      P09GP2_A3355CCStkUsu = new String[] {""} ;
      P09GP2_A3356CCStkHor = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A13979CCStkLotFe = GXutil.nullDate() ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      AV25Recfec = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      AV33ComprasInv = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV34ConsumosInv = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV26RecExiRcc = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV27RecExiRea = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV28RecExiTcc = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV29Recexiteo = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV19DiaHora = "" ;
      AV23Ccstkcane = DecimalUtil.ZERO ;
      AV20CCStkCanS = DecimalUtil.ZERO ;
      AV24hdr = "" ;
      GXt_dtime12 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.upq_cuentacorriente_export__default(),
         new Object[] {
             new Object[] {
            P09GP2_A396EmprCod, P09GP2_A719PrdNum, P09GP2_A3345TipMovCc, P09GP2_A3348CCStkFec, P09GP2_A3343CCStkCanE, P09GP2_A3344CCStkCanS, P09GP2_A3352CCStkPar, P09GP2_A3351CCStkReo, P09GP2_A3350CCStkBar, P09GP2_A3342CCStkLin,
            P09GP2_A3357CCStkDsc, P09GP2_A3349CCStkPre, P09GP2_A5722CCStkLot, P09GP2_A13979CCStkLotFe, P09GP2_A3355CCStkUsu, P09GP2_A3356CCStkHor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3351CCStkReo ;
   private short AV35EntSalInv ;
   private short AV10Random ;
   private short Gx_err ;
   private int AV12CellRow ;
   private int AV13CellCol ;
   private int A3350CCStkBar ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV18saldoinicial ;
   private java.math.BigDecimal AV22Exis ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV33ComprasInv ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV34ConsumosInv ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV26RecExiRcc ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV27RecExiRea ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV28RecExiTcc ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV29Recexiteo ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV23Ccstkcane ;
   private java.math.BigDecimal AV20CCStkCanS ;
   private String AV14Emprcod ;
   private String AV15Prdnum ;
   private String AV32Prdnom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3352CCStkPar ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV19DiaHora ;
   private String AV24hdr ;
   private java.util.Date GXt_dtime12 ;
   private java.util.Date AV16CCstkfec ;
   private java.util.Date AV17CCstkfec_to ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A13979CCStkLotFe ;
   private java.util.Date AV25Recfec ;
   private java.util.Date GXv_date5[] ;
   private boolean returnInSub ;
   private String AV8Filename ;
   private String AV9ErrorMessage ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09GP2_A396EmprCod ;
   private String[] P09GP2_A719PrdNum ;
   private String[] P09GP2_A3345TipMovCc ;
   private java.util.Date[] P09GP2_A3348CCStkFec ;
   private java.math.BigDecimal[] P09GP2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09GP2_A3344CCStkCanS ;
   private String[] P09GP2_A3352CCStkPar ;
   private byte[] P09GP2_A3351CCStkReo ;
   private int[] P09GP2_A3350CCStkBar ;
   private long[] P09GP2_A3342CCStkLin ;
   private String[] P09GP2_A3357CCStkDsc ;
   private java.math.BigDecimal[] P09GP2_A3349CCStkPre ;
   private String[] P09GP2_A5722CCStkLot ;
   private java.util.Date[] P09GP2_A13979CCStkLotFe ;
   private String[] P09GP2_A3355CCStkUsu ;
   private String[] P09GP2_A3356CCStkHor ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

final  class upq_cuentacorriente_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GP2", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkCanE, CCStkCanS, CCStkPar, CCStkReo, CCStkBar, CCStkLin, CCStkDsc, CCStkPre, CCStkLot, CCStkLotFe, CCStkUsu, CCStkHor FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc <> 'EC') AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

