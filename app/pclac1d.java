package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac1d extends GXProcedure
{
   public pclac1d( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac1d.class ), "" );
   }

   public pclac1d( int remoteHandle ,
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
      pclac1d.this.aP8 = new byte[] {0};
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
      pclac1d.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac1d.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac1d.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac1d.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac1d.this.AV112Discod = aP4[0];
      this.aP4 = aP4;
      pclac1d.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclac1d.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclac1d.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclac1d.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV101ArtCod_1 = GXutil.substring( AV16Clave, 4, 16) ;
      AV23Accion = GXutil.substring( AV16Clave, 21, 1) ;
      AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV101ArtCod_1))) ;
      /* Using cursor P026J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV112Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026J2_A361DisCod[0] ;
         A335DisArtCod = P026J2_A335DisArtCod[0] ;
         AV79BarSer = GXutil.substring( A335DisArtCod, 1, AV85LenVar) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV101ArtCod_1, AV79BarSer) == 0 )
      {
         AV17PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac1d.this.A396EmprCod;
      this.aP1[0] = pclac1d.this.AV15Descrip;
      this.aP2[0] = pclac1d.this.AV16Clave;
      this.aP3[0] = pclac1d.this.AV17PrdVal;
      this.aP4[0] = pclac1d.this.AV112Discod;
      this.aP5[0] = pclac1d.this.AV21TotKil;
      this.aP6[0] = pclac1d.this.AV22PrdDesc;
      this.aP7[0] = pclac1d.this.AV23Accion;
      this.aP8[0] = pclac1d.this.AV111Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV101ArtCod_1 = "" ;
      scmdbuf = "" ;
      P026J2_A396EmprCod = new String[] {""} ;
      P026J2_A361DisCod = new int[1] ;
      P026J2_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      AV79BarSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac1d__default(),
         new Object[] {
             new Object[] {
            P026J2_A396EmprCod, P026J2_A361DisCod, P026J2_A335DisArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private byte AV85LenVar ;
   private short Gx_err ;
   private int AV112Discod ;
   private int A361DisCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV101ArtCod_1 ;
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
   private String[] P026J2_A396EmprCod ;
   private int[] P026J2_A361DisCod ;
   private String[] P026J2_A335DisArtCod ;
}

final  class pclac1d__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026J2", "SELECT EmprCod, DisCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

