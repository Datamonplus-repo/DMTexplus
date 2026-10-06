package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccend extends GXProcedure
{
   public pccend( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccend.class ), "" );
   }

   public pccend( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           short[] aP5 ,
                           int[] aP6 )
   {
      pccend.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pccend.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccend.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pccend.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccend.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccend.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pccend.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pccend.this.A4031CCTCod = aP6[0];
      this.aP6 = aP6;
      pccend.this.AV8Ok = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P013C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4035CCVal = P013C2_A4035CCVal[0] ;
         A4034CCTLin = P013C2_A4034CCTLin[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8Ok = (byte)(0) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8Ok = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccend.this.A396EmprCod;
      this.aP1[0] = pccend.this.A129BarCod;
      this.aP2[0] = pccend.this.A132BarCodReo;
      this.aP3[0] = pccend.this.A130BarCodPar;
      this.aP4[0] = pccend.this.A758ProCod;
      this.aP5[0] = pccend.this.A194BarOrdLin;
      this.aP6[0] = pccend.this.A4031CCTCod;
      this.aP7[0] = pccend.this.AV8Ok;
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
      P013C2_A396EmprCod = new String[] {""} ;
      P013C2_A129BarCod = new int[1] ;
      P013C2_A132BarCodReo = new byte[1] ;
      P013C2_A130BarCodPar = new String[] {""} ;
      P013C2_A758ProCod = new String[] {""} ;
      P013C2_A194BarOrdLin = new short[1] ;
      P013C2_A4031CCTCod = new int[1] ;
      P013C2_A4035CCVal = new String[] {""} ;
      P013C2_A4034CCTLin = new short[1] ;
      A4035CCVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccend__default(),
         new Object[] {
             new Object[] {
            P013C2_A396EmprCod, P013C2_A129BarCod, P013C2_A132BarCodReo, P013C2_A130BarCodPar, P013C2_A758ProCod, P013C2_A194BarOrdLin, P013C2_A4031CCTCod, P013C2_A4035CCVal, P013C2_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Ok ;
   private byte AV11GXLvl1 ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A4035CCVal ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P013C2_A396EmprCod ;
   private int[] P013C2_A129BarCod ;
   private byte[] P013C2_A132BarCodReo ;
   private String[] P013C2_A130BarCodPar ;
   private String[] P013C2_A758ProCod ;
   private short[] P013C2_A194BarOrdLin ;
   private int[] P013C2_A4031CCTCod ;
   private String[] P013C2_A4035CCVal ;
   private short[] P013C2_A4034CCTLin ;
}

final  class pccend__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P013C2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCVal, CCTLin FROM TXPCC1 WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ?) AND ((rtrim(CCVal) IS NULL AND NOT(CCVal IS NULL))) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

