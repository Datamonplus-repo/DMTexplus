package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class palbtep4 extends GXReportText
{
   public palbtep4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbtep4.class ), "" );
   }

   public palbtep4( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      palbtep4.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      palbtep4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbtep4.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      Gx_line = (int)(P_lines+1) ;
      Gx_out = "FIL" ;
      if ( GXutil.strcmp(Gx_out, "PRN") == 0 )
      {
         setOutput( "palbtep4.prn" );
      }
      else
      {
         if ( GXutil.strcmp(Gx_out, "SCR") == 0 )
         {
            setOutput(System.out);
         }
         else
         {
            if ( GXutil.strcmp(Gx_out, "FIL") == 0 )
            {
               setOutput( "Recalculo de Alb Tinte-Estamp.txt" );
            }
         }
      }
      System.out.println( httpContext.getMessage( "pAlbTEP4", "") );
      /* Using cursor P02XM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P02XM2_A129BarCod[0] ;
         A132BarCodReo = P02XM2_A132BarCodReo[0] ;
         A130BarCodPar = P02XM2_A130BarCodPar[0] ;
         A200BarPieCod = P02XM2_A200BarPieCod[0] ;
         A7081AEPMet = P02XM2_A7081AEPMet[0] ;
         n7081AEPMet = P02XM2_n7081AEPMet[0] ;
         A7080AEPKil = P02XM2_A7080AEPKil[0] ;
         n7080AEPKil = P02XM2_n7080AEPKil[0] ;
         A2524DisComLin = P02XM2_A2524DisComLin[0] ;
         A1056DisComCod = P02XM2_A1056DisComCod[0] ;
         A1032FonCod = P02XM2_A1032FonCod[0] ;
         O1540BarComMLan = A1540BarComMLan ;
         n1540BarComMLan = false ;
         O1544BarComPLan = A1544BarComPLan ;
         n1544BarComPLan = false ;
         O1533AlbEComM = A1533AlbEComM ;
         n1533AlbEComM = false ;
         O1534AlbEComP = A1534AlbEComP ;
         n1534AlbEComP = false ;
         /* Using cursor P02XM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A1263BarAlbMtrE = P02XM3_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P02XM3_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P02XM3_A1265BarAlbPie[0] ;
         /* Using cursor P02XM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         A27AlbPKilEnt = P02XM4_A27AlbPKilEnt[0] ;
         A1270AlbPMtrEnt = P02XM4_A1270AlbPMtrEnt[0] ;
         A1263BarAlbMtrE = DecimalUtil.doubleToDec(0) ;
         A1261BarAlbKgmE = DecimalUtil.doubleToDec(0) ;
         A1265BarAlbPie = 0 ;
         A1540BarComMLan = DecimalUtil.doubleToDec(0) ;
         n1540BarComMLan = false ;
         A1544BarComPLan = (short)(0) ;
         n1544BarComPLan = false ;
         A1533AlbEComM = DecimalUtil.doubleToDec(0) ;
         n1533AlbEComM = false ;
         A1534AlbEComP = (short)(0) ;
         n1534AlbEComP = false ;
         A27AlbPKilEnt = DecimalUtil.doubleToDec(0) ;
         A1270AlbPMtrEnt = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02XM5 */
         pr_default.execute(3, new Object[] {A1263BarAlbMtrE, A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Using cursor P02XM6 */
         pr_default.execute(4, new Object[] {A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      h2XM0( false, 0) ;
      out.print( "" + "Alb" + "           " + "HDR" + "           " + "Pie" + "       " + "PieKil" + "      " + "PieMet" + "        " + "AlbBar" + "                 " + "LalPrd" + "                " + "AlbEst" + "         " + "BarCom" );
      ToSkip = 1 ;
      /* Using cursor P02XM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A200BarPieCod = P02XM7_A200BarPieCod[0] ;
         A132BarCodReo = P02XM7_A132BarCodReo[0] ;
         A130BarCodPar = P02XM7_A130BarCodPar[0] ;
         A129BarCod = P02XM7_A129BarCod[0] ;
         A7081AEPMet = P02XM7_A7081AEPMet[0] ;
         n7081AEPMet = P02XM7_n7081AEPMet[0] ;
         A7080AEPKil = P02XM7_A7080AEPKil[0] ;
         n7080AEPKil = P02XM7_n7080AEPKil[0] ;
         A2524DisComLin = P02XM7_A2524DisComLin[0] ;
         A1056DisComCod = P02XM7_A1056DisComCod[0] ;
         A1032FonCod = P02XM7_A1032FonCod[0] ;
         A7079AEPPie = (byte)(1) ;
         h2XM0( false, 0) ;
         out.print( "" + localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") + "" + localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") + "" + localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") + " " + localUtil.format( A130BarCodPar, "") + " " + localUtil.format( A200BarPieCod, "") + " " + localUtil.format( DecimalUtil.doubleToDec(A7079AEPPie), "9") + " " + localUtil.format( A7080AEPKil, "ZZZZZZ9.99") + "  " + localUtil.format( A7081AEPMet, "ZZZZZZ9.99") );
         ToSkip = 1 ;
         h2XM0( false, 0) ;
         out.print( "" + " " );
         PrtOffset = 1 ;
         ToSkip = 0 ;
         out.print("\r");
         AV10BarCod = A129BarCod ;
         AV11BarCodReo = A132BarCodReo ;
         AV12BarCodPar = A130BarCodPar ;
         AV14DisComLin = A2524DisComLin ;
         AV15DisComCod = A1056DisComCod ;
         AV16FonCod = A1032FonCod ;
         AV13BarPieCod = A200BarPieCod ;
         AV8AEPMet = A7081AEPMet ;
         AV9AEPKil = A7080AEPKil ;
         /* Execute user subroutine: 'ALBBAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'BARCOM' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ALBEST' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'LALPRD' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'FIN' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h2XM0( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      /* Using cursor P02XM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P02XM8_A130BarCodPar[0] ;
         A132BarCodReo = P02XM8_A132BarCodReo[0] ;
         A129BarCod = P02XM8_A129BarCod[0] ;
         A1263BarAlbMtrE = P02XM8_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P02XM8_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P02XM8_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = A1263BarAlbMtrE.add(AV8AEPMet) ;
         A1261BarAlbKgmE = A1261BarAlbKgmE.add(AV9AEPKil) ;
         A1265BarAlbPie = (int)(A1265BarAlbPie+1) ;
         h2XM0( false, 0) ;
         out.print( "                                                         " + localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9") + " " + localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") + " " + localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") );
         PrtOffset = 83 ;
         ToSkip = 0 ;
         out.print("\r");
         /* Using cursor P02XM9 */
         pr_default.execute(7, new Object[] {A1263BarAlbMtrE, A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCOM' Routine */
      returnInSub = false ;
      /* Using cursor P02XM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, Byte.valueOf(AV14DisComLin), AV15DisComCod, AV16FonCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A1032FonCod = P02XM10_A1032FonCod[0] ;
         A1056DisComCod = P02XM10_A1056DisComCod[0] ;
         A2524DisComLin = P02XM10_A2524DisComLin[0] ;
         A130BarCodPar = P02XM10_A130BarCodPar[0] ;
         A132BarCodReo = P02XM10_A132BarCodReo[0] ;
         A129BarCod = P02XM10_A129BarCod[0] ;
         A1540BarComMLan = P02XM10_A1540BarComMLan[0] ;
         n1540BarComMLan = P02XM10_n1540BarComMLan[0] ;
         A1544BarComPLan = P02XM10_A1544BarComPLan[0] ;
         n1544BarComPLan = P02XM10_n1544BarComPLan[0] ;
         A1540BarComMLan = A1540BarComMLan.add(AV8AEPMet) ;
         n1540BarComMLan = false ;
         A1544BarComPLan = (short)(A1544BarComPLan+1) ;
         n1544BarComPLan = false ;
         h2XM0( false, 0) ;
         out.print( "                                                                                                                       " + localUtil.format( DecimalUtil.doubleToDec(A1544BarComPLan), "ZZZ9") + " " + localUtil.format( A1540BarComMLan, "ZZZZZ9.99") );
         PrtOffset = 133 ;
         ToSkip = 0 ;
         out.print("\r");
         /* Using cursor P02XM11 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ALBEST' Routine */
      returnInSub = false ;
      /* Using cursor P02XM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, Byte.valueOf(AV14DisComLin), AV15DisComCod, AV16FonCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A1032FonCod = P02XM12_A1032FonCod[0] ;
         A1056DisComCod = P02XM12_A1056DisComCod[0] ;
         A2524DisComLin = P02XM12_A2524DisComLin[0] ;
         A130BarCodPar = P02XM12_A130BarCodPar[0] ;
         A132BarCodReo = P02XM12_A132BarCodReo[0] ;
         A129BarCod = P02XM12_A129BarCod[0] ;
         A1533AlbEComM = P02XM12_A1533AlbEComM[0] ;
         n1533AlbEComM = P02XM12_n1533AlbEComM[0] ;
         A1534AlbEComP = P02XM12_A1534AlbEComP[0] ;
         n1534AlbEComP = P02XM12_n1534AlbEComP[0] ;
         A1533AlbEComM = A1533AlbEComM.add(AV8AEPMet) ;
         n1533AlbEComM = false ;
         A1534AlbEComP = (short)(A1534AlbEComP+1) ;
         n1534AlbEComP = false ;
         h2XM0( false, 0) ;
         out.print( "                                                                                                        " + localUtil.format( DecimalUtil.doubleToDec(A1534AlbEComP), "ZZZ9") + " " + localUtil.format( A1533AlbEComM, "ZZZZZ9.99") );
         PrtOffset = 118 ;
         ToSkip = 0 ;
         out.print("\r");
         /* Using cursor P02XM13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'LALPRD' Routine */
      returnInSub = false ;
      /* Using cursor P02XM14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar, AV13BarPieCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A200BarPieCod = P02XM14_A200BarPieCod[0] ;
         A130BarCodPar = P02XM14_A130BarCodPar[0] ;
         A132BarCodReo = P02XM14_A132BarCodReo[0] ;
         A129BarCod = P02XM14_A129BarCod[0] ;
         A27AlbPKilEnt = P02XM14_A27AlbPKilEnt[0] ;
         A1270AlbPMtrEnt = P02XM14_A1270AlbPMtrEnt[0] ;
         A27AlbPKilEnt = A27AlbPKilEnt.add(AV9AEPKil) ;
         A1270AlbPMtrEnt = A1270AlbPMtrEnt.add(AV8AEPMet) ;
         h2XM0( false, 0) ;
         out.print( "                                                                                    " + localUtil.format( A27AlbPKilEnt, "ZZZZZ9.99") + " " + localUtil.format( A1270AlbPMtrEnt, "ZZZZZ9.99") );
         PrtOffset = 103 ;
         ToSkip = 0 ;
         out.print("\r");
         /* Using cursor P02XM15 */
         pr_default.execute(13, new Object[] {A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'FIN' Routine */
      returnInSub = false ;
      h2XM0( false, 0) ;
      out.print( "" + " " );
      ToSkip = 1 ;
      h2XM0( false, 0) ;
      out.print( "                                  " + localUtil.format( AV9AEPKil, "ZZZZZZ9.99") + "  " + localUtil.format( AV8AEPMet, "ZZZZZZ9.99") );
      ToSkip = 1 ;
   }

   public void h2XM0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               out.print("\f");
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top)) ;
            /* Print headers */
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbtep4.this.A396EmprCod;
      this.aP1[0] = palbtep4.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbtep4");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02XM2_A129BarCod = new int[1] ;
      P02XM2_A132BarCodReo = new byte[1] ;
      P02XM2_A130BarCodPar = new String[] {""} ;
      P02XM2_A200BarPieCod = new String[] {""} ;
      P02XM2_A396EmprCod = new String[] {""} ;
      P02XM2_A30AlbProCod = new long[1] ;
      P02XM2_A7081AEPMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM2_n7081AEPMet = new boolean[] {false} ;
      P02XM2_A7080AEPKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM2_n7080AEPKil = new boolean[] {false} ;
      P02XM2_A2524DisComLin = new byte[1] ;
      P02XM2_A1056DisComCod = new String[] {""} ;
      P02XM2_A1032FonCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A7081AEPMet = DecimalUtil.ZERO ;
      A7080AEPKil = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      O1540BarComMLan = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      O1533AlbEComM = DecimalUtil.ZERO ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      P02XM3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM3_A1265BarAlbPie = new int[1] ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P02XM4_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM4_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      P02XM7_A396EmprCod = new String[] {""} ;
      P02XM7_A30AlbProCod = new long[1] ;
      P02XM7_A200BarPieCod = new String[] {""} ;
      P02XM7_A132BarCodReo = new byte[1] ;
      P02XM7_A130BarCodPar = new String[] {""} ;
      P02XM7_A129BarCod = new int[1] ;
      P02XM7_A7081AEPMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM7_n7081AEPMet = new boolean[] {false} ;
      P02XM7_A7080AEPKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM7_n7080AEPKil = new boolean[] {false} ;
      P02XM7_A2524DisComLin = new byte[1] ;
      P02XM7_A1056DisComCod = new String[] {""} ;
      P02XM7_A1032FonCod = new String[] {""} ;
      AV12BarCodPar = "" ;
      AV15DisComCod = "" ;
      AV16FonCod = "" ;
      AV13BarPieCod = "" ;
      AV8AEPMet = DecimalUtil.ZERO ;
      AV9AEPKil = DecimalUtil.ZERO ;
      P02XM8_A396EmprCod = new String[] {""} ;
      P02XM8_A30AlbProCod = new long[1] ;
      P02XM8_A130BarCodPar = new String[] {""} ;
      P02XM8_A132BarCodReo = new byte[1] ;
      P02XM8_A129BarCod = new int[1] ;
      P02XM8_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM8_A1265BarAlbPie = new int[1] ;
      P02XM10_A396EmprCod = new String[] {""} ;
      P02XM10_A1032FonCod = new String[] {""} ;
      P02XM10_A1056DisComCod = new String[] {""} ;
      P02XM10_A2524DisComLin = new byte[1] ;
      P02XM10_A130BarCodPar = new String[] {""} ;
      P02XM10_A132BarCodReo = new byte[1] ;
      P02XM10_A129BarCod = new int[1] ;
      P02XM10_A1540BarComMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM10_n1540BarComMLan = new boolean[] {false} ;
      P02XM10_A1544BarComPLan = new short[1] ;
      P02XM10_n1544BarComPLan = new boolean[] {false} ;
      P02XM12_A396EmprCod = new String[] {""} ;
      P02XM12_A30AlbProCod = new long[1] ;
      P02XM12_A1032FonCod = new String[] {""} ;
      P02XM12_A1056DisComCod = new String[] {""} ;
      P02XM12_A2524DisComLin = new byte[1] ;
      P02XM12_A130BarCodPar = new String[] {""} ;
      P02XM12_A132BarCodReo = new byte[1] ;
      P02XM12_A129BarCod = new int[1] ;
      P02XM12_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM12_n1533AlbEComM = new boolean[] {false} ;
      P02XM12_A1534AlbEComP = new short[1] ;
      P02XM12_n1534AlbEComP = new boolean[] {false} ;
      P02XM14_A396EmprCod = new String[] {""} ;
      P02XM14_A30AlbProCod = new long[1] ;
      P02XM14_A200BarPieCod = new String[] {""} ;
      P02XM14_A130BarCodPar = new String[] {""} ;
      P02XM14_A132BarCodReo = new byte[1] ;
      P02XM14_A129BarCod = new int[1] ;
      P02XM14_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XM14_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbtep4__default(),
         new Object[] {
             new Object[] {
            P02XM2_A129BarCod, P02XM2_A132BarCodReo, P02XM2_A130BarCodPar, P02XM2_A200BarPieCod, P02XM2_A396EmprCod, P02XM2_A30AlbProCod, P02XM2_A7081AEPMet, P02XM2_n7081AEPMet, P02XM2_A7080AEPKil, P02XM2_n7080AEPKil,
            P02XM2_A2524DisComLin, P02XM2_A1056DisComCod, P02XM2_A1032FonCod
            }
            , new Object[] {
            P02XM3_A1263BarAlbMtrE, P02XM3_A1261BarAlbKgmE, P02XM3_A1265BarAlbPie
            }
            , new Object[] {
            P02XM4_A27AlbPKilEnt, P02XM4_A1270AlbPMtrEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02XM7_A396EmprCod, P02XM7_A30AlbProCod, P02XM7_A200BarPieCod, P02XM7_A132BarCodReo, P02XM7_A130BarCodPar, P02XM7_A129BarCod, P02XM7_A7081AEPMet, P02XM7_n7081AEPMet, P02XM7_A7080AEPKil, P02XM7_n7080AEPKil,
            P02XM7_A2524DisComLin, P02XM7_A1056DisComCod, P02XM7_A1032FonCod
            }
            , new Object[] {
            P02XM8_A396EmprCod, P02XM8_A30AlbProCod, P02XM8_A130BarCodPar, P02XM8_A132BarCodReo, P02XM8_A129BarCod, P02XM8_A1263BarAlbMtrE, P02XM8_A1261BarAlbKgmE, P02XM8_A1265BarAlbPie
            }
            , new Object[] {
            }
            , new Object[] {
            P02XM10_A396EmprCod, P02XM10_A1032FonCod, P02XM10_A1056DisComCod, P02XM10_A2524DisComLin, P02XM10_A130BarCodPar, P02XM10_A132BarCodReo, P02XM10_A129BarCod, P02XM10_A1540BarComMLan, P02XM10_n1540BarComMLan, P02XM10_A1544BarComPLan,
            P02XM10_n1544BarComPLan
            }
            , new Object[] {
            }
            , new Object[] {
            P02XM12_A396EmprCod, P02XM12_A30AlbProCod, P02XM12_A1032FonCod, P02XM12_A1056DisComCod, P02XM12_A2524DisComLin, P02XM12_A130BarCodPar, P02XM12_A132BarCodReo, P02XM12_A129BarCod, P02XM12_A1533AlbEComM, P02XM12_n1533AlbEComM,
            P02XM12_A1534AlbEComP, P02XM12_n1534AlbEComP
            }
            , new Object[] {
            }
            , new Object[] {
            P02XM14_A396EmprCod, P02XM14_A30AlbProCod, P02XM14_A200BarPieCod, P02XM14_A130BarCodPar, P02XM14_A132BarCodReo, P02XM14_A129BarCod, P02XM14_A27AlbPKilEnt, P02XM14_A1270AlbPMtrEnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A7079AEPPie ;
   private byte AV11BarCodReo ;
   private byte AV14DisComLin ;
   private short O1544BarComPLan ;
   private short A1544BarComPLan ;
   private short O1534AlbEComP ;
   private short A1534AlbEComP ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV10BarCod ;
   private int Gx_page ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A7081AEPMet ;
   private java.math.BigDecimal A7080AEPKil ;
   private java.math.BigDecimal O1540BarComMLan ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal O1533AlbEComM ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal AV8AEPMet ;
   private java.math.BigDecimal AV9AEPKil ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String AV12BarCodPar ;
   private String AV15DisComCod ;
   private String AV16FonCod ;
   private String AV13BarPieCod ;
   private boolean n7081AEPMet ;
   private boolean n7080AEPKil ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private boolean returnInSub ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P02XM2_A129BarCod ;
   private byte[] P02XM2_A132BarCodReo ;
   private String[] P02XM2_A130BarCodPar ;
   private String[] P02XM2_A200BarPieCod ;
   private String[] P02XM2_A396EmprCod ;
   private long[] P02XM2_A30AlbProCod ;
   private java.math.BigDecimal[] P02XM2_A7081AEPMet ;
   private boolean[] P02XM2_n7081AEPMet ;
   private java.math.BigDecimal[] P02XM2_A7080AEPKil ;
   private boolean[] P02XM2_n7080AEPKil ;
   private byte[] P02XM2_A2524DisComLin ;
   private String[] P02XM2_A1056DisComCod ;
   private String[] P02XM2_A1032FonCod ;
   private java.math.BigDecimal[] P02XM3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P02XM3_A1261BarAlbKgmE ;
   private int[] P02XM3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P02XM4_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P02XM4_A1270AlbPMtrEnt ;
   private String[] P02XM7_A396EmprCod ;
   private long[] P02XM7_A30AlbProCod ;
   private String[] P02XM7_A200BarPieCod ;
   private byte[] P02XM7_A132BarCodReo ;
   private String[] P02XM7_A130BarCodPar ;
   private int[] P02XM7_A129BarCod ;
   private java.math.BigDecimal[] P02XM7_A7081AEPMet ;
   private boolean[] P02XM7_n7081AEPMet ;
   private java.math.BigDecimal[] P02XM7_A7080AEPKil ;
   private boolean[] P02XM7_n7080AEPKil ;
   private byte[] P02XM7_A2524DisComLin ;
   private String[] P02XM7_A1056DisComCod ;
   private String[] P02XM7_A1032FonCod ;
   private String[] P02XM8_A396EmprCod ;
   private long[] P02XM8_A30AlbProCod ;
   private String[] P02XM8_A130BarCodPar ;
   private byte[] P02XM8_A132BarCodReo ;
   private int[] P02XM8_A129BarCod ;
   private java.math.BigDecimal[] P02XM8_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P02XM8_A1261BarAlbKgmE ;
   private int[] P02XM8_A1265BarAlbPie ;
   private String[] P02XM10_A396EmprCod ;
   private String[] P02XM10_A1032FonCod ;
   private String[] P02XM10_A1056DisComCod ;
   private byte[] P02XM10_A2524DisComLin ;
   private String[] P02XM10_A130BarCodPar ;
   private byte[] P02XM10_A132BarCodReo ;
   private int[] P02XM10_A129BarCod ;
   private java.math.BigDecimal[] P02XM10_A1540BarComMLan ;
   private boolean[] P02XM10_n1540BarComMLan ;
   private short[] P02XM10_A1544BarComPLan ;
   private boolean[] P02XM10_n1544BarComPLan ;
   private String[] P02XM12_A396EmprCod ;
   private long[] P02XM12_A30AlbProCod ;
   private String[] P02XM12_A1032FonCod ;
   private String[] P02XM12_A1056DisComCod ;
   private byte[] P02XM12_A2524DisComLin ;
   private String[] P02XM12_A130BarCodPar ;
   private byte[] P02XM12_A132BarCodReo ;
   private int[] P02XM12_A129BarCod ;
   private java.math.BigDecimal[] P02XM12_A1533AlbEComM ;
   private boolean[] P02XM12_n1533AlbEComM ;
   private short[] P02XM12_A1534AlbEComP ;
   private boolean[] P02XM12_n1534AlbEComP ;
   private String[] P02XM14_A396EmprCod ;
   private long[] P02XM14_A30AlbProCod ;
   private String[] P02XM14_A200BarPieCod ;
   private String[] P02XM14_A130BarCodPar ;
   private byte[] P02XM14_A132BarCodReo ;
   private int[] P02XM14_A129BarCod ;
   private java.math.BigDecimal[] P02XM14_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P02XM14_A1270AlbPMtrEnt ;
}

final  class palbtep4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XM2", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, EmprCod, AlbProCod, AEPMet, AEPKil, DisComLin, DisComCod, FonCod FROM TXPALBTEP WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XM3", "SELECT BarAlbMtrE, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XM4", "SELECT AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XM5", "UPDATE TXPALBBAR SET BarAlbMtrE=?, BarAlbKgmE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P02XM6", "UPDATE TXPLALPRD SET AlbPKilEnt=?, AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P02XM7", "SELECT EmprCod, AlbProCod, BarPieCod, BarCodReo, BarCodPar, BarCod, AEPMet, AEPKil, DisComLin, DisComCod, FonCod FROM TXPALBTEP WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XM8", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbMtrE, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XM9", "UPDATE TXPALBBAR SET BarAlbMtrE=?, BarAlbKgmE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02XM10", "SELECT EmprCod, FonCod, DisComCod, DisComLin, BarCodPar, BarCodReo, BarCod, BarComMLan, BarComPLan FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XM11", "UPDATE TXPBARCOM SET BarComMLan=?, BarComPLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new ForEachCursor("P02XM12", "SELECT EmprCod, AlbProCod, FonCod, DisComCod, DisComLin, BarCodPar, BarCodReo, BarCod, AlbEComM, AlbEComP FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XM13", "UPDATE TXPALBEST SET AlbEComM=?, AlbEComP=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new ForEachCursor("P02XM14", "SELECT EmprCod, AlbProCod, BarPieCod, BarCodPar, BarCodReo, BarCod, AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XM15", "UPDATE TXPLALPRD SET AlbPKilEnt=?, AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((String[]) buf[12])[0] = rslt.getString(11, 12);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((String[]) buf[12])[0] = rslt.getString(11, 12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 9 :
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
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
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
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 12);
               stmt.setString(10, (String)parms[11], 12);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
      }
   }

}

