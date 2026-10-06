package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusent extends GXProcedure
{
   public pbusent( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusent.class ), "" );
   }

   public pbusent( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pbusent.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbusent.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusent.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbusent.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbusent.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbusent.this.AV15DisEnt = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15DisEnt = "" ;
      /* Using cursor P00OM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00OM2_A361DisCod[0] ;
         A212BarSer = P00OM2_A212BarSer[0] ;
         A366DisEnt = P00OM2_A366DisEnt[0] ;
         A366DisEnt = P00OM2_A366DisEnt[0] ;
         AV15DisEnt = A366DisEnt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusent.this.A396EmprCod;
      this.aP1[0] = pbusent.this.A129BarCod;
      this.aP2[0] = pbusent.this.A132BarCodReo;
      this.aP3[0] = pbusent.this.A130BarCodPar;
      this.aP4[0] = pbusent.this.AV15DisEnt;
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
      P00OM2_A361DisCod = new int[1] ;
      P00OM2_A396EmprCod = new String[] {""} ;
      P00OM2_A129BarCod = new int[1] ;
      P00OM2_A132BarCodReo = new byte[1] ;
      P00OM2_A130BarCodPar = new String[] {""} ;
      P00OM2_A212BarSer = new String[] {""} ;
      P00OM2_A366DisEnt = new String[] {""} ;
      A212BarSer = "" ;
      A366DisEnt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusent__default(),
         new Object[] {
             new Object[] {
            P00OM2_A361DisCod, P00OM2_A396EmprCod, P00OM2_A129BarCod, P00OM2_A132BarCodReo, P00OM2_A130BarCodPar, P00OM2_A212BarSer, P00OM2_A366DisEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15DisEnt ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A366DisEnt ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00OM2_A361DisCod ;
   private String[] P00OM2_A396EmprCod ;
   private int[] P00OM2_A129BarCod ;
   private byte[] P00OM2_A132BarCodReo ;
   private String[] P00OM2_A130BarCodPar ;
   private String[] P00OM2_A212BarSer ;
   private String[] P00OM2_A366DisEnt ;
}

final  class pbusent__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OM2", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T2.DisEnt FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
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
               return;
      }
   }

}

