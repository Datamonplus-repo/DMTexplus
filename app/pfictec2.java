package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfictec2 extends GXReport
{
   public pfictec2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfictec2.class ), "" );
   }

   public pfictec2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pfictec2.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pfictec2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfictec2.this.A11103Nof_Hdr = aP1[0];
      this.aP1 = aP1;
      pfictec2.this.A11104Nof_r = aP2[0];
      this.aP2 = aP2;
      pfictec2.this.A11105Nof_p = aP3[0];
      this.aP3 = aP3;
      pfictec2.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      pfictec2.this.AV8Txt_c = aP5[0];
      this.aP5 = aP5;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Ficha Tecnica") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P054G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A11167Nof_stk = P054G2_A11167Nof_stk[0] ;
            n11167Nof_stk = P054G2_n11167Nof_stk[0] ;
            A11418Nof_obs1 = P054G2_A11418Nof_obs1[0] ;
            n11418Nof_obs1 = P054G2_n11418Nof_obs1[0] ;
            A11170Nof_c11 = P054G2_A11170Nof_c11[0] ;
            n11170Nof_c11 = P054G2_n11170Nof_c11[0] ;
            A11420Nof_obs3 = P054G2_A11420Nof_obs3[0] ;
            n11420Nof_obs3 = P054G2_n11420Nof_obs3[0] ;
            A11111Nof_c2 = P054G2_A11111Nof_c2[0] ;
            n11111Nof_c2 = P054G2_n11111Nof_c2[0] ;
            A11113Nof_bob = P054G2_A11113Nof_bob[0] ;
            n11113Nof_bob = P054G2_n11113Nof_bob[0] ;
            A11114Nof_boe = P054G2_A11114Nof_boe[0] ;
            n11114Nof_boe = P054G2_n11114Nof_boe[0] ;
            A11710Nof_enc = P054G2_A11710Nof_enc[0] ;
            n11710Nof_enc = P054G2_n11710Nof_enc[0] ;
            A11115Nof_Bov = P054G2_A11115Nof_Bov[0] ;
            n11115Nof_Bov = P054G2_n11115Nof_Bov[0] ;
            A11421Nof_obs4 = P054G2_A11421Nof_obs4[0] ;
            n11421Nof_obs4 = P054G2_n11421Nof_obs4[0] ;
            A11116Nof_c3 = P054G2_A11116Nof_c3[0] ;
            n11116Nof_c3 = P054G2_n11116Nof_c3[0] ;
            A11122Nof_scs = P054G2_A11122Nof_scs[0] ;
            n11122Nof_scs = P054G2_n11122Nof_scs[0] ;
            A11405Nof_humeda = P054G2_A11405Nof_humeda[0] ;
            n11405Nof_humeda = P054G2_n11405Nof_humeda[0] ;
            A11123Nof_scc = P054G2_A11123Nof_scc[0] ;
            n11123Nof_scc = P054G2_n11123Nof_scc[0] ;
            A11424Nof_obs7 = P054G2_A11424Nof_obs7[0] ;
            n11424Nof_obs7 = P054G2_n11424Nof_obs7[0] ;
            A11124Nof_c6 = P054G2_A11124Nof_c6[0] ;
            n11124Nof_c6 = P054G2_n11124Nof_c6[0] ;
            A11128Nof_ccp = P054G2_A11128Nof_ccp[0] ;
            n11128Nof_ccp = P054G2_n11128Nof_ccp[0] ;
            A11129Nof_cct = P054G2_A11129Nof_cct[0] ;
            n11129Nof_cct = P054G2_n11129Nof_cct[0] ;
            A11130Nof_ccpc = P054G2_A11130Nof_ccpc[0] ;
            n11130Nof_ccpc = P054G2_n11130Nof_ccpc[0] ;
            A11131Nof_cctq = P054G2_A11131Nof_cctq[0] ;
            n11131Nof_cctq = P054G2_n11131Nof_cctq[0] ;
            A11127Nof_cctet = P054G2_A11127Nof_cctet[0] ;
            n11127Nof_cctet = P054G2_n11127Nof_cctet[0] ;
            A11134Nof_ccmc1 = P054G2_A11134Nof_ccmc1[0] ;
            n11134Nof_ccmc1 = P054G2_n11134Nof_ccmc1[0] ;
            A11135Nof_ccmc2 = P054G2_A11135Nof_ccmc2[0] ;
            n11135Nof_ccmc2 = P054G2_n11135Nof_ccmc2[0] ;
            A11136Nof_ccmc3 = P054G2_A11136Nof_ccmc3[0] ;
            n11136Nof_ccmc3 = P054G2_n11136Nof_ccmc3[0] ;
            A11137Nof_ccmc4 = P054G2_A11137Nof_ccmc4[0] ;
            n11137Nof_ccmc4 = P054G2_n11137Nof_ccmc4[0] ;
            A11138Nof_ccmc5 = P054G2_A11138Nof_ccmc5[0] ;
            n11138Nof_ccmc5 = P054G2_n11138Nof_ccmc5[0] ;
            A11139Nof_ccmc6 = P054G2_A11139Nof_ccmc6[0] ;
            n11139Nof_ccmc6 = P054G2_n11139Nof_ccmc6[0] ;
            A11133Nof_ccec = P054G2_A11133Nof_ccec[0] ;
            n11133Nof_ccec = P054G2_n11133Nof_ccec[0] ;
            A11132Nof_cccc = P054G2_A11132Nof_cccc[0] ;
            n11132Nof_cccc = P054G2_n11132Nof_cccc[0] ;
            A11168Nof_Lbta = P054G2_A11168Nof_Lbta[0] ;
            n11168Nof_Lbta = P054G2_n11168Nof_Lbta[0] ;
            A11425Nof_obs8 = P054G2_A11425Nof_obs8[0] ;
            n11425Nof_obs8 = P054G2_n11425Nof_obs8[0] ;
            A11140Nof_c7 = P054G2_A11140Nof_c7[0] ;
            n11140Nof_c7 = P054G2_n11140Nof_c7[0] ;
            A11147Nof_rb3 = P054G2_A11147Nof_rb3[0] ;
            n11147Nof_rb3 = P054G2_n11147Nof_rb3[0] ;
            A11146Nof_rb1 = P054G2_A11146Nof_rb1[0] ;
            n11146Nof_rb1 = P054G2_n11146Nof_rb1[0] ;
            A11142Nof_rbi = P054G2_A11142Nof_rbi[0] ;
            n11142Nof_rbi = P054G2_n11142Nof_rbi[0] ;
            A11144Nof_rbp = P054G2_A11144Nof_rbp[0] ;
            n11144Nof_rbp = P054G2_n11144Nof_rbp[0] ;
            A11143Nof_rbe = P054G2_A11143Nof_rbe[0] ;
            n11143Nof_rbe = P054G2_n11143Nof_rbe[0] ;
            A11426Nof_obs9 = P054G2_A11426Nof_obs9[0] ;
            n11426Nof_obs9 = P054G2_n11426Nof_obs9[0] ;
            A11148Nof_c8 = P054G2_A11148Nof_c8[0] ;
            n11148Nof_c8 = P054G2_n11148Nof_c8[0] ;
            A11149Nof_ep1 = P054G2_A11149Nof_ep1[0] ;
            n11149Nof_ep1 = P054G2_n11149Nof_ep1[0] ;
            A11151Nof_ep3 = P054G2_A11151Nof_ep3[0] ;
            n11151Nof_ep3 = P054G2_n11151Nof_ep3[0] ;
            A11152Nof_ep4 = P054G2_A11152Nof_ep4[0] ;
            n11152Nof_ep4 = P054G2_n11152Nof_ep4[0] ;
            A11153Nof_ep5 = P054G2_A11153Nof_ep5[0] ;
            n11153Nof_ep5 = P054G2_n11153Nof_ep5[0] ;
            A11150Nof_ep2 = P054G2_A11150Nof_ep2[0] ;
            n11150Nof_ep2 = P054G2_n11150Nof_ep2[0] ;
            A11156Nof_ep8 = P054G2_A11156Nof_ep8[0] ;
            n11156Nof_ep8 = P054G2_n11156Nof_ep8[0] ;
            A11154Nof_ep6 = P054G2_A11154Nof_ep6[0] ;
            n11154Nof_ep6 = P054G2_n11154Nof_ep6[0] ;
            A11155Nof_ep7 = P054G2_A11155Nof_ep7[0] ;
            n11155Nof_ep7 = P054G2_n11155Nof_ep7[0] ;
            A11157Nof_ep9 = P054G2_A11157Nof_ep9[0] ;
            n11157Nof_ep9 = P054G2_n11157Nof_ep9[0] ;
            A11158Nof_ep10 = P054G2_A11158Nof_ep10[0] ;
            n11158Nof_ep10 = P054G2_n11158Nof_ep10[0] ;
            A11427Nof_obs10 = P054G2_A11427Nof_obs10[0] ;
            n11427Nof_obs10 = P054G2_n11427Nof_obs10[0] ;
            A11159Nof_c9 = P054G2_A11159Nof_c9[0] ;
            n11159Nof_c9 = P054G2_n11159Nof_c9[0] ;
            A11709Nof_nc = P054G2_A11709Nof_nc[0] ;
            n11709Nof_nc = P054G2_n11709Nof_nc[0] ;
            A11160Nof_sa1 = P054G2_A11160Nof_sa1[0] ;
            n11160Nof_sa1 = P054G2_n11160Nof_sa1[0] ;
            A11161Nof_sa2 = P054G2_A11161Nof_sa2[0] ;
            n11161Nof_sa2 = P054G2_n11161Nof_sa2[0] ;
            A11162Nof_sa3 = P054G2_A11162Nof_sa3[0] ;
            n11162Nof_sa3 = P054G2_n11162Nof_sa3[0] ;
            A11163Nof_sa4 = P054G2_A11163Nof_sa4[0] ;
            n11163Nof_sa4 = P054G2_n11163Nof_sa4[0] ;
            A11164Nof_sa5 = P054G2_A11164Nof_sa5[0] ;
            n11164Nof_sa5 = P054G2_n11164Nof_sa5[0] ;
            A11165Nof_sa6 = P054G2_A11165Nof_sa6[0] ;
            n11165Nof_sa6 = P054G2_n11165Nof_sa6[0] ;
            A11428Nof_obs11 = P054G2_A11428Nof_obs11[0] ;
            n11428Nof_obs11 = P054G2_n11428Nof_obs11[0] ;
            A11166Nof_c10 = P054G2_A11166Nof_c10[0] ;
            n11166Nof_c10 = P054G2_n11166Nof_c10[0] ;
            AV53Tit0 = ((GXutil.strcmp(A11167Nof_stk, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Nof para dejar en stock: ", "")+A11167Nof_stk) ;
            h54G0( false, 31) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "1. NOF en STOCK", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Tit0, "")), 7, Gx_line+17, 149, Gx_line+33, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
            if ( GXutil.strcmp(A11418Nof_obs1, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios:", ""), 7, Gx_line+0, 86, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11170Nof_c11, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            h54G0( false, 17) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "2. ALMACEN", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(A11420Nof_obs3, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 97) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11111Nof_c2, "")), 7, Gx_line+21, 455, Gx_line+94, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+5, 83, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+97) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV10Tit2 = ((GXutil.strcmp(A11113Nof_bob, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Bobinado Bros: ", "")+A11113Nof_bob) ;
            AV11Tit3 = ((GXutil.strcmp(A11114Nof_boe, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Bobinado Externo: ", "")+A11114Nof_boe) ;
            AV12Tit4 = ((A11710Nof_enc.doubleValue()==0) ? "" : httpContext.getMessage( "Encogimiento(%): ", "")+GXutil.str( A11710Nof_enc, 6, 2)) ;
            AV13Tit5 = ((GXutil.strcmp(A11115Nof_Bov, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Vaporado: ", "")+A11115Nof_Bov) ;
            h54G0( false, 35) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "3. BOBINADO", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Tit2, "")), 7, Gx_line+17, 91, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Tit3, "")), 209, Gx_line+17, 314, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tit4, "")), 609, Gx_line+17, 714, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Tit5, "")), 433, Gx_line+17, 491, Gx_line+33, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
            if ( GXutil.strcmp(A11421Nof_obs4, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11116Nof_c3, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+0, 83, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV14Tit6 = ((GXutil.strcmp(A11122Nof_scs, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Stalam: ", "")+A11122Nof_scs) ;
            AV15Tit7 = ((A11405Nof_humeda.doubleValue()==0) ? "" : httpContext.getMessage( "% Humedad: ", "")+GXutil.str( A11405Nof_humeda, 6, 2)) ;
            AV16Tit8 = ((GXutil.strcmp(A11123Nof_scc, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Camara: ", "")+A11123Nof_scc) ;
            h54G0( false, 40) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "4. SECADO", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Tit6, "")), 7, Gx_line+19, 112, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Tit7, "")), 581, Gx_line+19, 686, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Tit8, "")), 294, Gx_line+19, 399, Gx_line+35, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
            if ( GXutil.strcmp(A11424Nof_obs7, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+0, 83, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11124Nof_c6, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV17Tit9 = ((A11128Nof_ccp==0) ? "" : httpContext.getMessage( "Pestaña(Nº): ", "")+GXutil.str( A11128Nof_ccp, 2, 0)) ;
            AV18Tit10 = ((A11129Nof_cct==0) ? "" : httpContext.getMessage( "Tipo(Nº): ", "")+GXutil.str( A11129Nof_cct, 2, 0)) ;
            AV19Tit11 = ((GXutil.strcmp(A11130Nof_ccpc, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Placa: ", "")+A11130Nof_ccpc) ;
            AV20Tit12 = ((GXutil.strcmp(A11131Nof_cctq, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Troquillo: ", "")+A11131Nof_cctq) ;
            AV21Tit13 = ((GXutil.strcmp(A11127Nof_cctet, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Tejidos en Tipos: ", "")+A11127Nof_cctet) ;
            AV22Tit14 = ((GXutil.strcmp(A11134Nof_ccmc1, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Tipo: ", "")+A11134Nof_ccmc1) ;
            AV23Tit15 = ((GXutil.strcmp(A11135Nof_ccmc2, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Tejido: ", "")+A11135Nof_ccmc2) ;
            AV24Tit16 = ((GXutil.strcmp(A11136Nof_ccmc3, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Pestaña: ", "")+A11136Nof_ccmc3) ;
            AV25Tit17 = ((GXutil.strcmp(A11137Nof_ccmc4, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Culote: ", "")+A11137Nof_ccmc4) ;
            AV26Tit18 = ((GXutil.strcmp(A11138Nof_ccmc5, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Placa:  ", "")+A11138Nof_ccmc5) ;
            AV27Tit19 = ((GXutil.strcmp(A11139Nof_ccmc6, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Colorimetria: ", "")+A11139Nof_ccmc6) ;
            AV28Tit20 = ((GXutil.strcmp(A11133Nof_ccec, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Etiquetas cono: ", "")+A11133Nof_ccec) ;
            AV29Tit21 = ((GXutil.strcmp(A11132Nof_cccc, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Conformidad cliente: ", "")+A11132Nof_cccc) ;
            AV30Tit22 = ((GXutil.strcmp(A11168Nof_Lbta, "")==0) ? "" : httpContext.getMessage( "Tipo Articulo: ", "")+GXutil.trim( A11168Nof_Lbta)) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "5. CONTROL DE CALIDAD", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Muestras Bros:", ""), 7, Gx_line+0, 96, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Tit9, "")), 125, Gx_line+0, 204, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Tit10, "")), 246, Gx_line+0, 299, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tit11, "")), 316, Gx_line+0, 369, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Tit12, "")), 410, Gx_line+0, 515, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Tit13, "")), 539, Gx_line+0, 696, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Muestras Clientes:", ""), 7, Gx_line+0, 116, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Tit14, "")), 125, Gx_line+0, 178, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tit15, "")), 194, Gx_line+0, 247, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tit16, "")), 264, Gx_line+0, 343, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Tit17, "")), 358, Gx_line+0, 411, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Tit18, "")), 486, Gx_line+0, 539, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Tit19, "")), 593, Gx_line+1, 724, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Tit20, "")), 7, Gx_line+2, 138, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Tit21, "")), 223, Gx_line+0, 354, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Tit22, "")), 432, Gx_line+0, 693, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(A11425Nof_obs8, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11140Nof_c7, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+0, 80, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV31Tit23 = ((GXutil.strcmp(A11147Nof_rb3, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Tres partes: ", "")+GXutil.trim( A11147Nof_rb3)) ;
            AV32Tit24 = ((GXutil.strcmp(A11146Nof_rb1, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Un cono: ", "")+GXutil.trim( A11146Nof_rb1)) ;
            AV33Tit25 = ((GXutil.strcmp(A11142Nof_rbi, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Rebobinado Interno: ", "")+GXutil.trim( A11142Nof_rbi)) ;
            AV34Tit26 = ((GXutil.strcmp(A11144Nof_rbp, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Parafinado: ", "")+GXutil.trim( A11144Nof_rbp)) ;
            AV35Tit27 = ((GXutil.strcmp(A11143Nof_rbe, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Rebobinado Externo: ", "")+GXutil.trim( A11143Nof_rbe)) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "6. REBOBINADO", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Tit23, "")), 163, Gx_line+2, 268, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tit24, "")), 308, Gx_line+0, 413, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Conos para el control", ""), 7, Gx_line+2, 132, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tit25, "")), 7, Gx_line+2, 138, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Tit26, "")), 197, Gx_line+2, 328, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Tit27, "")), 374, Gx_line+2, 505, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(A11426Nof_obs9, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+0, 80, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11148Nof_c8, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV36Tit28 = ((GXutil.strcmp(A11149Nof_ep1, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Paletizado: ", "")+GXutil.trim( A11149Nof_ep1)) ;
            AV37Tit29 = ((GXutil.strcmp(A11151Nof_ep3, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Cajas Bros: ", "")+GXutil.trim( A11151Nof_ep3)) ;
            AV38Tit30 = ((GXutil.strcmp(A11152Nof_ep4, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Cajas Cliente; ", "")+GXutil.trim( A11152Nof_ep4)) ;
            AV39Tit31 = ((GXutil.strcmp(A11153Nof_ep5, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Bolsas: ", "")+GXutil.trim( A11153Nof_ep5)) ;
            AV40Tit32 = ((GXutil.strcmp(A11150Nof_ep2, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Cajas sin concretar: ", "")+GXutil.trim( A11150Nof_ep2)) ;
            AV41Tit33 = ((GXutil.strcmp(A11156Nof_ep8, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Etiquetas conos: ", "")+GXutil.trim( A11156Nof_ep8)) ;
            AV42Tit34 = ((GXutil.strcmp(A11154Nof_ep6, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Conos en bolsas normales: ", "")+GXutil.trim( A11154Nof_ep6)) ;
            AV43Tit35 = ((GXutil.strcmp(A11155Nof_ep7, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Conos en bolsas perforadas:  ", "")+GXutil.trim( A11155Nof_ep7)) ;
            AV47Tit36 = ((GXutil.strcmp(A11157Nof_ep9, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Packing List: ", "")+GXutil.trim( A11157Nof_ep9)) ;
            AV48Tit37 = ((GXutil.strcmp(A11158Nof_ep10, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Bruto-Tara-Neto: ", "")+GXutil.trim( A11158Nof_ep10)) ;
            h54G0( false, 15) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "7. EMPAQUETADO", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+15) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Tit28, "")), 7, Gx_line+2, 107, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tit29, "")), 121, Gx_line+2, 226, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tit30, "")), 239, Gx_line+2, 370, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Tit31, "")), 381, Gx_line+0, 434, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Tit32, "")), 501, Gx_line+0, 632, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Tit33, "")), 7, Gx_line+2, 138, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Tit34, "")), 199, Gx_line+0, 382, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Tit35, "")), 443, Gx_line+2, 626, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Tit36, "")), 7, Gx_line+0, 86, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Tit37, "")), 118, Gx_line+2, 249, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(A11427Nof_obs10, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11159Nof_c9, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+0, 83, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV44Tit38 = ((A11709Nof_nc==0) ? "" : httpContext.getMessage( "Nº Copias Albaran: ", "")+GXutil.str( A11709Nof_nc, 2, 0)) ;
            AV45Tit39 = ((GXutil.strcmp(A11160Nof_sa1, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Packing List: ", "")+GXutil.trim( A11160Nof_sa1)) ;
            AV46Tit40 = ((GXutil.strcmp(A11161Nof_sa2, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Bruto_Tara_Neto: ", "")+GXutil.trim( A11161Nof_sa2)) ;
            AV49Tit41 = ((GXutil.strcmp(A11162Nof_sa3, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Portes Pagados: ", "")+GXutil.trim( A11162Nof_sa3)) ;
            AV50Tit42 = ((GXutil.strcmp(A11163Nof_sa4, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Portes Debidos: ", "")+GXutil.trim( A11163Nof_sa4)) ;
            AV51Tit43 = ((GXutil.strcmp(A11164Nof_sa5, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Merma asumida por BROS: ", "")+GXutil.trim( A11164Nof_sa5)) ;
            AV52Tit44 = ((GXutil.strcmp(A11165Nof_sa6, httpContext.getMessage( "N", ""))==0) ? "" : httpContext.getMessage( "Merma asumida por CLIENTE: ", "")+GXutil.trim( A11165Nof_sa6)) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "8. SALIDA", ""), 7, Gx_line+0, 781, Gx_line+14, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Tit38, "")), 7, Gx_line+0, 164, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Tit39, "")), 193, Gx_line+0, 324, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Tit40, "")), 357, Gx_line+2, 514, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h54G0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Tit41, "")), 7, Gx_line+0, 117, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Tit42, "")), 175, Gx_line+0, 280, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Tit43, "")), 326, Gx_line+0, 478, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tit44, "")), 542, Gx_line+0, 704, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(A11428Nof_obs11, httpContext.getMessage( "S", "")) == 0 )
            {
               h54G0( false, 94) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comentarios", ""), 7, Gx_line+0, 83, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11166Nof_c10, "")), 7, Gx_line+16, 455, Gx_line+89, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
            }
            else
            {
               h54G0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h54G0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h54G0( boolean bFoot ,
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
            if ( GXutil.strcmp(AV8Txt_c, " ") != 0 )
            {
               getPrinter().GxAttris("Arial", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Txt_c, "")), 573, Gx_line+1, 782, Gx_line+27, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
            }
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NOF", ""), 17, Gx_line+14, 40, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11103Nof_Hdr), "ZZZZZZZ9")), 46, Gx_line+13, 105, Gx_line+30, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11104Nof_r), "9")), 111, Gx_line+13, 119, Gx_line+30, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11105Nof_p, "")), 126, Gx_line+13, 134, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FICHA TECNICA", ""), 277, Gx_line+8, 438, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 611, Gx_line+13, 656, Gx_line+30, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 663, Gx_line+14, 679, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 684, Gx_line+13, 751, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+2, 781, Gx_line+40, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
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
      this.aP0[0] = pfictec2.this.A396EmprCod;
      this.aP1[0] = pfictec2.this.A11103Nof_Hdr;
      this.aP2[0] = pfictec2.this.A11104Nof_r;
      this.aP3[0] = pfictec2.this.A11105Nof_p;
      this.aP4[0] = pfictec2.this.Gx_out;
      this.aP5[0] = pfictec2.this.AV8Txt_c;
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
      P054G2_A396EmprCod = new String[] {""} ;
      P054G2_A11103Nof_Hdr = new int[1] ;
      P054G2_A11104Nof_r = new byte[1] ;
      P054G2_A11105Nof_p = new String[] {""} ;
      P054G2_A11167Nof_stk = new String[] {""} ;
      P054G2_n11167Nof_stk = new boolean[] {false} ;
      P054G2_A11418Nof_obs1 = new String[] {""} ;
      P054G2_n11418Nof_obs1 = new boolean[] {false} ;
      P054G2_A11170Nof_c11 = new String[] {""} ;
      P054G2_n11170Nof_c11 = new boolean[] {false} ;
      P054G2_A11420Nof_obs3 = new String[] {""} ;
      P054G2_n11420Nof_obs3 = new boolean[] {false} ;
      P054G2_A11111Nof_c2 = new String[] {""} ;
      P054G2_n11111Nof_c2 = new boolean[] {false} ;
      P054G2_A11113Nof_bob = new String[] {""} ;
      P054G2_n11113Nof_bob = new boolean[] {false} ;
      P054G2_A11114Nof_boe = new String[] {""} ;
      P054G2_n11114Nof_boe = new boolean[] {false} ;
      P054G2_A11710Nof_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P054G2_n11710Nof_enc = new boolean[] {false} ;
      P054G2_A11115Nof_Bov = new String[] {""} ;
      P054G2_n11115Nof_Bov = new boolean[] {false} ;
      P054G2_A11421Nof_obs4 = new String[] {""} ;
      P054G2_n11421Nof_obs4 = new boolean[] {false} ;
      P054G2_A11116Nof_c3 = new String[] {""} ;
      P054G2_n11116Nof_c3 = new boolean[] {false} ;
      P054G2_A11122Nof_scs = new String[] {""} ;
      P054G2_n11122Nof_scs = new boolean[] {false} ;
      P054G2_A11405Nof_humeda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P054G2_n11405Nof_humeda = new boolean[] {false} ;
      P054G2_A11123Nof_scc = new String[] {""} ;
      P054G2_n11123Nof_scc = new boolean[] {false} ;
      P054G2_A11424Nof_obs7 = new String[] {""} ;
      P054G2_n11424Nof_obs7 = new boolean[] {false} ;
      P054G2_A11124Nof_c6 = new String[] {""} ;
      P054G2_n11124Nof_c6 = new boolean[] {false} ;
      P054G2_A11128Nof_ccp = new byte[1] ;
      P054G2_n11128Nof_ccp = new boolean[] {false} ;
      P054G2_A11129Nof_cct = new byte[1] ;
      P054G2_n11129Nof_cct = new boolean[] {false} ;
      P054G2_A11130Nof_ccpc = new String[] {""} ;
      P054G2_n11130Nof_ccpc = new boolean[] {false} ;
      P054G2_A11131Nof_cctq = new String[] {""} ;
      P054G2_n11131Nof_cctq = new boolean[] {false} ;
      P054G2_A11127Nof_cctet = new String[] {""} ;
      P054G2_n11127Nof_cctet = new boolean[] {false} ;
      P054G2_A11134Nof_ccmc1 = new String[] {""} ;
      P054G2_n11134Nof_ccmc1 = new boolean[] {false} ;
      P054G2_A11135Nof_ccmc2 = new String[] {""} ;
      P054G2_n11135Nof_ccmc2 = new boolean[] {false} ;
      P054G2_A11136Nof_ccmc3 = new String[] {""} ;
      P054G2_n11136Nof_ccmc3 = new boolean[] {false} ;
      P054G2_A11137Nof_ccmc4 = new String[] {""} ;
      P054G2_n11137Nof_ccmc4 = new boolean[] {false} ;
      P054G2_A11138Nof_ccmc5 = new String[] {""} ;
      P054G2_n11138Nof_ccmc5 = new boolean[] {false} ;
      P054G2_A11139Nof_ccmc6 = new String[] {""} ;
      P054G2_n11139Nof_ccmc6 = new boolean[] {false} ;
      P054G2_A11133Nof_ccec = new String[] {""} ;
      P054G2_n11133Nof_ccec = new boolean[] {false} ;
      P054G2_A11132Nof_cccc = new String[] {""} ;
      P054G2_n11132Nof_cccc = new boolean[] {false} ;
      P054G2_A11168Nof_Lbta = new String[] {""} ;
      P054G2_n11168Nof_Lbta = new boolean[] {false} ;
      P054G2_A11425Nof_obs8 = new String[] {""} ;
      P054G2_n11425Nof_obs8 = new boolean[] {false} ;
      P054G2_A11140Nof_c7 = new String[] {""} ;
      P054G2_n11140Nof_c7 = new boolean[] {false} ;
      P054G2_A11147Nof_rb3 = new String[] {""} ;
      P054G2_n11147Nof_rb3 = new boolean[] {false} ;
      P054G2_A11146Nof_rb1 = new String[] {""} ;
      P054G2_n11146Nof_rb1 = new boolean[] {false} ;
      P054G2_A11142Nof_rbi = new String[] {""} ;
      P054G2_n11142Nof_rbi = new boolean[] {false} ;
      P054G2_A11144Nof_rbp = new String[] {""} ;
      P054G2_n11144Nof_rbp = new boolean[] {false} ;
      P054G2_A11143Nof_rbe = new String[] {""} ;
      P054G2_n11143Nof_rbe = new boolean[] {false} ;
      P054G2_A11426Nof_obs9 = new String[] {""} ;
      P054G2_n11426Nof_obs9 = new boolean[] {false} ;
      P054G2_A11148Nof_c8 = new String[] {""} ;
      P054G2_n11148Nof_c8 = new boolean[] {false} ;
      P054G2_A11149Nof_ep1 = new String[] {""} ;
      P054G2_n11149Nof_ep1 = new boolean[] {false} ;
      P054G2_A11151Nof_ep3 = new String[] {""} ;
      P054G2_n11151Nof_ep3 = new boolean[] {false} ;
      P054G2_A11152Nof_ep4 = new String[] {""} ;
      P054G2_n11152Nof_ep4 = new boolean[] {false} ;
      P054G2_A11153Nof_ep5 = new String[] {""} ;
      P054G2_n11153Nof_ep5 = new boolean[] {false} ;
      P054G2_A11150Nof_ep2 = new String[] {""} ;
      P054G2_n11150Nof_ep2 = new boolean[] {false} ;
      P054G2_A11156Nof_ep8 = new String[] {""} ;
      P054G2_n11156Nof_ep8 = new boolean[] {false} ;
      P054G2_A11154Nof_ep6 = new String[] {""} ;
      P054G2_n11154Nof_ep6 = new boolean[] {false} ;
      P054G2_A11155Nof_ep7 = new String[] {""} ;
      P054G2_n11155Nof_ep7 = new boolean[] {false} ;
      P054G2_A11157Nof_ep9 = new String[] {""} ;
      P054G2_n11157Nof_ep9 = new boolean[] {false} ;
      P054G2_A11158Nof_ep10 = new String[] {""} ;
      P054G2_n11158Nof_ep10 = new boolean[] {false} ;
      P054G2_A11427Nof_obs10 = new String[] {""} ;
      P054G2_n11427Nof_obs10 = new boolean[] {false} ;
      P054G2_A11159Nof_c9 = new String[] {""} ;
      P054G2_n11159Nof_c9 = new boolean[] {false} ;
      P054G2_A11709Nof_nc = new byte[1] ;
      P054G2_n11709Nof_nc = new boolean[] {false} ;
      P054G2_A11160Nof_sa1 = new String[] {""} ;
      P054G2_n11160Nof_sa1 = new boolean[] {false} ;
      P054G2_A11161Nof_sa2 = new String[] {""} ;
      P054G2_n11161Nof_sa2 = new boolean[] {false} ;
      P054G2_A11162Nof_sa3 = new String[] {""} ;
      P054G2_n11162Nof_sa3 = new boolean[] {false} ;
      P054G2_A11163Nof_sa4 = new String[] {""} ;
      P054G2_n11163Nof_sa4 = new boolean[] {false} ;
      P054G2_A11164Nof_sa5 = new String[] {""} ;
      P054G2_n11164Nof_sa5 = new boolean[] {false} ;
      P054G2_A11165Nof_sa6 = new String[] {""} ;
      P054G2_n11165Nof_sa6 = new boolean[] {false} ;
      P054G2_A11428Nof_obs11 = new String[] {""} ;
      P054G2_n11428Nof_obs11 = new boolean[] {false} ;
      P054G2_A11166Nof_c10 = new String[] {""} ;
      P054G2_n11166Nof_c10 = new boolean[] {false} ;
      A11167Nof_stk = "" ;
      A11418Nof_obs1 = "" ;
      A11170Nof_c11 = "" ;
      A11420Nof_obs3 = "" ;
      A11111Nof_c2 = "" ;
      A11113Nof_bob = "" ;
      A11114Nof_boe = "" ;
      A11710Nof_enc = DecimalUtil.ZERO ;
      A11115Nof_Bov = "" ;
      A11421Nof_obs4 = "" ;
      A11116Nof_c3 = "" ;
      A11122Nof_scs = "" ;
      A11405Nof_humeda = DecimalUtil.ZERO ;
      A11123Nof_scc = "" ;
      A11424Nof_obs7 = "" ;
      A11124Nof_c6 = "" ;
      A11130Nof_ccpc = "" ;
      A11131Nof_cctq = "" ;
      A11127Nof_cctet = "" ;
      A11134Nof_ccmc1 = "" ;
      A11135Nof_ccmc2 = "" ;
      A11136Nof_ccmc3 = "" ;
      A11137Nof_ccmc4 = "" ;
      A11138Nof_ccmc5 = "" ;
      A11139Nof_ccmc6 = "" ;
      A11133Nof_ccec = "" ;
      A11132Nof_cccc = "" ;
      A11168Nof_Lbta = "" ;
      A11425Nof_obs8 = "" ;
      A11140Nof_c7 = "" ;
      A11147Nof_rb3 = "" ;
      A11146Nof_rb1 = "" ;
      A11142Nof_rbi = "" ;
      A11144Nof_rbp = "" ;
      A11143Nof_rbe = "" ;
      A11426Nof_obs9 = "" ;
      A11148Nof_c8 = "" ;
      A11149Nof_ep1 = "" ;
      A11151Nof_ep3 = "" ;
      A11152Nof_ep4 = "" ;
      A11153Nof_ep5 = "" ;
      A11150Nof_ep2 = "" ;
      A11156Nof_ep8 = "" ;
      A11154Nof_ep6 = "" ;
      A11155Nof_ep7 = "" ;
      A11157Nof_ep9 = "" ;
      A11158Nof_ep10 = "" ;
      A11427Nof_obs10 = "" ;
      A11159Nof_c9 = "" ;
      A11160Nof_sa1 = "" ;
      A11161Nof_sa2 = "" ;
      A11162Nof_sa3 = "" ;
      A11163Nof_sa4 = "" ;
      A11164Nof_sa5 = "" ;
      A11165Nof_sa6 = "" ;
      A11428Nof_obs11 = "" ;
      A11166Nof_c10 = "" ;
      AV53Tit0 = "" ;
      AV10Tit2 = "" ;
      AV11Tit3 = "" ;
      AV12Tit4 = "" ;
      AV13Tit5 = "" ;
      AV14Tit6 = "" ;
      AV15Tit7 = "" ;
      AV16Tit8 = "" ;
      AV17Tit9 = "" ;
      AV18Tit10 = "" ;
      AV19Tit11 = "" ;
      AV20Tit12 = "" ;
      AV21Tit13 = "" ;
      AV22Tit14 = "" ;
      AV23Tit15 = "" ;
      AV24Tit16 = "" ;
      AV25Tit17 = "" ;
      AV26Tit18 = "" ;
      AV27Tit19 = "" ;
      AV28Tit20 = "" ;
      AV29Tit21 = "" ;
      AV30Tit22 = "" ;
      AV31Tit23 = "" ;
      AV32Tit24 = "" ;
      AV33Tit25 = "" ;
      AV34Tit26 = "" ;
      AV35Tit27 = "" ;
      AV36Tit28 = "" ;
      AV37Tit29 = "" ;
      AV38Tit30 = "" ;
      AV39Tit31 = "" ;
      AV40Tit32 = "" ;
      AV41Tit33 = "" ;
      AV42Tit34 = "" ;
      AV43Tit35 = "" ;
      AV47Tit36 = "" ;
      AV48Tit37 = "" ;
      AV44Tit38 = "" ;
      AV45Tit39 = "" ;
      AV46Tit40 = "" ;
      AV49Tit41 = "" ;
      AV50Tit42 = "" ;
      AV51Tit43 = "" ;
      AV52Tit44 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfictec2__default(),
         new Object[] {
             new Object[] {
            P054G2_A396EmprCod, P054G2_A11103Nof_Hdr, P054G2_A11104Nof_r, P054G2_A11105Nof_p, P054G2_A11167Nof_stk, P054G2_n11167Nof_stk, P054G2_A11418Nof_obs1, P054G2_n11418Nof_obs1, P054G2_A11170Nof_c11, P054G2_n11170Nof_c11,
            P054G2_A11420Nof_obs3, P054G2_n11420Nof_obs3, P054G2_A11111Nof_c2, P054G2_n11111Nof_c2, P054G2_A11113Nof_bob, P054G2_n11113Nof_bob, P054G2_A11114Nof_boe, P054G2_n11114Nof_boe, P054G2_A11710Nof_enc, P054G2_n11710Nof_enc,
            P054G2_A11115Nof_Bov, P054G2_n11115Nof_Bov, P054G2_A11421Nof_obs4, P054G2_n11421Nof_obs4, P054G2_A11116Nof_c3, P054G2_n11116Nof_c3, P054G2_A11122Nof_scs, P054G2_n11122Nof_scs, P054G2_A11405Nof_humeda, P054G2_n11405Nof_humeda,
            P054G2_A11123Nof_scc, P054G2_n11123Nof_scc, P054G2_A11424Nof_obs7, P054G2_n11424Nof_obs7, P054G2_A11124Nof_c6, P054G2_n11124Nof_c6, P054G2_A11128Nof_ccp, P054G2_n11128Nof_ccp, P054G2_A11129Nof_cct, P054G2_n11129Nof_cct,
            P054G2_A11130Nof_ccpc, P054G2_n11130Nof_ccpc, P054G2_A11131Nof_cctq, P054G2_n11131Nof_cctq, P054G2_A11127Nof_cctet, P054G2_n11127Nof_cctet, P054G2_A11134Nof_ccmc1, P054G2_n11134Nof_ccmc1, P054G2_A11135Nof_ccmc2, P054G2_n11135Nof_ccmc2,
            P054G2_A11136Nof_ccmc3, P054G2_n11136Nof_ccmc3, P054G2_A11137Nof_ccmc4, P054G2_n11137Nof_ccmc4, P054G2_A11138Nof_ccmc5, P054G2_n11138Nof_ccmc5, P054G2_A11139Nof_ccmc6, P054G2_n11139Nof_ccmc6, P054G2_A11133Nof_ccec, P054G2_n11133Nof_ccec,
            P054G2_A11132Nof_cccc, P054G2_n11132Nof_cccc, P054G2_A11168Nof_Lbta, P054G2_n11168Nof_Lbta, P054G2_A11425Nof_obs8, P054G2_n11425Nof_obs8, P054G2_A11140Nof_c7, P054G2_n11140Nof_c7, P054G2_A11147Nof_rb3, P054G2_n11147Nof_rb3,
            P054G2_A11146Nof_rb1, P054G2_n11146Nof_rb1, P054G2_A11142Nof_rbi, P054G2_n11142Nof_rbi, P054G2_A11144Nof_rbp, P054G2_n11144Nof_rbp, P054G2_A11143Nof_rbe, P054G2_n11143Nof_rbe, P054G2_A11426Nof_obs9, P054G2_n11426Nof_obs9,
            P054G2_A11148Nof_c8, P054G2_n11148Nof_c8, P054G2_A11149Nof_ep1, P054G2_n11149Nof_ep1, P054G2_A11151Nof_ep3, P054G2_n11151Nof_ep3, P054G2_A11152Nof_ep4, P054G2_n11152Nof_ep4, P054G2_A11153Nof_ep5, P054G2_n11153Nof_ep5,
            P054G2_A11150Nof_ep2, P054G2_n11150Nof_ep2, P054G2_A11156Nof_ep8, P054G2_n11156Nof_ep8, P054G2_A11154Nof_ep6, P054G2_n11154Nof_ep6, P054G2_A11155Nof_ep7, P054G2_n11155Nof_ep7, P054G2_A11157Nof_ep9, P054G2_n11157Nof_ep9,
            P054G2_A11158Nof_ep10, P054G2_n11158Nof_ep10, P054G2_A11427Nof_obs10, P054G2_n11427Nof_obs10, P054G2_A11159Nof_c9, P054G2_n11159Nof_c9, P054G2_A11709Nof_nc, P054G2_n11709Nof_nc, P054G2_A11160Nof_sa1, P054G2_n11160Nof_sa1,
            P054G2_A11161Nof_sa2, P054G2_n11161Nof_sa2, P054G2_A11162Nof_sa3, P054G2_n11162Nof_sa3, P054G2_A11163Nof_sa4, P054G2_n11163Nof_sa4, P054G2_A11164Nof_sa5, P054G2_n11164Nof_sa5, P054G2_A11165Nof_sa6, P054G2_n11165Nof_sa6,
            P054G2_A11428Nof_obs11, P054G2_n11428Nof_obs11, P054G2_A11166Nof_c10, P054G2_n11166Nof_c10
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A11104Nof_r ;
   private byte A11128Nof_ccp ;
   private byte A11129Nof_cct ;
   private byte A11709Nof_nc ;
   private short Gx_err ;
   private int A11103Nof_Hdr ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A11710Nof_enc ;
   private java.math.BigDecimal A11405Nof_humeda ;
   private String A396EmprCod ;
   private String A11105Nof_p ;
   private String Gx_out ;
   private String AV8Txt_c ;
   private String scmdbuf ;
   private String A11167Nof_stk ;
   private String A11418Nof_obs1 ;
   private String A11420Nof_obs3 ;
   private String A11113Nof_bob ;
   private String A11114Nof_boe ;
   private String A11115Nof_Bov ;
   private String A11421Nof_obs4 ;
   private String A11122Nof_scs ;
   private String A11123Nof_scc ;
   private String A11424Nof_obs7 ;
   private String A11130Nof_ccpc ;
   private String A11131Nof_cctq ;
   private String A11127Nof_cctet ;
   private String A11134Nof_ccmc1 ;
   private String A11135Nof_ccmc2 ;
   private String A11136Nof_ccmc3 ;
   private String A11137Nof_ccmc4 ;
   private String A11138Nof_ccmc5 ;
   private String A11139Nof_ccmc6 ;
   private String A11133Nof_ccec ;
   private String A11132Nof_cccc ;
   private String A11168Nof_Lbta ;
   private String A11425Nof_obs8 ;
   private String A11147Nof_rb3 ;
   private String A11146Nof_rb1 ;
   private String A11142Nof_rbi ;
   private String A11144Nof_rbp ;
   private String A11143Nof_rbe ;
   private String A11426Nof_obs9 ;
   private String A11149Nof_ep1 ;
   private String A11151Nof_ep3 ;
   private String A11152Nof_ep4 ;
   private String A11153Nof_ep5 ;
   private String A11150Nof_ep2 ;
   private String A11156Nof_ep8 ;
   private String A11154Nof_ep6 ;
   private String A11155Nof_ep7 ;
   private String A11157Nof_ep9 ;
   private String A11158Nof_ep10 ;
   private String A11427Nof_obs10 ;
   private String A11160Nof_sa1 ;
   private String A11161Nof_sa2 ;
   private String A11162Nof_sa3 ;
   private String A11163Nof_sa4 ;
   private String A11164Nof_sa5 ;
   private String A11165Nof_sa6 ;
   private String A11428Nof_obs11 ;
   private String AV53Tit0 ;
   private String AV10Tit2 ;
   private String AV11Tit3 ;
   private String AV12Tit4 ;
   private String AV13Tit5 ;
   private String AV14Tit6 ;
   private String AV15Tit7 ;
   private String AV16Tit8 ;
   private String AV17Tit9 ;
   private String AV18Tit10 ;
   private String AV19Tit11 ;
   private String AV20Tit12 ;
   private String AV21Tit13 ;
   private String AV22Tit14 ;
   private String AV23Tit15 ;
   private String AV24Tit16 ;
   private String AV25Tit17 ;
   private String AV26Tit18 ;
   private String AV27Tit19 ;
   private String AV28Tit20 ;
   private String AV29Tit21 ;
   private String AV30Tit22 ;
   private String AV31Tit23 ;
   private String AV32Tit24 ;
   private String AV33Tit25 ;
   private String AV34Tit26 ;
   private String AV35Tit27 ;
   private String AV36Tit28 ;
   private String AV37Tit29 ;
   private String AV38Tit30 ;
   private String AV39Tit31 ;
   private String AV40Tit32 ;
   private String AV41Tit33 ;
   private String AV42Tit34 ;
   private String AV43Tit35 ;
   private String AV47Tit36 ;
   private String AV48Tit37 ;
   private String AV44Tit38 ;
   private String AV45Tit39 ;
   private String AV46Tit40 ;
   private String AV49Tit41 ;
   private String AV50Tit42 ;
   private String AV51Tit43 ;
   private String AV52Tit44 ;
   private boolean n11167Nof_stk ;
   private boolean n11418Nof_obs1 ;
   private boolean n11170Nof_c11 ;
   private boolean n11420Nof_obs3 ;
   private boolean n11111Nof_c2 ;
   private boolean n11113Nof_bob ;
   private boolean n11114Nof_boe ;
   private boolean n11710Nof_enc ;
   private boolean n11115Nof_Bov ;
   private boolean n11421Nof_obs4 ;
   private boolean n11116Nof_c3 ;
   private boolean n11122Nof_scs ;
   private boolean n11405Nof_humeda ;
   private boolean n11123Nof_scc ;
   private boolean n11424Nof_obs7 ;
   private boolean n11124Nof_c6 ;
   private boolean n11128Nof_ccp ;
   private boolean n11129Nof_cct ;
   private boolean n11130Nof_ccpc ;
   private boolean n11131Nof_cctq ;
   private boolean n11127Nof_cctet ;
   private boolean n11134Nof_ccmc1 ;
   private boolean n11135Nof_ccmc2 ;
   private boolean n11136Nof_ccmc3 ;
   private boolean n11137Nof_ccmc4 ;
   private boolean n11138Nof_ccmc5 ;
   private boolean n11139Nof_ccmc6 ;
   private boolean n11133Nof_ccec ;
   private boolean n11132Nof_cccc ;
   private boolean n11168Nof_Lbta ;
   private boolean n11425Nof_obs8 ;
   private boolean n11140Nof_c7 ;
   private boolean n11147Nof_rb3 ;
   private boolean n11146Nof_rb1 ;
   private boolean n11142Nof_rbi ;
   private boolean n11144Nof_rbp ;
   private boolean n11143Nof_rbe ;
   private boolean n11426Nof_obs9 ;
   private boolean n11148Nof_c8 ;
   private boolean n11149Nof_ep1 ;
   private boolean n11151Nof_ep3 ;
   private boolean n11152Nof_ep4 ;
   private boolean n11153Nof_ep5 ;
   private boolean n11150Nof_ep2 ;
   private boolean n11156Nof_ep8 ;
   private boolean n11154Nof_ep6 ;
   private boolean n11155Nof_ep7 ;
   private boolean n11157Nof_ep9 ;
   private boolean n11158Nof_ep10 ;
   private boolean n11427Nof_obs10 ;
   private boolean n11159Nof_c9 ;
   private boolean n11709Nof_nc ;
   private boolean n11160Nof_sa1 ;
   private boolean n11161Nof_sa2 ;
   private boolean n11162Nof_sa3 ;
   private boolean n11163Nof_sa4 ;
   private boolean n11164Nof_sa5 ;
   private boolean n11165Nof_sa6 ;
   private boolean n11428Nof_obs11 ;
   private boolean n11166Nof_c10 ;
   private String A11170Nof_c11 ;
   private String A11111Nof_c2 ;
   private String A11116Nof_c3 ;
   private String A11124Nof_c6 ;
   private String A11140Nof_c7 ;
   private String A11148Nof_c8 ;
   private String A11159Nof_c9 ;
   private String A11166Nof_c10 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P054G2_A396EmprCod ;
   private int[] P054G2_A11103Nof_Hdr ;
   private byte[] P054G2_A11104Nof_r ;
   private String[] P054G2_A11105Nof_p ;
   private String[] P054G2_A11167Nof_stk ;
   private boolean[] P054G2_n11167Nof_stk ;
   private String[] P054G2_A11418Nof_obs1 ;
   private boolean[] P054G2_n11418Nof_obs1 ;
   private String[] P054G2_A11170Nof_c11 ;
   private boolean[] P054G2_n11170Nof_c11 ;
   private String[] P054G2_A11420Nof_obs3 ;
   private boolean[] P054G2_n11420Nof_obs3 ;
   private String[] P054G2_A11111Nof_c2 ;
   private boolean[] P054G2_n11111Nof_c2 ;
   private String[] P054G2_A11113Nof_bob ;
   private boolean[] P054G2_n11113Nof_bob ;
   private String[] P054G2_A11114Nof_boe ;
   private boolean[] P054G2_n11114Nof_boe ;
   private java.math.BigDecimal[] P054G2_A11710Nof_enc ;
   private boolean[] P054G2_n11710Nof_enc ;
   private String[] P054G2_A11115Nof_Bov ;
   private boolean[] P054G2_n11115Nof_Bov ;
   private String[] P054G2_A11421Nof_obs4 ;
   private boolean[] P054G2_n11421Nof_obs4 ;
   private String[] P054G2_A11116Nof_c3 ;
   private boolean[] P054G2_n11116Nof_c3 ;
   private String[] P054G2_A11122Nof_scs ;
   private boolean[] P054G2_n11122Nof_scs ;
   private java.math.BigDecimal[] P054G2_A11405Nof_humeda ;
   private boolean[] P054G2_n11405Nof_humeda ;
   private String[] P054G2_A11123Nof_scc ;
   private boolean[] P054G2_n11123Nof_scc ;
   private String[] P054G2_A11424Nof_obs7 ;
   private boolean[] P054G2_n11424Nof_obs7 ;
   private String[] P054G2_A11124Nof_c6 ;
   private boolean[] P054G2_n11124Nof_c6 ;
   private byte[] P054G2_A11128Nof_ccp ;
   private boolean[] P054G2_n11128Nof_ccp ;
   private byte[] P054G2_A11129Nof_cct ;
   private boolean[] P054G2_n11129Nof_cct ;
   private String[] P054G2_A11130Nof_ccpc ;
   private boolean[] P054G2_n11130Nof_ccpc ;
   private String[] P054G2_A11131Nof_cctq ;
   private boolean[] P054G2_n11131Nof_cctq ;
   private String[] P054G2_A11127Nof_cctet ;
   private boolean[] P054G2_n11127Nof_cctet ;
   private String[] P054G2_A11134Nof_ccmc1 ;
   private boolean[] P054G2_n11134Nof_ccmc1 ;
   private String[] P054G2_A11135Nof_ccmc2 ;
   private boolean[] P054G2_n11135Nof_ccmc2 ;
   private String[] P054G2_A11136Nof_ccmc3 ;
   private boolean[] P054G2_n11136Nof_ccmc3 ;
   private String[] P054G2_A11137Nof_ccmc4 ;
   private boolean[] P054G2_n11137Nof_ccmc4 ;
   private String[] P054G2_A11138Nof_ccmc5 ;
   private boolean[] P054G2_n11138Nof_ccmc5 ;
   private String[] P054G2_A11139Nof_ccmc6 ;
   private boolean[] P054G2_n11139Nof_ccmc6 ;
   private String[] P054G2_A11133Nof_ccec ;
   private boolean[] P054G2_n11133Nof_ccec ;
   private String[] P054G2_A11132Nof_cccc ;
   private boolean[] P054G2_n11132Nof_cccc ;
   private String[] P054G2_A11168Nof_Lbta ;
   private boolean[] P054G2_n11168Nof_Lbta ;
   private String[] P054G2_A11425Nof_obs8 ;
   private boolean[] P054G2_n11425Nof_obs8 ;
   private String[] P054G2_A11140Nof_c7 ;
   private boolean[] P054G2_n11140Nof_c7 ;
   private String[] P054G2_A11147Nof_rb3 ;
   private boolean[] P054G2_n11147Nof_rb3 ;
   private String[] P054G2_A11146Nof_rb1 ;
   private boolean[] P054G2_n11146Nof_rb1 ;
   private String[] P054G2_A11142Nof_rbi ;
   private boolean[] P054G2_n11142Nof_rbi ;
   private String[] P054G2_A11144Nof_rbp ;
   private boolean[] P054G2_n11144Nof_rbp ;
   private String[] P054G2_A11143Nof_rbe ;
   private boolean[] P054G2_n11143Nof_rbe ;
   private String[] P054G2_A11426Nof_obs9 ;
   private boolean[] P054G2_n11426Nof_obs9 ;
   private String[] P054G2_A11148Nof_c8 ;
   private boolean[] P054G2_n11148Nof_c8 ;
   private String[] P054G2_A11149Nof_ep1 ;
   private boolean[] P054G2_n11149Nof_ep1 ;
   private String[] P054G2_A11151Nof_ep3 ;
   private boolean[] P054G2_n11151Nof_ep3 ;
   private String[] P054G2_A11152Nof_ep4 ;
   private boolean[] P054G2_n11152Nof_ep4 ;
   private String[] P054G2_A11153Nof_ep5 ;
   private boolean[] P054G2_n11153Nof_ep5 ;
   private String[] P054G2_A11150Nof_ep2 ;
   private boolean[] P054G2_n11150Nof_ep2 ;
   private String[] P054G2_A11156Nof_ep8 ;
   private boolean[] P054G2_n11156Nof_ep8 ;
   private String[] P054G2_A11154Nof_ep6 ;
   private boolean[] P054G2_n11154Nof_ep6 ;
   private String[] P054G2_A11155Nof_ep7 ;
   private boolean[] P054G2_n11155Nof_ep7 ;
   private String[] P054G2_A11157Nof_ep9 ;
   private boolean[] P054G2_n11157Nof_ep9 ;
   private String[] P054G2_A11158Nof_ep10 ;
   private boolean[] P054G2_n11158Nof_ep10 ;
   private String[] P054G2_A11427Nof_obs10 ;
   private boolean[] P054G2_n11427Nof_obs10 ;
   private String[] P054G2_A11159Nof_c9 ;
   private boolean[] P054G2_n11159Nof_c9 ;
   private byte[] P054G2_A11709Nof_nc ;
   private boolean[] P054G2_n11709Nof_nc ;
   private String[] P054G2_A11160Nof_sa1 ;
   private boolean[] P054G2_n11160Nof_sa1 ;
   private String[] P054G2_A11161Nof_sa2 ;
   private boolean[] P054G2_n11161Nof_sa2 ;
   private String[] P054G2_A11162Nof_sa3 ;
   private boolean[] P054G2_n11162Nof_sa3 ;
   private String[] P054G2_A11163Nof_sa4 ;
   private boolean[] P054G2_n11163Nof_sa4 ;
   private String[] P054G2_A11164Nof_sa5 ;
   private boolean[] P054G2_n11164Nof_sa5 ;
   private String[] P054G2_A11165Nof_sa6 ;
   private boolean[] P054G2_n11165Nof_sa6 ;
   private String[] P054G2_A11428Nof_obs11 ;
   private boolean[] P054G2_n11428Nof_obs11 ;
   private String[] P054G2_A11166Nof_c10 ;
   private boolean[] P054G2_n11166Nof_c10 ;
}

final  class pfictec2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P054G2", "SELECT EmprCod, Nof_Hdr, Nof_r, Nof_p, Nof_stk, Nof_obs1, Nof_c11, Nof_obs3, Nof_c2, Nof_bob, Nof_boe, Nof_enc, Nof_Bov, Nof_obs4, Nof_c3, Nof_scs, Nof_humeda, Nof_scc, Nof_obs7, Nof_c6, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cctet, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_ccec, Nof_cccc, Nof_Lbta, Nof_obs8, Nof_c7, Nof_rb3, Nof_rb1, Nof_rbi, Nof_rbp, Nof_rbe, Nof_obs9, Nof_c8, Nof_ep1, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep2, Nof_ep8, Nof_ep6, Nof_ep7, Nof_ep9, Nof_ep10, Nof_obs10, Nof_c9, Nof_nc, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_obs11, Nof_c10 FROM TXPNOFART WHERE EmprCod = ? and Nof_Hdr = ? and Nof_r = ? and Nof_p = ? ORDER BY EmprCod, Nof_Hdr, Nof_r, Nof_p ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 40);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((byte[]) buf[106])[0] = rslt.getByte(56);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getVarchar(64);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
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
      }
   }

}

