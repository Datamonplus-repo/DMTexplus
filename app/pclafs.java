package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclafs extends GXProcedure
{
   public pclafs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclafs.class ), "" );
   }

   public pclafs( int remoteHandle ,
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
      pclafs.this.aP11 = new byte[] {0};
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
      pclafs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclafs.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclafs.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclafs.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclafs.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclafs.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclafs.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclafs.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclafs.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclafs.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclafs.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclafs.this.AV111Opi = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
      AV112FasCod = GXutil.substring( AV16Clave, 4, 8) ;
      /* Using cursor P025W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV112FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P025W2_A457FasCod[0] ;
         A130BarCodPar = P025W2_A130BarCodPar[0] ;
         A132BarCodReo = P025W2_A132BarCodReo[0] ;
         A129BarCod = P025W2_A129BarCod[0] ;
         A194BarOrdLin = P025W2_A194BarOrdLin[0] ;
         A758ProCod = P025W2_A758ProCod[0] ;
         AV17PrdVal = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclafs.this.A396EmprCod;
      this.aP1[0] = pclafs.this.AV15Descrip;
      this.aP2[0] = pclafs.this.AV16Clave;
      this.aP3[0] = pclafs.this.AV17PrdVal;
      this.aP4[0] = pclafs.this.AV18BarCod;
      this.aP5[0] = pclafs.this.AV19BarCodReo;
      this.aP6[0] = pclafs.this.AV20BarCodPar;
      this.aP7[0] = pclafs.this.AV21TotKil;
      this.aP8[0] = pclafs.this.AV22PrdDesc;
      this.aP9[0] = pclafs.this.AV23Accion;
      this.aP10[0] = pclafs.this.AV67BarLinMaq;
      this.aP11[0] = pclafs.this.AV111Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV112FasCod = "" ;
      scmdbuf = "" ;
      P025W2_A396EmprCod = new String[] {""} ;
      P025W2_A457FasCod = new String[] {""} ;
      P025W2_A130BarCodPar = new String[] {""} ;
      P025W2_A132BarCodReo = new byte[1] ;
      P025W2_A129BarCod = new int[1] ;
      P025W2_A194BarOrdLin = new short[1] ;
      P025W2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclafs__default(),
         new Object[] {
             new Object[] {
            P025W2_A396EmprCod, P025W2_A457FasCod, P025W2_A130BarCodPar, P025W2_A132BarCodReo, P025W2_A129BarCod, P025W2_A194BarOrdLin, P025W2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111Opi ;
   private byte A132BarCodReo ;
   private short AV67BarLinMaq ;
   private short A194BarOrdLin ;
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
   private String AV112FasCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
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
   private String[] P025W2_A396EmprCod ;
   private String[] P025W2_A457FasCod ;
   private String[] P025W2_A130BarCodPar ;
   private byte[] P025W2_A132BarCodReo ;
   private int[] P025W2_A129BarCod ;
   private short[] P025W2_A194BarOrdLin ;
   private String[] P025W2_A758ProCod ;
}

final  class pclafs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P025W2", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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

