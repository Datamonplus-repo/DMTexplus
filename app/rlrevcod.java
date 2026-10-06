package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rlrevcod extends GXReport
{
   public rlrevcod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rlrevcod.class ), "" );
   }

   public rlrevcod( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 )
   {
      rlrevcod.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 )
   {
      rlrevcod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rlrevcod.this.AV13Parfascod = aP1[0];
      this.aP1 = aP1;
      rlrevcod.this.AV14ParfascodF = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 3 ;
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
         getPrinter().GxSetDocName("LISTADO CODIGOS REVISTA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07DO2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07DO2_A407EmprNom[0] ;
            n407EmprNom = P07DO2_n407EmprNom[0] ;
            AV12NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07DO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV13Parfascod), Short.valueOf(AV14ParfascodF)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8058Rev_Dsc = P07DO3_A8058Rev_Dsc[0] ;
            n8058Rev_Dsc = P07DO3_n8058Rev_Dsc[0] ;
            A8057Rev_Cod = P07DO3_A8057Rev_Cod[0] ;
            h7DO0( false, 22) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8057Rev_Cod), "ZZZ9")), 114, Gx_line+3, 144, Gx_line+20, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8058Rev_Dsc, "")), 214, Gx_line+3, 653, Gx_line+20, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+22) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7DO0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7DO0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RGRAPRO", ""), 5, Gx_line+19, 774, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(24, Gx_line+18, 769, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RLPARM", ""), 28, Gx_line+20, 73, Gx_line+35, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12NomEmp, "")), 7, Gx_line+17, 227, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 688, Gx_line+20, 747, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 702, Gx_line+52, 747, Gx_line+69, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(24, Gx_line+73, 769, Gx_line+73, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigos Revista", ""), 277, Gx_line+36, 434, Gx_line+55, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag. :", ""), 630, Gx_line+51, 675, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data :", ""), 630, Gx_line+18, 675, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(29, Gx_line+107, 774, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 106, Gx_line+82, 151, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 245, Gx_line+82, 326, Gx_line+99, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+113) ;
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
      this.aP0[0] = rlrevcod.this.A396EmprCod;
      this.aP1[0] = rlrevcod.this.AV13Parfascod;
      this.aP2[0] = rlrevcod.this.AV14ParfascodF;
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
      P07DO2_A396EmprCod = new String[] {""} ;
      P07DO2_A407EmprNom = new String[] {""} ;
      P07DO2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12NomEmp = "" ;
      P07DO3_A396EmprCod = new String[] {""} ;
      P07DO3_A8058Rev_Dsc = new String[] {""} ;
      P07DO3_n8058Rev_Dsc = new boolean[] {false} ;
      P07DO3_A8057Rev_Cod = new short[1] ;
      A8058Rev_Dsc = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlrevcod__default(),
         new Object[] {
             new Object[] {
            P07DO2_A396EmprCod, P07DO2_A407EmprNom, P07DO2_n407EmprNom
            }
            , new Object[] {
            P07DO3_A396EmprCod, P07DO3_A8058Rev_Dsc, P07DO3_n8058Rev_Dsc, P07DO3_A8057Rev_Cod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short AV13Parfascod ;
   private short AV14ParfascodF ;
   private short A8057Rev_Cod ;
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
   private String AV12NomEmp ;
   private String A8058Rev_Dsc ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n8058Rev_Dsc ;
   private short[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07DO2_A396EmprCod ;
   private String[] P07DO2_A407EmprNom ;
   private boolean[] P07DO2_n407EmprNom ;
   private String[] P07DO3_A396EmprCod ;
   private String[] P07DO3_A8058Rev_Dsc ;
   private boolean[] P07DO3_n8058Rev_Dsc ;
   private short[] P07DO3_A8057Rev_Cod ;
}

final  class rlrevcod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07DO2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07DO3", "SELECT EmprCod, Rev_Dsc, Rev_Cod FROM TXPREVCOD WHERE (EmprCod = ? and Rev_Cod >= ?) AND (Rev_Cod <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

