package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelidis extends GXProcedure
{
   public pelidis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelidis.class ), "" );
   }

   public pelidis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pelidis.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pelidis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelidis.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV21Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int1) ;
      pelidis.this.AV21Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV24DETPIE ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pelidis.this.AV24DETPIE = GXv_int1[0] ;
      GXv_int1[0] = AV34Trebor ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TREBOR", ""), GXv_int1) ;
      pelidis.this.AV34Trebor = GXv_int1[0] ;
      GXv_int1[0] = AV36PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pelidis.this.AV36PLinea = GXv_int1[0] ;
      GXv_int1[0] = AV35Salayet ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYET", ""), GXv_int1) ;
      pelidis.this.AV35Salayet = GXv_int1[0] ;
      GXv_int1[0] = AV53Velta ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int1) ;
      pelidis.this.AV53Velta = GXv_int1[0] ;
      GXt_int2 = AV50Erfoc ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int1) ;
      pelidis.this.GXt_int2 = GXv_int1[0] ;
      AV50Erfoc = GXt_int2 ;
      GXt_int2 = AV52Tejido ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int1) ;
      pelidis.this.GXt_int2 = GXv_int1[0] ;
      AV52Tejido = GXt_int2 ;
      if ( AV36PLinea == 1 )
      {
         AV44EmprCod2 = "001" ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = AV44EmprCod2 ;
         GXv_char5[0] = AV45EmprNom2 ;
         GXv_int1[0] = AV46Flag_Emp2 ;
         new app.pempaso(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_int1) ;
         pelidis.this.A396EmprCod = GXv_char3[0] ;
         pelidis.this.AV44EmprCod2 = GXv_char4[0] ;
         pelidis.this.AV45EmprNom2 = GXv_char5[0] ;
         pelidis.this.AV46Flag_Emp2 = GXv_int1[0] ;
      }
      AV32Flag_p = (byte)(0) ;
      /* Using cursor P006I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1146DisDisCod = P006I2_A1146DisDisCod[0] ;
         A1139DisBarCod = P006I2_A1139DisBarCod[0] ;
         A1140DisBarReo = P006I2_A1140DisBarReo[0] ;
         A1141DisBarPar = P006I2_A1141DisBarPar[0] ;
         Gx_msg = httpContext.getMessage( "Error.Nº Disposicion =", "") + GXutil.str( A361DisCod, 8, 0) + httpContext.getMessage( " con Hdr(s)¡¡¡¡¡¡¡¡¡", "") ;
         AV32Flag_p = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV32Flag_p == 1 )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV51Disacc = httpContext.getMessage( "N", "") ;
      /* Using cursor P006I3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5252DisAcc = P006I3_A5252DisAcc[0] ;
         A360DisCliNum = P006I3_A360DisCliNum[0] ;
         A374DisNumPie = P006I3_A374DisNumPie[0] ;
         A375DisNumUni = P006I3_A375DisNumUni[0] ;
         A392DisUniMed = P006I3_A392DisUniMed[0] ;
         A365DisDes = P006I3_A365DisDes[0] ;
         A2009DisTipDis = P006I3_A2009DisTipDis[0] ;
         n2009DisTipDis = P006I3_n2009DisTipDis[0] ;
         A1014DibInt = P006I3_A1014DibInt[0] ;
         n1014DibInt = P006I3_n1014DibInt[0] ;
         W361DisCod = A361DisCod ;
         AV51Disacc = A5252DisAcc ;
         AV39DisCliNum = A360DisCliNum ;
         AV40DisNumPie = A374DisNumPie ;
         AV41DisNumUni = A375DisNumUni ;
         /* Using cursor P006I4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A758ProCod = P006I4_A758ProCod[0] ;
            A846UltFasLin = P006I4_A846UltFasLin[0] ;
            /* Using cursor P006I5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A368DisFasLin = P006I5_A368DisFasLin[0] ;
               /* Optimized DELETE. */
               /* Using cursor P006I6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
               /* End optimized DELETE. */
               /* Using cursor P006I7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P006I8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Optimized DELETE. */
         /* Using cursor P006I9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P006I10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
         /* End optimized DELETE. */
         /* Using cursor P006I11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A129BarCod = P006I11_A129BarCod[0] ;
            A132BarCodReo = P006I11_A132BarCodReo[0] ;
            A130BarCodPar = P006I11_A130BarCodPar[0] ;
            A30AlbProCod = P006I11_A30AlbProCod[0] ;
            A2524DisComLin = P006I11_A2524DisComLin[0] ;
            A1056DisComCod = P006I11_A1056DisComCod[0] ;
            A1032FonCod = P006I11_A1032FonCod[0] ;
            /* Using cursor P006I12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
            pr_default.readNext(9);
         }
         pr_default.close(9);
         AV43DisCod = A361DisCod ;
         AV17EmprCod = A396EmprCod ;
         AV18DisUniMed = A392DisUniMed ;
         AV19DisDes = A365DisDes ;
         /* Execute user subroutine: 'DISREF' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'BUSALB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV53Velta == 1 ) && ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "F", "")) == 0 ) ) )
         {
            AV54DibInt = A1014DibInt ;
            /* Execute user subroutine: 'EMPESA_DIBUJO' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Optimized DELETE. */
         /* Using cursor P006I13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
         /* End optimized DELETE. */
         /* Using cursor P006I14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         A361DisCod = W361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSALB' Routine */
      returnInSub = false ;
      AV55Unid_Difo = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P006I15 */
      pr_default.execute(13, new Object[] {AV17EmprCod, Integer.valueOf(AV43DisCod), AV17EmprCod, Integer.valueOf(AV43DisCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A44AlbRecCod = P006I15_A44AlbRecCod[0] ;
         A673Piezas = P006I15_A673Piezas[0] ;
         A631Metros = P006I15_A631Metros[0] ;
         A595Kilos = P006I15_A595Kilos[0] ;
         /* Using cursor P006I16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A52AlbRPieEnt = P006I16_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P006I16_A54AlbRPieUti[0] ;
         A47AlbREst = P006I16_A47AlbREst[0] ;
         A252CliCod = P006I16_A252CliCod[0] ;
         A60AlbRUniUti = P006I16_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P006I16_A58AlbRUniEnt[0] ;
         A56AlbRUni = P006I16_A56AlbRUni[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         /* Using cursor P006I18 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A25AlbPieD = P006I18_A25AlbPieD[0] ;
            A827SumMet = P006I18_A827SumMet[0] ;
            A826SumKil = P006I18_A826SumKil[0] ;
         }
         else
         {
            A25AlbPieD = (short)(0) ;
            A826SumKil = DecimalUtil.doubleToDec(0) ;
            A827SumMet = DecimalUtil.doubleToDec(0) ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A61AlbUniD = A826SumKil ;
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
            {
               A61AlbUniD = A827SumMet ;
            }
            else
            {
               A61AlbUniD = DecimalUtil.doubleToDec(0) ;
            }
         }
         A2182HisEmpTPu = getHisEmpTPu0( A396EmprCod, A44AlbRecCod) ;
         A2181HisEmpTPe = getHisEmpTPe0( A396EmprCod, A44AlbRecCod) ;
         A2176HisEmpTKu = getHisEmpTKu0( A396EmprCod, A44AlbRecCod) ;
         A2175HisEmpTKe = getHisEmpTKe0( A396EmprCod, A44AlbRecCod) ;
         A2179HisEmpTMu = getHisEmpTMu0( A396EmprCod, A44AlbRecCod) ;
         A2178HisEmpTMe = getHisEmpTMe0( A396EmprCod, A44AlbRecCod) ;
         AV20AlbRecCod = A44AlbRecCod ;
         if ( GXutil.strcmp(AV19DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            AV15Piezas = (short)(A673Piezas) ;
            if ( GXutil.strcmp(AV18DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV16Unidades = A631Metros ;
               AV23Metros = A631Metros ;
            }
            else
            {
               AV16Unidades = A595Kilos ;
               AV22Kilos = A595Kilos ;
            }
         }
         else
         {
            AV15Piezas = A25AlbPieD ;
            AV16Unidades = A61AlbUniD ;
            if ( GXutil.strcmp(AV18DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV22Kilos = AV16Unidades ;
               AV23Metros = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               AV23Metros = AV16Unidades ;
               AV22Kilos = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( AV21Flag1 == 1 )
         {
            /* Using cursor P006I19 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(AV43DisCod)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A2160HisEmpAlbD = P006I19_A2160HisEmpAlbD[0] ;
               n2160HisEmpAlbD = P006I19_n2160HisEmpAlbD[0] ;
               A2166HisEmpLTip = P006I19_A2166HisEmpLTip[0] ;
               n2166HisEmpLTip = P006I19_n2166HisEmpLTip[0] ;
               A2164HisEmpKu = P006I19_A2164HisEmpKu[0] ;
               n2164HisEmpKu = P006I19_n2164HisEmpKu[0] ;
               A2169HisEmpMu = P006I19_A2169HisEmpMu[0] ;
               n2169HisEmpMu = P006I19_n2169HisEmpMu[0] ;
               A2172HisEmpPu = P006I19_A2172HisEmpPu[0] ;
               n2172HisEmpPu = P006I19_n2172HisEmpPu[0] ;
               A2165HisEmpLin = P006I19_A2165HisEmpLin[0] ;
               if ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 )
               {
                  A2164HisEmpKu = A2164HisEmpKu.subtract(AV22Kilos) ;
                  n2164HisEmpKu = false ;
                  A2169HisEmpMu = A2169HisEmpMu.subtract(AV23Metros) ;
                  n2169HisEmpMu = false ;
                  A2172HisEmpPu = (short)(A2172HisEmpPu-AV15Piezas) ;
                  n2172HisEmpPu = false ;
                  if ( GXutil.strcmp(AV18DisUniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     if ( ( A2169HisEmpMu.doubleValue() == 0 ) && ( A2172HisEmpPu == 0 ) )
                     {
                        /* Using cursor P006I20 */
                        pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
                     }
                  }
                  if ( GXutil.strcmp(AV18DisUniMed, httpContext.getMessage( "K", "")) == 0 )
                  {
                     if ( ( A2164HisEmpKu.doubleValue() == 0 ) && ( A2172HisEmpPu == 0 ) )
                     {
                        /* Using cursor P006I21 */
                        pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
                     }
                  }
                  /* Using cursor P006I22 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n2164HisEmpKu), A2164HisEmpKu, Boolean.valueOf(n2169HisEmpMu), A2169HisEmpMu, Boolean.valueOf(n2172HisEmpPu), Short.valueOf(A2172HisEmpPu), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
               }
               pr_default.readNext(16);
            }
            pr_default.close(16);
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
            {
               A58AlbRUniEnt = A2178HisEmpTMe ;
               A60AlbRUniUti = A2179HisEmpTMu ;
            }
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A58AlbRUniEnt = A2175HisEmpTKe ;
               A60AlbRUniUti = A2176HisEmpTKu ;
            }
            A52AlbRPieEnt = A2181HisEmpTPe ;
            A54AlbRPieUti = A2182HisEmpTPu ;
            A47AlbREst = (byte)(0) ;
            if ( A57AlbRUniDis.doubleValue() == 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
            if ( ( AV36PLinea == 1 ) || ( AV35Salayet == 1 ) )
            {
               /* Execute user subroutine: 'CTRL_EMPESA' */
               S1211 ();
               if ( returnInSub )
               {
                  pr_default.close(15);
                  pr_default.close(14);
                  pr_default.close(13);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else
         {
            if ( ( AV24DETPIE == 1 ) || ( ( AV34Trebor == 1 ) && ( A252CliCod == 2203 ) ) )
            {
               /* Using cursor P006I23 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(20) != 101) )
               {
                  A382DisPieKil = P006I23_A382DisPieKil[0] ;
                  A384DisPieMet = P006I23_A384DisPieMet[0] ;
                  A380DisPieCod = P006I23_A380DisPieCod[0] ;
                  AV31DisPieCod = A380DisPieCod ;
                  /* Using cursor P006I24 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV31DisPieCod});
                  while ( (pr_default.getStatus(21) != 101) )
                  {
                     A2159AlbRecPie = P006I24_A2159AlbRecPie[0] ;
                     A2156AlbRecKgmU = P006I24_A2156AlbRecKgmU[0] ;
                     A2158AlbRecMtrU = P006I24_A2158AlbRecMtrU[0] ;
                     A2156AlbRecKgmU = A2156AlbRecKgmU.subtract(A382DisPieKil) ;
                     A2158AlbRecMtrU = A2158AlbRecMtrU.subtract(A384DisPieMet) ;
                     if ( A2156AlbRecKgmU.doubleValue() < 0 )
                     {
                        A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
                     }
                     if ( A2158AlbRecMtrU.doubleValue() < 0 )
                     {
                        A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
                     }
                     /* Using cursor P006I25 */
                     pr_default.execute(22, new Object[] {A2156AlbRecKgmU, A2158AlbRecMtrU, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(21);
                  pr_default.readNext(20);
               }
               pr_default.close(20);
            }
            else
            {
               A60AlbRUniUti = A60AlbRUniUti.subtract(AV16Unidades) ;
               A54AlbRPieUti = (int)(A54AlbRPieUti-AV15Piezas) ;
               A47AlbREst = (byte)(0) ;
            }
            AV55Unid_Difo = AV55Unid_Difo.add(AV16Unidades) ;
         }
         /* Using cursor P006I26 */
         pr_default.execute(23, new Object[] {Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A60AlbRUniUti, A58AlbRUniEnt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         pr_default.readNext(13);
      }
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
      if ( ( ( AV50Erfoc == 1 ) || ( AV52Tejido == 1 ) ) && ( GXutil.strcmp(AV51Disacc, httpContext.getMessage( "S", "")) == 0 ) )
      {
         GXv_char5[0] = AV17EmprCod ;
         GXv_int6[0] = AV20AlbRecCod ;
         new app.pkilalm(remoteHandle, context).execute( GXv_char5, GXv_int6) ;
         pelidis.this.AV17EmprCod = GXv_char5[0] ;
         pelidis.this.AV20AlbRecCod = GXv_int6[0] ;
      }
      /* Using cursor P006I28 */
      pr_default.execute(24, new Object[] {AV17EmprCod, Integer.valueOf(AV43DisCod)});
      while ( (pr_default.getStatus(24) != 101) )
      {
         brk6I15 = false ;
         A252CliCod = P006I28_A252CliCod[0] ;
         A44AlbRecCod = P006I28_A44AlbRecCod[0] ;
         A2152AlbDetPie = P006I28_A2152AlbDetPie[0] ;
         A2151AlbDetMtrU = P006I28_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P006I28_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P006I28_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P006I28_A2146AlbDetKgm[0] ;
         A56AlbRUni = P006I28_A56AlbRUni[0] ;
         A252CliCod = P006I28_A252CliCod[0] ;
         A56AlbRUni = P006I28_A56AlbRUni[0] ;
         A2152AlbDetPie = P006I28_A2152AlbDetPie[0] ;
         A2151AlbDetMtrU = P006I28_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P006I28_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P006I28_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P006I28_A2146AlbDetKgm[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
            }
         }
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         while ( (pr_default.getStatus(24) != 101) && ( GXutil.strcmp(P006I28_A396EmprCod[0], A396EmprCod) == 0 ) && ( P006I28_A361DisCod[0] == A361DisCod ) && ( P006I28_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brk6I15 = false ;
            A252CliCod = P006I28_A252CliCod[0] ;
            A56AlbRUni = P006I28_A56AlbRUni[0] ;
            A252CliCod = P006I28_A252CliCod[0] ;
            A56AlbRUni = P006I28_A56AlbRUni[0] ;
            /* Using cursor P006I30 */
            pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            if ( (pr_default.getStatus(25) != 101) )
            {
               A2152AlbDetPie = P006I30_A2152AlbDetPie[0] ;
               A2151AlbDetMtrU = P006I30_A2151AlbDetMtrU[0] ;
               A2149AlbDetMtr = P006I30_A2149AlbDetMtr[0] ;
               A2148AlbDetKgmU = P006I30_A2148AlbDetKgmU[0] ;
               A2146AlbDetKgm = P006I30_A2146AlbDetKgm[0] ;
            }
            else
            {
               A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
               A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
               A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
               A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
               A2152AlbDetPie = (short)(0) ;
            }
            pr_default.close(25);
            A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
            A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            }
            else
            {
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
               {
                  A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               }
               else
               {
                  A2153AlbDetPieU = (short)(0) ;
               }
            }
            AV56AlbDetMtr = A2149AlbDetMtr ;
            AV57AlbDetMtrU = A2151AlbDetMtrU ;
            AV58AlbDetKgm = A2146AlbDetKgm ;
            AV59AlbDetKgmU = A2148AlbDetKgmU ;
            AV60AlbDetPie = A2152AlbDetPie ;
            /* Using cursor P006I32 */
            pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(26) != 101) )
            {
               A380DisPieCod = P006I32_A380DisPieCod[0] ;
               A56AlbRUni = P006I32_A56AlbRUni[0] ;
               A2146AlbDetKgm = P006I32_A2146AlbDetKgm[0] ;
               A2148AlbDetKgmU = P006I32_A2148AlbDetKgmU[0] ;
               A2149AlbDetMtr = P006I32_A2149AlbDetMtr[0] ;
               A2151AlbDetMtrU = P006I32_A2151AlbDetMtrU[0] ;
               A56AlbRUni = P006I32_A56AlbRUni[0] ;
               A2146AlbDetKgm = P006I32_A2146AlbDetKgm[0] ;
               A2148AlbDetKgmU = P006I32_A2148AlbDetKgmU[0] ;
               A2149AlbDetMtr = P006I32_A2149AlbDetMtr[0] ;
               A2151AlbDetMtrU = P006I32_A2151AlbDetMtrU[0] ;
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
               {
                  A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
               }
               else
               {
                  if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
                  {
                     A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
                  }
                  else
                  {
                     A2153AlbDetPieU = (short)(0) ;
                  }
               }
               A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
               A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
               AV31DisPieCod = A380DisPieCod ;
               /* Using cursor P006I33 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV31DisPieCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), AV31DisPieCod});
               while ( (pr_default.getStatus(27) != 101) )
               {
                  A2159AlbRecPie = P006I33_A2159AlbRecPie[0] ;
                  /* Using cursor P006I34 */
                  pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  A58AlbRUniEnt = P006I34_A58AlbRUniEnt[0] ;
                  A60AlbRUniUti = P006I34_A60AlbRUniUti[0] ;
                  A52AlbRPieEnt = P006I34_A52AlbRPieEnt[0] ;
                  A54AlbRPieUti = P006I34_A54AlbRPieUti[0] ;
                  A47AlbREst = P006I34_A47AlbREst[0] ;
                  if ( AV24DETPIE == 1 )
                  {
                     if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
                     {
                        A58AlbRUniEnt = AV56AlbDetMtr ;
                        A60AlbRUniUti = AV57AlbDetMtrU ;
                     }
                     if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
                     {
                        A58AlbRUniEnt = AV58AlbDetKgm ;
                        A60AlbRUniUti = AV59AlbDetKgmU ;
                     }
                     A52AlbRPieEnt = AV60AlbDetPie ;
                     A54AlbRPieUti = A2153AlbDetPieU ;
                     if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
                     {
                        A47AlbREst = (byte)(1) ;
                     }
                     if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
                     {
                        A47AlbREst = (byte)(1) ;
                     }
                     if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
                     {
                        A47AlbREst = (byte)(0) ;
                     }
                     if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
                     {
                        A47AlbREst = (byte)(0) ;
                     }
                  }
                  /* Using cursor P006I35 */
                  pr_default.execute(29, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(27);
               pr_default.close(28);
               pr_default.readNext(26);
            }
            pr_default.close(26);
            /* Optimized DELETE. */
            /* Using cursor P006I36 */
            pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            /* End optimized DELETE. */
            brk6I15 = true ;
            pr_default.readNext(24);
         }
         /* Using cursor P006I37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( ! brk6I15 )
         {
            brk6I15 = true ;
            pr_default.readNext(24);
         }
      }
      pr_default.close(24);
   }

   public void S131( )
   {
      /* 'DISREF' Routine */
      returnInSub = false ;
      /* Using cursor P006I38 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A3608DisRefAlbR = P006I38_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P006I38_n3608DisRefAlbR[0] ;
         A3398DisRefBarC = P006I38_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P006I38_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P006I38_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P006I38_A3607DisRefBPie[0] ;
         A3403DisRefPie = P006I38_A3403DisRefPie[0] ;
         n3403DisRefPie = P006I38_n3403DisRefPie[0] ;
         A3402DisRefMts = P006I38_A3402DisRefMts[0] ;
         n3402DisRefMts = P006I38_n3402DisRefMts[0] ;
         A3401DisRefKgs = P006I38_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P006I38_n3401DisRefKgs[0] ;
         AV20AlbRecCod = A3608DisRefAlbR ;
         AV25BarCod = A3398DisRefBarC ;
         AV26BarCodReo = A3399DisRefBCRe ;
         AV27BarCodPar = A3400DisRefBCPa ;
         AV28BarPieCod = A3607DisRefBPie ;
         AV29BarPieLoc = "" ;
         AV30BarPieAnc = (short)(0) ;
         if ( GXutil.strcmp(AV19DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            AV15Piezas = A3403DisRefPie ;
         }
         else
         {
            AV15Piezas = (short)(0) ;
         }
         AV23Metros = A3402DisRefMts ;
         AV22Kilos = A3401DisRefKgs ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char4[0] = AV19DisDes ;
         GXv_int7[0] = AV20AlbRecCod ;
         GXv_int8[0] = AV25BarCod ;
         GXv_int1[0] = AV26BarCodReo ;
         GXv_char3[0] = AV27BarCodPar ;
         GXv_char9[0] = AV28BarPieCod ;
         GXv_char10[0] = AV29BarPieLoc ;
         GXv_int11[0] = AV30BarPieAnc ;
         GXv_int12[0] = AV15Piezas ;
         GXv_decimal13[0] = AV23Metros ;
         GXv_decimal14[0] = AV22Kilos ;
         GXv_int15[0] = (short)(0) ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char18[0] = httpContext.getMessage( "DEL", "") ;
         new app.pdishdr(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4, GXv_int7, GXv_int8, GXv_int1, GXv_char3, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_decimal16, GXv_decimal17, GXv_char18) ;
         pelidis.this.A396EmprCod = GXv_char5[0] ;
         pelidis.this.A361DisCod = GXv_int6[0] ;
         pelidis.this.AV19DisDes = GXv_char4[0] ;
         pelidis.this.AV20AlbRecCod = GXv_int7[0] ;
         pelidis.this.AV25BarCod = GXv_int8[0] ;
         pelidis.this.AV26BarCodReo = GXv_int1[0] ;
         pelidis.this.AV27BarCodPar = GXv_char3[0] ;
         pelidis.this.AV28BarPieCod = GXv_char9[0] ;
         pelidis.this.AV29BarPieLoc = GXv_char10[0] ;
         pelidis.this.AV30BarPieAnc = GXv_int11[0] ;
         pelidis.this.AV15Piezas = GXv_int12[0] ;
         pelidis.this.AV23Metros = GXv_decimal13[0] ;
         pelidis.this.AV22Kilos = GXv_decimal14[0] ;
         pr_default.readNext(32);
      }
      pr_default.close(32);
   }

   public void S1211( )
   {
      /* 'CTRL_EMPESA' Routine */
      returnInSub = false ;
      /* Using cursor P006I39 */
      pr_default.execute(33, new Object[] {AV17EmprCod, Integer.valueOf(AV43DisCod), AV17EmprCod, Integer.valueOf(AV43DisCod)});
      while ( (pr_default.getStatus(33) != 101) )
      {
         A44AlbRecCod = P006I39_A44AlbRecCod[0] ;
         /* Using cursor P006I40 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A56AlbRUni = P006I40_A56AlbRUni[0] ;
         A52AlbRPieEnt = P006I40_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P006I40_A54AlbRPieUti[0] ;
         A47AlbREst = P006I40_A47AlbREst[0] ;
         A60AlbRUniUti = P006I40_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P006I40_A58AlbRUniEnt[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A2182HisEmpTPu = getHisEmpTPu0( A396EmprCod, A44AlbRecCod) ;
         A2181HisEmpTPe = getHisEmpTPe0( A396EmprCod, A44AlbRecCod) ;
         A2176HisEmpTKu = getHisEmpTKu0( A396EmprCod, A44AlbRecCod) ;
         A2175HisEmpTKe = getHisEmpTKe0( A396EmprCod, A44AlbRecCod) ;
         A2179HisEmpTMu = getHisEmpTMu0( A396EmprCod, A44AlbRecCod) ;
         A2178HisEmpTMe = getHisEmpTMe0( A396EmprCod, A44AlbRecCod) ;
         if ( AV36PLinea == 1 )
         {
            AV47HisEmpSd = httpContext.getMessage( "ENTRADA Aut.DESDE TI", "") ;
         }
         else
         {
            AV47HisEmpSd = httpContext.getMessage( "ENTRADA Aut.DESDE ES", "") ;
         }
         AV49Existe_Reg = (byte)(0) ;
         /* Using cursor P006I41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV47HisEmpSd, Integer.valueOf(AV43DisCod)});
         while ( (pr_default.getStatus(35) != 101) )
         {
            A2160HisEmpAlbD = P006I41_A2160HisEmpAlbD[0] ;
            n2160HisEmpAlbD = P006I41_n2160HisEmpAlbD[0] ;
            A2173HisEmpSd = P006I41_A2173HisEmpSd[0] ;
            n2173HisEmpSd = P006I41_n2173HisEmpSd[0] ;
            A2163HisEmpKe = P006I41_A2163HisEmpKe[0] ;
            n2163HisEmpKe = P006I41_n2163HisEmpKe[0] ;
            A2168HisEmpMe = P006I41_A2168HisEmpMe[0] ;
            n2168HisEmpMe = P006I41_n2168HisEmpMe[0] ;
            A2171HisEmpPe = P006I41_A2171HisEmpPe[0] ;
            n2171HisEmpPe = P006I41_n2171HisEmpPe[0] ;
            A2165HisEmpLin = P006I41_A2165HisEmpLin[0] ;
            A2163HisEmpKe = A2163HisEmpKe.subtract(AV22Kilos) ;
            n2163HisEmpKe = false ;
            A2168HisEmpMe = A2168HisEmpMe.subtract(AV23Metros) ;
            n2168HisEmpMe = false ;
            A2171HisEmpPe = (short)(A2171HisEmpPe-AV15Piezas) ;
            n2171HisEmpPe = false ;
            if ( GXutil.strcmp(AV18DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( ( A2168HisEmpMe.doubleValue() == 0 ) && ( A2171HisEmpPe == 0 ) )
               {
                  /* Using cursor P006I42 */
                  pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
               }
            }
            if ( GXutil.strcmp(AV18DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( ( A2163HisEmpKe.doubleValue() == 0 ) && ( A2171HisEmpPe == 0 ) )
               {
                  /* Using cursor P006I43 */
                  pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
               }
            }
            AV49Existe_Reg = (byte)(1) ;
            /* Using cursor P006I44 */
            pr_default.execute(38, new Object[] {Boolean.valueOf(n2163HisEmpKe), A2163HisEmpKe, Boolean.valueOf(n2168HisEmpMe), A2168HisEmpMe, Boolean.valueOf(n2171HisEmpPe), Short.valueOf(A2171HisEmpPe), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
            pr_default.readNext(35);
         }
         pr_default.close(35);
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A58AlbRUniEnt = A2178HisEmpTMe ;
            A60AlbRUniUti = A2179HisEmpTMu ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A58AlbRUniEnt = A2175HisEmpTKe ;
            A60AlbRUniUti = A2176HisEmpTKu ;
         }
         A52AlbRPieEnt = A2181HisEmpTPe ;
         A54AlbRPieUti = A2182HisEmpTPu ;
         if ( ( A58AlbRUniEnt.doubleValue() == 0 ) && ( A60AlbRUniUti.doubleValue() == 0 ) )
         {
            /* Using cursor P006I45 */
            pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         }
         else
         {
            A47AlbREst = (byte)(0) ;
            if ( A57AlbRUniDis.doubleValue() == 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
         }
         /* Using cursor P006I46 */
         pr_default.execute(40, new Object[] {Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A60AlbRUniUti, A58AlbRUniEnt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         pr_default.readNext(33);
      }
      pr_default.close(33);
      pr_default.close(34);
      if ( AV49Existe_Reg == 1 )
      {
         /* Using cursor P006I47 */
         pr_default.execute(41, new Object[] {AV17EmprCod, Integer.valueOf(AV20AlbRecCod)});
         while ( (pr_default.getStatus(41) != 101) )
         {
            A44AlbRecCod = P006I47_A44AlbRecCod[0] ;
            AV48LinHisEmp = (byte)(0) ;
            /* Using cursor P006I48 */
            pr_default.execute(42, new Object[] {AV17EmprCod, Integer.valueOf(AV20AlbRecCod)});
            while ( (pr_default.getStatus(42) != 101) )
            {
               A44AlbRecCod = P006I48_A44AlbRecCod[0] ;
               A396EmprCod = P006I48_A396EmprCod[0] ;
               A2165HisEmpLin = P006I48_A2165HisEmpLin[0] ;
               AV48LinHisEmp = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(42);
            }
            pr_default.close(42);
            if ( AV48LinHisEmp == 0 )
            {
               /* Using cursor P006I49 */
               pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(41);
      }
   }

   public void S141( )
   {
      /* 'EMPESA_DIBUJO' Routine */
      returnInSub = false ;
      /* Using cursor P006I50 */
      pr_default.execute(44, new Object[] {AV17EmprCod, Integer.valueOf(AV54DibInt)});
      while ( (pr_default.getStatus(44) != 101) )
      {
         A44AlbRecCod = P006I50_A44AlbRecCod[0] ;
         A47AlbREst = P006I50_A47AlbREst[0] ;
         A60AlbRUniUti = P006I50_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P006I50_A58AlbRUniEnt[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A60AlbRUniUti = A60AlbRUniUti.subtract(AV55Unid_Difo) ;
         A47AlbREst = (byte)(0) ;
         if ( A57AlbRUniDis.doubleValue() <= 0 )
         {
            A47AlbREst = (byte)(1) ;
         }
         /* Using cursor P006I51 */
         pr_default.execute(45, new Object[] {Byte.valueOf(A47AlbREst), A60AlbRUniUti, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(44);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelidis.this.A396EmprCod;
      this.aP1[0] = pelidis.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelidis");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor P006I52 */
      pr_default.execute(46, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(46) != 101) )
      {
         Gx_cnt = P006I52_Gx_cnt[0] ;
      }
      pr_default.close(46);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor P006I53 */
      pr_default.execute(47, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(47) != 101) )
      {
         Gx_cnt = P006I53_Gx_cnt[0] ;
      }
      pr_default.close(47);
      return Gx_cnt ;
   }

   public java.math.BigDecimal getHisEmpTMe0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2168HisEmpMe = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P006I54 */
      pr_default.execute(48, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(48) != 101) )
      {
         if ( ( ( GXutil.strcmp(P006I54_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2168HisEmpMe = P006I54_A2168HisEmpMe[0] ;
               nX2168HisEmpMe = false ;
               Gx_first = false ;
            }
            else
            {
               X2168HisEmpMe = X2168HisEmpMe.add(P006I54_A2168HisEmpMe[0]) ;
               nX2168HisEmpMe = false ;
            }
         }
         pr_default.readNext(48);
      }
      pr_default.close(48);
      return X2168HisEmpMe ;
   }

   public java.math.BigDecimal getHisEmpTMu0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2169HisEmpMu = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P006I55 */
      pr_default.execute(49, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(49) != 101) )
      {
         if ( ( ( ( GXutil.strcmp(P006I55_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "B", ""), "")) == 0 ) || ( GXutil.strcmp(P006I55_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2169HisEmpMu = P006I55_A2169HisEmpMu[0] ;
               nX2169HisEmpMu = false ;
               Gx_first = false ;
            }
            else
            {
               X2169HisEmpMu = X2169HisEmpMu.add(P006I55_A2169HisEmpMu[0]) ;
               nX2169HisEmpMu = false ;
            }
         }
         pr_default.readNext(49);
      }
      pr_default.close(49);
      return X2169HisEmpMu ;
   }

   public java.math.BigDecimal getHisEmpTKe0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2163HisEmpKe = DecimalUtil.doubleToDec(0) ;
      nX2163HisEmpKe = false ;
      Gx_first = true ;
      /* Using cursor P006I56 */
      pr_default.execute(50, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(50) != 101) )
      {
         if ( ( ( GXutil.strcmp(P006I56_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2163HisEmpKe = P006I56_A2163HisEmpKe[0] ;
               nX2163HisEmpKe = false ;
               Gx_first = false ;
            }
            else
            {
               X2163HisEmpKe = X2163HisEmpKe.add(P006I56_A2163HisEmpKe[0]) ;
               nX2163HisEmpKe = false ;
            }
         }
         pr_default.readNext(50);
      }
      pr_default.close(50);
      return X2163HisEmpKe ;
   }

   public java.math.BigDecimal getHisEmpTKu0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2164HisEmpKu = DecimalUtil.doubleToDec(0) ;
      nX2164HisEmpKu = false ;
      Gx_first = true ;
      /* Using cursor P006I57 */
      pr_default.execute(51, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(51) != 101) )
      {
         if ( ( ( ( GXutil.strcmp(P006I57_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "B", ""), "")) == 0 ) || ( GXutil.strcmp(P006I57_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2164HisEmpKu = P006I57_A2164HisEmpKu[0] ;
               nX2164HisEmpKu = false ;
               Gx_first = false ;
            }
            else
            {
               X2164HisEmpKu = X2164HisEmpKu.add(P006I57_A2164HisEmpKu[0]) ;
               nX2164HisEmpKu = false ;
            }
         }
         pr_default.readNext(51);
      }
      pr_default.close(51);
      return X2164HisEmpKu ;
   }

   public int getHisEmpTPe0( String E396EmprCod ,
                             int E44AlbRecCod )
   {
      X2171HisEmpPe = (short)(0) ;
      nX2171HisEmpPe = false ;
      Gx_first = true ;
      /* Using cursor P006I58 */
      pr_default.execute(52, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(52) != 101) )
      {
         if ( ( ( GXutil.strcmp(P006I58_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2171HisEmpPe = P006I58_A2171HisEmpPe[0] ;
               nX2171HisEmpPe = false ;
               Gx_first = false ;
            }
            else
            {
               X2171HisEmpPe = (short)(X2171HisEmpPe+P006I58_A2171HisEmpPe[0]) ;
               nX2171HisEmpPe = false ;
            }
         }
         pr_default.readNext(52);
      }
      pr_default.close(52);
      return X2171HisEmpPe ;
   }

   public int getHisEmpTPu0( String E396EmprCod ,
                             int E44AlbRecCod )
   {
      X2172HisEmpPu = (short)(0) ;
      nX2172HisEmpPu = false ;
      Gx_first = true ;
      /* Using cursor P006I59 */
      pr_default.execute(53, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(53) != 101) )
      {
         if ( ( ( ( GXutil.strcmp(P006I59_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "B", ""), "")) == 0 ) || ( GXutil.strcmp(P006I59_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2172HisEmpPu = P006I59_A2172HisEmpPu[0] ;
               nX2172HisEmpPu = false ;
               Gx_first = false ;
            }
            else
            {
               X2172HisEmpPu = (short)(X2172HisEmpPu+P006I59_A2172HisEmpPu[0]) ;
               nX2172HisEmpPu = false ;
            }
         }
         pr_default.readNext(53);
      }
      pr_default.close(53);
      return X2172HisEmpPu ;
   }

   public void initialize( )
   {
      AV44EmprCod2 = "" ;
      AV45EmprNom2 = "" ;
      scmdbuf = "" ;
      P006I2_A396EmprCod = new String[] {""} ;
      P006I2_A1146DisDisCod = new int[1] ;
      P006I2_A1139DisBarCod = new int[1] ;
      P006I2_A1140DisBarReo = new byte[1] ;
      P006I2_A1141DisBarPar = new String[] {""} ;
      A1141DisBarPar = "" ;
      Gx_msg = "" ;
      AV51Disacc = "" ;
      P006I3_A396EmprCod = new String[] {""} ;
      P006I3_A361DisCod = new int[1] ;
      P006I3_A5252DisAcc = new String[] {""} ;
      P006I3_A360DisCliNum = new String[] {""} ;
      P006I3_A374DisNumPie = new short[1] ;
      P006I3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I3_A392DisUniMed = new String[] {""} ;
      P006I3_A365DisDes = new String[] {""} ;
      P006I3_A2009DisTipDis = new String[] {""} ;
      P006I3_n2009DisTipDis = new boolean[] {false} ;
      P006I3_A1014DibInt = new int[1] ;
      P006I3_n1014DibInt = new boolean[] {false} ;
      A5252DisAcc = "" ;
      A360DisCliNum = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A365DisDes = "" ;
      A2009DisTipDis = "" ;
      AV39DisCliNum = "" ;
      AV41DisNumUni = DecimalUtil.ZERO ;
      P006I4_A396EmprCod = new String[] {""} ;
      P006I4_A361DisCod = new int[1] ;
      P006I4_A758ProCod = new String[] {""} ;
      P006I4_A846UltFasLin = new short[1] ;
      A758ProCod = "" ;
      P006I5_A396EmprCod = new String[] {""} ;
      P006I5_A361DisCod = new int[1] ;
      P006I5_A758ProCod = new String[] {""} ;
      P006I5_A368DisFasLin = new short[1] ;
      P006I11_A129BarCod = new int[1] ;
      P006I11_A132BarCodReo = new byte[1] ;
      P006I11_A130BarCodPar = new String[] {""} ;
      P006I11_A30AlbProCod = new long[1] ;
      P006I11_A396EmprCod = new String[] {""} ;
      P006I11_A361DisCod = new int[1] ;
      P006I11_A2524DisComLin = new byte[1] ;
      P006I11_A1056DisComCod = new String[] {""} ;
      P006I11_A1032FonCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      AV17EmprCod = "" ;
      AV18DisUniMed = "" ;
      AV19DisDes = "" ;
      AV55Unid_Difo = DecimalUtil.ZERO ;
      P006I15_A361DisCod = new int[1] ;
      P006I15_A44AlbRecCod = new int[1] ;
      P006I15_A396EmprCod = new String[] {""} ;
      P006I15_A673Piezas = new int[1] ;
      P006I15_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I15_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A631Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      P006I16_A52AlbRPieEnt = new int[1] ;
      P006I16_A54AlbRPieUti = new int[1] ;
      P006I16_A47AlbREst = new byte[1] ;
      P006I16_A252CliCod = new int[1] ;
      P006I16_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I16_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I16_A56AlbRUni = new String[] {""} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      P006I18_A25AlbPieD = new short[1] ;
      P006I18_A827SumMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I18_A826SumKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A827SumMet = DecimalUtil.ZERO ;
      A826SumKil = DecimalUtil.ZERO ;
      A61AlbUniD = DecimalUtil.ZERO ;
      A2176HisEmpTKu = DecimalUtil.ZERO ;
      A2175HisEmpTKe = DecimalUtil.ZERO ;
      A2179HisEmpTMu = DecimalUtil.ZERO ;
      A2178HisEmpTMe = DecimalUtil.ZERO ;
      AV16Unidades = DecimalUtil.ZERO ;
      AV23Metros = DecimalUtil.ZERO ;
      AV22Kilos = DecimalUtil.ZERO ;
      P006I19_A396EmprCod = new String[] {""} ;
      P006I19_A44AlbRecCod = new int[1] ;
      P006I19_A2160HisEmpAlbD = new long[1] ;
      P006I19_n2160HisEmpAlbD = new boolean[] {false} ;
      P006I19_A2166HisEmpLTip = new String[] {""} ;
      P006I19_n2166HisEmpLTip = new boolean[] {false} ;
      P006I19_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I19_n2164HisEmpKu = new boolean[] {false} ;
      P006I19_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I19_n2169HisEmpMu = new boolean[] {false} ;
      P006I19_A2172HisEmpPu = new short[1] ;
      P006I19_n2172HisEmpPu = new boolean[] {false} ;
      P006I19_A2165HisEmpLin = new short[1] ;
      A2166HisEmpLTip = "" ;
      A2164HisEmpKu = DecimalUtil.ZERO ;
      A2169HisEmpMu = DecimalUtil.ZERO ;
      P006I23_A396EmprCod = new String[] {""} ;
      P006I23_A361DisCod = new int[1] ;
      P006I23_A44AlbRecCod = new int[1] ;
      P006I23_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I23_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I23_A380DisPieCod = new String[] {""} ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      AV31DisPieCod = "" ;
      P006I24_A396EmprCod = new String[] {""} ;
      P006I24_A44AlbRecCod = new int[1] ;
      P006I24_A2159AlbRecPie = new String[] {""} ;
      P006I24_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I24_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      P006I28_A361DisCod = new int[1] ;
      P006I28_A396EmprCod = new String[] {""} ;
      P006I28_A252CliCod = new int[1] ;
      P006I28_A44AlbRecCod = new int[1] ;
      P006I28_A2152AlbDetPie = new short[1] ;
      P006I28_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I28_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I28_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I28_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I28_A56AlbRUni = new String[] {""} ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      P006I30_A2152AlbDetPie = new short[1] ;
      P006I30_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I30_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I30_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I30_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV56AlbDetMtr = DecimalUtil.ZERO ;
      AV57AlbDetMtrU = DecimalUtil.ZERO ;
      AV58AlbDetKgm = DecimalUtil.ZERO ;
      AV59AlbDetKgmU = DecimalUtil.ZERO ;
      P006I32_A396EmprCod = new String[] {""} ;
      P006I32_A361DisCod = new int[1] ;
      P006I32_A44AlbRecCod = new int[1] ;
      P006I32_A380DisPieCod = new String[] {""} ;
      P006I32_A56AlbRUni = new String[] {""} ;
      P006I32_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I32_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I32_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I32_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I33_A396EmprCod = new String[] {""} ;
      P006I33_A44AlbRecCod = new int[1] ;
      P006I33_A2159AlbRecPie = new String[] {""} ;
      P006I34_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I34_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I34_A52AlbRPieEnt = new int[1] ;
      P006I34_A54AlbRPieUti = new int[1] ;
      P006I34_A47AlbREst = new byte[1] ;
      P006I38_A396EmprCod = new String[] {""} ;
      P006I38_A361DisCod = new int[1] ;
      P006I38_A3608DisRefAlbR = new int[1] ;
      P006I38_n3608DisRefAlbR = new boolean[] {false} ;
      P006I38_A3398DisRefBarC = new int[1] ;
      P006I38_A3399DisRefBCRe = new byte[1] ;
      P006I38_A3400DisRefBCPa = new String[] {""} ;
      P006I38_A3607DisRefBPie = new String[] {""} ;
      P006I38_A3403DisRefPie = new short[1] ;
      P006I38_n3403DisRefPie = new boolean[] {false} ;
      P006I38_A3402DisRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I38_n3402DisRefMts = new boolean[] {false} ;
      P006I38_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I38_n3401DisRefKgs = new boolean[] {false} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      AV27BarCodPar = "" ;
      AV28BarPieCod = "" ;
      AV29BarPieLoc = "" ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new short[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_char18 = new String[1] ;
      P006I39_A44AlbRecCod = new int[1] ;
      P006I39_A396EmprCod = new String[] {""} ;
      P006I39_A361DisCod = new int[1] ;
      P006I40_A56AlbRUni = new String[] {""} ;
      P006I40_A52AlbRPieEnt = new int[1] ;
      P006I40_A54AlbRPieUti = new int[1] ;
      P006I40_A47AlbREst = new byte[1] ;
      P006I40_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I40_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV47HisEmpSd = "" ;
      P006I41_A396EmprCod = new String[] {""} ;
      P006I41_A44AlbRecCod = new int[1] ;
      P006I41_A2160HisEmpAlbD = new long[1] ;
      P006I41_n2160HisEmpAlbD = new boolean[] {false} ;
      P006I41_A2173HisEmpSd = new String[] {""} ;
      P006I41_n2173HisEmpSd = new boolean[] {false} ;
      P006I41_A2163HisEmpKe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I41_n2163HisEmpKe = new boolean[] {false} ;
      P006I41_A2168HisEmpMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I41_n2168HisEmpMe = new boolean[] {false} ;
      P006I41_A2171HisEmpPe = new short[1] ;
      P006I41_n2171HisEmpPe = new boolean[] {false} ;
      P006I41_A2165HisEmpLin = new short[1] ;
      A2173HisEmpSd = "" ;
      A2163HisEmpKe = DecimalUtil.ZERO ;
      A2168HisEmpMe = DecimalUtil.ZERO ;
      P006I47_A44AlbRecCod = new int[1] ;
      P006I47_A396EmprCod = new String[] {""} ;
      P006I48_A44AlbRecCod = new int[1] ;
      P006I48_A396EmprCod = new String[] {""} ;
      P006I48_A2165HisEmpLin = new short[1] ;
      P006I50_A44AlbRecCod = new int[1] ;
      P006I50_A396EmprCod = new String[] {""} ;
      P006I50_A47AlbREst = new byte[1] ;
      P006I50_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I50_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I52_Gx_cnt = new int[1] ;
      P006I53_Gx_cnt = new int[1] ;
      X2168HisEmpMe = DecimalUtil.ZERO ;
      P006I54_A396EmprCod = new String[] {""} ;
      P006I54_A44AlbRecCod = new int[1] ;
      P006I54_A2165HisEmpLin = new short[1] ;
      P006I54_A2168HisEmpMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I54_n2168HisEmpMe = new boolean[] {false} ;
      P006I54_A2166HisEmpLTip = new String[] {""} ;
      P006I54_n2166HisEmpLTip = new boolean[] {false} ;
      X2169HisEmpMu = DecimalUtil.ZERO ;
      P006I55_A396EmprCod = new String[] {""} ;
      P006I55_A44AlbRecCod = new int[1] ;
      P006I55_A2165HisEmpLin = new short[1] ;
      P006I55_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I55_n2169HisEmpMu = new boolean[] {false} ;
      P006I55_A2166HisEmpLTip = new String[] {""} ;
      P006I55_n2166HisEmpLTip = new boolean[] {false} ;
      X2163HisEmpKe = DecimalUtil.ZERO ;
      P006I56_A396EmprCod = new String[] {""} ;
      P006I56_A44AlbRecCod = new int[1] ;
      P006I56_A2165HisEmpLin = new short[1] ;
      P006I56_A2163HisEmpKe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I56_n2163HisEmpKe = new boolean[] {false} ;
      P006I56_A2166HisEmpLTip = new String[] {""} ;
      P006I56_n2166HisEmpLTip = new boolean[] {false} ;
      X2164HisEmpKu = DecimalUtil.ZERO ;
      P006I57_A396EmprCod = new String[] {""} ;
      P006I57_A44AlbRecCod = new int[1] ;
      P006I57_A2165HisEmpLin = new short[1] ;
      P006I57_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006I57_n2164HisEmpKu = new boolean[] {false} ;
      P006I57_A2166HisEmpLTip = new String[] {""} ;
      P006I57_n2166HisEmpLTip = new boolean[] {false} ;
      P006I58_A396EmprCod = new String[] {""} ;
      P006I58_A44AlbRecCod = new int[1] ;
      P006I58_A2165HisEmpLin = new short[1] ;
      P006I58_A2171HisEmpPe = new short[1] ;
      P006I58_n2171HisEmpPe = new boolean[] {false} ;
      P006I58_A2166HisEmpLTip = new String[] {""} ;
      P006I58_n2166HisEmpLTip = new boolean[] {false} ;
      P006I59_A396EmprCod = new String[] {""} ;
      P006I59_A44AlbRecCod = new int[1] ;
      P006I59_A2165HisEmpLin = new short[1] ;
      P006I59_A2172HisEmpPu = new short[1] ;
      P006I59_n2172HisEmpPu = new boolean[] {false} ;
      P006I59_A2166HisEmpLTip = new String[] {""} ;
      P006I59_n2166HisEmpLTip = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelidis__default(),
         new Object[] {
             new Object[] {
            P006I2_A396EmprCod, P006I2_A1146DisDisCod, P006I2_A1139DisBarCod, P006I2_A1140DisBarReo, P006I2_A1141DisBarPar
            }
            , new Object[] {
            P006I3_A396EmprCod, P006I3_A361DisCod, P006I3_A5252DisAcc, P006I3_A360DisCliNum, P006I3_A374DisNumPie, P006I3_A375DisNumUni, P006I3_A392DisUniMed, P006I3_A365DisDes, P006I3_A2009DisTipDis, P006I3_n2009DisTipDis,
            P006I3_A1014DibInt, P006I3_n1014DibInt
            }
            , new Object[] {
            P006I4_A396EmprCod, P006I4_A361DisCod, P006I4_A758ProCod, P006I4_A846UltFasLin
            }
            , new Object[] {
            P006I5_A396EmprCod, P006I5_A361DisCod, P006I5_A758ProCod, P006I5_A368DisFasLin
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
            }
            , new Object[] {
            P006I11_A129BarCod, P006I11_A132BarCodReo, P006I11_A130BarCodPar, P006I11_A30AlbProCod, P006I11_A396EmprCod, P006I11_A361DisCod, P006I11_A2524DisComLin, P006I11_A1056DisComCod, P006I11_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006I15_A361DisCod, P006I15_A44AlbRecCod, P006I15_A396EmprCod, P006I15_A673Piezas, P006I15_A631Metros, P006I15_A595Kilos
            }
            , new Object[] {
            P006I16_A52AlbRPieEnt, P006I16_A54AlbRPieUti, P006I16_A47AlbREst, P006I16_A252CliCod, P006I16_A60AlbRUniUti, P006I16_A58AlbRUniEnt, P006I16_A56AlbRUni
            }
            , new Object[] {
            P006I18_A25AlbPieD, P006I18_A827SumMet, P006I18_A826SumKil
            }
            , new Object[] {
            P006I19_A396EmprCod, P006I19_A44AlbRecCod, P006I19_A2160HisEmpAlbD, P006I19_n2160HisEmpAlbD, P006I19_A2166HisEmpLTip, P006I19_n2166HisEmpLTip, P006I19_A2164HisEmpKu, P006I19_n2164HisEmpKu, P006I19_A2169HisEmpMu, P006I19_n2169HisEmpMu,
            P006I19_A2172HisEmpPu, P006I19_n2172HisEmpPu, P006I19_A2165HisEmpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006I23_A396EmprCod, P006I23_A361DisCod, P006I23_A44AlbRecCod, P006I23_A382DisPieKil, P006I23_A384DisPieMet, P006I23_A380DisPieCod
            }
            , new Object[] {
            P006I24_A396EmprCod, P006I24_A44AlbRecCod, P006I24_A2159AlbRecPie, P006I24_A2156AlbRecKgmU, P006I24_A2158AlbRecMtrU
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006I28_A361DisCod, P006I28_A396EmprCod, P006I28_A252CliCod, P006I28_A44AlbRecCod, P006I28_A2152AlbDetPie, P006I28_A2151AlbDetMtrU, P006I28_A2149AlbDetMtr, P006I28_A2148AlbDetKgmU, P006I28_A2146AlbDetKgm, P006I28_A56AlbRUni
            }
            , new Object[] {
            P006I30_A2152AlbDetPie, P006I30_A2151AlbDetMtrU, P006I30_A2149AlbDetMtr, P006I30_A2148AlbDetKgmU, P006I30_A2146AlbDetKgm
            }
            , new Object[] {
            P006I32_A396EmprCod, P006I32_A361DisCod, P006I32_A44AlbRecCod, P006I32_A380DisPieCod, P006I32_A56AlbRUni, P006I32_A2146AlbDetKgm, P006I32_A2148AlbDetKgmU, P006I32_A2149AlbDetMtr, P006I32_A2151AlbDetMtrU
            }
            , new Object[] {
            P006I33_A396EmprCod, P006I33_A44AlbRecCod, P006I33_A2159AlbRecPie
            }
            , new Object[] {
            P006I34_A58AlbRUniEnt, P006I34_A60AlbRUniUti, P006I34_A52AlbRPieEnt, P006I34_A54AlbRPieUti, P006I34_A47AlbREst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006I38_A396EmprCod, P006I38_A361DisCod, P006I38_A3608DisRefAlbR, P006I38_n3608DisRefAlbR, P006I38_A3398DisRefBarC, P006I38_A3399DisRefBCRe, P006I38_A3400DisRefBCPa, P006I38_A3607DisRefBPie, P006I38_A3403DisRefPie, P006I38_n3403DisRefPie,
            P006I38_A3402DisRefMts, P006I38_n3402DisRefMts, P006I38_A3401DisRefKgs, P006I38_n3401DisRefKgs
            }
            , new Object[] {
            P006I39_A44AlbRecCod, P006I39_A396EmprCod, P006I39_A361DisCod
            }
            , new Object[] {
            P006I40_A56AlbRUni, P006I40_A52AlbRPieEnt, P006I40_A54AlbRPieUti, P006I40_A47AlbREst, P006I40_A60AlbRUniUti, P006I40_A58AlbRUniEnt
            }
            , new Object[] {
            P006I41_A396EmprCod, P006I41_A44AlbRecCod, P006I41_A2160HisEmpAlbD, P006I41_n2160HisEmpAlbD, P006I41_A2173HisEmpSd, P006I41_n2173HisEmpSd, P006I41_A2163HisEmpKe, P006I41_n2163HisEmpKe, P006I41_A2168HisEmpMe, P006I41_n2168HisEmpMe,
            P006I41_A2171HisEmpPe, P006I41_n2171HisEmpPe, P006I41_A2165HisEmpLin
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
            }
            , new Object[] {
            P006I47_A44AlbRecCod, P006I47_A396EmprCod
            }
            , new Object[] {
            P006I48_A44AlbRecCod, P006I48_A396EmprCod, P006I48_A2165HisEmpLin
            }
            , new Object[] {
            }
            , new Object[] {
            P006I50_A44AlbRecCod, P006I50_A396EmprCod, P006I50_A47AlbREst, P006I50_A60AlbRUniUti, P006I50_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P006I52_Gx_cnt
            }
            , new Object[] {
            P006I53_Gx_cnt
            }
            , new Object[] {
            P006I54_A396EmprCod, P006I54_A44AlbRecCod, P006I54_A2165HisEmpLin, P006I54_A2168HisEmpMe, P006I54_n2168HisEmpMe, P006I54_A2166HisEmpLTip, P006I54_n2166HisEmpLTip
            }
            , new Object[] {
            P006I55_A396EmprCod, P006I55_A44AlbRecCod, P006I55_A2165HisEmpLin, P006I55_A2169HisEmpMu, P006I55_n2169HisEmpMu, P006I55_A2166HisEmpLTip, P006I55_n2166HisEmpLTip
            }
            , new Object[] {
            P006I56_A396EmprCod, P006I56_A44AlbRecCod, P006I56_A2165HisEmpLin, P006I56_A2163HisEmpKe, P006I56_n2163HisEmpKe, P006I56_A2166HisEmpLTip, P006I56_n2166HisEmpLTip
            }
            , new Object[] {
            P006I57_A396EmprCod, P006I57_A44AlbRecCod, P006I57_A2165HisEmpLin, P006I57_A2164HisEmpKu, P006I57_n2164HisEmpKu, P006I57_A2166HisEmpLTip, P006I57_n2166HisEmpLTip
            }
            , new Object[] {
            P006I58_A396EmprCod, P006I58_A44AlbRecCod, P006I58_A2165HisEmpLin, P006I58_A2171HisEmpPe, P006I58_n2171HisEmpPe, P006I58_A2166HisEmpLTip, P006I58_n2166HisEmpLTip
            }
            , new Object[] {
            P006I59_A396EmprCod, P006I59_A44AlbRecCod, P006I59_A2165HisEmpLin, P006I59_A2172HisEmpPu, P006I59_n2172HisEmpPu, P006I59_A2166HisEmpLTip, P006I59_n2166HisEmpLTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21Flag1 ;
   private byte AV24DETPIE ;
   private byte AV34Trebor ;
   private byte AV36PLinea ;
   private byte AV35Salayet ;
   private byte AV53Velta ;
   private byte AV50Erfoc ;
   private byte AV52Tejido ;
   private byte GXt_int2 ;
   private byte AV46Flag_Emp2 ;
   private byte AV32Flag_p ;
   private byte A1140DisBarReo ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A47AlbREst ;
   private byte A3399DisRefBCRe ;
   private byte AV26BarCodReo ;
   private byte GXv_int1[] ;
   private byte AV49Existe_Reg ;
   private byte AV48LinHisEmp ;
   private short A374DisNumPie ;
   private short AV40DisNumPie ;
   private short A846UltFasLin ;
   private short A368DisFasLin ;
   private short A25AlbPieD ;
   private short AV15Piezas ;
   private short A2172HisEmpPu ;
   private short A2165HisEmpLin ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short AV60AlbDetPie ;
   private short A3403DisRefPie ;
   private short AV30BarPieAnc ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int15[] ;
   private short A2171HisEmpPe ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int A1014DibInt ;
   private int W361DisCod ;
   private int A129BarCod ;
   private int AV43DisCod ;
   private int AV54DibInt ;
   private int A44AlbRecCod ;
   private int A673Piezas ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A252CliCod ;
   private int A2182HisEmpTPu ;
   private int A2181HisEmpTPe ;
   private int AV20AlbRecCod ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private int AV25BarCod ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private int X2171HisEmpPe ;
   private int X2172HisEmpPu ;
   private long A30AlbProCod ;
   private long A2160HisEmpAlbD ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV41DisNumUni ;
   private java.math.BigDecimal AV55Unid_Difo ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A827SumMet ;
   private java.math.BigDecimal A826SumKil ;
   private java.math.BigDecimal A61AlbUniD ;
   private java.math.BigDecimal A2176HisEmpTKu ;
   private java.math.BigDecimal A2175HisEmpTKe ;
   private java.math.BigDecimal A2179HisEmpTMu ;
   private java.math.BigDecimal A2178HisEmpTMe ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV23Metros ;
   private java.math.BigDecimal AV22Kilos ;
   private java.math.BigDecimal A2164HisEmpKu ;
   private java.math.BigDecimal A2169HisEmpMu ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal AV56AlbDetMtr ;
   private java.math.BigDecimal AV57AlbDetMtrU ;
   private java.math.BigDecimal AV58AlbDetKgm ;
   private java.math.BigDecimal AV59AlbDetKgmU ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal A2163HisEmpKe ;
   private java.math.BigDecimal A2168HisEmpMe ;
   private java.math.BigDecimal X2168HisEmpMe ;
   private java.math.BigDecimal X2169HisEmpMu ;
   private java.math.BigDecimal X2163HisEmpKe ;
   private java.math.BigDecimal X2164HisEmpKu ;
   private String A396EmprCod ;
   private String AV44EmprCod2 ;
   private String AV45EmprNom2 ;
   private String scmdbuf ;
   private String A1141DisBarPar ;
   private String Gx_msg ;
   private String AV51Disacc ;
   private String A5252DisAcc ;
   private String A360DisCliNum ;
   private String A392DisUniMed ;
   private String A365DisDes ;
   private String A2009DisTipDis ;
   private String AV39DisCliNum ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String AV17EmprCod ;
   private String AV18DisUniMed ;
   private String AV19DisDes ;
   private String A56AlbRUni ;
   private String A2166HisEmpLTip ;
   private String A380DisPieCod ;
   private String AV31DisPieCod ;
   private String A2159AlbRecPie ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String AV27BarCodPar ;
   private String AV28BarPieCod ;
   private String AV29BarPieLoc ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char18[] ;
   private String AV47HisEmpSd ;
   private String A2173HisEmpSd ;
   private String E396EmprCod ;
   private boolean returnInSub ;
   private boolean n2009DisTipDis ;
   private boolean n1014DibInt ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2166HisEmpLTip ;
   private boolean n2164HisEmpKu ;
   private boolean n2169HisEmpMu ;
   private boolean n2172HisEmpPu ;
   private boolean brk6I15 ;
   private boolean n3608DisRefAlbR ;
   private boolean n3403DisRefPie ;
   private boolean n3402DisRefMts ;
   private boolean n3401DisRefKgs ;
   private boolean n2173HisEmpSd ;
   private boolean n2163HisEmpKe ;
   private boolean n2168HisEmpMe ;
   private boolean n2171HisEmpPe ;
   private boolean Gx_first ;
   private boolean nX2168HisEmpMe ;
   private boolean nX2169HisEmpMu ;
   private boolean nX2163HisEmpKe ;
   private boolean nX2164HisEmpKu ;
   private boolean nX2171HisEmpPe ;
   private boolean nX2172HisEmpPu ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P006I2_A396EmprCod ;
   private int[] P006I2_A1146DisDisCod ;
   private int[] P006I2_A1139DisBarCod ;
   private byte[] P006I2_A1140DisBarReo ;
   private String[] P006I2_A1141DisBarPar ;
   private String[] P006I3_A396EmprCod ;
   private int[] P006I3_A361DisCod ;
   private String[] P006I3_A5252DisAcc ;
   private String[] P006I3_A360DisCliNum ;
   private short[] P006I3_A374DisNumPie ;
   private java.math.BigDecimal[] P006I3_A375DisNumUni ;
   private String[] P006I3_A392DisUniMed ;
   private String[] P006I3_A365DisDes ;
   private String[] P006I3_A2009DisTipDis ;
   private boolean[] P006I3_n2009DisTipDis ;
   private int[] P006I3_A1014DibInt ;
   private boolean[] P006I3_n1014DibInt ;
   private String[] P006I4_A396EmprCod ;
   private int[] P006I4_A361DisCod ;
   private String[] P006I4_A758ProCod ;
   private short[] P006I4_A846UltFasLin ;
   private String[] P006I5_A396EmprCod ;
   private int[] P006I5_A361DisCod ;
   private String[] P006I5_A758ProCod ;
   private short[] P006I5_A368DisFasLin ;
   private int[] P006I11_A129BarCod ;
   private byte[] P006I11_A132BarCodReo ;
   private String[] P006I11_A130BarCodPar ;
   private long[] P006I11_A30AlbProCod ;
   private String[] P006I11_A396EmprCod ;
   private int[] P006I11_A361DisCod ;
   private byte[] P006I11_A2524DisComLin ;
   private String[] P006I11_A1056DisComCod ;
   private String[] P006I11_A1032FonCod ;
   private int[] P006I15_A361DisCod ;
   private int[] P006I15_A44AlbRecCod ;
   private String[] P006I15_A396EmprCod ;
   private int[] P006I15_A673Piezas ;
   private java.math.BigDecimal[] P006I15_A631Metros ;
   private java.math.BigDecimal[] P006I15_A595Kilos ;
   private int[] P006I16_A52AlbRPieEnt ;
   private int[] P006I16_A54AlbRPieUti ;
   private byte[] P006I16_A47AlbREst ;
   private int[] P006I16_A252CliCod ;
   private java.math.BigDecimal[] P006I16_A60AlbRUniUti ;
   private java.math.BigDecimal[] P006I16_A58AlbRUniEnt ;
   private String[] P006I16_A56AlbRUni ;
   private short[] P006I18_A25AlbPieD ;
   private java.math.BigDecimal[] P006I18_A827SumMet ;
   private java.math.BigDecimal[] P006I18_A826SumKil ;
   private String[] P006I19_A396EmprCod ;
   private int[] P006I19_A44AlbRecCod ;
   private long[] P006I19_A2160HisEmpAlbD ;
   private boolean[] P006I19_n2160HisEmpAlbD ;
   private String[] P006I19_A2166HisEmpLTip ;
   private boolean[] P006I19_n2166HisEmpLTip ;
   private java.math.BigDecimal[] P006I19_A2164HisEmpKu ;
   private boolean[] P006I19_n2164HisEmpKu ;
   private java.math.BigDecimal[] P006I19_A2169HisEmpMu ;
   private boolean[] P006I19_n2169HisEmpMu ;
   private short[] P006I19_A2172HisEmpPu ;
   private boolean[] P006I19_n2172HisEmpPu ;
   private short[] P006I19_A2165HisEmpLin ;
   private String[] P006I23_A396EmprCod ;
   private int[] P006I23_A361DisCod ;
   private int[] P006I23_A44AlbRecCod ;
   private java.math.BigDecimal[] P006I23_A382DisPieKil ;
   private java.math.BigDecimal[] P006I23_A384DisPieMet ;
   private String[] P006I23_A380DisPieCod ;
   private String[] P006I24_A396EmprCod ;
   private int[] P006I24_A44AlbRecCod ;
   private String[] P006I24_A2159AlbRecPie ;
   private java.math.BigDecimal[] P006I24_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P006I24_A2158AlbRecMtrU ;
   private int[] P006I28_A361DisCod ;
   private String[] P006I28_A396EmprCod ;
   private int[] P006I28_A252CliCod ;
   private int[] P006I28_A44AlbRecCod ;
   private short[] P006I28_A2152AlbDetPie ;
   private java.math.BigDecimal[] P006I28_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P006I28_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P006I28_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P006I28_A2146AlbDetKgm ;
   private String[] P006I28_A56AlbRUni ;
   private short[] P006I30_A2152AlbDetPie ;
   private java.math.BigDecimal[] P006I30_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P006I30_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P006I30_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P006I30_A2146AlbDetKgm ;
   private String[] P006I32_A396EmprCod ;
   private int[] P006I32_A361DisCod ;
   private int[] P006I32_A44AlbRecCod ;
   private String[] P006I32_A380DisPieCod ;
   private String[] P006I32_A56AlbRUni ;
   private java.math.BigDecimal[] P006I32_A2146AlbDetKgm ;
   private java.math.BigDecimal[] P006I32_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P006I32_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P006I32_A2151AlbDetMtrU ;
   private String[] P006I33_A396EmprCod ;
   private int[] P006I33_A44AlbRecCod ;
   private String[] P006I33_A2159AlbRecPie ;
   private java.math.BigDecimal[] P006I34_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P006I34_A60AlbRUniUti ;
   private int[] P006I34_A52AlbRPieEnt ;
   private int[] P006I34_A54AlbRPieUti ;
   private byte[] P006I34_A47AlbREst ;
   private String[] P006I38_A396EmprCod ;
   private int[] P006I38_A361DisCod ;
   private int[] P006I38_A3608DisRefAlbR ;
   private boolean[] P006I38_n3608DisRefAlbR ;
   private int[] P006I38_A3398DisRefBarC ;
   private byte[] P006I38_A3399DisRefBCRe ;
   private String[] P006I38_A3400DisRefBCPa ;
   private String[] P006I38_A3607DisRefBPie ;
   private short[] P006I38_A3403DisRefPie ;
   private boolean[] P006I38_n3403DisRefPie ;
   private java.math.BigDecimal[] P006I38_A3402DisRefMts ;
   private boolean[] P006I38_n3402DisRefMts ;
   private java.math.BigDecimal[] P006I38_A3401DisRefKgs ;
   private boolean[] P006I38_n3401DisRefKgs ;
   private int[] P006I39_A44AlbRecCod ;
   private String[] P006I39_A396EmprCod ;
   private int[] P006I39_A361DisCod ;
   private String[] P006I40_A56AlbRUni ;
   private int[] P006I40_A52AlbRPieEnt ;
   private int[] P006I40_A54AlbRPieUti ;
   private byte[] P006I40_A47AlbREst ;
   private java.math.BigDecimal[] P006I40_A60AlbRUniUti ;
   private java.math.BigDecimal[] P006I40_A58AlbRUniEnt ;
   private String[] P006I41_A396EmprCod ;
   private int[] P006I41_A44AlbRecCod ;
   private long[] P006I41_A2160HisEmpAlbD ;
   private boolean[] P006I41_n2160HisEmpAlbD ;
   private String[] P006I41_A2173HisEmpSd ;
   private boolean[] P006I41_n2173HisEmpSd ;
   private java.math.BigDecimal[] P006I41_A2163HisEmpKe ;
   private boolean[] P006I41_n2163HisEmpKe ;
   private java.math.BigDecimal[] P006I41_A2168HisEmpMe ;
   private boolean[] P006I41_n2168HisEmpMe ;
   private short[] P006I41_A2171HisEmpPe ;
   private boolean[] P006I41_n2171HisEmpPe ;
   private short[] P006I41_A2165HisEmpLin ;
   private int[] P006I47_A44AlbRecCod ;
   private String[] P006I47_A396EmprCod ;
   private int[] P006I48_A44AlbRecCod ;
   private String[] P006I48_A396EmprCod ;
   private short[] P006I48_A2165HisEmpLin ;
   private int[] P006I50_A44AlbRecCod ;
   private String[] P006I50_A396EmprCod ;
   private byte[] P006I50_A47AlbREst ;
   private java.math.BigDecimal[] P006I50_A60AlbRUniUti ;
   private java.math.BigDecimal[] P006I50_A58AlbRUniEnt ;
   private int[] P006I52_Gx_cnt ;
   private int[] P006I53_Gx_cnt ;
   private String[] P006I54_A396EmprCod ;
   private int[] P006I54_A44AlbRecCod ;
   private short[] P006I54_A2165HisEmpLin ;
   private java.math.BigDecimal[] P006I54_A2168HisEmpMe ;
   private boolean[] P006I54_n2168HisEmpMe ;
   private String[] P006I54_A2166HisEmpLTip ;
   private boolean[] P006I54_n2166HisEmpLTip ;
   private String[] P006I55_A396EmprCod ;
   private int[] P006I55_A44AlbRecCod ;
   private short[] P006I55_A2165HisEmpLin ;
   private java.math.BigDecimal[] P006I55_A2169HisEmpMu ;
   private boolean[] P006I55_n2169HisEmpMu ;
   private String[] P006I55_A2166HisEmpLTip ;
   private boolean[] P006I55_n2166HisEmpLTip ;
   private String[] P006I56_A396EmprCod ;
   private int[] P006I56_A44AlbRecCod ;
   private short[] P006I56_A2165HisEmpLin ;
   private java.math.BigDecimal[] P006I56_A2163HisEmpKe ;
   private boolean[] P006I56_n2163HisEmpKe ;
   private String[] P006I56_A2166HisEmpLTip ;
   private boolean[] P006I56_n2166HisEmpLTip ;
   private String[] P006I57_A396EmprCod ;
   private int[] P006I57_A44AlbRecCod ;
   private short[] P006I57_A2165HisEmpLin ;
   private java.math.BigDecimal[] P006I57_A2164HisEmpKu ;
   private boolean[] P006I57_n2164HisEmpKu ;
   private String[] P006I57_A2166HisEmpLTip ;
   private boolean[] P006I57_n2166HisEmpLTip ;
   private String[] P006I58_A396EmprCod ;
   private int[] P006I58_A44AlbRecCod ;
   private short[] P006I58_A2165HisEmpLin ;
   private short[] P006I58_A2171HisEmpPe ;
   private boolean[] P006I58_n2171HisEmpPe ;
   private String[] P006I58_A2166HisEmpLTip ;
   private boolean[] P006I58_n2166HisEmpLTip ;
   private String[] P006I59_A396EmprCod ;
   private int[] P006I59_A44AlbRecCod ;
   private short[] P006I59_A2165HisEmpLin ;
   private short[] P006I59_A2172HisEmpPu ;
   private boolean[] P006I59_n2172HisEmpPu ;
   private String[] P006I59_A2166HisEmpLTip ;
   private boolean[] P006I59_n2166HisEmpLTip ;
}

final  class pelidis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006I2", "SELECT EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ORDER BY EmprCod, DisDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I3", "SELECT EmprCod, DisCod, DisAcc, DisCliNum, DisNumPie, DisNumUni, DisUniMed, DisDes, DisTipDis, DibInt FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006I4", "SELECT EmprCod, DisCod, ProCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I5", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006I6", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P006I7", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P006I8", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P006I9", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P006I10", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new ForEachCursor("P006I11", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod, T1.EmprCod, T2.DisCod, T1.DisComLin, T1.DisComCod, T1.FonCod FROM ((TXPALBEST T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T2.DisCod = ?) ORDER BY T1.EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006I12", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new UpdateCursor("P006I13", "DELETE FROM TXPDISNOR  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISNOR")
         ,new UpdateCursor("P006I14", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P006I15", "SELECT DisCod, AlbRecCod, EmprCod, Piezas, Metros, Kilos FROM TXPDISALB WHERE (EmprCod = ? AND DisCod = ?) AND (EmprCod = ? and DisCod = ?) ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I16", "SELECT AlbRPieEnt, AlbRPieUti, AlbREst, CliCod, AlbRUniUti, AlbRUniEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I18", "SELECT COALESCE( T1.AlbPieD, 0) AS AlbPieD, COALESCE( T1.SumMet, 0) AS SumMet, COALESCE( T1.SumKil, 0) AS SumKil FROM (SELECT COUNT(*) AS AlbPieD, EmprCod, DisCod, AlbRecCod, SUM(DisPieKil) AS SumKil, SUM(DisPieMet) AS SumMet FROM TXPDISALD GROUP BY EmprCod, DisCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? AND T1.AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I19", "SELECT EmprCod, AlbRecCod, HisEmpAlbD, HisEmpLTip, HisEmpKu, HisEmpMu, HisEmpPu, HisEmpLin FROM TXPHISEMP WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpAlbD = ?) ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006I20", "DELETE FROM TXPHISEMP  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P006I21", "DELETE FROM TXPHISEMP  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P006I22", "UPDATE TXPHISEMP SET HisEmpKu=?, HisEmpMu=?, HisEmpPu=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new ForEachCursor("P006I23", "SELECT EmprCod, DisCod, AlbRecCod, DisPieKil, DisPieMet, DisPieCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I24", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgmU, AlbRecMtrU FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006I25", "UPDATE TXPALBDET SET AlbRecKgmU=?, AlbRecMtrU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P006I26", "UPDATE TXPALBREC SET AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?, AlbRUniUti=?, AlbRUniEnt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P006I28", "SELECT T1.DisCod, T1.EmprCod, T2.CliCod, T1.AlbRecCod, COALESCE( T3.GXC2, 0) AS AlbDetPie, COALESCE( T3.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T3.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T3.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T3.AlbDetKgm, 0) AS AlbDetKgm, T2.AlbRUni FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU, COUNT(*) AS GXC2 FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I30", "SELECT COALESCE( T1.GXC2, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm FROM (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU, COUNT(*) AS GXC2 FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I32", "SELECT T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.DisPieCod, T2.AlbRUni, COALESCE( T3.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T3.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T3.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T3.AlbDetMtrU, 0) AS AlbDetMtrU FROM ((TXPDISALD T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.DisPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I33", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE (EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) AND (EmprCod = ? and AlbRecCod = ? and AlbRecPie = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006I34", "SELECT AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006I35", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P006I36", "DELETE FROM TXPDISALD  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P006I37", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P006I38", "SELECT EmprCod, DisCod, DisRefAlbR, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie, DisRefPie, DisRefMts, DisRefKgs FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I39", "SELECT AlbRecCod, EmprCod, DisCod FROM TXPDISALB WHERE (EmprCod = ? AND DisCod = ?) AND (EmprCod = ? and DisCod = ?) ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I40", "SELECT AlbRUni, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I41", "SELECT EmprCod, AlbRecCod, HisEmpAlbD, HisEmpSd, HisEmpKe, HisEmpMe, HisEmpPe, HisEmpLin FROM TXPHISEMP WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpSd = ?) AND (HisEmpAlbD = ?) ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006I42", "DELETE FROM TXPHISEMP  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P006I43", "DELETE FROM TXPHISEMP  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P006I44", "UPDATE TXPHISEMP SET HisEmpKe=?, HisEmpMe=?, HisEmpPe=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P006I45", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P006I46", "UPDATE TXPALBREC SET AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?, AlbRUniUti=?, AlbRUniEnt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P006I47", "SELECT AlbRecCod, EmprCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006I48", "SELECT * FROM (SELECT AlbRecCod, EmprCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006I49", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P006I50", "SELECT AlbRecCod, EmprCod, AlbREst, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006I51", "UPDATE TXPALBREC SET AlbREst=?, AlbRUniUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P006I52", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006I53", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006I54", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpMe, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I55", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpMu, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I56", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpKe, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I57", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpKu, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I58", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpPe, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006I59", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpPu, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               return;
            case 25 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 28 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               return;
            case 41 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 42 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 46 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 47 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 22 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 38 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 40 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 45 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

