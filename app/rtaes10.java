package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtaes10 extends GXReport
{
   public rtaes10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtaes10.class ), "" );
   }

   public rtaes10( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      rtaes10.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      rtaes10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rtaes10.this.A6310Lb_TaAuxC = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
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
         getPrinter().GxSetDocName("INFORME TABLA DOSIFICACION") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07RC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07RC2_A407EmprNom[0] ;
            n407EmprNom = P07RC2_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char1 = AV13Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rtaes10.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit1 = GXt_char1 ;
         GXt_char1 = AV14Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rtaes10.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit2 = GXt_char1 ;
         AV10Lit3 = GXutil.trim( AV13Lit1) + " - " + GXutil.trim( AV14Lit2) ;
         GXt_char1 = AV9Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV18Pgmname, (byte)(99), GXv_char2) ;
         rtaes10.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit4 = GXt_char1 ;
         /* Using cursor P07RC3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11637TaesLn = P07RC3_A11637TaesLn[0] ;
            A11634TaesId = P07RC3_A11634TaesId[0] ;
            A11635TaesDc = P07RC3_A11635TaesDc[0] ;
            n11635TaesDc = P07RC3_n11635TaesDc[0] ;
            A11639TaesVf = P07RC3_A11639TaesVf[0] ;
            n11639TaesVf = P07RC3_n11639TaesVf[0] ;
            A11638TaesVi = P07RC3_A11638TaesVi[0] ;
            n11638TaesVi = P07RC3_n11638TaesVi[0] ;
            A11635TaesDc = P07RC3_A11635TaesDc[0] ;
            n11635TaesDc = P07RC3_n11635TaesDc[0] ;
            AV12Lb_TaAuxD = GXutil.substring( A11635TaesDc, 1, 50) ;
            h7RC0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11637TaesLn), "ZZZ9")), 465, Gx_line+0, 495, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11638TaesVi, "ZZZZZ9.999")), 510, Gx_line+0, 584, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11639TaesVf, "ZZZZZ9.999")), 600, Gx_line+0, 674, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11634TaesId, "")), 17, Gx_line+0, 62, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lb_TaAuxD, "")), 68, Gx_line+1, 434, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            /* Using cursor P07RC4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2144UniEstCod = P07RC4_A2144UniEstCod[0] ;
               n2144UniEstCod = P07RC4_n2144UniEstCod[0] ;
               A11642TaesCant = P07RC4_A11642TaesCant[0] ;
               n11642TaesCant = P07RC4_n11642TaesCant[0] ;
               A718PrdNom = P07RC4_A718PrdNom[0] ;
               A719PrdNum = P07RC4_A719PrdNum[0] ;
               n719PrdNum = P07RC4_n719PrdNum[0] ;
               A11641TaesLnP = P07RC4_A11641TaesLnP[0] ;
               A718PrdNom = P07RC4_A718PrdNom[0] ;
               h7RC0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 695, Gx_line+1, 740, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 760, Gx_line+0, 951, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11642TaesCant, "ZZZZZ9.999")), 963, Gx_line+0, 1037, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")), 1042, Gx_line+0, 1065, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7RC0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7RC0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 17, Gx_line+100, 59, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("#", 465, Gx_line+100, 474, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Colorantes (Grs)", ""), 548, Gx_line+76, 644, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 554, Gx_line+100, 590, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 651, Gx_line+100, 680, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 695, Gx_line+100, 749, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 760, Gx_line+100, 831, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cantidad(Grs)", ""), 954, Gx_line+100, 1035, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(465, Gx_line+117, 498, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(510, Gx_line+117, 590, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(600, Gx_line+117, 680, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(510, Gx_line+82, 543, Gx_line+82, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(653, Gx_line+82, 680, Gx_line+82, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(695, Gx_line+117, 749, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(760, Gx_line+117, 950, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(955, Gx_line+117, 1035, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+61, 1085, Gx_line+61, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 6, Gx_line+4, 226, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 805, Gx_line+5, 864, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 883, Gx_line+5, 942, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 871, Gx_line+5, 876, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 886, Gx_line+35, 931, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 6, Gx_line+30, 340, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit3, "")), 715, Gx_line+5, 793, Gx_line+21, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit5, "")), 811, Gx_line+35, 875, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Pgmname, "")), 715, Gx_line+36, 872, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+117, 59, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(52, Gx_line+117, 450, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 947, Gx_line+36, 1014, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 938, Gx_line+36, 945, Gx_line+50, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+125) ;
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
      this.aP0[0] = rtaes10.this.A396EmprCod;
      this.aP1[0] = rtaes10.this.A6310Lb_TaAuxC;
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
      P07RC2_A396EmprCod = new String[] {""} ;
      P07RC2_A407EmprNom = new String[] {""} ;
      P07RC2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      AV13Lit1 = "" ;
      AV14Lit2 = "" ;
      AV10Lit3 = "" ;
      AV9Lit4 = "" ;
      GXt_char1 = "" ;
      AV18Pgmname = "" ;
      GXv_char2 = new String[1] ;
      P07RC3_A396EmprCod = new String[] {""} ;
      P07RC3_A11637TaesLn = new short[1] ;
      P07RC3_A11634TaesId = new String[] {""} ;
      P07RC3_A11635TaesDc = new String[] {""} ;
      P07RC3_n11635TaesDc = new boolean[] {false} ;
      P07RC3_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RC3_n11639TaesVf = new boolean[] {false} ;
      P07RC3_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RC3_n11638TaesVi = new boolean[] {false} ;
      A11634TaesId = "" ;
      A11635TaesDc = "" ;
      A11639TaesVf = DecimalUtil.ZERO ;
      A11638TaesVi = DecimalUtil.ZERO ;
      AV12Lb_TaAuxD = "" ;
      P07RC4_A396EmprCod = new String[] {""} ;
      P07RC4_A11634TaesId = new String[] {""} ;
      P07RC4_A11637TaesLn = new short[1] ;
      P07RC4_A2144UniEstCod = new String[] {""} ;
      P07RC4_n2144UniEstCod = new boolean[] {false} ;
      P07RC4_A11642TaesCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RC4_n11642TaesCant = new boolean[] {false} ;
      P07RC4_A718PrdNom = new String[] {""} ;
      P07RC4_A719PrdNum = new String[] {""} ;
      P07RC4_n719PrdNum = new boolean[] {false} ;
      P07RC4_A11641TaesLnP = new short[1] ;
      A2144UniEstCod = "" ;
      A11642TaesCant = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV11Lit5 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtaes10__default(),
         new Object[] {
             new Object[] {
            P07RC2_A396EmprCod, P07RC2_A407EmprNom, P07RC2_n407EmprNom
            }
            , new Object[] {
            P07RC3_A396EmprCod, P07RC3_A11637TaesLn, P07RC3_A11634TaesId, P07RC3_A11635TaesDc, P07RC3_n11635TaesDc, P07RC3_A11639TaesVf, P07RC3_n11639TaesVf, P07RC3_A11638TaesVi, P07RC3_n11638TaesVi
            }
            , new Object[] {
            P07RC4_A396EmprCod, P07RC4_A11634TaesId, P07RC4_A11637TaesLn, P07RC4_A2144UniEstCod, P07RC4_n2144UniEstCod, P07RC4_A11642TaesCant, P07RC4_n11642TaesCant, P07RC4_A718PrdNom, P07RC4_A719PrdNum, P07RC4_n719PrdNum,
            P07RC4_A11641TaesLnP
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV18Pgmname = "RTAES10" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV18Pgmname = "RTAES10" ;
      Gx_err = (short)(0) ;
   }

   private short A11637TaesLn ;
   private short A11641TaesLnP ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A11639TaesVf ;
   private java.math.BigDecimal A11638TaesVi ;
   private java.math.BigDecimal A11642TaesCant ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8EmprNom ;
   private String AV13Lit1 ;
   private String AV14Lit2 ;
   private String AV10Lit3 ;
   private String AV9Lit4 ;
   private String GXt_char1 ;
   private String AV18Pgmname ;
   private String GXv_char2[] ;
   private String A11634TaesId ;
   private String A11635TaesDc ;
   private String AV12Lb_TaAuxD ;
   private String A2144UniEstCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private String AV11Lit5 ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n11635TaesDc ;
   private boolean n11639TaesVf ;
   private boolean n11638TaesVi ;
   private boolean n2144UniEstCod ;
   private boolean n11642TaesCant ;
   private boolean n719PrdNum ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07RC2_A396EmprCod ;
   private String[] P07RC2_A407EmprNom ;
   private boolean[] P07RC2_n407EmprNom ;
   private String[] P07RC3_A396EmprCod ;
   private short[] P07RC3_A11637TaesLn ;
   private String[] P07RC3_A11634TaesId ;
   private String[] P07RC3_A11635TaesDc ;
   private boolean[] P07RC3_n11635TaesDc ;
   private java.math.BigDecimal[] P07RC3_A11639TaesVf ;
   private boolean[] P07RC3_n11639TaesVf ;
   private java.math.BigDecimal[] P07RC3_A11638TaesVi ;
   private boolean[] P07RC3_n11638TaesVi ;
   private String[] P07RC4_A396EmprCod ;
   private String[] P07RC4_A11634TaesId ;
   private short[] P07RC4_A11637TaesLn ;
   private String[] P07RC4_A2144UniEstCod ;
   private boolean[] P07RC4_n2144UniEstCod ;
   private java.math.BigDecimal[] P07RC4_A11642TaesCant ;
   private boolean[] P07RC4_n11642TaesCant ;
   private String[] P07RC4_A718PrdNom ;
   private String[] P07RC4_A719PrdNum ;
   private boolean[] P07RC4_n719PrdNum ;
   private short[] P07RC4_A11641TaesLnP ;
}

final  class rtaes10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07RC2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RC3", "SELECT T1.EmprCod, T1.TaesLn, T1.TaesId, T2.TaesDc, T1.TaesVf, T1.TaesVi FROM (TXPTAES01 T1 INNER JOIN TXPTAES00 T2 ON T2.EmprCod = T1.EmprCod AND T2.TaesId = T1.TaesId) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.TaesId, T1.TaesLn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RC4", "SELECT T1.EmprCod, T1.TaesId, T1.TaesLn, T1.UniEstCod, T1.TaesCant, T2.PrdNom, T1.PrdNum, T1.TaesLnP FROM (TXPTAES02 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.TaesId = ? and T1.TaesLn = ? ORDER BY T1.EmprCod, T1.TaesId, T1.TaesLn, T1.TaesLnP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

