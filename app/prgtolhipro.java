package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prgtolhipro extends GXProcedure
{
   public prgtolhipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prgtolhipro.class ), "" );
   }

   public prgtolhipro( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 )
   {
      prgtolhipro.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      prgtolhipro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prgtolhipro.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prgtolhipro.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prgtolhipro.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prgtolhipro.this.AV10BarOrdLin = aP4[0];
      this.aP4 = aP4;
      prgtolhipro.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8OpeNom = "????" ;
      AV11Lhipro = (byte)(0) ;
      /* Using cursor P0ATD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV10BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P0ATD2_A194BarOrdLin[0] ;
         A656ParCod = P0ATD2_A656ParCod[0] ;
         n656ParCod = P0ATD2_n656ParCod[0] ;
         A561HisProLin = P0ATD2_A561HisProLin[0] ;
         A558HisProFec = P0ATD2_A558HisProFec[0] ;
         A602MaqCod = P0ATD2_A602MaqCod[0] ;
         AV11Lhipro = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prgtolhipro.this.A396EmprCod;
      this.aP1[0] = prgtolhipro.this.A129BarCod;
      this.aP2[0] = prgtolhipro.this.A132BarCodReo;
      this.aP3[0] = prgtolhipro.this.A130BarCodPar;
      this.aP4[0] = prgtolhipro.this.AV10BarOrdLin;
      this.aP5[0] = prgtolhipro.this.AV11Lhipro;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8OpeNom = "" ;
      scmdbuf = "" ;
      P0ATD2_A396EmprCod = new String[] {""} ;
      P0ATD2_A129BarCod = new int[1] ;
      P0ATD2_A132BarCodReo = new byte[1] ;
      P0ATD2_A130BarCodPar = new String[] {""} ;
      P0ATD2_A194BarOrdLin = new short[1] ;
      P0ATD2_A656ParCod = new short[1] ;
      P0ATD2_n656ParCod = new boolean[] {false} ;
      P0ATD2_A561HisProLin = new int[1] ;
      P0ATD2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATD2_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prgtolhipro__default(),
         new Object[] {
             new Object[] {
            P0ATD2_A396EmprCod, P0ATD2_A129BarCod, P0ATD2_A132BarCodReo, P0ATD2_A130BarCodPar, P0ATD2_A194BarOrdLin, P0ATD2_A656ParCod, P0ATD2_n656ParCod, P0ATD2_A561HisProLin, P0ATD2_A558HisProFec, P0ATD2_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11Lhipro ;
   private short AV10BarOrdLin ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8OpeNom ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATD2_A396EmprCod ;
   private int[] P0ATD2_A129BarCod ;
   private byte[] P0ATD2_A132BarCodReo ;
   private String[] P0ATD2_A130BarCodPar ;
   private short[] P0ATD2_A194BarOrdLin ;
   private short[] P0ATD2_A656ParCod ;
   private boolean[] P0ATD2_n656ParCod ;
   private int[] P0ATD2_A561HisProLin ;
   private java.util.Date[] P0ATD2_A558HisProFec ;
   private String[] P0ATD2_A602MaqCod ;
}

final  class prgtolhipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATD2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, HisProLin, HisProFec, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProFec, HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
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
               return;
      }
   }

}

