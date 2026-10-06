package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpzsfs extends GXProcedure
{
   public pnumpzsfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpzsfs.class ), "" );
   }

   public pnumpzsfs( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 )
   {
      pnumpzsfs.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 )
   {
      pnumpzsfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpzsfs.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumpzsfs.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnumpzsfs.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnumpzsfs.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pnumpzsfs.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pnumpzsfs.this.AV9BarNumbot = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04HD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4022BarNumBot = P04HD2_A4022BarNumBot[0] ;
         AV9BarNumbot = (int)(A4022BarNumBot+1) ;
         A4022BarNumBot = AV9BarNumbot ;
         /* Using cursor P04HD3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A4022BarNumBot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpzsfs.this.A396EmprCod;
      this.aP1[0] = pnumpzsfs.this.A129BarCod;
      this.aP2[0] = pnumpzsfs.this.A132BarCodReo;
      this.aP3[0] = pnumpzsfs.this.A130BarCodPar;
      this.aP4[0] = pnumpzsfs.this.A758ProCod;
      this.aP5[0] = pnumpzsfs.this.A194BarOrdLin;
      this.aP6[0] = pnumpzsfs.this.AV9BarNumbot;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumpzsfs");
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
      P04HD2_A396EmprCod = new String[] {""} ;
      P04HD2_A129BarCod = new int[1] ;
      P04HD2_A132BarCodReo = new byte[1] ;
      P04HD2_A130BarCodPar = new String[] {""} ;
      P04HD2_A758ProCod = new String[] {""} ;
      P04HD2_A194BarOrdLin = new short[1] ;
      P04HD2_A4022BarNumBot = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpzsfs__default(),
         new Object[] {
             new Object[] {
            P04HD2_A396EmprCod, P04HD2_A129BarCod, P04HD2_A132BarCodReo, P04HD2_A130BarCodPar, P04HD2_A758ProCod, P04HD2_A194BarOrdLin, P04HD2_A4022BarNumBot
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9BarNumbot ;
   private int A4022BarNumBot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04HD2_A396EmprCod ;
   private int[] P04HD2_A129BarCod ;
   private byte[] P04HD2_A132BarCodReo ;
   private String[] P04HD2_A130BarCodPar ;
   private String[] P04HD2_A758ProCod ;
   private short[] P04HD2_A194BarOrdLin ;
   private int[] P04HD2_A4022BarNumBot ;
}

final  class pnumpzsfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04HD2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarNumBot FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04HD3", "UPDATE TXPBARFAS SET BarNumBot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

