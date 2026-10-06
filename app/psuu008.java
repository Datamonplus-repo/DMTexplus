package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psuu008 extends GXProcedure
{
   public psuu008( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psuu008.class ), "" );
   }

   public psuu008( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      psuu008.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      psuu008.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psuu008.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psuu008.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psuu008.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Bache = (byte)(0) ;
      /* Using cursor P02U02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P02U02_A212BarSer[0] ;
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
         /* Exiting from a For First loop. */
         if (true) break;
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
      /* Using cursor P02U03 */
      pr_default.execute(1, new Object[] {AV11Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = P02U03_A194BarOrdLin[0] ;
         A758ProCod = P02U03_A758ProCod[0] ;
         A153BarFasEst = P02U03_A153BarFasEst[0] ;
         A160BarFecRea = P02U03_A160BarFecRea[0] ;
         A164BarHorFin = P02U03_A164BarHorFin[0] ;
         A4443BarFasDTF = P02U03_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P02U03_n4443BarFasDTF[0] ;
         AV12Bache = (byte)(0) ;
         AV13Barfas = (byte)(1) ;
         AV16Barfasest = A153BarFasEst ;
         AV17Fases0 = (short)(0) ;
         AV18fases1 = (short)(0) ;
         AV19Fases2 = (short)(0) ;
         AV20Fasesn = (short)(0) ;
         /* Using cursor P02U04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4303BarFasEst1 = P02U04_A4303BarFasEst1[0] ;
            n4303BarFasEst1 = P02U04_n4303BarFasEst1[0] ;
            A4643BarFasLot = P02U04_A4643BarFasLot[0] ;
            if ( A4303BarFasEst1 == 0 )
            {
               AV17Fases0 = (short)(AV17Fases0+1) ;
            }
            else if ( A4303BarFasEst1 == 1 )
            {
               AV18fases1 = (short)(AV18fases1+1) ;
            }
            else if ( A4303BarFasEst1 == 2 )
            {
               AV19Fases2 = (short)(AV19Fases2+1) ;
            }
            else
            {
            }
            AV20Fasesn = (short)(AV20Fasesn+1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV15BarFasEst1 = (byte)(0) ;
         if ( ( AV20Fasesn == AV19Fases2 ) && ( AV20Fasesn > 0 ) && ( AV19Fases2 > 0 ) )
         {
            AV15BarFasEst1 = (byte)(2) ;
         }
         if ( AV18fases1 > 0 )
         {
            AV15BarFasEst1 = (byte)(1) ;
         }
         if ( ( AV17Fases0 > 0 ) && ( AV19Fases2 > 0 ) )
         {
            AV15BarFasEst1 = (byte)(1) ;
         }
         if ( AV15BarFasEst1 != AV16Barfasest )
         {
            AV14Anomalia = (byte)(1) ;
         }
         A153BarFasEst = AV15BarFasEst1 ;
         if ( AV15BarFasEst1 == 0 )
         {
            A160BarFecRea = GXutil.nullDate() ;
            A164BarHorFin = (short)(0) ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
         }
         /* Using cursor P02U05 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A160BarFecRea, Short.valueOf(A164BarHorFin), Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = psuu008.this.A396EmprCod;
      this.aP1[0] = psuu008.this.A129BarCod;
      this.aP2[0] = psuu008.this.A132BarCodReo;
      this.aP3[0] = psuu008.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "psuu008");
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
      P02U02_A396EmprCod = new String[] {""} ;
      P02U02_A129BarCod = new int[1] ;
      P02U02_A132BarCodReo = new byte[1] ;
      P02U02_A130BarCodPar = new String[] {""} ;
      P02U02_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      AV11Emprcod = "" ;
      AV10Barcodpar = "" ;
      P02U03_A194BarOrdLin = new short[1] ;
      P02U03_A758ProCod = new String[] {""} ;
      P02U03_A130BarCodPar = new String[] {""} ;
      P02U03_A132BarCodReo = new byte[1] ;
      P02U03_A129BarCod = new int[1] ;
      P02U03_A396EmprCod = new String[] {""} ;
      P02U03_A153BarFasEst = new byte[1] ;
      P02U03_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P02U03_A164BarHorFin = new short[1] ;
      P02U03_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02U03_n4443BarFasDTF = new boolean[] {false} ;
      A758ProCod = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      P02U04_A396EmprCod = new String[] {""} ;
      P02U04_A129BarCod = new int[1] ;
      P02U04_A132BarCodReo = new byte[1] ;
      P02U04_A130BarCodPar = new String[] {""} ;
      P02U04_A758ProCod = new String[] {""} ;
      P02U04_A194BarOrdLin = new short[1] ;
      P02U04_A4303BarFasEst1 = new byte[1] ;
      P02U04_n4303BarFasEst1 = new boolean[] {false} ;
      P02U04_A4643BarFasLot = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psuu008__default(),
         new Object[] {
             new Object[] {
            P02U02_A396EmprCod, P02U02_A129BarCod, P02U02_A132BarCodReo, P02U02_A130BarCodPar, P02U02_A212BarSer
            }
            , new Object[] {
            P02U03_A194BarOrdLin, P02U03_A758ProCod, P02U03_A130BarCodPar, P02U03_A132BarCodReo, P02U03_A129BarCod, P02U03_A396EmprCod, P02U03_A153BarFasEst, P02U03_A160BarFecRea, P02U03_A164BarHorFin, P02U03_A4443BarFasDTF,
            P02U03_n4443BarFasDTF
            }
            , new Object[] {
            P02U04_A396EmprCod, P02U04_A129BarCod, P02U04_A132BarCodReo, P02U04_A130BarCodPar, P02U04_A758ProCod, P02U04_A194BarOrdLin, P02U04_A4303BarFasEst1, P02U04_n4303BarFasEst1, P02U04_A4643BarFasLot
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12Bache ;
   private byte AV9Barcodreo ;
   private byte AV13Barfas ;
   private byte AV14Anomalia ;
   private byte A153BarFasEst ;
   private byte AV16Barfasest ;
   private byte A4303BarFasEst1 ;
   private byte AV15BarFasEst1 ;
   private short A194BarOrdLin ;
   private short A164BarHorFin ;
   private short AV17Fases0 ;
   private short AV18fases1 ;
   private short AV19Fases2 ;
   private short AV20Fasesn ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private int A4643BarFasLot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String AV11Emprcod ;
   private String AV10Barcodpar ;
   private String A758ProCod ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A160BarFecRea ;
   private boolean returnInSub ;
   private boolean n4443BarFasDTF ;
   private boolean n4303BarFasEst1 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02U02_A396EmprCod ;
   private int[] P02U02_A129BarCod ;
   private byte[] P02U02_A132BarCodReo ;
   private String[] P02U02_A130BarCodPar ;
   private String[] P02U02_A212BarSer ;
   private short[] P02U03_A194BarOrdLin ;
   private String[] P02U03_A758ProCod ;
   private String[] P02U03_A130BarCodPar ;
   private byte[] P02U03_A132BarCodReo ;
   private int[] P02U03_A129BarCod ;
   private String[] P02U03_A396EmprCod ;
   private byte[] P02U03_A153BarFasEst ;
   private java.util.Date[] P02U03_A160BarFecRea ;
   private short[] P02U03_A164BarHorFin ;
   private java.util.Date[] P02U03_A4443BarFasDTF ;
   private boolean[] P02U03_n4443BarFasDTF ;
   private String[] P02U04_A396EmprCod ;
   private int[] P02U04_A129BarCod ;
   private byte[] P02U04_A132BarCodReo ;
   private String[] P02U04_A130BarCodPar ;
   private String[] P02U04_A758ProCod ;
   private short[] P02U04_A194BarOrdLin ;
   private byte[] P02U04_A4303BarFasEst1 ;
   private boolean[] P02U04_n4303BarFasEst1 ;
   private int[] P02U04_A4643BarFasLot ;
}

final  class psuu008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02U02", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02U03", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, BarFecRea, BarHorFin, BarFasDTF FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst = 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02U04", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasEst1, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02U05", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRea=?, BarHorFin=?, BarFasDTF=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
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

