package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengolineafase extends GXProcedure
{
   public obtengolineafase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengolineafase.class ), "" );
   }

   public obtengolineafase( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      obtengolineafase.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      obtengolineafase.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      obtengolineafase.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      obtengolineafase.this.A361DisCod = aP2[0];
      this.aP2 = aP2;
      obtengolineafase.this.A368DisFasLin = aP3[0];
      this.aP3 = aP3;
      obtengolineafase.this.aP4 = aP4;
      obtengolineafase.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Fascod = "" ;
      AV8DisFasObs = "" ;
      /* Using cursor P0AG82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P0AG82_A457FasCod[0] ;
         A9841DisFasObs = P0AG82_A9841DisFasObs[0] ;
         AV9Fascod = A457FasCod ;
         AV8DisFasObs = A9841DisFasObs ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtengolineafase.this.A396EmprCod;
      this.aP1[0] = obtengolineafase.this.A758ProCod;
      this.aP2[0] = obtengolineafase.this.A361DisCod;
      this.aP3[0] = obtengolineafase.this.A368DisFasLin;
      this.aP4[0] = obtengolineafase.this.AV9Fascod;
      this.aP5[0] = obtengolineafase.this.AV8DisFasObs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Fascod = "" ;
      AV8DisFasObs = "" ;
      scmdbuf = "" ;
      P0AG82_A396EmprCod = new String[] {""} ;
      P0AG82_A361DisCod = new int[1] ;
      P0AG82_A758ProCod = new String[] {""} ;
      P0AG82_A368DisFasLin = new short[1] ;
      P0AG82_A457FasCod = new String[] {""} ;
      P0AG82_A9841DisFasObs = new String[] {""} ;
      A457FasCod = "" ;
      A9841DisFasObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengolineafase__default(),
         new Object[] {
             new Object[] {
            P0AG82_A396EmprCod, P0AG82_A361DisCod, P0AG82_A758ProCod, P0AG82_A368DisFasLin, P0AG82_A457FasCod, P0AG82_A9841DisFasObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A368DisFasLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV9Fascod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String AV8DisFasObs ;
   private String A9841DisFasObs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AG82_A396EmprCod ;
   private int[] P0AG82_A361DisCod ;
   private String[] P0AG82_A758ProCod ;
   private short[] P0AG82_A368DisFasLin ;
   private String[] P0AG82_A457FasCod ;
   private String[] P0AG82_A9841DisFasObs ;
}

final  class obtengolineafase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AG82", "SELECT EmprCod, DisCod, ProCod, DisFasLin, FasCod, DisFasObs FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

