package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmc00 extends GXProcedure
{
   public palmc00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmc00.class ), "" );
   }

   public palmc00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      palmc00.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      palmc00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmc00.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      palmc00.this.AV15LinEnt = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      palmc00.this.GXt_int1 = GXv_int2[0] ;
      AV16NCLec = GXt_int1 ;
      /* Using cursor P03EE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8660Almc_Ult = P03EE2_A8660Almc_Ult[0] ;
         n8660Almc_Ult = P03EE2_n8660Almc_Ult[0] ;
         if ( A8660Almc_Ult <= 9998 )
         {
            AV15LinEnt = (int)(A8660Almc_Ult+1) ;
            A8660Almc_Ult = (int)(A8660Almc_Ult+1) ;
            n8660Almc_Ult = false ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha superado el numero de lineas permitido", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P03EE3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n8660Almc_Ult), Integer.valueOf(A8660Almc_Ult), A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
            if (true) break;
         }
         /* Using cursor P03EE4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n8660Almc_Ult), Integer.valueOf(A8660Almc_Ult), A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV16NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "palmc00");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmc00.this.A396EmprCod;
      this.aP1[0] = palmc00.this.A719PrdNum;
      this.aP2[0] = palmc00.this.AV15LinEnt;
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
      P03EE2_A396EmprCod = new String[] {""} ;
      P03EE2_A719PrdNum = new String[] {""} ;
      P03EE2_A8660Almc_Ult = new int[1] ;
      P03EE2_n8660Almc_Ult = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.palmc00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.palmc00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.palmc00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmc00__default(),
         new Object[] {
             new Object[] {
            P03EE2_A396EmprCod, P03EE2_A719PrdNum, P03EE2_A8660Almc_Ult, P03EE2_n8660Almc_Ult
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
   private short Gx_err ;
   private int AV15LinEnt ;
   private int A8660Almc_Ult ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private boolean n8660Almc_Ult ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03EE2_A396EmprCod ;
   private String[] P03EE2_A719PrdNum ;
   private int[] P03EE2_A8660Almc_Ult ;
   private boolean[] P03EE2_n8660Almc_Ult ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class palmc00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class palmc00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class palmc00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class palmc00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03EE2", "SELECT EmprCod, PrdNum, Almc_Ult FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03EE3", "UPDATE TXPPRODUC SET Almc_Ult=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P03EE4", "UPDATE TXPPRODUC SET Almc_Ult=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

