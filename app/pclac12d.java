package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac12d extends GXProcedure
{
   public pclac12d( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac12d.class ), "" );
   }

   public pclac12d( int remoteHandle ,
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
      pclac12d.this.aP8 = new byte[] {0};
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
      pclac12d.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac12d.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac12d.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac12d.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac12d.this.AV116Discod = aP4[0];
      this.aP4 = aP4;
      pclac12d.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclac12d.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclac12d.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclac12d.this.AV114Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 29, 1) ;
      AV52CliCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 5, 6))) ;
      AV115ArtCod = GXutil.substring( AV16Clave, 12, 16) ;
      AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV115ArtCod))) ;
      /* Using cursor P026U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV116Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026U2_A361DisCod[0] ;
         A252CliCod = P026U2_A252CliCod[0] ;
         A335DisArtCod = P026U2_A335DisArtCod[0] ;
         AV113CliCod_i = A252CliCod ;
         AV79BarSer = GXutil.substring( A335DisArtCod, 1, AV85LenVar) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV52CliCod == AV113CliCod_i ) && ( GXutil.strcmp(AV115ArtCod, AV79BarSer) == 0 ) )
      {
         AV17PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac12d.this.A396EmprCod;
      this.aP1[0] = pclac12d.this.AV15Descrip;
      this.aP2[0] = pclac12d.this.AV16Clave;
      this.aP3[0] = pclac12d.this.AV17PrdVal;
      this.aP4[0] = pclac12d.this.AV116Discod;
      this.aP5[0] = pclac12d.this.AV21TotKil;
      this.aP6[0] = pclac12d.this.AV22PrdDesc;
      this.aP7[0] = pclac12d.this.AV23Accion;
      this.aP8[0] = pclac12d.this.AV114Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV115ArtCod = "" ;
      scmdbuf = "" ;
      P026U2_A396EmprCod = new String[] {""} ;
      P026U2_A361DisCod = new int[1] ;
      P026U2_A252CliCod = new int[1] ;
      P026U2_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      AV79BarSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac12d__default(),
         new Object[] {
             new Object[] {
            P026U2_A396EmprCod, P026U2_A361DisCod, P026U2_A252CliCod, P026U2_A335DisArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV114Opi ;
   private byte AV85LenVar ;
   private short Gx_err ;
   private int AV116Discod ;
   private int AV52CliCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV113CliCod_i ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV115ArtCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String AV79BarSer ;
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
   private String[] P026U2_A396EmprCod ;
   private int[] P026U2_A361DisCod ;
   private int[] P026U2_A252CliCod ;
   private String[] P026U2_A335DisArtCod ;
}

final  class pclac12d__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026U2", "SELECT EmprCod, DisCod, CliCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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

