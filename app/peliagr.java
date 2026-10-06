package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliagr extends GXProcedure
{
   public peliagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliagr.class ), "" );
   }

   public peliagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      peliagr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      peliagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliagr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      peliagr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      peliagr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV19FasMin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int2) ;
      peliagr.this.GXt_int1 = GXv_int2[0] ;
      AV19FasMin = GXt_int1 ;
      GXt_int1 = AV20Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      peliagr.this.GXt_int1 = GXv_int2[0] ;
      AV20Torient = GXt_int1 ;
      if ( AV19FasMin == 1 )
      {
         AV15BarCod = A129BarCod ;
         AV16BarCodReo = A132BarCodReo ;
         AV17BarCodPar = A130BarCodPar ;
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV15BarCod, AV16BarCodReo, AV17BarCodPar) ;
         AV18PlaHdrMin = GXutil.str( AV15BarCod, 8, 0) + GXutil.str( AV16BarCodReo, 1, 0) + AV17BarCodPar ;
         /* Optimized DELETE. */
         /* Using cursor P00112 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV18PlaHdrMin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINAGR");
         /* End optimized DELETE. */
      }
      /* Using cursor P00113 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A120BarAgrEst = P00113_A120BarAgrEst[0] ;
         A3595BarMacCod = P00113_A3595BarMacCod[0] ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         if ( AV20Torient == 0 )
         {
            A3595BarMacCod = 0 ;
         }
         /* Using cursor P00114 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A119BarAgrCod = P00114_A119BarAgrCod[0] ;
            A124BarAgrReo = P00114_A124BarAgrReo[0] ;
            A122BarAgrPar = P00114_A122BarAgrPar[0] ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int6[0] = A119BarAgrCod ;
            GXv_int7[0] = A124BarAgrReo ;
            GXv_char8[0] = A122BarAgrPar ;
            GXv_char9[0] = AV21Inc_obs ;
            GXv_char10[0] = AV22Inc_obs2 ;
            new app.pelibar(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_int6, GXv_int7, GXv_char8, GXv_char9, GXv_char10) ;
            peliagr.this.A396EmprCod = GXv_char3[0] ;
            peliagr.this.A129BarCod = GXv_int4[0] ;
            peliagr.this.A132BarCodReo = GXv_int2[0] ;
            peliagr.this.A130BarCodPar = GXv_char5[0] ;
            peliagr.this.A119BarAgrCod = GXv_int6[0] ;
            peliagr.this.A124BarAgrReo = GXv_int7[0] ;
            peliagr.this.A122BarAgrPar = GXv_char8[0] ;
            peliagr.this.AV21Inc_obs = GXv_char9[0] ;
            peliagr.this.AV22Inc_obs2 = GXv_char10[0] ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P00115 */
         pr_default.execute(3, new Object[] {A120BarAgrEst, Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliagr.this.A396EmprCod;
      this.aP1[0] = peliagr.this.A129BarCod;
      this.aP2[0] = peliagr.this.A132BarCodReo;
      this.aP3[0] = peliagr.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliagr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17BarCodPar = "" ;
      AV18PlaHdrMin = "" ;
      scmdbuf = "" ;
      P00113_A396EmprCod = new String[] {""} ;
      P00113_A129BarCod = new int[1] ;
      P00113_A132BarCodReo = new byte[1] ;
      P00113_A130BarCodPar = new String[] {""} ;
      P00113_A120BarAgrEst = new String[] {""} ;
      P00113_A3595BarMacCod = new int[1] ;
      A120BarAgrEst = "" ;
      P00114_A396EmprCod = new String[] {""} ;
      P00114_A129BarCod = new int[1] ;
      P00114_A132BarCodReo = new byte[1] ;
      P00114_A130BarCodPar = new String[] {""} ;
      P00114_A119BarAgrCod = new int[1] ;
      P00114_A124BarAgrReo = new byte[1] ;
      P00114_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      AV21Inc_obs = "" ;
      GXv_char9 = new String[1] ;
      AV22Inc_obs2 = "" ;
      GXv_char10 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliagr__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00113_A396EmprCod, P00113_A129BarCod, P00113_A132BarCodReo, P00113_A130BarCodPar, P00113_A120BarAgrEst, P00113_A3595BarMacCod
            }
            , new Object[] {
            P00114_A396EmprCod, P00114_A129BarCod, P00114_A132BarCodReo, P00114_A130BarCodPar, P00114_A119BarAgrCod, P00114_A124BarAgrReo, P00114_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV19FasMin ;
   private byte AV20Torient ;
   private byte GXt_int1 ;
   private byte AV16BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int2[] ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV15BarCod ;
   private int A3595BarMacCod ;
   private int A119BarAgrCod ;
   private int GXv_int4[] ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV17BarCodPar ;
   private String AV18PlaHdrMin ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String AV21Inc_obs ;
   private String AV22Inc_obs2 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00113_A396EmprCod ;
   private int[] P00113_A129BarCod ;
   private byte[] P00113_A132BarCodReo ;
   private String[] P00113_A130BarCodPar ;
   private String[] P00113_A120BarAgrEst ;
   private int[] P00113_A3595BarMacCod ;
   private String[] P00114_A396EmprCod ;
   private int[] P00114_A129BarCod ;
   private byte[] P00114_A132BarCodReo ;
   private String[] P00114_A130BarCodPar ;
   private int[] P00114_A119BarAgrCod ;
   private byte[] P00114_A124BarAgrReo ;
   private String[] P00114_A122BarAgrPar ;
}

final  class peliagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00112", "DELETE FROM TXPMINAGR  WHERE EmprCod = ? and PlaHdrMin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMINAGR")
         ,new ForEachCursor("P00113", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00114", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00115", "UPDATE TXPBARCAD SET BarAgrEst=?, BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

