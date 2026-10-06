package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtrncos extends GXReport
{
   public rtrncos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtrncos.class ), "" );
   }

   public rtrncos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     short[] aP1 )
   {
      rtrncos.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 )
   {
      rtrncos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rtrncos.this.A840TrnCod = aP1[0];
      this.aP1 = aP1;
      rtrncos.this.A11061Trn_Diaf = aP2[0];
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORME COSTES TRANSPORTISTA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07OP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07OP2_A407EmprNom[0] ;
            n407EmprNom = P07OP2_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P07OP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A841TrnNom = P07OP3_A841TrnNom[0] ;
            n841TrnNom = P07OP3_n841TrnNom[0] ;
            A841TrnNom = P07OP3_A841TrnNom[0] ;
            n841TrnNom = P07OP3_n841TrnNom[0] ;
            /* Using cursor P07OP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A11065Trn_val = P07OP4_A11065Trn_val[0] ;
               n11065Trn_val = P07OP4_n11065Trn_val[0] ;
               A11064Trn_Kgs = P07OP4_A11064Trn_Kgs[0] ;
               n11064Trn_Kgs = P07OP4_n11064Trn_Kgs[0] ;
               A279CliNom = P07OP4_A279CliNom[0] ;
               A252CliCod = P07OP4_A252CliCod[0] ;
               n252CliCod = P07OP4_n252CliCod[0] ;
               A11063Trn_Lin = P07OP4_A11063Trn_Lin[0] ;
               A279CliNom = P07OP4_A279CliNom[0] ;
               h7OP0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11063Trn_Lin), "ZZZ9")), 29, Gx_line+0, 59, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 88, Gx_line+0, 133, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 146, Gx_line+0, 366, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11064Trn_Kgs, "ZZZZZ9.99")), 438, Gx_line+0, 505, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11065Trn_val, "ZZZZZZZZ9.999")), 540, Gx_line+0, 636, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7OP0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7OP0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Transportista:", ""), 15, Gx_line+33, 118, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 117, Gx_line+33, 147, Gx_line+50, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 153, Gx_line+33, 373, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dia:", ""), 88, Gx_line+50, 118, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A11061Trn_Diaf, "99/99/99"), 117, Gx_line+50, 176, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 29, Gx_line+83, 66, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 88, Gx_line+83, 140, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 146, Gx_line+83, 191, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 467, Gx_line+83, 504, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 598, Gx_line+83, 635, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(29, Gx_line+100, 65, Gx_line+100, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(88, Gx_line+100, 139, Gx_line+100, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(146, Gx_line+100, 365, Gx_line+100, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+100, 504, Gx_line+100, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(540, Gx_line+100, 635, Gx_line+100, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 15, Gx_line+0, 235, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+75, 758, Gx_line+75, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+103) ;
            }
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
      this.aP0[0] = rtrncos.this.A396EmprCod;
      this.aP1[0] = rtrncos.this.A840TrnCod;
      this.aP2[0] = rtrncos.this.A11061Trn_Diaf;
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
      P07OP2_A396EmprCod = new String[] {""} ;
      P07OP2_A407EmprNom = new String[] {""} ;
      P07OP2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      P07OP3_A396EmprCod = new String[] {""} ;
      P07OP3_A840TrnCod = new short[1] ;
      P07OP3_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      P07OP3_A841TrnNom = new String[] {""} ;
      P07OP3_n841TrnNom = new boolean[] {false} ;
      A841TrnNom = "" ;
      P07OP4_A396EmprCod = new String[] {""} ;
      P07OP4_A840TrnCod = new short[1] ;
      P07OP4_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      P07OP4_A11065Trn_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07OP4_n11065Trn_val = new boolean[] {false} ;
      P07OP4_A11064Trn_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07OP4_n11064Trn_Kgs = new boolean[] {false} ;
      P07OP4_A279CliNom = new String[] {""} ;
      P07OP4_A252CliCod = new int[1] ;
      P07OP4_n252CliCod = new boolean[] {false} ;
      P07OP4_A11063Trn_Lin = new short[1] ;
      A11065Trn_val = DecimalUtil.ZERO ;
      A11064Trn_Kgs = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtrncos__default(),
         new Object[] {
             new Object[] {
            P07OP2_A396EmprCod, P07OP2_A407EmprNom, P07OP2_n407EmprNom
            }
            , new Object[] {
            P07OP3_A396EmprCod, P07OP3_A840TrnCod, P07OP3_A11061Trn_Diaf, P07OP3_A841TrnNom, P07OP3_n841TrnNom
            }
            , new Object[] {
            P07OP4_A396EmprCod, P07OP4_A840TrnCod, P07OP4_A11061Trn_Diaf, P07OP4_A11065Trn_val, P07OP4_n11065Trn_val, P07OP4_A11064Trn_Kgs, P07OP4_n11064Trn_Kgs, P07OP4_A279CliNom, P07OP4_A252CliCod, P07OP4_n252CliCod,
            P07OP4_A11063Trn_Lin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short A11063Trn_Lin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A11065Trn_val ;
   private java.math.BigDecimal A11064Trn_Kgs ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8EmprNom ;
   private String A841TrnNom ;
   private String A279CliNom ;
   private java.util.Date A11061Trn_Diaf ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n841TrnNom ;
   private boolean n11065Trn_val ;
   private boolean n11064Trn_Kgs ;
   private boolean n252CliCod ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07OP2_A396EmprCod ;
   private String[] P07OP2_A407EmprNom ;
   private boolean[] P07OP2_n407EmprNom ;
   private String[] P07OP3_A396EmprCod ;
   private short[] P07OP3_A840TrnCod ;
   private java.util.Date[] P07OP3_A11061Trn_Diaf ;
   private String[] P07OP3_A841TrnNom ;
   private boolean[] P07OP3_n841TrnNom ;
   private String[] P07OP4_A396EmprCod ;
   private short[] P07OP4_A840TrnCod ;
   private java.util.Date[] P07OP4_A11061Trn_Diaf ;
   private java.math.BigDecimal[] P07OP4_A11065Trn_val ;
   private boolean[] P07OP4_n11065Trn_val ;
   private java.math.BigDecimal[] P07OP4_A11064Trn_Kgs ;
   private boolean[] P07OP4_n11064Trn_Kgs ;
   private String[] P07OP4_A279CliNom ;
   private int[] P07OP4_A252CliCod ;
   private boolean[] P07OP4_n252CliCod ;
   private short[] P07OP4_A11063Trn_Lin ;
}

final  class rtrncos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07OP2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07OP3", "SELECT T1.EmprCod, T1.TrnCod, T1.Trn_Diaf, T2.TrnNom FROM (TXPTRNCOS T1 INNER JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.TrnCod = ? and T1.Trn_Diaf = ? ORDER BY T1.EmprCod, T1.TrnCod, T1.Trn_Diaf ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07OP4", "SELECT T1.EmprCod, T1.TrnCod, T1.Trn_Diaf, T1.Trn_val, T1.Trn_Kgs, T2.CliNom, T1.CliCod, T1.Trn_Lin FROM (TXPTRNCO1 T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.TrnCod = ? and T1.Trn_Diaf = ? ORDER BY T1.EmprCod, T1.TrnCod, T1.Trn_Diaf, T1.Trn_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

