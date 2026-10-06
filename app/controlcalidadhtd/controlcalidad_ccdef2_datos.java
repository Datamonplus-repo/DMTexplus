package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef2_datos extends GXProcedure
{
   public controlcalidad_ccdef2_datos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef2_datos.class ), "" );
   }

   public controlcalidad_ccdef2_datos( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             String[] aP4 )
   {
      controlcalidad_ccdef2_datos.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      controlcalidad_ccdef2_datos.this.A396EmprCod = aP0;
      controlcalidad_ccdef2_datos.this.A4031CCTCod = aP1;
      controlcalidad_ccdef2_datos.this.A4034CCTLin = aP2;
      controlcalidad_ccdef2_datos.this.AV21CCTValLin = aP3;
      controlcalidad_ccdef2_datos.this.aP4 = aP4;
      controlcalidad_ccdef2_datos.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22CCTValDsc = "" ;
      AV23CCTVal = "" ;
      /* Using cursor P0APL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(AV21CCTValLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4049CCTValLin = P0APL2_A4049CCTValLin[0] ;
         A4050CCTValDsc = P0APL2_A4050CCTValDsc[0] ;
         A4051CCTVal = P0APL2_A4051CCTVal[0] ;
         AV22CCTValDsc = A4050CCTValDsc ;
         AV23CCTVal = A4051CCTVal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = controlcalidad_ccdef2_datos.this.AV22CCTValDsc;
      this.aP5[0] = controlcalidad_ccdef2_datos.this.AV23CCTVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22CCTValDsc = "" ;
      AV23CCTVal = "" ;
      scmdbuf = "" ;
      P0APL2_A396EmprCod = new String[] {""} ;
      P0APL2_A4031CCTCod = new int[1] ;
      P0APL2_A4034CCTLin = new short[1] ;
      P0APL2_A4049CCTValLin = new byte[1] ;
      P0APL2_A4050CCTValDsc = new String[] {""} ;
      P0APL2_A4051CCTVal = new String[] {""} ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef2_datos__default(),
         new Object[] {
             new Object[] {
            P0APL2_A396EmprCod, P0APL2_A4031CCTCod, P0APL2_A4034CCTLin, P0APL2_A4049CCTValLin, P0APL2_A4050CCTValDsc, P0APL2_A4051CCTVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21CCTValLin ;
   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String AV22CCTValDsc ;
   private String AV23CCTVal ;
   private String scmdbuf ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APL2_A396EmprCod ;
   private int[] P0APL2_A4031CCTCod ;
   private short[] P0APL2_A4034CCTLin ;
   private byte[] P0APL2_A4049CCTValLin ;
   private String[] P0APL2_A4050CCTValDsc ;
   private String[] P0APL2_A4051CCTVal ;
}

final  class controlcalidad_ccdef2_datos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APL2", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

