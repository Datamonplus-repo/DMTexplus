package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpmaquina extends GXProcedure
{
   public dpmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpmaquina.class ), "" );
   }

   public dpmaquina( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTMaquina> executeUdp( String aP0 ,
                                                          GXSimpleCollection<String> aP1 ,
                                                          boolean aP2 )
   {
      dpmaquina.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTMaquina>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        GXSimpleCollection<String> aP1 ,
                        boolean aP2 ,
                        GXBaseCollection<app.SdtSDTMaquina>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             GXSimpleCollection<String> aP1 ,
                             boolean aP2 ,
                             GXBaseCollection<app.SdtSDTMaquina>[] aP3 )
   {
      dpmaquina.this.AV5Emprcod = aP0;
      dpmaquina.this.AV10MaqCodCollection = aP1;
      dpmaquina.this.AV7Detail = aP2;
      dpmaquina.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A602MaqCod ,
                                           AV10MaqCodCollection ,
                                           Integer.valueOf(AV10MaqCodCollection.size()) ,
                                           A607MaqEst ,
                                           Byte.valueOf(A6432MaqPln) ,
                                           A620MaqTip ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P000F2 */
      pr_default.execute(0, new Object[] {AV5Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P000F2_A602MaqCod[0] ;
         A396EmprCod = P000F2_A396EmprCod[0] ;
         A620MaqTip = P000F2_A620MaqTip[0] ;
         n620MaqTip = P000F2_n620MaqTip[0] ;
         A6432MaqPln = P000F2_A6432MaqPln[0] ;
         n6432MaqPln = P000F2_n6432MaqPln[0] ;
         A607MaqEst = P000F2_A607MaqEst[0] ;
         n607MaqEst = P000F2_n607MaqEst[0] ;
         A606MaqDsc = P000F2_A606MaqDsc[0] ;
         n606MaqDsc = P000F2_n606MaqDsc[0] ;
         Gxm1sdtmaquina = (app.SdtSDTMaquina)new app.SdtSDTMaquina(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmaquina, 0);
         Gxm1sdtmaquina.setgxTv_SdtSDTMaquina_Maqcod( A602MaqCod );
         Gxm1sdtmaquina.setgxTv_SdtSDTMaquina_Maqdsc( A606MaqDsc );
         /* Using cursor P000F6 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A180BarMaqCod = P000F6_A180BarMaqCod[0] ;
            A120BarAgrEst = P000F6_A120BarAgrEst[0] ;
            A13694BarHdr = P000F6_A13694BarHdr[0] ;
            A213BarSit = P000F6_A213BarSit[0] ;
            A135BarColNom = P000F6_A135BarColNom[0] ;
            A1234BarNomCli = P000F6_A1234BarNomCli[0] ;
            A252CliCod = P000F6_A252CliCod[0] ;
            n252CliCod = P000F6_n252CliCod[0] ;
            A279CliNom = P000F6_A279CliNom[0] ;
            A212BarSer = P000F6_A212BarSer[0] ;
            A136BarColNum = P000F6_A136BarColNum[0] ;
            A218BarTipCol = P000F6_A218BarTipCol[0] ;
            A1652BarSerDsc = P000F6_A1652BarSerDsc[0] ;
            A4812BarEncCli = P000F6_A4812BarEncCli[0] ;
            A3594BarPriTin = P000F6_A3594BarPriTin[0] ;
            A129BarCod = P000F6_A129BarCod[0] ;
            A132BarCodReo = P000F6_A132BarCodReo[0] ;
            A130BarCodPar = P000F6_A130BarCodPar[0] ;
            A40002BarKgm = P000F6_A40002BarKgm[0] ;
            n40002BarKgm = P000F6_n40002BarKgm[0] ;
            A40001GXC2 = P000F6_A40001GXC2[0] ;
            n40001GXC2 = P000F6_n40001GXC2[0] ;
            A40000BarFasEst = P000F6_A40000BarFasEst[0] ;
            n40000BarFasEst = P000F6_n40000BarFasEst[0] ;
            A166BarKgm = P000F6_A166BarKgm[0] ;
            A219BarTotAgr = P000F6_A219BarTotAgr[0] ;
            A279CliNom = P000F6_A279CliNom[0] ;
            A40001GXC2 = P000F6_A40001GXC2[0] ;
            n40001GXC2 = P000F6_n40001GXC2[0] ;
            A219BarTotAgr = P000F6_A219BarTotAgr[0] ;
            A40002BarKgm = P000F6_A40002BarKgm[0] ;
            n40002BarKgm = P000F6_n40002BarKgm[0] ;
            A166BarKgm = P000F6_A166BarKgm[0] ;
            A40000BarFasEst = P000F6_A40000BarFasEst[0] ;
            n40000BarFasEst = P000F6_n40000BarFasEst[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            Gxm3sdtmaquina_sdthdrspormaquina = (app.SdtSDTHdrsporMaquina)new app.SdtSDTHdrsporMaquina(remoteHandle, context);
            Gxm1sdtmaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().add(Gxm3sdtmaquina_sdthdrspormaquina, 0);
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barcod( A129BarCod );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barcodreo( A132BarCodReo );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barcodpar( A130BarCodPar );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barcolnom( A135BarColNom );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barnomcli( A1234BarNomCli );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barkgs( A40002BarKgm );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Clicod( A252CliCod );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Clinom( A279CliNom );
            GXt_int1 = AV6BarRgb ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_char4[0] = A212BarSer ;
            GXv_char5[0] = A135BarColNom ;
            GXv_int6[0] = A136BarColNum ;
            GXv_int7[0] = A218BarTipCol ;
            GXv_int8[0] = GXt_int1 ;
            new app.pbusrgb(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
            dpmaquina.this.A396EmprCod = GXv_char2[0] ;
            dpmaquina.this.A252CliCod = GXv_int3[0] ;
            dpmaquina.this.A212BarSer = GXv_char4[0] ;
            dpmaquina.this.A135BarColNom = GXv_char5[0] ;
            dpmaquina.this.A136BarColNum = GXv_int6[0] ;
            dpmaquina.this.A218BarTipCol = GXv_int7[0] ;
            dpmaquina.this.GXt_int1 = GXv_int8[0] ;
            AV6BarRgb = GXt_int1 ;
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barrgb( ((AV6BarRgb<0) ? 16777215 : AV6BarRgb) );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barser( A212BarSer );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barserdsc( A1652BarSerDsc );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Baragrest( A120BarAgrEst );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barhdr( A13694BarHdr );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Baragrhdr( A40001GXC2 );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barfasest( A40000BarFasEst );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barpritin( A3594BarPriTin );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Barenccli( A4812BarEncCli );
            Gxm3sdtmaquina_sdthdrspormaquina.setgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr( A812RecTotKgm );
            /* Using cursor P000F7 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(AV7Detail)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A187BarNotDsc = P000F7_A187BarNotDsc[0] ;
               A188BarNotLin = P000F7_A188BarNotLin[0] ;
               Gxm3sdtmaquina_sdthdrspormaquina.getgxTv_SdtSDTHdrsporMaquina_Barnotdsc().add(A187BarNotDsc, 0);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV7Detail )
            {
               /* Using cursor P000F8 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(AV7Detail)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A1507BarAgrDsc = P000F8_A1507BarAgrDsc[0] ;
                  A1649BarAgrDNu = P000F8_A1649BarAgrDNu[0] ;
                  A590KgmAgr = P000F8_A590KgmAgr[0] ;
                  A122BarAgrPar = P000F8_A122BarAgrPar[0] ;
                  A124BarAgrReo = P000F8_A124BarAgrReo[0] ;
                  A119BarAgrCod = P000F8_A119BarAgrCod[0] ;
                  A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
                  Gxm4sdtmaquina_sdthdrspormaquina_baragr = (app.SdtSDTHdrsporMaquina_Agr)new app.SdtSDTHdrsporMaquina_Agr(remoteHandle, context);
                  Gxm3sdtmaquina_sdthdrspormaquina.getgxTv_SdtSDTHdrsporMaquina_Baragr().add(Gxm4sdtmaquina_sdthdrspormaquina_baragr, 0);
                  Gxm4sdtmaquina_sdthdrspormaquina_baragr.setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrhdr( A13695BarAGrHdr );
                  Gxm4sdtmaquina_sdthdrspormaquina_baragr.setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc( A1507BarAgrDsc );
                  Gxm4sdtmaquina_sdthdrspormaquina_baragr.setgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu( A1649BarAgrDNu );
                  Gxm4sdtmaquina_sdthdrspormaquina_baragr.setgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr( A590KgmAgr );
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = dpmaquina.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A607MaqEst = "" ;
      A620MaqTip = "" ;
      A396EmprCod = "" ;
      P000F2_A602MaqCod = new String[] {""} ;
      P000F2_A396EmprCod = new String[] {""} ;
      P000F2_A620MaqTip = new String[] {""} ;
      P000F2_n620MaqTip = new boolean[] {false} ;
      P000F2_A6432MaqPln = new byte[1] ;
      P000F2_n6432MaqPln = new boolean[] {false} ;
      P000F2_A607MaqEst = new String[] {""} ;
      P000F2_n607MaqEst = new boolean[] {false} ;
      P000F2_A606MaqDsc = new String[] {""} ;
      P000F2_n606MaqDsc = new boolean[] {false} ;
      A606MaqDsc = "" ;
      Gxm1sdtmaquina = new app.SdtSDTMaquina(remoteHandle, context);
      P000F6_A396EmprCod = new String[] {""} ;
      P000F6_A180BarMaqCod = new String[] {""} ;
      P000F6_A120BarAgrEst = new String[] {""} ;
      P000F6_A13694BarHdr = new String[] {""} ;
      P000F6_A213BarSit = new byte[1] ;
      P000F6_A135BarColNom = new String[] {""} ;
      P000F6_A1234BarNomCli = new String[] {""} ;
      P000F6_A252CliCod = new int[1] ;
      P000F6_n252CliCod = new boolean[] {false} ;
      P000F6_A279CliNom = new String[] {""} ;
      P000F6_A212BarSer = new String[] {""} ;
      P000F6_A136BarColNum = new int[1] ;
      P000F6_A218BarTipCol = new byte[1] ;
      P000F6_A1652BarSerDsc = new String[] {""} ;
      P000F6_A4812BarEncCli = new String[] {""} ;
      P000F6_A3594BarPriTin = new byte[1] ;
      P000F6_A129BarCod = new int[1] ;
      P000F6_A132BarCodReo = new byte[1] ;
      P000F6_A130BarCodPar = new String[] {""} ;
      P000F6_A40002BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000F6_n40002BarKgm = new boolean[] {false} ;
      P000F6_A40001GXC2 = new String[] {""} ;
      P000F6_n40001GXC2 = new boolean[] {false} ;
      P000F6_A40000BarFasEst = new byte[1] ;
      P000F6_n40000BarFasEst = new boolean[] {false} ;
      P000F6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000F6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A13694BarHdr = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A4812BarEncCli = "" ;
      A130BarCodPar = "" ;
      A40002BarKgm = DecimalUtil.ZERO ;
      A40001GXC2 = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      Gxm3sdtmaquina_sdthdrspormaquina = new app.SdtSDTHdrsporMaquina(remoteHandle, context);
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new long[1] ;
      P000F7_A396EmprCod = new String[] {""} ;
      P000F7_A129BarCod = new int[1] ;
      P000F7_A132BarCodReo = new byte[1] ;
      P000F7_A130BarCodPar = new String[] {""} ;
      P000F7_A187BarNotDsc = new String[] {""} ;
      P000F7_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      P000F8_A396EmprCod = new String[] {""} ;
      P000F8_A129BarCod = new int[1] ;
      P000F8_A132BarCodReo = new byte[1] ;
      P000F8_A130BarCodPar = new String[] {""} ;
      P000F8_A1507BarAgrDsc = new String[] {""} ;
      P000F8_A1649BarAgrDNu = new String[] {""} ;
      P000F8_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000F8_A122BarAgrPar = new String[] {""} ;
      P000F8_A124BarAgrReo = new byte[1] ;
      P000F8_A119BarAgrCod = new int[1] ;
      A1507BarAgrDsc = "" ;
      A1649BarAgrDNu = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      A13695BarAGrHdr = "" ;
      Gxm4sdtmaquina_sdthdrspormaquina_baragr = new app.SdtSDTHdrsporMaquina_Agr(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpmaquina__default(),
         new Object[] {
             new Object[] {
            P000F2_A602MaqCod, P000F2_A396EmprCod, P000F2_A620MaqTip, P000F2_n620MaqTip, P000F2_A6432MaqPln, P000F2_n6432MaqPln, P000F2_A607MaqEst, P000F2_n607MaqEst, P000F2_A606MaqDsc, P000F2_n606MaqDsc
            }
            , new Object[] {
            P000F6_A396EmprCod, P000F6_A180BarMaqCod, P000F6_A120BarAgrEst, P000F6_A13694BarHdr, P000F6_A213BarSit, P000F6_A135BarColNom, P000F6_A1234BarNomCli, P000F6_A252CliCod, P000F6_n252CliCod, P000F6_A279CliNom,
            P000F6_A212BarSer, P000F6_A136BarColNum, P000F6_A218BarTipCol, P000F6_A1652BarSerDsc, P000F6_A4812BarEncCli, P000F6_A3594BarPriTin, P000F6_A129BarCod, P000F6_A132BarCodReo, P000F6_A130BarCodPar, P000F6_A40002BarKgm,
            P000F6_n40002BarKgm, P000F6_A40001GXC2, P000F6_n40001GXC2, P000F6_A40000BarFasEst, P000F6_n40000BarFasEst, P000F6_A166BarKgm, P000F6_A219BarTotAgr
            }
            , new Object[] {
            P000F7_A396EmprCod, P000F7_A129BarCod, P000F7_A132BarCodReo, P000F7_A130BarCodPar, P000F7_A187BarNotDsc, P000F7_A188BarNotLin
            }
            , new Object[] {
            P000F8_A396EmprCod, P000F8_A129BarCod, P000F8_A132BarCodReo, P000F8_A130BarCodPar, P000F8_A1507BarAgrDsc, P000F8_A1649BarAgrDNu, P000F8_A590KgmAgr, P000F8_A122BarAgrPar, P000F8_A124BarAgrReo, P000F8_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6432MaqPln ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A3594BarPriTin ;
   private byte A132BarCodReo ;
   private byte A40000BarFasEst ;
   private byte GXv_int7[] ;
   private byte A188BarNotLin ;
   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int AV10MaqCodCollection_size ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int A119BarAgrCod ;
   private long AV6BarRgb ;
   private long GXt_int1 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal A40002BarKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A590KgmAgr ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A607MaqEst ;
   private String A620MaqTip ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String A13694BarHdr ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A40001GXC2 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String A187BarNotDsc ;
   private String A1507BarAgrDsc ;
   private String A1649BarAgrDNu ;
   private String A122BarAgrPar ;
   private String A13695BarAGrHdr ;
   private boolean AV7Detail ;
   private boolean n620MaqTip ;
   private boolean n6432MaqPln ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private boolean n252CliCod ;
   private boolean n40002BarKgm ;
   private boolean n40001GXC2 ;
   private boolean n40000BarFasEst ;
   private GXBaseCollection<app.SdtSDTMaquina>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P000F2_A602MaqCod ;
   private String[] P000F2_A396EmprCod ;
   private String[] P000F2_A620MaqTip ;
   private boolean[] P000F2_n620MaqTip ;
   private byte[] P000F2_A6432MaqPln ;
   private boolean[] P000F2_n6432MaqPln ;
   private String[] P000F2_A607MaqEst ;
   private boolean[] P000F2_n607MaqEst ;
   private String[] P000F2_A606MaqDsc ;
   private boolean[] P000F2_n606MaqDsc ;
   private String[] P000F6_A396EmprCod ;
   private String[] P000F6_A180BarMaqCod ;
   private String[] P000F6_A120BarAgrEst ;
   private String[] P000F6_A13694BarHdr ;
   private byte[] P000F6_A213BarSit ;
   private String[] P000F6_A135BarColNom ;
   private String[] P000F6_A1234BarNomCli ;
   private int[] P000F6_A252CliCod ;
   private boolean[] P000F6_n252CliCod ;
   private String[] P000F6_A279CliNom ;
   private String[] P000F6_A212BarSer ;
   private int[] P000F6_A136BarColNum ;
   private byte[] P000F6_A218BarTipCol ;
   private String[] P000F6_A1652BarSerDsc ;
   private String[] P000F6_A4812BarEncCli ;
   private byte[] P000F6_A3594BarPriTin ;
   private int[] P000F6_A129BarCod ;
   private byte[] P000F6_A132BarCodReo ;
   private String[] P000F6_A130BarCodPar ;
   private java.math.BigDecimal[] P000F6_A40002BarKgm ;
   private boolean[] P000F6_n40002BarKgm ;
   private String[] P000F6_A40001GXC2 ;
   private boolean[] P000F6_n40001GXC2 ;
   private byte[] P000F6_A40000BarFasEst ;
   private boolean[] P000F6_n40000BarFasEst ;
   private java.math.BigDecimal[] P000F6_A166BarKgm ;
   private java.math.BigDecimal[] P000F6_A219BarTotAgr ;
   private String[] P000F7_A396EmprCod ;
   private int[] P000F7_A129BarCod ;
   private byte[] P000F7_A132BarCodReo ;
   private String[] P000F7_A130BarCodPar ;
   private String[] P000F7_A187BarNotDsc ;
   private byte[] P000F7_A188BarNotLin ;
   private String[] P000F8_A396EmprCod ;
   private int[] P000F8_A129BarCod ;
   private byte[] P000F8_A132BarCodReo ;
   private String[] P000F8_A130BarCodPar ;
   private String[] P000F8_A1507BarAgrDsc ;
   private String[] P000F8_A1649BarAgrDNu ;
   private java.math.BigDecimal[] P000F8_A590KgmAgr ;
   private String[] P000F8_A122BarAgrPar ;
   private byte[] P000F8_A124BarAgrReo ;
   private int[] P000F8_A119BarAgrCod ;
   private GXSimpleCollection<String> AV10MaqCodCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> Gxm2rootcol ;
   private app.SdtSDTMaquina Gxm1sdtmaquina ;
   private app.SdtSDTHdrsporMaquina Gxm3sdtmaquina_sdthdrspormaquina ;
   private app.SdtSDTHdrsporMaquina_Agr Gxm4sdtmaquina_sdthdrspormaquina_baragr ;
}

final  class dpmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P000F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A602MaqCod ,
                                          GXSimpleCollection<String> AV10MaqCodCollection ,
                                          int AV10MaqCodCollection_size ,
                                          String A607MaqEst ,
                                          byte A6432MaqPln ,
                                          String A620MaqTip ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[1];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT MaqCod, EmprCod, MaqTip, MaqPln, MaqEst, MaqDsc FROM TXPMAQUIN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MaqCod like 'TN%')");
      addWhere(sWhereString, "(MaqEst = 'A')");
      addWhere(sWhereString, "(MaqPln = 1)");
      addWhere(sWhereString, "(MaqTip = 'E')");
      if ( AV10MaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10MaqCodCollection, "MaqCod IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P000F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000F6", "SELECT T1.EmprCod, T1.BarMaqCod, T1.BarAgrEst, LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))),8,'0') || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || LPAD(RTRIM(T1.BarCodPar),1,' ') AS BarHdr, T1.BarSit, T1.BarColNom, T1.BarNomCli, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarColNum, T1.BarTipCol, T1.BarSerDsc, T1.BarEncCli, T1.BarPriTin, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T4.BarKgm, 0) AS GXC3, COALESCE( T3.GXC2, '') AS GXC2, COALESCE( T5.BarFasEst, 3) AS BarFasEst, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, MIN(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrReo,'90'), 2))) || LPAD(RTRIM(BarAgrPar),1,' ')) AS GXC2 FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MIN(BarFasEst) AS BarFasEst FROM TXPBARFAS WHERE BarFacTin = 'S' GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarMaqCod = ?) AND (T1.BarSit < 6) AND (COALESCE( T5.BarFasEst, 3) < 2) AND (LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))),8,'0') || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || LPAD(RTRIM(T1.BarCodPar),1,' ') < COALESCE( T3.GXC2, '') or Not T1.BarAgrEst = 'S') ORDER BY T1.EmprCod, T1.BarMaqCod, T1.BarPriTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000F7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (? = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000F8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrDsc, BarAgrDNu, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (? = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[1], 3);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBoolean(5, ((Boolean) parms[4]).booleanValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBoolean(5, ((Boolean) parms[4]).booleanValue());
               return;
      }
   }

}

