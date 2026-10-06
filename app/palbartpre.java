package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbartpre extends GXProcedure
{
   public palbartpre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbartpre.class ), "" );
   }

   public palbartpre( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             short[] aP11 )
   {
      palbartpre.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 )
   {
      palbartpre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbartpre.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbartpre.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      palbartpre.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbartpre.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbartpre.this.AV40AlbProMet = aP5[0];
      this.aP5 = aP5;
      palbartpre.this.AV41AlbProKgs = aP6[0];
      this.aP6 = aP6;
      palbartpre.this.AV42AlbProPie = aP7[0];
      this.aP7 = aP7;
      palbartpre.this.AV43BarAlbMtrE = aP8[0];
      this.aP8 = aP8;
      palbartpre.this.AV44BarAlbKgmE = aP9[0];
      this.aP9 = aP9;
      palbartpre.this.AV45BarAlbPie = aP10[0];
      this.aP10 = aP10;
      palbartpre.this.AV53AlbTipCon = aP11[0];
      this.aP11 = aP11;
      palbartpre.this.AV56AlbHdrObs = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV70Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV71EmprNom ;
      GXv_char3[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV70Station, GXv_char1, GXv_char2, GXv_char3) ;
      palbartpre.this.A396EmprCod = GXv_char1[0] ;
      palbartpre.this.AV71EmprNom = GXv_char2[0] ;
      palbartpre.this.AV72UsurCod = GXv_char3[0] ;
      GXt_int4 = (byte)(DecimalUtil.decToDouble(AV28Artextil)) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int5) ;
      palbartpre.this.GXt_int4 = GXv_int5[0] ;
      AV28Artextil = DecimalUtil.doubleToDec(GXt_int4) ;
      GXt_int4 = AV79SiK1K2 ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIK1K2", ""), GXv_int5) ;
      palbartpre.this.GXt_int4 = GXv_int5[0] ;
      AV79SiK1K2 = GXt_int4 ;
      GXt_int4 = AV80CtrlPesada ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PESAHR", ""), GXv_int5) ;
      palbartpre.this.GXt_int4 = GXv_int5[0] ;
      AV80CtrlPesada = GXt_int4 ;
      /* Using cursor P02VT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P02VT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1261BarAlbKgmE = P02VT3_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P02VT3_A1263BarAlbMtrE[0] ;
            A1265BarAlbPie = P02VT3_A1265BarAlbPie[0] ;
            A130BarCodPar = P02VT3_A130BarCodPar[0] ;
            n130BarCodPar = P02VT3_n130BarCodPar[0] ;
            A132BarCodReo = P02VT3_A132BarCodReo[0] ;
            n132BarCodReo = P02VT3_n132BarCodReo[0] ;
            A129BarCod = P02VT3_A129BarCod[0] ;
            n129BarCod = P02VT3_n129BarCod[0] ;
            A361DisCod = P02VT3_A361DisCod[0] ;
            A6816BarPreFMt = P02VT3_A6816BarPreFMt[0] ;
            n6816BarPreFMt = P02VT3_n6816BarPreFMt[0] ;
            A2441AlbHdrObs = P02VT3_A2441AlbHdrObs[0] ;
            A228BarUniMed = P02VT3_A228BarUniMed[0] ;
            A3139AlbTipCon = P02VT3_A3139AlbTipCon[0] ;
            n3139AlbTipCon = P02VT3_n3139AlbTipCon[0] ;
            A361DisCod = P02VT3_A361DisCod[0] ;
            A228BarUniMed = P02VT3_A228BarUniMed[0] ;
            AV56AlbHdrObs = GXutil.trim( A2441AlbHdrObs) ;
            AV69Inc_obs = httpContext.getMessage( "Contador SIK1K2 activo? = ", "") + GXutil.str( AV79SiK1K2, 1, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            AV88GXLvl45 = (byte)(0) ;
            /* Using cursor P02VT4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1032FonCod = P02VT4_A1032FonCod[0] ;
               A1056DisComCod = P02VT4_A1056DisComCod[0] ;
               A2524DisComLin = P02VT4_A2524DisComLin[0] ;
               AV88GXLvl45 = (byte)(1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV88GXLvl45 == 0 )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int6[0] = A129BarCod ;
               GXv_int5[0] = A132BarCodReo ;
               GXv_char2[0] = A130BarCodPar ;
               new app.palbtep1(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int5, GXv_char2) ;
               palbartpre.this.A396EmprCod = GXv_char3[0] ;
               palbartpre.this.A129BarCod = GXv_int6[0] ;
               palbartpre.this.A132BarCodReo = GXv_int5[0] ;
               palbartpre.this.A130BarCodPar = GXv_char2[0] ;
            }
            /* Using cursor P02VT5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1540BarComMLan = P02VT5_A1540BarComMLan[0] ;
               n1540BarComMLan = P02VT5_n1540BarComMLan[0] ;
               A1544BarComPLan = P02VT5_A1544BarComPLan[0] ;
               n1544BarComPLan = P02VT5_n1544BarComPLan[0] ;
               A1032FonCod = P02VT5_A1032FonCod[0] ;
               A1056DisComCod = P02VT5_A1056DisComCod[0] ;
               A2524DisComLin = P02VT5_A2524DisComLin[0] ;
               A1539BarComAnh = P02VT5_A1539BarComAnh[0] ;
               n1539BarComAnh = P02VT5_n1539BarComAnh[0] ;
               /*
                  INSERT RECORD ON TABLE TXPALBEST

               */
               A1533AlbEComM = DecimalUtil.doubleToDec(0) ;
               n1533AlbEComM = false ;
               A1534AlbEComP = (short)(0) ;
               n1534AlbEComP = false ;
               A1536AlbEComPre = DecimalUtil.doubleToDec(0) ;
               n1536AlbEComPre = false ;
               A2506AlbEstObs = "" ;
               n2506AlbEstObs = false ;
               A4334AlbEComUPz = (short)(0) ;
               n4334AlbEComUPz = false ;
               A4430DisComUtr = (short)(0) ;
               n4430DisComUtr = false ;
               /* Using cursor P02VT6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), Boolean.valueOf(n1536AlbEComPre), A1536AlbEComPre, Boolean.valueOf(n2506AlbEstObs), A2506AlbEstObs, Boolean.valueOf(n4334AlbEComUPz), Short.valueOf(A4334AlbEComUPz), Boolean.valueOf(n4430DisComUtr), Short.valueOf(A4430DisComUtr)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
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
               AV64Discomlin = A2524DisComLin ;
               Gx_msg = httpContext.getMessage( "&Discomlin=", "") + GXutil.str( AV64Discomlin, 2, 0) ;
               System.out.println( Gx_msg );
               AV68BarPieIdpz = GXutil.trim( GXutil.str( AV64Discomlin, 2, 0)) ;
               AV77BarPieK1 = DecimalUtil.doubleToDec(0) ;
               AV78BarPieK2 = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P02VT7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  brk2VT7 = false ;
                  A1271BarPieLzd = P02VT7_A1271BarPieLzd[0] ;
                  A170BarKilLan = P02VT7_A170BarKilLan[0] ;
                  A183BarMetLan = P02VT7_A183BarMetLan[0] ;
                  A200BarPieCod = P02VT7_A200BarPieCod[0] ;
                  A130BarCodPar = P02VT7_A130BarCodPar[0] ;
                  n130BarCodPar = P02VT7_n130BarCodPar[0] ;
                  A132BarCodReo = P02VT7_A132BarCodReo[0] ;
                  n132BarCodReo = P02VT7_n132BarCodReo[0] ;
                  A129BarCod = P02VT7_A129BarCod[0] ;
                  n129BarCod = P02VT7_n129BarCod[0] ;
                  A6489BarPieIdPz = P02VT7_A6489BarPieIdPz[0] ;
                  n6489BarPieIdPz = P02VT7_n6489BarPieIdPz[0] ;
                  A9795BarPieK1 = P02VT7_A9795BarPieK1[0] ;
                  n9795BarPieK1 = P02VT7_n9795BarPieK1[0] ;
                  A9796BarPieK2 = P02VT7_A9796BarPieK2[0] ;
                  n9796BarPieK2 = P02VT7_n9796BarPieK2[0] ;
                  if ( ( ( GXutil.strcmp(A6489BarPieIdPz, GXutil.trim( GXutil.str( AV64Discomlin, 2, 0))) == 0 ) ) || ( ( AV64Discomlin == 1 ) && ( ( GXutil.strcmp(A6489BarPieIdPz, "") == 0 ) || ( GXutil.strcmp(A6489BarPieIdPz, "0") == 0 ) ) ) )
                  {
                     if ( AV79SiK1K2 == 1 )
                     {
                        AV77BarPieK1 = AV77BarPieK1.add(A9795BarPieK1) ;
                        AV78BarPieK2 = AV78BarPieK2.add(A9796BarPieK2) ;
                     }
                     Gx_msg = httpContext.getMessage( "Barpiecod=", "") + A200BarPieCod ;
                     System.out.println( Gx_msg );
                     /*
                        INSERT RECORD ON TABLE TXPALBTEP

                     */
                     A7080AEPKil = A170BarKilLan ;
                     n7080AEPKil = false ;
                     A7081AEPMet = A183BarMetLan ;
                     n7081AEPMet = false ;
                     /* Using cursor P02VT8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, A200BarPieCod, Boolean.valueOf(n7080AEPKil), A7080AEPKil, Boolean.valueOf(n7081AEPMet), A7081AEPMet});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTEP");
                     if ( (pr_default.getStatus(6) == 1) )
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
                     Gx_msg = httpContext.getMessage( "New ALBTEP???", "") + A200BarPieCod ;
                     System.out.println( Gx_msg );
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P02VT7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P02VT7_A129BarCod[0] == A129BarCod ) && ( P02VT7_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P02VT7_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                     {
                        if ( ! ( ( GXutil.strcmp(P02VT7_A200BarPieCod[0], A200BarPieCod) == 0 ) ) )
                        {
                           if (true) break;
                        }
                        brk2VT7 = false ;
                        Gx_msg = httpContext.getMessage( "Rotura Barpiecod=", "") + A200BarPieCod ;
                        System.out.println( Gx_msg );
                        /*
                           INSERT RECORD ON TABLE TXPLALPRD

                        */
                        A27AlbPKilEnt = DecimalUtil.doubleToDec(0) ;
                        A1270AlbPMtrEnt = DecimalUtil.doubleToDec(0) ;
                        /* Using cursor P02VT9 */
                        pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, A27AlbPKilEnt, A1270AlbPMtrEnt});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
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
                        brk2VT7 = true ;
                        pr_default.readNext(5);
                     }
                     /* Using cursor P02VT10 */
                     pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
                     while ( (pr_default.getStatus(8) != 101) )
                     {
                        A2524DisComLin = P02VT10_A2524DisComLin[0] ;
                        A1056DisComCod = P02VT10_A1056DisComCod[0] ;
                        A1032FonCod = P02VT10_A1032FonCod[0] ;
                        /* Using cursor P02VT11 */
                        pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
                        A27AlbPKilEnt = P02VT11_A27AlbPKilEnt[0] ;
                        A1270AlbPMtrEnt = P02VT11_A1270AlbPMtrEnt[0] ;
                        O1261BarAlbKgmE = A1261BarAlbKgmE ;
                        O1263BarAlbMtrE = A1263BarAlbMtrE ;
                        O1265BarAlbPie = A1265BarAlbPie ;
                        O1540BarComMLan = A1540BarComMLan ;
                        n1540BarComMLan = false ;
                        O1544BarComPLan = A1544BarComPLan ;
                        n1544BarComPLan = false ;
                        O1271BarPieLzd = A1271BarPieLzd ;
                        O1533AlbEComM = A1533AlbEComM ;
                        n1533AlbEComM = false ;
                        O1534AlbEComP = A1534AlbEComP ;
                        n1534AlbEComP = false ;
                        Gx_msg = httpContext.getMessage( "Leyendo ALBTEP.Barpiecod=", "") + A200BarPieCod ;
                        System.out.println( Gx_msg );
                        A1261BarAlbKgmE = A1261BarAlbKgmE.add(A170BarKilLan) ;
                        A1263BarAlbMtrE = A1263BarAlbMtrE.add(A183BarMetLan) ;
                        A1265BarAlbPie = (int)(A1265BarAlbPie+1) ;
                        A1533AlbEComM = A1533AlbEComM.add(A183BarMetLan) ;
                        n1533AlbEComM = false ;
                        A1534AlbEComP = (short)(A1534AlbEComP+1) ;
                        n1534AlbEComP = false ;
                        A1540BarComMLan = A1540BarComMLan.add(A183BarMetLan) ;
                        n1540BarComMLan = false ;
                        A1544BarComPLan = (short)(A1544BarComPLan+1) ;
                        n1544BarComPLan = false ;
                        A1271BarPieLzd = (int)(A1271BarPieLzd+1) ;
                        A27AlbPKilEnt = A27AlbPKilEnt.add(A170BarKilLan) ;
                        A1270AlbPMtrEnt = A1270AlbPMtrEnt.add(A183BarMetLan) ;
                        AV44BarAlbKgmE = A1261BarAlbKgmE ;
                        AV43BarAlbMtrE = A1263BarAlbMtrE ;
                        AV45BarAlbPie = A1265BarAlbPie ;
                        AV46AlbEComm = A1533AlbEComM ;
                        AV47AlbEComp = A1534AlbEComP ;
                        AV48BarComMLan = A1540BarComMLan ;
                        AV49BarComPLan = A1544BarComPLan ;
                        AV50BarPieLzd = A1271BarPieLzd ;
                        AV51AlbPKilEnt = A27AlbPKilEnt ;
                        AV52AlbPMtrEnt = A1270AlbPMtrEnt ;
                        /* Using cursor P02VT12 */
                        pr_default.execute(10, new Object[] {A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
                        pr_default.readNext(8);
                     }
                     pr_default.close(8);
                     pr_default.close(9);
                  }
                  /* Using cursor P02VT13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A1271BarPieLzd), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( ! brk2VT7 )
                  {
                     brk2VT7 = true ;
                     pr_default.readNext(5);
                  }
               }
               pr_default.close(5);
               A1540BarComMLan = AV48BarComMLan ;
               n1540BarComMLan = false ;
               A1544BarComPLan = AV49BarComPLan ;
               n1544BarComPLan = false ;
               /* Using cursor P02VT14 */
               pr_default.execute(12, new Object[] {Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV28Artextil.doubleValue() == 1 )
            {
               AV37BarCod = A129BarCod ;
               AV38BarCodReo = A132BarCodReo ;
               AV39BarCodPar = A130BarCodPar ;
               AV55DisCod = A361DisCod ;
               AV76BarUnimed = A228BarUniMed ;
               /* Execute user subroutine: 'FASES' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               A3139AlbTipCon = AV53AlbTipCon ;
               n3139AlbTipCon = false ;
               A2441AlbHdrObs = AV56AlbHdrObs ;
            }
            A1261BarAlbKgmE = AV44BarAlbKgmE ;
            A1263BarAlbMtrE = AV43BarAlbMtrE ;
            A1265BarAlbPie = AV45BarAlbPie ;
            /* Using cursor P02VT15 */
            pr_default.execute(13, new Object[] {A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A2441AlbHdrObs, Boolean.valueOf(n3139AlbTipCon), Short.valueOf(A3139AlbTipCon), A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02VT16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A1263BarAlbMtrE = P02VT16_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P02VT16_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P02VT16_A1265BarAlbPie[0] ;
         AV43BarAlbMtrE = A1263BarAlbMtrE ;
         AV44BarAlbKgmE = A1261BarAlbKgmE ;
         AV45BarAlbPie = A1265BarAlbPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
      /* Using cursor P02VT18 */
      pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A37AlbProMet = P02VT18_A37AlbProMet[0] ;
         A35AlbProKgs = P02VT18_A35AlbProKgs[0] ;
         A38AlbProPie = P02VT18_A38AlbProPie[0] ;
         A37AlbProMet = P02VT18_A37AlbProMet[0] ;
         A35AlbProKgs = P02VT18_A35AlbProKgs[0] ;
         A38AlbProPie = P02VT18_A38AlbProPie[0] ;
         AV40AlbProMet = A37AlbProMet ;
         AV41AlbProKgs = A35AlbProKgs ;
         AV42AlbProPie = A38AlbProPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
      cleanup();
   }

   public void S111( )
   {
      /* 'ULTIMALINEA' Routine */
      returnInSub = false ;
      /* Using cursor P02VT19 */
      pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A1248GuiFasULin = P02VT19_A1248GuiFasULin[0] ;
         A1248GuiFasULin = (short)(A1248GuiFasULin+1) ;
         AV22GuiFasLin = A1248GuiFasULin ;
         /* Using cursor P02VT20 */
         pr_default.execute(17, new Object[] {Short.valueOf(A1248GuiFasULin), A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      /* Using cursor P02VT21 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, AV29FasCod});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A457FasCod = P02VT21_A457FasCod[0] ;
         A603MaqCodBis = P02VT21_A603MaqCodBis[0] ;
         A194BarOrdLin = P02VT21_A194BarOrdLin[0] ;
         A758ProCod = P02VT21_A758ProCod[0] ;
         AV30MaqCod = A603MaqCodBis ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      /* Using cursor P02VT22 */
      pr_default.execute(19, new Object[] {A396EmprCod, AV30MaqCod});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A602MaqCod = P02VT22_A602MaqCod[0] ;
         A5100MaqCCoCod = P02VT22_A5100MaqCCoCod[0] ;
         n5100MaqCCoCod = P02VT22_n5100MaqCCoCod[0] ;
         AV35MaqCCoCod = A5100MaqCCoCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void S121( )
   {
      /* 'FASES' Routine */
      returnInSub = false ;
      AV99GXLvl217 = (byte)(0) ;
      /* Using cursor P02VT23 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, AV28Artextil});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A361DisCod = P02VT23_A361DisCod[0] ;
         A252CliCod = P02VT23_A252CliCod[0] ;
         n252CliCod = P02VT23_n252CliCod[0] ;
         A1798BarDibCli = P02VT23_A1798BarDibCli[0] ;
         A1799BarDibInt = P02VT23_A1799BarDibInt[0] ;
         A3783BarRecLis = P02VT23_A3783BarRecLis[0] ;
         A257CliCue = P02VT23_A257CliCue[0] ;
         A212BarSer = P02VT23_A212BarSer[0] ;
         A257CliCue = P02VT23_A257CliCue[0] ;
         W129BarCod = A129BarCod ;
         n129BarCod = false ;
         W132BarCodReo = A132BarCodReo ;
         n132BarCodReo = false ;
         W130BarCodPar = A130BarCodPar ;
         n130BarCodPar = false ;
         AV99GXLvl217 = (byte)(1) ;
         AV61CliCod = A252CliCod ;
         AV62DibCli = A1798BarDibCli ;
         AV63DibInt = A1799BarDibInt ;
         AV73Hdr = A129BarCod ;
         AV74r = A132BarCodReo ;
         AV75p = A130BarCodPar ;
         AV81BarRecLis = A3783BarRecLis ;
         AV26CliCue = A257CliCue ;
         if ( CommonUtil.decimalVal( AV26CliCue, ".").doubleValue() < 100 )
         {
            AV53AlbTipCon = (short)(1) ;
            if ( AV57OkMza == 0 )
            {
               AV57OkMza = (byte)(1) ;
               AV56AlbHdrObs += httpContext.getMessage( " Tiene Mezcla.", "") ;
               AV56AlbHdrObs = GXutil.trim( AV56AlbHdrObs) ;
            }
         }
         AV100GXLvl240 = (byte)(0) ;
         /* Using cursor P02VT24 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(21) != 101) )
         {
            A7742DisFasDto = P02VT24_A7742DisFasDto[0] ;
            n7742DisFasDto = P02VT24_n7742DisFasDto[0] ;
            A7740DisFasPre = P02VT24_A7740DisFasPre[0] ;
            n7740DisFasPre = P02VT24_n7740DisFasPre[0] ;
            A7743DisFasRec = P02VT24_A7743DisFasRec[0] ;
            n7743DisFasRec = P02VT24_n7743DisFasRec[0] ;
            A7741DisFasUni = P02VT24_A7741DisFasUni[0] ;
            n7741DisFasUni = P02VT24_n7741DisFasUni[0] ;
            A457FasCod = P02VT24_A457FasCod[0] ;
            A7744FasPreObl = P02VT24_A7744FasPreObl[0] ;
            n7744FasPreObl = P02VT24_n7744FasPreObl[0] ;
            A758ProCod = P02VT24_A758ProCod[0] ;
            A368DisFasLin = P02VT24_A368DisFasLin[0] ;
            AV100GXLvl240 = (byte)(1) ;
            AV29FasCod = A457FasCod ;
            /* Execute user subroutine: 'DIBUJO' */
            S1318 ();
            if ( returnInSub )
            {
               pr_default.close(21);
               pr_default.close(20);
               pr_default.close(20);
               returnInSub = true;
               if (true) return;
            }
            if ( A7740DisFasPre.doubleValue() == 0 )
            {
               AV53AlbTipCon = (short)(1) ;
               AV56AlbHdrObs += " \"" + GXutil.trim( A457FasCod) + httpContext.getMessage( "\" s/precio.", "") ;
               AV56AlbHdrObs = GXutil.trim( AV56AlbHdrObs) ;
            }
            AV29FasCod = A457FasCod ;
            /* Execute user subroutine: 'ULTIMALINEA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(21);
               pr_default.close(20);
               pr_default.close(20);
               returnInSub = true;
               if (true) return;
            }
            /*
               INSERT RECORD ON TABLE TXPALBFAS

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            A1240GuiFasLin = AV22GuiFasLin ;
            A129BarCod = AV37BarCod ;
            n129BarCod = false ;
            A132BarCodReo = AV38BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = AV39BarCodPar ;
            n130BarCodPar = false ;
            A7392FasFacMaqC = AV30MaqCod ;
            n7392FasFacMaqC = false ;
            /* Execute user subroutine: 'KILOSMETROS' */
            S1419 ();
            if ( returnInSub )
            {
               pr_default.close(21);
               pr_default.close(20);
               pr_default.close(20);
               returnInSub = true;
               if (true) return;
            }
            A1275FasKgm = AV23Kilos ;
            A1276FasMtr = AV31Metros ;
            AV32Dto = (A7740DisFasPre.multiply((A7742DisFasDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))) ;
            AV33cDto = (A7740DisFasPre.subtract(AV32Dto)) ;
            AV34Rec = AV33cDto.multiply((A7743DisFasRec.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
            if ( GXutil.strcmp(A7741DisFasUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A1241GuiFasPKg = (A7740DisFasPre.subtract(AV32Dto).add(AV34Rec)).multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               A8194GuiFasPBK = A7740DisFasPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n8194GuiFasPBK = false ;
               A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
               A8195GuiFasPBM = DecimalUtil.doubleToDec(0) ;
               n8195GuiFasPBM = false ;
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A8196GuiFasPB = DecimalUtil.doubleToDec(0) ;
               n8196GuiFasPB = false ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = "" ;
               n4391FasPreDsM = false ;
            }
            else if ( GXutil.strcmp(A7741DisFasUni, httpContext.getMessage( "M", "")) == 0 )
            {
               A1242GuiFasPMt = (A7740DisFasPre.subtract(AV32Dto).add(AV34Rec)).multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               A8195GuiFasPBM = A7740DisFasPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n8195GuiFasPBM = false ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A8194GuiFasPBK = DecimalUtil.doubleToDec(0) ;
               n8194GuiFasPBK = false ;
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A8196GuiFasPB = DecimalUtil.doubleToDec(0) ;
               n8196GuiFasPB = false ;
               A4390FasPreDsK = "" ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
            }
            else if ( GXutil.strcmp(A7741DisFasUni, httpContext.getMessage( "F", "")) == 0 )
            {
               A7750GuiFasPre = (A7740DisFasPre.subtract(AV32Dto).add(AV34Rec)).multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n7750GuiFasPre = false ;
               A8196GuiFasPB = A7740DisFasPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n8196GuiFasPB = false ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
               A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
               A8195GuiFasPBM = DecimalUtil.doubleToDec(0) ;
               n8195GuiFasPBM = false ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A8194GuiFasPBK = DecimalUtil.doubleToDec(0) ;
               n8194GuiFasPBK = false ;
            }
            else if ( GXutil.strcmp(A7741DisFasUni, httpContext.getMessage( "C", "")) == 0 )
            {
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A8196GuiFasPB = DecimalUtil.doubleToDec(0) ;
               n8196GuiFasPB = false ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
               A1242GuiFasPMt = (A7740DisFasPre.subtract(AV32Dto).add(AV34Rec)).multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               A8195GuiFasPBM = A7740DisFasPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n8195GuiFasPBM = false ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A8194GuiFasPBK = DecimalUtil.doubleToDec(0) ;
               n8194GuiFasPBK = false ;
               A1276FasMtr = DecimalUtil.doubleToDec(AV60DibMolCil) ;
               A1275FasKgm = DecimalUtil.doubleToDec(0) ;
            }
            if ( ( GXutil.strcmp(AV76BarUnimed, httpContext.getMessage( "M", "")) == 0 ) && ( A7740DisFasPre.doubleValue() > 0 ) && ( GXutil.strcmp(A7741DisFasUni, " ") == 0 ) )
            {
               A1242GuiFasPMt = (A7740DisFasPre.subtract(AV32Dto).add(AV34Rec)).multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               A8195GuiFasPBM = A7740DisFasPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n8195GuiFasPBM = false ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A8194GuiFasPBK = DecimalUtil.doubleToDec(0) ;
               n8194GuiFasPBK = false ;
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A8196GuiFasPB = DecimalUtil.doubleToDec(0) ;
               n8196GuiFasPB = false ;
               A4390FasPreDsK = "" ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
            }
            A7751GuiFasDto = A7742DisFasDto ;
            n7751GuiFasDto = false ;
            A7752GuiFasRec = A7743DisFasRec ;
            n7752GuiFasRec = false ;
            A7753GuiFasCCo = AV35MaqCCoCod ;
            n7753GuiFasCCo = false ;
            AV69Inc_obs = httpContext.getMessage( "Caso 1.Registro Creado AlbFas ", "") + httpContext.getMessage( "Remito=", "") + GXutil.str( A30AlbProCod, 10, 0) + httpContext.getMessage( " Hdr=", "") + GXutil.str( AV37BarCod, 8, 0) + " " + GXutil.str( AV38BarCodReo, 1, 0) + AV39BarCodPar + GXutil.newLine( ) + httpContext.getMessage( " Fase=", "") + A457FasCod + httpContext.getMessage( " Precio Mt=", "") + GXutil.str( A7740DisFasPre, 10, 2) + httpContext.getMessage( " Dto=", "") + GXutil.str( AV32Dto, 10, 2) + httpContext.getMessage( " Rec=", "") + GXutil.str( AV34Rec, 10, 2) + httpContext.getMessage( "&CliCue=", "") + GXutil.trim( AV26CliCue) + GXutil.newLine( ) + httpContext.getMessage( "Precio Kg=", "") + GXutil.str( A1241GuiFasPKg, 13, 5) + httpContext.getMessage( "Precio Mt=", "") + GXutil.str( A1242GuiFasPMt, 13, 5) + httpContext.getMessage( " DisFasUni=", "") + A7741DisFasUni + httpContext.getMessage( " BarUnimed=", "") + AV76BarUnimed + httpContext.getMessage( " Mezcla=", "") + AV26CliCue + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
            /* Using cursor P02VT25 */
            pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n7392FasFacMaqC), A7392FasFacMaqC, Boolean.valueOf(n7750GuiFasPre), A7750GuiFasPre, Boolean.valueOf(n7751GuiFasDto), A7751GuiFasDto, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, Boolean.valueOf(n7753GuiFasCCo), Short.valueOf(A7753GuiFasCCo), Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, Boolean.valueOf(n8196GuiFasPB), A8196GuiFasPB});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            if ( (pr_default.getStatus(22) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            pr_default.readNext(21);
         }
         pr_default.close(21);
         if ( AV100GXLvl240 == 0 )
         {
         }
         /* Using cursor P02VT26 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(23) != 101) )
         {
            A758ProCod = P02VT26_A758ProCod[0] ;
            A368DisFasLin = P02VT26_A368DisFasLin[0] ;
            A7737ArtAdiUni = P02VT26_A7737ArtAdiUni[0] ;
            n7737ArtAdiUni = P02VT26_n7737ArtAdiUni[0] ;
            A7736ArtAdiPre = P02VT26_A7736ArtAdiPre[0] ;
            n7736ArtAdiPre = P02VT26_n7736ArtAdiPre[0] ;
            A7727ArtAdiCod = P02VT26_A7727ArtAdiCod[0] ;
            n7727ArtAdiCod = P02VT26_n7727ArtAdiCod[0] ;
            A457FasCod = P02VT26_A457FasCod[0] ;
            A7740DisFasPre = P02VT26_A7740DisFasPre[0] ;
            n7740DisFasPre = P02VT26_n7740DisFasPre[0] ;
            A7728ArtAdiDsc = P02VT26_A7728ArtAdiDsc[0] ;
            n7728ArtAdiDsc = P02VT26_n7728ArtAdiDsc[0] ;
            A7728ArtAdiDsc = P02VT26_A7728ArtAdiDsc[0] ;
            n7728ArtAdiDsc = P02VT26_n7728ArtAdiDsc[0] ;
            A457FasCod = P02VT26_A457FasCod[0] ;
            A7740DisFasPre = P02VT26_A7740DisFasPre[0] ;
            n7740DisFasPre = P02VT26_n7740DisFasPre[0] ;
            if ( A7740DisFasPre.doubleValue() == 0 )
            {
               AV53AlbTipCon = (short)(1) ;
               AV56AlbHdrObs += httpContext.getMessage( " Adic.", "") + GXutil.trim( GXutil.substring( A7728ArtAdiDsc, 1, 5)) + httpContext.getMessage( " S/Precio", "") ;
               AV56AlbHdrObs = GXutil.trim( AV56AlbHdrObs) ;
            }
            AV29FasCod = A457FasCod ;
            /* Execute user subroutine: 'ULTIMALINEA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(23);
               pr_default.close(23);
               pr_default.close(23);
               pr_default.close(20);
               pr_default.close(20);
               returnInSub = true;
               if (true) return;
            }
            /*
               INSERT RECORD ON TABLE TXPALBFAS

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            W7727ArtAdiCod = A7727ArtAdiCod ;
            n7727ArtAdiCod = false ;
            A1240GuiFasLin = AV22GuiFasLin ;
            A7392FasFacMaqC = AV30MaqCod ;
            n7392FasFacMaqC = false ;
            A129BarCod = AV37BarCod ;
            n129BarCod = false ;
            A132BarCodReo = AV38BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = AV39BarCodPar ;
            n130BarCodPar = false ;
            n7727ArtAdiCod = false ;
            /* Execute user subroutine: 'KILOSMETROS' */
            S1419 ();
            if ( returnInSub )
            {
               pr_default.close(23);
               pr_default.close(23);
               pr_default.close(23);
               pr_default.close(20);
               pr_default.close(20);
               returnInSub = true;
               if (true) return;
            }
            A1275FasKgm = AV23Kilos ;
            A1276FasMtr = AV31Metros ;
            if ( GXutil.strcmp(A7737ArtAdiUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A1241GuiFasPKg = A7736ArtAdiPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = "" ;
               n4391FasPreDsM = false ;
            }
            else if ( GXutil.strcmp(A7737ArtAdiUni, httpContext.getMessage( "M", "")) == 0 )
            {
               A1242GuiFasPMt = A7736ArtAdiPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A4390FasPreDsK = "" ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
            }
            else if ( GXutil.strcmp(A7737ArtAdiUni, httpContext.getMessage( "F", "")) == 0 )
            {
               A7750GuiFasPre = A7736ArtAdiPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n7750GuiFasPre = false ;
               A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
            }
            else if ( GXutil.strcmp(A7737ArtAdiUni, httpContext.getMessage( "C", "")) == 0 )
            {
               A7750GuiFasPre = A7736ArtAdiPre.multiply(CommonUtil.decimalVal( AV26CliCue, ".")).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n7750GuiFasPre = false ;
               A1242GuiFasPMt = DecimalUtil.doubleToDec(AV60DibMolCil) ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue ;
               n4391FasPreDsM = false ;
               A1275FasKgm = DecimalUtil.doubleToDec(0) ;
               A1276FasMtr = DecimalUtil.doubleToDec(AV60DibMolCil) ;
            }
            A8194GuiFasPBK = A1241GuiFasPKg ;
            n8194GuiFasPBK = false ;
            A8195GuiFasPBM = A1242GuiFasPMt ;
            n8195GuiFasPBM = false ;
            A8196GuiFasPB = A7750GuiFasPre ;
            n8196GuiFasPB = false ;
            A7753GuiFasCCo = AV35MaqCCoCod ;
            n7753GuiFasCCo = false ;
            AV69Inc_obs = httpContext.getMessage( "Caso 2.Registro Creado AlbFas ", "") + httpContext.getMessage( "Remito=", "") + GXutil.str( A30AlbProCod, 10, 0) + httpContext.getMessage( " Hdr=", "") + GXutil.str( AV37BarCod, 8, 0) + " " + GXutil.str( AV38BarCodReo, 1, 0) + AV39BarCodPar + httpContext.getMessage( " Fase=", "") + A457FasCod + GXutil.newLine( ) + httpContext.getMessage( "Precio Kg=", "") + GXutil.str( A1241GuiFasPKg, 13, 5) + httpContext.getMessage( "Precio Mt=", "") + GXutil.str( A1242GuiFasPMt, 13, 5) + httpContext.getMessage( " DisFasUni=", "") + A7737ArtAdiUni + httpContext.getMessage( " Mezcla=", "") + AV26CliCue + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
            /* Using cursor P02VT27 */
            pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n7392FasFacMaqC), A7392FasFacMaqC, Boolean.valueOf(n7727ArtAdiCod), Short.valueOf(A7727ArtAdiCod), Boolean.valueOf(n7750GuiFasPre), A7750GuiFasPre, Boolean.valueOf(n7753GuiFasCCo), Short.valueOf(A7753GuiFasCCo), Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, Boolean.valueOf(n8196GuiFasPB), A8196GuiFasPB});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            if ( (pr_default.getStatus(24) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            A7727ArtAdiCod = W7727ArtAdiCod ;
            n7727ArtAdiCod = false ;
            /* End Insert */
            pr_default.readNext(23);
         }
         pr_default.close(23);
         /* Using cursor P02VT28 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         while ( (pr_default.getStatus(25) != 101) )
         {
            A457FasCod = P02VT28_A457FasCod[0] ;
            A7744FasPreObl = P02VT28_A7744FasPreObl[0] ;
            n7744FasPreObl = P02VT28_n7744FasPreObl[0] ;
            A758ProCod = P02VT28_A758ProCod[0] ;
            A194BarOrdLin = P02VT28_A194BarOrdLin[0] ;
            A7744FasPreObl = P02VT28_A7744FasPreObl[0] ;
            n7744FasPreObl = P02VT28_n7744FasPreObl[0] ;
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            AV29FasCod = A457FasCod ;
            AV55DisCod = A361DisCod ;
            /* Execute user subroutine: 'CHKDISPO' */
            S1522 ();
            if ( returnInSub )
            {
               pr_default.close(25);
               pr_default.close(25);
               pr_default.close(20);
               pr_default.close(20);
               returnInSub = true;
               if (true) return;
            }
            if ( AV54OkDispo.doubleValue() == 0 )
            {
               AV53AlbTipCon = (short)(1) ;
               AV56AlbHdrObs += " \"" + GXutil.trim( A457FasCod) + httpContext.getMessage( "\" agregada en prod.", "") ;
               AV56AlbHdrObs = GXutil.trim( AV56AlbHdrObs) ;
               /* Execute user subroutine: 'ULTIMALINEA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(25);
                  pr_default.close(25);
                  pr_default.close(20);
                  pr_default.close(20);
                  returnInSub = true;
                  if (true) return;
               }
               /*
                  INSERT RECORD ON TABLE TXPALBFAS

               */
               W129BarCod = A129BarCod ;
               n129BarCod = false ;
               W132BarCodReo = A132BarCodReo ;
               n132BarCodReo = false ;
               W130BarCodPar = A130BarCodPar ;
               n130BarCodPar = false ;
               A1240GuiFasLin = AV22GuiFasLin ;
               A7392FasFacMaqC = AV30MaqCod ;
               n7392FasFacMaqC = false ;
               A129BarCod = AV37BarCod ;
               n129BarCod = false ;
               A132BarCodReo = AV38BarCodReo ;
               n132BarCodReo = false ;
               A130BarCodPar = AV39BarCodPar ;
               n130BarCodPar = false ;
               /* Execute user subroutine: 'KILOSMETROS' */
               S1419 ();
               if ( returnInSub )
               {
                  pr_default.close(25);
                  pr_default.close(25);
                  pr_default.close(20);
                  pr_default.close(20);
                  returnInSub = true;
                  if (true) return;
               }
               A1275FasKgm = AV23Kilos ;
               A1276FasMtr = AV31Metros ;
               A7750GuiFasPre = DecimalUtil.doubleToDec(0) ;
               n7750GuiFasPre = false ;
               A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
               A4390FasPreDsK = httpContext.getMessage( "Mezcla ", "") + AV26CliCue + httpContext.getMessage( ", Falta en Disposicion!", "") ;
               n4390FasPreDsK = false ;
               A4391FasPreDsM = httpContext.getMessage( "Mezcla ", "") + AV26CliCue + httpContext.getMessage( ", Falta en Disposicion!", "") ;
               n4391FasPreDsM = false ;
               A7753GuiFasCCo = AV35MaqCCoCod ;
               n7753GuiFasCCo = false ;
               AV69Inc_obs = httpContext.getMessage( "Caso3.Registro Creado AlbFas ", "") + httpContext.getMessage( "Remito=", "") + GXutil.str( A30AlbProCod, 10, 0) + httpContext.getMessage( " Hdr=", "") + GXutil.str( AV37BarCod, 8, 0) + " " + GXutil.str( AV38BarCodReo, 1, 0) + AV39BarCodPar + httpContext.getMessage( " Fase=", "") + A457FasCod + GXutil.newLine( ) + httpContext.getMessage( "Precio Kg=", "") + GXutil.str( A1241GuiFasPKg, 13, 5) + httpContext.getMessage( "Precio Mt=", "") + GXutil.str( A1242GuiFasPMt, 13, 5) + httpContext.getMessage( " Mezcla=", "") + AV26CliCue + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
               /* Using cursor P02VT29 */
               pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n7392FasFacMaqC), A7392FasFacMaqC, Boolean.valueOf(n7750GuiFasPre), A7750GuiFasPre, Boolean.valueOf(n7753GuiFasCCo), Short.valueOf(A7753GuiFasCCo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               if ( (pr_default.getStatus(26) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A129BarCod = W129BarCod ;
               n129BarCod = false ;
               A132BarCodReo = W132BarCodReo ;
               n132BarCodReo = false ;
               A130BarCodPar = W130BarCodPar ;
               n130BarCodPar = false ;
               /* End Insert */
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            pr_default.readNext(25);
         }
         pr_default.close(25);
         A129BarCod = W129BarCod ;
         n129BarCod = false ;
         A132BarCodReo = W132BarCodReo ;
         n132BarCodReo = false ;
         A130BarCodPar = W130BarCodPar ;
         n130BarCodPar = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
      if ( AV99GXLvl217 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ni siquiera encuentro la HDR", ""));
      }
   }

   public void S1419( )
   {
      /* 'KILOSMETROS' Routine */
      returnInSub = false ;
      AV82MtsKgsCrudo = (byte)(0) ;
      /* Using cursor P02VT30 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, AV29FasCod});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A252CliCod = P02VT30_A252CliCod[0] ;
         n252CliCod = P02VT30_n252CliCod[0] ;
         A457FasCod = P02VT30_A457FasCod[0] ;
         A456FasActTin = P02VT30_A456FasActTin[0] ;
         n456FasActTin = P02VT30_n456FasActTin[0] ;
         A298CliRef = P02VT30_A298CliRef[0] ;
         A4343FasEstamp = P02VT30_A4343FasEstamp[0] ;
         n4343FasEstamp = P02VT30_n4343FasEstamp[0] ;
         A2748CliAlias = P02VT30_A2748CliAlias[0] ;
         A758ProCod = P02VT30_A758ProCod[0] ;
         A194BarOrdLin = P02VT30_A194BarOrdLin[0] ;
         A456FasActTin = P02VT30_A456FasActTin[0] ;
         n456FasActTin = P02VT30_n456FasActTin[0] ;
         A4343FasEstamp = P02VT30_A4343FasEstamp[0] ;
         n4343FasEstamp = P02VT30_n4343FasEstamp[0] ;
         A252CliCod = P02VT30_A252CliCod[0] ;
         n252CliCod = P02VT30_n252CliCod[0] ;
         A298CliRef = P02VT30_A298CliRef[0] ;
         A2748CliAlias = P02VT30_A2748CliAlias[0] ;
         AV23Kilos = DecimalUtil.doubleToDec(0) ;
         AV31Metros = DecimalUtil.doubleToDec(0) ;
         if ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(GXutil.trim( A298CliRef), httpContext.getMessage( "E", "")) == 0 )
            {
               /* Using cursor P02VT31 */
               pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               while ( (pr_default.getStatus(28) != 101) )
               {
                  A44AlbRecCod = P02VT31_A44AlbRecCod[0] ;
                  A200BarPieCod = P02VT31_A200BarPieCod[0] ;
                  /* Using cursor P02VT32 */
                  pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
                  while ( (pr_default.getStatus(29) != 101) )
                  {
                     A2159AlbRecPie = P02VT32_A2159AlbRecPie[0] ;
                     A2155AlbRecKgm = P02VT32_A2155AlbRecKgm[0] ;
                     A2157AlbRecMtr = P02VT32_A2157AlbRecMtr[0] ;
                     AV23Kilos = AV23Kilos.add(A2155AlbRecKgm) ;
                     AV31Metros = AV31Metros.add(A2157AlbRecMtr) ;
                     AV82MtsKgsCrudo = (byte)(1) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(29);
                  pr_default.readNext(28);
               }
               pr_default.close(28);
               if ( ( AV80CtrlPesada == 1 ) && ( AV81BarRecLis == 9 ) )
               {
                  if ( ( AV77BarPieK1.doubleValue() > 0 ) && ( AV78BarPieK2.doubleValue() > 0 ) )
                  {
                     AV69Inc_obs = httpContext.getMessage( "Esta activo contador PESAHR", "") + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Cambio Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + httpContext.getMessage( " por Kilos  Crudos BARPIE.BarPieK1 = ", "") + GXutil.str( AV77BarPieK1, 9, 2) + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Cambio Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + httpContext.getMessage( " por Metros Crudos BARPIE.BarPieK2 = ", "") + GXutil.str( AV78BarPieK2, 9, 2) + GXutil.newLine( ) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                     AV23Kilos = AV77BarPieK1 ;
                     AV31Metros = AV78BarPieK2 ;
                     AV82MtsKgsCrudo = (byte)(0) ;
                  }
               }
               if ( AV80CtrlPesada == 0 )
               {
                  if ( ( AV77BarPieK1.doubleValue() > 0 ) && ( AV78BarPieK2.doubleValue() > 0 ) )
                  {
                     AV69Inc_obs = httpContext.getMessage( "NO esta activo contador PESAHR. Aplicamos como 2015-09-15", "") + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Cambio Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + httpContext.getMessage( " por Kilos  Crudos BARPIE.BarPieK1 = ", "") + GXutil.str( AV77BarPieK1, 9, 2) + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Cambio Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + httpContext.getMessage( " por Metros Crudos BARPIE.BarPieK2 = ", "") + GXutil.str( AV78BarPieK2, 9, 2) + GXutil.newLine( ) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                     AV23Kilos = AV77BarPieK1 ;
                     AV31Metros = AV78BarPieK2 ;
                     AV82MtsKgsCrudo = (byte)(0) ;
                  }
                  else
                  {
                     AV69Inc_obs = httpContext.getMessage( "APLICO Metros, Kilos CRUDO de ALMACEN.", "") + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + GXutil.newLine( ) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                  }
               }
               if ( AV82MtsKgsCrudo == 1 )
               {
                  AV69Inc_obs = httpContext.getMessage( "APLICO Metros, Kilos CRUDO de ALMACEN.", "") + GXutil.newLine( ) ;
                  AV69Inc_obs += httpContext.getMessage( "Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + GXutil.newLine( ) ;
                  AV69Inc_obs += httpContext.getMessage( "Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
               }
            }
            else
            {
               /* Optimized group. */
               /* Using cursor P02VT33 */
               pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               c170BarKilLan = P02VT33_A170BarKilLan[0] ;
               c183BarMetLan = P02VT33_A183BarMetLan[0] ;
               pr_default.close(30);
               AV23Kilos = AV23Kilos.add(c170BarKilLan) ;
               AV31Metros = AV31Metros.add(c183BarMetLan) ;
               /* End optimized group. */
            }
         }
         else if ( GXutil.strcmp(A4343FasEstamp, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(GXutil.trim( A2748CliAlias), httpContext.getMessage( "E", "")) == 0 )
            {
               /* Using cursor P02VT34 */
               pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               while ( (pr_default.getStatus(31) != 101) )
               {
                  A44AlbRecCod = P02VT34_A44AlbRecCod[0] ;
                  A200BarPieCod = P02VT34_A200BarPieCod[0] ;
                  /* Using cursor P02VT35 */
                  pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
                  while ( (pr_default.getStatus(32) != 101) )
                  {
                     A2159AlbRecPie = P02VT35_A2159AlbRecPie[0] ;
                     A2155AlbRecKgm = P02VT35_A2155AlbRecKgm[0] ;
                     A2157AlbRecMtr = P02VT35_A2157AlbRecMtr[0] ;
                     AV23Kilos = AV23Kilos.add(A2155AlbRecKgm) ;
                     AV31Metros = AV31Metros.add(A2157AlbRecMtr) ;
                     AV82MtsKgsCrudo = (byte)(1) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(32);
                  if ( ( AV80CtrlPesada == 1 ) && ( AV81BarRecLis == 9 ) )
                  {
                     if ( ( AV77BarPieK1.doubleValue() > 0 ) && ( AV78BarPieK2.doubleValue() > 0 ) )
                     {
                        AV69Inc_obs = httpContext.getMessage( "Esta activo contador PESAHR", "") + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + httpContext.getMessage( " por Kilos  Crudos BARPIE.BarPieK1 = ", "") + GXutil.str( AV77BarPieK1, 9, 2) + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + httpContext.getMessage( " por Metros Crudos BARPIE.BarPieK2 = ", "") + GXutil.str( AV78BarPieK2, 9, 2) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                        AV23Kilos = AV77BarPieK1 ;
                        AV31Metros = AV78BarPieK2 ;
                        AV82MtsKgsCrudo = (byte)(0) ;
                     }
                  }
                  if ( AV80CtrlPesada == 0 )
                  {
                     if ( ( AV77BarPieK1.doubleValue() > 0 ) && ( AV78BarPieK2.doubleValue() > 0 ) )
                     {
                        AV69Inc_obs = httpContext.getMessage( "NO esta activo contador PESAHR. Aplicamos como 2015-09-15", "") + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + httpContext.getMessage( " por Kilos  Crudos BARPIE.BarPieK1 = ", "") + GXutil.str( AV77BarPieK1, 9, 2) + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + httpContext.getMessage( " por Metros Crudos BARPIE.BarPieK2 = ", "") + GXutil.str( AV78BarPieK2, 9, 2) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                        AV23Kilos = AV77BarPieK1 ;
                        AV31Metros = AV78BarPieK2 ;
                        AV82MtsKgsCrudo = (byte)(0) ;
                     }
                     else
                     {
                        AV69Inc_obs = httpContext.getMessage( "APLICO Metros, Kilos CRUDO de ALMACEN.", "") + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                     }
                  }
                  if ( AV82MtsKgsCrudo == 1 )
                  {
                     AV69Inc_obs = httpContext.getMessage( "APLICO Metros, Kilos CRUDO de ALMACEN.", "") + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + GXutil.newLine( ) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                  }
                  pr_default.readNext(31);
               }
               pr_default.close(31);
            }
            else
            {
               /* Optimized group. */
               /* Using cursor P02VT36 */
               pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               c170BarKilLan = P02VT36_A170BarKilLan[0] ;
               c183BarMetLan = P02VT36_A183BarMetLan[0] ;
               pr_default.close(33);
               AV23Kilos = AV23Kilos.add(c170BarKilLan) ;
               AV31Metros = AV31Metros.add(c183BarMetLan) ;
               /* End optimized group. */
            }
         }
         else
         {
            if ( GXutil.strcmp(GXutil.trim( A298CliRef), httpContext.getMessage( "E", "")) == 0 )
            {
               /* Using cursor P02VT37 */
               pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               while ( (pr_default.getStatus(34) != 101) )
               {
                  A44AlbRecCod = P02VT37_A44AlbRecCod[0] ;
                  A200BarPieCod = P02VT37_A200BarPieCod[0] ;
                  /* Using cursor P02VT38 */
                  pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
                  while ( (pr_default.getStatus(35) != 101) )
                  {
                     A2159AlbRecPie = P02VT38_A2159AlbRecPie[0] ;
                     A2155AlbRecKgm = P02VT38_A2155AlbRecKgm[0] ;
                     A2157AlbRecMtr = P02VT38_A2157AlbRecMtr[0] ;
                     AV23Kilos = AV23Kilos.add(A2155AlbRecKgm) ;
                     AV31Metros = AV31Metros.add(A2157AlbRecMtr) ;
                     AV82MtsKgsCrudo = (byte)(1) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(35);
                  if ( ( AV80CtrlPesada == 1 ) && ( AV81BarRecLis == 9 ) )
                  {
                     if ( ( AV77BarPieK1.doubleValue() > 0 ) && ( AV78BarPieK2.doubleValue() > 0 ) )
                     {
                        AV69Inc_obs = httpContext.getMessage( "Esta activo contador PESAHR", "") + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + httpContext.getMessage( " por Kilos  Crudos BARPIE.BarPieK1 = ", "") + GXutil.str( AV77BarPieK1, 9, 2) + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + httpContext.getMessage( " por Metros Crudos BARPIE.BarPieK2 = ", "") + GXutil.str( AV78BarPieK2, 9, 2) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                        AV23Kilos = AV77BarPieK1 ;
                        AV31Metros = AV78BarPieK2 ;
                        AV82MtsKgsCrudo = (byte)(0) ;
                     }
                  }
                  if ( AV80CtrlPesada == 0 )
                  {
                     if ( ( AV77BarPieK1.doubleValue() > 0 ) && ( AV78BarPieK2.doubleValue() > 0 ) )
                     {
                        AV69Inc_obs = httpContext.getMessage( "NO esta activo contador PESAHR. Aplicamos como 2015-09-15", "") + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + httpContext.getMessage( " por Kilos  Crudos BARPIE.BarPieK1 = ", "") + GXutil.str( AV77BarPieK1, 9, 2) + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Cambio Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + httpContext.getMessage( " por Metros Crudos BARPIE.BarPieK2 = ", "") + GXutil.str( AV78BarPieK2, 9, 2) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                        AV23Kilos = AV77BarPieK1 ;
                        AV31Metros = AV78BarPieK2 ;
                        AV82MtsKgsCrudo = (byte)(0) ;
                     }
                     else
                     {
                        AV69Inc_obs = httpContext.getMessage( "APLICO Metros, Kilos CRUDO de ALMACEN.", "") + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + GXutil.newLine( ) ;
                        AV69Inc_obs += httpContext.getMessage( "Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                     }
                  }
                  if ( AV82MtsKgsCrudo == 1 )
                  {
                     AV69Inc_obs = httpContext.getMessage( "APLICO Metros, Kilos CRUDO de ALMACEN.", "") + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Kilos  Crudos ALBDET = ", "") + GXutil.str( AV23Kilos, 9, 2) + GXutil.newLine( ) ;
                     AV69Inc_obs += httpContext.getMessage( "Metros Crudos ALBDET = ", "") + GXutil.str( AV31Metros, 9, 2) + GXutil.newLine( ) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV87Pgmname, AV72UsurCod, AV70Station, AV69Inc_obs, AV37BarCod, AV38BarCodReo, AV39BarCodPar) ;
                  }
                  pr_default.readNext(34);
               }
               pr_default.close(34);
            }
            else
            {
               /* Optimized group. */
               /* Using cursor P02VT39 */
               pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               c170BarKilLan = P02VT39_A170BarKilLan[0] ;
               c183BarMetLan = P02VT39_A183BarMetLan[0] ;
               pr_default.close(36);
               AV23Kilos = AV23Kilos.add(c170BarKilLan) ;
               AV31Metros = AV31Metros.add(c183BarMetLan) ;
               /* End optimized group. */
            }
         }
         pr_default.readNext(27);
      }
      pr_default.close(27);
   }

   public void S1522( )
   {
      /* 'CHKDISPO' Routine */
      returnInSub = false ;
      AV113GXLvl615 = (byte)(0) ;
      /* Using cursor P02VT40 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(AV55DisCod), AV29FasCod});
      while ( (pr_default.getStatus(37) != 101) )
      {
         A457FasCod = P02VT40_A457FasCod[0] ;
         A361DisCod = P02VT40_A361DisCod[0] ;
         A7742DisFasDto = P02VT40_A7742DisFasDto[0] ;
         n7742DisFasDto = P02VT40_n7742DisFasDto[0] ;
         A758ProCod = P02VT40_A758ProCod[0] ;
         A368DisFasLin = P02VT40_A368DisFasLin[0] ;
         AV113GXLvl615 = (byte)(1) ;
         AV54OkDispo = DecimalUtil.doubleToDec(1) ;
         pr_default.readNext(37);
      }
      pr_default.close(37);
      if ( AV113GXLvl615 == 0 )
      {
         AV54OkDispo = DecimalUtil.doubleToDec(0) ;
      }
   }

   public void S1318( )
   {
      /* 'DIBUJO' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV29FasCod, httpContext.getMessage( "SEPARACI", "")) == 0 ) || ( GXutil.strcmp(AV29FasCod, httpContext.getMessage( "SEMACHIN", "")) == 0 ) )
      {
         AV60DibMolCil = (short)(0) ;
         /* Using cursor P02VT41 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(AV37BarCod), Byte.valueOf(AV38BarCodReo), AV39BarCodPar});
         while ( (pr_default.getStatus(38) != 101) )
         {
            A7145OSSCod = P02VT41_A7145OSSCod[0] ;
            A7150OSSFchRea = P02VT41_A7150OSSFchRea[0] ;
            n7150OSSFchRea = P02VT41_n7150OSSFchRea[0] ;
            /* Optimized group. */
            /* Using cursor P02VT42 */
            pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod)});
            cV60DibMolCil = P02VT42_AV60DibMolCil[0] ;
            pr_default.close(39);
            AV60DibMolCil = (short)(AV60DibMolCil+cV60DibMolCil*1) ;
            /* End optimized group. */
            pr_default.readNext(38);
         }
         pr_default.close(38);
      }
      else
      {
         if ( ( GXutil.strcmp(AV29FasCod, httpContext.getMessage( "GRABACIN", "")) == 0 ) || ( GXutil.strcmp(AV29FasCod, httpContext.getMessage( "GRCONVEN", "")) == 0 ) || ( GXutil.strcmp(AV29FasCod, httpContext.getMessage( "GRINKJET", "")) == 0 ) )
         {
            AV60DibMolCil = (short)(0) ;
            /* Using cursor P02VT43 */
            pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(AV37BarCod), Byte.valueOf(AV38BarCodReo), AV39BarCodPar});
            while ( (pr_default.getStatus(40) != 101) )
            {
               A7049OGSCod = P02VT43_A7049OGSCod[0] ;
               /* Optimized group. */
               /* Using cursor P02VT44 */
               pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod)});
               cV60DibMolCil = P02VT44_AV60DibMolCil[0] ;
               pr_default.close(41);
               AV60DibMolCil = (short)(AV60DibMolCil+cV60DibMolCil*1) ;
               /* End optimized group. */
               pr_default.readNext(40);
            }
            pr_default.close(40);
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbartpre.this.A396EmprCod;
      this.aP1[0] = palbartpre.this.A30AlbProCod;
      this.aP2[0] = palbartpre.this.A129BarCod;
      this.aP3[0] = palbartpre.this.A132BarCodReo;
      this.aP4[0] = palbartpre.this.A130BarCodPar;
      this.aP5[0] = palbartpre.this.AV40AlbProMet;
      this.aP6[0] = palbartpre.this.AV41AlbProKgs;
      this.aP7[0] = palbartpre.this.AV42AlbProPie;
      this.aP8[0] = palbartpre.this.AV43BarAlbMtrE;
      this.aP9[0] = palbartpre.this.AV44BarAlbKgmE;
      this.aP10[0] = palbartpre.this.AV45BarAlbPie;
      this.aP11[0] = palbartpre.this.AV53AlbTipCon;
      this.aP12[0] = palbartpre.this.AV56AlbHdrObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbartpre");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV70Station = "" ;
      GXv_char1 = new String[1] ;
      AV71EmprNom = "" ;
      AV72UsurCod = "" ;
      AV28Artextil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02VT2_A396EmprCod = new String[] {""} ;
      P02VT2_A30AlbProCod = new long[1] ;
      P02VT3_A396EmprCod = new String[] {""} ;
      P02VT3_A30AlbProCod = new long[1] ;
      P02VT3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT3_A1265BarAlbPie = new int[1] ;
      P02VT3_A130BarCodPar = new String[] {""} ;
      P02VT3_n130BarCodPar = new boolean[] {false} ;
      P02VT3_A132BarCodReo = new byte[1] ;
      P02VT3_n132BarCodReo = new boolean[] {false} ;
      P02VT3_A129BarCod = new int[1] ;
      P02VT3_n129BarCod = new boolean[] {false} ;
      P02VT3_A361DisCod = new int[1] ;
      P02VT3_A6816BarPreFMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT3_n6816BarPreFMt = new boolean[] {false} ;
      P02VT3_A2441AlbHdrObs = new String[] {""} ;
      P02VT3_A228BarUniMed = new String[] {""} ;
      P02VT3_A3139AlbTipCon = new short[1] ;
      P02VT3_n3139AlbTipCon = new boolean[] {false} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A6816BarPreFMt = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A228BarUniMed = "" ;
      AV69Inc_obs = "" ;
      AV87Pgmname = "" ;
      P02VT4_A396EmprCod = new String[] {""} ;
      P02VT4_A361DisCod = new int[1] ;
      P02VT4_A1032FonCod = new String[] {""} ;
      P02VT4_A1056DisComCod = new String[] {""} ;
      P02VT4_A2524DisComLin = new byte[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      P02VT5_A396EmprCod = new String[] {""} ;
      P02VT5_A129BarCod = new int[1] ;
      P02VT5_n129BarCod = new boolean[] {false} ;
      P02VT5_A132BarCodReo = new byte[1] ;
      P02VT5_n132BarCodReo = new boolean[] {false} ;
      P02VT5_A130BarCodPar = new String[] {""} ;
      P02VT5_n130BarCodPar = new boolean[] {false} ;
      P02VT5_A1540BarComMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT5_n1540BarComMLan = new boolean[] {false} ;
      P02VT5_A1544BarComPLan = new short[1] ;
      P02VT5_n1544BarComPLan = new boolean[] {false} ;
      P02VT5_A1032FonCod = new String[] {""} ;
      P02VT5_A1056DisComCod = new String[] {""} ;
      P02VT5_A2524DisComLin = new byte[1] ;
      P02VT5_A1539BarComAnh = new short[1] ;
      P02VT5_n1539BarComAnh = new boolean[] {false} ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      A2506AlbEstObs = "" ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      AV68BarPieIdpz = "" ;
      AV77BarPieK1 = DecimalUtil.ZERO ;
      AV78BarPieK2 = DecimalUtil.ZERO ;
      P02VT7_A396EmprCod = new String[] {""} ;
      P02VT7_A1271BarPieLzd = new int[1] ;
      P02VT7_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT7_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT7_A200BarPieCod = new String[] {""} ;
      P02VT7_A130BarCodPar = new String[] {""} ;
      P02VT7_n130BarCodPar = new boolean[] {false} ;
      P02VT7_A132BarCodReo = new byte[1] ;
      P02VT7_n132BarCodReo = new boolean[] {false} ;
      P02VT7_A129BarCod = new int[1] ;
      P02VT7_n129BarCod = new boolean[] {false} ;
      P02VT7_A6489BarPieIdPz = new String[] {""} ;
      P02VT7_n6489BarPieIdPz = new boolean[] {false} ;
      P02VT7_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT7_n9795BarPieK1 = new boolean[] {false} ;
      P02VT7_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT7_n9796BarPieK2 = new boolean[] {false} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A6489BarPieIdPz = "" ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A7080AEPKil = DecimalUtil.ZERO ;
      A7081AEPMet = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      P02VT10_A396EmprCod = new String[] {""} ;
      P02VT10_A129BarCod = new int[1] ;
      P02VT10_n129BarCod = new boolean[] {false} ;
      P02VT10_A132BarCodReo = new byte[1] ;
      P02VT10_n132BarCodReo = new boolean[] {false} ;
      P02VT10_A130BarCodPar = new String[] {""} ;
      P02VT10_n130BarCodPar = new boolean[] {false} ;
      P02VT10_A200BarPieCod = new String[] {""} ;
      P02VT10_A30AlbProCod = new long[1] ;
      P02VT10_A2524DisComLin = new byte[1] ;
      P02VT10_A1056DisComCod = new String[] {""} ;
      P02VT10_A1032FonCod = new String[] {""} ;
      P02VT11_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT11_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      O1261BarAlbKgmE = DecimalUtil.ZERO ;
      O1263BarAlbMtrE = DecimalUtil.ZERO ;
      O1540BarComMLan = DecimalUtil.ZERO ;
      O1533AlbEComM = DecimalUtil.ZERO ;
      AV46AlbEComm = DecimalUtil.ZERO ;
      AV48BarComMLan = DecimalUtil.ZERO ;
      AV51AlbPKilEnt = DecimalUtil.ZERO ;
      AV52AlbPMtrEnt = DecimalUtil.ZERO ;
      AV39BarCodPar = "" ;
      AV76BarUnimed = "" ;
      P02VT16_A396EmprCod = new String[] {""} ;
      P02VT16_A30AlbProCod = new long[1] ;
      P02VT16_A129BarCod = new int[1] ;
      P02VT16_n129BarCod = new boolean[] {false} ;
      P02VT16_A132BarCodReo = new byte[1] ;
      P02VT16_n132BarCodReo = new boolean[] {false} ;
      P02VT16_A130BarCodPar = new String[] {""} ;
      P02VT16_n130BarCodPar = new boolean[] {false} ;
      P02VT16_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT16_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT16_A1265BarAlbPie = new int[1] ;
      P02VT18_A396EmprCod = new String[] {""} ;
      P02VT18_A30AlbProCod = new long[1] ;
      P02VT18_A37AlbProMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT18_A35AlbProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT18_A38AlbProPie = new short[1] ;
      A37AlbProMet = DecimalUtil.ZERO ;
      A35AlbProKgs = DecimalUtil.ZERO ;
      P02VT19_A396EmprCod = new String[] {""} ;
      P02VT19_A30AlbProCod = new long[1] ;
      P02VT19_A129BarCod = new int[1] ;
      P02VT19_n129BarCod = new boolean[] {false} ;
      P02VT19_A132BarCodReo = new byte[1] ;
      P02VT19_n132BarCodReo = new boolean[] {false} ;
      P02VT19_A130BarCodPar = new String[] {""} ;
      P02VT19_n130BarCodPar = new boolean[] {false} ;
      P02VT19_A1248GuiFasULin = new short[1] ;
      AV29FasCod = "" ;
      P02VT21_A396EmprCod = new String[] {""} ;
      P02VT21_A129BarCod = new int[1] ;
      P02VT21_n129BarCod = new boolean[] {false} ;
      P02VT21_A132BarCodReo = new byte[1] ;
      P02VT21_n132BarCodReo = new boolean[] {false} ;
      P02VT21_A130BarCodPar = new String[] {""} ;
      P02VT21_n130BarCodPar = new boolean[] {false} ;
      P02VT21_A457FasCod = new String[] {""} ;
      P02VT21_A603MaqCodBis = new String[] {""} ;
      P02VT21_A194BarOrdLin = new short[1] ;
      P02VT21_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      AV30MaqCod = "" ;
      P02VT22_A396EmprCod = new String[] {""} ;
      P02VT22_A602MaqCod = new String[] {""} ;
      P02VT22_A5100MaqCCoCod = new short[1] ;
      P02VT22_n5100MaqCCoCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      A1798BarDibCli = "" ;
      A257CliCue = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A7728ArtAdiDsc = "" ;
      P02VT23_A396EmprCod = new String[] {""} ;
      P02VT23_A129BarCod = new int[1] ;
      P02VT23_n129BarCod = new boolean[] {false} ;
      P02VT23_A132BarCodReo = new byte[1] ;
      P02VT23_n132BarCodReo = new boolean[] {false} ;
      P02VT23_A130BarCodPar = new String[] {""} ;
      P02VT23_n130BarCodPar = new boolean[] {false} ;
      P02VT23_A361DisCod = new int[1] ;
      P02VT23_A252CliCod = new int[1] ;
      P02VT23_n252CliCod = new boolean[] {false} ;
      P02VT23_A1798BarDibCli = new String[] {""} ;
      P02VT23_A1799BarDibInt = new int[1] ;
      P02VT23_A3783BarRecLis = new byte[1] ;
      P02VT23_A257CliCue = new String[] {""} ;
      P02VT23_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      W130BarCodPar = "" ;
      AV62DibCli = "" ;
      AV75p = "" ;
      AV26CliCue = "" ;
      P02VT24_A396EmprCod = new String[] {""} ;
      P02VT24_A361DisCod = new int[1] ;
      P02VT24_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT24_n7742DisFasDto = new boolean[] {false} ;
      P02VT24_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT24_n7740DisFasPre = new boolean[] {false} ;
      P02VT24_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT24_n7743DisFasRec = new boolean[] {false} ;
      P02VT24_A7741DisFasUni = new String[] {""} ;
      P02VT24_n7741DisFasUni = new boolean[] {false} ;
      P02VT24_A457FasCod = new String[] {""} ;
      P02VT24_A7744FasPreObl = new byte[1] ;
      P02VT24_n7744FasPreObl = new boolean[] {false} ;
      P02VT24_A758ProCod = new String[] {""} ;
      P02VT24_A368DisFasLin = new short[1] ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      A7392FasFacMaqC = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      AV23Kilos = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      AV31Metros = DecimalUtil.ZERO ;
      AV32Dto = DecimalUtil.ZERO ;
      AV33cDto = DecimalUtil.ZERO ;
      AV34Rec = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A7750GuiFasPre = DecimalUtil.ZERO ;
      A8196GuiFasPB = DecimalUtil.ZERO ;
      A4390FasPreDsK = "" ;
      A4391FasPreDsM = "" ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      P02VT26_A758ProCod = new String[] {""} ;
      P02VT26_A368DisFasLin = new short[1] ;
      P02VT26_A396EmprCod = new String[] {""} ;
      P02VT26_A361DisCod = new int[1] ;
      P02VT26_A7737ArtAdiUni = new String[] {""} ;
      P02VT26_n7737ArtAdiUni = new boolean[] {false} ;
      P02VT26_A7736ArtAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT26_n7736ArtAdiPre = new boolean[] {false} ;
      P02VT26_A7727ArtAdiCod = new short[1] ;
      P02VT26_n7727ArtAdiCod = new boolean[] {false} ;
      P02VT26_A457FasCod = new String[] {""} ;
      P02VT26_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT26_n7740DisFasPre = new boolean[] {false} ;
      P02VT26_A7728ArtAdiDsc = new String[] {""} ;
      P02VT26_n7728ArtAdiDsc = new boolean[] {false} ;
      A7737ArtAdiUni = "" ;
      A7736ArtAdiPre = DecimalUtil.ZERO ;
      P02VT28_A396EmprCod = new String[] {""} ;
      P02VT28_A129BarCod = new int[1] ;
      P02VT28_n129BarCod = new boolean[] {false} ;
      P02VT28_A132BarCodReo = new byte[1] ;
      P02VT28_n132BarCodReo = new boolean[] {false} ;
      P02VT28_A130BarCodPar = new String[] {""} ;
      P02VT28_n130BarCodPar = new boolean[] {false} ;
      P02VT28_A457FasCod = new String[] {""} ;
      P02VT28_A7744FasPreObl = new byte[1] ;
      P02VT28_n7744FasPreObl = new boolean[] {false} ;
      P02VT28_A758ProCod = new String[] {""} ;
      P02VT28_A194BarOrdLin = new short[1] ;
      AV54OkDispo = DecimalUtil.ZERO ;
      P02VT30_A252CliCod = new int[1] ;
      P02VT30_n252CliCod = new boolean[] {false} ;
      P02VT30_A396EmprCod = new String[] {""} ;
      P02VT30_A129BarCod = new int[1] ;
      P02VT30_n129BarCod = new boolean[] {false} ;
      P02VT30_A132BarCodReo = new byte[1] ;
      P02VT30_n132BarCodReo = new boolean[] {false} ;
      P02VT30_A130BarCodPar = new String[] {""} ;
      P02VT30_n130BarCodPar = new boolean[] {false} ;
      P02VT30_A457FasCod = new String[] {""} ;
      P02VT30_A456FasActTin = new String[] {""} ;
      P02VT30_n456FasActTin = new boolean[] {false} ;
      P02VT30_A298CliRef = new String[] {""} ;
      P02VT30_A4343FasEstamp = new String[] {""} ;
      P02VT30_n4343FasEstamp = new boolean[] {false} ;
      P02VT30_A2748CliAlias = new String[] {""} ;
      P02VT30_A758ProCod = new String[] {""} ;
      P02VT30_A194BarOrdLin = new short[1] ;
      A456FasActTin = "" ;
      A298CliRef = "" ;
      A4343FasEstamp = "" ;
      A2748CliAlias = "" ;
      P02VT31_A396EmprCod = new String[] {""} ;
      P02VT31_A129BarCod = new int[1] ;
      P02VT31_n129BarCod = new boolean[] {false} ;
      P02VT31_A132BarCodReo = new byte[1] ;
      P02VT31_n132BarCodReo = new boolean[] {false} ;
      P02VT31_A130BarCodPar = new String[] {""} ;
      P02VT31_n130BarCodPar = new boolean[] {false} ;
      P02VT31_A44AlbRecCod = new int[1] ;
      P02VT31_A200BarPieCod = new String[] {""} ;
      P02VT32_A396EmprCod = new String[] {""} ;
      P02VT32_A44AlbRecCod = new int[1] ;
      P02VT32_A2159AlbRecPie = new String[] {""} ;
      P02VT32_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT32_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      c170BarKilLan = DecimalUtil.ZERO ;
      c183BarMetLan = DecimalUtil.ZERO ;
      P02VT33_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT33_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT34_A396EmprCod = new String[] {""} ;
      P02VT34_A129BarCod = new int[1] ;
      P02VT34_n129BarCod = new boolean[] {false} ;
      P02VT34_A132BarCodReo = new byte[1] ;
      P02VT34_n132BarCodReo = new boolean[] {false} ;
      P02VT34_A130BarCodPar = new String[] {""} ;
      P02VT34_n130BarCodPar = new boolean[] {false} ;
      P02VT34_A44AlbRecCod = new int[1] ;
      P02VT34_A200BarPieCod = new String[] {""} ;
      P02VT35_A396EmprCod = new String[] {""} ;
      P02VT35_A44AlbRecCod = new int[1] ;
      P02VT35_A2159AlbRecPie = new String[] {""} ;
      P02VT35_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT35_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT36_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT36_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT37_A396EmprCod = new String[] {""} ;
      P02VT37_A129BarCod = new int[1] ;
      P02VT37_n129BarCod = new boolean[] {false} ;
      P02VT37_A132BarCodReo = new byte[1] ;
      P02VT37_n132BarCodReo = new boolean[] {false} ;
      P02VT37_A130BarCodPar = new String[] {""} ;
      P02VT37_n130BarCodPar = new boolean[] {false} ;
      P02VT37_A44AlbRecCod = new int[1] ;
      P02VT37_A200BarPieCod = new String[] {""} ;
      P02VT38_A396EmprCod = new String[] {""} ;
      P02VT38_A44AlbRecCod = new int[1] ;
      P02VT38_A2159AlbRecPie = new String[] {""} ;
      P02VT38_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT38_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT39_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT39_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT40_A396EmprCod = new String[] {""} ;
      P02VT40_A457FasCod = new String[] {""} ;
      P02VT40_A361DisCod = new int[1] ;
      P02VT40_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VT40_n7742DisFasDto = new boolean[] {false} ;
      P02VT40_A758ProCod = new String[] {""} ;
      P02VT40_A368DisFasLin = new short[1] ;
      P02VT41_A396EmprCod = new String[] {""} ;
      P02VT41_A7145OSSCod = new int[1] ;
      P02VT41_A130BarCodPar = new String[] {""} ;
      P02VT41_n130BarCodPar = new boolean[] {false} ;
      P02VT41_A132BarCodReo = new byte[1] ;
      P02VT41_n132BarCodReo = new boolean[] {false} ;
      P02VT41_A129BarCod = new int[1] ;
      P02VT41_n129BarCod = new boolean[] {false} ;
      P02VT41_A7150OSSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      P02VT41_n7150OSSFchRea = new boolean[] {false} ;
      A7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      P02VT42_AV60DibMolCil = new short[1] ;
      P02VT43_A396EmprCod = new String[] {""} ;
      P02VT43_A7049OGSCod = new int[1] ;
      P02VT43_A130BarCodPar = new String[] {""} ;
      P02VT43_n130BarCodPar = new boolean[] {false} ;
      P02VT43_A132BarCodReo = new byte[1] ;
      P02VT43_n132BarCodReo = new boolean[] {false} ;
      P02VT43_A129BarCod = new int[1] ;
      P02VT43_n129BarCod = new boolean[] {false} ;
      P02VT44_AV60DibMolCil = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbartpre__default(),
         new Object[] {
             new Object[] {
            P02VT2_A396EmprCod, P02VT2_A30AlbProCod
            }
            , new Object[] {
            P02VT3_A396EmprCod, P02VT3_A30AlbProCod, P02VT3_A1261BarAlbKgmE, P02VT3_A1263BarAlbMtrE, P02VT3_A1265BarAlbPie, P02VT3_A130BarCodPar, P02VT3_A132BarCodReo, P02VT3_A129BarCod, P02VT3_A361DisCod, P02VT3_A6816BarPreFMt,
            P02VT3_n6816BarPreFMt, P02VT3_A2441AlbHdrObs, P02VT3_A228BarUniMed, P02VT3_A3139AlbTipCon, P02VT3_n3139AlbTipCon
            }
            , new Object[] {
            P02VT4_A396EmprCod, P02VT4_A361DisCod, P02VT4_A1032FonCod, P02VT4_A1056DisComCod, P02VT4_A2524DisComLin
            }
            , new Object[] {
            P02VT5_A396EmprCod, P02VT5_A129BarCod, P02VT5_A132BarCodReo, P02VT5_A130BarCodPar, P02VT5_A1540BarComMLan, P02VT5_n1540BarComMLan, P02VT5_A1544BarComPLan, P02VT5_n1544BarComPLan, P02VT5_A1032FonCod, P02VT5_A1056DisComCod,
            P02VT5_A2524DisComLin, P02VT5_A1539BarComAnh, P02VT5_n1539BarComAnh
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT7_A396EmprCod, P02VT7_A1271BarPieLzd, P02VT7_A170BarKilLan, P02VT7_A183BarMetLan, P02VT7_A200BarPieCod, P02VT7_A130BarCodPar, P02VT7_A132BarCodReo, P02VT7_A129BarCod, P02VT7_A6489BarPieIdPz, P02VT7_n6489BarPieIdPz,
            P02VT7_A9795BarPieK1, P02VT7_n9795BarPieK1, P02VT7_A9796BarPieK2, P02VT7_n9796BarPieK2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT10_A396EmprCod, P02VT10_A129BarCod, P02VT10_A132BarCodReo, P02VT10_A130BarCodPar, P02VT10_A200BarPieCod, P02VT10_A30AlbProCod, P02VT10_A2524DisComLin, P02VT10_A1056DisComCod, P02VT10_A1032FonCod
            }
            , new Object[] {
            P02VT11_A27AlbPKilEnt, P02VT11_A1270AlbPMtrEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT16_A396EmprCod, P02VT16_A30AlbProCod, P02VT16_A129BarCod, P02VT16_A132BarCodReo, P02VT16_A130BarCodPar, P02VT16_A1263BarAlbMtrE, P02VT16_A1261BarAlbKgmE, P02VT16_A1265BarAlbPie
            }
            , new Object[] {
            P02VT18_A396EmprCod, P02VT18_A30AlbProCod, P02VT18_A37AlbProMet, P02VT18_A35AlbProKgs, P02VT18_A38AlbProPie
            }
            , new Object[] {
            P02VT19_A396EmprCod, P02VT19_A30AlbProCod, P02VT19_A129BarCod, P02VT19_A132BarCodReo, P02VT19_A130BarCodPar, P02VT19_A1248GuiFasULin
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT21_A396EmprCod, P02VT21_A129BarCod, P02VT21_A132BarCodReo, P02VT21_A130BarCodPar, P02VT21_A457FasCod, P02VT21_A603MaqCodBis, P02VT21_A194BarOrdLin, P02VT21_A758ProCod
            }
            , new Object[] {
            P02VT22_A396EmprCod, P02VT22_A602MaqCod, P02VT22_A5100MaqCCoCod, P02VT22_n5100MaqCCoCod
            }
            , new Object[] {
            P02VT23_A396EmprCod, P02VT23_A129BarCod, P02VT23_A132BarCodReo, P02VT23_A130BarCodPar, P02VT23_A361DisCod, P02VT23_A252CliCod, P02VT23_n252CliCod, P02VT23_A1798BarDibCli, P02VT23_A1799BarDibInt, P02VT23_A3783BarRecLis,
            P02VT23_A257CliCue, P02VT23_A212BarSer
            }
            , new Object[] {
            P02VT24_A396EmprCod, P02VT24_A361DisCod, P02VT24_A7742DisFasDto, P02VT24_n7742DisFasDto, P02VT24_A7740DisFasPre, P02VT24_n7740DisFasPre, P02VT24_A7743DisFasRec, P02VT24_n7743DisFasRec, P02VT24_A7741DisFasUni, P02VT24_n7741DisFasUni,
            P02VT24_A457FasCod, P02VT24_A7744FasPreObl, P02VT24_n7744FasPreObl, P02VT24_A758ProCod, P02VT24_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT26_A758ProCod, P02VT26_A368DisFasLin, P02VT26_A396EmprCod, P02VT26_A361DisCod, P02VT26_A7737ArtAdiUni, P02VT26_n7737ArtAdiUni, P02VT26_A7736ArtAdiPre, P02VT26_n7736ArtAdiPre, P02VT26_A7727ArtAdiCod, P02VT26_A457FasCod,
            P02VT26_A7740DisFasPre, P02VT26_n7740DisFasPre, P02VT26_A7728ArtAdiDsc, P02VT26_n7728ArtAdiDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT28_A396EmprCod, P02VT28_A129BarCod, P02VT28_A132BarCodReo, P02VT28_A130BarCodPar, P02VT28_A457FasCod, P02VT28_A7744FasPreObl, P02VT28_n7744FasPreObl, P02VT28_A758ProCod, P02VT28_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02VT30_A252CliCod, P02VT30_n252CliCod, P02VT30_A396EmprCod, P02VT30_A129BarCod, P02VT30_A132BarCodReo, P02VT30_A130BarCodPar, P02VT30_A457FasCod, P02VT30_A456FasActTin, P02VT30_n456FasActTin, P02VT30_A298CliRef,
            P02VT30_A4343FasEstamp, P02VT30_n4343FasEstamp, P02VT30_A2748CliAlias, P02VT30_A758ProCod, P02VT30_A194BarOrdLin
            }
            , new Object[] {
            P02VT31_A396EmprCod, P02VT31_A129BarCod, P02VT31_A132BarCodReo, P02VT31_A130BarCodPar, P02VT31_A44AlbRecCod, P02VT31_A200BarPieCod
            }
            , new Object[] {
            P02VT32_A396EmprCod, P02VT32_A44AlbRecCod, P02VT32_A2159AlbRecPie, P02VT32_A2155AlbRecKgm, P02VT32_A2157AlbRecMtr
            }
            , new Object[] {
            P02VT33_A170BarKilLan, P02VT33_A183BarMetLan
            }
            , new Object[] {
            P02VT34_A396EmprCod, P02VT34_A129BarCod, P02VT34_A132BarCodReo, P02VT34_A130BarCodPar, P02VT34_A44AlbRecCod, P02VT34_A200BarPieCod
            }
            , new Object[] {
            P02VT35_A396EmprCod, P02VT35_A44AlbRecCod, P02VT35_A2159AlbRecPie, P02VT35_A2155AlbRecKgm, P02VT35_A2157AlbRecMtr
            }
            , new Object[] {
            P02VT36_A170BarKilLan, P02VT36_A183BarMetLan
            }
            , new Object[] {
            P02VT37_A396EmprCod, P02VT37_A129BarCod, P02VT37_A132BarCodReo, P02VT37_A130BarCodPar, P02VT37_A44AlbRecCod, P02VT37_A200BarPieCod
            }
            , new Object[] {
            P02VT38_A396EmprCod, P02VT38_A44AlbRecCod, P02VT38_A2159AlbRecPie, P02VT38_A2155AlbRecKgm, P02VT38_A2157AlbRecMtr
            }
            , new Object[] {
            P02VT39_A170BarKilLan, P02VT39_A183BarMetLan
            }
            , new Object[] {
            P02VT40_A396EmprCod, P02VT40_A457FasCod, P02VT40_A361DisCod, P02VT40_A7742DisFasDto, P02VT40_n7742DisFasDto, P02VT40_A758ProCod, P02VT40_A368DisFasLin
            }
            , new Object[] {
            P02VT41_A396EmprCod, P02VT41_A7145OSSCod, P02VT41_A130BarCodPar, P02VT41_n130BarCodPar, P02VT41_A132BarCodReo, P02VT41_n132BarCodReo, P02VT41_A129BarCod, P02VT41_n129BarCod, P02VT41_A7150OSSFchRea, P02VT41_n7150OSSFchRea
            }
            , new Object[] {
            P02VT42_AV60DibMolCil
            }
            , new Object[] {
            P02VT43_A396EmprCod, P02VT43_A7049OGSCod, P02VT43_A130BarCodPar, P02VT43_n130BarCodPar, P02VT43_A132BarCodReo, P02VT43_n132BarCodReo, P02VT43_A129BarCod, P02VT43_n129BarCod
            }
            , new Object[] {
            P02VT44_AV60DibMolCil
            }
         }
      );
      AV87Pgmname = "PAlbArtPre" ;
      /* GeneXus formulas. */
      AV87Pgmname = "PAlbArtPre" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV79SiK1K2 ;
   private byte AV80CtrlPesada ;
   private byte GXt_int4 ;
   private byte AV88GXLvl45 ;
   private byte A2524DisComLin ;
   private byte GXv_int5[] ;
   private byte AV64Discomlin ;
   private byte AV38BarCodReo ;
   private byte A3783BarRecLis ;
   private byte AV99GXLvl217 ;
   private byte W132BarCodReo ;
   private byte AV74r ;
   private byte AV81BarRecLis ;
   private byte AV57OkMza ;
   private byte AV100GXLvl240 ;
   private byte A7744FasPreObl ;
   private byte AV82MtsKgsCrudo ;
   private byte AV113GXLvl615 ;
   private short AV42AlbProPie ;
   private short AV53AlbTipCon ;
   private short A3139AlbTipCon ;
   private short A1544BarComPLan ;
   private short A1539BarComAnh ;
   private short A1534AlbEComP ;
   private short A4334AlbEComUPz ;
   private short A4430DisComUtr ;
   private short Gx_err ;
   private short O1544BarComPLan ;
   private short O1534AlbEComP ;
   private short AV47AlbEComp ;
   private short AV49BarComPLan ;
   private short A38AlbProPie ;
   private short A1248GuiFasULin ;
   private short AV22GuiFasLin ;
   private short A194BarOrdLin ;
   private short A5100MaqCCoCod ;
   private short AV35MaqCCoCod ;
   private short A368DisFasLin ;
   private short A1240GuiFasLin ;
   private short AV60DibMolCil ;
   private short A7753GuiFasCCo ;
   private short A7727ArtAdiCod ;
   private short W7727ArtAdiCod ;
   private short cV60DibMolCil ;
   private int A129BarCod ;
   private int AV45BarAlbPie ;
   private int A1265BarAlbPie ;
   private int A361DisCod ;
   private int GXv_int6[] ;
   private int GX_INS533 ;
   private int A1271BarPieLzd ;
   private int GX_INS1002 ;
   private int GX_INS197 ;
   private int O1265BarAlbPie ;
   private int O1271BarPieLzd ;
   private int AV50BarPieLzd ;
   private int AV37BarCod ;
   private int AV55DisCod ;
   private int A252CliCod ;
   private int A1799BarDibInt ;
   private int W129BarCod ;
   private int AV61CliCod ;
   private int AV63DibInt ;
   private int AV73Hdr ;
   private int GX_INS194 ;
   private int A44AlbRecCod ;
   private int A7145OSSCod ;
   private int A7049OGSCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV40AlbProMet ;
   private java.math.BigDecimal AV41AlbProKgs ;
   private java.math.BigDecimal AV43BarAlbMtrE ;
   private java.math.BigDecimal AV44BarAlbKgmE ;
   private java.math.BigDecimal AV28Artextil ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A6816BarPreFMt ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal AV77BarPieK1 ;
   private java.math.BigDecimal AV78BarPieK2 ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A7080AEPKil ;
   private java.math.BigDecimal A7081AEPMet ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal O1261BarAlbKgmE ;
   private java.math.BigDecimal O1263BarAlbMtrE ;
   private java.math.BigDecimal O1540BarComMLan ;
   private java.math.BigDecimal O1533AlbEComM ;
   private java.math.BigDecimal AV46AlbEComm ;
   private java.math.BigDecimal AV48BarComMLan ;
   private java.math.BigDecimal AV51AlbPKilEnt ;
   private java.math.BigDecimal AV52AlbPMtrEnt ;
   private java.math.BigDecimal A37AlbProMet ;
   private java.math.BigDecimal A35AlbProKgs ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7743DisFasRec ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV23Kilos ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal AV31Metros ;
   private java.math.BigDecimal AV32Dto ;
   private java.math.BigDecimal AV33cDto ;
   private java.math.BigDecimal AV34Rec ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A7750GuiFasPre ;
   private java.math.BigDecimal A8196GuiFasPB ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A7736ArtAdiPre ;
   private java.math.BigDecimal AV54OkDispo ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal c170BarKilLan ;
   private java.math.BigDecimal c183BarMetLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV56AlbHdrObs ;
   private String AV70Station ;
   private String GXv_char1[] ;
   private String AV71EmprNom ;
   private String AV72UsurCod ;
   private String scmdbuf ;
   private String A2441AlbHdrObs ;
   private String A228BarUniMed ;
   private String AV87Pgmname ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A2506AlbEstObs ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private String AV68BarPieIdpz ;
   private String A200BarPieCod ;
   private String A6489BarPieIdPz ;
   private String AV39BarCodPar ;
   private String AV76BarUnimed ;
   private String AV29FasCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV30MaqCod ;
   private String A602MaqCod ;
   private String A1798BarDibCli ;
   private String A257CliCue ;
   private String A7728ArtAdiDsc ;
   private String A212BarSer ;
   private String W130BarCodPar ;
   private String AV62DibCli ;
   private String AV75p ;
   private String AV26CliCue ;
   private String A7741DisFasUni ;
   private String A7392FasFacMaqC ;
   private String A4390FasPreDsK ;
   private String A4391FasPreDsM ;
   private String A7737ArtAdiUni ;
   private String A456FasActTin ;
   private String A298CliRef ;
   private String A4343FasEstamp ;
   private String A2748CliAlias ;
   private String A2159AlbRecPie ;
   private java.util.Date A7150OSSFchRea ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n6816BarPreFMt ;
   private boolean n3139AlbTipCon ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private boolean n1539BarComAnh ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private boolean n1536AlbEComPre ;
   private boolean n2506AlbEstObs ;
   private boolean n4334AlbEComUPz ;
   private boolean n4430DisComUtr ;
   private boolean brk2VT7 ;
   private boolean n6489BarPieIdPz ;
   private boolean n9795BarPieK1 ;
   private boolean n9796BarPieK2 ;
   private boolean n7080AEPKil ;
   private boolean n7081AEPMet ;
   private boolean returnInSub ;
   private boolean n5100MaqCCoCod ;
   private boolean n252CliCod ;
   private boolean n7742DisFasDto ;
   private boolean n7740DisFasPre ;
   private boolean n7743DisFasRec ;
   private boolean n7741DisFasUni ;
   private boolean n7744FasPreObl ;
   private boolean n7392FasFacMaqC ;
   private boolean n8194GuiFasPBK ;
   private boolean n8195GuiFasPBM ;
   private boolean n7750GuiFasPre ;
   private boolean n8196GuiFasPB ;
   private boolean n4390FasPreDsK ;
   private boolean n4391FasPreDsM ;
   private boolean n7751GuiFasDto ;
   private boolean n7752GuiFasRec ;
   private boolean n7753GuiFasCCo ;
   private boolean n7737ArtAdiUni ;
   private boolean n7736ArtAdiPre ;
   private boolean n7727ArtAdiCod ;
   private boolean n7728ArtAdiDsc ;
   private boolean n456FasActTin ;
   private boolean n4343FasEstamp ;
   private boolean n7150OSSFchRea ;
   private String AV69Inc_obs ;
   private String[] aP12 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private short[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VT2_A396EmprCod ;
   private long[] P02VT2_A30AlbProCod ;
   private String[] P02VT3_A396EmprCod ;
   private long[] P02VT3_A30AlbProCod ;
   private java.math.BigDecimal[] P02VT3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P02VT3_A1263BarAlbMtrE ;
   private int[] P02VT3_A1265BarAlbPie ;
   private String[] P02VT3_A130BarCodPar ;
   private boolean[] P02VT3_n130BarCodPar ;
   private byte[] P02VT3_A132BarCodReo ;
   private boolean[] P02VT3_n132BarCodReo ;
   private int[] P02VT3_A129BarCod ;
   private boolean[] P02VT3_n129BarCod ;
   private int[] P02VT3_A361DisCod ;
   private java.math.BigDecimal[] P02VT3_A6816BarPreFMt ;
   private boolean[] P02VT3_n6816BarPreFMt ;
   private String[] P02VT3_A2441AlbHdrObs ;
   private String[] P02VT3_A228BarUniMed ;
   private short[] P02VT3_A3139AlbTipCon ;
   private boolean[] P02VT3_n3139AlbTipCon ;
   private String[] P02VT4_A396EmprCod ;
   private int[] P02VT4_A361DisCod ;
   private String[] P02VT4_A1032FonCod ;
   private String[] P02VT4_A1056DisComCod ;
   private byte[] P02VT4_A2524DisComLin ;
   private String[] P02VT5_A396EmprCod ;
   private int[] P02VT5_A129BarCod ;
   private boolean[] P02VT5_n129BarCod ;
   private byte[] P02VT5_A132BarCodReo ;
   private boolean[] P02VT5_n132BarCodReo ;
   private String[] P02VT5_A130BarCodPar ;
   private boolean[] P02VT5_n130BarCodPar ;
   private java.math.BigDecimal[] P02VT5_A1540BarComMLan ;
   private boolean[] P02VT5_n1540BarComMLan ;
   private short[] P02VT5_A1544BarComPLan ;
   private boolean[] P02VT5_n1544BarComPLan ;
   private String[] P02VT5_A1032FonCod ;
   private String[] P02VT5_A1056DisComCod ;
   private byte[] P02VT5_A2524DisComLin ;
   private short[] P02VT5_A1539BarComAnh ;
   private boolean[] P02VT5_n1539BarComAnh ;
   private String[] P02VT7_A396EmprCod ;
   private int[] P02VT7_A1271BarPieLzd ;
   private java.math.BigDecimal[] P02VT7_A170BarKilLan ;
   private java.math.BigDecimal[] P02VT7_A183BarMetLan ;
   private String[] P02VT7_A200BarPieCod ;
   private String[] P02VT7_A130BarCodPar ;
   private boolean[] P02VT7_n130BarCodPar ;
   private byte[] P02VT7_A132BarCodReo ;
   private boolean[] P02VT7_n132BarCodReo ;
   private int[] P02VT7_A129BarCod ;
   private boolean[] P02VT7_n129BarCod ;
   private String[] P02VT7_A6489BarPieIdPz ;
   private boolean[] P02VT7_n6489BarPieIdPz ;
   private java.math.BigDecimal[] P02VT7_A9795BarPieK1 ;
   private boolean[] P02VT7_n9795BarPieK1 ;
   private java.math.BigDecimal[] P02VT7_A9796BarPieK2 ;
   private boolean[] P02VT7_n9796BarPieK2 ;
   private String[] P02VT10_A396EmprCod ;
   private int[] P02VT10_A129BarCod ;
   private boolean[] P02VT10_n129BarCod ;
   private byte[] P02VT10_A132BarCodReo ;
   private boolean[] P02VT10_n132BarCodReo ;
   private String[] P02VT10_A130BarCodPar ;
   private boolean[] P02VT10_n130BarCodPar ;
   private String[] P02VT10_A200BarPieCod ;
   private long[] P02VT10_A30AlbProCod ;
   private byte[] P02VT10_A2524DisComLin ;
   private String[] P02VT10_A1056DisComCod ;
   private String[] P02VT10_A1032FonCod ;
   private java.math.BigDecimal[] P02VT11_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P02VT11_A1270AlbPMtrEnt ;
   private String[] P02VT16_A396EmprCod ;
   private long[] P02VT16_A30AlbProCod ;
   private int[] P02VT16_A129BarCod ;
   private boolean[] P02VT16_n129BarCod ;
   private byte[] P02VT16_A132BarCodReo ;
   private boolean[] P02VT16_n132BarCodReo ;
   private String[] P02VT16_A130BarCodPar ;
   private boolean[] P02VT16_n130BarCodPar ;
   private java.math.BigDecimal[] P02VT16_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P02VT16_A1261BarAlbKgmE ;
   private int[] P02VT16_A1265BarAlbPie ;
   private String[] P02VT18_A396EmprCod ;
   private long[] P02VT18_A30AlbProCod ;
   private java.math.BigDecimal[] P02VT18_A37AlbProMet ;
   private java.math.BigDecimal[] P02VT18_A35AlbProKgs ;
   private short[] P02VT18_A38AlbProPie ;
   private String[] P02VT19_A396EmprCod ;
   private long[] P02VT19_A30AlbProCod ;
   private int[] P02VT19_A129BarCod ;
   private boolean[] P02VT19_n129BarCod ;
   private byte[] P02VT19_A132BarCodReo ;
   private boolean[] P02VT19_n132BarCodReo ;
   private String[] P02VT19_A130BarCodPar ;
   private boolean[] P02VT19_n130BarCodPar ;
   private short[] P02VT19_A1248GuiFasULin ;
   private String[] P02VT21_A396EmprCod ;
   private int[] P02VT21_A129BarCod ;
   private boolean[] P02VT21_n129BarCod ;
   private byte[] P02VT21_A132BarCodReo ;
   private boolean[] P02VT21_n132BarCodReo ;
   private String[] P02VT21_A130BarCodPar ;
   private boolean[] P02VT21_n130BarCodPar ;
   private String[] P02VT21_A457FasCod ;
   private String[] P02VT21_A603MaqCodBis ;
   private short[] P02VT21_A194BarOrdLin ;
   private String[] P02VT21_A758ProCod ;
   private String[] P02VT22_A396EmprCod ;
   private String[] P02VT22_A602MaqCod ;
   private short[] P02VT22_A5100MaqCCoCod ;
   private boolean[] P02VT22_n5100MaqCCoCod ;
   private String[] P02VT23_A396EmprCod ;
   private int[] P02VT23_A129BarCod ;
   private boolean[] P02VT23_n129BarCod ;
   private byte[] P02VT23_A132BarCodReo ;
   private boolean[] P02VT23_n132BarCodReo ;
   private String[] P02VT23_A130BarCodPar ;
   private boolean[] P02VT23_n130BarCodPar ;
   private int[] P02VT23_A361DisCod ;
   private int[] P02VT23_A252CliCod ;
   private boolean[] P02VT23_n252CliCod ;
   private String[] P02VT23_A1798BarDibCli ;
   private int[] P02VT23_A1799BarDibInt ;
   private byte[] P02VT23_A3783BarRecLis ;
   private String[] P02VT23_A257CliCue ;
   private String[] P02VT23_A212BarSer ;
   private String[] P02VT24_A396EmprCod ;
   private int[] P02VT24_A361DisCod ;
   private java.math.BigDecimal[] P02VT24_A7742DisFasDto ;
   private boolean[] P02VT24_n7742DisFasDto ;
   private java.math.BigDecimal[] P02VT24_A7740DisFasPre ;
   private boolean[] P02VT24_n7740DisFasPre ;
   private java.math.BigDecimal[] P02VT24_A7743DisFasRec ;
   private boolean[] P02VT24_n7743DisFasRec ;
   private String[] P02VT24_A7741DisFasUni ;
   private boolean[] P02VT24_n7741DisFasUni ;
   private String[] P02VT24_A457FasCod ;
   private byte[] P02VT24_A7744FasPreObl ;
   private boolean[] P02VT24_n7744FasPreObl ;
   private String[] P02VT24_A758ProCod ;
   private short[] P02VT24_A368DisFasLin ;
   private String[] P02VT26_A758ProCod ;
   private short[] P02VT26_A368DisFasLin ;
   private String[] P02VT26_A396EmprCod ;
   private int[] P02VT26_A361DisCod ;
   private String[] P02VT26_A7737ArtAdiUni ;
   private boolean[] P02VT26_n7737ArtAdiUni ;
   private java.math.BigDecimal[] P02VT26_A7736ArtAdiPre ;
   private boolean[] P02VT26_n7736ArtAdiPre ;
   private short[] P02VT26_A7727ArtAdiCod ;
   private boolean[] P02VT26_n7727ArtAdiCod ;
   private String[] P02VT26_A457FasCod ;
   private java.math.BigDecimal[] P02VT26_A7740DisFasPre ;
   private boolean[] P02VT26_n7740DisFasPre ;
   private String[] P02VT26_A7728ArtAdiDsc ;
   private boolean[] P02VT26_n7728ArtAdiDsc ;
   private String[] P02VT28_A396EmprCod ;
   private int[] P02VT28_A129BarCod ;
   private boolean[] P02VT28_n129BarCod ;
   private byte[] P02VT28_A132BarCodReo ;
   private boolean[] P02VT28_n132BarCodReo ;
   private String[] P02VT28_A130BarCodPar ;
   private boolean[] P02VT28_n130BarCodPar ;
   private String[] P02VT28_A457FasCod ;
   private byte[] P02VT28_A7744FasPreObl ;
   private boolean[] P02VT28_n7744FasPreObl ;
   private String[] P02VT28_A758ProCod ;
   private short[] P02VT28_A194BarOrdLin ;
   private int[] P02VT30_A252CliCod ;
   private boolean[] P02VT30_n252CliCod ;
   private String[] P02VT30_A396EmprCod ;
   private int[] P02VT30_A129BarCod ;
   private boolean[] P02VT30_n129BarCod ;
   private byte[] P02VT30_A132BarCodReo ;
   private boolean[] P02VT30_n132BarCodReo ;
   private String[] P02VT30_A130BarCodPar ;
   private boolean[] P02VT30_n130BarCodPar ;
   private String[] P02VT30_A457FasCod ;
   private String[] P02VT30_A456FasActTin ;
   private boolean[] P02VT30_n456FasActTin ;
   private String[] P02VT30_A298CliRef ;
   private String[] P02VT30_A4343FasEstamp ;
   private boolean[] P02VT30_n4343FasEstamp ;
   private String[] P02VT30_A2748CliAlias ;
   private String[] P02VT30_A758ProCod ;
   private short[] P02VT30_A194BarOrdLin ;
   private String[] P02VT31_A396EmprCod ;
   private int[] P02VT31_A129BarCod ;
   private boolean[] P02VT31_n129BarCod ;
   private byte[] P02VT31_A132BarCodReo ;
   private boolean[] P02VT31_n132BarCodReo ;
   private String[] P02VT31_A130BarCodPar ;
   private boolean[] P02VT31_n130BarCodPar ;
   private int[] P02VT31_A44AlbRecCod ;
   private String[] P02VT31_A200BarPieCod ;
   private String[] P02VT32_A396EmprCod ;
   private int[] P02VT32_A44AlbRecCod ;
   private String[] P02VT32_A2159AlbRecPie ;
   private java.math.BigDecimal[] P02VT32_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P02VT32_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P02VT33_A170BarKilLan ;
   private java.math.BigDecimal[] P02VT33_A183BarMetLan ;
   private String[] P02VT34_A396EmprCod ;
   private int[] P02VT34_A129BarCod ;
   private boolean[] P02VT34_n129BarCod ;
   private byte[] P02VT34_A132BarCodReo ;
   private boolean[] P02VT34_n132BarCodReo ;
   private String[] P02VT34_A130BarCodPar ;
   private boolean[] P02VT34_n130BarCodPar ;
   private int[] P02VT34_A44AlbRecCod ;
   private String[] P02VT34_A200BarPieCod ;
   private String[] P02VT35_A396EmprCod ;
   private int[] P02VT35_A44AlbRecCod ;
   private String[] P02VT35_A2159AlbRecPie ;
   private java.math.BigDecimal[] P02VT35_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P02VT35_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P02VT36_A170BarKilLan ;
   private java.math.BigDecimal[] P02VT36_A183BarMetLan ;
   private String[] P02VT37_A396EmprCod ;
   private int[] P02VT37_A129BarCod ;
   private boolean[] P02VT37_n129BarCod ;
   private byte[] P02VT37_A132BarCodReo ;
   private boolean[] P02VT37_n132BarCodReo ;
   private String[] P02VT37_A130BarCodPar ;
   private boolean[] P02VT37_n130BarCodPar ;
   private int[] P02VT37_A44AlbRecCod ;
   private String[] P02VT37_A200BarPieCod ;
   private String[] P02VT38_A396EmprCod ;
   private int[] P02VT38_A44AlbRecCod ;
   private String[] P02VT38_A2159AlbRecPie ;
   private java.math.BigDecimal[] P02VT38_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P02VT38_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P02VT39_A170BarKilLan ;
   private java.math.BigDecimal[] P02VT39_A183BarMetLan ;
   private String[] P02VT40_A396EmprCod ;
   private String[] P02VT40_A457FasCod ;
   private int[] P02VT40_A361DisCod ;
   private java.math.BigDecimal[] P02VT40_A7742DisFasDto ;
   private boolean[] P02VT40_n7742DisFasDto ;
   private String[] P02VT40_A758ProCod ;
   private short[] P02VT40_A368DisFasLin ;
   private String[] P02VT41_A396EmprCod ;
   private int[] P02VT41_A7145OSSCod ;
   private String[] P02VT41_A130BarCodPar ;
   private boolean[] P02VT41_n130BarCodPar ;
   private byte[] P02VT41_A132BarCodReo ;
   private boolean[] P02VT41_n132BarCodReo ;
   private int[] P02VT41_A129BarCod ;
   private boolean[] P02VT41_n129BarCod ;
   private java.util.Date[] P02VT41_A7150OSSFchRea ;
   private boolean[] P02VT41_n7150OSSFchRea ;
   private short[] P02VT42_AV60DibMolCil ;
   private String[] P02VT43_A396EmprCod ;
   private int[] P02VT43_A7049OGSCod ;
   private String[] P02VT43_A130BarCodPar ;
   private boolean[] P02VT43_n130BarCodPar ;
   private byte[] P02VT43_A132BarCodReo ;
   private boolean[] P02VT43_n132BarCodReo ;
   private int[] P02VT43_A129BarCod ;
   private boolean[] P02VT43_n129BarCod ;
   private short[] P02VT44_AV60DibMolCil ;
}

final  class palbartpre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VT2", "SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT3", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T1.BarPreFMt, T1.AlbHdrObs, T2.BarUniMed, T1.AlbTipCon FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT4", "SELECT EmprCod, DisCod, FonCod, DisComCod, DisComLin FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarComMLan, BarComPLan, FonCod, DisComCod, DisComLin, BarComAnh FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VT6", "INSERT INTO TXPALBEST(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, AlbEstObs, AlbEComUPz, DisComUtr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new ForEachCursor("P02VT7", "SELECT EmprCod, BarPieLzd, BarKilLan, BarMetLan, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieIdPz, BarPieK1, BarPieK2 FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VT8", "INSERT INTO TXPALBTEP(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod, AEPKil, AEPMet) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTEP")
         ,new UpdateCursor("P02VT9", "INSERT INTO TXPLALPRD(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt, AlbPieDsc, AlbPreAnc, AlbPKilNet, AlbPMtrNet, AlbPreAncc, AlbPrePgd, AlbTarAlb, AlbPTrnCod, AlbPTrnFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P02VT10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod, DisComLin, DisComCod, FonCod FROM TXPALBTEP WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT11", "SELECT AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VT12", "UPDATE TXPLALPRD SET AlbPKilEnt=?, AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P02VT13", "UPDATE TXPBARPIE SET BarPieLzd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P02VT14", "UPDATE TXPBARCOM SET BarComMLan=?, BarComPLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P02VT15", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?, AlbHdrObs=?, AlbTipCon=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02VT16", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbMtrE, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT18", "SELECT T1.EmprCod, T1.AlbProCod, COALESCE( T2.AlbProMet, 0) AS AlbProMet, COALESCE( T2.AlbProKgs, 0) AS AlbProKgs, COALESCE( T2.AlbProPie, 0) AS AlbProPie FROM (TXPCALPRD T1 LEFT JOIN (SELECT SUM(BarAlbMtrE) AS AlbProMet, EmprCod, AlbProCod, SUM(BarAlbKgmE) AS AlbProKgs, SUM(BarAlbPie) AS AlbProPie FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT19", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasULin FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02VT20", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02VT21", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, MaqCodBis, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT22", "SELECT EmprCod, MaqCod, MaqCCoCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT23", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.CliCod, T1.BarDibCli, T1.BarDibInt, T1.BarRecLis, T2.CliCue, T1.BarSer FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT24", "SELECT EmprCod, DisCod, DisFasDto, DisFasPre, DisFasRec, DisFasUni, FasCod, FasPreObl, ProCod, DisFasLin FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ?) AND (DisFasPre > 0 or FasPreObl > 0) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VT25", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasPreDsK, FasPreDsM, FasFacMaqC, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasCodF, F_TipPza, ArtAdiCod, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P02VT26", "SELECT T1.ProCod, T1.DisFasLin, T1.EmprCod, T1.DisCod, T1.ArtAdiUni, T1.ArtAdiPre, T1.ArtAdiCod, T3.FasCod, T3.DisFasPre, T2.ArtAdiDsc FROM ((TXPDisFPA T1 INNER JOIN TXPArtAdi T2 ON T2.EmprCod = T1.EmprCod AND T2.ArtAdiCod = T1.ArtAdiCod) INNER JOIN TXPDISFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod AND T3.ProCod = T1.ProCod AND T3.DisFasLin = T1.DisFasLin) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.ArtAdiPre > 0) ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VT27", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasPreDsK, FasPreDsM, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasCodF, F_TipPza, GuiFasDto, GuiFasRec, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P02VT28", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T2.FasPreObl, T1.ProCod, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasPreObl = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02VT29", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasPreDsK, FasPreDsM, FasFacMaqC, GuiFasPre, GuiFasCCo, FasCodF, F_TipPza, ArtAdiCod, GuiFasDto, GuiFasRec, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P02VT30", "SELECT T3.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T2.FasActTin, T4.CliRef, T2.FasEstamp, T4.CliAlias, T1.ProCod, T1.BarOrdLin FROM (((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.FasCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT31", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT32", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT33", "SELECT SUM(BarKilLan), SUM(BarMetLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT34", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT35", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT36", "SELECT SUM(BarKilLan), SUM(BarMetLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT37", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT38", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VT39", "SELECT SUM(BarKilLan), SUM(BarMetLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT40", "SELECT EmprCod, FasCod, DisCod, DisFasDto, ProCod, DisFasLin FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ?) AND (FasCod = ?) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT41", "SELECT EmprCod, OSSCod, BarCodPar, BarCodReo, BarCod, OSSFchRea FROM TXPShaSep WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT42", "SELECT COUNT(*) FROM TXPShaSe1 WHERE EmprCod = ? and OSSCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT43", "SELECT EmprCod, OGSCod, BarCodPar, BarCodReo, BarCod FROM TXPShaGra WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VT44", "SELECT COUNT(*) FROM TXPShaGr1 WHERE EmprCod = ? and OGSCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 60);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               ((String[]) buf[9])[0] = rslt.getString(8, 12);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((short[]) buf[14])[0] = rslt.getShort(10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 12);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 36 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 39 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 41 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 12);
               stmt.setString(8, (String)parms[10], 12);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 30);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[22]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 12);
               stmt.setString(8, (String)parms[10], 12);
               stmt.setString(9, (String)parms[11], 9);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setString(6, (String)parms[8], 9);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setString(6, (String)parms[8], 9);
               stmt.setString(7, (String)parms[9], 3);
               stmt.setLong(8, ((Number) parms[10]).longValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 1);
               }
               stmt.setString(12, (String)parms[17], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setString(6, (String)parms[8], 9);
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               stmt.setString(8, (String)parms[10], 9);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setString(6, (String)parms[8], 9);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
               stmt.setString(8, (String)parms[12], 12);
               stmt.setString(9, (String)parms[13], 12);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 60);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               stmt.setString(6, (String)parms[6], 3);
               stmt.setLong(7, ((Number) parms[7]).longValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 1);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setString(7, (String)parms[9], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[19], 6);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[33], 5);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setString(7, (String)parms[9], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[19], 6);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[31], 5);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setString(7, (String)parms[9], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[19], 6);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[23]).shortValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 8);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

