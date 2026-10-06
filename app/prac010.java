package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac010 extends GXProcedure
{
   public prac010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac010.class ), "" );
   }

   public prac010( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 )
   {
      prac010.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      prac010.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac010.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prac010.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac010.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prac010.this.AV20BarKgm = aP4[0];
      this.aP4 = aP4;
      prac010.this.AV21BarMtr = aP5[0];
      this.aP5 = aP5;
      prac010.this.AV24Artfacabs = aP6[0];
      this.aP6 = aP6;
      prac010.this.AV31BarAcaqui = aP7[0];
      this.aP7 = aP7;
      prac010.this.AV25Ac_acaqui = aP8[0];
      this.aP8 = aP8;
      prac010.this.AV23HumSec = aP9[0];
      this.aP9 = aP9;
      prac010.this.AV26Abs1 = aP10[0];
      this.aP10 = aP10;
      prac010.this.Gx_msg = aP11[0];
      this.aP11 = aP11;
      prac010.this.AV28Maqcod = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Artfacabs = DecimalUtil.ZERO ;
      AV25Ac_acaqui = "" ;
      /* Using cursor P02803 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02803_A252CliCod[0] ;
         n252CliCod = P02803_n252CliCod[0] ;
         A212BarSer = P02803_A212BarSer[0] ;
         A118BarAcaQui = P02803_A118BarAcaQui[0] ;
         A166BarKgm = P02803_A166BarKgm[0] ;
         A184BarMtr = P02803_A184BarMtr[0] ;
         A166BarKgm = P02803_A166BarKgm[0] ;
         A184BarMtr = P02803_A184BarMtr[0] ;
         AV20BarKgm = A166BarKgm ;
         AV21BarMtr = A184BarMtr ;
         AV16CliCod = A252CliCod ;
         AV22Barser = A212BarSer ;
         AV25Ac_acaqui = A118BarAcaQui ;
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Gx_msg = "" ;
      if ( DecimalUtil.compareTo(AV24Artfacabs, AV26Abs1) != 0 )
      {
         Gx_msg = httpContext.getMessage( "El fact Abs Hdr Agrupada ", "") + GXutil.trim( GXutil.str( AV24Artfacabs, 6, 2)) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Es diferente a la principal ", "") + GXutil.trim( GXutil.str( AV26Abs1, 6, 2)) + GXutil.newLine( ) ;
      }
      if ( GXutil.strcmp(AV31BarAcaqui, AV25Ac_acaqui) != 0 )
      {
         if ( GXutil.strcmp(Gx_msg, " ") != 0 )
         {
            Gx_msg += httpContext.getMessage( "El Acs Quimico de la Hdr Agrupada ", "") + GXutil.trim( AV25Ac_acaqui) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "es diferente a la principal ", "") + GXutil.trim( AV31BarAcaqui) + GXutil.newLine( ) ;
         }
         else
         {
            Gx_msg = httpContext.getMessage( "El Acs Quimico de la Hdr Agrupada ", "") + GXutil.trim( AV25Ac_acaqui) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "es diferente a la principal ", "") + GXutil.trim( AV31BarAcaqui) + GXutil.newLine( ) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV24Artfacabs = DecimalUtil.ZERO ;
      /* Using cursor P02804 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV22Barser, AV23HumSec, AV28Maqcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10042ArtMqFa = P02804_A10042ArtMqFa[0] ;
         A10041ArtSH = P02804_A10041ArtSH[0] ;
         A65ArtCod = P02804_A65ArtCod[0] ;
         A252CliCod = P02804_A252CliCod[0] ;
         n252CliCod = P02804_n252CliCod[0] ;
         A10044ArtFaMq = P02804_A10044ArtFaMq[0] ;
         n10044ArtFaMq = P02804_n10044ArtFaMq[0] ;
         AV24Artfacabs = A10044ArtFaMq ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24Artfacabs)==0) )
      {
         /* Using cursor P02805 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV22Barser});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A65ArtCod = P02805_A65ArtCod[0] ;
            A252CliCod = P02805_A252CliCod[0] ;
            n252CliCod = P02805_n252CliCod[0] ;
            A2791ArtFacAbs = P02805_A2791ArtFacAbs[0] ;
            n2791ArtFacAbs = P02805_n2791ArtFacAbs[0] ;
            A9730ArtFabsH = P02805_A9730ArtFabsH[0] ;
            n9730ArtFabsH = P02805_n9730ArtFabsH[0] ;
            if ( GXutil.strcmp(AV23HumSec, "S") == 0 )
            {
               AV24Artfacabs = A2791ArtFacAbs ;
            }
            else
            {
               AV24Artfacabs = A9730ArtFabsH ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24Artfacabs)==0) )
      {
         /* Using cursor P02806 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV28Maqcod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A602MaqCod = P02806_A602MaqCod[0] ;
            A6284MaqFacAbs = P02806_A6284MaqFacAbs[0] ;
            n6284MaqFacAbs = P02806_n6284MaqFacAbs[0] ;
            A9982MaqFabsHm = P02806_A9982MaqFabsHm[0] ;
            n9982MaqFabsHm = P02806_n9982MaqFabsHm[0] ;
            AV29MaqfacAbs = A6284MaqFacAbs ;
            AV30Maqfabsh = A9982MaqFabsHm ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( GXutil.strcmp(AV23HumSec, "S") == 0 )
         {
            AV24Artfacabs = AV29MaqfacAbs ;
         }
         else
         {
            AV24Artfacabs = AV30Maqfabsh ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac010.this.A396EmprCod;
      this.aP1[0] = prac010.this.A129BarCod;
      this.aP2[0] = prac010.this.A132BarCodReo;
      this.aP3[0] = prac010.this.A130BarCodPar;
      this.aP4[0] = prac010.this.AV20BarKgm;
      this.aP5[0] = prac010.this.AV21BarMtr;
      this.aP6[0] = prac010.this.AV24Artfacabs;
      this.aP7[0] = prac010.this.AV31BarAcaqui;
      this.aP8[0] = prac010.this.AV25Ac_acaqui;
      this.aP9[0] = prac010.this.AV23HumSec;
      this.aP10[0] = prac010.this.AV26Abs1;
      this.aP11[0] = prac010.this.Gx_msg;
      this.aP12[0] = prac010.this.AV28Maqcod;
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
      P02803_A396EmprCod = new String[] {""} ;
      P02803_A129BarCod = new int[1] ;
      P02803_A132BarCodReo = new byte[1] ;
      P02803_A130BarCodPar = new String[] {""} ;
      P02803_A252CliCod = new int[1] ;
      P02803_n252CliCod = new boolean[] {false} ;
      P02803_A212BarSer = new String[] {""} ;
      P02803_A118BarAcaQui = new String[] {""} ;
      P02803_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02803_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A212BarSer = "" ;
      A118BarAcaQui = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV22Barser = "" ;
      P02804_A396EmprCod = new String[] {""} ;
      P02804_A10042ArtMqFa = new String[] {""} ;
      P02804_A10041ArtSH = new String[] {""} ;
      P02804_A65ArtCod = new String[] {""} ;
      P02804_A252CliCod = new int[1] ;
      P02804_n252CliCod = new boolean[] {false} ;
      P02804_A10044ArtFaMq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02804_n10044ArtFaMq = new boolean[] {false} ;
      A10042ArtMqFa = "" ;
      A10041ArtSH = "" ;
      A65ArtCod = "" ;
      A10044ArtFaMq = DecimalUtil.ZERO ;
      P02805_A396EmprCod = new String[] {""} ;
      P02805_A65ArtCod = new String[] {""} ;
      P02805_A252CliCod = new int[1] ;
      P02805_n252CliCod = new boolean[] {false} ;
      P02805_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02805_n2791ArtFacAbs = new boolean[] {false} ;
      P02805_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02805_n9730ArtFabsH = new boolean[] {false} ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      P02806_A396EmprCod = new String[] {""} ;
      P02806_A602MaqCod = new String[] {""} ;
      P02806_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02806_n6284MaqFacAbs = new boolean[] {false} ;
      P02806_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02806_n9982MaqFabsHm = new boolean[] {false} ;
      A602MaqCod = "" ;
      A6284MaqFacAbs = DecimalUtil.ZERO ;
      A9982MaqFabsHm = DecimalUtil.ZERO ;
      AV29MaqfacAbs = DecimalUtil.ZERO ;
      AV30Maqfabsh = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac010__default(),
         new Object[] {
             new Object[] {
            P02803_A396EmprCod, P02803_A129BarCod, P02803_A132BarCodReo, P02803_A130BarCodPar, P02803_A252CliCod, P02803_n252CliCod, P02803_A212BarSer, P02803_A118BarAcaQui, P02803_A166BarKgm, P02803_A184BarMtr
            }
            , new Object[] {
            P02804_A396EmprCod, P02804_A10042ArtMqFa, P02804_A10041ArtSH, P02804_A65ArtCod, P02804_A252CliCod, P02804_A10044ArtFaMq, P02804_n10044ArtFaMq
            }
            , new Object[] {
            P02805_A396EmprCod, P02805_A65ArtCod, P02805_A252CliCod, P02805_A2791ArtFacAbs, P02805_n2791ArtFacAbs, P02805_A9730ArtFabsH, P02805_n9730ArtFabsH
            }
            , new Object[] {
            P02806_A396EmprCod, P02806_A602MaqCod, P02806_A6284MaqFacAbs, P02806_n6284MaqFacAbs, P02806_A9982MaqFabsHm, P02806_n9982MaqFabsHm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private java.math.BigDecimal AV20BarKgm ;
   private java.math.BigDecimal AV21BarMtr ;
   private java.math.BigDecimal AV24Artfacabs ;
   private java.math.BigDecimal AV26Abs1 ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A10044ArtFaMq ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9730ArtFabsH ;
   private java.math.BigDecimal A6284MaqFacAbs ;
   private java.math.BigDecimal A9982MaqFabsHm ;
   private java.math.BigDecimal AV29MaqfacAbs ;
   private java.math.BigDecimal AV30Maqfabsh ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV31BarAcaqui ;
   private String AV25Ac_acaqui ;
   private String AV23HumSec ;
   private String Gx_msg ;
   private String AV28Maqcod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A118BarAcaQui ;
   private String AV22Barser ;
   private String A10042ArtMqFa ;
   private String A10041ArtSH ;
   private String A65ArtCod ;
   private String A602MaqCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n10044ArtFaMq ;
   private boolean n2791ArtFacAbs ;
   private boolean n9730ArtFabsH ;
   private boolean n6284MaqFacAbs ;
   private boolean n9982MaqFabsHm ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02803_A396EmprCod ;
   private int[] P02803_A129BarCod ;
   private byte[] P02803_A132BarCodReo ;
   private String[] P02803_A130BarCodPar ;
   private int[] P02803_A252CliCod ;
   private boolean[] P02803_n252CliCod ;
   private String[] P02803_A212BarSer ;
   private String[] P02803_A118BarAcaQui ;
   private java.math.BigDecimal[] P02803_A166BarKgm ;
   private java.math.BigDecimal[] P02803_A184BarMtr ;
   private String[] P02804_A396EmprCod ;
   private String[] P02804_A10042ArtMqFa ;
   private String[] P02804_A10041ArtSH ;
   private String[] P02804_A65ArtCod ;
   private int[] P02804_A252CliCod ;
   private boolean[] P02804_n252CliCod ;
   private java.math.BigDecimal[] P02804_A10044ArtFaMq ;
   private boolean[] P02804_n10044ArtFaMq ;
   private String[] P02805_A396EmprCod ;
   private String[] P02805_A65ArtCod ;
   private int[] P02805_A252CliCod ;
   private boolean[] P02805_n252CliCod ;
   private java.math.BigDecimal[] P02805_A2791ArtFacAbs ;
   private boolean[] P02805_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P02805_A9730ArtFabsH ;
   private boolean[] P02805_n9730ArtFabsH ;
   private String[] P02806_A396EmprCod ;
   private String[] P02806_A602MaqCod ;
   private java.math.BigDecimal[] P02806_A6284MaqFacAbs ;
   private boolean[] P02806_n6284MaqFacAbs ;
   private java.math.BigDecimal[] P02806_A9982MaqFabsHm ;
   private boolean[] P02806_n9982MaqFabsHm ;
}

final  class prac010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02803", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarSer, T1.BarAcaQui, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02804", "SELECT EmprCod, ArtMqFa, ArtSH, ArtCod, CliCod, ArtFaMq FROM TXPCLATF1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtSH = ? and ArtMqFa = ? ORDER BY EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02805", "SELECT EmprCod, ArtCod, CliCod, ArtFacAbs, ArtFabsH FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02806", "SELECT EmprCod, MaqCod, MaqFacAbs, MaqFabsHm FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

