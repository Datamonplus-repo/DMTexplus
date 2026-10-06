package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class planres extends GXReportText
{
   public planres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( planres.class ), "" );
   }

   public planres( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 )
   {
      planres.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             String[] aP15 )
   {
      planres.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      planres.this.AV15TermCod = aP1[0];
      this.aP1 = aP1;
      planres.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      planres.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      planres.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      planres.this.AV19DisComLin = aP5[0];
      this.aP5 = aP5;
      planres.this.AV20DisComCod = aP6[0];
      this.aP6 = aP6;
      planres.this.AV21FonCod = aP7[0];
      this.aP7 = aP7;
      planres.this.AV22BarComMtr = aP8[0];
      this.aP8 = aP8;
      planres.this.AV23RecEstAnh = aP9[0];
      this.aP9 = aP9;
      planres.this.AV24ConStk = aP10[0];
      this.aP10 = aP10;
      planres.this.AV36Maqcod = aP11[0];
      this.aP11 = aP11;
      planres.this.AV38Opecod = aP12[0];
      this.aP12 = aP12;
      planres.this.AV39VarPor = aP13[0];
      this.aP13 = aP13;
      planres.this.AV42ArtFacUti = aP14[0];
      this.aP14 = aP14;
      planres.this.AV26Ok = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      Gx_line = (int)(P_lines+1) ;
      Gx_out = "FIL" ;
      if ( GXutil.strcmp(Gx_out, "PRN") == 0 )
      {
         setOutput( "planres.prn" );
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
               setOutput( "planres.prn" );
            }
         }
      }
      GXt_int1 = AV30PLinea ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV30PLinea = GXt_int1 ;
      GXt_int1 = AV31Partes ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLPAS", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV31Partes = GXt_int1 ;
      GXt_int1 = AV33AgrEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AGREST", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV33AgrEst = GXt_int1 ;
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV35Artextil)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV35Artextil = DecimalUtil.doubleToDec(GXt_int1) ;
      GXt_int1 = AV37Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV37Eliot = GXt_int1 ;
      GXt_int1 = AV41SiRepe ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIREPE", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV41SiRepe = GXt_int1 ;
      GXt_int1 = AV43NoReceta ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOREST", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV43NoReceta = GXt_int1 ;
      GXt_int1 = AV51sistock ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SISTLD", ""), GXv_int2) ;
      planres.this.GXt_int1 = GXv_int2[0] ;
      AV51sistock = GXt_int1 ;
      AV45UsurCod = " " ;
      AV46Station = context.getWorkstationId( remoteHandle) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV47EmprNom ;
      GXv_char5[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char3, GXv_char4, GXv_char5) ;
      planres.this.A396EmprCod = GXv_char3[0] ;
      planres.this.AV47EmprNom = GXv_char4[0] ;
      planres.this.AV45UsurCod = GXv_char5[0] ;
      hZJ0( false, 0) ;
      out.print( "" + localUtil.format( AV22BarComMtr, "ZZZZZ9.99") );
      ToSkip = 1 ;
      if ( AV35Artextil.doubleValue() == 1 )
      {
         /* Using cursor P00ZJ2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Byte.valueOf(AV19DisComLin), AV20DisComCod, AV21FonCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A30AlbProCod = P00ZJ2_A30AlbProCod[0] ;
            A361DisCod = P00ZJ2_A361DisCod[0] ;
            A1013DibCli = P00ZJ2_A1013DibCli[0] ;
            n1013DibCli = P00ZJ2_n1013DibCli[0] ;
            A1014DibInt = P00ZJ2_A1014DibInt[0] ;
            n1014DibInt = P00ZJ2_n1014DibInt[0] ;
            A1032FonCod = P00ZJ2_A1032FonCod[0] ;
            A1056DisComCod = P00ZJ2_A1056DisComCod[0] ;
            A1799BarDibInt = P00ZJ2_A1799BarDibInt[0] ;
            A1798BarDibCli = P00ZJ2_A1798BarDibCli[0] ;
            A212BarSer = P00ZJ2_A212BarSer[0] ;
            A125BarAncAca1 = P00ZJ2_A125BarAncAca1[0] ;
            A4861DibCob = P00ZJ2_A4861DibCob[0] ;
            n4861DibCob = P00ZJ2_n4861DibCob[0] ;
            A1823DibTipMaq = P00ZJ2_A1823DibTipMaq[0] ;
            n1823DibTipMaq = P00ZJ2_n1823DibTipMaq[0] ;
            A2524DisComLin = P00ZJ2_A2524DisComLin[0] ;
            A130BarCodPar = P00ZJ2_A130BarCodPar[0] ;
            A132BarCodReo = P00ZJ2_A132BarCodReo[0] ;
            A129BarCod = P00ZJ2_A129BarCod[0] ;
            A252CliCod = P00ZJ2_A252CliCod[0] ;
            n252CliCod = P00ZJ2_n252CliCod[0] ;
            A361DisCod = P00ZJ2_A361DisCod[0] ;
            A1799BarDibInt = P00ZJ2_A1799BarDibInt[0] ;
            A1798BarDibCli = P00ZJ2_A1798BarDibCli[0] ;
            A212BarSer = P00ZJ2_A212BarSer[0] ;
            A125BarAncAca1 = P00ZJ2_A125BarAncAca1[0] ;
            A252CliCod = P00ZJ2_A252CliCod[0] ;
            n252CliCod = P00ZJ2_n252CliCod[0] ;
            A1013DibCli = P00ZJ2_A1013DibCli[0] ;
            n1013DibCli = P00ZJ2_n1013DibCli[0] ;
            A1014DibInt = P00ZJ2_A1014DibInt[0] ;
            n1014DibInt = P00ZJ2_n1014DibInt[0] ;
            A4861DibCob = P00ZJ2_A4861DibCob[0] ;
            n4861DibCob = P00ZJ2_n4861DibCob[0] ;
            A1823DibTipMaq = P00ZJ2_A1823DibTipMaq[0] ;
            n1823DibTipMaq = P00ZJ2_n1823DibTipMaq[0] ;
            hZJ0( false, 0) ;
            out.print( "" + localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") + " " + localUtil.format( A212BarSer, "") + " " + localUtil.format( A1798BarDibCli, "") + " " + localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9") + " " + localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9") + " " + localUtil.format( A1056DisComCod, "") + " " + localUtil.format( A1032FonCod, "") );
            ToSkip = 1 ;
            /* Using cursor P00ZJ3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2141SerEst = P00ZJ3_A2141SerEst[0] ;
               A1013DibCli = P00ZJ3_A1013DibCli[0] ;
               n1013DibCli = P00ZJ3_n1013DibCli[0] ;
               A1014DibInt = P00ZJ3_A1014DibInt[0] ;
               n1014DibInt = P00ZJ3_n1014DibInt[0] ;
               A2074ColCom = P00ZJ3_A2074ColCom[0] ;
               A2078ColFon = P00ZJ3_A2078ColFon[0] ;
               A252CliCod = P00ZJ3_A252CliCod[0] ;
               n252CliCod = P00ZJ3_n252CliCod[0] ;
               A396EmprCod = P00ZJ3_A396EmprCod[0] ;
               n396EmprCod = P00ZJ3_n396EmprCod[0] ;
               A2076ColEstMba = P00ZJ3_A2076ColEstMba[0] ;
               n2076ColEstMba = P00ZJ3_n2076ColEstMba[0] ;
               A2100MolCon = P00ZJ3_A2100MolCon[0] ;
               n2100MolCon = P00ZJ3_n2100MolCon[0] ;
               A2098MolCod = P00ZJ3_A2098MolCod[0] ;
               A2076ColEstMba = P00ZJ3_A2076ColEstMba[0] ;
               n2076ColEstMba = P00ZJ3_n2076ColEstMba[0] ;
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
               {
                  A4862MolPrcCob = getMolPrcCob0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
               }
               else
               {
                  if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
                  {
                     A4862MolPrcCob = getMolPrcCob1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
                  }
                  else
                  {
                     A4862MolPrcCob = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A2100MolCon = (A4861DibCob).multiply((A4862MolPrcCob.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec((A125BarAncAca1/ (double) (100)))).multiply(A2076ColEstMba) ;
               n2100MolCon = false ;
               hZJ0( false, 0) ;
               out.print( "                                        " + localUtil.format( A4861DibCob, "ZZ9.99") + " " + localUtil.format( A4862MolPrcCob, "Z9.99") + " " + localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") + " " + localUtil.format( A2076ColEstMba, "ZZZZZ9.99") + " " + localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9") + "  " + localUtil.format( A2100MolCon, "ZZZZZ9.99") );
               ToSkip = 1 ;
               /* Using cursor P00ZJ4 */
               pr_default.execute(2, new Object[] {Boolean.valueOf(n2100MolCon), A2100MolCon, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P00ZJ5 */
         pr_default.execute(3);
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2140RepFonCod = P00ZJ5_A2140RepFonCod[0] ;
            A2138RepComCod = P00ZJ5_A2138RepComCod[0] ;
            A2681RepComLin = P00ZJ5_A2681RepComLin[0] ;
            A2136RepBarPar = P00ZJ5_A2136RepBarPar[0] ;
            A2137RepBarReo = P00ZJ5_A2137RepBarReo[0] ;
            A2135RepBarCod = P00ZJ5_A2135RepBarCod[0] ;
            A942TermCod = P00ZJ5_A942TermCod[0] ;
            /* Using cursor P00ZJ6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A2135RepBarCod), Byte.valueOf(A2137RepBarReo), A2136RepBarPar, Byte.valueOf(A2681RepComLin), A2138RepComCod, A2140RepFonCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A30AlbProCod = P00ZJ6_A30AlbProCod[0] ;
               A361DisCod = P00ZJ6_A361DisCod[0] ;
               A129BarCod = P00ZJ6_A129BarCod[0] ;
               A132BarCodReo = P00ZJ6_A132BarCodReo[0] ;
               A130BarCodPar = P00ZJ6_A130BarCodPar[0] ;
               A2524DisComLin = P00ZJ6_A2524DisComLin[0] ;
               A1056DisComCod = P00ZJ6_A1056DisComCod[0] ;
               A1032FonCod = P00ZJ6_A1032FonCod[0] ;
               A1013DibCli = P00ZJ6_A1013DibCli[0] ;
               n1013DibCli = P00ZJ6_n1013DibCli[0] ;
               A1014DibInt = P00ZJ6_A1014DibInt[0] ;
               n1014DibInt = P00ZJ6_n1014DibInt[0] ;
               A1799BarDibInt = P00ZJ6_A1799BarDibInt[0] ;
               A1798BarDibCli = P00ZJ6_A1798BarDibCli[0] ;
               A212BarSer = P00ZJ6_A212BarSer[0] ;
               A125BarAncAca1 = P00ZJ6_A125BarAncAca1[0] ;
               A4861DibCob = P00ZJ6_A4861DibCob[0] ;
               n4861DibCob = P00ZJ6_n4861DibCob[0] ;
               A1823DibTipMaq = P00ZJ6_A1823DibTipMaq[0] ;
               n1823DibTipMaq = P00ZJ6_n1823DibTipMaq[0] ;
               A252CliCod = P00ZJ6_A252CliCod[0] ;
               n252CliCod = P00ZJ6_n252CliCod[0] ;
               A361DisCod = P00ZJ6_A361DisCod[0] ;
               A1799BarDibInt = P00ZJ6_A1799BarDibInt[0] ;
               A1798BarDibCli = P00ZJ6_A1798BarDibCli[0] ;
               A212BarSer = P00ZJ6_A212BarSer[0] ;
               A125BarAncAca1 = P00ZJ6_A125BarAncAca1[0] ;
               A252CliCod = P00ZJ6_A252CliCod[0] ;
               n252CliCod = P00ZJ6_n252CliCod[0] ;
               A1013DibCli = P00ZJ6_A1013DibCli[0] ;
               n1013DibCli = P00ZJ6_n1013DibCli[0] ;
               A1014DibInt = P00ZJ6_A1014DibInt[0] ;
               n1014DibInt = P00ZJ6_n1014DibInt[0] ;
               A4861DibCob = P00ZJ6_A4861DibCob[0] ;
               n4861DibCob = P00ZJ6_n4861DibCob[0] ;
               A1823DibTipMaq = P00ZJ6_A1823DibTipMaq[0] ;
               n1823DibTipMaq = P00ZJ6_n1823DibTipMaq[0] ;
               hZJ0( false, 0) ;
               out.print( "" + localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") + " " + localUtil.format( A212BarSer, "") + " " + localUtil.format( A1798BarDibCli, "") + " " + localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9") + " " + localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9") + " " + localUtil.format( A1056DisComCod, "") + " " + localUtil.format( A1032FonCod, "") );
               ToSkip = 1 ;
               /* Using cursor P00ZJ7 */
               pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A1056DisComCod, A1032FonCod});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A2141SerEst = P00ZJ7_A2141SerEst[0] ;
                  A1013DibCli = P00ZJ7_A1013DibCli[0] ;
                  n1013DibCli = P00ZJ7_n1013DibCli[0] ;
                  A1014DibInt = P00ZJ7_A1014DibInt[0] ;
                  n1014DibInt = P00ZJ7_n1014DibInt[0] ;
                  A2074ColCom = P00ZJ7_A2074ColCom[0] ;
                  A2078ColFon = P00ZJ7_A2078ColFon[0] ;
                  A252CliCod = P00ZJ7_A252CliCod[0] ;
                  n252CliCod = P00ZJ7_n252CliCod[0] ;
                  A396EmprCod = P00ZJ7_A396EmprCod[0] ;
                  n396EmprCod = P00ZJ7_n396EmprCod[0] ;
                  A2076ColEstMba = P00ZJ7_A2076ColEstMba[0] ;
                  n2076ColEstMba = P00ZJ7_n2076ColEstMba[0] ;
                  A2100MolCon = P00ZJ7_A2100MolCon[0] ;
                  n2100MolCon = P00ZJ7_n2100MolCon[0] ;
                  A2098MolCod = P00ZJ7_A2098MolCod[0] ;
                  A2076ColEstMba = P00ZJ7_A2076ColEstMba[0] ;
                  n2076ColEstMba = P00ZJ7_n2076ColEstMba[0] ;
                  if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A4862MolPrcCob = getMolPrcCob0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
                  }
                  else
                  {
                     if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
                     {
                        A4862MolPrcCob = getMolPrcCob1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
                     }
                     else
                     {
                        A4862MolPrcCob = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A2100MolCon = (A4861DibCob).multiply((A4862MolPrcCob.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec((A125BarAncAca1/ (double) (100)))).multiply(A2076ColEstMba) ;
                  n2100MolCon = false ;
                  hZJ0( false, 0) ;
                  out.print( "                                        " + localUtil.format( A4861DibCob, "ZZ9.99") + " " + localUtil.format( A4862MolPrcCob, "Z9.99") + " " + localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") + " " + localUtil.format( A2076ColEstMba, "ZZZZZ9.99") + " " + localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9") + "  " + localUtil.format( A2100MolCon, "ZZZZZ9.99") );
                  ToSkip = 1 ;
                  /* Using cursor P00ZJ8 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n2100MolCon), A2100MolCon, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               pr_default.readNext(4);
            }
            pr_default.close(4);
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      if ( AV33AgrEst == 1 )
      {
         hZJ0( false, 0) ;
         out.print( "" + "Agrupacion Antes" + "  " + localUtil.format( AV22BarComMtr, "ZZZZZ9.99") );
         ToSkip = 1 ;
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = AV16BarCod ;
         GXv_int2[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_decimal7[0] = AV32TotMtrAgr ;
         new app.ppreagre(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int2, GXv_char4, GXv_decimal7) ;
         planres.this.A396EmprCod = GXv_char5[0] ;
         planres.this.AV16BarCod = GXv_int6[0] ;
         planres.this.AV17BarCodReo = GXv_int2[0] ;
         planres.this.AV18BarCodPar = GXv_char4[0] ;
         planres.this.AV32TotMtrAgr = GXv_decimal7[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TotMtrAgr)==0) )
         {
            AV22BarComMtr = AV32TotMtrAgr ;
         }
      }
      AV28Rep = 1 ;
      /* Optimized group. */
      /* Using cursor P00ZJ9 */
      pr_default.execute(7, new Object[] {AV15TermCod});
      cV28Rep = P00ZJ9_AV28Rep[0] ;
      pr_default.close(7);
      AV28Rep = (long)(AV28Rep+cV28Rep*1) ;
      /* End optimized group. */
      if ( GXutil.strcmp(AV24ConStk, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV31Partes == 0 )
         {
            if ( ( AV37Eliot == 0 ) && ( AV51sistock == 1 ) )
            {
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = AV16BarCod ;
               GXv_int2[0] = AV17BarCodReo ;
               GXv_char4[0] = AV18BarCodPar ;
               GXv_int8[0] = AV19DisComLin ;
               GXv_char3[0] = AV20DisComCod ;
               GXv_char9[0] = AV21FonCod ;
               GXv_decimal7[0] = AV22BarComMtr ;
               GXv_char10[0] = AV26Ok ;
               new app.ppreres(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int2, GXv_char4, GXv_int8, GXv_char3, GXv_char9, GXv_decimal7, GXv_char10) ;
               planres.this.A396EmprCod = GXv_char5[0] ;
               planres.this.AV16BarCod = GXv_int6[0] ;
               planres.this.AV17BarCodReo = GXv_int2[0] ;
               planres.this.AV18BarCodPar = GXv_char4[0] ;
               planres.this.AV19DisComLin = GXv_int8[0] ;
               planres.this.AV20DisComCod = GXv_char3[0] ;
               planres.this.AV21FonCod = GXv_char9[0] ;
               planres.this.AV22BarComMtr = GXv_decimal7[0] ;
               planres.this.AV26Ok = GXv_char10[0] ;
            }
         }
         else
         {
            System.out.println( httpContext.getMessage( "Go PPREREP", "") );
            GXv_char10[0] = A396EmprCod ;
            GXv_int6[0] = AV16BarCod ;
            GXv_int8[0] = AV17BarCodReo ;
            GXv_char9[0] = AV18BarCodPar ;
            GXv_int2[0] = AV19DisComLin ;
            GXv_char5[0] = AV20DisComCod ;
            GXv_char4[0] = AV21FonCod ;
            GXv_decimal7[0] = AV22BarComMtr ;
            GXv_char3[0] = AV26Ok ;
            new app.pprerep(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int8, GXv_char9, GXv_int2, GXv_char5, GXv_char4, GXv_decimal7, GXv_char3) ;
            planres.this.A396EmprCod = GXv_char10[0] ;
            planres.this.AV16BarCod = GXv_int6[0] ;
            planres.this.AV17BarCodReo = GXv_int8[0] ;
            planres.this.AV18BarCodPar = GXv_char9[0] ;
            planres.this.AV19DisComLin = GXv_int2[0] ;
            planres.this.AV20DisComCod = GXv_char5[0] ;
            planres.this.AV21FonCod = GXv_char4[0] ;
            planres.this.AV22BarComMtr = GXv_decimal7[0] ;
            planres.this.AV26Ok = GXv_char3[0] ;
            System.out.println( httpContext.getMessage( "Return PPREREP", "") );
         }
         AV26Ok = ((AV43NoReceta==0) ? httpContext.getMessage( "S", "") : AV26Ok) ;
      }
      else
      {
         AV26Ok = httpContext.getMessage( "S", "") ;
      }
      if ( GXutil.strcmp(AV26Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( GXutil.strcmp(AV24ConStk, httpContext.getMessage( "S", "")) == 0 )
         {
            AV29Cont = DecimalUtil.doubleToDec(1) ;
            /* Using cursor P00ZJ10 */
            pr_default.execute(8, new Object[] {AV15TermCod, Boolean.valueOf(n396EmprCod), A396EmprCod});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A942TermCod = P00ZJ10_A942TermCod[0] ;
               A2139RepComMtr = P00ZJ10_A2139RepComMtr[0] ;
               n2139RepComMtr = P00ZJ10_n2139RepComMtr[0] ;
               A2140RepFonCod = P00ZJ10_A2140RepFonCod[0] ;
               A2138RepComCod = P00ZJ10_A2138RepComCod[0] ;
               A2681RepComLin = P00ZJ10_A2681RepComLin[0] ;
               A2136RepBarPar = P00ZJ10_A2136RepBarPar[0] ;
               A2137RepBarReo = P00ZJ10_A2137RepBarReo[0] ;
               A2135RepBarCod = P00ZJ10_A2135RepBarCod[0] ;
               AV29Cont = AV29Cont.add(DecimalUtil.doubleToDec(1)) ;
               if ( AV31Partes == 0 )
               {
                  GXv_char10[0] = A396EmprCod ;
                  GXv_int6[0] = A2135RepBarCod ;
                  GXv_int8[0] = A2137RepBarReo ;
                  GXv_char9[0] = A2136RepBarPar ;
                  GXv_int2[0] = A2681RepComLin ;
                  GXv_char5[0] = A2138RepComCod ;
                  GXv_char4[0] = A2140RepFonCod ;
                  GXv_decimal7[0] = A2139RepComMtr ;
                  GXv_char3[0] = AV26Ok ;
                  new app.ppreres(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int8, GXv_char9, GXv_int2, GXv_char5, GXv_char4, GXv_decimal7, GXv_char3) ;
                  planres.this.A396EmprCod = GXv_char10[0] ;
                  planres.this.A2135RepBarCod = GXv_int6[0] ;
                  planres.this.A2137RepBarReo = GXv_int8[0] ;
                  planres.this.A2136RepBarPar = GXv_char9[0] ;
                  planres.this.A2681RepComLin = GXv_int2[0] ;
                  planres.this.A2138RepComCod = GXv_char5[0] ;
                  planres.this.A2140RepFonCod = GXv_char4[0] ;
                  planres.this.A2139RepComMtr = GXv_decimal7[0] ;
                  planres.this.AV26Ok = GXv_char3[0] ;
               }
               else
               {
                  GXv_char10[0] = A396EmprCod ;
                  GXv_int6[0] = A2135RepBarCod ;
                  GXv_int8[0] = A2137RepBarReo ;
                  GXv_char9[0] = A2136RepBarPar ;
                  GXv_int2[0] = A2681RepComLin ;
                  GXv_char5[0] = A2138RepComCod ;
                  GXv_char4[0] = A2140RepFonCod ;
                  GXv_decimal7[0] = A2139RepComMtr ;
                  GXv_char3[0] = AV26Ok ;
                  new app.pprerep(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int8, GXv_char9, GXv_int2, GXv_char5, GXv_char4, GXv_decimal7, GXv_char3) ;
                  planres.this.A396EmprCod = GXv_char10[0] ;
                  planres.this.A2135RepBarCod = GXv_int6[0] ;
                  planres.this.A2137RepBarReo = GXv_int8[0] ;
                  planres.this.A2136RepBarPar = GXv_char9[0] ;
                  planres.this.A2681RepComLin = GXv_int2[0] ;
                  planres.this.A2138RepComCod = GXv_char5[0] ;
                  planres.this.A2140RepFonCod = GXv_char4[0] ;
                  planres.this.A2139RepComMtr = GXv_decimal7[0] ;
                  planres.this.AV26Ok = GXv_char3[0] ;
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
            AV26Ok = httpContext.getMessage( "S", "") ;
         }
         if ( GXutil.strcmp(AV26Ok, httpContext.getMessage( "S", "")) == 0 )
         {
            System.out.println( httpContext.getMessage( "Generando Recetas", "") );
            AV25Principal = httpContext.getMessage( "S", "") ;
            GXv_int6[0] = AV27BarCodLan ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LANEST", ""), GXv_int6) ;
            planres.this.AV27BarCodLan = GXv_int6[0] ;
            if ( AV31Partes == 0 )
            {
               hZJ0( false, 0) ;
               out.print( "" + "Metros Agrupados=" + " " + localUtil.format( AV22BarComMtr, "ZZZZZ9.99") + "   " + localUtil.format( AV32TotMtrAgr, "ZZZZZ9.99") );
               ToSkip = 1 ;
               if ( ( AV37Eliot == 1 ) && ( AV39VarPor.doubleValue() > 0 ) )
               {
                  System.out.println( httpContext.getMessage( "Go Ppor000", "") );
                  GXv_char10[0] = A396EmprCod ;
                  GXv_int6[0] = AV16BarCod ;
                  GXv_int8[0] = AV17BarCodReo ;
                  GXv_char9[0] = AV18BarCodPar ;
                  GXv_char5[0] = AV20DisComCod ;
                  GXv_char4[0] = AV21FonCod ;
                  GXv_decimal7[0] = AV39VarPor ;
                  new app.ppor000(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int8, GXv_char9, GXv_char5, GXv_char4, GXv_decimal7) ;
                  planres.this.A396EmprCod = GXv_char10[0] ;
                  planres.this.AV16BarCod = GXv_int6[0] ;
                  planres.this.AV17BarCodReo = GXv_int8[0] ;
                  planres.this.AV18BarCodPar = GXv_char9[0] ;
                  planres.this.AV20DisComCod = GXv_char5[0] ;
                  planres.this.AV21FonCod = GXv_char4[0] ;
                  planres.this.AV39VarPor = GXv_decimal7[0] ;
                  System.out.println( httpContext.getMessage( "Return Ppor000", "") );
               }
               System.out.println( httpContext.getMessage( "Go PGENRES", "") );
               GXv_char10[0] = A396EmprCod ;
               GXv_int6[0] = AV16BarCod ;
               GXv_int8[0] = AV17BarCodReo ;
               GXv_char9[0] = AV18BarCodPar ;
               GXv_int2[0] = AV19DisComLin ;
               GXv_char5[0] = AV20DisComCod ;
               GXv_char4[0] = AV21FonCod ;
               GXv_decimal7[0] = AV22BarComMtr ;
               GXv_int11[0] = AV23RecEstAnh ;
               GXv_char3[0] = AV25Principal ;
               GXv_int12[0] = AV27BarCodLan ;
               GXv_char13[0] = AV24ConStk ;
               GXv_char14[0] = AV36Maqcod ;
               GXv_int15[0] = AV38Opecod ;
               GXv_decimal16[0] = AV39VarPor ;
               GXv_decimal17[0] = AV42ArtFacUti ;
               new app.pgenres(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int8, GXv_char9, GXv_int2, GXv_char5, GXv_char4, GXv_decimal7, GXv_int11, GXv_char3, GXv_int12, GXv_char13, GXv_char14, GXv_int15, GXv_decimal16, GXv_decimal17) ;
               planres.this.A396EmprCod = GXv_char10[0] ;
               planres.this.AV16BarCod = GXv_int6[0] ;
               planres.this.AV17BarCodReo = GXv_int8[0] ;
               planres.this.AV18BarCodPar = GXv_char9[0] ;
               planres.this.AV19DisComLin = GXv_int2[0] ;
               planres.this.AV20DisComCod = GXv_char5[0] ;
               planres.this.AV21FonCod = GXv_char4[0] ;
               planres.this.AV22BarComMtr = GXv_decimal7[0] ;
               planres.this.AV23RecEstAnh = GXv_int11[0] ;
               planres.this.AV25Principal = GXv_char3[0] ;
               planres.this.AV27BarCodLan = GXv_int12[0] ;
               planres.this.AV24ConStk = GXv_char13[0] ;
               planres.this.AV36Maqcod = GXv_char14[0] ;
               planres.this.AV38Opecod = GXv_int15[0] ;
               planres.this.AV39VarPor = GXv_decimal16[0] ;
               planres.this.AV42ArtFacUti = GXv_decimal17[0] ;
               System.out.println( httpContext.getMessage( "Return PGENRES", "") );
               /* Using cursor P00ZJ11 */
               pr_default.execute(9, new Object[] {AV15TermCod, Boolean.valueOf(n396EmprCod), A396EmprCod});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A942TermCod = P00ZJ11_A942TermCod[0] ;
                  A2139RepComMtr = P00ZJ11_A2139RepComMtr[0] ;
                  n2139RepComMtr = P00ZJ11_n2139RepComMtr[0] ;
                  A2140RepFonCod = P00ZJ11_A2140RepFonCod[0] ;
                  A2138RepComCod = P00ZJ11_A2138RepComCod[0] ;
                  A2681RepComLin = P00ZJ11_A2681RepComLin[0] ;
                  A2136RepBarPar = P00ZJ11_A2136RepBarPar[0] ;
                  A2137RepBarReo = P00ZJ11_A2137RepBarReo[0] ;
                  A2135RepBarCod = P00ZJ11_A2135RepBarCod[0] ;
                  if ( ( A2135RepBarCod == AV16BarCod ) && ( A2137RepBarReo == AV17BarCodReo ) && ( GXutil.strcmp(A2136RepBarPar, AV18BarCodPar) == 0 ) && ( A2681RepComLin == AV19DisComLin ) && ( AV37Eliot == 1 ) )
                  {
                  }
                  else
                  {
                     if ( AV37Eliot == 0 )
                     {
                        AV25Principal = httpContext.getMessage( "N", "") ;
                     }
                     if ( ( AV37Eliot == 1 ) && ( AV39VarPor.doubleValue() > 0 ) )
                     {
                        GXv_char14[0] = A396EmprCod ;
                        GXv_int15[0] = A2135RepBarCod ;
                        GXv_int8[0] = A2137RepBarReo ;
                        GXv_char13[0] = A2136RepBarPar ;
                        GXv_char10[0] = A2138RepComCod ;
                        GXv_char9[0] = A2140RepFonCod ;
                        GXv_decimal17[0] = AV39VarPor ;
                        new app.ppor000(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int8, GXv_char13, GXv_char10, GXv_char9, GXv_decimal17) ;
                        planres.this.A396EmprCod = GXv_char14[0] ;
                        planres.this.A2135RepBarCod = GXv_int15[0] ;
                        planres.this.A2137RepBarReo = GXv_int8[0] ;
                        planres.this.A2136RepBarPar = GXv_char13[0] ;
                        planres.this.A2138RepComCod = GXv_char10[0] ;
                        planres.this.A2140RepFonCod = GXv_char9[0] ;
                        planres.this.AV39VarPor = GXv_decimal17[0] ;
                     }
                     GXv_char14[0] = A396EmprCod ;
                     GXv_int15[0] = A2135RepBarCod ;
                     GXv_int8[0] = A2137RepBarReo ;
                     GXv_char13[0] = A2136RepBarPar ;
                     GXv_int2[0] = A2681RepComLin ;
                     GXv_char10[0] = A2138RepComCod ;
                     GXv_char9[0] = A2140RepFonCod ;
                     GXv_decimal17[0] = A2139RepComMtr ;
                     GXv_int11[0] = AV23RecEstAnh ;
                     GXv_char5[0] = AV25Principal ;
                     GXv_int12[0] = AV27BarCodLan ;
                     GXv_char4[0] = AV24ConStk ;
                     GXv_char3[0] = AV36Maqcod ;
                     GXv_int6[0] = AV38Opecod ;
                     GXv_decimal16[0] = AV39VarPor ;
                     GXv_decimal7[0] = AV42ArtFacUti ;
                     new app.pgenres(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int8, GXv_char13, GXv_int2, GXv_char10, GXv_char9, GXv_decimal17, GXv_int11, GXv_char5, GXv_int12, GXv_char4, GXv_char3, GXv_int6, GXv_decimal16, GXv_decimal7) ;
                     planres.this.A396EmprCod = GXv_char14[0] ;
                     planres.this.A2135RepBarCod = GXv_int15[0] ;
                     planres.this.A2137RepBarReo = GXv_int8[0] ;
                     planres.this.A2136RepBarPar = GXv_char13[0] ;
                     planres.this.A2681RepComLin = GXv_int2[0] ;
                     planres.this.A2138RepComCod = GXv_char10[0] ;
                     planres.this.A2140RepFonCod = GXv_char9[0] ;
                     planres.this.A2139RepComMtr = GXv_decimal17[0] ;
                     planres.this.AV23RecEstAnh = GXv_int11[0] ;
                     planres.this.AV25Principal = GXv_char5[0] ;
                     planres.this.AV27BarCodLan = GXv_int12[0] ;
                     planres.this.AV24ConStk = GXv_char4[0] ;
                     planres.this.AV36Maqcod = GXv_char3[0] ;
                     planres.this.AV38Opecod = GXv_int6[0] ;
                     planres.this.AV39VarPor = GXv_decimal16[0] ;
                     planres.this.AV42ArtFacUti = GXv_decimal7[0] ;
                  }
                  pr_default.readNext(9);
               }
               pr_default.close(9);
            }
            else
            {
               GXv_char14[0] = A396EmprCod ;
               GXv_int15[0] = AV16BarCod ;
               GXv_int8[0] = AV17BarCodReo ;
               GXv_char13[0] = AV18BarCodPar ;
               GXv_int2[0] = AV19DisComLin ;
               GXv_char10[0] = AV20DisComCod ;
               GXv_char9[0] = AV21FonCod ;
               GXv_decimal17[0] = AV22BarComMtr ;
               GXv_int11[0] = AV23RecEstAnh ;
               GXv_char5[0] = AV25Principal ;
               GXv_int12[0] = AV27BarCodLan ;
               GXv_char4[0] = AV24ConStk ;
               new app.pgenpar(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int8, GXv_char13, GXv_int2, GXv_char10, GXv_char9, GXv_decimal17, GXv_int11, GXv_char5, GXv_int12, GXv_char4) ;
               planres.this.A396EmprCod = GXv_char14[0] ;
               planres.this.AV16BarCod = GXv_int15[0] ;
               planres.this.AV17BarCodReo = GXv_int8[0] ;
               planres.this.AV18BarCodPar = GXv_char13[0] ;
               planres.this.AV19DisComLin = GXv_int2[0] ;
               planres.this.AV20DisComCod = GXv_char10[0] ;
               planres.this.AV21FonCod = GXv_char9[0] ;
               planres.this.AV22BarComMtr = GXv_decimal17[0] ;
               planres.this.AV23RecEstAnh = GXv_int11[0] ;
               planres.this.AV25Principal = GXv_char5[0] ;
               planres.this.AV27BarCodLan = GXv_int12[0] ;
               planres.this.AV24ConStk = GXv_char4[0] ;
            }
            if ( AV30PLinea == 0 )
            {
               System.out.println( httpContext.getMessage( "Calculando Repeticiones", "") );
               if ( AV41SiRepe == 1 )
               {
                  AV48DiaHora = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                  AV49Dhh = GXutil.substring( AV48DiaHora, 1, 2) + GXutil.substring( AV48DiaHora, 4, 2) + GXutil.substring( AV48DiaHora, 7, 4) + GXutil.substring( AV48DiaHora, 12, 2) + GXutil.substring( AV48DiaHora, 15, 2) + GXutil.substring( AV48DiaHora, 18, 2) ;
                  AV50Filename = httpContext.getMessage( "PEDIREP_", "") + GXutil.padl( GXutil.trim( GXutil.str( AV16BarCod, 8, 0)), (short)(8), "0") + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + "_" + AV49Dhh + httpContext.getMessage( ".txt", "") ;
                  GXv_char14[0] = A396EmprCod ;
                  GXv_int15[0] = AV16BarCod ;
                  GXv_int8[0] = AV17BarCodReo ;
                  GXv_char13[0] = AV18BarCodPar ;
                  GXv_int2[0] = AV19DisComLin ;
                  GXv_char10[0] = AV20DisComCod ;
                  GXv_char9[0] = AV21FonCod ;
                  GXv_int12[0] = AV27BarCodLan ;
                  GXv_char5[0] = AV50Filename ;
                  new app.pedirep(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int8, GXv_char13, GXv_int2, GXv_char10, GXv_char9, GXv_int12, GXv_char5) ;
                  planres.this.A396EmprCod = GXv_char14[0] ;
                  planres.this.AV16BarCod = GXv_int15[0] ;
                  planres.this.AV17BarCodReo = GXv_int8[0] ;
                  planres.this.AV18BarCodPar = GXv_char13[0] ;
                  planres.this.AV19DisComLin = GXv_int2[0] ;
                  planres.this.AV20DisComCod = GXv_char10[0] ;
                  planres.this.AV21FonCod = GXv_char9[0] ;
                  planres.this.AV27BarCodLan = GXv_int12[0] ;
                  planres.this.AV50Filename = GXv_char5[0] ;
               }
               else
               {
                  /* Using cursor P00ZJ12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV27BarCodLan)});
                  while ( (pr_default.getStatus(10) != 101) )
                  {
                     A2509BarCodLan = P00ZJ12_A2509BarCodLan[0] ;
                     n2509BarCodLan = P00ZJ12_n2509BarCodLan[0] ;
                     A2124RecMolCod = P00ZJ12_A2124RecMolCod[0] ;
                     A1032FonCod = P00ZJ12_A1032FonCod[0] ;
                     A1056DisComCod = P00ZJ12_A1056DisComCod[0] ;
                     A130BarCodPar = P00ZJ12_A130BarCodPar[0] ;
                     A132BarCodReo = P00ZJ12_A132BarCodReo[0] ;
                     A129BarCod = P00ZJ12_A129BarCod[0] ;
                     A2524DisComLin = P00ZJ12_A2524DisComLin[0] ;
                     A2509BarCodLan = P00ZJ12_A2509BarCodLan[0] ;
                     n2509BarCodLan = P00ZJ12_n2509BarCodLan[0] ;
                     Gx_msg = httpContext.getMessage( "Recalculando : ", "") + GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar + " " + GXutil.trim( A1056DisComCod) + " " + GXutil.trim( A1032FonCod) + httpContext.getMessage( "Cil/Mol ", "") + GXutil.trim( GXutil.str( A2124RecMolCod, 2, 0)) ;
                     System.out.println( Gx_msg );
                     System.out.println( httpContext.getMessage( "Go PEstRecal", "") );
                     GXv_char14[0] = A396EmprCod ;
                     GXv_int15[0] = A129BarCod ;
                     GXv_int8[0] = A132BarCodReo ;
                     GXv_char13[0] = A130BarCodPar ;
                     GXv_int2[0] = A2524DisComLin ;
                     GXv_char10[0] = A1056DisComCod ;
                     GXv_char9[0] = A1032FonCod ;
                     GXv_int18[0] = A2124RecMolCod ;
                     new app.pestrecal(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int8, GXv_char13, GXv_int2, GXv_char10, GXv_char9, GXv_int18) ;
                     planres.this.A396EmprCod = GXv_char14[0] ;
                     planres.this.A129BarCod = GXv_int15[0] ;
                     planres.this.A132BarCodReo = GXv_int8[0] ;
                     planres.this.A130BarCodPar = GXv_char13[0] ;
                     planres.this.A2524DisComLin = GXv_int2[0] ;
                     planres.this.A1056DisComCod = GXv_char10[0] ;
                     planres.this.A1032FonCod = GXv_char9[0] ;
                     planres.this.A2124RecMolCod = GXv_int18[0] ;
                     System.out.println( httpContext.getMessage( "Return PEstRecal", "") );
                     pr_default.readNext(10);
                  }
                  pr_default.close(10);
               }
            }
            System.out.println( "" );
            System.out.println( httpContext.getMessage( "Proceso de Generacion realizado", "") );
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha encontrado incidencia en la creacion de receta. NO se continua¡", ""));
         AV44Inc_obs = httpContext.getMessage( "Incidencias en creacion de receta de estampacion, control productos quimicos", "") + GXutil.newLine( ) ;
         AV44Inc_obs += httpContext.getMessage( "Variante ", "") + GXutil.str( AV19DisComLin, 2, 0) + " " + GXutil.trim( AV20DisComCod) + httpContext.getMessage( " Fondo ", "") + GXutil.trim( AV21FonCod) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV64Pgmname, AV45UsurCod, AV46Station, AV44Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
      }
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      hZJ0( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void hZJ0( boolean bFoot ,
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
      this.aP0[0] = planres.this.A396EmprCod;
      this.aP1[0] = planres.this.AV15TermCod;
      this.aP2[0] = planres.this.AV16BarCod;
      this.aP3[0] = planres.this.AV17BarCodReo;
      this.aP4[0] = planres.this.AV18BarCodPar;
      this.aP5[0] = planres.this.AV19DisComLin;
      this.aP6[0] = planres.this.AV20DisComCod;
      this.aP7[0] = planres.this.AV21FonCod;
      this.aP8[0] = planres.this.AV22BarComMtr;
      this.aP9[0] = planres.this.AV23RecEstAnh;
      this.aP10[0] = planres.this.AV24ConStk;
      this.aP11[0] = planres.this.AV36Maqcod;
      this.aP12[0] = planres.this.AV38Opecod;
      this.aP13[0] = planres.this.AV39VarPor;
      this.aP14[0] = planres.this.AV42ArtFacUti;
      this.aP15[0] = planres.this.AV26Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "planres");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getMolPrcCob1( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P00ZJ13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(nA396EmprCod), E396EmprCod, Boolean.valueOf(nA1013DibCli), E1013DibCli, Boolean.valueOf(nA252CliCod), Integer.valueOf(E252CliCod), Boolean.valueOf(nA1014DibInt), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         if ( ( ( P00ZJ13_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X5381DibPrcCobM = P00ZJ13_A5381DibPrcCobM[0] ;
            nX5381DibPrcCobM = false ;
            if (true) break;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      return X5381DibPrcCobM ;
   }

   public java.math.BigDecimal getMolPrcCob0( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X4860DibPrcCob = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P00ZJ14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(nE396EmprCod), E396EmprCod, Boolean.valueOf(nE1013DibCli), E1013DibCli, Boolean.valueOf(nE252CliCod), Integer.valueOf(E252CliCod), Boolean.valueOf(nE1014DibInt), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         if ( ( ( P00ZJ14_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X4860DibPrcCob = P00ZJ14_A4860DibPrcCob[0] ;
            nX4860DibPrcCob = false ;
            if (true) break;
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
      return X4860DibPrcCob ;
   }

   public void initialize( )
   {
      AV35Artextil = DecimalUtil.ZERO ;
      AV45UsurCod = "" ;
      AV46Station = "" ;
      AV47EmprNom = "" ;
      scmdbuf = "" ;
      P00ZJ2_A30AlbProCod = new long[1] ;
      P00ZJ2_A361DisCod = new int[1] ;
      P00ZJ2_A396EmprCod = new String[] {""} ;
      P00ZJ2_n396EmprCod = new boolean[] {false} ;
      P00ZJ2_A1013DibCli = new String[] {""} ;
      P00ZJ2_n1013DibCli = new boolean[] {false} ;
      P00ZJ2_A1014DibInt = new int[1] ;
      P00ZJ2_n1014DibInt = new boolean[] {false} ;
      P00ZJ2_A1032FonCod = new String[] {""} ;
      P00ZJ2_A1056DisComCod = new String[] {""} ;
      P00ZJ2_A1799BarDibInt = new int[1] ;
      P00ZJ2_A1798BarDibCli = new String[] {""} ;
      P00ZJ2_A212BarSer = new String[] {""} ;
      P00ZJ2_A125BarAncAca1 = new short[1] ;
      P00ZJ2_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ2_n4861DibCob = new boolean[] {false} ;
      P00ZJ2_A1823DibTipMaq = new String[] {""} ;
      P00ZJ2_n1823DibTipMaq = new boolean[] {false} ;
      P00ZJ2_A2524DisComLin = new byte[1] ;
      P00ZJ2_A130BarCodPar = new String[] {""} ;
      P00ZJ2_A132BarCodReo = new byte[1] ;
      P00ZJ2_A129BarCod = new int[1] ;
      P00ZJ2_A252CliCod = new int[1] ;
      P00ZJ2_n252CliCod = new boolean[] {false} ;
      A1013DibCli = "" ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A1798BarDibCli = "" ;
      A212BarSer = "" ;
      A4861DibCob = DecimalUtil.ZERO ;
      A1823DibTipMaq = "" ;
      A130BarCodPar = "" ;
      P00ZJ3_A2141SerEst = new String[] {""} ;
      P00ZJ3_A1013DibCli = new String[] {""} ;
      P00ZJ3_n1013DibCli = new boolean[] {false} ;
      P00ZJ3_A1014DibInt = new int[1] ;
      P00ZJ3_n1014DibInt = new boolean[] {false} ;
      P00ZJ3_A2074ColCom = new String[] {""} ;
      P00ZJ3_A2078ColFon = new String[] {""} ;
      P00ZJ3_A252CliCod = new int[1] ;
      P00ZJ3_n252CliCod = new boolean[] {false} ;
      P00ZJ3_A396EmprCod = new String[] {""} ;
      P00ZJ3_n396EmprCod = new boolean[] {false} ;
      P00ZJ3_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ3_n2076ColEstMba = new boolean[] {false} ;
      P00ZJ3_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ3_n2100MolCon = new boolean[] {false} ;
      P00ZJ3_A2098MolCod = new byte[1] ;
      A2141SerEst = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A2100MolCon = DecimalUtil.ZERO ;
      A4862MolPrcCob = DecimalUtil.ZERO ;
      P00ZJ5_A396EmprCod = new String[] {""} ;
      P00ZJ5_n396EmprCod = new boolean[] {false} ;
      P00ZJ5_A2140RepFonCod = new String[] {""} ;
      P00ZJ5_A2138RepComCod = new String[] {""} ;
      P00ZJ5_A2681RepComLin = new byte[1] ;
      P00ZJ5_A2136RepBarPar = new String[] {""} ;
      P00ZJ5_A2137RepBarReo = new byte[1] ;
      P00ZJ5_A2135RepBarCod = new int[1] ;
      P00ZJ5_A942TermCod = new String[] {""} ;
      A2140RepFonCod = "" ;
      A2138RepComCod = "" ;
      A2136RepBarPar = "" ;
      A942TermCod = "" ;
      P00ZJ6_A30AlbProCod = new long[1] ;
      P00ZJ6_A361DisCod = new int[1] ;
      P00ZJ6_A396EmprCod = new String[] {""} ;
      P00ZJ6_n396EmprCod = new boolean[] {false} ;
      P00ZJ6_A129BarCod = new int[1] ;
      P00ZJ6_A132BarCodReo = new byte[1] ;
      P00ZJ6_A130BarCodPar = new String[] {""} ;
      P00ZJ6_A2524DisComLin = new byte[1] ;
      P00ZJ6_A1056DisComCod = new String[] {""} ;
      P00ZJ6_A1032FonCod = new String[] {""} ;
      P00ZJ6_A1013DibCli = new String[] {""} ;
      P00ZJ6_n1013DibCli = new boolean[] {false} ;
      P00ZJ6_A1014DibInt = new int[1] ;
      P00ZJ6_n1014DibInt = new boolean[] {false} ;
      P00ZJ6_A1799BarDibInt = new int[1] ;
      P00ZJ6_A1798BarDibCli = new String[] {""} ;
      P00ZJ6_A212BarSer = new String[] {""} ;
      P00ZJ6_A125BarAncAca1 = new short[1] ;
      P00ZJ6_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ6_n4861DibCob = new boolean[] {false} ;
      P00ZJ6_A1823DibTipMaq = new String[] {""} ;
      P00ZJ6_n1823DibTipMaq = new boolean[] {false} ;
      P00ZJ6_A252CliCod = new int[1] ;
      P00ZJ6_n252CliCod = new boolean[] {false} ;
      P00ZJ7_A2141SerEst = new String[] {""} ;
      P00ZJ7_A1013DibCli = new String[] {""} ;
      P00ZJ7_n1013DibCli = new boolean[] {false} ;
      P00ZJ7_A1014DibInt = new int[1] ;
      P00ZJ7_n1014DibInt = new boolean[] {false} ;
      P00ZJ7_A2074ColCom = new String[] {""} ;
      P00ZJ7_A2078ColFon = new String[] {""} ;
      P00ZJ7_A252CliCod = new int[1] ;
      P00ZJ7_n252CliCod = new boolean[] {false} ;
      P00ZJ7_A396EmprCod = new String[] {""} ;
      P00ZJ7_n396EmprCod = new boolean[] {false} ;
      P00ZJ7_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ7_n2076ColEstMba = new boolean[] {false} ;
      P00ZJ7_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ7_n2100MolCon = new boolean[] {false} ;
      P00ZJ7_A2098MolCod = new byte[1] ;
      AV32TotMtrAgr = DecimalUtil.ZERO ;
      P00ZJ9_AV28Rep = new long[1] ;
      AV29Cont = DecimalUtil.ZERO ;
      P00ZJ10_A396EmprCod = new String[] {""} ;
      P00ZJ10_n396EmprCod = new boolean[] {false} ;
      P00ZJ10_A942TermCod = new String[] {""} ;
      P00ZJ10_A2139RepComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ10_n2139RepComMtr = new boolean[] {false} ;
      P00ZJ10_A2140RepFonCod = new String[] {""} ;
      P00ZJ10_A2138RepComCod = new String[] {""} ;
      P00ZJ10_A2681RepComLin = new byte[1] ;
      P00ZJ10_A2136RepBarPar = new String[] {""} ;
      P00ZJ10_A2137RepBarReo = new byte[1] ;
      P00ZJ10_A2135RepBarCod = new int[1] ;
      A2139RepComMtr = DecimalUtil.ZERO ;
      AV25Principal = "" ;
      P00ZJ11_A396EmprCod = new String[] {""} ;
      P00ZJ11_n396EmprCod = new boolean[] {false} ;
      P00ZJ11_A942TermCod = new String[] {""} ;
      P00ZJ11_A2139RepComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ11_n2139RepComMtr = new boolean[] {false} ;
      P00ZJ11_A2140RepFonCod = new String[] {""} ;
      P00ZJ11_A2138RepComCod = new String[] {""} ;
      P00ZJ11_A2681RepComLin = new byte[1] ;
      P00ZJ11_A2136RepBarPar = new String[] {""} ;
      P00ZJ11_A2137RepBarReo = new byte[1] ;
      P00ZJ11_A2135RepBarCod = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXv_char4 = new String[1] ;
      AV48DiaHora = "" ;
      AV49Dhh = "" ;
      AV50Filename = "" ;
      GXv_int12 = new int[1] ;
      GXv_char5 = new String[1] ;
      P00ZJ12_A396EmprCod = new String[] {""} ;
      P00ZJ12_n396EmprCod = new boolean[] {false} ;
      P00ZJ12_A2509BarCodLan = new int[1] ;
      P00ZJ12_n2509BarCodLan = new boolean[] {false} ;
      P00ZJ12_A2124RecMolCod = new byte[1] ;
      P00ZJ12_A1032FonCod = new String[] {""} ;
      P00ZJ12_A1056DisComCod = new String[] {""} ;
      P00ZJ12_A130BarCodPar = new String[] {""} ;
      P00ZJ12_A132BarCodReo = new byte[1] ;
      P00ZJ12_A129BarCod = new int[1] ;
      P00ZJ12_A2524DisComLin = new byte[1] ;
      Gx_msg = "" ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int18 = new byte[1] ;
      AV44Inc_obs = "" ;
      AV64Pgmname = "" ;
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      E1013DibCli = "" ;
      P00ZJ13_A396EmprCod = new String[] {""} ;
      P00ZJ13_n396EmprCod = new boolean[] {false} ;
      P00ZJ13_A1013DibCli = new String[] {""} ;
      P00ZJ13_n1013DibCli = new boolean[] {false} ;
      P00ZJ13_A252CliCod = new int[1] ;
      P00ZJ13_n252CliCod = new boolean[] {false} ;
      P00ZJ13_A1014DibInt = new int[1] ;
      P00ZJ13_n1014DibInt = new boolean[] {false} ;
      P00ZJ13_A1029DibLin = new short[1] ;
      P00ZJ13_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ13_n5381DibPrcCobM = new boolean[] {false} ;
      P00ZJ13_A2088DibDibMol = new byte[1] ;
      P00ZJ13_n2088DibDibMol = new boolean[] {false} ;
      X4860DibPrcCob = DecimalUtil.ZERO ;
      P00ZJ14_A396EmprCod = new String[] {""} ;
      P00ZJ14_n396EmprCod = new boolean[] {false} ;
      P00ZJ14_A1013DibCli = new String[] {""} ;
      P00ZJ14_n1013DibCli = new boolean[] {false} ;
      P00ZJ14_A252CliCod = new int[1] ;
      P00ZJ14_n252CliCod = new boolean[] {false} ;
      P00ZJ14_A1014DibInt = new int[1] ;
      P00ZJ14_n1014DibInt = new boolean[] {false} ;
      P00ZJ14_A1807DibLinCil = new short[1] ;
      P00ZJ14_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZJ14_n4860DibPrcCob = new boolean[] {false} ;
      P00ZJ14_A2089DibLinMol = new byte[1] ;
      P00ZJ14_n2089DibLinMol = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.planres__default(),
         new Object[] {
             new Object[] {
            P00ZJ2_A30AlbProCod, P00ZJ2_A361DisCod, P00ZJ2_A396EmprCod, P00ZJ2_A1013DibCli, P00ZJ2_n1013DibCli, P00ZJ2_A1014DibInt, P00ZJ2_n1014DibInt, P00ZJ2_A1032FonCod, P00ZJ2_A1056DisComCod, P00ZJ2_A1799BarDibInt,
            P00ZJ2_A1798BarDibCli, P00ZJ2_A212BarSer, P00ZJ2_A125BarAncAca1, P00ZJ2_A4861DibCob, P00ZJ2_n4861DibCob, P00ZJ2_A1823DibTipMaq, P00ZJ2_n1823DibTipMaq, P00ZJ2_A2524DisComLin, P00ZJ2_A130BarCodPar, P00ZJ2_A132BarCodReo,
            P00ZJ2_A129BarCod, P00ZJ2_A252CliCod, P00ZJ2_n252CliCod
            }
            , new Object[] {
            P00ZJ3_A2141SerEst, P00ZJ3_A1013DibCli, P00ZJ3_A1014DibInt, P00ZJ3_A2074ColCom, P00ZJ3_A2078ColFon, P00ZJ3_A252CliCod, P00ZJ3_A396EmprCod, P00ZJ3_A2076ColEstMba, P00ZJ3_n2076ColEstMba, P00ZJ3_A2100MolCon,
            P00ZJ3_n2100MolCon, P00ZJ3_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00ZJ5_A396EmprCod, P00ZJ5_n396EmprCod, P00ZJ5_A2140RepFonCod, P00ZJ5_A2138RepComCod, P00ZJ5_A2681RepComLin, P00ZJ5_A2136RepBarPar, P00ZJ5_A2137RepBarReo, P00ZJ5_A2135RepBarCod, P00ZJ5_A942TermCod
            }
            , new Object[] {
            P00ZJ6_A30AlbProCod, P00ZJ6_A361DisCod, P00ZJ6_A396EmprCod, P00ZJ6_A129BarCod, P00ZJ6_A132BarCodReo, P00ZJ6_A130BarCodPar, P00ZJ6_A2524DisComLin, P00ZJ6_A1056DisComCod, P00ZJ6_A1032FonCod, P00ZJ6_A1013DibCli,
            P00ZJ6_n1013DibCli, P00ZJ6_A1014DibInt, P00ZJ6_n1014DibInt, P00ZJ6_A1799BarDibInt, P00ZJ6_A1798BarDibCli, P00ZJ6_A212BarSer, P00ZJ6_A125BarAncAca1, P00ZJ6_A4861DibCob, P00ZJ6_n4861DibCob, P00ZJ6_A1823DibTipMaq,
            P00ZJ6_n1823DibTipMaq, P00ZJ6_A252CliCod, P00ZJ6_n252CliCod
            }
            , new Object[] {
            P00ZJ7_A2141SerEst, P00ZJ7_A1013DibCli, P00ZJ7_A1014DibInt, P00ZJ7_A2074ColCom, P00ZJ7_A2078ColFon, P00ZJ7_A252CliCod, P00ZJ7_A396EmprCod, P00ZJ7_A2076ColEstMba, P00ZJ7_n2076ColEstMba, P00ZJ7_A2100MolCon,
            P00ZJ7_n2100MolCon, P00ZJ7_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00ZJ9_AV28Rep
            }
            , new Object[] {
            P00ZJ10_A396EmprCod, P00ZJ10_n396EmprCod, P00ZJ10_A942TermCod, P00ZJ10_A2139RepComMtr, P00ZJ10_n2139RepComMtr, P00ZJ10_A2140RepFonCod, P00ZJ10_A2138RepComCod, P00ZJ10_A2681RepComLin, P00ZJ10_A2136RepBarPar, P00ZJ10_A2137RepBarReo,
            P00ZJ10_A2135RepBarCod
            }
            , new Object[] {
            P00ZJ11_A396EmprCod, P00ZJ11_n396EmprCod, P00ZJ11_A942TermCod, P00ZJ11_A2139RepComMtr, P00ZJ11_n2139RepComMtr, P00ZJ11_A2140RepFonCod, P00ZJ11_A2138RepComCod, P00ZJ11_A2681RepComLin, P00ZJ11_A2136RepBarPar, P00ZJ11_A2137RepBarReo,
            P00ZJ11_A2135RepBarCod
            }
            , new Object[] {
            P00ZJ12_A396EmprCod, P00ZJ12_A2509BarCodLan, P00ZJ12_n2509BarCodLan, P00ZJ12_A2124RecMolCod, P00ZJ12_A1032FonCod, P00ZJ12_A1056DisComCod, P00ZJ12_A130BarCodPar, P00ZJ12_A132BarCodReo, P00ZJ12_A129BarCod, P00ZJ12_A2524DisComLin
            }
            , new Object[] {
            P00ZJ13_A396EmprCod, P00ZJ13_A1013DibCli, P00ZJ13_A252CliCod, P00ZJ13_A1014DibInt, P00ZJ13_A1029DibLin, P00ZJ13_A5381DibPrcCobM, P00ZJ13_n5381DibPrcCobM, P00ZJ13_A2088DibDibMol, P00ZJ13_n2088DibDibMol
            }
            , new Object[] {
            P00ZJ14_A396EmprCod, P00ZJ14_A1013DibCli, P00ZJ14_A252CliCod, P00ZJ14_A1014DibInt, P00ZJ14_A1807DibLinCil, P00ZJ14_A4860DibPrcCob, P00ZJ14_n4860DibPrcCob, P00ZJ14_A2089DibLinMol, P00ZJ14_n2089DibLinMol
            }
         }
      );
      AV64Pgmname = "PLANRES" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV64Pgmname = "PLANRES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV19DisComLin ;
   private byte AV30PLinea ;
   private byte AV31Partes ;
   private byte AV33AgrEst ;
   private byte AV37Eliot ;
   private byte AV41SiRepe ;
   private byte AV43NoReceta ;
   private byte AV51sistock ;
   private byte GXt_int1 ;
   private byte A2524DisComLin ;
   private byte A132BarCodReo ;
   private byte A2098MolCod ;
   private byte A2681RepComLin ;
   private byte A2137RepBarReo ;
   private byte A2124RecMolCod ;
   private byte GXv_int8[] ;
   private byte GXv_int2[] ;
   private byte GXv_int18[] ;
   private byte E2098MolCod ;
   private short AV23RecEstAnh ;
   private short A125BarAncAca1 ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV38Opecod ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int A361DisCod ;
   private int A1014DibInt ;
   private int A1799BarDibInt ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A2135RepBarCod ;
   private int AV27BarCodLan ;
   private int GXv_int6[] ;
   private int GXv_int12[] ;
   private int A2509BarCodLan ;
   private int GXv_int15[] ;
   private int Gx_page ;
   private int E252CliCod ;
   private int E1014DibInt ;
   private long A30AlbProCod ;
   private long AV28Rep ;
   private long cV28Rep ;
   private java.math.BigDecimal AV22BarComMtr ;
   private java.math.BigDecimal AV39VarPor ;
   private java.math.BigDecimal AV42ArtFacUti ;
   private java.math.BigDecimal AV35Artextil ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A4862MolPrcCob ;
   private java.math.BigDecimal AV32TotMtrAgr ;
   private java.math.BigDecimal AV29Cont ;
   private java.math.BigDecimal A2139RepComMtr ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal X5381DibPrcCobM ;
   private java.math.BigDecimal X4860DibPrcCob ;
   private String A396EmprCod ;
   private String AV15TermCod ;
   private String AV18BarCodPar ;
   private String AV20DisComCod ;
   private String AV21FonCod ;
   private String AV24ConStk ;
   private String AV36Maqcod ;
   private String AV26Ok ;
   private String AV45UsurCod ;
   private String AV46Station ;
   private String AV47EmprNom ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A1798BarDibCli ;
   private String A212BarSer ;
   private String A1823DibTipMaq ;
   private String A130BarCodPar ;
   private String A2141SerEst ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String A2140RepFonCod ;
   private String A2138RepComCod ;
   private String A2136RepBarPar ;
   private String A942TermCod ;
   private String AV25Principal ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV48DiaHora ;
   private String AV49Dhh ;
   private String AV50Filename ;
   private String GXv_char5[] ;
   private String Gx_msg ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String AV64Pgmname ;
   private String E396EmprCod ;
   private String E1013DibCli ;
   private boolean n396EmprCod ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n4861DibCob ;
   private boolean n1823DibTipMaq ;
   private boolean n252CliCod ;
   private boolean n2076ColEstMba ;
   private boolean n2100MolCon ;
   private boolean n2139RepComMtr ;
   private boolean n2509BarCodLan ;
   private boolean Gx_first ;
   private boolean nA396EmprCod ;
   private boolean nA1013DibCli ;
   private boolean nA252CliCod ;
   private boolean nA1014DibInt ;
   private boolean nX5381DibPrcCobM ;
   private boolean nE396EmprCod ;
   private boolean nE1013DibCli ;
   private boolean nE252CliCod ;
   private boolean nE1014DibInt ;
   private boolean nX4860DibPrcCob ;
   private String AV44Inc_obs ;
   private String[] aP15 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private IDataStoreProvider pr_default ;
   private long[] P00ZJ2_A30AlbProCod ;
   private int[] P00ZJ2_A361DisCod ;
   private String[] P00ZJ2_A396EmprCod ;
   private boolean[] P00ZJ2_n396EmprCod ;
   private String[] P00ZJ2_A1013DibCli ;
   private boolean[] P00ZJ2_n1013DibCli ;
   private int[] P00ZJ2_A1014DibInt ;
   private boolean[] P00ZJ2_n1014DibInt ;
   private String[] P00ZJ2_A1032FonCod ;
   private String[] P00ZJ2_A1056DisComCod ;
   private int[] P00ZJ2_A1799BarDibInt ;
   private String[] P00ZJ2_A1798BarDibCli ;
   private String[] P00ZJ2_A212BarSer ;
   private short[] P00ZJ2_A125BarAncAca1 ;
   private java.math.BigDecimal[] P00ZJ2_A4861DibCob ;
   private boolean[] P00ZJ2_n4861DibCob ;
   private String[] P00ZJ2_A1823DibTipMaq ;
   private boolean[] P00ZJ2_n1823DibTipMaq ;
   private byte[] P00ZJ2_A2524DisComLin ;
   private String[] P00ZJ2_A130BarCodPar ;
   private byte[] P00ZJ2_A132BarCodReo ;
   private int[] P00ZJ2_A129BarCod ;
   private int[] P00ZJ2_A252CliCod ;
   private boolean[] P00ZJ2_n252CliCod ;
   private String[] P00ZJ3_A2141SerEst ;
   private String[] P00ZJ3_A1013DibCli ;
   private boolean[] P00ZJ3_n1013DibCli ;
   private int[] P00ZJ3_A1014DibInt ;
   private boolean[] P00ZJ3_n1014DibInt ;
   private String[] P00ZJ3_A2074ColCom ;
   private String[] P00ZJ3_A2078ColFon ;
   private int[] P00ZJ3_A252CliCod ;
   private boolean[] P00ZJ3_n252CliCod ;
   private String[] P00ZJ3_A396EmprCod ;
   private boolean[] P00ZJ3_n396EmprCod ;
   private java.math.BigDecimal[] P00ZJ3_A2076ColEstMba ;
   private boolean[] P00ZJ3_n2076ColEstMba ;
   private java.math.BigDecimal[] P00ZJ3_A2100MolCon ;
   private boolean[] P00ZJ3_n2100MolCon ;
   private byte[] P00ZJ3_A2098MolCod ;
   private String[] P00ZJ5_A396EmprCod ;
   private boolean[] P00ZJ5_n396EmprCod ;
   private String[] P00ZJ5_A2140RepFonCod ;
   private String[] P00ZJ5_A2138RepComCod ;
   private byte[] P00ZJ5_A2681RepComLin ;
   private String[] P00ZJ5_A2136RepBarPar ;
   private byte[] P00ZJ5_A2137RepBarReo ;
   private int[] P00ZJ5_A2135RepBarCod ;
   private String[] P00ZJ5_A942TermCod ;
   private long[] P00ZJ6_A30AlbProCod ;
   private int[] P00ZJ6_A361DisCod ;
   private String[] P00ZJ6_A396EmprCod ;
   private boolean[] P00ZJ6_n396EmprCod ;
   private int[] P00ZJ6_A129BarCod ;
   private byte[] P00ZJ6_A132BarCodReo ;
   private String[] P00ZJ6_A130BarCodPar ;
   private byte[] P00ZJ6_A2524DisComLin ;
   private String[] P00ZJ6_A1056DisComCod ;
   private String[] P00ZJ6_A1032FonCod ;
   private String[] P00ZJ6_A1013DibCli ;
   private boolean[] P00ZJ6_n1013DibCli ;
   private int[] P00ZJ6_A1014DibInt ;
   private boolean[] P00ZJ6_n1014DibInt ;
   private int[] P00ZJ6_A1799BarDibInt ;
   private String[] P00ZJ6_A1798BarDibCli ;
   private String[] P00ZJ6_A212BarSer ;
   private short[] P00ZJ6_A125BarAncAca1 ;
   private java.math.BigDecimal[] P00ZJ6_A4861DibCob ;
   private boolean[] P00ZJ6_n4861DibCob ;
   private String[] P00ZJ6_A1823DibTipMaq ;
   private boolean[] P00ZJ6_n1823DibTipMaq ;
   private int[] P00ZJ6_A252CliCod ;
   private boolean[] P00ZJ6_n252CliCod ;
   private String[] P00ZJ7_A2141SerEst ;
   private String[] P00ZJ7_A1013DibCli ;
   private boolean[] P00ZJ7_n1013DibCli ;
   private int[] P00ZJ7_A1014DibInt ;
   private boolean[] P00ZJ7_n1014DibInt ;
   private String[] P00ZJ7_A2074ColCom ;
   private String[] P00ZJ7_A2078ColFon ;
   private int[] P00ZJ7_A252CliCod ;
   private boolean[] P00ZJ7_n252CliCod ;
   private String[] P00ZJ7_A396EmprCod ;
   private boolean[] P00ZJ7_n396EmprCod ;
   private java.math.BigDecimal[] P00ZJ7_A2076ColEstMba ;
   private boolean[] P00ZJ7_n2076ColEstMba ;
   private java.math.BigDecimal[] P00ZJ7_A2100MolCon ;
   private boolean[] P00ZJ7_n2100MolCon ;
   private byte[] P00ZJ7_A2098MolCod ;
   private long[] P00ZJ9_AV28Rep ;
   private String[] P00ZJ10_A396EmprCod ;
   private boolean[] P00ZJ10_n396EmprCod ;
   private String[] P00ZJ10_A942TermCod ;
   private java.math.BigDecimal[] P00ZJ10_A2139RepComMtr ;
   private boolean[] P00ZJ10_n2139RepComMtr ;
   private String[] P00ZJ10_A2140RepFonCod ;
   private String[] P00ZJ10_A2138RepComCod ;
   private byte[] P00ZJ10_A2681RepComLin ;
   private String[] P00ZJ10_A2136RepBarPar ;
   private byte[] P00ZJ10_A2137RepBarReo ;
   private int[] P00ZJ10_A2135RepBarCod ;
   private String[] P00ZJ11_A396EmprCod ;
   private boolean[] P00ZJ11_n396EmprCod ;
   private String[] P00ZJ11_A942TermCod ;
   private java.math.BigDecimal[] P00ZJ11_A2139RepComMtr ;
   private boolean[] P00ZJ11_n2139RepComMtr ;
   private String[] P00ZJ11_A2140RepFonCod ;
   private String[] P00ZJ11_A2138RepComCod ;
   private byte[] P00ZJ11_A2681RepComLin ;
   private String[] P00ZJ11_A2136RepBarPar ;
   private byte[] P00ZJ11_A2137RepBarReo ;
   private int[] P00ZJ11_A2135RepBarCod ;
   private String[] P00ZJ12_A396EmprCod ;
   private boolean[] P00ZJ12_n396EmprCod ;
   private int[] P00ZJ12_A2509BarCodLan ;
   private boolean[] P00ZJ12_n2509BarCodLan ;
   private byte[] P00ZJ12_A2124RecMolCod ;
   private String[] P00ZJ12_A1032FonCod ;
   private String[] P00ZJ12_A1056DisComCod ;
   private String[] P00ZJ12_A130BarCodPar ;
   private byte[] P00ZJ12_A132BarCodReo ;
   private int[] P00ZJ12_A129BarCod ;
   private byte[] P00ZJ12_A2524DisComLin ;
   private String[] P00ZJ13_A396EmprCod ;
   private boolean[] P00ZJ13_n396EmprCod ;
   private String[] P00ZJ13_A1013DibCli ;
   private boolean[] P00ZJ13_n1013DibCli ;
   private int[] P00ZJ13_A252CliCod ;
   private boolean[] P00ZJ13_n252CliCod ;
   private int[] P00ZJ13_A1014DibInt ;
   private boolean[] P00ZJ13_n1014DibInt ;
   private short[] P00ZJ13_A1029DibLin ;
   private java.math.BigDecimal[] P00ZJ13_A5381DibPrcCobM ;
   private boolean[] P00ZJ13_n5381DibPrcCobM ;
   private byte[] P00ZJ13_A2088DibDibMol ;
   private boolean[] P00ZJ13_n2088DibDibMol ;
   private String[] P00ZJ14_A396EmprCod ;
   private boolean[] P00ZJ14_n396EmprCod ;
   private String[] P00ZJ14_A1013DibCli ;
   private boolean[] P00ZJ14_n1013DibCli ;
   private int[] P00ZJ14_A252CliCod ;
   private boolean[] P00ZJ14_n252CliCod ;
   private int[] P00ZJ14_A1014DibInt ;
   private boolean[] P00ZJ14_n1014DibInt ;
   private short[] P00ZJ14_A1807DibLinCil ;
   private java.math.BigDecimal[] P00ZJ14_A4860DibPrcCob ;
   private boolean[] P00ZJ14_n4860DibPrcCob ;
   private byte[] P00ZJ14_A2089DibLinMol ;
   private boolean[] P00ZJ14_n2089DibLinMol ;
}

final  class planres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZJ2", "SELECT T1.AlbProCod, T2.DisCod, T1.EmprCod, T4.DibCli, T4.DibInt, T1.FonCod, T1.DisComCod, T2.BarDibInt, T2.BarDibCli, T2.BarSer, T2.BarAncAca1, T5.DibCob, T5.DibTipMaq, T1.DisComLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliCod FROM ((((TXPALBEST T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T2.DisCod) LEFT JOIN TXPCDIBUJ T5 ON T5.EmprCod = T1.EmprCod AND T5.DibCli = T4.DibCli AND T5.CliCod = T2.CliCod AND T5.DibInt = T4.DibInt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ3", "SELECT T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.CliCod, T1.EmprCod, T2.ColEstMba, T1.MolCon, T1.MolCod FROM (TXPMFORES T1 INNER JOIN TXPCFORES T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.SerEst = T1.SerEst AND T2.DibCli = T1.DibCli AND T2.DibInt = T1.DibInt AND T2.ColCom = T1.ColCom AND T2.ColFon = T1.ColFon) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZJ4", "UPDATE TXPMFORES SET MolCon=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
         ,new ForEachCursor("P00ZJ5", "SELECT T2.EmprCod, T1.RepFonCod, T1.RepComCod, T1.RepComLin, T1.RepBarPar, T1.RepBarReo, T1.RepBarCod, T1.TermCod FROM (TXPLANREP T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod) ORDER BY T1.TermCod, T1.RepBarCod, T1.RepBarReo, T1.RepBarPar, T1.RepComLin, T1.RepComCod, T1.RepFonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ6", "SELECT T1.AlbProCod, T2.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T4.DibCli, T4.DibInt, T2.BarDibInt, T2.BarDibCli, T2.BarSer, T2.BarAncAca1, T5.DibCob, T5.DibTipMaq, T2.CliCod FROM ((((TXPALBEST T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T2.DisCod) LEFT JOIN TXPCDIBUJ T5 ON T5.EmprCod = T1.EmprCod AND T5.DibCli = T4.DibCli AND T5.CliCod = T2.CliCod AND T5.DibInt = T4.DibInt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ7", "SELECT T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.CliCod, T1.EmprCod, T2.ColEstMba, T1.MolCon, T1.MolCod FROM (TXPMFORES T1 INNER JOIN TXPCFORES T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.SerEst = T1.SerEst AND T2.DibCli = T1.DibCli AND T2.DibInt = T1.DibInt AND T2.ColCom = T1.ColCom AND T2.ColFon = T1.ColFon) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZJ8", "UPDATE TXPMFORES SET MolCon=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
         ,new ForEachCursor("P00ZJ9", "SELECT COUNT(*) FROM TXPLANREP WHERE TermCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ10", "SELECT T2.EmprCod, T1.TermCod, T1.RepComMtr, T1.RepFonCod, T1.RepComCod, T1.RepComLin, T1.RepBarPar, T1.RepBarReo, T1.RepBarCod FROM (TXPLANREP T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod) WHERE (T1.TermCod = ?) AND (T2.EmprCod = ?) ORDER BY T1.TermCod, T1.RepBarCod, T1.RepBarReo, T1.RepBarPar, T1.RepComLin, T1.RepComCod, T1.RepFonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ11", "SELECT T2.EmprCod, T1.TermCod, T1.RepComMtr, T1.RepFonCod, T1.RepComCod, T1.RepComLin, T1.RepBarPar, T1.RepBarReo, T1.RepBarCod FROM (TXPLANREP T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod) WHERE (T1.TermCod = ?) AND (T2.EmprCod = ?) ORDER BY T1.TermCod, T1.RepBarCod, T1.RepBarReo, T1.RepBarPar, T1.RepComLin, T1.RepComCod, T1.RepFonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ12", "SELECT T1.EmprCod, T2.BarCodLan, T1.RecMolCod, T1.FonCod, T1.DisComCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisComLin FROM (TXPRECMOL T1 INNER JOIN TXPBARCOM T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.DisComLin = T1.DisComLin AND T2.DisComCod = T1.DisComCod AND T2.FonCod = T1.FonCod) WHERE T1.EmprCod = ? and T2.BarCodLan = ? ORDER BY T1.EmprCod, T2.BarCodLan ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ13", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibPrcCobM, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZJ14", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibPrcCob, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 12);
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 12);
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 12);
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 12);
               ((String[]) buf[6])[0] = rslt.getString(5, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 16);
               stmt.setString(4, (String)parms[5], 16);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 12);
               stmt.setString(7, (String)parms[8], 12);
               return;
            case 2 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 16);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               stmt.setString(7, (String)parms[11], 12);
               stmt.setString(8, (String)parms[12], 12);
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 16);
               stmt.setString(4, (String)parms[5], 16);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 12);
               stmt.setString(7, (String)parms[8], 12);
               return;
            case 6 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 16);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               stmt.setString(7, (String)parms[11], 12);
               stmt.setString(8, (String)parms[12], 12);
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               return;
      }
   }

}

