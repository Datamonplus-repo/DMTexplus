package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu007 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu007 pgm = new apsuu007 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu007.class ), "" );
   }

   public apsuu007( int remoteHandle ,
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
         getPrinter().GxSetDocName("CONTROL FASES ESTADO=2") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV12Bache = (byte)(0) ;
         /* Using cursor P02TZ2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A3030BarPlf = P02TZ2_A3030BarPlf[0] ;
            A361DisCod = P02TZ2_A361DisCod[0] ;
            A212BarSer = P02TZ2_A212BarSer[0] ;
            A129BarCod = P02TZ2_A129BarCod[0] ;
            A132BarCodReo = P02TZ2_A132BarCodReo[0] ;
            A130BarCodPar = P02TZ2_A130BarCodPar[0] ;
            A159BarFecGen = P02TZ2_A159BarFecGen[0] ;
            A1430DisLoc = P02TZ2_A1430DisLoc[0] ;
            A342DisArtPes = P02TZ2_A342DisArtPes[0] ;
            A396EmprCod = P02TZ2_A396EmprCod[0] ;
            A1430DisLoc = P02TZ2_A1430DisLoc[0] ;
            A342DisArtPes = P02TZ2_A342DisArtPes[0] ;
            if ( GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "N", "")) == 0 )
            {
               AV11Emprcod = A396EmprCod ;
               AV8Barcod = A129BarCod ;
               AV9Barcodreo = A132BarCodReo ;
               AV10Barcodpar = A130BarCodPar ;
               /* Execute user subroutine: 'BARFAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV14Anomalia == 1 )
               {
                  h2TZ0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 39, Gx_line+1, 98, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9")), 333, Gx_line+1, 363, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1430DisLoc, "")), 431, Gx_line+1, 505, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 119, Gx_line+1, 178, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2TZ0( true, 0) ;
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
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV13Barfas = (byte)(0) ;
      AV14Anomalia = (byte)(0) ;
      /* Using cursor P02TZ3 */
      pr_default.execute(1, new Object[] {AV11Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = P02TZ3_A194BarOrdLin[0] ;
         A758ProCod = P02TZ3_A758ProCod[0] ;
         A130BarCodPar = P02TZ3_A130BarCodPar[0] ;
         A132BarCodReo = P02TZ3_A132BarCodReo[0] ;
         A129BarCod = P02TZ3_A129BarCod[0] ;
         A396EmprCod = P02TZ3_A396EmprCod[0] ;
         A153BarFasEst = P02TZ3_A153BarFasEst[0] ;
         A160BarFecRea = P02TZ3_A160BarFecRea[0] ;
         A164BarHorFin = P02TZ3_A164BarHorFin[0] ;
         A4443BarFasDTF = P02TZ3_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P02TZ3_n4443BarFasDTF[0] ;
         AV12Bache = (byte)(0) ;
         AV13Barfas = (byte)(1) ;
         AV20BarFasest = A153BarFasEst ;
         AV15Fases0 = (short)(0) ;
         AV16Fases1 = (short)(0) ;
         AV17Fases2 = (short)(0) ;
         AV18Fasesn = (short)(0) ;
         /* Using cursor P02TZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4303BarFasEst1 = P02TZ4_A4303BarFasEst1[0] ;
            n4303BarFasEst1 = P02TZ4_n4303BarFasEst1[0] ;
            A4643BarFasLot = P02TZ4_A4643BarFasLot[0] ;
            if ( A4303BarFasEst1 == 0 )
            {
               AV15Fases0 = (short)(AV15Fases0+1) ;
            }
            else if ( A4303BarFasEst1 == 1 )
            {
               AV16Fases1 = (short)(AV16Fases1+1) ;
            }
            else if ( A4303BarFasEst1 == 2 )
            {
               AV17Fases2 = (short)(AV17Fases2+1) ;
            }
            else
            {
            }
            AV18Fasesn = (short)(AV18Fasesn+1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV19Barfasest1 = (byte)(0) ;
         if ( ( AV18Fasesn == AV17Fases2 ) && ( AV18Fasesn > 0 ) && ( AV17Fases2 > 0 ) )
         {
            AV19Barfasest1 = (byte)(2) ;
         }
         if ( AV16Fases1 > 0 )
         {
            AV19Barfasest1 = (byte)(1) ;
         }
         if ( ( AV15Fases0 > 0 ) && ( AV17Fases2 > 0 ) )
         {
            AV19Barfasest1 = (byte)(1) ;
         }
         if ( AV19Barfasest1 != AV20BarFasest )
         {
            AV14Anomalia = (byte)(1) ;
         }
         A153BarFasEst = AV19Barfasest1 ;
         if ( AV19Barfasest1 == 0 )
         {
            A160BarFecRea = GXutil.nullDate() ;
            A164BarHorFin = (short)(0) ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
         }
         /* Using cursor P02TZ5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, Short.valueOf(A164BarHorFin), Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void h2TZ0( boolean bFoot ,
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
      GXutil.refClasses(psuu007.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu007");
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
      P02TZ2_A3030BarPlf = new String[] {""} ;
      P02TZ2_A361DisCod = new int[1] ;
      P02TZ2_A212BarSer = new String[] {""} ;
      P02TZ2_A129BarCod = new int[1] ;
      P02TZ2_A132BarCodReo = new byte[1] ;
      P02TZ2_A130BarCodPar = new String[] {""} ;
      P02TZ2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P02TZ2_A1430DisLoc = new String[] {""} ;
      P02TZ2_A342DisArtPes = new short[1] ;
      P02TZ2_A396EmprCod = new String[] {""} ;
      A3030BarPlf = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A1430DisLoc = "" ;
      A396EmprCod = "" ;
      AV11Emprcod = "" ;
      AV10Barcodpar = "" ;
      P02TZ3_A194BarOrdLin = new short[1] ;
      P02TZ3_A758ProCod = new String[] {""} ;
      P02TZ3_A130BarCodPar = new String[] {""} ;
      P02TZ3_A132BarCodReo = new byte[1] ;
      P02TZ3_A129BarCod = new int[1] ;
      P02TZ3_A396EmprCod = new String[] {""} ;
      P02TZ3_A153BarFasEst = new byte[1] ;
      P02TZ3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P02TZ3_A164BarHorFin = new short[1] ;
      P02TZ3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02TZ3_n4443BarFasDTF = new boolean[] {false} ;
      A758ProCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      P02TZ4_A396EmprCod = new String[] {""} ;
      P02TZ4_A129BarCod = new int[1] ;
      P02TZ4_A132BarCodReo = new byte[1] ;
      P02TZ4_A130BarCodPar = new String[] {""} ;
      P02TZ4_A758ProCod = new String[] {""} ;
      P02TZ4_A194BarOrdLin = new short[1] ;
      P02TZ4_A4303BarFasEst1 = new byte[1] ;
      P02TZ4_n4303BarFasEst1 = new boolean[] {false} ;
      P02TZ4_A4643BarFasLot = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu007__default(),
         new Object[] {
             new Object[] {
            P02TZ2_A3030BarPlf, P02TZ2_A361DisCod, P02TZ2_A212BarSer, P02TZ2_A129BarCod, P02TZ2_A132BarCodReo, P02TZ2_A130BarCodPar, P02TZ2_A159BarFecGen, P02TZ2_A1430DisLoc, P02TZ2_A342DisArtPes, P02TZ2_A396EmprCod
            }
            , new Object[] {
            P02TZ3_A194BarOrdLin, P02TZ3_A758ProCod, P02TZ3_A130BarCodPar, P02TZ3_A132BarCodReo, P02TZ3_A129BarCod, P02TZ3_A396EmprCod, P02TZ3_A153BarFasEst, P02TZ3_A160BarFecRea, P02TZ3_A164BarHorFin, P02TZ3_A4443BarFasDTF,
            P02TZ3_n4443BarFasDTF
            }
            , new Object[] {
            P02TZ4_A396EmprCod, P02TZ4_A129BarCod, P02TZ4_A132BarCodReo, P02TZ4_A130BarCodPar, P02TZ4_A758ProCod, P02TZ4_A194BarOrdLin, P02TZ4_A4303BarFasEst1, P02TZ4_n4303BarFasEst1, P02TZ4_A4643BarFasLot
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV12Bache ;
   private byte A132BarCodReo ;
   private byte AV9Barcodreo ;
   private byte AV14Anomalia ;
   private byte AV13Barfas ;
   private byte A153BarFasEst ;
   private byte AV20BarFasest ;
   private byte A4303BarFasEst1 ;
   private byte AV19Barfasest1 ;
   private short A342DisArtPes ;
   private short A194BarOrdLin ;
   private short A164BarHorFin ;
   private short AV15Fases0 ;
   private short AV16Fases1 ;
   private short AV17Fases2 ;
   private short AV18Fasesn ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private int Gx_OldLine ;
   private int A4643BarFasLot ;
   private String scmdbuf ;
   private String A3030BarPlf ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A1430DisLoc ;
   private String A396EmprCod ;
   private String AV11Emprcod ;
   private String AV10Barcodpar ;
   private String A758ProCod ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A160BarFecRea ;
   private boolean returnInSub ;
   private boolean n4443BarFasDTF ;
   private boolean n4303BarFasEst1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02TZ2_A3030BarPlf ;
   private int[] P02TZ2_A361DisCod ;
   private String[] P02TZ2_A212BarSer ;
   private int[] P02TZ2_A129BarCod ;
   private byte[] P02TZ2_A132BarCodReo ;
   private String[] P02TZ2_A130BarCodPar ;
   private java.util.Date[] P02TZ2_A159BarFecGen ;
   private String[] P02TZ2_A1430DisLoc ;
   private short[] P02TZ2_A342DisArtPes ;
   private String[] P02TZ2_A396EmprCod ;
   private short[] P02TZ3_A194BarOrdLin ;
   private String[] P02TZ3_A758ProCod ;
   private String[] P02TZ3_A130BarCodPar ;
   private byte[] P02TZ3_A132BarCodReo ;
   private int[] P02TZ3_A129BarCod ;
   private String[] P02TZ3_A396EmprCod ;
   private byte[] P02TZ3_A153BarFasEst ;
   private java.util.Date[] P02TZ3_A160BarFecRea ;
   private short[] P02TZ3_A164BarHorFin ;
   private java.util.Date[] P02TZ3_A4443BarFasDTF ;
   private boolean[] P02TZ3_n4443BarFasDTF ;
   private String[] P02TZ4_A396EmprCod ;
   private int[] P02TZ4_A129BarCod ;
   private byte[] P02TZ4_A132BarCodReo ;
   private String[] P02TZ4_A130BarCodPar ;
   private String[] P02TZ4_A758ProCod ;
   private short[] P02TZ4_A194BarOrdLin ;
   private byte[] P02TZ4_A4303BarFasEst1 ;
   private boolean[] P02TZ4_n4303BarFasEst1 ;
   private int[] P02TZ4_A4643BarFasLot ;
}

final  class apsuu007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02TZ2", "SELECT T1.BarPlf, T1.DisCod, T1.BarSer, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen, T2.DisLoc, T2.DisArtPes, T1.EmprCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.DisCod > 324 ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TZ3", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, BarFecRea, BarHorFin, BarFasDTF FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst = 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TZ4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasEst1, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TZ5", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarHorFin=?, BarFasDTF=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 8);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

