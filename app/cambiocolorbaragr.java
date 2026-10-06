package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiocolorbaragr extends GXProcedure
{
   public cambiocolorbaragr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiocolorbaragr.class ), "" );
   }

   public cambiocolorbaragr( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        int aP8 ,
                        String aP9 ,
                        String aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             int aP8 ,
                             String aP9 ,
                             String aP10 )
   {
      cambiocolorbaragr.this.AV14emprcod = aP0;
      cambiocolorbaragr.this.AV8barcod = aP1;
      cambiocolorbaragr.this.AV10barcodreo = aP2;
      cambiocolorbaragr.this.AV9barcodpar = aP3;
      cambiocolorbaragr.this.AV11Barcolnom = aP4;
      cambiocolorbaragr.this.AV12Barcolnum = aP5;
      cambiocolorbaragr.this.AV13Bartipcol = aP6;
      cambiocolorbaragr.this.AV20Barnomcli = aP7;
      cambiocolorbaragr.this.AV19Barnumcli = aP8;
      cambiocolorbaragr.this.AV16usurcod = aP9;
      cambiocolorbaragr.this.AV15station = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Col_inc_obs.clear();
      /* Using cursor P0AL62 */
      pr_default.execute(0, new Object[] {AV14emprcod, Integer.valueOf(AV8barcod), Byte.valueOf(AV10barcodreo), AV9barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AL62_A396EmprCod[0] ;
         A119BarAgrCod = P0AL62_A119BarAgrCod[0] ;
         A124BarAgrReo = P0AL62_A124BarAgrReo[0] ;
         A122BarAgrPar = P0AL62_A122BarAgrPar[0] ;
         A130BarCodPar = P0AL62_A130BarCodPar[0] ;
         A132BarCodReo = P0AL62_A132BarCodReo[0] ;
         A129BarCod = P0AL62_A129BarCod[0] ;
         A1512ColNumAgr = P0AL62_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P0AL62_A1510ColNomAgr[0] ;
         A1511ColNuCAgr = P0AL62_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P0AL62_A1509ColNoCAgr[0] ;
         AV18Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV18Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Hdr agrupada con ", "")+GXutil.trim( GXutil.str( A129BarCod, 8, 0))+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
         AV18Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV18Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cambio color ", "")+GXutil.trim( A1510ColNomAgr)+httpContext.getMessage( " Numero ", "")+GXutil.trim( GXutil.str( A1512ColNumAgr, 6, 0)) );
         AV18Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV18Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "/Color Cli. ", "")+GXutil.trim( A1509ColNoCAgr)+httpContext.getMessage( " Numero ", "")+GXutil.trim( GXutil.str( A1511ColNuCAgr, 6, 0)) );
         AV18Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV18Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "/Nuevo Color ", "")+GXutil.trim( AV11Barcolnom)+httpContext.getMessage( " Numero ", "")+GXutil.trim( GXutil.str( AV12Barcolnum, 6, 0)) );
         AV18Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV18Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "/Color Cli. ", "")+GXutil.trim( AV20Barnomcli)+httpContext.getMessage( " Numero ", "")+GXutil.trim( GXutil.str( AV19Barnumcli, 6, 0)) );
         AV17Col_inc_obs.add(AV18Item_Col_Inc_Obs, 0);
         AV22json_inc_obs = AV17Col_inc_obs.toJSonString(false) ;
         A1510ColNomAgr = AV11Barcolnom ;
         A1512ColNumAgr = AV12Barcolnum ;
         A1509ColNoCAgr = AV20Barnomcli ;
         A1511ColNuCAgr = AV19Barnumcli ;
         System.out.println( httpContext.getMessage( "json=", "")+AV22json_inc_obs );
         /* Using cursor P0AL63 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A1512ColNumAgr), A1510ColNomAgr, Integer.valueOf(A1511ColNuCAgr), A1509ColNoCAgr, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV17Col_inc_obs.size() > 0 )
      {
         AV26GXV1 = 1 ;
         while ( AV26GXV1 <= AV17Col_inc_obs.size() )
         {
            AV18Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)((app.SdtIncidenciasObservaciones_SDT)AV17Col_inc_obs.elementAt(-1+AV26GXV1));
            AV21inc_obs = AV18Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs() ;
            new app.pctrinc(remoteHandle, context).execute( AV14emprcod, AV27Pgmname, AV16usurcod, AV15station, AV21inc_obs, AV8barcod, AV10barcodreo, AV9barcodpar) ;
            AV26GXV1 = (int)(AV26GXV1+1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "cambiocolorbaragr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Col_inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0AL62_A396EmprCod = new String[] {""} ;
      P0AL62_A119BarAgrCod = new int[1] ;
      P0AL62_A124BarAgrReo = new byte[1] ;
      P0AL62_A122BarAgrPar = new String[] {""} ;
      P0AL62_A130BarCodPar = new String[] {""} ;
      P0AL62_A132BarCodReo = new byte[1] ;
      P0AL62_A129BarCod = new int[1] ;
      P0AL62_A1512ColNumAgr = new int[1] ;
      P0AL62_A1510ColNomAgr = new String[] {""} ;
      P0AL62_A1511ColNuCAgr = new int[1] ;
      P0AL62_A1509ColNoCAgr = new String[] {""} ;
      A396EmprCod = "" ;
      A122BarAgrPar = "" ;
      A130BarCodPar = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      AV18Item_Col_Inc_Obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV22json_inc_obs = "" ;
      AV21inc_obs = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cambiocolorbaragr__default(),
         new Object[] {
             new Object[] {
            P0AL62_A396EmprCod, P0AL62_A119BarAgrCod, P0AL62_A124BarAgrReo, P0AL62_A122BarAgrPar, P0AL62_A130BarCodPar, P0AL62_A132BarCodReo, P0AL62_A129BarCod, P0AL62_A1512ColNumAgr, P0AL62_A1510ColNomAgr, P0AL62_A1511ColNuCAgr,
            P0AL62_A1509ColNoCAgr
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "CambioColorBARAGR" ;
      /* GeneXus formulas. */
      AV27Pgmname = "CambioColorBARAGR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte AV13Bartipcol ;
   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV8barcod ;
   private int AV12Barcolnum ;
   private int AV19Barnumcli ;
   private int A119BarAgrCod ;
   private int A129BarCod ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int AV26GXV1 ;
   private String AV14emprcod ;
   private String AV9barcodpar ;
   private String AV11Barcolnom ;
   private String AV20Barnomcli ;
   private String AV16usurcod ;
   private String AV15station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String A130BarCodPar ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String AV27Pgmname ;
   private String AV22json_inc_obs ;
   private String AV21inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P0AL62_A396EmprCod ;
   private int[] P0AL62_A119BarAgrCod ;
   private byte[] P0AL62_A124BarAgrReo ;
   private String[] P0AL62_A122BarAgrPar ;
   private String[] P0AL62_A130BarCodPar ;
   private byte[] P0AL62_A132BarCodReo ;
   private int[] P0AL62_A129BarCod ;
   private int[] P0AL62_A1512ColNumAgr ;
   private String[] P0AL62_A1510ColNomAgr ;
   private int[] P0AL62_A1511ColNuCAgr ;
   private String[] P0AL62_A1509ColNoCAgr ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV17Col_inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV18Item_Col_Inc_Obs ;
}

final  class cambiocolorbaragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AL62", "SELECT EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, BarCodPar, BarCodReo, BarCod, ColNumAgr, ColNomAgr, ColNuCAgr, ColNoCAgr FROM TXPBARAGR WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ? ORDER BY EmprCod, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AL63", "UPDATE TXPBARAGR SET ColNumAgr=?, ColNomAgr=?, ColNuCAgr=?, ColNoCAgr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               return;
      }
   }

}

