package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizarcontval2 extends GXProcedure
{
   public actualizarcontval2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizarcontval2.class ), "" );
   }

   public actualizarcontval2( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 )
   {
      actualizarcontval2.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long[] aP2 )
   {
      actualizarcontval2.this.A396EmprCod = aP0;
      actualizarcontval2.this.A313ContCod = aP1;
      actualizarcontval2.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A313ContCod ,
                                           Long.valueOf(A1147ContVal2) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING
                                           }
      });
      /* Using cursor P08V02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1147ContVal2 = P08V02_A1147ContVal2[0] ;
         A1147ContVal2 = AV9ContVal2 ;
         /* Using cursor P08V03 */
         pr_default.execute(1, new Object[] {Long.valueOf(A1147ContVal2), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "actualizarcontval2");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = actualizarcontval2.this.AV9ContVal2;
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
      P08V02_A396EmprCod = new String[] {""} ;
      P08V02_A313ContCod = new String[] {""} ;
      P08V02_A1147ContVal2 = new long[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.actualizarcontval2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.actualizarcontval2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.actualizarcontval2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.actualizarcontval2__default(),
         new Object[] {
             new Object[] {
            P08V02_A396EmprCod, P08V02_A313ContCod, P08V02_A1147ContVal2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV9ContVal2 ;
   private long A1147ContVal2 ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P08V02_A396EmprCod ;
   private String[] P08V02_A313ContCod ;
   private long[] P08V02_A1147ContVal2 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class actualizarcontval2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizarcontval2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizarcontval2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class actualizarcontval2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08V02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A313ContCod ,
                                          long A1147ContVal2 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[2];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, ContCod, ContVal2 FROM TXPEMPLIN" ;
      addWhere(sWhereString, "(EmprCod = ? and ContCod = ?)");
      if ( GXutil.strcmp(A313ContCod, "VERSEM") == 0 )
      {
         addWhere(sWhereString, "((ContVal2 = 0) or ContVal2 IS NULL)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, ContCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08V02(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08V02", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08V03", "UPDATE TXPEMPLIN SET ContVal2=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 6);
               }
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

