package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactfac extends GXProcedure
{
   public pactfac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactfac.class ), "" );
   }

   public pactfac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        byte aP2 )
   {
      pactfac.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        byte aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             byte aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pactfac.this.A396EmprCod = aP0;
      pactfac.this.AV15FechaLim = aP1;
      pactfac.this.AV16SerieF = aP2;
      pactfac.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV53FlagDia ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int1) ;
      pactfac.this.AV53FlagDia = GXv_int1[0] ;
      GXv_int1[0] = AV81F_clfse ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLFSE", ""), GXv_int1) ;
      pactfac.this.AV81F_clfse = GXv_int1[0] ;
      GXv_int1[0] = AV82EstCat ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTCAT", ""), GXv_int1) ;
      pactfac.this.AV82EstCat = GXv_int1[0] ;
      GXv_int1[0] = AV86No_b ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOB", ""), GXv_int1) ;
      pactfac.this.AV86No_b = GXv_int1[0] ;
      AV91messages.clear();
      /* Using cursor P01WK2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A963Ser1 = P01WK2_A963Ser1[0] ;
         n963Ser1 = P01WK2_n963Ser1[0] ;
         A2387Ser2 = P01WK2_A2387Ser2[0] ;
         n2387Ser2 = P01WK2_n2387Ser2[0] ;
         A2389Ser3 = P01WK2_A2389Ser3[0] ;
         n2389Ser3 = P01WK2_n2389Ser3[0] ;
         if ( AV16SerieF == 1 )
         {
            AV17FacSerNum = A963Ser1 ;
         }
         else
         {
            if ( AV16SerieF == 2 )
            {
               AV17FacSerNum = A2387Ser2 ;
            }
            else
            {
               if ( AV16SerieF == 3 )
               {
                  AV17FacSerNum = A2389Ser3 ;
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV40FlagEst = (byte)(0) ;
      GXv_int1[0] = AV40FlagEst ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int1) ;
      pactfac.this.AV40FlagEst = GXv_int1[0] ;
      AV41FlagBru = (byte)(0) ;
      GXv_int1[0] = AV41FlagBru ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTBRU", ""), GXv_int1) ;
      pactfac.this.AV41FlagBru = GXv_int1[0] ;
      AV55FlagTot = (byte)(0) ;
      GXv_int1[0] = AV55FlagTot ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTTOT", ""), GXv_int1) ;
      pactfac.this.AV55FlagTot = GXv_int1[0] ;
      AV87ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV87ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV87ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV87ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV87ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV87ProgressIndicator.show();
      AV88CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P01WK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV15FechaLim, AV17FacSerNum});
      cV88CantidadRegistrosAProcesar = P01WK3_AV88CantidadRegistrosAProcesar[0] ;
      pr_default.close(1);
      AV88CantidadRegistrosAProcesar = (short)(AV88CantidadRegistrosAProcesar+cV88CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV88CantidadRegistrosAProcesar == 0 )
      {
         AV88CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV89CantidadRegistrosProcesados = (short)(0) ;
      /* Using cursor P01WK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A396EmprCod, AV15FechaLim, AV17FacSerNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A430FacCod = P01WK4_A430FacCod[0] ;
         A450FacPri = P01WK4_A450FacPri[0] ;
         A1153FacTipFac = P01WK4_A1153FacTipFac[0] ;
         A2739FacSerNum = P01WK4_A2739FacSerNum[0] ;
         A436FacFch = P01WK4_A436FacFch[0] ;
         A435FacEst = P01WK4_A435FacEst[0] ;
         A252CliCod = P01WK4_A252CliCod[0] ;
         n252CliCod = P01WK4_n252CliCod[0] ;
         A11513FacRecIca = P01WK4_A11513FacRecIca[0] ;
         A8346FacRecI = P01WK4_A8346FacRecI[0] ;
         n8346FacRecI = P01WK4_n8346FacRecI[0] ;
         A7212FacRect = P01WK4_A7212FacRect[0] ;
         A453FacRECPor = P01WK4_A453FacRECPor[0] ;
         A443FacIVAPor = P01WK4_A443FacIVAPor[0] ;
         A14224FacCostFac = P01WK4_A14224FacCostFac[0] ;
         A14223FacCostKgs = P01WK4_A14223FacCostKgs[0] ;
         A14222FacCostMts = P01WK4_A14222FacCostMts[0] ;
         A434FacDtoPP = P01WK4_A434FacDtoPP[0] ;
         A433FacDtoGen = P01WK4_A433FacDtoGen[0] ;
         A14219FacEnergia = P01WK4_A14219FacEnergia[0] ;
         if ( (( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV15FechaLim )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV15FechaLim)) )) )
         {
            if ( A435FacEst == 1 )
            {
               if ( GXutil.strcmp(A2739FacSerNum, AV17FacSerNum) == 0 )
               {
                  /* Using cursor P01WK5 */
                  pr_default.execute(3, new Object[] {A396EmprCod});
                  A7209Colombia = P01WK5_A7209Colombia[0] ;
                  n7209Colombia = P01WK5_n7209Colombia[0] ;
                  A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
                  A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
                  /* Using cursor P01WK6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  A279CliNom = P01WK6_A279CliNom[0] ;
                  /* Using cursor P01WK8 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
                  if ( (pr_default.getStatus(5) != 101) )
                  {
                     A3918FacImpTot1 = P01WK8_A3918FacImpTot1[0] ;
                  }
                  else
                  {
                     A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
                  }
                  A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  if ( A7209Colombia == 0 )
                  {
                     A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
                     }
                     else
                     {
                        A440FacImpPP = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  if ( A7209Colombia == 0 )
                  {
                     A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
                     }
                     else
                     {
                        A439FacImpGen = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
                  A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
                  A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
                  A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  if ( A7209Colombia == 0 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                     }
                     else
                     {
                        A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  if ( A7209Colombia == 0 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                     }
                     else
                     {
                        A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  if ( A7209Colombia == 0 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                     }
                     else
                     {
                        A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  if ( A7209Colombia == 0 )
                  {
                     A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                     }
                     else
                     {
                        A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                  AV18Any = (short)(GXutil.year( A436FacFch)) ;
                  AV19Mes = (byte)(GXutil.month( A436FacFch)) ;
                  AV85CliFac = A252CliCod ;
                  AV42BaseImp = A429FacBasImp ;
                  AV56FacTot = A455FacTot ;
                  AV43FacPri = A450FacPri ;
                  /*
                     INSERT RECORD ON TABLE TXPCESCLI

                  */
                  W252CliCod = A252CliCod ;
                  n252CliCod = false ;
                  A252CliCod = AV85CliFac ;
                  n252CliCod = false ;
                  A425EstAny = AV18Any ;
                  A2755EstSerFac = A2739FacSerNum ;
                  /* Using cursor P01WK9 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCLI");
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A252CliCod = W252CliCod ;
                  n252CliCod = false ;
                  /* End Insert */
                  AV73Hdr = GXutil.space( (short)(10)) ;
                  AV74LastHdr = GXutil.space( (short)(10)) ;
                  AV75Emp_proces = (byte)(0) ;
                  AV79Tot_imp_k = DecimalUtil.doubleToDec(0) ;
                  AV80Tot_imp_m = DecimalUtil.doubleToDec(0) ;
                  /* Using cursor P01WK10 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A1294FacBarCod = P01WK10_A1294FacBarCod[0] ;
                     A1295FacBarReo = P01WK10_A1295FacBarReo[0] ;
                     A1296FacBarPar = P01WK10_A1296FacBarPar[0] ;
                     A454FacSer = P01WK10_A454FacSer[0] ;
                     A2739FacSerNum = P01WK10_A2739FacSerNum[0] ;
                     A3880FacTipColC = P01WK10_A3880FacTipColC[0] ;
                     A3397FacFasCod = P01WK10_A3397FacFasCod[0] ;
                     A5189FacTipArt = P01WK10_A5189FacTipArt[0] ;
                     A427FacAlbCod = P01WK10_A427FacAlbCod[0] ;
                     A12197FacUnds = P01WK10_A12197FacUnds[0] ;
                     A3897FacKgsA = P01WK10_A3897FacKgsA[0] ;
                     A3898FacPreKgsA = P01WK10_A3898FacPreKgsA[0] ;
                     A12198FacPreUnd = P01WK10_A12198FacPreUnd[0] ;
                     A449FacPreMts = P01WK10_A449FacPreMts[0] ;
                     A5353FacImpMan = P01WK10_A5353FacImpMan[0] ;
                     A447FacMts = P01WK10_A447FacMts[0] ;
                     A444FacKgs = P01WK10_A444FacKgs[0] ;
                     A448FacPreKgs = P01WK10_A448FacPreKgs[0] ;
                     A5355FacImpMin = P01WK10_A5355FacImpMin[0] ;
                     A446FacLin = P01WK10_A446FacLin[0] ;
                     A2739FacSerNum = P01WK10_A2739FacSerNum[0] ;
                     if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
                     {
                        A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
                        if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
                        {
                           A3923FacImp1 = A5355FacImpMin ;
                        }
                        else
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
                           {
                              A3923FacImp1 = A5353FacImpMan ;
                           }
                           else
                           {
                              if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
                              {
                                 A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
                              }
                              else
                              {
                                 A3923FacImp1 = A2239FacIml ;
                              }
                           }
                        }
                        A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
                        AV31ImpCli0 = DecimalUtil.doubleToDec(0) ;
                        AV28ImpCli1 = DecimalUtil.doubleToDec(0) ;
                        AV32FacKg0 = DecimalUtil.doubleToDec(0) ;
                        AV29FacKg1 = DecimalUtil.doubleToDec(0) ;
                        AV33FacMt0 = DecimalUtil.doubleToDec(0) ;
                        AV30FacMt1 = DecimalUtil.doubleToDec(0) ;
                        AV66FacBarCod = A1294FacBarCod ;
                        AV67FacBarPar = A1296FacBarPar ;
                        AV68FacBarReo = A1295FacBarReo ;
                        AV84TipColCodf = A3880FacTipColC ;
                        AV73Hdr = GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                        if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                        {
                           AV28ImpCli1 = A438FacImp ;
                           if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                           {
                              AV29FacKg1 = A444FacKgs ;
                           }
                           if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                           {
                              AV30FacMt1 = A447FacMts ;
                           }
                        }
                        else
                        {
                           AV31ImpCli0 = A438FacImp ;
                           if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                           {
                              AV32FacKg0 = A444FacKgs ;
                           }
                           if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                           {
                              AV33FacMt0 = A447FacMts ;
                           }
                        }
                        /*
                           INSERT RECORD ON TABLE TXPLESCLI

                        */
                        W252CliCod = A252CliCod ;
                        n252CliCod = false ;
                        A252CliCod = AV85CliFac ;
                        n252CliCod = false ;
                        A425EstAny = AV18Any ;
                        A2755EstSerFac = A2739FacSerNum ;
                        A426EstMes = AV19Mes ;
                        if ( (0==AV41FlagBru) && (0==AV55FlagTot) )
                        {
                           A1440ImpCli1 = AV28ImpCli1 ;
                           n1440ImpCli1 = false ;
                        }
                        else
                        {
                           A1440ImpCli1 = DecimalUtil.doubleToDec(0) ;
                           n1440ImpCli1 = false ;
                        }
                        A1368FacKg1 = AV29FacKg1 ;
                        n1368FacKg1 = false ;
                        A1366FacMt1 = AV30FacMt1 ;
                        n1366FacMt1 = false ;
                        if ( (0==AV41FlagBru) && (0==AV55FlagTot) && ( AV86No_b == 0 ) )
                        {
                           A1439ImpCli0 = AV31ImpCli0 ;
                           n1439ImpCli0 = false ;
                        }
                        else
                        {
                           A1439ImpCli0 = DecimalUtil.doubleToDec(0) ;
                           n1439ImpCli0 = false ;
                        }
                        A1367FacKg0 = AV32FacKg0 ;
                        n1367FacKg0 = false ;
                        A1365FacMt0 = AV33FacMt0 ;
                        n1365FacMt0 = false ;
                        /* Using cursor P01WK11 */
                        pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes), Boolean.valueOf(n1365FacMt0), A1365FacMt0, Boolean.valueOf(n1366FacMt1), A1366FacMt1, Boolean.valueOf(n1367FacKg0), A1367FacKg0, Boolean.valueOf(n1368FacKg1), A1368FacKg1, Boolean.valueOf(n1439ImpCli0), A1439ImpCli0, Boolean.valueOf(n1440ImpCli1), A1440ImpCli1});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCLI");
                        if ( (pr_default.getStatus(8) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           /* Using cursor P01WK12 */
                           pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes)});
                           while ( (pr_default.getStatus(9) != 101) )
                           {
                              A396EmprCod = P01WK12_A396EmprCod[0] ;
                              A252CliCod = P01WK12_A252CliCod[0] ;
                              n252CliCod = P01WK12_n252CliCod[0] ;
                              A425EstAny = P01WK12_A425EstAny[0] ;
                              A2755EstSerFac = P01WK12_A2755EstSerFac[0] ;
                              A426EstMes = P01WK12_A426EstMes[0] ;
                              A1440ImpCli1 = P01WK12_A1440ImpCli1[0] ;
                              n1440ImpCli1 = P01WK12_n1440ImpCli1[0] ;
                              A1439ImpCli0 = P01WK12_A1439ImpCli0[0] ;
                              n1439ImpCli0 = P01WK12_n1439ImpCli0[0] ;
                              A1368FacKg1 = P01WK12_A1368FacKg1[0] ;
                              n1368FacKg1 = P01WK12_n1368FacKg1[0] ;
                              A1366FacMt1 = P01WK12_A1366FacMt1[0] ;
                              n1366FacMt1 = P01WK12_n1366FacMt1[0] ;
                              A1367FacKg0 = P01WK12_A1367FacKg0[0] ;
                              n1367FacKg0 = P01WK12_n1367FacKg0[0] ;
                              A1365FacMt0 = P01WK12_A1365FacMt0[0] ;
                              n1365FacMt0 = P01WK12_n1365FacMt0[0] ;
                              if ( (0==AV41FlagBru) && (0==AV55FlagTot) )
                              {
                                 A1440ImpCli1 = A1440ImpCli1.add(AV28ImpCli1) ;
                                 n1440ImpCli1 = false ;
                              }
                              if ( (0==AV41FlagBru) && (0==AV55FlagTot) && ( AV86No_b == 0 ) )
                              {
                                 A1439ImpCli0 = A1439ImpCli0.add(AV31ImpCli0) ;
                                 n1439ImpCli0 = false ;
                              }
                              if ( GXutil.strcmp(AV73Hdr, AV74LastHdr) == 0 )
                              {
                              }
                              else
                              {
                                 A1368FacKg1 = A1368FacKg1.add(AV29FacKg1) ;
                                 n1368FacKg1 = false ;
                                 A1366FacMt1 = A1366FacMt1.add(AV30FacMt1) ;
                                 n1366FacMt1 = false ;
                                 A1367FacKg0 = A1367FacKg0.add(AV32FacKg0) ;
                                 n1367FacKg0 = false ;
                                 A1365FacMt0 = A1365FacMt0.add(AV33FacMt0) ;
                                 n1365FacMt0 = false ;
                              }
                              /* Using cursor P01WK13 */
                              pr_default.execute(10, new Object[] {Boolean.valueOf(n1440ImpCli1), A1440ImpCli1, Boolean.valueOf(n1439ImpCli0), A1439ImpCli0, Boolean.valueOf(n1368FacKg1), A1368FacKg1, Boolean.valueOf(n1366FacMt1), A1366FacMt1, Boolean.valueOf(n1367FacKg0), A1367FacKg0, Boolean.valueOf(n1365FacMt0), A1365FacMt0, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes)});
                              Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCLI");
                              /* Exiting from a For First loop. */
                              if (true) break;
                           }
                           pr_default.close(9);
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        A252CliCod = W252CliCod ;
                        n252CliCod = false ;
                        /* End Insert */
                        AV34ArtImp1 = DecimalUtil.doubleToDec(0) ;
                        AV39ArtFacKg1 = DecimalUtil.doubleToDec(0) ;
                        AV37ArtFacMt1 = DecimalUtil.doubleToDec(0) ;
                        AV35ArtImp0 = DecimalUtil.doubleToDec(0) ;
                        AV36ArtFacKg0 = DecimalUtil.doubleToDec(0) ;
                        AV38ArtFacMt0 = DecimalUtil.doubleToDec(0) ;
                        AV20TipArtCod = (short)(0) ;
                        AV21CliCod = A252CliCod ;
                        AV22ArtCod = A454FacSer ;
                        AV23EmprCod = A396EmprCod ;
                        /* Execute user subroutine: 'TIPART' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(7);
                           pr_default.close(7);
                           pr_default.close(5);
                           pr_default.close(4);
                           pr_default.close(3);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        /*
                           INSERT RECORD ON TABLE TXPCESART

                        */
                        W252CliCod = A252CliCod ;
                        n252CliCod = false ;
                        A252CliCod = AV85CliFac ;
                        n252CliCod = false ;
                        A65ArtCod = A454FacSer ;
                        A71ArtEstAny = AV18Any ;
                        A2756ArtEstSer = A2739FacSerNum ;
                        A829TipArtCod = AV20TipArtCod ;
                        /* Using cursor P01WK14 */
                        pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Short.valueOf(A829TipArtCod)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
                        if ( (pr_default.getStatus(11) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        A252CliCod = W252CliCod ;
                        n252CliCod = false ;
                        /* End Insert */
                        if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                        {
                           AV34ArtImp1 = A438FacImp ;
                           if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                           {
                              AV39ArtFacKg1 = A444FacKgs ;
                           }
                           if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                           {
                              AV37ArtFacMt1 = A447FacMts ;
                           }
                        }
                        else
                        {
                           AV35ArtImp0 = A438FacImp ;
                           if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                           {
                              AV36ArtFacKg0 = A444FacKgs ;
                           }
                           if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                           {
                              AV38ArtFacMt0 = A447FacMts ;
                           }
                        }
                        /*
                           INSERT RECORD ON TABLE TXPLESART

                        */
                        W252CliCod = A252CliCod ;
                        n252CliCod = false ;
                        A252CliCod = AV85CliFac ;
                        n252CliCod = false ;
                        A65ArtCod = A454FacSer ;
                        A71ArtEstAny = AV18Any ;
                        A2756ArtEstSer = A2739FacSerNum ;
                        A72ArtEstMes = AV19Mes ;
                        A1437ArtImp1 = AV34ArtImp1 ;
                        n1437ArtImp1 = false ;
                        A1436ArtImp0 = AV35ArtImp0 ;
                        n1436ArtImp0 = false ;
                        A1374ArtFacMt1 = AV37ArtFacMt1 ;
                        n1374ArtFacMt1 = false ;
                        A1373ArtFacMt0 = AV38ArtFacMt0 ;
                        n1373ArtFacMt0 = false ;
                        A1376ArtFacKg1 = AV39ArtFacKg1 ;
                        n1376ArtFacKg1 = false ;
                        A1375ArtFacKg0 = AV36ArtFacKg0 ;
                        n1375ArtFacKg0 = false ;
                        A5342ArtEstTart = AV20TipArtCod ;
                        n5342ArtEstTart = false ;
                        /* Using cursor P01WK15 */
                        pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Byte.valueOf(A72ArtEstMes), Boolean.valueOf(n1373ArtFacMt0), A1373ArtFacMt0, Boolean.valueOf(n1374ArtFacMt1), A1374ArtFacMt1, Boolean.valueOf(n1375ArtFacKg0), A1375ArtFacKg0, Boolean.valueOf(n1376ArtFacKg1), A1376ArtFacKg1, Boolean.valueOf(n1436ArtImp0), A1436ArtImp0, Boolean.valueOf(n1437ArtImp1), A1437ArtImp1, Boolean.valueOf(n5342ArtEstTart), Short.valueOf(A5342ArtEstTart)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESART");
                        if ( (pr_default.getStatus(12) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           /* Using cursor P01WK16 */
                           pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Byte.valueOf(A72ArtEstMes)});
                           while ( (pr_default.getStatus(13) != 101) )
                           {
                              A396EmprCod = P01WK16_A396EmprCod[0] ;
                              A252CliCod = P01WK16_A252CliCod[0] ;
                              n252CliCod = P01WK16_n252CliCod[0] ;
                              A65ArtCod = P01WK16_A65ArtCod[0] ;
                              A71ArtEstAny = P01WK16_A71ArtEstAny[0] ;
                              A2756ArtEstSer = P01WK16_A2756ArtEstSer[0] ;
                              A72ArtEstMes = P01WK16_A72ArtEstMes[0] ;
                              A1437ArtImp1 = P01WK16_A1437ArtImp1[0] ;
                              n1437ArtImp1 = P01WK16_n1437ArtImp1[0] ;
                              A1436ArtImp0 = P01WK16_A1436ArtImp0[0] ;
                              n1436ArtImp0 = P01WK16_n1436ArtImp0[0] ;
                              A1376ArtFacKg1 = P01WK16_A1376ArtFacKg1[0] ;
                              n1376ArtFacKg1 = P01WK16_n1376ArtFacKg1[0] ;
                              A1374ArtFacMt1 = P01WK16_A1374ArtFacMt1[0] ;
                              n1374ArtFacMt1 = P01WK16_n1374ArtFacMt1[0] ;
                              A1375ArtFacKg0 = P01WK16_A1375ArtFacKg0[0] ;
                              n1375ArtFacKg0 = P01WK16_n1375ArtFacKg0[0] ;
                              A1373ArtFacMt0 = P01WK16_A1373ArtFacMt0[0] ;
                              n1373ArtFacMt0 = P01WK16_n1373ArtFacMt0[0] ;
                              A5342ArtEstTart = P01WK16_A5342ArtEstTart[0] ;
                              n5342ArtEstTart = P01WK16_n5342ArtEstTart[0] ;
                              A1437ArtImp1 = A1437ArtImp1.add(AV34ArtImp1) ;
                              n1437ArtImp1 = false ;
                              if ( AV86No_b == 0 )
                              {
                                 A1436ArtImp0 = A1436ArtImp0.add(AV35ArtImp0) ;
                                 n1436ArtImp0 = false ;
                              }
                              if ( GXutil.strcmp(AV73Hdr, AV74LastHdr) == 0 )
                              {
                              }
                              else
                              {
                                 A1376ArtFacKg1 = A1376ArtFacKg1.add(AV39ArtFacKg1) ;
                                 n1376ArtFacKg1 = false ;
                                 A1374ArtFacMt1 = A1374ArtFacMt1.add(AV37ArtFacMt1) ;
                                 n1374ArtFacMt1 = false ;
                                 if ( AV86No_b == 0 )
                                 {
                                    A1375ArtFacKg0 = A1375ArtFacKg0.add(AV36ArtFacKg0) ;
                                    n1375ArtFacKg0 = false ;
                                    A1373ArtFacMt0 = A1373ArtFacMt0.add(AV38ArtFacMt0) ;
                                    n1373ArtFacMt0 = false ;
                                 }
                              }
                              A5342ArtEstTart = AV20TipArtCod ;
                              n5342ArtEstTart = false ;
                              /* Using cursor P01WK17 */
                              pr_default.execute(14, new Object[] {Boolean.valueOf(n1437ArtImp1), A1437ArtImp1, Boolean.valueOf(n1436ArtImp0), A1436ArtImp0, Boolean.valueOf(n1376ArtFacKg1), A1376ArtFacKg1, Boolean.valueOf(n1374ArtFacMt1), A1374ArtFacMt1, Boolean.valueOf(n1375ArtFacKg0), A1375ArtFacKg0, Boolean.valueOf(n1373ArtFacMt0), A1373ArtFacMt0, Boolean.valueOf(n5342ArtEstTart), Short.valueOf(A5342ArtEstTart), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Byte.valueOf(A72ArtEstMes)});
                              Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESART");
                              /* Exiting from a For First loop. */
                              if (true) break;
                           }
                           pr_default.close(13);
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        A252CliCod = W252CliCod ;
                        n252CliCod = false ;
                        /* End Insert */
                        if ( AV81F_clfse == 1 )
                        {
                           if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                           {
                              AV65FacFasCod = "XXXXXXXX" ;
                              /* Execute user subroutine: 'BARFAS' */
                              S141 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(7);
                                 pr_default.close(7);
                                 pr_default.close(5);
                                 pr_default.close(4);
                                 pr_default.close(3);
                                 returnInSub = true;
                                 cleanup();
                                 if (true) return;
                              }
                           }
                           else
                           {
                              AV65FacFasCod = A3397FacFasCod ;
                           }
                           if ( ( AV34ArtImp1.doubleValue() > 0 ) || ( AV35ArtImp0.doubleValue() > 0 ) )
                           {
                              /*
                                 INSERT RECORD ON TABLE TXPCLFSE

                              */
                              W252CliCod = A252CliCod ;
                              n252CliCod = false ;
                              A252CliCod = AV85CliFac ;
                              n252CliCod = false ;
                              A457FasCod = AV65FacFasCod ;
                              A5310ClFsAny = AV18Any ;
                              A5311ClFsSer = A2739FacSerNum ;
                              /* Using cursor P01WK18 */
                              pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod, Short.valueOf(A5310ClFsAny), A5311ClFsSer});
                              Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLFSE");
                              if ( (pr_default.getStatus(15) == 1) )
                              {
                                 Gx_err = (short)(1) ;
                                 Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                              }
                              else
                              {
                                 Gx_err = (short)(0) ;
                                 Gx_emsg = "" ;
                              }
                              A252CliCod = W252CliCod ;
                              n252CliCod = false ;
                              /* End Insert */
                              /*
                                 INSERT RECORD ON TABLE TXPCLFSE1

                              */
                              W252CliCod = A252CliCod ;
                              n252CliCod = false ;
                              A252CliCod = AV85CliFac ;
                              n252CliCod = false ;
                              A457FasCod = AV65FacFasCod ;
                              A5310ClFsAny = AV18Any ;
                              A5311ClFsSer = A2739FacSerNum ;
                              A5315ClFsMes = AV19Mes ;
                              A5317ClFsFac1 = AV34ArtImp1 ;
                              n5317ClFsFac1 = false ;
                              A5319ClFsKg1 = AV39ArtFacKg1 ;
                              n5319ClFsKg1 = false ;
                              A5321ClFsMt1 = AV37ArtFacMt1 ;
                              n5321ClFsMt1 = false ;
                              if ( AV86No_b == 0 )
                              {
                                 A5320ClFsMt0 = AV38ArtFacMt0 ;
                                 n5320ClFsMt0 = false ;
                                 A5318ClFsKg0 = AV36ArtFacKg0 ;
                                 n5318ClFsKg0 = false ;
                                 A5316ClFsFac0 = AV35ArtImp0 ;
                                 n5316ClFsFac0 = false ;
                              }
                              /* Using cursor P01WK19 */
                              pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod, Short.valueOf(A5310ClFsAny), A5311ClFsSer, Byte.valueOf(A5315ClFsMes), Boolean.valueOf(n5316ClFsFac0), A5316ClFsFac0, Boolean.valueOf(n5317ClFsFac1), A5317ClFsFac1, Boolean.valueOf(n5318ClFsKg0), A5318ClFsKg0, Boolean.valueOf(n5319ClFsKg1), A5319ClFsKg1, Boolean.valueOf(n5320ClFsMt0), A5320ClFsMt0, Boolean.valueOf(n5321ClFsMt1), A5321ClFsMt1});
                              Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLFSE1");
                              if ( (pr_default.getStatus(16) == 1) )
                              {
                                 Gx_err = (short)(1) ;
                                 Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                                 /* Using cursor P01WK20 */
                                 pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod, Short.valueOf(A5310ClFsAny), A5311ClFsSer, Byte.valueOf(A5315ClFsMes)});
                                 while ( (pr_default.getStatus(17) != 101) )
                                 {
                                    A396EmprCod = P01WK20_A396EmprCod[0] ;
                                    A252CliCod = P01WK20_A252CliCod[0] ;
                                    n252CliCod = P01WK20_n252CliCod[0] ;
                                    A457FasCod = P01WK20_A457FasCod[0] ;
                                    A5310ClFsAny = P01WK20_A5310ClFsAny[0] ;
                                    A5311ClFsSer = P01WK20_A5311ClFsSer[0] ;
                                    A5315ClFsMes = P01WK20_A5315ClFsMes[0] ;
                                    A5317ClFsFac1 = P01WK20_A5317ClFsFac1[0] ;
                                    n5317ClFsFac1 = P01WK20_n5317ClFsFac1[0] ;
                                    A5319ClFsKg1 = P01WK20_A5319ClFsKg1[0] ;
                                    n5319ClFsKg1 = P01WK20_n5319ClFsKg1[0] ;
                                    A5321ClFsMt1 = P01WK20_A5321ClFsMt1[0] ;
                                    n5321ClFsMt1 = P01WK20_n5321ClFsMt1[0] ;
                                    A5320ClFsMt0 = P01WK20_A5320ClFsMt0[0] ;
                                    n5320ClFsMt0 = P01WK20_n5320ClFsMt0[0] ;
                                    A5316ClFsFac0 = P01WK20_A5316ClFsFac0[0] ;
                                    n5316ClFsFac0 = P01WK20_n5316ClFsFac0[0] ;
                                    A5318ClFsKg0 = P01WK20_A5318ClFsKg0[0] ;
                                    n5318ClFsKg0 = P01WK20_n5318ClFsKg0[0] ;
                                    A5317ClFsFac1 = A5317ClFsFac1.add(AV34ArtImp1) ;
                                    n5317ClFsFac1 = false ;
                                    A5319ClFsKg1 = A5319ClFsKg1.add(AV39ArtFacKg1) ;
                                    n5319ClFsKg1 = false ;
                                    A5321ClFsMt1 = A5321ClFsMt1.add(AV37ArtFacMt1) ;
                                    n5321ClFsMt1 = false ;
                                    if ( AV86No_b == 0 )
                                    {
                                       A5320ClFsMt0 = A5320ClFsMt0.add(AV38ArtFacMt0) ;
                                       n5320ClFsMt0 = false ;
                                       A5316ClFsFac0 = A5316ClFsFac0.add(AV35ArtImp0) ;
                                       n5316ClFsFac0 = false ;
                                       A5318ClFsKg0 = A5318ClFsKg0.add(AV36ArtFacKg0) ;
                                       n5318ClFsKg0 = false ;
                                    }
                                    /* Using cursor P01WK21 */
                                    pr_default.execute(18, new Object[] {Boolean.valueOf(n5317ClFsFac1), A5317ClFsFac1, Boolean.valueOf(n5319ClFsKg1), A5319ClFsKg1, Boolean.valueOf(n5321ClFsMt1), A5321ClFsMt1, Boolean.valueOf(n5320ClFsMt0), A5320ClFsMt0, Boolean.valueOf(n5316ClFsFac0), A5316ClFsFac0, Boolean.valueOf(n5318ClFsKg0), A5318ClFsKg0, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod, Short.valueOf(A5310ClFsAny), A5311ClFsSer, Byte.valueOf(A5315ClFsMes)});
                                    Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLFSE1");
                                    /* Exiting from a For First loop. */
                                    if (true) break;
                                 }
                                 pr_default.close(17);
                              }
                              else
                              {
                                 Gx_err = (short)(0) ;
                                 Gx_emsg = "" ;
                              }
                              A252CliCod = W252CliCod ;
                              n252CliCod = false ;
                              /* End Insert */
                           }
                        }
                        AV64FacTipArt = A5189FacTipArt ;
                        if ( (0==AV64FacTipArt) )
                        {
                           AV64FacTipArt = AV20TipArtCod ;
                        }
                        /*
                           INSERT RECORD ON TABLE TXPTAREST

                        */
                        A829TipArtCod = AV64FacTipArt ;
                        A5173EstTpaAny = AV18Any ;
                        A5174EstTpaSF = A2739FacSerNum ;
                        /* Using cursor P01WK22 */
                        pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod), Short.valueOf(A5173EstTpaAny), A5174EstTpaSF});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAREST");
                        if ( (pr_default.getStatus(19) == 1) )
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
                        /*
                           INSERT RECORD ON TABLE TXPTARES1

                        */
                        A829TipArtCod = AV64FacTipArt ;
                        A5173EstTpaAny = AV18Any ;
                        A5174EstTpaSF = A2739FacSerNum ;
                        A5182EstTpaMes = AV19Mes ;
                        A5184TpaFMt1 = AV37ArtFacMt1 ;
                        n5184TpaFMt1 = false ;
                        A5186TpaFKg1 = AV39ArtFacKg1 ;
                        n5186TpaFKg1 = false ;
                        if ( AV86No_b == 0 )
                        {
                           A5187ImpTpa0 = AV35ArtImp0 ;
                           n5187ImpTpa0 = false ;
                           A5183TpaFMt0 = AV38ArtFacMt0 ;
                           n5183TpaFMt0 = false ;
                           A5185TpaFKg0 = AV36ArtFacKg0 ;
                           n5185TpaFKg0 = false ;
                        }
                        A5188ImpTpa1 = AV34ArtImp1 ;
                        n5188ImpTpa1 = false ;
                        /* Using cursor P01WK23 */
                        pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod), Short.valueOf(A5173EstTpaAny), A5174EstTpaSF, Byte.valueOf(A5182EstTpaMes), Boolean.valueOf(n5183TpaFMt0), A5183TpaFMt0, Boolean.valueOf(n5184TpaFMt1), A5184TpaFMt1, Boolean.valueOf(n5185TpaFKg0), A5185TpaFKg0, Boolean.valueOf(n5186TpaFKg1), A5186TpaFKg1, Boolean.valueOf(n5187ImpTpa0), A5187ImpTpa0, Boolean.valueOf(n5188ImpTpa1), A5188ImpTpa1});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARES1");
                        if ( (pr_default.getStatus(20) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           /* Using cursor P01WK24 */
                           pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod), Short.valueOf(A5173EstTpaAny), A5174EstTpaSF, Byte.valueOf(A5182EstTpaMes)});
                           while ( (pr_default.getStatus(21) != 101) )
                           {
                              A396EmprCod = P01WK24_A396EmprCod[0] ;
                              A829TipArtCod = P01WK24_A829TipArtCod[0] ;
                              A5173EstTpaAny = P01WK24_A5173EstTpaAny[0] ;
                              A5174EstTpaSF = P01WK24_A5174EstTpaSF[0] ;
                              A5182EstTpaMes = P01WK24_A5182EstTpaMes[0] ;
                              A5187ImpTpa0 = P01WK24_A5187ImpTpa0[0] ;
                              n5187ImpTpa0 = P01WK24_n5187ImpTpa0[0] ;
                              A5188ImpTpa1 = P01WK24_A5188ImpTpa1[0] ;
                              n5188ImpTpa1 = P01WK24_n5188ImpTpa1[0] ;
                              A5185TpaFKg0 = P01WK24_A5185TpaFKg0[0] ;
                              n5185TpaFKg0 = P01WK24_n5185TpaFKg0[0] ;
                              A5183TpaFMt0 = P01WK24_A5183TpaFMt0[0] ;
                              n5183TpaFMt0 = P01WK24_n5183TpaFMt0[0] ;
                              A5184TpaFMt1 = P01WK24_A5184TpaFMt1[0] ;
                              n5184TpaFMt1 = P01WK24_n5184TpaFMt1[0] ;
                              A5186TpaFKg1 = P01WK24_A5186TpaFKg1[0] ;
                              n5186TpaFKg1 = P01WK24_n5186TpaFKg1[0] ;
                              if ( AV86No_b == 0 )
                              {
                                 A5187ImpTpa0 = A5187ImpTpa0.add(AV35ArtImp0) ;
                                 n5187ImpTpa0 = false ;
                              }
                              A5188ImpTpa1 = A5188ImpTpa1.add(AV34ArtImp1) ;
                              n5188ImpTpa1 = false ;
                              if ( GXutil.strcmp(AV73Hdr, AV74LastHdr) == 0 )
                              {
                              }
                              else
                              {
                                 if ( AV86No_b == 0 )
                                 {
                                    A5185TpaFKg0 = A5185TpaFKg0.add(AV36ArtFacKg0) ;
                                    n5185TpaFKg0 = false ;
                                    A5183TpaFMt0 = A5183TpaFMt0.add(AV38ArtFacMt0) ;
                                    n5183TpaFMt0 = false ;
                                 }
                                 A5184TpaFMt1 = A5184TpaFMt1.add(AV37ArtFacMt1) ;
                                 n5184TpaFMt1 = false ;
                                 A5186TpaFKg1 = A5186TpaFKg1.add(AV39ArtFacKg1) ;
                                 n5186TpaFKg1 = false ;
                              }
                              /* Using cursor P01WK25 */
                              pr_default.execute(22, new Object[] {Boolean.valueOf(n5187ImpTpa0), A5187ImpTpa0, Boolean.valueOf(n5188ImpTpa1), A5188ImpTpa1, Boolean.valueOf(n5185TpaFKg0), A5185TpaFKg0, Boolean.valueOf(n5183TpaFMt0), A5183TpaFMt0, Boolean.valueOf(n5184TpaFMt1), A5184TpaFMt1, Boolean.valueOf(n5186TpaFKg1), A5186TpaFKg1, A396EmprCod, Short.valueOf(A829TipArtCod), Short.valueOf(A5173EstTpaAny), A5174EstTpaSF, Byte.valueOf(A5182EstTpaMes)});
                              Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARES1");
                              /* Exiting from a For First loop. */
                              if (true) break;
                           }
                           pr_default.close(21);
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        /* End Insert */
                        if ( AV82EstCat == 1 )
                        {
                           /*
                              INSERT RECORD ON TABLE TXPESTCAT

                           */
                           W252CliCod = A252CliCod ;
                           n252CliCod = false ;
                           A252CliCod = AV85CliFac ;
                           n252CliCod = false ;
                           A65ArtCod = A454FacSer ;
                           A5382EstCatAny = AV18Any ;
                           A5383EstCatSer = A2739FacSerNum ;
                           A5384EstCatTip = AV20TipArtCod ;
                           A5385EstCatDsc = AV83TipArtDsc ;
                           n5385EstCatDsc = false ;
                           /* Using cursor P01WK26 */
                           pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A5382EstCatAny), A5383EstCatSer, Short.valueOf(A5384EstCatTip), Boolean.valueOf(n5385EstCatDsc), A5385EstCatDsc});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESTCAT");
                           if ( (pr_default.getStatus(23) == 1) )
                           {
                              Gx_err = (short)(1) ;
                              Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           }
                           else
                           {
                              Gx_err = (short)(0) ;
                              Gx_emsg = "" ;
                           }
                           A252CliCod = W252CliCod ;
                           n252CliCod = false ;
                           /* End Insert */
                           if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                           {
                              AV34ArtImp1 = A438FacImp ;
                           }
                           else
                           {
                              AV35ArtImp0 = A438FacImp ;
                           }
                           /*
                              INSERT RECORD ON TABLE TXPESTCA1

                           */
                           W252CliCod = A252CliCod ;
                           n252CliCod = false ;
                           A252CliCod = AV85CliFac ;
                           n252CliCod = false ;
                           A65ArtCod = A454FacSer ;
                           A5382EstCatAny = AV18Any ;
                           A5383EstCatSer = A2739FacSerNum ;
                           A5384EstCatTip = AV20TipArtCod ;
                           A5389EstCatMes = AV19Mes ;
                           A5391EstCatImp1 = AV34ArtImp1 ;
                           n5391EstCatImp1 = false ;
                           if ( AV86No_b == 0 )
                           {
                              A5390EstCatImp0 = AV35ArtImp0 ;
                              n5390EstCatImp0 = false ;
                           }
                           /* Using cursor P01WK27 */
                           pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A5382EstCatAny), A5383EstCatSer, Short.valueOf(A5384EstCatTip), Byte.valueOf(A5389EstCatMes), Boolean.valueOf(n5390EstCatImp0), A5390EstCatImp0, Boolean.valueOf(n5391EstCatImp1), A5391EstCatImp1});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESTCA1");
                           if ( (pr_default.getStatus(24) == 1) )
                           {
                              Gx_err = (short)(1) ;
                              Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                              /* Using cursor P01WK28 */
                              pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A5382EstCatAny), A5383EstCatSer, Short.valueOf(A5384EstCatTip), Byte.valueOf(A5389EstCatMes)});
                              while ( (pr_default.getStatus(25) != 101) )
                              {
                                 A396EmprCod = P01WK28_A396EmprCod[0] ;
                                 A252CliCod = P01WK28_A252CliCod[0] ;
                                 n252CliCod = P01WK28_n252CliCod[0] ;
                                 A65ArtCod = P01WK28_A65ArtCod[0] ;
                                 A5382EstCatAny = P01WK28_A5382EstCatAny[0] ;
                                 A5383EstCatSer = P01WK28_A5383EstCatSer[0] ;
                                 A5384EstCatTip = P01WK28_A5384EstCatTip[0] ;
                                 A5389EstCatMes = P01WK28_A5389EstCatMes[0] ;
                                 A5391EstCatImp1 = P01WK28_A5391EstCatImp1[0] ;
                                 n5391EstCatImp1 = P01WK28_n5391EstCatImp1[0] ;
                                 A5390EstCatImp0 = P01WK28_A5390EstCatImp0[0] ;
                                 n5390EstCatImp0 = P01WK28_n5390EstCatImp0[0] ;
                                 A5391EstCatImp1 = A5391EstCatImp1.add(AV34ArtImp1) ;
                                 n5391EstCatImp1 = false ;
                                 if ( AV86No_b == 0 )
                                 {
                                    A5390EstCatImp0 = A5390EstCatImp0.add(AV35ArtImp0) ;
                                    n5390EstCatImp0 = false ;
                                 }
                                 /* Using cursor P01WK29 */
                                 pr_default.execute(26, new Object[] {Boolean.valueOf(n5391EstCatImp1), A5391EstCatImp1, Boolean.valueOf(n5390EstCatImp0), A5390EstCatImp0, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A5382EstCatAny), A5383EstCatSer, Short.valueOf(A5384EstCatTip), Byte.valueOf(A5389EstCatMes)});
                                 Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESTCA1");
                                 /* Exiting from a For First loop. */
                                 if (true) break;
                              }
                              pr_default.close(25);
                           }
                           else
                           {
                              Gx_err = (short)(0) ;
                              Gx_emsg = "" ;
                           }
                           A252CliCod = W252CliCod ;
                           n252CliCod = false ;
                           /* End Insert */
                        }
                        if ( ( AV40FlagEst == 1 ) && ( A1153FacTipFac == 0 ) )
                        {
                           /*
                              INSERT RECORD ON TABLE TXPCESTDI

                           */
                           W252CliCod = A252CliCod ;
                           n252CliCod = false ;
                           A252CliCod = AV85CliFac ;
                           n252CliCod = false ;
                           A425EstAny = AV18Any ;
                           A3913DibSerFac = AV17FacSerNum ;
                           AV57BarCod = A1294FacBarCod ;
                           AV58BarCodReo = A1295FacBarReo ;
                           AV59BarCodPar = A1296FacBarPar ;
                           AV23EmprCod = A396EmprCod ;
                           /* Execute user subroutine: 'DIBUJO' */
                           S131 ();
                           if ( returnInSub )
                           {
                              pr_default.close(7);
                              pr_default.close(7);
                              pr_default.close(5);
                              pr_default.close(4);
                              pr_default.close(3);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           A1013DibCli = AV60BarDibCli ;
                           A1014DibInt = AV61BarDibInt ;
                           /* Using cursor P01WK30 */
                           pr_default.execute(27, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTDI");
                           if ( (pr_default.getStatus(27) == 1) )
                           {
                              Gx_err = (short)(1) ;
                              Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           }
                           else
                           {
                              Gx_err = (short)(0) ;
                              Gx_emsg = "" ;
                           }
                           A252CliCod = W252CliCod ;
                           n252CliCod = false ;
                           /* End Insert */
                           /*
                              INSERT RECORD ON TABLE TXPLESTDI

                           */
                           W252CliCod = A252CliCod ;
                           n252CliCod = false ;
                           A252CliCod = AV85CliFac ;
                           n252CliCod = false ;
                           A425EstAny = AV18Any ;
                           A426EstMes = AV19Mes ;
                           A3913DibSerFac = AV17FacSerNum ;
                           A1013DibCli = AV60BarDibCli ;
                           A1014DibInt = AV61BarDibInt ;
                           A1138MtrFac1 = AV30FacMt1 ;
                           n1138MtrFac1 = false ;
                           if ( AV86No_b == 0 )
                           {
                              A1088ImpFac = AV31ImpCli0 ;
                              n1088ImpFac = false ;
                              A1087MtrFac = AV33FacMt0 ;
                              n1087MtrFac = false ;
                           }
                           A1134ImpFac1 = AV28ImpCli1 ;
                           n1134ImpFac1 = false ;
                           /* Using cursor P01WK31 */
                           pr_default.execute(28, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes), Boolean.valueOf(n1087MtrFac), A1087MtrFac, Boolean.valueOf(n1138MtrFac1), A1138MtrFac1, Boolean.valueOf(n1088ImpFac), A1088ImpFac, Boolean.valueOf(n1134ImpFac1), A1134ImpFac1});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
                           if ( (pr_default.getStatus(28) == 1) )
                           {
                              Gx_err = (short)(1) ;
                              Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                              /* Using cursor P01WK32 */
                              pr_default.execute(29, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
                              while ( (pr_default.getStatus(29) != 101) )
                              {
                                 A396EmprCod = P01WK32_A396EmprCod[0] ;
                                 A1013DibCli = P01WK32_A1013DibCli[0] ;
                                 A252CliCod = P01WK32_A252CliCod[0] ;
                                 n252CliCod = P01WK32_n252CliCod[0] ;
                                 A1014DibInt = P01WK32_A1014DibInt[0] ;
                                 A425EstAny = P01WK32_A425EstAny[0] ;
                                 A3913DibSerFac = P01WK32_A3913DibSerFac[0] ;
                                 A426EstMes = P01WK32_A426EstMes[0] ;
                                 A1088ImpFac = P01WK32_A1088ImpFac[0] ;
                                 n1088ImpFac = P01WK32_n1088ImpFac[0] ;
                                 A1087MtrFac = P01WK32_A1087MtrFac[0] ;
                                 n1087MtrFac = P01WK32_n1087MtrFac[0] ;
                                 A1134ImpFac1 = P01WK32_A1134ImpFac1[0] ;
                                 n1134ImpFac1 = P01WK32_n1134ImpFac1[0] ;
                                 A1138MtrFac1 = P01WK32_A1138MtrFac1[0] ;
                                 n1138MtrFac1 = P01WK32_n1138MtrFac1[0] ;
                                 if ( AV86No_b == 0 )
                                 {
                                    A1088ImpFac = A1088ImpFac.add(AV31ImpCli0) ;
                                    n1088ImpFac = false ;
                                    A1087MtrFac = A1087MtrFac.add(AV33FacMt0) ;
                                    n1087MtrFac = false ;
                                 }
                                 A1134ImpFac1 = A1134ImpFac1.add(AV28ImpCli1) ;
                                 n1134ImpFac1 = false ;
                                 A1138MtrFac1 = A1138MtrFac1.add(AV30FacMt1) ;
                                 n1138MtrFac1 = false ;
                                 /* Using cursor P01WK33 */
                                 pr_default.execute(30, new Object[] {Boolean.valueOf(n1088ImpFac), A1088ImpFac, Boolean.valueOf(n1087MtrFac), A1087MtrFac, Boolean.valueOf(n1134ImpFac1), A1134ImpFac1, Boolean.valueOf(n1138MtrFac1), A1138MtrFac1, A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
                                 Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
                                 /* Exiting from a For First loop. */
                                 if (true) break;
                              }
                              pr_default.close(29);
                           }
                           else
                           {
                              Gx_err = (short)(0) ;
                              Gx_emsg = "" ;
                           }
                           A252CliCod = W252CliCod ;
                           n252CliCod = false ;
                           /* End Insert */
                        }
                        if ( AV53FlagDia == 1 )
                        {
                           if ( ( GXutil.strcmp(AV73Hdr, AV74LastHdr) != 0 ) && ( AV75Emp_proces == 1 ) )
                           {
                              /* Execute user subroutine: 'ACT_FACPRO' */
                              S151 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(7);
                                 pr_default.close(7);
                                 pr_default.close(5);
                                 pr_default.close(4);
                                 pr_default.close(3);
                                 returnInSub = true;
                                 cleanup();
                                 if (true) return;
                              }
                              AV79Tot_imp_k = DecimalUtil.doubleToDec(0) ;
                              AV80Tot_imp_m = DecimalUtil.doubleToDec(0) ;
                              AV77Mts_fra = DecimalUtil.doubleToDec(0) ;
                              AV76Kgs_fra = DecimalUtil.doubleToDec(0) ;
                           }
                           if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                           {
                              if ( A448FacPreKgs.doubleValue() > 0 )
                              {
                                 AV76Kgs_fra = A444FacKgs ;
                              }
                              if ( A449FacPreMts.doubleValue() > 0 )
                              {
                                 AV77Mts_fra = A447FacMts ;
                              }
                           }
                           AV79Tot_imp_k = AV79Tot_imp_k.add((GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2))) ;
                           AV80Tot_imp_m = AV80Tot_imp_m.add((GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2))) ;
                        }
                        if ( (GXutil.strcmp("", A3397FacFasCod)==0) && ( A448FacPreKgs.doubleValue() > 0 ) && ( A3880FacTipColC > 0 ) )
                        {
                           AV76Kgs_fra = A444FacKgs ;
                           /* Execute user subroutine: 'XABCTC' */
                           S171 ();
                           if ( returnInSub )
                           {
                              pr_default.close(7);
                              pr_default.close(7);
                              pr_default.close(5);
                              pr_default.close(4);
                              pr_default.close(3);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                        }
                        AV74LastHdr = GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                        AV75Emp_proces = (byte)(1) ;
                     }
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  if ( ( AV41FlagBru == 1 ) || ( AV55FlagTot == 1 ) )
                  {
                     AV23EmprCod = A396EmprCod ;
                     AV44EstSerFac = A2739FacSerNum ;
                     /* Execute user subroutine: 'IMPCLI' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(4);
                        pr_default.close(3);
                        pr_default.close(2);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  A435FacEst = (byte)(2) ;
                  if ( AV53FlagDia == 1 )
                  {
                     /* Execute user subroutine: 'ACT_FACPRO' */
                     S151 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(4);
                        pr_default.close(3);
                        pr_default.close(2);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  AV89CantidadRegistrosProcesados = (short)(AV89CantidadRegistrosProcesados+1) ;
                  AV90Porcentaje = (short)((AV89CantidadRegistrosProcesados/ (double) (AV88CantidadRegistrosAProcesar))*100) ;
                  AV87ProgressIndicator.setgxTv_SdtProgress_Value( AV90Porcentaje );
                  AV87ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV89CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV88CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", ""));
                  AV71message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV71message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( A430FacCod, 8, 0)) );
                  AV71message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Actualizado Factura ", "")+GXutil.trim( GXutil.str( A430FacCod, 8, 0)) );
                  AV91messages.add(AV71message, 0);
                  /* Using cursor P01WK34 */
                  pr_default.execute(31, new Object[] {Byte.valueOf(A435FacEst), A396EmprCod, Integer.valueOf(A430FacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      AV87ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV87ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV87ProgressIndicator.hide();
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P01WK35 */
      pr_default.execute(32, new Object[] {AV23EmprCod, Integer.valueOf(AV66FacBarCod), Byte.valueOf(AV68FacBarReo), AV67FacBarPar});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A130BarCodPar = P01WK35_A130BarCodPar[0] ;
         A132BarCodReo = P01WK35_A132BarCodReo[0] ;
         A129BarCod = P01WK35_A129BarCod[0] ;
         A217BarTipArt = P01WK35_A217BarTipArt[0] ;
         n217BarTipArt = P01WK35_n217BarTipArt[0] ;
         AV20TipArtCod = A217BarTipArt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(32);
      AV83TipArtDsc = "" ;
      /* Using cursor P01WK36 */
      pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(AV20TipArtCod)});
      while ( (pr_default.getStatus(33) != 101) )
      {
         A829TipArtCod = P01WK36_A829TipArtCod[0] ;
         A830TipArtDsc = P01WK36_A830TipArtDsc[0] ;
         n830TipArtDsc = P01WK36_n830TipArtDsc[0] ;
         AV83TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(33);
   }

   public void S121( )
   {
      /* 'IMPCLI' Routine */
      returnInSub = false ;
      /* Using cursor P01WK37 */
      pr_default.execute(34, new Object[] {AV23EmprCod, Integer.valueOf(AV85CliFac), Short.valueOf(AV18Any), AV44EstSerFac, Byte.valueOf(AV19Mes)});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A426EstMes = P01WK37_A426EstMes[0] ;
         A425EstAny = P01WK37_A425EstAny[0] ;
         A2755EstSerFac = P01WK37_A2755EstSerFac[0] ;
         A252CliCod = P01WK37_A252CliCod[0] ;
         n252CliCod = P01WK37_n252CliCod[0] ;
         A1440ImpCli1 = P01WK37_A1440ImpCli1[0] ;
         n1440ImpCli1 = P01WK37_n1440ImpCli1[0] ;
         A1439ImpCli0 = P01WK37_A1439ImpCli0[0] ;
         n1439ImpCli0 = P01WK37_n1439ImpCli0[0] ;
         if ( GXutil.strcmp(AV43FacPri, "1") == 0 )
         {
            if ( AV41FlagBru == 1 )
            {
               A1440ImpCli1 = A1440ImpCli1.add(AV42BaseImp) ;
               n1440ImpCli1 = false ;
            }
            else
            {
               A1440ImpCli1 = A1440ImpCli1.add(AV56FacTot) ;
               n1440ImpCli1 = false ;
            }
         }
         else
         {
            if ( AV41FlagBru == 1 )
            {
               A1439ImpCli0 = A1439ImpCli0.add(AV42BaseImp) ;
               n1439ImpCli0 = false ;
            }
            else
            {
               A1439ImpCli0 = A1439ImpCli0.add(AV56FacTot) ;
               n1439ImpCli0 = false ;
            }
         }
         /* Using cursor P01WK38 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n1440ImpCli1), A1440ImpCli1, Boolean.valueOf(n1439ImpCli0), A1439ImpCli0, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCLI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(34);
   }

   public void S131( )
   {
      /* 'DIBUJO' Routine */
      returnInSub = false ;
      /* Using cursor P01WK39 */
      pr_default.execute(36, new Object[] {AV23EmprCod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar});
      while ( (pr_default.getStatus(36) != 101) )
      {
         A130BarCodPar = P01WK39_A130BarCodPar[0] ;
         A132BarCodReo = P01WK39_A132BarCodReo[0] ;
         A129BarCod = P01WK39_A129BarCod[0] ;
         A1798BarDibCli = P01WK39_A1798BarDibCli[0] ;
         A1799BarDibInt = P01WK39_A1799BarDibInt[0] ;
         AV60BarDibCli = A1798BarDibCli ;
         AV61BarDibInt = A1799BarDibInt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(36);
   }

   public void S141( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P01WK40 */
      pr_default.execute(37, new Object[] {AV23EmprCod, Integer.valueOf(AV66FacBarCod), Byte.valueOf(AV68FacBarReo), AV67FacBarPar});
      while ( (pr_default.getStatus(37) != 101) )
      {
         A150BarFacTin = P01WK40_A150BarFacTin[0] ;
         A130BarCodPar = P01WK40_A130BarCodPar[0] ;
         A132BarCodReo = P01WK40_A132BarCodReo[0] ;
         A129BarCod = P01WK40_A129BarCod[0] ;
         A457FasCod = P01WK40_A457FasCod[0] ;
         A758ProCod = P01WK40_A758ProCod[0] ;
         A194BarOrdLin = P01WK40_A194BarOrdLin[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV65FacFasCod = A457FasCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(37);
      }
      pr_default.close(37);
   }

   public void S151( )
   {
      /* 'ACT_FACPRO' Routine */
      returnInSub = false ;
      AV57BarCod = (int)(GXutil.lval( GXutil.substring( AV74LastHdr, 1, 8))) ;
      AV58BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV74LastHdr, 9, 1))) ;
      AV59BarCodPar = GXutil.substring( AV74LastHdr, 10, 1) ;
      /* Using cursor P01WK41 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar});
      while ( (pr_default.getStatus(38) != 101) )
      {
         A130BarCodPar = P01WK41_A130BarCodPar[0] ;
         A132BarCodReo = P01WK41_A132BarCodReo[0] ;
         A129BarCod = P01WK41_A129BarCod[0] ;
         A135BarColNom = P01WK41_A135BarColNom[0] ;
         A136BarColNum = P01WK41_A136BarColNum[0] ;
         A218BarTipCol = P01WK41_A218BarTipCol[0] ;
         A212BarSer = P01WK41_A212BarSer[0] ;
         A217BarTipArt = P01WK41_A217BarTipArt[0] ;
         n217BarTipArt = P01WK41_n217BarTipArt[0] ;
         A252CliCod = P01WK41_A252CliCod[0] ;
         n252CliCod = P01WK41_n252CliCod[0] ;
         AV51ForColNom = A135BarColNom ;
         AV52ForColNum = A136BarColNum ;
         AV46TipColCod = A218BarTipCol ;
         AV22ArtCod = A212BarSer ;
         AV20TipArtCod = A217BarTipArt ;
         AV21CliCod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(38);
      /* Execute user subroutine: 'COLOR' */
      S161 ();
      if (returnInSub) return;
      /*
         INSERT RECORD ON TABLE TXPFACPRO

      */
      A252CliCod = AV85CliFac ;
      n252CliCod = false ;
      A3661FacProAny = AV18Any ;
      A3662FacProSer = AV17FacSerNum ;
      A3663FacProInt = AV45IntCod ;
      A3664FacProTip = AV46TipColCod ;
      A3665FacProTar = AV20TipArtCod ;
      /* Using cursor P01WK42 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACPRO");
      if ( (pr_default.getStatus(39) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPLFACPR

      */
      A252CliCod = AV85CliFac ;
      n252CliCod = false ;
      A3661FacProAny = AV18Any ;
      A3662FacProSer = AV17FacSerNum ;
      A3663FacProInt = AV45IntCod ;
      A3664FacProTip = AV46TipColCod ;
      A3665FacProTar = AV20TipArtCod ;
      A3666FacProMes = AV19Mes ;
      A3667FacProKgs = AV76Kgs_fra ;
      n3667FacProKgs = false ;
      A3668FacProVal = AV79Tot_imp_k ;
      n3668FacProVal = false ;
      A3677FacProMts = AV77Mts_fra ;
      n3677FacProMts = false ;
      A3678FacProValM = AV80Tot_imp_m ;
      n3678FacProValM = false ;
      /* Using cursor P01WK43 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes), Boolean.valueOf(n3667FacProKgs), A3667FacProKgs, Boolean.valueOf(n3668FacProVal), A3668FacProVal, Boolean.valueOf(n3677FacProMts), A3677FacProMts, Boolean.valueOf(n3678FacProValM), A3678FacProValM});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFACPR");
      if ( (pr_default.getStatus(40) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n3678FacProValM = false ;
         n3677FacProMts = false ;
         n3668FacProVal = false ;
         n3667FacProKgs = false ;
         /* Optimized UPDATE. */
         /* Using cursor P01WK44 */
         pr_default.execute(41, new Object[] {AV80Tot_imp_m, AV77Mts_fra, AV79Tot_imp_k, AV76Kgs_fra, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFACPR");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S161( )
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      AV45IntCod = (byte)(0) ;
      /* Using cursor P01WK45 */
      pr_default.execute(42, new Object[] {AV23EmprCod, Integer.valueOf(AV21CliCod), AV22ArtCod, AV51ForColNom, Integer.valueOf(AV52ForColNum), Byte.valueOf(AV46TipColCod)});
      while ( (pr_default.getStatus(42) != 101) )
      {
         A831TipColCod = P01WK45_A831TipColCod[0] ;
         A483ForColNum = P01WK45_A483ForColNum[0] ;
         A482ForColNom = P01WK45_A482ForColNom[0] ;
         A494ForSer = P01WK45_A494ForSer[0] ;
         A252CliCod = P01WK45_A252CliCod[0] ;
         n252CliCod = P01WK45_n252CliCod[0] ;
         A583IntCod = P01WK45_A583IntCod[0] ;
         AV45IntCod = A583IntCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(42);
   }

   public void S171( )
   {
      /* 'XABCTC' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPXABCTC

      */
      A6019XabcAny = AV18Any ;
      A6020XabcTC = AV46TipColCod ;
      A6021XabcAKgs = DecimalUtil.doubleToDec(0) ;
      n6021XabcAKgs = false ;
      /* Using cursor P01WK46 */
      pr_default.execute(43, new Object[] {A396EmprCod, Short.valueOf(A6019XabcAny), Byte.valueOf(A6020XabcTC), Boolean.valueOf(n6021XabcAKgs), A6021XabcAKgs});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXABCTC");
      if ( (pr_default.getStatus(43) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPXABCT1

      */
      A6019XabcAny = AV18Any ;
      A6020XabcTC = AV46TipColCod ;
      A6023XabcMes = AV19Mes ;
      A6026XabcKgF = AV76Kgs_fra ;
      n6026XabcKgF = false ;
      /* Using cursor P01WK47 */
      pr_default.execute(44, new Object[] {A396EmprCod, Short.valueOf(A6019XabcAny), Byte.valueOf(A6020XabcTC), Byte.valueOf(A6023XabcMes), Boolean.valueOf(n6026XabcKgF), A6026XabcKgF});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXABCT1");
      if ( (pr_default.getStatus(44) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n6026XabcKgF = false ;
         /* Optimized UPDATE. */
         /* Using cursor P01WK48 */
         pr_default.execute(45, new Object[] {AV76Kgs_fra, A396EmprCod, Short.valueOf(A6019XabcAny), Byte.valueOf(A6020XabcTC), Byte.valueOf(A6023XabcMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXABCT1");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   protected void cleanup( )
   {
      this.aP3[0] = pactfac.this.AV91messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactfac");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV91messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P01WK2_A396EmprCod = new String[] {""} ;
      P01WK2_A963Ser1 = new String[] {""} ;
      P01WK2_n963Ser1 = new boolean[] {false} ;
      P01WK2_A2387Ser2 = new String[] {""} ;
      P01WK2_n2387Ser2 = new boolean[] {false} ;
      P01WK2_A2389Ser3 = new String[] {""} ;
      P01WK2_n2389Ser3 = new boolean[] {false} ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      AV17FacSerNum = "" ;
      GXv_int1 = new byte[1] ;
      AV87ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      P01WK3_AV88CantidadRegistrosAProcesar = new short[1] ;
      P01WK4_A396EmprCod = new String[] {""} ;
      P01WK4_A430FacCod = new int[1] ;
      P01WK4_A450FacPri = new String[] {""} ;
      P01WK4_A1153FacTipFac = new byte[1] ;
      P01WK4_A2739FacSerNum = new String[] {""} ;
      P01WK4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01WK4_A435FacEst = new byte[1] ;
      P01WK4_A252CliCod = new int[1] ;
      P01WK4_n252CliCod = new boolean[] {false} ;
      P01WK4_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_n8346FacRecI = new boolean[] {false} ;
      P01WK4_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A443FacIVAPor = new byte[1] ;
      P01WK4_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK4_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A450FacPri = "" ;
      A2739FacSerNum = "" ;
      A436FacFch = GXutil.nullDate() ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P01WK5_A7209Colombia = new byte[1] ;
      P01WK5_n7209Colombia = new boolean[] {false} ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      P01WK6_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      P01WK8_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV42BaseImp = DecimalUtil.ZERO ;
      AV56FacTot = DecimalUtil.ZERO ;
      AV43FacPri = "" ;
      A2755EstSerFac = "" ;
      Gx_emsg = "" ;
      AV73Hdr = "" ;
      AV74LastHdr = "" ;
      AV79Tot_imp_k = DecimalUtil.ZERO ;
      AV80Tot_imp_m = DecimalUtil.ZERO ;
      P01WK10_A396EmprCod = new String[] {""} ;
      P01WK10_A430FacCod = new int[1] ;
      P01WK10_A1294FacBarCod = new int[1] ;
      P01WK10_A1295FacBarReo = new byte[1] ;
      P01WK10_A1296FacBarPar = new String[] {""} ;
      P01WK10_A454FacSer = new String[] {""} ;
      P01WK10_A2739FacSerNum = new String[] {""} ;
      P01WK10_A3880FacTipColC = new byte[1] ;
      P01WK10_A3397FacFasCod = new String[] {""} ;
      P01WK10_A5189FacTipArt = new short[1] ;
      P01WK10_A427FacAlbCod = new long[1] ;
      P01WK10_A12197FacUnds = new int[1] ;
      P01WK10_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK10_A446FacLin = new int[1] ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A3397FacFasCod = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      AV31ImpCli0 = DecimalUtil.ZERO ;
      AV28ImpCli1 = DecimalUtil.ZERO ;
      AV32FacKg0 = DecimalUtil.ZERO ;
      AV29FacKg1 = DecimalUtil.ZERO ;
      AV33FacMt0 = DecimalUtil.ZERO ;
      AV30FacMt1 = DecimalUtil.ZERO ;
      AV67FacBarPar = "" ;
      A1440ImpCli1 = DecimalUtil.ZERO ;
      A1368FacKg1 = DecimalUtil.ZERO ;
      A1366FacMt1 = DecimalUtil.ZERO ;
      A1439ImpCli0 = DecimalUtil.ZERO ;
      A1367FacKg0 = DecimalUtil.ZERO ;
      A1365FacMt0 = DecimalUtil.ZERO ;
      P01WK12_A396EmprCod = new String[] {""} ;
      P01WK12_A252CliCod = new int[1] ;
      P01WK12_n252CliCod = new boolean[] {false} ;
      P01WK12_A425EstAny = new short[1] ;
      P01WK12_A2755EstSerFac = new String[] {""} ;
      P01WK12_A426EstMes = new byte[1] ;
      P01WK12_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK12_n1440ImpCli1 = new boolean[] {false} ;
      P01WK12_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK12_n1439ImpCli0 = new boolean[] {false} ;
      P01WK12_A1368FacKg1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK12_n1368FacKg1 = new boolean[] {false} ;
      P01WK12_A1366FacMt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK12_n1366FacMt1 = new boolean[] {false} ;
      P01WK12_A1367FacKg0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK12_n1367FacKg0 = new boolean[] {false} ;
      P01WK12_A1365FacMt0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK12_n1365FacMt0 = new boolean[] {false} ;
      AV34ArtImp1 = DecimalUtil.ZERO ;
      AV39ArtFacKg1 = DecimalUtil.ZERO ;
      AV37ArtFacMt1 = DecimalUtil.ZERO ;
      AV35ArtImp0 = DecimalUtil.ZERO ;
      AV36ArtFacKg0 = DecimalUtil.ZERO ;
      AV38ArtFacMt0 = DecimalUtil.ZERO ;
      AV22ArtCod = "" ;
      AV23EmprCod = "" ;
      A65ArtCod = "" ;
      A2756ArtEstSer = "" ;
      A1437ArtImp1 = DecimalUtil.ZERO ;
      A1436ArtImp0 = DecimalUtil.ZERO ;
      A1374ArtFacMt1 = DecimalUtil.ZERO ;
      A1373ArtFacMt0 = DecimalUtil.ZERO ;
      A1376ArtFacKg1 = DecimalUtil.ZERO ;
      A1375ArtFacKg0 = DecimalUtil.ZERO ;
      P01WK16_A396EmprCod = new String[] {""} ;
      P01WK16_A252CliCod = new int[1] ;
      P01WK16_n252CliCod = new boolean[] {false} ;
      P01WK16_A65ArtCod = new String[] {""} ;
      P01WK16_A71ArtEstAny = new short[1] ;
      P01WK16_A2756ArtEstSer = new String[] {""} ;
      P01WK16_A72ArtEstMes = new byte[1] ;
      P01WK16_A1437ArtImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK16_n1437ArtImp1 = new boolean[] {false} ;
      P01WK16_A1436ArtImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK16_n1436ArtImp0 = new boolean[] {false} ;
      P01WK16_A1376ArtFacKg1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK16_n1376ArtFacKg1 = new boolean[] {false} ;
      P01WK16_A1374ArtFacMt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK16_n1374ArtFacMt1 = new boolean[] {false} ;
      P01WK16_A1375ArtFacKg0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK16_n1375ArtFacKg0 = new boolean[] {false} ;
      P01WK16_A1373ArtFacMt0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK16_n1373ArtFacMt0 = new boolean[] {false} ;
      P01WK16_A5342ArtEstTart = new short[1] ;
      P01WK16_n5342ArtEstTart = new boolean[] {false} ;
      AV65FacFasCod = "" ;
      A457FasCod = "" ;
      A5311ClFsSer = "" ;
      A5317ClFsFac1 = DecimalUtil.ZERO ;
      A5319ClFsKg1 = DecimalUtil.ZERO ;
      A5321ClFsMt1 = DecimalUtil.ZERO ;
      A5320ClFsMt0 = DecimalUtil.ZERO ;
      A5318ClFsKg0 = DecimalUtil.ZERO ;
      A5316ClFsFac0 = DecimalUtil.ZERO ;
      P01WK20_A396EmprCod = new String[] {""} ;
      P01WK20_A252CliCod = new int[1] ;
      P01WK20_n252CliCod = new boolean[] {false} ;
      P01WK20_A457FasCod = new String[] {""} ;
      P01WK20_A5310ClFsAny = new short[1] ;
      P01WK20_A5311ClFsSer = new String[] {""} ;
      P01WK20_A5315ClFsMes = new byte[1] ;
      P01WK20_A5317ClFsFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK20_n5317ClFsFac1 = new boolean[] {false} ;
      P01WK20_A5319ClFsKg1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK20_n5319ClFsKg1 = new boolean[] {false} ;
      P01WK20_A5321ClFsMt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK20_n5321ClFsMt1 = new boolean[] {false} ;
      P01WK20_A5320ClFsMt0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK20_n5320ClFsMt0 = new boolean[] {false} ;
      P01WK20_A5316ClFsFac0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK20_n5316ClFsFac0 = new boolean[] {false} ;
      P01WK20_A5318ClFsKg0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK20_n5318ClFsKg0 = new boolean[] {false} ;
      A5174EstTpaSF = "" ;
      A5184TpaFMt1 = DecimalUtil.ZERO ;
      A5186TpaFKg1 = DecimalUtil.ZERO ;
      A5187ImpTpa0 = DecimalUtil.ZERO ;
      A5183TpaFMt0 = DecimalUtil.ZERO ;
      A5185TpaFKg0 = DecimalUtil.ZERO ;
      A5188ImpTpa1 = DecimalUtil.ZERO ;
      P01WK24_A396EmprCod = new String[] {""} ;
      P01WK24_A829TipArtCod = new short[1] ;
      P01WK24_A5173EstTpaAny = new short[1] ;
      P01WK24_A5174EstTpaSF = new String[] {""} ;
      P01WK24_A5182EstTpaMes = new byte[1] ;
      P01WK24_A5187ImpTpa0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK24_n5187ImpTpa0 = new boolean[] {false} ;
      P01WK24_A5188ImpTpa1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK24_n5188ImpTpa1 = new boolean[] {false} ;
      P01WK24_A5185TpaFKg0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK24_n5185TpaFKg0 = new boolean[] {false} ;
      P01WK24_A5183TpaFMt0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK24_n5183TpaFMt0 = new boolean[] {false} ;
      P01WK24_A5184TpaFMt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK24_n5184TpaFMt1 = new boolean[] {false} ;
      P01WK24_A5186TpaFKg1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK24_n5186TpaFKg1 = new boolean[] {false} ;
      A5383EstCatSer = "" ;
      A5385EstCatDsc = "" ;
      AV83TipArtDsc = "" ;
      A5391EstCatImp1 = DecimalUtil.ZERO ;
      A5390EstCatImp0 = DecimalUtil.ZERO ;
      P01WK28_A396EmprCod = new String[] {""} ;
      P01WK28_A252CliCod = new int[1] ;
      P01WK28_n252CliCod = new boolean[] {false} ;
      P01WK28_A65ArtCod = new String[] {""} ;
      P01WK28_A5382EstCatAny = new short[1] ;
      P01WK28_A5383EstCatSer = new String[] {""} ;
      P01WK28_A5384EstCatTip = new short[1] ;
      P01WK28_A5389EstCatMes = new byte[1] ;
      P01WK28_A5391EstCatImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK28_n5391EstCatImp1 = new boolean[] {false} ;
      P01WK28_A5390EstCatImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK28_n5390EstCatImp0 = new boolean[] {false} ;
      A3913DibSerFac = "" ;
      AV59BarCodPar = "" ;
      A1013DibCli = "" ;
      AV60BarDibCli = "" ;
      A1138MtrFac1 = DecimalUtil.ZERO ;
      A1088ImpFac = DecimalUtil.ZERO ;
      A1087MtrFac = DecimalUtil.ZERO ;
      A1134ImpFac1 = DecimalUtil.ZERO ;
      P01WK32_A396EmprCod = new String[] {""} ;
      P01WK32_A1013DibCli = new String[] {""} ;
      P01WK32_A252CliCod = new int[1] ;
      P01WK32_n252CliCod = new boolean[] {false} ;
      P01WK32_A1014DibInt = new int[1] ;
      P01WK32_A425EstAny = new short[1] ;
      P01WK32_A3913DibSerFac = new String[] {""} ;
      P01WK32_A426EstMes = new byte[1] ;
      P01WK32_A1088ImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK32_n1088ImpFac = new boolean[] {false} ;
      P01WK32_A1087MtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK32_n1087MtrFac = new boolean[] {false} ;
      P01WK32_A1134ImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK32_n1134ImpFac1 = new boolean[] {false} ;
      P01WK32_A1138MtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK32_n1138MtrFac1 = new boolean[] {false} ;
      AV77Mts_fra = DecimalUtil.ZERO ;
      AV76Kgs_fra = DecimalUtil.ZERO ;
      AV44EstSerFac = "" ;
      AV71message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P01WK35_A130BarCodPar = new String[] {""} ;
      P01WK35_A132BarCodReo = new byte[1] ;
      P01WK35_A129BarCod = new int[1] ;
      P01WK35_A396EmprCod = new String[] {""} ;
      P01WK35_A217BarTipArt = new short[1] ;
      P01WK35_n217BarTipArt = new boolean[] {false} ;
      A130BarCodPar = "" ;
      P01WK36_A396EmprCod = new String[] {""} ;
      P01WK36_A829TipArtCod = new short[1] ;
      P01WK36_A830TipArtDsc = new String[] {""} ;
      P01WK36_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P01WK37_A426EstMes = new byte[1] ;
      P01WK37_A425EstAny = new short[1] ;
      P01WK37_A2755EstSerFac = new String[] {""} ;
      P01WK37_A252CliCod = new int[1] ;
      P01WK37_n252CliCod = new boolean[] {false} ;
      P01WK37_A396EmprCod = new String[] {""} ;
      P01WK37_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK37_n1440ImpCli1 = new boolean[] {false} ;
      P01WK37_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WK37_n1439ImpCli0 = new boolean[] {false} ;
      P01WK39_A130BarCodPar = new String[] {""} ;
      P01WK39_A132BarCodReo = new byte[1] ;
      P01WK39_A129BarCod = new int[1] ;
      P01WK39_A396EmprCod = new String[] {""} ;
      P01WK39_A1798BarDibCli = new String[] {""} ;
      P01WK39_A1799BarDibInt = new int[1] ;
      A1798BarDibCli = "" ;
      P01WK40_A150BarFacTin = new String[] {""} ;
      P01WK40_A130BarCodPar = new String[] {""} ;
      P01WK40_A132BarCodReo = new byte[1] ;
      P01WK40_A129BarCod = new int[1] ;
      P01WK40_A396EmprCod = new String[] {""} ;
      P01WK40_A457FasCod = new String[] {""} ;
      P01WK40_A758ProCod = new String[] {""} ;
      P01WK40_A194BarOrdLin = new short[1] ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      P01WK41_A396EmprCod = new String[] {""} ;
      P01WK41_A130BarCodPar = new String[] {""} ;
      P01WK41_A132BarCodReo = new byte[1] ;
      P01WK41_A129BarCod = new int[1] ;
      P01WK41_A135BarColNom = new String[] {""} ;
      P01WK41_A136BarColNum = new int[1] ;
      P01WK41_A218BarTipCol = new byte[1] ;
      P01WK41_A212BarSer = new String[] {""} ;
      P01WK41_A217BarTipArt = new short[1] ;
      P01WK41_n217BarTipArt = new boolean[] {false} ;
      P01WK41_A252CliCod = new int[1] ;
      P01WK41_n252CliCod = new boolean[] {false} ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      AV51ForColNom = "" ;
      A3662FacProSer = "" ;
      A3667FacProKgs = DecimalUtil.ZERO ;
      A3668FacProVal = DecimalUtil.ZERO ;
      A3677FacProMts = DecimalUtil.ZERO ;
      A3678FacProValM = DecimalUtil.ZERO ;
      P01WK45_A831TipColCod = new byte[1] ;
      P01WK45_A483ForColNum = new int[1] ;
      P01WK45_A482ForColNom = new String[] {""} ;
      P01WK45_A494ForSer = new String[] {""} ;
      P01WK45_A252CliCod = new int[1] ;
      P01WK45_n252CliCod = new boolean[] {false} ;
      P01WK45_A396EmprCod = new String[] {""} ;
      P01WK45_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A6021XabcAKgs = DecimalUtil.ZERO ;
      A6026XabcKgF = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactfac__default(),
         new Object[] {
             new Object[] {
            P01WK2_A396EmprCod, P01WK2_A963Ser1, P01WK2_n963Ser1, P01WK2_A2387Ser2, P01WK2_n2387Ser2, P01WK2_A2389Ser3, P01WK2_n2389Ser3
            }
            , new Object[] {
            P01WK3_AV88CantidadRegistrosAProcesar
            }
            , new Object[] {
            P01WK4_A396EmprCod, P01WK4_A430FacCod, P01WK4_A450FacPri, P01WK4_A1153FacTipFac, P01WK4_A2739FacSerNum, P01WK4_A436FacFch, P01WK4_A435FacEst, P01WK4_A252CliCod, P01WK4_A11513FacRecIca, P01WK4_A8346FacRecI,
            P01WK4_n8346FacRecI, P01WK4_A7212FacRect, P01WK4_A453FacRECPor, P01WK4_A443FacIVAPor, P01WK4_A14224FacCostFac, P01WK4_A14223FacCostKgs, P01WK4_A14222FacCostMts, P01WK4_A434FacDtoPP, P01WK4_A433FacDtoGen, P01WK4_A14219FacEnergia
            }
            , new Object[] {
            P01WK5_A7209Colombia, P01WK5_n7209Colombia
            }
            , new Object[] {
            P01WK6_A279CliNom
            }
            , new Object[] {
            P01WK8_A3918FacImpTot1
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK10_A396EmprCod, P01WK10_A430FacCod, P01WK10_A1294FacBarCod, P01WK10_A1295FacBarReo, P01WK10_A1296FacBarPar, P01WK10_A454FacSer, P01WK10_A2739FacSerNum, P01WK10_A3880FacTipColC, P01WK10_A3397FacFasCod, P01WK10_A5189FacTipArt,
            P01WK10_A427FacAlbCod, P01WK10_A12197FacUnds, P01WK10_A3897FacKgsA, P01WK10_A3898FacPreKgsA, P01WK10_A12198FacPreUnd, P01WK10_A449FacPreMts, P01WK10_A5353FacImpMan, P01WK10_A447FacMts, P01WK10_A444FacKgs, P01WK10_A448FacPreKgs,
            P01WK10_A5355FacImpMin, P01WK10_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK12_A396EmprCod, P01WK12_A252CliCod, P01WK12_A425EstAny, P01WK12_A2755EstSerFac, P01WK12_A426EstMes, P01WK12_A1440ImpCli1, P01WK12_n1440ImpCli1, P01WK12_A1439ImpCli0, P01WK12_n1439ImpCli0, P01WK12_A1368FacKg1,
            P01WK12_n1368FacKg1, P01WK12_A1366FacMt1, P01WK12_n1366FacMt1, P01WK12_A1367FacKg0, P01WK12_n1367FacKg0, P01WK12_A1365FacMt0, P01WK12_n1365FacMt0
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK16_A396EmprCod, P01WK16_A252CliCod, P01WK16_A65ArtCod, P01WK16_A71ArtEstAny, P01WK16_A2756ArtEstSer, P01WK16_A72ArtEstMes, P01WK16_A1437ArtImp1, P01WK16_n1437ArtImp1, P01WK16_A1436ArtImp0, P01WK16_n1436ArtImp0,
            P01WK16_A1376ArtFacKg1, P01WK16_n1376ArtFacKg1, P01WK16_A1374ArtFacMt1, P01WK16_n1374ArtFacMt1, P01WK16_A1375ArtFacKg0, P01WK16_n1375ArtFacKg0, P01WK16_A1373ArtFacMt0, P01WK16_n1373ArtFacMt0, P01WK16_A5342ArtEstTart, P01WK16_n5342ArtEstTart
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK20_A396EmprCod, P01WK20_A252CliCod, P01WK20_A457FasCod, P01WK20_A5310ClFsAny, P01WK20_A5311ClFsSer, P01WK20_A5315ClFsMes, P01WK20_A5317ClFsFac1, P01WK20_n5317ClFsFac1, P01WK20_A5319ClFsKg1, P01WK20_n5319ClFsKg1,
            P01WK20_A5321ClFsMt1, P01WK20_n5321ClFsMt1, P01WK20_A5320ClFsMt0, P01WK20_n5320ClFsMt0, P01WK20_A5316ClFsFac0, P01WK20_n5316ClFsFac0, P01WK20_A5318ClFsKg0, P01WK20_n5318ClFsKg0
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK24_A396EmprCod, P01WK24_A829TipArtCod, P01WK24_A5173EstTpaAny, P01WK24_A5174EstTpaSF, P01WK24_A5182EstTpaMes, P01WK24_A5187ImpTpa0, P01WK24_n5187ImpTpa0, P01WK24_A5188ImpTpa1, P01WK24_n5188ImpTpa1, P01WK24_A5185TpaFKg0,
            P01WK24_n5185TpaFKg0, P01WK24_A5183TpaFMt0, P01WK24_n5183TpaFMt0, P01WK24_A5184TpaFMt1, P01WK24_n5184TpaFMt1, P01WK24_A5186TpaFKg1, P01WK24_n5186TpaFKg1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK28_A396EmprCod, P01WK28_A252CliCod, P01WK28_A65ArtCod, P01WK28_A5382EstCatAny, P01WK28_A5383EstCatSer, P01WK28_A5384EstCatTip, P01WK28_A5389EstCatMes, P01WK28_A5391EstCatImp1, P01WK28_n5391EstCatImp1, P01WK28_A5390EstCatImp0,
            P01WK28_n5390EstCatImp0
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK32_A396EmprCod, P01WK32_A1013DibCli, P01WK32_A252CliCod, P01WK32_A1014DibInt, P01WK32_A425EstAny, P01WK32_A3913DibSerFac, P01WK32_A426EstMes, P01WK32_A1088ImpFac, P01WK32_n1088ImpFac, P01WK32_A1087MtrFac,
            P01WK32_n1087MtrFac, P01WK32_A1134ImpFac1, P01WK32_n1134ImpFac1, P01WK32_A1138MtrFac1, P01WK32_n1138MtrFac1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK35_A130BarCodPar, P01WK35_A132BarCodReo, P01WK35_A129BarCod, P01WK35_A396EmprCod, P01WK35_A217BarTipArt, P01WK35_n217BarTipArt
            }
            , new Object[] {
            P01WK36_A396EmprCod, P01WK36_A829TipArtCod, P01WK36_A830TipArtDsc, P01WK36_n830TipArtDsc
            }
            , new Object[] {
            P01WK37_A426EstMes, P01WK37_A425EstAny, P01WK37_A2755EstSerFac, P01WK37_A252CliCod, P01WK37_A396EmprCod, P01WK37_A1440ImpCli1, P01WK37_n1440ImpCli1, P01WK37_A1439ImpCli0, P01WK37_n1439ImpCli0
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK39_A130BarCodPar, P01WK39_A132BarCodReo, P01WK39_A129BarCod, P01WK39_A396EmprCod, P01WK39_A1798BarDibCli, P01WK39_A1799BarDibInt
            }
            , new Object[] {
            P01WK40_A150BarFacTin, P01WK40_A130BarCodPar, P01WK40_A132BarCodReo, P01WK40_A129BarCod, P01WK40_A396EmprCod, P01WK40_A457FasCod, P01WK40_A758ProCod, P01WK40_A194BarOrdLin
            }
            , new Object[] {
            P01WK41_A396EmprCod, P01WK41_A130BarCodPar, P01WK41_A132BarCodReo, P01WK41_A129BarCod, P01WK41_A135BarColNom, P01WK41_A136BarColNum, P01WK41_A218BarTipCol, P01WK41_A212BarSer, P01WK41_A217BarTipArt, P01WK41_n217BarTipArt,
            P01WK41_A252CliCod, P01WK41_n252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WK45_A831TipColCod, P01WK45_A483ForColNum, P01WK45_A482ForColNom, P01WK45_A494ForSer, P01WK45_A252CliCod, P01WK45_A396EmprCod, P01WK45_A583IntCod
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

   private byte AV16SerieF ;
   private byte AV53FlagDia ;
   private byte AV81F_clfse ;
   private byte AV82EstCat ;
   private byte AV86No_b ;
   private byte AV40FlagEst ;
   private byte AV41FlagBru ;
   private byte AV55FlagTot ;
   private byte GXv_int1[] ;
   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV19Mes ;
   private byte AV75Emp_proces ;
   private byte A1295FacBarReo ;
   private byte A3880FacTipColC ;
   private byte AV68FacBarReo ;
   private byte AV84TipColCodf ;
   private byte A426EstMes ;
   private byte A72ArtEstMes ;
   private byte A5315ClFsMes ;
   private byte A5182EstTpaMes ;
   private byte A5389EstCatMes ;
   private byte AV58BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV46TipColCod ;
   private byte A3663FacProInt ;
   private byte AV45IntCod ;
   private byte A3664FacProTip ;
   private byte A3666FacProMes ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A6020XabcTC ;
   private byte A6023XabcMes ;
   private short AV88CantidadRegistrosAProcesar ;
   private short cV88CantidadRegistrosAProcesar ;
   private short AV89CantidadRegistrosProcesados ;
   private short AV18Any ;
   private short A425EstAny ;
   private short Gx_err ;
   private short A5189FacTipArt ;
   private short AV20TipArtCod ;
   private short A71ArtEstAny ;
   private short A829TipArtCod ;
   private short A5342ArtEstTart ;
   private short A5310ClFsAny ;
   private short AV64FacTipArt ;
   private short A5173EstTpaAny ;
   private short A5382EstCatAny ;
   private short A5384EstCatTip ;
   private short AV90Porcentaje ;
   private short A217BarTipArt ;
   private short A194BarOrdLin ;
   private short A3661FacProAny ;
   private short A3665FacProTar ;
   private short A6019XabcAny ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV85CliFac ;
   private int GX_INS394 ;
   private int W252CliCod ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int A446FacLin ;
   private int AV66FacBarCod ;
   private int GX_INS395 ;
   private int AV21CliCod ;
   private int GX_INS396 ;
   private int GX_INS397 ;
   private int GX_INS773 ;
   private int GX_INS774 ;
   private int GX_INS757 ;
   private int GX_INS758 ;
   private int GX_INS781 ;
   private int GX_INS782 ;
   private int GX_INS546 ;
   private int AV57BarCod ;
   private int A1014DibInt ;
   private int AV61BarDibInt ;
   private int GX_INS547 ;
   private int A129BarCod ;
   private int A1799BarDibInt ;
   private int A136BarColNum ;
   private int AV52ForColNum ;
   private int GX_INS512 ;
   private int GX_INS513 ;
   private int A483ForColNum ;
   private int GX_INS881 ;
   private int GX_INS882 ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV42BaseImp ;
   private java.math.BigDecimal AV56FacTot ;
   private java.math.BigDecimal AV79Tot_imp_k ;
   private java.math.BigDecimal AV80Tot_imp_m ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private java.math.BigDecimal AV31ImpCli0 ;
   private java.math.BigDecimal AV28ImpCli1 ;
   private java.math.BigDecimal AV32FacKg0 ;
   private java.math.BigDecimal AV29FacKg1 ;
   private java.math.BigDecimal AV33FacMt0 ;
   private java.math.BigDecimal AV30FacMt1 ;
   private java.math.BigDecimal A1440ImpCli1 ;
   private java.math.BigDecimal A1368FacKg1 ;
   private java.math.BigDecimal A1366FacMt1 ;
   private java.math.BigDecimal A1439ImpCli0 ;
   private java.math.BigDecimal A1367FacKg0 ;
   private java.math.BigDecimal A1365FacMt0 ;
   private java.math.BigDecimal AV34ArtImp1 ;
   private java.math.BigDecimal AV39ArtFacKg1 ;
   private java.math.BigDecimal AV37ArtFacMt1 ;
   private java.math.BigDecimal AV35ArtImp0 ;
   private java.math.BigDecimal AV36ArtFacKg0 ;
   private java.math.BigDecimal AV38ArtFacMt0 ;
   private java.math.BigDecimal A1437ArtImp1 ;
   private java.math.BigDecimal A1436ArtImp0 ;
   private java.math.BigDecimal A1374ArtFacMt1 ;
   private java.math.BigDecimal A1373ArtFacMt0 ;
   private java.math.BigDecimal A1376ArtFacKg1 ;
   private java.math.BigDecimal A1375ArtFacKg0 ;
   private java.math.BigDecimal A5317ClFsFac1 ;
   private java.math.BigDecimal A5319ClFsKg1 ;
   private java.math.BigDecimal A5321ClFsMt1 ;
   private java.math.BigDecimal A5320ClFsMt0 ;
   private java.math.BigDecimal A5318ClFsKg0 ;
   private java.math.BigDecimal A5316ClFsFac0 ;
   private java.math.BigDecimal A5184TpaFMt1 ;
   private java.math.BigDecimal A5186TpaFKg1 ;
   private java.math.BigDecimal A5187ImpTpa0 ;
   private java.math.BigDecimal A5183TpaFMt0 ;
   private java.math.BigDecimal A5185TpaFKg0 ;
   private java.math.BigDecimal A5188ImpTpa1 ;
   private java.math.BigDecimal A5391EstCatImp1 ;
   private java.math.BigDecimal A5390EstCatImp0 ;
   private java.math.BigDecimal A1138MtrFac1 ;
   private java.math.BigDecimal A1088ImpFac ;
   private java.math.BigDecimal A1087MtrFac ;
   private java.math.BigDecimal A1134ImpFac1 ;
   private java.math.BigDecimal AV77Mts_fra ;
   private java.math.BigDecimal AV76Kgs_fra ;
   private java.math.BigDecimal A3667FacProKgs ;
   private java.math.BigDecimal A3668FacProVal ;
   private java.math.BigDecimal A3677FacProMts ;
   private java.math.BigDecimal A3678FacProValM ;
   private java.math.BigDecimal A6021XabcAKgs ;
   private java.math.BigDecimal A6026XabcKgF ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String AV17FacSerNum ;
   private String A450FacPri ;
   private String A2739FacSerNum ;
   private String A279CliNom ;
   private String AV43FacPri ;
   private String A2755EstSerFac ;
   private String Gx_emsg ;
   private String AV73Hdr ;
   private String AV74LastHdr ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A3397FacFasCod ;
   private String AV67FacBarPar ;
   private String AV22ArtCod ;
   private String AV23EmprCod ;
   private String A65ArtCod ;
   private String A2756ArtEstSer ;
   private String AV65FacFasCod ;
   private String A457FasCod ;
   private String A5311ClFsSer ;
   private String A5174EstTpaSF ;
   private String A5383EstCatSer ;
   private String A5385EstCatDsc ;
   private String AV83TipArtDsc ;
   private String A3913DibSerFac ;
   private String AV59BarCodPar ;
   private String A1013DibCli ;
   private String AV60BarDibCli ;
   private String AV44EstSerFac ;
   private String A130BarCodPar ;
   private String A830TipArtDsc ;
   private String A1798BarDibCli ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String AV51ForColNom ;
   private String A3662FacProSer ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private java.util.Date AV15FechaLim ;
   private java.util.Date A436FacFch ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n252CliCod ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n1440ImpCli1 ;
   private boolean n1368FacKg1 ;
   private boolean n1366FacMt1 ;
   private boolean n1439ImpCli0 ;
   private boolean n1367FacKg0 ;
   private boolean n1365FacMt0 ;
   private boolean returnInSub ;
   private boolean n1437ArtImp1 ;
   private boolean n1436ArtImp0 ;
   private boolean n1374ArtFacMt1 ;
   private boolean n1373ArtFacMt0 ;
   private boolean n1376ArtFacKg1 ;
   private boolean n1375ArtFacKg0 ;
   private boolean n5342ArtEstTart ;
   private boolean n5317ClFsFac1 ;
   private boolean n5319ClFsKg1 ;
   private boolean n5321ClFsMt1 ;
   private boolean n5320ClFsMt0 ;
   private boolean n5318ClFsKg0 ;
   private boolean n5316ClFsFac0 ;
   private boolean n5184TpaFMt1 ;
   private boolean n5186TpaFKg1 ;
   private boolean n5187ImpTpa0 ;
   private boolean n5183TpaFMt0 ;
   private boolean n5185TpaFKg0 ;
   private boolean n5188ImpTpa1 ;
   private boolean n5385EstCatDsc ;
   private boolean n5391EstCatImp1 ;
   private boolean n5390EstCatImp0 ;
   private boolean n1138MtrFac1 ;
   private boolean n1088ImpFac ;
   private boolean n1087MtrFac ;
   private boolean n1134ImpFac1 ;
   private boolean n217BarTipArt ;
   private boolean n830TipArtDsc ;
   private boolean n3667FacProKgs ;
   private boolean n3668FacProVal ;
   private boolean n3677FacProMts ;
   private boolean n3678FacProValM ;
   private boolean n6021XabcAKgs ;
   private boolean n6026XabcKgF ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV87ProgressIndicator ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WK2_A396EmprCod ;
   private String[] P01WK2_A963Ser1 ;
   private boolean[] P01WK2_n963Ser1 ;
   private String[] P01WK2_A2387Ser2 ;
   private boolean[] P01WK2_n2387Ser2 ;
   private String[] P01WK2_A2389Ser3 ;
   private boolean[] P01WK2_n2389Ser3 ;
   private short[] P01WK3_AV88CantidadRegistrosAProcesar ;
   private String[] P01WK4_A396EmprCod ;
   private int[] P01WK4_A430FacCod ;
   private String[] P01WK4_A450FacPri ;
   private byte[] P01WK4_A1153FacTipFac ;
   private String[] P01WK4_A2739FacSerNum ;
   private java.util.Date[] P01WK4_A436FacFch ;
   private byte[] P01WK4_A435FacEst ;
   private int[] P01WK4_A252CliCod ;
   private boolean[] P01WK4_n252CliCod ;
   private java.math.BigDecimal[] P01WK4_A11513FacRecIca ;
   private java.math.BigDecimal[] P01WK4_A8346FacRecI ;
   private boolean[] P01WK4_n8346FacRecI ;
   private java.math.BigDecimal[] P01WK4_A7212FacRect ;
   private java.math.BigDecimal[] P01WK4_A453FacRECPor ;
   private byte[] P01WK4_A443FacIVAPor ;
   private java.math.BigDecimal[] P01WK4_A14224FacCostFac ;
   private java.math.BigDecimal[] P01WK4_A14223FacCostKgs ;
   private java.math.BigDecimal[] P01WK4_A14222FacCostMts ;
   private java.math.BigDecimal[] P01WK4_A434FacDtoPP ;
   private java.math.BigDecimal[] P01WK4_A433FacDtoGen ;
   private java.math.BigDecimal[] P01WK4_A14219FacEnergia ;
   private byte[] P01WK5_A7209Colombia ;
   private boolean[] P01WK5_n7209Colombia ;
   private String[] P01WK6_A279CliNom ;
   private java.math.BigDecimal[] P01WK8_A3918FacImpTot1 ;
   private String[] P01WK10_A396EmprCod ;
   private int[] P01WK10_A430FacCod ;
   private int[] P01WK10_A1294FacBarCod ;
   private byte[] P01WK10_A1295FacBarReo ;
   private String[] P01WK10_A1296FacBarPar ;
   private String[] P01WK10_A454FacSer ;
   private String[] P01WK10_A2739FacSerNum ;
   private byte[] P01WK10_A3880FacTipColC ;
   private String[] P01WK10_A3397FacFasCod ;
   private short[] P01WK10_A5189FacTipArt ;
   private long[] P01WK10_A427FacAlbCod ;
   private int[] P01WK10_A12197FacUnds ;
   private java.math.BigDecimal[] P01WK10_A3897FacKgsA ;
   private java.math.BigDecimal[] P01WK10_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P01WK10_A12198FacPreUnd ;
   private java.math.BigDecimal[] P01WK10_A449FacPreMts ;
   private java.math.BigDecimal[] P01WK10_A5353FacImpMan ;
   private java.math.BigDecimal[] P01WK10_A447FacMts ;
   private java.math.BigDecimal[] P01WK10_A444FacKgs ;
   private java.math.BigDecimal[] P01WK10_A448FacPreKgs ;
   private java.math.BigDecimal[] P01WK10_A5355FacImpMin ;
   private int[] P01WK10_A446FacLin ;
   private String[] P01WK12_A396EmprCod ;
   private int[] P01WK12_A252CliCod ;
   private boolean[] P01WK12_n252CliCod ;
   private short[] P01WK12_A425EstAny ;
   private String[] P01WK12_A2755EstSerFac ;
   private byte[] P01WK12_A426EstMes ;
   private java.math.BigDecimal[] P01WK12_A1440ImpCli1 ;
   private boolean[] P01WK12_n1440ImpCli1 ;
   private java.math.BigDecimal[] P01WK12_A1439ImpCli0 ;
   private boolean[] P01WK12_n1439ImpCli0 ;
   private java.math.BigDecimal[] P01WK12_A1368FacKg1 ;
   private boolean[] P01WK12_n1368FacKg1 ;
   private java.math.BigDecimal[] P01WK12_A1366FacMt1 ;
   private boolean[] P01WK12_n1366FacMt1 ;
   private java.math.BigDecimal[] P01WK12_A1367FacKg0 ;
   private boolean[] P01WK12_n1367FacKg0 ;
   private java.math.BigDecimal[] P01WK12_A1365FacMt0 ;
   private boolean[] P01WK12_n1365FacMt0 ;
   private String[] P01WK16_A396EmprCod ;
   private int[] P01WK16_A252CliCod ;
   private boolean[] P01WK16_n252CliCod ;
   private String[] P01WK16_A65ArtCod ;
   private short[] P01WK16_A71ArtEstAny ;
   private String[] P01WK16_A2756ArtEstSer ;
   private byte[] P01WK16_A72ArtEstMes ;
   private java.math.BigDecimal[] P01WK16_A1437ArtImp1 ;
   private boolean[] P01WK16_n1437ArtImp1 ;
   private java.math.BigDecimal[] P01WK16_A1436ArtImp0 ;
   private boolean[] P01WK16_n1436ArtImp0 ;
   private java.math.BigDecimal[] P01WK16_A1376ArtFacKg1 ;
   private boolean[] P01WK16_n1376ArtFacKg1 ;
   private java.math.BigDecimal[] P01WK16_A1374ArtFacMt1 ;
   private boolean[] P01WK16_n1374ArtFacMt1 ;
   private java.math.BigDecimal[] P01WK16_A1375ArtFacKg0 ;
   private boolean[] P01WK16_n1375ArtFacKg0 ;
   private java.math.BigDecimal[] P01WK16_A1373ArtFacMt0 ;
   private boolean[] P01WK16_n1373ArtFacMt0 ;
   private short[] P01WK16_A5342ArtEstTart ;
   private boolean[] P01WK16_n5342ArtEstTart ;
   private String[] P01WK20_A396EmprCod ;
   private int[] P01WK20_A252CliCod ;
   private boolean[] P01WK20_n252CliCod ;
   private String[] P01WK20_A457FasCod ;
   private short[] P01WK20_A5310ClFsAny ;
   private String[] P01WK20_A5311ClFsSer ;
   private byte[] P01WK20_A5315ClFsMes ;
   private java.math.BigDecimal[] P01WK20_A5317ClFsFac1 ;
   private boolean[] P01WK20_n5317ClFsFac1 ;
   private java.math.BigDecimal[] P01WK20_A5319ClFsKg1 ;
   private boolean[] P01WK20_n5319ClFsKg1 ;
   private java.math.BigDecimal[] P01WK20_A5321ClFsMt1 ;
   private boolean[] P01WK20_n5321ClFsMt1 ;
   private java.math.BigDecimal[] P01WK20_A5320ClFsMt0 ;
   private boolean[] P01WK20_n5320ClFsMt0 ;
   private java.math.BigDecimal[] P01WK20_A5316ClFsFac0 ;
   private boolean[] P01WK20_n5316ClFsFac0 ;
   private java.math.BigDecimal[] P01WK20_A5318ClFsKg0 ;
   private boolean[] P01WK20_n5318ClFsKg0 ;
   private String[] P01WK24_A396EmprCod ;
   private short[] P01WK24_A829TipArtCod ;
   private short[] P01WK24_A5173EstTpaAny ;
   private String[] P01WK24_A5174EstTpaSF ;
   private byte[] P01WK24_A5182EstTpaMes ;
   private java.math.BigDecimal[] P01WK24_A5187ImpTpa0 ;
   private boolean[] P01WK24_n5187ImpTpa0 ;
   private java.math.BigDecimal[] P01WK24_A5188ImpTpa1 ;
   private boolean[] P01WK24_n5188ImpTpa1 ;
   private java.math.BigDecimal[] P01WK24_A5185TpaFKg0 ;
   private boolean[] P01WK24_n5185TpaFKg0 ;
   private java.math.BigDecimal[] P01WK24_A5183TpaFMt0 ;
   private boolean[] P01WK24_n5183TpaFMt0 ;
   private java.math.BigDecimal[] P01WK24_A5184TpaFMt1 ;
   private boolean[] P01WK24_n5184TpaFMt1 ;
   private java.math.BigDecimal[] P01WK24_A5186TpaFKg1 ;
   private boolean[] P01WK24_n5186TpaFKg1 ;
   private String[] P01WK28_A396EmprCod ;
   private int[] P01WK28_A252CliCod ;
   private boolean[] P01WK28_n252CliCod ;
   private String[] P01WK28_A65ArtCod ;
   private short[] P01WK28_A5382EstCatAny ;
   private String[] P01WK28_A5383EstCatSer ;
   private short[] P01WK28_A5384EstCatTip ;
   private byte[] P01WK28_A5389EstCatMes ;
   private java.math.BigDecimal[] P01WK28_A5391EstCatImp1 ;
   private boolean[] P01WK28_n5391EstCatImp1 ;
   private java.math.BigDecimal[] P01WK28_A5390EstCatImp0 ;
   private boolean[] P01WK28_n5390EstCatImp0 ;
   private String[] P01WK32_A396EmprCod ;
   private String[] P01WK32_A1013DibCli ;
   private int[] P01WK32_A252CliCod ;
   private boolean[] P01WK32_n252CliCod ;
   private int[] P01WK32_A1014DibInt ;
   private short[] P01WK32_A425EstAny ;
   private String[] P01WK32_A3913DibSerFac ;
   private byte[] P01WK32_A426EstMes ;
   private java.math.BigDecimal[] P01WK32_A1088ImpFac ;
   private boolean[] P01WK32_n1088ImpFac ;
   private java.math.BigDecimal[] P01WK32_A1087MtrFac ;
   private boolean[] P01WK32_n1087MtrFac ;
   private java.math.BigDecimal[] P01WK32_A1134ImpFac1 ;
   private boolean[] P01WK32_n1134ImpFac1 ;
   private java.math.BigDecimal[] P01WK32_A1138MtrFac1 ;
   private boolean[] P01WK32_n1138MtrFac1 ;
   private String[] P01WK35_A130BarCodPar ;
   private byte[] P01WK35_A132BarCodReo ;
   private int[] P01WK35_A129BarCod ;
   private String[] P01WK35_A396EmprCod ;
   private short[] P01WK35_A217BarTipArt ;
   private boolean[] P01WK35_n217BarTipArt ;
   private String[] P01WK36_A396EmprCod ;
   private short[] P01WK36_A829TipArtCod ;
   private String[] P01WK36_A830TipArtDsc ;
   private boolean[] P01WK36_n830TipArtDsc ;
   private byte[] P01WK37_A426EstMes ;
   private short[] P01WK37_A425EstAny ;
   private String[] P01WK37_A2755EstSerFac ;
   private int[] P01WK37_A252CliCod ;
   private boolean[] P01WK37_n252CliCod ;
   private String[] P01WK37_A396EmprCod ;
   private java.math.BigDecimal[] P01WK37_A1440ImpCli1 ;
   private boolean[] P01WK37_n1440ImpCli1 ;
   private java.math.BigDecimal[] P01WK37_A1439ImpCli0 ;
   private boolean[] P01WK37_n1439ImpCli0 ;
   private String[] P01WK39_A130BarCodPar ;
   private byte[] P01WK39_A132BarCodReo ;
   private int[] P01WK39_A129BarCod ;
   private String[] P01WK39_A396EmprCod ;
   private String[] P01WK39_A1798BarDibCli ;
   private int[] P01WK39_A1799BarDibInt ;
   private String[] P01WK40_A150BarFacTin ;
   private String[] P01WK40_A130BarCodPar ;
   private byte[] P01WK40_A132BarCodReo ;
   private int[] P01WK40_A129BarCod ;
   private String[] P01WK40_A396EmprCod ;
   private String[] P01WK40_A457FasCod ;
   private String[] P01WK40_A758ProCod ;
   private short[] P01WK40_A194BarOrdLin ;
   private String[] P01WK41_A396EmprCod ;
   private String[] P01WK41_A130BarCodPar ;
   private byte[] P01WK41_A132BarCodReo ;
   private int[] P01WK41_A129BarCod ;
   private String[] P01WK41_A135BarColNom ;
   private int[] P01WK41_A136BarColNum ;
   private byte[] P01WK41_A218BarTipCol ;
   private String[] P01WK41_A212BarSer ;
   private short[] P01WK41_A217BarTipArt ;
   private boolean[] P01WK41_n217BarTipArt ;
   private int[] P01WK41_A252CliCod ;
   private boolean[] P01WK41_n252CliCod ;
   private byte[] P01WK45_A831TipColCod ;
   private int[] P01WK45_A483ForColNum ;
   private String[] P01WK45_A482ForColNom ;
   private String[] P01WK45_A494ForSer ;
   private int[] P01WK45_A252CliCod ;
   private boolean[] P01WK45_n252CliCod ;
   private String[] P01WK45_A396EmprCod ;
   private byte[] P01WK45_A583IntCod ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV91messages ;
   private com.genexus.SdtMessages_Message AV71message ;
}

final  class pactfac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WK2", "SELECT EmprCod, Ser1, Ser2, Ser3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WK3", "SELECT COUNT(*) FROM TXPCFAVEN WHERE (EmprCod = ?) AND (FacFch <= ?) AND (FacEst = 1) AND (FacSerNum = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WK4", "SELECT EmprCod, FacCod, FacPri, FacTipFac, FacSerNum, FacFch, FacEst, CliCod, FacRecIca, FacRecI, FacRect, FacRECPor, FacIVAPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoPP, FacDtoGen, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ?) AND ((EmprCod = ?) AND (FacFch <= ?) AND (FacEst = 1) AND (FacSerNum = ?)) ORDER BY EmprCod, FacCod  FOR UPDATE OF FacEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WK5", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WK6", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WK8", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01WK9", "INSERT INTO TXPCESCLI(EmprCod, CliCod, EstAny, EstSerFac, AcuImpDev, AcuImpImp, AcuNroImp, AcuNroDev, AcuOrd0) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESCLI")
         ,new ForEachCursor("P01WK10", "SELECT T1.EmprCod, T1.FacCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar, T1.FacSer, T2.FacSerNum, T1.FacTipColC, T1.FacFasCod, T1.FacTipArt, T1.FacAlbCod, T1.FacUnds, T1.FacKgsA, T1.FacPreKgsA, T1.FacPreUnd, T1.FacPreMts, T1.FacImpMan, T1.FacMts, T1.FacKgs, T1.FacPreKgs, T1.FacImpMin, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE (T1.EmprCod = ?) AND (T1.FacCod = ?) ORDER BY T1.FacAlbCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01WK11", "INSERT INTO TXPLESCLI(EmprCod, CliCod, EstAny, EstSerFac, EstMes, FacMt0, FacMt1, FacKg0, FacKg1, ImpCli0, ImpCli1, KgmTra, KgmTin, KgmRin, KgmRex, MtrTra, MtrTin, MtrRin, MtrRex) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESCLI")
         ,new ForEachCursor("P01WK12", "SELECT EmprCod, CliCod, EstAny, EstSerFac, EstMes, ImpCli1, ImpCli0, FacKg1, FacMt1, FacKg0, FacMt0 FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes  FOR UPDATE OF ImpCli1, ImpCli0, FacKg1, FacMt1, FacKg0, FacMt0 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK13", "UPDATE TXPLESCLI SET ImpCli1=?, ImpCli0=?, FacKg1=?, FacMt1=?, FacKg0=?, FacMt0=?  WHERE EmprCod = ? AND CliCod = ? AND EstAny = ? AND EstSerFac = ? AND EstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESCLI")
         ,new UpdateCursor("P01WK14", "INSERT INTO TXPCESART(EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, TipArtCod, ArtRdto, ArtOrd0) VALUES(?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
         ,new UpdateCursor("P01WK15", "INSERT INTO TXPLESART(EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes, ArtFacMt0, ArtFacMt1, ArtFacKg0, ArtFacKg1, ArtImp0, ArtImp1, ArtEstTart, ArtKilTra, ArtKilTin, ArtKilRin, ArtKilRex, ArtMtrTra, ArtMtrTin, ArtMtrRin, ArtMtrRex) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESART")
         ,new ForEachCursor("P01WK16", "SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes, ArtImp1, ArtImp0, ArtFacKg1, ArtFacMt1, ArtFacKg0, ArtFacMt0, ArtEstTart FROM TXPLESART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtEstAny = ? and ArtEstSer = ? and ArtEstMes = ? ORDER BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes  FOR UPDATE OF ArtImp1, ArtImp0, ArtFacKg1, ArtFacMt1, ArtFacKg0, ArtFacMt0, ArtEstTart NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK17", "UPDATE TXPLESART SET ArtImp1=?, ArtImp0=?, ArtFacKg1=?, ArtFacMt1=?, ArtFacKg0=?, ArtFacMt0=?, ArtEstTart=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtEstAny = ? AND ArtEstSer = ? AND ArtEstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESART")
         ,new UpdateCursor("P01WK18", "INSERT INTO TXPCLFSE(EmprCod, CliCod, FasCod, ClFsAny, ClFsSer, ClFsOrd) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLFSE")
         ,new UpdateCursor("P01WK19", "INSERT INTO TXPCLFSE1(EmprCod, CliCod, FasCod, ClFsAny, ClFsSer, ClFsMes, ClFsFac0, ClFsFac1, ClFsKg0, ClFsKg1, ClFsMt0, ClFsMt1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLFSE1")
         ,new ForEachCursor("P01WK20", "SELECT EmprCod, CliCod, FasCod, ClFsAny, ClFsSer, ClFsMes, ClFsFac1, ClFsKg1, ClFsMt1, ClFsMt0, ClFsFac0, ClFsKg0 FROM TXPCLFSE1 WHERE EmprCod = ? and CliCod = ? and FasCod = ? and ClFsAny = ? and ClFsSer = ? and ClFsMes = ? ORDER BY EmprCod, CliCod, FasCod, ClFsAny, ClFsSer, ClFsMes  FOR UPDATE OF ClFsFac1, ClFsKg1, ClFsMt1, ClFsMt0, ClFsFac0, ClFsKg0 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK21", "UPDATE TXPCLFSE1 SET ClFsFac1=?, ClFsKg1=?, ClFsMt1=?, ClFsMt0=?, ClFsFac0=?, ClFsKg0=?  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? AND ClFsAny = ? AND ClFsSer = ? AND ClFsMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLFSE1")
         ,new UpdateCursor("P01WK22", "INSERT INTO TXPTAREST(EmprCod, TipArtCod, EstTpaAny, EstTpaSF, AcuOrdTpa) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTAREST")
         ,new UpdateCursor("P01WK23", "INSERT INTO TXPTARES1(EmprCod, TipArtCod, EstTpaAny, EstTpaSF, EstTpaMes, TpaFMt0, TpaFMt1, TpaFKg0, TpaFKg1, ImpTpa0, ImpTpa1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTARES1")
         ,new ForEachCursor("P01WK24", "SELECT EmprCod, TipArtCod, EstTpaAny, EstTpaSF, EstTpaMes, ImpTpa0, ImpTpa1, TpaFKg0, TpaFMt0, TpaFMt1, TpaFKg1 FROM TXPTARES1 WHERE EmprCod = ? and TipArtCod = ? and EstTpaAny = ? and EstTpaSF = ? and EstTpaMes = ? ORDER BY EmprCod, TipArtCod, EstTpaAny, EstTpaSF, EstTpaMes  FOR UPDATE OF ImpTpa0, ImpTpa1, TpaFKg0, TpaFMt0, TpaFMt1, TpaFKg1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK25", "UPDATE TXPTARES1 SET ImpTpa0=?, ImpTpa1=?, TpaFKg0=?, TpaFMt0=?, TpaFMt1=?, TpaFKg1=?  WHERE EmprCod = ? AND TipArtCod = ? AND EstTpaAny = ? AND EstTpaSF = ? AND EstTpaMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTARES1")
         ,new UpdateCursor("P01WK26", "INSERT INTO TXPESTCAT(EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, EstCatDsc, EstCatOrd0) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESTCAT")
         ,new UpdateCursor("P01WK27", "INSERT INTO TXPESTCA1(EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, EstCatMes, EstCatImp0, EstCatImp1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESTCA1")
         ,new ForEachCursor("P01WK28", "SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, EstCatMes, EstCatImp1, EstCatImp0 FROM TXPESTCA1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstCatAny = ? and EstCatSer = ? and EstCatTip = ? and EstCatMes = ? ORDER BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, EstCatMes  FOR UPDATE OF EstCatImp1, EstCatImp0 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK29", "UPDATE TXPESTCA1 SET EstCatImp1=?, EstCatImp0=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstCatAny = ? AND EstCatSer = ? AND EstCatTip = ? AND EstCatMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESTCA1")
         ,new UpdateCursor("P01WK30", "INSERT INTO TXPCESTDI(EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESTDI")
         ,new UpdateCursor("P01WK31", "INSERT INTO TXPLESTDI(EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrFac, MtrFac1, ImpFac, ImpFac1, MtrEst, MtrEst1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESTDI")
         ,new ForEachCursor("P01WK32", "SELECT EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, ImpFac, MtrFac, ImpFac1, MtrFac1 FROM TXPLESTDI WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and EstAny = ? and DibSerFac = ? and EstMes = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes  FOR UPDATE OF ImpFac, MtrFac, ImpFac1, MtrFac1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK33", "UPDATE TXPLESTDI SET ImpFac=?, MtrFac=?, ImpFac1=?, MtrFac1=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESTDI")
         ,new UpdateCursor("P01WK34", "UPDATE TXPCFAVEN SET FacEst=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P01WK35", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WK36", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WK37", "SELECT EstMes, EstAny, EstSerFac, CliCod, EmprCod, ImpCli1, ImpCli0 FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes  FOR UPDATE OF ImpCli1, ImpCli0 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK38", "UPDATE TXPLESCLI SET ImpCli1=?, ImpCli0=?  WHERE EmprCod = ? AND CliCod = ? AND EstAny = ? AND EstSerFac = ? AND EstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESCLI")
         ,new ForEachCursor("P01WK39", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarDibCli, BarDibInt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WK40", "SELECT BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WK41", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarColNom, BarColNum, BarTipCol, BarSer, BarTipArt, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK42", "INSERT INTO TXPFACPRO(EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFACPRO")
         ,new UpdateCursor("P01WK43", "INSERT INTO TXPLFACPR(EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes, FacProKgs, FacProVal, FacProMts, FacProValM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFACPR")
         ,new UpdateCursor("P01WK44", "UPDATE TXPLFACPR SET FacProValM=FacProValM + ?, FacProMts=FacProMts + ?, FacProVal=FacProVal + ?, FacProKgs=FacProKgs + ?  WHERE EmprCod = ? and CliCod = ? and FacProAny = ? and FacProSer = ? and FacProInt = ? and FacProTip = ? and FacProTar = ? and FacProMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFACPR")
         ,new ForEachCursor("P01WK45", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WK46", "INSERT INTO TXPXABCTC(EmprCod, XabcAny, XabcTC, XabcAKgs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXABCTC")
         ,new UpdateCursor("P01WK47", "INSERT INTO TXPXABCT1(EmprCod, XabcAny, XabcTC, XabcMes, XabcKgF, XabcKgs) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXABCT1")
         ,new UpdateCursor("P01WK48", "UPDATE TXPXABCT1 SET XabcKgF=XabcKgF + ?  WHERE EmprCod = ? and XabcAny = ? and XabcTC = ? and XabcMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXABCT1")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 34 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 42 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               stmt.setShort(9, ((Number) parms[15]).shortValue());
               stmt.setString(10, (String)parms[16], 3);
               stmt.setByte(11, ((Number) parms[17]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[20]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               stmt.setString(10, (String)parms[17], 16);
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               stmt.setString(12, (String)parms[19], 3);
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 18 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               stmt.setString(9, (String)parms[15], 8);
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               stmt.setString(11, (String)parms[17], 3);
               stmt.setByte(12, ((Number) parms[18]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 22 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setShort(8, ((Number) parms[13]).shortValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setString(10, (String)parms[15], 3);
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 30);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
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
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
            case 26 :
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
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setString(5, (String)parms[7], 16);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setString(7, (String)parms[9], 3);
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
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
               stmt.setString(6, (String)parms[9], 16);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               stmt.setInt(8, ((Number) parms[12]).intValue());
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               stmt.setString(10, (String)parms[14], 3);
               stmt.setByte(11, ((Number) parms[15]).byteValue());
               return;
            case 31 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 35 :
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
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setString(6, (String)parms[8], 3);
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               return;
            case 41 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 3);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               return;
            case 45 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

