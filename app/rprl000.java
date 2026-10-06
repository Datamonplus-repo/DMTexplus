package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rprl000 extends GXReport
{
   public rprl000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rprl000.class ), "" );
   }

   public rprl000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          java.util.Date[] aP1 ,
                          java.util.Date[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 )
   {
      rprl000.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 )
   {
      rprl000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rprl000.this.AV8PFecha = aP1[0];
      this.aP1 = aP1;
      rprl000.this.AV9UFecha = aP2[0];
      this.aP2 = aP2;
      rprl000.this.AV10PMaqCod = aP3[0];
      this.aP3 = aP3;
      rprl000.this.AV11UMaqCod = aP4[0];
      this.aP4 = aP4;
      rprl000.this.AV12POpeCod = aP5[0];
      this.aP5 = aP5;
      rprl000.this.AV13UOpeCod = aP6[0];
      this.aP6 = aP6;
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
         getPrinter().GxSetDocName("INFORME PRODUCCION") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV25Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV56Pgmname, (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit1 = GXt_char1 ;
         GXt_char1 = AV32Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit2 = GXt_char1 ;
         GXt_char1 = AV33Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3022_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit3 = GXt_char1 ;
         GXt_char1 = AV34Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit4 = GXt_char1 ;
         GXt_char1 = AV35Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit5 = GXt_char1 ;
         GXt_char1 = AV36Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit6 = GXt_char1 ;
         GXt_char1 = AV37Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit7 = GXt_char1 ;
         GXt_char1 = AV38Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2203_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit8 = GXt_char1 ;
         GXt_char1 = AV39Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN469_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit9 = GXt_char1 ;
         GXt_char1 = AV26Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit10 = GXt_char1 ;
         GXt_char1 = AV27Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit11 = GXt_char1 ;
         AV28Lit12 = GXutil.trim( AV26Lit10) + "-" + GXutil.trim( AV27Lit11) ;
         GXt_char1 = AV29Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit13 = GXt_char1 ;
         GXt_char1 = AV30Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit14 = GXt_char1 ;
         AV31Lit15 = GXutil.trim( AV29Lit13) + "-" + GXutil.trim( AV30Lit14) ;
         GXt_char1 = AV40Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit16 = GXt_char1 ;
         GXt_char1 = AV48Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1304_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit17 = GXt_char1 ;
         GXt_char1 = AV49Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rprl000.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit18 = GXt_char1 ;
         /* Using cursor P06RW2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06RW2_A407EmprNom[0] ;
            n407EmprNom = P06RW2_n407EmprNom[0] ;
            AV24EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV23Tot_g_k = DecimalUtil.doubleToDec(0) ;
         AV51Tot_p_t = 0 ;
         /* Using cursor P06RW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10PMaqCod, AV8PFecha, AV9UFecha, Integer.valueOf(AV12POpeCod), Integer.valueOf(AV13UOpeCod), AV11UMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6RW4 = false ;
            A503GruOpeCod = P06RW3_A503GruOpeCod[0] ;
            A558HisProFec = P06RW3_A558HisProFec[0] ;
            A130BarCodPar = P06RW3_A130BarCodPar[0] ;
            A132BarCodReo = P06RW3_A132BarCodReo[0] ;
            A129BarCod = P06RW3_A129BarCod[0] ;
            A4704HisProNPar = P06RW3_A4704HisProNPar[0] ;
            A461Fase = P06RW3_A461Fase[0] ;
            A1652BarSerDsc = P06RW3_A1652BarSerDsc[0] ;
            A602MaqCod = P06RW3_A602MaqCod[0] ;
            A4441HisProDTF = P06RW3_A4441HisProDTF[0] ;
            n4441HisProDTF = P06RW3_n4441HisProDTF[0] ;
            A4440HisProDTI = P06RW3_A4440HisProDTI[0] ;
            n4440HisProDTI = P06RW3_n4440HisProDTI[0] ;
            A656ParCod = P06RW3_A656ParCod[0] ;
            n656ParCod = P06RW3_n656ParCod[0] ;
            A5522HisProDR = P06RW3_A5522HisProDR[0] ;
            A4714HisProNpzs = P06RW3_A4714HisProNpzs[0] ;
            A1525HisProKgr = P06RW3_A1525HisProKgr[0] ;
            A867ParCodNom = P06RW3_A867ParCodNom[0] ;
            n867ParCodNom = P06RW3_n867ParCodNom[0] ;
            A561HisProLin = P06RW3_A561HisProLin[0] ;
            A1652BarSerDsc = P06RW3_A1652BarSerDsc[0] ;
            A867ParCodNom = P06RW3_A867ParCodNom[0] ;
            n867ParCodNom = P06RW3_n867ParCodNom[0] ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = A602MaqCod ;
            GXv_char4[0] = AV18Maqdsc ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
            rprl000.this.A396EmprCod = GXv_char2[0] ;
            rprl000.this.A602MaqCod = GXv_char3[0] ;
            rprl000.this.AV18Maqdsc = GXv_char4[0] ;
            AV20Flag_maq = (byte)(0) ;
            AV21Tot_m_k = DecimalUtil.doubleToDec(0) ;
            AV50Tot_pzs = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06RW3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06RW3_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk6RW4 = false ;
               A503GruOpeCod = P06RW3_A503GruOpeCod[0] ;
               A558HisProFec = P06RW3_A558HisProFec[0] ;
               A130BarCodPar = P06RW3_A130BarCodPar[0] ;
               A132BarCodReo = P06RW3_A132BarCodReo[0] ;
               A129BarCod = P06RW3_A129BarCod[0] ;
               A4704HisProNPar = P06RW3_A4704HisProNPar[0] ;
               A461Fase = P06RW3_A461Fase[0] ;
               A1652BarSerDsc = P06RW3_A1652BarSerDsc[0] ;
               A4441HisProDTF = P06RW3_A4441HisProDTF[0] ;
               n4441HisProDTF = P06RW3_n4441HisProDTF[0] ;
               A4440HisProDTI = P06RW3_A4440HisProDTI[0] ;
               n4440HisProDTI = P06RW3_n4440HisProDTI[0] ;
               A656ParCod = P06RW3_A656ParCod[0] ;
               n656ParCod = P06RW3_n656ParCod[0] ;
               A5522HisProDR = P06RW3_A5522HisProDR[0] ;
               A4714HisProNpzs = P06RW3_A4714HisProNpzs[0] ;
               A1525HisProKgr = P06RW3_A1525HisProKgr[0] ;
               A867ParCodNom = P06RW3_A867ParCodNom[0] ;
               n867ParCodNom = P06RW3_n867ParCodNom[0] ;
               A561HisProLin = P06RW3_A561HisProLin[0] ;
               A1652BarSerDsc = P06RW3_A1652BarSerDsc[0] ;
               A867ParCodNom = P06RW3_A867ParCodNom[0] ;
               n867ParCodNom = P06RW3_n867ParCodNom[0] ;
               if ( (( GXutil.resetTime(A558HisProFec).before( GXutil.resetTime( AV9UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(AV9UFecha)) )) )
               {
                  if ( (( GXutil.resetTime(A558HisProFec).after( GXutil.resetTime( AV8PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(AV8PFecha)) )) )
                  {
                     if ( ( A503GruOpeCod >= AV12POpeCod ) && ( A503GruOpeCod <= AV13UOpeCod ) )
                     {
                        AV14Hdr = GXutil.ltrim( GXutil.str( A129BarCod, 8, 0)) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                        AV15Num_pda = (short)(A4704HisProNPar) ;
                        /* Using cursor P06RW4 */
                        pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
                        while ( (pr_default.getStatus(2) != 101) )
                        {
                           A652OpeCod = P06RW4_A652OpeCod[0] ;
                           A653OpeNom = P06RW4_A653OpeNom[0] ;
                           n653OpeNom = P06RW4_n653OpeNom[0] ;
                           AV16OpeNom = GXutil.substring( A653OpeNom, 1, 26) ;
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(2);
                        GXv_char4[0] = AV17FasDsc ;
                        new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char4) ;
                        rprl000.this.AV17FasDsc = GXv_char4[0] ;
                        AV19SerDsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
                        if ( AV20Flag_maq == 0 )
                        {
                           h6RW0( false, 29) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Maqdsc, "")), 125, Gx_line+0, 243, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 76, Gx_line+1, 121, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 13, Gx_line+1, 62, Gx_line+16, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+29) ;
                           AV20Flag_maq = (byte)(1) ;
                        }
                        AV41Tot_seg = 0 ;
                        AV42Tot_hhmm = DecimalUtil.doubleToDec(0) ;
                        AV47Hh_mm = GXutil.space( (short)(7)) ;
                        if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) )
                        {
                           AV41Tot_seg = (int)(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)) ;
                           AV43Tot_mm = (int)(AV41Tot_seg/ (double) (60)) ;
                           AV44Hh_1 = (short)(AV43Tot_mm/ (double) (60)) ;
                           AV45Hh_2 = (short)(GXutil.Int( AV44Hh_1)) ;
                           AV46Mm_1 = (byte)(AV43Tot_mm-(AV45Hh_2*60)) ;
                           AV47Hh_mm = GXutil.trim( GXutil.str( AV45Hh_2, 4, 0)) + ":" + GXutil.trim( GXutil.str( AV46Mm_1, 2, 0)) ;
                        }
                        AV53FechaFf = "" ;
                        AV52FechaHi = "" ;
                        if ( ! GXutil.dateCompare(GXutil.nullDate(), A4440HisProDTI) )
                        {
                           AV52FechaHi = localUtil.ttoc( A4440HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                        }
                        if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) )
                        {
                           AV53FechaFf = localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                        }
                        if ( (0==A656ParCod) )
                        {
                           h6RW0( false, 15) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16OpeNom, "")), 13, Gx_line+0, 204, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Hdr, "")), 214, Gx_line+0, 295, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Num_pda), "ZZZ9")), 316, Gx_line+0, 346, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17FasDsc, "")), 375, Gx_line+0, 522, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19SerDsc, "")), 528, Gx_line+0, 675, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52FechaHi, "")), 807, Gx_line+0, 939, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53FechaFf, "")), 945, Gx_line+0, 1077, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")), 732, Gx_line+0, 799, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Hh_mm, "")), 1081, Gx_line+0, 1132, Gx_line+15, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9")), 681, Gx_line+0, 711, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5522HisProDR, "")), 354, Gx_line+0, 365, Gx_line+16, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+15) ;
                        }
                        else
                        {
                           h6RW0( false, 16) ;
                           getPrinter().GxAttris("Courier New", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52FechaHi, "")), 807, Gx_line+0, 939, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53FechaFf, "")), 945, Gx_line+0, 1077, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A867ParCodNom, "")), 375, Gx_line+1, 595, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Hh_mm, "")), 1081, Gx_line+0, 1132, Gx_line+15, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+16) ;
                        }
                        AV21Tot_m_k = AV21Tot_m_k.add(A1525HisProKgr) ;
                        AV23Tot_g_k = AV23Tot_g_k.add(A1525HisProKgr) ;
                        AV51Tot_p_t = (int)(AV51Tot_p_t+A4714HisProNpzs) ;
                        AV50Tot_pzs = (int)(AV50Tot_pzs+A4714HisProNpzs) ;
                     }
                  }
               }
               brk6RW4 = true ;
               pr_default.readNext(1);
            }
            if ( ( AV50Tot_pzs > 0 ) || ( AV21Tot_m_k.doubleValue() > 0 ) )
            {
               h6RW0( false, 16) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Tot_m_k, "ZZZ,ZZ9.99")), 725, Gx_line+1, 799, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Maquina", ""), 560, Gx_line+0, 639, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50Tot_pzs), "ZZZZZZZ9")), 652, Gx_line+1, 711, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
            }
            if ( ! brk6RW4 )
            {
               brk6RW4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         if ( ( AV23Tot_g_k.doubleValue() > 0 ) || ( AV51Tot_p_t > 0 ) )
         {
            h6RW0( false, 16) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23Tot_g_k, "ZZZ,ZZ9.99")), 725, Gx_line+0, 799, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total Informe", ""), 563, Gx_line+1, 640, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51Tot_p_t), "ZZZZZZZ9")), 652, Gx_line+1, 711, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+16) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6RW0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6RW0( boolean bFoot ,
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
            getPrinter().GxDrawLine(10, Gx_line+101, 1134, Gx_line+101, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24EmprNom, "")), 10, Gx_line+10, 230, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 1010, Gx_line+43, 1035, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1046, Gx_line+43, 1085, Gx_line+59, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+66, 1134, Gx_line+66, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit1, "")), 11, Gx_line+41, 304, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 1022, Gx_line+13, 1067, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit16, "")), 961, Gx_line+13, 1014, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit2, "")), 13, Gx_line+83, 66, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit3, "")), 214, Gx_line+83, 267, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit4, "")), 272, Gx_line+83, 346, Gx_line+99, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit5, "")), 375, Gx_line+83, 428, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit6, "")), 528, Gx_line+83, 581, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit7, "")), 746, Gx_line+83, 799, Gx_line+99, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit8, "")), 842, Gx_line+83, 906, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit9, "")), 995, Gx_line+83, 1027, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit17, "")), 444, Gx_line+45, 497, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV8PFecha, "99/99/99"), 519, Gx_line+44, 564, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV9UFecha, "99/99/99"), 588, Gx_line+44, 633, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 573, Gx_line+44, 578, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 744, Gx_line+16, 771, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 785, Gx_line+16, 869, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit18, "")), 688, Gx_line+83, 721, Gx_line+98, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+110) ;
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
      this.aP0[0] = rprl000.this.A396EmprCod;
      this.aP1[0] = rprl000.this.AV8PFecha;
      this.aP2[0] = rprl000.this.AV9UFecha;
      this.aP3[0] = rprl000.this.AV10PMaqCod;
      this.aP4[0] = rprl000.this.AV11UMaqCod;
      this.aP5[0] = rprl000.this.AV12POpeCod;
      this.aP6[0] = rprl000.this.AV13UOpeCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Lit1 = "" ;
      AV56Pgmname = "" ;
      AV32Lit2 = "" ;
      AV33Lit3 = "" ;
      AV34Lit4 = "" ;
      AV35Lit5 = "" ;
      AV36Lit6 = "" ;
      AV37Lit7 = "" ;
      AV38Lit8 = "" ;
      AV39Lit9 = "" ;
      AV26Lit10 = "" ;
      AV27Lit11 = "" ;
      AV28Lit12 = "" ;
      AV29Lit13 = "" ;
      AV30Lit14 = "" ;
      AV31Lit15 = "" ;
      AV40Lit16 = "" ;
      AV48Lit17 = "" ;
      AV49Lit18 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P06RW2_A396EmprCod = new String[] {""} ;
      P06RW2_A407EmprNom = new String[] {""} ;
      P06RW2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24EmprNom = "" ;
      AV23Tot_g_k = DecimalUtil.ZERO ;
      P06RW3_A396EmprCod = new String[] {""} ;
      P06RW3_A503GruOpeCod = new int[1] ;
      P06RW3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06RW3_A130BarCodPar = new String[] {""} ;
      P06RW3_A132BarCodReo = new byte[1] ;
      P06RW3_A129BarCod = new int[1] ;
      P06RW3_A4704HisProNPar = new int[1] ;
      P06RW3_A461Fase = new String[] {""} ;
      P06RW3_A1652BarSerDsc = new String[] {""} ;
      P06RW3_A602MaqCod = new String[] {""} ;
      P06RW3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P06RW3_n4441HisProDTF = new boolean[] {false} ;
      P06RW3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P06RW3_n4440HisProDTI = new boolean[] {false} ;
      P06RW3_A656ParCod = new short[1] ;
      P06RW3_n656ParCod = new boolean[] {false} ;
      P06RW3_A5522HisProDR = new String[] {""} ;
      P06RW3_A4714HisProNpzs = new short[1] ;
      P06RW3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RW3_A867ParCodNom = new String[] {""} ;
      P06RW3_n867ParCodNom = new boolean[] {false} ;
      P06RW3_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A461Fase = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A5522HisProDR = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV18Maqdsc = "" ;
      AV21Tot_m_k = DecimalUtil.ZERO ;
      AV14Hdr = "" ;
      P06RW4_A396EmprCod = new String[] {""} ;
      P06RW4_A652OpeCod = new int[1] ;
      P06RW4_A653OpeNom = new String[] {""} ;
      P06RW4_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV16OpeNom = "" ;
      AV17FasDsc = "" ;
      GXv_char4 = new String[1] ;
      AV19SerDsc = "" ;
      AV42Tot_hhmm = DecimalUtil.ZERO ;
      AV47Hh_mm = "" ;
      AV53FechaFf = "" ;
      AV52FechaHi = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprl000__default(),
         new Object[] {
             new Object[] {
            P06RW2_A396EmprCod, P06RW2_A407EmprNom, P06RW2_n407EmprNom
            }
            , new Object[] {
            P06RW3_A396EmprCod, P06RW3_A503GruOpeCod, P06RW3_A558HisProFec, P06RW3_A130BarCodPar, P06RW3_A132BarCodReo, P06RW3_A129BarCod, P06RW3_A4704HisProNPar, P06RW3_A461Fase, P06RW3_A1652BarSerDsc, P06RW3_A602MaqCod,
            P06RW3_A4441HisProDTF, P06RW3_n4441HisProDTF, P06RW3_A4440HisProDTI, P06RW3_n4440HisProDTI, P06RW3_A656ParCod, P06RW3_n656ParCod, P06RW3_A5522HisProDR, P06RW3_A4714HisProNpzs, P06RW3_A1525HisProKgr, P06RW3_A867ParCodNom,
            P06RW3_n867ParCodNom, P06RW3_A561HisProLin
            }
            , new Object[] {
            P06RW4_A396EmprCod, P06RW4_A652OpeCod, P06RW4_A653OpeNom, P06RW4_n653OpeNom
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmname = "RPRL000" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmname = "RPRL000" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV20Flag_maq ;
   private byte AV46Mm_1 ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short AV15Num_pda ;
   private short AV44Hh_1 ;
   private short AV45Hh_2 ;
   private short Gx_err ;
   private int AV12POpeCod ;
   private int AV13UOpeCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV51Tot_p_t ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A4704HisProNPar ;
   private int A561HisProLin ;
   private int AV50Tot_pzs ;
   private int A652OpeCod ;
   private int Gx_OldLine ;
   private int AV41Tot_seg ;
   private int AV43Tot_mm ;
   private java.math.BigDecimal AV23Tot_g_k ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV21Tot_m_k ;
   private java.math.BigDecimal AV42Tot_hhmm ;
   private String A396EmprCod ;
   private String AV10PMaqCod ;
   private String AV11UMaqCod ;
   private String AV25Lit1 ;
   private String AV56Pgmname ;
   private String AV32Lit2 ;
   private String AV33Lit3 ;
   private String AV34Lit4 ;
   private String AV35Lit5 ;
   private String AV36Lit6 ;
   private String AV37Lit7 ;
   private String AV38Lit8 ;
   private String AV39Lit9 ;
   private String AV26Lit10 ;
   private String AV27Lit11 ;
   private String AV28Lit12 ;
   private String AV29Lit13 ;
   private String AV30Lit14 ;
   private String AV31Lit15 ;
   private String AV40Lit16 ;
   private String AV48Lit17 ;
   private String AV49Lit18 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24EmprNom ;
   private String A130BarCodPar ;
   private String A461Fase ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String A5522HisProDR ;
   private String A867ParCodNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV18Maqdsc ;
   private String AV14Hdr ;
   private String A653OpeNom ;
   private String AV16OpeNom ;
   private String AV17FasDsc ;
   private String GXv_char4[] ;
   private String AV19SerDsc ;
   private String AV47Hh_mm ;
   private String AV53FechaFf ;
   private String AV52FechaHi ;
   private String Gx_time ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV8PFecha ;
   private java.util.Date AV9UFecha ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean brk6RW4 ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n653OpeNom ;
   private int[] aP6 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P06RW2_A396EmprCod ;
   private String[] P06RW2_A407EmprNom ;
   private boolean[] P06RW2_n407EmprNom ;
   private String[] P06RW3_A396EmprCod ;
   private int[] P06RW3_A503GruOpeCod ;
   private java.util.Date[] P06RW3_A558HisProFec ;
   private String[] P06RW3_A130BarCodPar ;
   private byte[] P06RW3_A132BarCodReo ;
   private int[] P06RW3_A129BarCod ;
   private int[] P06RW3_A4704HisProNPar ;
   private String[] P06RW3_A461Fase ;
   private String[] P06RW3_A1652BarSerDsc ;
   private String[] P06RW3_A602MaqCod ;
   private java.util.Date[] P06RW3_A4441HisProDTF ;
   private boolean[] P06RW3_n4441HisProDTF ;
   private java.util.Date[] P06RW3_A4440HisProDTI ;
   private boolean[] P06RW3_n4440HisProDTI ;
   private short[] P06RW3_A656ParCod ;
   private boolean[] P06RW3_n656ParCod ;
   private String[] P06RW3_A5522HisProDR ;
   private short[] P06RW3_A4714HisProNpzs ;
   private java.math.BigDecimal[] P06RW3_A1525HisProKgr ;
   private String[] P06RW3_A867ParCodNom ;
   private boolean[] P06RW3_n867ParCodNom ;
   private int[] P06RW3_A561HisProLin ;
   private String[] P06RW4_A396EmprCod ;
   private int[] P06RW4_A652OpeCod ;
   private String[] P06RW4_A653OpeNom ;
   private boolean[] P06RW4_n653OpeNom ;
}

final  class rprl000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06RW2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06RW3", "SELECT T1.EmprCod, T1.GruOpeCod, T1.HisProFec, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProNPar, T1.Fase, T2.BarSerDsc, T1.MaqCod, T1.HisProDTF, T1.HisProDTI, T1.ParCod, T1.HisProDR, T1.HisProNpzs, T1.HisProKgr, T3.ParCodNom, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ? and T1.HisProFec >= ?) AND (T1.HisProFec <= ?) AND (T1.GruOpeCod >= ? and T1.GruOpeCod <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06RW4", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

