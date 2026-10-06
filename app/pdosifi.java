package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdosifi extends GXProcedure
{
   public pdosifi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdosifi.class ), "" );
   }

   public pdosifi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pdosifi.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pdosifi.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pdosifi.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pdosifi.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdosifi.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdosifi.this.AV19Anul = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20LawHojRut = GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
      AV21Revision = (byte)(1) ;
      AV28Del = (byte)(0) ;
      /* Using cursor P00EQ2 */
      pr_default.execute(0, new Object[] {AV20LawHojRut, Byte.valueOf(AV21Revision)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2482LawRevCod = P00EQ2_A2482LawRevCod[0] ;
         A2471LawHojRut = P00EQ2_A2471LawHojRut[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00EQ3 */
         pr_default.execute(1, new Object[] {A2471LawHojRut, Byte.valueOf(A2482LawRevCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLLAWER");
         /* End optimized DELETE. */
         /* Using cursor P00EQ4 */
         pr_default.execute(2, new Object[] {A2471LawHojRut, Byte.valueOf(A2482LawRevCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLAWER");
         AV28Del = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00EQ7 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P00EQ7_A130BarCodPar[0] ;
         A132BarCodReo = P00EQ7_A132BarCodReo[0] ;
         A129BarCod = P00EQ7_A129BarCod[0] ;
         A396EmprCod = P00EQ7_A396EmprCod[0] ;
         A180BarMaqCod = P00EQ7_A180BarMaqCod[0] ;
         A252CliCod = P00EQ7_A252CliCod[0] ;
         n252CliCod = P00EQ7_n252CliCod[0] ;
         A212BarSer = P00EQ7_A212BarSer[0] ;
         A236BarVolMaq = P00EQ7_A236BarVolMaq[0] ;
         A166BarKgm = P00EQ7_A166BarKgm[0] ;
         n166BarKgm = P00EQ7_n166BarKgm[0] ;
         A219BarTotAgr = P00EQ7_A219BarTotAgr[0] ;
         n219BarTotAgr = P00EQ7_n219BarTotAgr[0] ;
         A219BarTotAgr = P00EQ7_A219BarTotAgr[0] ;
         n219BarTotAgr = P00EQ7_n219BarTotAgr[0] ;
         A166BarKgm = P00EQ7_A166BarKgm[0] ;
         n166BarKgm = P00EQ7_n166BarKgm[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         /*
            INSERT RECORD ON TABLE TXPCLAWER

         */
         A2471LawHojRut = AV20LawHojRut ;
         A2482LawRevCod = AV21Revision ;
         A2474LawMaqCod = A180BarMaqCod ;
         n2474LawMaqCod = false ;
         A2470LawFecTra = GXutil.today( ) ;
         n2470LawFecTra = false ;
         A2467LawCliCod = A252CliCod ;
         n2467LawCliCod = false ;
         A2464LawArtCod = A212BarSer ;
         n2464LawArtCod = false ;
         A2472LawKil = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( A812RecTotKgm, 0))) ;
         n2472LawKil = false ;
         A2484LawVol = (short)(A236BarVolMaq) ;
         n2484LawVol = false ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) )
         {
            A2480LawRelBan = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A236BarVolMaq).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 0))) ;
            n2480LawRelBan = false ;
         }
         else
         {
            A2480LawRelBan = (short)(0) ;
            n2480LawRelBan = false ;
         }
         A2469LawFacAbs = (short)(0) ;
         n2469LawFacAbs = false ;
         if ( AV28Del == 0 )
         {
            A2476LawPedCod = (byte)(1) ;
            n2476LawPedCod = false ;
         }
         else
         {
            if ( GXutil.strcmp(AV19Anul, httpContext.getMessage( "Y", "")) == 0 )
            {
               A2476LawPedCod = (byte)(3) ;
               n2476LawPedCod = false ;
            }
            else
            {
               A2476LawPedCod = (byte)(2) ;
               n2476LawPedCod = false ;
            }
         }
         A2481LawResCod = (byte)(0) ;
         n2481LawResCod = false ;
         /* Using cursor P00EQ8 */
         pr_default.execute(4, new Object[] {A2471LawHojRut, Byte.valueOf(A2482LawRevCod), Boolean.valueOf(n2474LawMaqCod), A2474LawMaqCod, Boolean.valueOf(n2470LawFecTra), A2470LawFecTra, Boolean.valueOf(n2467LawCliCod), Integer.valueOf(A2467LawCliCod), Boolean.valueOf(n2464LawArtCod), A2464LawArtCod, Boolean.valueOf(n2472LawKil), Short.valueOf(A2472LawKil), Boolean.valueOf(n2484LawVol), Short.valueOf(A2484LawVol), Boolean.valueOf(n2480LawRelBan), Short.valueOf(A2480LawRelBan), Boolean.valueOf(n2469LawFacAbs), Short.valueOf(A2469LawFacAbs), Boolean.valueOf(n2476LawPedCod), Byte.valueOf(A2476LawPedCod), Boolean.valueOf(n2481LawResCod), Byte.valueOf(A2481LawResCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLAWER");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV22Maquina = A180BarMaqCod ;
         AV26LawLin = (short)(0) ;
         /* Using cursor P00EQ9 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1273RecLinPro = P00EQ9_A1273RecLinPro[0] ;
            A2804RecLinMaq = P00EQ9_A2804RecLinMaq[0] ;
            A764ProForCod = P00EQ9_A764ProForCod[0] ;
            AV23ProForCod = A764ProForCod ;
            /* Using cursor P00EQ10 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A719PrdNum = P00EQ10_A719PrdNum[0] ;
               n719PrdNum = P00EQ10_n719PrdNum[0] ;
               A811RecLin = P00EQ10_A811RecLin[0] ;
               A872RecPrdNum = P00EQ10_A872RecPrdNum[0] ;
               A875RecPrdDsc = P00EQ10_A875RecPrdDsc[0] ;
               A686PrdCant = P00EQ10_A686PrdCant[0] ;
               A490ForPrdUMe = P00EQ10_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P00EQ10_n490ForPrdUMe[0] ;
               A743PrdUniCon = P00EQ10_A743PrdUniCon[0] ;
               A743PrdUniCon = P00EQ10_A743PrdUniCon[0] ;
               AV26LawLin = (short)(AV26LawLin+10) ;
               AV25Cantidad = A686PrdCant ;
               if ( A490ForPrdUMe == 2 )
               {
                  AV24LawUniMed = httpContext.getMessage( "Cc", "") ;
               }
               else
               {
                  if ( A490ForPrdUMe == 3 )
                  {
                     if ( A743PrdUniCon == 3 )
                     {
                        AV24LawUniMed = httpContext.getMessage( "Cc", "") ;
                     }
                     else
                     {
                        AV24LawUniMed = httpContext.getMessage( "Gr", "") ;
                     }
                  }
                  else
                  {
                     AV24LawUniMed = httpContext.getMessage( "Gr", "") ;
                  }
               }
               /*
                  INSERT RECORD ON TABLE TXPLLAWER

               */
               A2471LawHojRut = AV20LawHojRut ;
               A2482LawRevCod = AV21Revision ;
               A2473LawLin = A811RecLin ;
               A2475LawMaquin = AV22Maquina ;
               n2475LawMaquin = false ;
               A2479LawProTin = AV23ProForCod ;
               n2479LawProTin = false ;
               A2468LawCodAgr = (byte)(0) ;
               n2468LawCodAgr = false ;
               A2477LawPrdCod = A872RecPrdNum ;
               n2477LawPrdCod = false ;
               A2478LawPrdDsc = A875RecPrdDsc ;
               n2478LawPrdDsc = false ;
               A2483LawUniMed = AV24LawUniMed ;
               n2483LawUniMed = false ;
               A2465LawCant = AV25Cantidad ;
               n2465LawCant = false ;
               A2466LawCantRe = DecimalUtil.ZERO ;
               n2466LawCantRe = false ;
               /* Using cursor P00EQ11 */
               pr_default.execute(7, new Object[] {A2471LawHojRut, Byte.valueOf(A2482LawRevCod), Short.valueOf(A2473LawLin), Boolean.valueOf(n2475LawMaquin), A2475LawMaquin, Boolean.valueOf(n2479LawProTin), A2479LawProTin, Boolean.valueOf(n2468LawCodAgr), Byte.valueOf(A2468LawCodAgr), Boolean.valueOf(n2477LawPrdCod), A2477LawPrdCod, Boolean.valueOf(n2478LawPrdDsc), A2478LawPrdDsc, Boolean.valueOf(n2483LawUniMed), A2483LawUniMed, Boolean.valueOf(n2465LawCant), A2465LawCant, Boolean.valueOf(n2466LawCantRe), A2466LawCantRe});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLLAWER");
               if ( (pr_default.getStatus(7) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               pr_default.readNext(6);
            }
            pr_default.close(6);
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdosifi.this.AV15EmprCod;
      this.aP1[0] = pdosifi.this.AV16BarCod;
      this.aP2[0] = pdosifi.this.AV17BarCodReo;
      this.aP3[0] = pdosifi.this.AV18BarCodPar;
      this.aP4[0] = pdosifi.this.AV19Anul;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdosifi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20LawHojRut = "" ;
      scmdbuf = "" ;
      P00EQ2_A2482LawRevCod = new byte[1] ;
      P00EQ2_A2471LawHojRut = new String[] {""} ;
      A2471LawHojRut = "" ;
      P00EQ7_A130BarCodPar = new String[] {""} ;
      P00EQ7_A132BarCodReo = new byte[1] ;
      P00EQ7_A129BarCod = new int[1] ;
      P00EQ7_A396EmprCod = new String[] {""} ;
      P00EQ7_A180BarMaqCod = new String[] {""} ;
      P00EQ7_A252CliCod = new int[1] ;
      P00EQ7_n252CliCod = new boolean[] {false} ;
      P00EQ7_A212BarSer = new String[] {""} ;
      P00EQ7_A236BarVolMaq = new int[1] ;
      P00EQ7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EQ7_n166BarKgm = new boolean[] {false} ;
      P00EQ7_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EQ7_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A2474LawMaqCod = "" ;
      A2470LawFecTra = GXutil.nullDate() ;
      A2464LawArtCod = "" ;
      Gx_emsg = "" ;
      AV22Maquina = "" ;
      P00EQ9_A396EmprCod = new String[] {""} ;
      P00EQ9_A129BarCod = new int[1] ;
      P00EQ9_A132BarCodReo = new byte[1] ;
      P00EQ9_A130BarCodPar = new String[] {""} ;
      P00EQ9_A1273RecLinPro = new byte[1] ;
      P00EQ9_A2804RecLinMaq = new short[1] ;
      P00EQ9_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      AV23ProForCod = "" ;
      P00EQ10_A719PrdNum = new String[] {""} ;
      P00EQ10_n719PrdNum = new boolean[] {false} ;
      P00EQ10_A396EmprCod = new String[] {""} ;
      P00EQ10_A129BarCod = new int[1] ;
      P00EQ10_A132BarCodReo = new byte[1] ;
      P00EQ10_A130BarCodPar = new String[] {""} ;
      P00EQ10_A2804RecLinMaq = new short[1] ;
      P00EQ10_A1273RecLinPro = new byte[1] ;
      P00EQ10_A811RecLin = new short[1] ;
      P00EQ10_A872RecPrdNum = new String[] {""} ;
      P00EQ10_A875RecPrdDsc = new String[] {""} ;
      P00EQ10_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EQ10_A490ForPrdUMe = new byte[1] ;
      P00EQ10_n490ForPrdUMe = new boolean[] {false} ;
      P00EQ10_A743PrdUniCon = new byte[1] ;
      A719PrdNum = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV25Cantidad = DecimalUtil.ZERO ;
      AV24LawUniMed = "" ;
      A2475LawMaquin = "" ;
      A2479LawProTin = "" ;
      A2477LawPrdCod = "" ;
      A2478LawPrdDsc = "" ;
      A2483LawUniMed = "" ;
      A2465LawCant = DecimalUtil.ZERO ;
      A2466LawCantRe = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdosifi__default(),
         new Object[] {
             new Object[] {
            P00EQ2_A2482LawRevCod, P00EQ2_A2471LawHojRut
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00EQ7_A130BarCodPar, P00EQ7_A132BarCodReo, P00EQ7_A129BarCod, P00EQ7_A396EmprCod, P00EQ7_A180BarMaqCod, P00EQ7_A252CliCod, P00EQ7_n252CliCod, P00EQ7_A212BarSer, P00EQ7_A236BarVolMaq, P00EQ7_A166BarKgm,
            P00EQ7_n166BarKgm, P00EQ7_A219BarTotAgr, P00EQ7_n219BarTotAgr
            }
            , new Object[] {
            }
            , new Object[] {
            P00EQ9_A396EmprCod, P00EQ9_A129BarCod, P00EQ9_A132BarCodReo, P00EQ9_A130BarCodPar, P00EQ9_A1273RecLinPro, P00EQ9_A2804RecLinMaq, P00EQ9_A764ProForCod
            }
            , new Object[] {
            P00EQ10_A719PrdNum, P00EQ10_n719PrdNum, P00EQ10_A396EmprCod, P00EQ10_A129BarCod, P00EQ10_A132BarCodReo, P00EQ10_A130BarCodPar, P00EQ10_A2804RecLinMaq, P00EQ10_A1273RecLinPro, P00EQ10_A811RecLin, P00EQ10_A872RecPrdNum,
            P00EQ10_A875RecPrdDsc, P00EQ10_A686PrdCant, P00EQ10_A490ForPrdUMe, P00EQ10_n490ForPrdUMe, P00EQ10_A743PrdUniCon
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV21Revision ;
   private byte AV28Del ;
   private byte A2482LawRevCod ;
   private byte A132BarCodReo ;
   private byte A2476LawPedCod ;
   private byte A2481LawResCod ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte A2468LawCodAgr ;
   private short A2472LawKil ;
   private short A2484LawVol ;
   private short A2480LawRelBan ;
   private short A2469LawFacAbs ;
   private short Gx_err ;
   private short AV26LawLin ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A2473LawLin ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A236BarVolMaq ;
   private int GX_INS335 ;
   private int A2467LawCliCod ;
   private int GX_INS336 ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV25Cantidad ;
   private java.math.BigDecimal A2465LawCant ;
   private java.math.BigDecimal A2466LawCantRe ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19Anul ;
   private String AV20LawHojRut ;
   private String scmdbuf ;
   private String A2471LawHojRut ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A212BarSer ;
   private String A2474LawMaqCod ;
   private String A2464LawArtCod ;
   private String Gx_emsg ;
   private String AV22Maquina ;
   private String A764ProForCod ;
   private String AV23ProForCod ;
   private String A719PrdNum ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String AV24LawUniMed ;
   private String A2475LawMaquin ;
   private String A2479LawProTin ;
   private String A2477LawPrdCod ;
   private String A2478LawPrdDsc ;
   private String A2483LawUniMed ;
   private java.util.Date A2470LawFecTra ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean n2474LawMaqCod ;
   private boolean n2470LawFecTra ;
   private boolean n2467LawCliCod ;
   private boolean n2464LawArtCod ;
   private boolean n2472LawKil ;
   private boolean n2484LawVol ;
   private boolean n2480LawRelBan ;
   private boolean n2469LawFacAbs ;
   private boolean n2476LawPedCod ;
   private boolean n2481LawResCod ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n2475LawMaquin ;
   private boolean n2479LawProTin ;
   private boolean n2468LawCodAgr ;
   private boolean n2477LawPrdCod ;
   private boolean n2478LawPrdDsc ;
   private boolean n2483LawUniMed ;
   private boolean n2465LawCant ;
   private boolean n2466LawCantRe ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00EQ2_A2482LawRevCod ;
   private String[] P00EQ2_A2471LawHojRut ;
   private String[] P00EQ7_A130BarCodPar ;
   private byte[] P00EQ7_A132BarCodReo ;
   private int[] P00EQ7_A129BarCod ;
   private String[] P00EQ7_A396EmprCod ;
   private String[] P00EQ7_A180BarMaqCod ;
   private int[] P00EQ7_A252CliCod ;
   private boolean[] P00EQ7_n252CliCod ;
   private String[] P00EQ7_A212BarSer ;
   private int[] P00EQ7_A236BarVolMaq ;
   private java.math.BigDecimal[] P00EQ7_A166BarKgm ;
   private boolean[] P00EQ7_n166BarKgm ;
   private java.math.BigDecimal[] P00EQ7_A219BarTotAgr ;
   private boolean[] P00EQ7_n219BarTotAgr ;
   private String[] P00EQ9_A396EmprCod ;
   private int[] P00EQ9_A129BarCod ;
   private byte[] P00EQ9_A132BarCodReo ;
   private String[] P00EQ9_A130BarCodPar ;
   private byte[] P00EQ9_A1273RecLinPro ;
   private short[] P00EQ9_A2804RecLinMaq ;
   private String[] P00EQ9_A764ProForCod ;
   private String[] P00EQ10_A719PrdNum ;
   private boolean[] P00EQ10_n719PrdNum ;
   private String[] P00EQ10_A396EmprCod ;
   private int[] P00EQ10_A129BarCod ;
   private byte[] P00EQ10_A132BarCodReo ;
   private String[] P00EQ10_A130BarCodPar ;
   private short[] P00EQ10_A2804RecLinMaq ;
   private byte[] P00EQ10_A1273RecLinPro ;
   private short[] P00EQ10_A811RecLin ;
   private String[] P00EQ10_A872RecPrdNum ;
   private String[] P00EQ10_A875RecPrdDsc ;
   private java.math.BigDecimal[] P00EQ10_A686PrdCant ;
   private byte[] P00EQ10_A490ForPrdUMe ;
   private boolean[] P00EQ10_n490ForPrdUMe ;
   private byte[] P00EQ10_A743PrdUniCon ;
}

final  class pdosifi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EQ2", "SELECT LawRevCod, LawHojRut FROM TXPCLAWER WHERE LawHojRut = ? and LawRevCod = ? ORDER BY LawHojRut, LawRevCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00EQ3", "DELETE FROM TXPLLAWER  WHERE LawHojRut = ? and LawRevCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLLAWER")
         ,new UpdateCursor("P00EQ4", "DELETE FROM TXPCLAWER  WHERE LawHojRut = ? AND LawRevCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLAWER")
         ,new ForEachCursor("P00EQ7", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarMaqCod, T1.CliCod, T1.BarSer, T1.BarVolMaq, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00EQ8", "INSERT INTO TXPCLAWER(LawHojRut, LawRevCod, LawMaqCod, LawFecTra, LawCliCod, LawArtCod, LawKil, LawVol, LawRelBan, LawFacAbs, LawPedCod, LawResCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLAWER")
         ,new ForEachCursor("P00EQ9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinPro, RecLinMaq, ProForCod FROM TXPCRECET WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00EQ10", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin, T1.RecPrdNum, T1.RecPrdDsc, T1.PrdCant, T1.ForPrdUMe, T2.PrdUniCon FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ?) AND (TO_NUMBER(T1.RecPrdNum) <= 100000 or TO_NUMBER(T1.RecPrdNum) >= 800000) AND (Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00EQ11", "INSERT INTO TXPLLAWER(LawHojRut, LawRevCod, LawLin, LawMaquin, LawProTin, LawCodAgr, LawPrdCod, LawPrdDsc, LawUniMed, LawCant, LawCantRe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLLAWER")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[21]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 26);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 3);
               }
               return;
      }
   }

}

