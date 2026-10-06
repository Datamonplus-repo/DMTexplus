package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psaftse1 extends GXProcedure
{
   public psaftse1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psaftse1.class ), "" );
   }

   public psaftse1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      psaftse1.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      psaftse1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psaftse1.this.A2253SalExtAlb = aP1[0];
      this.aP1 = aP1;
      psaftse1.this.AV16ALbLic = aP2[0];
      this.aP2 = aP2;
      psaftse1.this.AV17AlbEnvFtp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P041U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10741SalEnvAT = P041U2_A10741SalEnvAT[0] ;
         A10742SalCodeID = P041U2_A10742SalCodeID[0] ;
         A10767SalExtAT = P041U2_A10767SalExtAT[0] ;
         A10741SalEnvAT = AV17AlbEnvFtp ;
         A10742SalCodeID = AV16ALbLic ;
         A10767SalExtAT = httpContext.getMessage( "M", "") ;
         /* Using cursor P041U3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A10741SalEnvAT), A10742SalCodeID, A10767SalExtAT, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psaftse1.this.A396EmprCod;
      this.aP1[0] = psaftse1.this.A2253SalExtAlb;
      this.aP2[0] = psaftse1.this.AV16ALbLic;
      this.aP3[0] = psaftse1.this.AV17AlbEnvFtp;
      Application.commitDataStores(context, remoteHandle, pr_default, "psaftse1");
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
      P041U2_A396EmprCod = new String[] {""} ;
      P041U2_A2253SalExtAlb = new int[1] ;
      P041U2_A10741SalEnvAT = new byte[1] ;
      P041U2_A10742SalCodeID = new String[] {""} ;
      P041U2_A10767SalExtAT = new String[] {""} ;
      A10742SalCodeID = "" ;
      A10767SalExtAT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psaftse1__default(),
         new Object[] {
             new Object[] {
            P041U2_A396EmprCod, P041U2_A2253SalExtAlb, P041U2_A10741SalEnvAT, P041U2_A10742SalCodeID, P041U2_A10767SalExtAT
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A10741SalEnvAT ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String AV16ALbLic ;
   private String scmdbuf ;
   private String A10742SalCodeID ;
   private String A10767SalExtAT ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P041U2_A396EmprCod ;
   private int[] P041U2_A2253SalExtAlb ;
   private byte[] P041U2_A10741SalEnvAT ;
   private String[] P041U2_A10742SalCodeID ;
   private String[] P041U2_A10767SalExtAT ;
}

final  class psaftse1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P041U2", "SELECT EmprCod, SalExtAlb, SalEnvAT, SalCodeID, SalExtAT FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P041U3", "UPDATE TXPCEXTSA SET SalEnvAT=?, SalCodeID=?, SalExtAT=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

