package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclatpd extends GXProcedure
{
   public pclatpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclatpd.class ), "" );
   }

   public pclatpd( int remoteHandle ,
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
      pclatpd.this.aP8 = new byte[] {0};
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
      pclatpd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclatpd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclatpd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclatpd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclatpd.this.AV113Discod = aP4[0];
      this.aP4 = aP4;
      pclatpd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclatpd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclatpd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclatpd.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
      AV78ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
      /* Using cursor P027C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV113Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P027C2_A361DisCod[0] ;
         A4295ClasCod = P027C2_A4295ClasCod[0] ;
         n4295ClasCod = P027C2_n4295ClasCod[0] ;
         A44AlbRecCod = P027C2_A44AlbRecCod[0] ;
         A4295ClasCod = P027C2_A4295ClasCod[0] ;
         n4295ClasCod = P027C2_n4295ClasCod[0] ;
         if ( A4295ClasCod == AV78ClasCod )
         {
            AV17PrdVal = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclatpd.this.A396EmprCod;
      this.aP1[0] = pclatpd.this.AV15Descrip;
      this.aP2[0] = pclatpd.this.AV16Clave;
      this.aP3[0] = pclatpd.this.AV17PrdVal;
      this.aP4[0] = pclatpd.this.AV113Discod;
      this.aP5[0] = pclatpd.this.AV21TotKil;
      this.aP6[0] = pclatpd.this.AV22PrdDesc;
      this.aP7[0] = pclatpd.this.AV23Accion;
      this.aP8[0] = pclatpd.this.AV111Opi;
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
      P027C2_A396EmprCod = new String[] {""} ;
      P027C2_A361DisCod = new int[1] ;
      P027C2_A4295ClasCod = new short[1] ;
      P027C2_n4295ClasCod = new boolean[] {false} ;
      P027C2_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclatpd__default(),
         new Object[] {
             new Object[] {
            P027C2_A396EmprCod, P027C2_A361DisCod, P027C2_A4295ClasCod, P027C2_n4295ClasCod, P027C2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private short AV78ClasCod ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int AV113Discod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String scmdbuf ;
   private boolean n4295ClasCod ;
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
   private String[] P027C2_A396EmprCod ;
   private int[] P027C2_A361DisCod ;
   private short[] P027C2_A4295ClasCod ;
   private boolean[] P027C2_n4295ClasCod ;
   private int[] P027C2_A44AlbRecCod ;
}

final  class pclatpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027C2", "SELECT T1.EmprCod, T1.DisCod, T2.ClasCod, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
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

