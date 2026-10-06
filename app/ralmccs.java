package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralmccs extends GXReport
{
   public ralmccs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralmccs.class ), "" );
   }

   public ralmccs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 )
   {
      ralmccs.this.aP2 = new short[] {0};
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
      ralmccs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralmccs.this.AV15TIPPRECOD = aP1[0];
      this.aP1 = aP1;
      ralmccs.this.AV16TIPPRECODf = aP2[0];
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
         getPrinter().GxSetDocName("LISTADO ALMACENES") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07HG2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07HG2_A407EmprNom[0] ;
            n407EmprNom = P07HG2_n407EmprNom[0] ;
            AV12NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07HG3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9531CC_NumAlm = P07HG3_A9531CC_NumAlm[0] ;
            n9531CC_NumAlm = P07HG3_n9531CC_NumAlm[0] ;
            A8909CC_AlmDsc = P07HG3_A8909CC_AlmDsc[0] ;
            n8909CC_AlmDsc = P07HG3_n8909CC_AlmDsc[0] ;
            A8908CC_AlmCod = P07HG3_A8908CC_AlmCod[0] ;
            h7HG0( false, 22) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9")), 121, Gx_line+3, 137, Gx_line+20, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8909CC_AlmDsc, "")), 214, Gx_line+3, 507, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9531CC_NumAlm), "ZZZZZZZ9")), 609, Gx_line+3, 668, Gx_line+20, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+22) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7HG0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7HG0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "RALMCCS", ""), 28, Gx_line+20, 80, Gx_line+35, 0+256, 0, 0, 0) ;
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12NomEmp, "")), 24, Gx_line+17, 244, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 688, Gx_line+20, 747, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 702, Gx_line+52, 747, Gx_line+69, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(24, Gx_line+73, 769, Gx_line+73, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Almacenes", ""), 277, Gx_line+36, 372, Gx_line+55, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag. :", ""), 638, Gx_line+51, 683, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha :", ""), 630, Gx_line+18, 682, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(24, Gx_line+107, 769, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 106, Gx_line+82, 151, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 245, Gx_line+82, 326, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numerador", ""), 602, Gx_line+83, 669, Gx_line+100, 0+256, 0, 0, 0) ;
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
      this.aP0[0] = ralmccs.this.A396EmprCod;
      this.aP1[0] = ralmccs.this.AV15TIPPRECOD;
      this.aP2[0] = ralmccs.this.AV16TIPPRECODf;
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
      P07HG2_A396EmprCod = new String[] {""} ;
      P07HG2_A407EmprNom = new String[] {""} ;
      P07HG2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12NomEmp = "" ;
      P07HG3_A396EmprCod = new String[] {""} ;
      P07HG3_A9531CC_NumAlm = new int[1] ;
      P07HG3_n9531CC_NumAlm = new boolean[] {false} ;
      P07HG3_A8909CC_AlmDsc = new String[] {""} ;
      P07HG3_n8909CC_AlmDsc = new boolean[] {false} ;
      P07HG3_A8908CC_AlmCod = new byte[1] ;
      A8909CC_AlmDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralmccs__default(),
         new Object[] {
             new Object[] {
            P07HG2_A396EmprCod, P07HG2_A407EmprNom, P07HG2_n407EmprNom
            }
            , new Object[] {
            P07HG3_A396EmprCod, P07HG3_A9531CC_NumAlm, P07HG3_n9531CC_NumAlm, P07HG3_A8909CC_AlmDsc, P07HG3_n8909CC_AlmDsc, P07HG3_A8908CC_AlmCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A8908CC_AlmCod ;
   private short AV15TIPPRECOD ;
   private short AV16TIPPRECODf ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9531CC_NumAlm ;
   private int Gx_OldLine ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12NomEmp ;
   private String A8909CC_AlmDsc ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n9531CC_NumAlm ;
   private boolean n8909CC_AlmDsc ;
   private short[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07HG2_A396EmprCod ;
   private String[] P07HG2_A407EmprNom ;
   private boolean[] P07HG2_n407EmprNom ;
   private String[] P07HG3_A396EmprCod ;
   private int[] P07HG3_A9531CC_NumAlm ;
   private boolean[] P07HG3_n9531CC_NumAlm ;
   private String[] P07HG3_A8909CC_AlmDsc ;
   private boolean[] P07HG3_n8909CC_AlmDsc ;
   private byte[] P07HG3_A8908CC_AlmCod ;
}

final  class ralmccs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07HG2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HG3", "SELECT EmprCod, CC_NumAlm, CC_AlmDsc, CC_AlmCod FROM TXPALMCCS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
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

