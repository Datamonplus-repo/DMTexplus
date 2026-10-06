package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfrmame extends GXProcedure
{
   public pfrmame( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfrmame.class ), "" );
   }

   public pfrmame( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pfrmame.this.aP2 = new String[] {""};
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
      pfrmame.this.AV14EmprCod = aP0[0];
      this.aP0 = aP0;
      pfrmame.this.AV25MRCod1 = aP1[0];
      this.aP1 = aP1;
      pfrmame.this.AV24MRNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV14EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "OR", "") ;
      GXv_int3[0] = AV17MTMovCod ;
      GXv_char4[0] = AV18MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      pfrmame.this.AV14EmprCod = GXv_char1[0] ;
      pfrmame.this.AV17MTMovCod = GXv_int3[0] ;
      pfrmame.this.AV18MTMovNom = GXv_char4[0] ;
      GXv_char4[0] = AV14EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "MS", "") ;
      GXv_int3[0] = AV19MTMovCod1 ;
      GXv_char1[0] = AV20MTMovNom1 ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_int3, GXv_char1) ;
      pfrmame.this.AV14EmprCod = GXv_char4[0] ;
      pfrmame.this.AV19MTMovCod1 = GXv_int3[0] ;
      pfrmame.this.AV20MTMovNom1 = GXv_char1[0] ;
      GXv_char4[0] = AV14EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "IS", "") ;
      GXv_int3[0] = AV26MTMovCod2 ;
      GXv_char1[0] = AV27MTMovNom2 ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_int3, GXv_char1) ;
      pfrmame.this.AV14EmprCod = GXv_char4[0] ;
      pfrmame.this.AV26MTMovCod2 = GXv_int3[0] ;
      pfrmame.this.AV27MTMovNom2 = GXv_char1[0] ;
      AV29ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      lV24MRNom = GXutil.padr( GXutil.rtrim( AV24MRNom), 100, "%") ;
      /* Using cursor P00G62 */
      pr_default.execute(0, new Object[] {AV14EmprCod, lV24MRNom, Integer.valueOf(AV25MRCod1), Integer.valueOf(AV25MRCod1)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkG62 = false ;
         A9495MRStkAct = P00G62_A9495MRStkAct[0] ;
         n9495MRStkAct = P00G62_n9495MRStkAct[0] ;
         A9496MRStkRes = P00G62_A9496MRStkRes[0] ;
         n9496MRStkRes = P00G62_n9496MRStkRes[0] ;
         A9500MRUltMov = P00G62_A9500MRUltMov[0] ;
         n9500MRUltMov = P00G62_n9500MRUltMov[0] ;
         A9501MRUltRes = P00G62_A9501MRUltRes[0] ;
         n9501MRUltRes = P00G62_n9501MRUltRes[0] ;
         A9492MRCod = P00G62_A9492MRCod[0] ;
         A396EmprCod = P00G62_A396EmprCod[0] ;
         A9493MRNom = P00G62_A9493MRNom[0] ;
         n9493MRNom = P00G62_n9493MRNom[0] ;
         Gx_msg = httpContext.getMessage( "Repuesto : ", "") + GXutil.trim( GXutil.str( A9492MRCod, 10, 0)) + " - " + GXutil.trim( A9493MRNom) ;
         System.out.println( Gx_msg );
         /* Optimized DELETE. */
         /* Using cursor P00G63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00G64 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
         /* End optimized DELETE. */
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00G62_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00G62_A9492MRCod[0] == A9492MRCod ) )
         {
            brkG62 = false ;
            A9495MRStkAct = P00G62_A9495MRStkAct[0] ;
            n9495MRStkAct = P00G62_n9495MRStkAct[0] ;
            A9496MRStkRes = P00G62_A9496MRStkRes[0] ;
            n9496MRStkRes = P00G62_n9496MRStkRes[0] ;
            A9500MRUltMov = P00G62_A9500MRUltMov[0] ;
            n9500MRUltMov = P00G62_n9500MRUltMov[0] ;
            A9501MRUltRes = P00G62_A9501MRUltRes[0] ;
            n9501MRUltRes = P00G62_n9501MRUltRes[0] ;
            if ( GXutil.strcmp(A396EmprCod, AV14EmprCod) == 0 )
            {
               A9495MRStkAct = DecimalUtil.doubleToDec(0) ;
               n9495MRStkAct = false ;
               A9496MRStkRes = DecimalUtil.doubleToDec(0) ;
               n9496MRStkRes = false ;
               A9500MRUltMov = 0 ;
               n9500MRUltMov = false ;
               A9501MRUltRes = 0 ;
               n9501MRUltRes = false ;
               /* Using cursor P00G65 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n9495MRStkAct), A9495MRStkAct, Boolean.valueOf(n9496MRStkRes), A9496MRStkRes, Boolean.valueOf(n9500MRUltMov), Integer.valueOf(A9500MRUltMov), Boolean.valueOf(n9501MRUltRes), Long.valueOf(A9501MRUltRes), A396EmprCod, Integer.valueOf(A9492MRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
            }
            brkG62 = true ;
            pr_default.readNext(0);
         }
         AV14EmprCod = A396EmprCod ;
         AV15MRCod = A9492MRCod ;
         /* Execute user subroutine: 'ORDENES' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'MOVIMIENTOS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'INVENTARIOS' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ENTRADAS' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! brkG62 )
         {
            brkG62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   public void S111( )
   {
      /* 'ORDENES' Routine */
      returnInSub = false ;
      /* Using cursor P00G66 */
      pr_default.execute(4, new Object[] {AV14EmprCod, Integer.valueOf(AV15MRCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A9446OMRepCod = P00G66_A9446OMRepCod[0] ;
         A396EmprCod = P00G66_A396EmprCod[0] ;
         A9425OMCod = P00G66_A9425OMCod[0] ;
         A9447OMRepNom = P00G66_A9447OMRepNom[0] ;
         n9447OMRepNom = P00G66_n9447OMRepNom[0] ;
         A9452OMRCCnt = P00G66_A9452OMRCCnt[0] ;
         A9450OMRRCnt = P00G66_A9450OMRRCnt[0] ;
         A9453OMRCPre = P00G66_A9453OMRCPre[0] ;
         A9451OMRRPre = P00G66_A9451OMRRPre[0] ;
         A9449OMRTpo = P00G66_A9449OMRTpo[0] ;
         A9445OMEst = P00G66_A9445OMEst[0] ;
         A9436OMFchCre = P00G66_A9436OMFchCre[0] ;
         A9439OMFchCer = P00G66_A9439OMFchCer[0] ;
         A9447OMRepNom = P00G66_A9447OMRepNom[0] ;
         n9447OMRepNom = P00G66_n9447OMRepNom[0] ;
         A9445OMEst = P00G66_A9445OMEst[0] ;
         A9436OMFchCre = P00G66_A9436OMFchCre[0] ;
         A9439OMFchCer = P00G66_A9439OMFchCer[0] ;
         Gx_msg = httpContext.getMessage( "Repuesto : ", "") + GXutil.trim( GXutil.str( A9446OMRepCod, 10, 0)) + " - " + GXutil.trim( A9447OMRepNom) + httpContext.getMessage( ": Orden ", "") + GXutil.trim( GXutil.str( A9425OMCod, 10, 0)) ;
         System.out.println( Gx_msg );
         AV22OMRRCnt = A9450OMRRCnt.add(A9452OMRCCnt) ;
         AV23OMRRPre = A9451OMRRPre.add(A9453OMRCPre) ;
         A9450OMRRCnt = ((GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", ""))==0) ? AV22OMRRCnt : DecimalUtil.doubleToDec(0)) ;
         A9452OMRCCnt = ((GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", ""))==0) ? AV22OMRRCnt : DecimalUtil.doubleToDec(0)) ;
         A9451OMRRPre = ((GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", ""))==0) ? AV23OMRRPre : DecimalUtil.doubleToDec(0)) ;
         A9453OMRCPre = ((GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", ""))==0) ? AV23OMRRPre : DecimalUtil.doubleToDec(0)) ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A9425OMCod ;
            GXv_int5[0] = A9446OMRepCod ;
            GXv_int6[0] = AV17MTMovCod ;
            GXv_char2[0] = AV18MTMovNom ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = A9450OMRRCnt ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = A9436OMFchCre ;
            new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A9425OMCod = GXv_int3[0] ;
            pfrmame.this.A9446OMRepCod = GXv_int5[0] ;
            pfrmame.this.AV17MTMovCod = GXv_int6[0] ;
            pfrmame.this.AV18MTMovNom = GXv_char2[0] ;
            pfrmame.this.A9450OMRRCnt = GXv_decimal9[0] ;
            pfrmame.this.A9436OMFchCre = GXv_dtime10[0] ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9425OMCod ;
            GXv_int5[0] = A9446OMRepCod ;
            GXv_int3[0] = AV17MTMovCod ;
            GXv_char2[0] = AV18MTMovNom ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal8[0] = A9452OMRCCnt ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = A9439OMFchCer ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal9, GXv_decimal8, GXv_char1, GXv_dtime10, GXv_decimal11) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A9425OMCod = GXv_int6[0] ;
            pfrmame.this.A9446OMRepCod = GXv_int5[0] ;
            pfrmame.this.AV17MTMovCod = GXv_int3[0] ;
            pfrmame.this.AV18MTMovNom = GXv_char2[0] ;
            pfrmame.this.A9452OMRCCnt = GXv_decimal8[0] ;
            pfrmame.this.A9439OMFchCer = GXv_dtime10[0] ;
         }
         /* Using cursor P00G67 */
         pr_default.execute(5, new Object[] {A9452OMRCCnt, A9450OMRRCnt, A9453OMRCPre, A9451OMRRPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'MOVIMIENTOS' Routine */
      returnInSub = false ;
      /* Using cursor P00G68 */
      pr_default.execute(6, new Object[] {AV14EmprCod, Integer.valueOf(AV15MRCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A9421MMSRCod = P00G68_A9421MMSRCod[0] ;
         A396EmprCod = P00G68_A396EmprCod[0] ;
         A9412MMSCod = P00G68_A9412MMSCod[0] ;
         A9422MMSRNom = P00G68_A9422MMSRNom[0] ;
         n9422MMSRNom = P00G68_n9422MMSRNom[0] ;
         A9413MMSTpo = P00G68_A9413MMSTpo[0] ;
         n9413MMSTpo = P00G68_n9413MMSTpo[0] ;
         A9409MMSRCnt = P00G68_A9409MMSRCnt[0] ;
         A9420MMSEst = P00G68_A9420MMSEst[0] ;
         n9420MMSEst = P00G68_n9420MMSEst[0] ;
         A9418MMSFchCre = P00G68_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P00G68_n9418MMSFchCre[0] ;
         A11304MMSFchApl = P00G68_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P00G68_n11304MMSFchApl[0] ;
         A9424MMSRPre = P00G68_A9424MMSRPre[0] ;
         A9422MMSRNom = P00G68_A9422MMSRNom[0] ;
         n9422MMSRNom = P00G68_n9422MMSRNom[0] ;
         A9413MMSTpo = P00G68_A9413MMSTpo[0] ;
         n9413MMSTpo = P00G68_n9413MMSTpo[0] ;
         A9420MMSEst = P00G68_A9420MMSEst[0] ;
         n9420MMSEst = P00G68_n9420MMSEst[0] ;
         A9418MMSFchCre = P00G68_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P00G68_n9418MMSFchCre[0] ;
         A11304MMSFchApl = P00G68_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P00G68_n11304MMSFchApl[0] ;
         Gx_msg = httpContext.getMessage( "Repuesto : ", "") + GXutil.trim( GXutil.str( A9421MMSRCod, 10, 0)) + " - " + GXutil.trim( A9422MMSRNom) + httpContext.getMessage( ": Movimiento ", "") + GXutil.trim( GXutil.str( A9412MMSCod, 10, 0)) ;
         System.out.println( Gx_msg );
         AV21MMSRCnt = A9409MMSRCnt.multiply(((GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", ""))==0) ? DecimalUtil.doubleToDec(-1) : DecimalUtil.doubleToDec(1))) ;
         if ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9412MMSCod ;
            GXv_int5[0] = A9421MMSRCod ;
            GXv_int3[0] = AV19MTMovCod1 ;
            GXv_char2[0] = AV20MTMovNom1 ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = AV21MMSRCnt ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = A9418MMSFchCre ;
            new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal9, GXv_char1, GXv_dtime10) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A9412MMSCod = GXv_int6[0] ;
            pfrmame.this.A9421MMSRCod = GXv_int5[0] ;
            pfrmame.this.AV19MTMovCod1 = GXv_int3[0] ;
            pfrmame.this.AV20MTMovNom1 = GXv_char2[0] ;
            pfrmame.this.AV21MMSRCnt = GXv_decimal9[0] ;
            pfrmame.this.A9418MMSFchCre = GXv_dtime10[0] ;
         }
         else if ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9412MMSCod ;
            GXv_int5[0] = A9421MMSRCod ;
            GXv_int3[0] = AV19MTMovCod1 ;
            GXv_char2[0] = AV20MTMovNom1 ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = AV21MMSRCnt ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = A11304MMSFchApl ;
            GXv_decimal8[0] = A9424MMSRPre ;
            new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal9, GXv_char1, GXv_dtime10, GXv_decimal8) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A9412MMSCod = GXv_int6[0] ;
            pfrmame.this.A9421MMSRCod = GXv_int5[0] ;
            pfrmame.this.AV19MTMovCod1 = GXv_int3[0] ;
            pfrmame.this.AV20MTMovNom1 = GXv_char2[0] ;
            pfrmame.this.AV21MMSRCnt = GXv_decimal9[0] ;
            pfrmame.this.A11304MMSFchApl = GXv_dtime10[0] ;
            pfrmame.this.A9424MMSRPre = GXv_decimal8[0] ;
         }
         else
         {
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S131( )
   {
      /* 'INVENTARIOS' Routine */
      returnInSub = false ;
      /* Using cursor P00G69 */
      pr_default.execute(7, new Object[] {AV14EmprCod, Integer.valueOf(AV15MRCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A9403MISRCod = P00G69_A9403MISRCod[0] ;
         A396EmprCod = P00G69_A396EmprCod[0] ;
         A9404MISRNom = P00G69_A9404MISRNom[0] ;
         n9404MISRNom = P00G69_n9404MISRNom[0] ;
         A9408MISRStkDif = P00G69_A9408MISRStkDif[0] ;
         A9402MISEst = P00G69_A9402MISEst[0] ;
         n9402MISEst = P00G69_n9402MISEst[0] ;
         A9398MISCod = P00G69_A9398MISCod[0] ;
         A11303MISFchApl = P00G69_A11303MISFchApl[0] ;
         n11303MISFchApl = P00G69_n11303MISFchApl[0] ;
         A9401MISFchCre = P00G69_A9401MISFchCre[0] ;
         n9401MISFchCre = P00G69_n9401MISFchCre[0] ;
         A9404MISRNom = P00G69_A9404MISRNom[0] ;
         n9404MISRNom = P00G69_n9404MISRNom[0] ;
         A9402MISEst = P00G69_A9402MISEst[0] ;
         n9402MISEst = P00G69_n9402MISEst[0] ;
         A11303MISFchApl = P00G69_A11303MISFchApl[0] ;
         n11303MISFchApl = P00G69_n11303MISFchApl[0] ;
         A9401MISFchCre = P00G69_A9401MISFchCre[0] ;
         n9401MISFchCre = P00G69_n9401MISFchCre[0] ;
         Gx_msg = httpContext.getMessage( "Repuesto : ", "") + GXutil.trim( GXutil.str( A9403MISRCod, 10, 0)) + " - " + GXutil.trim( A9404MISRNom) + httpContext.getMessage( ": Inventario ", "") + GXutil.trim( GXutil.str( A9403MISRCod, 10, 0)) ;
         System.out.println( Gx_msg );
         AV28MISRStkDif = A9408MISRStkDif.negate() ;
         if ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "A", "")) == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9398MISCod ;
            GXv_int5[0] = A9403MISRCod ;
            GXv_int3[0] = AV26MTMovCod2 ;
            GXv_char2[0] = AV27MTMovNom2 ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = AV28MISRStkDif ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = GXutil.resetTime( A11303MISFchApl );
            GXv_decimal8[0] = DecimalUtil.ZERO ;
            new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal9, GXv_char1, GXv_dtime10, GXv_decimal8) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A9398MISCod = GXv_int6[0] ;
            pfrmame.this.A9403MISRCod = GXv_int5[0] ;
            pfrmame.this.AV26MTMovCod2 = GXv_int3[0] ;
            pfrmame.this.AV27MTMovNom2 = GXv_char2[0] ;
            pfrmame.this.AV28MISRStkDif = GXv_decimal9[0] ;
            pfrmame.this.A11303MISFchApl = GXutil.resetTime(GXv_dtime10[0]) ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9398MISCod ;
            GXv_int5[0] = A9403MISRCod ;
            GXv_int3[0] = AV26MTMovCod2 ;
            GXv_char2[0] = AV27MTMovNom2 ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = AV28MISRStkDif ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = A9401MISFchCre ;
            new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal9, GXv_char1, GXv_dtime10) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A9398MISCod = GXv_int6[0] ;
            pfrmame.this.A9403MISRCod = GXv_int5[0] ;
            pfrmame.this.AV26MTMovCod2 = GXv_int3[0] ;
            pfrmame.this.AV27MTMovNom2 = GXv_char2[0] ;
            pfrmame.this.AV28MISRStkDif = GXv_decimal9[0] ;
            pfrmame.this.A9401MISFchCre = GXv_dtime10[0] ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S141( )
   {
      /* 'ENTRADAS' Routine */
      returnInSub = false ;
      /* Using cursor P00G610 */
      pr_default.execute(8, new Object[] {AV14EmprCod, Integer.valueOf(AV15MRCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A11049MComEst = P00G610_A11049MComEst[0] ;
         A9492MRCod = P00G610_A9492MRCod[0] ;
         A396EmprCod = P00G610_A396EmprCod[0] ;
         A11055MComCod = P00G610_A11055MComCod[0] ;
         A9493MRNom = P00G610_A9493MRNom[0] ;
         n9493MRNom = P00G610_n9493MRNom[0] ;
         A11053MComEntCnt = P00G610_A11053MComEntCnt[0] ;
         A9493MRNom = P00G610_A9493MRNom[0] ;
         n9493MRNom = P00G610_n9493MRNom[0] ;
         A11049MComEst = P00G610_A11049MComEst[0] ;
         if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 )
         {
            Gx_msg = httpContext.getMessage( "Repuesto : ", "") + GXutil.trim( GXutil.str( A9492MRCod, 10, 0)) + " - " + GXutil.trim( A9493MRNom) + httpContext.getMessage( ": Entradas ", "") + GXutil.trim( GXutil.str( A11055MComCod, 10, 0)) ;
            System.out.println( Gx_msg );
            AV30MComEntCnt = A11053MComEntCnt.negate() ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = (int)(A11055MComCod) ;
            GXv_int5[0] = A9492MRCod ;
            GXv_int3[0] = AV17MTMovCod ;
            GXv_char2[0] = AV18MTMovNom ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = AV30MComEntCnt ;
            GXv_char1[0] = httpContext.getMessage( "R", "") ;
            GXv_dtime10[0] = AV29ServerNow ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal11, GXv_decimal9, GXv_char1, GXv_dtime10, GXv_decimal8) ;
            pfrmame.this.A396EmprCod = GXv_char4[0] ;
            pfrmame.this.A11055MComCod = GXv_int6[0] ;
            pfrmame.this.A9492MRCod = GXv_int5[0] ;
            pfrmame.this.AV17MTMovCod = GXv_int3[0] ;
            pfrmame.this.AV18MTMovNom = GXv_char2[0] ;
            pfrmame.this.AV30MComEntCnt = GXv_decimal9[0] ;
            pfrmame.this.AV29ServerNow = GXv_dtime10[0] ;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfrmame.this.AV14EmprCod;
      this.aP1[0] = pfrmame.this.AV25MRCod1;
      this.aP2[0] = pfrmame.this.AV24MRNom;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pfrmame");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18MTMovNom = "" ;
      AV20MTMovNom1 = "" ;
      AV27MTMovNom2 = "" ;
      AV29ServerNow = GXutil.resetTime( GXutil.nullDate() );
      lV24MRNom = "" ;
      scmdbuf = "" ;
      P00G62_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G62_n9495MRStkAct = new boolean[] {false} ;
      P00G62_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G62_n9496MRStkRes = new boolean[] {false} ;
      P00G62_A9500MRUltMov = new int[1] ;
      P00G62_n9500MRUltMov = new boolean[] {false} ;
      P00G62_A9501MRUltRes = new long[1] ;
      P00G62_n9501MRUltRes = new boolean[] {false} ;
      P00G62_A9492MRCod = new int[1] ;
      P00G62_A396EmprCod = new String[] {""} ;
      P00G62_A9493MRNom = new String[] {""} ;
      P00G62_n9493MRNom = new boolean[] {false} ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A9493MRNom = "" ;
      Gx_msg = "" ;
      P00G66_A9446OMRepCod = new int[1] ;
      P00G66_A396EmprCod = new String[] {""} ;
      P00G66_A9425OMCod = new int[1] ;
      P00G66_A9447OMRepNom = new String[] {""} ;
      P00G66_n9447OMRepNom = new boolean[] {false} ;
      P00G66_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G66_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G66_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G66_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G66_A9449OMRTpo = new String[] {""} ;
      P00G66_A9445OMEst = new String[] {""} ;
      P00G66_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P00G66_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      A9447OMRepNom = "" ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9449OMRTpo = "" ;
      A9445OMEst = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV22OMRRCnt = DecimalUtil.ZERO ;
      AV23OMRRPre = DecimalUtil.ZERO ;
      P00G68_A9421MMSRCod = new int[1] ;
      P00G68_A396EmprCod = new String[] {""} ;
      P00G68_A9412MMSCod = new int[1] ;
      P00G68_A9422MMSRNom = new String[] {""} ;
      P00G68_n9422MMSRNom = new boolean[] {false} ;
      P00G68_A9413MMSTpo = new String[] {""} ;
      P00G68_n9413MMSTpo = new boolean[] {false} ;
      P00G68_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G68_A9420MMSEst = new String[] {""} ;
      P00G68_n9420MMSEst = new boolean[] {false} ;
      P00G68_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P00G68_n9418MMSFchCre = new boolean[] {false} ;
      P00G68_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P00G68_n11304MMSFchApl = new boolean[] {false} ;
      P00G68_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9422MMSRNom = "" ;
      A9413MMSTpo = "" ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A9420MMSEst = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      A9424MMSRPre = DecimalUtil.ZERO ;
      AV21MMSRCnt = DecimalUtil.ZERO ;
      P00G69_A9403MISRCod = new int[1] ;
      P00G69_A396EmprCod = new String[] {""} ;
      P00G69_A9404MISRNom = new String[] {""} ;
      P00G69_n9404MISRNom = new boolean[] {false} ;
      P00G69_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G69_A9402MISEst = new String[] {""} ;
      P00G69_n9402MISEst = new boolean[] {false} ;
      P00G69_A9398MISCod = new int[1] ;
      P00G69_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P00G69_n11303MISFchApl = new boolean[] {false} ;
      P00G69_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P00G69_n9401MISFchCre = new boolean[] {false} ;
      A9404MISRNom = "" ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      A9402MISEst = "" ;
      A11303MISFchApl = GXutil.nullDate() ;
      A9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV28MISRStkDif = DecimalUtil.ZERO ;
      P00G610_A11049MComEst = new String[] {""} ;
      P00G610_A9492MRCod = new int[1] ;
      P00G610_A396EmprCod = new String[] {""} ;
      P00G610_A11055MComCod = new long[1] ;
      P00G610_A9493MRNom = new String[] {""} ;
      P00G610_n9493MRNom = new boolean[] {false} ;
      P00G610_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A11049MComEst = "" ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      AV30MComEntCnt = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pfrmame__default(),
         new Object[] {
             new Object[] {
            P00G62_A9495MRStkAct, P00G62_n9495MRStkAct, P00G62_A9496MRStkRes, P00G62_n9496MRStkRes, P00G62_A9500MRUltMov, P00G62_n9500MRUltMov, P00G62_A9501MRUltRes, P00G62_n9501MRUltRes, P00G62_A9492MRCod, P00G62_A396EmprCod,
            P00G62_A9493MRNom, P00G62_n9493MRNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00G66_A9446OMRepCod, P00G66_A396EmprCod, P00G66_A9425OMCod, P00G66_A9447OMRepNom, P00G66_n9447OMRepNom, P00G66_A9452OMRCCnt, P00G66_A9450OMRRCnt, P00G66_A9453OMRCPre, P00G66_A9451OMRRPre, P00G66_A9449OMRTpo,
            P00G66_A9445OMEst, P00G66_A9436OMFchCre, P00G66_A9439OMFchCer
            }
            , new Object[] {
            }
            , new Object[] {
            P00G68_A9421MMSRCod, P00G68_A396EmprCod, P00G68_A9412MMSCod, P00G68_A9422MMSRNom, P00G68_n9422MMSRNom, P00G68_A9413MMSTpo, P00G68_n9413MMSTpo, P00G68_A9409MMSRCnt, P00G68_A9420MMSEst, P00G68_n9420MMSEst,
            P00G68_A9418MMSFchCre, P00G68_n9418MMSFchCre, P00G68_A11304MMSFchApl, P00G68_n11304MMSFchApl, P00G68_A9424MMSRPre
            }
            , new Object[] {
            P00G69_A9403MISRCod, P00G69_A396EmprCod, P00G69_A9404MISRNom, P00G69_n9404MISRNom, P00G69_A9408MISRStkDif, P00G69_A9402MISEst, P00G69_n9402MISEst, P00G69_A9398MISCod, P00G69_A11303MISFchApl, P00G69_n11303MISFchApl,
            P00G69_A9401MISFchCre, P00G69_n9401MISFchCre
            }
            , new Object[] {
            P00G610_A11049MComEst, P00G610_A9492MRCod, P00G610_A396EmprCod, P00G610_A11055MComCod, P00G610_A9493MRNom, P00G610_n9493MRNom, P00G610_A11053MComEntCnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int7[] ;
   private short Gx_err ;
   private int AV25MRCod1 ;
   private int AV17MTMovCod ;
   private int AV19MTMovCod1 ;
   private int AV26MTMovCod2 ;
   private int A9500MRUltMov ;
   private int A9492MRCod ;
   private int AV15MRCod ;
   private int A9446OMRepCod ;
   private int A9425OMCod ;
   private int A9421MMSRCod ;
   private int A9412MMSCod ;
   private int A9403MISRCod ;
   private int A9398MISCod ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private long A9501MRUltRes ;
   private long A11055MComCod ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal AV22OMRRCnt ;
   private java.math.BigDecimal AV23OMRRPre ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal A9424MMSRPre ;
   private java.math.BigDecimal AV21MMSRCnt ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal AV28MISRStkDif ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal AV30MComEntCnt ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV14EmprCod ;
   private String AV24MRNom ;
   private String AV18MTMovNom ;
   private String AV20MTMovNom1 ;
   private String AV27MTMovNom2 ;
   private String lV24MRNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9493MRNom ;
   private String Gx_msg ;
   private String A9447OMRepNom ;
   private String A9449OMRTpo ;
   private String A9445OMEst ;
   private String A9422MMSRNom ;
   private String A9413MMSTpo ;
   private String A9420MMSEst ;
   private String A9404MISRNom ;
   private String A9402MISEst ;
   private String A11049MComEst ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV29ServerNow ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date A9401MISFchCre ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date A11303MISFchApl ;
   private boolean brkG62 ;
   private boolean n9495MRStkAct ;
   private boolean n9496MRStkRes ;
   private boolean n9500MRUltMov ;
   private boolean n9501MRUltRes ;
   private boolean n9493MRNom ;
   private boolean returnInSub ;
   private boolean n9447OMRepNom ;
   private boolean n9422MMSRNom ;
   private boolean n9413MMSTpo ;
   private boolean n9420MMSEst ;
   private boolean n9418MMSFchCre ;
   private boolean n11304MMSFchApl ;
   private boolean n9404MISRNom ;
   private boolean n9402MISEst ;
   private boolean n11303MISFchApl ;
   private boolean n9401MISFchCre ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00G62_A9495MRStkAct ;
   private boolean[] P00G62_n9495MRStkAct ;
   private java.math.BigDecimal[] P00G62_A9496MRStkRes ;
   private boolean[] P00G62_n9496MRStkRes ;
   private int[] P00G62_A9500MRUltMov ;
   private boolean[] P00G62_n9500MRUltMov ;
   private long[] P00G62_A9501MRUltRes ;
   private boolean[] P00G62_n9501MRUltRes ;
   private int[] P00G62_A9492MRCod ;
   private String[] P00G62_A396EmprCod ;
   private String[] P00G62_A9493MRNom ;
   private boolean[] P00G62_n9493MRNom ;
   private int[] P00G66_A9446OMRepCod ;
   private String[] P00G66_A396EmprCod ;
   private int[] P00G66_A9425OMCod ;
   private String[] P00G66_A9447OMRepNom ;
   private boolean[] P00G66_n9447OMRepNom ;
   private java.math.BigDecimal[] P00G66_A9452OMRCCnt ;
   private java.math.BigDecimal[] P00G66_A9450OMRRCnt ;
   private java.math.BigDecimal[] P00G66_A9453OMRCPre ;
   private java.math.BigDecimal[] P00G66_A9451OMRRPre ;
   private String[] P00G66_A9449OMRTpo ;
   private String[] P00G66_A9445OMEst ;
   private java.util.Date[] P00G66_A9436OMFchCre ;
   private java.util.Date[] P00G66_A9439OMFchCer ;
   private int[] P00G68_A9421MMSRCod ;
   private String[] P00G68_A396EmprCod ;
   private int[] P00G68_A9412MMSCod ;
   private String[] P00G68_A9422MMSRNom ;
   private boolean[] P00G68_n9422MMSRNom ;
   private String[] P00G68_A9413MMSTpo ;
   private boolean[] P00G68_n9413MMSTpo ;
   private java.math.BigDecimal[] P00G68_A9409MMSRCnt ;
   private String[] P00G68_A9420MMSEst ;
   private boolean[] P00G68_n9420MMSEst ;
   private java.util.Date[] P00G68_A9418MMSFchCre ;
   private boolean[] P00G68_n9418MMSFchCre ;
   private java.util.Date[] P00G68_A11304MMSFchApl ;
   private boolean[] P00G68_n11304MMSFchApl ;
   private java.math.BigDecimal[] P00G68_A9424MMSRPre ;
   private int[] P00G69_A9403MISRCod ;
   private String[] P00G69_A396EmprCod ;
   private String[] P00G69_A9404MISRNom ;
   private boolean[] P00G69_n9404MISRNom ;
   private java.math.BigDecimal[] P00G69_A9408MISRStkDif ;
   private String[] P00G69_A9402MISEst ;
   private boolean[] P00G69_n9402MISEst ;
   private int[] P00G69_A9398MISCod ;
   private java.util.Date[] P00G69_A11303MISFchApl ;
   private boolean[] P00G69_n11303MISFchApl ;
   private java.util.Date[] P00G69_A9401MISFchCre ;
   private boolean[] P00G69_n9401MISFchCre ;
   private String[] P00G610_A11049MComEst ;
   private int[] P00G610_A9492MRCod ;
   private String[] P00G610_A396EmprCod ;
   private long[] P00G610_A11055MComCod ;
   private String[] P00G610_A9493MRNom ;
   private boolean[] P00G610_n9493MRNom ;
   private java.math.BigDecimal[] P00G610_A11053MComEntCnt ;
}

final  class pfrmame__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G62", "SELECT MRStkAct, MRStkRes, MRUltMov, MRUltRes, MRCod, EmprCod, MRNom FROM TXPMREPUE WHERE (EmprCod = ?) AND (MRNom like ?) AND (MRCod = ? or ? = 0) ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00G63", "DELETE FROM TXPMReRes  WHERE EmprCod = ? and MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReRes")
         ,new UpdateCursor("P00G64", "DELETE FROM TXPMReMov  WHERE EmprCod = ? and MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReMov")
         ,new UpdateCursor("P00G65", "UPDATE TXPMREPUE SET MRStkAct=?, MRStkRes=?, MRUltMov=?, MRUltRes=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
         ,new ForEachCursor("P00G66", "SELECT T1.OMRepCod AS OMRepCod, T1.EmprCod, T1.OMCod, T2.MRNom AS OMRepNom, T1.OMRCCnt, T1.OMRRCnt, T1.OMRCPre, T1.OMRRPre, T1.OMRTpo, T3.OMEst, T3.OMFchCre, T3.OMFchCer FROM ((TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) INNER JOIN TXPMORDEN T3 ON T3.EmprCod = T1.EmprCod AND T3.OMCod = T1.OMCod) WHERE T1.EmprCod = ? and T1.OMRepCod = ? ORDER BY T1.EmprCod, T1.OMRepCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00G67", "UPDATE TXPMOrRep SET OMRCCnt=?, OMRRCnt=?, OMRCPre=?, OMRRPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P00G68", "SELECT T1.MMSRCod AS MMSRCod, T1.EmprCod, T1.MMSCod, T2.MRNom AS MMSRNom, T3.MMSTpo, T1.MMSRCnt, T3.MMSEst, T3.MMSFchCre, T3.MMSFchApl, T1.MMSRPre FROM ((TXPMMoStR T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MMSRCod) INNER JOIN TXPMMoStk T3 ON T3.EmprCod = T1.EmprCod AND T3.MMSCod = T1.MMSCod) WHERE T1.EmprCod = ? and T1.MMSRCod = ? ORDER BY T1.EmprCod, T1.MMSRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00G69", "SELECT T1.MISRCod AS MISRCod, T1.EmprCod, T2.MRNom AS MISRNom, T1.MISRStkDif, T3.MISEst, T1.MISCod, T3.MISFchApl, T3.MISFchCre FROM ((TXPMInSRe T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MISRCod) INNER JOIN TXPMINVST T3 ON T3.EmprCod = T1.EmprCod AND T3.MISCod = T1.MISCod) WHERE T1.EmprCod = ? and T1.MISRCod = ? ORDER BY T1.EmprCod, T1.MISRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00G610", "SELECT T3.MComEst, T1.MRCod, T1.EmprCod, T1.MComCod, T2.MRNom, T1.MComEntCnt FROM ((TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMRepCo T3 ON T3.EmprCod = T1.EmprCod AND T3.MComCod = T1.MComCod) WHERE T1.EmprCod = ? and T1.MRCod = ? ORDER BY T1.EmprCod, T1.MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(12);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setString(2, (String)parms[1], 100);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

