package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinslt06 extends GXProcedure
{
   public pinslt06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinslt06.class ), "" );
   }

   public pinslt06( int remoteHandle ,
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
      pinslt06.this.aP4 = new String[] {""};
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
      pinslt06.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinslt06.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinslt06.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinslt06.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinslt06.this.AV9BarNPed = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9BarNPed = " " ;
      /* Using cursor P06212 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3746BarNPed = P06212_A3746BarNPed[0] ;
         AV9BarNPed = A3746BarNPed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinslt06.this.A396EmprCod;
      this.aP1[0] = pinslt06.this.A129BarCod;
      this.aP2[0] = pinslt06.this.A132BarCodReo;
      this.aP3[0] = pinslt06.this.A130BarCodPar;
      this.aP4[0] = pinslt06.this.AV9BarNPed;
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
      P06212_A396EmprCod = new String[] {""} ;
      P06212_A129BarCod = new int[1] ;
      P06212_A132BarCodReo = new byte[1] ;
      P06212_A130BarCodPar = new String[] {""} ;
      P06212_A3746BarNPed = new String[] {""} ;
      A3746BarNPed = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinslt06__default(),
         new Object[] {
             new Object[] {
            P06212_A396EmprCod, P06212_A129BarCod, P06212_A132BarCodReo, P06212_A130BarCodPar, P06212_A3746BarNPed
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9BarNPed ;
   private String scmdbuf ;
   private String A3746BarNPed ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06212_A396EmprCod ;
   private int[] P06212_A129BarCod ;
   private byte[] P06212_A132BarCodReo ;
   private String[] P06212_A130BarCodPar ;
   private String[] P06212_A3746BarNPed ;
}

final  class pinslt06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06212", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNPed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
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

