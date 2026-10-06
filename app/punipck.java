package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class punipck extends GXProcedure
{
   public punipck( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( punipck.class ), "" );
   }

   public punipck( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            short[] aP7 )
   {
      punipck.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 )
   {
      punipck.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      punipck.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      punipck.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      punipck.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      punipck.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      punipck.this.AV8Kg_Bruto = aP5[0];
      this.aP5 = aP5;
      punipck.this.AV9Kg_Neto = aP6[0];
      this.aP6 = aP6;
      punipck.this.AV10Tot_Cajas = aP7[0];
      this.aP7 = aP7;
      punipck.this.AV12Conos = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Kg_Bruto = DecimalUtil.doubleToDec(0) ;
      AV9Kg_Neto = DecimalUtil.doubleToDec(0) ;
      AV10Tot_Cajas = (short)(0) ;
      AV12Conos = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P02BT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c3624AlbPckKb = P02BT2_A3624AlbPckKb[0] ;
      n3624AlbPckKb = P02BT2_n3624AlbPckKb[0] ;
      c3623AlbPckKn = P02BT2_A3623AlbPckKn[0] ;
      n3623AlbPckKn = P02BT2_n3623AlbPckKn[0] ;
      c3626AlbPckUni = P02BT2_A3626AlbPckUni[0] ;
      n3626AlbPckUni = P02BT2_n3626AlbPckUni[0] ;
      cV10Tot_Cajas = P02BT2_AV10Tot_Cajas[0] ;
      pr_default.close(0);
      AV8Kg_Bruto = AV8Kg_Bruto.add(c3624AlbPckKb) ;
      AV9Kg_Neto = AV9Kg_Neto.add(c3623AlbPckKn) ;
      AV12Conos = (short)(AV12Conos+c3626AlbPckUni) ;
      AV10Tot_Cajas = (short)(AV10Tot_Cajas+cV10Tot_Cajas*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = punipck.this.A396EmprCod;
      this.aP1[0] = punipck.this.A30AlbProCod;
      this.aP2[0] = punipck.this.A129BarCod;
      this.aP3[0] = punipck.this.A132BarCodReo;
      this.aP4[0] = punipck.this.A130BarCodPar;
      this.aP5[0] = punipck.this.AV8Kg_Bruto;
      this.aP6[0] = punipck.this.AV9Kg_Neto;
      this.aP7[0] = punipck.this.AV10Tot_Cajas;
      this.aP8[0] = punipck.this.AV12Conos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c3624AlbPckKb = DecimalUtil.ZERO ;
      c3623AlbPckKn = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02BT2_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BT2_n3624AlbPckKb = new boolean[] {false} ;
      P02BT2_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BT2_n3623AlbPckKn = new boolean[] {false} ;
      P02BT2_A3626AlbPckUni = new short[1] ;
      P02BT2_n3626AlbPckUni = new boolean[] {false} ;
      P02BT2_AV10Tot_Cajas = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.punipck__default(),
         new Object[] {
             new Object[] {
            P02BT2_A3624AlbPckKb, P02BT2_n3624AlbPckKb, P02BT2_A3623AlbPckKn, P02BT2_n3623AlbPckKn, P02BT2_A3626AlbPckUni, P02BT2_n3626AlbPckUni, P02BT2_AV10Tot_Cajas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV10Tot_Cajas ;
   private short AV12Conos ;
   private short c3626AlbPckUni ;
   private short cV10Tot_Cajas ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8Kg_Bruto ;
   private java.math.BigDecimal AV9Kg_Neto ;
   private java.math.BigDecimal c3624AlbPckKb ;
   private java.math.BigDecimal c3623AlbPckKn ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n3624AlbPckKb ;
   private boolean n3623AlbPckKn ;
   private boolean n3626AlbPckUni ;
   private short[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P02BT2_A3624AlbPckKb ;
   private boolean[] P02BT2_n3624AlbPckKb ;
   private java.math.BigDecimal[] P02BT2_A3623AlbPckKn ;
   private boolean[] P02BT2_n3623AlbPckKn ;
   private short[] P02BT2_A3626AlbPckUni ;
   private boolean[] P02BT2_n3626AlbPckUni ;
   private short[] P02BT2_AV10Tot_Cajas ;
}

final  class punipck__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BT2", "SELECT SUM(AlbPckKb), SUM(AlbPckKn), SUM(AlbPckUni), COUNT(*) FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

