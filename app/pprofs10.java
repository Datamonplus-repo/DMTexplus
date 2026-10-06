package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofs10 extends GXProcedure
{
   public pprofs10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofs10.class ), "" );
   }

   public pprofs10( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 )
   {
      pprofs10.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pprofs10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofs10.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pprofs10.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pprofs10.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pprofs10.this.AV11Procod = aP4[0];
      this.aP4 = aP4;
      pprofs10.this.AV12Barpro = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Barpro = (byte)(0) ;
      /* Using cursor P05682 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar, AV11Procod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P05682_A758ProCod[0] ;
         A130BarCodPar = P05682_A130BarCodPar[0] ;
         A132BarCodReo = P05682_A132BarCodReo[0] ;
         A129BarCod = P05682_A129BarCod[0] ;
         A761ProFasLin = P05682_A761ProFasLin[0] ;
         n761ProFasLin = P05682_n761ProFasLin[0] ;
         AV12Barpro = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofs10.this.A396EmprCod;
      this.aP1[0] = pprofs10.this.AV8Barcod;
      this.aP2[0] = pprofs10.this.AV9Barcodreo;
      this.aP3[0] = pprofs10.this.AV10Barcodpar;
      this.aP4[0] = pprofs10.this.AV11Procod;
      this.aP5[0] = pprofs10.this.AV12Barpro;
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
      P05682_A396EmprCod = new String[] {""} ;
      P05682_A758ProCod = new String[] {""} ;
      P05682_A130BarCodPar = new String[] {""} ;
      P05682_A132BarCodReo = new byte[1] ;
      P05682_A129BarCod = new int[1] ;
      P05682_A761ProFasLin = new short[1] ;
      P05682_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofs10__default(),
         new Object[] {
             new Object[] {
            P05682_A396EmprCod, P05682_A758ProCod, P05682_A130BarCodPar, P05682_A132BarCodReo, P05682_A129BarCod, P05682_A761ProFasLin, P05682_n761ProFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte AV12Barpro ;
   private byte A132BarCodReo ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV11Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private boolean n761ProFasLin ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05682_A396EmprCod ;
   private String[] P05682_A758ProCod ;
   private String[] P05682_A130BarCodPar ;
   private byte[] P05682_A132BarCodReo ;
   private int[] P05682_A129BarCod ;
   private short[] P05682_A761ProFasLin ;
   private boolean[] P05682_n761ProFasLin ;
}

final  class pprofs10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05682", "SELECT EmprCod, ProCod, BarCodPar, BarCodReo, BarCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               return;
      }
   }

}

