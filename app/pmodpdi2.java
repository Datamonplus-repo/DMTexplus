package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpdi2 extends GXProcedure
{
   public pmodpdi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpdi2.class ), "" );
   }

   public pmodpdi2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 )
   {
      pmodpdi2.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pmodpdi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpdi2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pmodpdi2.this.AV15AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pmodpdi2.this.AV16BarPieCod = aP3[0];
      this.aP3 = aP3;
      pmodpdi2.this.AV17BarPieKil = aP4[0];
      this.aP4 = aP4;
      pmodpdi2.this.AV18BarPieKA = aP5[0];
      this.aP5 = aP5;
      pmodpdi2.this.AV19BarPieMet = aP6[0];
      this.aP6 = aP6;
      pmodpdi2.this.AV20BarPieMA = aP7[0];
      this.aP7 = aP7;
      pmodpdi2.this.AV21BarPiePie = aP8[0];
      this.aP8 = aP8;
      pmodpdi2.this.AV22BarPiePA = aP9[0];
      this.aP9 = aP9;
      pmodpdi2.this.AV23Desglose = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29PLinea = (byte)(0) ;
      GXv_int1[0] = AV29PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pmodpdi2.this.AV29PLinea = GXv_int1[0] ;
      if ( GXutil.strcmp(AV23Desglose, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P011G2 */
         pr_default.execute(0, new Object[] {AV20BarPieMA, AV19BarPieMet, AV18BarPieKA, AV17BarPieKil, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV15AlbRecCod), AV16BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         /* End optimized UPDATE. */
         /* Optimized UPDATE. */
         /* Using cursor P011G3 */
         pr_default.execute(1, new Object[] {AV20BarPieMA, AV19BarPieMet, AV18BarPieKA, AV17BarPieKil, Integer.valueOf(AV22BarPiePA), Integer.valueOf(AV21BarPiePie), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV15AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* End optimized UPDATE. */
         /* Using cursor P011G5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A374DisNumPie = P011G5_A374DisNumPie[0] ;
            A392DisUniMed = P011G5_A392DisUniMed[0] ;
            A375DisNumUni = P011G5_A375DisNumUni[0] ;
            A252CliCod = P011G5_A252CliCod[0] ;
            A387DisPiePie = P011G5_A387DisPiePie[0] ;
            n387DisPiePie = P011G5_n387DisPiePie[0] ;
            A365DisDes = P011G5_A365DisDes[0] ;
            A387DisPiePie = P011G5_A387DisPiePie[0] ;
            n387DisPiePie = P011G5_n387DisPiePie[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
               }
            }
            A374DisNumPie = A387DisPiePie ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               A375DisNumUni = A385DisPieMtr ;
            }
            else
            {
               A375DisNumUni = A381DisPieKgm ;
            }
            AV27CliCod = A252CliCod ;
            /* Using cursor P011G6 */
            pr_default.execute(3, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else
      {
         /* Optimized UPDATE. */
         /* Using cursor P011G7 */
         pr_default.execute(4, new Object[] {AV20BarPieMA, AV19BarPieMet, AV18BarPieKA, AV17BarPieKil, Integer.valueOf(AV22BarPiePA), Integer.valueOf(AV21BarPiePie), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV15AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* End optimized UPDATE. */
         /* Using cursor P011G9 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A375DisNumUni = P011G9_A375DisNumUni[0] ;
            A1013DibCli = P011G9_A1013DibCli[0] ;
            n1013DibCli = P011G9_n1013DibCli[0] ;
            A252CliCod = P011G9_A252CliCod[0] ;
            A1014DibInt = P011G9_A1014DibInt[0] ;
            n1014DibInt = P011G9_n1014DibInt[0] ;
            A374DisNumPie = P011G9_A374DisNumPie[0] ;
            A379DisPie = P011G9_A379DisPie[0] ;
            n379DisPie = P011G9_n379DisPie[0] ;
            A392DisUniMed = P011G9_A392DisUniMed[0] ;
            A379DisPie = P011G9_A379DisPie[0] ;
            n379DisPie = P011G9_n379DisPie[0] ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
               {
                  A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A391DisUni = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( AV29PLinea == 1 )
            {
               AV30DisNumUni = A375DisNumUni ;
               GXv_char2[0] = A396EmprCod ;
               GXv_char3[0] = A1013DibCli ;
               GXv_int4[0] = A252CliCod ;
               GXv_int5[0] = A1014DibInt ;
               GXv_decimal6[0] = A391DisUni ;
               GXv_decimal7[0] = AV30DisNumUni ;
               new app.psumtes(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_decimal6, GXv_decimal7) ;
               pmodpdi2.this.A396EmprCod = GXv_char2[0] ;
               pmodpdi2.this.A1013DibCli = GXv_char3[0] ;
               pmodpdi2.this.A252CliCod = GXv_int4[0] ;
               pmodpdi2.this.A1014DibInt = GXv_int5[0] ;
               pmodpdi2.this.A391DisUni = GXv_decimal6[0] ;
               pmodpdi2.this.AV30DisNumUni = GXv_decimal7[0] ;
            }
            A374DisNumPie = A379DisPie ;
            A375DisNumUni = A391DisUni ;
            /* Using cursor P011G10 */
            pr_default.execute(6, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      GXv_int1[0] = AV24Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pmodpdi2.this.AV24Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV28Trebor ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TREBOR", ""), GXv_int1) ;
      pmodpdi2.this.AV28Trebor = GXv_int1[0] ;
      AV26EnStki = httpContext.getMessage( "N", "") ;
      /* Using cursor P011G11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), AV16BarPieCod, Integer.valueOf(AV15AlbRecCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A3607DisRefBPie = P011G11_A3607DisRefBPie[0] ;
         A3400DisRefBCPa = P011G11_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = P011G11_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = P011G11_A3398DisRefBarC[0] ;
         A392DisUniMed = P011G11_A392DisUniMed[0] ;
         A3608DisRefAlbR = P011G11_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P011G11_n3608DisRefAlbR[0] ;
         A3401DisRefKgs = P011G11_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P011G11_n3401DisRefKgs[0] ;
         A3402DisRefMts = P011G11_A3402DisRefMts[0] ;
         n3402DisRefMts = P011G11_n3402DisRefMts[0] ;
         A3403DisRefPie = P011G11_A3403DisRefPie[0] ;
         n3403DisRefPie = P011G11_n3403DisRefPie[0] ;
         A392DisUniMed = P011G11_A392DisUniMed[0] ;
         A3401DisRefKgs = A3401DisRefKgs.subtract(AV18BarPieKA).add(AV17BarPieKil) ;
         n3401DisRefKgs = false ;
         A3402DisRefMts = A3402DisRefMts.subtract(AV20BarPieMA).add(AV19BarPieMet) ;
         n3402DisRefMts = false ;
         if ( GXutil.strcmp(AV23Desglose, httpContext.getMessage( "N", "")) == 0 )
         {
            A3403DisRefPie = (short)(A3403DisRefPie-AV22BarPiePA+AV21BarPiePie) ;
            n3403DisRefPie = false ;
         }
         /* Using cursor P011G12 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A200BarPieCod = P011G12_A200BarPieCod[0] ;
            A130BarCodPar = P011G12_A130BarCodPar[0] ;
            A132BarCodReo = P011G12_A132BarCodReo[0] ;
            A129BarCod = P011G12_A129BarCod[0] ;
            A183BarMetLan = P011G12_A183BarMetLan[0] ;
            A170BarKilLan = P011G12_A170BarKilLan[0] ;
            A1271BarPieLzd = P011G12_A1271BarPieLzd[0] ;
            A1501BarPiePie = P011G12_A1501BarPiePie[0] ;
            A205BarPieMet = P011G12_A205BarPieMet[0] ;
            A203BarPieKil = P011G12_A203BarPieKil[0] ;
            A183BarMetLan = A183BarMetLan.subtract(AV20BarPieMA).add(AV19BarPieMet) ;
            A170BarKilLan = A170BarKilLan.subtract(AV18BarPieKA).add(AV17BarPieKil) ;
            A1271BarPieLzd = (int)(A1271BarPieLzd-AV22BarPiePA+AV21BarPiePie) ;
            if ( A1271BarPieLzd > A1501BarPiePie )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Dispuso más piezas que las existentes en stock intermedio", ""));
            }
            if ( ( DecimalUtil.compareTo(A183BarMetLan, A205BarPieMet) > 0 ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Dispuso más metros que los existentes en stock intermedio", ""));
            }
            if ( ( DecimalUtil.compareTo(A170BarKilLan, A203BarPieKil) > 0 ) && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Dispuso más kilos que los existentes en stock intermedio", ""));
            }
            /* Using cursor P011G13 */
            pr_default.execute(9, new Object[] {A183BarMetLan, A170BarKilLan, Integer.valueOf(A1271BarPieLzd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         AV26EnStki = httpContext.getMessage( "S", "") ;
         /* Using cursor P011G14 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n3401DisRefKgs), A3401DisRefKgs, Boolean.valueOf(n3402DisRefMts), A3402DisRefMts, Boolean.valueOf(n3403DisRefPie), Short.valueOf(A3403DisRefPie), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( GXutil.strcmp(AV26EnStki, httpContext.getMessage( "N", "")) == 0 )
      {
         if ( ( AV24Flag1 == 1 ) || ( ( AV28Trebor == 1 ) && ( AV27CliCod == 2203 ) ) )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int5[0] = AV15AlbRecCod ;
            GXv_char2[0] = AV16BarPieCod ;
            GXv_decimal7[0] = AV17BarPieKil ;
            GXv_decimal6[0] = AV19BarPieMet ;
            GXv_decimal8[0] = AV18BarPieKA ;
            GXv_decimal9[0] = AV20BarPieMA ;
            GXv_char10[0] = httpContext.getMessage( "UPD", "") ;
            new app.pdetpie(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char2, GXv_decimal7, GXv_decimal6, GXv_decimal8, GXv_decimal9, GXv_char10) ;
            pmodpdi2.this.A396EmprCod = GXv_char3[0] ;
            pmodpdi2.this.AV15AlbRecCod = GXv_int5[0] ;
            pmodpdi2.this.AV16BarPieCod = GXv_char2[0] ;
            pmodpdi2.this.AV17BarPieKil = GXv_decimal7[0] ;
            pmodpdi2.this.AV19BarPieMet = GXv_decimal6[0] ;
            pmodpdi2.this.AV18BarPieKA = GXv_decimal8[0] ;
            pmodpdi2.this.AV20BarPieMA = GXv_decimal9[0] ;
         }
         else
         {
            /* Using cursor P011G15 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbRecCod)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A44AlbRecCod = P011G15_A44AlbRecCod[0] ;
               A56AlbRUni = P011G15_A56AlbRUni[0] ;
               A60AlbRUniUti = P011G15_A60AlbRUniUti[0] ;
               A54AlbRPieUti = P011G15_A54AlbRPieUti[0] ;
               A58AlbRUniEnt = P011G15_A58AlbRUniEnt[0] ;
               A52AlbRPieEnt = P011G15_A52AlbRPieEnt[0] ;
               A47AlbREst = P011G15_A47AlbREst[0] ;
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
               {
                  A60AlbRUniUti = A60AlbRUniUti.subtract(AV20BarPieMA).add(AV19BarPieMet) ;
               }
               else
               {
                  A60AlbRUniUti = A60AlbRUniUti.subtract(AV18BarPieKA).add(AV17BarPieKil) ;
               }
               A54AlbRPieUti = (int)(A54AlbRPieUti-AV22BarPiePA+AV21BarPiePie) ;
               if ( ( A52AlbRPieEnt == A54AlbRPieUti ) && ( DecimalUtil.compareTo(A58AlbRUniEnt, A60AlbRUniUti) == 0 ) )
               {
                  A47AlbREst = (byte)(1) ;
               }
               else
               {
                  A47AlbREst = (byte)(0) ;
               }
               if ( ( ( ( A52AlbRPieEnt - A54AlbRPieUti ) < 0 ) && ( A52AlbRPieEnt > 0 ) ) || ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && ( A58AlbRUniEnt.doubleValue() > 0 ) ) )
               {
                  A47AlbREst = (byte)(1) ;
               }
               /* Using cursor P011G16 */
               pr_default.execute(12, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(11);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpdi2.this.A396EmprCod;
      this.aP1[0] = pmodpdi2.this.A361DisCod;
      this.aP2[0] = pmodpdi2.this.AV15AlbRecCod;
      this.aP3[0] = pmodpdi2.this.AV16BarPieCod;
      this.aP4[0] = pmodpdi2.this.AV17BarPieKil;
      this.aP5[0] = pmodpdi2.this.AV18BarPieKA;
      this.aP6[0] = pmodpdi2.this.AV19BarPieMet;
      this.aP7[0] = pmodpdi2.this.AV20BarPieMA;
      this.aP8[0] = pmodpdi2.this.AV21BarPiePie;
      this.aP9[0] = pmodpdi2.this.AV22BarPiePA;
      this.aP10[0] = pmodpdi2.this.AV23Desglose;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpdi2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisUni1( String E396EmprCod ,
                                           int E361DisCod )
   {
      X631Metros = DecimalUtil.ZERO ;
      /* Using cursor P011G17 */
      pr_default.execute(13, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         X631Metros = P011G17_A631Metros[0] ;
      }
      pr_default.close(13);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisUni0( String E396EmprCod ,
                                           int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P011G18 */
      pr_default.execute(14, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         X595Kilos = P011G18_A595Kilos[0] ;
      }
      pr_default.close(14);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P011G19 */
      pr_default.execute(15, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         X631Metros = P011G19_A631Metros[0] ;
      }
      pr_default.close(15);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P011G20 */
      pr_default.execute(16, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         X384DisPieMet = P011G20_A384DisPieMet[0] ;
      }
      pr_default.close(16);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P011G21 */
      pr_default.execute(17, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         X595Kilos = P011G21_A595Kilos[0] ;
      }
      pr_default.close(17);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P011G22 */
      pr_default.execute(18, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         X382DisPieKil = P011G22_A382DisPieKil[0] ;
      }
      pr_default.close(18);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P011G5_A396EmprCod = new String[] {""} ;
      P011G5_A361DisCod = new int[1] ;
      P011G5_A374DisNumPie = new short[1] ;
      P011G5_A392DisUniMed = new String[] {""} ;
      P011G5_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G5_A252CliCod = new int[1] ;
      P011G5_A387DisPiePie = new short[1] ;
      P011G5_n387DisPiePie = new boolean[] {false} ;
      P011G5_A365DisDes = new String[] {""} ;
      A392DisUniMed = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      P011G9_A396EmprCod = new String[] {""} ;
      P011G9_A361DisCod = new int[1] ;
      P011G9_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G9_A1013DibCli = new String[] {""} ;
      P011G9_n1013DibCli = new boolean[] {false} ;
      P011G9_A252CliCod = new int[1] ;
      P011G9_A1014DibInt = new int[1] ;
      P011G9_n1014DibInt = new boolean[] {false} ;
      P011G9_A374DisNumPie = new short[1] ;
      P011G9_A379DisPie = new short[1] ;
      P011G9_n379DisPie = new boolean[] {false} ;
      P011G9_A392DisUniMed = new String[] {""} ;
      A1013DibCli = "" ;
      A391DisUni = DecimalUtil.ZERO ;
      AV30DisNumUni = DecimalUtil.ZERO ;
      GXv_int4 = new int[1] ;
      GXv_int1 = new byte[1] ;
      AV26EnStki = "" ;
      P011G11_A396EmprCod = new String[] {""} ;
      P011G11_A361DisCod = new int[1] ;
      P011G11_A3607DisRefBPie = new String[] {""} ;
      P011G11_A3400DisRefBCPa = new String[] {""} ;
      P011G11_A3399DisRefBCRe = new byte[1] ;
      P011G11_A3398DisRefBarC = new int[1] ;
      P011G11_A392DisUniMed = new String[] {""} ;
      P011G11_A3608DisRefAlbR = new int[1] ;
      P011G11_n3608DisRefAlbR = new boolean[] {false} ;
      P011G11_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G11_n3401DisRefKgs = new boolean[] {false} ;
      P011G11_A3402DisRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G11_n3402DisRefMts = new boolean[] {false} ;
      P011G11_A3403DisRefPie = new short[1] ;
      P011G11_n3403DisRefPie = new boolean[] {false} ;
      A3607DisRefBPie = "" ;
      A3400DisRefBCPa = "" ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      P011G12_A396EmprCod = new String[] {""} ;
      P011G12_A200BarPieCod = new String[] {""} ;
      P011G12_A130BarCodPar = new String[] {""} ;
      P011G12_A132BarCodReo = new byte[1] ;
      P011G12_A129BarCod = new int[1] ;
      P011G12_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G12_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G12_A1271BarPieLzd = new int[1] ;
      P011G12_A1501BarPiePie = new int[1] ;
      P011G12_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G12_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char10 = new String[1] ;
      P011G15_A396EmprCod = new String[] {""} ;
      P011G15_A44AlbRecCod = new int[1] ;
      P011G15_A56AlbRUni = new String[] {""} ;
      P011G15_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G15_A54AlbRPieUti = new int[1] ;
      P011G15_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G15_A52AlbRPieEnt = new int[1] ;
      P011G15_A47AlbREst = new byte[1] ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      X631Metros = DecimalUtil.ZERO ;
      P011G17_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      P011G18_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G19_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P011G20_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011G21_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P011G22_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpdi2__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P011G5_A396EmprCod, P011G5_A361DisCod, P011G5_A374DisNumPie, P011G5_A392DisUniMed, P011G5_A375DisNumUni, P011G5_A252CliCod, P011G5_A387DisPiePie, P011G5_n387DisPiePie, P011G5_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P011G9_A396EmprCod, P011G9_A361DisCod, P011G9_A375DisNumUni, P011G9_A1013DibCli, P011G9_n1013DibCli, P011G9_A252CliCod, P011G9_A1014DibInt, P011G9_n1014DibInt, P011G9_A374DisNumPie, P011G9_A379DisPie,
            P011G9_n379DisPie, P011G9_A392DisUniMed
            }
            , new Object[] {
            }
            , new Object[] {
            P011G11_A396EmprCod, P011G11_A361DisCod, P011G11_A3607DisRefBPie, P011G11_A3400DisRefBCPa, P011G11_A3399DisRefBCRe, P011G11_A3398DisRefBarC, P011G11_A392DisUniMed, P011G11_A3608DisRefAlbR, P011G11_n3608DisRefAlbR, P011G11_A3401DisRefKgs,
            P011G11_n3401DisRefKgs, P011G11_A3402DisRefMts, P011G11_n3402DisRefMts, P011G11_A3403DisRefPie, P011G11_n3403DisRefPie
            }
            , new Object[] {
            P011G12_A396EmprCod, P011G12_A200BarPieCod, P011G12_A130BarCodPar, P011G12_A132BarCodReo, P011G12_A129BarCod, P011G12_A183BarMetLan, P011G12_A170BarKilLan, P011G12_A1271BarPieLzd, P011G12_A1501BarPiePie, P011G12_A205BarPieMet,
            P011G12_A203BarPieKil
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P011G15_A396EmprCod, P011G15_A44AlbRecCod, P011G15_A56AlbRUni, P011G15_A60AlbRUniUti, P011G15_A54AlbRPieUti, P011G15_A58AlbRUniEnt, P011G15_A52AlbRPieEnt, P011G15_A47AlbREst
            }
            , new Object[] {
            }
            , new Object[] {
            P011G17_A631Metros
            }
            , new Object[] {
            P011G18_A595Kilos
            }
            , new Object[] {
            P011G19_A631Metros
            }
            , new Object[] {
            P011G20_A384DisPieMet
            }
            , new Object[] {
            P011G21_A595Kilos
            }
            , new Object[] {
            P011G22_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29PLinea ;
   private byte AV24Flag1 ;
   private byte AV28Trebor ;
   private byte GXv_int1[] ;
   private byte A3399DisRefBCRe ;
   private byte A132BarCodReo ;
   private byte A47AlbREst ;
   private short A374DisNumPie ;
   private short A387DisPiePie ;
   private short A379DisPie ;
   private short A3403DisRefPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV15AlbRecCod ;
   private int AV21BarPiePie ;
   private int AV22BarPiePA ;
   private int A252CliCod ;
   private int AV27CliCod ;
   private int A1014DibInt ;
   private int GXv_int4[] ;
   private int A3398DisRefBarC ;
   private int A3608DisRefAlbR ;
   private int A129BarCod ;
   private int A1271BarPieLzd ;
   private int A1501BarPiePie ;
   private int GXv_int5[] ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int E361DisCod ;
   private java.math.BigDecimal AV17BarPieKil ;
   private java.math.BigDecimal AV18BarPieKA ;
   private java.math.BigDecimal AV19BarPieMet ;
   private java.math.BigDecimal AV20BarPieMA ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A391DisUni ;
   private java.math.BigDecimal AV30DisNumUni ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X382DisPieKil ;
   private String A396EmprCod ;
   private String AV16BarPieCod ;
   private String AV23Desglose ;
   private String scmdbuf ;
   private String A392DisUniMed ;
   private String A365DisDes ;
   private String A1013DibCli ;
   private String AV26EnStki ;
   private String A3607DisRefBPie ;
   private String A3400DisRefBCPa ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String A56AlbRUni ;
   private String E396EmprCod ;
   private boolean n387DisPiePie ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n379DisPie ;
   private boolean n3608DisRefAlbR ;
   private boolean n3401DisRefKgs ;
   private boolean n3402DisRefMts ;
   private boolean n3403DisRefPie ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P011G5_A396EmprCod ;
   private int[] P011G5_A361DisCod ;
   private short[] P011G5_A374DisNumPie ;
   private String[] P011G5_A392DisUniMed ;
   private java.math.BigDecimal[] P011G5_A375DisNumUni ;
   private int[] P011G5_A252CliCod ;
   private short[] P011G5_A387DisPiePie ;
   private boolean[] P011G5_n387DisPiePie ;
   private String[] P011G5_A365DisDes ;
   private String[] P011G9_A396EmprCod ;
   private int[] P011G9_A361DisCod ;
   private java.math.BigDecimal[] P011G9_A375DisNumUni ;
   private String[] P011G9_A1013DibCli ;
   private boolean[] P011G9_n1013DibCli ;
   private int[] P011G9_A252CliCod ;
   private int[] P011G9_A1014DibInt ;
   private boolean[] P011G9_n1014DibInt ;
   private short[] P011G9_A374DisNumPie ;
   private short[] P011G9_A379DisPie ;
   private boolean[] P011G9_n379DisPie ;
   private String[] P011G9_A392DisUniMed ;
   private String[] P011G11_A396EmprCod ;
   private int[] P011G11_A361DisCod ;
   private String[] P011G11_A3607DisRefBPie ;
   private String[] P011G11_A3400DisRefBCPa ;
   private byte[] P011G11_A3399DisRefBCRe ;
   private int[] P011G11_A3398DisRefBarC ;
   private String[] P011G11_A392DisUniMed ;
   private int[] P011G11_A3608DisRefAlbR ;
   private boolean[] P011G11_n3608DisRefAlbR ;
   private java.math.BigDecimal[] P011G11_A3401DisRefKgs ;
   private boolean[] P011G11_n3401DisRefKgs ;
   private java.math.BigDecimal[] P011G11_A3402DisRefMts ;
   private boolean[] P011G11_n3402DisRefMts ;
   private short[] P011G11_A3403DisRefPie ;
   private boolean[] P011G11_n3403DisRefPie ;
   private String[] P011G12_A396EmprCod ;
   private String[] P011G12_A200BarPieCod ;
   private String[] P011G12_A130BarCodPar ;
   private byte[] P011G12_A132BarCodReo ;
   private int[] P011G12_A129BarCod ;
   private java.math.BigDecimal[] P011G12_A183BarMetLan ;
   private java.math.BigDecimal[] P011G12_A170BarKilLan ;
   private int[] P011G12_A1271BarPieLzd ;
   private int[] P011G12_A1501BarPiePie ;
   private java.math.BigDecimal[] P011G12_A205BarPieMet ;
   private java.math.BigDecimal[] P011G12_A203BarPieKil ;
   private String[] P011G15_A396EmprCod ;
   private int[] P011G15_A44AlbRecCod ;
   private String[] P011G15_A56AlbRUni ;
   private java.math.BigDecimal[] P011G15_A60AlbRUniUti ;
   private int[] P011G15_A54AlbRPieUti ;
   private java.math.BigDecimal[] P011G15_A58AlbRUniEnt ;
   private int[] P011G15_A52AlbRPieEnt ;
   private byte[] P011G15_A47AlbREst ;
   private java.math.BigDecimal[] P011G17_A631Metros ;
   private java.math.BigDecimal[] P011G18_A595Kilos ;
   private java.math.BigDecimal[] P011G19_A631Metros ;
   private java.math.BigDecimal[] P011G20_A384DisPieMet ;
   private java.math.BigDecimal[] P011G21_A595Kilos ;
   private java.math.BigDecimal[] P011G22_A382DisPieKil ;
}

final  class pmodpdi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P011G2", "UPDATE TXPDISALD SET DisPieMet=DisPieMet - ? + ?, DisPieKil=DisPieKil - ? + ?  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P011G3", "UPDATE TXPDISALB SET Metros=Metros - ? + ?, Kilos=Kilos - ? + ?, Piezas=Piezas - ? + ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P011G5", "SELECT T1.EmprCod, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.CliCod, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM (TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011G6", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P011G7", "UPDATE TXPDISALB SET Metros=Metros - ? + ?, Kilos=Kilos - ? + ?, Piezas=Piezas - ? + ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P011G9", "SELECT T1.EmprCod, T1.DisCod, T1.DisNumUni, T1.DibCli, T1.CliCod, T1.DibInt, T1.DisNumPie, COALESCE( T2.DisPie, 0) AS DisPie, T1.DisUniMed FROM (TXPDISPOS T1 LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011G10", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P011G11", "SELECT T1.EmprCod, T1.DisCod, T1.DisRefBPie, T1.DisRefBCPa, T1.DisRefBCRe, T1.DisRefBarC, T2.DisUniMed, T1.DisRefAlbR, T1.DisRefKgs, T1.DisRefMts, T1.DisRefPie FROM (TXPDISREF T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.DisRefBPie = ?) AND (T1.DisRefAlbR = ?) ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P011G12", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarMetLan, BarKilLan, BarPieLzd, BarPiePie, BarPieMet, BarPieKil FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011G13", "UPDATE TXPBARPIE SET BarMetLan=?, BarKilLan=?, BarPieLzd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P011G14", "UPDATE TXPDISREF SET DisRefKgs=?, DisRefMts=?, DisRefPie=?  WHERE EmprCod = ? AND DisCod = ? AND DisRefBarC = ? AND DisRefBCRe = ? AND DisRefBCPa = ? AND DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new ForEachCursor("P011G15", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011G16", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P011G17", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011G18", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011G19", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011G20", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P011G21", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011G22", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 18 :
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 10 :
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
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

