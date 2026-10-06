package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacimli extends GXProcedure
{
   public pfacimli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacimli.class ), "" );
   }

   public pfacimli( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 )
   {
      pfacimli.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pfacimli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacimli.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfacimli.this.A446FacLin = aP2[0];
      this.aP2 = aP2;
      pfacimli.this.AV8FacImL = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01J22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12198FacPreUnd = P01J22_A12198FacPreUnd[0] ;
         A12197FacUnds = P01J22_A12197FacUnds[0] ;
         A3897FacKgsA = P01J22_A3897FacKgsA[0] ;
         A3898FacPreKgsA = P01J22_A3898FacPreKgsA[0] ;
         A447FacMts = P01J22_A447FacMts[0] ;
         A449FacPreMts = P01J22_A449FacPreMts[0] ;
         A444FacKgs = P01J22_A444FacKgs[0] ;
         A448FacPreKgs = P01J22_A448FacPreKgs[0] ;
         A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
         AV8FacImL = A2239FacIml ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacimli.this.A396EmprCod;
      this.aP1[0] = pfacimli.this.A430FacCod;
      this.aP2[0] = pfacimli.this.A446FacLin;
      this.aP3[0] = pfacimli.this.AV8FacImL;
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
      P01J22_A396EmprCod = new String[] {""} ;
      P01J22_A430FacCod = new int[1] ;
      P01J22_A446FacLin = new int[1] ;
      P01J22_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J22_A12197FacUnds = new int[1] ;
      P01J22_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J22_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J22_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J22_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J22_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J22_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacimli__default(),
         new Object[] {
             new Object[] {
            P01J22_A396EmprCod, P01J22_A430FacCod, P01J22_A446FacLin, P01J22_A12198FacPreUnd, P01J22_A12197FacUnds, P01J22_A3897FacKgsA, P01J22_A3898FacPreKgsA, P01J22_A447FacMts, P01J22_A449FacPreMts, P01J22_A444FacKgs,
            P01J22_A448FacPreKgs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A12197FacUnds ;
   private java.math.BigDecimal AV8FacImL ;
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
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01J22_A396EmprCod ;
   private int[] P01J22_A430FacCod ;
   private int[] P01J22_A446FacLin ;
   private java.math.BigDecimal[] P01J22_A12198FacPreUnd ;
   private int[] P01J22_A12197FacUnds ;
   private java.math.BigDecimal[] P01J22_A3897FacKgsA ;
   private java.math.BigDecimal[] P01J22_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P01J22_A447FacMts ;
   private java.math.BigDecimal[] P01J22_A449FacPreMts ;
   private java.math.BigDecimal[] P01J22_A444FacKgs ;
   private java.math.BigDecimal[] P01J22_A448FacPreKgs ;
}

final  class pfacimli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01J22", "SELECT EmprCod, FacCod, FacLin, FacPreUnd, FacUnds, FacKgsA, FacPreKgsA, FacMts, FacPreMts, FacKgs, FacPreKgs FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? and FacLin = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

