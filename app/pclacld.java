package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclacld extends GXProcedure
{
   public pclacld( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclacld.class ), "" );
   }

   public pclacld( int remoteHandle ,
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
      pclacld.this.aP8 = new byte[] {0};
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
      pclacld.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclacld.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclacld.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclacld.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclacld.this.AV112Discod = aP4[0];
      this.aP4 = aP4;
      pclacld.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclacld.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclacld.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclacld.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV52CliCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 4, 6))) ;
      /* Using cursor P026V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV112Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026V2_A361DisCod[0] ;
         A252CliCod = P026V2_A252CliCod[0] ;
         if ( A252CliCod == AV52CliCod )
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
      this.aP0[0] = pclacld.this.A396EmprCod;
      this.aP1[0] = pclacld.this.AV15Descrip;
      this.aP2[0] = pclacld.this.AV16Clave;
      this.aP3[0] = pclacld.this.AV17PrdVal;
      this.aP4[0] = pclacld.this.AV112Discod;
      this.aP5[0] = pclacld.this.AV21TotKil;
      this.aP6[0] = pclacld.this.AV22PrdDesc;
      this.aP7[0] = pclacld.this.AV23Accion;
      this.aP8[0] = pclacld.this.AV111Opi;
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
      P026V2_A396EmprCod = new String[] {""} ;
      P026V2_A361DisCod = new int[1] ;
      P026V2_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclacld__default(),
         new Object[] {
             new Object[] {
            P026V2_A396EmprCod, P026V2_A361DisCod, P026V2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private short Gx_err ;
   private int AV112Discod ;
   private int AV52CliCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String scmdbuf ;
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
   private String[] P026V2_A396EmprCod ;
   private int[] P026V2_A361DisCod ;
   private int[] P026V2_A252CliCod ;
}

final  class pclacld__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026V2", "SELECT EmprCod, DisCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
      }
   }

}

