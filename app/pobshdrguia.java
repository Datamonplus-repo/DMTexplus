package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobshdrguia extends GXProcedure
{
   public pobshdrguia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobshdrguia.class ), "" );
   }

   public pobshdrguia( int remoteHandle ,
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
      pobshdrguia.this.aP4 = new String[] {""};
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
      pobshdrguia.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pobshdrguia.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pobshdrguia.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pobshdrguia.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pobshdrguia.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlbHdrObs = "" ;
      /* Using cursor P09QE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P09QE2_A361DisCod[0] ;
         A366DisEnt = P09QE2_A366DisEnt[0] ;
         A366DisEnt = P09QE2_A366DisEnt[0] ;
         AV8AlbHdrObs = A366DisEnt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pobshdrguia.this.A396EmprCod;
      this.aP1[0] = pobshdrguia.this.A129BarCod;
      this.aP2[0] = pobshdrguia.this.A132BarCodReo;
      this.aP3[0] = pobshdrguia.this.A130BarCodPar;
      this.aP4[0] = pobshdrguia.this.AV8AlbHdrObs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8AlbHdrObs = "" ;
      scmdbuf = "" ;
      P09QE2_A361DisCod = new int[1] ;
      P09QE2_A396EmprCod = new String[] {""} ;
      P09QE2_A129BarCod = new int[1] ;
      P09QE2_A132BarCodReo = new byte[1] ;
      P09QE2_A130BarCodPar = new String[] {""} ;
      P09QE2_A366DisEnt = new String[] {""} ;
      A366DisEnt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobshdrguia__default(),
         new Object[] {
             new Object[] {
            P09QE2_A361DisCod, P09QE2_A396EmprCod, P09QE2_A129BarCod, P09QE2_A132BarCodReo, P09QE2_A130BarCodPar, P09QE2_A366DisEnt
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
   private String AV8AlbHdrObs ;
   private String scmdbuf ;
   private String A366DisEnt ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P09QE2_A361DisCod ;
   private String[] P09QE2_A396EmprCod ;
   private int[] P09QE2_A129BarCod ;
   private byte[] P09QE2_A132BarCodReo ;
   private String[] P09QE2_A130BarCodPar ;
   private String[] P09QE2_A366DisEnt ;
}

final  class pobshdrguia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QE2", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.DisEnt FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

