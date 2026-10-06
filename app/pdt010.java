package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdt010 extends GXProcedure
{
   public pdt010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdt010.class ), "" );
   }

   public pdt010( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      pdt010.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pdt010.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdt010.this.AV14Procod = aP1[0];
      this.aP1 = aP1;
      pdt010.this.AV15Pronumlin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Proceso Creacion Tablas, Dt002,Dt0021,Prolin...", "") );
      /* Using cursor P03742 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV14Procod, Short.valueOf(AV15Pronumlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A774ProNumLin = P03742_A774ProNumLin[0] ;
         A758ProCod = P03742_A758ProCod[0] ;
         A457FasCod = P03742_A457FasCod[0] ;
         A7892Dtp_FasDsc = P03742_A7892Dtp_FasDsc[0] ;
         n7892Dtp_FasDsc = P03742_n7892Dtp_FasDsc[0] ;
         A7893Dtp_Tpp = P03742_A7893Dtp_Tpp[0] ;
         n7893Dtp_Tpp = P03742_n7893Dtp_Tpp[0] ;
         A7894Dtp_H2OReh = P03742_A7894Dtp_H2OReh[0] ;
         n7894Dtp_H2OReh = P03742_n7894Dtp_H2OReh[0] ;
         A7895Dtp_TpCost = P03742_A7895Dtp_TpCost[0] ;
         n7895Dtp_TpCost = P03742_n7895Dtp_TpCost[0] ;
         A7896Dtp_UnpLt = P03742_A7896Dtp_UnpLt[0] ;
         n7896Dtp_UnpLt = P03742_n7896Dtp_UnpLt[0] ;
         A7911Dtp_UOrd = P03742_A7911Dtp_UOrd[0] ;
         n7911Dtp_UOrd = P03742_n7911Dtp_UOrd[0] ;
         AV8FasCod = A457FasCod ;
         /* Execute user subroutine: 'FASPRO' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A7892Dtp_FasDsc = AV9Dtp_FasDsc ;
         n7892Dtp_FasDsc = false ;
         A7893Dtp_Tpp = AV10Dtp_Tpp ;
         n7893Dtp_Tpp = false ;
         A7894Dtp_H2OReh = AV11Dtp_H2OReh ;
         n7894Dtp_H2OReh = false ;
         A7895Dtp_TpCost = AV12Dtp_TpCost ;
         n7895Dtp_TpCost = false ;
         A7896Dtp_UnpLt = AV13Dtp_UnpLt ;
         n7896Dtp_UnpLt = false ;
         A7911Dtp_UOrd = AV18FasUltForL ;
         n7911Dtp_UOrd = false ;
         /* Using cursor P03743 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7893Dtp_Tpp), A7893Dtp_Tpp, Boolean.valueOf(n7894Dtp_H2OReh), A7894Dtp_H2OReh, Boolean.valueOf(n7895Dtp_TpCost), Short.valueOf(A7895Dtp_TpCost), Boolean.valueOf(n7896Dtp_UnpLt), A7896Dtp_UnpLt, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd), A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P03744 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV8FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4650FasForLin = P03744_A4650FasForLin[0] ;
         A764ProForCod = P03744_A764ProForCod[0] ;
         A6018ProForFab = P03744_A6018ProForFab[0] ;
         n6018ProForFab = P03744_n6018ProForFab[0] ;
         A771ProForTie = P03744_A771ProForTie[0] ;
         A772ProForTmx = P03744_A772ProForTmx[0] ;
         A4706ProForRb = P03744_A4706ProForRb[0] ;
         A6876ProForPhx = P03744_A6876ProForPhx[0] ;
         n6876ProForPhx = P03744_n6876ProForPhx[0] ;
         A6877ProForPhn = P03744_A6877ProForPhn[0] ;
         n6877ProForPhn = P03744_n6877ProForPhn[0] ;
         A773ProForUli = P03744_A773ProForUli[0] ;
         A12109ProNh2o = P03744_A12109ProNh2o[0] ;
         n12109ProNh2o = P03744_n12109ProNh2o[0] ;
         A457FasCod = P03744_A457FasCod[0] ;
         A6018ProForFab = P03744_A6018ProForFab[0] ;
         n6018ProForFab = P03744_n6018ProForFab[0] ;
         A771ProForTie = P03744_A771ProForTie[0] ;
         A772ProForTmx = P03744_A772ProForTmx[0] ;
         A4706ProForRb = P03744_A4706ProForRb[0] ;
         A6876ProForPhx = P03744_A6876ProForPhx[0] ;
         n6876ProForPhx = P03744_n6876ProForPhx[0] ;
         A6877ProForPhn = P03744_A6877ProForPhn[0] ;
         n6877ProForPhn = P03744_n6877ProForPhn[0] ;
         A773ProForUli = P03744_A773ProForUli[0] ;
         A12109ProNh2o = P03744_A12109ProNh2o[0] ;
         n12109ProNh2o = P03744_n12109ProNh2o[0] ;
         W396EmprCod = A396EmprCod ;
         AV16Proforcod = A764ProForCod ;
         AV17FasForlin = A4650FasForLin ;
         /* Execute user subroutine: 'LPROFO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TXPDT002

         */
         W396EmprCod = A396EmprCod ;
         A758ProCod = AV14Procod ;
         A774ProNumLin = AV15Pronumlin ;
         A7897Dtp_Ordl = A4650FasForLin ;
         A7898Dtp_CPQ = A764ProForCod ;
         n7898Dtp_CPQ = false ;
         A7900Dtp_ForFab = A6018ProForFab ;
         n7900Dtp_ForFab = false ;
         A7901Dtp_Fortie = A771ProForTie ;
         n7901Dtp_Fortie = false ;
         A7902Dtp_ForTmx = A772ProForTmx ;
         n7902Dtp_ForTmx = false ;
         A7903Dtp_ForRb = DecimalUtil.doubleToDec(A4706ProForRb) ;
         n7903Dtp_ForRb = false ;
         A7904Dtp_ForPhx = A6876ProForPhx ;
         n7904Dtp_ForPhx = false ;
         A7905Dtp_ForPhn = A6877ProForPhn ;
         n7905Dtp_ForPhn = false ;
         A7906Dtp_ForUli = A773ProForUli ;
         n7906Dtp_ForUli = false ;
         A11933Dtp_Nh2o = A12109ProNh2o ;
         n11933Dtp_Nh2o = false ;
         /* Using cursor P03745 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Boolean.valueOf(n7898Dtp_CPQ), A7898Dtp_CPQ, Boolean.valueOf(n7900Dtp_ForFab), A7900Dtp_ForFab, Boolean.valueOf(n7901Dtp_Fortie), Short.valueOf(A7901Dtp_Fortie), Boolean.valueOf(n7902Dtp_ForTmx), Short.valueOf(A7902Dtp_ForTmx), Boolean.valueOf(n7903Dtp_ForRb), A7903Dtp_ForRb, Boolean.valueOf(n7904Dtp_ForPhx), A7904Dtp_ForPhx, Boolean.valueOf(n7905Dtp_ForPhn), A7905Dtp_ForPhn, Boolean.valueOf(n7906Dtp_ForUli), Short.valueOf(A7906Dtp_ForUli), Boolean.valueOf(n11933Dtp_Nh2o), Short.valueOf(A11933Dtp_Nh2o)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
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
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'LPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P03746 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV16Proforcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A767ProForLin = P03746_A767ProForLin[0] ;
         A770ProForPrd = P03746_A770ProForPrd[0] ;
         A762ProForCan = P03746_A762ProForCan[0] ;
         A763ProForCla = P03746_A763ProForCla[0] ;
         A5358ProForClv = P03746_A5358ProForClv[0] ;
         A490ForPrdUMe = P03746_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P03746_n490ForPrdUMe[0] ;
         A764ProForCod = P03746_A764ProForCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPDT0021

         */
         W396EmprCod = A396EmprCod ;
         W490ForPrdUMe = A490ForPrdUMe ;
         n490ForPrdUMe = false ;
         A758ProCod = AV14Procod ;
         A774ProNumLin = AV15Pronumlin ;
         A7897Dtp_Ordl = AV17FasForlin ;
         A7907Dtp_ForLin = A767ProForLin ;
         A7908Dtp_Prdnum = A770ProForPrd ;
         n7908Dtp_Prdnum = false ;
         n490ForPrdUMe = false ;
         A7910Dtp_Forcan = A762ProForCan ;
         n7910Dtp_Forcan = false ;
         A8475Dtp_clave1 = A763ProForCla ;
         n8475Dtp_clave1 = false ;
         A8476Dtp_clave2 = A5358ProForClv ;
         n8476Dtp_clave2 = false ;
         /* Using cursor P03747 */
         pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl), Short.valueOf(A7907Dtp_ForLin), Boolean.valueOf(n7908Dtp_Prdnum), A7908Dtp_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7910Dtp_Forcan), A7910Dtp_Forcan, Boolean.valueOf(n8475Dtp_clave1), A8475Dtp_clave1, Boolean.valueOf(n8476Dtp_clave2), A8476Dtp_clave2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
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
         A490ForPrdUMe = W490ForPrdUMe ;
         n490ForPrdUMe = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      /* Using cursor P03748 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV8FasCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A457FasCod = P03748_A457FasCod[0] ;
         A4642FasDsc2 = P03748_A4642FasDsc2[0] ;
         n4642FasDsc2 = P03748_n4642FasDsc2[0] ;
         A460FasDsc = P03748_A460FasDsc[0] ;
         A6879FasTpp = P03748_A6879FasTpp[0] ;
         n6879FasTpp = P03748_n6879FasTpp[0] ;
         A7600FasH2OReh = P03748_A7600FasH2OReh[0] ;
         n7600FasH2OReh = P03748_n7600FasH2OReh[0] ;
         A7391FasTpCost = P03748_A7391FasTpCost[0] ;
         n7391FasTpCost = P03748_n7391FasTpCost[0] ;
         A6881FasUnpLt = P03748_A6881FasUnpLt[0] ;
         n6881FasUnpLt = P03748_n6881FasUnpLt[0] ;
         A4649FasUltForL = P03748_A4649FasUltForL[0] ;
         n4649FasUltForL = P03748_n4649FasUltForL[0] ;
         AV9Dtp_FasDsc = GXutil.trim( A460FasDsc) + GXutil.trim( A4642FasDsc2) ;
         AV10Dtp_Tpp = A6879FasTpp ;
         AV11Dtp_H2OReh = A7600FasH2OReh ;
         AV12Dtp_TpCost = A7391FasTpCost ;
         AV13Dtp_UnpLt = A6881FasUnpLt ;
         AV18FasUltForL = A4649FasUltForL ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdt010.this.A396EmprCod;
      this.aP1[0] = pdt010.this.AV14Procod;
      this.aP2[0] = pdt010.this.AV15Pronumlin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdt010");
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
      P03742_A396EmprCod = new String[] {""} ;
      P03742_A774ProNumLin = new short[1] ;
      P03742_A758ProCod = new String[] {""} ;
      P03742_A457FasCod = new String[] {""} ;
      P03742_A7892Dtp_FasDsc = new String[] {""} ;
      P03742_n7892Dtp_FasDsc = new boolean[] {false} ;
      P03742_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03742_n7893Dtp_Tpp = new boolean[] {false} ;
      P03742_A7894Dtp_H2OReh = new String[] {""} ;
      P03742_n7894Dtp_H2OReh = new boolean[] {false} ;
      P03742_A7895Dtp_TpCost = new short[1] ;
      P03742_n7895Dtp_TpCost = new boolean[] {false} ;
      P03742_A7896Dtp_UnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03742_n7896Dtp_UnpLt = new boolean[] {false} ;
      P03742_A7911Dtp_UOrd = new short[1] ;
      P03742_n7911Dtp_UOrd = new boolean[] {false} ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A7892Dtp_FasDsc = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A7894Dtp_H2OReh = "" ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      AV8FasCod = "" ;
      AV9Dtp_FasDsc = "" ;
      AV10Dtp_Tpp = DecimalUtil.ZERO ;
      AV11Dtp_H2OReh = "" ;
      AV13Dtp_UnpLt = DecimalUtil.ZERO ;
      P03744_A396EmprCod = new String[] {""} ;
      P03744_A4650FasForLin = new short[1] ;
      P03744_A764ProForCod = new String[] {""} ;
      P03744_A6018ProForFab = new String[] {""} ;
      P03744_n6018ProForFab = new boolean[] {false} ;
      P03744_A771ProForTie = new short[1] ;
      P03744_A772ProForTmx = new short[1] ;
      P03744_A4706ProForRb = new short[1] ;
      P03744_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03744_n6876ProForPhx = new boolean[] {false} ;
      P03744_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03744_n6877ProForPhn = new boolean[] {false} ;
      P03744_A773ProForUli = new short[1] ;
      P03744_A12109ProNh2o = new short[1] ;
      P03744_n12109ProNh2o = new boolean[] {false} ;
      P03744_A457FasCod = new String[] {""} ;
      A764ProForCod = "" ;
      A6018ProForFab = "" ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      AV16Proforcod = "" ;
      A7898Dtp_CPQ = "" ;
      A7900Dtp_ForFab = "" ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P03746_A396EmprCod = new String[] {""} ;
      P03746_A767ProForLin = new short[1] ;
      P03746_A770ProForPrd = new String[] {""} ;
      P03746_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03746_A763ProForCla = new String[] {""} ;
      P03746_A5358ProForClv = new String[] {""} ;
      P03746_A490ForPrdUMe = new byte[1] ;
      P03746_n490ForPrdUMe = new boolean[] {false} ;
      P03746_A764ProForCod = new String[] {""} ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A7908Dtp_Prdnum = "" ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      A8475Dtp_clave1 = "" ;
      A8476Dtp_clave2 = "" ;
      P03748_A396EmprCod = new String[] {""} ;
      P03748_A457FasCod = new String[] {""} ;
      P03748_A4642FasDsc2 = new String[] {""} ;
      P03748_n4642FasDsc2 = new boolean[] {false} ;
      P03748_A460FasDsc = new String[] {""} ;
      P03748_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03748_n6879FasTpp = new boolean[] {false} ;
      P03748_A7600FasH2OReh = new String[] {""} ;
      P03748_n7600FasH2OReh = new boolean[] {false} ;
      P03748_A7391FasTpCost = new short[1] ;
      P03748_n7391FasTpCost = new boolean[] {false} ;
      P03748_A6881FasUnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03748_n6881FasUnpLt = new boolean[] {false} ;
      P03748_A4649FasUltForL = new short[1] ;
      P03748_n4649FasUltForL = new boolean[] {false} ;
      A4642FasDsc2 = "" ;
      A460FasDsc = "" ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A7600FasH2OReh = "" ;
      A6881FasUnpLt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdt010__default(),
         new Object[] {
             new Object[] {
            P03742_A396EmprCod, P03742_A774ProNumLin, P03742_A758ProCod, P03742_A457FasCod, P03742_A7892Dtp_FasDsc, P03742_n7892Dtp_FasDsc, P03742_A7893Dtp_Tpp, P03742_n7893Dtp_Tpp, P03742_A7894Dtp_H2OReh, P03742_n7894Dtp_H2OReh,
            P03742_A7895Dtp_TpCost, P03742_n7895Dtp_TpCost, P03742_A7896Dtp_UnpLt, P03742_n7896Dtp_UnpLt, P03742_A7911Dtp_UOrd, P03742_n7911Dtp_UOrd
            }
            , new Object[] {
            }
            , new Object[] {
            P03744_A396EmprCod, P03744_A4650FasForLin, P03744_A764ProForCod, P03744_A6018ProForFab, P03744_n6018ProForFab, P03744_A771ProForTie, P03744_A772ProForTmx, P03744_A4706ProForRb, P03744_A6876ProForPhx, P03744_n6876ProForPhx,
            P03744_A6877ProForPhn, P03744_n6877ProForPhn, P03744_A773ProForUli, P03744_A12109ProNh2o, P03744_n12109ProNh2o, P03744_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03746_A396EmprCod, P03746_A767ProForLin, P03746_A770ProForPrd, P03746_A762ProForCan, P03746_A763ProForCla, P03746_A5358ProForClv, P03746_A490ForPrdUMe, P03746_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03748_A396EmprCod, P03748_A457FasCod, P03748_A4642FasDsc2, P03748_n4642FasDsc2, P03748_A460FasDsc, P03748_A6879FasTpp, P03748_n6879FasTpp, P03748_A7600FasH2OReh, P03748_n7600FasH2OReh, P03748_A7391FasTpCost,
            P03748_n7391FasTpCost, P03748_A6881FasUnpLt, P03748_n6881FasUnpLt, P03748_A4649FasUltForL, P03748_n4649FasUltForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short AV15Pronumlin ;
   private short A774ProNumLin ;
   private short A7895Dtp_TpCost ;
   private short A7911Dtp_UOrd ;
   private short AV12Dtp_TpCost ;
   private short AV18FasUltForL ;
   private short A4650FasForLin ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A773ProForUli ;
   private short A12109ProNh2o ;
   private short AV17FasForlin ;
   private short A7897Dtp_Ordl ;
   private short A7901Dtp_Fortie ;
   private short A7902Dtp_ForTmx ;
   private short A7906Dtp_ForUli ;
   private short A11933Dtp_Nh2o ;
   private short Gx_err ;
   private short A767ProForLin ;
   private short A7907Dtp_ForLin ;
   private short A7391FasTpCost ;
   private short A4649FasUltForL ;
   private int GX_INS1104 ;
   private int GX_INS1105 ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private java.math.BigDecimal A7896Dtp_UnpLt ;
   private java.math.BigDecimal AV10Dtp_Tpp ;
   private java.math.BigDecimal AV13Dtp_UnpLt ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A7903Dtp_ForRb ;
   private java.math.BigDecimal A7904Dtp_ForPhx ;
   private java.math.BigDecimal A7905Dtp_ForPhn ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A7910Dtp_Forcan ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal A6881FasUnpLt ;
   private String A396EmprCod ;
   private String AV14Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A7892Dtp_FasDsc ;
   private String A7894Dtp_H2OReh ;
   private String AV8FasCod ;
   private String AV9Dtp_FasDsc ;
   private String AV11Dtp_H2OReh ;
   private String A764ProForCod ;
   private String A6018ProForFab ;
   private String W396EmprCod ;
   private String AV16Proforcod ;
   private String A7898Dtp_CPQ ;
   private String A7900Dtp_ForFab ;
   private String Gx_emsg ;
   private String A770ProForPrd ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A7908Dtp_Prdnum ;
   private String A8475Dtp_clave1 ;
   private String A8476Dtp_clave2 ;
   private String A4642FasDsc2 ;
   private String A460FasDsc ;
   private String A7600FasH2OReh ;
   private boolean n7892Dtp_FasDsc ;
   private boolean n7893Dtp_Tpp ;
   private boolean n7894Dtp_H2OReh ;
   private boolean n7895Dtp_TpCost ;
   private boolean n7896Dtp_UnpLt ;
   private boolean n7911Dtp_UOrd ;
   private boolean returnInSub ;
   private boolean n6018ProForFab ;
   private boolean n6876ProForPhx ;
   private boolean n6877ProForPhn ;
   private boolean n12109ProNh2o ;
   private boolean n7898Dtp_CPQ ;
   private boolean n7900Dtp_ForFab ;
   private boolean n7901Dtp_Fortie ;
   private boolean n7902Dtp_ForTmx ;
   private boolean n7903Dtp_ForRb ;
   private boolean n7904Dtp_ForPhx ;
   private boolean n7905Dtp_ForPhn ;
   private boolean n7906Dtp_ForUli ;
   private boolean n11933Dtp_Nh2o ;
   private boolean n490ForPrdUMe ;
   private boolean n7908Dtp_Prdnum ;
   private boolean n7910Dtp_Forcan ;
   private boolean n8475Dtp_clave1 ;
   private boolean n8476Dtp_clave2 ;
   private boolean n4642FasDsc2 ;
   private boolean n6879FasTpp ;
   private boolean n7600FasH2OReh ;
   private boolean n7391FasTpCost ;
   private boolean n6881FasUnpLt ;
   private boolean n4649FasUltForL ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03742_A396EmprCod ;
   private short[] P03742_A774ProNumLin ;
   private String[] P03742_A758ProCod ;
   private String[] P03742_A457FasCod ;
   private String[] P03742_A7892Dtp_FasDsc ;
   private boolean[] P03742_n7892Dtp_FasDsc ;
   private java.math.BigDecimal[] P03742_A7893Dtp_Tpp ;
   private boolean[] P03742_n7893Dtp_Tpp ;
   private String[] P03742_A7894Dtp_H2OReh ;
   private boolean[] P03742_n7894Dtp_H2OReh ;
   private short[] P03742_A7895Dtp_TpCost ;
   private boolean[] P03742_n7895Dtp_TpCost ;
   private java.math.BigDecimal[] P03742_A7896Dtp_UnpLt ;
   private boolean[] P03742_n7896Dtp_UnpLt ;
   private short[] P03742_A7911Dtp_UOrd ;
   private boolean[] P03742_n7911Dtp_UOrd ;
   private String[] P03744_A396EmprCod ;
   private short[] P03744_A4650FasForLin ;
   private String[] P03744_A764ProForCod ;
   private String[] P03744_A6018ProForFab ;
   private boolean[] P03744_n6018ProForFab ;
   private short[] P03744_A771ProForTie ;
   private short[] P03744_A772ProForTmx ;
   private short[] P03744_A4706ProForRb ;
   private java.math.BigDecimal[] P03744_A6876ProForPhx ;
   private boolean[] P03744_n6876ProForPhx ;
   private java.math.BigDecimal[] P03744_A6877ProForPhn ;
   private boolean[] P03744_n6877ProForPhn ;
   private short[] P03744_A773ProForUli ;
   private short[] P03744_A12109ProNh2o ;
   private boolean[] P03744_n12109ProNh2o ;
   private String[] P03744_A457FasCod ;
   private String[] P03746_A396EmprCod ;
   private short[] P03746_A767ProForLin ;
   private String[] P03746_A770ProForPrd ;
   private java.math.BigDecimal[] P03746_A762ProForCan ;
   private String[] P03746_A763ProForCla ;
   private String[] P03746_A5358ProForClv ;
   private byte[] P03746_A490ForPrdUMe ;
   private boolean[] P03746_n490ForPrdUMe ;
   private String[] P03746_A764ProForCod ;
   private String[] P03748_A396EmprCod ;
   private String[] P03748_A457FasCod ;
   private String[] P03748_A4642FasDsc2 ;
   private boolean[] P03748_n4642FasDsc2 ;
   private String[] P03748_A460FasDsc ;
   private java.math.BigDecimal[] P03748_A6879FasTpp ;
   private boolean[] P03748_n6879FasTpp ;
   private String[] P03748_A7600FasH2OReh ;
   private boolean[] P03748_n7600FasH2OReh ;
   private short[] P03748_A7391FasTpCost ;
   private boolean[] P03748_n7391FasTpCost ;
   private java.math.BigDecimal[] P03748_A6881FasUnpLt ;
   private boolean[] P03748_n6881FasUnpLt ;
   private short[] P03748_A4649FasUltForL ;
   private boolean[] P03748_n4649FasUltForL ;
}

final  class pdt010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03742", "SELECT EmprCod, ProNumLin, ProCod, FasCod, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03743", "UPDATE TXPPROLIN SET Dtp_FasDsc=?, Dtp_Tpp=?, Dtp_H2OReh=?, Dtp_TpCost=?, Dtp_UnpLt=?, Dtp_UOrd=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new ForEachCursor("P03744", "SELECT T1.EmprCod, T1.FasForLin, T1.ProForCod, T2.ProForFab, T2.ProForTie, T2.ProForTmx, T2.ProForRb, T2.ProForPhx, T2.ProForPhn, T2.ProForUli, T2.ProNh2o, T1.FasCod FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03745", "INSERT INTO TXPDT002(EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli, Dtp_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT002")
         ,new ForEachCursor("P03746", "SELECT EmprCod, ProForLin, ProForPrd, ProForCan, ProForCla, ProForClv, ForPrdUMe, ProForCod FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03747", "INSERT INTO TXPDT0021(EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, ForPrdUMe, Dtp_Forcan, Dtp_clave1, Dtp_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0021")
         ,new ForEachCursor("P03748", "SELECT EmprCod, FasCod, FasDsc2, FasDsc, FasTpp, FasH2OReh, FasTpCost, FasUnpLt, FasUltForL FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 90);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 90);
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 8);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

