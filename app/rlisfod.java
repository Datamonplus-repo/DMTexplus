package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rlisfod extends GXReport
{
   public rlisfod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rlisfod.class ), "" );
   }

   public rlisfod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      rlisfod.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      rlisfod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rlisfod.this.AV15PCliCod = aP1[0];
      this.aP1 = aP1;
      rlisfod.this.AV16UCliCod = aP2[0];
      this.aP2 = aP2;
      rlisfod.this.AV17PSerie = aP3[0];
      this.aP3 = aP3;
      rlisfod.this.AV18USerie = aP4[0];
      this.aP4 = aP4;
      rlisfod.this.AV19PDibCli = aP5[0];
      this.aP5 = aP5;
      rlisfod.this.AV20UDibCli = aP6[0];
      this.aP6 = aP6;
      rlisfod.this.AV21PDibInt = aP7[0];
      this.aP7 = aP7;
      rlisfod.this.AV22UDibInt = aP8[0];
      this.aP8 = aP8;
      rlisfod.this.AV23PColCom = aP9[0];
      this.aP9 = aP9;
      rlisfod.this.AV24UColCom = aP10[0];
      this.aP10 = aP10;
      rlisfod.this.AV25PColFon = aP11[0];
      this.aP11 = aP11;
      rlisfod.this.AV26UColFon = aP12[0];
      this.aP12 = aP12;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LISTADO DE FORMULAS DIBUJO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV54EstCob = (byte)(0) ;
         GXv_int1[0] = AV54EstCob ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTCOB", ""), GXv_int1) ;
         rlisfod.this.AV54EstCob = GXv_int1[0] ;
         GXt_int2 = (byte)(DecimalUtil.decToDouble(AV69Artextil)) ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
         rlisfod.this.GXt_int2 = GXv_int1[0] ;
         AV69Artextil = DecimalUtil.doubleToDec(GXt_int2) ;
         GXt_int2 = AV78Eliot ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int1) ;
         rlisfod.this.GXt_int2 = GXv_int1[0] ;
         AV78Eliot = GXt_int2 ;
         AV66Partes = (byte)(0) ;
         GXv_int1[0] = AV66Partes ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLPAS", ""), GXv_int1) ;
         rlisfod.this.AV66Partes = GXv_int1[0] ;
         GXt_char3 = AV28Lit0 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV28Lit0 = GXt_char3 ;
         GXt_char3 = AV29Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV29Lit1 = GXt_char3 ;
         GXt_char3 = AV30Lit3 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV30Lit3 = GXt_char3 ;
         GXt_char3 = AV33Lit4 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1227_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV33Lit4 = GXt_char3 ;
         GXt_char3 = AV34Lit5 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV34Lit5 = GXt_char3 ;
         GXt_char3 = AV35Lit6 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV35Lit6 = GXt_char3 ;
         GXt_char3 = AV36Lit7 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1096_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV36Lit7 = GXt_char3 ;
         GXt_char3 = AV37Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1097_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV37Lit8 = GXt_char3 ;
         GXt_char3 = AV38Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1023_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV38Lit9 = GXt_char3 ;
         GXt_char3 = AV52Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT99_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV52Lit10 = GXt_char3 ;
         GXt_char3 = AV40Lit11 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV40Lit11 = GXt_char3 ;
         GXt_char3 = AV41Lit12 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1052_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV41Lit12 = GXt_char3 ;
         GXt_char3 = AV42Lit13 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1180_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV42Lit13 = GXt_char3 ;
         GXt_char3 = AV43Lit14 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT111_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV43Lit14 = GXt_char3 ;
         GXt_char3 = AV44Lit15 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT663_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV44Lit15 = GXt_char3 ;
         GXt_char3 = AV45Lit16 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN450_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV45Lit16 = GXt_char3 ;
         GXt_char3 = AV46Lit17 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN288_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV46Lit17 = GXt_char3 ;
         GXt_char3 = AV47Lit18 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV47Lit18 = GXt_char3 ;
         GXt_char3 = AV48Lit19 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT112_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV48Lit19 = GXt_char3 ;
         GXt_char3 = AV49Lit20 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV49Lit20 = GXt_char3 ;
         GXt_char3 = AV50Lit21 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV50Lit21 = GXt_char3 ;
         GXt_char3 = AV51Lit22 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV51Lit22 = GXt_char3 ;
         GXt_char3 = AV53lIT23 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT667_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV53lIT23 = GXt_char3 ;
         GXt_char3 = AV56Lit24 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV56Lit24 = GXt_char3 ;
         GXt_char3 = AV57Lit25 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "NCL0001_", ""), (byte)(99), GXv_char4) ;
         rlisfod.this.GXt_char3 = GXv_char4[0] ;
         AV57Lit25 = GXt_char3 ;
         AV61Lit26 = httpContext.getMessage( "%Cob.", "") ;
         AV65Lit27 = "" ;
         if ( AV66Partes == 1 )
         {
            GXt_char3 = AV65Lit27 ;
            GXv_char4[0] = GXt_char3 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL094_", ""), (byte)(99), GXv_char4) ;
            rlisfod.this.GXt_char3 = GXv_char4[0] ;
            AV65Lit27 = GXt_char3 ;
         }
         /* Using cursor P06JM2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06JM2_A407EmprNom[0] ;
            n407EmprNom = P06JM2_n407EmprNom[0] ;
            AV31NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06JM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15PCliCod), AV17PSerie, AV19PDibCli, Integer.valueOf(AV21PDibInt), AV23PColCom, AV25PColFon, AV18USerie, AV20UDibCli, Integer.valueOf(AV22UDibInt), AV24UColCom, AV26UColFon, Integer.valueOf(AV16UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A583IntCod = P06JM3_A583IntCod[0] ;
            n583IntCod = P06JM3_n583IntCod[0] ;
            A2078ColFon = P06JM3_A2078ColFon[0] ;
            A2074ColCom = P06JM3_A2074ColCom[0] ;
            A1014DibInt = P06JM3_A1014DibInt[0] ;
            A1013DibCli = P06JM3_A1013DibCli[0] ;
            A2141SerEst = P06JM3_A2141SerEst[0] ;
            A252CliCod = P06JM3_A252CliCod[0] ;
            A1823DibTipMaq = P06JM3_A1823DibTipMaq[0] ;
            n1823DibTipMaq = P06JM3_n1823DibTipMaq[0] ;
            A584IntDsc = P06JM3_A584IntDsc[0] ;
            n584IntDsc = P06JM3_n584IntDsc[0] ;
            A4861DibCob = P06JM3_A4861DibCob[0] ;
            n4861DibCob = P06JM3_n4861DibCob[0] ;
            A7028ColBmp = P06JM3_A7028ColBmp[0] ;
            n7028ColBmp = P06JM3_n7028ColBmp[0] ;
            A2076ColEstMba = P06JM3_A2076ColEstMba[0] ;
            n2076ColEstMba = P06JM3_n2076ColEstMba[0] ;
            A2079ColMolCil = P06JM3_A2079ColMolCil[0] ;
            n2079ColMolCil = P06JM3_n2079ColMolCil[0] ;
            A279CliNom = P06JM3_A279CliNom[0] ;
            A2075ColEstAnh = P06JM3_A2075ColEstAnh[0] ;
            n2075ColEstAnh = P06JM3_n2075ColEstAnh[0] ;
            A279CliNom = P06JM3_A279CliNom[0] ;
            A584IntDsc = P06JM3_A584IntDsc[0] ;
            n584IntDsc = P06JM3_n584IntDsc[0] ;
            A1823DibTipMaq = P06JM3_A1823DibTipMaq[0] ;
            n1823DibTipMaq = P06JM3_n1823DibTipMaq[0] ;
            A4861DibCob = P06JM3_A4861DibCob[0] ;
            n4861DibCob = P06JM3_n4861DibCob[0] ;
            A2075ColEstAnh = P06JM3_A2075ColEstAnh[0] ;
            n2075ColEstAnh = P06JM3_n2075ColEstAnh[0] ;
            AV55IntDsc = GXutil.substring( A584IntDsc, 1, 20) ;
            AV58DibCob = A4861DibCob ;
            AV76ColFon = GXutil.trim( A2078ColFon) ;
            AV77Ctrl_l = (int)(GXutil.lval( AV76ColFon)) ;
            if ( AV77Ctrl_l == 0 )
            {
            }
            else
            {
               AV75Forcolnum = (int)(GXutil.Int( DecimalUtil.decToDouble(CommonUtil.decimalVal( AV76ColFon, ".")))) ;
            }
            GXt_char3 = AV74Forcolnom ;
            GXv_char4[0] = GXt_char3 ;
            new app.pbuscolt(remoteHandle, context).execute( A396EmprCod, AV75Forcolnum, httpContext.getMessage( "E", ""), GXv_char4) ;
            rlisfod.this.GXt_char3 = GXv_char4[0] ;
            AV74Forcolnom = GXt_char3 ;
            if ( AV54EstCob == 0 )
            {
               AV58DibCob = DecimalUtil.ZERO ;
               AV57Lit25 = "" ;
               AV61Lit26 = "" ;
            }
            AV59DibTipMaq = A1823DibTipMaq ;
            AV63CliCod = A252CliCod ;
            AV62DibCli = A1013DibCli ;
            AV64DibInt = A1014DibInt ;
            if ( GXutil.strcmp(AV59DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
            {
               GXt_char3 = AV44Lit15 ;
               GXv_char4[0] = GXt_char3 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT660_", ""), (byte)(99), GXv_char4) ;
               rlisfod.this.GXt_char3 = GXv_char4[0] ;
               AV44Lit15 = GXt_char3 ;
            }
            AV71ColBmp = GXutil.trim( A7028ColBmp) ;
            h6JM0( false, 151) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit24, "")), 7, Gx_line+72, 95, Gx_line+88, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55IntDsc, "")), 105, Gx_line+72, 252, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 105, Gx_line+2, 150, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 159, Gx_line+2, 379, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 704, Gx_line+2, 708, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2141SerEst, "")), 105, Gx_line+20, 223, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2075ColEstAnh), "ZZ9")), 715, Gx_line+2, 738, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 704, Gx_line+20, 708, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 704, Gx_line+36, 708, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1013DibCli, "")), 105, Gx_line+38, 223, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2079ColMolCil), "ZZZ9")), 715, Gx_line+20, 745, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 98, Gx_line+55, 102, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1823DibTipMaq, "")), 715, Gx_line+36, 723, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 321, Gx_line+55, 325, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 704, Gx_line+55, 708, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2074ColCom, "")), 105, Gx_line+55, 194, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2078ColFon, "")), 328, Gx_line+55, 417, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2076ColEstMba, "ZZZZZ9.99")), 715, Gx_line+55, 782, Gx_line+72, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit11, "")), 611, Gx_line+36, 699, Gx_line+52, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit12, "")), 7, Gx_line+55, 95, Gx_line+71, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit13, "")), 230, Gx_line+55, 318, Gx_line+71, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit14, "")), 611, Gx_line+55, 699, Gx_line+71, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit15, "")), 6, Gx_line+124, 70, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit16, "")), 224, Gx_line+124, 280, Gx_line+140, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit17, "")), 295, Gx_line+107, 343, Gx_line+123, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit18, "")), 295, Gx_line+124, 343, Gx_line+140, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit5, "")), 7, Gx_line+2, 95, Gx_line+18, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit6, "")), 7, Gx_line+20, 95, Gx_line+36, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit7, "")), 7, Gx_line+38, 95, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit9, "")), 611, Gx_line+2, 699, Gx_line+18, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 98, Gx_line+2, 102, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 98, Gx_line+20, 102, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 98, Gx_line+38, 102, Gx_line+54, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit10, "")), 611, Gx_line+20, 699, Gx_line+36, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit19, "")), 349, Gx_line+124, 385, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit20, "")), 391, Gx_line+124, 457, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit21, "")), 713, Gx_line+124, 779, Gx_line+140, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 98, Gx_line+72, 102, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53lIT23, "")), 675, Gx_line+124, 697, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+142, 174, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+142, 343, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(391, Gx_line+142, 668, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(675, Gx_line+142, 697, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(711, Gx_line+142, 784, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(224, Gx_line+142, 280, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4861DibCob, "ZZ9.99")), 715, Gx_line+72, 760, Gx_line+89, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit25, "")), 553, Gx_line+72, 699, Gx_line+88, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(174, Gx_line+142, 217, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit26, "")), 181, Gx_line+124, 216, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(349, Gx_line+142, 385, Gx_line+142, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit27, "")), 628, Gx_line+124, 668, Gx_line+140, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 702, Gx_line+72, 706, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")), 328, Gx_line+36, 387, Gx_line+53, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 321, Gx_line+36, 325, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit8, "")), 230, Gx_line+36, 318, Gx_line+52, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Forcolnom, "")), 425, Gx_line+55, 521, Gx_line+72, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+151) ;
            /* Using cursor P06JM4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4420MolCol = P06JM4_A4420MolCol[0] ;
               n4420MolCol = P06JM4_n4420MolCol[0] ;
               A8052Dg_codigo = P06JM4_A8052Dg_codigo[0] ;
               n8052Dg_codigo = P06JM4_n8052Dg_codigo[0] ;
               A8053Dg_Desc = P06JM4_A8053Dg_Desc[0] ;
               n8053Dg_Desc = P06JM4_n8053Dg_Desc[0] ;
               A2648MolForEst = P06JM4_A2648MolForEst[0] ;
               n2648MolForEst = P06JM4_n2648MolForEst[0] ;
               A2650MolPesMin = P06JM4_A2650MolPesMin[0] ;
               n2650MolPesMin = P06JM4_n2650MolPesMin[0] ;
               A2100MolCon = P06JM4_A2100MolCon[0] ;
               n2100MolCon = P06JM4_n2100MolCon[0] ;
               A2098MolCod = P06JM4_A2098MolCod[0] ;
               A8054Dg_Degr = P06JM4_A8054Dg_Degr[0] ;
               n8054Dg_Degr = P06JM4_n8054Dg_Degr[0] ;
               A8053Dg_Desc = P06JM4_A8053Dg_Desc[0] ;
               n8053Dg_Desc = P06JM4_n8053Dg_Desc[0] ;
               A8054Dg_Degr = P06JM4_A8054Dg_Degr[0] ;
               n8054Dg_Degr = P06JM4_n8054Dg_Degr[0] ;
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  A2101MolDib = getMolDib0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
               }
               else
               {
                  if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A2101MolDib = getMolDib1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
                  }
                  else
                  {
                     A2101MolDib = "" ;
                  }
               }
               if ( A8054Dg_Degr == 0 )
               {
                  A8055Dg_Valor = (short)(1) ;
               }
               else
               {
                  if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
                  {
                     A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
                  }
                  else
                  {
                     if ( A8054Dg_Degr > 9 )
                     {
                        A8055Dg_Valor = A8054Dg_Degr ;
                     }
                     else
                     {
                        A8055Dg_Valor = (short)(0) ;
                     }
                  }
               }
               if ( AV54EstCob == 1 )
               {
                  AV73MolCod = A2098MolCod ;
                  /* Execute user subroutine: 'CILINDRO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
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
               }
               AV83Texto_l = " " ;
               if ( AV82DibIntSp > 0 )
               {
                  AV83Texto_l = httpContext.getMessage( "Dib Origen = ", "") + GXutil.str( AV82DibIntSp, 8, 0) ;
               }
               if ( AV69Artextil.doubleValue() == 1 )
               {
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int5[0] = 1 ;
                  GXv_char6[0] = A4420MolCol ;
                  GXv_char7[0] = AV70EstColDsc ;
                  GXv_int8[0] = AV84EstColRGB ;
                  new app.pestcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8) ;
                  rlisfod.this.A396EmprCod = GXv_char4[0] ;
                  rlisfod.this.A4420MolCol = GXv_char6[0] ;
                  rlisfod.this.AV70EstColDsc = GXv_char7[0] ;
                  rlisfod.this.AV84EstColRGB = GXv_int8[0] ;
               }
               else
               {
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int5[0] = A252CliCod ;
                  GXv_char6[0] = A4420MolCol ;
                  GXv_char4[0] = AV70EstColDsc ;
                  GXv_int8[0] = AV84EstColRGB ;
                  new app.pestcoldsc(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_char6, GXv_char4, GXv_int8) ;
                  rlisfod.this.A396EmprCod = GXv_char7[0] ;
                  rlisfod.this.A252CliCod = GXv_int5[0] ;
                  rlisfod.this.A4420MolCol = GXv_char6[0] ;
                  rlisfod.this.AV70EstColDsc = GXv_char4[0] ;
                  rlisfod.this.AV84EstColRGB = GXv_int8[0] ;
               }
               if ( A8052Dg_codigo > 0 )
               {
                  h6JM0( false, 54) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9")), 7, Gx_line+0, 23, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2100MolCon, "ZZZZZ9.99")), 224, Gx_line+0, 280, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2650MolPesMin, "ZZZZZ9.99")), 295, Gx_line+0, 343, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2648MolForEst, "")), 364, Gx_line+0, 372, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2101MolDib, "")), 29, Gx_line+0, 176, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60DibPorCob, "ZZ9.99")), 173, Gx_line+0, 218, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4420MolCol, "")), 7, Gx_line+18, 154, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70EstColDsc, "")), 158, Gx_line+18, 378, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8055Dg_Valor), "ZZZ9")), 417, Gx_line+35, 447, Gx_line+52, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8053Dg_Desc, "")), 7, Gx_line+35, 300, Gx_line+52, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor a degradar:", ""), 311, Gx_line+36, 413, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Texto_l, "")), 572, Gx_line+35, 755, Gx_line+52, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+54) ;
               }
               else
               {
                  h6JM0( false, 35) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9")), 7, Gx_line+0, 23, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2100MolCon, "ZZZZZ9.99")), 224, Gx_line+0, 280, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2650MolPesMin, "ZZZZZ9.99")), 295, Gx_line+0, 343, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2648MolForEst, "")), 364, Gx_line+0, 372, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2101MolDib, "")), 34, Gx_line+0, 181, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60DibPorCob, "ZZ9.99")), 173, Gx_line+0, 218, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4420MolCol, "")), 7, Gx_line+18, 154, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70EstColDsc, "")), 164, Gx_line+18, 384, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Texto_l, "")), 572, Gx_line+18, 755, Gx_line+35, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+35) ;
               }
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               AV72SaveLine = DecimalUtil.doubleToDec(Gx_line+32) ;
               AV79Tot_p = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P06JM5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A6046PrdForPar = P06JM5_A6046PrdForPar[0] ;
                  n6046PrdForPar = P06JM5_n6046PrdForPar[0] ;
                  A2116PrdForCan = P06JM5_A2116PrdForCan[0] ;
                  n2116PrdForCan = P06JM5_n2116PrdForCan[0] ;
                  A2144UniEstCod = P06JM5_A2144UniEstCod[0] ;
                  n2144UniEstCod = P06JM5_n2144UniEstCod[0] ;
                  A718PrdNom = P06JM5_A718PrdNom[0] ;
                  A719PrdNum = P06JM5_A719PrdNum[0] ;
                  n719PrdNum = P06JM5_n719PrdNum[0] ;
                  A2535ForPrdLin = P06JM5_A2535ForPrdLin[0] ;
                  A718PrdNom = P06JM5_A718PrdNom[0] ;
                  if ( AV66Partes == 1 )
                  {
                     h6JM0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 391, Gx_line+0, 436, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 441, Gx_line+0, 632, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 676, Gx_line+0, 699, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2116PrdForCan, "ZZZZZ9.999")), 706, Gx_line+0, 780, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6046PrdForPar), "ZZ9")), 646, Gx_line+0, 669, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h6JM0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 391, Gx_line+0, 436, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 441, Gx_line+0, 632, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 675, Gx_line+0, 698, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2116PrdForCan, "ZZZZZ9.999")), 706, Gx_line+0, 780, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  AV79Tot_p = AV79Tot_p.add(A2116PrdForCan) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               /* Using cursor P06JM6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A6043PasForPar = P06JM6_A6043PasForPar[0] ;
                  n6043PasForPar = P06JM6_n6043PasForPar[0] ;
                  A2109PasForCan = P06JM6_A2109PasForCan[0] ;
                  n2109PasForCan = P06JM6_n2109PasForCan[0] ;
                  A2144UniEstCod = P06JM6_A2144UniEstCod[0] ;
                  n2144UniEstCod = P06JM6_n2144UniEstCod[0] ;
                  A2108PasDsc = P06JM6_A2108PasDsc[0] ;
                  n2108PasDsc = P06JM6_n2108PasDsc[0] ;
                  A2107PasCod = P06JM6_A2107PasCod[0] ;
                  n2107PasCod = P06JM6_n2107PasCod[0] ;
                  A2654PasForLin = P06JM6_A2654PasForLin[0] ;
                  A2108PasDsc = P06JM6_A2108PasDsc[0] ;
                  n2108PasDsc = P06JM6_n2108PasDsc[0] ;
                  if ( AV66Partes == 1 )
                  {
                     h6JM0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 391, Gx_line+0, 436, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 441, Gx_line+0, 632, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 675, Gx_line+0, 698, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2109PasForCan, "ZZZZZ9.999")), 706, Gx_line+0, 780, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6043PasForPar), "ZZ9")), 646, Gx_line+0, 669, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     if ( AV78Eliot == 0 )
                     {
                        h6JM0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 391, Gx_line+0, 436, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 441, Gx_line+0, 632, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 675, Gx_line+0, 698, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2109PasForCan, "ZZZZZ9.999")), 706, Gx_line+0, 780, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        AV80Tot_pasta = DecimalUtil.doubleToDec(1000).subtract(AV79Tot_p) ;
                        if ( ( AV80Tot_pasta.doubleValue() == 1000 ) && ( AV79Tot_p.doubleValue() > 0 ) )
                        {
                           AV81Uniestcod = A2144UniEstCod ;
                        }
                        else
                        {
                           AV81Uniestcod = httpContext.getMessage( "GRS", "") ;
                        }
                        h6JM0( false, 18) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 391, Gx_line+0, 436, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 441, Gx_line+0, 632, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Uniestcod, "@!")), 675, Gx_line+0, 698, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80Tot_pasta, "ZZZZZ9.999")), 706, Gx_line+0, 780, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+18) ;
                     }
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               if ( Gx_line < AV72SaveLine.doubleValue() )
               {
                  Gx_line = (int)(DecimalUtil.decToDouble(AV72SaveLine)) ;
               }
               h6JM0( false, 8) ;
               getPrinter().GxDrawLine(218, Gx_line+3, 784, Gx_line+3, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+8) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6JM0( false, 17) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV32Flag = (byte)(0) ;
            /* Using cursor P06JM7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A2096ForObsTxt = P06JM7_A2096ForObsTxt[0] ;
               n2096ForObsTxt = P06JM7_n2096ForObsTxt[0] ;
               A2095ForObsLin = P06JM7_A2095ForObsLin[0] ;
               if ( (0==AV32Flag) )
               {
                  h6JM0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2096ForObsTxt, "")), 115, Gx_line+0, 408, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit22, "")), 0, Gx_line+0, 102, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 107, Gx_line+0, 111, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV32Flag = (byte)(1) ;
               }
               else
               {
                  h6JM0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2096ForObsTxt, "")), 115, Gx_line+0, 408, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6JM0( true, 0) ;
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
      /* 'CILINDRO' Routine */
      returnInSub = false ;
      AV60DibPorCob = DecimalUtil.ZERO ;
      AV82DibIntSp = 0 ;
      if ( GXutil.strcmp(AV59DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
      {
         /* Using cursor P06JM8 */
         pr_default.execute(6, new Object[] {A396EmprCod, AV62DibCli, Integer.valueOf(AV63CliCod), Integer.valueOf(AV64DibInt), Byte.valueOf(AV73MolCod), Integer.valueOf(AV15PCliCod), Integer.valueOf(AV16UCliCod), AV19PDibCli, AV20UDibCli, Integer.valueOf(AV21PDibInt), Integer.valueOf(AV22UDibInt)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A1029DibLin = P06JM8_A1029DibLin[0] ;
            A1014DibInt = P06JM8_A1014DibInt[0] ;
            A252CliCod = P06JM8_A252CliCod[0] ;
            A1013DibCli = P06JM8_A1013DibCli[0] ;
            A5381DibPrcCobM = P06JM8_A5381DibPrcCobM[0] ;
            n5381DibPrcCobM = P06JM8_n5381DibPrcCobM[0] ;
            AV60DibPorCob = A5381DibPrcCobM ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      else
      {
         /* Using cursor P06JM9 */
         pr_default.execute(7, new Object[] {A396EmprCod, AV62DibCli, Integer.valueOf(AV63CliCod), Integer.valueOf(AV64DibInt), Byte.valueOf(AV73MolCod), Integer.valueOf(AV15PCliCod), Integer.valueOf(AV16UCliCod), AV19PDibCli, AV20UDibCli, Integer.valueOf(AV21PDibInt), Integer.valueOf(AV22UDibInt)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A1807DibLinCil = P06JM9_A1807DibLinCil[0] ;
            A1014DibInt = P06JM9_A1014DibInt[0] ;
            A252CliCod = P06JM9_A252CliCod[0] ;
            A1013DibCli = P06JM9_A1013DibCli[0] ;
            A4860DibPrcCob = P06JM9_A4860DibPrcCob[0] ;
            n4860DibPrcCob = P06JM9_n4860DibPrcCob[0] ;
            A8658DibIntSp = P06JM9_A8658DibIntSp[0] ;
            n8658DibIntSp = P06JM9_n8658DibIntSp[0] ;
            AV60DibPorCob = A4860DibPrcCob ;
            AV82DibIntSp = A8658DibIntSp ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void h6JM0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 528, Gx_line+13, 536, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 691, Gx_line+13, 699, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31NomEmp, "")), 6, Gx_line+13, 225, Gx_line+29, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit0, "")), 484, Gx_line+13, 520, Gx_line+29, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 535, Gx_line+13, 594, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit1, "")), 645, Gx_line+13, 674, Gx_line+29, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 701, Gx_line+13, 760, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 692, Gx_line+41, 700, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit3, "")), 646, Gx_line+41, 690, Gx_line+57, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 709, Gx_line+41, 754, Gx_line+58, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+6, 780, Gx_line+6, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+61, 780, Gx_line+61, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Pgmname, "")), 486, Gx_line+41, 643, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit4, "")), 6, Gx_line+41, 164, Gx_line+57, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+78) ;
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
      this.aP0[0] = rlisfod.this.A396EmprCod;
      this.aP1[0] = rlisfod.this.AV15PCliCod;
      this.aP2[0] = rlisfod.this.AV16UCliCod;
      this.aP3[0] = rlisfod.this.AV17PSerie;
      this.aP4[0] = rlisfod.this.AV18USerie;
      this.aP5[0] = rlisfod.this.AV19PDibCli;
      this.aP6[0] = rlisfod.this.AV20UDibCli;
      this.aP7[0] = rlisfod.this.AV21PDibInt;
      this.aP8[0] = rlisfod.this.AV22UDibInt;
      this.aP9[0] = rlisfod.this.AV23PColCom;
      this.aP10[0] = rlisfod.this.AV24UColCom;
      this.aP11[0] = rlisfod.this.AV25PColFon;
      this.aP12[0] = rlisfod.this.AV26UColFon;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public String getMolDib1( byte E2098MolCod ,
                             String E396EmprCod ,
                             String E1013DibCli ,
                             int E252CliCod ,
                             int E1014DibInt )
   {
      X1030DibRelMC = "" ;
      Gx_first = true ;
      /* Using cursor P06JM10 */
      pr_default.execute(8, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         if ( ( ( P06JM10_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X1030DibRelMC = P06JM10_A1030DibRelMC[0] ;
            nX1030DibRelMC = false ;
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      return X1030DibRelMC ;
   }

   public String getMolDib0( byte E2098MolCod ,
                             String E396EmprCod ,
                             String E1013DibCli ,
                             int E252CliCod ,
                             int E1014DibInt )
   {
      X2092DibRelMC2 = "" ;
      Gx_first = true ;
      /* Using cursor P06JM11 */
      pr_default.execute(9, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         if ( ( ( P06JM11_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X2092DibRelMC2 = P06JM11_A2092DibRelMC2[0] ;
            nX2092DibRelMC2 = false ;
            if (true) break;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
      return X2092DibRelMC2 ;
   }

   public void initialize( )
   {
      AV69Artextil = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV28Lit0 = "" ;
      AV29Lit1 = "" ;
      AV30Lit3 = "" ;
      AV33Lit4 = "" ;
      AV34Lit5 = "" ;
      AV35Lit6 = "" ;
      AV36Lit7 = "" ;
      AV37Lit8 = "" ;
      AV38Lit9 = "" ;
      AV52Lit10 = "" ;
      AV40Lit11 = "" ;
      AV41Lit12 = "" ;
      AV42Lit13 = "" ;
      AV43Lit14 = "" ;
      AV44Lit15 = "" ;
      AV45Lit16 = "" ;
      AV46Lit17 = "" ;
      AV47Lit18 = "" ;
      AV48Lit19 = "" ;
      AV49Lit20 = "" ;
      AV50Lit21 = "" ;
      AV51Lit22 = "" ;
      AV53lIT23 = "" ;
      AV56Lit24 = "" ;
      AV57Lit25 = "" ;
      AV61Lit26 = "" ;
      AV65Lit27 = "" ;
      scmdbuf = "" ;
      P06JM2_A396EmprCod = new String[] {""} ;
      P06JM2_A407EmprNom = new String[] {""} ;
      P06JM2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV31NomEmp = "" ;
      P06JM3_A65ArtCod = new String[] {""} ;
      P06JM3_A583IntCod = new byte[1] ;
      P06JM3_n583IntCod = new boolean[] {false} ;
      P06JM3_A396EmprCod = new String[] {""} ;
      P06JM3_A2078ColFon = new String[] {""} ;
      P06JM3_A2074ColCom = new String[] {""} ;
      P06JM3_A1014DibInt = new int[1] ;
      P06JM3_A1013DibCli = new String[] {""} ;
      P06JM3_A2141SerEst = new String[] {""} ;
      P06JM3_A252CliCod = new int[1] ;
      P06JM3_A1823DibTipMaq = new String[] {""} ;
      P06JM3_n1823DibTipMaq = new boolean[] {false} ;
      P06JM3_A584IntDsc = new String[] {""} ;
      P06JM3_n584IntDsc = new boolean[] {false} ;
      P06JM3_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM3_n4861DibCob = new boolean[] {false} ;
      P06JM3_A7028ColBmp = new String[] {""} ;
      P06JM3_n7028ColBmp = new boolean[] {false} ;
      P06JM3_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM3_n2076ColEstMba = new boolean[] {false} ;
      P06JM3_A2079ColMolCil = new short[1] ;
      P06JM3_n2079ColMolCil = new boolean[] {false} ;
      P06JM3_A279CliNom = new String[] {""} ;
      P06JM3_A2075ColEstAnh = new short[1] ;
      P06JM3_n2075ColEstAnh = new boolean[] {false} ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      A1823DibTipMaq = "" ;
      A584IntDsc = "" ;
      A4861DibCob = DecimalUtil.ZERO ;
      A7028ColBmp = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV55IntDsc = "" ;
      AV58DibCob = DecimalUtil.ZERO ;
      AV76ColFon = "" ;
      AV74Forcolnom = "" ;
      AV59DibTipMaq = "" ;
      AV62DibCli = "" ;
      GXt_char3 = "" ;
      AV71ColBmp = "" ;
      P06JM4_A396EmprCod = new String[] {""} ;
      P06JM4_A252CliCod = new int[1] ;
      P06JM4_A2141SerEst = new String[] {""} ;
      P06JM4_A1013DibCli = new String[] {""} ;
      P06JM4_A1014DibInt = new int[1] ;
      P06JM4_A2074ColCom = new String[] {""} ;
      P06JM4_A2078ColFon = new String[] {""} ;
      P06JM4_A4420MolCol = new String[] {""} ;
      P06JM4_n4420MolCol = new boolean[] {false} ;
      P06JM4_A8052Dg_codigo = new short[1] ;
      P06JM4_n8052Dg_codigo = new boolean[] {false} ;
      P06JM4_A8053Dg_Desc = new String[] {""} ;
      P06JM4_n8053Dg_Desc = new boolean[] {false} ;
      P06JM4_A2648MolForEst = new String[] {""} ;
      P06JM4_n2648MolForEst = new boolean[] {false} ;
      P06JM4_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM4_n2650MolPesMin = new boolean[] {false} ;
      P06JM4_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM4_n2100MolCon = new boolean[] {false} ;
      P06JM4_A2098MolCod = new byte[1] ;
      P06JM4_A8054Dg_Degr = new short[1] ;
      P06JM4_n8054Dg_Degr = new boolean[] {false} ;
      A4420MolCol = "" ;
      A8053Dg_Desc = "" ;
      A2648MolForEst = "" ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      A2100MolCon = DecimalUtil.ZERO ;
      A2101MolDib = "" ;
      AV83Texto_l = "" ;
      AV70EstColDsc = "" ;
      GXv_char7 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new long[1] ;
      AV60DibPorCob = DecimalUtil.ZERO ;
      AV72SaveLine = DecimalUtil.ZERO ;
      AV79Tot_p = DecimalUtil.ZERO ;
      P06JM5_A396EmprCod = new String[] {""} ;
      P06JM5_A252CliCod = new int[1] ;
      P06JM5_A2141SerEst = new String[] {""} ;
      P06JM5_A1013DibCli = new String[] {""} ;
      P06JM5_A1014DibInt = new int[1] ;
      P06JM5_A2074ColCom = new String[] {""} ;
      P06JM5_A2078ColFon = new String[] {""} ;
      P06JM5_A2098MolCod = new byte[1] ;
      P06JM5_A6046PrdForPar = new short[1] ;
      P06JM5_n6046PrdForPar = new boolean[] {false} ;
      P06JM5_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM5_n2116PrdForCan = new boolean[] {false} ;
      P06JM5_A2144UniEstCod = new String[] {""} ;
      P06JM5_n2144UniEstCod = new boolean[] {false} ;
      P06JM5_A718PrdNom = new String[] {""} ;
      P06JM5_A719PrdNum = new String[] {""} ;
      P06JM5_n719PrdNum = new boolean[] {false} ;
      P06JM5_A2535ForPrdLin = new short[1] ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      P06JM6_A396EmprCod = new String[] {""} ;
      P06JM6_A252CliCod = new int[1] ;
      P06JM6_A2141SerEst = new String[] {""} ;
      P06JM6_A1013DibCli = new String[] {""} ;
      P06JM6_A1014DibInt = new int[1] ;
      P06JM6_A2074ColCom = new String[] {""} ;
      P06JM6_A2078ColFon = new String[] {""} ;
      P06JM6_A2098MolCod = new byte[1] ;
      P06JM6_A6043PasForPar = new short[1] ;
      P06JM6_n6043PasForPar = new boolean[] {false} ;
      P06JM6_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM6_n2109PasForCan = new boolean[] {false} ;
      P06JM6_A2144UniEstCod = new String[] {""} ;
      P06JM6_n2144UniEstCod = new boolean[] {false} ;
      P06JM6_A2108PasDsc = new String[] {""} ;
      P06JM6_n2108PasDsc = new boolean[] {false} ;
      P06JM6_A2107PasCod = new String[] {""} ;
      P06JM6_n2107PasCod = new boolean[] {false} ;
      P06JM6_A2654PasForLin = new short[1] ;
      A2109PasForCan = DecimalUtil.ZERO ;
      A2108PasDsc = "" ;
      A2107PasCod = "" ;
      AV80Tot_pasta = DecimalUtil.ZERO ;
      AV81Uniestcod = "" ;
      P06JM7_A396EmprCod = new String[] {""} ;
      P06JM7_A252CliCod = new int[1] ;
      P06JM7_A2141SerEst = new String[] {""} ;
      P06JM7_A1013DibCli = new String[] {""} ;
      P06JM7_A1014DibInt = new int[1] ;
      P06JM7_A2074ColCom = new String[] {""} ;
      P06JM7_A2078ColFon = new String[] {""} ;
      P06JM7_A2096ForObsTxt = new String[] {""} ;
      P06JM7_n2096ForObsTxt = new boolean[] {false} ;
      P06JM7_A2095ForObsLin = new byte[1] ;
      A2096ForObsTxt = "" ;
      P06JM8_A396EmprCod = new String[] {""} ;
      P06JM8_A1029DibLin = new short[1] ;
      P06JM8_A1014DibInt = new int[1] ;
      P06JM8_A252CliCod = new int[1] ;
      P06JM8_A1013DibCli = new String[] {""} ;
      P06JM8_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM8_n5381DibPrcCobM = new boolean[] {false} ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      P06JM9_A396EmprCod = new String[] {""} ;
      P06JM9_A1807DibLinCil = new short[1] ;
      P06JM9_A1014DibInt = new int[1] ;
      P06JM9_A252CliCod = new int[1] ;
      P06JM9_A1013DibCli = new String[] {""} ;
      P06JM9_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JM9_n4860DibPrcCob = new boolean[] {false} ;
      P06JM9_A8658DibIntSp = new int[1] ;
      P06JM9_n8658DibIntSp = new boolean[] {false} ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV92Pgmname = "" ;
      X1030DibRelMC = "" ;
      E1013DibCli = "" ;
      P06JM10_A396EmprCod = new String[] {""} ;
      P06JM10_A1013DibCli = new String[] {""} ;
      P06JM10_A252CliCod = new int[1] ;
      P06JM10_A1014DibInt = new int[1] ;
      P06JM10_A1807DibLinCil = new short[1] ;
      P06JM10_A1030DibRelMC = new String[] {""} ;
      P06JM10_n1030DibRelMC = new boolean[] {false} ;
      P06JM10_A2089DibLinMol = new byte[1] ;
      P06JM10_n2089DibLinMol = new boolean[] {false} ;
      X2092DibRelMC2 = "" ;
      P06JM11_A396EmprCod = new String[] {""} ;
      P06JM11_A1013DibCli = new String[] {""} ;
      P06JM11_A252CliCod = new int[1] ;
      P06JM11_A1014DibInt = new int[1] ;
      P06JM11_A1029DibLin = new short[1] ;
      P06JM11_A2092DibRelMC2 = new String[] {""} ;
      P06JM11_n2092DibRelMC2 = new boolean[] {false} ;
      P06JM11_A2088DibDibMol = new byte[1] ;
      P06JM11_n2088DibDibMol = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlisfod__default(),
         new Object[] {
             new Object[] {
            P06JM2_A396EmprCod, P06JM2_A407EmprNom, P06JM2_n407EmprNom
            }
            , new Object[] {
            P06JM3_A65ArtCod, P06JM3_A583IntCod, P06JM3_n583IntCod, P06JM3_A396EmprCod, P06JM3_A2078ColFon, P06JM3_A2074ColCom, P06JM3_A1014DibInt, P06JM3_A1013DibCli, P06JM3_A2141SerEst, P06JM3_A252CliCod,
            P06JM3_A1823DibTipMaq, P06JM3_n1823DibTipMaq, P06JM3_A584IntDsc, P06JM3_n584IntDsc, P06JM3_A4861DibCob, P06JM3_n4861DibCob, P06JM3_A7028ColBmp, P06JM3_n7028ColBmp, P06JM3_A2076ColEstMba, P06JM3_n2076ColEstMba,
            P06JM3_A2079ColMolCil, P06JM3_n2079ColMolCil, P06JM3_A279CliNom, P06JM3_A2075ColEstAnh, P06JM3_n2075ColEstAnh
            }
            , new Object[] {
            P06JM4_A396EmprCod, P06JM4_A252CliCod, P06JM4_A2141SerEst, P06JM4_A1013DibCli, P06JM4_A1014DibInt, P06JM4_A2074ColCom, P06JM4_A2078ColFon, P06JM4_A4420MolCol, P06JM4_n4420MolCol, P06JM4_A8052Dg_codigo,
            P06JM4_n8052Dg_codigo, P06JM4_A8053Dg_Desc, P06JM4_n8053Dg_Desc, P06JM4_A2648MolForEst, P06JM4_n2648MolForEst, P06JM4_A2650MolPesMin, P06JM4_n2650MolPesMin, P06JM4_A2100MolCon, P06JM4_n2100MolCon, P06JM4_A2098MolCod,
            P06JM4_A8054Dg_Degr, P06JM4_n8054Dg_Degr
            }
            , new Object[] {
            P06JM5_A396EmprCod, P06JM5_A252CliCod, P06JM5_A2141SerEst, P06JM5_A1013DibCli, P06JM5_A1014DibInt, P06JM5_A2074ColCom, P06JM5_A2078ColFon, P06JM5_A2098MolCod, P06JM5_A6046PrdForPar, P06JM5_n6046PrdForPar,
            P06JM5_A2116PrdForCan, P06JM5_n2116PrdForCan, P06JM5_A2144UniEstCod, P06JM5_n2144UniEstCod, P06JM5_A718PrdNom, P06JM5_A719PrdNum, P06JM5_n719PrdNum, P06JM5_A2535ForPrdLin
            }
            , new Object[] {
            P06JM6_A396EmprCod, P06JM6_A252CliCod, P06JM6_A2141SerEst, P06JM6_A1013DibCli, P06JM6_A1014DibInt, P06JM6_A2074ColCom, P06JM6_A2078ColFon, P06JM6_A2098MolCod, P06JM6_A6043PasForPar, P06JM6_n6043PasForPar,
            P06JM6_A2109PasForCan, P06JM6_n2109PasForCan, P06JM6_A2144UniEstCod, P06JM6_n2144UniEstCod, P06JM6_A2108PasDsc, P06JM6_n2108PasDsc, P06JM6_A2107PasCod, P06JM6_n2107PasCod, P06JM6_A2654PasForLin
            }
            , new Object[] {
            P06JM7_A396EmprCod, P06JM7_A252CliCod, P06JM7_A2141SerEst, P06JM7_A1013DibCli, P06JM7_A1014DibInt, P06JM7_A2074ColCom, P06JM7_A2078ColFon, P06JM7_A2096ForObsTxt, P06JM7_n2096ForObsTxt, P06JM7_A2095ForObsLin
            }
            , new Object[] {
            P06JM8_A396EmprCod, P06JM8_A1029DibLin, P06JM8_A1014DibInt, P06JM8_A252CliCod, P06JM8_A1013DibCli, P06JM8_A5381DibPrcCobM, P06JM8_n5381DibPrcCobM
            }
            , new Object[] {
            P06JM9_A396EmprCod, P06JM9_A1807DibLinCil, P06JM9_A1014DibInt, P06JM9_A252CliCod, P06JM9_A1013DibCli, P06JM9_A4860DibPrcCob, P06JM9_n4860DibPrcCob, P06JM9_A8658DibIntSp, P06JM9_n8658DibIntSp
            }
            , new Object[] {
            P06JM10_A396EmprCod, P06JM10_A1013DibCli, P06JM10_A252CliCod, P06JM10_A1014DibInt, P06JM10_A1807DibLinCil, P06JM10_A1030DibRelMC, P06JM10_n1030DibRelMC, P06JM10_A2089DibLinMol, P06JM10_n2089DibLinMol
            }
            , new Object[] {
            P06JM11_A396EmprCod, P06JM11_A1013DibCli, P06JM11_A252CliCod, P06JM11_A1014DibInt, P06JM11_A1029DibLin, P06JM11_A2092DibRelMC2, P06JM11_n2092DibRelMC2, P06JM11_A2088DibDibMol, P06JM11_n2088DibDibMol
            }
         }
      );
      AV92Pgmname = "RLISFOD" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV92Pgmname = "RLISFOD" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV54EstCob ;
   private byte AV78Eliot ;
   private byte GXt_int2 ;
   private byte AV66Partes ;
   private byte GXv_int1[] ;
   private byte A583IntCod ;
   private byte A2098MolCod ;
   private byte AV73MolCod ;
   private byte AV32Flag ;
   private byte A2095ForObsLin ;
   private byte E2098MolCod ;
   private short A2079ColMolCil ;
   private short A2075ColEstAnh ;
   private short A8052Dg_codigo ;
   private short A8054Dg_Degr ;
   private short A8055Dg_Valor ;
   private short A6046PrdForPar ;
   private short A2535ForPrdLin ;
   private short A6043PasForPar ;
   private short A2654PasForLin ;
   private short A1029DibLin ;
   private short A1807DibLinCil ;
   private short Gx_err ;
   private int AV15PCliCod ;
   private int AV16UCliCod ;
   private int AV21PDibInt ;
   private int AV22UDibInt ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int AV77Ctrl_l ;
   private int AV75Forcolnum ;
   private int AV63CliCod ;
   private int AV64DibInt ;
   private int Gx_OldLine ;
   private int AV82DibIntSp ;
   private int GXv_int5[] ;
   private int A8658DibIntSp ;
   private int E252CliCod ;
   private int E1014DibInt ;
   private long AV84EstColRGB ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV69Artextil ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal AV58DibCob ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal AV60DibPorCob ;
   private java.math.BigDecimal AV72SaveLine ;
   private java.math.BigDecimal AV79Tot_p ;
   private java.math.BigDecimal A2116PrdForCan ;
   private java.math.BigDecimal A2109PasForCan ;
   private java.math.BigDecimal AV80Tot_pasta ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private String A396EmprCod ;
   private String AV17PSerie ;
   private String AV18USerie ;
   private String AV19PDibCli ;
   private String AV20UDibCli ;
   private String AV23PColCom ;
   private String AV24UColCom ;
   private String AV25PColFon ;
   private String AV26UColFon ;
   private String AV28Lit0 ;
   private String AV29Lit1 ;
   private String AV30Lit3 ;
   private String AV33Lit4 ;
   private String AV34Lit5 ;
   private String AV35Lit6 ;
   private String AV36Lit7 ;
   private String AV37Lit8 ;
   private String AV38Lit9 ;
   private String AV52Lit10 ;
   private String AV40Lit11 ;
   private String AV41Lit12 ;
   private String AV42Lit13 ;
   private String AV43Lit14 ;
   private String AV44Lit15 ;
   private String AV45Lit16 ;
   private String AV46Lit17 ;
   private String AV47Lit18 ;
   private String AV48Lit19 ;
   private String AV49Lit20 ;
   private String AV50Lit21 ;
   private String AV51Lit22 ;
   private String AV53lIT23 ;
   private String AV56Lit24 ;
   private String AV57Lit25 ;
   private String AV61Lit26 ;
   private String AV65Lit27 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV31NomEmp ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A1823DibTipMaq ;
   private String A584IntDsc ;
   private String A7028ColBmp ;
   private String A279CliNom ;
   private String AV55IntDsc ;
   private String AV76ColFon ;
   private String AV74Forcolnom ;
   private String AV59DibTipMaq ;
   private String AV62DibCli ;
   private String GXt_char3 ;
   private String AV71ColBmp ;
   private String A4420MolCol ;
   private String A8053Dg_Desc ;
   private String A2648MolForEst ;
   private String A2101MolDib ;
   private String AV83Texto_l ;
   private String AV70EstColDsc ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String A2144UniEstCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A2108PasDsc ;
   private String A2107PasCod ;
   private String AV81Uniestcod ;
   private String A2096ForObsTxt ;
   private String Gx_time ;
   private String AV92Pgmname ;
   private String X1030DibRelMC ;
   private String E396EmprCod ;
   private String E1013DibCli ;
   private String X2092DibRelMC2 ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n583IntCod ;
   private boolean n1823DibTipMaq ;
   private boolean n584IntDsc ;
   private boolean n4861DibCob ;
   private boolean n7028ColBmp ;
   private boolean n2076ColEstMba ;
   private boolean n2079ColMolCil ;
   private boolean n2075ColEstAnh ;
   private boolean n4420MolCol ;
   private boolean n8052Dg_codigo ;
   private boolean n8053Dg_Desc ;
   private boolean n2648MolForEst ;
   private boolean n2650MolPesMin ;
   private boolean n2100MolCon ;
   private boolean n8054Dg_Degr ;
   private boolean returnInSub ;
   private boolean n6046PrdForPar ;
   private boolean n2116PrdForCan ;
   private boolean n2144UniEstCod ;
   private boolean n719PrdNum ;
   private boolean n6043PasForPar ;
   private boolean n2109PasForCan ;
   private boolean n2108PasDsc ;
   private boolean n2107PasCod ;
   private boolean n2096ForObsTxt ;
   private boolean n5381DibPrcCobM ;
   private boolean n4860DibPrcCob ;
   private boolean n8658DibIntSp ;
   private boolean Gx_first ;
   private boolean nX1030DibRelMC ;
   private boolean nX2092DibRelMC2 ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P06JM2_A396EmprCod ;
   private String[] P06JM2_A407EmprNom ;
   private boolean[] P06JM2_n407EmprNom ;
   private String[] P06JM3_A65ArtCod ;
   private byte[] P06JM3_A583IntCod ;
   private boolean[] P06JM3_n583IntCod ;
   private String[] P06JM3_A396EmprCod ;
   private String[] P06JM3_A2078ColFon ;
   private String[] P06JM3_A2074ColCom ;
   private int[] P06JM3_A1014DibInt ;
   private String[] P06JM3_A1013DibCli ;
   private String[] P06JM3_A2141SerEst ;
   private int[] P06JM3_A252CliCod ;
   private String[] P06JM3_A1823DibTipMaq ;
   private boolean[] P06JM3_n1823DibTipMaq ;
   private String[] P06JM3_A584IntDsc ;
   private boolean[] P06JM3_n584IntDsc ;
   private java.math.BigDecimal[] P06JM3_A4861DibCob ;
   private boolean[] P06JM3_n4861DibCob ;
   private String[] P06JM3_A7028ColBmp ;
   private boolean[] P06JM3_n7028ColBmp ;
   private java.math.BigDecimal[] P06JM3_A2076ColEstMba ;
   private boolean[] P06JM3_n2076ColEstMba ;
   private short[] P06JM3_A2079ColMolCil ;
   private boolean[] P06JM3_n2079ColMolCil ;
   private String[] P06JM3_A279CliNom ;
   private short[] P06JM3_A2075ColEstAnh ;
   private boolean[] P06JM3_n2075ColEstAnh ;
   private String[] P06JM4_A396EmprCod ;
   private int[] P06JM4_A252CliCod ;
   private String[] P06JM4_A2141SerEst ;
   private String[] P06JM4_A1013DibCli ;
   private int[] P06JM4_A1014DibInt ;
   private String[] P06JM4_A2074ColCom ;
   private String[] P06JM4_A2078ColFon ;
   private String[] P06JM4_A4420MolCol ;
   private boolean[] P06JM4_n4420MolCol ;
   private short[] P06JM4_A8052Dg_codigo ;
   private boolean[] P06JM4_n8052Dg_codigo ;
   private String[] P06JM4_A8053Dg_Desc ;
   private boolean[] P06JM4_n8053Dg_Desc ;
   private String[] P06JM4_A2648MolForEst ;
   private boolean[] P06JM4_n2648MolForEst ;
   private java.math.BigDecimal[] P06JM4_A2650MolPesMin ;
   private boolean[] P06JM4_n2650MolPesMin ;
   private java.math.BigDecimal[] P06JM4_A2100MolCon ;
   private boolean[] P06JM4_n2100MolCon ;
   private byte[] P06JM4_A2098MolCod ;
   private short[] P06JM4_A8054Dg_Degr ;
   private boolean[] P06JM4_n8054Dg_Degr ;
   private String[] P06JM5_A396EmprCod ;
   private int[] P06JM5_A252CliCod ;
   private String[] P06JM5_A2141SerEst ;
   private String[] P06JM5_A1013DibCli ;
   private int[] P06JM5_A1014DibInt ;
   private String[] P06JM5_A2074ColCom ;
   private String[] P06JM5_A2078ColFon ;
   private byte[] P06JM5_A2098MolCod ;
   private short[] P06JM5_A6046PrdForPar ;
   private boolean[] P06JM5_n6046PrdForPar ;
   private java.math.BigDecimal[] P06JM5_A2116PrdForCan ;
   private boolean[] P06JM5_n2116PrdForCan ;
   private String[] P06JM5_A2144UniEstCod ;
   private boolean[] P06JM5_n2144UniEstCod ;
   private String[] P06JM5_A718PrdNom ;
   private String[] P06JM5_A719PrdNum ;
   private boolean[] P06JM5_n719PrdNum ;
   private short[] P06JM5_A2535ForPrdLin ;
   private String[] P06JM6_A396EmprCod ;
   private int[] P06JM6_A252CliCod ;
   private String[] P06JM6_A2141SerEst ;
   private String[] P06JM6_A1013DibCli ;
   private int[] P06JM6_A1014DibInt ;
   private String[] P06JM6_A2074ColCom ;
   private String[] P06JM6_A2078ColFon ;
   private byte[] P06JM6_A2098MolCod ;
   private short[] P06JM6_A6043PasForPar ;
   private boolean[] P06JM6_n6043PasForPar ;
   private java.math.BigDecimal[] P06JM6_A2109PasForCan ;
   private boolean[] P06JM6_n2109PasForCan ;
   private String[] P06JM6_A2144UniEstCod ;
   private boolean[] P06JM6_n2144UniEstCod ;
   private String[] P06JM6_A2108PasDsc ;
   private boolean[] P06JM6_n2108PasDsc ;
   private String[] P06JM6_A2107PasCod ;
   private boolean[] P06JM6_n2107PasCod ;
   private short[] P06JM6_A2654PasForLin ;
   private String[] P06JM7_A396EmprCod ;
   private int[] P06JM7_A252CliCod ;
   private String[] P06JM7_A2141SerEst ;
   private String[] P06JM7_A1013DibCli ;
   private int[] P06JM7_A1014DibInt ;
   private String[] P06JM7_A2074ColCom ;
   private String[] P06JM7_A2078ColFon ;
   private String[] P06JM7_A2096ForObsTxt ;
   private boolean[] P06JM7_n2096ForObsTxt ;
   private byte[] P06JM7_A2095ForObsLin ;
   private String[] P06JM8_A396EmprCod ;
   private short[] P06JM8_A1029DibLin ;
   private int[] P06JM8_A1014DibInt ;
   private int[] P06JM8_A252CliCod ;
   private String[] P06JM8_A1013DibCli ;
   private java.math.BigDecimal[] P06JM8_A5381DibPrcCobM ;
   private boolean[] P06JM8_n5381DibPrcCobM ;
   private String[] P06JM9_A396EmprCod ;
   private short[] P06JM9_A1807DibLinCil ;
   private int[] P06JM9_A1014DibInt ;
   private int[] P06JM9_A252CliCod ;
   private String[] P06JM9_A1013DibCli ;
   private java.math.BigDecimal[] P06JM9_A4860DibPrcCob ;
   private boolean[] P06JM9_n4860DibPrcCob ;
   private int[] P06JM9_A8658DibIntSp ;
   private boolean[] P06JM9_n8658DibIntSp ;
   private String[] P06JM10_A396EmprCod ;
   private String[] P06JM10_A1013DibCli ;
   private int[] P06JM10_A252CliCod ;
   private int[] P06JM10_A1014DibInt ;
   private short[] P06JM10_A1807DibLinCil ;
   private String[] P06JM10_A1030DibRelMC ;
   private boolean[] P06JM10_n1030DibRelMC ;
   private byte[] P06JM10_A2089DibLinMol ;
   private boolean[] P06JM10_n2089DibLinMol ;
   private String[] P06JM11_A396EmprCod ;
   private String[] P06JM11_A1013DibCli ;
   private int[] P06JM11_A252CliCod ;
   private int[] P06JM11_A1014DibInt ;
   private short[] P06JM11_A1029DibLin ;
   private String[] P06JM11_A2092DibRelMC2 ;
   private boolean[] P06JM11_n2092DibRelMC2 ;
   private byte[] P06JM11_A2088DibDibMol ;
   private boolean[] P06JM11_n2088DibDibMol ;
}

final  class rlisfod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06JM2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06JM3", "SELECT T5.ArtCod, T1.IntCod, T1.EmprCod, T1.ColFon, T1.ColCom, T1.DibInt, T1.DibCli, T1.SerEst, T1.CliCod, T4.DibTipMaq, T3.IntDsc, T4.DibCob, T1.ColBmp, T1.ColEstMba, T1.ColMolCil, T2.CliNom, COALESCE( T5.ArtAcaMin, 0) AS ColEstAnh FROM ((((TXPCFORES T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPCDIBUJ T4 ON T4.EmprCod = T1.EmprCod AND T4.DibCli = T1.DibCli AND T4.CliCod = T1.CliCod AND T4.DibInt = T1.DibInt) LEFT JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.SerEst) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.SerEst >= ? and T1.DibCli >= ? and T1.DibInt >= ? and T1.ColCom >= ? and T1.ColFon >= ?) AND (T1.SerEst <= ?) AND (T1.DibCli <= ?) AND (T1.DibInt <= ?) AND (T1.ColCom <= ?) AND (T1.ColFon <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JM4", "SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCol, T1.Dg_codigo, T2.Dg_Desc, T1.MolForEst, T1.MolPesMin, T1.MolCon, T1.MolCod, T2.Dg_Degr FROM (TXPMFORES T1 LEFT JOIN TXPDEGRA T2 ON T2.EmprCod = T1.EmprCod AND T2.Dg_codigo = T1.Dg_codigo) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JM5", "SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PrdForPar, T1.PrdForCan, T1.UniEstCod, T2.PrdNom, T1.PrdNum, T1.ForPrdLin FROM (TXPRECPR2 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.ForPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JM6", "SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PasForPar, T1.PasForCan, T1.UniEstCod, T2.PasDsc, T1.PasCod, T1.PasForLin FROM (TXPPASFOR T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JM7", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsTxt, ForObsLin FROM TXPFOROBS WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JM8", "SELECT EmprCod, DibLin, DibInt, CliCod, DibCli, DibPrcCobM FROM TXPLDIBUJ WHERE (EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLin = ?) AND (CliCod >= ?) AND (CliCod <= ?) AND (DibCli >= ?) AND (DibCli <= ?) AND (DibInt >= ?) AND (DibInt <= ?) ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06JM9", "SELECT EmprCod, DibLinCil, DibInt, CliCod, DibCli, DibPrcCob, DibIntSp FROM TXPLDIBUC WHERE (EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinCil = ?) AND (CliCod >= ?) AND (CliCod <= ?) AND (DibCli >= ?) AND (DibCli <= ?) AND (DibInt >= ?) AND (DibInt <= ?) ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06JM10", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibRelMC, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06JM11", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibRelMC2, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 128);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 30);
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(14);
               ((short[]) buf[20])[0] = rslt.getShort(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

