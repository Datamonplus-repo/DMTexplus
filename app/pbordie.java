package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbordie extends GXProcedure
{
   public pbordie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbordie.class ), "" );
   }

   public pbordie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pbordie.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pbordie.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbordie.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbordie.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbordie.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV20msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG249_", ""), (byte)(99), GXv_char2) ;
      pbordie.this.GXt_char1 = GXv_char2[0] ;
      AV20msg0 = GXt_char1 ;
      GXt_char1 = AV24msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN581_", ""), (byte)(99), GXv_char2) ;
      pbordie.this.GXt_char1 = GXv_char2[0] ;
      AV24msg1 = GXt_char1 ;
      AV19Flag = (byte)(0) ;
      /* Using cursor P00Y32 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00Y32_A361DisCod[0] ;
         A130BarCodPar = P00Y32_A130BarCodPar[0] ;
         A132BarCodReo = P00Y32_A132BarCodReo[0] ;
         A129BarCod = P00Y32_A129BarCod[0] ;
         A396EmprCod = P00Y32_A396EmprCod[0] ;
         A213BarSit = P00Y32_A213BarSit[0] ;
         /* Using cursor P00Y33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P00Y33_A194BarOrdLin[0] ;
            A153BarFasEst = P00Y33_A153BarFasEst[0] ;
            A758ProCod = P00Y33_A758ProCod[0] ;
            if ( A153BarFasEst >= 1 )
            {
               AV19Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV19Flag == 1 )
         {
            httpContext.GX_msglist.addItem(AV20msg0);
            if ( GXutil.strcmp(AV25Confirm, httpContext.getMessage( "S", "")) == 0 )
            {
               AV19Flag = (byte)(0) ;
            }
            else
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( AV19Flag == 0 )
         {
            /* Using cursor P00Y34 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A761ProFasLin = P00Y34_A761ProFasLin[0] ;
               n761ProFasLin = P00Y34_n761ProFasLin[0] ;
               A758ProCod = P00Y34_A758ProCod[0] ;
               /* Execute user subroutine: 'PRODUC' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'BARFAS' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Execute user subroutine: 'BARPRO' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Optimized DELETE. */
            /* Using cursor P00Y35 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
            /* End optimized DELETE. */
            AV22Metros = DecimalUtil.doubleToDec(0) ;
            AV23Piezas = (short)(0) ;
            /* Using cursor P00Y36 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1539BarComAnh = P00Y36_A1539BarComAnh[0] ;
               n1539BarComAnh = P00Y36_n1539BarComAnh[0] ;
               A1541BarComMtr = P00Y36_A1541BarComMtr[0] ;
               n1541BarComMtr = P00Y36_n1541BarComMtr[0] ;
               A1543BarComPie = P00Y36_A1543BarComPie[0] ;
               n1543BarComPie = P00Y36_n1543BarComPie[0] ;
               A2524DisComLin = P00Y36_A2524DisComLin[0] ;
               A1056DisComCod = P00Y36_A1056DisComCod[0] ;
               A1032FonCod = P00Y36_A1032FonCod[0] ;
               AV22Metros = AV22Metros.add(A1541BarComMtr) ;
               AV23Piezas = (short)(AV23Piezas+A1543BarComPie) ;
               /* Using cursor P00Y37 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV21DisCod = A361DisCod ;
            /* Using cursor P00Y38 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A758ProCod = P00Y38_A758ProCod[0] ;
               A846UltFasLin = P00Y38_A846UltFasLin[0] ;
               /* Optimized DELETE. */
               /* Using cursor P00Y39 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
               /* End optimized DELETE. */
               /* Using cursor P00Y310 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Optimized DELETE. */
            /* Using cursor P00Y311 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
            /* End optimized DELETE. */
         }
         /* Using cursor P00Y312 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19Flag == 0 )
      {
         /* Using cursor P00Y313 */
         pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV21DisCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A361DisCod = P00Y313_A361DisCod[0] ;
            A396EmprCod = P00Y313_A396EmprCod[0] ;
            /* Execute user subroutine: 'ELIEMPESA' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(11);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'DISCOM' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(11);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P00Y314 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      /* Using cursor P00Y315 */
      pr_default.execute(13, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A130BarCodPar = P00Y315_A130BarCodPar[0] ;
         A132BarCodReo = P00Y315_A132BarCodReo[0] ;
         A129BarCod = P00Y315_A129BarCod[0] ;
         A396EmprCod = P00Y315_A396EmprCod[0] ;
         A194BarOrdLin = P00Y315_A194BarOrdLin[0] ;
         A160BarFecRea = P00Y315_A160BarFecRea[0] ;
         A603MaqCodBis = P00Y315_A603MaqCodBis[0] ;
         A758ProCod = P00Y315_A758ProCod[0] ;
         AV26HisProFec = A160BarFecRea ;
         AV27MaqCod = A603MaqCodBis ;
         GXv_char2[0] = AV15EmprCod ;
         GXv_char3[0] = AV27MaqCod ;
         GXv_date4[0] = AV26HisProFec ;
         GXv_int5[0] = AV16BarCod ;
         GXv_int6[0] = AV17BarCodReo ;
         GXv_char7[0] = AV18BarCodPar ;
         new app.peliphr(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4, GXv_int5, GXv_int6, GXv_char7) ;
         pbordie.this.AV15EmprCod = GXv_char2[0] ;
         pbordie.this.AV27MaqCod = GXv_char3[0] ;
         pbordie.this.AV26HisProFec = GXv_date4[0] ;
         pbordie.this.AV16BarCod = GXv_int5[0] ;
         pbordie.this.AV17BarCodReo = GXv_int6[0] ;
         pbordie.this.AV18BarCodPar = GXv_char7[0] ;
         GXv_char7[0] = AV15EmprCod ;
         GXv_char3[0] = AV27MaqCod ;
         GXv_date4[0] = AV26HisProFec ;
         new app.pelipar(remoteHandle, context).execute( GXv_char7, GXv_char3, GXv_date4) ;
         pbordie.this.AV15EmprCod = GXv_char7[0] ;
         pbordie.this.AV27MaqCod = GXv_char3[0] ;
         pbordie.this.AV26HisProFec = GXv_date4[0] ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P00Y316 */
      pr_default.execute(14, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      /* End optimized DELETE. */
   }

   public void S131( )
   {
      /* 'BARPRO' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P00Y317 */
      pr_default.execute(15, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
      /* End optimized DELETE. */
   }

   public void S141( )
   {
      /* 'ELIEMPESA' Routine */
      returnInSub = false ;
      /* Using cursor P00Y318 */
      pr_default.execute(16, new Object[] {AV15EmprCod, Integer.valueOf(AV21DisCod)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A361DisCod = P00Y318_A361DisCod[0] ;
         A396EmprCod = P00Y318_A396EmprCod[0] ;
         A1057DisComAnh = P00Y318_A1057DisComAnh[0] ;
         n1057DisComAnh = P00Y318_n1057DisComAnh[0] ;
         A1031EmpesCod = P00Y318_A1031EmpesCod[0] ;
         n1031EmpesCod = P00Y318_n1031EmpesCod[0] ;
         A252CliCod = P00Y318_A252CliCod[0] ;
         A1032FonCod = P00Y318_A1032FonCod[0] ;
         A1056DisComCod = P00Y318_A1056DisComCod[0] ;
         A2524DisComLin = P00Y318_A2524DisComLin[0] ;
         A1031EmpesCod = P00Y318_A1031EmpesCod[0] ;
         n1031EmpesCod = P00Y318_n1031EmpesCod[0] ;
         A252CliCod = P00Y318_A252CliCod[0] ;
         GXv_char7[0] = A396EmprCod ;
         GXv_char3[0] = A1031EmpesCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char2[0] = A1032FonCod ;
         GXv_int8[0] = A361DisCod ;
         GXv_int9[0] = AV23Piezas ;
         GXv_decimal10[0] = AV22Metros ;
         GXv_char11[0] = httpContext.getMessage( "B", "") ;
         new app.peliemp(remoteHandle, context).execute( GXv_char7, GXv_char3, GXv_int5, GXv_char2, GXv_int8, GXv_int9, GXv_decimal10, GXv_char11) ;
         pbordie.this.A396EmprCod = GXv_char7[0] ;
         pbordie.this.A1031EmpesCod = GXv_char3[0] ;
         pbordie.this.A252CliCod = GXv_int5[0] ;
         pbordie.this.A1032FonCod = GXv_char2[0] ;
         pbordie.this.A361DisCod = GXv_int8[0] ;
         pbordie.this.AV23Piezas = GXv_int9[0] ;
         pbordie.this.AV22Metros = GXv_decimal10[0] ;
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void S151( )
   {
      /* 'DISCOM' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P00Y319 */
      pr_default.execute(17, new Object[] {AV15EmprCod, Integer.valueOf(AV21DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbordie.this.AV15EmprCod;
      this.aP1[0] = pbordie.this.AV16BarCod;
      this.aP2[0] = pbordie.this.AV17BarCodReo;
      this.aP3[0] = pbordie.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbordie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20msg0 = "" ;
      AV24msg1 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P00Y32_A361DisCod = new int[1] ;
      P00Y32_A130BarCodPar = new String[] {""} ;
      P00Y32_A132BarCodReo = new byte[1] ;
      P00Y32_A129BarCod = new int[1] ;
      P00Y32_A396EmprCod = new String[] {""} ;
      P00Y32_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P00Y33_A396EmprCod = new String[] {""} ;
      P00Y33_A129BarCod = new int[1] ;
      P00Y33_A132BarCodReo = new byte[1] ;
      P00Y33_A130BarCodPar = new String[] {""} ;
      P00Y33_A194BarOrdLin = new short[1] ;
      P00Y33_A153BarFasEst = new byte[1] ;
      P00Y33_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV25Confirm = "" ;
      P00Y34_A396EmprCod = new String[] {""} ;
      P00Y34_A129BarCod = new int[1] ;
      P00Y34_A132BarCodReo = new byte[1] ;
      P00Y34_A130BarCodPar = new String[] {""} ;
      P00Y34_A761ProFasLin = new short[1] ;
      P00Y34_n761ProFasLin = new boolean[] {false} ;
      P00Y34_A758ProCod = new String[] {""} ;
      AV22Metros = DecimalUtil.ZERO ;
      P00Y36_A396EmprCod = new String[] {""} ;
      P00Y36_A129BarCod = new int[1] ;
      P00Y36_A132BarCodReo = new byte[1] ;
      P00Y36_A130BarCodPar = new String[] {""} ;
      P00Y36_A1539BarComAnh = new short[1] ;
      P00Y36_n1539BarComAnh = new boolean[] {false} ;
      P00Y36_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00Y36_n1541BarComMtr = new boolean[] {false} ;
      P00Y36_A1543BarComPie = new short[1] ;
      P00Y36_n1543BarComPie = new boolean[] {false} ;
      P00Y36_A2524DisComLin = new byte[1] ;
      P00Y36_A1056DisComCod = new String[] {""} ;
      P00Y36_A1032FonCod = new String[] {""} ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      P00Y38_A396EmprCod = new String[] {""} ;
      P00Y38_A361DisCod = new int[1] ;
      P00Y38_A758ProCod = new String[] {""} ;
      P00Y38_A846UltFasLin = new short[1] ;
      P00Y313_A361DisCod = new int[1] ;
      P00Y313_A396EmprCod = new String[] {""} ;
      P00Y315_A130BarCodPar = new String[] {""} ;
      P00Y315_A132BarCodReo = new byte[1] ;
      P00Y315_A129BarCod = new int[1] ;
      P00Y315_A396EmprCod = new String[] {""} ;
      P00Y315_A194BarOrdLin = new short[1] ;
      P00Y315_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00Y315_A603MaqCodBis = new String[] {""} ;
      P00Y315_A758ProCod = new String[] {""} ;
      A160BarFecRea = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      AV26HisProFec = GXutil.nullDate() ;
      AV27MaqCod = "" ;
      GXv_int6 = new byte[1] ;
      GXv_date4 = new java.util.Date[1] ;
      P00Y318_A361DisCod = new int[1] ;
      P00Y318_A396EmprCod = new String[] {""} ;
      P00Y318_A1057DisComAnh = new short[1] ;
      P00Y318_n1057DisComAnh = new boolean[] {false} ;
      P00Y318_A1031EmpesCod = new String[] {""} ;
      P00Y318_n1031EmpesCod = new boolean[] {false} ;
      P00Y318_A252CliCod = new int[1] ;
      P00Y318_A1032FonCod = new String[] {""} ;
      P00Y318_A1056DisComCod = new String[] {""} ;
      P00Y318_A2524DisComLin = new byte[1] ;
      A1031EmpesCod = "" ;
      GXv_char7 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new short[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbordie__default(),
         new Object[] {
             new Object[] {
            P00Y32_A361DisCod, P00Y32_A130BarCodPar, P00Y32_A132BarCodReo, P00Y32_A129BarCod, P00Y32_A396EmprCod, P00Y32_A213BarSit
            }
            , new Object[] {
            P00Y33_A396EmprCod, P00Y33_A129BarCod, P00Y33_A132BarCodReo, P00Y33_A130BarCodPar, P00Y33_A194BarOrdLin, P00Y33_A153BarFasEst, P00Y33_A758ProCod
            }
            , new Object[] {
            P00Y34_A396EmprCod, P00Y34_A129BarCod, P00Y34_A132BarCodReo, P00Y34_A130BarCodPar, P00Y34_A761ProFasLin, P00Y34_n761ProFasLin, P00Y34_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00Y36_A396EmprCod, P00Y36_A129BarCod, P00Y36_A132BarCodReo, P00Y36_A130BarCodPar, P00Y36_A1539BarComAnh, P00Y36_n1539BarComAnh, P00Y36_A1541BarComMtr, P00Y36_n1541BarComMtr, P00Y36_A1543BarComPie, P00Y36_n1543BarComPie,
            P00Y36_A2524DisComLin, P00Y36_A1056DisComCod, P00Y36_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00Y38_A396EmprCod, P00Y38_A361DisCod, P00Y38_A758ProCod, P00Y38_A846UltFasLin
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
            P00Y313_A361DisCod, P00Y313_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00Y315_A130BarCodPar, P00Y315_A132BarCodReo, P00Y315_A129BarCod, P00Y315_A396EmprCod, P00Y315_A194BarOrdLin, P00Y315_A160BarFecRea, P00Y315_A603MaqCodBis, P00Y315_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00Y318_A361DisCod, P00Y318_A396EmprCod, P00Y318_A1057DisComAnh, P00Y318_n1057DisComAnh, P00Y318_A1031EmpesCod, P00Y318_n1031EmpesCod, P00Y318_A252CliCod, P00Y318_A1032FonCod, P00Y318_A1056DisComCod, P00Y318_A2524DisComLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV19Flag ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private byte A2524DisComLin ;
   private byte GXv_int6[] ;
   private short A194BarOrdLin ;
   private short A761ProFasLin ;
   private short AV23Piezas ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short A846UltFasLin ;
   private short A1057DisComAnh ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV21DisCod ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private java.math.BigDecimal AV22Metros ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV20msg0 ;
   private String AV24msg1 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV25Confirm ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A603MaqCodBis ;
   private String AV27MaqCod ;
   private String A1031EmpesCod ;
   private String GXv_char7[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date AV26HisProFec ;
   private java.util.Date GXv_date4[] ;
   private boolean n761ProFasLin ;
   private boolean returnInSub ;
   private boolean n1539BarComAnh ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n1057DisComAnh ;
   private boolean n1031EmpesCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P00Y32_A361DisCod ;
   private String[] P00Y32_A130BarCodPar ;
   private byte[] P00Y32_A132BarCodReo ;
   private int[] P00Y32_A129BarCod ;
   private String[] P00Y32_A396EmprCod ;
   private byte[] P00Y32_A213BarSit ;
   private String[] P00Y33_A396EmprCod ;
   private int[] P00Y33_A129BarCod ;
   private byte[] P00Y33_A132BarCodReo ;
   private String[] P00Y33_A130BarCodPar ;
   private short[] P00Y33_A194BarOrdLin ;
   private byte[] P00Y33_A153BarFasEst ;
   private String[] P00Y33_A758ProCod ;
   private String[] P00Y34_A396EmprCod ;
   private int[] P00Y34_A129BarCod ;
   private byte[] P00Y34_A132BarCodReo ;
   private String[] P00Y34_A130BarCodPar ;
   private short[] P00Y34_A761ProFasLin ;
   private boolean[] P00Y34_n761ProFasLin ;
   private String[] P00Y34_A758ProCod ;
   private String[] P00Y36_A396EmprCod ;
   private int[] P00Y36_A129BarCod ;
   private byte[] P00Y36_A132BarCodReo ;
   private String[] P00Y36_A130BarCodPar ;
   private short[] P00Y36_A1539BarComAnh ;
   private boolean[] P00Y36_n1539BarComAnh ;
   private java.math.BigDecimal[] P00Y36_A1541BarComMtr ;
   private boolean[] P00Y36_n1541BarComMtr ;
   private short[] P00Y36_A1543BarComPie ;
   private boolean[] P00Y36_n1543BarComPie ;
   private byte[] P00Y36_A2524DisComLin ;
   private String[] P00Y36_A1056DisComCod ;
   private String[] P00Y36_A1032FonCod ;
   private String[] P00Y38_A396EmprCod ;
   private int[] P00Y38_A361DisCod ;
   private String[] P00Y38_A758ProCod ;
   private short[] P00Y38_A846UltFasLin ;
   private int[] P00Y313_A361DisCod ;
   private String[] P00Y313_A396EmprCod ;
   private String[] P00Y315_A130BarCodPar ;
   private byte[] P00Y315_A132BarCodReo ;
   private int[] P00Y315_A129BarCod ;
   private String[] P00Y315_A396EmprCod ;
   private short[] P00Y315_A194BarOrdLin ;
   private java.util.Date[] P00Y315_A160BarFecRea ;
   private String[] P00Y315_A603MaqCodBis ;
   private String[] P00Y315_A758ProCod ;
   private int[] P00Y318_A361DisCod ;
   private String[] P00Y318_A396EmprCod ;
   private short[] P00Y318_A1057DisComAnh ;
   private boolean[] P00Y318_n1057DisComAnh ;
   private String[] P00Y318_A1031EmpesCod ;
   private boolean[] P00Y318_n1031EmpesCod ;
   private int[] P00Y318_A252CliCod ;
   private String[] P00Y318_A1032FonCod ;
   private String[] P00Y318_A1056DisComCod ;
   private byte[] P00Y318_A2524DisComLin ;
}

final  class pbordie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Y32", "SELECT DisCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00Y33", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00Y34", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00Y35", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new ForEachCursor("P00Y36", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarComAnh, BarComMtr, BarComPie, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00Y37", "DELETE FROM TXPBARCOM  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new ForEachCursor("P00Y38", "SELECT EmprCod, DisCod, ProCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00Y39", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? and DisCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P00Y310", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P00Y311", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P00Y312", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00Y313", "SELECT DisCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00Y314", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P00Y315", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, BarFecRea, MaqCodBis, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00Y316", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P00Y317", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P00Y318", "SELECT T1.DisCod, T1.EmprCod, T1.DisComAnh, T2.EmpesCod, T2.CliCod, T1.FonCod, T1.DisComCod, T1.DisComLin FROM (TXPDISCOM T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisComLin, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00Y319", "DELETE FROM TXPDISCOM  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISCOM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 12);
               ((String[]) buf[12])[0] = rslt.getString(10, 12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 12);
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

