package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactalm0 extends GXProcedure
{
   public pactalm0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactalm0.class ), "" );
   }

   public pactalm0( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pactalm0.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pactalm0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactalm0.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV9FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
      pactalm0.this.AV9FlagPreMed = GXv_int1[0] ;
      GXt_int2 = AV10Val_stk ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int1) ;
      pactalm0.this.GXt_int2 = GXv_int1[0] ;
      AV10Val_stk = GXt_int2 ;
      GXv_int1[0] = AV11NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pactalm0.this.AV11NCLec = GXv_int1[0] ;
      /* Using cursor P00MZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P00MZ2_A704PrdExiAlm[0] ;
         A750PrdValStk = P00MZ2_A750PrdValStk[0] ;
         A704PrdExiAlm = DecimalUtil.doubleToDec(0) ;
         if ( ( AV9FlagPreMed == 1 ) || ( AV10Val_stk == 1 ) )
         {
            A750PrdValStk = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor P00MZ3 */
         pr_default.execute(1, new Object[] {A704PrdExiAlm, A750PrdValStk, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pactalm0");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactalm0.this.A396EmprCod;
      this.aP1[0] = pactalm0.this.A719PrdNum;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00MZ2_A396EmprCod = new String[] {""} ;
      P00MZ2_A719PrdNum = new String[] {""} ;
      P00MZ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MZ2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pactalm0__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pactalm0__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pactalm0__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactalm0__default(),
         new Object[] {
             new Object[] {
            P00MZ2_A396EmprCod, P00MZ2_A719PrdNum, P00MZ2_A704PrdExiAlm, P00MZ2_A750PrdValStk
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9FlagPreMed ;
   private byte AV10Val_stk ;
   private byte GXt_int2 ;
   private byte AV11NCLec ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A750PrdValStk ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MZ2_A396EmprCod ;
   private String[] P00MZ2_A719PrdNum ;
   private java.math.BigDecimal[] P00MZ2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00MZ2_A750PrdValStk ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pactalm0__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pactalm0__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pactalm0__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pactalm0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MZ2", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdValStk FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00MZ3", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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

