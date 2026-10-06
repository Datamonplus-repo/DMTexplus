package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pbmabaux extends GXReport
{
   public pbmabaux( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbmabaux.class ), "" );
   }

   public pbmabaux( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 ,
                               int[] aP1 ,
                               String[] AV20Tab_art )
   {
      AV21Tab_pr = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV21Tab_pr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, AV20Tab_art, AV21Tab_pr);
      return AV21Tab_pr;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] AV20Tab_art ,
                        String[] AV21Tab_pr )
   {
      execute_int(aP0, aP1, AV20Tab_art, AV21Tab_pr);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] AV20Tab_art ,
                             String[] AV21Tab_pr )
   {
      pbmabaux.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbmabaux.this.AV10CliCod = aP1[0];
      this.aP1 = aP1;
      pbmabaux.this.AV20Tab_art = AV20Tab_art;
      pbmabaux.this.AV21Tab_pr = AV21Tab_pr;
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
         getPrinter().GxSetDocName("INFORME PRECIOS GLOGAL") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P01EL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P01EL2_A65ArtCod[0] ;
            A1504CliProCod = P01EL2_A1504CliProCod[0] ;
            A252CliCod = P01EL2_A252CliCod[0] ;
            A279CliNom = P01EL2_A279CliNom[0] ;
            A1505CliProDsc = P01EL2_A1505CliProDsc[0] ;
            n1505CliProDsc = P01EL2_n1505CliProDsc[0] ;
            A279CliNom = P01EL2_A279CliNom[0] ;
            A1505CliProDsc = P01EL2_A1505CliProDsc[0] ;
            n1505CliProDsc = P01EL2_n1505CliProDsc[0] ;
            if ( new app.core.ascan(remoteHandle, context).executeUdp( AV20Tab_art, A65ArtCod) > 0 )
            {
               if ( new app.core.ascan(remoteHandle, context).executeUdp( AV21Tab_pr, A1504CliProCod) > 0 )
               {
                  h1EL0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1505CliProDsc, "")), 144, Gx_line+1, 436, Gx_line+17, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 16, Gx_line+0, 134, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Using cursor P01EL3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A5362IntCodF = P01EL3_A5362IntCodF[0] ;
                     A10266PgblMtr = P01EL3_A10266PgblMtr[0] ;
                     n10266PgblMtr = P01EL3_n10266PgblMtr[0] ;
                     A10267PgblKgm = P01EL3_A10267PgblKgm[0] ;
                     n10267PgblKgm = P01EL3_n10267PgblKgm[0] ;
                     A5363IntDscF = P01EL3_A5363IntDscF[0] ;
                     n5363IntDscF = P01EL3_n5363IntDscF[0] ;
                     A5363IntDscF = P01EL3_A5363IntDscF[0] ;
                     n5363IntDscF = P01EL3_n5363IntDscF[0] ;
                     h1EL0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5363IntDscF, "")), 332, Gx_line+1, 552, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A10267PgblKgm, "ZZZZZZ9.999")), 559, Gx_line+1, 655, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A10266PgblMtr, "ZZZZZZ9.999")), 665, Gx_line+0, 761, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1EL0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h1EL0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 22, Gx_line+20, 67, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 86, Gx_line+19, 306, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 16, Gx_line+99, 52, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 144, Gx_line+99, 200, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Intensidade", ""), 332, Gx_line+99, 401, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço Kg", ""), 603, Gx_line+99, 655, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço Mt", ""), 708, Gx_line+99, 760, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(332, Gx_line+116, 551, Gx_line+116, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(570, Gx_line+116, 654, Gx_line+116, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(665, Gx_line+116, 760, Gx_line+116, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+116, 133, Gx_line+116, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(144, Gx_line+116, 329, Gx_line+116, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+123) ;
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
      this.aP0[0] = pbmabaux.this.A396EmprCod;
      this.aP1[0] = pbmabaux.this.AV10CliCod;
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
      P01EL2_A758ProCod = new String[] {""} ;
      P01EL2_A396EmprCod = new String[] {""} ;
      P01EL2_A65ArtCod = new String[] {""} ;
      P01EL2_A1504CliProCod = new String[] {""} ;
      P01EL2_A252CliCod = new int[1] ;
      P01EL2_A279CliNom = new String[] {""} ;
      P01EL2_A1505CliProDsc = new String[] {""} ;
      P01EL2_n1505CliProDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A1504CliProCod = "" ;
      A279CliNom = "" ;
      A1505CliProDsc = "" ;
      P01EL3_A5362IntCodF = new byte[1] ;
      P01EL3_A396EmprCod = new String[] {""} ;
      P01EL3_A252CliCod = new int[1] ;
      P01EL3_A1504CliProCod = new String[] {""} ;
      P01EL3_A65ArtCod = new String[] {""} ;
      P01EL3_A10266PgblMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EL3_n10266PgblMtr = new boolean[] {false} ;
      P01EL3_A10267PgblKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EL3_n10267PgblKgm = new boolean[] {false} ;
      P01EL3_A5363IntDscF = new String[] {""} ;
      P01EL3_n5363IntDscF = new boolean[] {false} ;
      A10266PgblMtr = DecimalUtil.ZERO ;
      A10267PgblKgm = DecimalUtil.ZERO ;
      A5363IntDscF = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbmabaux__default(),
         new Object[] {
             new Object[] {
            P01EL2_A758ProCod, P01EL2_A396EmprCod, P01EL2_A65ArtCod, P01EL2_A1504CliProCod, P01EL2_A252CliCod, P01EL2_A279CliNom, P01EL2_A1505CliProDsc, P01EL2_n1505CliProDsc
            }
            , new Object[] {
            P01EL3_A5362IntCodF, P01EL3_A396EmprCod, P01EL3_A252CliCod, P01EL3_A1504CliProCod, P01EL3_A65ArtCod, P01EL3_A10266PgblMtr, P01EL3_n10266PgblMtr, P01EL3_A10267PgblKgm, P01EL3_n10267PgblKgm, P01EL3_A5363IntDscF,
            P01EL3_n5363IntDscF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A5362IntCodF ;
   private short Gx_err ;
   private int GX_I ;
   private int AV10CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A10266PgblMtr ;
   private java.math.BigDecimal A10267PgblKgm ;
   private String A396EmprCod ;
   private String AV20Tab_art[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A1504CliProCod ;
   private String A279CliNom ;
   private String A1505CliProDsc ;
   private String A5363IntDscF ;
   private boolean GxHdr2 ;
   private boolean n1505CliProDsc ;
   private boolean n10266PgblMtr ;
   private boolean n10267PgblKgm ;
   private boolean n5363IntDscF ;
   private String[] AV21Tab_pr ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01EL2_A758ProCod ;
   private String[] P01EL2_A396EmprCod ;
   private String[] P01EL2_A65ArtCod ;
   private String[] P01EL2_A1504CliProCod ;
   private int[] P01EL2_A252CliCod ;
   private String[] P01EL2_A279CliNom ;
   private String[] P01EL2_A1505CliProDsc ;
   private boolean[] P01EL2_n1505CliProDsc ;
   private byte[] P01EL3_A5362IntCodF ;
   private String[] P01EL3_A396EmprCod ;
   private int[] P01EL3_A252CliCod ;
   private String[] P01EL3_A1504CliProCod ;
   private String[] P01EL3_A65ArtCod ;
   private java.math.BigDecimal[] P01EL3_A10266PgblMtr ;
   private boolean[] P01EL3_n10266PgblMtr ;
   private java.math.BigDecimal[] P01EL3_A10267PgblKgm ;
   private boolean[] P01EL3_n10267PgblKgm ;
   private String[] P01EL3_A5363IntDscF ;
   private boolean[] P01EL3_n5363IntDscF ;
}

final  class pbmabaux__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01EL2", "SELECT T3.ProCod, T1.EmprCod, T1.ArtCod, T1.CliProCod, T1.CliCod, T2.CliNom, COALESCE( T3.ProDsc, '                            ') AS CliProDsc FROM ((TXPCPREPR T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.CliProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliProCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EL3", "SELECT T1.IntCodF, T1.EmprCod, T1.CliCod, T1.CliProCod, T1.ArtCod, T1.PgblMtr, T1.PgblKgm, T2.IntDscF FROM (TXPPREGBL T1 INNER JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliProCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliProCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
      }
   }

}

