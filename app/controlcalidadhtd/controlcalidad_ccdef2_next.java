package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef2_next extends GXProcedure
{
   public controlcalidad_ccdef2_next( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef2_next.class ), "" );
   }

   public controlcalidad_ccdef2_next( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           short aP2 )
   {
      controlcalidad_ccdef2_next.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte[] aP3 )
   {
      controlcalidad_ccdef2_next.this.AV11EmprCod = aP0;
      controlcalidad_ccdef2_next.this.AV9cctcod = aP1;
      controlcalidad_ccdef2_next.this.AV12CCTLin = aP2;
      controlcalidad_ccdef2_next.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0APM2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Integer.valueOf(AV9cctcod), Short.valueOf(AV12CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0APM2_A396EmprCod[0] ;
         A4031CCTCod = P0APM2_A4031CCTCod[0] ;
         A4034CCTLin = P0APM2_A4034CCTLin[0] ;
         A4049CCTValLin = P0APM2_A4049CCTValLin[0] ;
         AV13Aux_CCTValLin = A4049CCTValLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV13Aux_CCTValLin = (byte)(AV13Aux_CCTValLin+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccdef2_next.this.AV13Aux_CCTValLin;
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
      P0APM2_A396EmprCod = new String[] {""} ;
      P0APM2_A4031CCTCod = new int[1] ;
      P0APM2_A4034CCTLin = new short[1] ;
      P0APM2_A4049CCTValLin = new byte[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef2_next__default(),
         new Object[] {
             new Object[] {
            P0APM2_A396EmprCod, P0APM2_A4031CCTCod, P0APM2_A4034CCTLin, P0APM2_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Aux_CCTValLin ;
   private byte A4049CCTValLin ;
   private short AV12CCTLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV9cctcod ;
   private int A4031CCTCod ;
   private String AV11EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APM2_A396EmprCod ;
   private int[] P0APM2_A4031CCTCod ;
   private short[] P0APM2_A4034CCTLin ;
   private byte[] P0APM2_A4049CCTValLin ;
}

final  class controlcalidad_ccdef2_next__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APM2", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

