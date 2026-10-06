package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayosmc extends GXProcedure
{
   public phayosmc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayosmc.class ), "" );
   }

   public phayosmc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 )
   {
      phayosmc.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      phayosmc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayosmc.this.AV15Clicod = aP1[0];
      this.aP1 = aP1;
      phayosmc.this.AV16Barser = aP2[0];
      this.aP2 = aP2;
      phayosmc.this.AV17Barcolnom = aP3[0];
      this.aP3 = aP3;
      phayosmc.this.AV18Barcolnum = aP4[0];
      this.aP4 = aP4;
      phayosmc.this.AV19Bartipcol = aP5[0];
      this.aP5 = aP5;
      phayosmc.this.AV20Num_hdr = aP6[0];
      this.aP6 = aP6;
      phayosmc.this.Gx_msg = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Num_hdr = (short)(0) ;
      Gx_msg = " " ;
      /* Optimized group. */
      /* Using cursor P03OM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV16Barser, AV17Barcolnom, Integer.valueOf(AV18Barcolnum), Byte.valueOf(AV19Bartipcol)});
      cV20Num_hdr = P03OM2_AV20Num_hdr[0] ;
      pr_default.close(0);
      AV20Num_hdr = (short)(AV20Num_hdr+cV20Num_hdr*1) ;
      /* End optimized group. */
      if ( AV20Num_hdr > 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion hay ", "") + GXutil.str( AV20Num_hdr, 3, 0) + httpContext.getMessage( " OS en Produccion", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayosmc.this.A396EmprCod;
      this.aP1[0] = phayosmc.this.AV15Clicod;
      this.aP2[0] = phayosmc.this.AV16Barser;
      this.aP3[0] = phayosmc.this.AV17Barcolnom;
      this.aP4[0] = phayosmc.this.AV18Barcolnum;
      this.aP5[0] = phayosmc.this.AV19Bartipcol;
      this.aP6[0] = phayosmc.this.AV20Num_hdr;
      this.aP7[0] = phayosmc.this.Gx_msg;
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
      P03OM2_AV20Num_hdr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayosmc__default(),
         new Object[] {
             new Object[] {
            P03OM2_AV20Num_hdr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Bartipcol ;
   private short AV20Num_hdr ;
   private short cV20Num_hdr ;
   private short Gx_err ;
   private int AV15Clicod ;
   private int AV18Barcolnum ;
   private String A396EmprCod ;
   private String AV16Barser ;
   private String AV17Barcolnom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P03OM2_AV20Num_hdr ;
}

final  class phayosmc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03OM2", "SELECT COUNT(*) FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarSer = ? and BarColNom = ? and BarColNum = ? and BarTipCol = ?) AND (BarSit <= 4) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

