package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rcrustamp extends GXReport
{
   public rcrustamp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcrustamp.class ), "" );
   }

   public rcrustamp( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      rcrustamp.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      rcrustamp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rcrustamp.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rcrustamp.this.AV8AlbRecPie = aP2[0];
      this.aP2 = aP2;
      rcrustamp.this.AV12txt1 = aP3[0];
      this.aP3 = aP3;
      rcrustamp.this.Gx_out = aP4[0];
      this.aP4 = aP4;
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
         /* Using cursor P07SX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV8AlbRecPie, AV8AlbRecPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2159AlbRecPie = P07SX2_A2159AlbRecPie[0] ;
            A252CliCod = P07SX2_A252CliCod[0] ;
            A45AlbRef = P07SX2_A45AlbRef[0] ;
            A1291AlbRDes = P07SX2_A1291AlbRDes[0] ;
            A49AlbRFen = P07SX2_A49AlbRFen[0] ;
            A5806AlbREnt2 = P07SX2_A5806AlbREnt2[0] ;
            A2157AlbRecMtr = P07SX2_A2157AlbRecMtr[0] ;
            A2155AlbRecKgm = P07SX2_A2155AlbRecKgm[0] ;
            A50AlbRLoc = P07SX2_A50AlbRLoc[0] ;
            A3613AlbRefDsc = P07SX2_A3613AlbRefDsc[0] ;
            A279CliNom = P07SX2_A279CliNom[0] ;
            A252CliCod = P07SX2_A252CliCod[0] ;
            A45AlbRef = P07SX2_A45AlbRef[0] ;
            A1291AlbRDes = P07SX2_A1291AlbRDes[0] ;
            A49AlbRFen = P07SX2_A49AlbRFen[0] ;
            A5806AlbREnt2 = P07SX2_A5806AlbREnt2[0] ;
            A50AlbRLoc = P07SX2_A50AlbRLoc[0] ;
            A3613AlbRefDsc = P07SX2_A3613AlbRefDsc[0] ;
            A279CliNom = P07SX2_A279CliNom[0] ;
            AV9BarCode = "*" + GXutil.trim( A2159AlbRecPie) + "*" ;
            AV10AlbRecPie1 = GXutil.trim( A2159AlbRecPie) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_char3[0] = A45AlbRef ;
            GXv_char4[0] = AV11Tartdsc ;
            GXv_char5[0] = "" ;
            GXv_int6[0] = (short)(0) ;
            GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
            new app.pbusar4(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_decimal7) ;
            rcrustamp.this.A396EmprCod = GXv_char1[0] ;
            rcrustamp.this.A252CliCod = GXv_int2[0] ;
            rcrustamp.this.A45AlbRef = GXv_char3[0] ;
            rcrustamp.this.AV11Tartdsc = GXv_char4[0] ;
            h7SX0( false, 219) ;
            getPrinter().GxAttris("3 of 9 Barcode", 36, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9BarCode, "")), 36, Gx_line+16, 358, Gx_line+55, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbRecPie1, "")), 135, Gx_line+63, 258, Gx_line+88, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 7, Gx_line+126, 49, Gx_line+140, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 80, Gx_line+126, 125, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 139, Gx_line+125, 359, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 7, Gx_line+143, 53, Gx_line+157, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 80, Gx_line+142, 198, Gx_line+159, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 204, Gx_line+142, 395, Gx_line+159, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recepción", ""), 7, Gx_line+95, 72, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 314, Gx_line+109, 388, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 80, Gx_line+94, 139, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 143, Gx_line+95, 150, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 7, Gx_line+174, 36, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 80, Gx_line+173, 147, Gx_line+190, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 156, Gx_line+174, 197, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 205, Gx_line+173, 272, Gx_line+190, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), 154, Gx_line+94, 301, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 7, Gx_line+110, 44, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 80, Gx_line+109, 139, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Tartdsc, "")), 80, Gx_line+156, 227, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12txt1, "")), 292, Gx_line+188, 371, Gx_line+205, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubic.:", ""), 270, Gx_line+110, 306, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 204, Gx_line+156, 351, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 142, Gx_line+109, 266, Gx_line+125, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+219) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7SX0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7SX0( boolean bFoot ,
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
      this.aP0[0] = rcrustamp.this.A396EmprCod;
      this.aP1[0] = rcrustamp.this.A44AlbRecCod;
      this.aP2[0] = rcrustamp.this.AV8AlbRecPie;
      this.aP3[0] = rcrustamp.this.AV12txt1;
      this.aP4[0] = rcrustamp.this.Gx_out;
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
      P07SX2_A396EmprCod = new String[] {""} ;
      P07SX2_A44AlbRecCod = new int[1] ;
      P07SX2_A2159AlbRecPie = new String[] {""} ;
      P07SX2_A252CliCod = new int[1] ;
      P07SX2_A45AlbRef = new String[] {""} ;
      P07SX2_A1291AlbRDes = new String[] {""} ;
      P07SX2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P07SX2_A5806AlbREnt2 = new String[] {""} ;
      P07SX2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07SX2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07SX2_A50AlbRLoc = new String[] {""} ;
      P07SX2_A3613AlbRefDsc = new String[] {""} ;
      P07SX2_A279CliNom = new String[] {""} ;
      A2159AlbRecPie = "" ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A5806AlbREnt2 = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A3613AlbRefDsc = "" ;
      A279CliNom = "" ;
      AV9BarCode = "" ;
      AV10AlbRecPie1 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      AV11Tartdsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rcrustamp__default(),
         new Object[] {
             new Object[] {
            P07SX2_A396EmprCod, P07SX2_A44AlbRecCod, P07SX2_A2159AlbRecPie, P07SX2_A252CliCod, P07SX2_A45AlbRef, P07SX2_A1291AlbRDes, P07SX2_A49AlbRFen, P07SX2_A5806AlbREnt2, P07SX2_A2157AlbRecMtr, P07SX2_A2155AlbRecKgm,
            P07SX2_A50AlbRLoc, P07SX2_A3613AlbRefDsc, P07SX2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short GXv_int6[] ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String AV8AlbRecPie ;
   private String AV12txt1 ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A45AlbRef ;
   private String A1291AlbRDes ;
   private String A5806AlbREnt2 ;
   private String A50AlbRLoc ;
   private String A3613AlbRefDsc ;
   private String A279CliNom ;
   private String AV9BarCode ;
   private String AV10AlbRecPie1 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV11Tartdsc ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private java.util.Date A49AlbRFen ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P07SX2_A396EmprCod ;
   private int[] P07SX2_A44AlbRecCod ;
   private String[] P07SX2_A2159AlbRecPie ;
   private int[] P07SX2_A252CliCod ;
   private String[] P07SX2_A45AlbRef ;
   private String[] P07SX2_A1291AlbRDes ;
   private java.util.Date[] P07SX2_A49AlbRFen ;
   private String[] P07SX2_A5806AlbREnt2 ;
   private java.math.BigDecimal[] P07SX2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07SX2_A2155AlbRecKgm ;
   private String[] P07SX2_A50AlbRLoc ;
   private String[] P07SX2_A3613AlbRefDsc ;
   private String[] P07SX2_A279CliNom ;
}

final  class rcrustamp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07SX2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T2.CliCod, T2.AlbRef, T2.AlbRDes, T2.AlbRFen, T2.AlbREnt2, T1.AlbRecMtr, T1.AlbRecKgm, T2.AlbRLoc, T2.AlbRefDsc, T3.CliNom FROM ((TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T1.EmprCod = ? and T1.AlbRecCod = ?) AND (T1.AlbRecPie = ? or (rtrim(?) IS NULL)) ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
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

