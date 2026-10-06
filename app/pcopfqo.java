package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopfqo extends GXProcedure
{
   public pcopfqo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopfqo.class ), "" );
   }

   public pcopfqo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] AV56Tab_hdro ,
                            short[] aP3 )
   {
      pcopfqo.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, AV56Tab_hdro, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] AV56Tab_hdro ,
                        short[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, AV56Tab_hdro, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] AV56Tab_hdro ,
                             short[] aP3 ,
                             short[] aP4 )
   {
      pcopfqo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopfqo.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcopfqo.this.AV56Tab_hdro = AV56Tab_hdro;
      pcopfqo.this.AV20LinFas = aP3[0];
      this.aP3 = aP3;
      pcopfqo.this.AV37LinPq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV57j = (short)(1) ;
      while ( AV57j <= 100 )
      {
         if ( AV56Tab_hdro[AV57j-1] == 0 )
         {
            if (true) break;
         }
         AV16BarCod = AV56Tab_hdro[AV57j-1] ;
         AV17BarCodReo = (byte)(0) ;
         AV18BarCodPar = " " ;
         /* Using cursor P02AS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P02AS2_A130BarCodPar[0] ;
            A132BarCodReo = P02AS2_A132BarCodReo[0] ;
            A129BarCod = P02AS2_A129BarCod[0] ;
            A30AlbProCod = P02AS2_A30AlbProCod[0] ;
            A1261BarAlbKgmE = P02AS2_A1261BarAlbKgmE[0] ;
            A1265BarAlbPie = P02AS2_A1265BarAlbPie[0] ;
            A252CliCod = P02AS2_A252CliCod[0] ;
            n252CliCod = P02AS2_n252CliCod[0] ;
            A212BarSer = P02AS2_A212BarSer[0] ;
            A135BarColNom = P02AS2_A135BarColNom[0] ;
            A136BarColNum = P02AS2_A136BarColNum[0] ;
            A218BarTipCol = P02AS2_A218BarTipCol[0] ;
            A252CliCod = P02AS2_A252CliCod[0] ;
            n252CliCod = P02AS2_n252CliCod[0] ;
            A212BarSer = P02AS2_A212BarSer[0] ;
            A135BarColNom = P02AS2_A135BarColNom[0] ;
            A136BarColNum = P02AS2_A136BarColNum[0] ;
            A218BarTipCol = P02AS2_A218BarTipCol[0] ;
            AV27FasKgm = A1261BarAlbKgmE ;
            AV28FasMtr = DecimalUtil.doubleToDec(A1265BarAlbPie) ;
            AV25CliCod = A252CliCod ;
            AV41BarSer = A212BarSer ;
            AV42BarColNom = A135BarColNom ;
            AV43BarColNUm = A136BarColNum ;
            AV44barTipCol = A218BarTipCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P02AS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P02AS3_A130BarCodPar[0] ;
            A132BarCodReo = P02AS3_A132BarCodReo[0] ;
            A129BarCod = P02AS3_A129BarCod[0] ;
            A227BarUni = P02AS3_A227BarUni[0] ;
            A252CliCod = P02AS3_A252CliCod[0] ;
            n252CliCod = P02AS3_n252CliCod[0] ;
            A457FasCod = P02AS3_A457FasCod[0] ;
            A5367BarAntp = P02AS3_A5367BarAntp[0] ;
            A5253BarAcc = P02AS3_A5253BarAcc[0] ;
            A5406BarAntpT = P02AS3_A5406BarAntpT[0] ;
            A5369BarFasGral = P02AS3_A5369BarFasGral[0] ;
            n5369BarFasGral = P02AS3_n5369BarFasGral[0] ;
            A194BarOrdLin = P02AS3_A194BarOrdLin[0] ;
            A758ProCod = P02AS3_A758ProCod[0] ;
            A252CliCod = P02AS3_A252CliCod[0] ;
            n252CliCod = P02AS3_n252CliCod[0] ;
            A5367BarAntp = P02AS3_A5367BarAntp[0] ;
            A5253BarAcc = P02AS3_A5253BarAcc[0] ;
            A5406BarAntpT = P02AS3_A5406BarAntpT[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            AV25CliCod = A252CliCod ;
            AV24FasCod = A457FasCod ;
            AV38ProCod = A758ProCod ;
            AV39BarOrdLin = A194BarOrdLin ;
            AV51BarAntp = A5367BarAntp ;
            AV52BarAcc = A5253BarAcc ;
            AV53BarAntpt = A5406BarAntpT ;
            /* Execute user subroutine: 'PRECIOS' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( AV35FasPreKgm.doubleValue() > 0 ) || ( AV36FasPreMtr.doubleValue() > 0 ) )
            {
               AV20LinFas = (short)(AV20LinFas+1) ;
               /*
                  INSERT RECORD ON TABLE TXPALBFAS

               */
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W457FasCod = A457FasCod ;
               A30AlbProCod = AV15AlbProCod ;
               A1240GuiFasLin = AV20LinFas ;
               A457FasCod = AV24FasCod ;
               A1241GuiFasPKg = AV35FasPreKgm ;
               A1242GuiFasPMt = AV36FasPreMtr ;
               A1275FasKgm = AV27FasKgm ;
               A1276FasMtr = AV28FasMtr ;
               A5462F_TipPza = (short)(0) ;
               n5462F_TipPza = false ;
               /* Using cursor P02AS4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n5462F_TipPza), Short.valueOf(A5462F_TipPza)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               if ( (pr_default.getStatus(2) == 1) )
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
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A457FasCod = W457FasCod ;
               /* End Insert */
            }
            else
            {
               /* Execute user subroutine: 'BARPIE' */
               S171 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            if ( GXutil.strcmp(A5369BarFasGral, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'FASQUI' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'FASPR1' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P02AS5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV41BarSer, AV42BarColNom, Integer.valueOf(AV43BarColNUm), Byte.valueOf(AV44barTipCol)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A831TipColCod = P02AS5_A831TipColCod[0] ;
            A483ForColNum = P02AS5_A483ForColNum[0] ;
            A482ForColNom = P02AS5_A482ForColNom[0] ;
            A494ForSer = P02AS5_A494ForSer[0] ;
            A252CliCod = P02AS5_A252CliCod[0] ;
            n252CliCod = P02AS5_n252CliCod[0] ;
            A1160ProForL = P02AS5_A1160ProForL[0] ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV48Tab_p[GX_I-1] = GXutil.space( (short)(6)) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV49Tab_l[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV50i = (short)(0) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_char3[0] = A494ForSer ;
            GXv_char4[0] = A482ForColNom ;
            GXv_int5[0] = A483ForColNum ;
            GXv_int6[0] = A831TipColCod ;
            GXv_char7[0] = AV51BarAntp ;
            GXv_char8[0] = AV52BarAcc ;
            GXv_char9[0] = AV53BarAntpt ;
            new app.pxcoptct(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_char8, GXv_char9, AV48Tab_p, AV49Tab_l) ;
            pcopfqo.this.A396EmprCod = GXv_char1[0] ;
            pcopfqo.this.A252CliCod = GXv_int2[0] ;
            pcopfqo.this.A494ForSer = GXv_char3[0] ;
            pcopfqo.this.A482ForColNom = GXv_char4[0] ;
            pcopfqo.this.A483ForColNum = GXv_int5[0] ;
            pcopfqo.this.A831TipColCod = GXv_int6[0] ;
            pcopfqo.this.AV51BarAntp = GXv_char7[0] ;
            pcopfqo.this.AV52BarAcc = GXv_char8[0] ;
            pcopfqo.this.AV53BarAntpt = GXv_char9[0] ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV50i = (short)(1) ;
         while ( ! (GXutil.strcmp("", AV48Tab_p[AV50i-1])==0) )
         {
            AV40ProForCod = AV48Tab_p[AV50i-1] ;
            /* Execute user subroutine: 'PREQL' */
            S128 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( AV35FasPreKgm.doubleValue() > 0 ) || ( AV36FasPreMtr.doubleValue() > 0 ) )
            {
               AV37LinPq = (short)(AV37LinPq+1) ;
               /*
                  INSERT RECORD ON TABLE TXPALBQUI

               */
               A30AlbProCod = AV15AlbProCod ;
               A129BarCod = AV16BarCod ;
               A132BarCodReo = AV17BarCodReo ;
               A130BarCodPar = AV18BarCodPar ;
               A5456P_ForLin = AV37LinPq ;
               A5457P_ForPKg = AV35FasPreKgm ;
               n5457P_ForPKg = false ;
               A5458P_ForPMt = AV36FasPreMtr ;
               n5458P_ForPMt = false ;
               A5452P_ForCod = AV40ProForCod ;
               n5452P_ForCod = false ;
               A5459P_forKgm = AV27FasKgm ;
               n5459P_forKgm = false ;
               A5460P_forMtr = (short)(DecimalUtil.decToDouble(AV28FasMtr)) ;
               n5460P_forMtr = false ;
               A5461P_TipPza = (short)(0) ;
               n5461P_TipPza = false ;
               /* Using cursor P02AS6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A5456P_ForLin), Boolean.valueOf(n5452P_ForCod), A5452P_ForCod, Boolean.valueOf(n5457P_ForPKg), A5457P_ForPKg, Boolean.valueOf(n5458P_ForPMt), A5458P_ForPMt, Boolean.valueOf(n5459P_forKgm), A5459P_forKgm, Boolean.valueOf(n5460P_forMtr), Short.valueOf(A5460P_forMtr), Boolean.valueOf(n5461P_TipPza), Short.valueOf(A5461P_TipPza)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBQUI");
               if ( (pr_default.getStatus(4) == 1) )
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
            }
            else
            {
               /* Execute user subroutine: 'BARPIE_1' */
               S138 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV50i = (short)(AV50i+1) ;
         }
         n5455P_ForULin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P02AS7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n5455P_ForULin), Short.valueOf(AV37LinPq), Short.valueOf(AV20LinFas), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* End optimized UPDATE. */
         AV57j = (short)(AV57j+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      /* Using cursor P02AS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, AV38ProCod, Short.valueOf(AV39BarOrdLin)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A764ProForCod = P02AS8_A764ProForCod[0] ;
         A194BarOrdLin = P02AS8_A194BarOrdLin[0] ;
         A758ProCod = P02AS8_A758ProCod[0] ;
         A130BarCodPar = P02AS8_A130BarCodPar[0] ;
         A132BarCodReo = P02AS8_A132BarCodReo[0] ;
         A129BarCod = P02AS8_A129BarCod[0] ;
         A5371FasQuiLin = P02AS8_A5371FasQuiLin[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV40ProForCod = A764ProForCod ;
         /* Execute user subroutine: 'PREQL' */
         S128 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV35FasPreKgm.doubleValue() > 0 ) || ( AV36FasPreMtr.doubleValue() > 0 ) )
         {
            AV37LinPq = (short)(AV37LinPq+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBQUI

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A30AlbProCod = AV15AlbProCod ;
            A129BarCod = AV16BarCod ;
            A132BarCodReo = AV17BarCodReo ;
            A130BarCodPar = AV18BarCodPar ;
            A5456P_ForLin = AV37LinPq ;
            A5457P_ForPKg = AV35FasPreKgm ;
            n5457P_ForPKg = false ;
            A5458P_ForPMt = AV36FasPreMtr ;
            n5458P_ForPMt = false ;
            A5452P_ForCod = A764ProForCod ;
            n5452P_ForCod = false ;
            A5459P_forKgm = AV27FasKgm ;
            n5459P_forKgm = false ;
            A5460P_forMtr = (short)(DecimalUtil.decToDouble(AV28FasMtr)) ;
            n5460P_forMtr = false ;
            A5461P_TipPza = (short)(0) ;
            n5461P_TipPza = false ;
            /* Using cursor P02AS9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A5456P_ForLin), Boolean.valueOf(n5452P_ForCod), A5452P_ForCod, Boolean.valueOf(n5457P_ForPKg), A5457P_ForPKg, Boolean.valueOf(n5458P_ForPMt), A5458P_ForPMt, Boolean.valueOf(n5459P_forKgm), A5459P_forKgm, Boolean.valueOf(n5460P_forMtr), Short.valueOf(A5460P_forMtr), Boolean.valueOf(n5461P_TipPza), Short.valueOf(A5461P_TipPza)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBQUI");
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
         }
         else
         {
            /* Execute user subroutine: 'BARPIE_1' */
            S138 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
         }
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S141( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      /* Using cursor P02AS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV24FasCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A764ProForCod = P02AS10_A764ProForCod[0] ;
         A457FasCod = P02AS10_A457FasCod[0] ;
         A4650FasForLin = P02AS10_A4650FasForLin[0] ;
         AV40ProForCod = A764ProForCod ;
         /* Execute user subroutine: 'PREQL' */
         S128 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV35FasPreKgm.doubleValue() > 0 ) || ( AV36FasPreMtr.doubleValue() > 0 ) )
         {
            AV37LinPq = (short)(AV37LinPq+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBQUI

            */
            A30AlbProCod = AV15AlbProCod ;
            A129BarCod = AV16BarCod ;
            A132BarCodReo = AV17BarCodReo ;
            A130BarCodPar = AV18BarCodPar ;
            A5456P_ForLin = AV37LinPq ;
            A5457P_ForPKg = AV35FasPreKgm ;
            n5457P_ForPKg = false ;
            A5458P_ForPMt = AV36FasPreMtr ;
            n5458P_ForPMt = false ;
            A5452P_ForCod = A764ProForCod ;
            n5452P_ForCod = false ;
            A5459P_forKgm = AV27FasKgm ;
            n5459P_forKgm = false ;
            A5460P_forMtr = (short)(DecimalUtil.decToDouble(AV28FasMtr)) ;
            n5460P_forMtr = false ;
            A5461P_TipPza = (short)(0) ;
            n5461P_TipPza = false ;
            /* Using cursor P02AS11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A5456P_ForLin), Boolean.valueOf(n5452P_ForCod), A5452P_ForCod, Boolean.valueOf(n5457P_ForPKg), A5457P_ForPKg, Boolean.valueOf(n5458P_ForPMt), A5458P_ForPMt, Boolean.valueOf(n5459P_forKgm), A5459P_forKgm, Boolean.valueOf(n5460P_forMtr), Short.valueOf(A5460P_forMtr), Boolean.valueOf(n5461P_TipPza), Short.valueOf(A5461P_TipPza)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBQUI");
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
            /* End Insert */
         }
         else
         {
            /* Execute user subroutine: 'BARPIE_1' */
            S138 ();
            if ( returnInSub )
            {
               pr_default.close(8);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S128( )
   {
      /* 'PREQL' Routine */
      returnInSub = false ;
      AV36FasPreMtr = DecimalUtil.doubleToDec(0) ;
      AV35FasPreKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02AS12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV40ProForCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A252CliCod = P02AS12_A252CliCod[0] ;
         n252CliCod = P02AS12_n252CliCod[0] ;
         A5452P_ForCod = P02AS12_A5452P_ForCod[0] ;
         n5452P_ForCod = P02AS12_n5452P_ForCod[0] ;
         A5449ProForPP = P02AS12_A5449ProForPP[0] ;
         n5449ProForPP = P02AS12_n5449ProForPP[0] ;
         A5448ProForPK = P02AS12_A5448ProForPK[0] ;
         n5448ProForPK = P02AS12_n5448ProForPK[0] ;
         AV36FasPreMtr = A5449ProForPP ;
         AV35FasPreKgm = A5448ProForPK ;
         /* Using cursor P02AS13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV40ProForCod});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A5452P_ForCod = P02AS13_A5452P_ForCod[0] ;
            n5452P_ForCod = P02AS13_n5452P_ForCod[0] ;
            A5508ClipqdVal = P02AS13_A5508ClipqdVal[0] ;
            n5508ClipqdVal = P02AS13_n5508ClipqdVal[0] ;
            A5509ClipqdPor = P02AS13_A5509ClipqdPor[0] ;
            n5509ClipqdPor = P02AS13_n5509ClipqdPor[0] ;
            A5507ClipqdLin = P02AS13_A5507ClipqdLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5508ClipqdVal) > 0 )
            {
               AV45Por_i = A5509ClipqdPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.subtract(AV46TotRec) ;
         }
         /* Using cursor P02AS14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV40ProForCod});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A5452P_ForCod = P02AS14_A5452P_ForCod[0] ;
            n5452P_ForCod = P02AS14_n5452P_ForCod[0] ;
            A5512ClipqiVal = P02AS14_A5512ClipqiVal[0] ;
            n5512ClipqiVal = P02AS14_n5512ClipqiVal[0] ;
            A5513ClipqiPor = P02AS14_A5513ClipqiPor[0] ;
            n5513ClipqiPor = P02AS14_n5513ClipqiPor[0] ;
            A5511ClipqiLin = P02AS14_A5511ClipqiLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5512ClipqiVal) < 0 )
            {
               AV45Por_i = A5513ClipqiPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(12);
         }
         pr_default.close(12);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.add(AV46TotRec) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S138( )
   {
      /* 'BARPIE_1' Routine */
      returnInSub = false ;
      /* Using cursor P02AS15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A44AlbRecCod = P02AS15_A44AlbRecCod[0] ;
         A130BarCodPar = P02AS15_A130BarCodPar[0] ;
         A132BarCodReo = P02AS15_A132BarCodReo[0] ;
         A129BarCod = P02AS15_A129BarCod[0] ;
         A4295ClasCod = P02AS15_A4295ClasCod[0] ;
         n4295ClasCod = P02AS15_n4295ClasCod[0] ;
         A200BarPieCod = P02AS15_A200BarPieCod[0] ;
         A4295ClasCod = P02AS15_A4295ClasCod[0] ;
         n4295ClasCod = P02AS15_n4295ClasCod[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV34Tipo_pza = A4295ClasCod ;
         /* Execute user subroutine: 'PREQP' */
         S1515 ();
         if ( returnInSub )
         {
            pr_default.close(13);
            pr_default.close(13);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV35FasPreKgm.doubleValue() > 0 ) || ( AV36FasPreMtr.doubleValue() > 0 ) )
         {
            AV37LinPq = (short)(AV37LinPq+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBQUI

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A30AlbProCod = AV15AlbProCod ;
            A129BarCod = AV16BarCod ;
            A132BarCodReo = AV17BarCodReo ;
            A130BarCodPar = AV18BarCodPar ;
            A5456P_ForLin = AV37LinPq ;
            A5457P_ForPKg = AV35FasPreKgm ;
            n5457P_ForPKg = false ;
            A5458P_ForPMt = AV36FasPreMtr ;
            n5458P_ForPMt = false ;
            A5452P_ForCod = A764ProForCod ;
            n5452P_ForCod = false ;
            A5459P_forKgm = AV27FasKgm ;
            n5459P_forKgm = false ;
            A5460P_forMtr = (short)(DecimalUtil.decToDouble(AV28FasMtr)) ;
            n5460P_forMtr = false ;
            A5461P_TipPza = AV34Tipo_pza ;
            n5461P_TipPza = false ;
            /* Using cursor P02AS16 */
            pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A5456P_ForLin), Boolean.valueOf(n5452P_ForCod), A5452P_ForCod, Boolean.valueOf(n5457P_ForPKg), A5457P_ForPKg, Boolean.valueOf(n5458P_ForPMt), A5458P_ForPMt, Boolean.valueOf(n5459P_forKgm), A5459P_forKgm, Boolean.valueOf(n5460P_forMtr), Short.valueOf(A5460P_forMtr), Boolean.valueOf(n5461P_TipPza), Short.valueOf(A5461P_TipPza)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBQUI");
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
         }
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S1515( )
   {
      /* 'PREQP' Routine */
      returnInSub = false ;
      AV36FasPreMtr = DecimalUtil.doubleToDec(0) ;
      AV35FasPreKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02AS17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV40ProForCod, Short.valueOf(AV34Tipo_pza)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A252CliCod = P02AS17_A252CliCod[0] ;
         n252CliCod = P02AS17_n252CliCod[0] ;
         A4295ClasCod = P02AS17_A4295ClasCod[0] ;
         n4295ClasCod = P02AS17_n4295ClasCod[0] ;
         A5452P_ForCod = P02AS17_A5452P_ForCod[0] ;
         n5452P_ForCod = P02AS17_n5452P_ForCod[0] ;
         A5451ProForPPP = P02AS17_A5451ProForPPP[0] ;
         n5451ProForPPP = P02AS17_n5451ProForPPP[0] ;
         A5450ProForPPK = P02AS17_A5450ProForPPK[0] ;
         n5450ProForPPK = P02AS17_n5450ProForPPK[0] ;
         AV36FasPreMtr = A5451ProForPPP ;
         AV35FasPreKgm = A5450ProForPPK ;
         /* Using cursor P02AS18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV40ProForCod});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A5452P_ForCod = P02AS18_A5452P_ForCod[0] ;
            n5452P_ForCod = P02AS18_n5452P_ForCod[0] ;
            A5508ClipqdVal = P02AS18_A5508ClipqdVal[0] ;
            n5508ClipqdVal = P02AS18_n5508ClipqdVal[0] ;
            A5509ClipqdPor = P02AS18_A5509ClipqdPor[0] ;
            n5509ClipqdPor = P02AS18_n5509ClipqdPor[0] ;
            A5507ClipqdLin = P02AS18_A5507ClipqdLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5508ClipqdVal) > 0 )
            {
               AV45Por_i = A5509ClipqdPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(16);
         }
         pr_default.close(16);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.subtract(AV46TotRec) ;
         }
         /* Using cursor P02AS19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV40ProForCod});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A5452P_ForCod = P02AS19_A5452P_ForCod[0] ;
            n5452P_ForCod = P02AS19_n5452P_ForCod[0] ;
            A5512ClipqiVal = P02AS19_A5512ClipqiVal[0] ;
            n5512ClipqiVal = P02AS19_n5512ClipqiVal[0] ;
            A5513ClipqiPor = P02AS19_A5513ClipqiPor[0] ;
            n5513ClipqiPor = P02AS19_n5513ClipqiPor[0] ;
            A5511ClipqiLin = P02AS19_A5511ClipqiLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5512ClipqiVal) < 0 )
            {
               AV45Por_i = A5513ClipqiPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(17);
         }
         pr_default.close(17);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.add(AV46TotRec) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S161( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      AV35FasPreKgm = DecimalUtil.doubleToDec(0) ;
      AV36FasPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02AS20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24FasCod});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A457FasCod = P02AS20_A457FasCod[0] ;
         A252CliCod = P02AS20_A252CliCod[0] ;
         n252CliCod = P02AS20_n252CliCod[0] ;
         A466FasPreKgm = P02AS20_A466FasPreKgm[0] ;
         n466FasPreKgm = P02AS20_n466FasPreKgm[0] ;
         A467FasPreMtr = P02AS20_A467FasPreMtr[0] ;
         n467FasPreMtr = P02AS20_n467FasPreMtr[0] ;
         AV35FasPreKgm = A466FasPreKgm ;
         AV36FasPreMtr = A467FasPreMtr ;
         /* Using cursor P02AS21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
         while ( (pr_default.getStatus(19) != 101) )
         {
            A5520ClifsdVal = P02AS21_A5520ClifsdVal[0] ;
            n5520ClifsdVal = P02AS21_n5520ClifsdVal[0] ;
            A5521ClifsdPor = P02AS21_A5521ClifsdPor[0] ;
            n5521ClifsdPor = P02AS21_n5521ClifsdPor[0] ;
            A5519ClifsdLin = P02AS21_A5519ClifsdLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5520ClifsdVal) > 0 )
            {
               AV45Por_i = A5521ClifsdPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(19);
         }
         pr_default.close(19);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.subtract(AV46TotRec) ;
         }
         /* Using cursor P02AS22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
         while ( (pr_default.getStatus(20) != 101) )
         {
            A5516ClifsiVal = P02AS22_A5516ClifsiVal[0] ;
            n5516ClifsiVal = P02AS22_n5516ClifsiVal[0] ;
            A5517ClifsiPor = P02AS22_A5517ClifsiPor[0] ;
            n5517ClifsiPor = P02AS22_n5517ClifsiPor[0] ;
            A5515ClifsiLin = P02AS22_A5515ClifsiLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5516ClifsiVal) < 0 )
            {
               AV45Por_i = A5517ClifsiPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(20);
         }
         pr_default.close(20);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.add(AV46TotRec) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
   }

   public void S171( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      /* Using cursor P02AS23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A44AlbRecCod = P02AS23_A44AlbRecCod[0] ;
         A130BarCodPar = P02AS23_A130BarCodPar[0] ;
         A132BarCodReo = P02AS23_A132BarCodReo[0] ;
         A129BarCod = P02AS23_A129BarCod[0] ;
         A4295ClasCod = P02AS23_A4295ClasCod[0] ;
         n4295ClasCod = P02AS23_n4295ClasCod[0] ;
         A200BarPieCod = P02AS23_A200BarPieCod[0] ;
         A4295ClasCod = P02AS23_A4295ClasCod[0] ;
         n4295ClasCod = P02AS23_n4295ClasCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV34Tipo_pza = A4295ClasCod ;
         /* Execute user subroutine: 'PREFS1' */
         S1823 ();
         if ( returnInSub )
         {
            pr_default.close(21);
            pr_default.close(21);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV35FasPreKgm.doubleValue() > 0 ) || ( AV36FasPreMtr.doubleValue() > 0 ) )
         {
            AV20LinFas = (short)(AV20LinFas+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBFAS

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A30AlbProCod = AV15AlbProCod ;
            A1240GuiFasLin = AV20LinFas ;
            A457FasCod = AV24FasCod ;
            A1241GuiFasPKg = AV35FasPreKgm ;
            A1242GuiFasPMt = AV36FasPreMtr ;
            A1275FasKgm = AV27FasKgm ;
            A1276FasMtr = AV28FasMtr ;
            A5462F_TipPza = AV34Tipo_pza ;
            n5462F_TipPza = false ;
            /* Using cursor P02AS24 */
            pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n5462F_TipPza), Short.valueOf(A5462F_TipPza)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            if ( (pr_default.getStatus(22) == 1) )
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(21);
      }
      pr_default.close(21);
   }

   public void S1823( )
   {
      /* 'PREFS1' Routine */
      returnInSub = false ;
      AV36FasPreMtr = DecimalUtil.doubleToDec(0) ;
      AV35FasPreKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02AS25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24FasCod, Short.valueOf(AV34Tipo_pza)});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A252CliCod = P02AS25_A252CliCod[0] ;
         n252CliCod = P02AS25_n252CliCod[0] ;
         A4295ClasCod = P02AS25_A4295ClasCod[0] ;
         n4295ClasCod = P02AS25_n4295ClasCod[0] ;
         A5428FasPreCod = P02AS25_A5428FasPreCod[0] ;
         A5426FasPrePPz = P02AS25_A5426FasPrePPz[0] ;
         n5426FasPrePPz = P02AS25_n5426FasPrePPz[0] ;
         A5427FasPrePKg = P02AS25_A5427FasPrePKg[0] ;
         n5427FasPrePKg = P02AS25_n5427FasPrePKg[0] ;
         AV36FasPreMtr = A5426FasPrePPz ;
         AV35FasPreKgm = A5427FasPrePKg ;
         /* Using cursor P02AS26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV24FasCod});
         while ( (pr_default.getStatus(24) != 101) )
         {
            A457FasCod = P02AS26_A457FasCod[0] ;
            A5520ClifsdVal = P02AS26_A5520ClifsdVal[0] ;
            n5520ClifsdVal = P02AS26_n5520ClifsdVal[0] ;
            A5521ClifsdPor = P02AS26_A5521ClifsdPor[0] ;
            n5521ClifsdPor = P02AS26_n5521ClifsdPor[0] ;
            A5519ClifsdLin = P02AS26_A5519ClifsdLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5520ClifsdVal) > 0 )
            {
               AV45Por_i = A5521ClifsdPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(24);
         }
         pr_default.close(24);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.subtract(AV46TotRec) ;
         }
         /* Using cursor P02AS27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV24FasCod});
         while ( (pr_default.getStatus(25) != 101) )
         {
            A457FasCod = P02AS27_A457FasCod[0] ;
            A5516ClifsiVal = P02AS27_A5516ClifsiVal[0] ;
            n5516ClifsiVal = P02AS27_n5516ClifsiVal[0] ;
            A5517ClifsiPor = P02AS27_A5517ClifsiPor[0] ;
            n5517ClifsiPor = P02AS27_n5517ClifsiPor[0] ;
            A5515ClifsiLin = P02AS27_A5515ClifsiLin[0] ;
            if ( DecimalUtil.compareTo(AV47BarKgm, A5516ClifsiVal) < 0 )
            {
               AV45Por_i = A5517ClifsiPor ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(25);
         }
         pr_default.close(25);
         if ( AV45Por_i.doubleValue() > 0 )
         {
            AV46TotRec = GXutil.roundDecimal( AV35FasPreKgm.multiply(AV45Por_i).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV35FasPreKgm = AV35FasPreKgm.add(AV46TotRec) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopfqo.this.A396EmprCod;
      this.aP1[0] = pcopfqo.this.AV15AlbProCod;
      this.aP3[0] = pcopfqo.this.AV20LinFas;
      this.aP4[0] = pcopfqo.this.AV37LinPq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopfqo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18BarCodPar = "" ;
      scmdbuf = "" ;
      P02AS2_A396EmprCod = new String[] {""} ;
      P02AS2_A130BarCodPar = new String[] {""} ;
      P02AS2_A132BarCodReo = new byte[1] ;
      P02AS2_A129BarCod = new int[1] ;
      P02AS2_A30AlbProCod = new long[1] ;
      P02AS2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS2_A1265BarAlbPie = new int[1] ;
      P02AS2_A252CliCod = new int[1] ;
      P02AS2_n252CliCod = new boolean[] {false} ;
      P02AS2_A212BarSer = new String[] {""} ;
      P02AS2_A135BarColNom = new String[] {""} ;
      P02AS2_A136BarColNum = new int[1] ;
      P02AS2_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV27FasKgm = DecimalUtil.ZERO ;
      AV28FasMtr = DecimalUtil.ZERO ;
      AV41BarSer = "" ;
      AV42BarColNom = "" ;
      P02AS3_A396EmprCod = new String[] {""} ;
      P02AS3_A130BarCodPar = new String[] {""} ;
      P02AS3_A132BarCodReo = new byte[1] ;
      P02AS3_A129BarCod = new int[1] ;
      P02AS3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS3_A252CliCod = new int[1] ;
      P02AS3_n252CliCod = new boolean[] {false} ;
      P02AS3_A457FasCod = new String[] {""} ;
      P02AS3_A5367BarAntp = new String[] {""} ;
      P02AS3_A5253BarAcc = new String[] {""} ;
      P02AS3_A5406BarAntpT = new String[] {""} ;
      P02AS3_A5369BarFasGral = new String[] {""} ;
      P02AS3_n5369BarFasGral = new boolean[] {false} ;
      P02AS3_A194BarOrdLin = new short[1] ;
      P02AS3_A758ProCod = new String[] {""} ;
      A227BarUni = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A5367BarAntp = "" ;
      A5253BarAcc = "" ;
      A5406BarAntpT = "" ;
      A5369BarFasGral = "" ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV24FasCod = "" ;
      AV38ProCod = "" ;
      AV51BarAntp = "" ;
      AV52BarAcc = "" ;
      AV53BarAntpt = "" ;
      AV35FasPreKgm = DecimalUtil.ZERO ;
      AV36FasPreMtr = DecimalUtil.ZERO ;
      W457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P02AS5_A396EmprCod = new String[] {""} ;
      P02AS5_A831TipColCod = new byte[1] ;
      P02AS5_A483ForColNum = new int[1] ;
      P02AS5_A482ForColNom = new String[] {""} ;
      P02AS5_A494ForSer = new String[] {""} ;
      P02AS5_A252CliCod = new int[1] ;
      P02AS5_n252CliCod = new boolean[] {false} ;
      P02AS5_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV48Tab_p = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV48Tab_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV49Tab_l = new short[100] ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      AV40ProForCod = "" ;
      A5457P_ForPKg = DecimalUtil.ZERO ;
      A5458P_ForPMt = DecimalUtil.ZERO ;
      A5452P_ForCod = "" ;
      A5459P_forKgm = DecimalUtil.ZERO ;
      P02AS8_A396EmprCod = new String[] {""} ;
      P02AS8_A764ProForCod = new String[] {""} ;
      P02AS8_A194BarOrdLin = new short[1] ;
      P02AS8_A758ProCod = new String[] {""} ;
      P02AS8_A130BarCodPar = new String[] {""} ;
      P02AS8_A132BarCodReo = new byte[1] ;
      P02AS8_A129BarCod = new int[1] ;
      P02AS8_A5371FasQuiLin = new short[1] ;
      A764ProForCod = "" ;
      P02AS10_A396EmprCod = new String[] {""} ;
      P02AS10_A764ProForCod = new String[] {""} ;
      P02AS10_A457FasCod = new String[] {""} ;
      P02AS10_A4650FasForLin = new short[1] ;
      P02AS12_A396EmprCod = new String[] {""} ;
      P02AS12_A252CliCod = new int[1] ;
      P02AS12_n252CliCod = new boolean[] {false} ;
      P02AS12_A5452P_ForCod = new String[] {""} ;
      P02AS12_n5452P_ForCod = new boolean[] {false} ;
      P02AS12_A5449ProForPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS12_n5449ProForPP = new boolean[] {false} ;
      P02AS12_A5448ProForPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS12_n5448ProForPK = new boolean[] {false} ;
      A5449ProForPP = DecimalUtil.ZERO ;
      A5448ProForPK = DecimalUtil.ZERO ;
      P02AS13_A396EmprCod = new String[] {""} ;
      P02AS13_A252CliCod = new int[1] ;
      P02AS13_n252CliCod = new boolean[] {false} ;
      P02AS13_A5452P_ForCod = new String[] {""} ;
      P02AS13_n5452P_ForCod = new boolean[] {false} ;
      P02AS13_A5508ClipqdVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS13_n5508ClipqdVal = new boolean[] {false} ;
      P02AS13_A5509ClipqdPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS13_n5509ClipqdPor = new boolean[] {false} ;
      P02AS13_A5507ClipqdLin = new short[1] ;
      A5508ClipqdVal = DecimalUtil.ZERO ;
      A5509ClipqdPor = DecimalUtil.ZERO ;
      AV47BarKgm = DecimalUtil.ZERO ;
      AV45Por_i = DecimalUtil.ZERO ;
      AV46TotRec = DecimalUtil.ZERO ;
      P02AS14_A396EmprCod = new String[] {""} ;
      P02AS14_A252CliCod = new int[1] ;
      P02AS14_n252CliCod = new boolean[] {false} ;
      P02AS14_A5452P_ForCod = new String[] {""} ;
      P02AS14_n5452P_ForCod = new boolean[] {false} ;
      P02AS14_A5512ClipqiVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS14_n5512ClipqiVal = new boolean[] {false} ;
      P02AS14_A5513ClipqiPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS14_n5513ClipqiPor = new boolean[] {false} ;
      P02AS14_A5511ClipqiLin = new short[1] ;
      A5512ClipqiVal = DecimalUtil.ZERO ;
      A5513ClipqiPor = DecimalUtil.ZERO ;
      P02AS15_A44AlbRecCod = new int[1] ;
      P02AS15_A396EmprCod = new String[] {""} ;
      P02AS15_A130BarCodPar = new String[] {""} ;
      P02AS15_A132BarCodReo = new byte[1] ;
      P02AS15_A129BarCod = new int[1] ;
      P02AS15_A4295ClasCod = new short[1] ;
      P02AS15_n4295ClasCod = new boolean[] {false} ;
      P02AS15_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P02AS17_A396EmprCod = new String[] {""} ;
      P02AS17_A252CliCod = new int[1] ;
      P02AS17_n252CliCod = new boolean[] {false} ;
      P02AS17_A4295ClasCod = new short[1] ;
      P02AS17_n4295ClasCod = new boolean[] {false} ;
      P02AS17_A5452P_ForCod = new String[] {""} ;
      P02AS17_n5452P_ForCod = new boolean[] {false} ;
      P02AS17_A5451ProForPPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS17_n5451ProForPPP = new boolean[] {false} ;
      P02AS17_A5450ProForPPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS17_n5450ProForPPK = new boolean[] {false} ;
      A5451ProForPPP = DecimalUtil.ZERO ;
      A5450ProForPPK = DecimalUtil.ZERO ;
      P02AS18_A396EmprCod = new String[] {""} ;
      P02AS18_A252CliCod = new int[1] ;
      P02AS18_n252CliCod = new boolean[] {false} ;
      P02AS18_A5452P_ForCod = new String[] {""} ;
      P02AS18_n5452P_ForCod = new boolean[] {false} ;
      P02AS18_A5508ClipqdVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS18_n5508ClipqdVal = new boolean[] {false} ;
      P02AS18_A5509ClipqdPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS18_n5509ClipqdPor = new boolean[] {false} ;
      P02AS18_A5507ClipqdLin = new short[1] ;
      P02AS19_A396EmprCod = new String[] {""} ;
      P02AS19_A252CliCod = new int[1] ;
      P02AS19_n252CliCod = new boolean[] {false} ;
      P02AS19_A5452P_ForCod = new String[] {""} ;
      P02AS19_n5452P_ForCod = new boolean[] {false} ;
      P02AS19_A5512ClipqiVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS19_n5512ClipqiVal = new boolean[] {false} ;
      P02AS19_A5513ClipqiPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS19_n5513ClipqiPor = new boolean[] {false} ;
      P02AS19_A5511ClipqiLin = new short[1] ;
      P02AS20_A396EmprCod = new String[] {""} ;
      P02AS20_A457FasCod = new String[] {""} ;
      P02AS20_A252CliCod = new int[1] ;
      P02AS20_n252CliCod = new boolean[] {false} ;
      P02AS20_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS20_n466FasPreKgm = new boolean[] {false} ;
      P02AS20_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS20_n467FasPreMtr = new boolean[] {false} ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      P02AS21_A396EmprCod = new String[] {""} ;
      P02AS21_A252CliCod = new int[1] ;
      P02AS21_n252CliCod = new boolean[] {false} ;
      P02AS21_A457FasCod = new String[] {""} ;
      P02AS21_A5520ClifsdVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS21_n5520ClifsdVal = new boolean[] {false} ;
      P02AS21_A5521ClifsdPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS21_n5521ClifsdPor = new boolean[] {false} ;
      P02AS21_A5519ClifsdLin = new short[1] ;
      A5520ClifsdVal = DecimalUtil.ZERO ;
      A5521ClifsdPor = DecimalUtil.ZERO ;
      P02AS22_A396EmprCod = new String[] {""} ;
      P02AS22_A252CliCod = new int[1] ;
      P02AS22_n252CliCod = new boolean[] {false} ;
      P02AS22_A457FasCod = new String[] {""} ;
      P02AS22_A5516ClifsiVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS22_n5516ClifsiVal = new boolean[] {false} ;
      P02AS22_A5517ClifsiPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS22_n5517ClifsiPor = new boolean[] {false} ;
      P02AS22_A5515ClifsiLin = new short[1] ;
      A5516ClifsiVal = DecimalUtil.ZERO ;
      A5517ClifsiPor = DecimalUtil.ZERO ;
      P02AS23_A44AlbRecCod = new int[1] ;
      P02AS23_A396EmprCod = new String[] {""} ;
      P02AS23_A130BarCodPar = new String[] {""} ;
      P02AS23_A132BarCodReo = new byte[1] ;
      P02AS23_A129BarCod = new int[1] ;
      P02AS23_A4295ClasCod = new short[1] ;
      P02AS23_n4295ClasCod = new boolean[] {false} ;
      P02AS23_A200BarPieCod = new String[] {""} ;
      P02AS25_A396EmprCod = new String[] {""} ;
      P02AS25_A252CliCod = new int[1] ;
      P02AS25_n252CliCod = new boolean[] {false} ;
      P02AS25_A4295ClasCod = new short[1] ;
      P02AS25_n4295ClasCod = new boolean[] {false} ;
      P02AS25_A5428FasPreCod = new String[] {""} ;
      P02AS25_A5426FasPrePPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS25_n5426FasPrePPz = new boolean[] {false} ;
      P02AS25_A5427FasPrePKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS25_n5427FasPrePKg = new boolean[] {false} ;
      A5428FasPreCod = "" ;
      A5426FasPrePPz = DecimalUtil.ZERO ;
      A5427FasPrePKg = DecimalUtil.ZERO ;
      P02AS26_A396EmprCod = new String[] {""} ;
      P02AS26_A252CliCod = new int[1] ;
      P02AS26_n252CliCod = new boolean[] {false} ;
      P02AS26_A457FasCod = new String[] {""} ;
      P02AS26_A5520ClifsdVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS26_n5520ClifsdVal = new boolean[] {false} ;
      P02AS26_A5521ClifsdPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS26_n5521ClifsdPor = new boolean[] {false} ;
      P02AS26_A5519ClifsdLin = new short[1] ;
      P02AS27_A396EmprCod = new String[] {""} ;
      P02AS27_A252CliCod = new int[1] ;
      P02AS27_n252CliCod = new boolean[] {false} ;
      P02AS27_A457FasCod = new String[] {""} ;
      P02AS27_A5516ClifsiVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS27_n5516ClifsiVal = new boolean[] {false} ;
      P02AS27_A5517ClifsiPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02AS27_n5517ClifsiPor = new boolean[] {false} ;
      P02AS27_A5515ClifsiLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopfqo__default(),
         new Object[] {
             new Object[] {
            P02AS2_A396EmprCod, P02AS2_A130BarCodPar, P02AS2_A132BarCodReo, P02AS2_A129BarCod, P02AS2_A30AlbProCod, P02AS2_A1261BarAlbKgmE, P02AS2_A1265BarAlbPie, P02AS2_A252CliCod, P02AS2_n252CliCod, P02AS2_A212BarSer,
            P02AS2_A135BarColNom, P02AS2_A136BarColNum, P02AS2_A218BarTipCol
            }
            , new Object[] {
            P02AS3_A396EmprCod, P02AS3_A130BarCodPar, P02AS3_A132BarCodReo, P02AS3_A129BarCod, P02AS3_A227BarUni, P02AS3_A252CliCod, P02AS3_n252CliCod, P02AS3_A457FasCod, P02AS3_A5367BarAntp, P02AS3_A5253BarAcc,
            P02AS3_A5406BarAntpT, P02AS3_A5369BarFasGral, P02AS3_n5369BarFasGral, P02AS3_A194BarOrdLin, P02AS3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02AS5_A396EmprCod, P02AS5_A831TipColCod, P02AS5_A483ForColNum, P02AS5_A482ForColNom, P02AS5_A494ForSer, P02AS5_A252CliCod, P02AS5_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02AS8_A396EmprCod, P02AS8_A764ProForCod, P02AS8_A194BarOrdLin, P02AS8_A758ProCod, P02AS8_A130BarCodPar, P02AS8_A132BarCodReo, P02AS8_A129BarCod, P02AS8_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02AS10_A396EmprCod, P02AS10_A764ProForCod, P02AS10_A457FasCod, P02AS10_A4650FasForLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02AS12_A396EmprCod, P02AS12_A252CliCod, P02AS12_A5452P_ForCod, P02AS12_A5449ProForPP, P02AS12_n5449ProForPP, P02AS12_A5448ProForPK, P02AS12_n5448ProForPK
            }
            , new Object[] {
            P02AS13_A396EmprCod, P02AS13_A252CliCod, P02AS13_A5452P_ForCod, P02AS13_A5508ClipqdVal, P02AS13_n5508ClipqdVal, P02AS13_A5509ClipqdPor, P02AS13_n5509ClipqdPor, P02AS13_A5507ClipqdLin
            }
            , new Object[] {
            P02AS14_A396EmprCod, P02AS14_A252CliCod, P02AS14_A5452P_ForCod, P02AS14_A5512ClipqiVal, P02AS14_n5512ClipqiVal, P02AS14_A5513ClipqiPor, P02AS14_n5513ClipqiPor, P02AS14_A5511ClipqiLin
            }
            , new Object[] {
            P02AS15_A44AlbRecCod, P02AS15_A396EmprCod, P02AS15_A130BarCodPar, P02AS15_A132BarCodReo, P02AS15_A129BarCod, P02AS15_A4295ClasCod, P02AS15_n4295ClasCod, P02AS15_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02AS17_A396EmprCod, P02AS17_A252CliCod, P02AS17_A4295ClasCod, P02AS17_A5452P_ForCod, P02AS17_A5451ProForPPP, P02AS17_n5451ProForPPP, P02AS17_A5450ProForPPK, P02AS17_n5450ProForPPK
            }
            , new Object[] {
            P02AS18_A396EmprCod, P02AS18_A252CliCod, P02AS18_A5452P_ForCod, P02AS18_A5508ClipqdVal, P02AS18_n5508ClipqdVal, P02AS18_A5509ClipqdPor, P02AS18_n5509ClipqdPor, P02AS18_A5507ClipqdLin
            }
            , new Object[] {
            P02AS19_A396EmprCod, P02AS19_A252CliCod, P02AS19_A5452P_ForCod, P02AS19_A5512ClipqiVal, P02AS19_n5512ClipqiVal, P02AS19_A5513ClipqiPor, P02AS19_n5513ClipqiPor, P02AS19_A5511ClipqiLin
            }
            , new Object[] {
            P02AS20_A396EmprCod, P02AS20_A457FasCod, P02AS20_A252CliCod, P02AS20_A466FasPreKgm, P02AS20_n466FasPreKgm, P02AS20_A467FasPreMtr, P02AS20_n467FasPreMtr
            }
            , new Object[] {
            P02AS21_A396EmprCod, P02AS21_A252CliCod, P02AS21_A457FasCod, P02AS21_A5520ClifsdVal, P02AS21_n5520ClifsdVal, P02AS21_A5521ClifsdPor, P02AS21_n5521ClifsdPor, P02AS21_A5519ClifsdLin
            }
            , new Object[] {
            P02AS22_A396EmprCod, P02AS22_A252CliCod, P02AS22_A457FasCod, P02AS22_A5516ClifsiVal, P02AS22_n5516ClifsiVal, P02AS22_A5517ClifsiPor, P02AS22_n5517ClifsiPor, P02AS22_A5515ClifsiLin
            }
            , new Object[] {
            P02AS23_A44AlbRecCod, P02AS23_A396EmprCod, P02AS23_A130BarCodPar, P02AS23_A132BarCodReo, P02AS23_A129BarCod, P02AS23_A4295ClasCod, P02AS23_n4295ClasCod, P02AS23_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02AS25_A396EmprCod, P02AS25_A252CliCod, P02AS25_A4295ClasCod, P02AS25_A5428FasPreCod, P02AS25_A5426FasPrePPz, P02AS25_n5426FasPrePPz, P02AS25_A5427FasPrePKg, P02AS25_n5427FasPrePKg
            }
            , new Object[] {
            P02AS26_A396EmprCod, P02AS26_A252CliCod, P02AS26_A457FasCod, P02AS26_A5520ClifsdVal, P02AS26_n5520ClifsdVal, P02AS26_A5521ClifsdPor, P02AS26_n5521ClifsdPor, P02AS26_A5519ClifsdLin
            }
            , new Object[] {
            P02AS27_A396EmprCod, P02AS27_A252CliCod, P02AS27_A457FasCod, P02AS27_A5516ClifsiVal, P02AS27_n5516ClifsiVal, P02AS27_A5517ClifsiPor, P02AS27_n5517ClifsiPor, P02AS27_A5515ClifsiLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV44barTipCol ;
   private byte W132BarCodReo ;
   private byte A831TipColCod ;
   private byte GXv_int6[] ;
   private short AV20LinFas ;
   private short AV37LinPq ;
   private short AV57j ;
   private short A194BarOrdLin ;
   private short AV39BarOrdLin ;
   private short A1240GuiFasLin ;
   private short A5462F_TipPza ;
   private short Gx_err ;
   private short A1160ProForL ;
   private short AV49Tab_l[] ;
   private short AV50i ;
   private short A5456P_ForLin ;
   private short A5460P_forMtr ;
   private short A5461P_TipPza ;
   private short A5455P_ForULin ;
   private short A1248GuiFasULin ;
   private short A5371FasQuiLin ;
   private short A4650FasForLin ;
   private short A5507ClipqdLin ;
   private short A5511ClipqiLin ;
   private short A4295ClasCod ;
   private short AV34Tipo_pza ;
   private short A5519ClifsdLin ;
   private short A5515ClifsiLin ;
   private int AV56Tab_hdro[] ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV25CliCod ;
   private int AV43BarColNUm ;
   private int W129BarCod ;
   private int GX_INS194 ;
   private int A483ForColNum ;
   private int GX_I ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GX_INS803 ;
   private int A44AlbRecCod ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV27FasKgm ;
   private java.math.BigDecimal AV28FasMtr ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal AV35FasPreKgm ;
   private java.math.BigDecimal AV36FasPreMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A5457P_ForPKg ;
   private java.math.BigDecimal A5458P_ForPMt ;
   private java.math.BigDecimal A5459P_forKgm ;
   private java.math.BigDecimal A5449ProForPP ;
   private java.math.BigDecimal A5448ProForPK ;
   private java.math.BigDecimal A5508ClipqdVal ;
   private java.math.BigDecimal A5509ClipqdPor ;
   private java.math.BigDecimal AV47BarKgm ;
   private java.math.BigDecimal AV45Por_i ;
   private java.math.BigDecimal AV46TotRec ;
   private java.math.BigDecimal A5512ClipqiVal ;
   private java.math.BigDecimal A5513ClipqiPor ;
   private java.math.BigDecimal A5451ProForPPP ;
   private java.math.BigDecimal A5450ProForPPK ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A5520ClifsdVal ;
   private java.math.BigDecimal A5521ClifsdPor ;
   private java.math.BigDecimal A5516ClifsiVal ;
   private java.math.BigDecimal A5517ClifsiPor ;
   private java.math.BigDecimal A5426FasPrePPz ;
   private java.math.BigDecimal A5427FasPrePKg ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV41BarSer ;
   private String AV42BarColNom ;
   private String A457FasCod ;
   private String A5367BarAntp ;
   private String A5253BarAcc ;
   private String A5406BarAntpT ;
   private String A5369BarFasGral ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String AV24FasCod ;
   private String AV38ProCod ;
   private String AV51BarAntp ;
   private String AV52BarAcc ;
   private String AV53BarAntpt ;
   private String W457FasCod ;
   private String Gx_emsg ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV48Tab_p[] ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String AV40ProForCod ;
   private String A5452P_ForCod ;
   private String A764ProForCod ;
   private String A200BarPieCod ;
   private String A5428FasPreCod ;
   private boolean n252CliCod ;
   private boolean n5369BarFasGral ;
   private boolean returnInSub ;
   private boolean n5462F_TipPza ;
   private boolean n5457P_ForPKg ;
   private boolean n5458P_ForPMt ;
   private boolean n5452P_ForCod ;
   private boolean n5459P_forKgm ;
   private boolean n5460P_forMtr ;
   private boolean n5461P_TipPza ;
   private boolean n5455P_ForULin ;
   private boolean n5449ProForPP ;
   private boolean n5448ProForPK ;
   private boolean n5508ClipqdVal ;
   private boolean n5509ClipqdPor ;
   private boolean n5512ClipqiVal ;
   private boolean n5513ClipqiPor ;
   private boolean n4295ClasCod ;
   private boolean n5451ProForPPP ;
   private boolean n5450ProForPPK ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n5520ClifsdVal ;
   private boolean n5521ClifsdPor ;
   private boolean n5516ClifsiVal ;
   private boolean n5517ClifsiPor ;
   private boolean n5426FasPrePPz ;
   private boolean n5427FasPrePKg ;
   private short[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02AS2_A396EmprCod ;
   private String[] P02AS2_A130BarCodPar ;
   private byte[] P02AS2_A132BarCodReo ;
   private int[] P02AS2_A129BarCod ;
   private long[] P02AS2_A30AlbProCod ;
   private java.math.BigDecimal[] P02AS2_A1261BarAlbKgmE ;
   private int[] P02AS2_A1265BarAlbPie ;
   private int[] P02AS2_A252CliCod ;
   private boolean[] P02AS2_n252CliCod ;
   private String[] P02AS2_A212BarSer ;
   private String[] P02AS2_A135BarColNom ;
   private int[] P02AS2_A136BarColNum ;
   private byte[] P02AS2_A218BarTipCol ;
   private String[] P02AS3_A396EmprCod ;
   private String[] P02AS3_A130BarCodPar ;
   private byte[] P02AS3_A132BarCodReo ;
   private int[] P02AS3_A129BarCod ;
   private java.math.BigDecimal[] P02AS3_A227BarUni ;
   private int[] P02AS3_A252CliCod ;
   private boolean[] P02AS3_n252CliCod ;
   private String[] P02AS3_A457FasCod ;
   private String[] P02AS3_A5367BarAntp ;
   private String[] P02AS3_A5253BarAcc ;
   private String[] P02AS3_A5406BarAntpT ;
   private String[] P02AS3_A5369BarFasGral ;
   private boolean[] P02AS3_n5369BarFasGral ;
   private short[] P02AS3_A194BarOrdLin ;
   private String[] P02AS3_A758ProCod ;
   private String[] P02AS5_A396EmprCod ;
   private byte[] P02AS5_A831TipColCod ;
   private int[] P02AS5_A483ForColNum ;
   private String[] P02AS5_A482ForColNom ;
   private String[] P02AS5_A494ForSer ;
   private int[] P02AS5_A252CliCod ;
   private boolean[] P02AS5_n252CliCod ;
   private short[] P02AS5_A1160ProForL ;
   private String[] P02AS8_A396EmprCod ;
   private String[] P02AS8_A764ProForCod ;
   private short[] P02AS8_A194BarOrdLin ;
   private String[] P02AS8_A758ProCod ;
   private String[] P02AS8_A130BarCodPar ;
   private byte[] P02AS8_A132BarCodReo ;
   private int[] P02AS8_A129BarCod ;
   private short[] P02AS8_A5371FasQuiLin ;
   private String[] P02AS10_A396EmprCod ;
   private String[] P02AS10_A764ProForCod ;
   private String[] P02AS10_A457FasCod ;
   private short[] P02AS10_A4650FasForLin ;
   private String[] P02AS12_A396EmprCod ;
   private int[] P02AS12_A252CliCod ;
   private boolean[] P02AS12_n252CliCod ;
   private String[] P02AS12_A5452P_ForCod ;
   private boolean[] P02AS12_n5452P_ForCod ;
   private java.math.BigDecimal[] P02AS12_A5449ProForPP ;
   private boolean[] P02AS12_n5449ProForPP ;
   private java.math.BigDecimal[] P02AS12_A5448ProForPK ;
   private boolean[] P02AS12_n5448ProForPK ;
   private String[] P02AS13_A396EmprCod ;
   private int[] P02AS13_A252CliCod ;
   private boolean[] P02AS13_n252CliCod ;
   private String[] P02AS13_A5452P_ForCod ;
   private boolean[] P02AS13_n5452P_ForCod ;
   private java.math.BigDecimal[] P02AS13_A5508ClipqdVal ;
   private boolean[] P02AS13_n5508ClipqdVal ;
   private java.math.BigDecimal[] P02AS13_A5509ClipqdPor ;
   private boolean[] P02AS13_n5509ClipqdPor ;
   private short[] P02AS13_A5507ClipqdLin ;
   private String[] P02AS14_A396EmprCod ;
   private int[] P02AS14_A252CliCod ;
   private boolean[] P02AS14_n252CliCod ;
   private String[] P02AS14_A5452P_ForCod ;
   private boolean[] P02AS14_n5452P_ForCod ;
   private java.math.BigDecimal[] P02AS14_A5512ClipqiVal ;
   private boolean[] P02AS14_n5512ClipqiVal ;
   private java.math.BigDecimal[] P02AS14_A5513ClipqiPor ;
   private boolean[] P02AS14_n5513ClipqiPor ;
   private short[] P02AS14_A5511ClipqiLin ;
   private int[] P02AS15_A44AlbRecCod ;
   private String[] P02AS15_A396EmprCod ;
   private String[] P02AS15_A130BarCodPar ;
   private byte[] P02AS15_A132BarCodReo ;
   private int[] P02AS15_A129BarCod ;
   private short[] P02AS15_A4295ClasCod ;
   private boolean[] P02AS15_n4295ClasCod ;
   private String[] P02AS15_A200BarPieCod ;
   private String[] P02AS17_A396EmprCod ;
   private int[] P02AS17_A252CliCod ;
   private boolean[] P02AS17_n252CliCod ;
   private short[] P02AS17_A4295ClasCod ;
   private boolean[] P02AS17_n4295ClasCod ;
   private String[] P02AS17_A5452P_ForCod ;
   private boolean[] P02AS17_n5452P_ForCod ;
   private java.math.BigDecimal[] P02AS17_A5451ProForPPP ;
   private boolean[] P02AS17_n5451ProForPPP ;
   private java.math.BigDecimal[] P02AS17_A5450ProForPPK ;
   private boolean[] P02AS17_n5450ProForPPK ;
   private String[] P02AS18_A396EmprCod ;
   private int[] P02AS18_A252CliCod ;
   private boolean[] P02AS18_n252CliCod ;
   private String[] P02AS18_A5452P_ForCod ;
   private boolean[] P02AS18_n5452P_ForCod ;
   private java.math.BigDecimal[] P02AS18_A5508ClipqdVal ;
   private boolean[] P02AS18_n5508ClipqdVal ;
   private java.math.BigDecimal[] P02AS18_A5509ClipqdPor ;
   private boolean[] P02AS18_n5509ClipqdPor ;
   private short[] P02AS18_A5507ClipqdLin ;
   private String[] P02AS19_A396EmprCod ;
   private int[] P02AS19_A252CliCod ;
   private boolean[] P02AS19_n252CliCod ;
   private String[] P02AS19_A5452P_ForCod ;
   private boolean[] P02AS19_n5452P_ForCod ;
   private java.math.BigDecimal[] P02AS19_A5512ClipqiVal ;
   private boolean[] P02AS19_n5512ClipqiVal ;
   private java.math.BigDecimal[] P02AS19_A5513ClipqiPor ;
   private boolean[] P02AS19_n5513ClipqiPor ;
   private short[] P02AS19_A5511ClipqiLin ;
   private String[] P02AS20_A396EmprCod ;
   private String[] P02AS20_A457FasCod ;
   private int[] P02AS20_A252CliCod ;
   private boolean[] P02AS20_n252CliCod ;
   private java.math.BigDecimal[] P02AS20_A466FasPreKgm ;
   private boolean[] P02AS20_n466FasPreKgm ;
   private java.math.BigDecimal[] P02AS20_A467FasPreMtr ;
   private boolean[] P02AS20_n467FasPreMtr ;
   private String[] P02AS21_A396EmprCod ;
   private int[] P02AS21_A252CliCod ;
   private boolean[] P02AS21_n252CliCod ;
   private String[] P02AS21_A457FasCod ;
   private java.math.BigDecimal[] P02AS21_A5520ClifsdVal ;
   private boolean[] P02AS21_n5520ClifsdVal ;
   private java.math.BigDecimal[] P02AS21_A5521ClifsdPor ;
   private boolean[] P02AS21_n5521ClifsdPor ;
   private short[] P02AS21_A5519ClifsdLin ;
   private String[] P02AS22_A396EmprCod ;
   private int[] P02AS22_A252CliCod ;
   private boolean[] P02AS22_n252CliCod ;
   private String[] P02AS22_A457FasCod ;
   private java.math.BigDecimal[] P02AS22_A5516ClifsiVal ;
   private boolean[] P02AS22_n5516ClifsiVal ;
   private java.math.BigDecimal[] P02AS22_A5517ClifsiPor ;
   private boolean[] P02AS22_n5517ClifsiPor ;
   private short[] P02AS22_A5515ClifsiLin ;
   private int[] P02AS23_A44AlbRecCod ;
   private String[] P02AS23_A396EmprCod ;
   private String[] P02AS23_A130BarCodPar ;
   private byte[] P02AS23_A132BarCodReo ;
   private int[] P02AS23_A129BarCod ;
   private short[] P02AS23_A4295ClasCod ;
   private boolean[] P02AS23_n4295ClasCod ;
   private String[] P02AS23_A200BarPieCod ;
   private String[] P02AS25_A396EmprCod ;
   private int[] P02AS25_A252CliCod ;
   private boolean[] P02AS25_n252CliCod ;
   private short[] P02AS25_A4295ClasCod ;
   private boolean[] P02AS25_n4295ClasCod ;
   private String[] P02AS25_A5428FasPreCod ;
   private java.math.BigDecimal[] P02AS25_A5426FasPrePPz ;
   private boolean[] P02AS25_n5426FasPrePPz ;
   private java.math.BigDecimal[] P02AS25_A5427FasPrePKg ;
   private boolean[] P02AS25_n5427FasPrePKg ;
   private String[] P02AS26_A396EmprCod ;
   private int[] P02AS26_A252CliCod ;
   private boolean[] P02AS26_n252CliCod ;
   private String[] P02AS26_A457FasCod ;
   private java.math.BigDecimal[] P02AS26_A5520ClifsdVal ;
   private boolean[] P02AS26_n5520ClifsdVal ;
   private java.math.BigDecimal[] P02AS26_A5521ClifsdPor ;
   private boolean[] P02AS26_n5521ClifsdPor ;
   private short[] P02AS26_A5519ClifsdLin ;
   private String[] P02AS27_A396EmprCod ;
   private int[] P02AS27_A252CliCod ;
   private boolean[] P02AS27_n252CliCod ;
   private String[] P02AS27_A457FasCod ;
   private java.math.BigDecimal[] P02AS27_A5516ClifsiVal ;
   private boolean[] P02AS27_n5516ClifsiVal ;
   private java.math.BigDecimal[] P02AS27_A5517ClifsiPor ;
   private boolean[] P02AS27_n5517ClifsiPor ;
   private short[] P02AS27_A5515ClifsiLin ;
}

final  class pcopfqo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02AS2", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbPie, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02AS3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarUni, T2.CliCod, T1.FasCod, T2.BarAntp, T2.BarAcc, T2.BarAntpT, T1.BarFasGral, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02AS4", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, F_TipPza, FasCodF, FasPreDsK, FasPreDsM, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P02AS5", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02AS6", "INSERT INTO TXPALBQUI(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin, P_ForCod, P_ForPKg, P_ForPMt, P_forKgm, P_forMtr, P_TipPza) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBQUI")
         ,new UpdateCursor("P02AS7", "UPDATE TXPALBBAR SET P_ForULin=?, GuiFasULin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02AS8", "SELECT EmprCod, ProForCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02AS9", "INSERT INTO TXPALBQUI(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin, P_ForCod, P_ForPKg, P_ForPMt, P_forKgm, P_forMtr, P_TipPza) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBQUI")
         ,new ForEachCursor("P02AS10", "SELECT EmprCod, ProForCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02AS11", "INSERT INTO TXPALBQUI(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin, P_ForCod, P_ForPKg, P_ForPMt, P_forKgm, P_forMtr, P_TipPza) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBQUI")
         ,new ForEachCursor("P02AS12", "SELECT EmprCod, CliCod, P_ForCod, ProForPP, ProForPK FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02AS13", "SELECT EmprCod, CliCod, P_ForCod, ClipqdVal, ClipqdPor, ClipqdLin FROM TXPCLIPQD WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod, ClipqdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS14", "SELECT EmprCod, CliCod, P_ForCod, ClipqiVal, ClipqiPor, ClipqiLin FROM TXPCLIPQI WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod, ClipqiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS15", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ClasCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02AS16", "INSERT INTO TXPALBQUI(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin, P_ForCod, P_ForPKg, P_ForPMt, P_forKgm, P_forMtr, P_TipPza) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBQUI")
         ,new ForEachCursor("P02AS17", "SELECT EmprCod, CliCod, ClasCod, P_ForCod, ProForPPP, ProForPPK FROM TXPPREQP WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? and ClasCod = ? ORDER BY EmprCod, CliCod, P_ForCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02AS18", "SELECT EmprCod, CliCod, P_ForCod, ClipqdVal, ClipqdPor, ClipqdLin FROM TXPCLIPQD WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod, ClipqdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS19", "SELECT EmprCod, CliCod, P_ForCod, ClipqiVal, ClipqiPor, ClipqiLin FROM TXPCLIPQI WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod, ClipqiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS20", "SELECT EmprCod, FasCod, CliCod, FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02AS21", "SELECT EmprCod, CliCod, FasCod, ClifsdVal, ClifsdPor, ClifsdLin FROM TXPCLIFSD WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod, ClifsdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS22", "SELECT EmprCod, CliCod, FasCod, ClifsiVal, ClifsiPor, ClifsiLin FROM TXPCLIFS1 WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod, ClifsiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS23", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ClasCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02AS24", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, F_TipPza, FasCodF, FasPreDsK, FasPreDsM, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P02AS25", "SELECT EmprCod, CliCod, ClasCod, FasPreCod, FasPrePPz, FasPrePKg FROM TXPPREFS1 WHERE EmprCod = ? and CliCod = ? and FasPreCod = ? and ClasCod = ? ORDER BY EmprCod, CliCod, FasPreCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02AS26", "SELECT EmprCod, CliCod, FasCod, ClifsdVal, ClifsdPor, ClifsdLin FROM TXPCLIFSD WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod, ClifsdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02AS27", "SELECT EmprCod, CliCod, FasCod, ClifsiVal, ClifsiPor, ClifsiLin FROM TXPCLIFS1 WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod, ClifsiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[12]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(3, (String)parms[3], 6);
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
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setString(3, (String)parms[3], 6);
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
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
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
               stmt.setString(3, (String)parms[3], 8);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[12]).shortValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setString(3, (String)parms[3], 8);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
      }
   }

}

