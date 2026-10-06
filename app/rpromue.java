package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rpromue extends GXReport
{
   public rpromue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpromue.class ), "" );
   }

   public rpromue( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      rpromue.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      rpromue.this.A396EmprCod = aP0[0];
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
         getPrinter().GxSetDocName("LISTADO PROGRAMAS MUESTRAS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV12Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV17Pgmname, (byte)(99), GXv_char2) ;
         rpromue.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit0 = GXt_char1 ;
         GXt_char1 = AV9Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rpromue.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit1 = GXt_char1 ;
         GXt_char1 = AV10Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rpromue.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit2 = GXt_char1 ;
         GXt_char1 = AV11Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rpromue.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit3 = GXt_char1 ;
         GXt_char1 = AV13Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT118_", ""), (byte)(99), GXv_char2) ;
         rpromue.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit4 = GXt_char1 ;
         GXt_char1 = AV14Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN198 ", ""), (byte)(99), GXv_char2) ;
         rpromue.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit5 = GXutil.trim( AV13Lit4) + " " + GXt_char1 ;
         /* Using cursor P07202 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07202_A407EmprNom[0] ;
            n407EmprNom = P07202_n407EmprNom[0] ;
            AV8NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07203 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6041NumProM = P07203_A6041NumProM[0] ;
            n6041NumProM = P07203_n6041NumProM[0] ;
            A6040NumProg = P07203_A6040NumProg[0] ;
            h7200( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6040NumProg), "ZZ9")), 4, Gx_line+0, 27, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6041NumProM), "ZZZ9")), 302, Gx_line+0, 332, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7200( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7200( boolean bFoot ,
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
            getPrinter().GxDrawText(":", 372, Gx_line+9, 380, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 503, Gx_line+9, 511, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8NomEmp, "")), 15, Gx_line+9, 266, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit1, "")), 335, Gx_line+9, 372, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 386, Gx_line+9, 445, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit2, "")), 459, Gx_line+9, 489, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 518, Gx_line+9, 577, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 503, Gx_line+43, 511, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit3, "")), 459, Gx_line+43, 504, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 525, Gx_line+43, 570, Gx_line+60, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit0, "")), 15, Gx_line+43, 183, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(3, Gx_line+74, 664, Gx_line+74, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit4, "")), 4, Gx_line+80, 114, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit5, "")), 302, Gx_line+82, 412, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+101, 113, Gx_line+101, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(302, Gx_line+102, 411, Gx_line+102, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+108) ;
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
      this.aP0[0] = rpromue.this.A396EmprCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Lit0 = "" ;
      AV17Pgmname = "" ;
      AV9Lit1 = "" ;
      AV10Lit2 = "" ;
      AV11Lit3 = "" ;
      AV13Lit4 = "" ;
      AV14Lit5 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P07202_A396EmprCod = new String[] {""} ;
      P07202_A407EmprNom = new String[] {""} ;
      P07202_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8NomEmp = "" ;
      P07203_A396EmprCod = new String[] {""} ;
      P07203_A6041NumProM = new short[1] ;
      P07203_n6041NumProM = new boolean[] {false} ;
      P07203_A6040NumProg = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rpromue__default(),
         new Object[] {
             new Object[] {
            P07202_A396EmprCod, P07202_A407EmprNom, P07202_n407EmprNom
            }
            , new Object[] {
            P07203_A396EmprCod, P07203_A6041NumProM, P07203_n6041NumProM, P07203_A6040NumProg
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV17Pgmname = "RPROMUE" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV17Pgmname = "RPROMUE" ;
      Gx_err = (short)(0) ;
   }

   private short A6041NumProM ;
   private short A6040NumProg ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String A396EmprCod ;
   private String AV12Lit0 ;
   private String AV17Pgmname ;
   private String AV9Lit1 ;
   private String AV10Lit2 ;
   private String AV11Lit3 ;
   private String AV13Lit4 ;
   private String AV14Lit5 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8NomEmp ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n6041NumProM ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07202_A396EmprCod ;
   private String[] P07202_A407EmprNom ;
   private boolean[] P07202_n407EmprNom ;
   private String[] P07203_A396EmprCod ;
   private short[] P07203_A6041NumProM ;
   private boolean[] P07203_n6041NumProM ;
   private short[] P07203_A6040NumProg ;
}

final  class rpromue__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07202", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07203", "SELECT EmprCod, NumProM, NumProg FROM TXPPROMUE WHERE EmprCod = ? ORDER BY EmprCod, NumProg ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
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

