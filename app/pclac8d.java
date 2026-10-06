package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac8d extends GXProcedure
{
   public pclac8d( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac8d.class ), "" );
   }

   public pclac8d( int remoteHandle ,
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
      pclac8d.this.aP8 = new byte[] {0};
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
      pclac8d.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac8d.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac8d.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac8d.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac8d.this.AV113Discod = aP4[0];
      this.aP4 = aP4;
      pclac8d.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclac8d.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclac8d.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclac8d.this.AV112Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
      AV100ProCod = GXutil.substring( AV16Clave, 4, 8) ;
      AV17PrdVal = (byte)(0) ;
      /* Using cursor P026Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), AV100ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P026Q2_A758ProCod[0] ;
         A361DisCod = P026Q2_A361DisCod[0] ;
         A368DisFasLin = P026Q2_A368DisFasLin[0] ;
         AV17PrdVal = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac8d.this.A396EmprCod;
      this.aP1[0] = pclac8d.this.AV15Descrip;
      this.aP2[0] = pclac8d.this.AV16Clave;
      this.aP3[0] = pclac8d.this.AV17PrdVal;
      this.aP4[0] = pclac8d.this.AV113Discod;
      this.aP5[0] = pclac8d.this.AV21TotKil;
      this.aP6[0] = pclac8d.this.AV22PrdDesc;
      this.aP7[0] = pclac8d.this.AV23Accion;
      this.aP8[0] = pclac8d.this.AV112Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV100ProCod = "" ;
      scmdbuf = "" ;
      P026Q2_A396EmprCod = new String[] {""} ;
      P026Q2_A758ProCod = new String[] {""} ;
      P026Q2_A361DisCod = new int[1] ;
      P026Q2_A368DisFasLin = new short[1] ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac8d__default(),
         new Object[] {
             new Object[] {
            P026Q2_A396EmprCod, P026Q2_A758ProCod, P026Q2_A361DisCod, P026Q2_A368DisFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV112Opi ;
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
   private String AV100ProCod ;
   private String scmdbuf ;
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
   private String[] P026Q2_A396EmprCod ;
   private String[] P026Q2_A758ProCod ;
   private int[] P026Q2_A361DisCod ;
   private short[] P026Q2_A368DisFasLin ;
}

final  class pclac8d__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026Q2", "SELECT EmprCod, ProCod, DisCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

