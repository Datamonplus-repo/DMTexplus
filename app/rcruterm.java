package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rcruterm extends GXReport
{
   public rcruterm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcruterm.class ), "" );
   }

   public rcruterm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rcruterm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      rcruterm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rcruterm.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rcruterm.this.AV8AlbRecPie = aP2[0];
      this.aP2 = aP2;
      rcruterm.this.Gx_out = aP3[0];
      this.aP3 = aP3;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIMAL", "", 2, 1, 256, 2880, 5760, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiqueta Crudo") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07S22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV8AlbRecPie, AV8AlbRecPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2159AlbRecPie = P07S22_A2159AlbRecPie[0] ;
            A5806AlbREnt2 = P07S22_A5806AlbREnt2[0] ;
            A2157AlbRecMtr = P07S22_A2157AlbRecMtr[0] ;
            A2155AlbRecKgm = P07S22_A2155AlbRecKgm[0] ;
            A46AlbREnt = P07S22_A46AlbREnt[0] ;
            A3613AlbRefDsc = P07S22_A3613AlbRefDsc[0] ;
            A45AlbRef = P07S22_A45AlbRef[0] ;
            A279CliNom = P07S22_A279CliNom[0] ;
            A252CliCod = P07S22_A252CliCod[0] ;
            A5806AlbREnt2 = P07S22_A5806AlbREnt2[0] ;
            A46AlbREnt = P07S22_A46AlbREnt[0] ;
            A3613AlbRefDsc = P07S22_A3613AlbRefDsc[0] ;
            A45AlbRef = P07S22_A45AlbRef[0] ;
            A252CliCod = P07S22_A252CliCod[0] ;
            A279CliNom = P07S22_A279CliNom[0] ;
            AV9BarCode = "*" + GXutil.trim( A2159AlbRecPie) + "*" ;
            AV10AlbRecPie1 = GXutil.trim( A2159AlbRecPie) ;
            h7S20( false, 219) ;
            getPrinter().GxAttris("3 of 9 Barcode", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarCode, "")), 81, Gx_line+16, 311, Gx_line+44, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbRecPie1, "")), 163, Gx_line+45, 230, Gx_line+62, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 0, Gx_line+83, 42, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 73, Gx_line+82, 118, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 135, Gx_line+82, 355, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 0, Gx_line+102, 46, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 73, Gx_line+101, 191, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 198, Gx_line+101, 389, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recepción", ""), 0, Gx_line+65, 65, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 305, Gx_line+64, 364, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 73, Gx_line+64, 132, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 135, Gx_line+65, 142, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 0, Gx_line+121, 29, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 73, Gx_line+120, 140, Gx_line+137, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 149, Gx_line+121, 190, Gx_line+135, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 198, Gx_line+120, 265, Gx_line+137, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbRecPie1, "")), 18, Gx_line+138, 375, Gx_line+215, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), 147, Gx_line+64, 294, Gx_line+81, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+219) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7S20( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7S20( boolean bFoot ,
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
      this.aP0[0] = rcruterm.this.A396EmprCod;
      this.aP1[0] = rcruterm.this.A44AlbRecCod;
      this.aP2[0] = rcruterm.this.AV8AlbRecPie;
      this.aP3[0] = rcruterm.this.Gx_out;
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
      P07S22_A396EmprCod = new String[] {""} ;
      P07S22_A44AlbRecCod = new int[1] ;
      P07S22_A2159AlbRecPie = new String[] {""} ;
      P07S22_A5806AlbREnt2 = new String[] {""} ;
      P07S22_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07S22_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07S22_A46AlbREnt = new String[] {""} ;
      P07S22_A3613AlbRefDsc = new String[] {""} ;
      P07S22_A45AlbRef = new String[] {""} ;
      P07S22_A279CliNom = new String[] {""} ;
      P07S22_A252CliCod = new int[1] ;
      A2159AlbRecPie = "" ;
      A5806AlbREnt2 = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      AV9BarCode = "" ;
      AV10AlbRecPie1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rcruterm__default(),
         new Object[] {
             new Object[] {
            P07S22_A396EmprCod, P07S22_A44AlbRecCod, P07S22_A2159AlbRecPie, P07S22_A5806AlbREnt2, P07S22_A2157AlbRecMtr, P07S22_A2155AlbRecKgm, P07S22_A46AlbREnt, P07S22_A3613AlbRefDsc, P07S22_A45AlbRef, P07S22_A279CliNom,
            P07S22_A252CliCod
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
   private String Gx_out ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private String AV9BarCode ;
   private String AV10AlbRecPie1 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P07S22_A396EmprCod ;
   private int[] P07S22_A44AlbRecCod ;
   private String[] P07S22_A2159AlbRecPie ;
   private String[] P07S22_A5806AlbREnt2 ;
   private java.math.BigDecimal[] P07S22_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07S22_A2155AlbRecKgm ;
   private String[] P07S22_A46AlbREnt ;
   private String[] P07S22_A3613AlbRefDsc ;
   private String[] P07S22_A45AlbRef ;
   private String[] P07S22_A279CliNom ;
   private int[] P07S22_A252CliCod ;
}

final  class rcruterm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07S22", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T2.AlbREnt2, T1.AlbRecMtr, T1.AlbRecKgm, T2.AlbREnt, T2.AlbRefDsc, T2.AlbRef, T3.CliNom, T2.CliCod FROM ((TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T1.EmprCod = ? and T1.AlbRecCod = ?) AND (T1.AlbRecPie = ? or (rtrim(?) IS NULL)) ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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

