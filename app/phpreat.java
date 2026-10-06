package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phpreat extends GXProcedure
{
   public phpreat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phpreat.class ), "" );
   }

   public phpreat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      phpreat.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      phpreat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phpreat.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      phpreat.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      phpreat.this.AV12H_diaA = aP3[0];
      this.aP3 = aP3;
      phpreat.this.AV10ArtPreKgm = aP4[0];
      this.aP4 = aP4;
      phpreat.this.AV11ArtPremtr = aP5[0];
      this.aP5 = aP5;
      phpreat.this.AV15Station = aP6[0];
      this.aP6 = aP6;
      phpreat.this.AV16Usurcod = aP7[0];
      this.aP7 = aP7;
      phpreat.this.AV14H_obsa = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13H_UltlA = 0 ;
      AV19GXLvl3 = (byte)(0) ;
      /* Using cursor P04CF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Artcod, AV12H_diaA});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11084H_DiaA = P04CF2_A11084H_DiaA[0] ;
         A65ArtCod = P04CF2_A65ArtCod[0] ;
         A252CliCod = P04CF2_A252CliCod[0] ;
         A11085H_UltlA = P04CF2_A11085H_UltlA[0] ;
         n11085H_UltlA = P04CF2_n11085H_UltlA[0] ;
         AV19GXLvl3 = (byte)(1) ;
         AV13H_UltlA = (int)(A11085H_UltlA+1) ;
         A11085H_UltlA = AV13H_UltlA ;
         n11085H_UltlA = false ;
         /* Execute user subroutine: 'CREO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P04CF3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11085H_UltlA), Integer.valueOf(A11085H_UltlA), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREAT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19GXLvl3 == 0 )
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
         INSERT RECORD ON TABLE TXPHPREAT

      */
      A252CliCod = AV8Clicod ;
      A65ArtCod = AV9Artcod ;
      A11084H_DiaA = AV12H_diaA ;
      A11085H_UltlA = AV13H_UltlA ;
      n11085H_UltlA = false ;
      /* Using cursor P04CF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Boolean.valueOf(n11085H_UltlA), Integer.valueOf(A11085H_UltlA)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREAT");
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
         INSERT RECORD ON TABLE TXPHPREA1

      */
      A252CliCod = AV8Clicod ;
      A65ArtCod = AV9Artcod ;
      A11084H_DiaA = AV12H_diaA ;
      A11086H_linA = AV13H_UltlA ;
      A11087H_PkA = AV10ArtPreKgm ;
      n11087H_PkA = false ;
      A11088H_PmA = AV11ArtPremtr ;
      n11088H_PmA = false ;
      A11089H_TmA = AV15Station ;
      n11089H_TmA = false ;
      A11090H_UsA = AV16Usurcod ;
      n11090H_UsA = false ;
      A11091H_HhA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11091H_HhA = false ;
      A11101H_obsa = AV14H_obsa ;
      n11101H_obsa = false ;
      /* Using cursor P04CF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA), Boolean.valueOf(n11087H_PkA), A11087H_PkA, Boolean.valueOf(n11088H_PmA), A11088H_PmA, Boolean.valueOf(n11089H_TmA), A11089H_TmA, Boolean.valueOf(n11090H_UsA), A11090H_UsA, Boolean.valueOf(n11091H_HhA), A11091H_HhA, Boolean.valueOf(n11101H_obsa), A11101H_obsa});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREA1");
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
      this.aP0[0] = phpreat.this.A396EmprCod;
      this.aP1[0] = phpreat.this.AV8Clicod;
      this.aP2[0] = phpreat.this.AV9Artcod;
      this.aP3[0] = phpreat.this.AV12H_diaA;
      this.aP4[0] = phpreat.this.AV10ArtPreKgm;
      this.aP5[0] = phpreat.this.AV11ArtPremtr;
      this.aP6[0] = phpreat.this.AV15Station;
      this.aP7[0] = phpreat.this.AV16Usurcod;
      this.aP8[0] = phpreat.this.AV14H_obsa;
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
      P04CF2_A396EmprCod = new String[] {""} ;
      P04CF2_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P04CF2_A65ArtCod = new String[] {""} ;
      P04CF2_A252CliCod = new int[1] ;
      P04CF2_A11085H_UltlA = new int[1] ;
      P04CF2_n11085H_UltlA = new boolean[] {false} ;
      A11084H_DiaA = GXutil.nullDate() ;
      A65ArtCod = "" ;
      Gx_emsg = "" ;
      A11087H_PkA = DecimalUtil.ZERO ;
      A11088H_PmA = DecimalUtil.ZERO ;
      A11089H_TmA = "" ;
      A11090H_UsA = "" ;
      A11091H_HhA = GXutil.resetTime( GXutil.nullDate() );
      A11101H_obsa = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phpreat__default(),
         new Object[] {
             new Object[] {
            P04CF2_A396EmprCod, P04CF2_A11084H_DiaA, P04CF2_A65ArtCod, P04CF2_A252CliCod, P04CF2_A11085H_UltlA, P04CF2_n11085H_UltlA
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

   private byte AV19GXLvl3 ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV13H_UltlA ;
   private int A252CliCod ;
   private int A11085H_UltlA ;
   private int GX_INS1479 ;
   private int GX_INS1480 ;
   private int A11086H_linA ;
   private java.math.BigDecimal AV10ArtPreKgm ;
   private java.math.BigDecimal AV11ArtPremtr ;
   private java.math.BigDecimal A11087H_PkA ;
   private java.math.BigDecimal A11088H_PmA ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String AV15Station ;
   private String AV16Usurcod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String Gx_emsg ;
   private String A11089H_TmA ;
   private String A11090H_UsA ;
   private java.util.Date A11091H_HhA ;
   private java.util.Date AV12H_diaA ;
   private java.util.Date A11084H_DiaA ;
   private boolean n11085H_UltlA ;
   private boolean returnInSub ;
   private boolean n11087H_PkA ;
   private boolean n11088H_PmA ;
   private boolean n11089H_TmA ;
   private boolean n11090H_UsA ;
   private boolean n11091H_HhA ;
   private boolean n11101H_obsa ;
   private String AV14H_obsa ;
   private String A11101H_obsa ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04CF2_A396EmprCod ;
   private java.util.Date[] P04CF2_A11084H_DiaA ;
   private String[] P04CF2_A65ArtCod ;
   private int[] P04CF2_A252CliCod ;
   private int[] P04CF2_A11085H_UltlA ;
   private boolean[] P04CF2_n11085H_UltlA ;
}

final  class phpreat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04CF2", "SELECT EmprCod, H_DiaA, ArtCod, CliCod, H_UltlA FROM TXPHPREAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and H_DiaA = ? ORDER BY EmprCod, CliCod, ArtCod, H_DiaA ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04CF3", "UPDATE TXPHPREAT SET H_UltlA=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREAT")
         ,new UpdateCursor("P04CF4", "INSERT INTO TXPHPREAT(EmprCod, CliCod, ArtCod, H_DiaA, H_UltlA) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREAT")
         ,new UpdateCursor("P04CF5", "INSERT INTO TXPHPREA1(EmprCod, CliCod, ArtCod, H_DiaA, H_linA, H_PkA, H_PmA, H_TmA, H_UsA, H_HhA, H_obsa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPREA1")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
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
               stmt.setDate(5, (java.util.Date)parms[5]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[16], 200);
               }
               return;
      }
   }

}

