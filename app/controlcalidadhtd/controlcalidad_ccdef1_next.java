package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_next extends GXProcedure
{
   public controlcalidad_ccdef1_next( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_next.class ), "" );
   }

   public controlcalidad_ccdef1_next( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      controlcalidad_ccdef1_next.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 )
   {
      controlcalidad_ccdef1_next.this.AV11EmprCod = aP0;
      controlcalidad_ccdef1_next.this.AV9cctcod = aP1;
      controlcalidad_ccdef1_next.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AP52 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Integer.valueOf(AV9cctcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AP52_A396EmprCod[0] ;
         A4031CCTCod = P0AP52_A4031CCTCod[0] ;
         A4034CCTLin = P0AP52_A4034CCTLin[0] ;
         AV8Aux_cctlin = A4034CCTLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8Aux_cctlin = (short)(AV8Aux_cctlin+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = controlcalidad_ccdef1_next.this.AV8Aux_cctlin;
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
      P0AP52_A396EmprCod = new String[] {""} ;
      P0AP52_A4031CCTCod = new int[1] ;
      P0AP52_A4034CCTLin = new short[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_next__default(),
         new Object[] {
             new Object[] {
            P0AP52_A396EmprCod, P0AP52_A4031CCTCod, P0AP52_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Aux_cctlin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV9cctcod ;
   private int A4031CCTCod ;
   private String AV11EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AP52_A396EmprCod ;
   private int[] P0AP52_A4031CCTCod ;
   private short[] P0AP52_A4034CCTLin ;
}

final  class controlcalidad_ccdef1_next__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AP52", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

