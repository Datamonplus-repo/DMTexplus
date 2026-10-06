package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacumkgscopy1 extends GXProcedure
{
   public pacumkgscopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacumkgscopy1.class ), "" );
   }

   public pacumkgscopy1( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          java.math.BigDecimal[] aP3 ,
                          java.math.BigDecimal[] aP4 )
   {
      pacumkgscopy1.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 )
   {
      pacumkgscopy1.this.A396EmprCod = aP0;
      pacumkgscopy1.this.A430FacCod = aP1;
      pacumkgscopy1.this.AV18Carvema = aP2;
      pacumkgscopy1.this.aP3 = aP3;
      pacumkgscopy1.this.aP4 = aP4;
      pacumkgscopy1.this.aP5 = aP5;
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
         /* Using cursor P0AU12 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A430FacCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A12197FacUnds = P0AU12_A12197FacUnds[0] ;
            A12198FacPreUnd = P0AU12_A12198FacPreUnd[0] ;
            A447FacMts = P0AU12_A447FacMts[0] ;
            A449FacPreMts = P0AU12_A449FacPreMts[0] ;
            A444FacKgs = P0AU12_A444FacKgs[0] ;
            A448FacPreKgs = P0AU12_A448FacPreKgs[0] ;
            A3397FacFasCod = P0AU12_A3397FacFasCod[0] ;
            A1296FacBarPar = P0AU12_A1296FacBarPar[0] ;
            A1295FacBarReo = P0AU12_A1295FacBarReo[0] ;
            A1294FacBarCod = P0AU12_A1294FacBarCod[0] ;
            A427FacAlbCod = P0AU12_A427FacAlbCod[0] ;
            A446FacLin = P0AU12_A446FacLin[0] ;
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
               if ( ( A12198FacPreUnd.doubleValue() > 0 ) && ( A12197FacUnds > 0 ) )
               {
                  AV20Totpcs = (int)(AV20Totpcs+A12197FacUnds) ;
               }
            }
            AV16LastFacHdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P0AU13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A448FacPreKgs = P0AU13_A448FacPreKgs[0] ;
            A444FacKgs = P0AU13_A444FacKgs[0] ;
            A447FacMts = P0AU13_A447FacMts[0] ;
            A449FacPreMts = P0AU13_A449FacPreMts[0] ;
            A3397FacFasCod = P0AU13_A3397FacFasCod[0] ;
            A1296FacBarPar = P0AU13_A1296FacBarPar[0] ;
            A1295FacBarReo = P0AU13_A1295FacBarReo[0] ;
            A1294FacBarCod = P0AU13_A1294FacBarCod[0] ;
            A427FacAlbCod = P0AU13_A427FacAlbCod[0] ;
            A446FacLin = P0AU13_A446FacLin[0] ;
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
      this.aP3[0] = pacumkgscopy1.this.AV8Kgs_Fra;
      this.aP4[0] = pacumkgscopy1.this.AV19Kgs_otros;
      this.aP5[0] = pacumkgscopy1.this.AV20Totpcs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Kgs_Fra = DecimalUtil.ZERO ;
      AV19Kgs_otros = DecimalUtil.ZERO ;
      AV16LastFacHdr = "" ;
      AV12FacKgs = DecimalUtil.ZERO ;
      AV9Hdr = "" ;
      AV10LastHdr = "" ;
      scmdbuf = "" ;
      P0AU12_A396EmprCod = new String[] {""} ;
      P0AU12_A430FacCod = new int[1] ;
      P0AU12_A12197FacUnds = new int[1] ;
      P0AU12_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU12_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU12_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU12_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU12_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU12_A3397FacFasCod = new String[] {""} ;
      P0AU12_A1296FacBarPar = new String[] {""} ;
      P0AU12_A1295FacBarReo = new byte[1] ;
      P0AU12_A1294FacBarCod = new int[1] ;
      P0AU12_A427FacAlbCod = new long[1] ;
      P0AU12_A446FacLin = new int[1] ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      A1296FacBarPar = "" ;
      AV15Fac_hdr = "" ;
      AV17TotMts = DecimalUtil.ZERO ;
      P0AU13_A396EmprCod = new String[] {""} ;
      P0AU13_A430FacCod = new int[1] ;
      P0AU13_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU13_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU13_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU13_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU13_A3397FacFasCod = new String[] {""} ;
      P0AU13_A1296FacBarPar = new String[] {""} ;
      P0AU13_A1295FacBarReo = new byte[1] ;
      P0AU13_A1294FacBarCod = new int[1] ;
      P0AU13_A427FacAlbCod = new long[1] ;
      P0AU13_A446FacLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacumkgscopy1__default(),
         new Object[] {
             new Object[] {
            P0AU12_A396EmprCod, P0AU12_A430FacCod, P0AU12_A12197FacUnds, P0AU12_A12198FacPreUnd, P0AU12_A447FacMts, P0AU12_A449FacPreMts, P0AU12_A444FacKgs, P0AU12_A448FacPreKgs, P0AU12_A3397FacFasCod, P0AU12_A1296FacBarPar,
            P0AU12_A1295FacBarReo, P0AU12_A1294FacBarCod, P0AU12_A427FacAlbCod, P0AU12_A446FacLin
            }
            , new Object[] {
            P0AU13_A396EmprCod, P0AU13_A430FacCod, P0AU13_A448FacPreKgs, P0AU13_A444FacKgs, P0AU13_A447FacMts, P0AU13_A449FacPreMts, P0AU13_A3397FacFasCod, P0AU13_A1296FacBarPar, P0AU13_A1295FacBarReo, P0AU13_A1294FacBarCod,
            P0AU13_A427FacAlbCod, P0AU13_A446FacLin
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
   private int AV20Totpcs ;
   private int A12197FacUnds ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private long AV14LastAlbCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal AV8Kgs_Fra ;
   private java.math.BigDecimal AV19Kgs_otros ;
   private java.math.BigDecimal AV12FacKgs ;
   private java.math.BigDecimal A12198FacPreUnd ;
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
   private int[] aP5 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AU12_A396EmprCod ;
   private int[] P0AU12_A430FacCod ;
   private int[] P0AU12_A12197FacUnds ;
   private java.math.BigDecimal[] P0AU12_A12198FacPreUnd ;
   private java.math.BigDecimal[] P0AU12_A447FacMts ;
   private java.math.BigDecimal[] P0AU12_A449FacPreMts ;
   private java.math.BigDecimal[] P0AU12_A444FacKgs ;
   private java.math.BigDecimal[] P0AU12_A448FacPreKgs ;
   private String[] P0AU12_A3397FacFasCod ;
   private String[] P0AU12_A1296FacBarPar ;
   private byte[] P0AU12_A1295FacBarReo ;
   private int[] P0AU12_A1294FacBarCod ;
   private long[] P0AU12_A427FacAlbCod ;
   private int[] P0AU12_A446FacLin ;
   private String[] P0AU13_A396EmprCod ;
   private int[] P0AU13_A430FacCod ;
   private java.math.BigDecimal[] P0AU13_A448FacPreKgs ;
   private java.math.BigDecimal[] P0AU13_A444FacKgs ;
   private java.math.BigDecimal[] P0AU13_A447FacMts ;
   private java.math.BigDecimal[] P0AU13_A449FacPreMts ;
   private String[] P0AU13_A3397FacFasCod ;
   private String[] P0AU13_A1296FacBarPar ;
   private byte[] P0AU13_A1295FacBarReo ;
   private int[] P0AU13_A1294FacBarCod ;
   private long[] P0AU13_A427FacAlbCod ;
   private int[] P0AU13_A446FacLin ;
}

final  class pacumkgscopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AU12", "SELECT EmprCod, FacCod, FacUnds, FacPreUnd, FacMts, FacPreMts, FacKgs, FacPreKgs, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacAlbCod, FacLin FROM TXPLFAVEN WHERE (FacCod = ?) AND (EmprCod = ?) AND (( FacPreKgs > 0 and FacKgs > 0) or ( FacPreMts > 0 and FacMts > 0) or ( FacPreUnd > 0 and FacUnds > 0)) ORDER BY FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AU13", "SELECT EmprCod, FacCod, FacPreKgs, FacKgs, FacMts, FacPreMts, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacAlbCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
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

