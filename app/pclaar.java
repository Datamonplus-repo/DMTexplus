package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaar extends GXProcedure
{
   public pclaar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaar.class ), "" );
   }

   public pclaar( int remoteHandle ,
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
      pclaar.this.aP11 = new byte[] {0};
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
      pclaar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaar.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaar.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaar.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaar.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaar.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaar.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaar.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaar.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaar.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaar.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaar.this.AV113Opi = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
      AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
      /* Using cursor P01PX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV29TipArt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P01PX2_A217BarTipArt[0] ;
         n217BarTipArt = P01PX2_n217BarTipArt[0] ;
         A130BarCodPar = P01PX2_A130BarCodPar[0] ;
         A132BarCodReo = P01PX2_A132BarCodReo[0] ;
         A129BarCod = P01PX2_A129BarCod[0] ;
         AV17PrdVal = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaar.this.A396EmprCod;
      this.aP1[0] = pclaar.this.AV15Descrip;
      this.aP2[0] = pclaar.this.AV16Clave;
      this.aP3[0] = pclaar.this.AV17PrdVal;
      this.aP4[0] = pclaar.this.AV18BarCod;
      this.aP5[0] = pclaar.this.AV19BarCodReo;
      this.aP6[0] = pclaar.this.AV20BarCodPar;
      this.aP7[0] = pclaar.this.AV21TotKil;
      this.aP8[0] = pclaar.this.AV22PrdDesc;
      this.aP9[0] = pclaar.this.AV23Accion;
      this.aP10[0] = pclaar.this.AV67BarLinMaq;
      this.aP11[0] = pclaar.this.AV113Opi;
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
      P01PX2_A396EmprCod = new String[] {""} ;
      P01PX2_A217BarTipArt = new short[1] ;
      P01PX2_n217BarTipArt = new boolean[] {false} ;
      P01PX2_A130BarCodPar = new String[] {""} ;
      P01PX2_A132BarCodReo = new byte[1] ;
      P01PX2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaar__default(),
         new Object[] {
             new Object[] {
            P01PX2_A396EmprCod, P01PX2_A217BarTipArt, P01PX2_n217BarTipArt, P01PX2_A130BarCodPar, P01PX2_A132BarCodReo, P01PX2_A129BarCod
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
   private short AV29TipArt ;
   private short A217BarTipArt ;
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
   private String scmdbuf ;
   private String A130BarCodPar ;
   private boolean n217BarTipArt ;
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
   private String[] P01PX2_A396EmprCod ;
   private short[] P01PX2_A217BarTipArt ;
   private boolean[] P01PX2_n217BarTipArt ;
   private String[] P01PX2_A130BarCodPar ;
   private byte[] P01PX2_A132BarCodReo ;
   private int[] P01PX2_A129BarCod ;
}

final  class pclaar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PX2", "SELECT EmprCod, BarTipArt, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarTipArt = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
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

