package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partcap extends GXProcedure
{
   public partcap( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partcap.class ), "" );
   }

   public partcap( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 )
   {
      partcap.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 )
   {
      partcap.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partcap.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partcap.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      partcap.this.AV8Capacidad = aP3[0];
      this.aP3 = aP3;
      partcap.this.AV9FlagCap = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9FlagCap = (byte)(0) ;
      /* Using cursor P00P32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, AV8Capacidad});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3319ArtCapKgs = P00P32_A3319ArtCapKgs[0] ;
         AV9FlagCap = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partcap.this.A396EmprCod;
      this.aP1[0] = partcap.this.A252CliCod;
      this.aP2[0] = partcap.this.A65ArtCod;
      this.aP3[0] = partcap.this.AV8Capacidad;
      this.aP4[0] = partcap.this.AV9FlagCap;
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
      P00P32_A396EmprCod = new String[] {""} ;
      P00P32_A252CliCod = new int[1] ;
      P00P32_A65ArtCod = new String[] {""} ;
      P00P32_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3319ArtCapKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partcap__default(),
         new Object[] {
             new Object[] {
            P00P32_A396EmprCod, P00P32_A252CliCod, P00P32_A65ArtCod, P00P32_A3319ArtCapKgs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9FlagCap ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8Capacidad ;
   private java.math.BigDecimal A3319ArtCapKgs ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00P32_A396EmprCod ;
   private int[] P00P32_A252CliCod ;
   private String[] P00P32_A65ArtCod ;
   private java.math.BigDecimal[] P00P32_A3319ArtCapKgs ;
}

final  class partcap__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00P32", "SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtCapKgs = ? ORDER BY EmprCod, CliCod, ArtCod, ArtCapKgs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
      }
   }

}

