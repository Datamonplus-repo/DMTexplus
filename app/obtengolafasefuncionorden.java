package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengolafasefuncionorden extends GXProcedure
{
   public obtengolafasefuncionorden( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengolafasefuncionorden.class ), "" );
   }

   public obtengolafasefuncionorden( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 ,
                           short aP4 ,
                           String[] aP5 )
   {
      obtengolafasefuncionorden.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      obtengolafasefuncionorden.this.A396EmprCod = aP0;
      obtengolafasefuncionorden.this.A129BarCod = aP1;
      obtengolafasefuncionorden.this.A132BarCodReo = aP2;
      obtengolafasefuncionorden.this.A130BarCodPar = aP3;
      obtengolafasefuncionorden.this.A194BarOrdLin = aP4;
      obtengolafasefuncionorden.this.aP5 = aP5;
      obtengolafasefuncionorden.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Fascod = "" ;
      AV10Barfasest = (byte)(0) ;
      /* Using cursor P0A3W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P0A3W2_A457FasCod[0] ;
         A153BarFasEst = P0A3W2_A153BarFasEst[0] ;
         A758ProCod = P0A3W2_A758ProCod[0] ;
         AV9Fascod = A457FasCod ;
         AV10Barfasest = A153BarFasEst ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = obtengolafasefuncionorden.this.AV9Fascod;
      this.aP6[0] = obtengolafasefuncionorden.this.AV10Barfasest;
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
      scmdbuf = "" ;
      P0A3W2_A396EmprCod = new String[] {""} ;
      P0A3W2_A129BarCod = new int[1] ;
      P0A3W2_A132BarCodReo = new byte[1] ;
      P0A3W2_A130BarCodPar = new String[] {""} ;
      P0A3W2_A194BarOrdLin = new short[1] ;
      P0A3W2_A457FasCod = new String[] {""} ;
      P0A3W2_A153BarFasEst = new byte[1] ;
      P0A3W2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengolafasefuncionorden__default(),
         new Object[] {
             new Object[] {
            P0A3W2_A396EmprCod, P0A3W2_A129BarCod, P0A3W2_A132BarCodReo, P0A3W2_A130BarCodPar, P0A3W2_A194BarOrdLin, P0A3W2_A457FasCod, P0A3W2_A153BarFasEst, P0A3W2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV10Barfasest ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Fascod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private byte[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3W2_A396EmprCod ;
   private int[] P0A3W2_A129BarCod ;
   private byte[] P0A3W2_A132BarCodReo ;
   private String[] P0A3W2_A130BarCodPar ;
   private short[] P0A3W2_A194BarOrdLin ;
   private String[] P0A3W2_A457FasCod ;
   private byte[] P0A3W2_A153BarFasEst ;
   private String[] P0A3W2_A758ProCod ;
}

final  class obtengolafasefuncionorden__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3W2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

