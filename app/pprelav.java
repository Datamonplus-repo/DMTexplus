package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprelav extends GXProcedure
{
   public pprelav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprelav.class ), "" );
   }

   public pprelav( int remoteHandle ,
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
                             byte[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pprelav.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 )
   {
      pprelav.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprelav.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pprelav.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pprelav.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprelav.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprelav.this.AV30BarPreKgm = aP5[0];
      this.aP5 = aP5;
      pprelav.this.AV31BarPreMtr = aP6[0];
      this.aP6 = aP6;
      pprelav.this.AV29ALbProEsp = aP7[0];
      this.aP7 = aP7;
      pprelav.this.AV32AlbProRec = aP8[0];
      this.aP8 = aP8;
      pprelav.this.AV54ALbHdrObs = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = "030100" ;
      GXv_int3[0] = AV40ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      pprelav.this.A396EmprCod = GXv_char1[0] ;
      pprelav.this.AV40ValCos = GXv_int3[0] ;
      GXt_int4 = AV58Suprema ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int5) ;
      pprelav.this.GXt_int4 = GXv_int5[0] ;
      AV58Suprema = GXt_int4 ;
      AV21F_tinte = (byte)(0) ;
      AV30BarPreKgm = DecimalUtil.doubleToDec(0) ;
      AV31BarPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01R13 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01R13_A361DisCod[0] ;
         A252CliCod = P01R13_A252CliCod[0] ;
         n252CliCod = P01R13_n252CliCod[0] ;
         A212BarSer = P01R13_A212BarSer[0] ;
         A135BarColNom = P01R13_A135BarColNom[0] ;
         A136BarColNum = P01R13_A136BarColNum[0] ;
         A218BarTipCol = P01R13_A218BarTipCol[0] ;
         A389DisPreMtr = P01R13_A389DisPreMtr[0] ;
         A166BarKgm = P01R13_A166BarKgm[0] ;
         n166BarKgm = P01R13_n166BarKgm[0] ;
         A389DisPreMtr = P01R13_A389DisPreMtr[0] ;
         A166BarKgm = P01R13_A166BarKgm[0] ;
         n166BarKgm = P01R13_n166BarKgm[0] ;
         AV22CliCod = A252CliCod ;
         AV23BarSer = A212BarSer ;
         AV24ForColNom = A135BarColNom ;
         AV25ForColNum = A136BarColNum ;
         AV26TipColCod = A218BarTipCol ;
         AV51BarKgm = A166BarKgm ;
         AV59dispremtr = A389DisPreMtr ;
         AV56Clascod = (short)(0) ;
         /* Using cursor P01R14 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P01R14_A44AlbRecCod[0] ;
            A200BarPieCod = P01R14_A200BarPieCod[0] ;
            AV57AlbReccod = A44AlbRecCod ;
            /* Execute user subroutine: 'ALBREC' */
            S171 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P01R15 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A150BarFacTin = P01R15_A150BarFacTin[0] ;
            A194BarOrdLin = P01R15_A194BarOrdLin[0] ;
            A758ProCod = P01R15_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV21F_tinte = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV41Cost_color = DecimalUtil.doubleToDec(0) ;
         AV47INTF2PKG = DecimalUtil.doubleToDec(0) ;
         AV50IntDscF2 = "" ;
         /* Using cursor P01R16 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A457FasCod = P01R16_A457FasCod[0] ;
            A5369BarFasGral = P01R16_A5369BarFasGral[0] ;
            n5369BarFasGral = P01R16_n5369BarFasGral[0] ;
            A194BarOrdLin = P01R16_A194BarOrdLin[0] ;
            A758ProCod = P01R16_A758ProCod[0] ;
            AV33FasCod = A457FasCod ;
            AV34BarCod = A129BarCod ;
            AV36barCodPar = A130BarCodPar ;
            AV35BarCodReo = A132BarCodReo ;
            AV37BarOrdLin = A194BarOrdLin ;
            AV38ProCod = A758ProCod ;
            if ( GXutil.strcmp(A5369BarFasGral, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'FASQUI' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'FASPR1' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV58Suprema == 1 )
      {
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV55ArtPremtr.doubleValue() > 0 )
         {
            AV29ALbProEsp = (byte)(10) ;
            AV30BarPreKgm = DecimalUtil.doubleToDec(0) ;
            AV31BarPreMtr = AV55ArtPremtr ;
         }
         if ( AV59dispremtr.doubleValue() > 0 )
         {
            AV29ALbProEsp = (byte)(10) ;
            AV30BarPreKgm = DecimalUtil.doubleToDec(0) ;
            AV31BarPreMtr = AV59dispremtr ;
         }
         AV54ALbHdrObs = AV49IntDscFc + AV50IntDscF2 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV21F_tinte == 1 )
      {
         /* Execute user subroutine: 'CFORMU' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'CLIINT' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         Gx_msg = httpContext.getMessage( "&INTCODF   =", "") + GXutil.str( AV27INTCODF, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "&INTFPKG   =", "") + GXutil.str( AV28INTFPKG, 13, 5) + GXutil.newLine( ) + httpContext.getMessage( "&INTF2PKG  =", "") + GXutil.str( AV47INTF2PKG, 13, 5) + GXutil.newLine( ) + httpContext.getMessage( "&CliCod    =", "") + GXutil.str( AV22CliCod, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "&TipColCod =", "") + GXutil.str( AV26TipColCod, 2, 0) ;
         if ( AV28INTFPKG.doubleValue() > 0 )
         {
            AV48Precio_f = AV28INTFPKG ;
            if ( AV47INTF2PKG.doubleValue() > 0 )
            {
               AV48Precio_f = AV48Precio_f.add(AV47INTF2PKG) ;
            }
            AV29ALbProEsp = (byte)(10) ;
            AV30BarPreKgm = AV48Precio_f ;
            AV31BarPreMtr = DecimalUtil.doubleToDec(0) ;
            System.out.println( httpContext.getMessage( "Atencion, esta OS tiene precio p/color y p/Efecto Especial¡¡¡", "") );
         }
         else
         {
            AV29ALbProEsp = (byte)(0) ;
            AV30BarPreKgm = DecimalUtil.doubleToDec(0) ;
            AV31BarPreMtr = DecimalUtil.doubleToDec(0) ;
         }
      }
      else
      {
         if ( AV47INTF2PKG.doubleValue() > 0 )
         {
            AV29ALbProEsp = (byte)(10) ;
            AV30BarPreKgm = AV47INTF2PKG ;
            AV31BarPreMtr = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV29ALbProEsp = (byte)(0) ;
            AV30BarPreKgm = DecimalUtil.doubleToDec(0) ;
            AV31BarPreMtr = DecimalUtil.doubleToDec(0) ;
         }
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV55ArtPremtr.doubleValue() > 0 )
         {
            AV29ALbProEsp = (byte)(10) ;
            AV30BarPreKgm = DecimalUtil.doubleToDec(0) ;
            AV31BarPreMtr = AV55ArtPremtr ;
         }
      }
      AV54ALbHdrObs = AV49IntDscFc + AV50IntDscF2 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV55ArtPremtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01R17 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod), AV23BarSer});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = P01R17_A65ArtCod[0] ;
         A252CliCod = P01R17_A252CliCod[0] ;
         n252CliCod = P01R17_n252CliCod[0] ;
         A93ArtPreMtr = P01R17_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P01R17_n93ArtPreMtr[0] ;
         AV55ArtPremtr = A93ArtPreMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV56Clascod > 0 )
      {
         /* Using cursor P01R18 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod), AV23BarSer, Short.valueOf(AV56Clascod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A8342CodPred = P01R18_A8342CodPred[0] ;
            A65ArtCod = P01R18_A65ArtCod[0] ;
            A252CliCod = P01R18_A252CliCod[0] ;
            n252CliCod = P01R18_n252CliCod[0] ;
            A8344PvpPred = P01R18_A8344PvpPred[0] ;
            n8344PvpPred = P01R18_n8344PvpPred[0] ;
            AV55ArtPremtr = A8344PvpPred ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S121( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV27INTCODF = (byte)(0) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV22CliCod ;
      GXv_char1[0] = AV23BarSer ;
      GXv_char6[0] = AV24ForColNom ;
      GXv_int7[0] = AV25ForColNum ;
      GXv_int5[0] = AV26TipColCod ;
      GXv_int8[0] = AV27INTCODF ;
      new app.pprelavi(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char6, GXv_int7, GXv_int5, GXv_int8) ;
      pprelav.this.A396EmprCod = GXv_char2[0] ;
      pprelav.this.AV22CliCod = GXv_int3[0] ;
      pprelav.this.AV23BarSer = GXv_char1[0] ;
      pprelav.this.AV24ForColNom = GXv_char6[0] ;
      pprelav.this.AV25ForColNum = GXv_int7[0] ;
      pprelav.this.AV26TipColCod = GXv_int5[0] ;
      pprelav.this.AV27INTCODF = GXv_int8[0] ;
   }

   public void S131( )
   {
      /* 'CLIINT' Routine */
      returnInSub = false ;
      AV28INTFPKG = DecimalUtil.doubleToDec(0) ;
      AV49IntDscFc = "" ;
      /* Using cursor P01R19 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod), Byte.valueOf(AV27INTCODF), Byte.valueOf(AV26TipColCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A5434Tip_ColC = P01R19_A5434Tip_ColC[0] ;
         A5396IntCodFC = P01R19_A5396IntCodFC[0] ;
         A252CliCod = P01R19_A252CliCod[0] ;
         n252CliCod = P01R19_n252CliCod[0] ;
         A5397IntDscFC = P01R19_A5397IntDscFC[0] ;
         n5397IntDscFC = P01R19_n5397IntDscFC[0] ;
         A5392IntFPKg = P01R19_A5392IntFPKg[0] ;
         n5392IntFPKg = P01R19_n5392IntFPKg[0] ;
         A5397IntDscFC = P01R19_A5397IntDscFC[0] ;
         n5397IntDscFC = P01R19_n5397IntDscFC[0] ;
         AV49IntDscFc = A5397IntDscFC ;
         AV28INTFPKG = A5392IntFPKg ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      AV52Por_i = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01R110 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = P01R110_A252CliCod[0] ;
         n252CliCod = P01R110_n252CliCod[0] ;
         A5504CliifVal = P01R110_A5504CliifVal[0] ;
         n5504CliifVal = P01R110_n5504CliifVal[0] ;
         A5505CliifPor = P01R110_A5505CliifPor[0] ;
         n5505CliifPor = P01R110_n5505CliifPor[0] ;
         A5503CliifLin = P01R110_A5503CliifLin[0] ;
         if ( DecimalUtil.compareTo(AV51BarKgm, A5504CliifVal) < 0 )
         {
            AV52Por_i = A5505CliifPor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( AV52Por_i.doubleValue() > 0 )
      {
         AV53TotRec = GXutil.roundDecimal( AV28INTFPKG.multiply(AV52Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         AV28INTFPKG = AV28INTFPKG.add(AV53TotRec) ;
      }
      AV52Por_i = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01R111 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A252CliCod = P01R111_A252CliCod[0] ;
         n252CliCod = P01R111_n252CliCod[0] ;
         A5496ClidtVal = P01R111_A5496ClidtVal[0] ;
         n5496ClidtVal = P01R111_n5496ClidtVal[0] ;
         A5497ClidtPor = P01R111_A5497ClidtPor[0] ;
         n5497ClidtPor = P01R111_n5497ClidtPor[0] ;
         A5495ClidtLin = P01R111_A5495ClidtLin[0] ;
         if ( DecimalUtil.compareTo(AV51BarKgm, A5496ClidtVal) > 0 )
         {
            AV52Por_i = A5497ClidtPor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV52Por_i.doubleValue() > 0 )
      {
         AV53TotRec = GXutil.roundDecimal( AV28INTFPKG.multiply(AV52Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         AV28INTFPKG = AV28INTFPKG.subtract(AV53TotRec) ;
      }
   }

   public void S141( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      /* Using cursor P01R112 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV34BarCod), Byte.valueOf(AV35BarCodReo), AV36barCodPar, AV38ProCod, Short.valueOf(AV37BarOrdLin)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A194BarOrdLin = P01R112_A194BarOrdLin[0] ;
         A758ProCod = P01R112_A758ProCod[0] ;
         A764ProForCod = P01R112_A764ProForCod[0] ;
         A5371FasQuiLin = P01R112_A5371FasQuiLin[0] ;
         AV39ProForCod = A764ProForCod ;
         /* Execute user subroutine: 'CTRL_INT_EE' */
         S1511 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S161( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      /* Using cursor P01R113 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV33FasCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A457FasCod = P01R113_A457FasCod[0] ;
         A764ProForCod = P01R113_A764ProForCod[0] ;
         A4650FasForLin = P01R113_A4650FasForLin[0] ;
         AV39ProForCod = A764ProForCod ;
         /* Execute user subroutine: 'CTRL_INT_EE' */
         S1511 ();
         if ( returnInSub )
         {
            pr_default.close(10);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S1511( )
   {
      /* 'CTRL_INT_EE' Routine */
      returnInSub = false ;
      AV46IntCodF2 = (short)(0) ;
      /* Using cursor P01R114 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV39ProForCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A3005ProRev = P01R114_A3005ProRev[0] ;
         A764ProForCod = P01R114_A764ProForCod[0] ;
         A5436IntCodF2 = P01R114_A5436IntCodF2[0] ;
         n5436IntCodF2 = P01R114_n5436IntCodF2[0] ;
         A767ProForLin = P01R114_A767ProForLin[0] ;
         A3005ProRev = P01R114_A3005ProRev[0] ;
         A5436IntCodF2 = P01R114_A5436IntCodF2[0] ;
         n5436IntCodF2 = P01R114_n5436IntCodF2[0] ;
         if ( GXutil.strcmp(A3005ProRev, httpContext.getMessage( "S", "")) == 0 )
         {
            AV46IntCodF2 = A5436IntCodF2 ;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      /* Using cursor P01R115 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod), Short.valueOf(AV46IntCodF2)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A5436IntCodF2 = P01R115_A5436IntCodF2[0] ;
         n5436IntCodF2 = P01R115_n5436IntCodF2[0] ;
         A252CliCod = P01R115_A252CliCod[0] ;
         n252CliCod = P01R115_n252CliCod[0] ;
         A5440IntF2PKg = P01R115_A5440IntF2PKg[0] ;
         n5440IntF2PKg = P01R115_n5440IntF2PKg[0] ;
         A5437IntDscF2 = P01R115_A5437IntDscF2[0] ;
         n5437IntDscF2 = P01R115_n5437IntDscF2[0] ;
         A5437IntDscF2 = P01R115_A5437IntDscF2[0] ;
         n5437IntDscF2 = P01R115_n5437IntDscF2[0] ;
         AV47INTF2PKG = AV47INTF2PKG.add(A5440IntF2PKg) ;
         if ( (GXutil.strcmp("", AV50IntDscF2)==0) )
         {
            AV50IntDscF2 = GXutil.trim( A5437IntDscF2) ;
         }
         else
         {
            AV50IntDscF2 += "...." ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      AV52Por_i = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01R116 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A252CliCod = P01R116_A252CliCod[0] ;
         n252CliCod = P01R116_n252CliCod[0] ;
         A5500ClieiVal = P01R116_A5500ClieiVal[0] ;
         n5500ClieiVal = P01R116_n5500ClieiVal[0] ;
         A5501ClieiPor = P01R116_A5501ClieiPor[0] ;
         n5501ClieiPor = P01R116_n5501ClieiPor[0] ;
         A5499ClieiLin = P01R116_A5499ClieiLin[0] ;
         if ( DecimalUtil.compareTo(AV51BarKgm, A5500ClieiVal) < 0 )
         {
            AV52Por_i = A5501ClieiPor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
      if ( AV52Por_i.doubleValue() > 0 )
      {
         AV53TotRec = GXutil.roundDecimal( AV47INTF2PKG.multiply(AV52Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         AV47INTF2PKG = AV47INTF2PKG.add(AV53TotRec) ;
      }
      /* Using cursor P01R117 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A252CliCod = P01R117_A252CliCod[0] ;
         n252CliCod = P01R117_n252CliCod[0] ;
         A5492CliedVal = P01R117_A5492CliedVal[0] ;
         n5492CliedVal = P01R117_n5492CliedVal[0] ;
         A5493CliedPor = P01R117_A5493CliedPor[0] ;
         n5493CliedPor = P01R117_n5493CliedPor[0] ;
         A5491CliedLin = P01R117_A5491CliedLin[0] ;
         if ( DecimalUtil.compareTo(AV51BarKgm, A5492CliedVal) > 0 )
         {
            AV52Por_i = A5493CliedPor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(14);
      }
      pr_default.close(14);
      if ( AV52Por_i.doubleValue() > 0 )
      {
         AV53TotRec = GXutil.roundDecimal( AV47INTF2PKG.multiply(AV52Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         AV47INTF2PKG = AV47INTF2PKG.subtract(AV53TotRec) ;
      }
   }

   public void S171( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      AV56Clascod = (short)(0) ;
      /* Using cursor P01R118 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV57AlbReccod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A44AlbRecCod = P01R118_A44AlbRecCod[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprelav.this.A396EmprCod;
      this.aP1[0] = pprelav.this.A30AlbProCod;
      this.aP2[0] = pprelav.this.A129BarCod;
      this.aP3[0] = pprelav.this.A132BarCodReo;
      this.aP4[0] = pprelav.this.A130BarCodPar;
      this.aP5[0] = pprelav.this.AV30BarPreKgm;
      this.aP6[0] = pprelav.this.AV31BarPreMtr;
      this.aP7[0] = pprelav.this.AV29ALbProEsp;
      this.aP8[0] = pprelav.this.AV32AlbProRec;
      this.aP9[0] = pprelav.this.AV54ALbHdrObs;
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
      P01R13_A361DisCod = new int[1] ;
      P01R13_A396EmprCod = new String[] {""} ;
      P01R13_A129BarCod = new int[1] ;
      P01R13_A132BarCodReo = new byte[1] ;
      P01R13_A130BarCodPar = new String[] {""} ;
      P01R13_A252CliCod = new int[1] ;
      P01R13_n252CliCod = new boolean[] {false} ;
      P01R13_A212BarSer = new String[] {""} ;
      P01R13_A135BarColNom = new String[] {""} ;
      P01R13_A136BarColNum = new int[1] ;
      P01R13_A218BarTipCol = new byte[1] ;
      P01R13_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R13_n166BarKgm = new boolean[] {false} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV23BarSer = "" ;
      AV24ForColNom = "" ;
      AV51BarKgm = DecimalUtil.ZERO ;
      AV59dispremtr = DecimalUtil.ZERO ;
      P01R14_A396EmprCod = new String[] {""} ;
      P01R14_A129BarCod = new int[1] ;
      P01R14_A132BarCodReo = new byte[1] ;
      P01R14_A130BarCodPar = new String[] {""} ;
      P01R14_A44AlbRecCod = new int[1] ;
      P01R14_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P01R15_A396EmprCod = new String[] {""} ;
      P01R15_A129BarCod = new int[1] ;
      P01R15_A132BarCodReo = new byte[1] ;
      P01R15_A130BarCodPar = new String[] {""} ;
      P01R15_A150BarFacTin = new String[] {""} ;
      P01R15_A194BarOrdLin = new short[1] ;
      P01R15_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      AV41Cost_color = DecimalUtil.ZERO ;
      AV47INTF2PKG = DecimalUtil.ZERO ;
      AV50IntDscF2 = "" ;
      P01R16_A396EmprCod = new String[] {""} ;
      P01R16_A129BarCod = new int[1] ;
      P01R16_A132BarCodReo = new byte[1] ;
      P01R16_A130BarCodPar = new String[] {""} ;
      P01R16_A457FasCod = new String[] {""} ;
      P01R16_A5369BarFasGral = new String[] {""} ;
      P01R16_n5369BarFasGral = new boolean[] {false} ;
      P01R16_A194BarOrdLin = new short[1] ;
      P01R16_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A5369BarFasGral = "" ;
      AV33FasCod = "" ;
      AV36barCodPar = "" ;
      AV38ProCod = "" ;
      AV55ArtPremtr = DecimalUtil.ZERO ;
      AV49IntDscFc = "" ;
      Gx_msg = "" ;
      AV28INTFPKG = DecimalUtil.ZERO ;
      AV48Precio_f = DecimalUtil.ZERO ;
      P01R17_A396EmprCod = new String[] {""} ;
      P01R17_A65ArtCod = new String[] {""} ;
      P01R17_A252CliCod = new int[1] ;
      P01R17_n252CliCod = new boolean[] {false} ;
      P01R17_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R17_n93ArtPreMtr = new boolean[] {false} ;
      A65ArtCod = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      P01R18_A396EmprCod = new String[] {""} ;
      P01R18_A8342CodPred = new short[1] ;
      P01R18_A65ArtCod = new String[] {""} ;
      P01R18_A252CliCod = new int[1] ;
      P01R18_n252CliCod = new boolean[] {false} ;
      P01R18_A8344PvpPred = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R18_n8344PvpPred = new boolean[] {false} ;
      A8344PvpPred = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      P01R19_A396EmprCod = new String[] {""} ;
      P01R19_A5434Tip_ColC = new byte[1] ;
      P01R19_A5396IntCodFC = new byte[1] ;
      P01R19_A252CliCod = new int[1] ;
      P01R19_n252CliCod = new boolean[] {false} ;
      P01R19_A5397IntDscFC = new String[] {""} ;
      P01R19_n5397IntDscFC = new boolean[] {false} ;
      P01R19_A5392IntFPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R19_n5392IntFPKg = new boolean[] {false} ;
      A5397IntDscFC = "" ;
      A5392IntFPKg = DecimalUtil.ZERO ;
      AV52Por_i = DecimalUtil.ZERO ;
      P01R110_A396EmprCod = new String[] {""} ;
      P01R110_A252CliCod = new int[1] ;
      P01R110_n252CliCod = new boolean[] {false} ;
      P01R110_A5504CliifVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R110_n5504CliifVal = new boolean[] {false} ;
      P01R110_A5505CliifPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R110_n5505CliifPor = new boolean[] {false} ;
      P01R110_A5503CliifLin = new short[1] ;
      A5504CliifVal = DecimalUtil.ZERO ;
      A5505CliifPor = DecimalUtil.ZERO ;
      AV53TotRec = DecimalUtil.ZERO ;
      P01R111_A396EmprCod = new String[] {""} ;
      P01R111_A252CliCod = new int[1] ;
      P01R111_n252CliCod = new boolean[] {false} ;
      P01R111_A5496ClidtVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R111_n5496ClidtVal = new boolean[] {false} ;
      P01R111_A5497ClidtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R111_n5497ClidtPor = new boolean[] {false} ;
      P01R111_A5495ClidtLin = new short[1] ;
      A5496ClidtVal = DecimalUtil.ZERO ;
      A5497ClidtPor = DecimalUtil.ZERO ;
      P01R112_A396EmprCod = new String[] {""} ;
      P01R112_A194BarOrdLin = new short[1] ;
      P01R112_A758ProCod = new String[] {""} ;
      P01R112_A130BarCodPar = new String[] {""} ;
      P01R112_A132BarCodReo = new byte[1] ;
      P01R112_A129BarCod = new int[1] ;
      P01R112_A764ProForCod = new String[] {""} ;
      P01R112_A5371FasQuiLin = new short[1] ;
      A764ProForCod = "" ;
      AV39ProForCod = "" ;
      P01R113_A396EmprCod = new String[] {""} ;
      P01R113_A457FasCod = new String[] {""} ;
      P01R113_A764ProForCod = new String[] {""} ;
      P01R113_A4650FasForLin = new short[1] ;
      P01R114_A396EmprCod = new String[] {""} ;
      P01R114_A3005ProRev = new String[] {""} ;
      P01R114_A764ProForCod = new String[] {""} ;
      P01R114_A5436IntCodF2 = new short[1] ;
      P01R114_n5436IntCodF2 = new boolean[] {false} ;
      P01R114_A767ProForLin = new short[1] ;
      A3005ProRev = "" ;
      P01R115_A396EmprCod = new String[] {""} ;
      P01R115_A5436IntCodF2 = new short[1] ;
      P01R115_n5436IntCodF2 = new boolean[] {false} ;
      P01R115_A252CliCod = new int[1] ;
      P01R115_n252CliCod = new boolean[] {false} ;
      P01R115_A5440IntF2PKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R115_n5440IntF2PKg = new boolean[] {false} ;
      P01R115_A5437IntDscF2 = new String[] {""} ;
      P01R115_n5437IntDscF2 = new boolean[] {false} ;
      A5440IntF2PKg = DecimalUtil.ZERO ;
      A5437IntDscF2 = "" ;
      P01R116_A396EmprCod = new String[] {""} ;
      P01R116_A252CliCod = new int[1] ;
      P01R116_n252CliCod = new boolean[] {false} ;
      P01R116_A5500ClieiVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R116_n5500ClieiVal = new boolean[] {false} ;
      P01R116_A5501ClieiPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R116_n5501ClieiPor = new boolean[] {false} ;
      P01R116_A5499ClieiLin = new short[1] ;
      A5500ClieiVal = DecimalUtil.ZERO ;
      A5501ClieiPor = DecimalUtil.ZERO ;
      P01R117_A396EmprCod = new String[] {""} ;
      P01R117_A252CliCod = new int[1] ;
      P01R117_n252CliCod = new boolean[] {false} ;
      P01R117_A5492CliedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R117_n5492CliedVal = new boolean[] {false} ;
      P01R117_A5493CliedPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R117_n5493CliedPor = new boolean[] {false} ;
      P01R117_A5491CliedLin = new short[1] ;
      A5492CliedVal = DecimalUtil.ZERO ;
      A5493CliedPor = DecimalUtil.ZERO ;
      P01R118_A396EmprCod = new String[] {""} ;
      P01R118_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprelav__default(),
         new Object[] {
             new Object[] {
            P01R13_A361DisCod, P01R13_A396EmprCod, P01R13_A129BarCod, P01R13_A132BarCodReo, P01R13_A130BarCodPar, P01R13_A252CliCod, P01R13_n252CliCod, P01R13_A212BarSer, P01R13_A135BarColNom, P01R13_A136BarColNum,
            P01R13_A218BarTipCol, P01R13_A389DisPreMtr, P01R13_A166BarKgm, P01R13_n166BarKgm
            }
            , new Object[] {
            P01R14_A396EmprCod, P01R14_A129BarCod, P01R14_A132BarCodReo, P01R14_A130BarCodPar, P01R14_A44AlbRecCod, P01R14_A200BarPieCod
            }
            , new Object[] {
            P01R15_A396EmprCod, P01R15_A129BarCod, P01R15_A132BarCodReo, P01R15_A130BarCodPar, P01R15_A150BarFacTin, P01R15_A194BarOrdLin, P01R15_A758ProCod
            }
            , new Object[] {
            P01R16_A396EmprCod, P01R16_A129BarCod, P01R16_A132BarCodReo, P01R16_A130BarCodPar, P01R16_A457FasCod, P01R16_A5369BarFasGral, P01R16_n5369BarFasGral, P01R16_A194BarOrdLin, P01R16_A758ProCod
            }
            , new Object[] {
            P01R17_A396EmprCod, P01R17_A65ArtCod, P01R17_A252CliCod, P01R17_A93ArtPreMtr, P01R17_n93ArtPreMtr
            }
            , new Object[] {
            P01R18_A396EmprCod, P01R18_A8342CodPred, P01R18_A65ArtCod, P01R18_A252CliCod, P01R18_A8344PvpPred, P01R18_n8344PvpPred
            }
            , new Object[] {
            P01R19_A396EmprCod, P01R19_A5434Tip_ColC, P01R19_A5396IntCodFC, P01R19_A252CliCod, P01R19_A5397IntDscFC, P01R19_n5397IntDscFC, P01R19_A5392IntFPKg, P01R19_n5392IntFPKg
            }
            , new Object[] {
            P01R110_A396EmprCod, P01R110_A252CliCod, P01R110_A5504CliifVal, P01R110_n5504CliifVal, P01R110_A5505CliifPor, P01R110_n5505CliifPor, P01R110_A5503CliifLin
            }
            , new Object[] {
            P01R111_A396EmprCod, P01R111_A252CliCod, P01R111_A5496ClidtVal, P01R111_n5496ClidtVal, P01R111_A5497ClidtPor, P01R111_n5497ClidtPor, P01R111_A5495ClidtLin
            }
            , new Object[] {
            P01R112_A396EmprCod, P01R112_A194BarOrdLin, P01R112_A758ProCod, P01R112_A130BarCodPar, P01R112_A132BarCodReo, P01R112_A129BarCod, P01R112_A764ProForCod, P01R112_A5371FasQuiLin
            }
            , new Object[] {
            P01R113_A396EmprCod, P01R113_A457FasCod, P01R113_A764ProForCod, P01R113_A4650FasForLin
            }
            , new Object[] {
            P01R114_A396EmprCod, P01R114_A3005ProRev, P01R114_A764ProForCod, P01R114_A5436IntCodF2, P01R114_n5436IntCodF2, P01R114_A767ProForLin
            }
            , new Object[] {
            P01R115_A396EmprCod, P01R115_A5436IntCodF2, P01R115_A252CliCod, P01R115_A5440IntF2PKg, P01R115_n5440IntF2PKg, P01R115_A5437IntDscF2, P01R115_n5437IntDscF2
            }
            , new Object[] {
            P01R116_A396EmprCod, P01R116_A252CliCod, P01R116_A5500ClieiVal, P01R116_n5500ClieiVal, P01R116_A5501ClieiPor, P01R116_n5501ClieiPor, P01R116_A5499ClieiLin
            }
            , new Object[] {
            P01R117_A396EmprCod, P01R117_A252CliCod, P01R117_A5492CliedVal, P01R117_n5492CliedVal, P01R117_A5493CliedPor, P01R117_n5493CliedPor, P01R117_A5491CliedLin
            }
            , new Object[] {
            P01R118_A396EmprCod, P01R118_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV29ALbProEsp ;
   private byte AV58Suprema ;
   private byte GXt_int4 ;
   private byte AV21F_tinte ;
   private byte A218BarTipCol ;
   private byte AV26TipColCod ;
   private byte AV35BarCodReo ;
   private byte AV27INTCODF ;
   private byte GXv_int5[] ;
   private byte GXv_int8[] ;
   private byte A5434Tip_ColC ;
   private byte A5396IntCodFC ;
   private short AV56Clascod ;
   private short A194BarOrdLin ;
   private short AV37BarOrdLin ;
   private short A8342CodPred ;
   private short A5503CliifLin ;
   private short A5495ClidtLin ;
   private short A5371FasQuiLin ;
   private short A4650FasForLin ;
   private short AV46IntCodF2 ;
   private short A5436IntCodF2 ;
   private short A767ProForLin ;
   private short A5499ClieiLin ;
   private short A5491CliedLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV40ValCos ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV22CliCod ;
   private int AV25ForColNum ;
   private int A44AlbRecCod ;
   private int AV57AlbReccod ;
   private int AV34BarCod ;
   private int GXv_int3[] ;
   private int GXv_int7[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV30BarPreKgm ;
   private java.math.BigDecimal AV31BarPreMtr ;
   private java.math.BigDecimal AV32AlbProRec ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV51BarKgm ;
   private java.math.BigDecimal AV59dispremtr ;
   private java.math.BigDecimal AV41Cost_color ;
   private java.math.BigDecimal AV47INTF2PKG ;
   private java.math.BigDecimal AV55ArtPremtr ;
   private java.math.BigDecimal AV28INTFPKG ;
   private java.math.BigDecimal AV48Precio_f ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A8344PvpPred ;
   private java.math.BigDecimal A5392IntFPKg ;
   private java.math.BigDecimal AV52Por_i ;
   private java.math.BigDecimal A5504CliifVal ;
   private java.math.BigDecimal A5505CliifPor ;
   private java.math.BigDecimal AV53TotRec ;
   private java.math.BigDecimal A5496ClidtVal ;
   private java.math.BigDecimal A5497ClidtPor ;
   private java.math.BigDecimal A5440IntF2PKg ;
   private java.math.BigDecimal A5500ClieiVal ;
   private java.math.BigDecimal A5501ClieiPor ;
   private java.math.BigDecimal A5492CliedVal ;
   private java.math.BigDecimal A5493CliedPor ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV54ALbHdrObs ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV23BarSer ;
   private String AV24ForColNom ;
   private String A200BarPieCod ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV50IntDscF2 ;
   private String A457FasCod ;
   private String A5369BarFasGral ;
   private String AV33FasCod ;
   private String AV36barCodPar ;
   private String AV38ProCod ;
   private String AV49IntDscFc ;
   private String Gx_msg ;
   private String A65ArtCod ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String A5397IntDscFC ;
   private String A764ProForCod ;
   private String AV39ProForCod ;
   private String A3005ProRev ;
   private String A5437IntDscF2 ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n5369BarFasGral ;
   private boolean n93ArtPreMtr ;
   private boolean n8344PvpPred ;
   private boolean n5397IntDscFC ;
   private boolean n5392IntFPKg ;
   private boolean n5504CliifVal ;
   private boolean n5505CliifPor ;
   private boolean n5496ClidtVal ;
   private boolean n5497ClidtPor ;
   private boolean n5436IntCodF2 ;
   private boolean n5440IntF2PKg ;
   private boolean n5437IntDscF2 ;
   private boolean n5500ClieiVal ;
   private boolean n5501ClieiPor ;
   private boolean n5492CliedVal ;
   private boolean n5493CliedPor ;
   private String[] aP9 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private byte[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P01R13_A361DisCod ;
   private String[] P01R13_A396EmprCod ;
   private int[] P01R13_A129BarCod ;
   private byte[] P01R13_A132BarCodReo ;
   private String[] P01R13_A130BarCodPar ;
   private int[] P01R13_A252CliCod ;
   private boolean[] P01R13_n252CliCod ;
   private String[] P01R13_A212BarSer ;
   private String[] P01R13_A135BarColNom ;
   private int[] P01R13_A136BarColNum ;
   private byte[] P01R13_A218BarTipCol ;
   private java.math.BigDecimal[] P01R13_A389DisPreMtr ;
   private java.math.BigDecimal[] P01R13_A166BarKgm ;
   private boolean[] P01R13_n166BarKgm ;
   private String[] P01R14_A396EmprCod ;
   private int[] P01R14_A129BarCod ;
   private byte[] P01R14_A132BarCodReo ;
   private String[] P01R14_A130BarCodPar ;
   private int[] P01R14_A44AlbRecCod ;
   private String[] P01R14_A200BarPieCod ;
   private String[] P01R15_A396EmprCod ;
   private int[] P01R15_A129BarCod ;
   private byte[] P01R15_A132BarCodReo ;
   private String[] P01R15_A130BarCodPar ;
   private String[] P01R15_A150BarFacTin ;
   private short[] P01R15_A194BarOrdLin ;
   private String[] P01R15_A758ProCod ;
   private String[] P01R16_A396EmprCod ;
   private int[] P01R16_A129BarCod ;
   private byte[] P01R16_A132BarCodReo ;
   private String[] P01R16_A130BarCodPar ;
   private String[] P01R16_A457FasCod ;
   private String[] P01R16_A5369BarFasGral ;
   private boolean[] P01R16_n5369BarFasGral ;
   private short[] P01R16_A194BarOrdLin ;
   private String[] P01R16_A758ProCod ;
   private String[] P01R17_A396EmprCod ;
   private String[] P01R17_A65ArtCod ;
   private int[] P01R17_A252CliCod ;
   private boolean[] P01R17_n252CliCod ;
   private java.math.BigDecimal[] P01R17_A93ArtPreMtr ;
   private boolean[] P01R17_n93ArtPreMtr ;
   private String[] P01R18_A396EmprCod ;
   private short[] P01R18_A8342CodPred ;
   private String[] P01R18_A65ArtCod ;
   private int[] P01R18_A252CliCod ;
   private boolean[] P01R18_n252CliCod ;
   private java.math.BigDecimal[] P01R18_A8344PvpPred ;
   private boolean[] P01R18_n8344PvpPred ;
   private String[] P01R19_A396EmprCod ;
   private byte[] P01R19_A5434Tip_ColC ;
   private byte[] P01R19_A5396IntCodFC ;
   private int[] P01R19_A252CliCod ;
   private boolean[] P01R19_n252CliCod ;
   private String[] P01R19_A5397IntDscFC ;
   private boolean[] P01R19_n5397IntDscFC ;
   private java.math.BigDecimal[] P01R19_A5392IntFPKg ;
   private boolean[] P01R19_n5392IntFPKg ;
   private String[] P01R110_A396EmprCod ;
   private int[] P01R110_A252CliCod ;
   private boolean[] P01R110_n252CliCod ;
   private java.math.BigDecimal[] P01R110_A5504CliifVal ;
   private boolean[] P01R110_n5504CliifVal ;
   private java.math.BigDecimal[] P01R110_A5505CliifPor ;
   private boolean[] P01R110_n5505CliifPor ;
   private short[] P01R110_A5503CliifLin ;
   private String[] P01R111_A396EmprCod ;
   private int[] P01R111_A252CliCod ;
   private boolean[] P01R111_n252CliCod ;
   private java.math.BigDecimal[] P01R111_A5496ClidtVal ;
   private boolean[] P01R111_n5496ClidtVal ;
   private java.math.BigDecimal[] P01R111_A5497ClidtPor ;
   private boolean[] P01R111_n5497ClidtPor ;
   private short[] P01R111_A5495ClidtLin ;
   private String[] P01R112_A396EmprCod ;
   private short[] P01R112_A194BarOrdLin ;
   private String[] P01R112_A758ProCod ;
   private String[] P01R112_A130BarCodPar ;
   private byte[] P01R112_A132BarCodReo ;
   private int[] P01R112_A129BarCod ;
   private String[] P01R112_A764ProForCod ;
   private short[] P01R112_A5371FasQuiLin ;
   private String[] P01R113_A396EmprCod ;
   private String[] P01R113_A457FasCod ;
   private String[] P01R113_A764ProForCod ;
   private short[] P01R113_A4650FasForLin ;
   private String[] P01R114_A396EmprCod ;
   private String[] P01R114_A3005ProRev ;
   private String[] P01R114_A764ProForCod ;
   private short[] P01R114_A5436IntCodF2 ;
   private boolean[] P01R114_n5436IntCodF2 ;
   private short[] P01R114_A767ProForLin ;
   private String[] P01R115_A396EmprCod ;
   private short[] P01R115_A5436IntCodF2 ;
   private boolean[] P01R115_n5436IntCodF2 ;
   private int[] P01R115_A252CliCod ;
   private boolean[] P01R115_n252CliCod ;
   private java.math.BigDecimal[] P01R115_A5440IntF2PKg ;
   private boolean[] P01R115_n5440IntF2PKg ;
   private String[] P01R115_A5437IntDscF2 ;
   private boolean[] P01R115_n5437IntDscF2 ;
   private String[] P01R116_A396EmprCod ;
   private int[] P01R116_A252CliCod ;
   private boolean[] P01R116_n252CliCod ;
   private java.math.BigDecimal[] P01R116_A5500ClieiVal ;
   private boolean[] P01R116_n5500ClieiVal ;
   private java.math.BigDecimal[] P01R116_A5501ClieiPor ;
   private boolean[] P01R116_n5501ClieiPor ;
   private short[] P01R116_A5499ClieiLin ;
   private String[] P01R117_A396EmprCod ;
   private int[] P01R117_A252CliCod ;
   private boolean[] P01R117_n252CliCod ;
   private java.math.BigDecimal[] P01R117_A5492CliedVal ;
   private boolean[] P01R117_n5492CliedVal ;
   private java.math.BigDecimal[] P01R117_A5493CliedPor ;
   private boolean[] P01R117_n5493CliedPor ;
   private short[] P01R117_A5491CliedLin ;
   private String[] P01R118_A396EmprCod ;
   private int[] P01R118_A44AlbRecCod ;
}

final  class pprelav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01R13", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T2.DisPreMtr, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R15", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasGral, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R17", "SELECT EmprCod, ArtCod, CliCod, ArtPreMtr FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R18", "SELECT EmprCod, CodPred, ArtCod, CliCod, PvpPred FROM TXPPVPNIT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CodPred = ? ORDER BY EmprCod, CliCod, ArtCod, CodPred ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R19", "SELECT T1.EmprCod, T1.Tip_ColC, T1.IntCodFC AS IntCodFC, T1.CliCod, T2.IntDscF AS IntDscFC, T1.IntFPKg FROM (TXPCLIINT T1 INNER JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodFC) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.IntCodFC = ? and T1.Tip_ColC = ? ORDER BY T1.EmprCod, T1.CliCod, T1.IntCodFC, T1.Tip_ColC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R110", "SELECT EmprCod, CliCod, CliifVal, CliifPor, CliifLin FROM TXPCLIINF WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliifLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R111", "SELECT EmprCod, CliCod, ClidtVal, ClidtPor, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, ClidtLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R112", "SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R113", "SELECT EmprCod, FasCod, ProForCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R114", "SELECT T1.EmprCod, T2.ProRev, T1.ProForCod, T2.IntCodF2, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R115", "SELECT T1.EmprCod, T1.IntCodF2, T1.CliCod, T1.IntF2PKg, T2.IntDscF2 FROM (TXPCLIIN2 T1 INNER JOIN TXPINTFA2 T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF2 = T1.IntCodF2) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.IntCodF2 = ? ORDER BY T1.EmprCod, T1.CliCod, T1.IntCodF2 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R116", "SELECT EmprCod, CliCod, ClieiVal, ClieiPor, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, ClieiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R117", "SELECT EmprCod, CliCod, CliedVal, CliedPor, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliedLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R118", "SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
      }
   }

}

