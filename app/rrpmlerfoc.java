package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rrpmlerfoc extends GXReport
{
   public rrpmlerfoc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rrpmlerfoc.class ), "" );
   }

   public rrpmlerfoc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rrpmlerfoc.this.aP2 = new String[] {""};
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
      rrpmlerfoc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rrpmlerfoc.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rrpmlerfoc.this.Gx_out = aP2[0];
      this.aP2 = aP2;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Documento 2") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07U52 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07U52_A407EmprNom[0] ;
            n407EmprNom = P07U52_n407EmprNom[0] ;
            AV17EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07U53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A56AlbRUni = P07U53_A56AlbRUni[0] ;
            A52AlbRPieEnt = P07U53_A52AlbRPieEnt[0] ;
            A58AlbRUniEnt = P07U53_A58AlbRUniEnt[0] ;
            A3613AlbRefDsc = P07U53_A3613AlbRefDsc[0] ;
            A3359AlbRDisCli = P07U53_A3359AlbRDisCli[0] ;
            A4602AlbRMdlCod = P07U53_A4602AlbRMdlCod[0] ;
            AV19Unidades = ((GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", ""))==0) ? httpContext.getMessage( "QUILOS:", "") : httpContext.getMessage( "METROS:", "")) ;
            h7U50( false, 703) ;
            getPrinter().GxAttris("Courier New", 48, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MODELO:", ""), 43, Gx_line+219, 321, Gx_line+295, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 380, Gx_line+219, 896, Gx_line+292, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.P.:", ""), 33, Gx_line+328, 232, Gx_line+404, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3359AlbRDisCli, "")), 380, Gx_line+331, 979, Gx_line+403, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº ENTRADA:", ""), 38, Gx_line+438, 474, Gx_line+514, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 48, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 504, Gx_line+441, 822, Gx_line+514, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESCRIÇÃO:", ""), 30, Gx_line+578, 333, Gx_line+634, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 36, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 360, Gx_line+581, 1131, Gx_line+633, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 264, Gx_line+645, 537, Gx_line+698, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº DE ROLLOS:", ""), 570, Gx_line+643, 964, Gx_line+699, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 36, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 956, Gx_line+645, 1138, Gx_line+698, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Unidades, "")), 30, Gx_line+643, 242, Gx_line+700, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "23210b64-43cd-4ebc-a917-5ac49913cb1e", "", context.getHttpContext().getTheme( )), 43, Gx_line+16, 331, Gx_line+126) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "POLOPIQUÉ ACABAMENTOS TÊXTEIS, S.A.", ""), 43, Gx_line+131, 328, Gx_line+148, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+703) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7U50( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7U50( boolean bFoot ,
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
      this.aP0[0] = rrpmlerfoc.this.A396EmprCod;
      this.aP1[0] = rrpmlerfoc.this.A44AlbRecCod;
      this.aP2[0] = rrpmlerfoc.this.Gx_out;
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
      P07U52_A396EmprCod = new String[] {""} ;
      P07U52_A407EmprNom = new String[] {""} ;
      P07U52_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17EmprNom = "" ;
      P07U53_A396EmprCod = new String[] {""} ;
      P07U53_A44AlbRecCod = new int[1] ;
      P07U53_A56AlbRUni = new String[] {""} ;
      P07U53_A52AlbRPieEnt = new int[1] ;
      P07U53_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07U53_A3613AlbRefDsc = new String[] {""} ;
      P07U53_A3359AlbRDisCli = new String[] {""} ;
      P07U53_A4602AlbRMdlCod = new String[] {""} ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      A3359AlbRDisCli = "" ;
      A4602AlbRMdlCod = "" ;
      AV19Unidades = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rrpmlerfoc__default(),
         new Object[] {
             new Object[] {
            P07U52_A396EmprCod, P07U52_A407EmprNom, P07U52_n407EmprNom
            }
            , new Object[] {
            P07U53_A396EmprCod, P07U53_A44AlbRecCod, P07U53_A56AlbRUni, P07U53_A52AlbRPieEnt, P07U53_A58AlbRUniEnt, P07U53_A3613AlbRefDsc, P07U53_A3359AlbRDisCli, P07U53_A4602AlbRMdlCod
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
   private int A52AlbRPieEnt ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17EmprNom ;
   private String A56AlbRUni ;
   private String A3613AlbRefDsc ;
   private String A3359AlbRDisCli ;
   private String A4602AlbRMdlCod ;
   private String AV19Unidades ;
   private boolean n407EmprNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07U52_A396EmprCod ;
   private String[] P07U52_A407EmprNom ;
   private boolean[] P07U52_n407EmprNom ;
   private String[] P07U53_A396EmprCod ;
   private int[] P07U53_A44AlbRecCod ;
   private String[] P07U53_A56AlbRUni ;
   private int[] P07U53_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P07U53_A58AlbRUniEnt ;
   private String[] P07U53_A3613AlbRefDsc ;
   private String[] P07U53_A3359AlbRDisCli ;
   private String[] P07U53_A4602AlbRMdlCod ;
}

final  class rrpmlerfoc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07U52", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07U53", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRPieEnt, AlbRUniEnt, AlbRefDsc, AlbRDisCli, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
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

