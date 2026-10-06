package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelibar extends GXProcedure
{
   public pelibar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelibar.class ), "" );
   }

   public pelibar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pelibar.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pelibar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pelibar.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pelibar.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelibar.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pelibar.this.AV19BarAgrCod = aP4[0];
      this.aP4 = aP4;
      pelibar.this.AV20BarAgrReo = aP5[0];
      this.aP5 = aP5;
      pelibar.this.AV21BarAgrPar = aP6[0];
      this.aP6 = aP6;
      pelibar.this.aP7 = aP7;
      pelibar.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pelibar.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV32EmprNom ;
      GXv_char4[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      pelibar.this.AV15EmprCod = GXv_char2[0] ;
      pelibar.this.AV32EmprNom = GXv_char3[0] ;
      pelibar.this.AV29Usurcod = GXv_char4[0] ;
      AV24BarCodOri = AV19BarAgrCod ;
      AV25BarReoOri = AV20BarAgrReo ;
      AV26BarParOri = AV21BarAgrPar ;
      AV27Inc_obs = "" ;
      /* Using cursor P00102 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00102_A130BarCodPar[0] ;
         A132BarCodReo = P00102_A132BarCodReo[0] ;
         A129BarCod = P00102_A129BarCod[0] ;
         A396EmprCod = P00102_A396EmprCod[0] ;
         A122BarAgrPar = P00102_A122BarAgrPar[0] ;
         A124BarAgrReo = P00102_A124BarAgrReo[0] ;
         A119BarAgrCod = P00102_A119BarAgrCod[0] ;
         /* Using cursor P00103 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         AV27Inc_obs = httpContext.getMessage( "1.PELIBAR-ELIMINACION AGRUPACION, HDR= ", "") + GXutil.trim( GXutil.str( AV19BarAgrCod, 8, 0)) + GXutil.trim( GXutil.str( AV20BarAgrReo, 1, 0)) + AV21BarAgrPar + GXutil.newLine( ) ;
         AV27Inc_obs += httpContext.getMessage( "Hdr Agrupada =", "") + GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + A122BarAgrPar + GXutil.newLine( ) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'BARCAD' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV33Inc_obs2 = "" ;
      /* Using cursor P00104 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P00104_A396EmprCod[0] ;
         A119BarAgrCod = P00104_A119BarAgrCod[0] ;
         A124BarAgrReo = P00104_A124BarAgrReo[0] ;
         A122BarAgrPar = P00104_A122BarAgrPar[0] ;
         A129BarCod = P00104_A129BarCod[0] ;
         A132BarCodReo = P00104_A132BarCodReo[0] ;
         A130BarCodPar = P00104_A130BarCodPar[0] ;
         AV24BarCodOri = A129BarCod ;
         AV25BarReoOri = A132BarCodReo ;
         AV26BarParOri = A130BarCodPar ;
         /* Using cursor P00105 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         AV33Inc_obs2 = httpContext.getMessage( "2.PELIBAR-ELIMINACION AGRUPACION, HDR= ", "") + GXutil.trim( GXutil.str( AV19BarAgrCod, 8, 0)) + GXutil.trim( GXutil.str( AV20BarAgrReo, 1, 0)) + AV21BarAgrPar + GXutil.newLine( ) ;
         AV33Inc_obs2 += httpContext.getMessage( "Hdr Agrupada =", "") + GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + A122BarAgrPar + GXutil.newLine( ) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: 'BARCAD' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00106 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV24BarCodOri), Byte.valueOf(AV25BarReoOri), AV26BarParOri});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelibar.this.AV15EmprCod;
      this.aP1[0] = pelibar.this.AV16BarCod;
      this.aP2[0] = pelibar.this.AV17BarCodReo;
      this.aP3[0] = pelibar.this.AV18BarCodPar;
      this.aP4[0] = pelibar.this.AV19BarAgrCod;
      this.aP5[0] = pelibar.this.AV20BarAgrReo;
      this.aP6[0] = pelibar.this.AV21BarAgrPar;
      this.aP7[0] = pelibar.this.AV27Inc_obs;
      this.aP8[0] = pelibar.this.AV33Inc_obs2;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelibar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Inc_obs = "" ;
      AV33Inc_obs2 = "" ;
      AV28Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV32EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV29Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV26BarParOri = "" ;
      scmdbuf = "" ;
      P00102_A130BarCodPar = new String[] {""} ;
      P00102_A132BarCodReo = new byte[1] ;
      P00102_A129BarCod = new int[1] ;
      P00102_A396EmprCod = new String[] {""} ;
      P00102_A122BarAgrPar = new String[] {""} ;
      P00102_A124BarAgrReo = new byte[1] ;
      P00102_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A122BarAgrPar = "" ;
      P00104_A396EmprCod = new String[] {""} ;
      P00104_A119BarAgrCod = new int[1] ;
      P00104_A124BarAgrReo = new byte[1] ;
      P00104_A122BarAgrPar = new String[] {""} ;
      P00104_A129BarCod = new int[1] ;
      P00104_A132BarCodReo = new byte[1] ;
      P00104_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelibar__default(),
         new Object[] {
             new Object[] {
            P00102_A130BarCodPar, P00102_A132BarCodReo, P00102_A129BarCod, P00102_A396EmprCod, P00102_A122BarAgrPar, P00102_A124BarAgrReo, P00102_A119BarAgrCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00104_A396EmprCod, P00104_A119BarAgrCod, P00104_A124BarAgrReo, P00104_A122BarAgrPar, P00104_A129BarCod, P00104_A132BarCodReo, P00104_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV20BarAgrReo ;
   private byte AV25BarReoOri ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV19BarAgrCod ;
   private int AV24BarCodOri ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV21BarAgrPar ;
   private String AV28Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV32EmprNom ;
   private String GXv_char3[] ;
   private String AV29Usurcod ;
   private String GXv_char4[] ;
   private String AV26BarParOri ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private boolean returnInSub ;
   private String AV27Inc_obs ;
   private String AV33Inc_obs2 ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00102_A130BarCodPar ;
   private byte[] P00102_A132BarCodReo ;
   private int[] P00102_A129BarCod ;
   private String[] P00102_A396EmprCod ;
   private String[] P00102_A122BarAgrPar ;
   private byte[] P00102_A124BarAgrReo ;
   private int[] P00102_A119BarAgrCod ;
   private String[] P00104_A396EmprCod ;
   private int[] P00104_A119BarAgrCod ;
   private byte[] P00104_A124BarAgrReo ;
   private String[] P00104_A122BarAgrPar ;
   private int[] P00104_A129BarCod ;
   private byte[] P00104_A132BarCodReo ;
   private String[] P00104_A130BarCodPar ;
}

final  class pelibar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00102", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00103", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P00104", "SELECT EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ? ORDER BY EmprCod, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00105", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P00106", "UPDATE TXPBARCAD SET BarMacCod=0, BarAgrEst='N'  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

