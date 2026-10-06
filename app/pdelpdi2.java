package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelpdi2 extends GXProcedure
{
   public pdelpdi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelpdi2.class ), "" );
   }

   public pdelpdi2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          java.math.BigDecimal[] aP6 )
   {
      pdelpdi2.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 )
   {
      pdelpdi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelpdi2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdelpdi2.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdelpdi2.this.AV15BarPieCod = aP3[0];
      this.aP3 = aP3;
      pdelpdi2.this.AV16Desglose = aP4[0];
      this.aP4 = aP4;
      pdelpdi2.this.AV21BarPieKil = aP5[0];
      this.aP5 = aP5;
      pdelpdi2.this.AV22BarPieMet = aP6[0];
      this.aP6 = aP6;
      pdelpdi2.this.AV23BarPiePie = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pdelpdi2.this.AV20Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV26HdrVar ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRVAR", ""), GXv_int1) ;
      pdelpdi2.this.AV26HdrVar = GXv_int1[0] ;
      GXv_int1[0] = AV27Trebor ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TREBOR", ""), GXv_int1) ;
      pdelpdi2.this.AV27Trebor = GXv_int1[0] ;
      AV30Piezas = AV23BarPiePie ;
      System.out.println( httpContext.getMessage( "Leo DISALB.Pdelpdi2", "") );
      /* Using cursor P011F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A595Kilos = P011F2_A595Kilos[0] ;
         A631Metros = P011F2_A631Metros[0] ;
         A673Piezas = P011F2_A673Piezas[0] ;
         A392DisUniMed = P011F2_A392DisUniMed[0] ;
         A392DisUniMed = P011F2_A392DisUniMed[0] ;
         A595Kilos = A595Kilos.subtract(AV21BarPieKil) ;
         A631Metros = A631Metros.subtract(AV22BarPieMet) ;
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
         {
            A673Piezas = (int)(A673Piezas-1) ;
         }
         else
         {
            A673Piezas = (int)(A673Piezas-AV30Piezas) ;
         }
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "N", "")) == 0 )
         {
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A595Kilos.doubleValue() == 0 )
               {
                  /* Using cursor P011F3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               }
            }
            else
            {
               if ( A631Metros.doubleValue() == 0 )
               {
                  /* Using cursor P011F4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               }
            }
         }
         /* Using cursor P011F5 */
         pr_default.execute(3, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV26HdrVar == 1 )
         {
            /* Using cursor P011F6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A375DisNumUni = P011F6_A375DisNumUni[0] ;
               A367DisEst = P011F6_A367DisEst[0] ;
               A252CliCod = P011F6_A252CliCod[0] ;
               AV25DisEst = A367DisEst ;
               AV28CliCod = A252CliCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
         }
         /* Using cursor P011F7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), AV15BarPieCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A380DisPieCod = P011F7_A380DisPieCod[0] ;
            A382DisPieKil = P011F7_A382DisPieKil[0] ;
            A5099DisPieEst = P011F7_A5099DisPieEst[0] ;
            if ( ( AV26HdrVar == 1 ) && ( AV25DisEst != 3 ) )
            {
               A5099DisPieEst = (byte)(0) ;
            }
            else
            {
               /* Using cursor P011F8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            }
            /* Using cursor P011F9 */
            pr_default.execute(7, new Object[] {Byte.valueOf(A5099DisPieEst), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      System.out.println( httpContext.getMessage( "Leo DISPOS.Pdelpdi2", "") );
      /* Using cursor P011F12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A374DisNumPie = P011F12_A374DisNumPie[0] ;
         A375DisNumUni = P011F12_A375DisNumUni[0] ;
         A387DisPiePie = P011F12_A387DisPiePie[0] ;
         n387DisPiePie = P011F12_n387DisPiePie[0] ;
         A379DisPie = P011F12_A379DisPie[0] ;
         n379DisPie = P011F12_n379DisPie[0] ;
         A392DisUniMed = P011F12_A392DisUniMed[0] ;
         A365DisDes = P011F12_A365DisDes[0] ;
         A387DisPiePie = P011F12_A387DisPiePie[0] ;
         n387DisPiePie = P011F12_n387DisPiePie[0] ;
         A379DisPie = P011F12_A379DisPie[0] ;
         n379DisPie = P011F12_n379DisPie[0] ;
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
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
         {
            A374DisNumPie = A387DisPiePie ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               A375DisNumUni = A385DisPieMtr ;
            }
            else
            {
               A375DisNumUni = A381DisPieKgm ;
            }
         }
         else
         {
            if ( A379DisPie > 9999 )
            {
               A374DisNumPie = (short)(0) ;
            }
            else
            {
               A374DisNumPie = A379DisPie ;
            }
            A375DisNumUni = A391DisUni ;
         }
         /* Using cursor P011F13 */
         pr_default.execute(9, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      System.out.println( httpContext.getMessage( "Leo DISREF.Pdelpdi2", "") );
      AV24EnSTKI = httpContext.getMessage( "N", "") ;
      /* Using cursor P011F14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), AV15BarPieCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A3608DisRefAlbR = P011F14_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P011F14_n3608DisRefAlbR[0] ;
         A3607DisRefBPie = P011F14_A3607DisRefBPie[0] ;
         A3400DisRefBCPa = P011F14_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = P011F14_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = P011F14_A3398DisRefBarC[0] ;
         A3401DisRefKgs = P011F14_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P011F14_n3401DisRefKgs[0] ;
         A3402DisRefMts = P011F14_A3402DisRefMts[0] ;
         n3402DisRefMts = P011F14_n3402DisRefMts[0] ;
         A3403DisRefPie = P011F14_A3403DisRefPie[0] ;
         n3403DisRefPie = P011F14_n3403DisRefPie[0] ;
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "N", "")) == 0 )
         {
            A3401DisRefKgs = A3401DisRefKgs.subtract(AV21BarPieKil) ;
            n3401DisRefKgs = false ;
            A3402DisRefMts = A3402DisRefMts.subtract(AV22BarPieMet) ;
            n3402DisRefMts = false ;
            A3403DisRefPie = (short)(A3403DisRefPie-AV23BarPiePie) ;
            n3403DisRefPie = false ;
            if ( ( A3402DisRefMts.doubleValue() == 0 ) && ( A3401DisRefKgs.doubleValue() == 0 ) && ( A3403DisRefPie == 0 ) )
            {
               /* Using cursor P011F15 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
            }
         }
         else
         {
            /* Using cursor P011F16 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         }
         /* Optimized UPDATE. */
         /* Using cursor P011F17 */
         pr_default.execute(13, new Object[] {Integer.valueOf(AV23BarPiePie), AV21BarPieKil, AV22BarPieMet, A396EmprCod, Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* End optimized UPDATE. */
         AV24EnSTKI = httpContext.getMessage( "S", "") ;
         /* Using cursor P011F18 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n3401DisRefKgs), A3401DisRefKgs, Boolean.valueOf(n3402DisRefMts), A3402DisRefMts, Boolean.valueOf(n3403DisRefPie), Short.valueOf(A3403DisRefPie), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( GXutil.strcmp(AV24EnSTKI, httpContext.getMessage( "N", "")) == 0 )
      {
         if ( ( AV20Flag1 == 1 ) || ( ( AV27Trebor == 1 ) && ( AV28CliCod == 2203 ) ) )
         {
            System.out.println( httpContext.getMessage( "Go PDETPIE.Pdelpdi2", "") );
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A44AlbRecCod ;
            GXv_char4[0] = AV15BarPieCod ;
            GXv_decimal5[0] = AV21BarPieKil ;
            GXv_decimal6[0] = AV22BarPieMet ;
            GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char9[0] = httpContext.getMessage( "DEL", "") ;
            new app.pdetpie(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_char9) ;
            pdelpdi2.this.A396EmprCod = GXv_char2[0] ;
            pdelpdi2.this.A44AlbRecCod = GXv_int3[0] ;
            pdelpdi2.this.AV15BarPieCod = GXv_char4[0] ;
            pdelpdi2.this.AV21BarPieKil = GXv_decimal5[0] ;
            pdelpdi2.this.AV22BarPieMet = GXv_decimal6[0] ;
         }
         else
         {
            System.out.println( httpContext.getMessage( "Leo ALBREC.Pdelpdi2", "") );
            /* Using cursor P011F19 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(15) != 101) )
            {
               A56AlbRUni = P011F19_A56AlbRUni[0] ;
               A60AlbRUniUti = P011F19_A60AlbRUniUti[0] ;
               A54AlbRPieUti = P011F19_A54AlbRPieUti[0] ;
               A58AlbRUniEnt = P011F19_A58AlbRUniEnt[0] ;
               A52AlbRPieEnt = P011F19_A52AlbRPieEnt[0] ;
               A47AlbREst = P011F19_A47AlbREst[0] ;
               A50AlbRLoc = P011F19_A50AlbRLoc[0] ;
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
               {
                  A60AlbRUniUti = A60AlbRUniUti.subtract(AV22BarPieMet) ;
               }
               else
               {
                  A60AlbRUniUti = A60AlbRUniUti.subtract(AV21BarPieKil) ;
               }
               if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti-1) ;
               }
               else
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti-AV23BarPiePie) ;
               }
               if ( ( A52AlbRPieEnt == A54AlbRPieUti ) && ( DecimalUtil.compareTo(A58AlbRUniEnt, A60AlbRUniUti) == 0 ) )
               {
                  A47AlbREst = (byte)(1) ;
               }
               else
               {
                  A47AlbREst = (byte)(0) ;
               }
               if ( ( GXutil.strcmp(A50AlbRLoc, httpContext.getMessage( "Sem TELA", "")) == 0 ) || ( GXutil.strcmp(A50AlbRLoc, httpContext.getMessage( "Sem Malha", "")) == 0 ) )
               {
                  /* Using cursor P011F20 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
               }
               /* Using cursor P011F21 */
               pr_default.execute(17, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(15);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelpdi2.this.A396EmprCod;
      this.aP1[0] = pdelpdi2.this.A361DisCod;
      this.aP2[0] = pdelpdi2.this.A44AlbRecCod;
      this.aP3[0] = pdelpdi2.this.AV15BarPieCod;
      this.aP4[0] = pdelpdi2.this.AV16Desglose;
      this.aP5[0] = pdelpdi2.this.AV21BarPieKil;
      this.aP6[0] = pdelpdi2.this.AV22BarPieMet;
      this.aP7[0] = pdelpdi2.this.AV23BarPiePie;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelpdi2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P011F22 */
      pr_default.execute(18, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         X631Metros = P011F22_A631Metros[0] ;
      }
      pr_default.close(18);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P011F23 */
      pr_default.execute(19, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         X384DisPieMet = P011F23_A384DisPieMet[0] ;
      }
      pr_default.close(19);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P011F24 */
      pr_default.execute(20, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         X595Kilos = P011F24_A595Kilos[0] ;
      }
      pr_default.close(20);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P011F25 */
      pr_default.execute(21, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         X382DisPieKil = P011F25_A382DisPieKil[0] ;
      }
      pr_default.close(21);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisUni1( String E396EmprCod ,
                                           int E361DisCod )
   {
      X631Metros = DecimalUtil.ZERO ;
      /* Using cursor P011F26 */
      pr_default.execute(22, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         X631Metros = P011F26_A631Metros[0] ;
      }
      pr_default.close(22);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisUni0( String E396EmprCod ,
                                           int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P011F27 */
      pr_default.execute(23, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         X595Kilos = P011F27_A595Kilos[0] ;
      }
      pr_default.close(23);
      return X595Kilos ;
   }

   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P011F2_A396EmprCod = new String[] {""} ;
      P011F2_A361DisCod = new int[1] ;
      P011F2_A44AlbRecCod = new int[1] ;
      P011F2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F2_A673Piezas = new int[1] ;
      P011F2_A392DisUniMed = new String[] {""} ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      P011F6_A396EmprCod = new String[] {""} ;
      P011F6_A361DisCod = new int[1] ;
      P011F6_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F6_A367DisEst = new byte[1] ;
      P011F6_A252CliCod = new int[1] ;
      A375DisNumUni = DecimalUtil.ZERO ;
      P011F7_A396EmprCod = new String[] {""} ;
      P011F7_A361DisCod = new int[1] ;
      P011F7_A44AlbRecCod = new int[1] ;
      P011F7_A380DisPieCod = new String[] {""} ;
      P011F7_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F7_A5099DisPieEst = new byte[1] ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      P011F12_A396EmprCod = new String[] {""} ;
      P011F12_A361DisCod = new int[1] ;
      P011F12_A374DisNumPie = new short[1] ;
      P011F12_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F12_A387DisPiePie = new short[1] ;
      P011F12_n387DisPiePie = new boolean[] {false} ;
      P011F12_A379DisPie = new short[1] ;
      P011F12_n379DisPie = new boolean[] {false} ;
      P011F12_A392DisUniMed = new String[] {""} ;
      P011F12_A365DisDes = new String[] {""} ;
      A365DisDes = "" ;
      A391DisUni = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      AV24EnSTKI = "" ;
      P011F14_A396EmprCod = new String[] {""} ;
      P011F14_A361DisCod = new int[1] ;
      P011F14_A3608DisRefAlbR = new int[1] ;
      P011F14_n3608DisRefAlbR = new boolean[] {false} ;
      P011F14_A3607DisRefBPie = new String[] {""} ;
      P011F14_A3400DisRefBCPa = new String[] {""} ;
      P011F14_A3399DisRefBCRe = new byte[1] ;
      P011F14_A3398DisRefBarC = new int[1] ;
      P011F14_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F14_n3401DisRefKgs = new boolean[] {false} ;
      P011F14_A3402DisRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F14_n3402DisRefMts = new boolean[] {false} ;
      P011F14_A3403DisRefPie = new short[1] ;
      P011F14_n3403DisRefPie = new boolean[] {false} ;
      A3607DisRefBPie = "" ;
      A3400DisRefBCPa = "" ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      P011F19_A396EmprCod = new String[] {""} ;
      P011F19_A44AlbRecCod = new int[1] ;
      P011F19_A56AlbRUni = new String[] {""} ;
      P011F19_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F19_A54AlbRPieUti = new int[1] ;
      P011F19_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F19_A52AlbRPieEnt = new int[1] ;
      P011F19_A47AlbREst = new byte[1] ;
      P011F19_A50AlbRLoc = new String[] {""} ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      X631Metros = DecimalUtil.ZERO ;
      P011F22_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P011F23_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      P011F24_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P011F25_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F26_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011F27_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelpdi2__default(),
         new Object[] {
             new Object[] {
            P011F2_A396EmprCod, P011F2_A361DisCod, P011F2_A44AlbRecCod, P011F2_A595Kilos, P011F2_A631Metros, P011F2_A673Piezas, P011F2_A392DisUniMed
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P011F6_A396EmprCod, P011F6_A361DisCod, P011F6_A375DisNumUni, P011F6_A367DisEst, P011F6_A252CliCod
            }
            , new Object[] {
            P011F7_A396EmprCod, P011F7_A361DisCod, P011F7_A44AlbRecCod, P011F7_A380DisPieCod, P011F7_A382DisPieKil, P011F7_A5099DisPieEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P011F12_A396EmprCod, P011F12_A361DisCod, P011F12_A374DisNumPie, P011F12_A375DisNumUni, P011F12_A387DisPiePie, P011F12_n387DisPiePie, P011F12_A379DisPie, P011F12_n379DisPie, P011F12_A392DisUniMed, P011F12_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            P011F14_A396EmprCod, P011F14_A361DisCod, P011F14_A3608DisRefAlbR, P011F14_n3608DisRefAlbR, P011F14_A3607DisRefBPie, P011F14_A3400DisRefBCPa, P011F14_A3399DisRefBCRe, P011F14_A3398DisRefBarC, P011F14_A3401DisRefKgs, P011F14_n3401DisRefKgs,
            P011F14_A3402DisRefMts, P011F14_n3402DisRefMts, P011F14_A3403DisRefPie, P011F14_n3403DisRefPie
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
            P011F19_A396EmprCod, P011F19_A44AlbRecCod, P011F19_A56AlbRUni, P011F19_A60AlbRUniUti, P011F19_A54AlbRPieUti, P011F19_A58AlbRUniEnt, P011F19_A52AlbRPieEnt, P011F19_A47AlbREst, P011F19_A50AlbRLoc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P011F22_A631Metros
            }
            , new Object[] {
            P011F23_A384DisPieMet
            }
            , new Object[] {
            P011F24_A595Kilos
            }
            , new Object[] {
            P011F25_A382DisPieKil
            }
            , new Object[] {
            P011F26_A631Metros
            }
            , new Object[] {
            P011F27_A595Kilos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Flag1 ;
   private byte AV26HdrVar ;
   private byte AV27Trebor ;
   private byte GXv_int1[] ;
   private byte A367DisEst ;
   private byte AV25DisEst ;
   private byte A5099DisPieEst ;
   private byte A3399DisRefBCRe ;
   private byte A47AlbREst ;
   private short A374DisNumPie ;
   private short A387DisPiePie ;
   private short A379DisPie ;
   private short A3403DisRefPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV23BarPiePie ;
   private int AV30Piezas ;
   private int A673Piezas ;
   private int A252CliCod ;
   private int AV28CliCod ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private int GXv_int3[] ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int E361DisCod ;
   private java.math.BigDecimal AV21BarPieKil ;
   private java.math.BigDecimal AV22BarPieMet ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A391DisUni ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String A396EmprCod ;
   private String AV15BarPieCod ;
   private String AV16Desglose ;
   private String scmdbuf ;
   private String A392DisUniMed ;
   private String A380DisPieCod ;
   private String A365DisDes ;
   private String AV24EnSTKI ;
   private String A3607DisRefBPie ;
   private String A3400DisRefBCPa ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char9[] ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String E396EmprCod ;
   private boolean n387DisPiePie ;
   private boolean n379DisPie ;
   private boolean n3608DisRefAlbR ;
   private boolean n3401DisRefKgs ;
   private boolean n3402DisRefMts ;
   private boolean n3403DisRefPie ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P011F2_A396EmprCod ;
   private int[] P011F2_A361DisCod ;
   private int[] P011F2_A44AlbRecCod ;
   private java.math.BigDecimal[] P011F2_A595Kilos ;
   private java.math.BigDecimal[] P011F2_A631Metros ;
   private int[] P011F2_A673Piezas ;
   private String[] P011F2_A392DisUniMed ;
   private String[] P011F6_A396EmprCod ;
   private int[] P011F6_A361DisCod ;
   private java.math.BigDecimal[] P011F6_A375DisNumUni ;
   private byte[] P011F6_A367DisEst ;
   private int[] P011F6_A252CliCod ;
   private String[] P011F7_A396EmprCod ;
   private int[] P011F7_A361DisCod ;
   private int[] P011F7_A44AlbRecCod ;
   private String[] P011F7_A380DisPieCod ;
   private java.math.BigDecimal[] P011F7_A382DisPieKil ;
   private byte[] P011F7_A5099DisPieEst ;
   private String[] P011F12_A396EmprCod ;
   private int[] P011F12_A361DisCod ;
   private short[] P011F12_A374DisNumPie ;
   private java.math.BigDecimal[] P011F12_A375DisNumUni ;
   private short[] P011F12_A387DisPiePie ;
   private boolean[] P011F12_n387DisPiePie ;
   private short[] P011F12_A379DisPie ;
   private boolean[] P011F12_n379DisPie ;
   private String[] P011F12_A392DisUniMed ;
   private String[] P011F12_A365DisDes ;
   private String[] P011F14_A396EmprCod ;
   private int[] P011F14_A361DisCod ;
   private int[] P011F14_A3608DisRefAlbR ;
   private boolean[] P011F14_n3608DisRefAlbR ;
   private String[] P011F14_A3607DisRefBPie ;
   private String[] P011F14_A3400DisRefBCPa ;
   private byte[] P011F14_A3399DisRefBCRe ;
   private int[] P011F14_A3398DisRefBarC ;
   private java.math.BigDecimal[] P011F14_A3401DisRefKgs ;
   private boolean[] P011F14_n3401DisRefKgs ;
   private java.math.BigDecimal[] P011F14_A3402DisRefMts ;
   private boolean[] P011F14_n3402DisRefMts ;
   private short[] P011F14_A3403DisRefPie ;
   private boolean[] P011F14_n3403DisRefPie ;
   private String[] P011F19_A396EmprCod ;
   private int[] P011F19_A44AlbRecCod ;
   private String[] P011F19_A56AlbRUni ;
   private java.math.BigDecimal[] P011F19_A60AlbRUniUti ;
   private int[] P011F19_A54AlbRPieUti ;
   private java.math.BigDecimal[] P011F19_A58AlbRUniEnt ;
   private int[] P011F19_A52AlbRPieEnt ;
   private byte[] P011F19_A47AlbREst ;
   private String[] P011F19_A50AlbRLoc ;
   private java.math.BigDecimal[] P011F22_A631Metros ;
   private java.math.BigDecimal[] P011F23_A384DisPieMet ;
   private java.math.BigDecimal[] P011F24_A595Kilos ;
   private java.math.BigDecimal[] P011F25_A382DisPieKil ;
   private java.math.BigDecimal[] P011F26_A631Metros ;
   private java.math.BigDecimal[] P011F27_A595Kilos ;
}

final  class pdelpdi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P011F2", "SELECT T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.Kilos, T1.Metros, T1.Piezas, T2.DisUniMed FROM (TXPDISALB T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011F3", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P011F4", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P011F5", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P011F6", "SELECT EmprCod, DisCod, DisNumUni, DisEst, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011F7", "SELECT EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieEst FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and DisPieCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011F8", "DELETE FROM TXPDISALD  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P011F9", "UPDATE TXPDISALD SET DisPieEst=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P011F12", "SELECT T1.EmprCod, T1.DisCod, T1.DisNumPie, T1.DisNumUni, COALESCE( T2.DisPiePie, 0) AS DisPiePie, COALESCE( T3.DisPie, 0) AS DisPie, T1.DisUniMed, T1.DisDes FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011F13", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P011F14", "SELECT EmprCod, DisCod, DisRefAlbR, DisRefBPie, DisRefBCPa, DisRefBCRe, DisRefBarC, DisRefKgs, DisRefMts, DisRefPie FROM TXPDISREF WHERE (EmprCod = ? and DisCod = ?) AND (DisRefAlbR = ?) AND (DisRefBPie = ?) ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P011F15", "DELETE FROM TXPDISREF  WHERE EmprCod = ? AND DisCod = ? AND DisRefBarC = ? AND DisRefBCRe = ? AND DisRefBCPa = ? AND DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new UpdateCursor("P011F16", "DELETE FROM TXPDISREF  WHERE EmprCod = ? AND DisCod = ? AND DisRefBarC = ? AND DisRefBCRe = ? AND DisRefBCPa = ? AND DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new UpdateCursor("P011F17", "UPDATE TXPBARPIE SET BarPieLzd=BarPieLzd - ?, BarKilLan=BarKilLan - ?, BarMetLan=BarMetLan - ?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P011F18", "UPDATE TXPDISREF SET DisRefKgs=?, DisRefMts=?, DisRefPie=?  WHERE EmprCod = ? AND DisCod = ? AND DisRefBarC = ? AND DisRefBCRe = ? AND DisRefBCPa = ? AND DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new ForEachCursor("P011F19", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbRLoc FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011F20", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P011F21", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P011F22", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011F23", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011F24", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011F25", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011F26", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011F27", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 9);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 23 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

