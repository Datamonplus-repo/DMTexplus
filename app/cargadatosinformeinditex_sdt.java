package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargadatosinformeinditex_sdt extends GXProcedure
{
   public cargadatosinformeinditex_sdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargadatosinformeinditex_sdt.class ), "" );
   }

   public cargadatosinformeinditex_sdt( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             byte aP6 )
   {
      cargadatosinformeinditex_sdt.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        byte aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             byte aP6 ,
                             String[] aP7 )
   {
      cargadatosinformeinditex_sdt.this.AV10EmprCod = aP0;
      cargadatosinformeinditex_sdt.this.AV11Fecha = aP1;
      cargadatosinformeinditex_sdt.this.AV12Fecha_to = aP2;
      cargadatosinformeinditex_sdt.this.AV13Prdnum1 = aP3;
      cargadatosinformeinditex_sdt.this.AV14PrdNum2 = aP4;
      cargadatosinformeinditex_sdt.this.AV15LoteBusqueda = aP5;
      cargadatosinformeinditex_sdt.this.AV16CalStkIni = aP6;
      cargadatosinformeinditex_sdt.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(AV46ConMan) ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "CONMAN", ""), GXv_int1) ;
      cargadatosinformeinditex_sdt.this.AV46ConMan = GXv_int1[0] ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_int4[0] = AV32Contval ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      cargadatosinformeinditex_sdt.this.AV10EmprCod = GXv_char2[0] ;
      cargadatosinformeinditex_sdt.this.AV32Contval = GXv_int4[0] ;
      GXv_char3[0] = AV10EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "CONMAN", "") ;
      GXv_char5[0] = AV47contdsc ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char5) ;
      cargadatosinformeinditex_sdt.this.AV10EmprCod = GXv_char3[0] ;
      cargadatosinformeinditex_sdt.this.AV47contdsc = GXv_char5[0] ;
      AV46ConMan = (short)(((0==AV46ConMan) ? 9 : AV46ConMan)) ;
      GXt_int6 = (byte)(AV48Proprv) ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int1) ;
      cargadatosinformeinditex_sdt.this.GXt_int6 = GXv_int1[0] ;
      AV48Proprv = GXt_int6 ;
      GXt_int6 = (byte)(AV49Lotes) ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int1) ;
      cargadatosinformeinditex_sdt.this.GXt_int6 = GXv_int1[0] ;
      AV49Lotes = GXt_int6 ;
      AV50Fec1 = AV11Fecha ;
      AV51Fec2 = AV12Fecha_to ;
      AV52Prdnumi = AV13Prdnum1 ;
      AV53PrdNumf = AV14PrdNum2 ;
      AV54Mes = (byte)(GXutil.month( AV50Fec1)) ;
      AV55Anyo = (short)(GXutil.year( AV50Fec1)) ;
      AV56MesAnt = (byte)(AV54Mes-1) ;
      AV57AnyoANt = (short)(((AV56MesAnt==0) ? AV55Anyo-1 : AV55Anyo)) ;
      AV56MesAnt = (byte)(((AV56MesAnt==0) ? 12 : AV56MesAnt)) ;
      AV58Dia = localUtil.dtoc( GXutil.dadd(AV50Fec1,-(1)), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV59DiaActual = localUtil.dtoc( AV50Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV60DiaFinMes = GXutil.dadd(AV50Fec1,-(1)) ;
      AV61DiaIniMesActual = localUtil.ctod( AV59DiaActual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV62DiaFinMesActual = GXutil.eomdate( localUtil.ctod( AV59DiaActual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV9InformeInditex = " " ;
      /* Execute user subroutine: 'CONSUMOS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CONSUMOS2' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CONSUMOS3' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'COMPRAS' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17z = (short)(1) ;
      AV18q = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV30Tab_prod[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV25Tab_lote[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV19Tab_cnt1[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV21Tab_cnt2[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      while ( AV17z <= 10000 )
      {
         if ( GXutil.strcmp(AV37Tab_prd[AV17z-1], " ") == 0 )
         {
            if (true) break;
         }
         AV63Prdnumin = AV37Tab_prd[AV17z-1] ;
         AV64Lote2 = AV28Tab_ltecn[AV17z-1] ;
         AV40Cantc = AV24Tab_cntcn[AV17z-1] ;
         AV41Cantcm = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'CONTROLLOTE' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17z = (short)(AV17z+1) ;
      }
      AV17z = (short)(1) ;
      while ( AV17z <= 10000 )
      {
         if ( GXutil.strcmp(AV29tab_prdcm[AV17z-1], " ") == 0 )
         {
            if (true) break;
         }
         AV63Prdnumin = AV29tab_prdcm[AV17z-1] ;
         AV64Lote2 = AV27Tab_ltecm[AV17z-1] ;
         AV41Cantcm = AV23Tab_cntcm[AV17z-1] ;
         AV40Cantc = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'CONTROLLOTE' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17z = (short)(AV17z+1) ;
      }
      AV65i = 1 ;
      while ( AV65i <= 10000 )
      {
         if ( GXutil.strcmp(AV30Tab_prod[AV65i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV33Prdnum = AV30Tab_prod[AV65i-1] ;
         GXt_char7 = AV38PrdNom ;
         GXv_char5[0] = AV10EmprCod ;
         GXv_char3[0] = AV33Prdnum ;
         GXv_char2[0] = GXt_char7 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_char2) ;
         cargadatosinformeinditex_sdt.this.AV10EmprCod = GXv_char5[0] ;
         cargadatosinformeinditex_sdt.this.AV33Prdnum = GXv_char3[0] ;
         cargadatosinformeinditex_sdt.this.GXt_char7 = GXv_char2[0] ;
         AV38PrdNom = GXt_char7 ;
         AV40Cantc = AV19Tab_cnt1[AV65i-1].divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV41Cantcm = AV21Tab_cnt2[AV65i-1] ;
         AV42Lote = AV25Tab_lote[AV65i-1] ;
         AV34PrdFabNm = "" ;
         AV43PrdNomgrid = "" ;
         if ( AV40Cantc.doubleValue() > 0 )
         {
            /* Execute user subroutine: 'MASDATOS1' */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            if ( AV41Cantcm.doubleValue() > 0 )
            {
               /* Execute user subroutine: 'MASDATOS2' */
               S191 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         if ( GXutil.like( AV42Lote , GXutil.padr( AV15LoteBusqueda , 26 , "%"),  ' ' ) || (GXutil.strcmp("", AV15LoteBusqueda)==0) )
         {
            if ( AV16CalStkIni == 1 )
            {
               GXv_char5[0] = AV10EmprCod ;
               GXv_date8[0] = AV50Fec1 ;
               GXv_char3[0] = AV33Prdnum ;
               GXv_char2[0] = AV42Lote ;
               GXv_decimal9[0] = AV44Stockinicial ;
               new app.pprc125(remoteHandle, context).execute( GXv_char5, GXv_date8, GXv_char3, GXv_char2, GXv_decimal9) ;
               cargadatosinformeinditex_sdt.this.AV10EmprCod = GXv_char5[0] ;
               cargadatosinformeinditex_sdt.this.AV50Fec1 = GXv_date8[0] ;
               cargadatosinformeinditex_sdt.this.AV33Prdnum = GXv_char3[0] ;
               cargadatosinformeinditex_sdt.this.AV42Lote = GXv_char2[0] ;
               cargadatosinformeinditex_sdt.this.AV44Stockinicial = GXv_decimal9[0] ;
               Gx_msg = httpContext.getMessage( "Return Calculo Stock Inicial.PUTi103.. ", "") + AV33Prdnum ;
               System.out.println( Gx_msg );
            }
            if ( ( AV40Cantc.doubleValue() > 0 ) || ( AV41Cantcm.doubleValue() > 0 ) )
            {
               AV45Stockfinal = AV41Cantcm.add(AV44Stockinicial).subtract(AV40Cantc) ;
               AV39sdtInformesInditex = (app.SdtSDTInformeInditex)new app.SdtSDTInformeInditex(remoteHandle, context);
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Producto( AV33Prdnum );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Descripcion( AV38PrdNom );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Cantc( AV40Cantc );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Cantcm( AV41Cantcm );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Lote( AV42Lote );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Fabricante( AV34PrdFabNm );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Proveedor( AV43PrdNomgrid );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Stockinicial( AV44Stockinicial );
               AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Stockfinal( AV45Stockfinal );
               /* Using cursor P08XH2 */
               pr_default.execute(0, new Object[] {AV10EmprCod, AV33Prdnum});
               while ( (pr_default.getStatus(0) != 101) )
               {
                  A14011LocUtiID = P08XH2_A14011LocUtiID[0] ;
                  n14011LocUtiID = P08XH2_n14011LocUtiID[0] ;
                  A719PrdNum = P08XH2_A719PrdNum[0] ;
                  n719PrdNum = P08XH2_n719PrdNum[0] ;
                  A396EmprCod = P08XH2_A396EmprCod[0] ;
                  A11615PrdFuncion = P08XH2_A11615PrdFuncion[0] ;
                  A11196PrdNroCAS = P08XH2_A11196PrdNroCAS[0] ;
                  A11614PrdEINECS = P08XH2_A11614PrdEINECS[0] ;
                  A11616PrdNmQu = P08XH2_A11616PrdNmQu[0] ;
                  A13301PrdZDHC = P08XH2_A13301PrdZDHC[0] ;
                  A9742PrdFHS = P08XH2_A9742PrdFHS[0] ;
                  A14013LocUtiDc = P08XH2_A14013LocUtiDc[0] ;
                  A14013LocUtiDc = P08XH2_A14013LocUtiDc[0] ;
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Categoria( A11615PrdFuncion );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Prdfuncion( A11615PrdFuncion );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Prdnrocas( A11196PrdNroCAS );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Prdeinecs( A11614PrdEINECS );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Prdnmqu( A11616PrdNmQu );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Prdzdhc( A13301PrdZDHC );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Prdfhs( A9742PrdFHS );
                  AV39sdtInformesInditex.setgxTv_SdtSDTInformeInditex_Locutidc( A14013LocUtiDc );
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(0);
               AV8sdtInformeInditexCollection.add(AV39sdtInformesInditex, 0);
            }
         }
         AV40Cantc = DecimalUtil.doubleToDec(0) ;
         AV41Cantcm = DecimalUtil.doubleToDec(0) ;
         AV65i = (int)(AV65i+1) ;
      }
      AV9InformeInditex = AV8sdtInformeInditexCollection.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'CONSUMOS' Routine */
      returnInSub = false ;
      AV67Cant = DecimalUtil.doubleToDec(0) ;
      AV65i = 1 ;
      AV18q = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV24Tab_cntcn[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV28Tab_ltecn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV37Tab_prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P08XH3 */
      pr_default.execute(1, new Object[] {AV10EmprCod, AV52Prdnumi, AV50Fec1, AV51Fec2, AV53PrdNumf});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P08XH3_A396EmprCod[0] ;
         A12453HreFecAct = P08XH3_A12453HreFecAct[0] ;
         n12453HreFecAct = P08XH3_n12453HreFecAct[0] ;
         A719PrdNum = P08XH3_A719PrdNum[0] ;
         n719PrdNum = P08XH3_n719PrdNum[0] ;
         A4558HrePrdNum = P08XH3_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08XH3_n4558HrePrdNum[0] ;
         A4563HrePrdCant = P08XH3_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08XH3_n4563HrePrdCant[0] ;
         A5726HreLote = P08XH3_A5726HreLote[0] ;
         n5726HreLote = P08XH3_n5726HreLote[0] ;
         A4492HreBarCod = P08XH3_A4492HreBarCod[0] ;
         A4493HreBarReo = P08XH3_A4493HreBarReo[0] ;
         A4494HreBarPar = P08XH3_A4494HreBarPar[0] ;
         A4495HreNumCie = P08XH3_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08XH3_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08XH3_A4550HreLinPro[0] ;
         A4557HreRecLin = P08XH3_A4557HreRecLin[0] ;
         AV63Prdnumin = A4558HrePrdNum ;
         AV67Cant = A4563HrePrdCant ;
         AV31HreLote = ((GXutil.strcmp(A5726HreLote, " ")!=0) ? A5726HreLote : "S/N") ;
         /* Execute user subroutine: 'CONTROLLOTECN' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S131( )
   {
      /* 'CONSUMOS2' Routine */
      returnInSub = false ;
      /* Using cursor P08XH4 */
      pr_default.execute(2, new Object[] {AV10EmprCod, AV52Prdnumi, AV50Fec1, AV51Fec2, AV53PrdNumf});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A859CumCodCont = P08XH4_A859CumCodCont[0] ;
         A396EmprCod = P08XH4_A396EmprCod[0] ;
         A862CumConFec = P08XH4_A862CumConFec[0] ;
         A719PrdNum = P08XH4_A719PrdNum[0] ;
         n719PrdNum = P08XH4_n719PrdNum[0] ;
         A860CumConCant = P08XH4_A860CumConCant[0] ;
         A5862CumConLot = P08XH4_A5862CumConLot[0] ;
         A862CumConFec = P08XH4_A862CumConFec[0] ;
         AV63Prdnumin = A719PrdNum ;
         AV67Cant = ((AV32Contval==1) ? A860CumConCant.multiply(DecimalUtil.doubleToDec(1000)) : A860CumConCant) ;
         AV31HreLote = ((GXutil.strcmp(A5862CumConLot, " ")!=0) ? A5862CumConLot : "S/N") ;
         /* Execute user subroutine: 'CONTROLLOTECN' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S141( )
   {
      /* 'CONSUMOS3' Routine */
      returnInSub = false ;
      /* Using cursor P08XH5 */
      pr_default.execute(3, new Object[] {AV10EmprCod, AV52Prdnumi, AV50Fec1, AV51Fec2, AV53PrdNumf});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P08XH5_A396EmprCod[0] ;
         A3345TipMovCc = P08XH5_A3345TipMovCc[0] ;
         A3357CCStkDsc = P08XH5_A3357CCStkDsc[0] ;
         A3348CCStkFec = P08XH5_A3348CCStkFec[0] ;
         A719PrdNum = P08XH5_A719PrdNum[0] ;
         n719PrdNum = P08XH5_n719PrdNum[0] ;
         A3344CCStkCanS = P08XH5_A3344CCStkCanS[0] ;
         A5722CCStkLot = P08XH5_A5722CCStkLot[0] ;
         A3342CCStkLin = P08XH5_A3342CCStkLin[0] ;
         AV63Prdnumin = A719PrdNum ;
         AV67Cant = A3344CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
         AV31HreLote = ((GXutil.strcmp(A5722CCStkLot, " ")!=0) ? A5722CCStkLot : "S/N") ;
         /* Execute user subroutine: 'CONTROLLOTECN' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S123( )
   {
      /* 'CONTROLLOTECN' Routine */
      returnInSub = false ;
      AV65i = 1 ;
      AV66FlagLote = (short)(0) ;
      while ( AV65i <= 10000 )
      {
         if ( GXutil.strcmp(AV37Tab_prd[AV65i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV37Tab_prd[AV65i-1], AV63Prdnumin) == 0 )
         {
            if ( GXutil.strcmp(AV28Tab_ltecn[AV65i-1], AV31HreLote) == 0 )
            {
               AV24Tab_cntcn[AV65i-1] = AV24Tab_cntcn[AV65i-1].add(AV67Cant) ;
               AV66FlagLote = (short)(1) ;
               if (true) break;
            }
         }
         AV65i = (int)(AV65i+1) ;
      }
      if ( AV66FlagLote == 0 )
      {
         AV37Tab_prd[AV18q-1] = AV63Prdnumin ;
         AV24Tab_cntcn[AV18q-1] = AV67Cant ;
         AV28Tab_ltecn[AV18q-1] = AV31HreLote ;
         AV18q = (short)(AV18q+1) ;
      }
   }

   public void S151( )
   {
      /* 'COMPRAS' Routine */
      returnInSub = false ;
      AV41Cantcm = DecimalUtil.doubleToDec(0) ;
      AV65i = 1 ;
      AV17z = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV23Tab_cntcm[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV27Tab_ltecm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV29tab_prdcm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P08XH6 */
      pr_default.execute(4, new Object[] {AV10EmprCod, AV52Prdnumi, AV50Fec1, AV51Fec2, AV53PrdNumf});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A11Albaran = P08XH6_A11Albaran[0] ;
         A415EntFecEnt = P08XH6_A415EntFecEnt[0] ;
         A719PrdNum = P08XH6_A719PrdNum[0] ;
         n719PrdNum = P08XH6_n719PrdNum[0] ;
         A396EmprCod = P08XH6_A396EmprCod[0] ;
         A418EntUniEnt = P08XH6_A418EntUniEnt[0] ;
         A5686EntLotN = P08XH6_A5686EntLotN[0] ;
         A597LinEnt = P08XH6_A597LinEnt[0] ;
         AV63Prdnumin = A719PrdNum ;
         AV67Cant = A418EntUniEnt ;
         AV31HreLote = ((GXutil.strcmp(A5686EntLotN, " ")!=0) ? A5686EntLotN : "S/N") ;
         /* Execute user subroutine: 'CONTROLLOTECM' */
         S166 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S166( )
   {
      /* 'CONTROLLOTECM' Routine */
      returnInSub = false ;
      AV65i = 1 ;
      AV66FlagLote = (short)(0) ;
      while ( AV65i <= 10000 )
      {
         if ( GXutil.strcmp(AV29tab_prdcm[AV65i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV29tab_prdcm[AV65i-1], AV63Prdnumin) == 0 )
         {
            if ( GXutil.strcmp(AV27Tab_ltecm[AV65i-1], AV31HreLote) == 0 )
            {
               AV23Tab_cntcm[AV65i-1] = AV23Tab_cntcm[AV65i-1].add(AV67Cant) ;
               AV66FlagLote = (short)(1) ;
               if (true) break;
            }
         }
         AV65i = (int)(AV65i+1) ;
      }
      if ( AV66FlagLote == 0 )
      {
         AV29tab_prdcm[AV17z-1] = AV63Prdnumin ;
         AV23Tab_cntcm[AV17z-1] = AV67Cant ;
         AV27Tab_ltecm[AV17z-1] = AV31HreLote ;
         AV17z = (short)(AV17z+1) ;
      }
   }

   public void S171( )
   {
      /* 'CONTROLLOTE' Routine */
      returnInSub = false ;
      AV65i = 1 ;
      AV66FlagLote = (short)(0) ;
      while ( AV65i <= 10000 )
      {
         if ( GXutil.strcmp(AV30Tab_prod[AV65i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV30Tab_prod[AV65i-1], AV63Prdnumin) == 0 )
         {
            if ( GXutil.strcmp(AV25Tab_lote[AV65i-1], AV64Lote2) == 0 )
            {
               AV19Tab_cnt1[AV65i-1] = AV19Tab_cnt1[AV65i-1].add(AV40Cantc) ;
               AV21Tab_cnt2[AV65i-1] = AV21Tab_cnt2[AV65i-1].add(AV41Cantcm) ;
               AV66FlagLote = (short)(1) ;
               if (true) break;
            }
         }
         AV65i = (int)(AV65i+1) ;
      }
      if ( AV66FlagLote == 0 )
      {
         AV30Tab_prod[AV18q-1] = AV63Prdnumin ;
         AV25Tab_lote[AV18q-1] = AV64Lote2 ;
         AV19Tab_cnt1[AV18q-1] = AV40Cantc ;
         AV21Tab_cnt2[AV18q-1] = AV41Cantcm ;
         AV18q = (short)(AV18q+1) ;
      }
   }

   public void S181( )
   {
      /* 'MASDATOS1' Routine */
      returnInSub = false ;
      /* Using cursor P08XH7 */
      pr_default.execute(5, new Object[] {AV10EmprCod, AV33Prdnum, AV42Lote, AV50Fec1, AV51Fec2});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P08XH7_A396EmprCod[0] ;
         A719PrdNum = P08XH7_A719PrdNum[0] ;
         n719PrdNum = P08XH7_n719PrdNum[0] ;
         A5726HreLote = P08XH7_A5726HreLote[0] ;
         n5726HreLote = P08XH7_n5726HreLote[0] ;
         A12453HreFecAct = P08XH7_A12453HreFecAct[0] ;
         n12453HreFecAct = P08XH7_n12453HreFecAct[0] ;
         A11707HreProv = P08XH7_A11707HreProv[0] ;
         n11707HreProv = P08XH7_n11707HreProv[0] ;
         A12718HreFabId = P08XH7_A12718HreFabId[0] ;
         n12718HreFabId = P08XH7_n12718HreFabId[0] ;
         A4492HreBarCod = P08XH7_A4492HreBarCod[0] ;
         A4493HreBarReo = P08XH7_A4493HreBarReo[0] ;
         A4494HreBarPar = P08XH7_A4494HreBarPar[0] ;
         A4495HreNumCie = P08XH7_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08XH7_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08XH7_A4550HreLinPro[0] ;
         A4557HreRecLin = P08XH7_A4557HreRecLin[0] ;
         GXt_char7 = AV43PrdNomgrid ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A11707HreProv ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         cargadatosinformeinditex_sdt.this.A396EmprCod = GXv_char5[0] ;
         cargadatosinformeinditex_sdt.this.A11707HreProv = GXv_int4[0] ;
         cargadatosinformeinditex_sdt.this.GXt_char7 = GXv_char3[0] ;
         AV43PrdNomgrid = GXt_char7 ;
         AV43PrdNomgrid = ((GXutil.strcmp(AV43PrdNomgrid, "Error")==0)&&(A11707HreProv==0) ? "" : AV43PrdNomgrid) ;
         GXt_char7 = AV34PrdFabNm ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A12718HreFabId ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprdfabnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         cargadatosinformeinditex_sdt.this.A396EmprCod = GXv_char5[0] ;
         cargadatosinformeinditex_sdt.this.A12718HreFabId = GXv_int4[0] ;
         cargadatosinformeinditex_sdt.this.GXt_char7 = GXv_char3[0] ;
         AV34PrdFabNm = GXt_char7 ;
         AV34PrdFabNm = ((GXutil.strcmp(AV34PrdFabNm, "Error")==0)&&(A12718HreFabId==0) ? "" : AV34PrdFabNm) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S191( )
   {
      /* 'MASDATOS2' Routine */
      returnInSub = false ;
      /* Using cursor P08XH8 */
      pr_default.execute(6, new Object[] {AV10EmprCod, AV33Prdnum, AV42Lote, AV50Fec1, AV51Fec2});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P08XH8_A396EmprCod[0] ;
         A719PrdNum = P08XH8_A719PrdNum[0] ;
         n719PrdNum = P08XH8_n719PrdNum[0] ;
         A5686EntLotN = P08XH8_A5686EntLotN[0] ;
         A415EntFecEnt = P08XH8_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08XH8_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08XH8_n6156EntPrvNum[0] ;
         A12716EntFabId = P08XH8_A12716EntFabId[0] ;
         A658PedCod = P08XH8_A658PedCod[0] ;
         n658PedCod = P08XH8_n658PedCod[0] ;
         A597LinEnt = P08XH8_A597LinEnt[0] ;
         if ( AV48Proprv == 1 )
         {
            AV68PrvNum2 = A6156EntPrvNum ;
            AV35PrdFabId = A12716EntFabId ;
         }
         else if ( AV48Proprv == 0 )
         {
            AV36pedcod = A658PedCod ;
            /* Execute user subroutine: 'CPEDID' */
            S208 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
         }
         GXt_char7 = AV43PrdNomgrid ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV68PrvNum2 ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         cargadatosinformeinditex_sdt.this.A396EmprCod = GXv_char5[0] ;
         cargadatosinformeinditex_sdt.this.AV68PrvNum2 = GXv_int4[0] ;
         cargadatosinformeinditex_sdt.this.GXt_char7 = GXv_char3[0] ;
         AV43PrdNomgrid = GXt_char7 ;
         AV43PrdNomgrid = ((GXutil.strcmp(AV43PrdNomgrid, "Error")==0)&&(AV68PrvNum2==0) ? "" : AV43PrdNomgrid) ;
         GXt_char7 = AV34PrdFabNm ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV35PrdFabId ;
         GXv_char3[0] = GXt_char7 ;
         new app.pprdfabnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         cargadatosinformeinditex_sdt.this.A396EmprCod = GXv_char5[0] ;
         cargadatosinformeinditex_sdt.this.AV35PrdFabId = GXv_int4[0] ;
         cargadatosinformeinditex_sdt.this.GXt_char7 = GXv_char3[0] ;
         AV34PrdFabNm = GXt_char7 ;
         AV34PrdFabNm = ((GXutil.strcmp(AV34PrdFabNm, "Error")==0)&&(AV35PrdFabId==0) ? "" : AV34PrdFabNm) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S208( )
   {
      /* 'CPEDID' Routine */
      returnInSub = false ;
      AV68PrvNum2 = 0 ;
      AV35PrdFabId = 0 ;
      /* Using cursor P08XH9 */
      pr_default.execute(7, new Object[] {AV10EmprCod, Integer.valueOf(AV36pedcod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A719PrdNum = P08XH9_A719PrdNum[0] ;
         n719PrdNum = P08XH9_n719PrdNum[0] ;
         A658PedCod = P08XH9_A658PedCod[0] ;
         n658PedCod = P08XH9_n658PedCod[0] ;
         A396EmprCod = P08XH9_A396EmprCod[0] ;
         A795PrvNum = P08XH9_A795PrvNum[0] ;
         A12714PrdFabId = P08XH9_A12714PrdFabId[0] ;
         n12714PrdFabId = P08XH9_n12714PrdFabId[0] ;
         A795PrvNum = P08XH9_A795PrvNum[0] ;
         A12714PrdFabId = P08XH9_A12714PrdFabId[0] ;
         n12714PrdFabId = P08XH9_n12714PrdFabId[0] ;
         AV68PrvNum2 = A795PrvNum ;
         AV35PrdFabId = A12714PrdFabId ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP7[0] = cargadatosinformeinditex_sdt.this.AV9InformeInditex;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9InformeInditex = "" ;
      AV47contdsc = "" ;
      GXv_int1 = new byte[1] ;
      AV50Fec1 = GXutil.nullDate() ;
      AV51Fec2 = GXutil.nullDate() ;
      AV52Prdnumi = "" ;
      AV53PrdNumf = "" ;
      AV58Dia = "" ;
      AV59DiaActual = "" ;
      AV60DiaFinMes = GXutil.nullDate() ;
      AV61DiaIniMesActual = GXutil.nullDate() ;
      AV62DiaFinMesActual = GXutil.nullDate() ;
      AV30Tab_prod = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV30Tab_prod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV25Tab_lote = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV25Tab_lote[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV19Tab_cnt1 = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV19Tab_cnt1[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21Tab_cnt2 = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV21Tab_cnt2[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37Tab_prd = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV37Tab_prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV63Prdnumin = "" ;
      AV64Lote2 = "" ;
      AV28Tab_ltecn = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV28Tab_ltecn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV40Cantc = DecimalUtil.ZERO ;
      AV24Tab_cntcn = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV24Tab_cntcn[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV41Cantcm = DecimalUtil.ZERO ;
      AV29tab_prdcm = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV29tab_prdcm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27Tab_ltecm = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV27Tab_ltecm[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV23Tab_cntcm = new java.math.BigDecimal[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV23Tab_cntcm[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33Prdnum = "" ;
      AV38PrdNom = "" ;
      AV42Lote = "" ;
      AV34PrdFabNm = "" ;
      AV43PrdNomgrid = "" ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      AV44Stockinicial = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      Gx_msg = "" ;
      AV45Stockfinal = DecimalUtil.ZERO ;
      AV39sdtInformesInditex = new app.SdtSDTInformeInditex(remoteHandle, context);
      scmdbuf = "" ;
      P08XH2_A14011LocUtiID = new short[1] ;
      P08XH2_n14011LocUtiID = new boolean[] {false} ;
      P08XH2_A719PrdNum = new String[] {""} ;
      P08XH2_n719PrdNum = new boolean[] {false} ;
      P08XH2_A396EmprCod = new String[] {""} ;
      P08XH2_A11615PrdFuncion = new String[] {""} ;
      P08XH2_A11196PrdNroCAS = new String[] {""} ;
      P08XH2_A11614PrdEINECS = new String[] {""} ;
      P08XH2_A11616PrdNmQu = new String[] {""} ;
      P08XH2_A13301PrdZDHC = new String[] {""} ;
      P08XH2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH2_A14013LocUtiDc = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A11615PrdFuncion = "" ;
      A11196PrdNroCAS = "" ;
      A11614PrdEINECS = "" ;
      A11616PrdNmQu = "" ;
      A13301PrdZDHC = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A14013LocUtiDc = "" ;
      AV8sdtInformeInditexCollection = new GXBaseCollection<app.SdtSDTInformeInditex>(app.SdtSDTInformeInditex.class, "SDTInformeInditex", "TexplusNET", remoteHandle);
      AV67Cant = DecimalUtil.ZERO ;
      P08XH3_A396EmprCod = new String[] {""} ;
      P08XH3_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH3_n12453HreFecAct = new boolean[] {false} ;
      P08XH3_A719PrdNum = new String[] {""} ;
      P08XH3_n719PrdNum = new boolean[] {false} ;
      P08XH3_A4558HrePrdNum = new String[] {""} ;
      P08XH3_n4558HrePrdNum = new boolean[] {false} ;
      P08XH3_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XH3_n4563HrePrdCant = new boolean[] {false} ;
      P08XH3_A5726HreLote = new String[] {""} ;
      P08XH3_n5726HreLote = new boolean[] {false} ;
      P08XH3_A4492HreBarCod = new int[1] ;
      P08XH3_A4493HreBarReo = new byte[1] ;
      P08XH3_A4494HreBarPar = new String[] {""} ;
      P08XH3_A4495HreNumCie = new byte[1] ;
      P08XH3_A4545HreLinMaq = new short[1] ;
      P08XH3_A4550HreLinPro = new byte[1] ;
      P08XH3_A4557HreRecLin = new short[1] ;
      A12453HreFecAct = GXutil.nullDate() ;
      A4558HrePrdNum = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A4494HreBarPar = "" ;
      AV31HreLote = "" ;
      P08XH4_A859CumCodCont = new int[1] ;
      P08XH4_A396EmprCod = new String[] {""} ;
      P08XH4_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH4_A719PrdNum = new String[] {""} ;
      P08XH4_n719PrdNum = new boolean[] {false} ;
      P08XH4_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XH4_A5862CumConLot = new String[] {""} ;
      A862CumConFec = GXutil.nullDate() ;
      A860CumConCant = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      P08XH5_A396EmprCod = new String[] {""} ;
      P08XH5_A3345TipMovCc = new String[] {""} ;
      P08XH5_A3357CCStkDsc = new String[] {""} ;
      P08XH5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH5_A719PrdNum = new String[] {""} ;
      P08XH5_n719PrdNum = new boolean[] {false} ;
      P08XH5_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XH5_A5722CCStkLot = new String[] {""} ;
      P08XH5_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3357CCStkDsc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      P08XH6_A11Albaran = new String[] {""} ;
      P08XH6_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH6_A719PrdNum = new String[] {""} ;
      P08XH6_n719PrdNum = new boolean[] {false} ;
      P08XH6_A396EmprCod = new String[] {""} ;
      P08XH6_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XH6_A5686EntLotN = new String[] {""} ;
      P08XH6_A597LinEnt = new short[1] ;
      A11Albaran = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      P08XH7_A396EmprCod = new String[] {""} ;
      P08XH7_A719PrdNum = new String[] {""} ;
      P08XH7_n719PrdNum = new boolean[] {false} ;
      P08XH7_A5726HreLote = new String[] {""} ;
      P08XH7_n5726HreLote = new boolean[] {false} ;
      P08XH7_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH7_n12453HreFecAct = new boolean[] {false} ;
      P08XH7_A11707HreProv = new int[1] ;
      P08XH7_n11707HreProv = new boolean[] {false} ;
      P08XH7_A12718HreFabId = new int[1] ;
      P08XH7_n12718HreFabId = new boolean[] {false} ;
      P08XH7_A4492HreBarCod = new int[1] ;
      P08XH7_A4493HreBarReo = new byte[1] ;
      P08XH7_A4494HreBarPar = new String[] {""} ;
      P08XH7_A4495HreNumCie = new byte[1] ;
      P08XH7_A4545HreLinMaq = new short[1] ;
      P08XH7_A4550HreLinPro = new byte[1] ;
      P08XH7_A4557HreRecLin = new short[1] ;
      P08XH8_A396EmprCod = new String[] {""} ;
      P08XH8_A719PrdNum = new String[] {""} ;
      P08XH8_n719PrdNum = new boolean[] {false} ;
      P08XH8_A5686EntLotN = new String[] {""} ;
      P08XH8_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08XH8_A6156EntPrvNum = new int[1] ;
      P08XH8_n6156EntPrvNum = new boolean[] {false} ;
      P08XH8_A12716EntFabId = new int[1] ;
      P08XH8_A658PedCod = new int[1] ;
      P08XH8_n658PedCod = new boolean[] {false} ;
      P08XH8_A597LinEnt = new short[1] ;
      GXt_char7 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      P08XH9_A719PrdNum = new String[] {""} ;
      P08XH9_n719PrdNum = new boolean[] {false} ;
      P08XH9_A658PedCod = new int[1] ;
      P08XH9_n658PedCod = new boolean[] {false} ;
      P08XH9_A396EmprCod = new String[] {""} ;
      P08XH9_A795PrvNum = new int[1] ;
      P08XH9_A12714PrdFabId = new int[1] ;
      P08XH9_n12714PrdFabId = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cargadatosinformeinditex_sdt__default(),
         new Object[] {
             new Object[] {
            P08XH2_A14011LocUtiID, P08XH2_n14011LocUtiID, P08XH2_A719PrdNum, P08XH2_A396EmprCod, P08XH2_A11615PrdFuncion, P08XH2_A11196PrdNroCAS, P08XH2_A11614PrdEINECS, P08XH2_A11616PrdNmQu, P08XH2_A13301PrdZDHC, P08XH2_A9742PrdFHS,
            P08XH2_A14013LocUtiDc
            }
            , new Object[] {
            P08XH3_A396EmprCod, P08XH3_A12453HreFecAct, P08XH3_n12453HreFecAct, P08XH3_A719PrdNum, P08XH3_n719PrdNum, P08XH3_A4558HrePrdNum, P08XH3_n4558HrePrdNum, P08XH3_A4563HrePrdCant, P08XH3_n4563HrePrdCant, P08XH3_A5726HreLote,
            P08XH3_n5726HreLote, P08XH3_A4492HreBarCod, P08XH3_A4493HreBarReo, P08XH3_A4494HreBarPar, P08XH3_A4495HreNumCie, P08XH3_A4545HreLinMaq, P08XH3_A4550HreLinPro, P08XH3_A4557HreRecLin
            }
            , new Object[] {
            P08XH4_A859CumCodCont, P08XH4_A396EmprCod, P08XH4_A862CumConFec, P08XH4_A719PrdNum, P08XH4_A860CumConCant, P08XH4_A5862CumConLot
            }
            , new Object[] {
            P08XH5_A396EmprCod, P08XH5_A3345TipMovCc, P08XH5_A3357CCStkDsc, P08XH5_A3348CCStkFec, P08XH5_A719PrdNum, P08XH5_A3344CCStkCanS, P08XH5_A5722CCStkLot, P08XH5_A3342CCStkLin
            }
            , new Object[] {
            P08XH6_A11Albaran, P08XH6_A415EntFecEnt, P08XH6_A719PrdNum, P08XH6_A396EmprCod, P08XH6_A418EntUniEnt, P08XH6_A5686EntLotN, P08XH6_A597LinEnt
            }
            , new Object[] {
            P08XH7_A396EmprCod, P08XH7_A719PrdNum, P08XH7_n719PrdNum, P08XH7_A5726HreLote, P08XH7_n5726HreLote, P08XH7_A12453HreFecAct, P08XH7_n12453HreFecAct, P08XH7_A11707HreProv, P08XH7_n11707HreProv, P08XH7_A12718HreFabId,
            P08XH7_n12718HreFabId, P08XH7_A4492HreBarCod, P08XH7_A4493HreBarReo, P08XH7_A4494HreBarPar, P08XH7_A4495HreNumCie, P08XH7_A4545HreLinMaq, P08XH7_A4550HreLinPro, P08XH7_A4557HreRecLin
            }
            , new Object[] {
            P08XH8_A396EmprCod, P08XH8_A719PrdNum, P08XH8_A5686EntLotN, P08XH8_A415EntFecEnt, P08XH8_A6156EntPrvNum, P08XH8_n6156EntPrvNum, P08XH8_A12716EntFabId, P08XH8_A658PedCod, P08XH8_n658PedCod, P08XH8_A597LinEnt
            }
            , new Object[] {
            P08XH9_A719PrdNum, P08XH9_A658PedCod, P08XH9_A396EmprCod, P08XH9_A795PrvNum, P08XH9_A12714PrdFabId, P08XH9_n12714PrdFabId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16CalStkIni ;
   private byte GXt_int6 ;
   private byte GXv_int1[] ;
   private byte AV54Mes ;
   private byte AV56MesAnt ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV46ConMan ;
   private short AV48Proprv ;
   private short AV49Lotes ;
   private short AV55Anyo ;
   private short AV57AnyoANt ;
   private short AV17z ;
   private short AV18q ;
   private short A14011LocUtiID ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short AV66FlagLote ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV32Contval ;
   private int GX_I ;
   private int AV65i ;
   private int A4492HreBarCod ;
   private int A859CumCodCont ;
   private int A11707HreProv ;
   private int A12718HreFabId ;
   private int A6156EntPrvNum ;
   private int A12716EntFabId ;
   private int A658PedCod ;
   private int AV68PrvNum2 ;
   private int AV35PrdFabId ;
   private int AV36pedcod ;
   private int GXv_int4[] ;
   private int A795PrvNum ;
   private int A12714PrdFabId ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV19Tab_cnt1[] ;
   private java.math.BigDecimal AV21Tab_cnt2[] ;
   private java.math.BigDecimal AV40Cantc ;
   private java.math.BigDecimal AV24Tab_cntcn[] ;
   private java.math.BigDecimal AV41Cantcm ;
   private java.math.BigDecimal AV23Tab_cntcm[] ;
   private java.math.BigDecimal AV44Stockinicial ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV45Stockfinal ;
   private java.math.BigDecimal AV67Cant ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A418EntUniEnt ;
   private String AV10EmprCod ;
   private String AV13Prdnum1 ;
   private String AV14PrdNum2 ;
   private String AV15LoteBusqueda ;
   private String AV47contdsc ;
   private String AV52Prdnumi ;
   private String AV53PrdNumf ;
   private String AV58Dia ;
   private String AV59DiaActual ;
   private String AV30Tab_prod[] ;
   private String AV25Tab_lote[] ;
   private String AV37Tab_prd[] ;
   private String AV63Prdnumin ;
   private String AV64Lote2 ;
   private String AV28Tab_ltecn[] ;
   private String AV29tab_prdcm[] ;
   private String AV27Tab_ltecm[] ;
   private String AV33Prdnum ;
   private String AV38PrdNom ;
   private String AV42Lote ;
   private String AV34PrdFabNm ;
   private String AV43PrdNomgrid ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A11615PrdFuncion ;
   private String A11196PrdNroCAS ;
   private String A11614PrdEINECS ;
   private String A13301PrdZDHC ;
   private String A14013LocUtiDc ;
   private String A4558HrePrdNum ;
   private String A5726HreLote ;
   private String A4494HreBarPar ;
   private String AV31HreLote ;
   private String A5862CumConLot ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A11Albaran ;
   private String A5686EntLotN ;
   private String GXt_char7 ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private java.util.Date AV11Fecha ;
   private java.util.Date AV12Fecha_to ;
   private java.util.Date AV50Fec1 ;
   private java.util.Date AV51Fec2 ;
   private java.util.Date AV60DiaFinMes ;
   private java.util.Date AV61DiaIniMesActual ;
   private java.util.Date AV62DiaFinMesActual ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date A862CumConFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A415EntFecEnt ;
   private boolean returnInSub ;
   private boolean n14011LocUtiID ;
   private boolean n719PrdNum ;
   private boolean n12453HreFecAct ;
   private boolean n4558HrePrdNum ;
   private boolean n4563HrePrdCant ;
   private boolean n5726HreLote ;
   private boolean n11707HreProv ;
   private boolean n12718HreFabId ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean n12714PrdFabId ;
   private String AV9InformeInditex ;
   private String A11616PrdNmQu ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private short[] P08XH2_A14011LocUtiID ;
   private boolean[] P08XH2_n14011LocUtiID ;
   private String[] P08XH2_A719PrdNum ;
   private boolean[] P08XH2_n719PrdNum ;
   private String[] P08XH2_A396EmprCod ;
   private String[] P08XH2_A11615PrdFuncion ;
   private String[] P08XH2_A11196PrdNroCAS ;
   private String[] P08XH2_A11614PrdEINECS ;
   private String[] P08XH2_A11616PrdNmQu ;
   private String[] P08XH2_A13301PrdZDHC ;
   private java.util.Date[] P08XH2_A9742PrdFHS ;
   private String[] P08XH2_A14013LocUtiDc ;
   private String[] P08XH3_A396EmprCod ;
   private java.util.Date[] P08XH3_A12453HreFecAct ;
   private boolean[] P08XH3_n12453HreFecAct ;
   private String[] P08XH3_A719PrdNum ;
   private boolean[] P08XH3_n719PrdNum ;
   private String[] P08XH3_A4558HrePrdNum ;
   private boolean[] P08XH3_n4558HrePrdNum ;
   private java.math.BigDecimal[] P08XH3_A4563HrePrdCant ;
   private boolean[] P08XH3_n4563HrePrdCant ;
   private String[] P08XH3_A5726HreLote ;
   private boolean[] P08XH3_n5726HreLote ;
   private int[] P08XH3_A4492HreBarCod ;
   private byte[] P08XH3_A4493HreBarReo ;
   private String[] P08XH3_A4494HreBarPar ;
   private byte[] P08XH3_A4495HreNumCie ;
   private short[] P08XH3_A4545HreLinMaq ;
   private byte[] P08XH3_A4550HreLinPro ;
   private short[] P08XH3_A4557HreRecLin ;
   private int[] P08XH4_A859CumCodCont ;
   private String[] P08XH4_A396EmprCod ;
   private java.util.Date[] P08XH4_A862CumConFec ;
   private String[] P08XH4_A719PrdNum ;
   private boolean[] P08XH4_n719PrdNum ;
   private java.math.BigDecimal[] P08XH4_A860CumConCant ;
   private String[] P08XH4_A5862CumConLot ;
   private String[] P08XH5_A396EmprCod ;
   private String[] P08XH5_A3345TipMovCc ;
   private String[] P08XH5_A3357CCStkDsc ;
   private java.util.Date[] P08XH5_A3348CCStkFec ;
   private String[] P08XH5_A719PrdNum ;
   private boolean[] P08XH5_n719PrdNum ;
   private java.math.BigDecimal[] P08XH5_A3344CCStkCanS ;
   private String[] P08XH5_A5722CCStkLot ;
   private long[] P08XH5_A3342CCStkLin ;
   private String[] P08XH6_A11Albaran ;
   private java.util.Date[] P08XH6_A415EntFecEnt ;
   private String[] P08XH6_A719PrdNum ;
   private boolean[] P08XH6_n719PrdNum ;
   private String[] P08XH6_A396EmprCod ;
   private java.math.BigDecimal[] P08XH6_A418EntUniEnt ;
   private String[] P08XH6_A5686EntLotN ;
   private short[] P08XH6_A597LinEnt ;
   private String[] P08XH7_A396EmprCod ;
   private String[] P08XH7_A719PrdNum ;
   private boolean[] P08XH7_n719PrdNum ;
   private String[] P08XH7_A5726HreLote ;
   private boolean[] P08XH7_n5726HreLote ;
   private java.util.Date[] P08XH7_A12453HreFecAct ;
   private boolean[] P08XH7_n12453HreFecAct ;
   private int[] P08XH7_A11707HreProv ;
   private boolean[] P08XH7_n11707HreProv ;
   private int[] P08XH7_A12718HreFabId ;
   private boolean[] P08XH7_n12718HreFabId ;
   private int[] P08XH7_A4492HreBarCod ;
   private byte[] P08XH7_A4493HreBarReo ;
   private String[] P08XH7_A4494HreBarPar ;
   private byte[] P08XH7_A4495HreNumCie ;
   private short[] P08XH7_A4545HreLinMaq ;
   private byte[] P08XH7_A4550HreLinPro ;
   private short[] P08XH7_A4557HreRecLin ;
   private String[] P08XH8_A396EmprCod ;
   private String[] P08XH8_A719PrdNum ;
   private boolean[] P08XH8_n719PrdNum ;
   private String[] P08XH8_A5686EntLotN ;
   private java.util.Date[] P08XH8_A415EntFecEnt ;
   private int[] P08XH8_A6156EntPrvNum ;
   private boolean[] P08XH8_n6156EntPrvNum ;
   private int[] P08XH8_A12716EntFabId ;
   private int[] P08XH8_A658PedCod ;
   private boolean[] P08XH8_n658PedCod ;
   private short[] P08XH8_A597LinEnt ;
   private String[] P08XH9_A719PrdNum ;
   private boolean[] P08XH9_n719PrdNum ;
   private int[] P08XH9_A658PedCod ;
   private boolean[] P08XH9_n658PedCod ;
   private String[] P08XH9_A396EmprCod ;
   private int[] P08XH9_A795PrvNum ;
   private int[] P08XH9_A12714PrdFabId ;
   private boolean[] P08XH9_n12714PrdFabId ;
   private GXBaseCollection<app.SdtSDTInformeInditex> AV8sdtInformeInditexCollection ;
   private app.SdtSDTInformeInditex AV39sdtInformesInditex ;
}

final  class cargadatosinformeinditex_sdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XH2", "SELECT T1.LocUtiID, T1.PrdNum, T1.EmprCod, T1.PrdFuncion, T1.PrdNroCAS, T1.PrdEINECS, T1.PrdNmQu, T1.PrdZDHC, T1.PrdFHS, T2.LocUtiDc FROM (TXPPRODUC T1 LEFT JOIN TXPLOCUTI T2 ON T2.EmprCod = T1.EmprCod AND T2.LocUtiID = T1.LocUtiID) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XH3", "SELECT EmprCod, HreFecAct, PrdNum, HrePrdNum, HrePrdCant, HreLote, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE (EmprCod = ? and PrdNum >= ? and HreFecAct >= ?) AND (HreFecAct <= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, HreFecAct ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XH4", "SELECT T1.CumCodCont, T1.EmprCod, T2.CumConFec, T1.PrdNum, T1.CumConCant, T1.CumConLot FROM (TXPLCUMCO T1 INNER JOIN TXPCCUMCO T2 ON T2.EmprCod = T1.EmprCod AND T2.CumCodCont = T1.CumCodCont) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T2.CumConFec >= ?) AND (T2.CumConFec <= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T2.CumConFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XH5", "SELECT EmprCod, TipMovCc, CCStkDsc, CCStkFec, PrdNum, CCStkCanS, CCStkLot, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum >= ? and CCStkFec >= ?) AND (CCStkFec <= ?) AND (CCStkDsc like '%Lavado en Maquina%') AND (TipMovCc = 'SM') AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, CCStkFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XH6", "SELECT Albaran, EntFecEnt, PrdNum, EmprCod, EntUniEnt, EntLotN, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum >= ? and EntFecEnt >= ?) AND (EntFecEnt <= ?) AND (SUBSTR(Albaran, 1, 3) <> 'REC') AND (SUBSTR(Albaran, 1, 3) <> 'INV') AND (SUBSTR(Albaran, 1, 2) <> 'AD') AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, EntFecEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XH7", "SELECT * FROM (SELECT EmprCod, PrdNum, HreLote, HreFecAct, HreProv, HreFabId, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE (EmprCod = ? and PrdNum = ? and HreLote = ? and HreFecAct >= ?) AND (HreFecAct <= ?) ORDER BY EmprCod, PrdNum, HreLote, HreFecAct) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XH8", "SELECT * FROM (SELECT EmprCod, PrdNum, EntLotN, EntFecEnt, EntPrvNum, EntFabId, PedCod, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ? and EntLotN = ? and EntFecEnt >= ?) AND (EntFecEnt <= ?) ORDER BY EmprCod, PrdNum, EntLotN, EntFecEnt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XH9", "SELECT T1.PrdNum, T1.PedCod, T1.EmprCod, T2.PrvNum, T2.PrdFabId FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 50);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

