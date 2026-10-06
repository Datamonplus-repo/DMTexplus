package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens035 extends GXProcedure
{
   public pens035( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens035.class ), "" );
   }

   public pens035( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            String[] aP5 ,
                            java.math.BigDecimal[] aP6 )
   {
      pens035.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 )
   {
      pens035.this.AV96EmprCod = aP0[0];
      this.aP0 = aP0;
      pens035.this.AV110Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens035.this.AV107Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens035.this.AV74TotKgs = aP3[0];
      this.aP3 = aP3;
      pens035.this.AV75Volumen = aP4[0];
      this.aP4 = aP4;
      pens035.this.AV88MaqCod = aP5[0];
      this.aP5 = aP5;
      pens035.this.AV104Incre = aP6[0];
      this.aP6 = aP6;
      pens035.this.AV125Num_ord = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV124Ens035 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "ENS035", ""), GXv_int2) ;
      pens035.this.GXt_int1 = GXv_int2[0] ;
      AV124Ens035 = GXt_int1 ;
      if ( AV124Ens035 == 1 )
      {
         GXv_char3[0] = AV96EmprCod ;
         GXv_int4[0] = AV110Lb_numero ;
         GXv_char5[0] = AV107Lb_opcion ;
         GXv_decimal6[0] = AV74TotKgs ;
         GXv_decimal7[0] = AV75Volumen ;
         GXv_char8[0] = AV88MaqCod ;
         GXv_decimal9[0] = AV104Incre ;
         GXv_int10[0] = AV125Num_ord ;
         new app.pens035t(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_char8, GXv_decimal9, GXv_int10) ;
         pens035.this.AV96EmprCod = GXv_char3[0] ;
         pens035.this.AV110Lb_numero = GXv_int4[0] ;
         pens035.this.AV107Lb_opcion = GXv_char5[0] ;
         pens035.this.AV74TotKgs = GXv_decimal6[0] ;
         pens035.this.AV75Volumen = GXv_decimal7[0] ;
         pens035.this.AV88MaqCod = GXv_char8[0] ;
         pens035.this.AV104Incre = GXv_decimal9[0] ;
         pens035.this.AV125Num_ord = GXv_int10[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV80Station = GXutil.str( AV110Lb_numero, 8, 0) + AV107Lb_opcion ;
      /* Using cursor P028D2 */
      pr_default.execute(0, new Object[] {AV96EmprCod, AV80Station});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A910Workstat = P028D2_A910Workstat[0] ;
         A396EmprCod = P028D2_A396EmprCod[0] ;
         A876EscInc = P028D2_A876EscInc[0] ;
         n876EscInc = P028D2_n876EscInc[0] ;
         /* Optimized DELETE. */
         /* Using cursor P028D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
         /* End optimized DELETE. */
         /* Using cursor P028D4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A910Workstat});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPCESCAN

      */
      A396EmprCod = AV96EmprCod ;
      A910Workstat = AV80Station ;
      A876EscInc = DecimalUtil.doubleToDec(0) ;
      n876EscInc = false ;
      A877EscKgm = AV74TotKgs ;
      n877EscKgm = false ;
      A878EscVol = (int)(DecimalUtil.decToDouble(AV75Volumen)) ;
      n878EscVol = false ;
      A879EscUltLin = (short)(0) ;
      n879EscUltLin = false ;
      A881EscMTxt1 = "" ;
      n881EscMTxt1 = false ;
      A882EscMTxt2 = "" ;
      n882EscMTxt2 = false ;
      A883EscMInc = DecimalUtil.doubleToDec(0) ;
      n883EscMInc = false ;
      A884EscMKgm = AV74TotKgs ;
      n884EscMKgm = false ;
      A885EscMVol = (int)(DecimalUtil.decToDouble(AV75Volumen)) ;
      n885EscMVol = false ;
      A886EscMUltLin = 0 ;
      n886EscMUltLin = false ;
      A896EscMValCos = 0 ;
      n896EscMValCos = false ;
      /* Using cursor P028D5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat, Boolean.valueOf(n876EscInc), A876EscInc, Boolean.valueOf(n877EscKgm), A877EscKgm, Boolean.valueOf(n878EscVol), Integer.valueOf(A878EscVol), Boolean.valueOf(n879EscUltLin), Short.valueOf(A879EscUltLin), Boolean.valueOf(n881EscMTxt1), A881EscMTxt1, Boolean.valueOf(n882EscMTxt2), A882EscMTxt2, Boolean.valueOf(n883EscMInc), A883EscMInc, Boolean.valueOf(n884EscMKgm), A884EscMKgm, Boolean.valueOf(n885EscMVol), Integer.valueOf(A885EscMVol), Boolean.valueOf(n886EscMUltLin), Integer.valueOf(A886EscMUltLin), Boolean.valueOf(n896EscMValCos), Integer.valueOf(A896EscMValCos)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
      if ( (pr_default.getStatus(3) == 1) )
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
      GXv_char8[0] = AV96EmprCod ;
      GXv_char5[0] = "030100" ;
      GXv_int4[0] = AV76ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_int4) ;
      pens035.this.AV96EmprCod = GXv_char8[0] ;
      pens035.this.AV76ValCos = GXv_int4[0] ;
      GXv_int2[0] = AV116Pervafil ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int2) ;
      pens035.this.AV116Pervafil = GXv_int2[0] ;
      GXv_int2[0] = AV117Hss ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "HSS", ""), GXv_int2) ;
      pens035.this.AV117Hss = GXv_int2[0] ;
      GXv_int2[0] = AV120Magosa ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int2) ;
      pens035.this.AV120Magosa = GXv_int2[0] ;
      AV97LinRec = (short)(0) ;
      AV82FlagComp = (byte)(0) ;
      /* Using cursor P028D6 */
      pr_default.execute(4, new Object[] {AV96EmprCod, Integer.valueOf(AV110Lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P028D6_A396EmprCod[0] ;
         A6372Lb_RecPip = P028D6_A6372Lb_RecPip[0] ;
         A5532Lb_numero = P028D6_A5532Lb_numero[0] ;
         A626MatCod = P028D6_A626MatCod[0] ;
         n626MatCod = P028D6_n626MatCod[0] ;
         A583IntCod = P028D6_A583IntCod[0] ;
         n583IntCod = P028D6_n583IntCod[0] ;
         A5553Lb_ForCod = P028D6_A5553Lb_ForCod[0] ;
         A252CliCod = P028D6_A252CliCod[0] ;
         A5533Lb_ArtCod = P028D6_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P028D6_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P028D6_A5537Lb_ColNum[0] ;
         A831TipColCod = P028D6_A831TipColCod[0] ;
         n831TipColCod = P028D6_n831TipColCod[0] ;
         A5551Lb_lineaPq = P028D6_A5551Lb_lineaPq[0] ;
         A626MatCod = P028D6_A626MatCod[0] ;
         n626MatCod = P028D6_n626MatCod[0] ;
         A583IntCod = P028D6_A583IntCod[0] ;
         n583IntCod = P028D6_n583IntCod[0] ;
         A252CliCod = P028D6_A252CliCod[0] ;
         A5533Lb_ArtCod = P028D6_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P028D6_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P028D6_A5537Lb_ColNum[0] ;
         A831TipColCod = P028D6_A831TipColCod[0] ;
         n831TipColCod = P028D6_n831TipColCod[0] ;
         if ( GXutil.strcmp(A6372Lb_RecPip, httpContext.getMessage( "S", "")) == 0 )
         {
            AV86MatCod = A626MatCod ;
            AV87IntCod = A583IntCod ;
            AV68ProForCod = A5553Lb_ForCod ;
            AV89CliCod = A252CliCod ;
            AV90ForSer = A5533Lb_ArtCod ;
            AV91ForColNom = A5536Lb_ColNom ;
            AV92ForColNum = A5537Lb_ColNum ;
            AV93TipColCod = A831TipColCod ;
            AV125Num_ord = A5551Lb_lineaPq ;
            /* Using cursor P028D7 */
            pr_default.execute(5, new Object[] {A396EmprCod, AV68ProForCod});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A764ProForCod = P028D7_A764ProForCod[0] ;
               A4706ProForRb = P028D7_A4706ProForRb[0] ;
               A6062ProForCPo = P028D7_A6062ProForCPo[0] ;
               A770ProForPrd = P028D7_A770ProForPrd[0] ;
               A762ProForCan = P028D7_A762ProForCan[0] ;
               A5358ProForClv = P028D7_A5358ProForClv[0] ;
               A763ProForCla = P028D7_A763ProForCla[0] ;
               A490ForPrdUMe = P028D7_A490ForPrdUMe[0] ;
               A765ProForDes = P028D7_A765ProForDes[0] ;
               A767ProForLin = P028D7_A767ProForLin[0] ;
               A4706ProForRb = P028D7_A4706ProForRb[0] ;
               AV105EscMRb = A4706ProForRb ;
               AV111Proforcpo = A6062ProForCPo ;
               if ( ( AV111Proforcpo.doubleValue() == 0 ) || ( AV111Proforcpo.doubleValue() > 100 ) )
               {
                  AV111Proforcpo = DecimalUtil.doubleToDec(100) ;
               }
               AV119Prdnum_s = A770ProForPrd ;
               /* Execute user subroutine: 'PRODUC' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), httpContext.getMessage( "C", "")) == 0 )
               {
               }
               else
               {
                  if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
                     {
                        AV69NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
                        AV70Producto = "" ;
                        AV71ForPrdUme = (byte)(0) ;
                        /* Execute user subroutine: 'CTRL_PE' */
                        S141 ();
                        if ( returnInSub )
                        {
                           pr_default.close(5);
                           pr_default.close(5);
                           pr_default.close(4);
                           pr_default.close(4);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV100PrdVal = (byte)(0) ;
                        AV122Llamo_pe = httpContext.getMessage( "S", "") ;
                        /* Execute user subroutine: 'ESPECIALES' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(5);
                           pr_default.close(5);
                           pr_default.close(4);
                           pr_default.close(4);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     else
                     {
                        AV77Produc = GXutil.substring( A770ProForPrd, 3, 1) ;
                        if ( GXutil.strcmp(AV77Produc, " ") == 0 )
                        {
                           if ( A762ProForCan.doubleValue() == 0 )
                           {
                              AV84Cantidad = DecimalUtil.doubleToDec(1) ;
                           }
                           else
                           {
                              AV84Cantidad = A762ProForCan ;
                           }
                           AV77Produc = GXutil.substring( A770ProForPrd, 2, 1) ;
                           if ( GXutil.strcmp(AV77Produc, "") == 0 )
                           {
                              AV78Ncar = (byte)(1) ;
                           }
                           else
                           {
                              AV78Ncar = (byte)(2) ;
                           }
                           AV83ProForPrd = A770ProForPrd ;
                           AV114Tipo = httpContext.getMessage( "C", "") ;
                           /* Execute user subroutine: 'COLORANTES' */
                           S121 ();
                           if ( returnInSub )
                           {
                              pr_default.close(5);
                              pr_default.close(5);
                              pr_default.close(4);
                              pr_default.close(4);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                        }
                        else
                        {
                           AV114Tipo = httpContext.getMessage( "P", "") ;
                           if ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) )
                           {
                              if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                              {
                                 AV70Producto = A770ProForPrd ;
                                 AV84Cantidad = A762ProForCan ;
                                 AV71ForPrdUme = A490ForPrdUMe ;
                                 AV82FlagComp = (byte)(0) ;
                                 AV84Cantidad = (AV84Cantidad.multiply(AV111Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                 GXv_char8[0] = A396EmprCod ;
                                 GXv_char5[0] = A770ProForPrd ;
                                 GXv_decimal9[0] = AV84Cantidad ;
                                 GXv_int2[0] = A490ForPrdUMe ;
                                 GXv_decimal7[0] = AV74TotKgs ;
                                 GXv_decimal6[0] = AV75Volumen ;
                                 GXv_int4[0] = AV76ValCos ;
                                 GXv_int10[0] = AV79NumLin ;
                                 GXv_char3[0] = AV80Station ;
                                 GXv_int11[0] = AV81UltNumLin ;
                                 GXv_int12[0] = AV82FlagComp ;
                                 GXv_char13[0] = AV68ProForCod ;
                                 GXv_int14[0] = AV95ContLinea ;
                                 GXv_decimal15[0] = AV104Incre ;
                                 GXv_int16[0] = AV105EscMRb ;
                                 GXv_int17[0] = (int)(DecimalUtil.decToDouble(AV108Solu_ml)) ;
                                 GXv_char18[0] = AV114Tipo ;
                                 GXv_char19[0] = A765ProForDes ;
                                 GXv_int20[0] = AV125Num_ord ;
                                 new app.pens036(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal9, GXv_int2, GXv_decimal7, GXv_decimal6, GXv_int4, GXv_int10, GXv_char3, GXv_int11, GXv_int12, GXv_char13, GXv_int14, GXv_decimal15, GXv_int16, GXv_int17, GXv_char18, GXv_char19, GXv_int20) ;
                                 pens035.this.A396EmprCod = GXv_char8[0] ;
                                 pens035.this.A770ProForPrd = GXv_char5[0] ;
                                 pens035.this.AV84Cantidad = GXv_decimal9[0] ;
                                 pens035.this.A490ForPrdUMe = GXv_int2[0] ;
                                 pens035.this.AV74TotKgs = GXv_decimal7[0] ;
                                 pens035.this.AV75Volumen = GXv_decimal6[0] ;
                                 pens035.this.AV76ValCos = GXv_int4[0] ;
                                 pens035.this.AV79NumLin = GXv_int10[0] ;
                                 pens035.this.AV80Station = GXv_char3[0] ;
                                 pens035.this.AV81UltNumLin = GXv_int11[0] ;
                                 pens035.this.AV82FlagComp = GXv_int12[0] ;
                                 pens035.this.AV68ProForCod = GXv_char13[0] ;
                                 pens035.this.AV95ContLinea = GXv_int14[0] ;
                                 pens035.this.AV104Incre = GXv_decimal15[0] ;
                                 pens035.this.AV105EscMRb = GXv_int16[0] ;
                                 pens035.this.AV108Solu_ml = DecimalUtil.doubleToDec(GXv_int17[0]) ;
                                 pens035.this.AV114Tipo = GXv_char18[0] ;
                                 pens035.this.A765ProForDes = GXv_char19[0] ;
                                 pens035.this.AV125Num_ord = GXv_int20[0] ;
                                 AV82FlagComp = (byte)(0) ;
                              }
                              else
                              {
                                 AV84Cantidad = (AV84Cantidad.multiply(AV111Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                 GXv_char19[0] = A396EmprCod ;
                                 GXv_char18[0] = A770ProForPrd ;
                                 GXv_decimal15[0] = A762ProForCan ;
                                 GXv_int12[0] = A490ForPrdUMe ;
                                 GXv_decimal9[0] = AV74TotKgs ;
                                 GXv_decimal7[0] = AV75Volumen ;
                                 GXv_int17[0] = AV76ValCos ;
                                 GXv_int20[0] = AV79NumLin ;
                                 GXv_char13[0] = AV80Station ;
                                 GXv_int16[0] = AV81UltNumLin ;
                                 GXv_int2[0] = AV82FlagComp ;
                                 GXv_char8[0] = AV68ProForCod ;
                                 GXv_int14[0] = AV95ContLinea ;
                                 GXv_decimal6[0] = AV104Incre ;
                                 GXv_int11[0] = AV105EscMRb ;
                                 GXv_int4[0] = (int)(DecimalUtil.decToDouble(AV108Solu_ml)) ;
                                 GXv_char5[0] = AV114Tipo ;
                                 GXv_char3[0] = A765ProForDes ;
                                 GXv_int10[0] = AV125Num_ord ;
                                 new app.pens036(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_decimal15, GXv_int12, GXv_decimal9, GXv_decimal7, GXv_int17, GXv_int20, GXv_char13, GXv_int16, GXv_int2, GXv_char8, GXv_int14, GXv_decimal6, GXv_int11, GXv_int4, GXv_char5, GXv_char3, GXv_int10) ;
                                 pens035.this.A396EmprCod = GXv_char19[0] ;
                                 pens035.this.A770ProForPrd = GXv_char18[0] ;
                                 pens035.this.A762ProForCan = GXv_decimal15[0] ;
                                 pens035.this.A490ForPrdUMe = GXv_int12[0] ;
                                 pens035.this.AV74TotKgs = GXv_decimal9[0] ;
                                 pens035.this.AV75Volumen = GXv_decimal7[0] ;
                                 pens035.this.AV76ValCos = GXv_int17[0] ;
                                 pens035.this.AV79NumLin = GXv_int20[0] ;
                                 pens035.this.AV80Station = GXv_char13[0] ;
                                 pens035.this.AV81UltNumLin = GXv_int16[0] ;
                                 pens035.this.AV82FlagComp = GXv_int2[0] ;
                                 pens035.this.AV68ProForCod = GXv_char8[0] ;
                                 pens035.this.AV95ContLinea = GXv_int14[0] ;
                                 pens035.this.AV104Incre = GXv_decimal6[0] ;
                                 pens035.this.AV105EscMRb = GXv_int11[0] ;
                                 pens035.this.AV108Solu_ml = DecimalUtil.doubleToDec(GXv_int4[0]) ;
                                 pens035.this.AV114Tipo = GXv_char5[0] ;
                                 pens035.this.A765ProForDes = GXv_char3[0] ;
                                 pens035.this.AV125Num_ord = GXv_int10[0] ;
                              }
                           }
                           else
                           {
                              AV103CalVe = A763ProForCla ;
                              AV100PrdVal = (byte)(0) ;
                              AV94PrdDesc = A765ProForDes ;
                              AV70Producto = A770ProForPrd ;
                              AV84Cantidad = A762ProForCan ;
                              if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                              {
                                 GXv_char19[0] = A396EmprCod ;
                                 GXv_char18[0] = AV70Producto ;
                                 GXv_char13[0] = A763ProForCla ;
                                 GXv_int12[0] = AV100PrdVal ;
                                 GXv_int17[0] = AV89CliCod ;
                                 GXv_char8[0] = AV90ForSer ;
                                 GXv_decimal15[0] = AV74TotKgs ;
                                 GXv_char5[0] = AV94PrdDesc ;
                                 GXv_char3[0] = AV99Accion ;
                                 GXv_int20[0] = (short)(0) ;
                                 GXv_int4[0] = (int)(DecimalUtil.decToDouble(AV75Volumen)) ;
                                 GXv_char21[0] = AV88MaqCod ;
                                 GXv_int16[0] = AV86MatCod ;
                                 GXv_char22[0] = AV91ForColNom ;
                                 GXv_int23[0] = AV92ForColNum ;
                                 GXv_int2[0] = AV93TipColCod ;
                                 GXv_int24[0] = AV87IntCod ;
                                 GXv_int25[0] = AV110Lb_numero ;
                                 GXv_char26[0] = AV107Lb_opcion ;
                                 new app.pens041(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_char13, GXv_int12, GXv_int17, GXv_char8, GXv_decimal15, GXv_char5, GXv_char3, GXv_int20, GXv_int4, GXv_char21, GXv_int16, GXv_char22, GXv_int23, GXv_int2, GXv_int24, GXv_int25, GXv_char26) ;
                                 pens035.this.A396EmprCod = GXv_char19[0] ;
                                 pens035.this.AV70Producto = GXv_char18[0] ;
                                 pens035.this.A763ProForCla = GXv_char13[0] ;
                                 pens035.this.AV100PrdVal = GXv_int12[0] ;
                                 pens035.this.AV89CliCod = GXv_int17[0] ;
                                 pens035.this.AV90ForSer = GXv_char8[0] ;
                                 pens035.this.AV74TotKgs = GXv_decimal15[0] ;
                                 pens035.this.AV94PrdDesc = GXv_char5[0] ;
                                 pens035.this.AV99Accion = GXv_char3[0] ;
                                 pens035.this.AV75Volumen = DecimalUtil.doubleToDec(GXv_int4[0]) ;
                                 pens035.this.AV88MaqCod = GXv_char21[0] ;
                                 pens035.this.AV86MatCod = GXv_int16[0] ;
                                 pens035.this.AV91ForColNom = GXv_char22[0] ;
                                 pens035.this.AV92ForColNum = GXv_int23[0] ;
                                 pens035.this.AV93TipColCod = GXv_int2[0] ;
                                 pens035.this.AV87IntCod = GXv_int24[0] ;
                                 pens035.this.AV110Lb_numero = GXv_int25[0] ;
                                 pens035.this.AV107Lb_opcion = GXv_char26[0] ;
                              }
                              else
                              {
                                 if ( ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CX", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CF", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CP", "")) == 0 ) )
                                 {
                                    GXv_char26[0] = A396EmprCod ;
                                    GXv_char22[0] = AV70Producto ;
                                    GXv_char21[0] = A5358ProForClv ;
                                    GXv_int24[0] = AV100PrdVal ;
                                    GXv_int25[0] = AV89CliCod ;
                                    GXv_char19[0] = AV90ForSer ;
                                    GXv_decimal15[0] = AV74TotKgs ;
                                    GXv_char18[0] = AV94PrdDesc ;
                                    GXv_char13[0] = AV99Accion ;
                                    GXv_int20[0] = (short)(0) ;
                                    GXv_int23[0] = (int)(DecimalUtil.decToDouble(AV75Volumen)) ;
                                    GXv_char8[0] = AV88MaqCod ;
                                    GXv_int16[0] = AV86MatCod ;
                                    GXv_char5[0] = AV91ForColNom ;
                                    GXv_int17[0] = AV92ForColNum ;
                                    GXv_int12[0] = AV93TipColCod ;
                                    GXv_int2[0] = AV87IntCod ;
                                    GXv_int4[0] = AV110Lb_numero ;
                                    GXv_char3[0] = AV107Lb_opcion ;
                                    GXv_decimal9[0] = AV123Porc_p ;
                                    new app.pens041x(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_char21, GXv_int24, GXv_int25, GXv_char19, GXv_decimal15, GXv_char18, GXv_char13, GXv_int20, GXv_int23, GXv_char8, GXv_int16, GXv_char5, GXv_int17, GXv_int12, GXv_int2, GXv_int4, GXv_char3, GXv_decimal9) ;
                                    pens035.this.A396EmprCod = GXv_char26[0] ;
                                    pens035.this.AV70Producto = GXv_char22[0] ;
                                    pens035.this.A5358ProForClv = GXv_char21[0] ;
                                    pens035.this.AV100PrdVal = GXv_int24[0] ;
                                    pens035.this.AV89CliCod = GXv_int25[0] ;
                                    pens035.this.AV90ForSer = GXv_char19[0] ;
                                    pens035.this.AV74TotKgs = GXv_decimal15[0] ;
                                    pens035.this.AV94PrdDesc = GXv_char18[0] ;
                                    pens035.this.AV99Accion = GXv_char13[0] ;
                                    pens035.this.AV75Volumen = DecimalUtil.doubleToDec(GXv_int23[0]) ;
                                    pens035.this.AV88MaqCod = GXv_char8[0] ;
                                    pens035.this.AV86MatCod = GXv_int16[0] ;
                                    pens035.this.AV91ForColNom = GXv_char5[0] ;
                                    pens035.this.AV92ForColNum = GXv_int17[0] ;
                                    pens035.this.AV93TipColCod = GXv_int12[0] ;
                                    pens035.this.AV87IntCod = GXv_int2[0] ;
                                    pens035.this.AV110Lb_numero = GXv_int4[0] ;
                                    pens035.this.AV107Lb_opcion = GXv_char3[0] ;
                                    pens035.this.AV123Porc_p = GXv_decimal9[0] ;
                                    Gx_msg = A5358ProForClv + httpContext.getMessage( " &PrdVal =", "") + GXutil.str( AV100PrdVal, 1, 0) ;
                                 }
                                 else
                                 {
                                    GXv_char26[0] = A396EmprCod ;
                                    GXv_char22[0] = AV70Producto ;
                                    GXv_char21[0] = A5358ProForClv ;
                                    GXv_int24[0] = AV100PrdVal ;
                                    GXv_int25[0] = AV89CliCod ;
                                    GXv_char19[0] = AV90ForSer ;
                                    GXv_decimal15[0] = AV74TotKgs ;
                                    GXv_char18[0] = AV94PrdDesc ;
                                    GXv_char13[0] = AV99Accion ;
                                    GXv_int20[0] = (short)(0) ;
                                    GXv_int23[0] = (int)(DecimalUtil.decToDouble(AV75Volumen)) ;
                                    GXv_char8[0] = AV88MaqCod ;
                                    GXv_int16[0] = AV86MatCod ;
                                    GXv_char5[0] = AV91ForColNom ;
                                    GXv_int17[0] = AV92ForColNum ;
                                    GXv_int12[0] = AV93TipColCod ;
                                    GXv_int2[0] = AV87IntCod ;
                                    GXv_int4[0] = AV110Lb_numero ;
                                    GXv_char3[0] = AV107Lb_opcion ;
                                    new app.pens041(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_char21, GXv_int24, GXv_int25, GXv_char19, GXv_decimal15, GXv_char18, GXv_char13, GXv_int20, GXv_int23, GXv_char8, GXv_int16, GXv_char5, GXv_int17, GXv_int12, GXv_int2, GXv_int4, GXv_char3) ;
                                    pens035.this.A396EmprCod = GXv_char26[0] ;
                                    pens035.this.AV70Producto = GXv_char22[0] ;
                                    pens035.this.A5358ProForClv = GXv_char21[0] ;
                                    pens035.this.AV100PrdVal = GXv_int24[0] ;
                                    pens035.this.AV89CliCod = GXv_int25[0] ;
                                    pens035.this.AV90ForSer = GXv_char19[0] ;
                                    pens035.this.AV74TotKgs = GXv_decimal15[0] ;
                                    pens035.this.AV94PrdDesc = GXv_char18[0] ;
                                    pens035.this.AV99Accion = GXv_char13[0] ;
                                    pens035.this.AV75Volumen = DecimalUtil.doubleToDec(GXv_int23[0]) ;
                                    pens035.this.AV88MaqCod = GXv_char8[0] ;
                                    pens035.this.AV86MatCod = GXv_int16[0] ;
                                    pens035.this.AV91ForColNom = GXv_char5[0] ;
                                    pens035.this.AV92ForColNum = GXv_int17[0] ;
                                    pens035.this.AV93TipColCod = GXv_int12[0] ;
                                    pens035.this.AV87IntCod = GXv_int2[0] ;
                                    pens035.this.AV110Lb_numero = GXv_int4[0] ;
                                    pens035.this.AV107Lb_opcion = GXv_char3[0] ;
                                 }
                              }
                              if ( ( AV100PrdVal == 1 ) || ( AV100PrdVal == 2 ) )
                              {
                                 if ( ( GXutil.strcmp(AV99Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV99Accion, httpContext.getMessage( "M", "")) == 0 ) )
                                 {
                                    GXv_char26[0] = A396EmprCod ;
                                    GXv_char22[0] = AV80Station ;
                                    GXv_int20[0] = AV79NumLin ;
                                    GXv_int16[0] = AV81UltNumLin ;
                                    GXv_int14[0] = (short)(0) ;
                                    GXv_int24[0] = (byte)(0) ;
                                    new app.pelisim(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_int20, GXv_int16, GXv_int14, GXv_int24) ;
                                    pens035.this.A396EmprCod = GXv_char26[0] ;
                                    pens035.this.AV80Station = GXv_char22[0] ;
                                    pens035.this.AV79NumLin = GXv_int20[0] ;
                                    pens035.this.AV81UltNumLin = GXv_int16[0] ;
                                 }
                                 if ( ( GXutil.strcmp(AV99Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV99Accion, httpContext.getMessage( "M", "")) == 0 ) )
                                 {
                                    AV102ProForDes = A765ProForDes ;
                                    AV70Producto = A770ProForPrd ;
                                    AV101LineaRec = GXutil.str( AV79NumLin, 3, 0) ;
                                    AV84Cantidad = (AV84Cantidad.multiply(AV111Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    if ( AV100PrdVal == 2 )
                                    {
                                       AV126Cantidad0 = DecimalUtil.doubleToDec(0) ;
                                    }
                                    else
                                    {
                                       AV126Cantidad0 = AV84Cantidad ;
                                    }
                                    GXv_char26[0] = A396EmprCod ;
                                    GXv_char22[0] = A770ProForPrd ;
                                    GXv_decimal15[0] = AV126Cantidad0 ;
                                    GXv_int24[0] = A490ForPrdUMe ;
                                    GXv_decimal9[0] = AV74TotKgs ;
                                    GXv_decimal7[0] = AV75Volumen ;
                                    GXv_int25[0] = AV76ValCos ;
                                    GXv_int20[0] = AV79NumLin ;
                                    GXv_char21[0] = AV80Station ;
                                    GXv_int16[0] = AV81UltNumLin ;
                                    GXv_int12[0] = AV82FlagComp ;
                                    GXv_char19[0] = AV68ProForCod ;
                                    GXv_int14[0] = AV95ContLinea ;
                                    GXv_decimal6[0] = AV104Incre ;
                                    GXv_int11[0] = AV105EscMRb ;
                                    GXv_int23[0] = (int)(DecimalUtil.decToDouble(AV108Solu_ml)) ;
                                    GXv_char18[0] = AV114Tipo ;
                                    GXv_char13[0] = AV102ProForDes ;
                                    GXv_int10[0] = AV125Num_ord ;
                                    new app.pens036(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_decimal15, GXv_int24, GXv_decimal9, GXv_decimal7, GXv_int25, GXv_int20, GXv_char21, GXv_int16, GXv_int12, GXv_char19, GXv_int14, GXv_decimal6, GXv_int11, GXv_int23, GXv_char18, GXv_char13, GXv_int10) ;
                                    pens035.this.A396EmprCod = GXv_char26[0] ;
                                    pens035.this.A770ProForPrd = GXv_char22[0] ;
                                    pens035.this.AV126Cantidad0 = GXv_decimal15[0] ;
                                    pens035.this.A490ForPrdUMe = GXv_int24[0] ;
                                    pens035.this.AV74TotKgs = GXv_decimal9[0] ;
                                    pens035.this.AV75Volumen = GXv_decimal7[0] ;
                                    pens035.this.AV76ValCos = GXv_int25[0] ;
                                    pens035.this.AV79NumLin = GXv_int20[0] ;
                                    pens035.this.AV80Station = GXv_char21[0] ;
                                    pens035.this.AV81UltNumLin = GXv_int16[0] ;
                                    pens035.this.AV82FlagComp = GXv_int12[0] ;
                                    pens035.this.AV68ProForCod = GXv_char19[0] ;
                                    pens035.this.AV95ContLinea = GXv_int14[0] ;
                                    pens035.this.AV104Incre = GXv_decimal6[0] ;
                                    pens035.this.AV105EscMRb = GXv_int11[0] ;
                                    pens035.this.AV108Solu_ml = DecimalUtil.doubleToDec(GXv_int23[0]) ;
                                    pens035.this.AV114Tipo = GXv_char18[0] ;
                                    pens035.this.AV102ProForDes = GXv_char13[0] ;
                                    pens035.this.AV125Num_ord = GXv_int10[0] ;
                                 }
                              }
                           }
                        }
                     }
                  }
                  else
                  {
                     if ( ( AV116Pervafil == 1 ) || ( AV117Hss == 1 ) || ( AV120Magosa == 1 ) )
                     {
                        AV70Producto = "" ;
                        AV102ProForDes = A765ProForDes ;
                        AV101LineaRec = GXutil.str( AV79NumLin, 3, 0) ;
                        AV84Cantidad = DecimalUtil.ZERO ;
                        AV114Tipo = " " ;
                        GXv_char26[0] = A396EmprCod ;
                        GXv_char22[0] = AV70Producto ;
                        GXv_decimal15[0] = AV84Cantidad ;
                        GXv_int24[0] = A490ForPrdUMe ;
                        GXv_decimal9[0] = AV74TotKgs ;
                        GXv_decimal7[0] = AV75Volumen ;
                        GXv_int25[0] = AV76ValCos ;
                        GXv_int20[0] = AV79NumLin ;
                        GXv_char21[0] = AV80Station ;
                        GXv_int16[0] = AV81UltNumLin ;
                        GXv_int12[0] = AV82FlagComp ;
                        GXv_char19[0] = AV68ProForCod ;
                        GXv_int14[0] = AV95ContLinea ;
                        GXv_decimal6[0] = AV104Incre ;
                        GXv_int11[0] = AV105EscMRb ;
                        GXv_int23[0] = (int)(DecimalUtil.decToDouble(AV108Solu_ml)) ;
                        GXv_char18[0] = AV114Tipo ;
                        GXv_char13[0] = AV102ProForDes ;
                        GXv_int10[0] = AV125Num_ord ;
                        new app.pens036(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_decimal15, GXv_int24, GXv_decimal9, GXv_decimal7, GXv_int25, GXv_int20, GXv_char21, GXv_int16, GXv_int12, GXv_char19, GXv_int14, GXv_decimal6, GXv_int11, GXv_int23, GXv_char18, GXv_char13, GXv_int10) ;
                        pens035.this.A396EmprCod = GXv_char26[0] ;
                        pens035.this.AV70Producto = GXv_char22[0] ;
                        pens035.this.AV84Cantidad = GXv_decimal15[0] ;
                        pens035.this.A490ForPrdUMe = GXv_int24[0] ;
                        pens035.this.AV74TotKgs = GXv_decimal9[0] ;
                        pens035.this.AV75Volumen = GXv_decimal7[0] ;
                        pens035.this.AV76ValCos = GXv_int25[0] ;
                        pens035.this.AV79NumLin = GXv_int20[0] ;
                        pens035.this.AV80Station = GXv_char21[0] ;
                        pens035.this.AV81UltNumLin = GXv_int16[0] ;
                        pens035.this.AV82FlagComp = GXv_int12[0] ;
                        pens035.this.AV68ProForCod = GXv_char19[0] ;
                        pens035.this.AV95ContLinea = GXv_int14[0] ;
                        pens035.this.AV104Incre = GXv_decimal6[0] ;
                        pens035.this.AV105EscMRb = GXv_int11[0] ;
                        pens035.this.AV108Solu_ml = DecimalUtil.doubleToDec(GXv_int23[0]) ;
                        pens035.this.AV114Tipo = GXv_char18[0] ;
                        pens035.this.AV102ProForDes = GXv_char13[0] ;
                        pens035.this.AV125Num_ord = GXv_int10[0] ;
                     }
                  }
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   public void S111( )
   {
      /* 'ESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P028D8 */
      pr_default.execute(6, new Object[] {AV96EmprCod, Integer.valueOf(AV110Lb_numero), AV107Lb_opcion, Short.valueOf(AV69NumOrd)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A5562Lb_orden = P028D8_A5562Lb_orden[0] ;
         A5555Lb_opcion = P028D8_A5555Lb_opcion[0] ;
         A5532Lb_numero = P028D8_A5532Lb_numero[0] ;
         A396EmprCod = P028D8_A396EmprCod[0] ;
         A719PrdNum = P028D8_A719PrdNum[0] ;
         A718PrdNom = P028D8_A718PrdNom[0] ;
         A5561LB_CantP = P028D8_A5561LB_CantP[0] ;
         A490ForPrdUMe = P028D8_A490ForPrdUMe[0] ;
         A6059Lb_solup = P028D8_A6059Lb_solup[0] ;
         A5560Lb_LineaPr = P028D8_A5560Lb_LineaPr[0] ;
         A718PrdNom = P028D8_A718PrdNom[0] ;
         AV70Producto = A719PrdNum ;
         AV102ProForDes = A718PrdNom ;
         AV73ForPrdCan = A5561LB_CantP ;
         AV71ForPrdUme = A490ForPrdUMe ;
         AV73ForPrdCan = (AV73ForPrdCan.multiply(AV111Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV114Tipo = "#" + GXutil.trim( GXutil.str( AV69NumOrd, 4, 0)) ;
         if ( ! (GXutil.strcmp("", AV70Producto)==0) )
         {
            GXv_char26[0] = A396EmprCod ;
            GXv_char22[0] = AV70Producto ;
            GXv_decimal15[0] = AV73ForPrdCan ;
            GXv_int24[0] = AV71ForPrdUme ;
            GXv_decimal9[0] = AV74TotKgs ;
            GXv_decimal7[0] = AV75Volumen ;
            GXv_int25[0] = AV76ValCos ;
            GXv_int20[0] = AV79NumLin ;
            GXv_char21[0] = AV80Station ;
            GXv_int16[0] = AV81UltNumLin ;
            GXv_int12[0] = AV82FlagComp ;
            GXv_char19[0] = AV68ProForCod ;
            GXv_int14[0] = AV95ContLinea ;
            GXv_decimal6[0] = AV104Incre ;
            GXv_int11[0] = AV105EscMRb ;
            GXv_int23[0] = A6059Lb_solup ;
            GXv_char18[0] = AV114Tipo ;
            GXv_char13[0] = AV102ProForDes ;
            GXv_int10[0] = AV125Num_ord ;
            new app.pens036(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_decimal15, GXv_int24, GXv_decimal9, GXv_decimal7, GXv_int25, GXv_int20, GXv_char21, GXv_int16, GXv_int12, GXv_char19, GXv_int14, GXv_decimal6, GXv_int11, GXv_int23, GXv_char18, GXv_char13, GXv_int10) ;
            pens035.this.A396EmprCod = GXv_char26[0] ;
            pens035.this.AV70Producto = GXv_char22[0] ;
            pens035.this.AV73ForPrdCan = GXv_decimal15[0] ;
            pens035.this.AV71ForPrdUme = GXv_int24[0] ;
            pens035.this.AV74TotKgs = GXv_decimal9[0] ;
            pens035.this.AV75Volumen = GXv_decimal7[0] ;
            pens035.this.AV76ValCos = GXv_int25[0] ;
            pens035.this.AV79NumLin = GXv_int20[0] ;
            pens035.this.AV80Station = GXv_char21[0] ;
            pens035.this.AV81UltNumLin = GXv_int16[0] ;
            pens035.this.AV82FlagComp = GXv_int12[0] ;
            pens035.this.AV68ProForCod = GXv_char19[0] ;
            pens035.this.AV95ContLinea = GXv_int14[0] ;
            pens035.this.AV104Incre = GXv_decimal6[0] ;
            pens035.this.AV105EscMRb = GXv_int11[0] ;
            pens035.this.A6059Lb_solup = GXv_int23[0] ;
            pens035.this.AV114Tipo = GXv_char18[0] ;
            pens035.this.AV102ProForDes = GXv_char13[0] ;
            pens035.this.AV125Num_ord = GXv_int10[0] ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S121( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P028D9 */
      pr_default.execute(7, new Object[] {AV96EmprCod, Integer.valueOf(AV110Lb_numero), AV107Lb_opcion, Byte.valueOf(AV78Ncar), AV83ProForPrd, Byte.valueOf(AV78Ncar)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A719PrdNum = P028D9_A719PrdNum[0] ;
         A5555Lb_opcion = P028D9_A5555Lb_opcion[0] ;
         A5532Lb_numero = P028D9_A5532Lb_numero[0] ;
         A396EmprCod = P028D9_A396EmprCod[0] ;
         A718PrdNom = P028D9_A718PrdNom[0] ;
         A5558LB_CantC = P028D9_A5558LB_CantC[0] ;
         A490ForPrdUMe = P028D9_A490ForPrdUMe[0] ;
         A6058Lb_soluc = P028D9_A6058Lb_soluc[0] ;
         A5557Lb_LineaC = P028D9_A5557Lb_LineaC[0] ;
         A718PrdNom = P028D9_A718PrdNom[0] ;
         AV102ProForDes = A718PrdNom ;
         AV112LB_CantC = (A5558LB_CantC.multiply(AV111Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         GXv_char26[0] = A396EmprCod ;
         GXv_char22[0] = A719PrdNum ;
         GXv_decimal15[0] = AV112LB_CantC ;
         GXv_int24[0] = A490ForPrdUMe ;
         GXv_decimal9[0] = AV74TotKgs ;
         GXv_decimal7[0] = AV75Volumen ;
         GXv_int25[0] = AV76ValCos ;
         GXv_int20[0] = AV79NumLin ;
         GXv_char21[0] = AV80Station ;
         GXv_int16[0] = AV81UltNumLin ;
         GXv_int12[0] = AV82FlagComp ;
         GXv_char19[0] = AV68ProForCod ;
         GXv_int14[0] = AV95ContLinea ;
         GXv_decimal6[0] = AV104Incre ;
         GXv_int11[0] = AV105EscMRb ;
         GXv_int23[0] = A6058Lb_soluc ;
         GXv_char18[0] = AV114Tipo ;
         GXv_char13[0] = AV102ProForDes ;
         GXv_int10[0] = AV125Num_ord ;
         new app.pens036(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_decimal15, GXv_int24, GXv_decimal9, GXv_decimal7, GXv_int25, GXv_int20, GXv_char21, GXv_int16, GXv_int12, GXv_char19, GXv_int14, GXv_decimal6, GXv_int11, GXv_int23, GXv_char18, GXv_char13, GXv_int10) ;
         pens035.this.A396EmprCod = GXv_char26[0] ;
         pens035.this.A719PrdNum = GXv_char22[0] ;
         pens035.this.AV112LB_CantC = GXv_decimal15[0] ;
         pens035.this.A490ForPrdUMe = GXv_int24[0] ;
         pens035.this.AV74TotKgs = GXv_decimal9[0] ;
         pens035.this.AV75Volumen = GXv_decimal7[0] ;
         pens035.this.AV76ValCos = GXv_int25[0] ;
         pens035.this.AV79NumLin = GXv_int20[0] ;
         pens035.this.AV80Station = GXv_char21[0] ;
         pens035.this.AV81UltNumLin = GXv_int16[0] ;
         pens035.this.AV82FlagComp = GXv_int12[0] ;
         pens035.this.AV68ProForCod = GXv_char19[0] ;
         pens035.this.AV95ContLinea = GXv_int14[0] ;
         pens035.this.AV104Incre = GXv_decimal6[0] ;
         pens035.this.AV105EscMRb = GXv_int11[0] ;
         pens035.this.A6058Lb_soluc = GXv_int23[0] ;
         pens035.this.AV114Tipo = GXv_char18[0] ;
         pens035.this.AV102ProForDes = GXv_char13[0] ;
         pens035.this.AV125Num_ord = GXv_int10[0] ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV108Solu_ml = DecimalUtil.doubleToDec(10) ;
      /* Using cursor P028D10 */
      pr_default.execute(8, new Object[] {AV96EmprCod, AV119Prdnum_s});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A719PrdNum = P028D10_A719PrdNum[0] ;
         A396EmprCod = P028D10_A396EmprCod[0] ;
         A5590PrdSolub = P028D10_A5590PrdSolub[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5590PrdSolub)==0) )
         {
            AV108Solu_ml = A5590PrdSolub ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S141( )
   {
      /* 'CTRL_PE' Routine */
      returnInSub = false ;
      AV121Existe_p = (byte)(0) ;
      /* Using cursor P028D11 */
      pr_default.execute(9, new Object[] {AV96EmprCod, Integer.valueOf(AV110Lb_numero), AV107Lb_opcion, Short.valueOf(AV69NumOrd)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A5562Lb_orden = P028D11_A5562Lb_orden[0] ;
         A5555Lb_opcion = P028D11_A5555Lb_opcion[0] ;
         A5532Lb_numero = P028D11_A5532Lb_numero[0] ;
         A396EmprCod = P028D11_A396EmprCod[0] ;
         A5560Lb_LineaPr = P028D11_A5560Lb_LineaPr[0] ;
         AV121Existe_p = (byte)(1) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens035.this.AV96EmprCod;
      this.aP1[0] = pens035.this.AV110Lb_numero;
      this.aP2[0] = pens035.this.AV107Lb_opcion;
      this.aP3[0] = pens035.this.AV74TotKgs;
      this.aP4[0] = pens035.this.AV75Volumen;
      this.aP5[0] = pens035.this.AV88MaqCod;
      this.aP6[0] = pens035.this.AV104Incre;
      this.aP7[0] = pens035.this.AV125Num_ord;
      Application.commitDataStores(context, remoteHandle, pr_default, "pens035");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV80Station = "" ;
      scmdbuf = "" ;
      P028D2_A910Workstat = new String[] {""} ;
      P028D2_A396EmprCod = new String[] {""} ;
      P028D2_A876EscInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028D2_n876EscInc = new boolean[] {false} ;
      A910Workstat = "" ;
      A396EmprCod = "" ;
      A876EscInc = DecimalUtil.ZERO ;
      A877EscKgm = DecimalUtil.ZERO ;
      A881EscMTxt1 = "" ;
      A882EscMTxt2 = "" ;
      A883EscMInc = DecimalUtil.ZERO ;
      A884EscMKgm = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P028D6_A396EmprCod = new String[] {""} ;
      P028D6_A6372Lb_RecPip = new String[] {""} ;
      P028D6_A5532Lb_numero = new int[1] ;
      P028D6_A626MatCod = new short[1] ;
      P028D6_n626MatCod = new boolean[] {false} ;
      P028D6_A583IntCod = new byte[1] ;
      P028D6_n583IntCod = new boolean[] {false} ;
      P028D6_A5553Lb_ForCod = new String[] {""} ;
      P028D6_A252CliCod = new int[1] ;
      P028D6_A5533Lb_ArtCod = new String[] {""} ;
      P028D6_A5536Lb_ColNom = new String[] {""} ;
      P028D6_A5537Lb_ColNum = new int[1] ;
      P028D6_A831TipColCod = new byte[1] ;
      P028D6_n831TipColCod = new boolean[] {false} ;
      P028D6_A5551Lb_lineaPq = new short[1] ;
      A6372Lb_RecPip = "" ;
      A5553Lb_ForCod = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      AV68ProForCod = "" ;
      AV90ForSer = "" ;
      AV91ForColNom = "" ;
      P028D7_A396EmprCod = new String[] {""} ;
      P028D7_A764ProForCod = new String[] {""} ;
      P028D7_A4706ProForRb = new short[1] ;
      P028D7_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028D7_A770ProForPrd = new String[] {""} ;
      P028D7_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028D7_A5358ProForClv = new String[] {""} ;
      P028D7_A763ProForCla = new String[] {""} ;
      P028D7_A490ForPrdUMe = new byte[1] ;
      P028D7_A765ProForDes = new String[] {""} ;
      P028D7_A767ProForLin = new short[1] ;
      A764ProForCod = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A765ProForDes = "" ;
      AV111Proforcpo = DecimalUtil.ZERO ;
      AV119Prdnum_s = "" ;
      AV70Producto = "" ;
      AV122Llamo_pe = "" ;
      AV77Produc = "" ;
      AV84Cantidad = DecimalUtil.ZERO ;
      AV83ProForPrd = "" ;
      AV114Tipo = "" ;
      AV108Solu_ml = DecimalUtil.ZERO ;
      AV103CalVe = "" ;
      AV94PrdDesc = "" ;
      AV99Accion = "" ;
      AV123Porc_p = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      GXv_char8 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      AV102ProForDes = "" ;
      AV101LineaRec = "" ;
      AV126Cantidad0 = DecimalUtil.ZERO ;
      P028D8_A5562Lb_orden = new short[1] ;
      P028D8_A5555Lb_opcion = new String[] {""} ;
      P028D8_A5532Lb_numero = new int[1] ;
      P028D8_A396EmprCod = new String[] {""} ;
      P028D8_A719PrdNum = new String[] {""} ;
      P028D8_A718PrdNom = new String[] {""} ;
      P028D8_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028D8_A490ForPrdUMe = new byte[1] ;
      P028D8_A6059Lb_solup = new int[1] ;
      P028D8_A5560Lb_LineaPr = new short[1] ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      AV73ForPrdCan = DecimalUtil.ZERO ;
      P028D9_A719PrdNum = new String[] {""} ;
      P028D9_A5555Lb_opcion = new String[] {""} ;
      P028D9_A5532Lb_numero = new int[1] ;
      P028D9_A396EmprCod = new String[] {""} ;
      P028D9_A718PrdNom = new String[] {""} ;
      P028D9_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028D9_A490ForPrdUMe = new byte[1] ;
      P028D9_A6058Lb_soluc = new int[1] ;
      P028D9_A5557Lb_LineaC = new short[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      AV112LB_CantC = DecimalUtil.ZERO ;
      GXv_char26 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int24 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int25 = new int[1] ;
      GXv_int20 = new short[1] ;
      GXv_char21 = new String[1] ;
      GXv_int16 = new short[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_int14 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXv_int23 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int10 = new short[1] ;
      P028D10_A719PrdNum = new String[] {""} ;
      P028D10_A396EmprCod = new String[] {""} ;
      P028D10_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      P028D11_A5562Lb_orden = new short[1] ;
      P028D11_A5555Lb_opcion = new String[] {""} ;
      P028D11_A5532Lb_numero = new int[1] ;
      P028D11_A396EmprCod = new String[] {""} ;
      P028D11_A5560Lb_LineaPr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens035__default(),
         new Object[] {
             new Object[] {
            P028D2_A910Workstat, P028D2_A396EmprCod, P028D2_A876EscInc, P028D2_n876EscInc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028D6_A396EmprCod, P028D6_A6372Lb_RecPip, P028D6_A5532Lb_numero, P028D6_A626MatCod, P028D6_n626MatCod, P028D6_A583IntCod, P028D6_n583IntCod, P028D6_A5553Lb_ForCod, P028D6_A252CliCod, P028D6_A5533Lb_ArtCod,
            P028D6_A5536Lb_ColNom, P028D6_A5537Lb_ColNum, P028D6_A831TipColCod, P028D6_n831TipColCod, P028D6_A5551Lb_lineaPq
            }
            , new Object[] {
            P028D7_A396EmprCod, P028D7_A764ProForCod, P028D7_A4706ProForRb, P028D7_A6062ProForCPo, P028D7_A770ProForPrd, P028D7_A762ProForCan, P028D7_A5358ProForClv, P028D7_A763ProForCla, P028D7_A490ForPrdUMe, P028D7_A765ProForDes,
            P028D7_A767ProForLin
            }
            , new Object[] {
            P028D8_A5562Lb_orden, P028D8_A5555Lb_opcion, P028D8_A5532Lb_numero, P028D8_A396EmprCod, P028D8_A719PrdNum, P028D8_A718PrdNom, P028D8_A5561LB_CantP, P028D8_A490ForPrdUMe, P028D8_A6059Lb_solup, P028D8_A5560Lb_LineaPr
            }
            , new Object[] {
            P028D9_A719PrdNum, P028D9_A5555Lb_opcion, P028D9_A5532Lb_numero, P028D9_A396EmprCod, P028D9_A718PrdNom, P028D9_A5558LB_CantC, P028D9_A490ForPrdUMe, P028D9_A6058Lb_soluc, P028D9_A5557Lb_LineaC
            }
            , new Object[] {
            P028D10_A719PrdNum, P028D10_A396EmprCod, P028D10_A5590PrdSolub
            }
            , new Object[] {
            P028D11_A5562Lb_orden, P028D11_A5555Lb_opcion, P028D11_A5532Lb_numero, P028D11_A396EmprCod, P028D11_A5560Lb_LineaPr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV124Ens035 ;
   private byte GXt_int1 ;
   private byte AV116Pervafil ;
   private byte AV117Hss ;
   private byte AV120Magosa ;
   private byte AV82FlagComp ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV87IntCod ;
   private byte AV93TipColCod ;
   private byte A490ForPrdUMe ;
   private byte AV71ForPrdUme ;
   private byte AV100PrdVal ;
   private byte AV78Ncar ;
   private byte GXv_int2[] ;
   private byte GXv_int24[] ;
   private byte GXv_int12[] ;
   private byte AV121Existe_p ;
   private short AV125Num_ord ;
   private short A879EscUltLin ;
   private short Gx_err ;
   private short AV97LinRec ;
   private short A626MatCod ;
   private short A5551Lb_lineaPq ;
   private short AV86MatCod ;
   private short A4706ProForRb ;
   private short A767ProForLin ;
   private short AV105EscMRb ;
   private short AV69NumOrd ;
   private short AV79NumLin ;
   private short AV81UltNumLin ;
   private short AV95ContLinea ;
   private short A5562Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short A5557Lb_LineaC ;
   private short GXv_int20[] ;
   private short GXv_int16[] ;
   private short GXv_int14[] ;
   private short GXv_int11[] ;
   private short GXv_int10[] ;
   private int AV110Lb_numero ;
   private int GX_INS118 ;
   private int A878EscVol ;
   private int A885EscMVol ;
   private int A886EscMUltLin ;
   private int A896EscMValCos ;
   private int AV76ValCos ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV89CliCod ;
   private int AV92ForColNum ;
   private int GXv_int17[] ;
   private int GXv_int4[] ;
   private int A6059Lb_solup ;
   private int A6058Lb_soluc ;
   private int GXv_int25[] ;
   private int GXv_int23[] ;
   private java.math.BigDecimal AV74TotKgs ;
   private java.math.BigDecimal AV75Volumen ;
   private java.math.BigDecimal AV104Incre ;
   private java.math.BigDecimal A876EscInc ;
   private java.math.BigDecimal A877EscKgm ;
   private java.math.BigDecimal A883EscMInc ;
   private java.math.BigDecimal A884EscMKgm ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV111Proforcpo ;
   private java.math.BigDecimal AV84Cantidad ;
   private java.math.BigDecimal AV108Solu_ml ;
   private java.math.BigDecimal AV123Porc_p ;
   private java.math.BigDecimal AV126Cantidad0 ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV73ForPrdCan ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV112LB_CantC ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A5590PrdSolub ;
   private String AV96EmprCod ;
   private String AV107Lb_opcion ;
   private String AV88MaqCod ;
   private String AV80Station ;
   private String scmdbuf ;
   private String A910Workstat ;
   private String A396EmprCod ;
   private String A881EscMTxt1 ;
   private String A882EscMTxt2 ;
   private String Gx_emsg ;
   private String A6372Lb_RecPip ;
   private String A5553Lb_ForCod ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String AV68ProForCod ;
   private String AV90ForSer ;
   private String AV91ForColNom ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String A765ProForDes ;
   private String AV119Prdnum_s ;
   private String AV70Producto ;
   private String AV122Llamo_pe ;
   private String AV77Produc ;
   private String AV83ProForPrd ;
   private String AV114Tipo ;
   private String AV103CalVe ;
   private String AV94PrdDesc ;
   private String AV99Accion ;
   private String Gx_msg ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String AV102ProForDes ;
   private String AV101LineaRec ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String GXv_char26[] ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char13[] ;
   private boolean returnInSub ;
   private boolean n876EscInc ;
   private boolean n877EscKgm ;
   private boolean n878EscVol ;
   private boolean n879EscUltLin ;
   private boolean n881EscMTxt1 ;
   private boolean n882EscMTxt2 ;
   private boolean n883EscMInc ;
   private boolean n884EscMKgm ;
   private boolean n885EscMVol ;
   private boolean n886EscMUltLin ;
   private boolean n896EscMValCos ;
   private boolean n626MatCod ;
   private boolean n583IntCod ;
   private boolean n831TipColCod ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P028D2_A910Workstat ;
   private String[] P028D2_A396EmprCod ;
   private java.math.BigDecimal[] P028D2_A876EscInc ;
   private boolean[] P028D2_n876EscInc ;
   private String[] P028D6_A396EmprCod ;
   private String[] P028D6_A6372Lb_RecPip ;
   private int[] P028D6_A5532Lb_numero ;
   private short[] P028D6_A626MatCod ;
   private boolean[] P028D6_n626MatCod ;
   private byte[] P028D6_A583IntCod ;
   private boolean[] P028D6_n583IntCod ;
   private String[] P028D6_A5553Lb_ForCod ;
   private int[] P028D6_A252CliCod ;
   private String[] P028D6_A5533Lb_ArtCod ;
   private String[] P028D6_A5536Lb_ColNom ;
   private int[] P028D6_A5537Lb_ColNum ;
   private byte[] P028D6_A831TipColCod ;
   private boolean[] P028D6_n831TipColCod ;
   private short[] P028D6_A5551Lb_lineaPq ;
   private String[] P028D7_A396EmprCod ;
   private String[] P028D7_A764ProForCod ;
   private short[] P028D7_A4706ProForRb ;
   private java.math.BigDecimal[] P028D7_A6062ProForCPo ;
   private String[] P028D7_A770ProForPrd ;
   private java.math.BigDecimal[] P028D7_A762ProForCan ;
   private String[] P028D7_A5358ProForClv ;
   private String[] P028D7_A763ProForCla ;
   private byte[] P028D7_A490ForPrdUMe ;
   private String[] P028D7_A765ProForDes ;
   private short[] P028D7_A767ProForLin ;
   private short[] P028D8_A5562Lb_orden ;
   private String[] P028D8_A5555Lb_opcion ;
   private int[] P028D8_A5532Lb_numero ;
   private String[] P028D8_A396EmprCod ;
   private String[] P028D8_A719PrdNum ;
   private String[] P028D8_A718PrdNom ;
   private java.math.BigDecimal[] P028D8_A5561LB_CantP ;
   private byte[] P028D8_A490ForPrdUMe ;
   private int[] P028D8_A6059Lb_solup ;
   private short[] P028D8_A5560Lb_LineaPr ;
   private String[] P028D9_A719PrdNum ;
   private String[] P028D9_A5555Lb_opcion ;
   private int[] P028D9_A5532Lb_numero ;
   private String[] P028D9_A396EmprCod ;
   private String[] P028D9_A718PrdNom ;
   private java.math.BigDecimal[] P028D9_A5558LB_CantC ;
   private byte[] P028D9_A490ForPrdUMe ;
   private int[] P028D9_A6058Lb_soluc ;
   private short[] P028D9_A5557Lb_LineaC ;
   private String[] P028D10_A719PrdNum ;
   private String[] P028D10_A396EmprCod ;
   private java.math.BigDecimal[] P028D10_A5590PrdSolub ;
   private short[] P028D11_A5562Lb_orden ;
   private String[] P028D11_A5555Lb_opcion ;
   private int[] P028D11_A5532Lb_numero ;
   private String[] P028D11_A396EmprCod ;
   private short[] P028D11_A5560Lb_LineaPr ;
}

final  class pens035__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028D2", "SELECT Workstat, EmprCod, EscInc FROM TXPCESCAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028D3", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new UpdateCursor("P028D4", "DELETE FROM TXPCESCAN  WHERE EmprCod = ? AND Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESCAN")
         ,new UpdateCursor("P028D5", "INSERT INTO TXPCESCAN(EmprCod, Workstat, EscInc, EscKgm, EscVol, EscUltLin, EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESCAN")
         ,new ForEachCursor("P028D6", "SELECT T1.EmprCod, T1.Lb_RecPip, T1.Lb_numero, T2.MatCod, T2.IntCod, T1.Lb_ForCod, T2.CliCod, T2.Lb_ArtCod, T2.Lb_ColNom, T2.Lb_ColNum, T2.TipColCod, T1.Lb_lineaPq FROM (TXPENS000 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028D7", "SELECT T1.EmprCod, T1.ProForCod, T2.ProForRb, T1.ProForCPo, T1.ProForPrd, T1.ProForCan, T1.ProForClv, T1.ProForCla, T1.ForPrdUMe, T1.ProForDes, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028D8", "SELECT T1.Lb_orden, T1.Lb_opcion, T1.Lb_numero, T1.EmprCod, T1.PrdNum, T2.PrdNom, T1.LB_CantP, T1.ForPrdUMe, T1.Lb_solup, T1.Lb_LineaPr FROM (TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?) AND (T1.Lb_orden = ?) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028D9", "SELECT T1.PrdNum, T1.Lb_opcion, T1.Lb_numero, T1.EmprCod, T2.PrdNom, T1.LB_CantC, T1.ForPrdUMe, T1.Lb_soluc, T1.Lb_LineaC FROM (TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028D10", "SELECT PrdNum, EmprCod, PrdSolub FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028D11", "SELECT Lb_orden, Lb_opcion, Lb_numero, EmprCod, Lb_LineaPr FROM TXPENS004 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (Lb_orden = ?) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 60);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 60);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[23]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

