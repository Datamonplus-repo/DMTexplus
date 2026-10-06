package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rviscli extends GXReport
{
   public rviscli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rviscli.class ), "" );
   }

   public rviscli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      rviscli.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      rviscli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rviscli.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      rviscli.this.A29Com_lin = aP2[0];
      this.aP2 = aP2;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORME VISITA COMERCIAL") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07KM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A23Com_Cod = P07KM2_A23Com_Cod[0] ;
            n23Com_Cod = P07KM2_n23Com_Cod[0] ;
            A608Com_Cont = P07KM2_A608Com_Cont[0] ;
            n608Com_Cont = P07KM2_n608Com_Cont[0] ;
            A36Com_diae = P07KM2_A36Com_diae[0] ;
            n36Com_diae = P07KM2_n36Com_diae[0] ;
            A24Com_dsc = P07KM2_A24Com_dsc[0] ;
            n24Com_dsc = P07KM2_n24Com_dsc[0] ;
            A31Com_diav = P07KM2_A31Com_diav[0] ;
            n31Com_diav = P07KM2_n31Com_diav[0] ;
            A279CliNom = P07KM2_A279CliNom[0] ;
            A41Com_obs = P07KM2_A41Com_obs[0] ;
            n41Com_obs = P07KM2_n41Com_obs[0] ;
            A24Com_dsc = P07KM2_A24Com_dsc[0] ;
            n24Com_dsc = P07KM2_n24Com_dsc[0] ;
            A279CliNom = P07KM2_A279CliNom[0] ;
            h7KM0( false, 156) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RELATORIO COMERCIAL VISITA CLIENTE", ""), 22, Gx_line+16, 279, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 299, Gx_line+16, 344, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 350, Gx_line+16, 570, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia da Visita", ""), 22, Gx_line+63, 98, Gx_line+77, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A31Com_diav, "99/99/99 99:99"), 139, Gx_line+63, 242, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A24Com_dsc, "")), 438, Gx_line+63, 731, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia Relatorio", ""), 22, Gx_line+94, 100, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A36Com_diae, "99/99/99 99:99"), 139, Gx_line+94, 242, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pessoa de Contacto", ""), 22, Gx_line+125, 142, Gx_line+139, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A608Com_Cont, "")), 146, Gx_line+125, 439, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Motivo da Visita", ""), 335, Gx_line+63, 431, Gx_line+77, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(27, Gx_line+148, 763, Gx_line+148, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+156) ;
            h7KM0( false, 422) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relatorio:", ""), 22, Gx_line+16, 80, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A41Com_obs, "")), 22, Gx_line+31, 764, Gx_line+406, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+422) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7KM0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7KM0( boolean bFoot ,
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
      this.aP0[0] = rviscli.this.A396EmprCod;
      this.aP1[0] = rviscli.this.A252CliCod;
      this.aP2[0] = rviscli.this.A29Com_lin;
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
      P07KM2_A23Com_Cod = new byte[1] ;
      P07KM2_n23Com_Cod = new boolean[] {false} ;
      P07KM2_A396EmprCod = new String[] {""} ;
      P07KM2_A252CliCod = new int[1] ;
      P07KM2_A29Com_lin = new int[1] ;
      P07KM2_A608Com_Cont = new String[] {""} ;
      P07KM2_n608Com_Cont = new boolean[] {false} ;
      P07KM2_A36Com_diae = new java.util.Date[] {GXutil.nullDate()} ;
      P07KM2_n36Com_diae = new boolean[] {false} ;
      P07KM2_A24Com_dsc = new String[] {""} ;
      P07KM2_n24Com_dsc = new boolean[] {false} ;
      P07KM2_A31Com_diav = new java.util.Date[] {GXutil.nullDate()} ;
      P07KM2_n31Com_diav = new boolean[] {false} ;
      P07KM2_A279CliNom = new String[] {""} ;
      P07KM2_A41Com_obs = new String[] {""} ;
      P07KM2_n41Com_obs = new boolean[] {false} ;
      A608Com_Cont = "" ;
      A36Com_diae = GXutil.resetTime( GXutil.nullDate() );
      A24Com_dsc = "" ;
      A31Com_diav = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A41Com_obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rviscli__default(),
         new Object[] {
             new Object[] {
            P07KM2_A23Com_Cod, P07KM2_n23Com_Cod, P07KM2_A396EmprCod, P07KM2_A252CliCod, P07KM2_A29Com_lin, P07KM2_A608Com_Cont, P07KM2_n608Com_Cont, P07KM2_A36Com_diae, P07KM2_n36Com_diae, P07KM2_A24Com_dsc,
            P07KM2_n24Com_dsc, P07KM2_A31Com_diav, P07KM2_n31Com_diav, P07KM2_A279CliNom, P07KM2_A41Com_obs, P07KM2_n41Com_obs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A23Com_Cod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A29Com_lin ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A608Com_Cont ;
   private String A24Com_dsc ;
   private String A279CliNom ;
   private java.util.Date A36Com_diae ;
   private java.util.Date A31Com_diav ;
   private boolean n23Com_Cod ;
   private boolean n608Com_Cont ;
   private boolean n36Com_diae ;
   private boolean n24Com_dsc ;
   private boolean n31Com_diav ;
   private boolean n41Com_obs ;
   private String A41Com_obs ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private byte[] P07KM2_A23Com_Cod ;
   private boolean[] P07KM2_n23Com_Cod ;
   private String[] P07KM2_A396EmprCod ;
   private int[] P07KM2_A252CliCod ;
   private int[] P07KM2_A29Com_lin ;
   private String[] P07KM2_A608Com_Cont ;
   private boolean[] P07KM2_n608Com_Cont ;
   private java.util.Date[] P07KM2_A36Com_diae ;
   private boolean[] P07KM2_n36Com_diae ;
   private String[] P07KM2_A24Com_dsc ;
   private boolean[] P07KM2_n24Com_dsc ;
   private java.util.Date[] P07KM2_A31Com_diav ;
   private boolean[] P07KM2_n31Com_diav ;
   private String[] P07KM2_A279CliNom ;
   private String[] P07KM2_A41Com_obs ;
   private boolean[] P07KM2_n41Com_obs ;
}

final  class rviscli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07KM2", "SELECT T1.Com_Cod, T1.EmprCod, T1.CliCod, T1.Com_lin, T1.Com_Cont, T1.Com_diae, T2.Com_dsc, T1.Com_diav, T3.CliNom, T1.Com_obs FROM ((TXPVISCLI T1 LEFT JOIN TXPTIPVIS T2 ON T2.EmprCod = T1.EmprCod AND T2.Com_Cod = T1.Com_Cod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.Com_lin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.Com_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((String[]) buf[14])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

