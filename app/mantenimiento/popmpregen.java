package app.mantenimiento ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class popmpregen extends GXProcedure
{
   public popmpregen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( popmpregen.class ), "" );
   }

   public popmpregen( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      popmpregen.this.aP1 = new int[] {0};
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
      popmpregen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      popmpregen.this.AV8PMCodInout = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      popmpregen.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      popmpregen.this.AV10EmprCod = GXv_char2[0] ;
      popmpregen.this.AV11EmprNom = GXv_char3[0] ;
      popmpregen.this.AV12UsurCod = GXv_char4[0] ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int5[0] = AV13MTMovCod ;
      GXv_char2[0] = AV14MTMovNom ;
      new app.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      popmpregen.this.AV10EmprCod = GXv_char4[0] ;
      popmpregen.this.AV13MTMovCod = GXv_int5[0] ;
      popmpregen.this.AV14MTMovNom = GXv_char2[0] ;
      AV15Fecha = GXutil.serverDate( context, remoteHandle, pr_default) ;
      AV16Now = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P0A5B2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9429PMCod = P0A5B2_A9429PMCod[0] ;
         n9429PMCod = P0A5B2_n9429PMCod[0] ;
         A9488PMOrd = P0A5B2_A9488PMOrd[0] ;
         n9488PMOrd = P0A5B2_n9488PMOrd[0] ;
         A9478PMEst = P0A5B2_A9478PMEst[0] ;
         n9478PMEst = P0A5B2_n9478PMEst[0] ;
         A9487PMDias = P0A5B2_A9487PMDias[0] ;
         n9487PMDias = P0A5B2_n9487PMDias[0] ;
         A9486PMUlt = P0A5B2_A9486PMUlt[0] ;
         n9486PMUlt = P0A5B2_n9486PMUlt[0] ;
         if ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV17OMFchCer = GXutil.resetTime( GXutil.dadd( A9486PMUlt , - ( ( A9487PMDias + 1 ) )) );
            AV18Ok = (byte)(0) ;
            AV32GXLvl15 = (byte)(0) ;
            /* Using cursor P0A5B3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A9425OMCod = P0A5B3_A9425OMCod[0] ;
               A9445OMEst = P0A5B3_A9445OMEst[0] ;
               A9439OMFchCer = P0A5B3_A9439OMFchCer[0] ;
               AV32GXLvl15 = (byte)(1) ;
               if ( ! ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) )
               {
                  A9439OMFchCer = (GXutil.dateCompare(GXutil.nullDate(), A9439OMFchCer) ? AV16Now : A9439OMFchCer) ;
                  AV17OMFchCer = A9439OMFchCer ;
                  AV18Ok = (byte)(1) ;
               }
               /* Using cursor P0A5B4 */
               pr_default.execute(2, new Object[] {A9439OMFchCer, A396EmprCod, Integer.valueOf(A9425OMCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV32GXLvl15 == 0 )
            {
               AV18Ok = (byte)(1) ;
            }
            if ( AV18Ok == 1 )
            {
               A9488PMOrd = 0 ;
               n9488PMOrd = false ;
               A9486PMUlt = GXutil.resetTime(AV17OMFchCer) ;
               n9486PMUlt = false ;
            }
            /* Using cursor P0A5B5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), Boolean.valueOf(n9486PMUlt), A9486PMUlt, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV19Tab_pmcod[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV20Tab_pmord[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV21Tab_Pmest[GX_I-1] = GXutil.space( (short)(1)) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV22i = (short)(1) ;
      /* Using cursor P0A5B6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV8PMCodInout)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A9487PMDias = P0A5B6_A9487PMDias[0] ;
         n9487PMDias = P0A5B6_n9487PMDias[0] ;
         A9486PMUlt = P0A5B6_A9486PMUlt[0] ;
         n9486PMUlt = P0A5B6_n9486PMUlt[0] ;
         A9476PMMaqCod = P0A5B6_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P0A5B6_n9476PMMaqCod[0] ;
         A9483PMTxt = P0A5B6_A9483PMTxt[0] ;
         n9483PMTxt = P0A5B6_n9483PMTxt[0] ;
         A9429PMCod = P0A5B6_A9429PMCod[0] ;
         n9429PMCod = P0A5B6_n9429PMCod[0] ;
         A9478PMEst = P0A5B6_A9478PMEst[0] ;
         n9478PMEst = P0A5B6_n9478PMEst[0] ;
         A9484PMIni = P0A5B6_A9484PMIni[0] ;
         n9484PMIni = P0A5B6_n9484PMIni[0] ;
         A9485PMFin = P0A5B6_A9485PMFin[0] ;
         n9485PMFin = P0A5B6_n9485PMFin[0] ;
         A11454PMUso = P0A5B6_A11454PMUso[0] ;
         n11454PMUso = P0A5B6_n11454PMUso[0] ;
         A13013PMUsoMts = P0A5B6_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P0A5B6_n13013PMUsoMts[0] ;
         A9488PMOrd = P0A5B6_A9488PMOrd[0] ;
         n9488PMOrd = P0A5B6_n9488PMOrd[0] ;
         A14275PMDiasPavi = P0A5B6_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P0A5B6_n14275PMDiasPavi[0] ;
         W396EmprCod = A396EmprCod ;
         Gx_msg = httpContext.getMessage( "PMEst = ", "") + A9478PMEst + GXutil.newLine( ) ;
         if ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 )
         {
            Gx_msg += httpContext.getMessage( "PMIni {", "") + localUtil.dtoc( A9484PMIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( "} <= &Fecha {", "") + localUtil.dtoc( AV15Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + "}" + GXutil.newLine( ) ;
            if ( (( GXutil.resetTime(A9484PMIni).before( GXutil.resetTime( AV15Fecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A9484PMIni), GXutil.resetTime(AV15Fecha)) )) )
            {
               Gx_msg += httpContext.getMessage( "PMFin {", "") + localUtil.dtoc( A9485PMFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( "} <= &Fecha {", "") + localUtil.dtoc( AV15Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ") or null(PMFin}", "") + GXutil.newLine( ) ;
               if ( (( GXutil.resetTime(A9485PMFin).after( GXutil.resetTime( AV15Fecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A9485PMFin), GXutil.resetTime(AV15Fecha)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9485PMFin)) )
               {
                  if ( A11454PMUso.doubleValue() > 0 )
                  {
                     GXt_decimal6 = AV23Horas ;
                     GXv_decimal7[0] = GXt_decimal6 ;
                     new app.pmpreprd(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A9486PMUlt, GXv_decimal7) ;
                     popmpregen.this.GXt_decimal6 = GXv_decimal7[0] ;
                     AV23Horas = GXt_decimal6 ;
                  }
                  if ( A13013PMUsoMts.doubleValue() > 0 )
                  {
                     GXt_decimal6 = AV24PmUsoMts ;
                     GXv_decimal7[0] = GXt_decimal6 ;
                     new app.pmpremts(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A9486PMUlt, GXv_decimal7) ;
                     popmpregen.this.GXt_decimal6 = GXv_decimal7[0] ;
                     AV24PmUsoMts = GXt_decimal6 ;
                  }
                  Gx_msg += httpContext.getMessage( "null(PMOrd)  {", "") + GXutil.str( A9488PMOrd, 10, 0) + "}" + GXutil.newLine( ) ;
                  Gx_msg += "{" + localUtil.dtoc( A9486PMUlt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( "} + PMDias {", "") + GXutil.str( A9487PMDias, 10, 0) + httpContext.getMessage( "} < &Fecha {", "") + localUtil.dtoc( AV15Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( "} - 7 or &Horas {", "") + GXutil.str( AV23Horas, 10, 2) + httpContext.getMessage( "} >= PMUso {", "") + GXutil.str( A11454PMUso, 10, 0) + "}" + GXutil.newLine( ) ;
                  if ( (0==A9488PMOrd) && ( ( GXutil.ddiff( AV15Fecha , A9486PMUlt ) + A14275PMDiasPavi ) >= A9487PMDias ) || ( ( DecimalUtil.compareTo(AV23Horas, A11454PMUso) >= 0 ) && ( AV23Horas.doubleValue() > 0 ) ) || ( ( DecimalUtil.compareTo(AV24PmUsoMts, A13013PMUsoMts) >= 0 ) && ( AV24PmUsoMts.doubleValue() > 0 ) ) )
                  {
                     /*
                        INSERT RECORD ON TABLE TXPMORDEN

                     */
                     GXt_int8 = AV25OMCod ;
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = httpContext.getMessage( "MNTORD", "") ;
                     GXv_int5[0] = GXt_int8 ;
                     new app.pnumdocn(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
                     popmpregen.this.A396EmprCod = GXv_char4[0] ;
                     popmpregen.this.GXt_int8 = GXv_int5[0] ;
                     AV25OMCod = GXt_int8 ;
                     A9425OMCod = AV25OMCod ;
                     A9445OMEst = httpContext.getMessage( "P", "") ;
                     A9436OMFchCre = AV16Now ;
                     A9438OMFchPre = GXutil.dadd(A9486PMUlt,+((int)(A9487PMDias))) ;
                     A9426OMMaqCod = A9476PMMaqCod ;
                     A9437OMUsuCre = AV12UsurCod ;
                     A9433OMTxt = A9483PMTxt ;
                     /* Using cursor P0A5B7 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A9426OMMaqCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A9433OMTxt, A9436OMFchCre, A9437OMUsuCre, A9438OMFchPre, A9445OMEst});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                     if ( (pr_default.getStatus(5) == 1) )
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
                     /* Using cursor P0A5B8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
                     while ( (pr_default.getStatus(6) != 101) )
                     {
                        A9491PMRRCnt = P0A5B8_A9491PMRRCnt[0] ;
                        A9489PMRepCod = P0A5B8_A9489PMRepCod[0] ;
                        AV26PMRRCnt = A9491PMRRCnt ;
                        AV27ServerNow = AV16Now ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = AV25OMCod ;
                        GXv_int9[0] = A9489PMRepCod ;
                        GXv_int10[0] = AV13MTMovCod ;
                        GXv_char3[0] = AV14MTMovNom ;
                        GXv_int11[0] = (byte)(0) ;
                        GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
                        GXv_decimal12[0] = AV26PMRRCnt ;
                        GXv_char2[0] = httpContext.getMessage( "T", "") ;
                        GXv_dtime13[0] = AV27ServerNow ;
                        new app.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int9, GXv_int10, GXv_char3, GXv_int11, GXv_decimal7, GXv_decimal12, GXv_char2, GXv_dtime13) ;
                        popmpregen.this.A396EmprCod = GXv_char4[0] ;
                        popmpregen.this.AV25OMCod = GXv_int5[0] ;
                        popmpregen.this.A9489PMRepCod = GXv_int9[0] ;
                        popmpregen.this.AV13MTMovCod = GXv_int10[0] ;
                        popmpregen.this.AV14MTMovNom = GXv_char3[0] ;
                        popmpregen.this.AV26PMRRCnt = GXv_decimal12[0] ;
                        popmpregen.this.AV27ServerNow = GXv_dtime13[0] ;
                        pr_default.readNext(6);
                     }
                     pr_default.close(6);
                     /* Using cursor P0A5B9 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
                     while ( (pr_default.getStatus(7) != 101) )
                     {
                        A9481PMOpeRes = P0A5B9_A9481PMOpeRes[0] ;
                        A2505OpePreHor = P0A5B9_A2505OpePreHor[0] ;
                        n2505OpePreHor = P0A5B9_n2505OpePreHor[0] ;
                        A2505OpePreHor = P0A5B9_A2505OpePreHor[0] ;
                        n2505OpePreHor = P0A5B9_n2505OpePreHor[0] ;
                        /*
                           INSERT RECORD ON TABLE TXPMOrMO

                        */
                        A9425OMCod = AV25OMCod ;
                        A9455OMOpeCod = A9481PMOpeRes ;
                        A9458OMMTpo = httpContext.getMessage( "R", "") ;
                        A9460OMMRPre = A2505OpePreHor ;
                        /* Using cursor P0A5B10 */
                        pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, A9460OMMRPre});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                        if ( (pr_default.getStatus(8) == 1) )
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
                        pr_default.readNext(7);
                     }
                     pr_default.close(7);
                     /* Using cursor P0A5B11 */
                     pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
                     while ( (pr_default.getStatus(9) != 101) )
                     {
                        A11450PMMEquCod = P0A5B11_A11450PMMEquCod[0] ;
                        A11452PMMPieCod = P0A5B11_A11452PMMPieCod[0] ;
                        A11451PMMSEqCod = P0A5B11_A11451PMMSEqCod[0] ;
                        /*
                           INSERT RECORD ON TABLE TXPMOrde1

                        */
                        A9425OMCod = AV25OMCod ;
                        A11446OMMEquCod = A11450PMMEquCod ;
                        A11448OMMPieCod = A11452PMMPieCod ;
                        A11447OMMSEqCod = A11451PMMSEqCod ;
                        /* Using cursor P0A5B12 */
                        pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A11446OMMEquCod, A11447OMMSEqCod, A11448OMMPieCod});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde1");
                        if ( (pr_default.getStatus(10) == 1) )
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
                        pr_default.readNext(9);
                     }
                     pr_default.close(9);
                     /* Using cursor P0A5B13 */
                     pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
                     while ( (pr_default.getStatus(11) != 101) )
                     {
                        A9479PMTCod = P0A5B13_A9479PMTCod[0] ;
                        A9480PMTDsc = P0A5B13_A9480PMTDsc[0] ;
                        n9480PMTDsc = P0A5B13_n9480PMTDsc[0] ;
                        A9480PMTDsc = P0A5B13_A9480PMTDsc[0] ;
                        n9480PMTDsc = P0A5B13_n9480PMTDsc[0] ;
                        W396EmprCod = A396EmprCod ;
                        /*
                           INSERT RECORD ON TABLE TXPMOrde2

                        */
                        W9430TMCod = A9430TMCod ;
                        A9425OMCod = AV25OMCod ;
                        A9430TMCod = A9479PMTCod ;
                        /* Using cursor P0A5B14 */
                        pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
                        if ( (pr_default.getStatus(12) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        A9430TMCod = W9430TMCod ;
                        /* End Insert */
                        /* Using cursor P0A5B15 */
                        pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
                        while ( (pr_default.getStatus(13) != 101) )
                        {
                           A12644TMPMMEquCo = P0A5B15_A12644TMPMMEquCo[0] ;
                           A12645TMPMMSEqCo = P0A5B15_A12645TMPMMSEqCo[0] ;
                           A12646TMPMMPieCo = P0A5B15_A12646TMPMMPieCo[0] ;
                           W396EmprCod = A396EmprCod ;
                           /*
                              INSERT RECORD ON TABLE TXPMOrdeI

                           */
                           W396EmprCod = A396EmprCod ;
                           W9430TMCod = A9430TMCod ;
                           A9425OMCod = AV25OMCod ;
                           A9430TMCod = A9479PMTCod ;
                           A12636TMOMMEquCo = A12644TMPMMEquCo ;
                           A12637TMOMMSEqCo = A12645TMPMMSEqCo ;
                           A12638TMOMMPieCo = A12646TMPMMPieCo ;
                           /* Using cursor P0A5B16 */
                           pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrdeI");
                           if ( (pr_default.getStatus(14) == 1) )
                           {
                              Gx_err = (short)(1) ;
                              Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                           }
                           else
                           {
                              Gx_err = (short)(0) ;
                              Gx_emsg = "" ;
                           }
                           A396EmprCod = W396EmprCod ;
                           A9430TMCod = W9430TMCod ;
                           /* End Insert */
                           A396EmprCod = W396EmprCod ;
                           pr_default.readNext(13);
                        }
                        pr_default.close(13);
                        A396EmprCod = W396EmprCod ;
                        pr_default.readNext(11);
                     }
                     pr_default.close(11);
                     if ( AV22i > 1000 )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 1000 Registros", ""));
                     }
                     else
                     {
                        AV19Tab_pmcod[AV22i-1] = A9429PMCod ;
                        AV20Tab_pmord[AV22i-1] = AV25OMCod ;
                        AV21Tab_Pmest[AV22i-1] = A9478PMEst ;
                     }
                     AV22i = (short)(AV22i+1) ;
                  }
                  else
                  {
                  }
               }
               else
               {
                  if ( AV22i > 1000 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 1000 Registros", ""));
                  }
                  else
                  {
                     AV19Tab_pmcod[AV22i-1] = A9429PMCod ;
                     AV20Tab_pmord[AV22i-1] = A9488PMOrd ;
                     AV21Tab_Pmest[AV22i-1] = httpContext.getMessage( "I", "") ;
                  }
                  AV22i = (short)(AV22i+1) ;
               }
            }
            else
            {
            }
         }
         else
         {
         }
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      AV22i = (short)(1) ;
      while ( AV22i <= 1000 )
      {
         if ( AV19Tab_pmcod[AV22i-1] == 0 )
         {
            if (true) break;
         }
         AV28Pmcod = AV19Tab_pmcod[AV22i-1] ;
         /* Using cursor P0A5B17 */
         pr_default.execute(15, new Object[] {AV10EmprCod, Integer.valueOf(AV28Pmcod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A9429PMCod = P0A5B17_A9429PMCod[0] ;
            n9429PMCod = P0A5B17_n9429PMCod[0] ;
            A9488PMOrd = P0A5B17_A9488PMOrd[0] ;
            n9488PMOrd = P0A5B17_n9488PMOrd[0] ;
            A9478PMEst = P0A5B17_A9478PMEst[0] ;
            n9478PMEst = P0A5B17_n9478PMEst[0] ;
            A9488PMOrd = AV20Tab_pmord[AV22i-1] ;
            n9488PMOrd = false ;
            A9478PMEst = AV21Tab_Pmest[AV22i-1] ;
            n9478PMEst = false ;
            /* Using cursor P0A5B18 */
            pr_default.execute(16, new Object[] {Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), Boolean.valueOf(n9478PMEst), A9478PMEst, A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
         AV22i = (short)(AV22i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = popmpregen.this.A396EmprCod;
      this.aP1[0] = popmpregen.this.AV8PMCodInout;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimiento.popmpregen");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Station = "" ;
      GXt_char1 = "" ;
      AV10EmprCod = "" ;
      AV11EmprNom = "" ;
      AV12UsurCod = "" ;
      AV14MTMovNom = "" ;
      AV15Fecha = GXutil.nullDate() ;
      AV16Now = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P0A5B2_A396EmprCod = new String[] {""} ;
      P0A5B2_A9429PMCod = new int[1] ;
      P0A5B2_n9429PMCod = new boolean[] {false} ;
      P0A5B2_A9488PMOrd = new int[1] ;
      P0A5B2_n9488PMOrd = new boolean[] {false} ;
      P0A5B2_A9478PMEst = new String[] {""} ;
      P0A5B2_n9478PMEst = new boolean[] {false} ;
      P0A5B2_A9487PMDias = new short[1] ;
      P0A5B2_n9487PMDias = new boolean[] {false} ;
      P0A5B2_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5B2_n9486PMUlt = new boolean[] {false} ;
      A9478PMEst = "" ;
      A9486PMUlt = GXutil.nullDate() ;
      AV17OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      P0A5B3_A396EmprCod = new String[] {""} ;
      P0A5B3_A9429PMCod = new int[1] ;
      P0A5B3_n9429PMCod = new boolean[] {false} ;
      P0A5B3_A9425OMCod = new int[1] ;
      P0A5B3_A9445OMEst = new String[] {""} ;
      P0A5B3_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      A9445OMEst = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV19Tab_pmcod = new int[1000] ;
      AV20Tab_pmord = new int[1000] ;
      AV21Tab_Pmest = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV21Tab_Pmest[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0A5B6_A396EmprCod = new String[] {""} ;
      P0A5B6_A9487PMDias = new short[1] ;
      P0A5B6_n9487PMDias = new boolean[] {false} ;
      P0A5B6_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5B6_n9486PMUlt = new boolean[] {false} ;
      P0A5B6_A9476PMMaqCod = new String[] {""} ;
      P0A5B6_n9476PMMaqCod = new boolean[] {false} ;
      P0A5B6_A9483PMTxt = new String[] {""} ;
      P0A5B6_n9483PMTxt = new boolean[] {false} ;
      P0A5B6_A9429PMCod = new int[1] ;
      P0A5B6_n9429PMCod = new boolean[] {false} ;
      P0A5B6_A9478PMEst = new String[] {""} ;
      P0A5B6_n9478PMEst = new boolean[] {false} ;
      P0A5B6_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5B6_n9484PMIni = new boolean[] {false} ;
      P0A5B6_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5B6_n9485PMFin = new boolean[] {false} ;
      P0A5B6_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5B6_n11454PMUso = new boolean[] {false} ;
      P0A5B6_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5B6_n13013PMUsoMts = new boolean[] {false} ;
      P0A5B6_A9488PMOrd = new int[1] ;
      P0A5B6_n9488PMOrd = new boolean[] {false} ;
      P0A5B6_A14275PMDiasPavi = new short[1] ;
      P0A5B6_n14275PMDiasPavi = new boolean[] {false} ;
      A9476PMMaqCod = "" ;
      A9483PMTxt = "" ;
      A9484PMIni = GXutil.nullDate() ;
      A9485PMFin = GXutil.nullDate() ;
      A11454PMUso = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      Gx_msg = "" ;
      AV23Horas = DecimalUtil.ZERO ;
      AV24PmUsoMts = DecimalUtil.ZERO ;
      GXt_decimal6 = DecimalUtil.ZERO ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      A9426OMMaqCod = "" ;
      A9437OMUsuCre = "" ;
      A9433OMTxt = "" ;
      Gx_emsg = "" ;
      P0A5B8_A396EmprCod = new String[] {""} ;
      P0A5B8_A9429PMCod = new int[1] ;
      P0A5B8_n9429PMCod = new boolean[] {false} ;
      P0A5B8_A9491PMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5B8_A9489PMRepCod = new int[1] ;
      A9491PMRRCnt = DecimalUtil.ZERO ;
      AV26PMRRCnt = DecimalUtil.ZERO ;
      AV27ServerNow = GXutil.resetTime( GXutil.nullDate() );
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime13 = new java.util.Date[1] ;
      P0A5B9_A396EmprCod = new String[] {""} ;
      P0A5B9_A9429PMCod = new int[1] ;
      P0A5B9_n9429PMCod = new boolean[] {false} ;
      P0A5B9_A9481PMOpeRes = new int[1] ;
      P0A5B9_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5B9_n2505OpePreHor = new boolean[] {false} ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A9458OMMTpo = "" ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      P0A5B11_A396EmprCod = new String[] {""} ;
      P0A5B11_A9429PMCod = new int[1] ;
      P0A5B11_n9429PMCod = new boolean[] {false} ;
      P0A5B11_A11450PMMEquCod = new String[] {""} ;
      P0A5B11_A11452PMMPieCod = new String[] {""} ;
      P0A5B11_A11451PMMSEqCod = new String[] {""} ;
      A11450PMMEquCod = "" ;
      A11452PMMPieCod = "" ;
      A11451PMMSEqCod = "" ;
      A11446OMMEquCod = "" ;
      A11448OMMPieCod = "" ;
      A11447OMMSEqCod = "" ;
      P0A5B13_A396EmprCod = new String[] {""} ;
      P0A5B13_A9429PMCod = new int[1] ;
      P0A5B13_n9429PMCod = new boolean[] {false} ;
      P0A5B13_A9479PMTCod = new int[1] ;
      P0A5B13_A9480PMTDsc = new String[] {""} ;
      P0A5B13_n9480PMTDsc = new boolean[] {false} ;
      A9480PMTDsc = "" ;
      P0A5B15_A396EmprCod = new String[] {""} ;
      P0A5B15_A9429PMCod = new int[1] ;
      P0A5B15_n9429PMCod = new boolean[] {false} ;
      P0A5B15_A9479PMTCod = new int[1] ;
      P0A5B15_A12644TMPMMEquCo = new String[] {""} ;
      P0A5B15_A12645TMPMMSEqCo = new String[] {""} ;
      P0A5B15_A12646TMPMMPieCo = new String[] {""} ;
      A12644TMPMMEquCo = "" ;
      A12645TMPMMSEqCo = "" ;
      A12646TMPMMPieCo = "" ;
      A12636TMOMMEquCo = "" ;
      A12637TMOMMSEqCo = "" ;
      A12638TMOMMPieCo = "" ;
      P0A5B17_A9429PMCod = new int[1] ;
      P0A5B17_n9429PMCod = new boolean[] {false} ;
      P0A5B17_A396EmprCod = new String[] {""} ;
      P0A5B17_A9488PMOrd = new int[1] ;
      P0A5B17_n9488PMOrd = new boolean[] {false} ;
      P0A5B17_A9478PMEst = new String[] {""} ;
      P0A5B17_n9478PMEst = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimiento.popmpregen__default(),
         new Object[] {
             new Object[] {
            P0A5B2_A396EmprCod, P0A5B2_A9429PMCod, P0A5B2_A9488PMOrd, P0A5B2_n9488PMOrd, P0A5B2_A9478PMEst, P0A5B2_n9478PMEst, P0A5B2_A9487PMDias, P0A5B2_n9487PMDias, P0A5B2_A9486PMUlt, P0A5B2_n9486PMUlt
            }
            , new Object[] {
            P0A5B3_A396EmprCod, P0A5B3_A9429PMCod, P0A5B3_n9429PMCod, P0A5B3_A9425OMCod, P0A5B3_A9445OMEst, P0A5B3_A9439OMFchCer
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A5B6_A396EmprCod, P0A5B6_A9487PMDias, P0A5B6_n9487PMDias, P0A5B6_A9486PMUlt, P0A5B6_n9486PMUlt, P0A5B6_A9476PMMaqCod, P0A5B6_n9476PMMaqCod, P0A5B6_A9483PMTxt, P0A5B6_n9483PMTxt, P0A5B6_A9429PMCod,
            P0A5B6_A9478PMEst, P0A5B6_n9478PMEst, P0A5B6_A9484PMIni, P0A5B6_n9484PMIni, P0A5B6_A9485PMFin, P0A5B6_n9485PMFin, P0A5B6_A11454PMUso, P0A5B6_n11454PMUso, P0A5B6_A13013PMUsoMts, P0A5B6_n13013PMUsoMts,
            P0A5B6_A9488PMOrd, P0A5B6_n9488PMOrd, P0A5B6_A14275PMDiasPavi, P0A5B6_n14275PMDiasPavi
            }
            , new Object[] {
            }
            , new Object[] {
            P0A5B8_A396EmprCod, P0A5B8_A9429PMCod, P0A5B8_A9491PMRRCnt, P0A5B8_A9489PMRepCod
            }
            , new Object[] {
            P0A5B9_A396EmprCod, P0A5B9_A9429PMCod, P0A5B9_A9481PMOpeRes, P0A5B9_A2505OpePreHor, P0A5B9_n2505OpePreHor
            }
            , new Object[] {
            }
            , new Object[] {
            P0A5B11_A396EmprCod, P0A5B11_A9429PMCod, P0A5B11_A11450PMMEquCod, P0A5B11_A11452PMMPieCod, P0A5B11_A11451PMMSEqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0A5B13_A396EmprCod, P0A5B13_A9429PMCod, P0A5B13_A9479PMTCod, P0A5B13_A9480PMTDsc, P0A5B13_n9480PMTDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P0A5B15_A396EmprCod, P0A5B15_A9429PMCod, P0A5B15_A9479PMTCod, P0A5B15_A12644TMPMMEquCo, P0A5B15_A12645TMPMMSEqCo, P0A5B15_A12646TMPMMPieCo
            }
            , new Object[] {
            }
            , new Object[] {
            P0A5B17_A9429PMCod, P0A5B17_A396EmprCod, P0A5B17_A9488PMOrd, P0A5B17_n9488PMOrd, P0A5B17_A9478PMEst, P0A5B17_n9478PMEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Ok ;
   private byte AV32GXLvl15 ;
   private byte GXv_int11[] ;
   private short A9487PMDias ;
   private short AV22i ;
   private short A14275PMDiasPavi ;
   private short Gx_err ;
   private int AV8PMCodInout ;
   private int AV13MTMovCod ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int A9425OMCod ;
   private int GX_I ;
   private int AV19Tab_pmcod[] ;
   private int AV20Tab_pmord[] ;
   private int GX_INS1232 ;
   private int AV25OMCod ;
   private int GXt_int8 ;
   private int A9489PMRepCod ;
   private int GXv_int5[] ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int A9481PMOpeRes ;
   private int GX_INS1234 ;
   private int A9455OMOpeCod ;
   private int GX_INS1531 ;
   private int A9479PMTCod ;
   private int GX_INS1530 ;
   private int W9430TMCod ;
   private int A9430TMCod ;
   private int GX_INS1736 ;
   private int AV28Pmcod ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal AV23Horas ;
   private java.math.BigDecimal AV24PmUsoMts ;
   private java.math.BigDecimal GXt_decimal6 ;
   private java.math.BigDecimal A9491PMRRCnt ;
   private java.math.BigDecimal AV26PMRRCnt ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal A2505OpePreHor ;
   private java.math.BigDecimal A9460OMMRPre ;
   private String A396EmprCod ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String AV10EmprCod ;
   private String AV11EmprNom ;
   private String AV12UsurCod ;
   private String AV14MTMovNom ;
   private String scmdbuf ;
   private String A9478PMEst ;
   private String A9445OMEst ;
   private String AV21Tab_Pmest[] ;
   private String A9476PMMaqCod ;
   private String W396EmprCod ;
   private String Gx_msg ;
   private String A9426OMMaqCod ;
   private String A9437OMUsuCre ;
   private String Gx_emsg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A9458OMMTpo ;
   private String A11450PMMEquCod ;
   private String A11452PMMPieCod ;
   private String A11451PMMSEqCod ;
   private String A11446OMMEquCod ;
   private String A11448OMMPieCod ;
   private String A11447OMMSEqCod ;
   private String A9480PMTDsc ;
   private String A12644TMPMMEquCo ;
   private String A12645TMPMMSEqCo ;
   private String A12646TMPMMPieCo ;
   private String A12636TMOMMEquCo ;
   private String A12637TMOMMSEqCo ;
   private String A12638TMOMMPieCo ;
   private java.util.Date AV16Now ;
   private java.util.Date AV17OMFchCer ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV27ServerNow ;
   private java.util.Date GXv_dtime13[] ;
   private java.util.Date AV15Fecha ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9485PMFin ;
   private java.util.Date A9438OMFchPre ;
   private boolean n9429PMCod ;
   private boolean n9488PMOrd ;
   private boolean n9478PMEst ;
   private boolean n9487PMDias ;
   private boolean n9486PMUlt ;
   private boolean n9476PMMaqCod ;
   private boolean n9483PMTxt ;
   private boolean n9484PMIni ;
   private boolean n9485PMFin ;
   private boolean n11454PMUso ;
   private boolean n13013PMUsoMts ;
   private boolean n14275PMDiasPavi ;
   private boolean n2505OpePreHor ;
   private boolean n9480PMTDsc ;
   private String A9483PMTxt ;
   private String A9433OMTxt ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5B2_A396EmprCod ;
   private int[] P0A5B2_A9429PMCod ;
   private boolean[] P0A5B2_n9429PMCod ;
   private int[] P0A5B2_A9488PMOrd ;
   private boolean[] P0A5B2_n9488PMOrd ;
   private String[] P0A5B2_A9478PMEst ;
   private boolean[] P0A5B2_n9478PMEst ;
   private short[] P0A5B2_A9487PMDias ;
   private boolean[] P0A5B2_n9487PMDias ;
   private java.util.Date[] P0A5B2_A9486PMUlt ;
   private boolean[] P0A5B2_n9486PMUlt ;
   private String[] P0A5B3_A396EmprCod ;
   private int[] P0A5B3_A9429PMCod ;
   private boolean[] P0A5B3_n9429PMCod ;
   private int[] P0A5B3_A9425OMCod ;
   private String[] P0A5B3_A9445OMEst ;
   private java.util.Date[] P0A5B3_A9439OMFchCer ;
   private String[] P0A5B6_A396EmprCod ;
   private short[] P0A5B6_A9487PMDias ;
   private boolean[] P0A5B6_n9487PMDias ;
   private java.util.Date[] P0A5B6_A9486PMUlt ;
   private boolean[] P0A5B6_n9486PMUlt ;
   private String[] P0A5B6_A9476PMMaqCod ;
   private boolean[] P0A5B6_n9476PMMaqCod ;
   private String[] P0A5B6_A9483PMTxt ;
   private boolean[] P0A5B6_n9483PMTxt ;
   private int[] P0A5B6_A9429PMCod ;
   private boolean[] P0A5B6_n9429PMCod ;
   private String[] P0A5B6_A9478PMEst ;
   private boolean[] P0A5B6_n9478PMEst ;
   private java.util.Date[] P0A5B6_A9484PMIni ;
   private boolean[] P0A5B6_n9484PMIni ;
   private java.util.Date[] P0A5B6_A9485PMFin ;
   private boolean[] P0A5B6_n9485PMFin ;
   private java.math.BigDecimal[] P0A5B6_A11454PMUso ;
   private boolean[] P0A5B6_n11454PMUso ;
   private java.math.BigDecimal[] P0A5B6_A13013PMUsoMts ;
   private boolean[] P0A5B6_n13013PMUsoMts ;
   private int[] P0A5B6_A9488PMOrd ;
   private boolean[] P0A5B6_n9488PMOrd ;
   private short[] P0A5B6_A14275PMDiasPavi ;
   private boolean[] P0A5B6_n14275PMDiasPavi ;
   private String[] P0A5B8_A396EmprCod ;
   private int[] P0A5B8_A9429PMCod ;
   private boolean[] P0A5B8_n9429PMCod ;
   private java.math.BigDecimal[] P0A5B8_A9491PMRRCnt ;
   private int[] P0A5B8_A9489PMRepCod ;
   private String[] P0A5B9_A396EmprCod ;
   private int[] P0A5B9_A9429PMCod ;
   private boolean[] P0A5B9_n9429PMCod ;
   private int[] P0A5B9_A9481PMOpeRes ;
   private java.math.BigDecimal[] P0A5B9_A2505OpePreHor ;
   private boolean[] P0A5B9_n2505OpePreHor ;
   private String[] P0A5B11_A396EmprCod ;
   private int[] P0A5B11_A9429PMCod ;
   private boolean[] P0A5B11_n9429PMCod ;
   private String[] P0A5B11_A11450PMMEquCod ;
   private String[] P0A5B11_A11452PMMPieCod ;
   private String[] P0A5B11_A11451PMMSEqCod ;
   private String[] P0A5B13_A396EmprCod ;
   private int[] P0A5B13_A9429PMCod ;
   private boolean[] P0A5B13_n9429PMCod ;
   private int[] P0A5B13_A9479PMTCod ;
   private String[] P0A5B13_A9480PMTDsc ;
   private boolean[] P0A5B13_n9480PMTDsc ;
   private String[] P0A5B15_A396EmprCod ;
   private int[] P0A5B15_A9429PMCod ;
   private boolean[] P0A5B15_n9429PMCod ;
   private int[] P0A5B15_A9479PMTCod ;
   private String[] P0A5B15_A12644TMPMMEquCo ;
   private String[] P0A5B15_A12645TMPMMSEqCo ;
   private String[] P0A5B15_A12646TMPMMPieCo ;
   private int[] P0A5B17_A9429PMCod ;
   private boolean[] P0A5B17_n9429PMCod ;
   private String[] P0A5B17_A396EmprCod ;
   private int[] P0A5B17_A9488PMOrd ;
   private boolean[] P0A5B17_n9488PMOrd ;
   private String[] P0A5B17_A9478PMEst ;
   private boolean[] P0A5B17_n9478PMEst ;
}

final  class popmpregen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5B2", "SELECT EmprCod, PMCod, PMOrd, PMEst, PMDias, PMUlt FROM TXPMPREVE WHERE (EmprCod = ?) AND (Not (PMOrd = 0)) ORDER BY EmprCod  FOR UPDATE OF PMOrd, PMUlt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5B3", "SELECT EmprCod, PMCod, OMCod, OMEst, OMFchCer FROM TXPMORDEN WHERE (EmprCod = ? and OMCod = ?) AND (PMCod = ?) ORDER BY EmprCod, OMCod  FOR UPDATE OF OMFchCer NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A5B4", "UPDATE TXPMORDEN SET OMFchCer=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMORDEN")
         ,new UpdateCursor("P0A5B5", "UPDATE TXPMPREVE SET PMOrd=?, PMUlt=?  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPREVE")
         ,new ForEachCursor("P0A5B6", "SELECT EmprCod, PMDias, PMUlt, PMMaqCod, PMTxt, PMCod, PMEst, PMIni, PMFin, PMUso, PMUsoMts, PMOrd, PMDiasPavi FROM TXPMPREVE WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A5B7", "INSERT INTO TXPMORDEN(EmprCod, OMCod, OMMaqCod, PMCod, OMTxt, OMFchCre, OMUsuCre, OMFchPre, OMEst, SMCod, OMOpeRes, OMFchCer, OMNot) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMORDEN")
         ,new ForEachCursor("P0A5B8", "SELECT EmprCod, PMCod, PMRRCnt, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5B9", "SELECT T1.EmprCod, T1.PMCod, T1.PMOpeRes AS PMOpeRes, T2.OpePreHor FROM (TXPMPrev1 T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.PMOpeRes) WHERE T1.EmprCod = ? and T1.PMCod = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMOpeRes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A5B10", "INSERT INTO TXPMOrMO(EmprCod, OMCod, OMOpeCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, OMMCUlt) VALUES(?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrMO")
         ,new ForEachCursor("P0A5B11", "SELECT EmprCod, PMCod, PMMEquCod, PMMPieCod, PMMSEqCod FROM TXPMPrev2 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A5B12", "INSERT INTO TXPMOrde1(EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrde1")
         ,new ForEachCursor("P0A5B13", "SELECT T1.EmprCod, T1.PMCod, T1.PMTCod AS PMTCod, T2.TMDsc AS PMTDsc FROM (TXPMPrev3 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.PMTCod) WHERE T1.EmprCod = ? and T1.PMCod = ? ORDER BY T1.EmprCod, T1.PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A5B14", "INSERT INTO TXPMOrde2(EmprCod, OMCod, TMCod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrde2")
         ,new ForEachCursor("P0A5B15", "SELECT EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo FROM TXPMPrevI WHERE EmprCod = ? and PMCod = ? and PMTCod = ? ORDER BY EmprCod, PMCod, PMTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A5B16", "INSERT INTO TXPMOrdeI(EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrdeI")
         ,new ForEachCursor("P0A5B17", "SELECT PMCod, EmprCod, PMOrd, PMEst FROM TXPMPREVE WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod  FOR UPDATE OF PMOrd, PMEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A5B18", "UPDATE TXPMPREVE SET PMOrd=?, PMEst=?  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPREVE")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 2 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setVarchar(5, (String)parms[5], 2000, false);
               stmt.setDateTime(6, (java.util.Date)parms[6], false);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setDate(8, (java.util.Date)parms[8]);
               stmt.setString(9, (String)parms[9], 1);
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
               return;
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
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
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
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
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
               return;
      }
   }

}

