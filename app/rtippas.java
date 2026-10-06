package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtippas extends GXReport
{
   public rtippas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtippas.class ), "" );
   }

   public rtippas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      rtippas.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      rtippas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
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
         getPrinter().GxSetDocName("INFORME") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV14Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit2 = GXt_char1 ;
         GXt_char1 = AV8Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV8Lit3 = GXt_char1 ;
         GXt_char1 = AV12Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit0 = GXt_char1 ;
         GXt_char1 = AV9Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit4 = GXt_char1 ;
         GXt_char1 = AV10Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN175_", ""), (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit5 = GXt_char1 ;
         GXt_char1 = AV29Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
         rtippas.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit6 = GXt_char1 ;
         /* Using cursor P07J72 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07J72_A407EmprNom[0] ;
            n407EmprNom = P07J72_n407EmprNom[0] ;
            AV32EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07J73 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1831TipPasDsc = P07J73_A1831TipPasDsc[0] ;
            n1831TipPasDsc = P07J73_n1831TipPasDsc[0] ;
            A1830TipPasCod = P07J73_A1830TipPasCod[0] ;
            h7J70( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1830TipPasCod), "9")), 44, Gx_line+0, 52, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1831TipPasDsc, "")), 139, Gx_line+0, 198, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7J70( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7J70( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit0, "")), 6, Gx_line+47, 167, Gx_line+63, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 21, Gx_line+81, 94, Gx_line+97, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit5, "")), 138, Gx_line+81, 211, Gx_line+97, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(21, Gx_line+99, 94, Gx_line+99, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(138, Gx_line+99, 357, Gx_line+99, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+5, 632, Gx_line+5, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+70, 632, Gx_line+70, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32EmprNom, "")), 5, Gx_line+13, 224, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 404, Gx_line+13, 463, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 563, Gx_line+13, 622, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 576, Gx_line+47, 621, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 333, Gx_line+14, 385, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit2, "")), 509, Gx_line+13, 538, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit3, "")), 509, Gx_line+47, 553, Gx_line+63, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 390, Gx_line+13, 394, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 556, Gx_line+47, 560, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 556, Gx_line+13, 560, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Pgmname, "")), 331, Gx_line+47, 389, Gx_line+63, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+103) ;
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
      this.aP0[0] = rtippas.this.A396EmprCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Lit1 = "" ;
      AV14Lit2 = "" ;
      AV8Lit3 = "" ;
      AV12Lit0 = "" ;
      AV36Pgmname = "" ;
      AV9Lit4 = "" ;
      AV10Lit5 = "" ;
      AV29Lit6 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P07J72_A396EmprCod = new String[] {""} ;
      P07J72_A407EmprNom = new String[] {""} ;
      P07J72_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV32EmprNom = "" ;
      P07J73_A396EmprCod = new String[] {""} ;
      P07J73_A1831TipPasDsc = new String[] {""} ;
      P07J73_n1831TipPasDsc = new boolean[] {false} ;
      P07J73_A1830TipPasCod = new byte[1] ;
      A1831TipPasDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtippas__default(),
         new Object[] {
             new Object[] {
            P07J72_A396EmprCod, P07J72_A407EmprNom, P07J72_n407EmprNom
            }
            , new Object[] {
            P07J73_A396EmprCod, P07J73_A1831TipPasDsc, P07J73_n1831TipPasDsc, P07J73_A1830TipPasCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV36Pgmname = "RTIPPAS" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV36Pgmname = "RTIPPAS" ;
      Gx_err = (short)(0) ;
   }

   private byte A1830TipPasCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String A396EmprCod ;
   private String AV33Lit1 ;
   private String AV14Lit2 ;
   private String AV8Lit3 ;
   private String AV12Lit0 ;
   private String AV36Pgmname ;
   private String AV9Lit4 ;
   private String AV10Lit5 ;
   private String AV29Lit6 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV32EmprNom ;
   private String A1831TipPasDsc ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n1831TipPasDsc ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07J72_A396EmprCod ;
   private String[] P07J72_A407EmprNom ;
   private boolean[] P07J72_n407EmprNom ;
   private String[] P07J73_A396EmprCod ;
   private String[] P07J73_A1831TipPasDsc ;
   private boolean[] P07J73_n1831TipPasDsc ;
   private byte[] P07J73_A1830TipPasCod ;
}

final  class rtippas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07J72", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07J73", "SELECT EmprCod, TipPasDsc, TipPasCod FROM TXPTIPPAS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
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

