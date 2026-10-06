package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarlan extends GXProcedure
{
   public pbarlan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarlan.class ), "" );
   }

   public pbarlan( int remoteHandle ,
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
                             String[] aP5 ,
                             int[] aP6 )
   {
      pbarlan.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 )
   {
      pbarlan.this.AV18EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarlan.this.AV19BarCod = aP1[0];
      this.aP1 = aP1;
      pbarlan.this.AV20BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarlan.this.AV21BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarlan.this.AV15Linea = aP4[0];
      this.aP4 = aP4;
      pbarlan.this.AV16Maquina = aP5[0];
      this.aP5 = aP5;
      pbarlan.this.AV17Volumen = aP6[0];
      this.aP6 = aP6;
      pbarlan.this.AV22BarSua = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Erfoc = (byte)(0) ;
      GXv_int1[0] = AV27Erfoc ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int1) ;
      pbarlan.this.AV27Erfoc = GXv_int1[0] ;
      GXt_char2 = AV24msg0 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG250", ""), (byte)(99), GXv_char3) ;
      pbarlan.this.GXt_char2 = GXv_char3[0] ;
      AV24msg0 = GXt_char2 ;
      GXv_char3[0] = AV18EmprCod ;
      GXv_int4[0] = AV19BarCod ;
      GXv_int1[0] = AV20BarCodReo ;
      GXv_char5[0] = AV21BarCodPar ;
      GXv_int6[0] = AV23FlagBar ;
      new app.pbusbar(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int1, GXv_char5, GXv_int6) ;
      pbarlan.this.AV18EmprCod = GXv_char3[0] ;
      pbarlan.this.AV19BarCod = GXv_int4[0] ;
      pbarlan.this.AV20BarCodReo = GXv_int1[0] ;
      pbarlan.this.AV21BarCodPar = GXv_char5[0] ;
      pbarlan.this.AV23FlagBar = GXv_int6[0] ;
      GXt_char2 = AV26Termin ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      pbarlan.this.GXt_char2 = GXv_char5[0] ;
      AV26Termin = GXt_char2 ;
      AV25UltLin = (short)(0) ;
      /* Using cursor P00262 */
      pr_default.execute(0, new Object[] {AV18EmprCod, AV26Termin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1438BarTerCod = P00262_A1438BarTerCod[0] ;
         A396EmprCod = P00262_A396EmprCod[0] ;
         A172BarLanLin = P00262_A172BarLanLin[0] ;
         AV25UltLin = A172BarLanLin ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23FlagBar == 0 )
      {
         AV25UltLin = (short)(AV25UltLin+1) ;
         /*
            INSERT RECORD ON TABLE TXPBARLAN

         */
         A396EmprCod = AV18EmprCod ;
         A1438BarTerCod = AV26Termin ;
         A172BarLanLin = AV25UltLin ;
         A171BarLanCod = AV19BarCod ;
         n171BarLanCod = false ;
         A175BarLanReo = AV20BarCodReo ;
         n175BarLanReo = false ;
         A174BarLanPar = AV21BarCodPar ;
         n174BarLanPar = false ;
         A173BarLanMaq = AV16Maquina ;
         n173BarLanMaq = false ;
         A176BarLanVol = AV17Volumen ;
         n176BarLanVol = false ;
         /* Using cursor P00263 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1438BarTerCod, Short.valueOf(A172BarLanLin), Boolean.valueOf(n171BarLanCod), Integer.valueOf(A171BarLanCod), Boolean.valueOf(n175BarLanReo), Byte.valueOf(A175BarLanReo), Boolean.valueOf(n174BarLanPar), A174BarLanPar, Boolean.valueOf(n173BarLanMaq), A173BarLanMaq, Boolean.valueOf(n176BarLanVol), Integer.valueOf(A176BarLanVol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARLAN");
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
         GXv_char5[0] = AV18EmprCod ;
         GXv_int4[0] = AV19BarCod ;
         GXv_int6[0] = AV20BarCodReo ;
         GXv_char3[0] = AV21BarCodPar ;
         GXv_char7[0] = AV16Maquina ;
         GXv_int8[0] = AV17Volumen ;
         new app.pmodagr(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_int6, GXv_char3, GXv_char7, GXv_int8) ;
         pbarlan.this.AV18EmprCod = GXv_char5[0] ;
         pbarlan.this.AV19BarCod = GXv_int4[0] ;
         pbarlan.this.AV20BarCodReo = GXv_int6[0] ;
         pbarlan.this.AV21BarCodPar = GXv_char3[0] ;
         pbarlan.this.AV16Maquina = GXv_char7[0] ;
         pbarlan.this.AV17Volumen = GXv_int8[0] ;
         /* Using cursor P00264 */
         pr_default.execute(2, new Object[] {AV18EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P00264_A130BarCodPar[0] ;
            A132BarCodReo = P00264_A132BarCodReo[0] ;
            A129BarCod = P00264_A129BarCod[0] ;
            A396EmprCod = P00264_A396EmprCod[0] ;
            A214BarSua = P00264_A214BarSua[0] ;
            AV22BarSua = A214BarSua ;
            /* Using cursor P00265 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A122BarAgrPar = P00265_A122BarAgrPar[0] ;
               A124BarAgrReo = P00265_A124BarAgrReo[0] ;
               A119BarAgrCod = P00265_A119BarAgrCod[0] ;
               GXv_char7[0] = A396EmprCod ;
               GXv_int8[0] = A119BarAgrCod ;
               GXv_int6[0] = A124BarAgrReo ;
               GXv_char5[0] = A122BarAgrPar ;
               GXv_int9[0] = AV25UltLin ;
               new app.pinslan(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_int6, GXv_char5, GXv_int9) ;
               pbarlan.this.A396EmprCod = GXv_char7[0] ;
               pbarlan.this.A119BarAgrCod = GXv_int8[0] ;
               pbarlan.this.A124BarAgrReo = GXv_int6[0] ;
               pbarlan.this.A122BarAgrPar = GXv_char5[0] ;
               pbarlan.this.AV25UltLin = GXv_int9[0] ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else
      {
         httpContext.GX_msglist.addItem(AV24msg0);
         if ( AV27Erfoc == 0 )
         {
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarlan.this.AV18EmprCod;
      this.aP1[0] = pbarlan.this.AV19BarCod;
      this.aP2[0] = pbarlan.this.AV20BarCodReo;
      this.aP3[0] = pbarlan.this.AV21BarCodPar;
      this.aP4[0] = pbarlan.this.AV15Linea;
      this.aP5[0] = pbarlan.this.AV16Maquina;
      this.aP6[0] = pbarlan.this.AV17Volumen;
      this.aP7[0] = pbarlan.this.AV22BarSua;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbarlan");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24msg0 = "" ;
      GXv_int1 = new byte[1] ;
      AV26Termin = "" ;
      GXt_char2 = "" ;
      scmdbuf = "" ;
      P00262_A1438BarTerCod = new String[] {""} ;
      P00262_A396EmprCod = new String[] {""} ;
      P00262_A172BarLanLin = new short[1] ;
      A1438BarTerCod = "" ;
      A396EmprCod = "" ;
      A174BarLanPar = "" ;
      A173BarLanMaq = "" ;
      Gx_emsg = "" ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      P00264_A130BarCodPar = new String[] {""} ;
      P00264_A132BarCodReo = new byte[1] ;
      P00264_A129BarCod = new int[1] ;
      P00264_A396EmprCod = new String[] {""} ;
      P00264_A214BarSua = new String[] {""} ;
      A130BarCodPar = "" ;
      A214BarSua = "" ;
      P00265_A396EmprCod = new String[] {""} ;
      P00265_A129BarCod = new int[1] ;
      P00265_A132BarCodReo = new byte[1] ;
      P00265_A130BarCodPar = new String[] {""} ;
      P00265_A122BarAgrPar = new String[] {""} ;
      P00265_A124BarAgrReo = new byte[1] ;
      P00265_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarlan__default(),
         new Object[] {
             new Object[] {
            P00262_A1438BarTerCod, P00262_A396EmprCod, P00262_A172BarLanLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00264_A130BarCodPar, P00264_A132BarCodReo, P00264_A129BarCod, P00264_A396EmprCod, P00264_A214BarSua
            }
            , new Object[] {
            P00265_A396EmprCod, P00265_A129BarCod, P00265_A132BarCodReo, P00265_A130BarCodPar, P00265_A122BarAgrPar, P00265_A124BarAgrReo, P00265_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20BarCodReo ;
   private byte AV27Erfoc ;
   private byte GXv_int1[] ;
   private byte AV23FlagBar ;
   private byte A175BarLanReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int6[] ;
   private short AV15Linea ;
   private short AV25UltLin ;
   private short A172BarLanLin ;
   private short Gx_err ;
   private short GXv_int9[] ;
   private int AV19BarCod ;
   private int AV17Volumen ;
   private int GX_INS205 ;
   private int A171BarLanCod ;
   private int A176BarLanVol ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int8[] ;
   private String AV18EmprCod ;
   private String AV21BarCodPar ;
   private String AV16Maquina ;
   private String AV22BarSua ;
   private String AV24msg0 ;
   private String AV26Termin ;
   private String GXt_char2 ;
   private String scmdbuf ;
   private String A1438BarTerCod ;
   private String A396EmprCod ;
   private String A174BarLanPar ;
   private String A173BarLanMaq ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String A130BarCodPar ;
   private String A214BarSua ;
   private String A122BarAgrPar ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private boolean n171BarLanCod ;
   private boolean n175BarLanReo ;
   private boolean n174BarLanPar ;
   private boolean n173BarLanMaq ;
   private boolean n176BarLanVol ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00262_A1438BarTerCod ;
   private String[] P00262_A396EmprCod ;
   private short[] P00262_A172BarLanLin ;
   private String[] P00264_A130BarCodPar ;
   private byte[] P00264_A132BarCodReo ;
   private int[] P00264_A129BarCod ;
   private String[] P00264_A396EmprCod ;
   private String[] P00264_A214BarSua ;
   private String[] P00265_A396EmprCod ;
   private int[] P00265_A129BarCod ;
   private byte[] P00265_A132BarCodReo ;
   private String[] P00265_A130BarCodPar ;
   private String[] P00265_A122BarAgrPar ;
   private byte[] P00265_A124BarAgrReo ;
   private int[] P00265_A119BarAgrCod ;
}

final  class pbarlan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00262", "SELECT BarTerCod, EmprCod, BarLanLin FROM TXPBARLAN WHERE EmprCod = ? and BarTerCod = ? ORDER BY EmprCod, BarTerCod, BarLanLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00263", "INSERT INTO TXPBARLAN(EmprCod, BarTerCod, BarLanLin, BarLanCod, BarLanReo, BarLanPar, BarLanMaq, BarLanVol) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARLAN")
         ,new ForEachCursor("P00264", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSua FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00265", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
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
               return;
      }
   }

}

