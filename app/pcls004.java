package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls004 extends GXProcedure
{
   public pcls004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls004.class ), "" );
   }

   public pcls004( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pcls004.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pcls004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls004.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pcls004.this.AV8Exis = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9FlagPreMed ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pcls004.this.GXt_int1 = GXv_int2[0] ;
      AV9FlagPreMed = GXt_int1 ;
      GXt_int1 = AV11Val_stk ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int2) ;
      pcls004.this.GXt_int1 = GXv_int2[0] ;
      AV11Val_stk = GXt_int1 ;
      GXt_int3 = AV10Precio_stk ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int4) ;
      pcls004.this.GXt_int3 = GXv_int4[0] ;
      AV10Precio_stk = (byte)(GXt_int3) ;
      /* Using cursor P055N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P055N2_A704PrdExiAlm[0] ;
         A750PrdValStk = P055N2_A750PrdValStk[0] ;
         A726PrdPreMed = P055N2_A726PrdPreMed[0] ;
         A724PrdPreAct = P055N2_A724PrdPreAct[0] ;
         A704PrdExiAlm = A704PrdExiAlm.subtract(AV8Exis) ;
         if ( ( AV9FlagPreMed == 1 ) || ( AV11Val_stk == 1 ) )
         {
            if ( A750PrdValStk.doubleValue() < 0 )
            {
               A750PrdValStk = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               if ( AV10Precio_stk == 1 )
               {
                  A750PrdValStk = A750PrdValStk.subtract((((DecimalUtil.compareTo((A750PrdValStk.subtract(GXutil.roundDecimal( A726PrdPreMed.multiply(AV8Exis), 2))), DecimalUtil.stringToDec("99999999.99"))>0) ? DecimalUtil.stringToDec("99999999.99") : GXutil.roundDecimal( A726PrdPreMed.multiply(AV8Exis), 2)))) ;
               }
               else
               {
                  A750PrdValStk = A750PrdValStk.subtract((((DecimalUtil.compareTo((A750PrdValStk.subtract(GXutil.roundDecimal( A724PrdPreAct.multiply(AV8Exis), 2))), DecimalUtil.stringToDec("99999999.99"))>0) ? DecimalUtil.stringToDec("99999999.99") : GXutil.roundDecimal( A724PrdPreAct.multiply(AV8Exis), 2)))) ;
               }
            }
         }
         /* Using cursor P055N3 */
         pr_default.execute(1, new Object[] {A704PrdExiAlm, A750PrdValStk, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls004.this.A396EmprCod;
      this.aP1[0] = pcls004.this.A719PrdNum;
      this.aP2[0] = pcls004.this.AV8Exis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P055N2_A396EmprCod = new String[] {""} ;
      P055N2_A719PrdNum = new String[] {""} ;
      P055N2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055N2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055N2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055N2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls004__default(),
         new Object[] {
             new Object[] {
            P055N2_A396EmprCod, P055N2_A719PrdNum, P055N2_A704PrdExiAlm, P055N2_A750PrdValStk, P055N2_A726PrdPreMed, P055N2_A724PrdPreAct
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9FlagPreMed ;
   private byte AV11Val_stk ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV10Precio_stk ;
   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV8Exis ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P055N2_A396EmprCod ;
   private String[] P055N2_A719PrdNum ;
   private java.math.BigDecimal[] P055N2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P055N2_A750PrdValStk ;
   private java.math.BigDecimal[] P055N2_A726PrdPreMed ;
   private java.math.BigDecimal[] P055N2_A724PrdPreAct ;
}

final  class pcls004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055N2", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdValStk, PrdPreMed, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055N3", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

