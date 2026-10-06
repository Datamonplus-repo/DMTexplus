package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtaes11 extends GXReport
{
   public rtaes11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtaes11.class ), "" );
   }

   public rtaes11( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      rtaes11.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      rtaes11.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LISTADO TABLAS DOSIFICACION") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07RD2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07RD2_A407EmprNom[0] ;
            n407EmprNom = P07RD2_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char1 = AV13Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rtaes11.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit1 = GXt_char1 ;
         GXt_char1 = AV14Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rtaes11.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit2 = GXt_char1 ;
         AV10Lit3 = GXutil.trim( AV13Lit1) + " - " + GXutil.trim( AV14Lit2) ;
         GXt_char1 = AV9Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV18Pgmname, (byte)(99), GXv_char2) ;
         rtaes11.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit4 = GXt_char1 ;
         /* Using cursor P07RD3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11635TaesDc = P07RD3_A11635TaesDc[0] ;
            n11635TaesDc = P07RD3_n11635TaesDc[0] ;
            A11634TaesId = P07RD3_A11634TaesId[0] ;
            h7RD0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11634TaesId, "")), 17, Gx_line+0, 62, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11635TaesDc, "")), 67, Gx_line+0, 651, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7RD0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7RD0( boolean bFoot ,
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
            getPrinter().GxDrawLine(2, Gx_line+61, 643, Gx_line+61, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 6, Gx_line+4, 226, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 495, Gx_line+2, 554, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 573, Gx_line+2, 632, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 560, Gx_line+2, 565, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 576, Gx_line+32, 621, Gx_line+49, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 6, Gx_line+30, 340, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit3, "")), 404, Gx_line+2, 482, Gx_line+18, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit5, "")), 501, Gx_line+32, 565, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Pgmname, "")), 404, Gx_line+33, 561, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+117, 59, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(52, Gx_line+117, 652, Gx_line+117, 1, 0, 0, 0, 0) ;
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
      this.aP0[0] = rtaes11.this.A396EmprCod;
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
      P07RD2_A396EmprCod = new String[] {""} ;
      P07RD2_A407EmprNom = new String[] {""} ;
      P07RD2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      AV13Lit1 = "" ;
      AV14Lit2 = "" ;
      AV10Lit3 = "" ;
      AV9Lit4 = "" ;
      GXt_char1 = "" ;
      AV18Pgmname = "" ;
      GXv_char2 = new String[1] ;
      P07RD3_A396EmprCod = new String[] {""} ;
      P07RD3_A11635TaesDc = new String[] {""} ;
      P07RD3_n11635TaesDc = new boolean[] {false} ;
      P07RD3_A11634TaesId = new String[] {""} ;
      A11635TaesDc = "" ;
      A11634TaesId = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV11Lit5 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtaes11__default(),
         new Object[] {
             new Object[] {
            P07RD2_A396EmprCod, P07RD2_A407EmprNom, P07RD2_n407EmprNom
            }
            , new Object[] {
            P07RD3_A396EmprCod, P07RD3_A11635TaesDc, P07RD3_n11635TaesDc, P07RD3_A11634TaesId
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV18Pgmname = "RTAES11" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV18Pgmname = "RTAES11" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String A396EmprCod ;
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
   private String A11635TaesDc ;
   private String A11634TaesId ;
   private String Gx_time ;
   private String AV11Lit5 ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n11635TaesDc ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07RD2_A396EmprCod ;
   private String[] P07RD2_A407EmprNom ;
   private boolean[] P07RD2_n407EmprNom ;
   private String[] P07RD3_A396EmprCod ;
   private String[] P07RD3_A11635TaesDc ;
   private boolean[] P07RD3_n11635TaesDc ;
   private String[] P07RD3_A11634TaesId ;
}

final  class rtaes11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07RD2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RD3", "SELECT EmprCod, TaesDc, TaesId FROM TXPTAES00 WHERE EmprCod = ? ORDER BY EmprCod, TaesId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
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
      }
   }

}

