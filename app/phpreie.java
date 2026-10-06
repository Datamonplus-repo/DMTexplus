package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phpreie extends GXProcedure
{
   public phpreie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phpreie.class ), "" );
   }

   public phpreie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      phpreie.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      phpreie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phpreie.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      phpreie.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      phpreie.this.AV17TipColCod = aP3[0];
      this.aP3 = aP3;
      phpreie.this.AV18IntCod = aP4[0];
      this.aP4 = aP4;
      phpreie.this.AV12H_diaA = aP5[0];
      this.aP5 = aP5;
      phpreie.this.AV20Int_un = aP6[0];
      this.aP6 = aP6;
      phpreie.this.AV23Int_Lin = aP7[0];
      this.aP7 = aP7;
      phpreie.this.AV21Int_ValI = aP8[0];
      this.aP8 = aP8;
      phpreie.this.AV22Int_ValF = aP9[0];
      this.aP9 = aP9;
      phpreie.this.AV10ArtPreKgm = aP10[0];
      this.aP10 = aP10;
      phpreie.this.AV11ArtPremtr = aP11[0];
      this.aP11 = aP11;
      phpreie.this.AV24Int_tp = aP12[0];
      this.aP12 = aP12;
      phpreie.this.AV15Station = aP13[0];
      this.aP13 = aP13;
      phpreie.this.AV16Usurcod = aP14[0];
      this.aP14 = aP14;
      phpreie.this.AV14H_obsa = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13H_UltlA = 0 ;
      AV27GXLvl3 = (byte)(0) ;
      /* Using cursor P04DO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Artcod, Byte.valueOf(AV17TipColCod), Byte.valueOf(AV18IntCod), AV12H_diaA});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11092H_DiaI = P04DO2_A11092H_DiaI[0] ;
         A583IntCod = P04DO2_A583IntCod[0] ;
         A831TipColCod = P04DO2_A831TipColCod[0] ;
         A65ArtCod = P04DO2_A65ArtCod[0] ;
         A252CliCod = P04DO2_A252CliCod[0] ;
         A11186H_UltLe = P04DO2_A11186H_UltLe[0] ;
         n11186H_UltLe = P04DO2_n11186H_UltLe[0] ;
         AV27GXLvl3 = (byte)(1) ;
         AV13H_UltlA = (int)(A11186H_UltLe+1) ;
         A11186H_UltLe = AV13H_UltlA ;
         n11186H_UltLe = false ;
         /* Execute user subroutine: 'ESCALADO' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P04DO3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11186H_UltLe), Integer.valueOf(A11186H_UltLe), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV27GXLvl3 == 0 )
      {
         AV13H_UltlA = (int)(AV13H_UltlA+1) ;
         /* Execute user subroutine: 'CREO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ESCALADO' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CREO' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPHPREIT

      */
      A252CliCod = AV8Clicod ;
      A65ArtCod = AV9Artcod ;
      A831TipColCod = AV17TipColCod ;
      A583IntCod = AV18IntCod ;
      A11092H_DiaI = AV12H_diaA ;
      A11186H_UltLe = AV13H_UltlA ;
      n11186H_UltLe = false ;
      /* Using cursor P04DO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Boolean.valueOf(n11186H_UltLe), Integer.valueOf(A11186H_UltLe)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
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
      /* End Insert */
   }

   public void S121( )
   {
      /* 'ESCALADO' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPHPREIe

      */
      A252CliCod = AV8Clicod ;
      A65ArtCod = AV9Artcod ;
      A831TipColCod = AV17TipColCod ;
      A583IntCod = AV18IntCod ;
      A11092H_DiaI = AV12H_diaA ;
      A11187H_linIe = AV13H_UltlA ;
      A11188H_unde = AV20Int_un ;
      A11189H_line = AV23Int_Lin ;
      A11190H_vi = AV21Int_ValI ;
      n11190H_vi = false ;
      A11191H_vf = AV22Int_ValF ;
      n11191H_vf = false ;
      A11192H_pke = AV10ArtPreKgm ;
      n11192H_pke = false ;
      A11193H_pme = AV11ArtPremtr ;
      n11193H_pme = false ;
      A11194H_tp = AV24Int_tp ;
      n11194H_tp = false ;
      /* Using cursor P04DO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line), Boolean.valueOf(n11190H_vi), A11190H_vi, Boolean.valueOf(n11191H_vf), A11191H_vf, Boolean.valueOf(n11192H_pke), A11192H_pke, Boolean.valueOf(n11193H_pme), A11193H_pme, Boolean.valueOf(n11194H_tp), A11194H_tp});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIe");
      if ( (pr_default.getStatus(3) == 1) )
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
   }

   protected void cleanup( )
   {
      this.aP0[0] = phpreie.this.A396EmprCod;
      this.aP1[0] = phpreie.this.AV8Clicod;
      this.aP2[0] = phpreie.this.AV9Artcod;
      this.aP3[0] = phpreie.this.AV17TipColCod;
      this.aP4[0] = phpreie.this.AV18IntCod;
      this.aP5[0] = phpreie.this.AV12H_diaA;
      this.aP6[0] = phpreie.this.AV20Int_un;
      this.aP7[0] = phpreie.this.AV23Int_Lin;
      this.aP8[0] = phpreie.this.AV21Int_ValI;
      this.aP9[0] = phpreie.this.AV22Int_ValF;
      this.aP10[0] = phpreie.this.AV10ArtPreKgm;
      this.aP11[0] = phpreie.this.AV11ArtPremtr;
      this.aP12[0] = phpreie.this.AV24Int_tp;
      this.aP13[0] = phpreie.this.AV15Station;
      this.aP14[0] = phpreie.this.AV16Usurcod;
      this.aP15[0] = phpreie.this.AV14H_obsa;
      Application.commitDataStores(context, remoteHandle, pr_default, "phpreie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04DO2_A396EmprCod = new String[] {""} ;
      P04DO2_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      P04DO2_A583IntCod = new byte[1] ;
      P04DO2_A831TipColCod = new byte[1] ;
      P04DO2_A65ArtCod = new String[] {""} ;
      P04DO2_A252CliCod = new int[1] ;
      P04DO2_A11186H_UltLe = new int[1] ;
      P04DO2_n11186H_UltLe = new boolean[] {false} ;
      A11092H_DiaI = GXutil.nullDate() ;
      A65ArtCod = "" ;
      Gx_emsg = "" ;
      A11188H_unde = "" ;
      A11190H_vi = DecimalUtil.ZERO ;
      A11191H_vf = DecimalUtil.ZERO ;
      A11192H_pke = DecimalUtil.ZERO ;
      A11193H_pme = DecimalUtil.ZERO ;
      A11194H_tp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phpreie__default(),
         new Object[] {
             new Object[] {
            P04DO2_A396EmprCod, P04DO2_A11092H_DiaI, P04DO2_A583IntCod, P04DO2_A831TipColCod, P04DO2_A65ArtCod, P04DO2_A252CliCod, P04DO2_A11186H_UltLe, P04DO2_n11186H_UltLe
            }
            , new Object[] {
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

   private byte AV17TipColCod ;
   private byte AV18IntCod ;
   private byte AV27GXLvl3 ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short AV23Int_Lin ;
   private short Gx_err ;
   private short A11189H_line ;
   private int AV8Clicod ;
   private int AV13H_UltlA ;
   private int A252CliCod ;
   private int A11186H_UltLe ;
   private int GX_INS1481 ;
   private int GX_INS1488 ;
   private int A11187H_linIe ;
   private java.math.BigDecimal AV21Int_ValI ;
   private java.math.BigDecimal AV22Int_ValF ;
   private java.math.BigDecimal AV10ArtPreKgm ;
   private java.math.BigDecimal AV11ArtPremtr ;
   private java.math.BigDecimal A11190H_vi ;
   private java.math.BigDecimal A11191H_vf ;
   private java.math.BigDecimal A11192H_pke ;
   private java.math.BigDecimal A11193H_pme ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String AV20Int_un ;
   private String AV24Int_tp ;
   private String AV15Station ;
   private String AV16Usurcod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String Gx_emsg ;
   private String A11188H_unde ;
   private String A11194H_tp ;
   private java.util.Date AV12H_diaA ;
   private java.util.Date A11092H_DiaI ;
   private boolean n11186H_UltLe ;
   private boolean returnInSub ;
   private boolean n11190H_vi ;
   private boolean n11191H_vf ;
   private boolean n11192H_pke ;
   private boolean n11193H_pme ;
   private boolean n11194H_tp ;
   private String AV14H_obsa ;
   private String[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P04DO2_A396EmprCod ;
   private java.util.Date[] P04DO2_A11092H_DiaI ;
   private byte[] P04DO2_A583IntCod ;
   private byte[] P04DO2_A831TipColCod ;
   private String[] P04DO2_A65ArtCod ;
   private int[] P04DO2_A252CliCod ;
   private int[] P04DO2_A11186H_UltLe ;
   private boolean[] P04DO2_n11186H_UltLe ;
}

final  class phpreie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04DO2", "SELECT EmprCod, H_DiaI, IntCod, TipColCod, ArtCod, CliCod, H_UltLe FROM TXPHPREIT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and H_DiaI = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04DO3", "UPDATE TXPHPREIT SET H_UltLe=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREIT")
         ,new UpdateCursor("P04DO4", "INSERT INTO TXPHPREIT(EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_UltLe, H_UltLi) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREIT")
         ,new UpdateCursor("P04DO5", "INSERT INTO TXPHPREIe(EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linIe, H_unde, H_line, H_vi, H_vf, H_pke, H_pme, H_tp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREIe")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[7]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[18], 1);
               }
               return;
      }
   }

}

