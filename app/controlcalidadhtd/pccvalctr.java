package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccvalctr extends GXProcedure
{
   public pccvalctr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccvalctr.class ), "" );
   }

   public pccvalctr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pccvalctr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pccvalctr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccvalctr.this.A4031CCTCod = aP1[0];
      this.aP1 = aP1;
      pccvalctr.this.AV10CCTLin = aP2[0];
      this.aP2 = aP2;
      pccvalctr.this.AV11CCTSta = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P019P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(AV10CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4034CCTLin = P019P2_A4034CCTLin[0] ;
         A4408CCTSta = P019P2_A4408CCTSta[0] ;
         AV11CCTSta = A4408CCTSta ;
         if ( (GXutil.strcmp("", A4408CCTSta)==0) )
         {
            AV11CCTSta = httpContext.getMessage( "No tiene standar", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccvalctr.this.A396EmprCod;
      this.aP1[0] = pccvalctr.this.A4031CCTCod;
      this.aP2[0] = pccvalctr.this.AV10CCTLin;
      this.aP3[0] = pccvalctr.this.AV11CCTSta;
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
      P019P2_A396EmprCod = new String[] {""} ;
      P019P2_A4031CCTCod = new int[1] ;
      P019P2_A4034CCTLin = new short[1] ;
      P019P2_A4408CCTSta = new String[] {""} ;
      A4408CCTSta = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccvalctr__default(),
         new Object[] {
             new Object[] {
            P019P2_A396EmprCod, P019P2_A4031CCTCod, P019P2_A4034CCTLin, P019P2_A4408CCTSta
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10CCTLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String AV11CCTSta ;
   private String scmdbuf ;
   private String A4408CCTSta ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P019P2_A396EmprCod ;
   private int[] P019P2_A4031CCTCod ;
   private short[] P019P2_A4034CCTLin ;
   private String[] P019P2_A4408CCTSta ;
}

final  class pccvalctr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019P2", "SELECT EmprCod, CCTCod, CCTLin, CCTSta FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

