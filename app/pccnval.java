package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccnval extends GXProcedure
{
   public pccnval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccnval.class ), "" );
   }

   public pccnval( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 ,
                          int[] aP6 ,
                          int[] aP7 )
   {
      pccnval.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 )
   {
      pccnval.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccnval.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pccnval.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccnval.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccnval.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pccnval.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pccnval.this.A4031CCTCod = aP6[0];
      this.aP6 = aP6;
      pccnval.this.AV12Nt = aP7[0];
      this.aP7 = aP7;
      pccnval.this.AV11Nval = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Nval = 0 ;
      AV12Nt = 0 ;
      /* Using cursor P04HI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4035CCVal = P04HI2_A4035CCVal[0] ;
         A4034CCTLin = P04HI2_A4034CCTLin[0] ;
         if ( GXutil.strcmp(A4035CCVal, " ") != 0 )
         {
            AV11Nval = (int)(AV11Nval+1) ;
         }
         AV12Nt = (int)(AV12Nt+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccnval.this.A396EmprCod;
      this.aP1[0] = pccnval.this.A129BarCod;
      this.aP2[0] = pccnval.this.A132BarCodReo;
      this.aP3[0] = pccnval.this.A130BarCodPar;
      this.aP4[0] = pccnval.this.A758ProCod;
      this.aP5[0] = pccnval.this.A194BarOrdLin;
      this.aP6[0] = pccnval.this.A4031CCTCod;
      this.aP7[0] = pccnval.this.AV12Nt;
      this.aP8[0] = pccnval.this.AV11Nval;
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
      P04HI2_A396EmprCod = new String[] {""} ;
      P04HI2_A129BarCod = new int[1] ;
      P04HI2_A132BarCodReo = new byte[1] ;
      P04HI2_A130BarCodPar = new String[] {""} ;
      P04HI2_A758ProCod = new String[] {""} ;
      P04HI2_A194BarOrdLin = new short[1] ;
      P04HI2_A4031CCTCod = new int[1] ;
      P04HI2_A4035CCVal = new String[] {""} ;
      P04HI2_A4034CCTLin = new short[1] ;
      A4035CCVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccnval__default(),
         new Object[] {
             new Object[] {
            P04HI2_A396EmprCod, P04HI2_A129BarCod, P04HI2_A132BarCodReo, P04HI2_A130BarCodPar, P04HI2_A758ProCod, P04HI2_A194BarOrdLin, P04HI2_A4031CCTCod, P04HI2_A4035CCVal, P04HI2_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int AV12Nt ;
   private int AV11Nval ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A4035CCVal ;
   private int[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04HI2_A396EmprCod ;
   private int[] P04HI2_A129BarCod ;
   private byte[] P04HI2_A132BarCodReo ;
   private String[] P04HI2_A130BarCodPar ;
   private String[] P04HI2_A758ProCod ;
   private short[] P04HI2_A194BarOrdLin ;
   private int[] P04HI2_A4031CCTCod ;
   private String[] P04HI2_A4035CCVal ;
   private short[] P04HI2_A4034CCTLin ;
}

final  class pccnval__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04HI2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCVal, CCTLin FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

