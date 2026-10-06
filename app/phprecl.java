package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phprecl extends GXProcedure
{
   public phprecl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phprecl.class ), "" );
   }

   public phprecl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      phprecl.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        java.util.Date[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      phprecl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phprecl.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      phprecl.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      phprecl.this.AV21Artdsc = aP3[0];
      this.aP3 = aP3;
      phprecl.this.AV19ForcolNom = aP4[0];
      this.aP4 = aP4;
      phprecl.this.AV20ForColNum = aP5[0];
      this.aP5 = aP5;
      phprecl.this.AV17TipColCod = aP6[0];
      this.aP6 = aP6;
      phprecl.this.AV12H_diaA = aP7[0];
      this.aP7 = aP7;
      phprecl.this.AV10ArtPreKgm = aP8[0];
      this.aP8 = aP8;
      phprecl.this.AV11ArtPremtr = aP9[0];
      this.aP9 = aP9;
      phprecl.this.AV15Station = aP10[0];
      this.aP10 = aP10;
      phprecl.this.AV16Usurcod = aP11[0];
      this.aP11 = aP11;
      phprecl.this.AV14H_obsa = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13H_UltlA = 0 ;
      AV24GXLvl3 = (byte)(0) ;
      /* Using cursor P04CH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Artcod, AV19ForcolNom, Integer.valueOf(AV20ForColNum), Byte.valueOf(AV17TipColCod), AV12H_diaA});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11076H_DiaC = P04CH2_A11076H_DiaC[0] ;
         A11075H_Tipcolco = P04CH2_A11075H_Tipcolco[0] ;
         A11074H_ForcolNn = P04CH2_A11074H_ForcolNn[0] ;
         A11073H_ForcolNm = P04CH2_A11073H_ForcolNm[0] ;
         A11071H_Forser = P04CH2_A11071H_Forser[0] ;
         A252CliCod = P04CH2_A252CliCod[0] ;
         A11077H_UltDC = P04CH2_A11077H_UltDC[0] ;
         n11077H_UltDC = P04CH2_n11077H_UltDC[0] ;
         AV24GXLvl3 = (byte)(1) ;
         AV13H_UltlA = (int)(A11077H_UltDC+1) ;
         A11077H_UltDC = AV13H_UltlA ;
         n11077H_UltDC = false ;
         /* Using cursor P04CH3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11077H_UltDC), Integer.valueOf(A11077H_UltDC), A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPRECL");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV24GXLvl3 == 0 )
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CREO' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPHPRECL

      */
      A252CliCod = AV8Clicod ;
      A11071H_Forser = AV9Artcod ;
      A11073H_ForcolNm = AV19ForcolNom ;
      A11074H_ForcolNn = AV20ForColNum ;
      A11075H_Tipcolco = AV17TipColCod ;
      A11076H_DiaC = AV12H_diaA ;
      A11077H_UltDC = AV13H_UltlA ;
      n11077H_UltDC = false ;
      A11072H_ForserD = AV21Artdsc ;
      n11072H_ForserD = false ;
      /* Using cursor P04CH4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Boolean.valueOf(n11072H_ForserD), A11072H_ForserD, Boolean.valueOf(n11077H_UltDC), Integer.valueOf(A11077H_UltDC)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPRECL");
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
      /*
         INSERT RECORD ON TABLE TXPHPREC1

      */
      A252CliCod = AV8Clicod ;
      A11071H_Forser = AV9Artcod ;
      A11073H_ForcolNm = AV19ForcolNom ;
      A11074H_ForcolNn = AV20ForColNum ;
      A11075H_Tipcolco = AV17TipColCod ;
      A11076H_DiaC = AV12H_diaA ;
      A11078H_LinC = AV13H_UltlA ;
      A11079H_PkC = AV10ArtPreKgm ;
      n11079H_PkC = false ;
      A11080H_PmC = AV11ArtPremtr ;
      n11080H_PmC = false ;
      A11081H_TmC = AV15Station ;
      n11081H_TmC = false ;
      A11082H_UsC = AV16Usurcod ;
      n11082H_UsC = false ;
      A11083H_HhC = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11083H_HhC = false ;
      A11102H_obsC = AV14H_obsa ;
      n11102H_obsC = false ;
      /* Using cursor P04CH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC), Boolean.valueOf(n11079H_PkC), A11079H_PkC, Boolean.valueOf(n11080H_PmC), A11080H_PmC, Boolean.valueOf(n11081H_TmC), A11081H_TmC, Boolean.valueOf(n11082H_UsC), A11082H_UsC, Boolean.valueOf(n11083H_HhC), A11083H_HhC, Boolean.valueOf(n11102H_obsC), A11102H_obsC});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREC1");
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
      this.aP0[0] = phprecl.this.A396EmprCod;
      this.aP1[0] = phprecl.this.AV8Clicod;
      this.aP2[0] = phprecl.this.AV9Artcod;
      this.aP3[0] = phprecl.this.AV21Artdsc;
      this.aP4[0] = phprecl.this.AV19ForcolNom;
      this.aP5[0] = phprecl.this.AV20ForColNum;
      this.aP6[0] = phprecl.this.AV17TipColCod;
      this.aP7[0] = phprecl.this.AV12H_diaA;
      this.aP8[0] = phprecl.this.AV10ArtPreKgm;
      this.aP9[0] = phprecl.this.AV11ArtPremtr;
      this.aP10[0] = phprecl.this.AV15Station;
      this.aP11[0] = phprecl.this.AV16Usurcod;
      this.aP12[0] = phprecl.this.AV14H_obsa;
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
      P04CH2_A396EmprCod = new String[] {""} ;
      P04CH2_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      P04CH2_A11075H_Tipcolco = new byte[1] ;
      P04CH2_A11074H_ForcolNn = new int[1] ;
      P04CH2_A11073H_ForcolNm = new String[] {""} ;
      P04CH2_A11071H_Forser = new String[] {""} ;
      P04CH2_A252CliCod = new int[1] ;
      P04CH2_A11077H_UltDC = new int[1] ;
      P04CH2_n11077H_UltDC = new boolean[] {false} ;
      A11076H_DiaC = GXutil.nullDate() ;
      A11073H_ForcolNm = "" ;
      A11071H_Forser = "" ;
      A11072H_ForserD = "" ;
      Gx_emsg = "" ;
      A11079H_PkC = DecimalUtil.ZERO ;
      A11080H_PmC = DecimalUtil.ZERO ;
      A11081H_TmC = "" ;
      A11082H_UsC = "" ;
      A11083H_HhC = GXutil.resetTime( GXutil.nullDate() );
      A11102H_obsC = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phprecl__default(),
         new Object[] {
             new Object[] {
            P04CH2_A396EmprCod, P04CH2_A11076H_DiaC, P04CH2_A11075H_Tipcolco, P04CH2_A11074H_ForcolNn, P04CH2_A11073H_ForcolNm, P04CH2_A11071H_Forser, P04CH2_A252CliCod, P04CH2_A11077H_UltDC, P04CH2_n11077H_UltDC
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
   private byte AV24GXLvl3 ;
   private byte A11075H_Tipcolco ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV20ForColNum ;
   private int AV13H_UltlA ;
   private int A11074H_ForcolNn ;
   private int A252CliCod ;
   private int A11077H_UltDC ;
   private int GX_INS1477 ;
   private int GX_INS1478 ;
   private int A11078H_LinC ;
   private java.math.BigDecimal AV10ArtPreKgm ;
   private java.math.BigDecimal AV11ArtPremtr ;
   private java.math.BigDecimal A11079H_PkC ;
   private java.math.BigDecimal A11080H_PmC ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String AV21Artdsc ;
   private String AV19ForcolNom ;
   private String AV15Station ;
   private String AV16Usurcod ;
   private String scmdbuf ;
   private String A11073H_ForcolNm ;
   private String A11071H_Forser ;
   private String A11072H_ForserD ;
   private String Gx_emsg ;
   private String A11081H_TmC ;
   private String A11082H_UsC ;
   private java.util.Date A11083H_HhC ;
   private java.util.Date AV12H_diaA ;
   private java.util.Date A11076H_DiaC ;
   private boolean n11077H_UltDC ;
   private boolean returnInSub ;
   private boolean n11072H_ForserD ;
   private boolean n11079H_PkC ;
   private boolean n11080H_PmC ;
   private boolean n11081H_TmC ;
   private boolean n11082H_UsC ;
   private boolean n11083H_HhC ;
   private boolean n11102H_obsC ;
   private String AV14H_obsa ;
   private String A11102H_obsC ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private java.util.Date[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P04CH2_A396EmprCod ;
   private java.util.Date[] P04CH2_A11076H_DiaC ;
   private byte[] P04CH2_A11075H_Tipcolco ;
   private int[] P04CH2_A11074H_ForcolNn ;
   private String[] P04CH2_A11073H_ForcolNm ;
   private String[] P04CH2_A11071H_Forser ;
   private int[] P04CH2_A252CliCod ;
   private int[] P04CH2_A11077H_UltDC ;
   private boolean[] P04CH2_n11077H_UltDC ;
}

final  class phprecl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04CH2", "SELECT EmprCod, H_DiaC, H_Tipcolco, H_ForcolNn, H_ForcolNm, H_Forser, CliCod, H_UltDC FROM TXPHPRECL WHERE EmprCod = ? and CliCod = ? and H_Forser = ? and H_ForcolNm = ? and H_ForcolNn = ? and H_Tipcolco = ? and H_DiaC = ? ORDER BY EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04CH3", "UPDATE TXPHPRECL SET H_UltDC=?  WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPRECL")
         ,new UpdateCursor("P04CH4", "INSERT INTO TXPHPRECL(EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_ForserD, H_UltDC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPRECL")
         ,new UpdateCursor("P04CH5", "INSERT INTO TXPHPREC1(EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC, H_PkC, H_PmC, H_TmC, H_UsC, H_HhC, H_obsC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREC1")
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
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
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setDate(8, (java.util.Date)parms[8]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 26);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[19], 200);
               }
               return;
      }
   }

}

