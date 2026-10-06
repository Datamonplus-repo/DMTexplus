package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusbar extends GXProcedure
{
   public pbusbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusbar.class ), "" );
   }

   public pbusbar( int remoteHandle ,
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
      pbusbar.this.aP4 = new byte[] {0};
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
      pbusbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusbar.this.A171BarLanCod = aP1[0];
      this.aP1 = aP1;
      pbusbar.this.A175BarLanReo = aP2[0];
      this.aP2 = aP2;
      pbusbar.this.A174BarLanPar = aP3[0];
      this.aP3 = aP3;
      pbusbar.this.AV15FlagBar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagBar = (byte)(0) ;
      /* Using cursor P00632 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n171BarLanCod), Integer.valueOf(A171BarLanCod), Boolean.valueOf(n175BarLanReo), Byte.valueOf(A175BarLanReo), Boolean.valueOf(n174BarLanPar), A174BarLanPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1438BarTerCod = P00632_A1438BarTerCod[0] ;
         A172BarLanLin = P00632_A172BarLanLin[0] ;
         AV15FlagBar = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusbar.this.A396EmprCod;
      this.aP1[0] = pbusbar.this.A171BarLanCod;
      this.aP2[0] = pbusbar.this.A175BarLanReo;
      this.aP3[0] = pbusbar.this.A174BarLanPar;
      this.aP4[0] = pbusbar.this.AV15FlagBar;
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
      P00632_A396EmprCod = new String[] {""} ;
      P00632_A171BarLanCod = new int[1] ;
      P00632_n171BarLanCod = new boolean[] {false} ;
      P00632_A175BarLanReo = new byte[1] ;
      P00632_n175BarLanReo = new boolean[] {false} ;
      P00632_A174BarLanPar = new String[] {""} ;
      P00632_n174BarLanPar = new boolean[] {false} ;
      P00632_A1438BarTerCod = new String[] {""} ;
      P00632_A172BarLanLin = new short[1] ;
      A1438BarTerCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusbar__default(),
         new Object[] {
             new Object[] {
            P00632_A396EmprCod, P00632_A171BarLanCod, P00632_n171BarLanCod, P00632_A175BarLanReo, P00632_n175BarLanReo, P00632_A174BarLanPar, P00632_n174BarLanPar, P00632_A1438BarTerCod, P00632_A172BarLanLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A175BarLanReo ;
   private byte AV15FlagBar ;
   private short A172BarLanLin ;
   private short Gx_err ;
   private int A171BarLanCod ;
   private String A396EmprCod ;
   private String A174BarLanPar ;
   private String scmdbuf ;
   private String A1438BarTerCod ;
   private boolean n171BarLanCod ;
   private boolean n175BarLanReo ;
   private boolean n174BarLanPar ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00632_A396EmprCod ;
   private int[] P00632_A171BarLanCod ;
   private boolean[] P00632_n171BarLanCod ;
   private byte[] P00632_A175BarLanReo ;
   private boolean[] P00632_n175BarLanReo ;
   private String[] P00632_A174BarLanPar ;
   private boolean[] P00632_n174BarLanPar ;
   private String[] P00632_A1438BarTerCod ;
   private short[] P00632_A172BarLanLin ;
}

final  class pbusbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00632", "SELECT EmprCod, BarLanCod, BarLanReo, BarLanPar, BarTerCod, BarLanLin FROM TXPBARLAN WHERE (EmprCod = ?) AND (BarLanCod = ?) AND (BarLanReo = ?) AND (BarLanPar = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
      }
   }

}

