package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdishdr extends GXProcedure
{
   public pdishdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdishdr.class ), "" );
   }

   public pdishdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             short[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal[] aP15 )
   {
      pdishdr.this.aP16 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        short[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        String[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             short[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             String[] aP16 )
   {
      pdishdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdishdr.this.AV11DIsCod = aP1[0];
      this.aP1 = aP1;
      pdishdr.this.AV22DisDesOri = aP2[0];
      this.aP2 = aP2;
      pdishdr.this.AV12AlbRecCod = aP3[0];
      this.aP3 = aP3;
      pdishdr.this.A129BarCod = aP4[0];
      this.aP4 = aP4;
      pdishdr.this.A132BarCodReo = aP5[0];
      this.aP5 = aP5;
      pdishdr.this.A130BarCodPar = aP6[0];
      this.aP6 = aP6;
      pdishdr.this.A200BarPieCod = aP7[0];
      this.aP7 = aP7;
      pdishdr.this.AV20BarPieLoc = aP8[0];
      this.aP8 = aP8;
      pdishdr.this.AV21BarPieAnc = aP9[0];
      this.aP9 = aP9;
      pdishdr.this.AV8Pzas = aP10[0];
      this.aP10 = aP10;
      pdishdr.this.AV9Mts = aP11[0];
      this.aP11 = aP11;
      pdishdr.this.AV10Kgs = aP12[0];
      this.aP12 = aP12;
      pdishdr.this.AV17PzasAnt = aP13[0];
      this.aP13 = aP13;
      pdishdr.this.AV18MtsAnt = aP14[0];
      this.aP14 = aP14;
      pdishdr.this.AV19KgsAnt = aP15[0];
      this.aP15 = aP15;
      pdishdr.this.AV16Modo = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34UsurCod = " " ;
      AV35Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV36EmprNom ;
      GXv_char3[0] = AV34UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV35Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdishdr.this.A396EmprCod = GXv_char1[0] ;
      pdishdr.this.AV36EmprNom = GXv_char2[0] ;
      pdishdr.this.AV34UsurCod = GXv_char3[0] ;
      AV23AEUROP = (byte)(0) ;
      GXv_int4[0] = AV23AEUROP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AEUROP", ""), GXv_int4) ;
      pdishdr.this.AV23AEUROP = GXv_int4[0] ;
      GXt_int5 = AV32Artextil ;
      GXv_int4[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int4) ;
      pdishdr.this.GXt_int5 = GXv_int4[0] ;
      AV32Artextil = GXt_int5 ;
      GXt_int5 = AV33Er ;
      GXv_int4[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int4) ;
      pdishdr.this.GXt_int5 = GXv_int4[0] ;
      AV33Er = GXt_int5 ;
      /* Execute user subroutine: 'LEODISPO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P00S22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A201BarPieEst = P00S22_A201BarPieEst[0] ;
         A183BarMetLan = P00S22_A183BarMetLan[0] ;
         A170BarKilLan = P00S22_A170BarKilLan[0] ;
         A1271BarPieLzd = P00S22_A1271BarPieLzd[0] ;
         A205BarPieMet = P00S22_A205BarPieMet[0] ;
         A203BarPieKil = P00S22_A203BarPieKil[0] ;
         /* Using cursor P00S23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A213BarSit = P00S23_A213BarSit[0] ;
         A365DisDes = P00S23_A365DisDes[0] ;
         A228BarUniMed = P00S23_A228BarUniMed[0] ;
         AV38BarPieEst = A201BarPieEst ;
         AV39BarMetLan = A183BarMetLan ;
         AV40BarKilLan = A170BarKilLan ;
         AV41Barsit = A213BarSit ;
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "INS", "")) == 0 )
         {
            if ( AV32Artextil == 1 )
            {
               A201BarPieEst = (byte)(1) ;
               A183BarMetLan = AV9Mts ;
               A170BarKilLan = AV10Kgs ;
               AV37Inc_obs = httpContext.getMessage( "Actualizando BARPIE para la Hdr de Stki", "") + GXutil.newLine( ) ;
               AV37Inc_obs += httpContext.getMessage( "Pedido ", "") + GXutil.str( AV11DIsCod, 8, 0) + httpContext.getMessage( " Control = ", "") + AV22DisDesOri + GXutil.newLine( ) ;
               AV37Inc_obs += httpContext.getMessage( "Pieza ", "") + A200BarPieCod + GXutil.newLine( ) ;
               AV37Inc_obs += httpContext.getMessage( "Estado", "") + GXutil.str( AV38BarPieEst, 1, 0) + httpContext.getMessage( " se cambia por 1", "") + GXutil.newLine( ) ;
               AV37Inc_obs += httpContext.getMessage( "Metros", "") + GXutil.str( AV39BarMetLan, 9, 2) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV9Mts, 9, 2) + GXutil.newLine( ) ;
               AV37Inc_obs += httpContext.getMessage( "Kilos ", "") + GXutil.str( AV40BarKilLan, 9, 2) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV10Kgs, 9, 2) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV34UsurCod, AV35Station, AV37Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A1271BarPieLzd = (int)(A1271BarPieLzd+AV8Pzas) ;
               }
               A183BarMetLan = A183BarMetLan.add(AV9Mts) ;
               A170BarKilLan = A170BarKilLan.add(AV10Kgs) ;
               if ( ( DecimalUtil.compareTo(A183BarMetLan, A205BarPieMet) >= 0 ) && ( GXutil.strcmp(AV28DisUniMed, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  A201BarPieEst = (byte)(1) ;
               }
               if ( ( DecimalUtil.compareTo(A170BarKilLan, A203BarPieKil) >= 0 ) && ( GXutil.strcmp(AV28DisUniMed, httpContext.getMessage( "K", "")) == 0 ) )
               {
                  A201BarPieEst = (byte)(1) ;
               }
            }
         }
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "UPD", "")) == 0 )
         {
         }
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "DEL", "")) == 0 )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A1271BarPieLzd = (int)(A1271BarPieLzd-AV8Pzas) ;
            }
            A183BarMetLan = A183BarMetLan.subtract(AV9Mts) ;
            A170BarKilLan = A170BarKilLan.subtract(AV10Kgs) ;
            if ( ( DecimalUtil.compareTo(A183BarMetLan, A205BarPieMet) <= 0 ) && ( A213BarSit == 9 ) )
            {
               A213BarSit = (byte)(6) ;
               A201BarPieEst = (byte)(0) ;
            }
            if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ( A170BarKilLan.doubleValue() == 0 ) )
            {
               A201BarPieEst = (byte)(0) ;
            }
            if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) && ( A183BarMetLan.doubleValue() == 0 ) )
            {
               A201BarPieEst = (byte)(0) ;
            }
            AV37Inc_obs = httpContext.getMessage( "DEL.Actualizando BARPIE para la Hdr de Stki", "") + GXutil.newLine( ) ;
            AV37Inc_obs += httpContext.getMessage( "Pedido ", "") + GXutil.str( AV11DIsCod, 8, 0) + httpContext.getMessage( " Control = ", "") + AV22DisDesOri + GXutil.newLine( ) ;
            AV37Inc_obs += httpContext.getMessage( "Pieza ", "") + A200BarPieCod + GXutil.newLine( ) ;
            AV37Inc_obs += httpContext.getMessage( "Estado", "") + GXutil.str( AV38BarPieEst, 1, 0) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( A201BarPieEst, 1, 0) + GXutil.newLine( ) ;
            AV37Inc_obs += httpContext.getMessage( "Metros", "") + GXutil.str( AV39BarMetLan, 9, 2) + httpContext.getMessage( " se resta      ", "") + GXutil.str( AV9Mts, 9, 2) + GXutil.newLine( ) ;
            AV37Inc_obs += httpContext.getMessage( "Kilos ", "") + GXutil.str( AV40BarKilLan, 9, 2) + httpContext.getMessage( " se resta      ", "") + GXutil.str( AV10Kgs, 9, 2) + GXutil.newLine( ) ;
            AV37Inc_obs += httpContext.getMessage( "Sit   ", "") + GXutil.str( AV41Barsit, 2, 0) + httpContext.getMessage( " se cambia     ", "") + GXutil.str( A213BarSit, 2, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV34UsurCod, AV35Station, AV37Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         /* Using cursor P00S24 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P00S25 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A201BarPieEst), A183BarMetLan, A170BarKilLan, Integer.valueOf(A1271BarPieLzd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      if ( ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "INS", "")) == 0 ) && ( AV32Artextil == 0 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char1[0] = httpContext.getMessage( "P", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int4, GXv_char2, GXv_char1) ;
         pdishdr.this.A396EmprCod = GXv_char3[0] ;
         pdishdr.this.A129BarCod = GXv_int6[0] ;
         pdishdr.this.A132BarCodReo = GXv_int4[0] ;
         pdishdr.this.A130BarCodPar = GXv_char2[0] ;
      }
      if ( GXutil.strcmp(AV28DisUniMed, httpContext.getMessage( "M", "")) == 0 )
      {
         if ( AV32Artextil == 1 )
         {
            if ( AV10Kgs.doubleValue() != 0 )
            {
               AV29Kilos = AV10Kgs ;
            }
            else
            {
               AV29Kilos = DecimalUtil.doubleToDec(AV27DisArtPes).multiply(AV9Mts).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         else
         {
            AV29Kilos = DecimalUtil.doubleToDec(AV27DisArtPes).multiply(AV9Mts).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
      }
      else
      {
         AV29Kilos = AV10Kgs ;
      }
      if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         A361DisCod = AV11DIsCod ;
         A44AlbRecCod = AV12AlbRecCod ;
         A673Piezas = AV8Pzas ;
         A595Kilos = AV29Kilos ;
         A631Metros = AV9Mts ;
         /* Using cursor P00S26 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P00S27 */
            pr_default.execute(5, new Object[] {AV9Mts, AV29Kilos, Short.valueOf(AV8Pzas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "UPD", "")) == 0 )
      {
      }
      if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P00S28 */
         pr_default.execute(6, new Object[] {AV9Mts, AV29Kilos, Short.valueOf(AV8Pzas), A396EmprCod, Integer.valueOf(AV11DIsCod), Integer.valueOf(AV12AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* End optimized UPDATE. */
      }
      if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDISREF

         */
         A361DisCod = AV11DIsCod ;
         A3398DisRefBarC = A129BarCod ;
         A3399DisRefBCRe = A132BarCodReo ;
         A3400DisRefBCPa = A130BarCodPar ;
         A3607DisRefBPie = A200BarPieCod ;
         A3608DisRefAlbR = AV12AlbRecCod ;
         n3608DisRefAlbR = false ;
         A3401DisRefKgs = AV10Kgs ;
         n3401DisRefKgs = false ;
         A3402DisRefMts = AV9Mts ;
         n3402DisRefMts = false ;
         A3403DisRefPie = AV8Pzas ;
         n3403DisRefPie = false ;
         A5861DisRefPzII = A200BarPieCod ;
         n5861DisRefPzII = false ;
         /* Using cursor P00S29 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie, Boolean.valueOf(n3608DisRefAlbR), Integer.valueOf(A3608DisRefAlbR), Boolean.valueOf(n3401DisRefKgs), A3401DisRefKgs, Boolean.valueOf(n3402DisRefMts), A3402DisRefMts, Boolean.valueOf(n3403DisRefPie), Short.valueOf(A3403DisRefPie), Boolean.valueOf(n5861DisRefPzII), A5861DisRefPzII});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         if ( (pr_default.getStatus(7) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n3608DisRefAlbR = false ;
            n3403DisRefPie = false ;
            n3402DisRefMts = false ;
            n3401DisRefKgs = false ;
            /* Optimized UPDATE. */
            /* Using cursor P00S210 */
            pr_default.execute(8, new Object[] {Boolean.valueOf(n3608DisRefAlbR), Integer.valueOf(AV12AlbRecCod), Boolean.valueOf(n3403DisRefPie), Short.valueOf(AV8Pzas), Boolean.valueOf(n3402DisRefMts), AV9Mts, Boolean.valueOf(n3401DisRefKgs), AV10Kgs, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "UPD", "")) == 0 )
      {
      }
      if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P00S211 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV11DIsCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         /* End optimized DELETE. */
      }
      if ( GXutil.strcmp(AV22DisDesOri, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( GXutil.strcmp(AV28DisUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            if ( AV32Artextil == 1 )
            {
               if ( AV10Kgs.doubleValue() != 0 )
               {
                  AV30DisPieKil = AV10Kgs ;
               }
               else
               {
                  AV30DisPieKil = DecimalUtil.doubleToDec(AV27DisArtPes).multiply(AV9Mts).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               }
            }
            else
            {
               if ( AV33Er == 0 )
               {
                  AV30DisPieKil = DecimalUtil.doubleToDec(AV27DisArtPes).multiply(AV9Mts).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV30DisPieKil = AV10Kgs ;
               }
            }
         }
         else
         {
            AV30DisPieKil = AV10Kgs ;
         }
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "INS", "")) == 0 )
         {
            if ( AV23AEUROP == 1 )
            {
               AV24LetOri = GXutil.substring( AV20BarPieLoc, 1, 2) ;
               AV26Opcion = (byte)(2) ;
               GXt_char7 = AV25DisPieLoc ;
               GXv_char3[0] = A396EmprCod ;
               GXv_int6[0] = AV12AlbRecCod ;
               GXv_char2[0] = A200BarPieCod ;
               GXv_decimal8[0] = AV9Mts ;
               GXv_char1[0] = AV24LetOri ;
               GXv_int4[0] = AV26Opcion ;
               GXv_char9[0] = GXt_char7 ;
               new app.pnumpza(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2, GXv_decimal8, GXv_char1, GXv_int4, GXv_char9) ;
               pdishdr.this.A396EmprCod = GXv_char3[0] ;
               pdishdr.this.AV12AlbRecCod = GXv_int6[0] ;
               pdishdr.this.A200BarPieCod = GXv_char2[0] ;
               pdishdr.this.AV9Mts = GXv_decimal8[0] ;
               pdishdr.this.AV24LetOri = GXv_char1[0] ;
               pdishdr.this.AV26Opcion = GXv_int4[0] ;
               pdishdr.this.GXt_char7 = GXv_char9[0] ;
               AV25DisPieLoc = GXt_char7 ;
            }
            else
            {
               AV25DisPieLoc = AV20BarPieLoc ;
            }
            /*
               INSERT RECORD ON TABLE TXPDISALD

            */
            A361DisCod = AV11DIsCod ;
            A44AlbRecCod = AV12AlbRecCod ;
            A380DisPieCod = A200BarPieCod ;
            A382DisPieKil = AV30DisPieKil ;
            A384DisPieMet = AV9Mts ;
            A2184DisPieLoc = AV25DisPieLoc ;
            A2185DisPieAnc = AV21BarPieAnc ;
            /* Using cursor P00S212 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            if ( (pr_default.getStatus(10) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Optimized UPDATE. */
               /* Using cursor P00S213 */
               short AV21BarPieAnc2185Aux;
               AV21BarPieAnc2185Aux = AV21BarPieAnc ;
               pr_default.execute(11, new Object[] {Short.valueOf(AV21BarPieAnc2185Aux), AV20BarPieLoc, AV9Mts, AV30DisPieKil, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "UPD", "")) == 0 )
         {
         }
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "DEL", "")) == 0 )
         {
            /* Using cursor P00S214 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV11DIsCod), Integer.valueOf(AV12AlbRecCod), A200BarPieCod});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A380DisPieCod = P00S214_A380DisPieCod[0] ;
               A44AlbRecCod = P00S214_A44AlbRecCod[0] ;
               A361DisCod = P00S214_A361DisCod[0] ;
               A382DisPieKil = P00S214_A382DisPieKil[0] ;
               A384DisPieMet = P00S214_A384DisPieMet[0] ;
               A382DisPieKil = A382DisPieKil.subtract(AV30DisPieKil) ;
               A384DisPieMet = A384DisPieMet.subtract(AV9Mts) ;
               if ( ( A382DisPieKil.doubleValue() == 0 ) && ( A384DisPieMet.doubleValue() == 0 ) )
               {
                  /* Using cursor P00S215 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               }
               /* Using cursor P00S216 */
               pr_default.execute(14, new Object[] {A382DisPieKil, A384DisPieMet, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(12);
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LEODISPO' Routine */
      returnInSub = false ;
      /* Using cursor P00S217 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV11DIsCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A361DisCod = P00S217_A361DisCod[0] ;
         A342DisArtPes = P00S217_A342DisArtPes[0] ;
         A392DisUniMed = P00S217_A392DisUniMed[0] ;
         AV27DisArtPes = A342DisArtPes ;
         AV28DisUniMed = A392DisUniMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdishdr.this.A396EmprCod;
      this.aP1[0] = pdishdr.this.AV11DIsCod;
      this.aP2[0] = pdishdr.this.AV22DisDesOri;
      this.aP3[0] = pdishdr.this.AV12AlbRecCod;
      this.aP4[0] = pdishdr.this.A129BarCod;
      this.aP5[0] = pdishdr.this.A132BarCodReo;
      this.aP6[0] = pdishdr.this.A130BarCodPar;
      this.aP7[0] = pdishdr.this.A200BarPieCod;
      this.aP8[0] = pdishdr.this.AV20BarPieLoc;
      this.aP9[0] = pdishdr.this.AV21BarPieAnc;
      this.aP10[0] = pdishdr.this.AV8Pzas;
      this.aP11[0] = pdishdr.this.AV9Mts;
      this.aP12[0] = pdishdr.this.AV10Kgs;
      this.aP13[0] = pdishdr.this.AV17PzasAnt;
      this.aP14[0] = pdishdr.this.AV18MtsAnt;
      this.aP15[0] = pdishdr.this.AV19KgsAnt;
      this.aP16[0] = pdishdr.this.AV16Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdishdr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34UsurCod = "" ;
      AV35Station = "" ;
      AV36EmprNom = "" ;
      scmdbuf = "" ;
      P00S22_A396EmprCod = new String[] {""} ;
      P00S22_A129BarCod = new int[1] ;
      P00S22_A132BarCodReo = new byte[1] ;
      P00S22_A130BarCodPar = new String[] {""} ;
      P00S22_A200BarPieCod = new String[] {""} ;
      P00S22_A201BarPieEst = new byte[1] ;
      P00S22_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00S22_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00S22_A1271BarPieLzd = new int[1] ;
      P00S22_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00S22_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      P00S23_A213BarSit = new byte[1] ;
      P00S23_A365DisDes = new String[] {""} ;
      P00S23_A228BarUniMed = new String[] {""} ;
      A365DisDes = "" ;
      A228BarUniMed = "" ;
      AV39BarMetLan = DecimalUtil.ZERO ;
      AV40BarKilLan = DecimalUtil.ZERO ;
      AV37Inc_obs = "" ;
      AV45Pgmname = "" ;
      AV28DisUniMed = "" ;
      AV29Kilos = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      A5861DisRefPzII = "" ;
      AV30DisPieKil = DecimalUtil.ZERO ;
      AV24LetOri = "" ;
      AV25DisPieLoc = "" ;
      GXt_char7 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char9 = new String[1] ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      P00S214_A396EmprCod = new String[] {""} ;
      P00S214_A380DisPieCod = new String[] {""} ;
      P00S214_A44AlbRecCod = new int[1] ;
      P00S214_A361DisCod = new int[1] ;
      P00S214_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00S214_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00S217_A396EmprCod = new String[] {""} ;
      P00S217_A361DisCod = new int[1] ;
      P00S217_A342DisArtPes = new short[1] ;
      P00S217_A392DisUniMed = new String[] {""} ;
      A392DisUniMed = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdishdr__default(),
         new Object[] {
             new Object[] {
            P00S22_A396EmprCod, P00S22_A129BarCod, P00S22_A132BarCodReo, P00S22_A130BarCodPar, P00S22_A200BarPieCod, P00S22_A201BarPieEst, P00S22_A183BarMetLan, P00S22_A170BarKilLan, P00S22_A1271BarPieLzd, P00S22_A205BarPieMet,
            P00S22_A203BarPieKil
            }
            , new Object[] {
            P00S23_A213BarSit, P00S23_A365DisDes, P00S23_A228BarUniMed
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
            P00S214_A396EmprCod, P00S214_A380DisPieCod, P00S214_A44AlbRecCod, P00S214_A361DisCod, P00S214_A382DisPieKil, P00S214_A384DisPieMet
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00S217_A396EmprCod, P00S217_A361DisCod, P00S217_A342DisArtPes, P00S217_A392DisUniMed
            }
         }
      );
      AV45Pgmname = "PDisHDR" ;
      /* GeneXus formulas. */
      AV45Pgmname = "PDisHDR" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23AEUROP ;
   private byte AV32Artextil ;
   private byte AV33Er ;
   private byte GXt_int5 ;
   private byte A201BarPieEst ;
   private byte A213BarSit ;
   private byte AV38BarPieEst ;
   private byte AV41Barsit ;
   private byte A3399DisRefBCRe ;
   private byte AV26Opcion ;
   private byte GXv_int4[] ;
   private short AV21BarPieAnc ;
   private short AV8Pzas ;
   private short AV17PzasAnt ;
   private short AV27DisArtPes ;
   private short Gx_err ;
   private short A3403DisRefPie ;
   private short A2185DisPieAnc ;
   private short A342DisArtPes ;
   private int AV11DIsCod ;
   private int AV12AlbRecCod ;
   private int A129BarCod ;
   private int A1271BarPieLzd ;
   private int GX_INS35 ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A673Piezas ;
   private int GX_INS503 ;
   private int A3398DisRefBarC ;
   private int A3608DisRefAlbR ;
   private int GXv_int6[] ;
   private int GX_INS36 ;
   private java.math.BigDecimal AV9Mts ;
   private java.math.BigDecimal AV10Kgs ;
   private java.math.BigDecimal AV18MtsAnt ;
   private java.math.BigDecimal AV19KgsAnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV39BarMetLan ;
   private java.math.BigDecimal AV40BarKilLan ;
   private java.math.BigDecimal AV29Kilos ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal AV30DisPieKil ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private String A396EmprCod ;
   private String AV22DisDesOri ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV20BarPieLoc ;
   private String AV16Modo ;
   private String AV34UsurCod ;
   private String AV35Station ;
   private String AV36EmprNom ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String A228BarUniMed ;
   private String AV45Pgmname ;
   private String AV28DisUniMed ;
   private String Gx_emsg ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String A5861DisRefPzII ;
   private String AV24LetOri ;
   private String AV25DisPieLoc ;
   private String GXt_char7 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char9[] ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String A392DisUniMed ;
   private boolean returnInSub ;
   private boolean n3608DisRefAlbR ;
   private boolean n3401DisRefKgs ;
   private boolean n3402DisRefMts ;
   private boolean n3403DisRefPie ;
   private boolean n5861DisRefPzII ;
   private String AV37Inc_obs ;
   private String[] aP16 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private short[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P00S22_A396EmprCod ;
   private int[] P00S22_A129BarCod ;
   private byte[] P00S22_A132BarCodReo ;
   private String[] P00S22_A130BarCodPar ;
   private String[] P00S22_A200BarPieCod ;
   private byte[] P00S22_A201BarPieEst ;
   private java.math.BigDecimal[] P00S22_A183BarMetLan ;
   private java.math.BigDecimal[] P00S22_A170BarKilLan ;
   private int[] P00S22_A1271BarPieLzd ;
   private java.math.BigDecimal[] P00S22_A205BarPieMet ;
   private java.math.BigDecimal[] P00S22_A203BarPieKil ;
   private byte[] P00S23_A213BarSit ;
   private String[] P00S23_A365DisDes ;
   private String[] P00S23_A228BarUniMed ;
   private String[] P00S214_A396EmprCod ;
   private String[] P00S214_A380DisPieCod ;
   private int[] P00S214_A44AlbRecCod ;
   private int[] P00S214_A361DisCod ;
   private java.math.BigDecimal[] P00S214_A382DisPieKil ;
   private java.math.BigDecimal[] P00S214_A384DisPieMet ;
   private String[] P00S217_A396EmprCod ;
   private int[] P00S217_A361DisCod ;
   private short[] P00S217_A342DisArtPes ;
   private String[] P00S217_A392DisUniMed ;
}

final  class pdishdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00S22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieEst, BarMetLan, BarKilLan, BarPieLzd, BarPieMet, BarPieKil FROM TXPBARPIE WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00S23", "SELECT BarSit, DisDes, BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00S24", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P00S25", "UPDATE TXPBARPIE SET BarPieEst=?, BarMetLan=?, BarKilLan=?, BarPieLzd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P00S26", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00S27", "UPDATE TXPDISALB SET Metros=Metros + ?, Kilos=Kilos + ?, Piezas=Piezas + ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00S28", "UPDATE TXPDISALB SET Metros=Metros - ?, Kilos=Kilos - ?, Piezas=Piezas - ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00S29", "INSERT INTO TXPDISREF(EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie, DisRefAlbR, DisRefKgs, DisRefMts, DisRefPie, DisRefPzII) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new UpdateCursor("P00S210", "UPDATE TXPDISREF SET DisRefAlbR=?, DisRefPie=?, DisRefMts=?, DisRefKgs=?  WHERE EmprCod = ? and DisCod = ? and DisRefBarC = ? and DisRefBCRe = ? and DisRefBCPa = ? and DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new UpdateCursor("P00S211", "DELETE FROM TXPDISREF  WHERE EmprCod = ? and DisCod = ? and DisRefBarC = ? and DisRefBCRe = ? and DisRefBCPa = ? and DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new UpdateCursor("P00S212", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00S213", "UPDATE TXPDISALD SET DisPieAnc=?, DisPieLoc=?, DisPieMet=DisPieMet + ?, DisPieKil=DisPieKil + ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P00S214", "SELECT EmprCod, DisPieCod, AlbRecCod, DisCod, DisPieKil, DisPieMet FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and DisPieCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00S215", "DELETE FROM TXPDISALD  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00S216", "UPDATE TXPDISALD SET DisPieKil=?, DisPieMet=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P00S217", "SELECT EmprCod, DisCod, DisArtPes, DisUniMed FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(5, (String)parms[4], 9);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 9);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 1);
               stmt.setString(10, (String)parms[13], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

