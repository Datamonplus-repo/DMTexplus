package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plaundry extends GXProcedure
{
   public plaundry( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plaundry.class ), "" );
   }

   public plaundry( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      plaundry.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      plaundry.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plaundry.this.AV34Discod = aP1[0];
      this.aP1 = aP1;
      plaundry.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      plaundry.this.AV32PreKgm = aP3[0];
      this.aP3 = aP3;
      plaundry.this.AV33PreMts = aP4[0];
      this.aP4 = aP4;
      plaundry.this.AV23Proforpk = aP5[0];
      this.aP5 = aP5;
      plaundry.this.AV22Proforpm = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32PreKgm = DecimalUtil.doubleToDec(0) ;
      AV33PreMts = DecimalUtil.doubleToDec(0) ;
      Gx_msg = " " ;
      /* Using cursor P01NV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV34Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01NV2_A361DisCod[0] ;
         A252CliCod = P01NV2_A252CliCod[0] ;
         A335DisArtCod = P01NV2_A335DisArtCod[0] ;
         A362DisColNom = P01NV2_A362DisColNom[0] ;
         n362DisColNom = P01NV2_n362DisColNom[0] ;
         A363DisColNum = P01NV2_A363DisColNum[0] ;
         n363DisColNum = P01NV2_n363DisColNum[0] ;
         A390DisTipCol = P01NV2_A390DisTipCol[0] ;
         n390DisTipCol = P01NV2_n390DisTipCol[0] ;
         A5025DisGraCob = P01NV2_A5025DisGraCob[0] ;
         AV25Clicod = A252CliCod ;
         AV26Artcod = A335DisArtCod ;
         AV29Discolnom = A362DisColNom ;
         AV30Discolnum = A363DisColNum ;
         AV31DisTipCol = A390DisTipCol ;
         AV22Proforpm = DecimalUtil.doubleToDec(0) ;
         AV23Proforpk = DecimalUtil.doubleToDec(0) ;
         AV24P_forcod = " " ;
         /* Using cursor P01NV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P01NV3_A764ProForCod[0] ;
            A5377DisQuiLin = P01NV3_A5377DisQuiLin[0] ;
            A368DisFasLin = P01NV3_A368DisFasLin[0] ;
            A758ProCod = P01NV3_A758ProCod[0] ;
            AV24P_forcod = A764ProForCod ;
            /* Execute user subroutine: 'PREQL' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'CLARPD' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A5025DisGraCob = (byte)(0) ;
         if ( ( AV32PreKgm.doubleValue() == 0 ) && ( AV33PreMts.doubleValue() == 0 ) )
         {
            A5025DisGraCob = (byte)(99) ;
            Gx_msg = httpContext.getMessage( "Atencion. Este Pedido NO tiene PRECIO¡¡¡", "") ;
         }
         /* Using cursor P01NV4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A5025DisGraCob), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PREQL' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P01NV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV25Clicod), AV24P_forcod});
      c5448ProForPK = P01NV5_A5448ProForPK[0] ;
      n5448ProForPK = P01NV5_n5448ProForPK[0] ;
      c5447ProForPM = P01NV5_A5447ProForPM[0] ;
      n5447ProForPM = P01NV5_n5447ProForPM[0] ;
      pr_default.close(3);
      AV23Proforpk = AV23Proforpk.add(c5448ProForPK) ;
      AV22Proforpm = AV22Proforpm.add(c5447ProForPM) ;
      /* End optimized group. */
   }

   public void S121( )
   {
      /* 'CLARPD' Routine */
      returnInSub = false ;
      /* Using cursor P01NV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV34Discod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P01NV6_A361DisCod[0] ;
         A368DisFasLin = P01NV6_A368DisFasLin[0] ;
         A758ProCod = P01NV6_A758ProCod[0] ;
         AV27ForProC = A758ProCod ;
         /* Execute user subroutine: 'PRECIOP' */
         S135 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S135( )
   {
      /* 'PRECIOP' Routine */
      returnInSub = false ;
      AV28facLam = "" ;
      /* Using cursor P01NV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV25Clicod), AV26Artcod, AV29Discolnom, Integer.valueOf(AV30Discolnum), Byte.valueOf(AV31DisTipCol), AV27ForProC});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A9766ForProC = P01NV7_A9766ForProC[0] ;
         A831TipColCod = P01NV7_A831TipColCod[0] ;
         A483ForColNum = P01NV7_A483ForColNum[0] ;
         A482ForColNom = P01NV7_A482ForColNom[0] ;
         A494ForSer = P01NV7_A494ForSer[0] ;
         A252CliCod = P01NV7_A252CliCod[0] ;
         A9768ForProPK = P01NV7_A9768ForProPK[0] ;
         n9768ForProPK = P01NV7_n9768ForProPK[0] ;
         A9769ForProPM = P01NV7_A9769ForProPM[0] ;
         n9769ForProPM = P01NV7_n9769ForProPM[0] ;
         A10137FacLam = P01NV7_A10137FacLam[0] ;
         n10137FacLam = P01NV7_n10137FacLam[0] ;
         AV32PreKgm = A9768ForProPK ;
         AV33PreMts = A9769ForProPM ;
         AV28facLam = A10137FacLam ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = plaundry.this.A396EmprCod;
      this.aP1[0] = plaundry.this.AV34Discod;
      this.aP2[0] = plaundry.this.Gx_msg;
      this.aP3[0] = plaundry.this.AV32PreKgm;
      this.aP4[0] = plaundry.this.AV33PreMts;
      this.aP5[0] = plaundry.this.AV23Proforpk;
      this.aP6[0] = plaundry.this.AV22Proforpm;
      Application.commitDataStores(context, remoteHandle, pr_default, "plaundry");
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
      P01NV2_A396EmprCod = new String[] {""} ;
      P01NV2_A361DisCod = new int[1] ;
      P01NV2_A252CliCod = new int[1] ;
      P01NV2_A335DisArtCod = new String[] {""} ;
      P01NV2_A362DisColNom = new String[] {""} ;
      P01NV2_n362DisColNom = new boolean[] {false} ;
      P01NV2_A363DisColNum = new int[1] ;
      P01NV2_n363DisColNum = new boolean[] {false} ;
      P01NV2_A390DisTipCol = new byte[1] ;
      P01NV2_n390DisTipCol = new boolean[] {false} ;
      P01NV2_A5025DisGraCob = new byte[1] ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV26Artcod = "" ;
      AV29Discolnom = "" ;
      AV24P_forcod = "" ;
      P01NV3_A396EmprCod = new String[] {""} ;
      P01NV3_A361DisCod = new int[1] ;
      P01NV3_A764ProForCod = new String[] {""} ;
      P01NV3_A5377DisQuiLin = new short[1] ;
      P01NV3_A368DisFasLin = new short[1] ;
      P01NV3_A758ProCod = new String[] {""} ;
      A764ProForCod = "" ;
      A758ProCod = "" ;
      c5448ProForPK = DecimalUtil.ZERO ;
      c5447ProForPM = DecimalUtil.ZERO ;
      P01NV5_A5448ProForPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NV5_n5448ProForPK = new boolean[] {false} ;
      P01NV5_A5447ProForPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NV5_n5447ProForPM = new boolean[] {false} ;
      P01NV6_A396EmprCod = new String[] {""} ;
      P01NV6_A361DisCod = new int[1] ;
      P01NV6_A368DisFasLin = new short[1] ;
      P01NV6_A758ProCod = new String[] {""} ;
      AV27ForProC = "" ;
      AV28facLam = "" ;
      P01NV7_A396EmprCod = new String[] {""} ;
      P01NV7_A9766ForProC = new String[] {""} ;
      P01NV7_A831TipColCod = new byte[1] ;
      P01NV7_A483ForColNum = new int[1] ;
      P01NV7_A482ForColNom = new String[] {""} ;
      P01NV7_A494ForSer = new String[] {""} ;
      P01NV7_A252CliCod = new int[1] ;
      P01NV7_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NV7_n9768ForProPK = new boolean[] {false} ;
      P01NV7_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NV7_n9769ForProPM = new boolean[] {false} ;
      P01NV7_A10137FacLam = new String[] {""} ;
      P01NV7_n10137FacLam = new boolean[] {false} ;
      A9766ForProC = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      A9769ForProPM = DecimalUtil.ZERO ;
      A10137FacLam = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plaundry__default(),
         new Object[] {
             new Object[] {
            P01NV2_A396EmprCod, P01NV2_A361DisCod, P01NV2_A252CliCod, P01NV2_A335DisArtCod, P01NV2_A362DisColNom, P01NV2_n362DisColNom, P01NV2_A363DisColNum, P01NV2_n363DisColNum, P01NV2_A390DisTipCol, P01NV2_n390DisTipCol,
            P01NV2_A5025DisGraCob
            }
            , new Object[] {
            P01NV3_A396EmprCod, P01NV3_A361DisCod, P01NV3_A764ProForCod, P01NV3_A5377DisQuiLin, P01NV3_A368DisFasLin, P01NV3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01NV5_A5448ProForPK, P01NV5_n5448ProForPK, P01NV5_A5447ProForPM, P01NV5_n5447ProForPM
            }
            , new Object[] {
            P01NV6_A396EmprCod, P01NV6_A361DisCod, P01NV6_A368DisFasLin, P01NV6_A758ProCod
            }
            , new Object[] {
            P01NV7_A396EmprCod, P01NV7_A9766ForProC, P01NV7_A831TipColCod, P01NV7_A483ForColNum, P01NV7_A482ForColNom, P01NV7_A494ForSer, P01NV7_A252CliCod, P01NV7_A9768ForProPK, P01NV7_n9768ForProPK, P01NV7_A9769ForProPM,
            P01NV7_n9769ForProPM, P01NV7_A10137FacLam, P01NV7_n10137FacLam
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A390DisTipCol ;
   private byte A5025DisGraCob ;
   private byte AV31DisTipCol ;
   private byte A831TipColCod ;
   private short A5377DisQuiLin ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV34Discod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int AV25Clicod ;
   private int AV30Discolnum ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV32PreKgm ;
   private java.math.BigDecimal AV33PreMts ;
   private java.math.BigDecimal AV23Proforpk ;
   private java.math.BigDecimal AV22Proforpm ;
   private java.math.BigDecimal c5448ProForPK ;
   private java.math.BigDecimal c5447ProForPM ;
   private java.math.BigDecimal A9768ForProPK ;
   private java.math.BigDecimal A9769ForProPM ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String AV26Artcod ;
   private String AV29Discolnom ;
   private String AV24P_forcod ;
   private String A764ProForCod ;
   private String A758ProCod ;
   private String AV27ForProC ;
   private String AV28facLam ;
   private String A9766ForProC ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A10137FacLam ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean returnInSub ;
   private boolean n5448ProForPK ;
   private boolean n5447ProForPM ;
   private boolean n9768ForProPK ;
   private boolean n9769ForProPM ;
   private boolean n10137FacLam ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01NV2_A396EmprCod ;
   private int[] P01NV2_A361DisCod ;
   private int[] P01NV2_A252CliCod ;
   private String[] P01NV2_A335DisArtCod ;
   private String[] P01NV2_A362DisColNom ;
   private boolean[] P01NV2_n362DisColNom ;
   private int[] P01NV2_A363DisColNum ;
   private boolean[] P01NV2_n363DisColNum ;
   private byte[] P01NV2_A390DisTipCol ;
   private boolean[] P01NV2_n390DisTipCol ;
   private byte[] P01NV2_A5025DisGraCob ;
   private String[] P01NV3_A396EmprCod ;
   private int[] P01NV3_A361DisCod ;
   private String[] P01NV3_A764ProForCod ;
   private short[] P01NV3_A5377DisQuiLin ;
   private short[] P01NV3_A368DisFasLin ;
   private String[] P01NV3_A758ProCod ;
   private java.math.BigDecimal[] P01NV5_A5448ProForPK ;
   private boolean[] P01NV5_n5448ProForPK ;
   private java.math.BigDecimal[] P01NV5_A5447ProForPM ;
   private boolean[] P01NV5_n5447ProForPM ;
   private String[] P01NV6_A396EmprCod ;
   private int[] P01NV6_A361DisCod ;
   private short[] P01NV6_A368DisFasLin ;
   private String[] P01NV6_A758ProCod ;
   private String[] P01NV7_A396EmprCod ;
   private String[] P01NV7_A9766ForProC ;
   private byte[] P01NV7_A831TipColCod ;
   private int[] P01NV7_A483ForColNum ;
   private String[] P01NV7_A482ForColNom ;
   private String[] P01NV7_A494ForSer ;
   private int[] P01NV7_A252CliCod ;
   private java.math.BigDecimal[] P01NV7_A9768ForProPK ;
   private boolean[] P01NV7_n9768ForProPK ;
   private java.math.BigDecimal[] P01NV7_A9769ForProPM ;
   private boolean[] P01NV7_n9769ForProPM ;
   private String[] P01NV7_A10137FacLam ;
   private boolean[] P01NV7_n10137FacLam ;
}

final  class plaundry__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01NV2", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol, DisGraCob FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NV3", "SELECT EmprCod, DisCod, ProForCod, DisQuiLin, DisFasLin, ProCod FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01NV4", "UPDATE TXPDISPOS SET DisGraCob=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P01NV5", "SELECT SUM(ProForPK), SUM(ProForPM) FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NV6", "SELECT EmprCod, DisCod, DisFasLin, ProCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NV7", "SELECT EmprCod, ForProC, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForProPK, ForProPM, FacLam FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
      }
   }

}

