package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclifasp extends GXProcedure
{
   public pclifasp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclifasp.class ), "" );
   }

   public pclifasp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pclifasp.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pclifasp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclifasp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pclifasp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pclifasp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pclifasp.this.AV11FasCod = aP4[0];
      this.aP4 = aP4;
      pclifasp.this.AV8FasPreKgm = aP5[0];
      this.aP5 = aP5;
      pclifasp.this.AV13faspreMtr = aP6[0];
      this.aP6 = aP6;
      pclifasp.this.AV9FasCodFac = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasPreKgm = DecimalUtil.doubleToDec(0) ;
      AV13faspreMtr = DecimalUtil.doubleToDec(0) ;
      AV9FasCodFac = "" ;
      /* Using cursor P00WS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P00WS2_A212BarSer[0] ;
         A252CliCod = P00WS2_A252CliCod[0] ;
         n252CliCod = P00WS2_n252CliCod[0] ;
         W129BarCod = A129BarCod ;
         n129BarCod = false ;
         W132BarCodReo = A132BarCodReo ;
         n132BarCodReo = false ;
         W130BarCodPar = A130BarCodPar ;
         n130BarCodPar = false ;
         AV12CliCod = A252CliCod ;
         /* Using cursor P00WS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCod), AV11FasCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A494ForSer = P00WS3_A494ForSer[0] ;
            A482ForColNom = P00WS3_A482ForColNom[0] ;
            A483ForColNum = P00WS3_A483ForColNum[0] ;
            A831TipColCod = P00WS3_A831TipColCod[0] ;
            A457FasCod = P00WS3_A457FasCod[0] ;
            n457FasCod = P00WS3_n457FasCod[0] ;
            A252CliCod = P00WS3_A252CliCod[0] ;
            n252CliCod = P00WS3_n252CliCod[0] ;
            A466FasPreKgm = P00WS3_A466FasPreKgm[0] ;
            n466FasPreKgm = P00WS3_n466FasPreKgm[0] ;
            A467FasPreMtr = P00WS3_A467FasPreMtr[0] ;
            n467FasPreMtr = P00WS3_n467FasPreMtr[0] ;
            A3615FasFacCod = P00WS3_A3615FasFacCod[0] ;
            n3615FasFacCod = P00WS3_n3615FasFacCod[0] ;
            A853For_ProC = P00WS3_A853For_ProC[0] ;
            A1028For_Ord = P00WS3_A1028For_Ord[0] ;
            A466FasPreKgm = P00WS3_A466FasPreKgm[0] ;
            n466FasPreKgm = P00WS3_n466FasPreKgm[0] ;
            A467FasPreMtr = P00WS3_A467FasPreMtr[0] ;
            n467FasPreMtr = P00WS3_n467FasPreMtr[0] ;
            A3615FasFacCod = P00WS3_A3615FasFacCod[0] ;
            n3615FasFacCod = P00WS3_n3615FasFacCod[0] ;
            AV8FasPreKgm = A466FasPreKgm ;
            AV13faspreMtr = A467FasPreMtr ;
            AV9FasCodFac = A3615FasFacCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A129BarCod = W129BarCod ;
         n129BarCod = false ;
         A132BarCodReo = W132BarCodReo ;
         n132BarCodReo = false ;
         A130BarCodPar = W130BarCodPar ;
         n130BarCodPar = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclifasp.this.A396EmprCod;
      this.aP1[0] = pclifasp.this.A129BarCod;
      this.aP2[0] = pclifasp.this.A132BarCodReo;
      this.aP3[0] = pclifasp.this.A130BarCodPar;
      this.aP4[0] = pclifasp.this.AV11FasCod;
      this.aP5[0] = pclifasp.this.AV8FasPreKgm;
      this.aP6[0] = pclifasp.this.AV13faspreMtr;
      this.aP7[0] = pclifasp.this.AV9FasCodFac;
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
      P00WS2_A396EmprCod = new String[] {""} ;
      P00WS2_A129BarCod = new int[1] ;
      P00WS2_n129BarCod = new boolean[] {false} ;
      P00WS2_A132BarCodReo = new byte[1] ;
      P00WS2_n132BarCodReo = new boolean[] {false} ;
      P00WS2_A130BarCodPar = new String[] {""} ;
      P00WS2_n130BarCodPar = new boolean[] {false} ;
      P00WS2_A212BarSer = new String[] {""} ;
      P00WS2_A252CliCod = new int[1] ;
      P00WS2_n252CliCod = new boolean[] {false} ;
      A212BarSer = "" ;
      W130BarCodPar = "" ;
      P00WS3_A494ForSer = new String[] {""} ;
      P00WS3_A482ForColNom = new String[] {""} ;
      P00WS3_A483ForColNum = new int[1] ;
      P00WS3_A831TipColCod = new byte[1] ;
      P00WS3_A396EmprCod = new String[] {""} ;
      P00WS3_A129BarCod = new int[1] ;
      P00WS3_n129BarCod = new boolean[] {false} ;
      P00WS3_A132BarCodReo = new byte[1] ;
      P00WS3_n132BarCodReo = new boolean[] {false} ;
      P00WS3_A130BarCodPar = new String[] {""} ;
      P00WS3_n130BarCodPar = new boolean[] {false} ;
      P00WS3_A457FasCod = new String[] {""} ;
      P00WS3_n457FasCod = new boolean[] {false} ;
      P00WS3_A252CliCod = new int[1] ;
      P00WS3_n252CliCod = new boolean[] {false} ;
      P00WS3_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WS3_n466FasPreKgm = new boolean[] {false} ;
      P00WS3_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WS3_n467FasPreMtr = new boolean[] {false} ;
      P00WS3_A3615FasFacCod = new String[] {""} ;
      P00WS3_n3615FasFacCod = new boolean[] {false} ;
      P00WS3_A853For_ProC = new String[] {""} ;
      P00WS3_A1028For_Ord = new int[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A457FasCod = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A3615FasFacCod = "" ;
      A853For_ProC = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclifasp__default(),
         new Object[] {
             new Object[] {
            P00WS2_A396EmprCod, P00WS2_A129BarCod, P00WS2_A132BarCodReo, P00WS2_A130BarCodPar, P00WS2_A212BarSer, P00WS2_A252CliCod, P00WS2_n252CliCod
            }
            , new Object[] {
            P00WS3_A494ForSer, P00WS3_A482ForColNom, P00WS3_A483ForColNum, P00WS3_A831TipColCod, P00WS3_A396EmprCod, P00WS3_A129BarCod, P00WS3_n129BarCod, P00WS3_A132BarCodReo, P00WS3_n132BarCodReo, P00WS3_A130BarCodPar,
            P00WS3_n130BarCodPar, P00WS3_A457FasCod, P00WS3_n457FasCod, P00WS3_A252CliCod, P00WS3_A466FasPreKgm, P00WS3_n466FasPreKgm, P00WS3_A467FasPreMtr, P00WS3_n467FasPreMtr, P00WS3_A3615FasFacCod, P00WS3_n3615FasFacCod,
            P00WS3_A853For_ProC, P00WS3_A1028For_Ord
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int W129BarCod ;
   private int AV12CliCod ;
   private int A483ForColNum ;
   private int A1028For_Ord ;
   private java.math.BigDecimal AV8FasPreKgm ;
   private java.math.BigDecimal AV13faspreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV11FasCod ;
   private String AV9FasCodFac ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String W130BarCodPar ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A457FasCod ;
   private String A3615FasFacCod ;
   private String A853For_ProC ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n252CliCod ;
   private boolean n457FasCod ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n3615FasFacCod ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WS2_A396EmprCod ;
   private int[] P00WS2_A129BarCod ;
   private boolean[] P00WS2_n129BarCod ;
   private byte[] P00WS2_A132BarCodReo ;
   private boolean[] P00WS2_n132BarCodReo ;
   private String[] P00WS2_A130BarCodPar ;
   private boolean[] P00WS2_n130BarCodPar ;
   private String[] P00WS2_A212BarSer ;
   private int[] P00WS2_A252CliCod ;
   private boolean[] P00WS2_n252CliCod ;
   private String[] P00WS3_A494ForSer ;
   private String[] P00WS3_A482ForColNom ;
   private int[] P00WS3_A483ForColNum ;
   private byte[] P00WS3_A831TipColCod ;
   private String[] P00WS3_A396EmprCod ;
   private int[] P00WS3_A129BarCod ;
   private boolean[] P00WS3_n129BarCod ;
   private byte[] P00WS3_A132BarCodReo ;
   private boolean[] P00WS3_n132BarCodReo ;
   private String[] P00WS3_A130BarCodPar ;
   private boolean[] P00WS3_n130BarCodPar ;
   private String[] P00WS3_A457FasCod ;
   private boolean[] P00WS3_n457FasCod ;
   private int[] P00WS3_A252CliCod ;
   private boolean[] P00WS3_n252CliCod ;
   private java.math.BigDecimal[] P00WS3_A466FasPreKgm ;
   private boolean[] P00WS3_n466FasPreKgm ;
   private java.math.BigDecimal[] P00WS3_A467FasPreMtr ;
   private boolean[] P00WS3_n467FasPreMtr ;
   private String[] P00WS3_A3615FasFacCod ;
   private boolean[] P00WS3_n3615FasFacCod ;
   private String[] P00WS3_A853For_ProC ;
   private int[] P00WS3_A1028For_Ord ;
}

final  class pclifasp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WS3", "SELECT T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.FasCod, T1.CliCod, T2.FasPreKgm, T2.FasPreMtr, T2.FasFacCod, T1.For_ProC, T1.For_Ord FROM ((TXPTAB001 T1 LEFT JOIN TXPPREFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.FasCod = ?) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 8);
               ((int[]) buf[21])[0] = rslt.getInt(15);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               return;
      }
   }

}

