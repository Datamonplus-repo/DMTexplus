package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactalm extends GXProcedure
{
   public pactalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactalm.class ), "" );
   }

   public pactalm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pactalm.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pactalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactalm.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pactalm.this.AV14Exis = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV15FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
      pactalm.this.AV15FlagPreMed = GXv_int1[0] ;
      GXt_int2 = AV16Val_stk ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int1) ;
      pactalm.this.GXt_int2 = GXv_int1[0] ;
      AV16Val_stk = GXt_int2 ;
      GXt_int3 = AV17Precio_stk ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int4) ;
      pactalm.this.GXt_int3 = GXv_int4[0] ;
      AV17Precio_stk = (byte)(GXt_int3) ;
      GXv_int1[0] = AV18NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pactalm.this.AV18NCLec = GXv_int1[0] ;
      /* Using cursor P00MY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P00MY2_A704PrdExiAlm[0] ;
         A726PrdPreMed = P00MY2_A726PrdPreMed[0] ;
         A750PrdValStk = P00MY2_A750PrdValStk[0] ;
         A724PrdPreAct = P00MY2_A724PrdPreAct[0] ;
         A704PrdExiAlm = A704PrdExiAlm.subtract(AV14Exis) ;
         if ( ( AV15FlagPreMed == 1 ) || ( AV16Val_stk == 1 ) )
         {
            if ( AV17Precio_stk == 1 )
            {
               if ( DecimalUtil.compareTo((A750PrdValStk.subtract(GXutil.roundDecimal( A726PrdPreMed.multiply(AV14Exis), 2))), DecimalUtil.stringToDec("99999999.99")) > 0 )
               {
                  A750PrdValStk = DecimalUtil.stringToDec("99999999.99") ;
               }
               else
               {
                  A750PrdValStk = A750PrdValStk.subtract(GXutil.roundDecimal( A726PrdPreMed.multiply(AV14Exis), 2)) ;
               }
            }
            else
            {
               if ( DecimalUtil.compareTo((A750PrdValStk.subtract(GXutil.roundDecimal( A724PrdPreAct.multiply(AV14Exis), 2))), DecimalUtil.stringToDec("99999999.99")) > 0 )
               {
                  A750PrdValStk = DecimalUtil.stringToDec("99999999.99") ;
               }
               else
               {
                  A750PrdValStk = A750PrdValStk.subtract(GXutil.roundDecimal( A724PrdPreAct.multiply(AV14Exis), 2)) ;
               }
            }
         }
         /* Using cursor P00MY3 */
         pr_default.execute(1, new Object[] {A704PrdExiAlm, A750PrdValStk, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pactalm");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactalm.this.A396EmprCod;
      this.aP1[0] = pactalm.this.A719PrdNum;
      this.aP2[0] = pactalm.this.AV14Exis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int4 = new int[1] ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00MY2_A396EmprCod = new String[] {""} ;
      P00MY2_A719PrdNum = new String[] {""} ;
      P00MY2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MY2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MY2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MY2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pactalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pactalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pactalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactalm__default(),
         new Object[] {
             new Object[] {
            P00MY2_A396EmprCod, P00MY2_A719PrdNum, P00MY2_A704PrdExiAlm, P00MY2_A726PrdPreMed, P00MY2_A750PrdValStk, P00MY2_A724PrdPreAct
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagPreMed ;
   private byte AV16Val_stk ;
   private byte GXt_int2 ;
   private byte AV17Precio_stk ;
   private byte AV18NCLec ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV14Exis ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MY2_A396EmprCod ;
   private String[] P00MY2_A719PrdNum ;
   private java.math.BigDecimal[] P00MY2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00MY2_A726PrdPreMed ;
   private java.math.BigDecimal[] P00MY2_A750PrdValStk ;
   private java.math.BigDecimal[] P00MY2_A724PrdPreAct ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pactalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pactalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pactalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pactalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MY2", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdPreMed, PrdValStk, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00MY3", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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

