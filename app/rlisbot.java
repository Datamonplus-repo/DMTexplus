package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rlisbot extends GXReport
{
   public rlisbot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rlisbot.class ), "" );
   }

   public rlisbot( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 )
   {
      rlisbot.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      rlisbot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rlisbot.this.AV14PCodBota = aP1[0];
      this.aP1 = aP1;
      rlisbot.this.AV15UCodBota = aP2[0];
      this.aP2 = aP2;
      rlisbot.this.AV16PTipBotCod = aP3[0];
      this.aP3 = aP3;
      rlisbot.this.AV17UTipBotCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LISTADO DE BOTAS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV9Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit0 = GXt_char1 ;
         GXt_char1 = AV10Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit1 = GXt_char1 ;
         GXt_char1 = AV12Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2234_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit2 = GXt_char1 ;
         GXt_char1 = AV11Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit3 = GXt_char1 ;
         GXt_char1 = AV35Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL079_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit4 = GXt_char1 ;
         GXt_char1 = AV27Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN310_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit5 = GXt_char1 ;
         GXt_char1 = AV28Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit6 = GXt_char1 ;
         GXt_char1 = AV29Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit7 = GXt_char1 ;
         GXt_char1 = AV30Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit8 = GXt_char1 ;
         GXt_char1 = AV31Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit9 = GXt_char1 ;
         GXt_char1 = AV24Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit10 = GXt_char1 ;
         GXt_char1 = AV25Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT782_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit11 = GXt_char1 ;
         GXt_char1 = AV26Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit12 = GXt_char1 ;
         GXt_char1 = AV32Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT6_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit13 = GXt_char1 ;
         GXt_char1 = AV33Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit14 = GXt_char1 ;
         GXt_char1 = AV34Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL088_", ""), (byte)(99), GXv_char2) ;
         rlisbot.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit15 = GXt_char1 ;
         /* Using cursor P06AF2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06AF2_A407EmprNom[0] ;
            n407EmprNom = P06AF2_n407EmprNom[0] ;
            AV8NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV36ContLin = (byte)(1) ;
         /* Using cursor P06AF4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14PCodBota), Byte.valueOf(AV16PTipBotCod), Byte.valueOf(AV17UTipBotCod), Integer.valueOf(AV15UCodBota)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2855CodBota = P06AF4_A2855CodBota[0] ;
            A2853TipBotCod = P06AF4_A2853TipBotCod[0] ;
            n2853TipBotCod = P06AF4_n2853TipBotCod[0] ;
            A2857FecBota = P06AF4_A2857FecBota[0] ;
            n2857FecBota = P06AF4_n2857FecBota[0] ;
            A2856HorBota = P06AF4_A2856HorBota[0] ;
            n2856HorBota = P06AF4_n2856HorBota[0] ;
            A2858BotTotMts = P06AF4_A2858BotTotMts[0] ;
            n2858BotTotMts = P06AF4_n2858BotTotMts[0] ;
            A2858BotTotMts = P06AF4_A2858BotTotMts[0] ;
            n2858BotTotMts = P06AF4_n2858BotTotMts[0] ;
            if ( AV36ContLin > 41 )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            h6AF0( false, 60) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 64, Gx_line+8, 68, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2858BotTotMts, "ZZZZZZ9.99")), 210, Gx_line+8, 284, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2855CodBota), "ZZZZZ9")), 72, Gx_line+8, 117, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2856HorBota, "")), 371, Gx_line+8, 430, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A2857FecBota, "99/99/99"), 531, Gx_line+8, 590, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit0, "")), 480, Gx_line+8, 516, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit1, "")), 327, Gx_line+8, 356, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 361, Gx_line+8, 365, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 523, Gx_line+8, 527, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit10, "")), 802, Gx_line+38, 853, Gx_line+54, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit11, "")), 873, Gx_line+38, 899, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit12, "")), 941, Gx_line+38, 985, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit5, "")), 28, Gx_line+38, 92, Gx_line+54, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit6, "")), 415, Gx_line+38, 459, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit7, "")), 123, Gx_line+38, 181, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit8, "")), 620, Gx_line+38, 678, Gx_line+54, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit9, "")), 700, Gx_line+38, 744, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+55, 106, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(123, Gx_line+55, 400, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(546, Gx_line+55, 604, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(700, Gx_line+55, 795, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(873, Gx_line+55, 899, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(919, Gx_line+55, 985, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(415, Gx_line+55, 532, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit13, "")), 997, Gx_line+38, 1026, Gx_line+54, 1, 0, 0, 0) ;
            getPrinter().GxDrawLine(997, Gx_line+55, 1026, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(620, Gx_line+55, 678, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit14, "")), 546, Gx_line+38, 604, Gx_line+54, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit15, "")), 17, Gx_line+8, 56, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit12, "")), 141, Gx_line+8, 185, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 190, Gx_line+8, 194, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(802, Gx_line+55, 853, Gx_line+55, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+60) ;
            AV36ContLin = (byte)(AV36ContLin+5) ;
            /* Using cursor P06AF5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2855CodBota)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2859BotLin = P06AF5_A2859BotLin[0] ;
               A2871BotCliCod = P06AF5_A2871BotCliCod[0] ;
               n2871BotCliCod = P06AF5_n2871BotCliCod[0] ;
               A2863BotSer = P06AF5_A2863BotSer[0] ;
               n2863BotSer = P06AF5_n2863BotSer[0] ;
               A2868BotPml = P06AF5_A2868BotPml[0] ;
               n2868BotPml = P06AF5_n2868BotPml[0] ;
               A2867BotMts = P06AF5_A2867BotMts[0] ;
               n2867BotMts = P06AF5_n2867BotMts[0] ;
               A2865BotColNum = P06AF5_A2865BotColNum[0] ;
               n2865BotColNum = P06AF5_n2865BotColNum[0] ;
               A2864BotColNom = P06AF5_A2864BotColNom[0] ;
               n2864BotColNom = P06AF5_n2864BotColNom[0] ;
               A2861BotBarReo = P06AF5_A2861BotBarReo[0] ;
               n2861BotBarReo = P06AF5_n2861BotBarReo[0] ;
               A2862BotBarPar = P06AF5_A2862BotBarPar[0] ;
               n2862BotBarPar = P06AF5_n2862BotBarPar[0] ;
               A2860BotBarCod = P06AF5_A2860BotBarCod[0] ;
               n2860BotBarCod = P06AF5_n2860BotBarCod[0] ;
               A2866BotAnc = P06AF5_A2866BotAnc[0] ;
               n2866BotAnc = P06AF5_n2866BotAnc[0] ;
               AV18FlagRep = (byte)(1) ;
               AV37ImpLin = (byte)(0) ;
               /* Using cursor P06AF6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A2855CodBota), Short.valueOf(A2859BotLin)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A2869BotAlbRec = P06AF6_A2869BotAlbRec[0] ;
                  AV20AlbRecCod = A2869BotAlbRec ;
                  /* Execute user subroutine: 'FECALB' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(2);
                     pr_default.close(1);
                     pr_default.close(1);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV36ContLin > 46 )
                  {
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  if ( AV18FlagRep == 1 )
                  {
                     AV21BotCliCod = A2871BotCliCod ;
                     /* Execute user subroutine: 'NOMCLI' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(1);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     h6AF0( false, 16) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2866BotAnc), "ZZ9")), 875, Gx_line+0, 898, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2860BotBarCod), "ZZZZZZZ9")), 16, Gx_line+0, 75, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2862BotBarPar, "")), 96, Gx_line+0, 104, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2861BotBarReo), "9")), 81, Gx_line+0, 89, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2871BotCliCod), "ZZZZZ9")), 123, Gx_line+0, 168, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2864BotColNom, "")), 700, Gx_line+0, 796, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2865BotColNum), "ZZZZZ9")), 809, Gx_line+0, 854, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2867BotMts, "ZZZZZ9.99")), 919, Gx_line+0, 986, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2868BotPml), "ZZZ9")), 997, Gx_line+0, 1027, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2863BotSer, "")), 415, Gx_line+0, 533, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2869BotAlbRec), "ZZZZZZZ9")), 546, Gx_line+0, 605, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV19AlbRFen, "99/99/99"), 620, Gx_line+0, 679, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CliNom, "")), 181, Gx_line+0, 401, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                     AV18FlagRep = (byte)(0) ;
                     AV36ContLin = (byte)(AV36ContLin+1) ;
                     AV37ImpLin = (byte)(1) ;
                  }
                  else
                  {
                     h6AF0( false, 16) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2869BotAlbRec), "ZZZZZZZ9")), 546, Gx_line+0, 605, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV19AlbRFen, "99/99/99"), 620, Gx_line+0, 679, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                     AV36ContLin = (byte)(AV36ContLin+1) ;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               h6AF0( false, 9) ;
               getPrinter().GxDrawLine(15, Gx_line+4, 1026, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+9) ;
               AV36ContLin = (byte)(AV36ContLin+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV14PCodBota != AV15UCodBota )
            {
               if ( AV37ImpLin == 1 )
               {
                  h6AF0( false, 10) ;
                  getPrinter().GxDrawLine(0, Gx_line+5, 1042, Gx_line+5, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+10) ;
                  AV36ContLin = (byte)(AV36ContLin+1) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6AF0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'FECALB' Routine */
      returnInSub = false ;
      AV19AlbRFen = GXutil.nullDate() ;
      /* Using cursor P06AF7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV20AlbRecCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A44AlbRecCod = P06AF7_A44AlbRecCod[0] ;
         A49AlbRFen = P06AF7_A49AlbRFen[0] ;
         AV19AlbRFen = A49AlbRFen ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'NOMCLI' Routine */
      returnInSub = false ;
      AV22CliNom = "" ;
      /* Using cursor P06AF8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV21BotCliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P06AF8_A252CliCod[0] ;
         A279CliNom = P06AF8_A279CliNom[0] ;
         AV22CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h6AF0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8NomEmp, "")), 7, Gx_line+13, 226, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit0, "")), 777, Gx_line+13, 813, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 828, Gx_line+13, 887, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit1, "")), 911, Gx_line+13, 940, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 967, Gx_line+13, 1026, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 981, Gx_line+44, 1026, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit3, "")), 911, Gx_line+44, 955, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+66, 1042, Gx_line+66, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+4, 1042, Gx_line+4, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Pgmname, "")), 777, Gx_line+44, 835, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit4, "")), 7, Gx_line+44, 299, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 958, Gx_line+44, 962, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 958, Gx_line+13, 962, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 816, Gx_line+13, 820, Gx_line+29, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+73) ;
            AV36ContLin = (byte)(1) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = rlisbot.this.A396EmprCod;
      this.aP1[0] = rlisbot.this.AV14PCodBota;
      this.aP2[0] = rlisbot.this.AV15UCodBota;
      this.aP3[0] = rlisbot.this.AV16PTipBotCod;
      this.aP4[0] = rlisbot.this.AV17UTipBotCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Lit0 = "" ;
      AV10Lit1 = "" ;
      AV12Lit2 = "" ;
      AV11Lit3 = "" ;
      AV35Lit4 = "" ;
      AV27Lit5 = "" ;
      AV28Lit6 = "" ;
      AV29Lit7 = "" ;
      AV30Lit8 = "" ;
      AV31Lit9 = "" ;
      AV24Lit10 = "" ;
      AV25Lit11 = "" ;
      AV26Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit14 = "" ;
      AV34Lit15 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06AF2_A396EmprCod = new String[] {""} ;
      P06AF2_A407EmprNom = new String[] {""} ;
      P06AF2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8NomEmp = "" ;
      P06AF4_A396EmprCod = new String[] {""} ;
      P06AF4_A2855CodBota = new int[1] ;
      P06AF4_A2853TipBotCod = new byte[1] ;
      P06AF4_n2853TipBotCod = new boolean[] {false} ;
      P06AF4_A2857FecBota = new java.util.Date[] {GXutil.nullDate()} ;
      P06AF4_n2857FecBota = new boolean[] {false} ;
      P06AF4_A2856HorBota = new String[] {""} ;
      P06AF4_n2856HorBota = new boolean[] {false} ;
      P06AF4_A2858BotTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06AF4_n2858BotTotMts = new boolean[] {false} ;
      A2857FecBota = GXutil.nullDate() ;
      A2856HorBota = "" ;
      A2858BotTotMts = DecimalUtil.ZERO ;
      P06AF5_A396EmprCod = new String[] {""} ;
      P06AF5_A2855CodBota = new int[1] ;
      P06AF5_A2859BotLin = new short[1] ;
      P06AF5_A2871BotCliCod = new int[1] ;
      P06AF5_n2871BotCliCod = new boolean[] {false} ;
      P06AF5_A2863BotSer = new String[] {""} ;
      P06AF5_n2863BotSer = new boolean[] {false} ;
      P06AF5_A2868BotPml = new short[1] ;
      P06AF5_n2868BotPml = new boolean[] {false} ;
      P06AF5_A2867BotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06AF5_n2867BotMts = new boolean[] {false} ;
      P06AF5_A2865BotColNum = new int[1] ;
      P06AF5_n2865BotColNum = new boolean[] {false} ;
      P06AF5_A2864BotColNom = new String[] {""} ;
      P06AF5_n2864BotColNom = new boolean[] {false} ;
      P06AF5_A2861BotBarReo = new byte[1] ;
      P06AF5_n2861BotBarReo = new boolean[] {false} ;
      P06AF5_A2862BotBarPar = new String[] {""} ;
      P06AF5_n2862BotBarPar = new boolean[] {false} ;
      P06AF5_A2860BotBarCod = new int[1] ;
      P06AF5_n2860BotBarCod = new boolean[] {false} ;
      P06AF5_A2866BotAnc = new short[1] ;
      P06AF5_n2866BotAnc = new boolean[] {false} ;
      A2863BotSer = "" ;
      A2867BotMts = DecimalUtil.ZERO ;
      A2864BotColNom = "" ;
      A2862BotBarPar = "" ;
      P06AF6_A396EmprCod = new String[] {""} ;
      P06AF6_A2855CodBota = new int[1] ;
      P06AF6_A2859BotLin = new short[1] ;
      P06AF6_A2869BotAlbRec = new int[1] ;
      AV19AlbRFen = GXutil.nullDate() ;
      AV22CliNom = "" ;
      P06AF7_A396EmprCod = new String[] {""} ;
      P06AF7_A44AlbRecCod = new int[1] ;
      P06AF7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      A49AlbRFen = GXutil.nullDate() ;
      P06AF8_A396EmprCod = new String[] {""} ;
      P06AF8_A252CliCod = new int[1] ;
      P06AF8_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV44Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlisbot__default(),
         new Object[] {
             new Object[] {
            P06AF2_A396EmprCod, P06AF2_A407EmprNom, P06AF2_n407EmprNom
            }
            , new Object[] {
            P06AF4_A396EmprCod, P06AF4_A2855CodBota, P06AF4_A2853TipBotCod, P06AF4_n2853TipBotCod, P06AF4_A2857FecBota, P06AF4_n2857FecBota, P06AF4_A2856HorBota, P06AF4_n2856HorBota, P06AF4_A2858BotTotMts, P06AF4_n2858BotTotMts
            }
            , new Object[] {
            P06AF5_A396EmprCod, P06AF5_A2855CodBota, P06AF5_A2859BotLin, P06AF5_A2871BotCliCod, P06AF5_n2871BotCliCod, P06AF5_A2863BotSer, P06AF5_n2863BotSer, P06AF5_A2868BotPml, P06AF5_n2868BotPml, P06AF5_A2867BotMts,
            P06AF5_n2867BotMts, P06AF5_A2865BotColNum, P06AF5_n2865BotColNum, P06AF5_A2864BotColNom, P06AF5_n2864BotColNom, P06AF5_A2861BotBarReo, P06AF5_n2861BotBarReo, P06AF5_A2862BotBarPar, P06AF5_n2862BotBarPar, P06AF5_A2860BotBarCod,
            P06AF5_n2860BotBarCod, P06AF5_A2866BotAnc, P06AF5_n2866BotAnc
            }
            , new Object[] {
            P06AF6_A396EmprCod, P06AF6_A2855CodBota, P06AF6_A2859BotLin, P06AF6_A2869BotAlbRec
            }
            , new Object[] {
            P06AF7_A396EmprCod, P06AF7_A44AlbRecCod, P06AF7_A49AlbRFen
            }
            , new Object[] {
            P06AF8_A396EmprCod, P06AF8_A252CliCod, P06AF8_A279CliNom
            }
         }
      );
      AV44Pgmname = "RLISBOT" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV44Pgmname = "RLISBOT" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV16PTipBotCod ;
   private byte AV17UTipBotCod ;
   private byte AV36ContLin ;
   private byte A2853TipBotCod ;
   private byte A2861BotBarReo ;
   private byte AV18FlagRep ;
   private byte AV37ImpLin ;
   private short A2859BotLin ;
   private short A2868BotPml ;
   private short A2866BotAnc ;
   private short Gx_err ;
   private int AV14PCodBota ;
   private int AV15UCodBota ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A2855CodBota ;
   private int Gx_OldLine ;
   private int A2871BotCliCod ;
   private int A2865BotColNum ;
   private int A2860BotBarCod ;
   private int A2869BotAlbRec ;
   private int AV20AlbRecCod ;
   private int AV21BotCliCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private java.math.BigDecimal A2858BotTotMts ;
   private java.math.BigDecimal A2867BotMts ;
   private String A396EmprCod ;
   private String AV9Lit0 ;
   private String AV10Lit1 ;
   private String AV12Lit2 ;
   private String AV11Lit3 ;
   private String AV35Lit4 ;
   private String AV27Lit5 ;
   private String AV28Lit6 ;
   private String AV29Lit7 ;
   private String AV30Lit8 ;
   private String AV31Lit9 ;
   private String AV24Lit10 ;
   private String AV25Lit11 ;
   private String AV26Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit14 ;
   private String AV34Lit15 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8NomEmp ;
   private String A2856HorBota ;
   private String A2863BotSer ;
   private String A2864BotColNom ;
   private String A2862BotBarPar ;
   private String AV22CliNom ;
   private String A279CliNom ;
   private String Gx_time ;
   private String AV44Pgmname ;
   private java.util.Date A2857FecBota ;
   private java.util.Date AV19AlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n2853TipBotCod ;
   private boolean n2857FecBota ;
   private boolean n2856HorBota ;
   private boolean n2858BotTotMts ;
   private boolean n2871BotCliCod ;
   private boolean n2863BotSer ;
   private boolean n2868BotPml ;
   private boolean n2867BotMts ;
   private boolean n2865BotColNum ;
   private boolean n2864BotColNom ;
   private boolean n2861BotBarReo ;
   private boolean n2862BotBarPar ;
   private boolean n2860BotBarCod ;
   private boolean n2866BotAnc ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06AF2_A396EmprCod ;
   private String[] P06AF2_A407EmprNom ;
   private boolean[] P06AF2_n407EmprNom ;
   private String[] P06AF4_A396EmprCod ;
   private int[] P06AF4_A2855CodBota ;
   private byte[] P06AF4_A2853TipBotCod ;
   private boolean[] P06AF4_n2853TipBotCod ;
   private java.util.Date[] P06AF4_A2857FecBota ;
   private boolean[] P06AF4_n2857FecBota ;
   private String[] P06AF4_A2856HorBota ;
   private boolean[] P06AF4_n2856HorBota ;
   private java.math.BigDecimal[] P06AF4_A2858BotTotMts ;
   private boolean[] P06AF4_n2858BotTotMts ;
   private String[] P06AF5_A396EmprCod ;
   private int[] P06AF5_A2855CodBota ;
   private short[] P06AF5_A2859BotLin ;
   private int[] P06AF5_A2871BotCliCod ;
   private boolean[] P06AF5_n2871BotCliCod ;
   private String[] P06AF5_A2863BotSer ;
   private boolean[] P06AF5_n2863BotSer ;
   private short[] P06AF5_A2868BotPml ;
   private boolean[] P06AF5_n2868BotPml ;
   private java.math.BigDecimal[] P06AF5_A2867BotMts ;
   private boolean[] P06AF5_n2867BotMts ;
   private int[] P06AF5_A2865BotColNum ;
   private boolean[] P06AF5_n2865BotColNum ;
   private String[] P06AF5_A2864BotColNom ;
   private boolean[] P06AF5_n2864BotColNom ;
   private byte[] P06AF5_A2861BotBarReo ;
   private boolean[] P06AF5_n2861BotBarReo ;
   private String[] P06AF5_A2862BotBarPar ;
   private boolean[] P06AF5_n2862BotBarPar ;
   private int[] P06AF5_A2860BotBarCod ;
   private boolean[] P06AF5_n2860BotBarCod ;
   private short[] P06AF5_A2866BotAnc ;
   private boolean[] P06AF5_n2866BotAnc ;
   private String[] P06AF6_A396EmprCod ;
   private int[] P06AF6_A2855CodBota ;
   private short[] P06AF6_A2859BotLin ;
   private int[] P06AF6_A2869BotAlbRec ;
   private String[] P06AF7_A396EmprCod ;
   private int[] P06AF7_A44AlbRecCod ;
   private java.util.Date[] P06AF7_A49AlbRFen ;
   private String[] P06AF8_A396EmprCod ;
   private int[] P06AF8_A252CliCod ;
   private String[] P06AF8_A279CliNom ;
}

final  class rlisbot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06AF2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06AF4", "SELECT T1.EmprCod, T1.CodBota, T1.TipBotCod, T1.FecBota, T1.HorBota, COALESCE( T2.BotTotMts, 0) AS BotTotMts FROM (TXPCBOTAS T1 LEFT JOIN (SELECT SUM(BotMts) AS BotTotMts, EmprCod, CodBota FROM TXPLBOTAS GROUP BY EmprCod, CodBota ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CodBota = T1.CodBota) WHERE (T1.EmprCod = ? and T1.CodBota >= ?) AND (T1.TipBotCod >= ?) AND (T1.TipBotCod <= ?) AND (T1.CodBota <= ?) ORDER BY T1.EmprCod, T1.CodBota ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06AF5", "SELECT EmprCod, CodBota, BotLin, BotCliCod, BotSer, BotPml, BotMts, BotColNum, BotColNom, BotBarReo, BotBarPar, BotBarCod, BotAnc FROM TXPLBOTAS WHERE EmprCod = ? and CodBota = ? ORDER BY EmprCod, CodBota, BotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06AF6", "SELECT EmprCod, CodBota, BotLin, BotAlbRec FROM TXPBOTALB WHERE EmprCod = ? and CodBota = ? and BotLin = ? ORDER BY EmprCod, CodBota, BotLin, BotAlbRec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06AF7", "SELECT EmprCod, AlbRecCod, AlbRFen FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06AF8", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

