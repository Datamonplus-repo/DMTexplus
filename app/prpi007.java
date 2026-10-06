package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi007 extends GXProcedure
{
   public prpi007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi007.class ), "" );
   }

   public prpi007( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 ,
                          short[] aP8 ,
                          short[] aP9 ,
                          String[] aP10 ,
                          byte[] aP11 ,
                          String[] aP12 )
   {
      prpi007.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 )
   {
      prpi007.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi007.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      prpi007.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      prpi007.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      prpi007.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      prpi007.this.AV19BarParPan = aP5[0];
      this.aP5 = aP5;
      prpi007.this.AV20BarSit = aP6[0];
      this.aP6 = aP6;
      prpi007.this.AV21Reo = aP7[0];
      this.aP7 = aP7;
      prpi007.this.AV22TipDefCod = aP8[0];
      this.aP8 = aP8;
      prpi007.this.AV23TipDefPor = aP9[0];
      this.aP9 = aP9;
      prpi007.this.AV24BarMaqCod = aP10[0];
      this.aP10 = aP10;
      prpi007.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi007.this.AV26Codigo = aP12[0];
      this.aP12 = aP12;
      prpi007.this.AV27DisCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV173Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prpi007.this.GXt_char1 = GXv_char2[0] ;
      AV173Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV174EmprNom ;
      GXv_char4[0] = AV172Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV173Station, GXv_char2, GXv_char3, GXv_char4) ;
      prpi007.this.A396EmprCod = GXv_char2[0] ;
      prpi007.this.AV174EmprNom = GXv_char3[0] ;
      prpi007.this.AV172Usurcod = GXv_char4[0] ;
      AV191Col_Inc_obs.clear();
      /* Using cursor P05272 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05272_A130BarCodPar[0] ;
         A132BarCodReo = P05272_A132BarCodReo[0] ;
         A129BarCod = P05272_A129BarCod[0] ;
         A361DisCod = P05272_A361DisCod[0] ;
         AV129DisOriCod = A361DisCod ;
         /* Execute user subroutine: 'DISREF' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISREF' Routine */
      returnInSub = false ;
      /* Using cursor P05273 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV129DisOriCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A361DisCod = P05273_A361DisCod[0] ;
         A5861DisRefPzII = P05273_A5861DisRefPzII[0] ;
         n5861DisRefPzII = P05273_n5861DisRefPzII[0] ;
         A3403DisRefPie = P05273_A3403DisRefPie[0] ;
         n3403DisRefPie = P05273_n3403DisRefPie[0] ;
         A3402DisRefMts = P05273_A3402DisRefMts[0] ;
         n3402DisRefMts = P05273_n3402DisRefMts[0] ;
         A3401DisRefKgs = P05273_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P05273_n3401DisRefKgs[0] ;
         A3608DisRefAlbR = P05273_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P05273_n3608DisRefAlbR[0] ;
         A3607DisRefBPie = P05273_A3607DisRefBPie[0] ;
         A3400DisRefBCPa = P05273_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = P05273_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = P05273_A3398DisRefBarC[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         /*
            INSERT RECORD ON TABLE TXPDISREF

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W3398DisRefBarC = A3398DisRefBarC ;
         W3399DisRefBCRe = A3399DisRefBCRe ;
         W3400DisRefBCPa = A3400DisRefBCPa ;
         W3607DisRefBPie = A3607DisRefBPie ;
         W3608DisRefAlbR = A3608DisRefAlbR ;
         n3608DisRefAlbR = false ;
         W3401DisRefKgs = A3401DisRefKgs ;
         n3401DisRefKgs = false ;
         W3402DisRefMts = A3402DisRefMts ;
         n3402DisRefMts = false ;
         W3403DisRefPie = A3403DisRefPie ;
         n3403DisRefPie = false ;
         W5861DisRefPzII = A5861DisRefPzII ;
         n5861DisRefPzII = false ;
         A361DisCod = AV27DisCod ;
         n3608DisRefAlbR = false ;
         n3401DisRefKgs = false ;
         n3402DisRefMts = false ;
         n3403DisRefPie = false ;
         n5861DisRefPzII = false ;
         /* Using cursor P05274 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie, Boolean.valueOf(n3608DisRefAlbR), Integer.valueOf(A3608DisRefAlbR), Boolean.valueOf(n3401DisRefKgs), A3401DisRefKgs, Boolean.valueOf(n3402DisRefMts), A3402DisRefMts, Boolean.valueOf(n3403DisRefPie), Short.valueOf(A3403DisRefPie), Boolean.valueOf(n5861DisRefPzII), A5861DisRefPzII});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         A3398DisRefBarC = W3398DisRefBarC ;
         A3399DisRefBCRe = W3399DisRefBCRe ;
         A3400DisRefBCPa = W3400DisRefBCPa ;
         A3607DisRefBPie = W3607DisRefBPie ;
         A3608DisRefAlbR = W3608DisRefAlbR ;
         n3608DisRefAlbR = false ;
         A3401DisRefKgs = W3401DisRefKgs ;
         n3401DisRefKgs = false ;
         A3402DisRefMts = W3402DisRefMts ;
         n3402DisRefMts = false ;
         A3403DisRefPie = W3403DisRefPie ;
         n3403DisRefPie = false ;
         A5861DisRefPzII = W5861DisRefPzII ;
         n5861DisRefPzII = false ;
         /* End Insert */
         AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW DISREF", "")+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0) );
         AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV191Col_Inc_obs.size() > 0 )
      {
         AV193Json_inc_obs = AV191Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV198Pgmname, AV172Usurcod, AV173Station, AV193Json_inc_obs, AV18BarCod, AV16BarReoOri, AV17BarParOri) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi007.this.A396EmprCod;
      this.aP1[0] = prpi007.this.AV15BarCodOri;
      this.aP2[0] = prpi007.this.AV16BarReoOri;
      this.aP3[0] = prpi007.this.AV17BarParOri;
      this.aP4[0] = prpi007.this.AV18BarCod;
      this.aP5[0] = prpi007.this.AV19BarParPan;
      this.aP6[0] = prpi007.this.AV20BarSit;
      this.aP7[0] = prpi007.this.AV21Reo;
      this.aP8[0] = prpi007.this.AV22TipDefCod;
      this.aP9[0] = prpi007.this.AV23TipDefPor;
      this.aP10[0] = prpi007.this.AV24BarMaqCod;
      this.aP11[0] = prpi007.this.AV25BarConReo;
      this.aP12[0] = prpi007.this.AV26Codigo;
      this.aP13[0] = prpi007.this.AV27DisCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV173Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV174EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV172Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV191Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P05272_A396EmprCod = new String[] {""} ;
      P05272_A130BarCodPar = new String[] {""} ;
      P05272_A132BarCodReo = new byte[1] ;
      P05272_A129BarCod = new int[1] ;
      P05272_A361DisCod = new int[1] ;
      A130BarCodPar = "" ;
      P05273_A396EmprCod = new String[] {""} ;
      P05273_A361DisCod = new int[1] ;
      P05273_A5861DisRefPzII = new String[] {""} ;
      P05273_n5861DisRefPzII = new boolean[] {false} ;
      P05273_A3403DisRefPie = new short[1] ;
      P05273_n3403DisRefPie = new boolean[] {false} ;
      P05273_A3402DisRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05273_n3402DisRefMts = new boolean[] {false} ;
      P05273_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05273_n3401DisRefKgs = new boolean[] {false} ;
      P05273_A3608DisRefAlbR = new int[1] ;
      P05273_n3608DisRefAlbR = new boolean[] {false} ;
      P05273_A3607DisRefBPie = new String[] {""} ;
      P05273_A3400DisRefBCPa = new String[] {""} ;
      P05273_A3399DisRefBCRe = new byte[1] ;
      P05273_A3398DisRefBarC = new int[1] ;
      A5861DisRefPzII = "" ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A3607DisRefBPie = "" ;
      A3400DisRefBCPa = "" ;
      W396EmprCod = "" ;
      W3400DisRefBCPa = "" ;
      W3607DisRefBPie = "" ;
      W3401DisRefKgs = DecimalUtil.ZERO ;
      W3402DisRefMts = DecimalUtil.ZERO ;
      W5861DisRefPzII = "" ;
      Gx_emsg = "" ;
      AV192Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV193Json_inc_obs = "" ;
      AV198Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi007__default(),
         new Object[] {
             new Object[] {
            P05272_A396EmprCod, P05272_A130BarCodPar, P05272_A132BarCodReo, P05272_A129BarCod, P05272_A361DisCod
            }
            , new Object[] {
            P05273_A396EmprCod, P05273_A361DisCod, P05273_A5861DisRefPzII, P05273_n5861DisRefPzII, P05273_A3403DisRefPie, P05273_n3403DisRefPie, P05273_A3402DisRefMts, P05273_n3402DisRefMts, P05273_A3401DisRefKgs, P05273_n3401DisRefKgs,
            P05273_A3608DisRefAlbR, P05273_n3608DisRefAlbR, P05273_A3607DisRefBPie, P05273_A3400DisRefBCPa, P05273_A3399DisRefBCRe, P05273_A3398DisRefBarC
            }
            , new Object[] {
            }
         }
      );
      AV198Pgmname = "PRPI007" ;
      /* GeneXus formulas. */
      AV198Pgmname = "PRPI007" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoOri ;
   private byte AV20BarSit ;
   private byte AV25BarConReo ;
   private byte A132BarCodReo ;
   private byte A3399DisRefBCRe ;
   private byte W3399DisRefBCRe ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short A3403DisRefPie ;
   private short W3403DisRefPie ;
   private short Gx_err ;
   private int AV15BarCodOri ;
   private int AV18BarCod ;
   private int AV27DisCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV129DisOriCod ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private int W361DisCod ;
   private int GX_INS503 ;
   private int W3398DisRefBarC ;
   private int W3608DisRefAlbR ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal W3401DisRefKgs ;
   private java.math.BigDecimal W3402DisRefMts ;
   private String A396EmprCod ;
   private String AV17BarParOri ;
   private String AV19BarParPan ;
   private String AV21Reo ;
   private String AV24BarMaqCod ;
   private String AV26Codigo ;
   private String AV173Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV174EmprNom ;
   private String GXv_char3[] ;
   private String AV172Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5861DisRefPzII ;
   private String A3607DisRefBPie ;
   private String A3400DisRefBCPa ;
   private String W396EmprCod ;
   private String W3400DisRefBCPa ;
   private String W3607DisRefBPie ;
   private String W5861DisRefPzII ;
   private String Gx_emsg ;
   private String AV198Pgmname ;
   private boolean returnInSub ;
   private boolean n5861DisRefPzII ;
   private boolean n3403DisRefPie ;
   private boolean n3402DisRefMts ;
   private boolean n3401DisRefKgs ;
   private boolean n3608DisRefAlbR ;
   private String AV193Json_inc_obs ;
   private int[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P05272_A396EmprCod ;
   private String[] P05272_A130BarCodPar ;
   private byte[] P05272_A132BarCodReo ;
   private int[] P05272_A129BarCod ;
   private int[] P05272_A361DisCod ;
   private String[] P05273_A396EmprCod ;
   private int[] P05273_A361DisCod ;
   private String[] P05273_A5861DisRefPzII ;
   private boolean[] P05273_n5861DisRefPzII ;
   private short[] P05273_A3403DisRefPie ;
   private boolean[] P05273_n3403DisRefPie ;
   private java.math.BigDecimal[] P05273_A3402DisRefMts ;
   private boolean[] P05273_n3402DisRefMts ;
   private java.math.BigDecimal[] P05273_A3401DisRefKgs ;
   private boolean[] P05273_n3401DisRefKgs ;
   private int[] P05273_A3608DisRefAlbR ;
   private boolean[] P05273_n3608DisRefAlbR ;
   private String[] P05273_A3607DisRefBPie ;
   private String[] P05273_A3400DisRefBCPa ;
   private byte[] P05273_A3399DisRefBCRe ;
   private int[] P05273_A3398DisRefBarC ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV191Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV192Item_Col_Inc_obs ;
}

final  class prpi007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05272", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05273", "SELECT EmprCod, DisCod, DisRefPzII, DisRefPie, DisRefMts, DisRefKgs, DisRefAlbR, DisRefBPie, DisRefBCPa, DisRefBCRe, DisRefBarC FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05274", "INSERT INTO TXPDISREF(EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie, DisRefAlbR, DisRefKgs, DisRefMts, DisRefPie, DisRefPzII) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 9);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((int[]) buf[15])[0] = rslt.getInt(11);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 9);
               }
               return;
      }
   }

}

