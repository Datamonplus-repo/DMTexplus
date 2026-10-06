package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprl extends GXProcedure
{
   public pbusprl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprl.class ), "" );
   }

   public pbusprl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pbusprl.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      pbusprl.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprl.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pbusprl.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pbusprl.this.AV18CliCod = aP3[0];
      this.aP3 = aP3;
      pbusprl.this.AV24MdlCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizando....Disfas...Dislin...", "") );
      AV25Np = (short)(0) ;
      /* Using cursor P01AM2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, AV24MdlCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A775ProUltLin = P01AM2_A775ProUltLin[0] ;
         A4658MdlCod = P01AM2_A4658MdlCod[0] ;
         A252CliCod = P01AM2_A252CliCod[0] ;
         A65ArtCod = P01AM2_A65ArtCod[0] ;
         A396EmprCod = P01AM2_A396EmprCod[0] ;
         A758ProCod = P01AM2_A758ProCod[0] ;
         A775ProUltLin = P01AM2_A775ProUltLin[0] ;
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
         /* Using cursor P01AM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin)});
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
         /* Using cursor P01AM4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, AV19ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A774ProNumLin = P01AM4_A774ProNumLin[0] ;
            A7893Dtp_Tpp = P01AM4_A7893Dtp_Tpp[0] ;
            n7893Dtp_Tpp = P01AM4_n7893Dtp_Tpp[0] ;
            A7896Dtp_UnpLt = P01AM4_A7896Dtp_UnpLt[0] ;
            n7896Dtp_UnpLt = P01AM4_n7896Dtp_UnpLt[0] ;
            A7911Dtp_UOrd = P01AM4_A7911Dtp_UOrd[0] ;
            n7911Dtp_UOrd = P01AM4_n7911Dtp_UOrd[0] ;
            A7744FasPreObl = P01AM4_A7744FasPreObl[0] ;
            n7744FasPreObl = P01AM4_n7744FasPreObl[0] ;
            A758ProCod = P01AM4_A758ProCod[0] ;
            A396EmprCod = P01AM4_A396EmprCod[0] ;
            A457FasCod = P01AM4_A457FasCod[0] ;
            A7744FasPreObl = P01AM4_A7744FasPreObl[0] ;
            n7744FasPreObl = P01AM4_n7744FasPreObl[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            AV22FasCod = A457FasCod ;
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
            A7915Disfastpp = A7893Dtp_Tpp ;
            n7915Disfastpp = false ;
            A7916DisFasUpL = A7896Dtp_UnpLt ;
            n7916DisFasUpL = false ;
            A7917DisfasRb = DecimalUtil.doubleToDec(0) ;
            n7917DisfasRb = false ;
            A7918Dta_UOrd = A7911Dtp_UOrd ;
            n7918Dta_UOrd = false ;
            /* Using cursor P01AM5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, Boolean.valueOf(n7915Disfastpp), A7915Disfastpp, Boolean.valueOf(n7916DisFasUpL), A7916DisFasUpL, Boolean.valueOf(n7917DisfasRb), A7917DisfasRb, Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
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
            /* Using cursor P01AM6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A7897Dtp_Ordl = P01AM6_A7897Dtp_Ordl[0] ;
               A7898Dtp_CPQ = P01AM6_A7898Dtp_CPQ[0] ;
               n7898Dtp_CPQ = P01AM6_n7898Dtp_CPQ[0] ;
               A7900Dtp_ForFab = P01AM6_A7900Dtp_ForFab[0] ;
               n7900Dtp_ForFab = P01AM6_n7900Dtp_ForFab[0] ;
               A7901Dtp_Fortie = P01AM6_A7901Dtp_Fortie[0] ;
               n7901Dtp_Fortie = P01AM6_n7901Dtp_Fortie[0] ;
               A7902Dtp_ForTmx = P01AM6_A7902Dtp_ForTmx[0] ;
               n7902Dtp_ForTmx = P01AM6_n7902Dtp_ForTmx[0] ;
               A7903Dtp_ForRb = P01AM6_A7903Dtp_ForRb[0] ;
               n7903Dtp_ForRb = P01AM6_n7903Dtp_ForRb[0] ;
               A7904Dtp_ForPhx = P01AM6_A7904Dtp_ForPhx[0] ;
               n7904Dtp_ForPhx = P01AM6_n7904Dtp_ForPhx[0] ;
               A7905Dtp_ForPhn = P01AM6_A7905Dtp_ForPhn[0] ;
               n7905Dtp_ForPhn = P01AM6_n7905Dtp_ForPhn[0] ;
               A7906Dtp_ForUli = P01AM6_A7906Dtp_ForUli[0] ;
               n7906Dtp_ForUli = P01AM6_n7906Dtp_ForUli[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               /*
                  INSERT RECORD ON TABLE TXPDT004

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               A396EmprCod = AV15EmprCod ;
               A361DisCod = AV16DisCod ;
               A758ProCod = AV19ProCod ;
               A368DisFasLin = A774ProNumLin ;
               A7919Dta_Ordl = A7897Dtp_Ordl ;
               A7920Dta_CPQ = A7898Dtp_CPQ ;
               n7920Dta_CPQ = false ;
               A7922Dta_ForFab = A7900Dtp_ForFab ;
               n7922Dta_ForFab = false ;
               A7923Dta_Fortie = A7901Dtp_Fortie ;
               n7923Dta_Fortie = false ;
               A7924Dta_ForTmx = A7902Dtp_ForTmx ;
               n7924Dta_ForTmx = false ;
               A7925Dta_ForRb = A7903Dtp_ForRb ;
               n7925Dta_ForRb = false ;
               A7926Dta_ForPhx = A7904Dtp_ForPhx ;
               n7926Dta_ForPhx = false ;
               A7927Dta_ForPhn = A7905Dtp_ForPhn ;
               n7927Dta_ForPhn = false ;
               A7928Dta_ForUli = A7906Dtp_ForUli ;
               n7928Dta_ForUli = false ;
               /* Using cursor P01AM7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Boolean.valueOf(n7920Dta_CPQ), A7920Dta_CPQ, Boolean.valueOf(n7922Dta_ForFab), A7922Dta_ForFab, Boolean.valueOf(n7923Dta_Fortie), Short.valueOf(A7923Dta_Fortie), Boolean.valueOf(n7924Dta_ForTmx), Short.valueOf(A7924Dta_ForTmx), Boolean.valueOf(n7925Dta_ForRb), A7925Dta_ForRb, Boolean.valueOf(n7926Dta_ForPhx), A7926Dta_ForPhx, Boolean.valueOf(n7927Dta_ForPhn), A7927Dta_ForPhn, Boolean.valueOf(n7928Dta_ForUli), Short.valueOf(A7928Dta_ForUli)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT004");
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
               /* End Insert */
               /* Using cursor P01AM8 */
               pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A7907Dtp_ForLin = P01AM8_A7907Dtp_ForLin[0] ;
                  A7908Dtp_Prdnum = P01AM8_A7908Dtp_Prdnum[0] ;
                  n7908Dtp_Prdnum = P01AM8_n7908Dtp_Prdnum[0] ;
                  A7910Dtp_Forcan = P01AM8_A7910Dtp_Forcan[0] ;
                  n7910Dtp_Forcan = P01AM8_n7910Dtp_Forcan[0] ;
                  A8475Dtp_clave1 = P01AM8_A8475Dtp_clave1[0] ;
                  n8475Dtp_clave1 = P01AM8_n8475Dtp_clave1[0] ;
                  A8476Dtp_clave2 = P01AM8_A8476Dtp_clave2[0] ;
                  n8476Dtp_clave2 = P01AM8_n8476Dtp_clave2[0] ;
                  A490ForPrdUMe = P01AM8_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P01AM8_n490ForPrdUMe[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPDT0041

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  W490ForPrdUMe = A490ForPrdUMe ;
                  n490ForPrdUMe = false ;
                  A396EmprCod = AV15EmprCod ;
                  A361DisCod = AV16DisCod ;
                  A758ProCod = AV19ProCod ;
                  A368DisFasLin = A774ProNumLin ;
                  A7919Dta_Ordl = A7897Dtp_Ordl ;
                  A7929Dta_ForLin = A7907Dtp_ForLin ;
                  A7930Dta_Prdnum = A7908Dtp_Prdnum ;
                  n7930Dta_Prdnum = false ;
                  n490ForPrdUMe = false ;
                  A7932Dta_Forcan = A7910Dtp_Forcan ;
                  n7932Dta_Forcan = false ;
                  A8479Dta_clave1 = A8475Dtp_clave1 ;
                  n8479Dta_clave1 = false ;
                  A8480Dta_clave2 = A8476Dtp_clave2 ;
                  n8480Dta_clave2 = false ;
                  /* Using cursor P01AM9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin), Boolean.valueOf(n7930Dta_Prdnum), A7930Dta_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7932Dta_Forcan), A7932Dta_Forcan, Boolean.valueOf(n8479Dta_clave1), A8479Dta_clave1, Boolean.valueOf(n8480Dta_clave2), A8480Dta_clave2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0041");
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
                  A490ForPrdUMe = W490ForPrdUMe ;
                  n490ForPrdUMe = false ;
                  /* End Insert */
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV25Np = (short)(AV25Np+1) ;
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprl.this.AV15EmprCod;
      this.aP1[0] = pbusprl.this.AV16DisCod;
      this.aP2[0] = pbusprl.this.AV17ArtCod;
      this.aP3[0] = pbusprl.this.AV18CliCod;
      this.aP4[0] = pbusprl.this.AV24MdlCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbusprl");
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
      P01AM2_A775ProUltLin = new short[1] ;
      P01AM2_A4658MdlCod = new String[] {""} ;
      P01AM2_A252CliCod = new int[1] ;
      P01AM2_A65ArtCod = new String[] {""} ;
      P01AM2_A396EmprCod = new String[] {""} ;
      P01AM2_A758ProCod = new String[] {""} ;
      A4658MdlCod = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      AV19ProCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P01AM4_A774ProNumLin = new short[1] ;
      P01AM4_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AM4_n7893Dtp_Tpp = new boolean[] {false} ;
      P01AM4_A7896Dtp_UnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AM4_n7896Dtp_UnpLt = new boolean[] {false} ;
      P01AM4_A7911Dtp_UOrd = new short[1] ;
      P01AM4_n7911Dtp_UOrd = new boolean[] {false} ;
      P01AM4_A7744FasPreObl = new byte[1] ;
      P01AM4_n7744FasPreObl = new boolean[] {false} ;
      P01AM4_A758ProCod = new String[] {""} ;
      P01AM4_A396EmprCod = new String[] {""} ;
      P01AM4_A457FasCod = new String[] {""} ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      AV22FasCod = "" ;
      W457FasCod = "" ;
      A7915Disfastpp = DecimalUtil.ZERO ;
      A7916DisFasUpL = DecimalUtil.ZERO ;
      A7917DisfasRb = DecimalUtil.ZERO ;
      P01AM6_A396EmprCod = new String[] {""} ;
      P01AM6_A758ProCod = new String[] {""} ;
      P01AM6_A774ProNumLin = new short[1] ;
      P01AM6_A7897Dtp_Ordl = new short[1] ;
      P01AM6_A7898Dtp_CPQ = new String[] {""} ;
      P01AM6_n7898Dtp_CPQ = new boolean[] {false} ;
      P01AM6_A7900Dtp_ForFab = new String[] {""} ;
      P01AM6_n7900Dtp_ForFab = new boolean[] {false} ;
      P01AM6_A7901Dtp_Fortie = new short[1] ;
      P01AM6_n7901Dtp_Fortie = new boolean[] {false} ;
      P01AM6_A7902Dtp_ForTmx = new short[1] ;
      P01AM6_n7902Dtp_ForTmx = new boolean[] {false} ;
      P01AM6_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AM6_n7903Dtp_ForRb = new boolean[] {false} ;
      P01AM6_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AM6_n7904Dtp_ForPhx = new boolean[] {false} ;
      P01AM6_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AM6_n7905Dtp_ForPhn = new boolean[] {false} ;
      P01AM6_A7906Dtp_ForUli = new short[1] ;
      P01AM6_n7906Dtp_ForUli = new boolean[] {false} ;
      A7898Dtp_CPQ = "" ;
      A7900Dtp_ForFab = "" ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      A7920Dta_CPQ = "" ;
      A7922Dta_ForFab = "" ;
      A7925Dta_ForRb = DecimalUtil.ZERO ;
      A7926Dta_ForPhx = DecimalUtil.ZERO ;
      A7927Dta_ForPhn = DecimalUtil.ZERO ;
      P01AM8_A396EmprCod = new String[] {""} ;
      P01AM8_A758ProCod = new String[] {""} ;
      P01AM8_A774ProNumLin = new short[1] ;
      P01AM8_A7897Dtp_Ordl = new short[1] ;
      P01AM8_A7907Dtp_ForLin = new short[1] ;
      P01AM8_A7908Dtp_Prdnum = new String[] {""} ;
      P01AM8_n7908Dtp_Prdnum = new boolean[] {false} ;
      P01AM8_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01AM8_n7910Dtp_Forcan = new boolean[] {false} ;
      P01AM8_A8475Dtp_clave1 = new String[] {""} ;
      P01AM8_n8475Dtp_clave1 = new boolean[] {false} ;
      P01AM8_A8476Dtp_clave2 = new String[] {""} ;
      P01AM8_n8476Dtp_clave2 = new boolean[] {false} ;
      P01AM8_A490ForPrdUMe = new byte[1] ;
      P01AM8_n490ForPrdUMe = new boolean[] {false} ;
      A7908Dtp_Prdnum = "" ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      A8475Dtp_clave1 = "" ;
      A8476Dtp_clave2 = "" ;
      A7930Dta_Prdnum = "" ;
      A7932Dta_Forcan = DecimalUtil.ZERO ;
      A8479Dta_clave1 = "" ;
      A8480Dta_clave2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprl__default(),
         new Object[] {
             new Object[] {
            P01AM2_A775ProUltLin, P01AM2_A4658MdlCod, P01AM2_A252CliCod, P01AM2_A65ArtCod, P01AM2_A396EmprCod, P01AM2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01AM4_A774ProNumLin, P01AM4_A7893Dtp_Tpp, P01AM4_n7893Dtp_Tpp, P01AM4_A7896Dtp_UnpLt, P01AM4_n7896Dtp_UnpLt, P01AM4_A7911Dtp_UOrd, P01AM4_n7911Dtp_UOrd, P01AM4_A7744FasPreObl, P01AM4_n7744FasPreObl, P01AM4_A758ProCod,
            P01AM4_A396EmprCod, P01AM4_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01AM6_A396EmprCod, P01AM6_A758ProCod, P01AM6_A774ProNumLin, P01AM6_A7897Dtp_Ordl, P01AM6_A7898Dtp_CPQ, P01AM6_n7898Dtp_CPQ, P01AM6_A7900Dtp_ForFab, P01AM6_n7900Dtp_ForFab, P01AM6_A7901Dtp_Fortie, P01AM6_n7901Dtp_Fortie,
            P01AM6_A7902Dtp_ForTmx, P01AM6_n7902Dtp_ForTmx, P01AM6_A7903Dtp_ForRb, P01AM6_n7903Dtp_ForRb, P01AM6_A7904Dtp_ForPhx, P01AM6_n7904Dtp_ForPhx, P01AM6_A7905Dtp_ForPhn, P01AM6_n7905Dtp_ForPhn, P01AM6_A7906Dtp_ForUli, P01AM6_n7906Dtp_ForUli
            }
            , new Object[] {
            }
            , new Object[] {
            P01AM8_A396EmprCod, P01AM8_A758ProCod, P01AM8_A774ProNumLin, P01AM8_A7897Dtp_Ordl, P01AM8_A7907Dtp_ForLin, P01AM8_A7908Dtp_Prdnum, P01AM8_n7908Dtp_Prdnum, P01AM8_A7910Dtp_Forcan, P01AM8_n7910Dtp_Forcan, P01AM8_A8475Dtp_clave1,
            P01AM8_n8475Dtp_clave1, P01AM8_A8476Dtp_clave2, P01AM8_n8476Dtp_clave2, P01AM8_A490ForPrdUMe, P01AM8_n490ForPrdUMe
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7744FasPreObl ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short AV25Np ;
   private short A775ProUltLin ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private short A774ProNumLin ;
   private short A7911Dtp_UOrd ;
   private short A368DisFasLin ;
   private short A7918Dta_UOrd ;
   private short A7897Dtp_Ordl ;
   private short A7901Dtp_Fortie ;
   private short A7902Dtp_ForTmx ;
   private short A7906Dtp_ForUli ;
   private short A7919Dta_Ordl ;
   private short A7923Dta_Fortie ;
   private short A7924Dta_ForTmx ;
   private short A7928Dta_ForUli ;
   private short A7907Dtp_ForLin ;
   private short A7929Dta_ForLin ;
   private int AV16DisCod ;
   private int AV18CliCod ;
   private int A252CliCod ;
   private int GX_INS38 ;
   private int A361DisCod ;
   private int GX_INS39 ;
   private int GX_INS1106 ;
   private int GX_INS1107 ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private java.math.BigDecimal A7896Dtp_UnpLt ;
   private java.math.BigDecimal A7915Disfastpp ;
   private java.math.BigDecimal A7916DisFasUpL ;
   private java.math.BigDecimal A7917DisfasRb ;
   private java.math.BigDecimal A7903Dtp_ForRb ;
   private java.math.BigDecimal A7904Dtp_ForPhx ;
   private java.math.BigDecimal A7905Dtp_ForPhn ;
   private java.math.BigDecimal A7925Dta_ForRb ;
   private java.math.BigDecimal A7926Dta_ForPhx ;
   private java.math.BigDecimal A7927Dta_ForPhn ;
   private java.math.BigDecimal A7910Dtp_Forcan ;
   private java.math.BigDecimal A7932Dta_Forcan ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String AV24MdlCod ;
   private String scmdbuf ;
   private String A4658MdlCod ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String AV19ProCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String AV22FasCod ;
   private String W457FasCod ;
   private String A7898Dtp_CPQ ;
   private String A7900Dtp_ForFab ;
   private String A7920Dta_CPQ ;
   private String A7922Dta_ForFab ;
   private String A7908Dtp_Prdnum ;
   private String A8475Dtp_clave1 ;
   private String A8476Dtp_clave2 ;
   private String A7930Dta_Prdnum ;
   private String A8479Dta_clave1 ;
   private String A8480Dta_clave2 ;
   private boolean n7893Dtp_Tpp ;
   private boolean n7896Dtp_UnpLt ;
   private boolean n7911Dtp_UOrd ;
   private boolean n7744FasPreObl ;
   private boolean n7915Disfastpp ;
   private boolean n7916DisFasUpL ;
   private boolean n7917DisfasRb ;
   private boolean n7918Dta_UOrd ;
   private boolean n7898Dtp_CPQ ;
   private boolean n7900Dtp_ForFab ;
   private boolean n7901Dtp_Fortie ;
   private boolean n7902Dtp_ForTmx ;
   private boolean n7903Dtp_ForRb ;
   private boolean n7904Dtp_ForPhx ;
   private boolean n7905Dtp_ForPhn ;
   private boolean n7906Dtp_ForUli ;
   private boolean n7920Dta_CPQ ;
   private boolean n7922Dta_ForFab ;
   private boolean n7923Dta_Fortie ;
   private boolean n7924Dta_ForTmx ;
   private boolean n7925Dta_ForRb ;
   private boolean n7926Dta_ForPhx ;
   private boolean n7927Dta_ForPhn ;
   private boolean n7928Dta_ForUli ;
   private boolean n7908Dtp_Prdnum ;
   private boolean n7910Dtp_Forcan ;
   private boolean n8475Dtp_clave1 ;
   private boolean n8476Dtp_clave2 ;
   private boolean n490ForPrdUMe ;
   private boolean n7930Dta_Prdnum ;
   private boolean n7932Dta_Forcan ;
   private boolean n8479Dta_clave1 ;
   private boolean n8480Dta_clave2 ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P01AM2_A775ProUltLin ;
   private String[] P01AM2_A4658MdlCod ;
   private int[] P01AM2_A252CliCod ;
   private String[] P01AM2_A65ArtCod ;
   private String[] P01AM2_A396EmprCod ;
   private String[] P01AM2_A758ProCod ;
   private short[] P01AM4_A774ProNumLin ;
   private java.math.BigDecimal[] P01AM4_A7893Dtp_Tpp ;
   private boolean[] P01AM4_n7893Dtp_Tpp ;
   private java.math.BigDecimal[] P01AM4_A7896Dtp_UnpLt ;
   private boolean[] P01AM4_n7896Dtp_UnpLt ;
   private short[] P01AM4_A7911Dtp_UOrd ;
   private boolean[] P01AM4_n7911Dtp_UOrd ;
   private byte[] P01AM4_A7744FasPreObl ;
   private boolean[] P01AM4_n7744FasPreObl ;
   private String[] P01AM4_A758ProCod ;
   private String[] P01AM4_A396EmprCod ;
   private String[] P01AM4_A457FasCod ;
   private String[] P01AM6_A396EmprCod ;
   private String[] P01AM6_A758ProCod ;
   private short[] P01AM6_A774ProNumLin ;
   private short[] P01AM6_A7897Dtp_Ordl ;
   private String[] P01AM6_A7898Dtp_CPQ ;
   private boolean[] P01AM6_n7898Dtp_CPQ ;
   private String[] P01AM6_A7900Dtp_ForFab ;
   private boolean[] P01AM6_n7900Dtp_ForFab ;
   private short[] P01AM6_A7901Dtp_Fortie ;
   private boolean[] P01AM6_n7901Dtp_Fortie ;
   private short[] P01AM6_A7902Dtp_ForTmx ;
   private boolean[] P01AM6_n7902Dtp_ForTmx ;
   private java.math.BigDecimal[] P01AM6_A7903Dtp_ForRb ;
   private boolean[] P01AM6_n7903Dtp_ForRb ;
   private java.math.BigDecimal[] P01AM6_A7904Dtp_ForPhx ;
   private boolean[] P01AM6_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] P01AM6_A7905Dtp_ForPhn ;
   private boolean[] P01AM6_n7905Dtp_ForPhn ;
   private short[] P01AM6_A7906Dtp_ForUli ;
   private boolean[] P01AM6_n7906Dtp_ForUli ;
   private String[] P01AM8_A396EmprCod ;
   private String[] P01AM8_A758ProCod ;
   private short[] P01AM8_A774ProNumLin ;
   private short[] P01AM8_A7897Dtp_Ordl ;
   private short[] P01AM8_A7907Dtp_ForLin ;
   private String[] P01AM8_A7908Dtp_Prdnum ;
   private boolean[] P01AM8_n7908Dtp_Prdnum ;
   private java.math.BigDecimal[] P01AM8_A7910Dtp_Forcan ;
   private boolean[] P01AM8_n7910Dtp_Forcan ;
   private String[] P01AM8_A8475Dtp_clave1 ;
   private boolean[] P01AM8_n8475Dtp_clave1 ;
   private String[] P01AM8_A8476Dtp_clave2 ;
   private boolean[] P01AM8_n8476Dtp_clave2 ;
   private byte[] P01AM8_A490ForPrdUMe ;
   private boolean[] P01AM8_n490ForPrdUMe ;
}

final  class pbusprl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AM2", "SELECT T2.ProUltLin, T1.MdlCod, T1.CliCod, T1.ArtCod, T1.EmprCod, T1.ProCod FROM (TXPModPro T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.MdlCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.MdlCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01AM3", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P01AM4", "SELECT T1.ProNumLin, T1.Dtp_Tpp, T1.Dtp_UnpLt, T1.Dtp_UOrd, T2.FasPreObl, T1.ProCod, T1.EmprCod, T1.FasCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01AM5", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, FasPreObl, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P01AM6", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01AM7", "INSERT INTO TXPDT004(EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT004")
         ,new ForEachCursor("P01AM8", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, Dtp_Forcan, Dtp_clave1, Dtp_clave2, ForPrdUMe FROM TXPDT0021 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01AM9", "INSERT INTO TXPDT0041(EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin, Dta_Prdnum, ForPrdUMe, Dta_Forcan, Dta_clave1, Dta_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0041")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 16);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 30);
               }
               return;
      }
   }

}

