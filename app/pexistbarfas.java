package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexistbarfas extends GXProcedure
{
   public pexistbarfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexistbarfas.class ), "" );
   }

   public pexistbarfas( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pexistbarfas.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      pexistbarfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexistbarfas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pexistbarfas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pexistbarfas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pexistbarfas.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pexistbarfas.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pexistbarfas.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P048I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         Gx_msg = httpContext.getMessage( "Esta Linea Ya Existe ¡¡¡", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexistbarfas.this.A396EmprCod;
      this.aP1[0] = pexistbarfas.this.A129BarCod;
      this.aP2[0] = pexistbarfas.this.A132BarCodReo;
      this.aP3[0] = pexistbarfas.this.A130BarCodPar;
      this.aP4[0] = pexistbarfas.this.A758ProCod;
      this.aP5[0] = pexistbarfas.this.A194BarOrdLin;
      this.aP6[0] = pexistbarfas.this.Gx_msg;
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
      P048I2_A396EmprCod = new String[] {""} ;
      P048I2_A129BarCod = new int[1] ;
      P048I2_A132BarCodReo = new byte[1] ;
      P048I2_A130BarCodPar = new String[] {""} ;
      P048I2_A758ProCod = new String[] {""} ;
      P048I2_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexistbarfas__default(),
         new Object[] {
             new Object[] {
            P048I2_A396EmprCod, P048I2_A129BarCod, P048I2_A132BarCodReo, P048I2_A130BarCodPar, P048I2_A758ProCod, P048I2_A194BarOrdLin
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
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P048I2_A396EmprCod ;
   private int[] P048I2_A129BarCod ;
   private byte[] P048I2_A132BarCodReo ;
   private String[] P048I2_A130BarCodPar ;
   private String[] P048I2_A758ProCod ;
   private short[] P048I2_A194BarOrdLin ;
}

final  class pexistbarfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P048I2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

