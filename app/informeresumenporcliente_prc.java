package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeresumenporcliente_prc extends GXProcedure
{
   public informeresumenporcliente_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeresumenporcliente_prc.class ), "" );
   }

   public informeresumenporcliente_prc( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             int aP12 ,
                             int aP13 ,
                             String aP14 ,
                             byte aP15 )
   {
      informeresumenporcliente_prc.this.aP16 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        int aP12 ,
                        int aP13 ,
                        String aP14 ,
                        byte aP15 ,
                        String[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             int aP12 ,
                             int aP13 ,
                             String aP14 ,
                             byte aP15 ,
                             String[] aP16 )
   {
      informeresumenporcliente_prc.this.AV135EmprCod = aP0;
      informeresumenporcliente_prc.this.AV101Prio = aP1;
      informeresumenporcliente_prc.this.AV97PCliCod = aP2;
      informeresumenporcliente_prc.this.AV128UCliCod = aP3;
      informeresumenporcliente_prc.this.AV99PFecha = aP4;
      informeresumenporcliente_prc.this.AV130UFecha = aP5;
      informeresumenporcliente_prc.this.AV96PBarSer = aP6;
      informeresumenporcliente_prc.this.AV127UBarSer = aP7;
      informeresumenporcliente_prc.this.AV133AlbEncCli = aP8;
      informeresumenporcliente_prc.this.AV134AlbEncCli_to = aP9;
      informeresumenporcliente_prc.this.AV24Barcolnomi = aP10;
      informeresumenporcliente_prc.this.AV23Barcolnomf = aP11;
      informeresumenporcliente_prc.this.AV27Barcolnumi = aP12;
      informeresumenporcliente_prc.this.AV26Barcolnumf = aP13;
      informeresumenporcliente_prc.this.AV110Tipdiscod = aP14;
      informeresumenporcliente_prc.this.AV29Barestreo = aP15;
      informeresumenporcliente_prc.this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV91Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV135EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      informeresumenporcliente_prc.this.GXt_int1 = GXv_int2[0] ;
      AV91Moda21 = GXt_int1 ;
      AV60InformeResumenporCliente_SDT.clear();
      AV132InformeResumenporCliente_SDT_json = "" ;
      AV31Barestreoi = (byte)(0) ;
      AV30BarEstreof = (byte)(2) ;
      if ( AV29Barestreo == 2 )
      {
         AV31Barestreoi = (byte)(2) ;
         AV30BarEstreof = (byte)(2) ;
      }
      if ( AV29Barestreo == 0 )
      {
         AV31Barestreoi = (byte)(0) ;
         AV30BarEstreof = (byte)(1) ;
      }
      /* Using cursor P0AFH2 */
      pr_default.execute(0, new Object[] {AV135EmprCod, Integer.valueOf(AV97PCliCod), Integer.valueOf(AV128UCliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAFH2 = false ;
         A1253EmprGuiRem = P0AFH2_A1253EmprGuiRem[0] ;
         A30AlbProCod = P0AFH2_A30AlbProCod[0] ;
         A396EmprCod = P0AFH2_A396EmprCod[0] ;
         A5140AlbMarca = P0AFH2_A5140AlbMarca[0] ;
         A39AlbProPri = P0AFH2_A39AlbProPri[0] ;
         A34AlbProfch = P0AFH2_A34AlbProfch[0] ;
         A1243GuiRemCli = P0AFH2_A1243GuiRemCli[0] ;
         A1244GuiRemCln = P0AFH2_A1244GuiRemCln[0] ;
         A1244GuiRemCln = P0AFH2_A1244GuiRemCln[0] ;
         AV114TotKilC = DecimalUtil.doubleToDec(0) ;
         AV118TotMetC = DecimalUtil.doubleToDec(0) ;
         AV122TotPieC = 0 ;
         AV45CliCod = A1243GuiRemCli ;
         AV50CliNom = A1244GuiRemCln ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AFH2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AFH2_A1243GuiRemCli[0] == A1243GuiRemCli ) )
         {
            brkAFH2 = false ;
            A30AlbProCod = P0AFH2_A30AlbProCod[0] ;
            A5140AlbMarca = P0AFH2_A5140AlbMarca[0] ;
            A39AlbProPri = P0AFH2_A39AlbProPri[0] ;
            A34AlbProfch = P0AFH2_A34AlbProfch[0] ;
            if ( (( GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( AV130UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV130UFecha)) )) )
            {
               if ( (( GXutil.resetTime(A34AlbProfch).after( GXutil.resetTime( AV99PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV99PFecha)) )) )
               {
                  if ( ( GXutil.strcmp(A39AlbProPri, AV101Prio) == 0 ) || ( GXutil.strcmp(AV101Prio, "2") == 0 ) )
                  {
                     if ( GXutil.strcmp(A5140AlbMarca, "A") != 0 )
                     {
                        AV113TotKil = DecimalUtil.doubleToDec(0) ;
                        AV117TotMet = DecimalUtil.doubleToDec(0) ;
                        AV121TotPie = 0 ;
                        /* Using cursor P0AFH3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV96PBarSer, AV127UBarSer, Byte.valueOf(AV31Barestreoi), Byte.valueOf(AV30BarEstreof), AV110Tipdiscod, AV110Tipdiscod, AV24Barcolnomi, AV23Barcolnomf, Integer.valueOf(AV27Barcolnumi), Integer.valueOf(AV26Barcolnumf)});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A136BarColNum = P0AFH3_A136BarColNum[0] ;
                           A135BarColNom = P0AFH3_A135BarColNom[0] ;
                           A2010BarTipDis = P0AFH3_A2010BarTipDis[0] ;
                           A148BarEstReo = P0AFH3_A148BarEstReo[0] ;
                           A212BarSer = P0AFH3_A212BarSer[0] ;
                           A1261BarAlbKgmE = P0AFH3_A1261BarAlbKgmE[0] ;
                           A1263BarAlbMtrE = P0AFH3_A1263BarAlbMtrE[0] ;
                           A2243BarKgsCli = P0AFH3_A2243BarKgsCli[0] ;
                           n2243BarKgsCli = P0AFH3_n2243BarKgsCli[0] ;
                           A1461BarAlbPN = P0AFH3_A1461BarAlbPN[0] ;
                           A1234BarNomCli = P0AFH3_A1234BarNomCli[0] ;
                           A129BarCod = P0AFH3_A129BarCod[0] ;
                           A132BarCodReo = P0AFH3_A132BarCodReo[0] ;
                           A130BarCodPar = P0AFH3_A130BarCodPar[0] ;
                           A1265BarAlbPie = P0AFH3_A1265BarAlbPie[0] ;
                           A143BarDisNum = P0AFH3_A143BarDisNum[0] ;
                           A4812BarEncCli = P0AFH3_A4812BarEncCli[0] ;
                           A136BarColNum = P0AFH3_A136BarColNum[0] ;
                           A135BarColNom = P0AFH3_A135BarColNom[0] ;
                           A2010BarTipDis = P0AFH3_A2010BarTipDis[0] ;
                           A148BarEstReo = P0AFH3_A148BarEstReo[0] ;
                           A212BarSer = P0AFH3_A212BarSer[0] ;
                           A1234BarNomCli = P0AFH3_A1234BarNomCli[0] ;
                           A143BarDisNum = P0AFH3_A143BarDisNum[0] ;
                           A4812BarEncCli = P0AFH3_A4812BarEncCli[0] ;
                           GXt_char3 = A13878PedidoClie ;
                           GXv_char4[0] = A396EmprCod ;
                           GXv_char5[0] = A4812BarEncCli ;
                           GXv_char6[0] = A143BarDisNum ;
                           GXv_char7[0] = GXt_char3 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
                           informeresumenporcliente_prc.this.A396EmprCod = GXv_char4[0] ;
                           informeresumenporcliente_prc.this.A4812BarEncCli = GXv_char5[0] ;
                           informeresumenporcliente_prc.this.A143BarDisNum = GXv_char6[0] ;
                           informeresumenporcliente_prc.this.GXt_char3 = GXv_char7[0] ;
                           A13878PedidoClie = GXt_char3 ;
                           if ( ( GXutil.strcmp(A13878PedidoClie, AV133AlbEncCli) >= 0 ) && ( GXutil.strcmp(A13878PedidoClie, AV134AlbEncCli_to) <= 0 ) )
                           {
                              AV14BarAlbKgmE = A1261BarAlbKgmE ;
                              AV15BarAlbMtrE = A1263BarAlbMtrE ;
                              if ( AV91Moda21 == 1 )
                              {
                                 if ( A2243BarKgsCli.doubleValue() != 0 )
                                 {
                                    AV14BarAlbKgmE = A2243BarKgsCli ;
                                 }
                                 if ( A1461BarAlbPN.doubleValue() != 0 )
                                 {
                                    AV15BarAlbMtrE = A1461BarAlbPN ;
                                 }
                              }
                              AV22BarColNom = A135BarColNom ;
                              AV25BarColNum = A136BarColNum ;
                              AV37barNomcli = A1234BarNomCli ;
                              AV16Barcod = A129BarCod ;
                              AV20BarCodreo = A132BarCodReo ;
                              AV18Barcodpar = A130BarCodPar ;
                              /* Execute user subroutine: 'KILOS' */
                              S111 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(1);
                                 pr_default.close(1);
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 returnInSub = true;
                                 cleanup();
                                 if (true) return;
                              }
                              AV32BarKgm = AV40barpiekil ;
                              AV16Barcod = A129BarCod ;
                              AV20BarCodreo = A132BarCodReo ;
                              AV18Barcodpar = A130BarCodPar ;
                              AV9ALbProcod = A30AlbProCod ;
                              AV28Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                              AV113TotKil = AV113TotKil.add(AV14BarAlbKgmE) ;
                              AV117TotMet = AV117TotMet.add(AV15BarAlbMtrE) ;
                              AV121TotPie = (int)(AV121TotPie+A1265BarAlbPie) ;
                           }
                           pr_default.readNext(1);
                        }
                        pr_default.close(1);
                        AV114TotKilC = AV114TotKilC.add(AV113TotKil) ;
                        AV118TotMetC = AV118TotMetC.add(AV117TotMet) ;
                        AV122TotPieC = (int)(AV122TotPieC+AV121TotPie) ;
                     }
                  }
               }
            }
            brkAFH2 = true ;
            pr_default.readNext(0);
         }
         if ( ( AV114TotKilC.doubleValue() > 0 ) || ( AV118TotMetC.doubleValue() > 0 ) || ( AV122TotPieC > 0 ) )
         {
            AV131InformeResumenporCliente_SDT_item = (app.SdtInformeResumenporCliente_SDT_Item)new app.SdtInformeResumenporCliente_SDT_Item(remoteHandle, context);
            AV131InformeResumenporCliente_SDT_item.setgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod( AV45CliCod );
            AV131InformeResumenporCliente_SDT_item.setgxTv_SdtInformeResumenporCliente_SDT_Item_Clinom( AV50CliNom );
            AV131InformeResumenporCliente_SDT_item.setgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc( AV114TotKilC );
            AV131InformeResumenporCliente_SDT_item.setgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc( AV118TotMetC );
            AV131InformeResumenporCliente_SDT_item.setgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec( AV122TotPieC );
            AV60InformeResumenporCliente_SDT.add(AV131InformeResumenporCliente_SDT_item, 0);
         }
         if ( ! brkAFH2 )
         {
            brkAFH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV132InformeResumenporCliente_SDT_json = AV60InformeResumenporCliente_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'KILOS' Routine */
      returnInSub = false ;
      AV40barpiekil = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0AFH4 */
      pr_default.execute(2, new Object[] {AV135EmprCod, Integer.valueOf(AV16Barcod), Byte.valueOf(AV20BarCodreo), AV18Barcodpar});
      c203BarPieKil = P0AFH4_A203BarPieKil[0] ;
      pr_default.close(2);
      AV40barpiekil = AV40barpiekil.add(c203BarPieKil) ;
      /* End optimized group. */
   }

   protected void cleanup( )
   {
      this.aP16[0] = informeresumenporcliente_prc.this.AV132InformeResumenporCliente_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV132InformeResumenporCliente_SDT_json = "" ;
      GXv_int2 = new byte[1] ;
      AV60InformeResumenporCliente_SDT = new GXBaseCollection<app.SdtInformeResumenporCliente_SDT_Item>(app.SdtInformeResumenporCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0AFH2_A1253EmprGuiRem = new String[] {""} ;
      P0AFH2_A30AlbProCod = new long[1] ;
      P0AFH2_A396EmprCod = new String[] {""} ;
      P0AFH2_A5140AlbMarca = new String[] {""} ;
      P0AFH2_A39AlbProPri = new String[] {""} ;
      P0AFH2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFH2_A1243GuiRemCli = new int[1] ;
      P0AFH2_A1244GuiRemCln = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      A5140AlbMarca = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      AV114TotKilC = DecimalUtil.ZERO ;
      AV118TotMetC = DecimalUtil.ZERO ;
      AV50CliNom = "" ;
      AV113TotKil = DecimalUtil.ZERO ;
      AV117TotMet = DecimalUtil.ZERO ;
      P0AFH3_A30AlbProCod = new long[1] ;
      P0AFH3_A136BarColNum = new int[1] ;
      P0AFH3_A135BarColNom = new String[] {""} ;
      P0AFH3_A2010BarTipDis = new String[] {""} ;
      P0AFH3_A148BarEstReo = new byte[1] ;
      P0AFH3_A212BarSer = new String[] {""} ;
      P0AFH3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFH3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFH3_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFH3_n2243BarKgsCli = new boolean[] {false} ;
      P0AFH3_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFH3_A1234BarNomCli = new String[] {""} ;
      P0AFH3_A129BarCod = new int[1] ;
      P0AFH3_A132BarCodReo = new byte[1] ;
      P0AFH3_A130BarCodPar = new String[] {""} ;
      P0AFH3_A1265BarAlbPie = new int[1] ;
      P0AFH3_A396EmprCod = new String[] {""} ;
      P0AFH3_A143BarDisNum = new String[] {""} ;
      P0AFH3_A4812BarEncCli = new String[] {""} ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A212BarSer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13878PedidoClie = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      AV14BarAlbKgmE = DecimalUtil.ZERO ;
      AV15BarAlbMtrE = DecimalUtil.ZERO ;
      AV22BarColNom = "" ;
      AV37barNomcli = "" ;
      AV18Barcodpar = "" ;
      AV32BarKgm = DecimalUtil.ZERO ;
      AV40barpiekil = DecimalUtil.ZERO ;
      AV28Barenccli = "" ;
      AV131InformeResumenporCliente_SDT_item = new app.SdtInformeResumenporCliente_SDT_Item(remoteHandle, context);
      c203BarPieKil = DecimalUtil.ZERO ;
      P0AFH4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informeresumenporcliente_prc__default(),
         new Object[] {
             new Object[] {
            P0AFH2_A1253EmprGuiRem, P0AFH2_A30AlbProCod, P0AFH2_A396EmprCod, P0AFH2_A5140AlbMarca, P0AFH2_A39AlbProPri, P0AFH2_A34AlbProfch, P0AFH2_A1243GuiRemCli, P0AFH2_A1244GuiRemCln
            }
            , new Object[] {
            P0AFH3_A30AlbProCod, P0AFH3_A136BarColNum, P0AFH3_A135BarColNom, P0AFH3_A2010BarTipDis, P0AFH3_A148BarEstReo, P0AFH3_A212BarSer, P0AFH3_A1261BarAlbKgmE, P0AFH3_A1263BarAlbMtrE, P0AFH3_A2243BarKgsCli, P0AFH3_n2243BarKgsCli,
            P0AFH3_A1461BarAlbPN, P0AFH3_A1234BarNomCli, P0AFH3_A129BarCod, P0AFH3_A132BarCodReo, P0AFH3_A130BarCodPar, P0AFH3_A1265BarAlbPie, P0AFH3_A396EmprCod, P0AFH3_A143BarDisNum, P0AFH3_A4812BarEncCli
            }
            , new Object[] {
            P0AFH4_A203BarPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29Barestreo ;
   private byte AV91Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV31Barestreoi ;
   private byte AV30BarEstreof ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV20BarCodreo ;
   private short Gx_err ;
   private int AV97PCliCod ;
   private int AV128UCliCod ;
   private int AV27Barcolnumi ;
   private int AV26Barcolnumf ;
   private int A1243GuiRemCli ;
   private int AV122TotPieC ;
   private int AV45CliCod ;
   private int AV121TotPie ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV25BarColNum ;
   private int AV16Barcod ;
   private long A30AlbProCod ;
   private long AV9ALbProcod ;
   private java.math.BigDecimal AV114TotKilC ;
   private java.math.BigDecimal AV118TotMetC ;
   private java.math.BigDecimal AV113TotKil ;
   private java.math.BigDecimal AV117TotMet ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV14BarAlbKgmE ;
   private java.math.BigDecimal AV15BarAlbMtrE ;
   private java.math.BigDecimal AV32BarKgm ;
   private java.math.BigDecimal AV40barpiekil ;
   private java.math.BigDecimal c203BarPieKil ;
   private String AV135EmprCod ;
   private String AV101Prio ;
   private String AV96PBarSer ;
   private String AV127UBarSer ;
   private String AV133AlbEncCli ;
   private String AV134AlbEncCli_to ;
   private String AV24Barcolnomi ;
   private String AV23Barcolnomf ;
   private String AV110Tipdiscod ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String A5140AlbMarca ;
   private String A39AlbProPri ;
   private String A1244GuiRemCln ;
   private String AV50CliNom ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13878PedidoClie ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String AV22BarColNom ;
   private String AV37barNomcli ;
   private String AV18Barcodpar ;
   private String AV28Barenccli ;
   private java.util.Date AV99PFecha ;
   private java.util.Date AV130UFecha ;
   private java.util.Date A34AlbProfch ;
   private boolean brkAFH2 ;
   private boolean n2243BarKgsCli ;
   private boolean returnInSub ;
   private String AV132InformeResumenporCliente_SDT_json ;
   private String[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AFH2_A1253EmprGuiRem ;
   private long[] P0AFH2_A30AlbProCod ;
   private String[] P0AFH2_A396EmprCod ;
   private String[] P0AFH2_A5140AlbMarca ;
   private String[] P0AFH2_A39AlbProPri ;
   private java.util.Date[] P0AFH2_A34AlbProfch ;
   private int[] P0AFH2_A1243GuiRemCli ;
   private String[] P0AFH2_A1244GuiRemCln ;
   private long[] P0AFH3_A30AlbProCod ;
   private int[] P0AFH3_A136BarColNum ;
   private String[] P0AFH3_A135BarColNom ;
   private String[] P0AFH3_A2010BarTipDis ;
   private byte[] P0AFH3_A148BarEstReo ;
   private String[] P0AFH3_A212BarSer ;
   private java.math.BigDecimal[] P0AFH3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AFH3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0AFH3_A2243BarKgsCli ;
   private boolean[] P0AFH3_n2243BarKgsCli ;
   private java.math.BigDecimal[] P0AFH3_A1461BarAlbPN ;
   private String[] P0AFH3_A1234BarNomCli ;
   private int[] P0AFH3_A129BarCod ;
   private byte[] P0AFH3_A132BarCodReo ;
   private String[] P0AFH3_A130BarCodPar ;
   private int[] P0AFH3_A1265BarAlbPie ;
   private String[] P0AFH3_A396EmprCod ;
   private String[] P0AFH3_A143BarDisNum ;
   private String[] P0AFH3_A4812BarEncCli ;
   private java.math.BigDecimal[] P0AFH4_A203BarPieKil ;
   private GXBaseCollection<app.SdtInformeResumenporCliente_SDT_Item> AV60InformeResumenporCliente_SDT ;
   private app.SdtInformeResumenporCliente_SDT_Item AV131InformeResumenporCliente_SDT_item ;
}

final  class informeresumenporcliente_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFH2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T1.EmprCod, T1.AlbMarca, T1.AlbProPri, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE (T1.EmprCod = ? and T1.GuiRemCli >= ?) AND (T1.GuiRemCli <= ?) ORDER BY T1.EmprCod, T1.GuiRemCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFH3", "SELECT T1.AlbProCod, T2.BarColNum, T2.BarColNom, T2.BarTipDis, T2.BarEstReo, T2.BarSer, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarKgsCli, T1.BarAlbPN, T2.BarNomCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbPie, T1.EmprCod, T2.BarDisNum, T2.BarEncCli FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T2.BarSer >= ? and T2.BarSer <= ?) AND (T2.BarEstReo >= ?) AND (T2.BarEstReo <= ?) AND (T2.BarTipDis = ? or ? = '*') AND (T2.BarColNom >= ? and T2.BarColNom <= ?) AND (T2.BarColNum >= ? and T2.BarColNum <= ?) ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFH4", "SELECT SUM(BarPieKil) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               ((String[]) buf[17])[0] = rslt.getString(17, 8);
               ((String[]) buf[18])[0] = rslt.getString(18, 20);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

