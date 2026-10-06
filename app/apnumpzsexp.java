package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apnumpzsexp extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apnumpzsexp pgm = new apnumpzsexp (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apnumpzsexp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apnumpzsexp.class ), "" );
   }

   public apnumpzsexp( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Num Pzs Exp") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         new app.pdbconn(remoteHandle, context).execute( ) ;
         AV16Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV17EmprCod ;
         GXv_char2[0] = AV18EmprNom ;
         GXv_char3[0] = AV19UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char1, GXv_char2, GXv_char3) ;
         apnumpzsexp.this.AV17EmprCod = GXv_char1[0] ;
         apnumpzsexp.this.AV18EmprNom = GXv_char2[0] ;
         apnumpzsexp.this.AV19UsurCod = GXv_char3[0] ;
         /* Using cursor P04OK2 */
         pr_default.execute(0, new Object[] {AV17EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P04OK2_A396EmprCod[0] ;
            A130BarCodPar = P04OK2_A130BarCodPar[0] ;
            A132BarCodReo = P04OK2_A132BarCodReo[0] ;
            A129BarCod = P04OK2_A129BarCod[0] ;
            A2809MetTerCod = P04OK2_A2809MetTerCod[0] ;
            A2826BarNumLot = P04OK2_A2826BarNumLot[0] ;
            A2826BarNumLot = P04OK2_A2826BarNumLot[0] ;
            AV20UltPza = A2826BarNumLot ;
            AV21Nump = 0 ;
            AV22LastPieza = 0 ;
            /* Using cursor P04OK3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2813MetPieCod = P04OK3_A2813MetPieCod[0] ;
               AV21Nump = (int)(AV21Nump+1) ;
               AV22LastPieza = (int)(GXutil.lval( A2813MetPieCod)) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( ( ( AV20UltPza == 0 ) && ( AV21Nump > 0 ) ) || ( ( AV20UltPza > 0 ) && ( AV21Nump > 0 ) && ( AV20UltPza != AV22LastPieza ) ) )
            {
               h4OK0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), 15, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 102, Gx_line+0, 161, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 168, Gx_line+0, 176, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 182, Gx_line+0, 190, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20UltPza), "ZZZZZZZ9")), 204, Gx_line+0, 263, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21Nump), "ZZZZZ9")), 328, Gx_line+0, 373, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22LastPieza), "ZZZZZZZ9")), 445, Gx_line+0, 504, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
            }
            Gx_msg = httpContext.getMessage( "Procesando... ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4OK0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h4OK0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 15, Gx_line+0, 66, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 102, Gx_line+0, 124, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ultima Pza", ""), 204, Gx_line+0, 268, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total Piezas", ""), 328, Gx_line+0, 402, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ultima Pieza", ""), 445, Gx_line+0, 519, Gx_line+14, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
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

   public static Object refClasses( )
   {
      GXutil.refClasses(pnumpzsexp.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      if (Application.realMainProgram == this)	waitPrinterEnd();
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Station = "" ;
      AV17EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV18EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV19UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04OK2_A396EmprCod = new String[] {""} ;
      P04OK2_A130BarCodPar = new String[] {""} ;
      P04OK2_A132BarCodReo = new byte[1] ;
      P04OK2_A129BarCod = new int[1] ;
      P04OK2_A2809MetTerCod = new String[] {""} ;
      P04OK2_A2826BarNumLot = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      P04OK3_A396EmprCod = new String[] {""} ;
      P04OK3_A2809MetTerCod = new String[] {""} ;
      P04OK3_A129BarCod = new int[1] ;
      P04OK3_A132BarCodReo = new byte[1] ;
      P04OK3_A130BarCodPar = new String[] {""} ;
      P04OK3_A2813MetPieCod = new String[] {""} ;
      A2813MetPieCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apnumpzsexp__default(),
         new Object[] {
             new Object[] {
            P04OK2_A396EmprCod, P04OK2_A130BarCodPar, P04OK2_A132BarCodReo, P04OK2_A129BarCod, P04OK2_A2809MetTerCod, P04OK2_A2826BarNumLot
            }
            , new Object[] {
            P04OK3_A396EmprCod, P04OK3_A2809MetTerCod, P04OK3_A129BarCod, P04OK3_A132BarCodReo, P04OK3_A130BarCodPar, P04OK3_A2813MetPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A2826BarNumLot ;
   private int AV20UltPza ;
   private int AV21Nump ;
   private int AV22LastPieza ;
   private int Gx_OldLine ;
   private String AV16Station ;
   private String AV17EmprCod ;
   private String GXv_char1[] ;
   private String AV18EmprNom ;
   private String GXv_char2[] ;
   private String AV19UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String A2813MetPieCod ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private String[] P04OK2_A396EmprCod ;
   private String[] P04OK2_A130BarCodPar ;
   private byte[] P04OK2_A132BarCodReo ;
   private int[] P04OK2_A129BarCod ;
   private String[] P04OK2_A2809MetTerCod ;
   private int[] P04OK2_A2826BarNumLot ;
   private String[] P04OK3_A396EmprCod ;
   private String[] P04OK3_A2809MetTerCod ;
   private int[] P04OK3_A129BarCod ;
   private byte[] P04OK3_A132BarCodReo ;
   private String[] P04OK3_A130BarCodPar ;
   private String[] P04OK3_A2813MetPieCod ;
}

final  class apnumpzsexp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OK2", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.MetTerCod, T2.BarNumLot FROM (TXPCMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OK3", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

