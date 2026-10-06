package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionlector extends GXProcedure
{
   public dpproduccionlector( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionlector.class ), "" );
   }

   public dpproduccionlector( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTProduccionLector> executeUdp( String aP0 ,
                                                                   String aP1 ,
                                                                   String aP2 ,
                                                                   java.util.Date aP3 ,
                                                                   java.util.Date aP4 )
   {
      dpproduccionlector.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTProduccionLector>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTProduccionLector>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTProduccionLector>[] aP5 )
   {
      dpproduccionlector.this.AV6Emprcod = aP0;
      dpproduccionlector.this.AV9MaqCodInicial = aP1;
      dpproduccionlector.this.AV10MaqCodFinal = aP2;
      dpproduccionlector.this.AV8Hisprodti = aP3;
      dpproduccionlector.this.AV11HisProdtf = aP4;
      dpproduccionlector.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00132 */
      pr_default.execute(0, new Object[] {AV6Emprcod, AV9MaqCodInicial, AV8Hisprodti, AV11HisProdtf, AV10MaqCodFinal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P00132_A602MaqCod[0] ;
         A396EmprCod = P00132_A396EmprCod[0] ;
         A606MaqDsc = P00132_A606MaqDsc[0] ;
         n606MaqDsc = P00132_n606MaqDsc[0] ;
         A4812BarEncCli = P00132_A4812BarEncCli[0] ;
         A143BarDisNum = P00132_A143BarDisNum[0] ;
         A252CliCod = P00132_A252CliCod[0] ;
         n252CliCod = P00132_n252CliCod[0] ;
         A279CliNom = P00132_A279CliNom[0] ;
         A159BarFecGen = P00132_A159BarFecGen[0] ;
         A212BarSer = P00132_A212BarSer[0] ;
         A1652BarSerDsc = P00132_A1652BarSerDsc[0] ;
         A217BarTipArt = P00132_A217BarTipArt[0] ;
         n217BarTipArt = P00132_n217BarTipArt[0] ;
         A135BarColNom = P00132_A135BarColNom[0] ;
         A136BarColNum = P00132_A136BarColNum[0] ;
         A218BarTipCol = P00132_A218BarTipCol[0] ;
         A1234BarNomCli = P00132_A1234BarNomCli[0] ;
         A1235BarNumCli = P00132_A1235BarNumCli[0] ;
         A1798BarDibCli = P00132_A1798BarDibCli[0] ;
         A1799BarDibInt = P00132_A1799BarDibInt[0] ;
         A656ParCod = P00132_A656ParCod[0] ;
         n656ParCod = P00132_n656ParCod[0] ;
         A867ParCodNom = P00132_A867ParCodNom[0] ;
         n867ParCodNom = P00132_n867ParCodNom[0] ;
         A503GruOpeCod = P00132_A503GruOpeCod[0] ;
         A461Fase = P00132_A461Fase[0] ;
         A557HisProF = P00132_A557HisProF[0] ;
         A566HisProTur = P00132_A566HisProTur[0] ;
         A1525HisProKgr = P00132_A1525HisProKgr[0] ;
         A1526HisProMtr = P00132_A1526HisProMtr[0] ;
         A3610HisProLot = P00132_A3610HisProLot[0] ;
         A561HisProLin = P00132_A561HisProLin[0] ;
         A558HisProFec = P00132_A558HisProFec[0] ;
         A4440HisProDTI = P00132_A4440HisProDTI[0] ;
         n4440HisProDTI = P00132_n4440HisProDTI[0] ;
         A4441HisProDTF = P00132_A4441HisProDTF[0] ;
         n4441HisProDTF = P00132_n4441HisProDTF[0] ;
         A130BarCodPar = P00132_A130BarCodPar[0] ;
         A132BarCodReo = P00132_A132BarCodReo[0] ;
         A129BarCod = P00132_A129BarCod[0] ;
         A606MaqDsc = P00132_A606MaqDsc[0] ;
         n606MaqDsc = P00132_n606MaqDsc[0] ;
         A867ParCodNom = P00132_A867ParCodNom[0] ;
         n867ParCodNom = P00132_n867ParCodNom[0] ;
         A4812BarEncCli = P00132_A4812BarEncCli[0] ;
         A143BarDisNum = P00132_A143BarDisNum[0] ;
         A252CliCod = P00132_A252CliCod[0] ;
         n252CliCod = P00132_n252CliCod[0] ;
         A159BarFecGen = P00132_A159BarFecGen[0] ;
         A212BarSer = P00132_A212BarSer[0] ;
         A1652BarSerDsc = P00132_A1652BarSerDsc[0] ;
         A217BarTipArt = P00132_A217BarTipArt[0] ;
         n217BarTipArt = P00132_n217BarTipArt[0] ;
         A135BarColNom = P00132_A135BarColNom[0] ;
         A136BarColNum = P00132_A136BarColNum[0] ;
         A218BarTipCol = P00132_A218BarTipCol[0] ;
         A1234BarNomCli = P00132_A1234BarNomCli[0] ;
         A1235BarNumCli = P00132_A1235BarNumCli[0] ;
         A1798BarDibCli = P00132_A1798BarDibCli[0] ;
         A1799BarDibInt = P00132_A1799BarDibInt[0] ;
         A279CliNom = P00132_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         Gxm1sdtproduccionlector = (app.SdtSDTProduccionLector)new app.SdtSDTProduccionLector(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionlector, 0);
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Maqcod( A602MaqCod );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Maqdsc( A606MaqDsc );
         GXt_char1 = "" ;
         GXv_char2[0] = A143BarDisNum ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = GXt_char1 ;
         new app.barenccli(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         dpproduccionlector.this.A143BarDisNum = GXv_char2[0] ;
         dpproduccionlector.this.A4812BarEncCli = GXv_char3[0] ;
         dpproduccionlector.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barenccli( GXt_char1 );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barnhdr( A13696BarNHdr );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Clicod( A252CliCod );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Clinom( A279CliNom );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barfecgen( A159BarFecGen );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barser( A212BarSer );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barserdsc( A1652BarSerDsc );
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
         dpproduccionlector.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Tipartdsc( GXt_char1 );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barcolnom( A135BarColNom );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barcolnum( A136BarColNum );
         GXt_char1 = "" ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A218BarTipCol ;
         GXv_char3[0] = GXt_char1 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
         dpproduccionlector.this.A396EmprCod = GXv_char4[0] ;
         dpproduccionlector.this.A218BarTipCol = GXv_int5[0] ;
         dpproduccionlector.this.GXt_char1 = GXv_char3[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Tipcoldsc( GXt_char1 );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Intdsc( " " );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barnomcli( A1234BarNomCli );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Barnumcli( A1235BarNumCli );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Bardibcli( A1798BarDibCli );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Bardibint( A1799BarDibInt );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Parcod( A656ParCod );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Parcodnom( A867ParCodNom );
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char4) ;
         dpproduccionlector.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Openom( GXt_char1 );
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char4) ;
         dpproduccionlector.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Fasdsc( GXt_char1 );
         GXt_char1 = "" ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A461Fase ;
         GXv_char2[0] = GXt_char1 ;
         new app.fasetinte(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         dpproduccionlector.this.A396EmprCod = GXv_char4[0] ;
         dpproduccionlector.this.A461Fase = GXv_char3[0] ;
         dpproduccionlector.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Tinte( GXt_char1 );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Hisprodti( A4440HisProDTI );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Hisprodtf( A4441HisProDTF );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Hisprof( A557HisProF );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Hisprotur( A566HisProTur );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Hisprokgr( A1525HisProKgr );
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Hispromtr( A1526HisProMtr );
         GXt_int6 = (short)(0) ;
         GXv_char4[0] = A461Fase ;
         GXv_char3[0] = A3610HisProLot ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int8[0] = A5605HisProTr2 ;
         GXv_int9[0] = GXt_int6 ;
         new app.tiemporeallector(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_int8, GXv_int9) ;
         dpproduccionlector.this.A461Fase = GXv_char4[0] ;
         dpproduccionlector.this.A3610HisProLot = GXv_char3[0] ;
         dpproduccionlector.this.A129BarCod = GXv_int7[0] ;
         dpproduccionlector.this.A132BarCodReo = GXv_int5[0] ;
         dpproduccionlector.this.A130BarCodPar = GXv_char2[0] ;
         dpproduccionlector.this.A5605HisProTr2 = GXv_int8[0] ;
         dpproduccionlector.this.GXt_int6 = GXv_int9[0] ;
         Gxm1sdtproduccionlector.setgxTv_SdtSDTProduccionLector_Tiempom( GXt_int6 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionlector.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTProduccionLector>(app.SdtSDTProduccionLector.class, "SDTProduccionLector", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00132_A602MaqCod = new String[] {""} ;
      P00132_A396EmprCod = new String[] {""} ;
      P00132_A606MaqDsc = new String[] {""} ;
      P00132_n606MaqDsc = new boolean[] {false} ;
      P00132_A4812BarEncCli = new String[] {""} ;
      P00132_A143BarDisNum = new String[] {""} ;
      P00132_A252CliCod = new int[1] ;
      P00132_n252CliCod = new boolean[] {false} ;
      P00132_A279CliNom = new String[] {""} ;
      P00132_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00132_A212BarSer = new String[] {""} ;
      P00132_A1652BarSerDsc = new String[] {""} ;
      P00132_A217BarTipArt = new short[1] ;
      P00132_n217BarTipArt = new boolean[] {false} ;
      P00132_A135BarColNom = new String[] {""} ;
      P00132_A136BarColNum = new int[1] ;
      P00132_A218BarTipCol = new byte[1] ;
      P00132_A1234BarNomCli = new String[] {""} ;
      P00132_A1235BarNumCli = new int[1] ;
      P00132_A1798BarDibCli = new String[] {""} ;
      P00132_A1799BarDibInt = new int[1] ;
      P00132_A656ParCod = new short[1] ;
      P00132_n656ParCod = new boolean[] {false} ;
      P00132_A867ParCodNom = new String[] {""} ;
      P00132_n867ParCodNom = new boolean[] {false} ;
      P00132_A503GruOpeCod = new int[1] ;
      P00132_A461Fase = new String[] {""} ;
      P00132_A557HisProF = new String[] {""} ;
      P00132_A566HisProTur = new byte[1] ;
      P00132_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00132_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00132_A3610HisProLot = new String[] {""} ;
      P00132_A561HisProLin = new int[1] ;
      P00132_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00132_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P00132_n4440HisProDTI = new boolean[] {false} ;
      P00132_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00132_n4441HisProDTF = new boolean[] {false} ;
      P00132_A130BarCodPar = new String[] {""} ;
      P00132_A132BarCodReo = new byte[1] ;
      P00132_A129BarCod = new int[1] ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A279CliNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A1798BarDibCli = "" ;
      A867ParCodNom = "" ;
      A461Fase = "" ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      Gxm1sdtproduccionlector = new app.SdtSDTProduccionLector(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionlector__default(),
         new Object[] {
             new Object[] {
            P00132_A602MaqCod, P00132_A396EmprCod, P00132_A606MaqDsc, P00132_n606MaqDsc, P00132_A4812BarEncCli, P00132_A143BarDisNum, P00132_A252CliCod, P00132_n252CliCod, P00132_A279CliNom, P00132_A159BarFecGen,
            P00132_A212BarSer, P00132_A1652BarSerDsc, P00132_A217BarTipArt, P00132_n217BarTipArt, P00132_A135BarColNom, P00132_A136BarColNum, P00132_A218BarTipCol, P00132_A1234BarNomCli, P00132_A1235BarNumCli, P00132_A1798BarDibCli,
            P00132_A1799BarDibInt, P00132_A656ParCod, P00132_n656ParCod, P00132_A867ParCodNom, P00132_n867ParCodNom, P00132_A503GruOpeCod, P00132_A461Fase, P00132_A557HisProF, P00132_A566HisProTur, P00132_A1525HisProKgr,
            P00132_A1526HisProMtr, P00132_A3610HisProLot, P00132_A561HisProLin, P00132_A558HisProFec, P00132_A4440HisProDTI, P00132_n4440HisProDTI, P00132_A4441HisProDTF, P00132_n4441HisProDTF, P00132_A130BarCodPar, P00132_A132BarCodReo,
            P00132_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A218BarTipCol ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A217BarTipArt ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short GXt_int6 ;
   private short GXv_int8[] ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A1799BarDibInt ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int GXv_int7[] ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV6Emprcod ;
   private String AV9MaqCodInicial ;
   private String AV10MaqCodFinal ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A1798BarDibCli ;
   private String A867ParCodNom ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A3610HisProLot ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV8Hisprodti ;
   private java.util.Date AV11HisProdtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A558HisProFec ;
   private boolean n606MaqDsc ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtSDTProduccionLector>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00132_A602MaqCod ;
   private String[] P00132_A396EmprCod ;
   private String[] P00132_A606MaqDsc ;
   private boolean[] P00132_n606MaqDsc ;
   private String[] P00132_A4812BarEncCli ;
   private String[] P00132_A143BarDisNum ;
   private int[] P00132_A252CliCod ;
   private boolean[] P00132_n252CliCod ;
   private String[] P00132_A279CliNom ;
   private java.util.Date[] P00132_A159BarFecGen ;
   private String[] P00132_A212BarSer ;
   private String[] P00132_A1652BarSerDsc ;
   private short[] P00132_A217BarTipArt ;
   private boolean[] P00132_n217BarTipArt ;
   private String[] P00132_A135BarColNom ;
   private int[] P00132_A136BarColNum ;
   private byte[] P00132_A218BarTipCol ;
   private String[] P00132_A1234BarNomCli ;
   private int[] P00132_A1235BarNumCli ;
   private String[] P00132_A1798BarDibCli ;
   private int[] P00132_A1799BarDibInt ;
   private short[] P00132_A656ParCod ;
   private boolean[] P00132_n656ParCod ;
   private String[] P00132_A867ParCodNom ;
   private boolean[] P00132_n867ParCodNom ;
   private int[] P00132_A503GruOpeCod ;
   private String[] P00132_A461Fase ;
   private String[] P00132_A557HisProF ;
   private byte[] P00132_A566HisProTur ;
   private java.math.BigDecimal[] P00132_A1525HisProKgr ;
   private java.math.BigDecimal[] P00132_A1526HisProMtr ;
   private String[] P00132_A3610HisProLot ;
   private int[] P00132_A561HisProLin ;
   private java.util.Date[] P00132_A558HisProFec ;
   private java.util.Date[] P00132_A4440HisProDTI ;
   private boolean[] P00132_n4440HisProDTI ;
   private java.util.Date[] P00132_A4441HisProDTF ;
   private boolean[] P00132_n4441HisProDTF ;
   private String[] P00132_A130BarCodPar ;
   private byte[] P00132_A132BarCodReo ;
   private int[] P00132_A129BarCod ;
   private GXBaseCollection<app.SdtSDTProduccionLector> Gxm2rootcol ;
   private app.SdtSDTProduccionLector Gxm1sdtproduccionlector ;
}

final  class dpproduccionlector__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00132", "SELECT T1.MaqCod, T1.EmprCod, T2.MaqDsc, T4.BarEncCli, T4.BarDisNum, T4.CliCod, T5.CliNom, T4.BarFecGen, T4.BarSer, T4.BarSerDsc, T4.BarTipArt, T4.BarColNom, T4.BarColNum, T4.BarTipCol, T4.BarNomCli, T4.BarNumCli, T4.BarDibCli, T4.BarDibInt, T1.ParCod, T3.ParCodNom, T1.GruOpeCod, T1.Fase, T1.HisProF, T1.HisProTur, T1.HisProKgr, T1.HisProMtr, T1.HisProLot, T1.HisProLin, T1.HisProFec, T1.HisProDTI, T1.HisProDTF, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T4.CliCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 13);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 16);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(21);
               ((String[]) buf[26])[0] = rslt.getString(22, 8);
               ((String[]) buf[27])[0] = rslt.getString(23, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(24);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[31])[0] = rslt.getString(27, 10);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(29);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(31);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(32, 1);
               ((byte[]) buf[39])[0] = rslt.getByte(33);
               ((int[]) buf[40])[0] = rslt.getInt(34);
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

