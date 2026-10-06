package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelirec extends GXProcedure
{
   public pelirec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelirec.class ), "" );
   }

   public pelirec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           short[] aP5 ,
                           short[] aP6 )
   {
      pelirec.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 )
   {
      pelirec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelirec.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pelirec.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelirec.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pelirec.this.AV15RecLin = aP4[0];
      this.aP4 = aP4;
      pelirec.this.AV16RecLinIni = aP5[0];
      this.aP5 = aP5;
      pelirec.this.A2804RecLinMaq = aP6[0];
      this.aP6 = aP6;
      pelirec.this.A1273RecLinPro = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      AV21RecLin2 = AV15RecLin ;
      AV22RecLinIni2 = AV16RecLinIni ;
      AV26Proc = GXutil.str( A1273RecLinPro, 2, 0) ;
      AV23RL = GXutil.str( AV15RecLin, 4, 0) ;
      AV23RL = GXutil.str( AV22RecLinIni2, 4, 0) ;
      AV27Contador = (byte)(0) ;
      /* Using cursor P00222 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(AV16RecLinIni), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(AV16RecLinIni)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A811RecLin = P00222_A811RecLin[0] ;
         A686PrdCant = P00222_A686PrdCant[0] ;
         A719PrdNum = P00222_A719PrdNum[0] ;
         n719PrdNum = P00222_n719PrdNum[0] ;
         /* Using cursor P00223 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A707PrdFacCon = P00223_A707PrdFacCon[0] ;
         A685PrdCanRes = P00223_A685PrdCanRes[0] ;
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) && ( A686PrdCant.doubleValue() != 0 ) )
         {
            A685PrdCanRes = A685PrdCanRes.subtract(((A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
            AV15RecLin = (short)(AV15RecLin-10) ;
            AV16RecLinIni = (short)(AV16RecLinIni-10) ;
         }
         else
         {
            AV16RecLinIni = AV15RecLin ;
         }
         /* Using cursor P00224 */
         pr_default.execute(2, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      /* Using cursor P00225 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(AV22RecLinIni2)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A811RecLin = P00225_A811RecLin[0] ;
         A719PrdNum = P00225_A719PrdNum[0] ;
         n719PrdNum = P00225_n719PrdNum[0] ;
         A686PrdCant = P00225_A686PrdCant[0] ;
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 ) )
         {
            AV18Flag = (byte)(1) ;
            /* Using cursor P00226 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         else
         {
            if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) && ( A686PrdCant.doubleValue() != 0 ) ) || ( GXutil.strcmp(A719PrdNum, "000000") == 0 ) )
            {
               AV18Flag = (byte)(1) ;
               /* Using cursor P00227 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelirec.this.A396EmprCod;
      this.aP1[0] = pelirec.this.A129BarCod;
      this.aP2[0] = pelirec.this.A132BarCodReo;
      this.aP3[0] = pelirec.this.A130BarCodPar;
      this.aP4[0] = pelirec.this.AV15RecLin;
      this.aP5[0] = pelirec.this.AV16RecLinIni;
      this.aP6[0] = pelirec.this.A2804RecLinMaq;
      this.aP7[0] = pelirec.this.A1273RecLinPro;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelirec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Proc = "" ;
      AV23RL = "" ;
      scmdbuf = "" ;
      P00222_A396EmprCod = new String[] {""} ;
      P00222_A129BarCod = new int[1] ;
      P00222_A132BarCodReo = new byte[1] ;
      P00222_A130BarCodPar = new String[] {""} ;
      P00222_A2804RecLinMaq = new short[1] ;
      P00222_A1273RecLinPro = new byte[1] ;
      P00222_A811RecLin = new short[1] ;
      P00222_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00222_A719PrdNum = new String[] {""} ;
      P00222_n719PrdNum = new boolean[] {false} ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      P00223_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00223_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      P00225_A396EmprCod = new String[] {""} ;
      P00225_A129BarCod = new int[1] ;
      P00225_A132BarCodReo = new byte[1] ;
      P00225_A130BarCodPar = new String[] {""} ;
      P00225_A2804RecLinMaq = new short[1] ;
      P00225_A1273RecLinPro = new byte[1] ;
      P00225_A811RecLin = new short[1] ;
      P00225_A719PrdNum = new String[] {""} ;
      P00225_n719PrdNum = new boolean[] {false} ;
      P00225_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelirec__default(),
         new Object[] {
             new Object[] {
            P00222_A396EmprCod, P00222_A129BarCod, P00222_A132BarCodReo, P00222_A130BarCodPar, P00222_A2804RecLinMaq, P00222_A1273RecLinPro, P00222_A811RecLin, P00222_A686PrdCant, P00222_A719PrdNum, P00222_n719PrdNum
            }
            , new Object[] {
            P00223_A707PrdFacCon, P00223_A685PrdCanRes
            }
            , new Object[] {
            }
            , new Object[] {
            P00225_A396EmprCod, P00225_A129BarCod, P00225_A132BarCodReo, P00225_A130BarCodPar, P00225_A2804RecLinMaq, P00225_A1273RecLinPro, P00225_A811RecLin, P00225_A719PrdNum, P00225_n719PrdNum, P00225_A686PrdCant
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV18Flag ;
   private byte AV27Contador ;
   private short AV15RecLin ;
   private short AV16RecLinIni ;
   private short A2804RecLinMaq ;
   private short AV21RecLin2 ;
   private short AV22RecLinIni2 ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV26Proc ;
   private String AV23RL ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private boolean n719PrdNum ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00222_A396EmprCod ;
   private int[] P00222_A129BarCod ;
   private byte[] P00222_A132BarCodReo ;
   private String[] P00222_A130BarCodPar ;
   private short[] P00222_A2804RecLinMaq ;
   private byte[] P00222_A1273RecLinPro ;
   private short[] P00222_A811RecLin ;
   private java.math.BigDecimal[] P00222_A686PrdCant ;
   private String[] P00222_A719PrdNum ;
   private boolean[] P00222_n719PrdNum ;
   private java.math.BigDecimal[] P00223_A707PrdFacCon ;
   private java.math.BigDecimal[] P00223_A685PrdCanRes ;
   private String[] P00225_A396EmprCod ;
   private int[] P00225_A129BarCod ;
   private byte[] P00225_A132BarCodReo ;
   private String[] P00225_A130BarCodPar ;
   private short[] P00225_A2804RecLinMaq ;
   private byte[] P00225_A1273RecLinPro ;
   private short[] P00225_A811RecLin ;
   private String[] P00225_A719PrdNum ;
   private boolean[] P00225_n719PrdNum ;
   private java.math.BigDecimal[] P00225_A686PrdCant ;
}

final  class pelirec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00222", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdCant, PrdNum FROM TXPLRECET WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? and RecLin = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00223", "SELECT PrdFacCon, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00224", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P00225", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, PrdCant FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? and RecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00226", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P00227", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

