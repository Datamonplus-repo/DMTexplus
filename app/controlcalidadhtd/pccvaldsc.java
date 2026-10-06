package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccvaldsc extends GXProcedure
{
   public pccvaldsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccvaldsc.class ), "" );
   }

   public pccvaldsc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pccvaldsc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pccvaldsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccvaldsc.this.A4031CCTCod = aP1[0];
      this.aP1 = aP1;
      pccvaldsc.this.A4034CCTLin = aP2[0];
      this.aP2 = aP2;
      pccvaldsc.this.AV8CCVal = aP3[0];
      this.aP3 = aP3;
      pccvaldsc.this.AV9CCValDsc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12GXLvl1 = (byte)(0) ;
      /* Using cursor P013R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), AV8CCVal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4051CCTVal = P013R2_A4051CCTVal[0] ;
         A4050CCTValDsc = P013R2_A4050CCTValDsc[0] ;
         A4049CCTValLin = P013R2_A4049CCTValLin[0] ;
         AV12GXLvl1 = (byte)(1) ;
         AV9CCValDsc = A4050CCTValDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12GXLvl1 == 0 )
      {
         AV9CCValDsc = AV8CCVal ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccvaldsc.this.A396EmprCod;
      this.aP1[0] = pccvaldsc.this.A4031CCTCod;
      this.aP2[0] = pccvaldsc.this.A4034CCTLin;
      this.aP3[0] = pccvaldsc.this.AV8CCVal;
      this.aP4[0] = pccvaldsc.this.AV9CCValDsc;
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
      P013R2_A396EmprCod = new String[] {""} ;
      P013R2_A4031CCTCod = new int[1] ;
      P013R2_A4034CCTLin = new short[1] ;
      P013R2_A4051CCTVal = new String[] {""} ;
      P013R2_A4050CCTValDsc = new String[] {""} ;
      P013R2_A4049CCTValLin = new byte[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccvaldsc__default(),
         new Object[] {
             new Object[] {
            P013R2_A396EmprCod, P013R2_A4031CCTCod, P013R2_A4034CCTLin, P013R2_A4051CCTVal, P013R2_A4050CCTValDsc, P013R2_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl1 ;
   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String AV8CCVal ;
   private String AV9CCValDsc ;
   private String scmdbuf ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P013R2_A396EmprCod ;
   private int[] P013R2_A4031CCTCod ;
   private short[] P013R2_A4034CCTLin ;
   private String[] P013R2_A4051CCTVal ;
   private String[] P013R2_A4050CCTValDsc ;
   private byte[] P013R2_A4049CCTValLin ;
}

final  class pccvaldsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P013R2", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (CCTVal = ?) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               return;
      }
   }

}

