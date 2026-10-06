package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalenda extends GXProcedure
{
   public pcalenda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalenda.class ), "" );
   }

   public pcalenda( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[][] executeUdp( String[] aP0 ,
                                 String[] aP1 ,
                                 byte[] aP2 ,
                                 short[] aP3 ,
                                 String[][] AV15CALENDARI )
   {
      AV16HNPROD = new String[6][7] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         GX_J = 1 ;
         while ( GX_J <= 7 )
         {
            AV16HNPROD[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, aP2, aP3, AV15CALENDARI, AV16HNPROD);
      return AV16HNPROD;
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        short[] aP3 ,
                        String[][] AV15CALENDARI ,
                        String[][] AV16HNPROD )
   {
      execute_int(aP0, aP1, aP2, aP3, AV15CALENDARI, AV16HNPROD);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 ,
                             String[][] AV15CALENDARI ,
                             String[][] AV16HNPROD )
   {
      pcalenda.this.AV26EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalenda.this.AV27MAQUINA = aP1[0];
      this.aP1 = aP1;
      pcalenda.this.AV17MM = aP2[0];
      this.aP2 = aP2;
      pcalenda.this.AV19AA = aP3[0];
      this.aP3 = aP3;
      pcalenda.this.AV15CALENDARI = AV15CALENDARI;
      pcalenda.this.AV16HNPROD = AV16HNPROD;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23I = (byte)(1) ;
      while ( AV23I <= 6 )
      {
         AV24J = (byte)(1) ;
         while ( AV24J <= 7 )
         {
            AV15CALENDARI[AV23I-1][AV24J-1] = "      " ;
            AV16HNPROD[AV23I-1][AV24J-1] = "      " ;
            AV24J = (byte)(AV24J+1) ;
         }
         AV23I = (byte)(AV23I+1) ;
      }
      AV18FCHINI = localUtil.ymdtod( AV19AA, AV17MM, 1) ;
      AV20DDFI = (byte)(GXutil.day( GXutil.eomdate( AV18FCHINI))) ;
      AV21DESPL = (byte)(GXutil.dow( AV18FCHINI)-1) ;
      if ( AV21DESPL == 0 )
      {
         AV21DESPL = (byte)(7) ;
      }
      /* Using cursor P00042 */
      pr_default.execute(0, new Object[] {AV26EmprCod, AV27MAQUINA, Short.valueOf(AV19AA), Byte.valueOf(AV17MM)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A614MaqMes = P00042_A614MaqMes[0] ;
         A599MaqAny = P00042_A599MaqAny[0] ;
         A602MaqCod = P00042_A602MaqCod[0] ;
         A396EmprCod = P00042_A396EmprCod[0] ;
         A610MaqHNPMes = P00042_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P00042_n610MaqHNPMes[0] ;
         AV28MAQHNPMES = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV22CONTDD = (byte)(1) ;
      AV23I = (byte)(1) ;
      AV24J = AV21DESPL ;
      while ( AV22CONTDD <= AV20DDFI )
      {
         AV15CALENDARI[AV23I-1][AV24J-1] = "  " + GXutil.str( AV22CONTDD, 2, 0) + "  " ;
         AV25contaux = (byte)(AV22CONTDD*2) ;
         AV16HNPROD[AV23I-1][AV24J-1] = "  " + GXutil.substring( AV28MAQHNPMES, AV25contaux, 2) + "  " ;
         AV22CONTDD = (byte)(AV22CONTDD+1) ;
         AV24J = (byte)(AV24J+1) ;
         if ( AV24J > 7 )
         {
            AV23I = (byte)(AV23I+1) ;
            AV24J = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalenda.this.AV26EmprCod;
      this.aP1[0] = pcalenda.this.AV27MAQUINA;
      this.aP2[0] = pcalenda.this.AV17MM;
      this.aP3[0] = pcalenda.this.AV19AA;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18FCHINI = GXutil.nullDate() ;
      scmdbuf = "" ;
      P00042_A614MaqMes = new byte[1] ;
      P00042_A599MaqAny = new short[1] ;
      P00042_A602MaqCod = new String[] {""} ;
      P00042_A396EmprCod = new String[] {""} ;
      P00042_A610MaqHNPMes = new String[] {""} ;
      P00042_n610MaqHNPMes = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A610MaqHNPMes = "" ;
      AV28MAQHNPMES = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalenda__default(),
         new Object[] {
             new Object[] {
            P00042_A614MaqMes, P00042_A599MaqAny, P00042_A602MaqCod, P00042_A396EmprCod, P00042_A610MaqHNPMes, P00042_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17MM ;
   private byte AV23I ;
   private byte AV24J ;
   private byte AV20DDFI ;
   private byte AV21DESPL ;
   private byte A614MaqMes ;
   private byte AV22CONTDD ;
   private byte AV25contaux ;
   private short AV19AA ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private String AV26EmprCod ;
   private String AV27MAQUINA ;
   private String AV15CALENDARI[][] ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private java.util.Date AV18FCHINI ;
   private boolean n610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private String AV28MAQHNPMES ;
   private String[][] AV16HNPROD ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00042_A614MaqMes ;
   private short[] P00042_A599MaqAny ;
   private String[] P00042_A602MaqCod ;
   private String[] P00042_A396EmprCod ;
   private String[] P00042_A610MaqHNPMes ;
   private boolean[] P00042_n610MaqHNPMes ;
}

final  class pcalenda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00042", "SELECT MaqMes, MaqAny, MaqCod, EmprCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

