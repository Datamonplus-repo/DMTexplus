package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdamd21 extends GXProcedure
{
   public ppdamd21( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdamd21.class ), "" );
   }

   public ppdamd21( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      ppdamd21.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      ppdamd21.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdamd21.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppdamd21.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppdamd21.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppdamd21.this.AV11Barpart = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Barpart = (short)(0) ;
      /* Using cursor P044I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1503BarPart = P044I2_A1503BarPart[0] ;
         AV11Barpart = A1503BarPart ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdamd21.this.A396EmprCod;
      this.aP1[0] = ppdamd21.this.A129BarCod;
      this.aP2[0] = ppdamd21.this.A132BarCodReo;
      this.aP3[0] = ppdamd21.this.A130BarCodPar;
      this.aP4[0] = ppdamd21.this.AV11Barpart;
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
      P044I2_A396EmprCod = new String[] {""} ;
      P044I2_A129BarCod = new int[1] ;
      P044I2_A132BarCodReo = new byte[1] ;
      P044I2_A130BarCodPar = new String[] {""} ;
      P044I2_A1503BarPart = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdamd21__default(),
         new Object[] {
             new Object[] {
            P044I2_A396EmprCod, P044I2_A129BarCod, P044I2_A132BarCodReo, P044I2_A130BarCodPar, P044I2_A1503BarPart
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV11Barpart ;
   private short A1503BarPart ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P044I2_A396EmprCod ;
   private int[] P044I2_A129BarCod ;
   private byte[] P044I2_A132BarCodReo ;
   private String[] P044I2_A130BarCodPar ;
   private short[] P044I2_A1503BarPart ;
}

final  class ppdamd21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P044I2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPart FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

