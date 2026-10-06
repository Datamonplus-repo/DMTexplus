package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablaoc extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablaoc pgm = new aptablaoc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablaoc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablaoc.class ), "" );
   }

   public aptablaoc( int remoteHandle ,
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("OPTIMIZACION CFORMU...") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV10Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV12Emprcod ;
         GXv_char2[0] = AV11EmprNom ;
         GXv_char3[0] = AV13usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
         aptablaoc.this.AV12Emprcod = GXv_char1[0] ;
         aptablaoc.this.AV11EmprNom = GXv_char2[0] ;
         aptablaoc.this.AV13usurcod = GXv_char3[0] ;
         /* Using cursor P03UD2 */
         pr_default.execute(0, new Object[] {AV12Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A831TipColCod = P03UD2_A831TipColCod[0] ;
            A483ForColNum = P03UD2_A483ForColNum[0] ;
            A482ForColNom = P03UD2_A482ForColNom[0] ;
            A494ForSer = P03UD2_A494ForSer[0] ;
            A252CliCod = P03UD2_A252CliCod[0] ;
            n252CliCod = P03UD2_n252CliCod[0] ;
            A396EmprCod = P03UD2_A396EmprCod[0] ;
            AV15Clicod = A252CliCod ;
            AV22Barser = A494ForSer ;
            AV23Barcolnom = A482ForColNom ;
            AV24Barcolnum = A483ForColNum ;
            AV25Bartipcol = A831TipColCod ;
            /* Execute user subroutine: 'BARPRO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV9Barpro == 0 )
            {
               h3UD0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "No existe en BARCAD", ""), 485, Gx_line+1, 616, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 16, Gx_line+1, 61, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 65, Gx_line+0, 183, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 190, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 296, Gx_line+1, 341, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 358, Gx_line+1, 374, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Optimized DELETE. */
               /* Using cursor P03UD3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
               /* End optimized DELETE. */
               /* Using cursor P03UD4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
               System.out.println( httpContext.getMessage( "NO Ok Color", "") );
            }
            else
            {
               System.out.println( httpContext.getMessage( "Ok Color", "") );
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3UD0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'BARPRO' Routine */
      returnInSub = false ;
      AV9Barpro = (byte)(0) ;
      /* Using cursor P03UD5 */
      pr_default.execute(3, new Object[] {AV12Emprcod, Integer.valueOf(AV15Clicod), AV22Barser, AV23Barcolnom, Integer.valueOf(AV24Barcolnum), Byte.valueOf(AV25Bartipcol)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P03UD5_A396EmprCod[0] ;
         A252CliCod = P03UD5_A252CliCod[0] ;
         n252CliCod = P03UD5_n252CliCod[0] ;
         A212BarSer = P03UD5_A212BarSer[0] ;
         A135BarColNom = P03UD5_A135BarColNom[0] ;
         A136BarColNum = P03UD5_A136BarColNum[0] ;
         A218BarTipCol = P03UD5_A218BarTipCol[0] ;
         A129BarCod = P03UD5_A129BarCod[0] ;
         A132BarCodReo = P03UD5_A132BarCodReo[0] ;
         A130BarCodPar = P03UD5_A130BarCodPar[0] ;
         AV9Barpro = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h3UD0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 669, Gx_line+21, 714, Gx_line+38, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 655, Gx_line+2, 714, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 592, Gx_line+2, 651, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Optimizacion Tablas", ""), 38, Gx_line+2, 158, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+39, 749, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+46) ;
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
      GXutil.refClasses(ptablaoc.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablaoc");
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
      AV10Station = "" ;
      AV12Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV13usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P03UD2_A831TipColCod = new byte[1] ;
      P03UD2_A483ForColNum = new int[1] ;
      P03UD2_A482ForColNom = new String[] {""} ;
      P03UD2_A494ForSer = new String[] {""} ;
      P03UD2_A252CliCod = new int[1] ;
      P03UD2_n252CliCod = new boolean[] {false} ;
      P03UD2_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      AV22Barser = "" ;
      AV23Barcolnom = "" ;
      P03UD5_A396EmprCod = new String[] {""} ;
      P03UD5_A252CliCod = new int[1] ;
      P03UD5_n252CliCod = new boolean[] {false} ;
      P03UD5_A212BarSer = new String[] {""} ;
      P03UD5_A135BarColNom = new String[] {""} ;
      P03UD5_A136BarColNum = new int[1] ;
      P03UD5_A218BarTipCol = new byte[1] ;
      P03UD5_A129BarCod = new int[1] ;
      P03UD5_A132BarCodReo = new byte[1] ;
      P03UD5_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A130BarCodPar = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablaoc__default(),
         new Object[] {
             new Object[] {
            P03UD2_A831TipColCod, P03UD2_A483ForColNum, P03UD2_A482ForColNom, P03UD2_A494ForSer, P03UD2_A252CliCod, P03UD2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03UD5_A396EmprCod, P03UD5_A252CliCod, P03UD5_n252CliCod, P03UD5_A212BarSer, P03UD5_A135BarColNom, P03UD5_A136BarColNum, P03UD5_A218BarTipCol, P03UD5_A129BarCod, P03UD5_A132BarCodReo, P03UD5_A130BarCodPar
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV25Bartipcol ;
   private byte AV9Barpro ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV15Clicod ;
   private int AV24Barcolnum ;
   private int Gx_OldLine ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private String AV10Station ;
   private String AV12Emprcod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV13usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String AV22Barser ;
   private String AV23Barcolnom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private byte[] P03UD2_A831TipColCod ;
   private int[] P03UD2_A483ForColNum ;
   private String[] P03UD2_A482ForColNom ;
   private String[] P03UD2_A494ForSer ;
   private int[] P03UD2_A252CliCod ;
   private boolean[] P03UD2_n252CliCod ;
   private String[] P03UD2_A396EmprCod ;
   private String[] P03UD5_A396EmprCod ;
   private int[] P03UD5_A252CliCod ;
   private boolean[] P03UD5_n252CliCod ;
   private String[] P03UD5_A212BarSer ;
   private String[] P03UD5_A135BarColNom ;
   private int[] P03UD5_A136BarColNum ;
   private byte[] P03UD5_A218BarTipCol ;
   private int[] P03UD5_A129BarCod ;
   private byte[] P03UD5_A132BarCodReo ;
   private String[] P03UD5_A130BarCodPar ;
}

final  class aptablaoc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03UD2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod >= 0) AND (CliCod <= 999999) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03UD3", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P03UD4", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P03UD5", "SELECT EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and CliCod = ? and BarSer = ? and BarColNom = ? and BarColNum = ? and BarTipCol = ? ORDER BY EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

