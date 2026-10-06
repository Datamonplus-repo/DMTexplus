package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcarvsedo extends GXProcedure
{
   public pcarvsedo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcarvsedo.class ), "" );
   }

   public pcarvsedo( int remoteHandle ,
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
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pcarvsedo.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pcarvsedo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcarvsedo.this.AV62Dirp = aP1[0];
      this.aP1 = aP1;
      pcarvsedo.this.AV23Barcod = aP2[0];
      this.aP2 = aP2;
      pcarvsedo.this.AV25Barcodreo = aP3[0];
      this.aP3 = aP3;
      pcarvsedo.this.AV24Barcodpar = aP4[0];
      this.aP4 = aP4;
      pcarvsedo.this.AV94Reclinmaq = aP5[0];
      this.aP5 = aP5;
      pcarvsedo.this.AV80Msg_ctrl = aP6[0];
      this.aP6 = aP6;
      pcarvsedo.this.AV103Status = aP7[0];
      this.aP7 = aP7;
      pcarvsedo.this.AV91Programa = aP8[0];
      this.aP8 = aP8;
      pcarvsedo.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV60Dir = AV62Dirp ;
      AV60Dir = GXutil.trim( AV60Dir) ;
      AV72LenVar = (byte)(GXutil.len( AV60Dir)) ;
      AV60Dir = ((GXutil.strcmp(GXutil.substring( AV60Dir, AV72LenVar, 1), "\\")!=0) ? AV60Dir+"\\" : AV60Dir) ;
      GXt_char1 = AV102Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcarvsedo.this.GXt_char1 = GXv_char2[0] ;
      AV102Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char4[0] = AV109UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV102Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcarvsedo.this.A396EmprCod = GXv_char2[0] ;
      pcarvsedo.this.AV63EmprNom = GXv_char3[0] ;
      pcarvsedo.this.AV109UsurCod = GXv_char4[0] ;
      GXt_int5 = AV114ActOF9 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OF9SED", ""), GXv_int6) ;
      pcarvsedo.this.GXt_int5 = GXv_int6[0] ;
      AV114ActOF9 = GXt_int5 ;
      AV80Msg_ctrl = " " ;
      AV31BCSd001 = (byte)(0) ;
      AV32BCSd002 = (short)(0) ;
      AV33BCSd003 = 0 ;
      AV34BCSd004 = (short)(0) ;
      AV35BCSd005 = (short)(0) ;
      AV36BCSd006 = 0 ;
      AV37BCSd007 = (byte)(0) ;
      AV38BCSd008 = (short)(0) ;
      AV39BCSd009 = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05TW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV23Barcod), Byte.valueOf(AV25Barcodreo), AV24Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9613Lb_Hdrp = P05TW2_A9613Lb_Hdrp[0] ;
         A9612Lb_Hdrr = P05TW2_A9612Lb_Hdrr[0] ;
         A9611Lb_Hdr = P05TW2_A9611Lb_Hdr[0] ;
         A13222BCSd001 = P05TW2_A13222BCSd001[0] ;
         n13222BCSd001 = P05TW2_n13222BCSd001[0] ;
         A13223BCSd002 = P05TW2_A13223BCSd002[0] ;
         n13223BCSd002 = P05TW2_n13223BCSd002[0] ;
         A13224BCSd003 = P05TW2_A13224BCSd003[0] ;
         n13224BCSd003 = P05TW2_n13224BCSd003[0] ;
         A13225BCSd004 = P05TW2_A13225BCSd004[0] ;
         n13225BCSd004 = P05TW2_n13225BCSd004[0] ;
         A13226BCSd005 = P05TW2_A13226BCSd005[0] ;
         n13226BCSd005 = P05TW2_n13226BCSd005[0] ;
         A13227BCSd006 = P05TW2_A13227BCSd006[0] ;
         n13227BCSd006 = P05TW2_n13227BCSd006[0] ;
         A13228BCSd007 = P05TW2_A13228BCSd007[0] ;
         n13228BCSd007 = P05TW2_n13228BCSd007[0] ;
         A13229BCSd008 = P05TW2_A13229BCSd008[0] ;
         n13229BCSd008 = P05TW2_n13229BCSd008[0] ;
         A13221BCSd009 = P05TW2_A13221BCSd009[0] ;
         n13221BCSd009 = P05TW2_n13221BCSd009[0] ;
         AV31BCSd001 = A13222BCSd001 ;
         AV32BCSd002 = A13223BCSd002 ;
         AV33BCSd003 = A13224BCSd003 ;
         AV34BCSd004 = A13225BCSd004 ;
         AV35BCSd005 = A13226BCSd005 ;
         AV36BCSd006 = A13227BCSd006 ;
         AV37BCSd007 = A13228BCSd007 ;
         AV38BCSd008 = A13229BCSd008 ;
         AV39BCSd009 = A13221BCSd009 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05TW5 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV23Barcod), Byte.valueOf(AV25Barcodreo), AV24Barcodpar, Short.valueOf(AV94Reclinmaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P05TW5_A2804RecLinMaq[0] ;
         A130BarCodPar = P05TW5_A130BarCodPar[0] ;
         A132BarCodReo = P05TW5_A132BarCodReo[0] ;
         A129BarCod = P05TW5_A129BarCod[0] ;
         A252CliCod = P05TW5_A252CliCod[0] ;
         n252CliCod = P05TW5_n252CliCod[0] ;
         A212BarSer = P05TW5_A212BarSer[0] ;
         A135BarColNom = P05TW5_A135BarColNom[0] ;
         A136BarColNum = P05TW5_A136BarColNum[0] ;
         A218BarTipCol = P05TW5_A218BarTipCol[0] ;
         A602MaqCod = P05TW5_A602MaqCod[0] ;
         A5109RecNumInt = P05TW5_A5109RecNumInt[0] ;
         A279CliNom = P05TW5_A279CliNom[0] ;
         A217BarTipArt = P05TW5_A217BarTipArt[0] ;
         n217BarTipArt = P05TW5_n217BarTipArt[0] ;
         A1652BarSerDsc = P05TW5_A1652BarSerDsc[0] ;
         A5110RecNumPrg = P05TW5_A5110RecNumPrg[0] ;
         A2805RecVolPrd = P05TW5_A2805RecVolPrd[0] ;
         A2806RecFA = P05TW5_A2806RecFA[0] ;
         A4812BarEncCli = P05TW5_A4812BarEncCli[0] ;
         A864BarPes = P05TW5_A864BarPes[0] ;
         A166BarKgm = P05TW5_A166BarKgm[0] ;
         n166BarKgm = P05TW5_n166BarKgm[0] ;
         A219BarTotAgr = P05TW5_A219BarTotAgr[0] ;
         n219BarTotAgr = P05TW5_n219BarTotAgr[0] ;
         A252CliCod = P05TW5_A252CliCod[0] ;
         n252CliCod = P05TW5_n252CliCod[0] ;
         A212BarSer = P05TW5_A212BarSer[0] ;
         A135BarColNom = P05TW5_A135BarColNom[0] ;
         A136BarColNum = P05TW5_A136BarColNum[0] ;
         A218BarTipCol = P05TW5_A218BarTipCol[0] ;
         A217BarTipArt = P05TW5_A217BarTipArt[0] ;
         n217BarTipArt = P05TW5_n217BarTipArt[0] ;
         A1652BarSerDsc = P05TW5_A1652BarSerDsc[0] ;
         A4812BarEncCli = P05TW5_A4812BarEncCli[0] ;
         A864BarPes = P05TW5_A864BarPes[0] ;
         A279CliNom = P05TW5_A279CliNom[0] ;
         A219BarTotAgr = P05TW5_A219BarTotAgr[0] ;
         n219BarTotAgr = P05TW5_n219BarTotAgr[0] ;
         A166BarKgm = P05TW5_A166BarKgm[0] ;
         n166BarKgm = P05TW5_n166BarKgm[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         AV70Hdr = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV54clicod = A252CliCod ;
         AV29barser = A212BarSer ;
         AV26barcolnom = A135BarColNom ;
         AV27barcolnum = A136BarColNum ;
         AV30bartipcol = A218BarTipCol ;
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV74Maqcod = A602MaqCod ;
         AV77MaqCod4 = GXutil.substring( A602MaqCod, 5, 2) ;
         /* Execute user subroutine: 'MAQUIN' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV80Msg_ctrl, " ") != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV83Num_Mq = (short)(GXutil.lval( GXutil.substring( A602MaqCod, 5, 2))) ;
         AV85OF20 = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV86Of6 = A5109RecNumInt ;
         AV87Of9 = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) ;
         AV55Cliente20 = GXutil.substring( A279CliNom, 1, 20) ;
         GXt_char1 = AV106Tipartdsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
         pcarvsedo.this.GXt_char1 = GXv_char4[0] ;
         AV106Tipartdsc = GXt_char1 ;
         AV15Artigo20 = GXutil.padr( GXutil.trim( GXutil.substring( A1652BarSerDsc, 1, 10)), 10, " ") + GXutil.padr( GXutil.trim( GXutil.substring( AV106Tipartdsc, 1, 10)), 10, " ") ;
         AV56Color20 = GXutil.padr( GXutil.trim( A135BarColNom), 13, " ") + " " + GXutil.padr( GXutil.trim( GXutil.str( A136BarColNum, 6, 0)), 6, " ") ;
         AV93Receta20 = A135BarColNom ;
         AV84Num_p = (short)(GXutil.lval( GXutil.substring( A5110RecNumPrg, 1, 4))) ;
         AV92Rb = DecimalUtil.doubleToDec(0) ;
         if ( A812RecTotKgm.doubleValue() > 0 )
         {
            AV92Rb = GXutil.roundDecimal( DecimalUtil.doubleToDec(A2805RecVolPrd).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 0) ;
         }
         AV65Fabs = A2806RecFA ;
         AV88Peso = A812RecTotKgm ;
         AV28Barenccli = A4812BarEncCli ;
         AV90Pml = A864BarPes ;
         AV82NSlaves = (byte)(0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXt_int7 = AV57Contval ;
      GXv_int8[0] = GXt_int7 ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int8) ;
      pcarvsedo.this.GXt_int7 = GXv_int8[0] ;
      AV57Contval = GXt_int7 ;
      AV67FicA = GXutil.padl( GXutil.trim( GXutil.str( AV57Contval, 8, 0)), (short)(8), "0") ;
      AV61DirFinal = GXutil.trim( AV60Dir) ;
      AV110Filename = AV61DirFinal + AV67FicA + ".dat" ;
      AV112TextFile.setSource( AV110Filename );
      AV112TextFile.create();
      AV112TextFile.openWrite("");
      AV65Fabs = AV65Fabs.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN) ;
      AV113TextFileLine = httpContext.getMessage( "\"BATCH\"", "") + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV83Num_Mq, 4, 0)), (short)(4), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( AV55Cliente20), (short)(20), " ") + "\"" + "," ;
      AV113TextFileLine += "\"" + AV56Color20 + "\"" + "," ;
      AV113TextFileLine += "\"" + AV15Artigo20 + "\"" + "," ;
      if ( AV114ActOF9 == 0 )
      {
         AV113TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( AV86Of6, 6, 0)), 6, " ") + "\"" + "," ;
      }
      else
      {
         AV113TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV87Of9), 9, " ") + "\"" + "," ;
      }
      AV113TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV28Barenccli), 20, " ") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV84Num_p, 4, 0)), (short)(4), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV88Peso, 6, 1)), (short)(6), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV90Pml, 3, 0)), (short)(3), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + ((AV31BCSd001==0) ? "2" : "1") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV32BCSd002, 4, 0)), (short)(4), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV92Rb, 4, 1)), (short)(4), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV65Fabs, 3, 1)), (short)(3), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV33BCSd003, 5, 0)), (short)(5), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV34BCSd004, 3, 0)), (short)(3), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV35BCSd005, 4, 0)), (short)(4), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV36BCSd006, 5, 0)), (short)(5), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV37BCSd007, 1, 0)), (short)(1), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV38BCSd008, 3, 0)), (short)(3), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV39BCSd009, 4, 1)), (short)(4), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV69ForRgb, 10, 0)), (short)(10), "0") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( AV82NSlaves, 10, 0)), 1, " ") + "\"" + "," ;
      AV113TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV103Status, 10, 0)), (short)(1), " ") + "\"" ;
      if ( GXutil.len( AV113TextFileLine) > 0 )
      {
         AV112TextFile.writeLine(AV113TextFileLine);
      }
      AV112TextFile.close();
      if ( AV112TextFile.getErrCode() != 0 )
      {
         AV64ErrorMessage = GXutil.trim( GXutil.str( AV112TextFile.getErrCode(), 10, 2)) + " " + GXutil.trim( AV112TextFile.getErrDescription()) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P05TW6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV54clicod), AV29barser, AV26barcolnom, Integer.valueOf(AV27barcolnum), Byte.valueOf(AV30bartipcol)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P05TW6_A831TipColCod[0] ;
         A483ForColNum = P05TW6_A483ForColNum[0] ;
         A482ForColNom = P05TW6_A482ForColNom[0] ;
         A494ForSer = P05TW6_A494ForSer[0] ;
         A252CliCod = P05TW6_A252CliCod[0] ;
         n252CliCod = P05TW6_n252CliCod[0] ;
         A486ForNumCol = P05TW6_A486ForNumCol[0] ;
         A4339ForRGB = P05TW6_A4339ForRGB[0] ;
         n4339ForRGB = P05TW6_n4339ForRGB[0] ;
         AV68fornumcol = A486ForNumCol ;
         AV69ForRgb = A4339ForRGB ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV79MaqMicro = (byte)(0) ;
      AV83Num_Mq = (short)(0) ;
      AV78MaqLintex = " " ;
      AV80Msg_ctrl = " " ;
      /* Using cursor P05TW7 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV74Maqcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P05TW7_A602MaqCod[0] ;
         A2391MaqMicro = P05TW7_A2391MaqMicro[0] ;
         n2391MaqMicro = P05TW7_n2391MaqMicro[0] ;
         A616MaqOrdSeq = P05TW7_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P05TW7_n616MaqOrdSeq[0] ;
         AV79MaqMicro = A2391MaqMicro ;
         AV83Num_Mq = A616MaqOrdSeq ;
         /* Using cursor P05TW8 */
         pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A613MaqLinTex = P05TW8_A613MaqLinTex[0] ;
            A320DesTecLin = P05TW8_A320DesTecLin[0] ;
            AV78MaqLintex = A613MaqLinTex ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV73MaqAc = (byte)(0) ;
      if ( GXutil.strcmp(AV78MaqLintex, " ") != 0 )
      {
         AV75MaqCod1 = GXutil.substring( AV78MaqLintex, 1, 6) ;
         AV122GXLvl176 = (byte)(0) ;
         /* Using cursor P05TW9 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV75MaqCod1});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A602MaqCod = P05TW9_A602MaqCod[0] ;
            AV122GXLvl176 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         if ( AV122GXLvl176 == 0 )
         {
            AV80Msg_ctrl = httpContext.getMessage( "Error Maquina Acoplada ", "") + AV75MaqCod1 ;
         }
         if ( GXutil.strcmp(AV80Msg_ctrl, " ") == 0 )
         {
            AV76MaqCod2 = GXutil.substring( AV78MaqLintex, 7, 6) ;
            AV123GXLvl183 = (byte)(0) ;
            /* Using cursor P05TW10 */
            pr_default.execute(6, new Object[] {A396EmprCod, AV76MaqCod2});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A602MaqCod = P05TW10_A602MaqCod[0] ;
               AV123GXLvl183 = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            if ( AV123GXLvl183 == 0 )
            {
               AV80Msg_ctrl = httpContext.getMessage( "Error Maquina Acoplada ", "") + AV76MaqCod2 ;
            }
         }
         if ( GXutil.strcmp(AV80Msg_ctrl, " ") == 0 )
         {
            AV73MaqAc = (byte)(1) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcarvsedo.this.A396EmprCod;
      this.aP1[0] = pcarvsedo.this.AV62Dirp;
      this.aP2[0] = pcarvsedo.this.AV23Barcod;
      this.aP3[0] = pcarvsedo.this.AV25Barcodreo;
      this.aP4[0] = pcarvsedo.this.AV24Barcodpar;
      this.aP5[0] = pcarvsedo.this.AV94Reclinmaq;
      this.aP6[0] = pcarvsedo.this.AV80Msg_ctrl;
      this.aP7[0] = pcarvsedo.this.AV103Status;
      this.aP8[0] = pcarvsedo.this.AV91Programa;
      this.aP9[0] = pcarvsedo.this.AV64ErrorMessage;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV64ErrorMessage = "" ;
      AV60Dir = "" ;
      AV102Station = "" ;
      GXv_char2 = new String[1] ;
      AV63EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV109UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV39BCSd009 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05TW2_A396EmprCod = new String[] {""} ;
      P05TW2_A9613Lb_Hdrp = new String[] {""} ;
      P05TW2_A9612Lb_Hdrr = new byte[1] ;
      P05TW2_A9611Lb_Hdr = new int[1] ;
      P05TW2_A13222BCSd001 = new byte[1] ;
      P05TW2_n13222BCSd001 = new boolean[] {false} ;
      P05TW2_A13223BCSd002 = new short[1] ;
      P05TW2_n13223BCSd002 = new boolean[] {false} ;
      P05TW2_A13224BCSd003 = new int[1] ;
      P05TW2_n13224BCSd003 = new boolean[] {false} ;
      P05TW2_A13225BCSd004 = new short[1] ;
      P05TW2_n13225BCSd004 = new boolean[] {false} ;
      P05TW2_A13226BCSd005 = new short[1] ;
      P05TW2_n13226BCSd005 = new boolean[] {false} ;
      P05TW2_A13227BCSd006 = new int[1] ;
      P05TW2_n13227BCSd006 = new boolean[] {false} ;
      P05TW2_A13228BCSd007 = new byte[1] ;
      P05TW2_n13228BCSd007 = new boolean[] {false} ;
      P05TW2_A13229BCSd008 = new short[1] ;
      P05TW2_n13229BCSd008 = new boolean[] {false} ;
      P05TW2_A13221BCSd009 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TW2_n13221BCSd009 = new boolean[] {false} ;
      A9613Lb_Hdrp = "" ;
      A13221BCSd009 = DecimalUtil.ZERO ;
      P05TW5_A396EmprCod = new String[] {""} ;
      P05TW5_A2804RecLinMaq = new short[1] ;
      P05TW5_A130BarCodPar = new String[] {""} ;
      P05TW5_A132BarCodReo = new byte[1] ;
      P05TW5_A129BarCod = new int[1] ;
      P05TW5_A252CliCod = new int[1] ;
      P05TW5_n252CliCod = new boolean[] {false} ;
      P05TW5_A212BarSer = new String[] {""} ;
      P05TW5_A135BarColNom = new String[] {""} ;
      P05TW5_A136BarColNum = new int[1] ;
      P05TW5_A218BarTipCol = new byte[1] ;
      P05TW5_A602MaqCod = new String[] {""} ;
      P05TW5_A5109RecNumInt = new int[1] ;
      P05TW5_A279CliNom = new String[] {""} ;
      P05TW5_A217BarTipArt = new short[1] ;
      P05TW5_n217BarTipArt = new boolean[] {false} ;
      P05TW5_A1652BarSerDsc = new String[] {""} ;
      P05TW5_A5110RecNumPrg = new String[] {""} ;
      P05TW5_A2805RecVolPrd = new int[1] ;
      P05TW5_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TW5_A4812BarEncCli = new String[] {""} ;
      P05TW5_A864BarPes = new short[1] ;
      P05TW5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TW5_n166BarKgm = new boolean[] {false} ;
      P05TW5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TW5_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A602MaqCod = "" ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A5110RecNumPrg = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV70Hdr = "" ;
      AV29barser = "" ;
      AV26barcolnom = "" ;
      AV74Maqcod = "" ;
      AV77MaqCod4 = "" ;
      AV85OF20 = "" ;
      AV87Of9 = "" ;
      AV55Cliente20 = "" ;
      AV106Tipartdsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV15Artigo20 = "" ;
      AV56Color20 = "" ;
      AV93Receta20 = "" ;
      AV92Rb = DecimalUtil.ZERO ;
      AV65Fabs = DecimalUtil.ZERO ;
      AV88Peso = DecimalUtil.ZERO ;
      AV28Barenccli = "" ;
      GXv_int8 = new int[1] ;
      AV67FicA = "" ;
      AV61DirFinal = "" ;
      AV110Filename = "" ;
      AV112TextFile = new com.genexus.util.GXFile();
      AV113TextFileLine = "" ;
      P05TW6_A396EmprCod = new String[] {""} ;
      P05TW6_A831TipColCod = new byte[1] ;
      P05TW6_A483ForColNum = new int[1] ;
      P05TW6_A482ForColNom = new String[] {""} ;
      P05TW6_A494ForSer = new String[] {""} ;
      P05TW6_A252CliCod = new int[1] ;
      P05TW6_n252CliCod = new boolean[] {false} ;
      P05TW6_A486ForNumCol = new int[1] ;
      P05TW6_A4339ForRGB = new long[1] ;
      P05TW6_n4339ForRGB = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV78MaqLintex = "" ;
      P05TW7_A396EmprCod = new String[] {""} ;
      P05TW7_A602MaqCod = new String[] {""} ;
      P05TW7_A2391MaqMicro = new byte[1] ;
      P05TW7_n2391MaqMicro = new boolean[] {false} ;
      P05TW7_A616MaqOrdSeq = new short[1] ;
      P05TW7_n616MaqOrdSeq = new boolean[] {false} ;
      P05TW8_A396EmprCod = new String[] {""} ;
      P05TW8_A602MaqCod = new String[] {""} ;
      P05TW8_A613MaqLinTex = new String[] {""} ;
      P05TW8_A320DesTecLin = new byte[1] ;
      A613MaqLinTex = "" ;
      AV75MaqCod1 = "" ;
      P05TW9_A396EmprCod = new String[] {""} ;
      P05TW9_A602MaqCod = new String[] {""} ;
      AV76MaqCod2 = "" ;
      P05TW10_A396EmprCod = new String[] {""} ;
      P05TW10_A602MaqCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcarvsedo__default(),
         new Object[] {
             new Object[] {
            P05TW2_A396EmprCod, P05TW2_A9613Lb_Hdrp, P05TW2_A9612Lb_Hdrr, P05TW2_A9611Lb_Hdr, P05TW2_A13222BCSd001, P05TW2_n13222BCSd001, P05TW2_A13223BCSd002, P05TW2_n13223BCSd002, P05TW2_A13224BCSd003, P05TW2_n13224BCSd003,
            P05TW2_A13225BCSd004, P05TW2_n13225BCSd004, P05TW2_A13226BCSd005, P05TW2_n13226BCSd005, P05TW2_A13227BCSd006, P05TW2_n13227BCSd006, P05TW2_A13228BCSd007, P05TW2_n13228BCSd007, P05TW2_A13229BCSd008, P05TW2_n13229BCSd008,
            P05TW2_A13221BCSd009, P05TW2_n13221BCSd009
            }
            , new Object[] {
            P05TW5_A396EmprCod, P05TW5_A2804RecLinMaq, P05TW5_A130BarCodPar, P05TW5_A132BarCodReo, P05TW5_A129BarCod, P05TW5_A252CliCod, P05TW5_n252CliCod, P05TW5_A212BarSer, P05TW5_A135BarColNom, P05TW5_A136BarColNum,
            P05TW5_A218BarTipCol, P05TW5_A602MaqCod, P05TW5_A5109RecNumInt, P05TW5_A279CliNom, P05TW5_A217BarTipArt, P05TW5_n217BarTipArt, P05TW5_A1652BarSerDsc, P05TW5_A5110RecNumPrg, P05TW5_A2805RecVolPrd, P05TW5_A2806RecFA,
            P05TW5_A4812BarEncCli, P05TW5_A864BarPes, P05TW5_A166BarKgm, P05TW5_n166BarKgm, P05TW5_A219BarTotAgr, P05TW5_n219BarTotAgr
            }
            , new Object[] {
            P05TW6_A396EmprCod, P05TW6_A831TipColCod, P05TW6_A483ForColNum, P05TW6_A482ForColNom, P05TW6_A494ForSer, P05TW6_A252CliCod, P05TW6_A486ForNumCol, P05TW6_A4339ForRGB, P05TW6_n4339ForRGB
            }
            , new Object[] {
            P05TW7_A396EmprCod, P05TW7_A602MaqCod, P05TW7_A2391MaqMicro, P05TW7_n2391MaqMicro, P05TW7_A616MaqOrdSeq, P05TW7_n616MaqOrdSeq
            }
            , new Object[] {
            P05TW8_A396EmprCod, P05TW8_A602MaqCod, P05TW8_A613MaqLinTex, P05TW8_A320DesTecLin
            }
            , new Object[] {
            P05TW9_A396EmprCod, P05TW9_A602MaqCod
            }
            , new Object[] {
            P05TW10_A396EmprCod, P05TW10_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Barcodreo ;
   private byte AV103Status ;
   private byte AV72LenVar ;
   private byte AV114ActOF9 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV31BCSd001 ;
   private byte AV37BCSd007 ;
   private byte A9612Lb_Hdrr ;
   private byte A13222BCSd001 ;
   private byte A13228BCSd007 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV30bartipcol ;
   private byte AV82NSlaves ;
   private byte A831TipColCod ;
   private byte AV79MaqMicro ;
   private byte A2391MaqMicro ;
   private byte A320DesTecLin ;
   private byte AV73MaqAc ;
   private byte AV122GXLvl176 ;
   private byte AV123GXLvl183 ;
   private short AV94Reclinmaq ;
   private short AV32BCSd002 ;
   private short AV34BCSd004 ;
   private short AV35BCSd005 ;
   private short AV38BCSd008 ;
   private short A13223BCSd002 ;
   private short A13225BCSd004 ;
   private short A13226BCSd005 ;
   private short A13229BCSd008 ;
   private short A2804RecLinMaq ;
   private short A217BarTipArt ;
   private short A864BarPes ;
   private short AV83Num_Mq ;
   private short AV84Num_p ;
   private short AV90Pml ;
   private short A616MaqOrdSeq ;
   private short Gx_err ;
   private int AV23Barcod ;
   private int AV33BCSd003 ;
   private int AV36BCSd006 ;
   private int A9611Lb_Hdr ;
   private int A13224BCSd003 ;
   private int A13227BCSd006 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A5109RecNumInt ;
   private int A2805RecVolPrd ;
   private int AV54clicod ;
   private int AV27barcolnum ;
   private int AV86Of6 ;
   private int AV57Contval ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV68fornumcol ;
   private long AV69ForRgb ;
   private long A4339ForRGB ;
   private java.math.BigDecimal AV39BCSd009 ;
   private java.math.BigDecimal A13221BCSd009 ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV92Rb ;
   private java.math.BigDecimal AV65Fabs ;
   private java.math.BigDecimal AV88Peso ;
   private String A396EmprCod ;
   private String AV62Dirp ;
   private String AV24Barcodpar ;
   private String AV80Msg_ctrl ;
   private String AV91Programa ;
   private String AV60Dir ;
   private String AV102Station ;
   private String GXv_char2[] ;
   private String AV63EmprNom ;
   private String GXv_char3[] ;
   private String AV109UsurCod ;
   private String scmdbuf ;
   private String A9613Lb_Hdrp ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A602MaqCod ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A5110RecNumPrg ;
   private String A4812BarEncCli ;
   private String AV70Hdr ;
   private String AV29barser ;
   private String AV26barcolnom ;
   private String AV74Maqcod ;
   private String AV77MaqCod4 ;
   private String AV85OF20 ;
   private String AV87Of9 ;
   private String AV55Cliente20 ;
   private String AV106Tipartdsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV15Artigo20 ;
   private String AV56Color20 ;
   private String AV93Receta20 ;
   private String AV28Barenccli ;
   private String AV67FicA ;
   private String AV61DirFinal ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV78MaqLintex ;
   private String A613MaqLinTex ;
   private String AV75MaqCod1 ;
   private String AV76MaqCod2 ;
   private boolean n13222BCSd001 ;
   private boolean n13223BCSd002 ;
   private boolean n13224BCSd003 ;
   private boolean n13225BCSd004 ;
   private boolean n13226BCSd005 ;
   private boolean n13227BCSd006 ;
   private boolean n13228BCSd007 ;
   private boolean n13229BCSd008 ;
   private boolean n13221BCSd009 ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean returnInSub ;
   private boolean n4339ForRGB ;
   private boolean n2391MaqMicro ;
   private boolean n616MaqOrdSeq ;
   private String AV113TextFileLine ;
   private String AV64ErrorMessage ;
   private String AV110Filename ;
   private com.genexus.util.GXFile AV112TextFile ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P05TW2_A396EmprCod ;
   private String[] P05TW2_A9613Lb_Hdrp ;
   private byte[] P05TW2_A9612Lb_Hdrr ;
   private int[] P05TW2_A9611Lb_Hdr ;
   private byte[] P05TW2_A13222BCSd001 ;
   private boolean[] P05TW2_n13222BCSd001 ;
   private short[] P05TW2_A13223BCSd002 ;
   private boolean[] P05TW2_n13223BCSd002 ;
   private int[] P05TW2_A13224BCSd003 ;
   private boolean[] P05TW2_n13224BCSd003 ;
   private short[] P05TW2_A13225BCSd004 ;
   private boolean[] P05TW2_n13225BCSd004 ;
   private short[] P05TW2_A13226BCSd005 ;
   private boolean[] P05TW2_n13226BCSd005 ;
   private int[] P05TW2_A13227BCSd006 ;
   private boolean[] P05TW2_n13227BCSd006 ;
   private byte[] P05TW2_A13228BCSd007 ;
   private boolean[] P05TW2_n13228BCSd007 ;
   private short[] P05TW2_A13229BCSd008 ;
   private boolean[] P05TW2_n13229BCSd008 ;
   private java.math.BigDecimal[] P05TW2_A13221BCSd009 ;
   private boolean[] P05TW2_n13221BCSd009 ;
   private String[] P05TW5_A396EmprCod ;
   private short[] P05TW5_A2804RecLinMaq ;
   private String[] P05TW5_A130BarCodPar ;
   private byte[] P05TW5_A132BarCodReo ;
   private int[] P05TW5_A129BarCod ;
   private int[] P05TW5_A252CliCod ;
   private boolean[] P05TW5_n252CliCod ;
   private String[] P05TW5_A212BarSer ;
   private String[] P05TW5_A135BarColNom ;
   private int[] P05TW5_A136BarColNum ;
   private byte[] P05TW5_A218BarTipCol ;
   private String[] P05TW5_A602MaqCod ;
   private int[] P05TW5_A5109RecNumInt ;
   private String[] P05TW5_A279CliNom ;
   private short[] P05TW5_A217BarTipArt ;
   private boolean[] P05TW5_n217BarTipArt ;
   private String[] P05TW5_A1652BarSerDsc ;
   private String[] P05TW5_A5110RecNumPrg ;
   private int[] P05TW5_A2805RecVolPrd ;
   private java.math.BigDecimal[] P05TW5_A2806RecFA ;
   private String[] P05TW5_A4812BarEncCli ;
   private short[] P05TW5_A864BarPes ;
   private java.math.BigDecimal[] P05TW5_A166BarKgm ;
   private boolean[] P05TW5_n166BarKgm ;
   private java.math.BigDecimal[] P05TW5_A219BarTotAgr ;
   private boolean[] P05TW5_n219BarTotAgr ;
   private String[] P05TW6_A396EmprCod ;
   private byte[] P05TW6_A831TipColCod ;
   private int[] P05TW6_A483ForColNum ;
   private String[] P05TW6_A482ForColNom ;
   private String[] P05TW6_A494ForSer ;
   private int[] P05TW6_A252CliCod ;
   private boolean[] P05TW6_n252CliCod ;
   private int[] P05TW6_A486ForNumCol ;
   private long[] P05TW6_A4339ForRGB ;
   private boolean[] P05TW6_n4339ForRGB ;
   private String[] P05TW7_A396EmprCod ;
   private String[] P05TW7_A602MaqCod ;
   private byte[] P05TW7_A2391MaqMicro ;
   private boolean[] P05TW7_n2391MaqMicro ;
   private short[] P05TW7_A616MaqOrdSeq ;
   private boolean[] P05TW7_n616MaqOrdSeq ;
   private String[] P05TW8_A396EmprCod ;
   private String[] P05TW8_A602MaqCod ;
   private String[] P05TW8_A613MaqLinTex ;
   private byte[] P05TW8_A320DesTecLin ;
   private String[] P05TW9_A396EmprCod ;
   private String[] P05TW9_A602MaqCod ;
   private String[] P05TW10_A396EmprCod ;
   private String[] P05TW10_A602MaqCod ;
}

final  class pcarvsedo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TW2", "SELECT EmprCod, Lb_Hdrp, Lb_Hdrr, Lb_Hdr, BCSd001, BCSd002, BCSd003, BCSd004, BCSd005, BCSd006, BCSd007, BCSd008, BCSd009 FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TW5", "SELECT T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.MaqCod, T1.RecNumInt, T3.CliNom, T2.BarTipArt, T2.BarSerDsc, T1.RecNumPrg, T1.RecVolPrd, T1.RecFA, T2.BarEncCli, T2.BarPes, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TW6", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol, ForRGB FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TW7", "SELECT EmprCod, MaqCod, MaqMicro, MaqOrdSeq FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TW8", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqLinTex, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, DesTecLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TW9", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TW10", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 26);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[20])[0] = rslt.getString(19, 20);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

