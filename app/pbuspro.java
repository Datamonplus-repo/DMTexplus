package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspro extends GXProcedure
{
   public pbuspro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspro.class ), "" );
   }

   public pbuspro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pbuspro.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pbuspro.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspro.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pbuspro.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pbuspro.this.AV18CliCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "PBUSPRO", "") );
      GXt_int1 = AV24JBMartin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV24JBMartin = GXt_int1 ;
      GXt_int1 = AV25JBP ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "JBP", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV25JBP = GXt_int1 ;
      GXt_int1 = AV28ParArt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PARART", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV28ParArt = GXt_int1 ;
      GXt_int1 = AV29Artextil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV29Artextil = GXt_int1 ;
      GXt_int1 = AV31Parfss ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV31Parfss = GXt_int1 ;
      GXt_int3 = AV32Valor ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PARFSS", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pbuspro.this.AV15EmprCod = GXv_char4[0] ;
      pbuspro.this.GXt_int3 = GXv_int6[0] ;
      AV32Valor = (byte)(GXt_int3) ;
      GXt_int1 = AV33Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV33Torient = GXt_int1 ;
      GXt_int1 = AV37Acabats2013 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV37Acabats2013 = GXt_int1 ;
      GXt_int1 = AV38PqfdesdeFases ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PQFRFS", ""), GXv_int2) ;
      pbuspro.this.GXt_int1 = GXv_int2[0] ;
      AV38PqfdesdeFases = GXt_int1 ;
      /* Using cursor P000E2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, Byte.valueOf(AV24JBMartin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A775ProUltLin = P000E2_A775ProUltLin[0] ;
         A12141ProSta = P000E2_A12141ProSta[0] ;
         A12142ProStFec = P000E2_A12142ProStFec[0] ;
         A758ProCod = P000E2_A758ProCod[0] ;
         A252CliCod = P000E2_A252CliCod[0] ;
         A65ArtCod = P000E2_A65ArtCod[0] ;
         A396EmprCod = P000E2_A396EmprCod[0] ;
         A775ProUltLin = P000E2_A775ProUltLin[0] ;
         W396EmprCod = A396EmprCod ;
         AV19ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPDISLIN

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         A396EmprCod = AV15EmprCod ;
         A361DisCod = AV16DisCod ;
         A758ProCod = AV19ProCod ;
         A846UltFasLin = A775ProUltLin ;
         A12143ProSts = A12141ProSta ;
         n12143ProSts = false ;
         A12144ProStsFec = A12142ProStFec ;
         n12144ProStsFec = false ;
         /* Using cursor P000E3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin), Boolean.valueOf(n12143ProSts), Byte.valueOf(A12143ProSts), Boolean.valueOf(n12144ProStsFec), A12144ProStsFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         if ( (pr_default.getStatus(1) == 1) )
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
         A758ProCod = W758ProCod ;
         /* End Insert */
         AV26Disquilin = (short)(1) ;
         AV35Act_nrq = (byte)(0) ;
         /* Using cursor P000E4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, AV19ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5735ProFasNot = P000E4_A5735ProFasNot[0] ;
            n5735ProFasNot = P000E4_n5735ProFasNot[0] ;
            A774ProNumLin = P000E4_A774ProNumLin[0] ;
            A7744FasPreObl = P000E4_A7744FasPreObl[0] ;
            n7744FasPreObl = P000E4_n7744FasPreObl[0] ;
            A758ProCod = P000E4_A758ProCod[0] ;
            A396EmprCod = P000E4_A396EmprCod[0] ;
            A457FasCod = P000E4_A457FasCod[0] ;
            A602MaqCod = P000E4_A602MaqCod[0] ;
            n602MaqCod = P000E4_n602MaqCod[0] ;
            A7744FasPreObl = P000E4_A7744FasPreObl[0] ;
            n7744FasPreObl = P000E4_n7744FasPreObl[0] ;
            A602MaqCod = P000E4_A602MaqCod[0] ;
            n602MaqCod = P000E4_n602MaqCod[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            AV22FasCod = A457FasCod ;
            AV30ProNumLin = A774ProNumLin ;
            AV36Maqcod = A602MaqCod ;
            /* Execute user subroutine: 'ARTFOR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV34Num_rq > 1 )
            {
               AV35Act_nrq = (byte)(1) ;
            }
            /*
               INSERT RECORD ON TABLE TXPDISFAS

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            W457FasCod = A457FasCod ;
            A396EmprCod = AV15EmprCod ;
            A361DisCod = AV16DisCod ;
            A758ProCod = AV19ProCod ;
            A368DisFasLin = A774ProNumLin ;
            A457FasCod = AV22FasCod ;
            /* Using cursor P000E5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            A457FasCod = W457FasCod ;
            /* End Insert */
            if ( AV29Artextil == 1 )
            {
               AV30ProNumLin = A774ProNumLin ;
               /* Using cursor P000E6 */
               pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod), AV19ProCod, Short.valueOf(A774ProNumLin), A457FasCod, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A368DisFasLin = P000E6_A368DisFasLin[0] ;
                  A758ProCod = P000E6_A758ProCod[0] ;
                  A361DisCod = P000E6_A361DisCod[0] ;
                  A396EmprCod = P000E6_A396EmprCod[0] ;
                  A7740DisFasPre = P000E6_A7740DisFasPre[0] ;
                  n7740DisFasPre = P000E6_n7740DisFasPre[0] ;
                  A7742DisFasDto = P000E6_A7742DisFasDto[0] ;
                  n7742DisFasDto = P000E6_n7742DisFasDto[0] ;
                  A7741DisFasUni = P000E6_A7741DisFasUni[0] ;
                  n7741DisFasUni = P000E6_n7741DisFasUni[0] ;
                  GXt_int7 = (long)(DecimalUtil.decToDouble(A7740DisFasPre)) ;
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int6[0] = A361DisCod ;
                  GXv_char4[0] = A457FasCod ;
                  GXv_int8[0] = (short)(0) ;
                  GXv_char9[0] = httpContext.getMessage( "P", "") ;
                  GXv_int10[0] = GXt_int7 ;
                  new app.partpre(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4, GXv_int8, GXv_char9, GXv_int10) ;
                  pbuspro.this.A396EmprCod = GXv_char5[0] ;
                  pbuspro.this.A361DisCod = GXv_int6[0] ;
                  pbuspro.this.A457FasCod = GXv_char4[0] ;
                  pbuspro.this.GXt_int7 = GXv_int10[0] ;
                  A7740DisFasPre = DecimalUtil.doubleToDec(GXt_int7) ;
                  n7740DisFasPre = false ;
                  GXt_int7 = (long)(DecimalUtil.decToDouble(A7742DisFasDto)) ;
                  GXv_char9[0] = A396EmprCod ;
                  GXv_int6[0] = A361DisCod ;
                  GXv_char5[0] = A457FasCod ;
                  GXv_int8[0] = (short)(0) ;
                  GXv_char4[0] = httpContext.getMessage( "D", "") ;
                  GXv_int10[0] = GXt_int7 ;
                  new app.partpre(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char5, GXv_int8, GXv_char4, GXv_int10) ;
                  pbuspro.this.A396EmprCod = GXv_char9[0] ;
                  pbuspro.this.A361DisCod = GXv_int6[0] ;
                  pbuspro.this.A457FasCod = GXv_char5[0] ;
                  pbuspro.this.GXt_int7 = GXv_int10[0] ;
                  A7742DisFasDto = DecimalUtil.doubleToDec(GXt_int7) ;
                  n7742DisFasDto = false ;
                  GXt_char11 = A7741DisFasUni ;
                  GXv_char9[0] = A396EmprCod ;
                  GXv_int6[0] = A361DisCod ;
                  GXv_char5[0] = A457FasCod ;
                  GXv_int8[0] = (short)(0) ;
                  GXv_char4[0] = httpContext.getMessage( "T", "") ;
                  GXv_char12[0] = GXt_char11 ;
                  new app.partpre2(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char5, GXv_int8, GXv_char4, GXv_char12) ;
                  pbuspro.this.A396EmprCod = GXv_char9[0] ;
                  pbuspro.this.A361DisCod = GXv_int6[0] ;
                  pbuspro.this.A457FasCod = GXv_char5[0] ;
                  pbuspro.this.GXt_char11 = GXv_char12[0] ;
                  A7741DisFasUni = GXt_char11 ;
                  n7741DisFasUni = false ;
                  /* Using cursor P000E7 */
                  pr_default.execute(5, new Object[] {Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
            }
            if ( AV28ParArt == 0 )
            {
               if ( ( AV31Parfss == 1 ) && ( AV32Valor == 1 ) )
               {
                  if ( AV37Acabats2013 == 1 )
                  {
                     /* Using cursor P000E8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, AV19ProCod, AV22FasCod, AV36Maqcod});
                     while ( (pr_default.getStatus(6) != 101) )
                     {
                        A9828ParFMVal = P000E8_A9828ParFMVal[0] ;
                        A9829ParFMObs = P000E8_A9829ParFMObs[0] ;
                        A14077ParFMVal2 = P000E8_A14077ParFMVal2[0] ;
                        A14075ParFMVMin = P000E8_A14075ParFMVMin[0] ;
                        A14076ParFMVMax = P000E8_A14076ParFMVMax[0] ;
                        A14080ParFasPLC = P000E8_A14080ParFasPLC[0] ;
                        A1664ParFasCod = P000E8_A1664ParFasCod[0] ;
                        A9830MaqCodC = P000E8_A9830MaqCodC[0] ;
                        A9836FasCodM = P000E8_A9836FasCodM[0] ;
                        A758ProCod = P000E8_A758ProCod[0] ;
                        A65ArtCod = P000E8_A65ArtCod[0] ;
                        A252CliCod = P000E8_A252CliCod[0] ;
                        W396EmprCod = A396EmprCod ;
                        W758ProCod = A758ProCod ;
                        /*
                           INSERT RECORD ON TABLE TXPDISPAR

                        */
                        W396EmprCod = A396EmprCod ;
                        W758ProCod = A758ProCod ;
                        W1664ParFasCod = A1664ParFasCod ;
                        A396EmprCod = AV15EmprCod ;
                        A361DisCod = AV16DisCod ;
                        A758ProCod = AV19ProCod ;
                        A368DisFasLin = AV30ProNumLin ;
                        A3685DisParVal = A9828ParFMVal ;
                        A3686DisParObs = A9829ParFMObs ;
                        A12672DisParVl2 = A14077ParFMVal2 ;
                        A13989DisParVMn = A14075ParFMVMin ;
                        A13990DisParVMx = A14076ParFMVMax ;
                        A14078DisParPLC = A14080ParFasPLC ;
                        /* Using cursor P000E9 */
                        pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs, A12672DisParVl2, A13989DisParVMn, A13990DisParVMx, A14078DisParPLC});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                        if ( (pr_default.getStatus(7) == 1) )
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
                        A758ProCod = W758ProCod ;
                        A1664ParFasCod = W1664ParFasCod ;
                        /* End Insert */
                        A396EmprCod = W396EmprCod ;
                        A758ProCod = W758ProCod ;
                        pr_default.readNext(6);
                     }
                     pr_default.close(6);
                  }
               }
               else
               {
                  /* Using cursor P000E10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, AV19ProCod, AV22FasCod});
                  while ( (pr_default.getStatus(8) != 101) )
                  {
                     A1668ParFasVal = P000E10_A1668ParFasVal[0] ;
                     A1673ParFasObs = P000E10_A1673ParFasObs[0] ;
                     A12670ParFasVl2 = P000E10_A12670ParFasVl2[0] ;
                     A13220ParOrden = P000E10_A13220ParOrden[0] ;
                     A1664ParFasCod = P000E10_A1664ParFasCod[0] ;
                     A457FasCod = P000E10_A457FasCod[0] ;
                     A758ProCod = P000E10_A758ProCod[0] ;
                     A65ArtCod = P000E10_A65ArtCod[0] ;
                     A252CliCod = P000E10_A252CliCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     /*
                        INSERT RECORD ON TABLE TXPDISPAR

                     */
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     W1664ParFasCod = A1664ParFasCod ;
                     A396EmprCod = AV15EmprCod ;
                     A361DisCod = AV16DisCod ;
                     A758ProCod = AV19ProCod ;
                     A368DisFasLin = AV30ProNumLin ;
                     A3685DisParVal = A1668ParFasVal ;
                     A3686DisParObs = A1673ParFasObs ;
                     A12672DisParVl2 = A12670ParFasVl2 ;
                     A6557DisParOrd = A13220ParOrden ;
                     /* Using cursor P000E11 */
                     pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs, Short.valueOf(A6557DisParOrd), A12672DisParVl2});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                     if ( (pr_default.getStatus(9) == 1) )
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
                     A758ProCod = W758ProCod ;
                     A1664ParFasCod = W1664ParFasCod ;
                     /* End Insert */
                     A396EmprCod = W396EmprCod ;
                     A758ProCod = W758ProCod ;
                     pr_default.readNext(8);
                  }
                  pr_default.close(8);
               }
            }
            else
            {
               /* Using cursor P000E12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A6986NumLinPro = P000E12_A6986NumLinPro[0] ;
                  A6989ParFasValp = P000E12_A6989ParFasValp[0] ;
                  n6989ParFasValp = P000E12_n6989ParFasValp[0] ;
                  A6990ParFasObsp = P000E12_A6990ParFasObsp[0] ;
                  n6990ParFasObsp = P000E12_n6990ParFasObsp[0] ;
                  A1664ParFasCod = P000E12_A1664ParFasCod[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPDISPAR

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  A396EmprCod = AV15EmprCod ;
                  A361DisCod = AV16DisCod ;
                  A758ProCod = AV19ProCod ;
                  A368DisFasLin = A6986NumLinPro ;
                  A3685DisParVal = A6989ParFasValp ;
                  A3686DisParObs = A6990ParFasObsp ;
                  /* Using cursor P000E13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  /* End Insert */
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(10);
               }
               pr_default.close(10);
            }
            if ( ( AV25JBP == 1 ) && ! (GXutil.strcmp("", A5735ProFasNot)==0) )
            {
               /*
                  INSERT RECORD ON TABLE TXPDISPAR

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               A396EmprCod = AV15EmprCod ;
               A361DisCod = AV16DisCod ;
               A758ProCod = AV19ProCod ;
               A368DisFasLin = A774ProNumLin ;
               A1664ParFasCod = (short)(111) ;
               A3687DisParTxt = A5735ProFasNot ;
               /* Using cursor P000E14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3687DisParTxt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               /* End Insert */
            }
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Return PBUSPRO", "") );
      if ( ( AV33Torient == 1 ) && ( AV35Act_nrq == 1 ) )
      {
         Gx_msg = httpContext.getMessage( "ATENCION. Hay una FASE con mas de UN METODO ¡¡¡", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      if ( AV38PqfdesdeFases == 1 )
      {
         AV26Disquilin = (short)(1) ;
         /* Using cursor P000E15 */
         pr_default.execute(13, new Object[] {AV15EmprCod, AV22FasCod});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A456FasActTin = P000E15_A456FasActTin[0] ;
            n456FasActTin = P000E15_n456FasActTin[0] ;
            A4286FasForMul = P000E15_A4286FasForMul[0] ;
            n4286FasForMul = P000E15_n4286FasForMul[0] ;
            A457FasCod = P000E15_A457FasCod[0] ;
            A396EmprCod = P000E15_A396EmprCod[0] ;
            A764ProForCod = P000E15_A764ProForCod[0] ;
            A4650FasForLin = P000E15_A4650FasForLin[0] ;
            A456FasActTin = P000E15_A456FasActTin[0] ;
            n456FasActTin = P000E15_n456FasActTin[0] ;
            A4286FasForMul = P000E15_A4286FasForMul[0] ;
            n4286FasForMul = P000E15_n4286FasForMul[0] ;
            if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
            {
               AV27ARTPROCOD = A764ProForCod ;
               /* Execute user subroutine: 'CREODISQUI' */
               S1214 ();
               if ( returnInSub )
               {
                  pr_default.close(13);
                  pr_default.close(13);
                  returnInSub = true;
                  if (true) return;
               }
            }
            pr_default.readNext(13);
         }
         pr_default.close(13);
      }
      else
      {
         AV27ARTPROCOD = " " ;
         AV26Disquilin = (short)(1) ;
         AV34Num_rq = (short)(0) ;
         /* Using cursor P000E16 */
         pr_default.execute(14, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, AV19ProCod});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A758ProCod = P000E16_A758ProCod[0] ;
            A65ArtCod = P000E16_A65ArtCod[0] ;
            A252CliCod = P000E16_A252CliCod[0] ;
            A396EmprCod = P000E16_A396EmprCod[0] ;
            A4898ArtProCod = P000E16_A4898ArtProCod[0] ;
            A457FasCod = P000E16_A457FasCod[0] ;
            A456FasActTin = P000E16_A456FasActTin[0] ;
            n456FasActTin = P000E16_n456FasActTin[0] ;
            A4286FasForMul = P000E16_A4286FasForMul[0] ;
            n4286FasForMul = P000E16_n4286FasForMul[0] ;
            A4897ArtProLin = P000E16_A4897ArtProLin[0] ;
            A456FasActTin = P000E16_A456FasActTin[0] ;
            n456FasActTin = P000E16_n456FasActTin[0] ;
            A4286FasForMul = P000E16_A4286FasForMul[0] ;
            n4286FasForMul = P000E16_n4286FasForMul[0] ;
            AV27ARTPROCOD = GXutil.substring( A4898ArtProCod, 1, 6) ;
            if ( GXutil.strcmp(AV22FasCod, A457FasCod) == 0 )
            {
               if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  /* Execute user subroutine: 'CREODISQUI' */
                  S1214 ();
                  if ( returnInSub )
                  {
                     pr_default.close(14);
                     pr_default.close(14);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV34Num_rq = (short)(AV34Num_rq+1) ;
               }
            }
            pr_default.readNext(14);
         }
         pr_default.close(14);
      }
   }

   public void S1214( )
   {
      /* 'CREODISQUI' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPDISQUI

      */
      A396EmprCod = AV15EmprCod ;
      A361DisCod = AV16DisCod ;
      A758ProCod = AV19ProCod ;
      A368DisFasLin = AV30ProNumLin ;
      A5377DisQuiLin = AV26Disquilin ;
      A764ProForCod = AV27ARTPROCOD ;
      A5378DisQuiNp = (short)(0) ;
      A5379DisQuiTp = (short)(0) ;
      A5380DisQuiRb = (short)(0) ;
      A5489DisQuiDsc = " " ;
      /* Using cursor P000E17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
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
      /* End Insert */
      AV26Disquilin = (short)(AV26Disquilin+1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspro.this.AV15EmprCod;
      this.aP1[0] = pbuspro.this.AV16DisCod;
      this.aP2[0] = pbuspro.this.AV17ArtCod;
      this.aP3[0] = pbuspro.this.AV18CliCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbuspro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P000E2_A775ProUltLin = new short[1] ;
      P000E2_A12141ProSta = new byte[1] ;
      P000E2_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000E2_A758ProCod = new String[] {""} ;
      P000E2_A252CliCod = new int[1] ;
      P000E2_A65ArtCod = new String[] {""} ;
      P000E2_A396EmprCod = new String[] {""} ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      AV19ProCod = "" ;
      W758ProCod = "" ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      P000E4_A5735ProFasNot = new String[] {""} ;
      P000E4_n5735ProFasNot = new boolean[] {false} ;
      P000E4_A774ProNumLin = new short[1] ;
      P000E4_A7744FasPreObl = new byte[1] ;
      P000E4_n7744FasPreObl = new boolean[] {false} ;
      P000E4_A758ProCod = new String[] {""} ;
      P000E4_A396EmprCod = new String[] {""} ;
      P000E4_A457FasCod = new String[] {""} ;
      P000E4_A602MaqCod = new String[] {""} ;
      P000E4_n602MaqCod = new boolean[] {false} ;
      A5735ProFasNot = "" ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      AV22FasCod = "" ;
      AV36Maqcod = "" ;
      W457FasCod = "" ;
      P000E6_A457FasCod = new String[] {""} ;
      P000E6_A7744FasPreObl = new byte[1] ;
      P000E6_n7744FasPreObl = new boolean[] {false} ;
      P000E6_A368DisFasLin = new short[1] ;
      P000E6_A758ProCod = new String[] {""} ;
      P000E6_A361DisCod = new int[1] ;
      P000E6_A396EmprCod = new String[] {""} ;
      P000E6_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000E6_n7740DisFasPre = new boolean[] {false} ;
      P000E6_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000E6_n7742DisFasDto = new boolean[] {false} ;
      P000E6_A7741DisFasUni = new String[] {""} ;
      P000E6_n7741DisFasUni = new boolean[] {false} ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      GXv_int10 = new long[1] ;
      GXt_char11 = "" ;
      GXv_char9 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char12 = new String[1] ;
      P000E8_A396EmprCod = new String[] {""} ;
      P000E8_A9828ParFMVal = new String[] {""} ;
      P000E8_A9829ParFMObs = new String[] {""} ;
      P000E8_A14077ParFMVal2 = new String[] {""} ;
      P000E8_A14075ParFMVMin = new String[] {""} ;
      P000E8_A14076ParFMVMax = new String[] {""} ;
      P000E8_A14080ParFasPLC = new String[] {""} ;
      P000E8_A1664ParFasCod = new short[1] ;
      P000E8_A9830MaqCodC = new String[] {""} ;
      P000E8_A9836FasCodM = new String[] {""} ;
      P000E8_A758ProCod = new String[] {""} ;
      P000E8_A65ArtCod = new String[] {""} ;
      P000E8_A252CliCod = new int[1] ;
      A9828ParFMVal = "" ;
      A9829ParFMObs = "" ;
      A14077ParFMVal2 = "" ;
      A14075ParFMVMin = "" ;
      A14076ParFMVMax = "" ;
      A14080ParFasPLC = "" ;
      A9830MaqCodC = "" ;
      A9836FasCodM = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      A12672DisParVl2 = "" ;
      A13989DisParVMn = "" ;
      A13990DisParVMx = "" ;
      A14078DisParPLC = "" ;
      P000E10_A396EmprCod = new String[] {""} ;
      P000E10_A1668ParFasVal = new String[] {""} ;
      P000E10_A1673ParFasObs = new String[] {""} ;
      P000E10_A12670ParFasVl2 = new String[] {""} ;
      P000E10_A13220ParOrden = new short[1] ;
      P000E10_A1664ParFasCod = new short[1] ;
      P000E10_A457FasCod = new String[] {""} ;
      P000E10_A758ProCod = new String[] {""} ;
      P000E10_A65ArtCod = new String[] {""} ;
      P000E10_A252CliCod = new int[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A12670ParFasVl2 = "" ;
      P000E12_A396EmprCod = new String[] {""} ;
      P000E12_A252CliCod = new int[1] ;
      P000E12_A65ArtCod = new String[] {""} ;
      P000E12_A758ProCod = new String[] {""} ;
      P000E12_A6986NumLinPro = new short[1] ;
      P000E12_A6989ParFasValp = new String[] {""} ;
      P000E12_n6989ParFasValp = new boolean[] {false} ;
      P000E12_A6990ParFasObsp = new String[] {""} ;
      P000E12_n6990ParFasObsp = new boolean[] {false} ;
      P000E12_A1664ParFasCod = new short[1] ;
      A6989ParFasValp = "" ;
      A6990ParFasObsp = "" ;
      A3687DisParTxt = "" ;
      Gx_msg = "" ;
      P000E15_A456FasActTin = new String[] {""} ;
      P000E15_n456FasActTin = new boolean[] {false} ;
      P000E15_A4286FasForMul = new String[] {""} ;
      P000E15_n4286FasForMul = new boolean[] {false} ;
      P000E15_A457FasCod = new String[] {""} ;
      P000E15_A396EmprCod = new String[] {""} ;
      P000E15_A764ProForCod = new String[] {""} ;
      P000E15_A4650FasForLin = new short[1] ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A764ProForCod = "" ;
      AV27ARTPROCOD = "" ;
      P000E16_A758ProCod = new String[] {""} ;
      P000E16_A65ArtCod = new String[] {""} ;
      P000E16_A252CliCod = new int[1] ;
      P000E16_A396EmprCod = new String[] {""} ;
      P000E16_A4898ArtProCod = new String[] {""} ;
      P000E16_A457FasCod = new String[] {""} ;
      P000E16_A456FasActTin = new String[] {""} ;
      P000E16_n456FasActTin = new boolean[] {false} ;
      P000E16_A4286FasForMul = new String[] {""} ;
      P000E16_n4286FasForMul = new boolean[] {false} ;
      P000E16_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      A5489DisQuiDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspro__default(),
         new Object[] {
             new Object[] {
            P000E2_A775ProUltLin, P000E2_A12141ProSta, P000E2_A12142ProStFec, P000E2_A758ProCod, P000E2_A252CliCod, P000E2_A65ArtCod, P000E2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000E4_A5735ProFasNot, P000E4_n5735ProFasNot, P000E4_A774ProNumLin, P000E4_A7744FasPreObl, P000E4_n7744FasPreObl, P000E4_A758ProCod, P000E4_A396EmprCod, P000E4_A457FasCod, P000E4_A602MaqCod, P000E4_n602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000E6_A457FasCod, P000E6_A7744FasPreObl, P000E6_n7744FasPreObl, P000E6_A368DisFasLin, P000E6_A758ProCod, P000E6_A361DisCod, P000E6_A396EmprCod, P000E6_A7740DisFasPre, P000E6_n7740DisFasPre, P000E6_A7742DisFasDto,
            P000E6_n7742DisFasDto, P000E6_A7741DisFasUni, P000E6_n7741DisFasUni
            }
            , new Object[] {
            }
            , new Object[] {
            P000E8_A396EmprCod, P000E8_A9828ParFMVal, P000E8_A9829ParFMObs, P000E8_A14077ParFMVal2, P000E8_A14075ParFMVMin, P000E8_A14076ParFMVMax, P000E8_A14080ParFasPLC, P000E8_A1664ParFasCod, P000E8_A9830MaqCodC, P000E8_A9836FasCodM,
            P000E8_A758ProCod, P000E8_A65ArtCod, P000E8_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000E10_A396EmprCod, P000E10_A1668ParFasVal, P000E10_A1673ParFasObs, P000E10_A12670ParFasVl2, P000E10_A13220ParOrden, P000E10_A1664ParFasCod, P000E10_A457FasCod, P000E10_A758ProCod, P000E10_A65ArtCod, P000E10_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000E12_A396EmprCod, P000E12_A252CliCod, P000E12_A65ArtCod, P000E12_A758ProCod, P000E12_A6986NumLinPro, P000E12_A6989ParFasValp, P000E12_n6989ParFasValp, P000E12_A6990ParFasObsp, P000E12_n6990ParFasObsp, P000E12_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000E15_A456FasActTin, P000E15_n456FasActTin, P000E15_A4286FasForMul, P000E15_n4286FasForMul, P000E15_A457FasCod, P000E15_A396EmprCod, P000E15_A764ProForCod, P000E15_A4650FasForLin
            }
            , new Object[] {
            P000E16_A758ProCod, P000E16_A65ArtCod, P000E16_A252CliCod, P000E16_A396EmprCod, P000E16_A4898ArtProCod, P000E16_A457FasCod, P000E16_A456FasActTin, P000E16_n456FasActTin, P000E16_A4286FasForMul, P000E16_n4286FasForMul,
            P000E16_A4897ArtProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24JBMartin ;
   private byte AV25JBP ;
   private byte AV28ParArt ;
   private byte AV29Artextil ;
   private byte AV31Parfss ;
   private byte AV32Valor ;
   private byte AV33Torient ;
   private byte AV37Acabats2013 ;
   private byte AV38PqfdesdeFases ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A12141ProSta ;
   private byte A12143ProSts ;
   private byte AV35Act_nrq ;
   private byte A7744FasPreObl ;
   private short A775ProUltLin ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private short AV26Disquilin ;
   private short A774ProNumLin ;
   private short AV30ProNumLin ;
   private short AV34Num_rq ;
   private short A368DisFasLin ;
   private short GXv_int8[] ;
   private short A1664ParFasCod ;
   private short W1664ParFasCod ;
   private short A13220ParOrden ;
   private short A6557DisParOrd ;
   private short A6986NumLinPro ;
   private short A4650FasForLin ;
   private short A4897ArtProLin ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private int AV16DisCod ;
   private int AV18CliCod ;
   private int GXt_int3 ;
   private int A252CliCod ;
   private int GX_INS38 ;
   private int A361DisCod ;
   private int GX_INS39 ;
   private int GXv_int6[] ;
   private int GX_INS517 ;
   private int GX_INS780 ;
   private long GXt_int7 ;
   private long GXv_int10[] ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String AV19ProCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String AV22FasCod ;
   private String AV36Maqcod ;
   private String W457FasCod ;
   private String A7741DisFasUni ;
   private String GXt_char11 ;
   private String GXv_char9[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char12[] ;
   private String A9828ParFMVal ;
   private String A14077ParFMVal2 ;
   private String A14075ParFMVMin ;
   private String A14076ParFMVMax ;
   private String A9830MaqCodC ;
   private String A9836FasCodM ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String A12672DisParVl2 ;
   private String A13989DisParVMn ;
   private String A13990DisParVMx ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A12670ParFasVl2 ;
   private String A6989ParFasValp ;
   private String A6990ParFasObsp ;
   private String Gx_msg ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A764ProForCod ;
   private String AV27ARTPROCOD ;
   private String A4898ArtProCod ;
   private String A5489DisQuiDsc ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A12144ProStsFec ;
   private boolean n12143ProSts ;
   private boolean n12144ProStsFec ;
   private boolean n5735ProFasNot ;
   private boolean n7744FasPreObl ;
   private boolean n602MaqCod ;
   private boolean returnInSub ;
   private boolean n7740DisFasPre ;
   private boolean n7742DisFasDto ;
   private boolean n7741DisFasUni ;
   private boolean n6989ParFasValp ;
   private boolean n6990ParFasObsp ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private String A3687DisParTxt ;
   private String A5735ProFasNot ;
   private String A9829ParFMObs ;
   private String A14080ParFasPLC ;
   private String A14078DisParPLC ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P000E2_A775ProUltLin ;
   private byte[] P000E2_A12141ProSta ;
   private java.util.Date[] P000E2_A12142ProStFec ;
   private String[] P000E2_A758ProCod ;
   private int[] P000E2_A252CliCod ;
   private String[] P000E2_A65ArtCod ;
   private String[] P000E2_A396EmprCod ;
   private String[] P000E4_A5735ProFasNot ;
   private boolean[] P000E4_n5735ProFasNot ;
   private short[] P000E4_A774ProNumLin ;
   private byte[] P000E4_A7744FasPreObl ;
   private boolean[] P000E4_n7744FasPreObl ;
   private String[] P000E4_A758ProCod ;
   private String[] P000E4_A396EmprCod ;
   private String[] P000E4_A457FasCod ;
   private String[] P000E4_A602MaqCod ;
   private boolean[] P000E4_n602MaqCod ;
   private String[] P000E6_A457FasCod ;
   private byte[] P000E6_A7744FasPreObl ;
   private boolean[] P000E6_n7744FasPreObl ;
   private short[] P000E6_A368DisFasLin ;
   private String[] P000E6_A758ProCod ;
   private int[] P000E6_A361DisCod ;
   private String[] P000E6_A396EmprCod ;
   private java.math.BigDecimal[] P000E6_A7740DisFasPre ;
   private boolean[] P000E6_n7740DisFasPre ;
   private java.math.BigDecimal[] P000E6_A7742DisFasDto ;
   private boolean[] P000E6_n7742DisFasDto ;
   private String[] P000E6_A7741DisFasUni ;
   private boolean[] P000E6_n7741DisFasUni ;
   private String[] P000E8_A396EmprCod ;
   private String[] P000E8_A9828ParFMVal ;
   private String[] P000E8_A9829ParFMObs ;
   private String[] P000E8_A14077ParFMVal2 ;
   private String[] P000E8_A14075ParFMVMin ;
   private String[] P000E8_A14076ParFMVMax ;
   private String[] P000E8_A14080ParFasPLC ;
   private short[] P000E8_A1664ParFasCod ;
   private String[] P000E8_A9830MaqCodC ;
   private String[] P000E8_A9836FasCodM ;
   private String[] P000E8_A758ProCod ;
   private String[] P000E8_A65ArtCod ;
   private int[] P000E8_A252CliCod ;
   private String[] P000E10_A396EmprCod ;
   private String[] P000E10_A1668ParFasVal ;
   private String[] P000E10_A1673ParFasObs ;
   private String[] P000E10_A12670ParFasVl2 ;
   private short[] P000E10_A13220ParOrden ;
   private short[] P000E10_A1664ParFasCod ;
   private String[] P000E10_A457FasCod ;
   private String[] P000E10_A758ProCod ;
   private String[] P000E10_A65ArtCod ;
   private int[] P000E10_A252CliCod ;
   private String[] P000E12_A396EmprCod ;
   private int[] P000E12_A252CliCod ;
   private String[] P000E12_A65ArtCod ;
   private String[] P000E12_A758ProCod ;
   private short[] P000E12_A6986NumLinPro ;
   private String[] P000E12_A6989ParFasValp ;
   private boolean[] P000E12_n6989ParFasValp ;
   private String[] P000E12_A6990ParFasObsp ;
   private boolean[] P000E12_n6990ParFasObsp ;
   private short[] P000E12_A1664ParFasCod ;
   private String[] P000E15_A456FasActTin ;
   private boolean[] P000E15_n456FasActTin ;
   private String[] P000E15_A4286FasForMul ;
   private boolean[] P000E15_n4286FasForMul ;
   private String[] P000E15_A457FasCod ;
   private String[] P000E15_A396EmprCod ;
   private String[] P000E15_A764ProForCod ;
   private short[] P000E15_A4650FasForLin ;
   private String[] P000E16_A758ProCod ;
   private String[] P000E16_A65ArtCod ;
   private int[] P000E16_A252CliCod ;
   private String[] P000E16_A396EmprCod ;
   private String[] P000E16_A4898ArtProCod ;
   private String[] P000E16_A457FasCod ;
   private String[] P000E16_A456FasActTin ;
   private boolean[] P000E16_n456FasActTin ;
   private String[] P000E16_A4286FasForMul ;
   private boolean[] P000E16_n4286FasForMul ;
   private short[] P000E16_A4897ArtProLin ;
}

final  class pbuspro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000E2", "SELECT T2.ProUltLin, T1.ProSta, T1.ProStFec, T1.ProCod, T1.CliCod, T1.ArtCod, T1.EmprCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?) AND (T1.ProCod like '0%' or ? = 0) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000E3", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, ProSts, ProStsFec, DisFasApr) VALUES(?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P000E4", "SELECT T1.ProFasNot, T1.ProNumLin, T2.FasPreObl, T1.ProCod, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000E5", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasPreObl, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P000E6", "SELECT FasCod, FasPreObl, DisFasLin, ProCod, DisCod, EmprCod, DisFasPre, DisFasDto, DisFasUni FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?) AND (FasCod = ?) AND (FasPreObl = ?) ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P000E7", "UPDATE TXPDISFAS SET DisFasPre=?, DisFasDto=?, DisFasUni=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P000E8", "SELECT EmprCod, ParFMVal, ParFMObs, ParFMVal2, ParFMVMin, ParFMVMax, ParFasPLC, ParFasCod, MaqCodC, FasCodM, ProCod, ArtCod, CliCod FROM TXPCAPFM2 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000E9", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParVl2, DisParVMn, DisParVMx, DisParPLC, DisParTxt, DisParOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P000E10", "SELECT EmprCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasCod, FasCod, ProCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000E11", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParTxt, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P000E12", "SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasValp, ParFasObsp, ParFasCod FROM TXPPARAR1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000E13", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParTxt, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P000E14", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParTxt, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P000E15", "SELECT T2.FasActTin, T2.FasForMul, T1.FasCod, T1.EmprCod, T1.ProForCod, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000E16", "SELECT T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtProCod, T1.FasCod, T2.FasActTin, T2.FasForMul, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000E17", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
            case 5 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 8);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setString(9, (String)parms[8], 12);
               stmt.setString(10, (String)parms[9], 12);
               stmt.setVarchar(11, (String)parms[10], 100, false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLongVarchar(6, (String)parms[5], false);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               return;
      }
   }

}

