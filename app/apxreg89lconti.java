package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apxreg89lconti extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apxreg89lconti pgm = new apxreg89lconti (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apxreg89lconti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apxreg89lconti.class ), "" );
   }

   public apxreg89lconti( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV102termcod = context.getWorkstationId( remoteHandle) ;
      new app.pdbconn(remoteHandle, context).execute( ) ;
      GXv_char1[0] = AV103Emprcod ;
      GXv_char2[0] = AV104emprnom ;
      GXv_char3[0] = AV105Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV102termcod, GXv_char1, GXv_char2, GXv_char3) ;
      apxreg89lconti.this.AV103Emprcod = GXv_char1[0] ;
      apxreg89lconti.this.AV104emprnom = GXv_char2[0] ;
      apxreg89lconti.this.AV105Usurcod = GXv_char3[0] ;
      Gx_msg = httpContext.getMessage( "Inicio Reg89Lconti", "") ;
      System.out.println( Gx_msg );
      /* Using cursor P052W4 */
      pr_default.execute(0, new Object[] {AV103Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P052W4_A396EmprCod[0] ;
         A9777BarItem3 = P052W4_A9777BarItem3[0] ;
         A212BarSer = P052W4_A212BarSer[0] ;
         A1652BarSerDsc = P052W4_A1652BarSerDsc[0] ;
         A217BarTipArt = P052W4_A217BarTipArt[0] ;
         n217BarTipArt = P052W4_n217BarTipArt[0] ;
         A135BarColNom = P052W4_A135BarColNom[0] ;
         A136BarColNum = P052W4_A136BarColNum[0] ;
         A218BarTipCol = P052W4_A218BarTipCol[0] ;
         A180BarMaqCod = P052W4_A180BarMaqCod[0] ;
         A148BarEstReo = P052W4_A148BarEstReo[0] ;
         A138BarConReo = P052W4_A138BarConReo[0] ;
         A3595BarMacCod = P052W4_A3595BarMacCod[0] ;
         A189BarNumAny = P052W4_A189BarNumAny[0] ;
         A833TipDefCod = P052W4_A833TipDefCod[0] ;
         n833TipDefCod = P052W4_n833TipDefCod[0] ;
         A2830BarIntPer = P052W4_A2830BarIntPer[0] ;
         A209BarPri = P052W4_A209BarPri[0] ;
         A141BarCosPro = P052W4_A141BarCosPro[0] ;
         A140BarCosAny = P052W4_A140BarCosAny[0] ;
         A2449BarKgEnE = P052W4_A2449BarKgEnE[0] ;
         n2449BarKgEnE = P052W4_n2449BarKgEnE[0] ;
         A169BarKgsFac = P052W4_A169BarKgsFac[0] ;
         A4975BarNumReo = P052W4_A4975BarNumReo[0] ;
         A2010BarTipDis = P052W4_A2010BarTipDis[0] ;
         A5291BarTipCor = P052W4_A5291BarTipCor[0] ;
         A118BarAcaQui = P052W4_A118BarAcaQui[0] ;
         A3746BarNPed = P052W4_A3746BarNPed[0] ;
         A252CliCod = P052W4_A252CliCod[0] ;
         n252CliCod = P052W4_n252CliCod[0] ;
         A130BarCodPar = P052W4_A130BarCodPar[0] ;
         A132BarCodReo = P052W4_A132BarCodReo[0] ;
         A129BarCod = P052W4_A129BarCod[0] ;
         A9776barItem2 = P052W4_A9776barItem2[0] ;
         A3871BarFecCRe = P052W4_A3871BarFecCRe[0] ;
         A184BarMtr = P052W4_A184BarMtr[0] ;
         A166BarKgm = P052W4_A166BarKgm[0] ;
         A219BarTotAgr = P052W4_A219BarTotAgr[0] ;
         n219BarTotAgr = P052W4_n219BarTotAgr[0] ;
         A199BarPie1 = P052W4_A199BarPie1[0] ;
         A365DisDes = P052W4_A365DisDes[0] ;
         A898BarPieNDes = P052W4_A898BarPieNDes[0] ;
         A184BarMtr = P052W4_A184BarMtr[0] ;
         A166BarKgm = P052W4_A166BarKgm[0] ;
         A199BarPie1 = P052W4_A199BarPie1[0] ;
         A898BarPieNDes = P052W4_A898BarPieNDes[0] ;
         A219BarTotAgr = P052W4_A219BarTotAgr[0] ;
         n219BarTotAgr = P052W4_n219BarTotAgr[0] ;
         if ( GXutil.strcmp(A9776barItem2, httpContext.getMessage( "Parte 1", "")) == 0 )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            AV56Dia = (byte)(GXutil.day( A3871BarFecCRe)) ;
            AV57Mes = (byte)(GXutil.month( A3871BarFecCRe)) ;
            AV58Any = (short)(GXutil.year( A3871BarFecCRe)) ;
            AV99Barfasdti = GXutil.resetTime( GXutil.nullDate() );
            AV100Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
            /* Using cursor P052W5 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A150BarFacTin = P052W5_A150BarFacTin[0] ;
               A4442BarFasDTI = P052W5_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P052W5_n4442BarFasDTI[0] ;
               A4443BarFasDTF = P052W5_A4443BarFasDTF[0] ;
               n4443BarFasDTF = P052W5_n4443BarFasDTF[0] ;
               A194BarOrdLin = P052W5_A194BarOrdLin[0] ;
               A758ProCod = P052W5_A758ProCod[0] ;
               if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV99Barfasdti = A4442BarFasDTI ;
                  AV100Barfasdtf = A4443BarFasDTF ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Using cursor P052W6 */
            pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV58Any), Byte.valueOf(AV57Mes), Byte.valueOf(AV56Dia)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3648EstTinDia = P052W6_A3648EstTinDia[0] ;
               A3647EstTinMes = P052W6_A3647EstTinMes[0] ;
               A3646EstTinAny = P052W6_A3646EstTinAny[0] ;
               A3649EstTinUL = P052W6_A3649EstTinUL[0] ;
               n3649EstTinUL = P052W6_n3649EstTinUL[0] ;
               AV59UltLin = A3649EstTinUL ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV59UltLin = (short)(AV59UltLin+1) ;
            /*
               INSERT RECORD ON TABLE TXPCONTIN

            */
            A3646EstTinAny = AV58Any ;
            A3647EstTinMes = AV57Mes ;
            A3648EstTinDia = AV56Dia ;
            A3649EstTinUL = AV59UltLin ;
            n3649EstTinUL = false ;
            /* Using cursor P052W7 */
            pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Boolean.valueOf(n3649EstTinUL), Short.valueOf(A3649EstTinUL)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               n3649EstTinUL = false ;
               /* Optimized UPDATE. */
               /* Using cursor P052W8 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n3649EstTinUL), Short.valueOf(AV59UltLin), A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPLCONTI

            */
            A3646EstTinAny = AV58Any ;
            A3647EstTinMes = AV57Mes ;
            A3648EstTinDia = AV56Dia ;
            A1929EstTinNr = AV59UltLin ;
            A1933BarCodTin = A129BarCod ;
            n1933BarCodTin = false ;
            A1934BarReoTin = A132BarCodReo ;
            n1934BarReoTin = false ;
            A1935BarParTin = A130BarCodPar ;
            n1935BarParTin = false ;
            A1936BarSerTin = A212BarSer ;
            n1936BarSerTin = false ;
            A1937BarDscTin = A1652BarSerDsc ;
            n1937BarDscTin = false ;
            A1939BarArtTin = A217BarTipArt ;
            n1939BarArtTin = false ;
            A1940BarColNoT = A135BarColNom ;
            n1940BarColNoT = false ;
            A1941BarColNuT = A136BarColNum ;
            n1941BarColNuT = false ;
            A1942BarTipCoT = A218BarTipCol ;
            n1942BarTipCoT = false ;
            A1943BarNomClT = " " ;
            n1943BarNomClT = false ;
            A1944BarNumClT = 0 ;
            n1944BarNumClT = false ;
            A1945BarMaqTin = A180BarMaqCod ;
            n1945BarMaqTin = false ;
            A1946BarVolTin = 0 ;
            n1946BarVolTin = false ;
            A1947BarKgmTin = A166BarKgm ;
            n1947BarKgmTin = false ;
            A1948BarMtrTin = A184BarMtr ;
            n1948BarMtrTin = false ;
            A1949BarPieTin = A198BarPie ;
            n1949BarPieTin = false ;
            A2304BarEstTin = A148BarEstReo ;
            n2304BarEstTin = false ;
            if ( A138BarConReo > 0 )
            {
               A2304BarEstTin = (byte)(1) ;
               n2304BarEstTin = false ;
            }
            A2316BarAgrLot = GXutil.str( A3595BarMacCod, 8, 0) + GXutil.str( A138BarConReo, 1, 0) ;
            n2316BarAgrLot = false ;
            A3650BarNumAna = A189BarNumAny ;
            n3650BarNumAna = false ;
            A3651BarTipDef = A833TipDefCod ;
            n3651BarTipDef = false ;
            A3652BarIntens = A2830BarIntPer ;
            n3652BarIntens = false ;
            A3653BarPriCod = A209BarPri ;
            n3653BarPriCod = false ;
            A3654BarCosPD = A141BarCosPro ;
            n3654BarCosPD = false ;
            A3658BarCosPA = A140BarCosAny ;
            n3658BarCosPA = false ;
            A3656BarCosAD = DecimalUtil.doubleToDec(0) ;
            n3656BarCosAD = false ;
            A3657BarCosAA = DecimalUtil.doubleToDec(0) ;
            n3657BarCosAA = false ;
            A3705BarCosCol = A2449BarKgEnE ;
            n3705BarCosCol = false ;
            A3706BarCosAnc = A169BarKgsFac ;
            n3706BarCosAnc = false ;
            A4977BarReoNum = A4975BarNumReo ;
            n4977BarReoNum = false ;
            A5169BarTipDTin = A2010BarTipDis ;
            n5169BarTipDTin = false ;
            A5170BarTipCTin = A5291BarTipCor ;
            n5170BarTipCTin = false ;
            A5899BarCosttTi = DecimalUtil.doubleToDec(0) ;
            n5899BarCosttTi = false ;
            A5900BarRbTeo = (short)(0) ;
            n5900BarRbTeo = false ;
            A6177BarNumTin = 0 ;
            n6177BarNumTin = false ;
            A6634BarRecAcb = httpContext.getMessage( "N", "") ;
            n6634BarRecAcb = false ;
            A4923BarNumActx = (short)(0) ;
            n4923BarNumActx = false ;
            A8563BarKgsTt = A812RecTotKgm ;
            n8563BarKgsTt = false ;
            A8584FamCodT = (short)(0) ;
            n8584FamCodT = false ;
            A9754BarNTint = (byte)(0) ;
            n9754BarNTint = false ;
            A4926BarFaseOrd = (short)(0) ;
            n4926BarFaseOrd = false ;
            A4925BarFaseCod = " " ;
            n4925BarFaseCod = false ;
            A10539BarAcs = A118BarAcaQui ;
            n10539BarAcs = false ;
            A10540BarNprg = " " ;
            n10540BarNprg = false ;
            A10541BarLts = 0 ;
            n10541BarLts = false ;
            A10546BarLtsV = DecimalUtil.doubleToDec(0) ;
            n10546BarLtsV = false ;
            A11177BarFecIt = AV99Barfasdti ;
            n11177BarFecIt = false ;
            A11178BarFecFt = AV100Barfasdtf ;
            n11178BarFecFt = false ;
            A11179BarColNm = A3746BarNPed ;
            n11179BarColNm = false ;
            /* Using cursor P052W9 */
            pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11177BarFecIt), A11177BarFecIt, Boolean.valueOf(n11178BarFecFt), A11178BarFecFt, Boolean.valueOf(n11179BarColNm), A11179BarColNm});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
            if ( (pr_default.getStatus(5) == 1) )
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
            A9777BarItem3 = httpContext.getMessage( "Parte 2", "") ;
            AV106Control = ">" + A9777BarItem3 ;
            System.out.println( AV106Control );
            /* Using cursor P052W10 */
            pr_default.execute(6, new Object[] {A9777BarItem3, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Fin Reg89Lconti", "") ;
      System.out.println( Gx_msg );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pxreg89lconti.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apxreg89lconti");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV102termcod = "" ;
      AV103Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV104emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV105Usurcod = "" ;
      GXv_char3 = new String[1] ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P052W4_A396EmprCod = new String[] {""} ;
      P052W4_A9777BarItem3 = new String[] {""} ;
      P052W4_A212BarSer = new String[] {""} ;
      P052W4_A1652BarSerDsc = new String[] {""} ;
      P052W4_A217BarTipArt = new short[1] ;
      P052W4_n217BarTipArt = new boolean[] {false} ;
      P052W4_A135BarColNom = new String[] {""} ;
      P052W4_A136BarColNum = new int[1] ;
      P052W4_A218BarTipCol = new byte[1] ;
      P052W4_A180BarMaqCod = new String[] {""} ;
      P052W4_A148BarEstReo = new byte[1] ;
      P052W4_A138BarConReo = new byte[1] ;
      P052W4_A3595BarMacCod = new int[1] ;
      P052W4_A189BarNumAny = new short[1] ;
      P052W4_A833TipDefCod = new short[1] ;
      P052W4_n833TipDefCod = new boolean[] {false} ;
      P052W4_A2830BarIntPer = new byte[1] ;
      P052W4_A209BarPri = new String[] {""} ;
      P052W4_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_n2449BarKgEnE = new boolean[] {false} ;
      P052W4_A169BarKgsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_A4975BarNumReo = new short[1] ;
      P052W4_A2010BarTipDis = new String[] {""} ;
      P052W4_A5291BarTipCor = new String[] {""} ;
      P052W4_A118BarAcaQui = new String[] {""} ;
      P052W4_A3746BarNPed = new String[] {""} ;
      P052W4_A252CliCod = new int[1] ;
      P052W4_n252CliCod = new boolean[] {false} ;
      P052W4_A130BarCodPar = new String[] {""} ;
      P052W4_A132BarCodReo = new byte[1] ;
      P052W4_A129BarCod = new int[1] ;
      P052W4_A9776barItem2 = new String[] {""} ;
      P052W4_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P052W4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052W4_n219BarTotAgr = new boolean[] {false} ;
      P052W4_A199BarPie1 = new short[1] ;
      P052W4_A365DisDes = new String[] {""} ;
      P052W4_A898BarPieNDes = new int[1] ;
      A396EmprCod = "" ;
      A9777BarItem3 = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A209BarPri = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A2449BarKgEnE = DecimalUtil.ZERO ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A2010BarTipDis = "" ;
      A5291BarTipCor = "" ;
      A118BarAcaQui = "" ;
      A3746BarNPed = "" ;
      A130BarCodPar = "" ;
      A9776barItem2 = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV99Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV100Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      P052W5_A396EmprCod = new String[] {""} ;
      P052W5_A129BarCod = new int[1] ;
      P052W5_A132BarCodReo = new byte[1] ;
      P052W5_A130BarCodPar = new String[] {""} ;
      P052W5_A150BarFacTin = new String[] {""} ;
      P052W5_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P052W5_n4442BarFasDTI = new boolean[] {false} ;
      P052W5_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P052W5_n4443BarFasDTF = new boolean[] {false} ;
      P052W5_A194BarOrdLin = new short[1] ;
      P052W5_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      P052W6_A396EmprCod = new String[] {""} ;
      P052W6_A3648EstTinDia = new byte[1] ;
      P052W6_A3647EstTinMes = new byte[1] ;
      P052W6_A3646EstTinAny = new short[1] ;
      P052W6_A3649EstTinUL = new short[1] ;
      P052W6_n3649EstTinUL = new boolean[] {false} ;
      Gx_emsg = "" ;
      A1935BarParTin = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1943BarNomClT = "" ;
      A1945BarMaqTin = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A2316BarAgrLot = "" ;
      A3653BarPriCod = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A5169BarTipDTin = "" ;
      A5170BarTipCTin = "" ;
      A5899BarCosttTi = DecimalUtil.ZERO ;
      A6634BarRecAcb = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A4925BarFaseCod = "" ;
      A10539BarAcs = "" ;
      A10540BarNprg = "" ;
      A10546BarLtsV = DecimalUtil.ZERO ;
      A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      A11179BarColNm = "" ;
      AV106Control = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apxreg89lconti__default(),
         new Object[] {
             new Object[] {
            P052W4_A396EmprCod, P052W4_A9777BarItem3, P052W4_A212BarSer, P052W4_A1652BarSerDsc, P052W4_A217BarTipArt, P052W4_n217BarTipArt, P052W4_A135BarColNom, P052W4_A136BarColNum, P052W4_A218BarTipCol, P052W4_A180BarMaqCod,
            P052W4_A148BarEstReo, P052W4_A138BarConReo, P052W4_A3595BarMacCod, P052W4_A189BarNumAny, P052W4_A833TipDefCod, P052W4_n833TipDefCod, P052W4_A2830BarIntPer, P052W4_A209BarPri, P052W4_A141BarCosPro, P052W4_A140BarCosAny,
            P052W4_A2449BarKgEnE, P052W4_n2449BarKgEnE, P052W4_A169BarKgsFac, P052W4_A4975BarNumReo, P052W4_A2010BarTipDis, P052W4_A5291BarTipCor, P052W4_A118BarAcaQui, P052W4_A3746BarNPed, P052W4_A252CliCod, P052W4_n252CliCod,
            P052W4_A130BarCodPar, P052W4_A132BarCodReo, P052W4_A129BarCod, P052W4_A9776barItem2, P052W4_A3871BarFecCRe, P052W4_A184BarMtr, P052W4_A166BarKgm, P052W4_A219BarTotAgr, P052W4_n219BarTotAgr, P052W4_A199BarPie1,
            P052W4_A365DisDes, P052W4_A898BarPieNDes
            }
            , new Object[] {
            P052W5_A396EmprCod, P052W5_A129BarCod, P052W5_A132BarCodReo, P052W5_A130BarCodPar, P052W5_A150BarFacTin, P052W5_A4442BarFasDTI, P052W5_n4442BarFasDTI, P052W5_A4443BarFasDTF, P052W5_n4443BarFasDTF, P052W5_A194BarOrdLin,
            P052W5_A758ProCod
            }
            , new Object[] {
            P052W6_A396EmprCod, P052W6_A3648EstTinDia, P052W6_A3647EstTinMes, P052W6_A3646EstTinAny, P052W6_A3649EstTinUL, P052W6_n3649EstTinUL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A138BarConReo ;
   private byte A2830BarIntPer ;
   private byte A132BarCodReo ;
   private byte AV56Dia ;
   private byte AV57Mes ;
   private byte A3648EstTinDia ;
   private byte A3647EstTinMes ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte A2304BarEstTin ;
   private byte A3652BarIntens ;
   private byte A9754BarNTint ;
   private short A217BarTipArt ;
   private short A189BarNumAny ;
   private short A833TipDefCod ;
   private short A4975BarNumReo ;
   private short A199BarPie1 ;
   private short AV58Any ;
   private short A194BarOrdLin ;
   private short A3646EstTinAny ;
   private short A3649EstTinUL ;
   private short AV59UltLin ;
   private short Gx_err ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A3650BarNumAna ;
   private short A3651BarTipDef ;
   private short A4977BarReoNum ;
   private short A5900BarRbTeo ;
   private short A4923BarNumActx ;
   private short A8584FamCodT ;
   private short A4926BarFaseOrd ;
   private int A136BarColNum ;
   private int A3595BarMacCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GX_INS509 ;
   private int GX_INS510 ;
   private int A1933BarCodTin ;
   private int A1941BarColNuT ;
   private int A1944BarNumClT ;
   private int A1946BarVolTin ;
   private int A1949BarPieTin ;
   private int A6177BarNumTin ;
   private int A10541BarLts ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A2449BarKgEnE ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A5899BarCosttTi ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A10546BarLtsV ;
   private String AV102termcod ;
   private String AV103Emprcod ;
   private String GXv_char1[] ;
   private String AV104emprnom ;
   private String GXv_char2[] ;
   private String AV105Usurcod ;
   private String GXv_char3[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9777BarItem3 ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A209BarPri ;
   private String A2010BarTipDis ;
   private String A5291BarTipCor ;
   private String A118BarAcaQui ;
   private String A3746BarNPed ;
   private String A130BarCodPar ;
   private String A9776barItem2 ;
   private String A365DisDes ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private String A1935BarParTin ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1943BarNomClT ;
   private String A1945BarMaqTin ;
   private String A2316BarAgrLot ;
   private String A3653BarPriCod ;
   private String A5169BarTipDTin ;
   private String A5170BarTipCTin ;
   private String A6634BarRecAcb ;
   private String A4925BarFaseCod ;
   private String A10539BarAcs ;
   private String A10540BarNprg ;
   private String A11179BarColNm ;
   private java.util.Date AV99Barfasdti ;
   private java.util.Date AV100Barfasdtf ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A11177BarFecIt ;
   private java.util.Date A11178BarFecFt ;
   private java.util.Date A3871BarFecCRe ;
   private boolean n217BarTipArt ;
   private boolean n833TipDefCod ;
   private boolean n2449BarKgEnE ;
   private boolean n252CliCod ;
   private boolean n219BarTotAgr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3649EstTinUL ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n1936BarSerTin ;
   private boolean n1937BarDscTin ;
   private boolean n1939BarArtTin ;
   private boolean n1940BarColNoT ;
   private boolean n1941BarColNuT ;
   private boolean n1942BarTipCoT ;
   private boolean n1943BarNomClT ;
   private boolean n1944BarNumClT ;
   private boolean n1945BarMaqTin ;
   private boolean n1946BarVolTin ;
   private boolean n1947BarKgmTin ;
   private boolean n1948BarMtrTin ;
   private boolean n1949BarPieTin ;
   private boolean n2304BarEstTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3650BarNumAna ;
   private boolean n3651BarTipDef ;
   private boolean n3652BarIntens ;
   private boolean n3653BarPriCod ;
   private boolean n3654BarCosPD ;
   private boolean n3658BarCosPA ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3705BarCosCol ;
   private boolean n3706BarCosAnc ;
   private boolean n4977BarReoNum ;
   private boolean n5169BarTipDTin ;
   private boolean n5170BarTipCTin ;
   private boolean n5899BarCosttTi ;
   private boolean n5900BarRbTeo ;
   private boolean n6177BarNumTin ;
   private boolean n6634BarRecAcb ;
   private boolean n4923BarNumActx ;
   private boolean n8563BarKgsTt ;
   private boolean n8584FamCodT ;
   private boolean n9754BarNTint ;
   private boolean n4926BarFaseOrd ;
   private boolean n4925BarFaseCod ;
   private boolean n10539BarAcs ;
   private boolean n10540BarNprg ;
   private boolean n10541BarLts ;
   private boolean n10546BarLtsV ;
   private boolean n11177BarFecIt ;
   private boolean n11178BarFecFt ;
   private boolean n11179BarColNm ;
   private String AV106Control ;
   private IDataStoreProvider pr_default ;
   private String[] P052W4_A396EmprCod ;
   private String[] P052W4_A9777BarItem3 ;
   private String[] P052W4_A212BarSer ;
   private String[] P052W4_A1652BarSerDsc ;
   private short[] P052W4_A217BarTipArt ;
   private boolean[] P052W4_n217BarTipArt ;
   private String[] P052W4_A135BarColNom ;
   private int[] P052W4_A136BarColNum ;
   private byte[] P052W4_A218BarTipCol ;
   private String[] P052W4_A180BarMaqCod ;
   private byte[] P052W4_A148BarEstReo ;
   private byte[] P052W4_A138BarConReo ;
   private int[] P052W4_A3595BarMacCod ;
   private short[] P052W4_A189BarNumAny ;
   private short[] P052W4_A833TipDefCod ;
   private boolean[] P052W4_n833TipDefCod ;
   private byte[] P052W4_A2830BarIntPer ;
   private String[] P052W4_A209BarPri ;
   private java.math.BigDecimal[] P052W4_A141BarCosPro ;
   private java.math.BigDecimal[] P052W4_A140BarCosAny ;
   private java.math.BigDecimal[] P052W4_A2449BarKgEnE ;
   private boolean[] P052W4_n2449BarKgEnE ;
   private java.math.BigDecimal[] P052W4_A169BarKgsFac ;
   private short[] P052W4_A4975BarNumReo ;
   private String[] P052W4_A2010BarTipDis ;
   private String[] P052W4_A5291BarTipCor ;
   private String[] P052W4_A118BarAcaQui ;
   private String[] P052W4_A3746BarNPed ;
   private int[] P052W4_A252CliCod ;
   private boolean[] P052W4_n252CliCod ;
   private String[] P052W4_A130BarCodPar ;
   private byte[] P052W4_A132BarCodReo ;
   private int[] P052W4_A129BarCod ;
   private String[] P052W4_A9776barItem2 ;
   private java.util.Date[] P052W4_A3871BarFecCRe ;
   private java.math.BigDecimal[] P052W4_A184BarMtr ;
   private java.math.BigDecimal[] P052W4_A166BarKgm ;
   private java.math.BigDecimal[] P052W4_A219BarTotAgr ;
   private boolean[] P052W4_n219BarTotAgr ;
   private short[] P052W4_A199BarPie1 ;
   private String[] P052W4_A365DisDes ;
   private int[] P052W4_A898BarPieNDes ;
   private String[] P052W5_A396EmprCod ;
   private int[] P052W5_A129BarCod ;
   private byte[] P052W5_A132BarCodReo ;
   private String[] P052W5_A130BarCodPar ;
   private String[] P052W5_A150BarFacTin ;
   private java.util.Date[] P052W5_A4442BarFasDTI ;
   private boolean[] P052W5_n4442BarFasDTI ;
   private java.util.Date[] P052W5_A4443BarFasDTF ;
   private boolean[] P052W5_n4443BarFasDTF ;
   private short[] P052W5_A194BarOrdLin ;
   private String[] P052W5_A758ProCod ;
   private String[] P052W6_A396EmprCod ;
   private byte[] P052W6_A3648EstTinDia ;
   private byte[] P052W6_A3647EstTinMes ;
   private short[] P052W6_A3646EstTinAny ;
   private short[] P052W6_A3649EstTinUL ;
   private boolean[] P052W6_n3649EstTinUL ;
}

final  class apxreg89lconti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P052W4", "SELECT T1.EmprCod, T1.BarItem3, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarMaqCod, T1.BarEstReo, T1.BarConReo, T1.BarMacCod, T1.BarNumAny, T1.TipDefCod, T1.BarIntPer, T1.BarPri, T1.BarCosPro, T1.BarCosAny, T1.BarKgEnE, T1.BarKgsFac, T1.BarNumReo, T1.BarTipDis, T1.BarTipCor, T1.BarAcaQui, T1.BarNPed, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.barItem2, T1.BarFecCRe, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarItem3 = ' ') ORDER BY T1.EmprCod, T1.barItem2 ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052W5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasDTI, BarFasDTF, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052W6", "SELECT EmprCod, EstTinDia, EstTinMes, EstTinAny, EstTinUL FROM TXPCONTIN WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ? ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P052W7", "INSERT INTO TXPCONTIN(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinUL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTIN")
         ,new UpdateCursor("P052W8", "UPDATE TXPCONTIN SET EstTinUL=?  WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTIN")
         ,new UpdateCursor("P052W9", "INSERT INTO TXPLCONTI(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, CliCod, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosAD, BarCosAA, BarCosPA, BarCosCol, BarCosAnc, BarNumActx, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarCosttTi, BarRbTeo, BarNumTin, BarRecAcb, BarKgsTt, FamCodT, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarNumPda, BarTipNTin, BarCausa, BarForNum, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCONTI")
         ,new UpdateCursor("P052W10", "UPDATE TXPBARCAD SET BarItem3=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((String[]) buf[25])[0] = rslt.getString(23, 2);
               ((String[]) buf[26])[0] = rslt.getString(24, 6);
               ((String[]) buf[27])[0] = rslt.getString(25, 20);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((int[]) buf[32])[0] = rslt.getInt(29);
               ((String[]) buf[33])[0] = rslt.getString(30, 20);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(31);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(35);
               ((String[]) buf[40])[0] = rslt.getString(36, 1);
               ((int[]) buf[41])[0] = rslt.getInt(37);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 13);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 13);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 6);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[38]).intValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[42], 10);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[66], 8);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[72], 1);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[78]).shortValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[80]).intValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[82], 1);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[86]).shortValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[88]).byteValue());
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[90], 6);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[92], 6);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(50, ((Number) parms[94]).intValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(52, (java.util.Date)parms[98], false);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(53, (java.util.Date)parms[100], false);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[102], 30);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

