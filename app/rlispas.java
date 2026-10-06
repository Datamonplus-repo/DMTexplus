package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rlispas extends GXReport
{
   public rlispas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rlispas.class ), "" );
   }

   public rlispas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      rlispas.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      rlispas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rlispas.this.AV15PPasCod = aP1[0];
      this.aP1 = aP1;
      rlispas.this.AV16UPasCod = aP2[0];
      this.aP2 = aP2;
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
         getPrinter().GxSetDocName("LISTADO DE FORMULAS PASTA BASE") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV18Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit0 = GXt_char1 ;
         GXt_char1 = AV19Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit1 = GXt_char1 ;
         GXt_char1 = AV20Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2234_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit2 = GXt_char1 ;
         GXt_char1 = AV21Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit3 = GXt_char1 ;
         GXt_char1 = AV26Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT114_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit4 = GXt_char1 ;
         GXt_char1 = AV27Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT664_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit5 = GXt_char1 ;
         GXt_char1 = AV23Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit20 = GXt_char1 ;
         GXt_char1 = AV24Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit21 = GXt_char1 ;
         GXt_char1 = AV28Lit22 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit22 = GXt_char1 ;
         GXt_char1 = AV25Lit23 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT667_", ""), (byte)(99), GXv_char2) ;
         rlispas.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit23 = GXt_char1 ;
         /* Using cursor P06JP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06JP2_A407EmprNom[0] ;
            n407EmprNom = P06JP2_n407EmprNom[0] ;
            AV22NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06JP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV15PPasCod, AV16UPasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2107PasCod = P06JP3_A2107PasCod[0] ;
            A2108PasDsc = P06JP3_A2108PasDsc[0] ;
            n2108PasDsc = P06JP3_n2108PasDsc[0] ;
            A2113PasTotGrm = getPasTotGrm0( A396EmprCod, A2107PasCod) ;
            A2114PasTotKgm = getPasTotKgm0( A396EmprCod, A2107PasCod) ;
            A2115PasTotPas = A2114PasTotKgm.add(A2113PasTotGrm) ;
            h6JP0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 10, Gx_line+0, 55, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 61, Gx_line+0, 252, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            /* Using cursor P06JP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A2107PasCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2106PasCanPrd = P06JP4_A2106PasCanPrd[0] ;
               n2106PasCanPrd = P06JP4_n2106PasCanPrd[0] ;
               A2144UniEstCod = P06JP4_A2144UniEstCod[0] ;
               n2144UniEstCod = P06JP4_n2144UniEstCod[0] ;
               A718PrdNom = P06JP4_A718PrdNom[0] ;
               A719PrdNum = P06JP4_A719PrdNum[0] ;
               A13176PasOrder = P06JP4_A13176PasOrder[0] ;
               n13176PasOrder = P06JP4_n13176PasOrder[0] ;
               A718PrdNom = P06JP4_A718PrdNom[0] ;
               h6JP0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 271, Gx_line+0, 316, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 322, Gx_line+0, 513, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 531, Gx_line+0, 554, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2106PasCanPrd, "ZZZZZ9.99")), 579, Gx_line+0, 646, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13176PasOrder), "ZZZ9")), 656, Gx_line+1, 686, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6JP0( false, 34) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2115PasTotPas, "ZZZZZ9.99")), 579, Gx_line+6, 646, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(579, Gx_line+1, 645, Gx_line+1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit22, "")), 411, Gx_line+6, 469, Gx_line+22, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(408, Gx_line+25, 644, Gx_line+25, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+34) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6JP0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6JP0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 401, Gx_line+9, 409, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 572, Gx_line+10, 580, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22NomEmp, "")), 7, Gx_line+9, 227, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit0, "")), 357, Gx_line+9, 393, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 408, Gx_line+9, 467, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit1, "")), 528, Gx_line+10, 557, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 579, Gx_line+10, 638, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 572, Gx_line+35, 580, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit3, "")), 528, Gx_line+35, 572, Gx_line+51, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 579, Gx_line+35, 624, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+2, 698, Gx_line+2, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+57, 698, Gx_line+57, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Pgmname, "")), 353, Gx_line+36, 573, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+98, 248, Gx_line+98, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(269, Gx_line+98, 512, Gx_line+98, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(531, Gx_line+98, 553, Gx_line+98, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(579, Gx_line+98, 645, Gx_line+98, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit20, "")), 268, Gx_line+77, 334, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit21, "")), 579, Gx_line+77, 645, Gx_line+93, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit23, "")), 529, Gx_line+77, 558, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit4, "")), 7, Gx_line+36, 165, Gx_line+52, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit5, "")), 10, Gx_line+77, 83, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 649, Gx_line+77, 686, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(649, Gx_line+98, 685, Gx_line+98, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
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
      this.aP0[0] = rlispas.this.A396EmprCod;
      this.aP1[0] = rlispas.this.AV15PPasCod;
      this.aP2[0] = rlispas.this.AV16UPasCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getPasTotKgm0( String E396EmprCod ,
                                              String E2107PasCod )
   {
      X2105PasCanGrm = DecimalUtil.doubleToDec(0) ;
      Gx_first = true ;
      /* Using cursor P06JP5 */
      pr_default.execute(3, new Object[] {E396EmprCod, E2107PasCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( ( ( GXutil.strcmp(P06JP5_A2144UniEstCod[0], httpContext.getMessage( httpContext.getMessage( "KGM", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E2107PasCod, E2107PasCod) == 0 ) ) )
         {
            if ( Gx_first )
            {
               X2105PasCanGrm = P06JP5_A2105PasCanGrm[0] ;
               Gx_first = false ;
            }
            else
            {
               X2105PasCanGrm = X2105PasCanGrm.add(P06JP5_A2105PasCanGrm[0]) ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      return X2105PasCanGrm ;
   }

   public java.math.BigDecimal getPasTotGrm0( String E396EmprCod ,
                                              String E2107PasCod )
   {
      X2106PasCanPrd = DecimalUtil.doubleToDec(0) ;
      nX2106PasCanPrd = false ;
      Gx_first = true ;
      /* Using cursor P06JP6 */
      pr_default.execute(4, new Object[] {E396EmprCod, E2107PasCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( ( ( GXutil.strcmp(P06JP6_A2144UniEstCod[0], httpContext.getMessage( httpContext.getMessage( "GRS", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E2107PasCod, E2107PasCod) == 0 ) ) )
         {
            if ( Gx_first )
            {
               X2106PasCanPrd = P06JP6_A2106PasCanPrd[0] ;
               nX2106PasCanPrd = false ;
               Gx_first = false ;
            }
            else
            {
               X2106PasCanPrd = X2106PasCanPrd.add(P06JP6_A2106PasCanPrd[0]) ;
               nX2106PasCanPrd = false ;
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      return X2106PasCanPrd ;
   }

   public void initialize( )
   {
      AV18Lit0 = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV21Lit3 = "" ;
      AV26Lit4 = "" ;
      AV27Lit5 = "" ;
      AV23Lit20 = "" ;
      AV24Lit21 = "" ;
      AV28Lit22 = "" ;
      AV25Lit23 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06JP2_A396EmprCod = new String[] {""} ;
      P06JP2_A407EmprNom = new String[] {""} ;
      P06JP2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV22NomEmp = "" ;
      P06JP3_A396EmprCod = new String[] {""} ;
      P06JP3_A2107PasCod = new String[] {""} ;
      P06JP3_A2108PasDsc = new String[] {""} ;
      P06JP3_n2108PasDsc = new boolean[] {false} ;
      A2107PasCod = "" ;
      A2108PasDsc = "" ;
      A2113PasTotGrm = DecimalUtil.ZERO ;
      A2114PasTotKgm = DecimalUtil.ZERO ;
      A2115PasTotPas = DecimalUtil.ZERO ;
      P06JP4_A396EmprCod = new String[] {""} ;
      P06JP4_A2107PasCod = new String[] {""} ;
      P06JP4_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JP4_n2106PasCanPrd = new boolean[] {false} ;
      P06JP4_A2144UniEstCod = new String[] {""} ;
      P06JP4_n2144UniEstCod = new boolean[] {false} ;
      P06JP4_A718PrdNom = new String[] {""} ;
      P06JP4_A719PrdNum = new String[] {""} ;
      P06JP4_A13176PasOrder = new short[1] ;
      P06JP4_n13176PasOrder = new boolean[] {false} ;
      A2106PasCanPrd = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV35Pgmname = "" ;
      X2105PasCanGrm = DecimalUtil.ZERO ;
      E2107PasCod = "" ;
      P06JP5_A396EmprCod = new String[] {""} ;
      P06JP5_A2107PasCod = new String[] {""} ;
      P06JP5_A719PrdNum = new String[] {""} ;
      P06JP5_A2105PasCanGrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JP5_A2144UniEstCod = new String[] {""} ;
      P06JP5_n2144UniEstCod = new boolean[] {false} ;
      X2106PasCanPrd = DecimalUtil.ZERO ;
      P06JP6_A396EmprCod = new String[] {""} ;
      P06JP6_A2107PasCod = new String[] {""} ;
      P06JP6_A719PrdNum = new String[] {""} ;
      P06JP6_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06JP6_n2106PasCanPrd = new boolean[] {false} ;
      P06JP6_A2144UniEstCod = new String[] {""} ;
      P06JP6_n2144UniEstCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlispas__default(),
         new Object[] {
             new Object[] {
            P06JP2_A396EmprCod, P06JP2_A407EmprNom, P06JP2_n407EmprNom
            }
            , new Object[] {
            P06JP3_A396EmprCod, P06JP3_A2107PasCod, P06JP3_A2108PasDsc, P06JP3_n2108PasDsc
            }
            , new Object[] {
            P06JP4_A396EmprCod, P06JP4_A2107PasCod, P06JP4_A2106PasCanPrd, P06JP4_n2106PasCanPrd, P06JP4_A2144UniEstCod, P06JP4_n2144UniEstCod, P06JP4_A718PrdNom, P06JP4_A719PrdNum, P06JP4_A13176PasOrder, P06JP4_n13176PasOrder
            }
            , new Object[] {
            P06JP5_A396EmprCod, P06JP5_A2107PasCod, P06JP5_A719PrdNum, P06JP5_A2105PasCanGrm, P06JP5_A2144UniEstCod, P06JP5_n2144UniEstCod
            }
            , new Object[] {
            P06JP6_A396EmprCod, P06JP6_A2107PasCod, P06JP6_A719PrdNum, P06JP6_A2106PasCanPrd, P06JP6_n2106PasCanPrd, P06JP6_A2144UniEstCod, P06JP6_n2144UniEstCod
            }
         }
      );
      AV35Pgmname = "RLISPAS" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV35Pgmname = "RLISPAS" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short A13176PasOrder ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2113PasTotGrm ;
   private java.math.BigDecimal A2114PasTotKgm ;
   private java.math.BigDecimal A2115PasTotPas ;
   private java.math.BigDecimal A2106PasCanPrd ;
   private java.math.BigDecimal X2105PasCanGrm ;
   private java.math.BigDecimal X2106PasCanPrd ;
   private String A396EmprCod ;
   private String AV15PPasCod ;
   private String AV16UPasCod ;
   private String AV18Lit0 ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV21Lit3 ;
   private String AV26Lit4 ;
   private String AV27Lit5 ;
   private String AV23Lit20 ;
   private String AV24Lit21 ;
   private String AV28Lit22 ;
   private String AV25Lit23 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV22NomEmp ;
   private String A2107PasCod ;
   private String A2108PasDsc ;
   private String A2144UniEstCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private String AV35Pgmname ;
   private String E396EmprCod ;
   private String E2107PasCod ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n2108PasDsc ;
   private boolean n2106PasCanPrd ;
   private boolean n2144UniEstCod ;
   private boolean n13176PasOrder ;
   private boolean Gx_first ;
   private boolean nX2106PasCanPrd ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P06JP2_A396EmprCod ;
   private String[] P06JP2_A407EmprNom ;
   private boolean[] P06JP2_n407EmprNom ;
   private String[] P06JP3_A396EmprCod ;
   private String[] P06JP3_A2107PasCod ;
   private String[] P06JP3_A2108PasDsc ;
   private boolean[] P06JP3_n2108PasDsc ;
   private String[] P06JP4_A396EmprCod ;
   private String[] P06JP4_A2107PasCod ;
   private java.math.BigDecimal[] P06JP4_A2106PasCanPrd ;
   private boolean[] P06JP4_n2106PasCanPrd ;
   private String[] P06JP4_A2144UniEstCod ;
   private boolean[] P06JP4_n2144UniEstCod ;
   private String[] P06JP4_A718PrdNom ;
   private String[] P06JP4_A719PrdNum ;
   private short[] P06JP4_A13176PasOrder ;
   private boolean[] P06JP4_n13176PasOrder ;
   private String[] P06JP5_A396EmprCod ;
   private String[] P06JP5_A2107PasCod ;
   private String[] P06JP5_A719PrdNum ;
   private java.math.BigDecimal[] P06JP5_A2105PasCanGrm ;
   private String[] P06JP5_A2144UniEstCod ;
   private boolean[] P06JP5_n2144UniEstCod ;
   private String[] P06JP6_A396EmprCod ;
   private String[] P06JP6_A2107PasCod ;
   private String[] P06JP6_A719PrdNum ;
   private java.math.BigDecimal[] P06JP6_A2106PasCanPrd ;
   private boolean[] P06JP6_n2106PasCanPrd ;
   private String[] P06JP6_A2144UniEstCod ;
   private boolean[] P06JP6_n2144UniEstCod ;
}

final  class rlispas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06JP2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06JP3", "SELECT EmprCod, PasCod, PasDsc FROM TXPCPASTA WHERE (EmprCod = ? and PasCod >= ?) AND (PasCod <= ?) ORDER BY EmprCod, PasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JP4", "SELECT T1.EmprCod, T1.PasCod, T1.PasCanPrd, T1.UniEstCod, T2.PrdNom, T1.PrdNum, T1.PasOrder FROM (TXPLPASTA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PasCod = ?) ORDER BY T1.PasOrder, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06JP5", "SELECT EmprCod, PasCod, PrdNum, PasCanGrm, UniEstCod FROM TXPLPASTA WHERE EmprCod = ? AND PasCod = ? ORDER BY EmprCod, PasCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06JP6", "SELECT EmprCod, PasCod, PrdNum, PasCanPrd, UniEstCod FROM TXPLPASTA WHERE EmprCod = ? AND PasCod = ? ORDER BY EmprCod, PasCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

