package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinent extends GXProcedure
{
   public plinent( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinent.class ), "" );
   }

   public plinent( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      plinent.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      plinent.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plinent.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      plinent.this.AV15LinEnt = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "PLINENT", "") );
      GXt_int1 = AV16NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      plinent.this.GXt_int1 = GXv_int2[0] ;
      AV16NCLec = GXt_int1 ;
      /* Using cursor P00AC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A847UltLinEnt = P00AC2_A847UltLinEnt[0] ;
         AV17PrdNum = A719PrdNum ;
         if ( A847UltLinEnt <= 9998 )
         {
            AV15LinEnt = (short)(A847UltLinEnt+1) ;
            A847UltLinEnt = (short)(A847UltLinEnt+1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha superado el numero de lineas permitido", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P00AC3 */
            pr_default.execute(1, new Object[] {Short.valueOf(A847UltLinEnt), A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
            if (true) break;
         }
         /* Using cursor P00AC4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A847UltLinEnt), A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV16NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "plinent");
      }
      Gx_msg = httpContext.getMessage( "Return PLINENT,Producto=", "") + AV17PrdNum ;
      System.out.println( Gx_msg );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinent.this.A396EmprCod;
      this.aP1[0] = plinent.this.A719PrdNum;
      this.aP2[0] = plinent.this.AV15LinEnt;
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
      scmdbuf = "" ;
      P00AC2_A396EmprCod = new String[] {""} ;
      P00AC2_A719PrdNum = new String[] {""} ;
      P00AC2_A847UltLinEnt = new short[1] ;
      AV17PrdNum = "" ;
      Gx_msg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.plinent__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.plinent__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.plinent__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinent__default(),
         new Object[] {
             new Object[] {
            P00AC2_A396EmprCod, P00AC2_A719PrdNum, P00AC2_A847UltLinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16NCLec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV15LinEnt ;
   private short A847UltLinEnt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String AV17PrdNum ;
   private String Gx_msg ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AC2_A396EmprCod ;
   private String[] P00AC2_A719PrdNum ;
   private short[] P00AC2_A847UltLinEnt ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class plinent__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class plinent__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class plinent__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class plinent__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AC2", "SELECT EmprCod, PrdNum, UltLinEnt FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AC3", "UPDATE TXPPRODUC SET UltLinEnt=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P00AC4", "UPDATE TXPPRODUC SET UltLinEnt=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

