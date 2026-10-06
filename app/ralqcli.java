package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralqcli extends GXReport
{
   public ralqcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralqcli.class ), "" );
   }

   public ralqcli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      ralqcli.this.aP2 = new int[] {0};
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
      ralqcli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralqcli.this.AV16PCliCod = aP1[0];
      this.aP1 = aP1;
      ralqcli.this.AV17UCliCod = aP2[0];
      this.aP2 = aP2;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LTDO. PRECIOS ALQUILER CLIENTE") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV23Lit0 = httpContext.getMessage( "LISTADO PRECIO STOCK CLIENTE", "") ;
         GXt_char1 = AV24Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ralqcli.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit1 = GXt_char1 ;
         GXt_char1 = AV25Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         ralqcli.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit2 = GXt_char1 ;
         GXt_char1 = AV26Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         ralqcli.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit3 = GXt_char1 ;
         GXt_char1 = AV27Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         ralqcli.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit4 = GXt_char1 ;
         AV28Lit5 = httpContext.getMessage( "Precio Stock", "") ;
         GXt_char1 = AV29Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         ralqcli.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit6 = GXt_char1 ;
         /* Using cursor P07782 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07782_A407EmprNom[0] ;
            n407EmprNom = P07782_n407EmprNom[0] ;
            AV20NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07783 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PCliCod), Integer.valueOf(AV17UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6679CliPreAlq = P07783_A6679CliPreAlq[0] ;
            n6679CliPreAlq = P07783_n6679CliPreAlq[0] ;
            A279CliNom = P07783_A279CliNom[0] ;
            A252CliCod = P07783_A252CliCod[0] ;
            h7780( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6679CliPreAlq, "ZZZ9.999")), 386, Gx_line+1, 460, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 69, Gx_line+1, 289, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 17, Gx_line+0, 62, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7780( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7780( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20NomEmp, "")), 9, Gx_line+11, 198, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 440, Gx_line+10, 448, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 572, Gx_line+10, 580, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 454, Gx_line+10, 513, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 586, Gx_line+10, 645, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 572, Gx_line+36, 580, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 598, Gx_line+36, 643, Gx_line+53, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit0, "")), 9, Gx_line+38, 268, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit1, "")), 396, Gx_line+10, 432, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit2, "")), 527, Gx_line+10, 556, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit3, "")), 527, Gx_line+36, 571, Gx_line+52, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit4, "")), 17, Gx_line+72, 68, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit5, "")), 378, Gx_line+72, 460, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+58, 664, Gx_line+58, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+90, 326, Gx_line+90, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+4, 664, Gx_line+4, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(378, Gx_line+90, 459, Gx_line+90, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Pgmname, "")), 396, Gx_line+36, 553, Gx_line+52, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+94) ;
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
      this.aP0[0] = ralqcli.this.A396EmprCod;
      this.aP1[0] = ralqcli.this.AV16PCliCod;
      this.aP2[0] = ralqcli.this.AV17UCliCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Lit0 = "" ;
      AV24Lit1 = "" ;
      AV25Lit2 = "" ;
      AV26Lit3 = "" ;
      AV27Lit4 = "" ;
      AV28Lit5 = "" ;
      AV29Lit6 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P07782_A396EmprCod = new String[] {""} ;
      P07782_A407EmprNom = new String[] {""} ;
      P07782_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV20NomEmp = "" ;
      P07783_A396EmprCod = new String[] {""} ;
      P07783_A6679CliPreAlq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07783_n6679CliPreAlq = new boolean[] {false} ;
      P07783_A279CliNom = new String[] {""} ;
      P07783_A252CliCod = new int[1] ;
      A6679CliPreAlq = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV40Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralqcli__default(),
         new Object[] {
             new Object[] {
            P07782_A396EmprCod, P07782_A407EmprNom, P07782_n407EmprNom
            }
            , new Object[] {
            P07783_A396EmprCod, P07783_A6679CliPreAlq, P07783_n6679CliPreAlq, P07783_A279CliNom, P07783_A252CliCod
            }
         }
      );
      AV40Pgmname = "RALQCLI" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV40Pgmname = "RALQCLI" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16PCliCod ;
   private int AV17UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A6679CliPreAlq ;
   private String A396EmprCod ;
   private String AV23Lit0 ;
   private String AV24Lit1 ;
   private String AV25Lit2 ;
   private String AV26Lit3 ;
   private String AV27Lit4 ;
   private String AV28Lit5 ;
   private String AV29Lit6 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV20NomEmp ;
   private String A279CliNom ;
   private String Gx_time ;
   private String AV40Pgmname ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n6679CliPreAlq ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07782_A396EmprCod ;
   private String[] P07782_A407EmprNom ;
   private boolean[] P07782_n407EmprNom ;
   private String[] P07783_A396EmprCod ;
   private java.math.BigDecimal[] P07783_A6679CliPreAlq ;
   private boolean[] P07783_n6679CliPreAlq ;
   private String[] P07783_A279CliNom ;
   private int[] P07783_A252CliCod ;
}

final  class ralqcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07782", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07783", "SELECT EmprCod, CliPreAlq, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ? and CliCod >= ?) AND (Not (CliPreAlq = 0)) AND (CliCod <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

