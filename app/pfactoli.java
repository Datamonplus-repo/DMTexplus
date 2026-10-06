package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfactoli extends GXProcedure
{
   public pfactoli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfactoli.class ), "" );
   }

   public pfactoli( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            long[] aP2 )
   {
      pfactoli.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        long[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             long[] aP2 ,
                             short[] aP3 )
   {
      pfactoli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfactoli.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfactoli.this.AV9FacAlbCod = aP2[0];
      this.aP2 = aP2;
      pfactoli.this.AV8TotAlb = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TotAlb = (short)(0) ;
      /* Using cursor P01ZD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A427FacAlbCod = P01ZD2_A427FacAlbCod[0] ;
         A12198FacPreUnd = P01ZD2_A12198FacPreUnd[0] ;
         A12197FacUnds = P01ZD2_A12197FacUnds[0] ;
         A3897FacKgsA = P01ZD2_A3897FacKgsA[0] ;
         A3898FacPreKgsA = P01ZD2_A3898FacPreKgsA[0] ;
         A447FacMts = P01ZD2_A447FacMts[0] ;
         A449FacPreMts = P01ZD2_A449FacPreMts[0] ;
         A444FacKgs = P01ZD2_A444FacKgs[0] ;
         A448FacPreKgs = P01ZD2_A448FacPreKgs[0] ;
         A446FacLin = P01ZD2_A446FacLin[0] ;
         A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
         if ( A427FacAlbCod == AV9FacAlbCod )
         {
            AV8TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV8TotAlb).add(A2239FacIml))) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfactoli.this.A396EmprCod;
      this.aP1[0] = pfactoli.this.A430FacCod;
      this.aP2[0] = pfactoli.this.AV9FacAlbCod;
      this.aP3[0] = pfactoli.this.AV8TotAlb;
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
      P01ZD2_A396EmprCod = new String[] {""} ;
      P01ZD2_A430FacCod = new int[1] ;
      P01ZD2_A427FacAlbCod = new long[1] ;
      P01ZD2_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A12197FacUnds = new int[1] ;
      P01ZD2_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZD2_A446FacLin = new int[1] ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfactoli__default(),
         new Object[] {
             new Object[] {
            P01ZD2_A396EmprCod, P01ZD2_A430FacCod, P01ZD2_A427FacAlbCod, P01ZD2_A12198FacPreUnd, P01ZD2_A12197FacUnds, P01ZD2_A3897FacKgsA, P01ZD2_A3898FacPreKgsA, P01ZD2_A447FacMts, P01ZD2_A449FacPreMts, P01ZD2_A444FacKgs,
            P01ZD2_A448FacPreKgs, P01ZD2_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8TotAlb ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A12197FacUnds ;
   private int A446FacLin ;
   private long AV9FacAlbCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A2239FacIml ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01ZD2_A396EmprCod ;
   private int[] P01ZD2_A430FacCod ;
   private long[] P01ZD2_A427FacAlbCod ;
   private java.math.BigDecimal[] P01ZD2_A12198FacPreUnd ;
   private int[] P01ZD2_A12197FacUnds ;
   private java.math.BigDecimal[] P01ZD2_A3897FacKgsA ;
   private java.math.BigDecimal[] P01ZD2_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P01ZD2_A447FacMts ;
   private java.math.BigDecimal[] P01ZD2_A449FacPreMts ;
   private java.math.BigDecimal[] P01ZD2_A444FacKgs ;
   private java.math.BigDecimal[] P01ZD2_A448FacPreKgs ;
   private int[] P01ZD2_A446FacLin ;
}

final  class pfactoli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ZD2", "SELECT EmprCod, FacCod, FacAlbCod, FacPreUnd, FacUnds, FacKgsA, FacPreKgsA, FacMts, FacPreMts, FacKgs, FacPreKgs, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

