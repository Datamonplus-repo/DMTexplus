package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacumkgs extends GXProcedure
{
   public pacumkgs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacumkgs.class ), "" );
   }

   public pacumkgs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           java.math.BigDecimal[] aP3 )
   {
      pacumkgs.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 )
   {
      pacumkgs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacumkgs.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pacumkgs.this.AV8Kgs_Fra = aP2[0];
      this.aP2 = aP2;
      pacumkgs.this.AV19Kgs_otros = aP3[0];
      this.aP3 = aP3;
      pacumkgs.this.AV18Carvema = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16LastFacHdr = " " ;
      AV12FacKgs = DecimalUtil.doubleToDec(0) ;
      AV9Hdr = GXutil.space( (short)(10)) ;
      AV10LastHdr = GXutil.space( (short)(10)) ;
      AV11Empieza_ = (byte)(0) ;
      AV14LastAlbCod = 0 ;
      AV8Kgs_Fra = DecimalUtil.doubleToDec(0) ;
      AV19Kgs_otros = DecimalUtil.doubleToDec(0) ;
      if ( AV18Carvema == 0 )
      {
         /* Using cursor P0AO32 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A430FacCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A447FacMts = P0AO32_A447FacMts[0] ;
            A449FacPreMts = P0AO32_A449FacPreMts[0] ;
            A444FacKgs = P0AO32_A444FacKgs[0] ;
            A448FacPreKgs = P0AO32_A448FacPreKgs[0] ;
            A3397FacFasCod = P0AO32_A3397FacFasCod[0] ;
            A1296FacBarPar = P0AO32_A1296FacBarPar[0] ;
            A1295FacBarReo = P0AO32_A1295FacBarReo[0] ;
            A1294FacBarCod = P0AO32_A1294FacBarCod[0] ;
            A427FacAlbCod = P0AO32_A427FacAlbCod[0] ;
            A446FacLin = P0AO32_A446FacLin[0] ;
            AV15Fac_hdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
            if ( GXutil.strcmp(AV15Fac_hdr, AV16LastFacHdr) != 0 )
            {
               if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) && ( GXutil.strcmp(A3397FacFasCod, " ") == 0 ) )
               {
                  AV8Kgs_Fra = AV8Kgs_Fra.add(A444FacKgs) ;
               }
               if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
               {
                  AV17TotMts = AV17TotMts.add(A447FacMts) ;
               }
            }
            AV16LastFacHdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P0AO33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A448FacPreKgs = P0AO33_A448FacPreKgs[0] ;
            A444FacKgs = P0AO33_A444FacKgs[0] ;
            A447FacMts = P0AO33_A447FacMts[0] ;
            A449FacPreMts = P0AO33_A449FacPreMts[0] ;
            A3397FacFasCod = P0AO33_A3397FacFasCod[0] ;
            A1296FacBarPar = P0AO33_A1296FacBarPar[0] ;
            A1295FacBarReo = P0AO33_A1295FacBarReo[0] ;
            A1294FacBarCod = P0AO33_A1294FacBarCod[0] ;
            A427FacAlbCod = P0AO33_A427FacAlbCod[0] ;
            A446FacLin = P0AO33_A446FacLin[0] ;
            AV15Fac_hdr = GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
            if ( GXutil.strcmp(AV16LastFacHdr, AV15Fac_hdr) != 0 )
            {
               AV8Kgs_Fra = AV8Kgs_Fra.add((((A444FacKgs.doubleValue()>0)&&(A448FacPreKgs.doubleValue()>0)&&(GXutil.strcmp("", A3397FacFasCod)==0) ? A444FacKgs : DecimalUtil.doubleToDec(0)))) ;
               AV19Kgs_otros = AV19Kgs_otros.add((((A444FacKgs.doubleValue()>0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0)&&(GXutil.strcmp("", A3397FacFasCod)==0) ? A444FacKgs : DecimalUtil.doubleToDec(0)))) ;
               AV17TotMts = AV17TotMts.add((((A449FacPreMts.doubleValue()>0)&&(A447FacMts.doubleValue()>0) ? A447FacMts : DecimalUtil.doubleToDec(0)))) ;
            }
            AV16LastFacHdr = GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacumkgs.this.A396EmprCod;
      this.aP1[0] = pacumkgs.this.A430FacCod;
      this.aP2[0] = pacumkgs.this.AV8Kgs_Fra;
      this.aP3[0] = pacumkgs.this.AV19Kgs_otros;
      this.aP4[0] = pacumkgs.this.AV18Carvema;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16LastFacHdr = "" ;
      AV12FacKgs = DecimalUtil.ZERO ;
      AV9Hdr = "" ;
      AV10LastHdr = "" ;
      scmdbuf = "" ;
      P0AO32_A396EmprCod = new String[] {""} ;
      P0AO32_A430FacCod = new int[1] ;
      P0AO32_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO32_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO32_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO32_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO32_A3397FacFasCod = new String[] {""} ;
      P0AO32_A1296FacBarPar = new String[] {""} ;
      P0AO32_A1295FacBarReo = new byte[1] ;
      P0AO32_A1294FacBarCod = new int[1] ;
      P0AO32_A427FacAlbCod = new long[1] ;
      P0AO32_A446FacLin = new int[1] ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      A1296FacBarPar = "" ;
      AV15Fac_hdr = "" ;
      AV17TotMts = DecimalUtil.ZERO ;
      P0AO33_A396EmprCod = new String[] {""} ;
      P0AO33_A430FacCod = new int[1] ;
      P0AO33_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO33_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO33_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO33_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AO33_A3397FacFasCod = new String[] {""} ;
      P0AO33_A1296FacBarPar = new String[] {""} ;
      P0AO33_A1295FacBarReo = new byte[1] ;
      P0AO33_A1294FacBarCod = new int[1] ;
      P0AO33_A427FacAlbCod = new long[1] ;
      P0AO33_A446FacLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacumkgs__default(),
         new Object[] {
             new Object[] {
            P0AO32_A396EmprCod, P0AO32_A430FacCod, P0AO32_A447FacMts, P0AO32_A449FacPreMts, P0AO32_A444FacKgs, P0AO32_A448FacPreKgs, P0AO32_A3397FacFasCod, P0AO32_A1296FacBarPar, P0AO32_A1295FacBarReo, P0AO32_A1294FacBarCod,
            P0AO32_A427FacAlbCod, P0AO32_A446FacLin
            }
            , new Object[] {
            P0AO33_A396EmprCod, P0AO33_A430FacCod, P0AO33_A448FacPreKgs, P0AO33_A444FacKgs, P0AO33_A447FacMts, P0AO33_A449FacPreMts, P0AO33_A3397FacFasCod, P0AO33_A1296FacBarPar, P0AO33_A1295FacBarReo, P0AO33_A1294FacBarCod,
            P0AO33_A427FacAlbCod, P0AO33_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Carvema ;
   private byte AV11Empieza_ ;
   private byte A1295FacBarReo ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private long AV14LastAlbCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal AV8Kgs_Fra ;
   private java.math.BigDecimal AV19Kgs_otros ;
   private java.math.BigDecimal AV12FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal AV17TotMts ;
   private String A396EmprCod ;
   private String AV16LastFacHdr ;
   private String AV9Hdr ;
   private String AV10LastHdr ;
   private String scmdbuf ;
   private String A3397FacFasCod ;
   private String A1296FacBarPar ;
   private String AV15Fac_hdr ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AO32_A396EmprCod ;
   private int[] P0AO32_A430FacCod ;
   private java.math.BigDecimal[] P0AO32_A447FacMts ;
   private java.math.BigDecimal[] P0AO32_A449FacPreMts ;
   private java.math.BigDecimal[] P0AO32_A444FacKgs ;
   private java.math.BigDecimal[] P0AO32_A448FacPreKgs ;
   private String[] P0AO32_A3397FacFasCod ;
   private String[] P0AO32_A1296FacBarPar ;
   private byte[] P0AO32_A1295FacBarReo ;
   private int[] P0AO32_A1294FacBarCod ;
   private long[] P0AO32_A427FacAlbCod ;
   private int[] P0AO32_A446FacLin ;
   private String[] P0AO33_A396EmprCod ;
   private int[] P0AO33_A430FacCod ;
   private java.math.BigDecimal[] P0AO33_A448FacPreKgs ;
   private java.math.BigDecimal[] P0AO33_A444FacKgs ;
   private java.math.BigDecimal[] P0AO33_A447FacMts ;
   private java.math.BigDecimal[] P0AO33_A449FacPreMts ;
   private String[] P0AO33_A3397FacFasCod ;
   private String[] P0AO33_A1296FacBarPar ;
   private byte[] P0AO33_A1295FacBarReo ;
   private int[] P0AO33_A1294FacBarCod ;
   private long[] P0AO33_A427FacAlbCod ;
   private int[] P0AO33_A446FacLin ;
}

final  class pacumkgs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AO32", "SELECT EmprCod, FacCod, FacMts, FacPreMts, FacKgs, FacPreKgs, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacAlbCod, FacLin FROM TXPLFAVEN WHERE (FacCod = ?) AND (EmprCod = ?) AND (( FacPreKgs > 0 and FacKgs > 0) or ( FacPreMts > 0 and FacMts > 0)) ORDER BY FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AO33", "SELECT EmprCod, FacCod, FacPreKgs, FacKgs, FacMts, FacPreMts, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacAlbCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

