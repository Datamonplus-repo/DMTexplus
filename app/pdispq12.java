package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pdispq12 extends GXReport
{
   public pdispq12( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdispq12.class ), "" );
   }

   public pdispq12( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      pdispq12.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pdispq12.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdispq12.this.A12225DocDisID = aP1[0];
      this.aP1 = aP1;
      pdispq12.this.Gx_out = aP2[0];
      this.aP2 = aP2;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Informe Disolucion Auxiliares Reproceso") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P05183 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A12209StaDisQ = P05183_A12209StaDisQ[0] ;
            n12209StaDisQ = P05183_n12209StaDisQ[0] ;
            A12214DUnDisQ = P05183_A12214DUnDisQ[0] ;
            n12214DUnDisQ = P05183_n12214DUnDisQ[0] ;
            A12213UndDisQ = P05183_A12213UndDisQ[0] ;
            n12213UndDisQ = P05183_n12213UndDisQ[0] ;
            A12212CntDisQ = P05183_A12212CntDisQ[0] ;
            n12212CntDisQ = P05183_n12212CntDisQ[0] ;
            A12211DscDisQ = P05183_A12211DscDisQ[0] ;
            A12210PrdDisQ = P05183_A12210PrdDisQ[0] ;
            n12210PrdDisQ = P05183_n12210PrdDisQ[0] ;
            A12208FecDisQ = P05183_A12208FecDisQ[0] ;
            n12208FecDisQ = P05183_n12208FecDisQ[0] ;
            A12227TotCntR = P05183_A12227TotCntR[0] ;
            A12231ValDisQ = P05183_A12231ValDisQ[0] ;
            A12211DscDisQ = P05183_A12211DscDisQ[0] ;
            A12214DUnDisQ = P05183_A12214DUnDisQ[0] ;
            n12214DUnDisQ = P05183_n12214DUnDisQ[0] ;
            A12227TotCntR = P05183_A12227TotCntR[0] ;
            A12231ValDisQ = P05183_A12231ValDisQ[0] ;
            if ( A12209StaDisQ == 0 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Pendiente Control Disolucion", "") ;
            }
            else if ( A12209StaDisQ == 1 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Disolucion Realizada", "") ;
            }
            else if ( A12209StaDisQ == 2 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Control Calidad OK", "") ;
            }
            else if ( A12209StaDisQ == 3 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Control Calidad No Ok", "") ;
            }
            else if ( A12209StaDisQ == 4 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Reproceso Disolucion Realizada", "") ;
            }
            else if ( A12209StaDisQ == 5 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Reproceso Control Calidad Ok", "") ;
            }
            else if ( A12209StaDisQ == 5 )
            {
               AV9EstadoTxt = httpContext.getMessage( "Cierre Documento", "") ;
            }
            /* Using cursor P05184 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A12224CntDisQ2 = P05184_A12224CntDisQ2[0] ;
               n12224CntDisQ2 = P05184_n12224CntDisQ2[0] ;
               A12222UndDisQu = P05184_A12222UndDisQu[0] ;
               n12222UndDisQu = P05184_n12222UndDisQu[0] ;
               A12223DUnDisQU = P05184_A12223DUnDisQU[0] ;
               n12223DUnDisQU = P05184_n12223DUnDisQU[0] ;
               A12230ValDisQu = P05184_A12230ValDisQu[0] ;
               n12230ValDisQu = P05184_n12230ValDisQu[0] ;
               A12221CntDisQu = P05184_A12221CntDisQu[0] ;
               n12221CntDisQu = P05184_n12221CntDisQu[0] ;
               A12219DscDisQu = P05184_A12219DscDisQu[0] ;
               A12218PrdDisQu = P05184_A12218PrdDisQu[0] ;
               n12218PrdDisQu = P05184_n12218PrdDisQu[0] ;
               A12226LinDisID = P05184_A12226LinDisID[0] ;
               A12219DscDisQu = P05184_A12219DscDisQu[0] ;
               A12223DUnDisQU = P05184_A12223DUnDisQU[0] ;
               n12223DUnDisQU = P05184_n12223DUnDisQU[0] ;
               h5180( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12226LinDisID), "ZZZ9")), 44, Gx_line+0, 74, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12218PrdDisQu, "")), 95, Gx_line+0, 140, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12219DscDisQu, "")), 160, Gx_line+0, 351, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12221CntDisQu, "ZZZZZ9.99")), 365, Gx_line+0, 432, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12230ValDisQu, "ZZZZ9.99999")), 518, Gx_line+2, 599, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12223DUnDisQU, "")), 627, Gx_line+0, 686, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12222UndDisQu), "9")), 613, Gx_line+0, 621, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12224CntDisQ2, "ZZZZZ9.99")), 445, Gx_line+0, 512, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5180( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h5180( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Documento Disolucion", ""), 15, Gx_line+17, 176, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12225DocDisID), "ZZZZZZZZZ9")), 182, Gx_line+17, 256, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 15, Gx_line+50, 52, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 15, Gx_line+67, 60, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 15, Gx_line+83, 74, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 15, Gx_line+100, 74, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A12208FecDisQ, "99/99/99"), 182, Gx_line+50, 241, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9EstadoTxt, "")), 182, Gx_line+67, 329, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12210PrdDisQ, "")), 182, Gx_line+83, 227, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12211DscDisQ, "")), 233, Gx_line+83, 424, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12212CntDisQ, "ZZZZZ9.99")), 182, Gx_line+100, 249, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 452, Gx_line+100, 497, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12231ValDisQ, "ZZZZ9.99999")), 503, Gx_line+100, 584, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 15, Gx_line+117, 60, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12213UndDisQ), "9")), 182, Gx_line+117, 190, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12214DUnDisQ, "")), 197, Gx_line+117, 256, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 44, Gx_line+167, 81, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 95, Gx_line+167, 154, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 160, Gx_line+167, 241, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 372, Gx_line+167, 431, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 554, Gx_line+167, 599, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 613, Gx_line+167, 658, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(44, Gx_line+183, 80, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(95, Gx_line+183, 153, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(160, Gx_line+183, 350, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(365, Gx_line+183, 431, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(518, Gx_line+183, 598, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(613, Gx_line+183, 687, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Añadida", ""), 459, Gx_line+167, 511, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(445, Gx_line+183, 511, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12227TotCntR, "ZZZZZ9.99")), 255, Gx_line+100, 322, Gx_line+117, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+188) ;
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
      this.aP0[0] = pdispq12.this.A396EmprCod;
      this.aP1[0] = pdispq12.this.A12225DocDisID;
      this.aP2[0] = pdispq12.this.Gx_out;
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
      P05183_A396EmprCod = new String[] {""} ;
      P05183_A12225DocDisID = new long[1] ;
      P05183_A12209StaDisQ = new byte[1] ;
      P05183_n12209StaDisQ = new boolean[] {false} ;
      P05183_A12214DUnDisQ = new String[] {""} ;
      P05183_n12214DUnDisQ = new boolean[] {false} ;
      P05183_A12213UndDisQ = new byte[1] ;
      P05183_n12213UndDisQ = new boolean[] {false} ;
      P05183_A12212CntDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05183_n12212CntDisQ = new boolean[] {false} ;
      P05183_A12211DscDisQ = new String[] {""} ;
      P05183_A12210PrdDisQ = new String[] {""} ;
      P05183_n12210PrdDisQ = new boolean[] {false} ;
      P05183_A12208FecDisQ = new java.util.Date[] {GXutil.nullDate()} ;
      P05183_n12208FecDisQ = new boolean[] {false} ;
      P05183_A12227TotCntR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05183_A12231ValDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A12214DUnDisQ = "" ;
      A12212CntDisQ = DecimalUtil.ZERO ;
      A12211DscDisQ = "" ;
      A12210PrdDisQ = "" ;
      A12208FecDisQ = GXutil.nullDate() ;
      A12227TotCntR = DecimalUtil.ZERO ;
      A12231ValDisQ = DecimalUtil.ZERO ;
      AV9EstadoTxt = "" ;
      P05184_A396EmprCod = new String[] {""} ;
      P05184_A12225DocDisID = new long[1] ;
      P05184_A12224CntDisQ2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05184_n12224CntDisQ2 = new boolean[] {false} ;
      P05184_A12222UndDisQu = new byte[1] ;
      P05184_n12222UndDisQu = new boolean[] {false} ;
      P05184_A12223DUnDisQU = new String[] {""} ;
      P05184_n12223DUnDisQU = new boolean[] {false} ;
      P05184_A12230ValDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05184_n12230ValDisQu = new boolean[] {false} ;
      P05184_A12221CntDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05184_n12221CntDisQu = new boolean[] {false} ;
      P05184_A12219DscDisQu = new String[] {""} ;
      P05184_A12218PrdDisQu = new String[] {""} ;
      P05184_n12218PrdDisQu = new boolean[] {false} ;
      P05184_A12226LinDisID = new short[1] ;
      A12224CntDisQ2 = DecimalUtil.ZERO ;
      A12223DUnDisQU = "" ;
      A12230ValDisQu = DecimalUtil.ZERO ;
      A12221CntDisQu = DecimalUtil.ZERO ;
      A12219DscDisQu = "" ;
      A12218PrdDisQu = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdispq12__default(),
         new Object[] {
             new Object[] {
            P05183_A396EmprCod, P05183_A12225DocDisID, P05183_A12209StaDisQ, P05183_n12209StaDisQ, P05183_A12214DUnDisQ, P05183_n12214DUnDisQ, P05183_A12213UndDisQ, P05183_n12213UndDisQ, P05183_A12212CntDisQ, P05183_n12212CntDisQ,
            P05183_A12211DscDisQ, P05183_A12210PrdDisQ, P05183_n12210PrdDisQ, P05183_A12208FecDisQ, P05183_n12208FecDisQ, P05183_A12227TotCntR, P05183_A12231ValDisQ
            }
            , new Object[] {
            P05184_A396EmprCod, P05184_A12225DocDisID, P05184_A12224CntDisQ2, P05184_n12224CntDisQ2, P05184_A12222UndDisQu, P05184_n12222UndDisQu, P05184_A12223DUnDisQU, P05184_n12223DUnDisQU, P05184_A12230ValDisQu, P05184_n12230ValDisQu,
            P05184_A12221CntDisQu, P05184_n12221CntDisQu, P05184_A12219DscDisQu, P05184_A12218PrdDisQu, P05184_n12218PrdDisQu, P05184_A12226LinDisID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A12209StaDisQ ;
   private byte A12213UndDisQ ;
   private byte A12222UndDisQu ;
   private short A12226LinDisID ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private long A12225DocDisID ;
   private java.math.BigDecimal A12212CntDisQ ;
   private java.math.BigDecimal A12227TotCntR ;
   private java.math.BigDecimal A12231ValDisQ ;
   private java.math.BigDecimal A12224CntDisQ2 ;
   private java.math.BigDecimal A12230ValDisQu ;
   private java.math.BigDecimal A12221CntDisQu ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A12214DUnDisQ ;
   private String A12211DscDisQ ;
   private String A12210PrdDisQ ;
   private String AV9EstadoTxt ;
   private String A12223DUnDisQU ;
   private String A12219DscDisQu ;
   private String A12218PrdDisQu ;
   private java.util.Date A12208FecDisQ ;
   private boolean GxHdr2 ;
   private boolean n12209StaDisQ ;
   private boolean n12214DUnDisQ ;
   private boolean n12213UndDisQ ;
   private boolean n12212CntDisQ ;
   private boolean n12210PrdDisQ ;
   private boolean n12208FecDisQ ;
   private boolean n12224CntDisQ2 ;
   private boolean n12222UndDisQu ;
   private boolean n12223DUnDisQU ;
   private boolean n12230ValDisQu ;
   private boolean n12221CntDisQu ;
   private boolean n12218PrdDisQu ;
   private String[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05183_A396EmprCod ;
   private long[] P05183_A12225DocDisID ;
   private byte[] P05183_A12209StaDisQ ;
   private boolean[] P05183_n12209StaDisQ ;
   private String[] P05183_A12214DUnDisQ ;
   private boolean[] P05183_n12214DUnDisQ ;
   private byte[] P05183_A12213UndDisQ ;
   private boolean[] P05183_n12213UndDisQ ;
   private java.math.BigDecimal[] P05183_A12212CntDisQ ;
   private boolean[] P05183_n12212CntDisQ ;
   private String[] P05183_A12211DscDisQ ;
   private String[] P05183_A12210PrdDisQ ;
   private boolean[] P05183_n12210PrdDisQ ;
   private java.util.Date[] P05183_A12208FecDisQ ;
   private boolean[] P05183_n12208FecDisQ ;
   private java.math.BigDecimal[] P05183_A12227TotCntR ;
   private java.math.BigDecimal[] P05183_A12231ValDisQ ;
   private String[] P05184_A396EmprCod ;
   private long[] P05184_A12225DocDisID ;
   private java.math.BigDecimal[] P05184_A12224CntDisQ2 ;
   private boolean[] P05184_n12224CntDisQ2 ;
   private byte[] P05184_A12222UndDisQu ;
   private boolean[] P05184_n12222UndDisQu ;
   private String[] P05184_A12223DUnDisQU ;
   private boolean[] P05184_n12223DUnDisQU ;
   private java.math.BigDecimal[] P05184_A12230ValDisQu ;
   private boolean[] P05184_n12230ValDisQu ;
   private java.math.BigDecimal[] P05184_A12221CntDisQu ;
   private boolean[] P05184_n12221CntDisQu ;
   private String[] P05184_A12219DscDisQu ;
   private String[] P05184_A12218PrdDisQu ;
   private boolean[] P05184_n12218PrdDisQu ;
   private short[] P05184_A12226LinDisID ;
}

final  class pdispq12__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05183", "SELECT T1.EmprCod, T1.DocDisID, T1.StaDisQ, T3.UniDsc AS DUnDisQ, T1.UndDisQ AS UndDisQ, T1.CntDisQ, T2.PrdNom AS DscDisQ, T1.PrdDisQ AS PrdDisQ, T1.FecDisQ, COALESCE( T4.TotCntR, 0) AS TotCntR, COALESCE( T4.ValDisQ, 0) AS ValDisQ FROM (((TXPDisPqu T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdDisQ) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.UndDisQ) LEFT JOIN (SELECT SUM(CntDisQ2) AS TotCntR, EmprCod, DocDisID, SUM(ValDisQu) AS ValDisQ FROM TXPDisPq1 GROUP BY EmprCod, DocDisID ) T4 ON T4.EmprCod = T1.EmprCod AND T4.DocDisID = T1.DocDisID) WHERE T1.EmprCod = ? and T1.DocDisID = ? ORDER BY T1.EmprCod, T1.DocDisID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05184", "SELECT T1.EmprCod, T1.DocDisID, T1.CntDisQ2, T1.UndDisQu AS UndDisQu, T3.UniDsc AS DUnDisQU, T1.ValDisQu, T1.CntDisQu, T2.PrdNom AS DscDisQu, T1.PrdDisQu AS PrdDisQu, T1.LinDisID FROM ((TXPDisPq1 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdDisQu) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.UndDisQu) WHERE T1.EmprCod = ? and T1.DocDisID = ? ORDER BY T1.EmprCod, T1.DocDisID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 26);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

