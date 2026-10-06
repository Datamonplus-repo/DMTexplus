package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ragrhdr extends GXReport
{
   public ragrhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ragrhdr.class ), "" );
   }

   public ragrhdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ragrhdr.this.aP1 = new int[] {0};
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
      ragrhdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ragrhdr.this.A3595BarMacCod = aP1[0];
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORME DE Nº PARTIDA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV9Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV14Pgmname, (byte)(99), GXv_char2) ;
         ragrhdr.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit1 = GXt_char1 ;
         /* Using cursor P072Z2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P072Z2_A407EmprNom[0] ;
            n407EmprNom = P072Z2_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV10TotKgs = DecimalUtil.doubleToDec(0) ;
         AV11TotPzs = 0 ;
         /* Using cursor P072Z4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3595BarMacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A218BarTipCol = P072Z4_A218BarTipCol[0] ;
            A136BarColNum = P072Z4_A136BarColNum[0] ;
            A135BarColNom = P072Z4_A135BarColNom[0] ;
            A212BarSer = P072Z4_A212BarSer[0] ;
            A130BarCodPar = P072Z4_A130BarCodPar[0] ;
            A132BarCodReo = P072Z4_A132BarCodReo[0] ;
            A129BarCod = P072Z4_A129BarCod[0] ;
            A166BarKgm = P072Z4_A166BarKgm[0] ;
            A199BarPie1 = P072Z4_A199BarPie1[0] ;
            A365DisDes = P072Z4_A365DisDes[0] ;
            A898BarPieNDes = P072Z4_A898BarPieNDes[0] ;
            A166BarKgm = P072Z4_A166BarKgm[0] ;
            A199BarPie1 = P072Z4_A199BarPie1[0] ;
            A898BarPieNDes = P072Z4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            h72Z0( false, 18) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 11, Gx_line+0, 79, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 86, Gx_line+0, 95, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 99, Gx_line+0, 108, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 134, Gx_line+1, 268, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 307, Gx_line+0, 416, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 436, Gx_line+0, 487, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 510, Gx_line+0, 528, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 561, Gx_line+1, 637, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 672, Gx_line+0, 723, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV10TotKgs = AV10TotKgs.add(A166BarKgm) ;
            AV11TotPzs = (int)(AV11TotPzs+A198BarPie) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h72Z0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h72Z0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 11, Gx_line+16, 262, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 589, Gx_line+16, 657, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 660, Gx_line+16, 728, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia - Hora", ""), 513, Gx_line+17, 583, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 675, Gx_line+48, 726, Gx_line+66, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 619, Gx_line+48, 667, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit1, "")), 11, Gx_line+47, 304, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+75, 725, Gx_line+75, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Partida/Lote", ""), 11, Gx_line+94, 122, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3595BarMacCod), "ZZZZZZZ9")), 144, Gx_line+94, 212, Gx_line+112, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta", ""), 11, Gx_line+126, 107, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 134, Gx_line+126, 189, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 307, Gx_line+126, 347, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 510, Gx_line+126, 532, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 608, Gx_line+126, 636, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 655, Gx_line+126, 705, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+147, 107, Gx_line+147, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(134, Gx_line+147, 267, Gx_line+147, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(299, Gx_line+147, 532, Gx_line+147, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 429, Gx_line+126, 486, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+147, 636, Gx_line+147, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(655, Gx_line+147, 705, Gx_line+147, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+155) ;
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
      this.aP0[0] = ragrhdr.this.A396EmprCod;
      this.aP1[0] = ragrhdr.this.A3595BarMacCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Lit1 = "" ;
      GXt_char1 = "" ;
      AV14Pgmname = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P072Z2_A396EmprCod = new String[] {""} ;
      P072Z2_A407EmprNom = new String[] {""} ;
      P072Z2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      AV10TotKgs = DecimalUtil.ZERO ;
      P072Z4_A396EmprCod = new String[] {""} ;
      P072Z4_A3595BarMacCod = new int[1] ;
      P072Z4_A218BarTipCol = new byte[1] ;
      P072Z4_A136BarColNum = new int[1] ;
      P072Z4_A135BarColNom = new String[] {""} ;
      P072Z4_A212BarSer = new String[] {""} ;
      P072Z4_A130BarCodPar = new String[] {""} ;
      P072Z4_A132BarCodReo = new byte[1] ;
      P072Z4_A129BarCod = new int[1] ;
      P072Z4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072Z4_A199BarPie1 = new short[1] ;
      P072Z4_A365DisDes = new String[] {""} ;
      P072Z4_A898BarPieNDes = new int[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ragrhdr__default(),
         new Object[] {
             new Object[] {
            P072Z2_A396EmprCod, P072Z2_A407EmprNom, P072Z2_n407EmprNom
            }
            , new Object[] {
            P072Z4_A396EmprCod, P072Z4_A3595BarMacCod, P072Z4_A218BarTipCol, P072Z4_A136BarColNum, P072Z4_A135BarColNom, P072Z4_A212BarSer, P072Z4_A130BarCodPar, P072Z4_A132BarCodReo, P072Z4_A129BarCod, P072Z4_A166BarKgm,
            P072Z4_A199BarPie1, P072Z4_A365DisDes, P072Z4_A898BarPieNDes
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV14Pgmname = "RAGRHDR" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV14Pgmname = "RAGRHDR" ;
      Gx_err = (short)(0) ;
   }

   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A3595BarMacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV11TotPzs ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV10TotKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String AV9Lit1 ;
   private String GXt_char1 ;
   private String AV14Pgmname ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8EmprNom ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P072Z2_A396EmprCod ;
   private String[] P072Z2_A407EmprNom ;
   private boolean[] P072Z2_n407EmprNom ;
   private String[] P072Z4_A396EmprCod ;
   private int[] P072Z4_A3595BarMacCod ;
   private byte[] P072Z4_A218BarTipCol ;
   private int[] P072Z4_A136BarColNum ;
   private String[] P072Z4_A135BarColNom ;
   private String[] P072Z4_A212BarSer ;
   private String[] P072Z4_A130BarCodPar ;
   private byte[] P072Z4_A132BarCodReo ;
   private int[] P072Z4_A129BarCod ;
   private java.math.BigDecimal[] P072Z4_A166BarKgm ;
   private short[] P072Z4_A199BarPie1 ;
   private String[] P072Z4_A365DisDes ;
   private int[] P072Z4_A898BarPieNDes ;
}

final  class ragrhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P072Z2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072Z4", "SELECT T1.EmprCod, T1.BarMacCod, T1.BarTipCol, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarMacCod = ? ORDER BY T1.EmprCod, T1.BarMacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
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
      }
   }

}

