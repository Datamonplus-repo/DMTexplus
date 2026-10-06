package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptnart extends GXProcedure
{
   public pptnart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptnart.class ), "" );
   }

   public pptnart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pptnart.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pptnart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptnart.this.AV15Clicod = aP1[0];
      this.aP1 = aP1;
      pptnart.this.AV16ArtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV17Tab_clArt[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      AV18i = (short)(1) ;
      AV20Num_r = 0 ;
      /* Using cursor P037X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P037X2_A65ArtCod[0] ;
         A252CliCod = P037X2_A252CliCod[0] ;
         if ( A252CliCod != AV15Clicod )
         {
            if ( AV18i > 1000 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 1000 Clientes ¡¡¡", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( A252CliCod > 0 )
            {
               AV17Tab_clArt[AV18i-1] = A252CliCod ;
               AV18i = (short)(AV18i+1) ;
               AV20Num_r = (int)(AV20Num_r+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Registros a procesar.. ", "") + GXutil.str( AV20Num_r, 6, 0) ;
      System.out.println( Gx_msg );
      AV18i = (short)(1) ;
      while ( AV18i <= 1000 )
      {
         if ( AV17Tab_clArt[AV18i-1] == 0 )
         {
            if (true) break;
         }
         AV19Clicodd = AV17Tab_clArt[AV18i-1] ;
         /* Using cursor P037X3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19Clicodd), AV16ArtCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7956Mq_CodM = P037X3_A7956Mq_CodM[0] ;
            A65ArtCod = P037X3_A65ArtCod[0] ;
            A252CliCod = P037X3_A252CliCod[0] ;
            /* Using cursor P037X4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A7783Mq_LinP = P037X4_A7783Mq_LinP[0] ;
               /* Optimized DELETE. */
               /* Using cursor P037X5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNARTp");
               /* End optimized DELETE. */
               /* Using cursor P037X6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P037X7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV18i = (short)(AV18i+1) ;
      }
      AV18i = (short)(1) ;
      while ( AV18i <= 1000 )
      {
         if ( AV17Tab_clArt[AV18i-1] == 0 )
         {
            if (true) break;
         }
         AV19Clicodd = AV17Tab_clArt[AV18i-1] ;
         /* Execute user subroutine: 'TNART' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TNART1' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TNARTP' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV18i = (short)(AV18i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'TNART' Routine */
      returnInSub = false ;
      /* Using cursor P037X8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV16ArtCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A65ArtCod = P037X8_A65ArtCod[0] ;
         A252CliCod = P037X8_A252CliCod[0] ;
         A10568Mq_FecA = P037X8_A10568Mq_FecA[0] ;
         n10568Mq_FecA = P037X8_n10568Mq_FecA[0] ;
         A10567Mq_UsuA = P037X8_A10567Mq_UsuA[0] ;
         n10567Mq_UsuA = P037X8_n10567Mq_UsuA[0] ;
         A7782Mq_ULinP = P037X8_A7782Mq_ULinP[0] ;
         n7782Mq_ULinP = P037X8_n7782Mq_ULinP[0] ;
         A7956Mq_CodM = P037X8_A7956Mq_CodM[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPTNART

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W7956Mq_CodM = A7956Mq_CodM ;
         A252CliCod = AV19Clicodd ;
         A65ArtCod = AV16ArtCod ;
         /* Using cursor P037X9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Boolean.valueOf(n7782Mq_ULinP), Short.valueOf(A7782Mq_ULinP), Boolean.valueOf(n10567Mq_UsuA), A10567Mq_UsuA, Boolean.valueOf(n10568Mq_FecA), A10568Mq_FecA});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
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
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A7956Mq_CodM = W7956Mq_CodM ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S121( )
   {
      /* 'TNART1' Routine */
      returnInSub = false ;
      /* Using cursor P037X10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV16ArtCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A7786Mq_ObsT = P037X10_A7786Mq_ObsT[0] ;
         n7786Mq_ObsT = P037X10_n7786Mq_ObsT[0] ;
         A65ArtCod = P037X10_A65ArtCod[0] ;
         A252CliCod = P037X10_A252CliCod[0] ;
         A10572Mq_FcM = P037X10_A10572Mq_FcM[0] ;
         n10572Mq_FcM = P037X10_n10572Mq_FcM[0] ;
         A10571Mq_UsM = P037X10_A10571Mq_UsM[0] ;
         n10571Mq_UsM = P037X10_n10571Mq_UsM[0] ;
         A10570Mq_FcA = P037X10_A10570Mq_FcA[0] ;
         n10570Mq_FcA = P037X10_n10570Mq_FcA[0] ;
         A10569Mq_UsA = P037X10_A10569Mq_UsA[0] ;
         n10569Mq_UsA = P037X10_n10569Mq_UsA[0] ;
         A7785Mq_PesF = P037X10_A7785Mq_PesF[0] ;
         n7785Mq_PesF = P037X10_n7785Mq_PesF[0] ;
         A7784Mq_PesI = P037X10_A7784Mq_PesI[0] ;
         n7784Mq_PesI = P037X10_n7784Mq_PesI[0] ;
         A7783Mq_LinP = P037X10_A7783Mq_LinP[0] ;
         A7956Mq_CodM = P037X10_A7956Mq_CodM[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPTNART1

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W7956Mq_CodM = A7956Mq_CodM ;
         W7783Mq_LinP = A7783Mq_LinP ;
         A252CliCod = AV19Clicodd ;
         A65ArtCod = AV16ArtCod ;
         /* Using cursor P037X11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Boolean.valueOf(n7784Mq_PesI), A7784Mq_PesI, Boolean.valueOf(n7785Mq_PesF), A7785Mq_PesF, Boolean.valueOf(n7786Mq_ObsT), A7786Mq_ObsT, Boolean.valueOf(n10569Mq_UsA), A10569Mq_UsA, Boolean.valueOf(n10570Mq_FcA), A10570Mq_FcA, Boolean.valueOf(n10571Mq_UsM), A10571Mq_UsM, Boolean.valueOf(n10572Mq_FcM), A10572Mq_FcM});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
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
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A7956Mq_CodM = W7956Mq_CodM ;
         A7783Mq_LinP = W7783Mq_LinP ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S131( )
   {
      /* 'TNARTP' Routine */
      returnInSub = false ;
      /* Using cursor P037X12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV16ArtCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A65ArtCod = P037X12_A65ArtCod[0] ;
         A252CliCod = P037X12_A252CliCod[0] ;
         A10576Par_FecM = P037X12_A10576Par_FecM[0] ;
         n10576Par_FecM = P037X12_n10576Par_FecM[0] ;
         A10575Par_UsuM = P037X12_A10575Par_UsuM[0] ;
         n10575Par_UsuM = P037X12_n10575Par_UsuM[0] ;
         A10574Par_FecA = P037X12_A10574Par_FecA[0] ;
         n10574Par_FecA = P037X12_n10574Par_FecA[0] ;
         A10573Par_UsuA = P037X12_A10573Par_UsuA[0] ;
         n10573Par_UsuA = P037X12_n10573Par_UsuA[0] ;
         A7953Par_Obs = P037X12_A7953Par_Obs[0] ;
         n7953Par_Obs = P037X12_n7953Par_Obs[0] ;
         A7952Par_Valor = P037X12_A7952Par_Valor[0] ;
         n7952Par_Valor = P037X12_n7952Par_Valor[0] ;
         A7949Par_Art = P037X12_A7949Par_Art[0] ;
         A7783Mq_LinP = P037X12_A7783Mq_LinP[0] ;
         A7956Mq_CodM = P037X12_A7956Mq_CodM[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPTNARTp

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W7956Mq_CodM = A7956Mq_CodM ;
         W7783Mq_LinP = A7783Mq_LinP ;
         W7949Par_Art = A7949Par_Art ;
         A252CliCod = AV19Clicodd ;
         A65ArtCod = AV16ArtCod ;
         /* Using cursor P037X13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A7956Mq_CodM, Short.valueOf(A7783Mq_LinP), Short.valueOf(A7949Par_Art), Boolean.valueOf(n7952Par_Valor), A7952Par_Valor, Boolean.valueOf(n7953Par_Obs), A7953Par_Obs, Boolean.valueOf(n10573Par_UsuA), A10573Par_UsuA, Boolean.valueOf(n10574Par_FecA), A10574Par_FecA, Boolean.valueOf(n10575Par_UsuM), A10575Par_UsuM, Boolean.valueOf(n10576Par_FecM), A10576Par_FecM});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNARTp");
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
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A7956Mq_CodM = W7956Mq_CodM ;
         A7783Mq_LinP = W7783Mq_LinP ;
         A7949Par_Art = W7949Par_Art ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptnart.this.A396EmprCod;
      this.aP1[0] = pptnart.this.AV15Clicod;
      this.aP2[0] = pptnart.this.AV16ArtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pptnart");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Tab_clArt = new int[1000] ;
      scmdbuf = "" ;
      P037X2_A396EmprCod = new String[] {""} ;
      P037X2_A65ArtCod = new String[] {""} ;
      P037X2_A252CliCod = new int[1] ;
      A65ArtCod = "" ;
      Gx_msg = "" ;
      P037X3_A396EmprCod = new String[] {""} ;
      P037X3_A7956Mq_CodM = new String[] {""} ;
      P037X3_A65ArtCod = new String[] {""} ;
      P037X3_A252CliCod = new int[1] ;
      A7956Mq_CodM = "" ;
      P037X4_A396EmprCod = new String[] {""} ;
      P037X4_A252CliCod = new int[1] ;
      P037X4_A65ArtCod = new String[] {""} ;
      P037X4_A7956Mq_CodM = new String[] {""} ;
      P037X4_A7783Mq_LinP = new short[1] ;
      P037X8_A396EmprCod = new String[] {""} ;
      P037X8_A65ArtCod = new String[] {""} ;
      P037X8_A252CliCod = new int[1] ;
      P037X8_A10568Mq_FecA = new java.util.Date[] {GXutil.nullDate()} ;
      P037X8_n10568Mq_FecA = new boolean[] {false} ;
      P037X8_A10567Mq_UsuA = new String[] {""} ;
      P037X8_n10567Mq_UsuA = new boolean[] {false} ;
      P037X8_A7782Mq_ULinP = new short[1] ;
      P037X8_n7782Mq_ULinP = new boolean[] {false} ;
      P037X8_A7956Mq_CodM = new String[] {""} ;
      A10568Mq_FecA = GXutil.resetTime( GXutil.nullDate() );
      A10567Mq_UsuA = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      W7956Mq_CodM = "" ;
      Gx_emsg = "" ;
      P037X10_A7786Mq_ObsT = new String[] {""} ;
      P037X10_n7786Mq_ObsT = new boolean[] {false} ;
      P037X10_A396EmprCod = new String[] {""} ;
      P037X10_A65ArtCod = new String[] {""} ;
      P037X10_A252CliCod = new int[1] ;
      P037X10_A10572Mq_FcM = new java.util.Date[] {GXutil.nullDate()} ;
      P037X10_n10572Mq_FcM = new boolean[] {false} ;
      P037X10_A10571Mq_UsM = new String[] {""} ;
      P037X10_n10571Mq_UsM = new boolean[] {false} ;
      P037X10_A10570Mq_FcA = new java.util.Date[] {GXutil.nullDate()} ;
      P037X10_n10570Mq_FcA = new boolean[] {false} ;
      P037X10_A10569Mq_UsA = new String[] {""} ;
      P037X10_n10569Mq_UsA = new boolean[] {false} ;
      P037X10_A7785Mq_PesF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037X10_n7785Mq_PesF = new boolean[] {false} ;
      P037X10_A7784Mq_PesI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037X10_n7784Mq_PesI = new boolean[] {false} ;
      P037X10_A7783Mq_LinP = new short[1] ;
      P037X10_A7956Mq_CodM = new String[] {""} ;
      A7786Mq_ObsT = "" ;
      A10572Mq_FcM = GXutil.resetTime( GXutil.nullDate() );
      A10571Mq_UsM = "" ;
      A10570Mq_FcA = GXutil.resetTime( GXutil.nullDate() );
      A10569Mq_UsA = "" ;
      A7785Mq_PesF = DecimalUtil.ZERO ;
      A7784Mq_PesI = DecimalUtil.ZERO ;
      P037X12_A396EmprCod = new String[] {""} ;
      P037X12_A65ArtCod = new String[] {""} ;
      P037X12_A252CliCod = new int[1] ;
      P037X12_A10576Par_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      P037X12_n10576Par_FecM = new boolean[] {false} ;
      P037X12_A10575Par_UsuM = new String[] {""} ;
      P037X12_n10575Par_UsuM = new boolean[] {false} ;
      P037X12_A10574Par_FecA = new java.util.Date[] {GXutil.nullDate()} ;
      P037X12_n10574Par_FecA = new boolean[] {false} ;
      P037X12_A10573Par_UsuA = new String[] {""} ;
      P037X12_n10573Par_UsuA = new boolean[] {false} ;
      P037X12_A7953Par_Obs = new String[] {""} ;
      P037X12_n7953Par_Obs = new boolean[] {false} ;
      P037X12_A7952Par_Valor = new String[] {""} ;
      P037X12_n7952Par_Valor = new boolean[] {false} ;
      P037X12_A7949Par_Art = new short[1] ;
      P037X12_A7783Mq_LinP = new short[1] ;
      P037X12_A7956Mq_CodM = new String[] {""} ;
      A10576Par_FecM = GXutil.resetTime( GXutil.nullDate() );
      A10575Par_UsuM = "" ;
      A10574Par_FecA = GXutil.resetTime( GXutil.nullDate() );
      A10573Par_UsuA = "" ;
      A7953Par_Obs = "" ;
      A7952Par_Valor = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptnart__default(),
         new Object[] {
             new Object[] {
            P037X2_A396EmprCod, P037X2_A65ArtCod, P037X2_A252CliCod
            }
            , new Object[] {
            P037X3_A396EmprCod, P037X3_A7956Mq_CodM, P037X3_A65ArtCod, P037X3_A252CliCod
            }
            , new Object[] {
            P037X4_A396EmprCod, P037X4_A252CliCod, P037X4_A65ArtCod, P037X4_A7956Mq_CodM, P037X4_A7783Mq_LinP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037X8_A396EmprCod, P037X8_A65ArtCod, P037X8_A252CliCod, P037X8_A10568Mq_FecA, P037X8_n10568Mq_FecA, P037X8_A10567Mq_UsuA, P037X8_n10567Mq_UsuA, P037X8_A7782Mq_ULinP, P037X8_n7782Mq_ULinP, P037X8_A7956Mq_CodM
            }
            , new Object[] {
            }
            , new Object[] {
            P037X10_A7786Mq_ObsT, P037X10_n7786Mq_ObsT, P037X10_A396EmprCod, P037X10_A65ArtCod, P037X10_A252CliCod, P037X10_A10572Mq_FcM, P037X10_n10572Mq_FcM, P037X10_A10571Mq_UsM, P037X10_n10571Mq_UsM, P037X10_A10570Mq_FcA,
            P037X10_n10570Mq_FcA, P037X10_A10569Mq_UsA, P037X10_n10569Mq_UsA, P037X10_A7785Mq_PesF, P037X10_n7785Mq_PesF, P037X10_A7784Mq_PesI, P037X10_n7784Mq_PesI, P037X10_A7783Mq_LinP, P037X10_A7956Mq_CodM
            }
            , new Object[] {
            }
            , new Object[] {
            P037X12_A396EmprCod, P037X12_A65ArtCod, P037X12_A252CliCod, P037X12_A10576Par_FecM, P037X12_n10576Par_FecM, P037X12_A10575Par_UsuM, P037X12_n10575Par_UsuM, P037X12_A10574Par_FecA, P037X12_n10574Par_FecA, P037X12_A10573Par_UsuA,
            P037X12_n10573Par_UsuA, P037X12_A7953Par_Obs, P037X12_n7953Par_Obs, P037X12_A7952Par_Valor, P037X12_n7952Par_Valor, P037X12_A7949Par_Art, P037X12_A7783Mq_LinP, P037X12_A7956Mq_CodM
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18i ;
   private short A7783Mq_LinP ;
   private short A7782Mq_ULinP ;
   private short Gx_err ;
   private short W7783Mq_LinP ;
   private short A7949Par_Art ;
   private short W7949Par_Art ;
   private int AV15Clicod ;
   private int GX_I ;
   private int AV17Tab_clArt[] ;
   private int AV20Num_r ;
   private int A252CliCod ;
   private int AV19Clicodd ;
   private int W252CliCod ;
   private int GX_INS1116 ;
   private int GX_INS1117 ;
   private int GX_INS1125 ;
   private java.math.BigDecimal A7785Mq_PesF ;
   private java.math.BigDecimal A7784Mq_PesI ;
   private String A396EmprCod ;
   private String AV16ArtCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String Gx_msg ;
   private String A7956Mq_CodM ;
   private String A10567Mq_UsuA ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String W7956Mq_CodM ;
   private String Gx_emsg ;
   private String A10571Mq_UsM ;
   private String A10569Mq_UsA ;
   private String A10575Par_UsuM ;
   private String A10573Par_UsuA ;
   private String A7952Par_Valor ;
   private java.util.Date A10568Mq_FecA ;
   private java.util.Date A10572Mq_FcM ;
   private java.util.Date A10570Mq_FcA ;
   private java.util.Date A10576Par_FecM ;
   private java.util.Date A10574Par_FecA ;
   private boolean returnInSub ;
   private boolean n10568Mq_FecA ;
   private boolean n10567Mq_UsuA ;
   private boolean n7782Mq_ULinP ;
   private boolean n7786Mq_ObsT ;
   private boolean n10572Mq_FcM ;
   private boolean n10571Mq_UsM ;
   private boolean n10570Mq_FcA ;
   private boolean n10569Mq_UsA ;
   private boolean n7785Mq_PesF ;
   private boolean n7784Mq_PesI ;
   private boolean n10576Par_FecM ;
   private boolean n10575Par_UsuM ;
   private boolean n10574Par_FecA ;
   private boolean n10573Par_UsuA ;
   private boolean n7953Par_Obs ;
   private boolean n7952Par_Valor ;
   private String A7786Mq_ObsT ;
   private String A7953Par_Obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P037X2_A396EmprCod ;
   private String[] P037X2_A65ArtCod ;
   private int[] P037X2_A252CliCod ;
   private String[] P037X3_A396EmprCod ;
   private String[] P037X3_A7956Mq_CodM ;
   private String[] P037X3_A65ArtCod ;
   private int[] P037X3_A252CliCod ;
   private String[] P037X4_A396EmprCod ;
   private int[] P037X4_A252CliCod ;
   private String[] P037X4_A65ArtCod ;
   private String[] P037X4_A7956Mq_CodM ;
   private short[] P037X4_A7783Mq_LinP ;
   private String[] P037X8_A396EmprCod ;
   private String[] P037X8_A65ArtCod ;
   private int[] P037X8_A252CliCod ;
   private java.util.Date[] P037X8_A10568Mq_FecA ;
   private boolean[] P037X8_n10568Mq_FecA ;
   private String[] P037X8_A10567Mq_UsuA ;
   private boolean[] P037X8_n10567Mq_UsuA ;
   private short[] P037X8_A7782Mq_ULinP ;
   private boolean[] P037X8_n7782Mq_ULinP ;
   private String[] P037X8_A7956Mq_CodM ;
   private String[] P037X10_A7786Mq_ObsT ;
   private boolean[] P037X10_n7786Mq_ObsT ;
   private String[] P037X10_A396EmprCod ;
   private String[] P037X10_A65ArtCod ;
   private int[] P037X10_A252CliCod ;
   private java.util.Date[] P037X10_A10572Mq_FcM ;
   private boolean[] P037X10_n10572Mq_FcM ;
   private String[] P037X10_A10571Mq_UsM ;
   private boolean[] P037X10_n10571Mq_UsM ;
   private java.util.Date[] P037X10_A10570Mq_FcA ;
   private boolean[] P037X10_n10570Mq_FcA ;
   private String[] P037X10_A10569Mq_UsA ;
   private boolean[] P037X10_n10569Mq_UsA ;
   private java.math.BigDecimal[] P037X10_A7785Mq_PesF ;
   private boolean[] P037X10_n7785Mq_PesF ;
   private java.math.BigDecimal[] P037X10_A7784Mq_PesI ;
   private boolean[] P037X10_n7784Mq_PesI ;
   private short[] P037X10_A7783Mq_LinP ;
   private String[] P037X10_A7956Mq_CodM ;
   private String[] P037X12_A396EmprCod ;
   private String[] P037X12_A65ArtCod ;
   private int[] P037X12_A252CliCod ;
   private java.util.Date[] P037X12_A10576Par_FecM ;
   private boolean[] P037X12_n10576Par_FecM ;
   private String[] P037X12_A10575Par_UsuM ;
   private boolean[] P037X12_n10575Par_UsuM ;
   private java.util.Date[] P037X12_A10574Par_FecA ;
   private boolean[] P037X12_n10574Par_FecA ;
   private String[] P037X12_A10573Par_UsuA ;
   private boolean[] P037X12_n10573Par_UsuA ;
   private String[] P037X12_A7953Par_Obs ;
   private boolean[] P037X12_n7953Par_Obs ;
   private String[] P037X12_A7952Par_Valor ;
   private boolean[] P037X12_n7952Par_Valor ;
   private short[] P037X12_A7949Par_Art ;
   private short[] P037X12_A7783Mq_LinP ;
   private String[] P037X12_A7956Mq_CodM ;
}

final  class pptnart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037X2", "SELECT EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and ArtCod = ? ORDER BY EmprCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037X3", "SELECT EmprCod, Mq_CodM, ArtCod, CliCod FROM TXPTNART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037X4", "SELECT EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037X5", "DELETE FROM TXPTNARTp  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ? and Mq_LinP = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNARTp")
         ,new UpdateCursor("P037X6", "DELETE FROM TXPTNART1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ? AND Mq_LinP = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNART1")
         ,new UpdateCursor("P037X7", "DELETE FROM TXPTNART  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNART")
         ,new ForEachCursor("P037X8", "SELECT EmprCod, ArtCod, CliCod, Mq_FecA, Mq_UsuA, Mq_ULinP, Mq_CodM FROM TXPTNART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037X9", "INSERT INTO TXPTNART(EmprCod, CliCod, ArtCod, Mq_CodM, Mq_ULinP, Mq_UsuA, Mq_FecA) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNART")
         ,new ForEachCursor("P037X10", "SELECT Mq_ObsT, EmprCod, ArtCod, CliCod, Mq_FcM, Mq_UsM, Mq_FcA, Mq_UsA, Mq_PesF, Mq_PesI, Mq_LinP, Mq_CodM FROM TXPTNART1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037X11", "INSERT INTO TXPTNART1(EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Mq_PesI, Mq_PesF, Mq_ObsT, Mq_UsA, Mq_FcA, Mq_UsM, Mq_FcM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNART1")
         ,new ForEachCursor("P037X12", "SELECT EmprCod, ArtCod, CliCod, Par_FecM, Par_UsuM, Par_FecA, Par_UsuA, Par_Obs, Par_Valor, Par_Art, Mq_LinP, Mq_CodM FROM TXPTNARTp WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037X13", "INSERT INTO TXPTNARTp(EmprCod, CliCod, ArtCod, Mq_CodM, Mq_LinP, Par_Art, Par_Valor, Par_Obs, Par_UsuA, Par_FecA, Par_UsuM, Par_FecM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNARTp")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 6);
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
               stmt.setString(2, (String)parms[1], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
                  stmt.setNull( 8 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(8, (String)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[18], false);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 400);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[17], false);
               }
               return;
      }
   }

}

