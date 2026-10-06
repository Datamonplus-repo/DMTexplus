package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class retimal extends GXReport
{
   public retimal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( retimal.class ), "" );
   }

   public retimal( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      retimal.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      retimal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      retimal.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      retimal.this.AV8AlbRecPie = aP2[0];
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIMAL", "", 2, 1, 256, 2880, 5760, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiquetas Maldonado") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07HZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV8AlbRecPie, AV8AlbRecPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2159AlbRecPie = P07HZ2_A2159AlbRecPie[0] ;
            A2157AlbRecMtr = P07HZ2_A2157AlbRecMtr[0] ;
            A2155AlbRecKgm = P07HZ2_A2155AlbRecKgm[0] ;
            A46AlbREnt = P07HZ2_A46AlbREnt[0] ;
            A3613AlbRefDsc = P07HZ2_A3613AlbRefDsc[0] ;
            A45AlbRef = P07HZ2_A45AlbRef[0] ;
            A279CliNom = P07HZ2_A279CliNom[0] ;
            A252CliCod = P07HZ2_A252CliCod[0] ;
            A46AlbREnt = P07HZ2_A46AlbREnt[0] ;
            A3613AlbRefDsc = P07HZ2_A3613AlbRefDsc[0] ;
            A45AlbRef = P07HZ2_A45AlbRef[0] ;
            A252CliCod = P07HZ2_A252CliCod[0] ;
            A279CliNom = P07HZ2_A279CliNom[0] ;
            AV9BarCode = "*" + GXutil.trim( A2159AlbRecPie) + "*" ;
            AV10AlbRecPie1 = GXutil.trim( A2159AlbRecPie) ;
            h7HZ0( false, 198) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarCode, "")), 83, Gx_line+0, 256, Gx_line+42, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbRecPie1, "")), 165, Gx_line+29, 232, Gx_line+46, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 2, Gx_line+68, 44, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 75, Gx_line+67, 120, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 138, Gx_line+67, 358, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 2, Gx_line+86, 48, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 75, Gx_line+85, 193, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 200, Gx_line+85, 391, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recepción", ""), 2, Gx_line+49, 67, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 150, Gx_line+48, 209, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 75, Gx_line+48, 134, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 138, Gx_line+49, 145, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 2, Gx_line+105, 31, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 75, Gx_line+104, 142, Gx_line+121, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 151, Gx_line+105, 192, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 200, Gx_line+104, 267, Gx_line+121, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbRecPie1, "")), 20, Gx_line+122, 377, Gx_line+199, 1+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+198) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7HZ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7HZ0( boolean bFoot ,
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
      this.aP0[0] = retimal.this.A396EmprCod;
      this.aP1[0] = retimal.this.A44AlbRecCod;
      this.aP2[0] = retimal.this.AV8AlbRecPie;
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
      P07HZ2_A396EmprCod = new String[] {""} ;
      P07HZ2_A44AlbRecCod = new int[1] ;
      P07HZ2_A2159AlbRecPie = new String[] {""} ;
      P07HZ2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HZ2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HZ2_A46AlbREnt = new String[] {""} ;
      P07HZ2_A3613AlbRefDsc = new String[] {""} ;
      P07HZ2_A45AlbRef = new String[] {""} ;
      P07HZ2_A279CliNom = new String[] {""} ;
      P07HZ2_A252CliCod = new int[1] ;
      A2159AlbRecPie = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      AV9BarCode = "" ;
      AV10AlbRecPie1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.retimal__default(),
         new Object[] {
             new Object[] {
            P07HZ2_A396EmprCod, P07HZ2_A44AlbRecCod, P07HZ2_A2159AlbRecPie, P07HZ2_A2157AlbRecMtr, P07HZ2_A2155AlbRecKgm, P07HZ2_A46AlbREnt, P07HZ2_A3613AlbRefDsc, P07HZ2_A45AlbRef, P07HZ2_A279CliNom, P07HZ2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private String A396EmprCod ;
   private String AV8AlbRecPie ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private String AV9BarCode ;
   private String AV10AlbRecPie1 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07HZ2_A396EmprCod ;
   private int[] P07HZ2_A44AlbRecCod ;
   private String[] P07HZ2_A2159AlbRecPie ;
   private java.math.BigDecimal[] P07HZ2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07HZ2_A2155AlbRecKgm ;
   private String[] P07HZ2_A46AlbREnt ;
   private String[] P07HZ2_A3613AlbRefDsc ;
   private String[] P07HZ2_A45AlbRef ;
   private String[] P07HZ2_A279CliNom ;
   private int[] P07HZ2_A252CliCod ;
}

final  class retimal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07HZ2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlbRecMtr, T1.AlbRecKgm, T2.AlbREnt, T2.AlbRefDsc, T2.AlbRef, T3.CliNom, T2.CliCod FROM ((TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T1.EmprCod = ? and T1.AlbRecCod = ?) AND (T1.AlbRecPie = ? or (rtrim(?) IS NULL)) ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 9);
               return;
      }
   }

}

