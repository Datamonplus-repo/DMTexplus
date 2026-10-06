package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu009 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu009 pgm = new apsuu009 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu009.class ), "" );
   }

   public apsuu009( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Control Fases 2....", "") );
      AV12Bache = (byte)(0) ;
      /* Using cursor P02U12 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P02U12_A213BarSit[0] ;
         A3030BarPlf = P02U12_A3030BarPlf[0] ;
         A361DisCod = P02U12_A361DisCod[0] ;
         A396EmprCod = P02U12_A396EmprCod[0] ;
         A212BarSer = P02U12_A212BarSer[0] ;
         A129BarCod = P02U12_A129BarCod[0] ;
         A132BarCodReo = P02U12_A132BarCodReo[0] ;
         A130BarCodPar = P02U12_A130BarCodPar[0] ;
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
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV13Barfas = (byte)(0) ;
      AV14Anomalia = (byte)(0) ;
      /* Using cursor P02U13 */
      pr_default.execute(1, new Object[] {AV11Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = P02U13_A194BarOrdLin[0] ;
         A758ProCod = P02U13_A758ProCod[0] ;
         A130BarCodPar = P02U13_A130BarCodPar[0] ;
         A132BarCodReo = P02U13_A132BarCodReo[0] ;
         A129BarCod = P02U13_A129BarCod[0] ;
         A396EmprCod = P02U13_A396EmprCod[0] ;
         A153BarFasEst = P02U13_A153BarFasEst[0] ;
         A160BarFecRea = P02U13_A160BarFecRea[0] ;
         A164BarHorFin = P02U13_A164BarHorFin[0] ;
         A4443BarFasDTF = P02U13_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P02U13_n4443BarFasDTF[0] ;
         AV12Bache = (byte)(0) ;
         AV13Barfas = (byte)(1) ;
         AV20BarFasest = A153BarFasEst ;
         AV15Fases0 = (short)(0) ;
         AV16Fases1 = (short)(0) ;
         AV17Fases2 = (short)(0) ;
         AV18Fasesn = (short)(0) ;
         /* Using cursor P02U14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4303BarFasEst1 = P02U14_A4303BarFasEst1[0] ;
            n4303BarFasEst1 = P02U14_n4303BarFasEst1[0] ;
            A4643BarFasLot = P02U14_A4643BarFasLot[0] ;
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
         /* Using cursor P02U15 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, Short.valueOf(A164BarHorFin), Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu009.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu009");
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
      P02U12_A213BarSit = new byte[1] ;
      P02U12_A3030BarPlf = new String[] {""} ;
      P02U12_A361DisCod = new int[1] ;
      P02U12_A396EmprCod = new String[] {""} ;
      P02U12_A212BarSer = new String[] {""} ;
      P02U12_A129BarCod = new int[1] ;
      P02U12_A132BarCodReo = new byte[1] ;
      P02U12_A130BarCodPar = new String[] {""} ;
      A3030BarPlf = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      AV11Emprcod = "" ;
      AV10Barcodpar = "" ;
      P02U13_A194BarOrdLin = new short[1] ;
      P02U13_A758ProCod = new String[] {""} ;
      P02U13_A130BarCodPar = new String[] {""} ;
      P02U13_A132BarCodReo = new byte[1] ;
      P02U13_A129BarCod = new int[1] ;
      P02U13_A396EmprCod = new String[] {""} ;
      P02U13_A153BarFasEst = new byte[1] ;
      P02U13_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P02U13_A164BarHorFin = new short[1] ;
      P02U13_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02U13_n4443BarFasDTF = new boolean[] {false} ;
      A758ProCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      P02U14_A396EmprCod = new String[] {""} ;
      P02U14_A129BarCod = new int[1] ;
      P02U14_A132BarCodReo = new byte[1] ;
      P02U14_A130BarCodPar = new String[] {""} ;
      P02U14_A758ProCod = new String[] {""} ;
      P02U14_A194BarOrdLin = new short[1] ;
      P02U14_A4303BarFasEst1 = new byte[1] ;
      P02U14_n4303BarFasEst1 = new boolean[] {false} ;
      P02U14_A4643BarFasLot = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu009__default(),
         new Object[] {
             new Object[] {
            P02U12_A213BarSit, P02U12_A3030BarPlf, P02U12_A361DisCod, P02U12_A396EmprCod, P02U12_A212BarSer, P02U12_A129BarCod, P02U12_A132BarCodReo, P02U12_A130BarCodPar
            }
            , new Object[] {
            P02U13_A194BarOrdLin, P02U13_A758ProCod, P02U13_A130BarCodPar, P02U13_A132BarCodReo, P02U13_A129BarCod, P02U13_A396EmprCod, P02U13_A153BarFasEst, P02U13_A160BarFecRea, P02U13_A164BarHorFin, P02U13_A4443BarFasDTF,
            P02U13_n4443BarFasDTF
            }
            , new Object[] {
            P02U14_A396EmprCod, P02U14_A129BarCod, P02U14_A132BarCodReo, P02U14_A130BarCodPar, P02U14_A758ProCod, P02U14_A194BarOrdLin, P02U14_A4303BarFasEst1, P02U14_n4303BarFasEst1, P02U14_A4643BarFasLot
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Bache ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV9Barcodreo ;
   private byte AV13Barfas ;
   private byte AV14Anomalia ;
   private byte A153BarFasEst ;
   private byte AV20BarFasest ;
   private byte A4303BarFasEst1 ;
   private byte AV19Barfasest1 ;
   private short A194BarOrdLin ;
   private short A164BarHorFin ;
   private short AV15Fases0 ;
   private short AV16Fases1 ;
   private short AV17Fases2 ;
   private short AV18Fasesn ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private int A4643BarFasLot ;
   private String scmdbuf ;
   private String A3030BarPlf ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV11Emprcod ;
   private String AV10Barcodpar ;
   private String A758ProCod ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A160BarFecRea ;
   private boolean returnInSub ;
   private boolean n4443BarFasDTF ;
   private boolean n4303BarFasEst1 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02U12_A213BarSit ;
   private String[] P02U12_A3030BarPlf ;
   private int[] P02U12_A361DisCod ;
   private String[] P02U12_A396EmprCod ;
   private String[] P02U12_A212BarSer ;
   private int[] P02U12_A129BarCod ;
   private byte[] P02U12_A132BarCodReo ;
   private String[] P02U12_A130BarCodPar ;
   private short[] P02U13_A194BarOrdLin ;
   private String[] P02U13_A758ProCod ;
   private String[] P02U13_A130BarCodPar ;
   private byte[] P02U13_A132BarCodReo ;
   private int[] P02U13_A129BarCod ;
   private String[] P02U13_A396EmprCod ;
   private byte[] P02U13_A153BarFasEst ;
   private java.util.Date[] P02U13_A160BarFecRea ;
   private short[] P02U13_A164BarHorFin ;
   private java.util.Date[] P02U13_A4443BarFasDTF ;
   private boolean[] P02U13_n4443BarFasDTF ;
   private String[] P02U14_A396EmprCod ;
   private int[] P02U14_A129BarCod ;
   private byte[] P02U14_A132BarCodReo ;
   private String[] P02U14_A130BarCodPar ;
   private String[] P02U14_A758ProCod ;
   private short[] P02U14_A194BarOrdLin ;
   private byte[] P02U14_A4303BarFasEst1 ;
   private boolean[] P02U14_n4303BarFasEst1 ;
   private int[] P02U14_A4643BarFasLot ;
}

final  class apsuu009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02U12", "SELECT BarSit, BarPlf, DisCod, EmprCod, BarSer, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = '001' and DisCod > 324) AND (BarSit < 9) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02U13", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, BarFecRea, BarHorFin, BarFasDTF FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst = 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02U14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasEst1, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02U15", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarHorFin=?, BarFasDTF=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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

