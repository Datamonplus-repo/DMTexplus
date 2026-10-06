package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayrcacabado extends GXProcedure
{
   public phayrcacabado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayrcacabado.class ), "" );
   }

   public phayrcacabado( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      phayrcacabado.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      phayrcacabado.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayrcacabado.this.AV13Barcod = aP1[0];
      this.aP1 = aP1;
      phayrcacabado.this.AV14Barcodreo = aP2[0];
      this.aP2 = aP2;
      phayrcacabado.this.AV15Barcodpar = aP3[0];
      this.aP3 = aP3;
      phayrcacabado.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Recta = (byte)(0) ;
      AV16Barcoda = AV13Barcod ;
      AV17Barcodreoa = AV14Barcodreo ;
      AV18Barcodpara = AV15Barcodpar ;
      /* Using cursor P088C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16Barcoda), Byte.valueOf(AV17Barcodreoa), AV18Barcodpara});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P088C2_A6039RecAcab[0] ;
         n6039RecAcab = P088C2_n6039RecAcab[0] ;
         A130BarCodPar = P088C2_A130BarCodPar[0] ;
         A132BarCodReo = P088C2_A132BarCodReo[0] ;
         A129BarCod = P088C2_A129BarCod[0] ;
         A2805RecVolPrd = P088C2_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P088C2_A2804RecLinMaq[0] ;
         AV10Recta = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayrcacabado.this.A396EmprCod;
      this.aP1[0] = phayrcacabado.this.AV13Barcod;
      this.aP2[0] = phayrcacabado.this.AV14Barcodreo;
      this.aP3[0] = phayrcacabado.this.AV15Barcodpar;
      this.aP4[0] = phayrcacabado.this.AV10Recta;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Barcodpara = "" ;
      scmdbuf = "" ;
      P088C2_A396EmprCod = new String[] {""} ;
      P088C2_A6039RecAcab = new String[] {""} ;
      P088C2_n6039RecAcab = new boolean[] {false} ;
      P088C2_A130BarCodPar = new String[] {""} ;
      P088C2_A132BarCodReo = new byte[1] ;
      P088C2_A129BarCod = new int[1] ;
      P088C2_A2805RecVolPrd = new int[1] ;
      P088C2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayrcacabado__default(),
         new Object[] {
             new Object[] {
            P088C2_A396EmprCod, P088C2_A6039RecAcab, P088C2_n6039RecAcab, P088C2_A130BarCodPar, P088C2_A132BarCodReo, P088C2_A129BarCod, P088C2_A2805RecVolPrd, P088C2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Barcodreo ;
   private byte AV10Recta ;
   private byte AV17Barcodreoa ;
   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13Barcod ;
   private int AV16Barcoda ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private String A396EmprCod ;
   private String AV15Barcodpar ;
   private String AV18Barcodpara ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private boolean n6039RecAcab ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P088C2_A396EmprCod ;
   private String[] P088C2_A6039RecAcab ;
   private boolean[] P088C2_n6039RecAcab ;
   private String[] P088C2_A130BarCodPar ;
   private byte[] P088C2_A132BarCodReo ;
   private int[] P088C2_A129BarCod ;
   private int[] P088C2_A2805RecVolPrd ;
   private short[] P088C2_A2804RecLinMaq ;
}

final  class phayrcacabado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P088C2", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
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

