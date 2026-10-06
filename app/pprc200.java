package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc200 extends GXProcedure
{
   public pprc200( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc200.class ), "" );
   }

   public pprc200( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 )
   {
      pprc200.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 )
   {
      pprc200.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc200.this.AV15Albprocod = aP1[0];
      this.aP1 = aP1;
      pprc200.this.AV8HayTrozos = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HayTrozos = 0 ;
      /* Using cursor P05RN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15Albprocod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05RN2_A130BarCodPar[0] ;
         A132BarCodReo = P05RN2_A132BarCodReo[0] ;
         A129BarCod = P05RN2_A129BarCod[0] ;
         A30AlbProCod = P05RN2_A30AlbProCod[0] ;
         /* Using cursor P05RN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P05RN3_A200BarPieCod[0] ;
            A201BarPieEst = P05RN3_A201BarPieEst[0] ;
            A203BarPieKil = P05RN3_A203BarPieKil[0] ;
            /* Using cursor P05RN4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3860BarTroMet = P05RN4_A3860BarTroMet[0] ;
               n3860BarTroMet = P05RN4_n3860BarTroMet[0] ;
               A3858BarTroCod = P05RN4_A3858BarTroCod[0] ;
               AV13BarCod = A129BarCod ;
               AV12BarCodReo = A132BarCodReo ;
               AV11BarCodPar = A130BarCodPar ;
               AV9BarPieCod = A200BarPieCod ;
               AV10BarTroCod = A3858BarTroCod ;
               /* Execute user subroutine: 'LALTRZ' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV14ExisteTRozo == 0 )
               {
                  AV8HayTrozos = (int)(AV8HayTrozos+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LALTRZ' Routine */
      returnInSub = false ;
      AV14ExisteTRozo = (byte)(0) ;
      /* Using cursor P05RN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV12BarCodReo), AV11BarCodPar, AV9BarPieCod, Short.valueOf(AV10BarTroCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A129BarCod = P05RN5_A129BarCod[0] ;
         A132BarCodReo = P05RN5_A132BarCodReo[0] ;
         A130BarCodPar = P05RN5_A130BarCodPar[0] ;
         A200BarPieCod = P05RN5_A200BarPieCod[0] ;
         A42AlbPTroCod = P05RN5_A42AlbPTroCod[0] ;
         A30AlbProCod = P05RN5_A30AlbProCod[0] ;
         AV14ExisteTRozo = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc200.this.A396EmprCod;
      this.aP1[0] = pprc200.this.AV15Albprocod;
      this.aP2[0] = pprc200.this.AV8HayTrozos;
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
      P05RN2_A396EmprCod = new String[] {""} ;
      P05RN2_A130BarCodPar = new String[] {""} ;
      P05RN2_A132BarCodReo = new byte[1] ;
      P05RN2_A129BarCod = new int[1] ;
      P05RN2_A30AlbProCod = new long[1] ;
      A130BarCodPar = "" ;
      P05RN3_A396EmprCod = new String[] {""} ;
      P05RN3_A129BarCod = new int[1] ;
      P05RN3_A132BarCodReo = new byte[1] ;
      P05RN3_A130BarCodPar = new String[] {""} ;
      P05RN3_A200BarPieCod = new String[] {""} ;
      P05RN3_A201BarPieEst = new byte[1] ;
      P05RN3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      P05RN4_A396EmprCod = new String[] {""} ;
      P05RN4_A129BarCod = new int[1] ;
      P05RN4_A132BarCodReo = new byte[1] ;
      P05RN4_A130BarCodPar = new String[] {""} ;
      P05RN4_A200BarPieCod = new String[] {""} ;
      P05RN4_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05RN4_n3860BarTroMet = new boolean[] {false} ;
      P05RN4_A3858BarTroCod = new short[1] ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      AV11BarCodPar = "" ;
      AV9BarPieCod = "" ;
      P05RN5_A396EmprCod = new String[] {""} ;
      P05RN5_A129BarCod = new int[1] ;
      P05RN5_A132BarCodReo = new byte[1] ;
      P05RN5_A130BarCodPar = new String[] {""} ;
      P05RN5_A200BarPieCod = new String[] {""} ;
      P05RN5_A42AlbPTroCod = new short[1] ;
      P05RN5_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc200__default(),
         new Object[] {
             new Object[] {
            P05RN2_A396EmprCod, P05RN2_A130BarCodPar, P05RN2_A132BarCodReo, P05RN2_A129BarCod, P05RN2_A30AlbProCod
            }
            , new Object[] {
            P05RN3_A396EmprCod, P05RN3_A129BarCod, P05RN3_A132BarCodReo, P05RN3_A130BarCodPar, P05RN3_A200BarPieCod, P05RN3_A201BarPieEst, P05RN3_A203BarPieKil
            }
            , new Object[] {
            P05RN4_A396EmprCod, P05RN4_A129BarCod, P05RN4_A132BarCodReo, P05RN4_A130BarCodPar, P05RN4_A200BarPieCod, P05RN4_A3860BarTroMet, P05RN4_n3860BarTroMet, P05RN4_A3858BarTroCod
            }
            , new Object[] {
            P05RN5_A396EmprCod, P05RN5_A129BarCod, P05RN5_A132BarCodReo, P05RN5_A130BarCodPar, P05RN5_A200BarPieCod, P05RN5_A42AlbPTroCod, P05RN5_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte AV12BarCodReo ;
   private byte AV14ExisteTRozo ;
   private short A3858BarTroCod ;
   private short AV10BarTroCod ;
   private short A42AlbPTroCod ;
   private short Gx_err ;
   private int AV8HayTrozos ;
   private int A129BarCod ;
   private int AV13BarCod ;
   private long AV15Albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A3860BarTroMet ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV11BarCodPar ;
   private String AV9BarPieCod ;
   private boolean n3860BarTroMet ;
   private boolean returnInSub ;
   private int[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05RN2_A396EmprCod ;
   private String[] P05RN2_A130BarCodPar ;
   private byte[] P05RN2_A132BarCodReo ;
   private int[] P05RN2_A129BarCod ;
   private long[] P05RN2_A30AlbProCod ;
   private String[] P05RN3_A396EmprCod ;
   private int[] P05RN3_A129BarCod ;
   private byte[] P05RN3_A132BarCodReo ;
   private String[] P05RN3_A130BarCodPar ;
   private String[] P05RN3_A200BarPieCod ;
   private byte[] P05RN3_A201BarPieEst ;
   private java.math.BigDecimal[] P05RN3_A203BarPieKil ;
   private String[] P05RN4_A396EmprCod ;
   private int[] P05RN4_A129BarCod ;
   private byte[] P05RN4_A132BarCodReo ;
   private String[] P05RN4_A130BarCodPar ;
   private String[] P05RN4_A200BarPieCod ;
   private java.math.BigDecimal[] P05RN4_A3860BarTroMet ;
   private boolean[] P05RN4_n3860BarTroMet ;
   private short[] P05RN4_A3858BarTroCod ;
   private String[] P05RN5_A396EmprCod ;
   private int[] P05RN5_A129BarCod ;
   private byte[] P05RN5_A132BarCodReo ;
   private String[] P05RN5_A130BarCodPar ;
   private String[] P05RN5_A200BarPieCod ;
   private short[] P05RN5_A42AlbPTroCod ;
   private long[] P05RN5_A30AlbProCod ;
}

final  class pprc200__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RN2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RN3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieEst, BarPieKil FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RN4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroMet, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RN5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbProCod FROM TXPLALTRZ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbPTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

