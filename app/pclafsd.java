package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclafsd extends GXProcedure
{
   public pclafsd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclafsd.class ), "" );
   }

   public pclafsd( int remoteHandle ,
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
                           java.math.BigDecimal[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 )
   {
      pclafsd.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclafsd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclafsd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclafsd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclafsd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclafsd.this.AV113Discod = aP4[0];
      this.aP4 = aP4;
      pclafsd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclafsd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclafsd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclafsd.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
      AV112FasCod = GXutil.substring( AV16Clave, 4, 8) ;
      /* Using cursor P026X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV113Discod), AV112FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P026X2_A457FasCod[0] ;
         A361DisCod = P026X2_A361DisCod[0] ;
         A368DisFasLin = P026X2_A368DisFasLin[0] ;
         A758ProCod = P026X2_A758ProCod[0] ;
         AV17PrdVal = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclafsd.this.A396EmprCod;
      this.aP1[0] = pclafsd.this.AV15Descrip;
      this.aP2[0] = pclafsd.this.AV16Clave;
      this.aP3[0] = pclafsd.this.AV17PrdVal;
      this.aP4[0] = pclafsd.this.AV113Discod;
      this.aP5[0] = pclafsd.this.AV21TotKil;
      this.aP6[0] = pclafsd.this.AV22PrdDesc;
      this.aP7[0] = pclafsd.this.AV23Accion;
      this.aP8[0] = pclafsd.this.AV111Opi;
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
      P026X2_A396EmprCod = new String[] {""} ;
      P026X2_A457FasCod = new String[] {""} ;
      P026X2_A361DisCod = new int[1] ;
      P026X2_A368DisFasLin = new short[1] ;
      P026X2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclafsd__default(),
         new Object[] {
             new Object[] {
            P026X2_A396EmprCod, P026X2_A457FasCod, P026X2_A361DisCod, P026X2_A368DisFasLin, P026X2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV113Discod ;
   private int A361DisCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV112FasCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P026X2_A396EmprCod ;
   private String[] P026X2_A457FasCod ;
   private int[] P026X2_A361DisCod ;
   private short[] P026X2_A368DisFasLin ;
   private String[] P026X2_A758ProCod ;
}

final  class pclafsd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026X2", "SELECT EmprCod, FasCod, DisCod, DisFasLin, ProCod FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ?) AND (FasCod = ?) ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

