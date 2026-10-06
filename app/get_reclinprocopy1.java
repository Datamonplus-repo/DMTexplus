package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_reclinprocopy1 extends GXProcedure
{
   public get_reclinprocopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_reclinprocopy1.class ), "" );
   }

   public get_reclinprocopy1( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 ,
                           short aP4 ,
                           byte aP5 ,
                           short[] aP6 ,
                           short[] aP7 ,
                           short[] aP8 ,
                           short[] aP9 )
   {
      get_reclinprocopy1.this.aP10 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        byte[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             byte[] aP10 )
   {
      get_reclinprocopy1.this.A396EmprCod = aP0;
      get_reclinprocopy1.this.A129BarCod = aP1;
      get_reclinprocopy1.this.A132BarCodReo = aP2;
      get_reclinprocopy1.this.A130BarCodPar = aP3;
      get_reclinprocopy1.this.A2804RecLinMaq = aP4;
      get_reclinprocopy1.this.AV12RecLinPro = aP5;
      get_reclinprocopy1.this.aP6 = aP6;
      get_reclinprocopy1.this.aP7 = aP7;
      get_reclinprocopy1.this.aP8 = aP8;
      get_reclinprocopy1.this.aP9 = aP9;
      get_reclinprocopy1.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Reclinmax = (short)(0) ;
      AV11Reclinmin = (short)(0) ;
      AV13NextReclinmax = (short)(0) ;
      AV14NextReclinmin = (short)(0) ;
      AV15NextReclinpro = (byte)(0) ;
      /* Using cursor P0ALI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(AV12RecLinPro)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1273RecLinPro = P0ALI2_A1273RecLinPro[0] ;
         A811RecLin = P0ALI2_A811RecLin[0] ;
         AV10Reclinmax = A811RecLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0ALI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(AV12RecLinPro)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1273RecLinPro = P0ALI3_A1273RecLinPro[0] ;
         A811RecLin = P0ALI3_A811RecLin[0] ;
         AV11Reclinmin = A811RecLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P0ALI4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(AV12RecLinPro)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1273RecLinPro = P0ALI4_A1273RecLinPro[0] ;
         A811RecLin = P0ALI4_A811RecLin[0] ;
         GXv_int1[0] = AV13NextReclinmax ;
         GXv_int2[0] = AV14NextReclinmin ;
         GXv_int3[0] = AV15NextReclinpro ;
         GXv_int4[0] = (short)(0) ;
         GXv_int5[0] = (byte)(0) ;
         new app.get_reclinprocopy1(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, GXv_int1, GXv_int2, GXv_int3, GXv_int4, GXv_int5) ;
         get_reclinprocopy1.this.AV13NextReclinmax = GXv_int1[0] ;
         get_reclinprocopy1.this.AV14NextReclinmin = GXv_int2[0] ;
         get_reclinprocopy1.this.AV15NextReclinpro = (byte)((byte)(GXv_int3[0])) ;
         AV15NextReclinpro = A1273RecLinPro ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = get_reclinprocopy1.this.AV10Reclinmax;
      this.aP7[0] = get_reclinprocopy1.this.AV11Reclinmin;
      this.aP8[0] = get_reclinprocopy1.this.AV13NextReclinmax;
      this.aP9[0] = get_reclinprocopy1.this.AV14NextReclinmin;
      this.aP10[0] = get_reclinprocopy1.this.AV15NextReclinpro;
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
      P0ALI2_A396EmprCod = new String[] {""} ;
      P0ALI2_A129BarCod = new int[1] ;
      P0ALI2_A132BarCodReo = new byte[1] ;
      P0ALI2_A130BarCodPar = new String[] {""} ;
      P0ALI2_A2804RecLinMaq = new short[1] ;
      P0ALI2_A1273RecLinPro = new byte[1] ;
      P0ALI2_A811RecLin = new short[1] ;
      P0ALI3_A396EmprCod = new String[] {""} ;
      P0ALI3_A129BarCod = new int[1] ;
      P0ALI3_A132BarCodReo = new byte[1] ;
      P0ALI3_A130BarCodPar = new String[] {""} ;
      P0ALI3_A2804RecLinMaq = new short[1] ;
      P0ALI3_A1273RecLinPro = new byte[1] ;
      P0ALI3_A811RecLin = new short[1] ;
      P0ALI4_A396EmprCod = new String[] {""} ;
      P0ALI4_A129BarCod = new int[1] ;
      P0ALI4_A132BarCodReo = new byte[1] ;
      P0ALI4_A130BarCodPar = new String[] {""} ;
      P0ALI4_A2804RecLinMaq = new short[1] ;
      P0ALI4_A1273RecLinPro = new byte[1] ;
      P0ALI4_A811RecLin = new short[1] ;
      GXv_int1 = new short[1] ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.get_reclinprocopy1__default(),
         new Object[] {
             new Object[] {
            P0ALI2_A396EmprCod, P0ALI2_A129BarCod, P0ALI2_A132BarCodReo, P0ALI2_A130BarCodPar, P0ALI2_A2804RecLinMaq, P0ALI2_A1273RecLinPro, P0ALI2_A811RecLin
            }
            , new Object[] {
            P0ALI3_A396EmprCod, P0ALI3_A129BarCod, P0ALI3_A132BarCodReo, P0ALI3_A130BarCodPar, P0ALI3_A2804RecLinMaq, P0ALI3_A1273RecLinPro, P0ALI3_A811RecLin
            }
            , new Object[] {
            P0ALI4_A396EmprCod, P0ALI4_A129BarCod, P0ALI4_A132BarCodReo, P0ALI4_A130BarCodPar, P0ALI4_A2804RecLinMaq, P0ALI4_A1273RecLinPro, P0ALI4_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12RecLinPro ;
   private byte AV15NextReclinpro ;
   private byte A1273RecLinPro ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short AV10Reclinmax ;
   private short AV11Reclinmin ;
   private short AV13NextReclinmax ;
   private short AV14NextReclinmin ;
   private short A811RecLin ;
   private short GXv_int1[] ;
   private short GXv_int2[] ;
   private short GXv_int3[] ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP10 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALI2_A396EmprCod ;
   private int[] P0ALI2_A129BarCod ;
   private byte[] P0ALI2_A132BarCodReo ;
   private String[] P0ALI2_A130BarCodPar ;
   private short[] P0ALI2_A2804RecLinMaq ;
   private byte[] P0ALI2_A1273RecLinPro ;
   private short[] P0ALI2_A811RecLin ;
   private String[] P0ALI3_A396EmprCod ;
   private int[] P0ALI3_A129BarCod ;
   private byte[] P0ALI3_A132BarCodReo ;
   private String[] P0ALI3_A130BarCodPar ;
   private short[] P0ALI3_A2804RecLinMaq ;
   private byte[] P0ALI3_A1273RecLinPro ;
   private short[] P0ALI3_A811RecLin ;
   private String[] P0ALI4_A396EmprCod ;
   private int[] P0ALI4_A129BarCod ;
   private byte[] P0ALI4_A132BarCodReo ;
   private String[] P0ALI4_A130BarCodPar ;
   private short[] P0ALI4_A2804RecLinMaq ;
   private byte[] P0ALI4_A1273RecLinPro ;
   private short[] P0ALI4_A811RecLin ;
}

final  class get_reclinprocopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALI2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ALI3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ALI4", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro > ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

