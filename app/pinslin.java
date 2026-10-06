package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinslin extends GXProcedure
{
   public pinslin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinslin.class ), "" );
   }

   public pinslin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pinslin.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pinslin.this.AV43EmprCod = aP0[0];
      this.aP0 = aP0;
      pinslin.this.AV44BarCod = aP1[0];
      this.aP1 = aP1;
      pinslin.this.AV45BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinslin.this.AV46BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinslin.this.AV47RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pinslin.this.AV23ProForL = aP5[0];
      this.aP5 = aP5;
      pinslin.this.AV25ProForCod = aP6[0];
      this.aP6 = aP6;
      pinslin.this.AV24ultlinpro = aP7[0];
      this.aP7 = aP7;
      pinslin.this.AV31F_insert = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27RecNroPrg = 0 ;
      AV26RecTiempo = (short)(0) ;
      AV28RecVolPrf = 0 ;
      AV48Col_inc_obs.clear();
      /* Using cursor P02982 */
      pr_default.execute(0, new Object[] {AV43EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, Short.valueOf(AV47RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02982_A2804RecLinMaq[0] ;
         A130BarCodPar = P02982_A130BarCodPar[0] ;
         A132BarCodReo = P02982_A132BarCodReo[0] ;
         A129BarCod = P02982_A129BarCod[0] ;
         A396EmprCod = P02982_A396EmprCod[0] ;
         A2805RecVolPrd = P02982_A2805RecVolPrd[0] ;
         AV42RecVolprd = A2805RecVolPrd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPCRECET

      */
      A396EmprCod = AV43EmprCod ;
      A129BarCod = AV44BarCod ;
      A132BarCodReo = AV45BarCodReo ;
      A130BarCodPar = AV46BarCodPar ;
      A2804RecLinMaq = AV47RecLinMaq ;
      A1273RecLinPro = AV23ProForL ;
      A764ProForCod = AV25ProForCod ;
      A4695RecVolPrf = AV42RecVolprd ;
      A4696RecTiempo = (short)(0) ;
      n4696RecTiempo = false ;
      A4697RecNroPrg = 0 ;
      AV31F_insert = httpContext.getMessage( "S", "") ;
      /* Using cursor P02983 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV49Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Insertamos Proceso QUimico.", "")+GXutil.newLine( ) );
      AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV49Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+"#       ="+GXutil.str( AV47RecLinMaq, 4, 0)+GXutil.newLine( ) );
      AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV49Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Linea   =", "")+GXutil.str( AV23ProForL, 2, 0)+GXutil.newLine( ) );
      AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV49Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Proceso =", "")+AV25ProForCod+" "+A766ProForDsc+GXutil.newLine( ) );
      AV48Col_inc_obs.add(AV49Item_Col_Inc_obs, 0);
      /* Using cursor P02984 */
      pr_default.execute(2, new Object[] {AV43EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, Short.valueOf(AV47RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = P02984_A2804RecLinMaq[0] ;
         A130BarCodPar = P02984_A130BarCodPar[0] ;
         A132BarCodReo = P02984_A132BarCodReo[0] ;
         A129BarCod = P02984_A129BarCod[0] ;
         A396EmprCod = P02984_A396EmprCod[0] ;
         A1272UltLinPro = P02984_A1272UltLinPro[0] ;
         AV49Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Modificamos RECMAQ.", "")+GXutil.newLine( ) );
         AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV49Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+"#       ="+GXutil.str( AV47RecLinMaq, 4, 0)+GXutil.newLine( ) );
         AV49Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV49Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Item  UltLinPro ", "")+GXutil.str( A1272UltLinPro, 2, 0)+httpContext.getMessage( " cambia a ", "")+GXutil.str( AV24ultlinpro, 2, 0)+GXutil.newLine( ) );
         AV48Col_inc_obs.add(AV49Item_Col_Inc_obs, 0);
         A1272UltLinPro = ((AV24ultlinpro>A1272UltLinPro) ? AV24ultlinpro : A1272UltLinPro) ;
         /* Using cursor P02985 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A1272UltLinPro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV48Col_inc_obs.size() > 0 )
      {
         AV50Json_Inc_obs = AV48Col_inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV57Pgmname, AV51Usurcod, AV52Station, AV50Json_Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinslin.this.AV43EmprCod;
      this.aP1[0] = pinslin.this.AV44BarCod;
      this.aP2[0] = pinslin.this.AV45BarCodReo;
      this.aP3[0] = pinslin.this.AV46BarCodPar;
      this.aP4[0] = pinslin.this.AV47RecLinMaq;
      this.aP5[0] = pinslin.this.AV23ProForL;
      this.aP6[0] = pinslin.this.AV25ProForCod;
      this.aP7[0] = pinslin.this.AV24ultlinpro;
      this.aP8[0] = pinslin.this.AV31F_insert;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinslin");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48Col_inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P02982_A2804RecLinMaq = new short[1] ;
      P02982_A130BarCodPar = new String[] {""} ;
      P02982_A132BarCodReo = new byte[1] ;
      P02982_A129BarCod = new int[1] ;
      P02982_A396EmprCod = new String[] {""} ;
      P02982_A2805RecVolPrd = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      Gx_emsg = "" ;
      AV49Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      A766ProForDsc = "" ;
      P02984_A2804RecLinMaq = new short[1] ;
      P02984_A130BarCodPar = new String[] {""} ;
      P02984_A132BarCodReo = new byte[1] ;
      P02984_A129BarCod = new int[1] ;
      P02984_A396EmprCod = new String[] {""} ;
      P02984_A1272UltLinPro = new byte[1] ;
      AV50Json_Inc_obs = "" ;
      AV57Pgmname = "" ;
      AV51Usurcod = "" ;
      AV52Station = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinslin__default(),
         new Object[] {
             new Object[] {
            P02982_A2804RecLinMaq, P02982_A130BarCodPar, P02982_A132BarCodReo, P02982_A129BarCod, P02982_A396EmprCod, P02982_A2805RecVolPrd
            }
            , new Object[] {
            }
            , new Object[] {
            P02984_A2804RecLinMaq, P02984_A130BarCodPar, P02984_A132BarCodReo, P02984_A129BarCod, P02984_A396EmprCod, P02984_A1272UltLinPro
            }
            , new Object[] {
            }
         }
      );
      AV57Pgmname = "PINSLIN" ;
      /* GeneXus formulas. */
      AV57Pgmname = "PINSLIN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV45BarCodReo ;
   private byte AV23ProForL ;
   private byte AV24ultlinpro ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A1272UltLinPro ;
   private short AV47RecLinMaq ;
   private short AV26RecTiempo ;
   private short A2804RecLinMaq ;
   private short A4696RecTiempo ;
   private short Gx_err ;
   private int AV44BarCod ;
   private int AV27RecNroPrg ;
   private int AV28RecVolPrf ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV42RecVolprd ;
   private int GX_INS409 ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private String AV43EmprCod ;
   private String AV46BarCodPar ;
   private String AV25ProForCod ;
   private String AV31F_insert ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String Gx_emsg ;
   private String A766ProForDsc ;
   private String AV57Pgmname ;
   private String AV51Usurcod ;
   private String AV52Station ;
   private boolean n4696RecTiempo ;
   private String AV50Json_Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private short[] P02982_A2804RecLinMaq ;
   private String[] P02982_A130BarCodPar ;
   private byte[] P02982_A132BarCodReo ;
   private int[] P02982_A129BarCod ;
   private String[] P02982_A396EmprCod ;
   private int[] P02982_A2805RecVolPrd ;
   private short[] P02984_A2804RecLinMaq ;
   private String[] P02984_A130BarCodPar ;
   private byte[] P02984_A132BarCodReo ;
   private int[] P02984_A129BarCod ;
   private String[] P02984_A396EmprCod ;
   private byte[] P02984_A1272UltLinPro ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV48Col_inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV49Item_Col_Inc_obs ;
}

final  class pinslin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02982", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecVolPrd FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02983", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, ProRecObs, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P02984", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, UltLinPro FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq  FOR UPDATE OF UltLinPro NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02985", "UPDATE TXPRECMAQ SET UltLinPro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[9]).shortValue());
               }
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

