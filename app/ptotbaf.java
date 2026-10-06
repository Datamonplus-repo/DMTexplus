package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotbaf extends GXProcedure
{
   public ptotbaf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotbaf.class ), "" );
   }

   public ptotbaf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      ptotbaf.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      ptotbaf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotbaf.this.A1294FacBarCod = aP1[0];
      this.aP1 = aP1;
      ptotbaf.this.A1295FacBarReo = aP2[0];
      this.aP2 = aP2;
      ptotbaf.this.A1296FacBarPar = aP3[0];
      this.aP3 = aP3;
      ptotbaf.this.AV8TotFac = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TotFac = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00KF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12197FacUnds = P00KF2_A12197FacUnds[0] ;
         A3897FacKgsA = P00KF2_A3897FacKgsA[0] ;
         A3898FacPreKgsA = P00KF2_A3898FacPreKgsA[0] ;
         A12198FacPreUnd = P00KF2_A12198FacPreUnd[0] ;
         A449FacPreMts = P00KF2_A449FacPreMts[0] ;
         A5353FacImpMan = P00KF2_A5353FacImpMan[0] ;
         A447FacMts = P00KF2_A447FacMts[0] ;
         A444FacKgs = P00KF2_A444FacKgs[0] ;
         A448FacPreKgs = P00KF2_A448FacPreKgs[0] ;
         A5355FacImpMin = P00KF2_A5355FacImpMin[0] ;
         A430FacCod = P00KF2_A430FacCod[0] ;
         A446FacLin = P00KF2_A446FacLin[0] ;
         A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
         if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
         {
            A3923FacImp1 = A5355FacImpMin ;
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
            {
               A3923FacImp1 = A5353FacImpMan ;
            }
            else
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
               {
                  A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A3923FacImp1 = A2239FacIml ;
               }
            }
         }
         A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
         AV8TotFac = AV8TotFac.add(A438FacImp) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotbaf.this.A396EmprCod;
      this.aP1[0] = ptotbaf.this.A1294FacBarCod;
      this.aP2[0] = ptotbaf.this.A1295FacBarReo;
      this.aP3[0] = ptotbaf.this.A1296FacBarPar;
      this.aP4[0] = ptotbaf.this.AV8TotFac;
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
      P00KF2_A396EmprCod = new String[] {""} ;
      P00KF2_A1294FacBarCod = new int[1] ;
      P00KF2_A1295FacBarReo = new byte[1] ;
      P00KF2_A1296FacBarPar = new String[] {""} ;
      P00KF2_A12197FacUnds = new int[1] ;
      P00KF2_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KF2_A430FacCod = new int[1] ;
      P00KF2_A446FacLin = new int[1] ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotbaf__default(),
         new Object[] {
             new Object[] {
            P00KF2_A396EmprCod, P00KF2_A1294FacBarCod, P00KF2_A1295FacBarReo, P00KF2_A1296FacBarPar, P00KF2_A12197FacUnds, P00KF2_A3897FacKgsA, P00KF2_A3898FacPreKgsA, P00KF2_A12198FacPreUnd, P00KF2_A449FacPreMts, P00KF2_A5353FacImpMan,
            P00KF2_A447FacMts, P00KF2_A444FacKgs, P00KF2_A448FacPreKgs, P00KF2_A5355FacImpMin, P00KF2_A430FacCod, P00KF2_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1295FacBarReo ;
   private short Gx_err ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int A430FacCod ;
   private int A446FacLin ;
   private java.math.BigDecimal AV8TotFac ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private String A396EmprCod ;
   private String A1296FacBarPar ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00KF2_A396EmprCod ;
   private int[] P00KF2_A1294FacBarCod ;
   private byte[] P00KF2_A1295FacBarReo ;
   private String[] P00KF2_A1296FacBarPar ;
   private int[] P00KF2_A12197FacUnds ;
   private java.math.BigDecimal[] P00KF2_A3897FacKgsA ;
   private java.math.BigDecimal[] P00KF2_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P00KF2_A12198FacPreUnd ;
   private java.math.BigDecimal[] P00KF2_A449FacPreMts ;
   private java.math.BigDecimal[] P00KF2_A5353FacImpMan ;
   private java.math.BigDecimal[] P00KF2_A447FacMts ;
   private java.math.BigDecimal[] P00KF2_A444FacKgs ;
   private java.math.BigDecimal[] P00KF2_A448FacPreKgs ;
   private java.math.BigDecimal[] P00KF2_A5355FacImpMin ;
   private int[] P00KF2_A430FacCod ;
   private int[] P00KF2_A446FacLin ;
}

final  class ptotbaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00KF2", "SELECT EmprCod, FacBarCod, FacBarReo, FacBarPar, FacUnds, FacKgsA, FacPreKgsA, FacPreUnd, FacPreMts, FacImpMan, FacMts, FacKgs, FacPreKgs, FacImpMin, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ? ORDER BY EmprCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
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
      }
   }

}

