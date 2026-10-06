package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pprc226 extends GXReport
{
   public pprc226( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc226.class ), "" );
   }

   public pprc226( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pprc226.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pprc226.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc226.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Informe Gesinlab Opciones") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV21Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         pprc226.this.AV21Contdsc = GXv_char1[0] ;
         /* Using cursor P05UV2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05UV2_A407EmprNom[0] ;
            n407EmprNom = P05UV2_n407EmprNom[0] ;
            AV22EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV29Nopciones = (short)(0) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV44Tab_opciones[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV25i = (short)(1) ;
         /* Using cursor P05UV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5718Lb_numop = P05UV3_A5718Lb_numop[0] ;
            A5555Lb_opcion = P05UV3_A5555Lb_opcion[0] ;
            AV29Nopciones = (short)(AV29Nopciones+1) ;
            AV44Tab_opciones[AV25i-1] = GXutil.str( A5718Lb_numop, 2, 0) ;
            AV25i = (short)(AV25i+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV31Op1 = AV44Tab_opciones[1-1] ;
         AV32Op2 = AV44Tab_opciones[2-1] ;
         AV33Op3 = AV44Tab_opciones[3-1] ;
         AV34Op4 = AV44Tab_opciones[4-1] ;
         AV35Op5 = AV44Tab_opciones[5-1] ;
         AV36Op6 = AV44Tab_opciones[6-1] ;
         AV37Op7 = AV44Tab_opciones[7-1] ;
         AV38Op8 = AV44Tab_opciones[8-1] ;
         AV39Op9 = AV44Tab_opciones[9-1] ;
         AV60Temperaturas = "" ;
         GxHdr4 = true ;
         /* Using cursor P05UV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5548Lb_Obs = P05UV4_A5548Lb_Obs[0] ;
            A831TipColCod = P05UV4_A831TipColCod[0] ;
            n831TipColCod = P05UV4_n831TipColCod[0] ;
            A13299Lb_PquiID = P05UV4_A13299Lb_PquiID[0] ;
            n13299Lb_PquiID = P05UV4_n13299Lb_PquiID[0] ;
            A5601Lb_Tempt = P05UV4_A5601Lb_Tempt[0] ;
            A5610Lb_Temp2 = P05UV4_A5610Lb_Temp2[0] ;
            A5611Lb_Temp3 = P05UV4_A5611Lb_Temp3[0] ;
            A6546Lb_Pantone = P05UV4_A6546Lb_Pantone[0] ;
            A13300Lb_PquiDsc = P05UV4_A13300Lb_PquiDsc[0] ;
            n13300Lb_PquiDsc = P05UV4_n13300Lb_PquiDsc[0] ;
            A832TipColDsc = P05UV4_A832TipColDsc[0] ;
            n832TipColDsc = P05UV4_n832TipColDsc[0] ;
            A5700Lb_Talao = P05UV4_A5700Lb_Talao[0] ;
            A5534Lb_ArtDsc = P05UV4_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P05UV4_A5533Lb_ArtCod[0] ;
            A5536Lb_ColNom = P05UV4_A5536Lb_ColNom[0] ;
            A5540Lb_Cartaz = P05UV4_A5540Lb_Cartaz[0] ;
            A279CliNom = P05UV4_A279CliNom[0] ;
            A252CliCod = P05UV4_A252CliCod[0] ;
            A5538Lb_ColNomC = P05UV4_A5538Lb_ColNomC[0] ;
            A279CliNom = P05UV4_A279CliNom[0] ;
            A832TipColDsc = P05UV4_A832TipColDsc[0] ;
            n832TipColDsc = P05UV4_n832TipColDsc[0] ;
            A13300Lb_PquiDsc = P05UV4_A13300Lb_PquiDsc[0] ;
            n13300Lb_PquiDsc = P05UV4_n13300Lb_PquiDsc[0] ;
            if ( A5601Lb_Tempt > 0 )
            {
               AV60Temperaturas = GXutil.str( A5601Lb_Tempt, 4, 0) + httpContext.getMessage( " ºC ", "") ;
            }
            if ( A5610Lb_Temp2 > 0 )
            {
               AV60Temperaturas += ((GXutil.strcmp("", AV60Temperaturas)==0) ? GXutil.str( A5610Lb_Temp2, 4, 0)+httpContext.getMessage( " ºC ", "") : " / "+GXutil.str( A5610Lb_Temp2, 4, 0)+httpContext.getMessage( " ºC ", "")) ;
            }
            if ( A5611Lb_Temp3 > 0 )
            {
               AV60Temperaturas += ((GXutil.strcmp("", AV60Temperaturas)==0) ? GXutil.str( A5611Lb_Temp3, 4, 0)+httpContext.getMessage( " ºC ", "") : " / "+GXutil.str( A5611Lb_Temp3, 4, 0)+httpContext.getMessage( " ºC ", "")) ;
            }
            AV28Lb_pantone = GXutil.trim( A6546Lb_Pantone) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         AV25i = (short)(1) ;
         AV42t = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV45tab_productos[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P05UV5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A719PrdNum = P05UV5_A719PrdNum[0] ;
            A5557Lb_LineaC = P05UV5_A5557Lb_LineaC[0] ;
            A5555Lb_opcion = P05UV5_A5555Lb_opcion[0] ;
            AV41Prdnum = A719PrdNum ;
            /* Execute user subroutine: 'TABLA1' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05UV6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A719PrdNum = P05UV6_A719PrdNum[0] ;
            A5560Lb_LineaPr = P05UV6_A5560Lb_LineaPr[0] ;
            A5555Lb_opcion = P05UV6_A5555Lb_opcion[0] ;
            AV41Prdnum = A719PrdNum ;
            /* Execute user subroutine: 'TABLA1' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV59Colorantes = (short)(0) ;
         AV25i = (short)(1) ;
         while ( AV25i <= 100 )
         {
            if ( GXutil.strcmp(AV45tab_productos[AV25i-1], " ") == 0 )
            {
               if (true) break;
            }
            AV41Prdnum = AV45tab_productos[AV25i-1] ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV43Tab_cant[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV46Tab_und[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV42t = (short)(1) ;
            AV23ens003 = (byte)(0) ;
            /* Using cursor P05UV7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV41Prdnum});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A490ForPrdUMe = P05UV7_A490ForPrdUMe[0] ;
               A719PrdNum = P05UV7_A719PrdNum[0] ;
               A5558LB_CantC = P05UV7_A5558LB_CantC[0] ;
               A5718Lb_numop = P05UV7_A5718Lb_numop[0] ;
               A488ForPrdDsc = P05UV7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05UV7_n488ForPrdDsc[0] ;
               A5557Lb_LineaC = P05UV7_A5557Lb_LineaC[0] ;
               A5555Lb_opcion = P05UV7_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P05UV7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05UV7_n488ForPrdDsc[0] ;
               A5718Lb_numop = P05UV7_A5718Lb_numop[0] ;
               AV43Tab_cant[A5718Lb_numop-1] = A5558LB_CantC ;
               AV46Tab_und[A5718Lb_numop-1] = GXutil.substring( A488ForPrdDsc, 1, 3) ;
               AV58ForPrdDsc = A488ForPrdDsc ;
               AV42t = (short)(AV42t+1) ;
               AV23ens003 = (byte)(1) ;
               AV59Colorantes = (short)(1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV23ens003 == 1 )
            {
               GXt_char2 = AV40Prdnom ;
               GXv_char1[0] = A396EmprCod ;
               GXv_char3[0] = AV41Prdnum ;
               GXv_char4[0] = GXt_char2 ;
               new app.pprddsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
               pprc226.this.A396EmprCod = GXv_char1[0] ;
               pprc226.this.AV41Prdnum = GXv_char3[0] ;
               pprc226.this.GXt_char2 = GXv_char4[0] ;
               AV40Prdnom = GXt_char2 ;
               AV9Cant1 = AV43Tab_cant[1-1] ;
               AV10Cant2 = AV43Tab_cant[2-1] ;
               AV11Cant3 = AV43Tab_cant[3-1] ;
               AV12Cant4 = AV43Tab_cant[4-1] ;
               AV13Cant5 = AV43Tab_cant[5-1] ;
               AV14Cant6 = AV43Tab_cant[6-1] ;
               AV15Cant7 = AV43Tab_cant[7-1] ;
               AV16Cant8 = AV43Tab_cant[8-1] ;
               AV17Cant9 = AV43Tab_cant[9-1] ;
               AV49Und1 = AV46Tab_und[1-1] ;
               AV50Und2 = AV46Tab_und[2-1] ;
               AV51Und3 = AV46Tab_und[3-1] ;
               AV52Und4 = AV46Tab_und[4-1] ;
               AV53Und5 = AV46Tab_und[5-1] ;
               AV54Und6 = AV46Tab_und[6-1] ;
               AV55Und7 = AV46Tab_und[7-1] ;
               AV56Und8 = AV46Tab_und[8-1] ;
               AV57Und9 = AV46Tab_und[9-1] ;
               h5UV0( false, 46) ;
               getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Cant1, "ZZZ.ZZZZZ")), 386, Gx_line+17, 443, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10Cant2, "ZZZ.ZZZZZ")), 466, Gx_line+17, 523, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11Cant3, "ZZZ.ZZZZZ")), 547, Gx_line+17, 604, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Cant4, "ZZZ.ZZZZZ")), 627, Gx_line+17, 684, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Cant5, "ZZZ.ZZZZZ")), 707, Gx_line+17, 764, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14Cant6, "ZZZ.ZZZZZ")), 795, Gx_line+17, 852, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Cant7, "ZZZ.ZZZZZ")), 868, Gx_line+17, 925, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Cant8, "ZZZ.ZZZZZ")), 943, Gx_line+17, 1000, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Cant9, "ZZZ.ZZZZZ")), 1014, Gx_line+17, 1071, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Prdnom, "")), 22, Gx_line+11, 294, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(365, Gx_line+0, 365, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(452, Gx_line+0, 452, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+0, 532, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+0, 532, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(613, Gx_line+0, 613, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(773, Gx_line+0, 773, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(853, Gx_line+0, 853, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(933, Gx_line+0, 933, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(933, Gx_line+0, 933, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1006, Gx_line+0, 1006, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1079, Gx_line+0, 1079, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58ForPrdDsc, "")), 306, Gx_line+17, 359, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(21, Gx_line+46, 1080, Gx_line+46, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+46) ;
            }
            AV24ens004 = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV43Tab_cant[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV46Tab_und[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV42t = (short)(1) ;
            /* Using cursor P05UV8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV41Prdnum});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A490ForPrdUMe = P05UV8_A490ForPrdUMe[0] ;
               A719PrdNum = P05UV8_A719PrdNum[0] ;
               A5561LB_CantP = P05UV8_A5561LB_CantP[0] ;
               A5718Lb_numop = P05UV8_A5718Lb_numop[0] ;
               A488ForPrdDsc = P05UV8_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05UV8_n488ForPrdDsc[0] ;
               A5560Lb_LineaPr = P05UV8_A5560Lb_LineaPr[0] ;
               A5555Lb_opcion = P05UV8_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P05UV8_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05UV8_n488ForPrdDsc[0] ;
               A5718Lb_numop = P05UV8_A5718Lb_numop[0] ;
               AV43Tab_cant[A5718Lb_numop-1] = A5561LB_CantP ;
               AV46Tab_und[A5718Lb_numop-1] = GXutil.substring( A488ForPrdDsc, 1, 3) ;
               AV58ForPrdDsc = A488ForPrdDsc ;
               AV42t = (short)(AV42t+1) ;
               AV24ens004 = (byte)(1) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( AV24ens004 == 1 )
            {
               if ( AV59Colorantes == 1 )
               {
                  h5UV0( false, 23) ;
                  getPrinter().GxDrawLine(365, Gx_line+0, 365, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(452, Gx_line+0, 452, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(532, Gx_line+0, 532, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(532, Gx_line+0, 532, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(613, Gx_line+0, 613, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(773, Gx_line+0, 773, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(853, Gx_line+0, 853, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(933, Gx_line+0, 933, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(933, Gx_line+0, 933, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(1006, Gx_line+0, 1006, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(1079, Gx_line+0, 1079, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(21, Gx_line+21, 1080, Gx_line+21, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+23) ;
                  AV59Colorantes = (short)(0) ;
               }
               GXt_char2 = AV40Prdnom ;
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = AV41Prdnum ;
               GXv_char1[0] = GXt_char2 ;
               new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char1) ;
               pprc226.this.A396EmprCod = GXv_char4[0] ;
               pprc226.this.AV41Prdnum = GXv_char3[0] ;
               pprc226.this.GXt_char2 = GXv_char1[0] ;
               AV40Prdnom = GXt_char2 ;
               AV9Cant1 = AV43Tab_cant[1-1] ;
               AV10Cant2 = AV43Tab_cant[2-1] ;
               AV11Cant3 = AV43Tab_cant[3-1] ;
               AV12Cant4 = AV43Tab_cant[4-1] ;
               AV13Cant5 = AV43Tab_cant[5-1] ;
               AV14Cant6 = AV43Tab_cant[6-1] ;
               AV15Cant7 = AV43Tab_cant[7-1] ;
               AV16Cant8 = AV43Tab_cant[8-1] ;
               AV17Cant9 = AV43Tab_cant[9-1] ;
               AV49Und1 = AV46Tab_und[1-1] ;
               AV50Und2 = AV46Tab_und[2-1] ;
               AV51Und3 = AV46Tab_und[3-1] ;
               AV52Und4 = AV46Tab_und[4-1] ;
               AV53Und5 = AV46Tab_und[5-1] ;
               AV54Und6 = AV46Tab_und[6-1] ;
               AV55Und7 = AV46Tab_und[7-1] ;
               AV56Und8 = AV46Tab_und[8-1] ;
               AV57Und9 = AV46Tab_und[9-1] ;
               h5UV0( false, 47) ;
               getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Cant1, "ZZZ.ZZZZZ")), 386, Gx_line+17, 443, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10Cant2, "ZZZ.ZZZZZ")), 466, Gx_line+17, 523, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11Cant3, "ZZZ.ZZZZZ")), 547, Gx_line+17, 604, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12Cant4, "ZZZ.ZZZZZ")), 627, Gx_line+17, 684, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Cant5, "ZZZ.ZZZZZ")), 707, Gx_line+17, 764, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14Cant6, "ZZZ.ZZZZZ")), 795, Gx_line+17, 852, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Cant7, "ZZZ.ZZZZZ")), 868, Gx_line+17, 925, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Cant8, "ZZZ.ZZZZZ")), 943, Gx_line+17, 1000, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Cant9, "ZZZ.ZZZZZ")), 1014, Gx_line+17, 1071, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Prdnom, "")), 22, Gx_line+16, 213, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(365, Gx_line+0, 365, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(452, Gx_line+0, 452, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+0, 532, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+0, 532, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(613, Gx_line+0, 613, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(773, Gx_line+0, 773, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(853, Gx_line+0, 853, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(933, Gx_line+0, 933, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(933, Gx_line+0, 933, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1006, Gx_line+0, 1006, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1079, Gx_line+0, 1079, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58ForPrdDsc, "")), 306, Gx_line+17, 359, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(21, Gx_line+46, 1080, Gx_line+46, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
            }
            AV25i = (short)(AV25i+1) ;
         }
         h5UV0( false, 26) ;
         getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Contdsc, "")), 22, Gx_line+11, 106, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 919, Gx_line+8, 968, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 974, Gx_line+8, 1067, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 860, Gx_line+8, 910, Gx_line+26, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+26) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5UV0( true, 0) ;
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
      /* 'TABLA1' Routine */
      returnInSub = false ;
      AV8Alta = (byte)(0) ;
      AV25i = (short)(1) ;
      while ( AV25i <= 100 )
      {
         if ( GXutil.strcmp(AV45tab_productos[AV25i-1], " ") == 0 )
         {
            AV8Alta = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV41Prdnum, AV45tab_productos[AV25i-1]) == 0 )
         {
            if (true) break;
         }
         AV25i = (short)(AV25i+1) ;
      }
      if ( AV8Alta == 1 )
      {
         AV45tab_productos[AV42t-1] = AV41Prdnum ;
         AV42t = (short)(AV42t+1) ;
      }
   }

   public void h5UV0( boolean bFoot ,
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
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº LAB:", ""), 29, Gx_line+16, 75, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente:", ""), 263, Gx_line+16, 332, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 29, Gx_line+47, 75, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda:", ""), 540, Gx_line+47, 611, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Referencia:", ""), 29, Gx_line+63, 110, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processo:", ""), 540, Gx_line+63, 595, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R. Cor:", ""), 29, Gx_line+78, 68, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Material:", ""), 29, Gx_line+94, 82, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Temperatura:", ""), 540, Gx_line+78, 619, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 88, Gx_line+16, 147, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 565, Gx_line+16, 661, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 124, Gx_line+47, 169, Gx_line+64, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 175, Gx_line+47, 395, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 124, Gx_line+63, 271, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 124, Gx_line+78, 220, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 124, Gx_line+94, 242, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 248, Gx_line+94, 439, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(21, Gx_line+5, 1080, Gx_line+132, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 838, Gx_line+17, 1064, Gx_line+77) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), 619, Gx_line+47, 766, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Temperaturas, "")), 619, Gx_line+78, 766, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 619, Gx_line+63, 839, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preparação:", ""), 29, Gx_line+110, 98, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13300Lb_PquiDsc, "")), 124, Gx_line+110, 344, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lb_pantone, "")), 336, Gx_line+16, 556, Gx_line+33, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+132) ;
               getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 124, Gx_line+7, 556, Gx_line+83, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 29, Gx_line+7, 102, Gx_line+25, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+91) ;
               getPrinter().GxDrawRect(365, Gx_line+0, 1081, Gx_line+63, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(452, Gx_line+1, 452, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Op1, "")), 409, Gx_line+9, 421, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Op2, "")), 488, Gx_line+9, 500, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Op3, "")), 569, Gx_line+9, 581, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Op4, "")), 642, Gx_line+9, 654, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Op5, "")), 729, Gx_line+9, 741, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Op6, "")), 817, Gx_line+9, 829, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Op7, "")), 890, Gx_line+9, 902, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(365, Gx_line+31, 1081, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+1, 532, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(613, Gx_line+1, 613, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(693, Gx_line+1, 693, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(773, Gx_line+1, 773, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(853, Gx_line+1, 853, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(933, Gx_line+1, 933, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1006, Gx_line+1, 1006, Gx_line+62, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Op8, "")), 965, Gx_line+9, 977, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Op9, "")), 1035, Gx_line+9, 1047, Gx_line+25, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+63) ;
            }
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
      this.aP0[0] = pprc226.this.A396EmprCod;
      this.aP1[0] = pprc226.this.A5532Lb_numero;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Contdsc = "" ;
      scmdbuf = "" ;
      P05UV2_A396EmprCod = new String[] {""} ;
      P05UV2_A407EmprNom = new String[] {""} ;
      P05UV2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV22EmprNOm = "" ;
      AV44Tab_opciones = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV44Tab_opciones[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05UV3_A396EmprCod = new String[] {""} ;
      P05UV3_A5532Lb_numero = new int[1] ;
      P05UV3_A5718Lb_numop = new byte[1] ;
      P05UV3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV31Op1 = "" ;
      AV32Op2 = "" ;
      AV33Op3 = "" ;
      AV34Op4 = "" ;
      AV35Op5 = "" ;
      AV36Op6 = "" ;
      AV37Op7 = "" ;
      AV38Op8 = "" ;
      AV39Op9 = "" ;
      AV60Temperaturas = "" ;
      P05UV4_A5548Lb_Obs = new String[] {""} ;
      P05UV4_A831TipColCod = new byte[1] ;
      P05UV4_n831TipColCod = new boolean[] {false} ;
      P05UV4_A13299Lb_PquiID = new String[] {""} ;
      P05UV4_n13299Lb_PquiID = new boolean[] {false} ;
      P05UV4_A396EmprCod = new String[] {""} ;
      P05UV4_A5532Lb_numero = new int[1] ;
      P05UV4_A5601Lb_Tempt = new short[1] ;
      P05UV4_A5610Lb_Temp2 = new short[1] ;
      P05UV4_A5611Lb_Temp3 = new short[1] ;
      P05UV4_A6546Lb_Pantone = new String[] {""} ;
      P05UV4_A13300Lb_PquiDsc = new String[] {""} ;
      P05UV4_n13300Lb_PquiDsc = new boolean[] {false} ;
      P05UV4_A832TipColDsc = new String[] {""} ;
      P05UV4_n832TipColDsc = new boolean[] {false} ;
      P05UV4_A5700Lb_Talao = new String[] {""} ;
      P05UV4_A5534Lb_ArtDsc = new String[] {""} ;
      P05UV4_A5533Lb_ArtCod = new String[] {""} ;
      P05UV4_A5536Lb_ColNom = new String[] {""} ;
      P05UV4_A5540Lb_Cartaz = new String[] {""} ;
      P05UV4_A279CliNom = new String[] {""} ;
      P05UV4_A252CliCod = new int[1] ;
      P05UV4_A5538Lb_ColNomC = new String[] {""} ;
      A5548Lb_Obs = "" ;
      A13299Lb_PquiID = "" ;
      A6546Lb_Pantone = "" ;
      A13300Lb_PquiDsc = "" ;
      A832TipColDsc = "" ;
      A5700Lb_Talao = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A5540Lb_Cartaz = "" ;
      A279CliNom = "" ;
      A5538Lb_ColNomC = "" ;
      AV28Lb_pantone = "" ;
      AV45tab_productos = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV45tab_productos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05UV5_A396EmprCod = new String[] {""} ;
      P05UV5_A5532Lb_numero = new int[1] ;
      P05UV5_A719PrdNum = new String[] {""} ;
      P05UV5_A5557Lb_LineaC = new short[1] ;
      P05UV5_A5555Lb_opcion = new String[] {""} ;
      A719PrdNum = "" ;
      AV41Prdnum = "" ;
      P05UV6_A396EmprCod = new String[] {""} ;
      P05UV6_A5532Lb_numero = new int[1] ;
      P05UV6_A719PrdNum = new String[] {""} ;
      P05UV6_A5560Lb_LineaPr = new short[1] ;
      P05UV6_A5555Lb_opcion = new String[] {""} ;
      AV43Tab_cant = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV43Tab_cant[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV46Tab_und = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV46Tab_und[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05UV7_A490ForPrdUMe = new byte[1] ;
      P05UV7_A396EmprCod = new String[] {""} ;
      P05UV7_A5532Lb_numero = new int[1] ;
      P05UV7_A719PrdNum = new String[] {""} ;
      P05UV7_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05UV7_A5718Lb_numop = new byte[1] ;
      P05UV7_A488ForPrdDsc = new String[] {""} ;
      P05UV7_n488ForPrdDsc = new boolean[] {false} ;
      P05UV7_A5557Lb_LineaC = new short[1] ;
      P05UV7_A5555Lb_opcion = new String[] {""} ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV58ForPrdDsc = "" ;
      AV40Prdnom = "" ;
      AV9Cant1 = DecimalUtil.ZERO ;
      AV10Cant2 = DecimalUtil.ZERO ;
      AV11Cant3 = DecimalUtil.ZERO ;
      AV12Cant4 = DecimalUtil.ZERO ;
      AV13Cant5 = DecimalUtil.ZERO ;
      AV14Cant6 = DecimalUtil.ZERO ;
      AV15Cant7 = DecimalUtil.ZERO ;
      AV16Cant8 = DecimalUtil.ZERO ;
      AV17Cant9 = DecimalUtil.ZERO ;
      AV49Und1 = "" ;
      AV50Und2 = "" ;
      AV51Und3 = "" ;
      AV52Und4 = "" ;
      AV53Und5 = "" ;
      AV54Und6 = "" ;
      AV55Und7 = "" ;
      AV56Und8 = "" ;
      AV57Und9 = "" ;
      P05UV8_A490ForPrdUMe = new byte[1] ;
      P05UV8_A396EmprCod = new String[] {""} ;
      P05UV8_A5532Lb_numero = new int[1] ;
      P05UV8_A719PrdNum = new String[] {""} ;
      P05UV8_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05UV8_A5718Lb_numop = new byte[1] ;
      P05UV8_A488ForPrdDsc = new String[] {""} ;
      P05UV8_n488ForPrdDsc = new boolean[] {false} ;
      P05UV8_A5560Lb_LineaPr = new short[1] ;
      P05UV8_A5555Lb_opcion = new String[] {""} ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char1 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc226__default(),
         new Object[] {
             new Object[] {
            P05UV2_A396EmprCod, P05UV2_A407EmprNom, P05UV2_n407EmprNom
            }
            , new Object[] {
            P05UV3_A396EmprCod, P05UV3_A5532Lb_numero, P05UV3_A5718Lb_numop, P05UV3_A5555Lb_opcion
            }
            , new Object[] {
            P05UV4_A5548Lb_Obs, P05UV4_A831TipColCod, P05UV4_n831TipColCod, P05UV4_A13299Lb_PquiID, P05UV4_n13299Lb_PquiID, P05UV4_A396EmprCod, P05UV4_A5532Lb_numero, P05UV4_A5601Lb_Tempt, P05UV4_A5610Lb_Temp2, P05UV4_A5611Lb_Temp3,
            P05UV4_A6546Lb_Pantone, P05UV4_A13300Lb_PquiDsc, P05UV4_n13300Lb_PquiDsc, P05UV4_A832TipColDsc, P05UV4_n832TipColDsc, P05UV4_A5700Lb_Talao, P05UV4_A5534Lb_ArtDsc, P05UV4_A5533Lb_ArtCod, P05UV4_A5536Lb_ColNom, P05UV4_A5540Lb_Cartaz,
            P05UV4_A279CliNom, P05UV4_A252CliCod, P05UV4_A5538Lb_ColNomC
            }
            , new Object[] {
            P05UV5_A396EmprCod, P05UV5_A5532Lb_numero, P05UV5_A719PrdNum, P05UV5_A5557Lb_LineaC, P05UV5_A5555Lb_opcion
            }
            , new Object[] {
            P05UV6_A396EmprCod, P05UV6_A5532Lb_numero, P05UV6_A719PrdNum, P05UV6_A5560Lb_LineaPr, P05UV6_A5555Lb_opcion
            }
            , new Object[] {
            P05UV7_A490ForPrdUMe, P05UV7_A396EmprCod, P05UV7_A5532Lb_numero, P05UV7_A719PrdNum, P05UV7_A5558LB_CantC, P05UV7_A5718Lb_numop, P05UV7_A488ForPrdDsc, P05UV7_n488ForPrdDsc, P05UV7_A5557Lb_LineaC, P05UV7_A5555Lb_opcion
            }
            , new Object[] {
            P05UV8_A490ForPrdUMe, P05UV8_A396EmprCod, P05UV8_A5532Lb_numero, P05UV8_A719PrdNum, P05UV8_A5561LB_CantP, P05UV8_A5718Lb_numop, P05UV8_A488ForPrdDsc, P05UV8_n488ForPrdDsc, P05UV8_A5560Lb_LineaPr, P05UV8_A5555Lb_opcion
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A5718Lb_numop ;
   private byte A831TipColCod ;
   private byte AV23ens003 ;
   private byte A490ForPrdUMe ;
   private byte AV24ens004 ;
   private byte AV8Alta ;
   private short AV29Nopciones ;
   private short AV25i ;
   private short A5601Lb_Tempt ;
   private short A5610Lb_Temp2 ;
   private short A5611Lb_Temp3 ;
   private short AV42t ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short AV59Colorantes ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV43Tab_cant[] ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV9Cant1 ;
   private java.math.BigDecimal AV10Cant2 ;
   private java.math.BigDecimal AV11Cant3 ;
   private java.math.BigDecimal AV12Cant4 ;
   private java.math.BigDecimal AV13Cant5 ;
   private java.math.BigDecimal AV14Cant6 ;
   private java.math.BigDecimal AV15Cant7 ;
   private java.math.BigDecimal AV16Cant8 ;
   private java.math.BigDecimal AV17Cant9 ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String AV21Contdsc ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV22EmprNOm ;
   private String AV44Tab_opciones[] ;
   private String A5555Lb_opcion ;
   private String AV31Op1 ;
   private String AV32Op2 ;
   private String AV33Op3 ;
   private String AV34Op4 ;
   private String AV35Op5 ;
   private String AV36Op6 ;
   private String AV37Op7 ;
   private String AV38Op8 ;
   private String AV39Op9 ;
   private String AV60Temperaturas ;
   private String A13299Lb_PquiID ;
   private String A6546Lb_Pantone ;
   private String A13300Lb_PquiDsc ;
   private String A832TipColDsc ;
   private String A5700Lb_Talao ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String A5540Lb_Cartaz ;
   private String A279CliNom ;
   private String A5538Lb_ColNomC ;
   private String AV28Lb_pantone ;
   private String AV45tab_productos[] ;
   private String A719PrdNum ;
   private String AV41Prdnum ;
   private String AV46Tab_und[] ;
   private String A488ForPrdDsc ;
   private String AV58ForPrdDsc ;
   private String AV40Prdnom ;
   private String AV49Und1 ;
   private String AV50Und2 ;
   private String AV51Und3 ;
   private String AV52Und4 ;
   private String AV53Und5 ;
   private String AV54Und6 ;
   private String AV55Und7 ;
   private String AV56Und8 ;
   private String AV57Und9 ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr4 ;
   private boolean n831TipColCod ;
   private boolean n13299Lb_PquiID ;
   private boolean n13300Lb_PquiDsc ;
   private boolean n832TipColDsc ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private String A5548Lb_Obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05UV2_A396EmprCod ;
   private String[] P05UV2_A407EmprNom ;
   private boolean[] P05UV2_n407EmprNom ;
   private String[] P05UV3_A396EmprCod ;
   private int[] P05UV3_A5532Lb_numero ;
   private byte[] P05UV3_A5718Lb_numop ;
   private String[] P05UV3_A5555Lb_opcion ;
   private String[] P05UV4_A5548Lb_Obs ;
   private byte[] P05UV4_A831TipColCod ;
   private boolean[] P05UV4_n831TipColCod ;
   private String[] P05UV4_A13299Lb_PquiID ;
   private boolean[] P05UV4_n13299Lb_PquiID ;
   private String[] P05UV4_A396EmprCod ;
   private int[] P05UV4_A5532Lb_numero ;
   private short[] P05UV4_A5601Lb_Tempt ;
   private short[] P05UV4_A5610Lb_Temp2 ;
   private short[] P05UV4_A5611Lb_Temp3 ;
   private String[] P05UV4_A6546Lb_Pantone ;
   private String[] P05UV4_A13300Lb_PquiDsc ;
   private boolean[] P05UV4_n13300Lb_PquiDsc ;
   private String[] P05UV4_A832TipColDsc ;
   private boolean[] P05UV4_n832TipColDsc ;
   private String[] P05UV4_A5700Lb_Talao ;
   private String[] P05UV4_A5534Lb_ArtDsc ;
   private String[] P05UV4_A5533Lb_ArtCod ;
   private String[] P05UV4_A5536Lb_ColNom ;
   private String[] P05UV4_A5540Lb_Cartaz ;
   private String[] P05UV4_A279CliNom ;
   private int[] P05UV4_A252CliCod ;
   private String[] P05UV4_A5538Lb_ColNomC ;
   private String[] P05UV5_A396EmprCod ;
   private int[] P05UV5_A5532Lb_numero ;
   private String[] P05UV5_A719PrdNum ;
   private short[] P05UV5_A5557Lb_LineaC ;
   private String[] P05UV5_A5555Lb_opcion ;
   private String[] P05UV6_A396EmprCod ;
   private int[] P05UV6_A5532Lb_numero ;
   private String[] P05UV6_A719PrdNum ;
   private short[] P05UV6_A5560Lb_LineaPr ;
   private String[] P05UV6_A5555Lb_opcion ;
   private byte[] P05UV7_A490ForPrdUMe ;
   private String[] P05UV7_A396EmprCod ;
   private int[] P05UV7_A5532Lb_numero ;
   private String[] P05UV7_A719PrdNum ;
   private java.math.BigDecimal[] P05UV7_A5558LB_CantC ;
   private byte[] P05UV7_A5718Lb_numop ;
   private String[] P05UV7_A488ForPrdDsc ;
   private boolean[] P05UV7_n488ForPrdDsc ;
   private short[] P05UV7_A5557Lb_LineaC ;
   private String[] P05UV7_A5555Lb_opcion ;
   private byte[] P05UV8_A490ForPrdUMe ;
   private String[] P05UV8_A396EmprCod ;
   private int[] P05UV8_A5532Lb_numero ;
   private String[] P05UV8_A719PrdNum ;
   private java.math.BigDecimal[] P05UV8_A5561LB_CantP ;
   private byte[] P05UV8_A5718Lb_numop ;
   private String[] P05UV8_A488ForPrdDsc ;
   private boolean[] P05UV8_n488ForPrdDsc ;
   private short[] P05UV8_A5560Lb_LineaPr ;
   private String[] P05UV8_A5555Lb_opcion ;
}

final  class pprc226__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UV2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UV3", "SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UV4", "SELECT T1.Lb_Obs, T1.TipColCod, T1.Lb_PquiID, T1.EmprCod, T1.Lb_numero, T1.Lb_Tempt, T1.Lb_Temp2, T1.Lb_Temp3, T1.Lb_Pantone, T4.Lb_PquiDsc, T3.TipColDsc, T1.Lb_Talao, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_ColNom, T1.Lb_Cartaz, T2.CliNom, T1.CliCod, T1.Lb_ColNomC FROM (((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPPREQUI T4 ON T4.EmprCod = T1.EmprCod AND T4.Lb_PquiID = T1.Lb_PquiID) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UV5", "SELECT EmprCod, Lb_numero, PrdNum, Lb_LineaC, Lb_opcion FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UV6", "SELECT EmprCod, Lb_numero, PrdNum, Lb_LineaPr, Lb_opcion FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UV7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.PrdNum, T1.LB_CantC, T3.Lb_numop, T2.ForPrdDsc, T1.Lb_LineaC, T1.Lb_opcion FROM ((TXPENS003 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPENS002 T3 ON T3.EmprCod = T1.EmprCod AND T3.Lb_numero = T1.Lb_numero AND T3.Lb_opcion = T1.Lb_opcion) WHERE (T1.EmprCod = ? and T1.Lb_numero = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UV8", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.PrdNum, T1.LB_CantP, T3.Lb_numop, T2.ForPrdDsc, T1.Lb_LineaPr, T1.Lb_opcion FROM ((TXPENS004 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPENS002 T3 ON T3.EmprCod = T1.EmprCod AND T3.Lb_numero = T1.Lb_numero AND T3.Lb_opcion = T1.Lb_opcion) WHERE (T1.EmprCod = ? and T1.Lb_numero = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 100);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 20);
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 13);
               ((String[]) buf[19])[0] = rslt.getString(16, 20);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

