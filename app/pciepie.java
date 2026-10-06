package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciepie extends GXProcedure
{
   public pciepie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciepie.class ), "" );
   }

   public pciepie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 )
   {
      pciepie.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pciepie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciepie.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pciepie.this.A130BarCodPar = aP2[0];
      this.aP2 = aP2;
      pciepie.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pciepie.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pciepie.this.AV16BarPConTro = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15BarMetLan = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P003A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A201BarPieEst = P003A2_A201BarPieEst[0] ;
         A183BarMetLan = P003A2_A183BarMetLan[0] ;
         A197BarPConTro = P003A2_A197BarPConTro[0] ;
         A3276BarMtsAut = P003A2_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P003A2_n3276BarMtsAut[0] ;
         /* Optimized group. */
         /* Using cursor P003A3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         c3860BarTroMet = P003A3_A3860BarTroMet[0] ;
         n3860BarTroMet = P003A3_n3860BarTroMet[0] ;
         pr_default.close(1);
         AV15BarMetLan = AV15BarMetLan.add(c3860BarTroMet) ;
         /* End optimized group. */
         A201BarPieEst = (byte)(1) ;
         A183BarMetLan = AV15BarMetLan ;
         A197BarPConTro = AV16BarPConTro ;
         A3276BarMtsAut = AV15BarMetLan ;
         n3276BarMtsAut = false ;
         /* Using cursor P003A4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A201BarPieEst), A183BarMetLan, Short.valueOf(A197BarPConTro), Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciepie.this.A396EmprCod;
      this.aP1[0] = pciepie.this.A129BarCod;
      this.aP2[0] = pciepie.this.A130BarCodPar;
      this.aP3[0] = pciepie.this.A132BarCodReo;
      this.aP4[0] = pciepie.this.A200BarPieCod;
      this.aP5[0] = pciepie.this.AV16BarPConTro;
      Application.commitDataStores(context, remoteHandle, pr_default, "pciepie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15BarMetLan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P003A2_A396EmprCod = new String[] {""} ;
      P003A2_A129BarCod = new int[1] ;
      P003A2_A132BarCodReo = new byte[1] ;
      P003A2_A130BarCodPar = new String[] {""} ;
      P003A2_A200BarPieCod = new String[] {""} ;
      P003A2_A201BarPieEst = new byte[1] ;
      P003A2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A197BarPConTro = new short[1] ;
      P003A2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_n3276BarMtsAut = new boolean[] {false} ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      c3860BarTroMet = DecimalUtil.ZERO ;
      P003A3_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A3_n3860BarTroMet = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciepie__default(),
         new Object[] {
             new Object[] {
            P003A2_A396EmprCod, P003A2_A129BarCod, P003A2_A132BarCodReo, P003A2_A130BarCodPar, P003A2_A200BarPieCod, P003A2_A201BarPieEst, P003A2_A183BarMetLan, P003A2_A197BarPConTro, P003A2_A3276BarMtsAut, P003A2_n3276BarMtsAut
            }
            , new Object[] {
            P003A3_A3860BarTroMet, P003A3_n3860BarTroMet
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private short AV16BarPConTro ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15BarMetLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal c3860BarTroMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private boolean n3276BarMtsAut ;
   private boolean n3860BarTroMet ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P003A2_A396EmprCod ;
   private int[] P003A2_A129BarCod ;
   private byte[] P003A2_A132BarCodReo ;
   private String[] P003A2_A130BarCodPar ;
   private String[] P003A2_A200BarPieCod ;
   private byte[] P003A2_A201BarPieEst ;
   private java.math.BigDecimal[] P003A2_A183BarMetLan ;
   private short[] P003A2_A197BarPConTro ;
   private java.math.BigDecimal[] P003A2_A3276BarMtsAut ;
   private boolean[] P003A2_n3276BarMtsAut ;
   private java.math.BigDecimal[] P003A3_A3860BarTroMet ;
   private boolean[] P003A3_n3860BarTroMet ;
}

final  class pciepie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003A2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieEst, BarMetLan, BarPConTro, BarMtsAut FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003A3", "SELECT SUM(BarTroMet) FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003A4", "UPDATE TXPBARPIE SET BarPieEst=?, BarMetLan=?, BarPConTro=?, BarMtsAut=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 9);
               return;
      }
   }

}

