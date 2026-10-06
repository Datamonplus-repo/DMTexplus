package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pborrser extends GXProcedure
{
   public pborrser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pborrser.class ), "" );
   }

   public pborrser( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pborrser.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pborrser.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pborrser.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pborrser.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pborrser.this.AV16ProCod = aP3[0];
      this.aP3 = aP3;
      pborrser.this.AV15Nivel = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV19Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pborrser.this.GXt_int1 = GXv_int2[0] ;
      AV19Carvema = GXt_int1 ;
      GXt_int1 = AV20KilArt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILART", ""), GXv_int2) ;
      pborrser.this.GXt_int1 = GXv_int2[0] ;
      AV20KilArt = GXt_int1 ;
      GXt_char3 = AV23Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pborrser.this.GXt_char3 = GXv_char4[0] ;
      AV23Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV25EmprNom ;
      GXv_char6[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char4, GXv_char5, GXv_char6) ;
      pborrser.this.A396EmprCod = GXv_char4[0] ;
      pborrser.this.AV25EmprNom = GXv_char5[0] ;
      pborrser.this.AV24Usurcod = GXv_char6[0] ;
      if ( GXutil.strcmp(AV15Nivel, httpContext.getMessage( "ART", "")) == 0 )
      {
         /* Execute user subroutine: 'BUSCAHDR' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV17Existe, httpContext.getMessage( "S", "")) == 0 ) && ( AV19Carvema == 0 ) && ( AV20KilArt == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Existen HDR sin pasar a estad. para esta serie. NO SE ELIMINARA", ""));
         }
         else
         {
            AV21Ok = httpContext.getMessage( "S", "") ;
            AV26Msg_avis = " " ;
            if ( ( GXutil.strcmp(AV17Existe, httpContext.getMessage( "S", "")) == 0 ) && ( ( AV19Carvema == 1 ) || ( AV20KilArt == 1 ) ) )
            {
               AV26Msg_avis = httpContext.getMessage( "Atencion.Existe informacion en TABLA BARCAD.", "") + GXutil.chr( (short)(13)) ;
               AV26Msg_avis += httpContext.getMessage( "Como esta activo el contador KILART", "") + GXutil.chr( (short)(13)) ;
               AV26Msg_avis += httpContext.getMessage( "El sistema procedara a la ELIMINACION DEL ARTICULO", "") + GXutil.chr( (short)(13)) ;
               httpContext.GX_msglist.addItem(AV26Msg_avis);
            }
            if ( GXutil.strcmp(AV21Ok, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Optimized DELETE. */
               /* Using cursor P00QN2 */
               pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCArt");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
               /* End optimized DELETE. */
               /* Using cursor P00QN6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A9836FasCodM = P00QN6_A9836FasCodM[0] ;
                  A758ProCod = P00QN6_A758ProCod[0] ;
                  /* Using cursor P00QN7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A9830MaqCodC = P00QN7_A9830MaqCodC[0] ;
                     /* Using cursor P00QN8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
                     while ( (pr_default.getStatus(6) != 101) )
                     {
                        A9864MaqAncA = P00QN8_A9864MaqAncA[0] ;
                        /* Optimized DELETE. */
                        /* Using cursor P00QN9 */
                        pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
                        /* End optimized DELETE. */
                        /* Using cursor P00QN10 */
                        pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMQA");
                        pr_default.readNext(6);
                     }
                     pr_default.close(6);
                     /* Optimized DELETE. */
                     /* Using cursor P00QN11 */
                     pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
                     /* End optimized DELETE. */
                     /* Using cursor P00QN12 */
                     pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM1");
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  /* Using cursor P00QN13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFMP");
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               /* Optimized DELETE. */
               /* Using cursor P00QN14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARG");
               /* End optimized DELETE. */
               /* Using cursor P00QN17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               while ( (pr_default.getStatus(15) != 101) )
               {
                  A1504CliProCod = P00QN17_A1504CliProCod[0] ;
                  /* Using cursor P00QN18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
                  /* Optimized DELETE. */
                  /* Using cursor P00QN19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPREPR");
                  /* End optimized DELETE. */
                  /* Optimized DELETE. */
                  /* Using cursor P00QN20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPIL");
                  /* End optimized DELETE. */
                  pr_default.readNext(15);
               }
               pr_default.close(15);
               /* Optimized DELETE. */
               /* Using cursor P00QN21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARB");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTINT");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRBART");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARSER");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRECAP");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREMAN");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN27 */
               pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANBRL");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN28 */
               pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARMAN");
               /* End optimized DELETE. */
               /* Using cursor P00QN29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               while ( (pr_default.getStatus(27) != 101) )
               {
                  A6986NumLinPro = P00QN29_A6986NumLinPro[0] ;
                  A758ProCod = P00QN29_A758ProCod[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P00QN30 */
                  pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARAR1");
                  /* End optimized DELETE. */
                  /* Using cursor P00QN31 */
                  pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARART");
                  pr_default.readNext(27);
               }
               pr_default.close(27);
               /* Optimized DELETE. */
               /* Using cursor P00QN32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
               /* End optimized DELETE. */
               /* Using cursor P00QN33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               while ( (pr_default.getStatus(31) != 101) )
               {
                  A7956Mq_CodM = P00QN33_A7956Mq_CodM[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P00QN34 */
                  pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7956Mq_CodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART1");
                  /* End optimized DELETE. */
                  /* Optimized DELETE. */
                  /* Using cursor P00QN35 */
                  pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7956Mq_CodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNARTp");
                  /* End optimized DELETE. */
                  /* Using cursor P00QN36 */
                  pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7956Mq_CodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTNART");
                  pr_default.readNext(31);
               }
               pr_default.close(31);
               /* Optimized DELETE. */
               /* Using cursor P00QN37 */
               pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTTEJ");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN38 */
               pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEJART");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00QN39 */
               pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTBRS");
               /* End optimized DELETE. */
               /* Using cursor P00QN40 */
               pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               while ( (pr_default.getStatus(38) != 101) )
               {
                  A117ArtUrg = P00QN40_A117ArtUrg[0] ;
                  n117ArtUrg = P00QN40_n117ArtUrg[0] ;
                  /* Using cursor P00QN41 */
                  pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( GXutil.strcmp(AV26Msg_avis, " ") != 0 )
                  {
                     AV26Msg_avis += httpContext.getMessage( "Cliente=", "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( "Articulo=", "") + A65ArtCod + GXutil.chr( (short)(13)) ;
                  }
                  else
                  {
                     AV26Msg_avis = httpContext.getMessage( "ELIMINACION SIN INFORMACION EN BARCAD, ", "") + httpContext.getMessage( "Cliente=", "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( "Articulo=", "") + A65ArtCod ;
                  }
                  AV22Inc_obs = AV26Msg_avis ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV24Usurcod, AV23Station, AV22Inc_obs, 99999999, (byte)(9), "@") ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(38);
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Serie eliminada", ""));
               /* Using cursor P00QN42 */
               pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               while ( (pr_default.getStatus(40) != 101) )
               {
                  A2756ArtEstSer = P00QN42_A2756ArtEstSer[0] ;
                  A71ArtEstAny = P00QN42_A71ArtEstAny[0] ;
                  A94ArtRdto = P00QN42_A94ArtRdto[0] ;
                  n94ArtRdto = P00QN42_n94ArtRdto[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P00QN43 */
                  pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESART");
                  /* End optimized DELETE. */
                  /* Using cursor P00QN44 */
                  pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
                  pr_default.readNext(40);
               }
               pr_default.close(40);
            }
         }
      }
      if ( GXutil.strcmp(AV15Nivel, httpContext.getMessage( "PRO", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P00QN45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, AV16ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00QN46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, AV16ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
         /* End optimized DELETE. */
         /* Using cursor P00QN47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, AV16ProCod});
         while ( (pr_default.getStatus(45) != 101) )
         {
            A6986NumLinPro = P00QN47_A6986NumLinPro[0] ;
            A758ProCod = P00QN47_A758ProCod[0] ;
            /* Optimized DELETE. */
            /* Using cursor P00QN48 */
            pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARAR1");
            /* End optimized DELETE. */
            /* Using cursor P00QN49 */
            pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARART");
            pr_default.readNext(45);
         }
         pr_default.close(45);
         /* Using cursor P00QN50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, AV16ProCod});
         while ( (pr_default.getStatus(48) != 101) )
         {
            A9836FasCodM = P00QN50_A9836FasCodM[0] ;
            A758ProCod = P00QN50_A758ProCod[0] ;
            /* Using cursor P00QN51 */
            pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM});
            while ( (pr_default.getStatus(49) != 101) )
            {
               A9830MaqCodC = P00QN51_A9830MaqCodC[0] ;
               /* Using cursor P00QN52 */
               pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
               while ( (pr_default.getStatus(50) != 101) )
               {
                  A9864MaqAncA = P00QN52_A9864MaqAncA[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P00QN53 */
                  pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
                  /* End optimized DELETE. */
                  /* Using cursor P00QN54 */
                  pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMQA");
                  pr_default.readNext(50);
               }
               pr_default.close(50);
               /* Optimized DELETE. */
               /* Using cursor P00QN55 */
               pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
               /* End optimized DELETE. */
               /* Using cursor P00QN56 */
               pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM1");
               pr_default.readNext(49);
            }
            pr_default.close(49);
            /* Using cursor P00QN57 */
            pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A9836FasCodM});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFMP");
            pr_default.readNext(48);
         }
         pr_default.close(48);
         /* Using cursor P00QN58 */
         pr_default.execute(56, new Object[] {AV16ProCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         while ( (pr_default.getStatus(56) != 101) )
         {
            A758ProCod = P00QN58_A758ProCod[0] ;
            A4659MdlDsc = P00QN58_A4659MdlDsc[0] ;
            n4659MdlDsc = P00QN58_n4659MdlDsc[0] ;
            A4658MdlCod = P00QN58_A4658MdlCod[0] ;
            A758ProCod = P00QN58_A758ProCod[0] ;
            /* Using cursor P00QN59 */
            pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4658MdlCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
            pr_default.readNext(56);
         }
         pr_default.close(56);
         /* Optimized DELETE. */
         /* Using cursor P00QN60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, AV16ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModPro");
         /* End optimized DELETE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAHDR' Routine */
      returnInSub = false ;
      AV17Existe = httpContext.getMessage( "N", "") ;
      /* Using cursor P00QN61 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      while ( (pr_default.getStatus(59) != 101) )
      {
         A212BarSer = P00QN61_A212BarSer[0] ;
         A213BarSit = P00QN61_A213BarSit[0] ;
         A129BarCod = P00QN61_A129BarCod[0] ;
         A132BarCodReo = P00QN61_A132BarCodReo[0] ;
         A130BarCodPar = P00QN61_A130BarCodPar[0] ;
         if ( A213BarSit != 11 )
         {
            AV17Existe = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(59);
      }
      pr_default.close(59);
   }

   public void S121( )
   {
      /* 'COLORES' Routine */
      returnInSub = false ;
      AV18Cformu = 0 ;
      /* Optimized group. */
      /* Using cursor P00QN62 */
      pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      cV18Cformu = P00QN62_AV18Cformu[0] ;
      pr_default.close(60);
      AV18Cformu = (int)(AV18Cformu+cV18Cformu*1) ;
      /* End optimized group. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pborrser.this.A396EmprCod;
      this.aP1[0] = pborrser.this.A252CliCod;
      this.aP2[0] = pborrser.this.A65ArtCod;
      this.aP3[0] = pborrser.this.AV16ProCod;
      this.aP4[0] = pborrser.this.AV15Nivel;
      Application.commitDataStores(context, remoteHandle, pr_default, "pborrser");
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
      AV23Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV24Usurcod = "" ;
      GXv_char6 = new String[1] ;
      AV17Existe = "" ;
      AV21Ok = "" ;
      AV26Msg_avis = "" ;
      scmdbuf = "" ;
      P00QN6_A396EmprCod = new String[] {""} ;
      P00QN6_A252CliCod = new int[1] ;
      P00QN6_n252CliCod = new boolean[] {false} ;
      P00QN6_A65ArtCod = new String[] {""} ;
      P00QN6_n65ArtCod = new boolean[] {false} ;
      P00QN6_A9836FasCodM = new String[] {""} ;
      P00QN6_A758ProCod = new String[] {""} ;
      A9836FasCodM = "" ;
      A758ProCod = "" ;
      P00QN7_A396EmprCod = new String[] {""} ;
      P00QN7_A252CliCod = new int[1] ;
      P00QN7_n252CliCod = new boolean[] {false} ;
      P00QN7_A65ArtCod = new String[] {""} ;
      P00QN7_n65ArtCod = new boolean[] {false} ;
      P00QN7_A758ProCod = new String[] {""} ;
      P00QN7_A9836FasCodM = new String[] {""} ;
      P00QN7_A9830MaqCodC = new String[] {""} ;
      A9830MaqCodC = "" ;
      P00QN8_A396EmprCod = new String[] {""} ;
      P00QN8_A252CliCod = new int[1] ;
      P00QN8_n252CliCod = new boolean[] {false} ;
      P00QN8_A65ArtCod = new String[] {""} ;
      P00QN8_n65ArtCod = new boolean[] {false} ;
      P00QN8_A758ProCod = new String[] {""} ;
      P00QN8_A9836FasCodM = new String[] {""} ;
      P00QN8_A9830MaqCodC = new String[] {""} ;
      P00QN8_A9864MaqAncA = new short[1] ;
      P00QN17_A396EmprCod = new String[] {""} ;
      P00QN17_A252CliCod = new int[1] ;
      P00QN17_n252CliCod = new boolean[] {false} ;
      P00QN17_A65ArtCod = new String[] {""} ;
      P00QN17_n65ArtCod = new boolean[] {false} ;
      P00QN17_A1504CliProCod = new String[] {""} ;
      A1504CliProCod = "" ;
      P00QN29_A396EmprCod = new String[] {""} ;
      P00QN29_A252CliCod = new int[1] ;
      P00QN29_n252CliCod = new boolean[] {false} ;
      P00QN29_A65ArtCod = new String[] {""} ;
      P00QN29_n65ArtCod = new boolean[] {false} ;
      P00QN29_A6986NumLinPro = new short[1] ;
      P00QN29_A758ProCod = new String[] {""} ;
      P00QN33_A396EmprCod = new String[] {""} ;
      P00QN33_A252CliCod = new int[1] ;
      P00QN33_n252CliCod = new boolean[] {false} ;
      P00QN33_A65ArtCod = new String[] {""} ;
      P00QN33_n65ArtCod = new boolean[] {false} ;
      P00QN33_A7956Mq_CodM = new String[] {""} ;
      A7956Mq_CodM = "" ;
      P00QN40_A396EmprCod = new String[] {""} ;
      P00QN40_A252CliCod = new int[1] ;
      P00QN40_n252CliCod = new boolean[] {false} ;
      P00QN40_A65ArtCod = new String[] {""} ;
      P00QN40_n65ArtCod = new boolean[] {false} ;
      P00QN40_A117ArtUrg = new byte[1] ;
      P00QN40_n117ArtUrg = new boolean[] {false} ;
      AV22Inc_obs = "" ;
      AV62Pgmname = "" ;
      P00QN42_A396EmprCod = new String[] {""} ;
      P00QN42_A252CliCod = new int[1] ;
      P00QN42_n252CliCod = new boolean[] {false} ;
      P00QN42_A65ArtCod = new String[] {""} ;
      P00QN42_n65ArtCod = new boolean[] {false} ;
      P00QN42_A2756ArtEstSer = new String[] {""} ;
      P00QN42_A71ArtEstAny = new short[1] ;
      P00QN42_A94ArtRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00QN42_n94ArtRdto = new boolean[] {false} ;
      A2756ArtEstSer = "" ;
      A94ArtRdto = DecimalUtil.ZERO ;
      P00QN47_A396EmprCod = new String[] {""} ;
      P00QN47_A252CliCod = new int[1] ;
      P00QN47_n252CliCod = new boolean[] {false} ;
      P00QN47_A65ArtCod = new String[] {""} ;
      P00QN47_n65ArtCod = new boolean[] {false} ;
      P00QN47_A6986NumLinPro = new short[1] ;
      P00QN47_A758ProCod = new String[] {""} ;
      P00QN50_A396EmprCod = new String[] {""} ;
      P00QN50_A252CliCod = new int[1] ;
      P00QN50_n252CliCod = new boolean[] {false} ;
      P00QN50_A65ArtCod = new String[] {""} ;
      P00QN50_n65ArtCod = new boolean[] {false} ;
      P00QN50_A9836FasCodM = new String[] {""} ;
      P00QN50_A758ProCod = new String[] {""} ;
      P00QN51_A396EmprCod = new String[] {""} ;
      P00QN51_A252CliCod = new int[1] ;
      P00QN51_n252CliCod = new boolean[] {false} ;
      P00QN51_A65ArtCod = new String[] {""} ;
      P00QN51_n65ArtCod = new boolean[] {false} ;
      P00QN51_A758ProCod = new String[] {""} ;
      P00QN51_A9836FasCodM = new String[] {""} ;
      P00QN51_A9830MaqCodC = new String[] {""} ;
      P00QN52_A396EmprCod = new String[] {""} ;
      P00QN52_A252CliCod = new int[1] ;
      P00QN52_n252CliCod = new boolean[] {false} ;
      P00QN52_A65ArtCod = new String[] {""} ;
      P00QN52_n65ArtCod = new boolean[] {false} ;
      P00QN52_A758ProCod = new String[] {""} ;
      P00QN52_A9836FasCodM = new String[] {""} ;
      P00QN52_A9830MaqCodC = new String[] {""} ;
      P00QN52_A9864MaqAncA = new short[1] ;
      P00QN58_A396EmprCod = new String[] {""} ;
      P00QN58_A252CliCod = new int[1] ;
      P00QN58_n252CliCod = new boolean[] {false} ;
      P00QN58_A65ArtCod = new String[] {""} ;
      P00QN58_n65ArtCod = new boolean[] {false} ;
      P00QN58_A758ProCod = new String[] {""} ;
      P00QN58_A4659MdlDsc = new String[] {""} ;
      P00QN58_n4659MdlDsc = new boolean[] {false} ;
      P00QN58_A4658MdlCod = new String[] {""} ;
      A4659MdlDsc = "" ;
      A4658MdlCod = "" ;
      P00QN61_A396EmprCod = new String[] {""} ;
      P00QN61_A252CliCod = new int[1] ;
      P00QN61_n252CliCod = new boolean[] {false} ;
      P00QN61_A212BarSer = new String[] {""} ;
      P00QN61_A213BarSit = new byte[1] ;
      P00QN61_A129BarCod = new int[1] ;
      P00QN61_A132BarCodReo = new byte[1] ;
      P00QN61_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      P00QN62_AV18Cformu = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pborrser__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN6_A396EmprCod, P00QN6_A252CliCod, P00QN6_A65ArtCod, P00QN6_A9836FasCodM, P00QN6_A758ProCod
            }
            , new Object[] {
            P00QN7_A396EmprCod, P00QN7_A252CliCod, P00QN7_A65ArtCod, P00QN7_A758ProCod, P00QN7_A9836FasCodM, P00QN7_A9830MaqCodC
            }
            , new Object[] {
            P00QN8_A396EmprCod, P00QN8_A252CliCod, P00QN8_A65ArtCod, P00QN8_A758ProCod, P00QN8_A9836FasCodM, P00QN8_A9830MaqCodC, P00QN8_A9864MaqAncA
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
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN17_A396EmprCod, P00QN17_A252CliCod, P00QN17_A65ArtCod, P00QN17_A1504CliProCod
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
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN29_A396EmprCod, P00QN29_A252CliCod, P00QN29_A65ArtCod, P00QN29_A6986NumLinPro, P00QN29_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN33_A396EmprCod, P00QN33_A252CliCod, P00QN33_A65ArtCod, P00QN33_A7956Mq_CodM
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
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN40_A396EmprCod, P00QN40_A252CliCod, P00QN40_A65ArtCod, P00QN40_A117ArtUrg, P00QN40_n117ArtUrg
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN42_A396EmprCod, P00QN42_A252CliCod, P00QN42_A65ArtCod, P00QN42_A2756ArtEstSer, P00QN42_A71ArtEstAny, P00QN42_A94ArtRdto, P00QN42_n94ArtRdto
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
            P00QN47_A396EmprCod, P00QN47_A252CliCod, P00QN47_A65ArtCod, P00QN47_A6986NumLinPro, P00QN47_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN50_A396EmprCod, P00QN50_A252CliCod, P00QN50_A65ArtCod, P00QN50_A9836FasCodM, P00QN50_A758ProCod
            }
            , new Object[] {
            P00QN51_A396EmprCod, P00QN51_A252CliCod, P00QN51_A65ArtCod, P00QN51_A758ProCod, P00QN51_A9836FasCodM, P00QN51_A9830MaqCodC
            }
            , new Object[] {
            P00QN52_A396EmprCod, P00QN52_A252CliCod, P00QN52_A65ArtCod, P00QN52_A758ProCod, P00QN52_A9836FasCodM, P00QN52_A9830MaqCodC, P00QN52_A9864MaqAncA
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
            }
            , new Object[] {
            P00QN58_A396EmprCod, P00QN58_A252CliCod, P00QN58_A65ArtCod, P00QN58_A758ProCod, P00QN58_A4659MdlDsc, P00QN58_n4659MdlDsc, P00QN58_A4658MdlCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00QN61_A396EmprCod, P00QN61_A252CliCod, P00QN61_n252CliCod, P00QN61_A212BarSer, P00QN61_A213BarSit, P00QN61_A129BarCod, P00QN61_A132BarCodReo, P00QN61_A130BarCodPar
            }
            , new Object[] {
            P00QN62_AV18Cformu
            }
         }
      );
      AV62Pgmname = "PBorrSer" ;
      /* GeneXus formulas. */
      AV62Pgmname = "PBorrSer" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19Carvema ;
   private byte AV20KilArt ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A117ArtUrg ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short A9864MaqAncA ;
   private short A6986NumLinPro ;
   private short A71ArtEstAny ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV18Cformu ;
   private int cV18Cformu ;
   private java.math.BigDecimal A94ArtRdto ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV16ProCod ;
   private String AV15Nivel ;
   private String AV23Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV25EmprNom ;
   private String GXv_char5[] ;
   private String AV24Usurcod ;
   private String GXv_char6[] ;
   private String AV17Existe ;
   private String AV21Ok ;
   private String AV26Msg_avis ;
   private String scmdbuf ;
   private String A9836FasCodM ;
   private String A758ProCod ;
   private String A9830MaqCodC ;
   private String A1504CliProCod ;
   private String A7956Mq_CodM ;
   private String AV62Pgmname ;
   private String A2756ArtEstSer ;
   private String A4659MdlDsc ;
   private String A4658MdlCod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n117ArtUrg ;
   private boolean n94ArtRdto ;
   private boolean n4659MdlDsc ;
   private String AV22Inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00QN6_A396EmprCod ;
   private int[] P00QN6_A252CliCod ;
   private boolean[] P00QN6_n252CliCod ;
   private String[] P00QN6_A65ArtCod ;
   private boolean[] P00QN6_n65ArtCod ;
   private String[] P00QN6_A9836FasCodM ;
   private String[] P00QN6_A758ProCod ;
   private String[] P00QN7_A396EmprCod ;
   private int[] P00QN7_A252CliCod ;
   private boolean[] P00QN7_n252CliCod ;
   private String[] P00QN7_A65ArtCod ;
   private boolean[] P00QN7_n65ArtCod ;
   private String[] P00QN7_A758ProCod ;
   private String[] P00QN7_A9836FasCodM ;
   private String[] P00QN7_A9830MaqCodC ;
   private String[] P00QN8_A396EmprCod ;
   private int[] P00QN8_A252CliCod ;
   private boolean[] P00QN8_n252CliCod ;
   private String[] P00QN8_A65ArtCod ;
   private boolean[] P00QN8_n65ArtCod ;
   private String[] P00QN8_A758ProCod ;
   private String[] P00QN8_A9836FasCodM ;
   private String[] P00QN8_A9830MaqCodC ;
   private short[] P00QN8_A9864MaqAncA ;
   private String[] P00QN17_A396EmprCod ;
   private int[] P00QN17_A252CliCod ;
   private boolean[] P00QN17_n252CliCod ;
   private String[] P00QN17_A65ArtCod ;
   private boolean[] P00QN17_n65ArtCod ;
   private String[] P00QN17_A1504CliProCod ;
   private String[] P00QN29_A396EmprCod ;
   private int[] P00QN29_A252CliCod ;
   private boolean[] P00QN29_n252CliCod ;
   private String[] P00QN29_A65ArtCod ;
   private boolean[] P00QN29_n65ArtCod ;
   private short[] P00QN29_A6986NumLinPro ;
   private String[] P00QN29_A758ProCod ;
   private String[] P00QN33_A396EmprCod ;
   private int[] P00QN33_A252CliCod ;
   private boolean[] P00QN33_n252CliCod ;
   private String[] P00QN33_A65ArtCod ;
   private boolean[] P00QN33_n65ArtCod ;
   private String[] P00QN33_A7956Mq_CodM ;
   private String[] P00QN40_A396EmprCod ;
   private int[] P00QN40_A252CliCod ;
   private boolean[] P00QN40_n252CliCod ;
   private String[] P00QN40_A65ArtCod ;
   private boolean[] P00QN40_n65ArtCod ;
   private byte[] P00QN40_A117ArtUrg ;
   private boolean[] P00QN40_n117ArtUrg ;
   private String[] P00QN42_A396EmprCod ;
   private int[] P00QN42_A252CliCod ;
   private boolean[] P00QN42_n252CliCod ;
   private String[] P00QN42_A65ArtCod ;
   private boolean[] P00QN42_n65ArtCod ;
   private String[] P00QN42_A2756ArtEstSer ;
   private short[] P00QN42_A71ArtEstAny ;
   private java.math.BigDecimal[] P00QN42_A94ArtRdto ;
   private boolean[] P00QN42_n94ArtRdto ;
   private String[] P00QN47_A396EmprCod ;
   private int[] P00QN47_A252CliCod ;
   private boolean[] P00QN47_n252CliCod ;
   private String[] P00QN47_A65ArtCod ;
   private boolean[] P00QN47_n65ArtCod ;
   private short[] P00QN47_A6986NumLinPro ;
   private String[] P00QN47_A758ProCod ;
   private String[] P00QN50_A396EmprCod ;
   private int[] P00QN50_A252CliCod ;
   private boolean[] P00QN50_n252CliCod ;
   private String[] P00QN50_A65ArtCod ;
   private boolean[] P00QN50_n65ArtCod ;
   private String[] P00QN50_A9836FasCodM ;
   private String[] P00QN50_A758ProCod ;
   private String[] P00QN51_A396EmprCod ;
   private int[] P00QN51_A252CliCod ;
   private boolean[] P00QN51_n252CliCod ;
   private String[] P00QN51_A65ArtCod ;
   private boolean[] P00QN51_n65ArtCod ;
   private String[] P00QN51_A758ProCod ;
   private String[] P00QN51_A9836FasCodM ;
   private String[] P00QN51_A9830MaqCodC ;
   private String[] P00QN52_A396EmprCod ;
   private int[] P00QN52_A252CliCod ;
   private boolean[] P00QN52_n252CliCod ;
   private String[] P00QN52_A65ArtCod ;
   private boolean[] P00QN52_n65ArtCod ;
   private String[] P00QN52_A758ProCod ;
   private String[] P00QN52_A9836FasCodM ;
   private String[] P00QN52_A9830MaqCodC ;
   private short[] P00QN52_A9864MaqAncA ;
   private String[] P00QN58_A396EmprCod ;
   private int[] P00QN58_A252CliCod ;
   private boolean[] P00QN58_n252CliCod ;
   private String[] P00QN58_A65ArtCod ;
   private boolean[] P00QN58_n65ArtCod ;
   private String[] P00QN58_A758ProCod ;
   private String[] P00QN58_A4659MdlDsc ;
   private boolean[] P00QN58_n4659MdlDsc ;
   private String[] P00QN58_A4658MdlCod ;
   private String[] P00QN61_A396EmprCod ;
   private int[] P00QN61_A252CliCod ;
   private boolean[] P00QN61_n252CliCod ;
   private String[] P00QN61_A212BarSer ;
   private byte[] P00QN61_A213BarSit ;
   private int[] P00QN61_A129BarCod ;
   private byte[] P00QN61_A132BarCodReo ;
   private String[] P00QN61_A130BarCodPar ;
   private int[] P00QN62_AV18Cformu ;
}

final  class pborrser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00QN2", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new UpdateCursor("P00QN3", "DELETE FROM TXPCCArt  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCArt")
         ,new UpdateCursor("P00QN4", "DELETE FROM TXPSERPAU  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAU")
         ,new UpdateCursor("P00QN5", "DELETE FROM TXPSERPAR  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
         ,new ForEachCursor("P00QN6", "SELECT EmprCod, CliCod, ArtCod, FasCodM, ProCod FROM TXPCAPFMP WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00QN7", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00QN8", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN9", "DELETE FROM TXPPFSMAC  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? and MaqAncA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMAC")
         ,new UpdateCursor("P00QN10", "DELETE FROM TXPPFSMQA  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMQA")
         ,new UpdateCursor("P00QN11", "DELETE FROM TXPCAPFM2  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM2")
         ,new UpdateCursor("P00QN12", "DELETE FROM TXPCAPFM1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM1")
         ,new UpdateCursor("P00QN13", "DELETE FROM TXPCAPFMP  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFMP")
         ,new UpdateCursor("P00QN14", "DELETE FROM TXPPRETCO  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETCO")
         ,new UpdateCursor("P00QN15", "DELETE FROM TXPPRETIN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
         ,new UpdateCursor("P00QN16", "DELETE FROM TXPRECARG  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARG")
         ,new ForEachCursor("P00QN17", "SELECT EmprCod, CliCod, ArtCod, CliProCod FROM TXPCPREPR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN18", "DELETE FROM TXPCPREPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPREPR")
         ,new UpdateCursor("P00QN19", "DELETE FROM TXPLPREPR  WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPREPR")
         ,new UpdateCursor("P00QN20", "DELETE FROM TXPRECPIL  WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPIL")
         ,new UpdateCursor("P00QN21", "DELETE FROM TXPRECARB  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARB")
         ,new UpdateCursor("P00QN22", "DELETE FROM TXPARTINT  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTINT")
         ,new UpdateCursor("P00QN23", "DELETE FROM TXPLRBART  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRBART")
         ,new UpdateCursor("P00QN24", "DELETE FROM TXPPARSER  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARSER")
         ,new UpdateCursor("P00QN25", "DELETE FROM TXPPRECAP  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRECAP")
         ,new UpdateCursor("P00QN26", "DELETE FROM TXPPREMAN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREMAN")
         ,new UpdateCursor("P00QN27", "DELETE FROM TXPLANBRL  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANBRL")
         ,new UpdateCursor("P00QN28", "DELETE FROM TXPPARMAN  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARMAN")
         ,new ForEachCursor("P00QN29", "SELECT EmprCod, CliCod, ArtCod, NumLinPro, ProCod FROM TXPPARART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, NumLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN30", "DELETE FROM TXPPARAR1  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and NumLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARAR1")
         ,new UpdateCursor("P00QN31", "DELETE FROM TXPPARART  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND NumLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARART")
         ,new UpdateCursor("P00QN32", "DELETE FROM TXPARTMAT  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTMAT")
         ,new ForEachCursor("P00QN33", "SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mq_CodM ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN34", "DELETE FROM TXPTNART1  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNART1")
         ,new UpdateCursor("P00QN35", "DELETE FROM TXPTNARTp  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Mq_CodM = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNARTp")
         ,new UpdateCursor("P00QN36", "DELETE FROM TXPTNART  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Mq_CodM = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTNART")
         ,new UpdateCursor("P00QN37", "DELETE FROM TXPARTTEJ  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTTEJ")
         ,new UpdateCursor("P00QN38", "DELETE FROM TXPTEJART  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEJART")
         ,new UpdateCursor("P00QN39", "DELETE FROM TXPARTBRS  WHERE EmprCod = ? and CliCod = ? and Bros_Art = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTBRS")
         ,new ForEachCursor("P00QN40", "SELECT EmprCod, CliCod, ArtCod, ArtUrg FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00QN41", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new ForEachCursor("P00QN42", "SELECT EmprCod, CliCod, ArtCod, ArtEstSer, ArtEstAny, ArtRdto FROM TXPCESART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN43", "DELETE FROM TXPLESART  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtEstAny = ? and ArtEstSer = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESART")
         ,new UpdateCursor("P00QN44", "DELETE FROM TXPCESART  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtEstAny = ? AND ArtEstSer = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
         ,new UpdateCursor("P00QN45", "DELETE FROM TXPSERPAU  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAU")
         ,new UpdateCursor("P00QN46", "DELETE FROM TXPSERPAR  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
         ,new ForEachCursor("P00QN47", "SELECT EmprCod, CliCod, ArtCod, NumLinPro, ProCod FROM TXPPARART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, NumLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN48", "DELETE FROM TXPPARAR1  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and NumLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARAR1")
         ,new UpdateCursor("P00QN49", "DELETE FROM TXPPARART  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND NumLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARART")
         ,new ForEachCursor("P00QN50", "SELECT EmprCod, CliCod, ArtCod, FasCodM, ProCod FROM TXPCAPFMP WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00QN51", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00QN52", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN53", "DELETE FROM TXPPFSMAC  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? and MaqAncA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMAC")
         ,new UpdateCursor("P00QN54", "DELETE FROM TXPPFSMQA  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND MaqAncA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMQA")
         ,new UpdateCursor("P00QN55", "DELETE FROM TXPCAPFM2  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM2")
         ,new UpdateCursor("P00QN56", "DELETE FROM TXPCAPFM1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM1")
         ,new UpdateCursor("P00QN57", "DELETE FROM TXPCAPFMP  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFMP")
         ,new ForEachCursor("P00QN58", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.ProCod, T1.MdlDsc, T1.MdlCod FROM (TXPModels T1 INNER JOIN TXPARTLIN T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod AND T2.ProCod = ?) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.MdlCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QN59", "DELETE FROM TXPModels  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModels")
         ,new UpdateCursor("P00QN60", "DELETE FROM TXPModPro  WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ProCod = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModPro")
         ,new ForEachCursor("P00QN61", "SELECT EmprCod, CliCod, BarSer, BarSit, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and CliCod = ? and BarSer = ? ORDER BY EmprCod, CliCod, BarSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00QN62", "SELECT COUNT(*) FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 2 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 3 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 5 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               return;
            case 10 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 14 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               return;
            case 18 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               return;
            case 19 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 20 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 21 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 22 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 26 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 27 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 28 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 29 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 31 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 32 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 33 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 34 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 35 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 36 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 37 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 38 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 41 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setString(5, (String)parms[6], 3);
               return;
            case 42 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setString(5, (String)parms[6], 3);
               return;
            case 43 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 44 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 45 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 46 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 47 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 48 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 49 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 50 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               return;
            case 51 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 52 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 53 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               return;
            case 54 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setString(6, (String)parms[7], 6);
               return;
            case 55 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               return;
            case 57 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
               return;
            case 58 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 59 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
      }
   }

}

