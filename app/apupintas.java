package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apupintas extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apupintas pgm = new apupintas (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apupintas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apupintas.class ), "" );
   }

   public apupintas( int remoteHandle ,
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("UPINTAS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P03LV2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P03LV2_A130BarCodPar[0] ;
            A132BarCodReo = P03LV2_A132BarCodReo[0] ;
            A129BarCod = P03LV2_A129BarCod[0] ;
            A396EmprCod = P03LV2_A396EmprCod[0] ;
            A213BarSit = P03LV2_A213BarSit[0] ;
            A161BarFecSal = P03LV2_A161BarFecSal[0] ;
            AV12Barfecsal = A161BarFecSal ;
            AV9Linea = (byte)(0) ;
            AV8Discomlin = (byte)(0) ;
            /* Using cursor P03LV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1032FonCod = P03LV3_A1032FonCod[0] ;
               A1056DisComCod = P03LV3_A1056DisComCod[0] ;
               A2524DisComLin = P03LV3_A2524DisComLin[0] ;
               A30AlbProCod = P03LV3_A30AlbProCod[0] ;
               AV8Discomlin = A2524DisComLin ;
               AV10Discomcod = A1056DisComCod ;
               AV11FonCod = A1032FonCod ;
               if ( ( A2524DisComLin == 1 ) && ( GXutil.strcmp(A1056DisComCod, httpContext.getMessage( "FONDO CLIENT", "")) == 0 ) )
               {
                  AV9Linea = (byte)(1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV9Linea == 1 )
            {
               h3LV0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 45, Gx_line+1, 104, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 114, Gx_line+1, 122, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 130, Gx_line+1, 138, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Discomlin), "Z9")), 160, Gx_line+1, 176, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Discomcod, "")), 196, Gx_line+1, 285, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11FonCod, "")), 301, Gx_line+1, 390, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV12Barfecsal, "99/99/99"), 402, Gx_line+0, 461, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3LV0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h3LV0( boolean bFoot ,
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

   public static Object refClasses( )
   {
      GXutil.refClasses(pupintas.class);
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
      scmdbuf = "" ;
      P03LV2_A130BarCodPar = new String[] {""} ;
      P03LV2_A132BarCodReo = new byte[1] ;
      P03LV2_A129BarCod = new int[1] ;
      P03LV2_A396EmprCod = new String[] {""} ;
      P03LV2_A213BarSit = new byte[1] ;
      P03LV2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      AV12Barfecsal = GXutil.nullDate() ;
      P03LV3_A396EmprCod = new String[] {""} ;
      P03LV3_A129BarCod = new int[1] ;
      P03LV3_A132BarCodReo = new byte[1] ;
      P03LV3_A130BarCodPar = new String[] {""} ;
      P03LV3_A1032FonCod = new String[] {""} ;
      P03LV3_A1056DisComCod = new String[] {""} ;
      P03LV3_A2524DisComLin = new byte[1] ;
      P03LV3_A30AlbProCod = new long[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      AV10Discomcod = "" ;
      AV11FonCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apupintas__default(),
         new Object[] {
             new Object[] {
            P03LV2_A130BarCodPar, P03LV2_A132BarCodReo, P03LV2_A129BarCod, P03LV2_A396EmprCod, P03LV2_A213BarSit, P03LV2_A161BarFecSal
            }
            , new Object[] {
            P03LV3_A396EmprCod, P03LV3_A129BarCod, P03LV3_A132BarCodReo, P03LV3_A130BarCodPar, P03LV3_A1032FonCod, P03LV3_A1056DisComCod, P03LV3_A2524DisComLin, P03LV3_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV9Linea ;
   private byte AV8Discomlin ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private long A30AlbProCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String AV10Discomcod ;
   private String AV11FonCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV12Barfecsal ;
   private IDataStoreProvider pr_default ;
   private String[] P03LV2_A130BarCodPar ;
   private byte[] P03LV2_A132BarCodReo ;
   private int[] P03LV2_A129BarCod ;
   private String[] P03LV2_A396EmprCod ;
   private byte[] P03LV2_A213BarSit ;
   private java.util.Date[] P03LV2_A161BarFecSal ;
   private String[] P03LV3_A396EmprCod ;
   private int[] P03LV3_A129BarCod ;
   private byte[] P03LV3_A132BarCodReo ;
   private String[] P03LV3_A130BarCodPar ;
   private String[] P03LV3_A1032FonCod ;
   private String[] P03LV3_A1056DisComCod ;
   private byte[] P03LV3_A2524DisComLin ;
   private long[] P03LV3_A30AlbProCod ;
}

final  class apupintas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03LV2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarFecSal FROM TXPBARCAD WHERE EmprCod = '001' and BarSit = 9 ORDER BY EmprCod, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03LV3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FonCod, DisComCod, DisComLin, AlbProCod FROM TXPALBEST WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

