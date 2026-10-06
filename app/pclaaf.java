package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaaf extends GXProcedure
{
   public pclaaf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaaf.class ), "" );
   }

   public pclaaf( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           String[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           short[] aP10 )
   {
      pclaaf.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 )
   {
      pclaaf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaaf.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaaf.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaaf.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaaf.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaaf.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaaf.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaaf.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaaf.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaaf.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaaf.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaaf.this.AV113Opi = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Fibra = GXutil.substring( AV16Clave, 4, 3) ;
      AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
      /* Using cursor P01PV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01PV2_A130BarCodPar[0] ;
         A132BarCodReo = P01PV2_A132BarCodReo[0] ;
         A129BarCod = P01PV2_A129BarCod[0] ;
         A223BarTra3 = P01PV2_A223BarTra3[0] ;
         A222BarTra2 = P01PV2_A222BarTra2[0] ;
         A221BarTra1 = P01PV2_A221BarTra1[0] ;
         if ( ( GXutil.strcmp(A221BarTra1, AV25Fibra) == 0 ) || ( GXutil.strcmp(A222BarTra2, AV25Fibra) == 0 ) || ( GXutil.strcmp(A223BarTra3, AV25Fibra) == 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaaf.this.A396EmprCod;
      this.aP1[0] = pclaaf.this.AV15Descrip;
      this.aP2[0] = pclaaf.this.AV16Clave;
      this.aP3[0] = pclaaf.this.AV17PrdVal;
      this.aP4[0] = pclaaf.this.AV18BarCod;
      this.aP5[0] = pclaaf.this.AV19BarCodReo;
      this.aP6[0] = pclaaf.this.AV20BarCodPar;
      this.aP7[0] = pclaaf.this.AV21TotKil;
      this.aP8[0] = pclaaf.this.AV22PrdDesc;
      this.aP9[0] = pclaaf.this.AV23Accion;
      this.aP10[0] = pclaaf.this.AV67BarLinMaq;
      this.aP11[0] = pclaaf.this.AV113Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Fibra = "" ;
      scmdbuf = "" ;
      P01PV2_A396EmprCod = new String[] {""} ;
      P01PV2_A130BarCodPar = new String[] {""} ;
      P01PV2_A132BarCodReo = new byte[1] ;
      P01PV2_A129BarCod = new int[1] ;
      P01PV2_A223BarTra3 = new String[] {""} ;
      P01PV2_A222BarTra2 = new String[] {""} ;
      P01PV2_A221BarTra1 = new String[] {""} ;
      A130BarCodPar = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaaf__default(),
         new Object[] {
             new Object[] {
            P01PV2_A396EmprCod, P01PV2_A130BarCodPar, P01PV2_A132BarCodReo, P01PV2_A129BarCod, P01PV2_A223BarTra3, P01PV2_A222BarTra2, P01PV2_A221BarTra1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV113Opi ;
   private byte A132BarCodReo ;
   private short AV67BarLinMaq ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV25Fibra ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private byte[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PV2_A396EmprCod ;
   private String[] P01PV2_A130BarCodPar ;
   private byte[] P01PV2_A132BarCodReo ;
   private int[] P01PV2_A129BarCod ;
   private String[] P01PV2_A223BarTra3 ;
   private String[] P01PV2_A222BarTra2 ;
   private String[] P01PV2_A221BarTra1 ;
}

final  class pclaaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PV2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTra3, BarTra2, BarTra1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
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

