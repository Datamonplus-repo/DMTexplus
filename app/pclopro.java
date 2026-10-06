package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclopro extends GXProcedure
{
   public pclopro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclopro.class ), "" );
   }

   public pclopro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pclopro.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pclopro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclopro.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pclopro.this.AV15ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00B12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14284ProEst = P00B12_A14284ProEst[0] ;
         A3802ProPreMin = P00B12_A3802ProPreMin[0] ;
         n3802ProPreMin = P00B12_n3802ProPreMin[0] ;
         A3801ProPreMax = P00B12_A3801ProPreMax[0] ;
         n3801ProPreMax = P00B12_n3801ProPreMax[0] ;
         A3800ProMarPor = P00B12_A3800ProMarPor[0] ;
         n3800ProMarPor = P00B12_n3800ProMarPor[0] ;
         A3799ProMerPor = P00B12_A3799ProMerPor[0] ;
         n3799ProMerPor = P00B12_n3799ProMerPor[0] ;
         A3798ProCosPrd = P00B12_A3798ProCosPrd[0] ;
         n3798ProCosPrd = P00B12_n3798ProCosPrd[0] ;
         A11203ProImBmp4 = P00B12_A11203ProImBmp4[0] ;
         n11203ProImBmp4 = P00B12_n11203ProImBmp4[0] ;
         A11202ProImBmp3 = P00B12_A11202ProImBmp3[0] ;
         n11202ProImBmp3 = P00B12_n11202ProImBmp3[0] ;
         A11201ProImBmp2 = P00B12_A11201ProImBmp2[0] ;
         n11201ProImBmp2 = P00B12_n11201ProImBmp2[0] ;
         A8333ProImBmp = P00B12_A8333ProImBmp[0] ;
         n8333ProImBmp = P00B12_n8333ProImBmp[0] ;
         A8042ProTipT = P00B12_A8042ProTipT[0] ;
         A7795ProTipP = P00B12_A7795ProTipP[0] ;
         A6486ProDscF = P00B12_A6486ProDscF[0] ;
         A5289ProProvi = P00B12_A5289ProProvi[0] ;
         A5254ProDscM = P00B12_A5254ProDscM[0] ;
         n5254ProDscM = P00B12_n5254ProDscM[0] ;
         A4628ProDsc2 = P00B12_A4628ProDsc2[0] ;
         A775ProUltLin = P00B12_A775ProUltLin[0] ;
         A759ProDsc = P00B12_A759ProDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPPROCES

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         A758ProCod = AV15ProCod ;
         /* Using cursor P00B13 */
         pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, A759ProDsc, Short.valueOf(A775ProUltLin), A4628ProDsc2, Boolean.valueOf(n5254ProDscM), A5254ProDscM, A5289ProProvi, A6486ProDscF, A7795ProTipP, Byte.valueOf(A8042ProTipT), Boolean.valueOf(n8333ProImBmp), A8333ProImBmp, Boolean.valueOf(n11201ProImBmp2), A11201ProImBmp2, Boolean.valueOf(n11202ProImBmp3), A11202ProImBmp3, Boolean.valueOf(n11203ProImBmp4), A11203ProImBmp4, Boolean.valueOf(n3798ProCosPrd), A3798ProCosPrd, Boolean.valueOf(n3799ProMerPor), A3799ProMerPor, Boolean.valueOf(n3800ProMarPor), A3800ProMarPor, Boolean.valueOf(n3801ProPreMax), A3801ProPreMax, Boolean.valueOf(n3802ProPreMin), A3802ProPreMin, A14284ProEst});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
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
         /* Using cursor P00B14 */
         pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P00B14_A457FasCod[0] ;
            A774ProNumLin = P00B14_A774ProNumLin[0] ;
            A7911Dtp_UOrd = P00B14_A7911Dtp_UOrd[0] ;
            n7911Dtp_UOrd = P00B14_n7911Dtp_UOrd[0] ;
            A7896Dtp_UnpLt = P00B14_A7896Dtp_UnpLt[0] ;
            n7896Dtp_UnpLt = P00B14_n7896Dtp_UnpLt[0] ;
            A7895Dtp_TpCost = P00B14_A7895Dtp_TpCost[0] ;
            n7895Dtp_TpCost = P00B14_n7895Dtp_TpCost[0] ;
            A7894Dtp_H2OReh = P00B14_A7894Dtp_H2OReh[0] ;
            n7894Dtp_H2OReh = P00B14_n7894Dtp_H2OReh[0] ;
            A7893Dtp_Tpp = P00B14_A7893Dtp_Tpp[0] ;
            n7893Dtp_Tpp = P00B14_n7893Dtp_Tpp[0] ;
            A7892Dtp_FasDsc = P00B14_A7892Dtp_FasDsc[0] ;
            n7892Dtp_FasDsc = P00B14_n7892Dtp_FasDsc[0] ;
            A6437ProUltFP = P00B14_A6437ProUltFP[0] ;
            A5735ProFasNot = P00B14_A5735ProFasNot[0] ;
            n5735ProFasNot = P00B14_n5735ProFasNot[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            AV16FasCod = A457FasCod ;
            AV17ProNumLin = A774ProNumLin ;
            /*
               INSERT RECORD ON TABLE TXPPROLIN

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            W774ProNumLin = A774ProNumLin ;
            W457FasCod = A457FasCod ;
            A758ProCod = AV15ProCod ;
            A774ProNumLin = AV17ProNumLin ;
            A457FasCod = AV16FasCod ;
            /* Using cursor P00B15 */
            pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), A457FasCod, Boolean.valueOf(n5735ProFasNot), A5735ProFasNot, Short.valueOf(A6437ProUltFP), Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7893Dtp_Tpp), A7893Dtp_Tpp, Boolean.valueOf(n7894Dtp_H2OReh), A7894Dtp_H2OReh, Boolean.valueOf(n7895Dtp_TpCost), Short.valueOf(A7895Dtp_TpCost), Boolean.valueOf(n7896Dtp_UnpLt), A7896Dtp_UnpLt, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
            A774ProNumLin = W774ProNumLin ;
            A457FasCod = W457FasCod ;
            /* End Insert */
            /* Using cursor P00B16 */
            pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A11933Dtp_Nh2o = P00B16_A11933Dtp_Nh2o[0] ;
               n11933Dtp_Nh2o = P00B16_n11933Dtp_Nh2o[0] ;
               A7906Dtp_ForUli = P00B16_A7906Dtp_ForUli[0] ;
               n7906Dtp_ForUli = P00B16_n7906Dtp_ForUli[0] ;
               A7905Dtp_ForPhn = P00B16_A7905Dtp_ForPhn[0] ;
               n7905Dtp_ForPhn = P00B16_n7905Dtp_ForPhn[0] ;
               A7904Dtp_ForPhx = P00B16_A7904Dtp_ForPhx[0] ;
               n7904Dtp_ForPhx = P00B16_n7904Dtp_ForPhx[0] ;
               A7903Dtp_ForRb = P00B16_A7903Dtp_ForRb[0] ;
               n7903Dtp_ForRb = P00B16_n7903Dtp_ForRb[0] ;
               A7902Dtp_ForTmx = P00B16_A7902Dtp_ForTmx[0] ;
               n7902Dtp_ForTmx = P00B16_n7902Dtp_ForTmx[0] ;
               A7901Dtp_Fortie = P00B16_A7901Dtp_Fortie[0] ;
               n7901Dtp_Fortie = P00B16_n7901Dtp_Fortie[0] ;
               A7900Dtp_ForFab = P00B16_A7900Dtp_ForFab[0] ;
               n7900Dtp_ForFab = P00B16_n7900Dtp_ForFab[0] ;
               A7898Dtp_CPQ = P00B16_A7898Dtp_CPQ[0] ;
               n7898Dtp_CPQ = P00B16_n7898Dtp_CPQ[0] ;
               A7897Dtp_Ordl = P00B16_A7897Dtp_Ordl[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W774ProNumLin = A774ProNumLin ;
               AV18NumLin = A774ProNumLin ;
               /*
                  INSERT RECORD ON TABLE TXPDT002

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W774ProNumLin = A774ProNumLin ;
               W7897Dtp_Ordl = A7897Dtp_Ordl ;
               A758ProCod = AV15ProCod ;
               A774ProNumLin = AV18NumLin ;
               /* Using cursor P00B17 */
               pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Boolean.valueOf(n7898Dtp_CPQ), A7898Dtp_CPQ, Boolean.valueOf(n7900Dtp_ForFab), A7900Dtp_ForFab, Boolean.valueOf(n7901Dtp_Fortie), Short.valueOf(A7901Dtp_Fortie), Boolean.valueOf(n7902Dtp_ForTmx), Short.valueOf(A7902Dtp_ForTmx), Boolean.valueOf(n7903Dtp_ForRb), A7903Dtp_ForRb, Boolean.valueOf(n7904Dtp_ForPhx), A7904Dtp_ForPhx, Boolean.valueOf(n7905Dtp_ForPhn), A7905Dtp_ForPhn, Boolean.valueOf(n7906Dtp_ForUli), Short.valueOf(A7906Dtp_ForUli), Boolean.valueOf(n11933Dtp_Nh2o), Short.valueOf(A11933Dtp_Nh2o)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
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
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               A774ProNumLin = W774ProNumLin ;
               A7897Dtp_Ordl = W7897Dtp_Ordl ;
               /* End Insert */
               /* Using cursor P00B18 */
               pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A8476Dtp_clave2 = P00B18_A8476Dtp_clave2[0] ;
                  n8476Dtp_clave2 = P00B18_n8476Dtp_clave2[0] ;
                  A8475Dtp_clave1 = P00B18_A8475Dtp_clave1[0] ;
                  n8475Dtp_clave1 = P00B18_n8475Dtp_clave1[0] ;
                  A7910Dtp_Forcan = P00B18_A7910Dtp_Forcan[0] ;
                  n7910Dtp_Forcan = P00B18_n7910Dtp_Forcan[0] ;
                  A490ForPrdUMe = P00B18_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P00B18_n490ForPrdUMe[0] ;
                  A7908Dtp_Prdnum = P00B18_A7908Dtp_Prdnum[0] ;
                  n7908Dtp_Prdnum = P00B18_n7908Dtp_Prdnum[0] ;
                  A7907Dtp_ForLin = P00B18_A7907Dtp_ForLin[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  W774ProNumLin = A774ProNumLin ;
                  W7897Dtp_Ordl = A7897Dtp_Ordl ;
                  AV18NumLin = A774ProNumLin ;
                  /*
                     INSERT RECORD ON TABLE TXPDT0021

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  W774ProNumLin = A774ProNumLin ;
                  W7897Dtp_Ordl = A7897Dtp_Ordl ;
                  W7907Dtp_ForLin = A7907Dtp_ForLin ;
                  A758ProCod = AV15ProCod ;
                  A774ProNumLin = AV18NumLin ;
                  /* Using cursor P00B19 */
                  pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin), Boolean.valueOf(n7908Dtp_Prdnum), A7908Dtp_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7910Dtp_Forcan), A7910Dtp_Forcan, Boolean.valueOf(n8475Dtp_clave1), A8475Dtp_clave1, Boolean.valueOf(n8476Dtp_clave2), A8476Dtp_clave2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
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
                  A774ProNumLin = W774ProNumLin ;
                  A7897Dtp_Ordl = W7897Dtp_Ordl ;
                  A7907Dtp_ForLin = W7907Dtp_ForLin ;
                  /* End Insert */
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  A774ProNumLin = W774ProNumLin ;
                  A7897Dtp_Ordl = W7897Dtp_Ordl ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               A774ProNumLin = W774ProNumLin ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclopro.this.A396EmprCod;
      this.aP1[0] = pclopro.this.A758ProCod;
      this.aP2[0] = pclopro.this.AV15ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclopro");
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
      P00B12_A396EmprCod = new String[] {""} ;
      P00B12_A758ProCod = new String[] {""} ;
      P00B12_A14284ProEst = new String[] {""} ;
      P00B12_A3802ProPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B12_n3802ProPreMin = new boolean[] {false} ;
      P00B12_A3801ProPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B12_n3801ProPreMax = new boolean[] {false} ;
      P00B12_A3800ProMarPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B12_n3800ProMarPor = new boolean[] {false} ;
      P00B12_A3799ProMerPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B12_n3799ProMerPor = new boolean[] {false} ;
      P00B12_A3798ProCosPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B12_n3798ProCosPrd = new boolean[] {false} ;
      P00B12_A11203ProImBmp4 = new String[] {""} ;
      P00B12_n11203ProImBmp4 = new boolean[] {false} ;
      P00B12_A11202ProImBmp3 = new String[] {""} ;
      P00B12_n11202ProImBmp3 = new boolean[] {false} ;
      P00B12_A11201ProImBmp2 = new String[] {""} ;
      P00B12_n11201ProImBmp2 = new boolean[] {false} ;
      P00B12_A8333ProImBmp = new String[] {""} ;
      P00B12_n8333ProImBmp = new boolean[] {false} ;
      P00B12_A8042ProTipT = new byte[1] ;
      P00B12_A7795ProTipP = new String[] {""} ;
      P00B12_A6486ProDscF = new String[] {""} ;
      P00B12_A5289ProProvi = new String[] {""} ;
      P00B12_A5254ProDscM = new String[] {""} ;
      P00B12_n5254ProDscM = new boolean[] {false} ;
      P00B12_A4628ProDsc2 = new String[] {""} ;
      P00B12_A775ProUltLin = new short[1] ;
      P00B12_A759ProDsc = new String[] {""} ;
      A14284ProEst = "" ;
      A3802ProPreMin = DecimalUtil.ZERO ;
      A3801ProPreMax = DecimalUtil.ZERO ;
      A3800ProMarPor = DecimalUtil.ZERO ;
      A3799ProMerPor = DecimalUtil.ZERO ;
      A3798ProCosPrd = DecimalUtil.ZERO ;
      A11203ProImBmp4 = "" ;
      A11202ProImBmp3 = "" ;
      A11201ProImBmp2 = "" ;
      A8333ProImBmp = "" ;
      A7795ProTipP = "" ;
      A6486ProDscF = "" ;
      A5289ProProvi = "" ;
      A5254ProDscM = "" ;
      A4628ProDsc2 = "" ;
      A759ProDsc = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P00B14_A396EmprCod = new String[] {""} ;
      P00B14_A758ProCod = new String[] {""} ;
      P00B14_A457FasCod = new String[] {""} ;
      P00B14_A774ProNumLin = new short[1] ;
      P00B14_A7911Dtp_UOrd = new short[1] ;
      P00B14_n7911Dtp_UOrd = new boolean[] {false} ;
      P00B14_A7896Dtp_UnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B14_n7896Dtp_UnpLt = new boolean[] {false} ;
      P00B14_A7895Dtp_TpCost = new short[1] ;
      P00B14_n7895Dtp_TpCost = new boolean[] {false} ;
      P00B14_A7894Dtp_H2OReh = new String[] {""} ;
      P00B14_n7894Dtp_H2OReh = new boolean[] {false} ;
      P00B14_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B14_n7893Dtp_Tpp = new boolean[] {false} ;
      P00B14_A7892Dtp_FasDsc = new String[] {""} ;
      P00B14_n7892Dtp_FasDsc = new boolean[] {false} ;
      P00B14_A6437ProUltFP = new short[1] ;
      P00B14_A5735ProFasNot = new String[] {""} ;
      P00B14_n5735ProFasNot = new boolean[] {false} ;
      A457FasCod = "" ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      A7894Dtp_H2OReh = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A7892Dtp_FasDsc = "" ;
      A5735ProFasNot = "" ;
      AV16FasCod = "" ;
      W457FasCod = "" ;
      P00B16_A396EmprCod = new String[] {""} ;
      P00B16_A758ProCod = new String[] {""} ;
      P00B16_A774ProNumLin = new short[1] ;
      P00B16_A11933Dtp_Nh2o = new short[1] ;
      P00B16_n11933Dtp_Nh2o = new boolean[] {false} ;
      P00B16_A7906Dtp_ForUli = new short[1] ;
      P00B16_n7906Dtp_ForUli = new boolean[] {false} ;
      P00B16_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B16_n7905Dtp_ForPhn = new boolean[] {false} ;
      P00B16_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B16_n7904Dtp_ForPhx = new boolean[] {false} ;
      P00B16_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B16_n7903Dtp_ForRb = new boolean[] {false} ;
      P00B16_A7902Dtp_ForTmx = new short[1] ;
      P00B16_n7902Dtp_ForTmx = new boolean[] {false} ;
      P00B16_A7901Dtp_Fortie = new short[1] ;
      P00B16_n7901Dtp_Fortie = new boolean[] {false} ;
      P00B16_A7900Dtp_ForFab = new String[] {""} ;
      P00B16_n7900Dtp_ForFab = new boolean[] {false} ;
      P00B16_A7898Dtp_CPQ = new String[] {""} ;
      P00B16_n7898Dtp_CPQ = new boolean[] {false} ;
      P00B16_A7897Dtp_Ordl = new short[1] ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      A7900Dtp_ForFab = "" ;
      A7898Dtp_CPQ = "" ;
      P00B18_A396EmprCod = new String[] {""} ;
      P00B18_A758ProCod = new String[] {""} ;
      P00B18_A774ProNumLin = new short[1] ;
      P00B18_A7897Dtp_Ordl = new short[1] ;
      P00B18_A8476Dtp_clave2 = new String[] {""} ;
      P00B18_n8476Dtp_clave2 = new boolean[] {false} ;
      P00B18_A8475Dtp_clave1 = new String[] {""} ;
      P00B18_n8475Dtp_clave1 = new boolean[] {false} ;
      P00B18_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B18_n7910Dtp_Forcan = new boolean[] {false} ;
      P00B18_A490ForPrdUMe = new byte[1] ;
      P00B18_n490ForPrdUMe = new boolean[] {false} ;
      P00B18_A7908Dtp_Prdnum = new String[] {""} ;
      P00B18_n7908Dtp_Prdnum = new boolean[] {false} ;
      P00B18_A7907Dtp_ForLin = new short[1] ;
      A8476Dtp_clave2 = "" ;
      A8475Dtp_clave1 = "" ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      A7908Dtp_Prdnum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclopro__default(),
         new Object[] {
             new Object[] {
            P00B12_A396EmprCod, P00B12_A758ProCod, P00B12_A14284ProEst, P00B12_A3802ProPreMin, P00B12_n3802ProPreMin, P00B12_A3801ProPreMax, P00B12_n3801ProPreMax, P00B12_A3800ProMarPor, P00B12_n3800ProMarPor, P00B12_A3799ProMerPor,
            P00B12_n3799ProMerPor, P00B12_A3798ProCosPrd, P00B12_n3798ProCosPrd, P00B12_A11203ProImBmp4, P00B12_n11203ProImBmp4, P00B12_A11202ProImBmp3, P00B12_n11202ProImBmp3, P00B12_A11201ProImBmp2, P00B12_n11201ProImBmp2, P00B12_A8333ProImBmp,
            P00B12_n8333ProImBmp, P00B12_A8042ProTipT, P00B12_A7795ProTipP, P00B12_A6486ProDscF, P00B12_A5289ProProvi, P00B12_A5254ProDscM, P00B12_n5254ProDscM, P00B12_A4628ProDsc2, P00B12_A775ProUltLin, P00B12_A759ProDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P00B14_A396EmprCod, P00B14_A758ProCod, P00B14_A457FasCod, P00B14_A774ProNumLin, P00B14_A7911Dtp_UOrd, P00B14_n7911Dtp_UOrd, P00B14_A7896Dtp_UnpLt, P00B14_n7896Dtp_UnpLt, P00B14_A7895Dtp_TpCost, P00B14_n7895Dtp_TpCost,
            P00B14_A7894Dtp_H2OReh, P00B14_n7894Dtp_H2OReh, P00B14_A7893Dtp_Tpp, P00B14_n7893Dtp_Tpp, P00B14_A7892Dtp_FasDsc, P00B14_n7892Dtp_FasDsc, P00B14_A6437ProUltFP, P00B14_A5735ProFasNot, P00B14_n5735ProFasNot
            }
            , new Object[] {
            }
            , new Object[] {
            P00B16_A396EmprCod, P00B16_A758ProCod, P00B16_A774ProNumLin, P00B16_A11933Dtp_Nh2o, P00B16_n11933Dtp_Nh2o, P00B16_A7906Dtp_ForUli, P00B16_n7906Dtp_ForUli, P00B16_A7905Dtp_ForPhn, P00B16_n7905Dtp_ForPhn, P00B16_A7904Dtp_ForPhx,
            P00B16_n7904Dtp_ForPhx, P00B16_A7903Dtp_ForRb, P00B16_n7903Dtp_ForRb, P00B16_A7902Dtp_ForTmx, P00B16_n7902Dtp_ForTmx, P00B16_A7901Dtp_Fortie, P00B16_n7901Dtp_Fortie, P00B16_A7900Dtp_ForFab, P00B16_n7900Dtp_ForFab, P00B16_A7898Dtp_CPQ,
            P00B16_n7898Dtp_CPQ, P00B16_A7897Dtp_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            P00B18_A396EmprCod, P00B18_A758ProCod, P00B18_A774ProNumLin, P00B18_A7897Dtp_Ordl, P00B18_A8476Dtp_clave2, P00B18_n8476Dtp_clave2, P00B18_A8475Dtp_clave1, P00B18_n8475Dtp_clave1, P00B18_A7910Dtp_Forcan, P00B18_n7910Dtp_Forcan,
            P00B18_A490ForPrdUMe, P00B18_n490ForPrdUMe, P00B18_A7908Dtp_Prdnum, P00B18_n7908Dtp_Prdnum, P00B18_A7907Dtp_ForLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8042ProTipT ;
   private byte A490ForPrdUMe ;
   private short A775ProUltLin ;
   private short Gx_err ;
   private short A774ProNumLin ;
   private short A7911Dtp_UOrd ;
   private short A7895Dtp_TpCost ;
   private short A6437ProUltFP ;
   private short AV17ProNumLin ;
   private short W774ProNumLin ;
   private short A11933Dtp_Nh2o ;
   private short A7906Dtp_ForUli ;
   private short A7902Dtp_ForTmx ;
   private short A7901Dtp_Fortie ;
   private short A7897Dtp_Ordl ;
   private short AV18NumLin ;
   private short W7897Dtp_Ordl ;
   private short A7907Dtp_ForLin ;
   private short W7907Dtp_ForLin ;
   private int GX_INS87 ;
   private int GX_INS88 ;
   private int GX_INS1104 ;
   private int GX_INS1105 ;
   private java.math.BigDecimal A3802ProPreMin ;
   private java.math.BigDecimal A3801ProPreMax ;
   private java.math.BigDecimal A3800ProMarPor ;
   private java.math.BigDecimal A3799ProMerPor ;
   private java.math.BigDecimal A3798ProCosPrd ;
   private java.math.BigDecimal A7896Dtp_UnpLt ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private java.math.BigDecimal A7905Dtp_ForPhn ;
   private java.math.BigDecimal A7904Dtp_ForPhx ;
   private java.math.BigDecimal A7903Dtp_ForRb ;
   private java.math.BigDecimal A7910Dtp_Forcan ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A14284ProEst ;
   private String A11203ProImBmp4 ;
   private String A11202ProImBmp3 ;
   private String A11201ProImBmp2 ;
   private String A8333ProImBmp ;
   private String A7795ProTipP ;
   private String A6486ProDscF ;
   private String A5289ProProvi ;
   private String A5254ProDscM ;
   private String A4628ProDsc2 ;
   private String A759ProDsc ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String A7894Dtp_H2OReh ;
   private String A7892Dtp_FasDsc ;
   private String AV16FasCod ;
   private String W457FasCod ;
   private String A7900Dtp_ForFab ;
   private String A7898Dtp_CPQ ;
   private String A8476Dtp_clave2 ;
   private String A8475Dtp_clave1 ;
   private String A7908Dtp_Prdnum ;
   private boolean n3802ProPreMin ;
   private boolean n3801ProPreMax ;
   private boolean n3800ProMarPor ;
   private boolean n3799ProMerPor ;
   private boolean n3798ProCosPrd ;
   private boolean n11203ProImBmp4 ;
   private boolean n11202ProImBmp3 ;
   private boolean n11201ProImBmp2 ;
   private boolean n8333ProImBmp ;
   private boolean n5254ProDscM ;
   private boolean n7911Dtp_UOrd ;
   private boolean n7896Dtp_UnpLt ;
   private boolean n7895Dtp_TpCost ;
   private boolean n7894Dtp_H2OReh ;
   private boolean n7893Dtp_Tpp ;
   private boolean n7892Dtp_FasDsc ;
   private boolean n5735ProFasNot ;
   private boolean n11933Dtp_Nh2o ;
   private boolean n7906Dtp_ForUli ;
   private boolean n7905Dtp_ForPhn ;
   private boolean n7904Dtp_ForPhx ;
   private boolean n7903Dtp_ForRb ;
   private boolean n7902Dtp_ForTmx ;
   private boolean n7901Dtp_Fortie ;
   private boolean n7900Dtp_ForFab ;
   private boolean n7898Dtp_CPQ ;
   private boolean n8476Dtp_clave2 ;
   private boolean n8475Dtp_clave1 ;
   private boolean n7910Dtp_Forcan ;
   private boolean n490ForPrdUMe ;
   private boolean n7908Dtp_Prdnum ;
   private String A5735ProFasNot ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00B12_A396EmprCod ;
   private String[] P00B12_A758ProCod ;
   private String[] P00B12_A14284ProEst ;
   private java.math.BigDecimal[] P00B12_A3802ProPreMin ;
   private boolean[] P00B12_n3802ProPreMin ;
   private java.math.BigDecimal[] P00B12_A3801ProPreMax ;
   private boolean[] P00B12_n3801ProPreMax ;
   private java.math.BigDecimal[] P00B12_A3800ProMarPor ;
   private boolean[] P00B12_n3800ProMarPor ;
   private java.math.BigDecimal[] P00B12_A3799ProMerPor ;
   private boolean[] P00B12_n3799ProMerPor ;
   private java.math.BigDecimal[] P00B12_A3798ProCosPrd ;
   private boolean[] P00B12_n3798ProCosPrd ;
   private String[] P00B12_A11203ProImBmp4 ;
   private boolean[] P00B12_n11203ProImBmp4 ;
   private String[] P00B12_A11202ProImBmp3 ;
   private boolean[] P00B12_n11202ProImBmp3 ;
   private String[] P00B12_A11201ProImBmp2 ;
   private boolean[] P00B12_n11201ProImBmp2 ;
   private String[] P00B12_A8333ProImBmp ;
   private boolean[] P00B12_n8333ProImBmp ;
   private byte[] P00B12_A8042ProTipT ;
   private String[] P00B12_A7795ProTipP ;
   private String[] P00B12_A6486ProDscF ;
   private String[] P00B12_A5289ProProvi ;
   private String[] P00B12_A5254ProDscM ;
   private boolean[] P00B12_n5254ProDscM ;
   private String[] P00B12_A4628ProDsc2 ;
   private short[] P00B12_A775ProUltLin ;
   private String[] P00B12_A759ProDsc ;
   private String[] P00B14_A396EmprCod ;
   private String[] P00B14_A758ProCod ;
   private String[] P00B14_A457FasCod ;
   private short[] P00B14_A774ProNumLin ;
   private short[] P00B14_A7911Dtp_UOrd ;
   private boolean[] P00B14_n7911Dtp_UOrd ;
   private java.math.BigDecimal[] P00B14_A7896Dtp_UnpLt ;
   private boolean[] P00B14_n7896Dtp_UnpLt ;
   private short[] P00B14_A7895Dtp_TpCost ;
   private boolean[] P00B14_n7895Dtp_TpCost ;
   private String[] P00B14_A7894Dtp_H2OReh ;
   private boolean[] P00B14_n7894Dtp_H2OReh ;
   private java.math.BigDecimal[] P00B14_A7893Dtp_Tpp ;
   private boolean[] P00B14_n7893Dtp_Tpp ;
   private String[] P00B14_A7892Dtp_FasDsc ;
   private boolean[] P00B14_n7892Dtp_FasDsc ;
   private short[] P00B14_A6437ProUltFP ;
   private String[] P00B14_A5735ProFasNot ;
   private boolean[] P00B14_n5735ProFasNot ;
   private String[] P00B16_A396EmprCod ;
   private String[] P00B16_A758ProCod ;
   private short[] P00B16_A774ProNumLin ;
   private short[] P00B16_A11933Dtp_Nh2o ;
   private boolean[] P00B16_n11933Dtp_Nh2o ;
   private short[] P00B16_A7906Dtp_ForUli ;
   private boolean[] P00B16_n7906Dtp_ForUli ;
   private java.math.BigDecimal[] P00B16_A7905Dtp_ForPhn ;
   private boolean[] P00B16_n7905Dtp_ForPhn ;
   private java.math.BigDecimal[] P00B16_A7904Dtp_ForPhx ;
   private boolean[] P00B16_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] P00B16_A7903Dtp_ForRb ;
   private boolean[] P00B16_n7903Dtp_ForRb ;
   private short[] P00B16_A7902Dtp_ForTmx ;
   private boolean[] P00B16_n7902Dtp_ForTmx ;
   private short[] P00B16_A7901Dtp_Fortie ;
   private boolean[] P00B16_n7901Dtp_Fortie ;
   private String[] P00B16_A7900Dtp_ForFab ;
   private boolean[] P00B16_n7900Dtp_ForFab ;
   private String[] P00B16_A7898Dtp_CPQ ;
   private boolean[] P00B16_n7898Dtp_CPQ ;
   private short[] P00B16_A7897Dtp_Ordl ;
   private String[] P00B18_A396EmprCod ;
   private String[] P00B18_A758ProCod ;
   private short[] P00B18_A774ProNumLin ;
   private short[] P00B18_A7897Dtp_Ordl ;
   private String[] P00B18_A8476Dtp_clave2 ;
   private boolean[] P00B18_n8476Dtp_clave2 ;
   private String[] P00B18_A8475Dtp_clave1 ;
   private boolean[] P00B18_n8475Dtp_clave1 ;
   private java.math.BigDecimal[] P00B18_A7910Dtp_Forcan ;
   private boolean[] P00B18_n7910Dtp_Forcan ;
   private byte[] P00B18_A490ForPrdUMe ;
   private boolean[] P00B18_n490ForPrdUMe ;
   private String[] P00B18_A7908Dtp_Prdnum ;
   private boolean[] P00B18_n7908Dtp_Prdnum ;
   private short[] P00B18_A7907Dtp_ForLin ;
}

final  class pclopro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00B12", "SELECT EmprCod, ProCod, ProEst, ProPreMin, ProPreMax, ProMarPor, ProMerPor, ProCosPrd, ProImBmp4, ProImBmp3, ProImBmp2, ProImBmp, ProTipT, ProTipP, ProDscF, ProProvi, ProDscM, ProDsc2, ProUltLin, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00B13", "INSERT INTO TXPPROCES(EmprCod, ProCod, ProDsc, ProUltLin, ProDsc2, ProDscM, ProProvi, ProDscF, ProTipP, ProTipT, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin, ProEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P00B14", "SELECT EmprCod, ProCod, FasCod, ProNumLin, Dtp_UOrd, Dtp_UnpLt, Dtp_TpCost, Dtp_H2OReh, Dtp_Tpp, Dtp_FasDsc, ProUltFP, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00B15", "INSERT INTO TXPPROLIN(EmprCod, ProCod, ProNumLin, FasCod, ProFasNot, ProUltFP, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new ForEachCursor("P00B16", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Nh2o, Dtp_ForUli, Dtp_ForPhn, Dtp_ForPhx, Dtp_ForRb, Dtp_ForTmx, Dtp_Fortie, Dtp_ForFab, Dtp_CPQ, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00B17", "INSERT INTO TXPDT002(EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli, Dtp_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT002")
         ,new ForEachCursor("P00B18", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_clave2, Dtp_clave1, Dtp_Forcan, ForPrdUMe, Dtp_Prdnum, Dtp_ForLin FROM TXPDT0021 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00B19", "INSERT INTO TXPDT0021(EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, ForPrdUMe, Dtp_Forcan, Dtp_clave1, Dtp_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0021")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 128);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 128);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 128);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 128);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((String[]) buf[22])[0] = rslt.getString(14, 2);
               ((String[]) buf[23])[0] = rslt.getString(15, 60);
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((String[]) buf[25])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 100);
               ((short[]) buf[28])[0] = rslt.getShort(19);
               ((String[]) buf[29])[0] = rslt.getString(20, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 90);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((String[]) buf[17])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 100);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 60);
               stmt.setString(9, (String)parms[9], 2);
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[28], 5);
               }
               stmt.setString(20, (String)parms[29], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 400);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 90);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 30);
               }
               return;
      }
   }

}

