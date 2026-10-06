package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexilhipro extends GXProcedure
{
   public pexilhipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexilhipro.class ), "" );
   }

   public pexilhipro( int remoteHandle ,
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
      pexilhipro.this.aP5 = new byte[] {0};
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
      pexilhipro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexilhipro.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pexilhipro.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pexilhipro.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pexilhipro.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pexilhipro.this.AV8Lhipro = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lhipro = (byte)(0) ;
      /* Using cursor P04W62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3610HisProLot = P04W62_A3610HisProLot[0] ;
         A602MaqCod = P04W62_A602MaqCod[0] ;
         A558HisProFec = P04W62_A558HisProFec[0] ;
         A561HisProLin = P04W62_A561HisProLin[0] ;
         AV8Lhipro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexilhipro.this.A396EmprCod;
      this.aP1[0] = pexilhipro.this.A129BarCod;
      this.aP2[0] = pexilhipro.this.A132BarCodReo;
      this.aP3[0] = pexilhipro.this.A130BarCodPar;
      this.aP4[0] = pexilhipro.this.A194BarOrdLin;
      this.aP5[0] = pexilhipro.this.AV8Lhipro;
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
      P04W62_A396EmprCod = new String[] {""} ;
      P04W62_A129BarCod = new int[1] ;
      P04W62_A132BarCodReo = new byte[1] ;
      P04W62_A130BarCodPar = new String[] {""} ;
      P04W62_A194BarOrdLin = new short[1] ;
      P04W62_A3610HisProLot = new String[] {""} ;
      P04W62_A602MaqCod = new String[] {""} ;
      P04W62_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04W62_A561HisProLin = new int[1] ;
      A3610HisProLot = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexilhipro__default(),
         new Object[] {
             new Object[] {
            P04W62_A396EmprCod, P04W62_A129BarCod, P04W62_A132BarCodReo, P04W62_A130BarCodPar, P04W62_A194BarOrdLin, P04W62_A3610HisProLot, P04W62_A602MaqCod, P04W62_A558HisProFec, P04W62_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Lhipro ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A3610HisProLot ;
   private String A602MaqCod ;
   private java.util.Date A558HisProFec ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04W62_A396EmprCod ;
   private int[] P04W62_A129BarCod ;
   private byte[] P04W62_A132BarCodReo ;
   private String[] P04W62_A130BarCodPar ;
   private short[] P04W62_A194BarOrdLin ;
   private String[] P04W62_A3610HisProLot ;
   private String[] P04W62_A602MaqCod ;
   private java.util.Date[] P04W62_A558HisProFec ;
   private int[] P04W62_A561HisProLin ;
}

final  class pexilhipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04W62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProLot, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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

