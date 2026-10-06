package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pborpro extends GXProcedure
{
   public pborpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pborpro.class ), "" );
   }

   public pborpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String aP2 )
   {
      pborpro.this.AV27EmprCod = aP0[0];
      this.aP0 = aP0;
      pborpro.this.AV28DisCod = aP1[0];
      this.aP1 = aP1;
      pborpro.this.AV29ProCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pborpro.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV27EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      pborpro.this.AV27EmprCod = GXv_char2[0] ;
      pborpro.this.AV17EmprNom = GXv_char3[0] ;
      pborpro.this.AV18UsurCod = GXv_char4[0] ;
      AV19messages.clear();
      AV20message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV20message.setgxTv_SdtMessages_Message_Id( "0" );
      AV20message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Empresa ", "")+GXutil.trim( AV27EmprCod)+httpContext.getMessage( " Discod ", "")+GXutil.trim( GXutil.str( AV28DisCod, 8, 0))+httpContext.getMessage( " Procod ", "")+GXutil.trim( AV29ProCod) );
      AV19messages.add(AV20message, 0);
      AV32GXLvl11 = (byte)(0) ;
      /* Using cursor P00762 */
      pr_default.execute(0, new Object[] {AV27EmprCod, Integer.valueOf(AV28DisCod), AV29ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P00762_A758ProCod[0] ;
         A361DisCod = P00762_A361DisCod[0] ;
         A396EmprCod = P00762_A396EmprCod[0] ;
         AV32GXLvl11 = (byte)(1) ;
         AV26disfas = (short)(0) ;
         AV22disfaspar = (short)(0) ;
         AV23disqui = (short)(0) ;
         AV24DT004 = (short)(0) ;
         AV25DT0041 = (short)(0) ;
         /* Using cursor P00763 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A368DisFasLin = P00763_A368DisFasLin[0] ;
            /* Using cursor P00764 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
            AV26disfas = (short)(1) ;
            /* Using cursor P00765 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A3686DisParObs = P00765_A3686DisParObs[0] ;
               A1664ParFasCod = P00765_A1664ParFasCod[0] ;
               /* Using cursor P00766 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
               AV22disfaspar = (short)(1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P00767 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A5377DisQuiLin = P00767_A5377DisQuiLin[0] ;
               /* Using cursor P00768 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
               AV23disqui = (short)(1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Using cursor P00769 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A7919Dta_Ordl = P00769_A7919Dta_Ordl[0] ;
               /* Using cursor P007610 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A7929Dta_ForLin = P007610_A7929Dta_ForLin[0] ;
                  /* Using cursor P007611 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl), Short.valueOf(A7929Dta_ForLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0041");
                  AV25DT0041 = (short)(1) ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               /* Using cursor P007612 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT004");
               AV24DT004 = (short)(1) ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P007613 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         AV20message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV20message.setgxTv_SdtMessages_Message_Id( "1" );
         AV20message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Delete DISLIN", "") );
         AV19messages.add(AV20message, 0);
         if ( AV26disfas == 1 )
         {
            AV20message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV20message.setgxTv_SdtMessages_Message_Id( "2" );
            AV20message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Delete DISFAS", "") );
            AV19messages.add(AV20message, 0);
         }
         if ( AV23disqui == 1 )
         {
            AV20message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV20message.setgxTv_SdtMessages_Message_Id( "3" );
            AV20message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Delete DISQUI", "") );
            AV19messages.add(AV20message, 0);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV32GXLvl11 == 0 )
      {
         AV20message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV20message.setgxTv_SdtMessages_Message_Id( "00" );
         AV20message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "NO hay registro en DISLIN para los datos, Empresa ", "")+GXutil.trim( AV27EmprCod)+httpContext.getMessage( " Discod ", "")+GXutil.trim( GXutil.str( AV28DisCod, 8, 0))+httpContext.getMessage( " Procod ", "")+GXutil.trim( AV29ProCod) );
         AV19messages.add(AV20message, 0);
      }
      if ( AV19messages.size() > 0 )
      {
         AV15Inc_obs = AV19messages.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV38Pgmname, AV18UsurCod, AV16Station, AV15Inc_obs, AV28DisCod, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pborpro.this.AV27EmprCod;
      this.aP1[0] = pborpro.this.AV28DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.pborpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV18UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV19messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV20message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      scmdbuf = "" ;
      P00762_A758ProCod = new String[] {""} ;
      P00762_A361DisCod = new int[1] ;
      P00762_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      P00763_A396EmprCod = new String[] {""} ;
      P00763_A361DisCod = new int[1] ;
      P00763_A758ProCod = new String[] {""} ;
      P00763_A368DisFasLin = new short[1] ;
      P00765_A396EmprCod = new String[] {""} ;
      P00765_A361DisCod = new int[1] ;
      P00765_A758ProCod = new String[] {""} ;
      P00765_A368DisFasLin = new short[1] ;
      P00765_A3686DisParObs = new String[] {""} ;
      P00765_A1664ParFasCod = new short[1] ;
      A3686DisParObs = "" ;
      P00767_A396EmprCod = new String[] {""} ;
      P00767_A361DisCod = new int[1] ;
      P00767_A758ProCod = new String[] {""} ;
      P00767_A368DisFasLin = new short[1] ;
      P00767_A5377DisQuiLin = new short[1] ;
      P00769_A396EmprCod = new String[] {""} ;
      P00769_A361DisCod = new int[1] ;
      P00769_A758ProCod = new String[] {""} ;
      P00769_A368DisFasLin = new short[1] ;
      P00769_A7919Dta_Ordl = new short[1] ;
      P007610_A396EmprCod = new String[] {""} ;
      P007610_A361DisCod = new int[1] ;
      P007610_A758ProCod = new String[] {""} ;
      P007610_A368DisFasLin = new short[1] ;
      P007610_A7919Dta_Ordl = new short[1] ;
      P007610_A7929Dta_ForLin = new short[1] ;
      AV15Inc_obs = "" ;
      AV38Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.pborpro__default(),
         new Object[] {
             new Object[] {
            P00762_A758ProCod, P00762_A361DisCod, P00762_A396EmprCod
            }
            , new Object[] {
            P00763_A396EmprCod, P00763_A361DisCod, P00763_A758ProCod, P00763_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00765_A396EmprCod, P00765_A361DisCod, P00765_A758ProCod, P00765_A368DisFasLin, P00765_A3686DisParObs, P00765_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00767_A396EmprCod, P00767_A361DisCod, P00767_A758ProCod, P00767_A368DisFasLin, P00767_A5377DisQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00769_A396EmprCod, P00769_A361DisCod, P00769_A758ProCod, P00769_A368DisFasLin, P00769_A7919Dta_Ordl
            }
            , new Object[] {
            P007610_A396EmprCod, P007610_A361DisCod, P007610_A758ProCod, P007610_A368DisFasLin, P007610_A7919Dta_Ordl, P007610_A7929Dta_ForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "Pedidos.PBORPRO" ;
      /* GeneXus formulas. */
      AV38Pgmname = "Pedidos.PBORPRO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV32GXLvl11 ;
   private short AV26disfas ;
   private short AV22disfaspar ;
   private short AV23disqui ;
   private short AV24DT004 ;
   private short AV25DT0041 ;
   private short A368DisFasLin ;
   private short A1664ParFasCod ;
   private short A5377DisQuiLin ;
   private short A7919Dta_Ordl ;
   private short A7929Dta_ForLin ;
   private short Gx_err ;
   private int AV28DisCod ;
   private int A361DisCod ;
   private String AV27EmprCod ;
   private String AV29ProCod ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17EmprNom ;
   private String GXv_char3[] ;
   private String AV18UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private String A3686DisParObs ;
   private String AV38Pgmname ;
   private String AV15Inc_obs ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00762_A758ProCod ;
   private int[] P00762_A361DisCod ;
   private String[] P00762_A396EmprCod ;
   private String[] P00763_A396EmprCod ;
   private int[] P00763_A361DisCod ;
   private String[] P00763_A758ProCod ;
   private short[] P00763_A368DisFasLin ;
   private String[] P00765_A396EmprCod ;
   private int[] P00765_A361DisCod ;
   private String[] P00765_A758ProCod ;
   private short[] P00765_A368DisFasLin ;
   private String[] P00765_A3686DisParObs ;
   private short[] P00765_A1664ParFasCod ;
   private String[] P00767_A396EmprCod ;
   private int[] P00767_A361DisCod ;
   private String[] P00767_A758ProCod ;
   private short[] P00767_A368DisFasLin ;
   private short[] P00767_A5377DisQuiLin ;
   private String[] P00769_A396EmprCod ;
   private int[] P00769_A361DisCod ;
   private String[] P00769_A758ProCod ;
   private short[] P00769_A368DisFasLin ;
   private short[] P00769_A7919Dta_Ordl ;
   private String[] P007610_A396EmprCod ;
   private int[] P007610_A361DisCod ;
   private String[] P007610_A758ProCod ;
   private short[] P007610_A368DisFasLin ;
   private short[] P007610_A7919Dta_Ordl ;
   private short[] P007610_A7929Dta_ForLin ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV19messages ;
   private com.genexus.SdtMessages_Message AV20message ;
}

final  class pborpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00762", "SELECT ProCod, DisCod, EmprCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00763", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00764", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P00765", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisParObs, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00766", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P00767", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00768", "DELETE FROM TXPDISQUI  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new ForEachCursor("P00769", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P007610", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin FROM TXPDT0041 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and Dta_Ordl = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P007611", "DELETE FROM TXPDT0041  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ? AND Dta_ForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0041")
         ,new UpdateCursor("P007612", "DELETE FROM TXPDT004  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND Dta_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT004")
         ,new UpdateCursor("P007613", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

