package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class barordcomp extends GXProcedure
{
   public barordcomp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barordcomp.class ), "" );
   }

   public barordcomp( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      barordcomp.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      barordcomp.this.A396EmprCod = aP0;
      barordcomp.this.A129BarCod = aP1;
      barordcomp.this.A132BarCodReo = aP2;
      barordcomp.this.A130BarCodPar = aP3;
      barordcomp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9BarOrdComp = " " ;
      /* Using cursor P0AOI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11662BarOrdComp = P0AOI2_A11662BarOrdComp[0] ;
         AV9BarOrdComp = A11662BarOrdComp ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = barordcomp.this.AV9BarOrdComp;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9BarOrdComp = "" ;
      scmdbuf = "" ;
      P0AOI2_A396EmprCod = new String[] {""} ;
      P0AOI2_A129BarCod = new int[1] ;
      P0AOI2_A132BarCodReo = new byte[1] ;
      P0AOI2_A130BarCodPar = new String[] {""} ;
      P0AOI2_A11662BarOrdComp = new String[] {""} ;
      A11662BarOrdComp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.barordcomp__default(),
         new Object[] {
             new Object[] {
            P0AOI2_A396EmprCod, P0AOI2_A129BarCod, P0AOI2_A132BarCodReo, P0AOI2_A130BarCodPar, P0AOI2_A11662BarOrdComp
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
   private String scmdbuf ;
   private String AV9BarOrdComp ;
   private String A11662BarOrdComp ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOI2_A396EmprCod ;
   private int[] P0AOI2_A129BarCod ;
   private byte[] P0AOI2_A132BarCodReo ;
   private String[] P0AOI2_A130BarCodPar ;
   private String[] P0AOI2_A11662BarOrdComp ;
}

final  class barordcomp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOI2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdComp FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
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

