package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pmcom01 extends GXReport
{
   public pmcom01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmcom01.class ), "" );
   }

   public pmcom01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pmcom01.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pmcom01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmcom01.this.A11055MComCod = aP1[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Informe Compra") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV8Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2299_", ""), (byte)(99), GXv_char2) ;
         pmcom01.this.GXt_char1 = GXv_char2[0] ;
         AV8Lit3 = GXt_char1 ;
         GXt_char1 = AV9Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2011_", ""), (byte)(99), GXv_char2) ;
         pmcom01.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit4 = GXt_char1 ;
         GXt_char1 = AV10Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2352_", ""), (byte)(99), GXv_char2) ;
         pmcom01.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit5 = GXt_char1 ;
         GXt_char1 = AV13Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2032_", ""), (byte)(99), GXv_char2) ;
         pmcom01.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit17 = GXt_char1 ;
         /* Using cursor P05NX2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05NX2_A407EmprNom[0] ;
            n407EmprNom = P05NX2_n407EmprNom[0] ;
            AV14NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV11Val = 0 ;
         AV12Valtot = 0 ;
         GxHdr3 = true ;
         /* Using cursor P05NX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11045MComExt = P05NX3_A11045MComExt[0] ;
            A782PrvCpo = P05NX3_A782PrvCpo[0] ;
            n782PrvCpo = P05NX3_n782PrvCpo[0] ;
            A799PrvPob = P05NX3_A799PrvPob[0] ;
            n799PrvPob = P05NX3_n799PrvPob[0] ;
            A786PrvDir = P05NX3_A786PrvDir[0] ;
            n786PrvDir = P05NX3_n786PrvDir[0] ;
            A794PrvNom = P05NX3_A794PrvNom[0] ;
            n794PrvNom = P05NX3_n794PrvNom[0] ;
            A795PrvNum = P05NX3_A795PrvNum[0] ;
            n795PrvNum = P05NX3_n795PrvNum[0] ;
            A11046MComFch = P05NX3_A11046MComFch[0] ;
            A782PrvCpo = P05NX3_A782PrvCpo[0] ;
            n782PrvCpo = P05NX3_n782PrvCpo[0] ;
            A799PrvPob = P05NX3_A799PrvPob[0] ;
            n799PrvPob = P05NX3_n799PrvPob[0] ;
            A786PrvDir = P05NX3_A786PrvDir[0] ;
            n786PrvDir = P05NX3_n786PrvDir[0] ;
            A794PrvNom = P05NX3_A794PrvNom[0] ;
            n794PrvNom = P05NX3_n794PrvNom[0] ;
            /* Using cursor P05NX4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A11052MComSolPre = P05NX4_A11052MComSolPre[0] ;
               A11051MComSolCnt = P05NX4_A11051MComSolCnt[0] ;
               A9493MRNom = P05NX4_A9493MRNom[0] ;
               n9493MRNom = P05NX4_n9493MRNom[0] ;
               A9492MRCod = P05NX4_A9492MRCod[0] ;
               A9493MRNom = P05NX4_A9493MRNom[0] ;
               n9493MRNom = P05NX4_n9493MRNom[0] ;
               AV11Val = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( A11051MComSolCnt.multiply(A11052MComSolPre), 0))) ;
               AV12Valtot = (long)(AV12Valtot+AV11Val) ;
               h5NX0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), 22, Gx_line+0, 81, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9493MRNom, "")), 88, Gx_line+0, 818, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11051MComSolCnt, "ZZZZZ9.99")), 321, Gx_line+0, 388, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999")), 430, Gx_line+0, 519, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Val), "ZZZZZZZZZZZ9")), 547, Gx_line+0, 636, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h5NX0( false, 33) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Valtot), "ZZZZZZZZZZZ9")), 547, Gx_line+17, 636, Gx_line+34, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5NX0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h5NX0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit17, "")), 420, Gx_line+16, 621, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14NomEmp, "")), 420, Gx_line+50, 671, Gx_line+68, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+100) ;
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
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 15, Gx_line+17, 52, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A11046MComFch, "99/99/99"), 88, Gx_line+17, 147, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pedido", ""), 15, Gx_line+50, 60, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9")), 88, Gx_line+50, 162, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 15, Gx_line+67, 82, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 88, Gx_line+67, 133, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 372, Gx_line+50, 625, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 372, Gx_line+69, 625, Gx_line+86, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 431, Gx_line+88, 684, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 372, Gx_line+88, 427, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit3, "")), 22, Gx_line+149, 206, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 108, Gx_line+178, 619, Gx_line+195, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit5, "")), 22, Gx_line+200, 490, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 22, Gx_line+233, 67, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 88, Gx_line+233, 169, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 321, Gx_line+233, 380, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 430, Gx_line+233, 475, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 598, Gx_line+233, 635, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(22, Gx_line+255, 80, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(88, Gx_line+255, 307, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(321, Gx_line+255, 387, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(430, Gx_line+255, 518, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+255, 635, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Interno", ""), 15, Gx_line+33, 82, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11045MComExt, "")), 88, Gx_line+33, 235, Gx_line+51, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+258) ;
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
      this.aP0[0] = pmcom01.this.A396EmprCod;
      this.aP1[0] = pmcom01.this.A11055MComCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Lit3 = "" ;
      AV9Lit4 = "" ;
      AV10Lit5 = "" ;
      AV13Lit17 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P05NX2_A396EmprCod = new String[] {""} ;
      P05NX2_A407EmprNom = new String[] {""} ;
      P05NX2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV14NomEmp = "" ;
      P05NX3_A396EmprCod = new String[] {""} ;
      P05NX3_A11055MComCod = new long[1] ;
      P05NX3_A11045MComExt = new String[] {""} ;
      P05NX3_A782PrvCpo = new String[] {""} ;
      P05NX3_n782PrvCpo = new boolean[] {false} ;
      P05NX3_A799PrvPob = new String[] {""} ;
      P05NX3_n799PrvPob = new boolean[] {false} ;
      P05NX3_A786PrvDir = new String[] {""} ;
      P05NX3_n786PrvDir = new boolean[] {false} ;
      P05NX3_A794PrvNom = new String[] {""} ;
      P05NX3_n794PrvNom = new boolean[] {false} ;
      P05NX3_A795PrvNum = new int[1] ;
      P05NX3_n795PrvNum = new boolean[] {false} ;
      P05NX3_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A11045MComExt = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A786PrvDir = "" ;
      A794PrvNom = "" ;
      A11046MComFch = GXutil.nullDate() ;
      P05NX4_A396EmprCod = new String[] {""} ;
      P05NX4_A11055MComCod = new long[1] ;
      P05NX4_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05NX4_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05NX4_A9493MRNom = new String[] {""} ;
      P05NX4_n9493MRNom = new boolean[] {false} ;
      P05NX4_A9492MRCod = new int[1] ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A9493MRNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmcom01__default(),
         new Object[] {
             new Object[] {
            P05NX2_A396EmprCod, P05NX2_A407EmprNom, P05NX2_n407EmprNom
            }
            , new Object[] {
            P05NX3_A396EmprCod, P05NX3_A11055MComCod, P05NX3_A11045MComExt, P05NX3_A782PrvCpo, P05NX3_n782PrvCpo, P05NX3_A799PrvPob, P05NX3_n799PrvPob, P05NX3_A786PrvDir, P05NX3_n786PrvDir, P05NX3_A794PrvNom,
            P05NX3_n794PrvNom, P05NX3_A795PrvNum, P05NX3_n795PrvNum, P05NX3_A11046MComFch
            }
            , new Object[] {
            P05NX4_A396EmprCod, P05NX4_A11055MComCod, P05NX4_A11052MComSolPre, P05NX4_A11051MComSolCnt, P05NX4_A9493MRNom, P05NX4_n9493MRNom, P05NX4_A9492MRCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int A9492MRCod ;
   private int Gx_OldLine ;
   private long A11055MComCod ;
   private long AV11Val ;
   private long AV12Valtot ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private String A396EmprCod ;
   private String AV8Lit3 ;
   private String AV9Lit4 ;
   private String AV10Lit5 ;
   private String AV13Lit17 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV14NomEmp ;
   private String A11045MComExt ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A786PrvDir ;
   private String A794PrvNom ;
   private String A9493MRNom ;
   private java.util.Date A11046MComFch ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private boolean n9493MRNom ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05NX2_A396EmprCod ;
   private String[] P05NX2_A407EmprNom ;
   private boolean[] P05NX2_n407EmprNom ;
   private String[] P05NX3_A396EmprCod ;
   private long[] P05NX3_A11055MComCod ;
   private String[] P05NX3_A11045MComExt ;
   private String[] P05NX3_A782PrvCpo ;
   private boolean[] P05NX3_n782PrvCpo ;
   private String[] P05NX3_A799PrvPob ;
   private boolean[] P05NX3_n799PrvPob ;
   private String[] P05NX3_A786PrvDir ;
   private boolean[] P05NX3_n786PrvDir ;
   private String[] P05NX3_A794PrvNom ;
   private boolean[] P05NX3_n794PrvNom ;
   private int[] P05NX3_A795PrvNum ;
   private boolean[] P05NX3_n795PrvNum ;
   private java.util.Date[] P05NX3_A11046MComFch ;
   private String[] P05NX4_A396EmprCod ;
   private long[] P05NX4_A11055MComCod ;
   private java.math.BigDecimal[] P05NX4_A11052MComSolPre ;
   private java.math.BigDecimal[] P05NX4_A11051MComSolCnt ;
   private String[] P05NX4_A9493MRNom ;
   private boolean[] P05NX4_n9493MRNom ;
   private int[] P05NX4_A9492MRCod ;
}

final  class pmcom01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05NX2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05NX3", "SELECT T1.EmprCod, T1.MComCod, T1.MComExt, T2.PrvCpo, T2.PrvPob, T2.PrvDir, T2.PrvNom, T1.PrvNum, T1.MComFch FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.MComCod = ? ORDER BY T1.EmprCod, T1.MComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05NX4", "SELECT T1.EmprCod, T1.MComCod, T1.MComSolPre, T1.MComSolCnt, T2.MRNom, T1.MRCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) WHERE T1.EmprCod = ? and T1.MComCod = ? ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

