package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmconfa extends GXProcedure
{
   public pmconfa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmconfa.class ), "" );
   }

   public pmconfa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pmconfa.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pmconfa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmconfa.this.AV10MaqFCod = aP1[0];
      this.aP1 = aP1;
      pmconfa.this.AV8MaqCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12Nocommit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCOMM", ""), GXv_int2) ;
      pmconfa.this.GXt_int1 = GXv_int2[0] ;
      AV12Nocommit = GXt_int1 ;
      AV9MaqConFas = 0 ;
      /* Using cursor P02H12 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10MaqFCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1142MaqFCod = P02H12_A1142MaqFCod[0] ;
         A6454MaqConFas = P02H12_A6454MaqConFas[0] ;
         n6454MaqConFas = P02H12_n6454MaqConFas[0] ;
         A602MaqCod = P02H12_A602MaqCod[0] ;
         A6454MaqConFas = P02H12_A6454MaqConFas[0] ;
         n6454MaqConFas = P02H12_n6454MaqConFas[0] ;
         if ( AV9MaqConFas <= A6454MaqConFas )
         {
            AV9MaqConFas = A6454MaqConFas ;
            AV8MaqCod = A602MaqCod ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11FlagCero = (byte)(0) ;
      /* Using cursor P02H13 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8MaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P02H13_A602MaqCod[0] ;
         A6454MaqConFas = P02H13_A6454MaqConFas[0] ;
         n6454MaqConFas = P02H13_n6454MaqConFas[0] ;
         if ( A6454MaqConFas < 999999 )
         {
            A6454MaqConFas = (int)(A6454MaqConFas+1) ;
            n6454MaqConFas = false ;
         }
         else
         {
            A6454MaqConFas = 1 ;
            n6454MaqConFas = false ;
            AV11FlagCero = (byte)(1) ;
         }
         /* Using cursor P02H14 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6454MaqConFas), Integer.valueOf(A6454MaqConFas), A396EmprCod, A602MaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV11FlagCero == 1 )
      {
         /* Using cursor P02H15 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV10MaqFCod, A396EmprCod, AV10MaqFCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1142MaqFCod = P02H15_A1142MaqFCod[0] ;
            A602MaqCod = P02H15_A602MaqCod[0] ;
            /* Using cursor P02H16 */
            pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod});
            A6454MaqConFas = P02H16_A6454MaqConFas[0] ;
            n6454MaqConFas = P02H16_n6454MaqConFas[0] ;
            if ( GXutil.strcmp(A602MaqCod, AV8MaqCod) != 0 )
            {
               A6454MaqConFas = 0 ;
               n6454MaqConFas = false ;
            }
            /* Using cursor P02H17 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n6454MaqConFas), Integer.valueOf(A6454MaqConFas), A396EmprCod, A602MaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         pr_default.close(4);
      }
      if ( AV12Nocommit == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pmconfa");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmconfa.this.A396EmprCod;
      this.aP1[0] = pmconfa.this.AV10MaqFCod;
      this.aP2[0] = pmconfa.this.AV8MaqCod;
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
      P02H12_A396EmprCod = new String[] {""} ;
      P02H12_A1142MaqFCod = new String[] {""} ;
      P02H12_A6454MaqConFas = new int[1] ;
      P02H12_n6454MaqConFas = new boolean[] {false} ;
      P02H12_A602MaqCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      A602MaqCod = "" ;
      P02H13_A396EmprCod = new String[] {""} ;
      P02H13_A602MaqCod = new String[] {""} ;
      P02H13_A6454MaqConFas = new int[1] ;
      P02H13_n6454MaqConFas = new boolean[] {false} ;
      P02H15_A396EmprCod = new String[] {""} ;
      P02H15_A1142MaqFCod = new String[] {""} ;
      P02H15_A602MaqCod = new String[] {""} ;
      P02H16_A6454MaqConFas = new int[1] ;
      P02H16_n6454MaqConFas = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pmconfa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pmconfa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pmconfa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmconfa__default(),
         new Object[] {
             new Object[] {
            P02H12_A396EmprCod, P02H12_A1142MaqFCod, P02H12_A6454MaqConFas, P02H12_n6454MaqConFas, P02H12_A602MaqCod
            }
            , new Object[] {
            P02H13_A396EmprCod, P02H13_A602MaqCod, P02H13_A6454MaqConFas, P02H13_n6454MaqConFas
            }
            , new Object[] {
            }
            , new Object[] {
            P02H15_A396EmprCod, P02H15_A1142MaqFCod, P02H15_A602MaqCod
            }
            , new Object[] {
            P02H16_A6454MaqConFas, P02H16_n6454MaqConFas
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Nocommit ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV11FlagCero ;
   private short Gx_err ;
   private int AV9MaqConFas ;
   private int A6454MaqConFas ;
   private String A396EmprCod ;
   private String AV10MaqFCod ;
   private String AV8MaqCod ;
   private String scmdbuf ;
   private String A1142MaqFCod ;
   private String A602MaqCod ;
   private boolean n6454MaqConFas ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02H12_A396EmprCod ;
   private String[] P02H12_A1142MaqFCod ;
   private int[] P02H12_A6454MaqConFas ;
   private boolean[] P02H12_n6454MaqConFas ;
   private String[] P02H12_A602MaqCod ;
   private String[] P02H13_A396EmprCod ;
   private String[] P02H13_A602MaqCod ;
   private int[] P02H13_A6454MaqConFas ;
   private boolean[] P02H13_n6454MaqConFas ;
   private String[] P02H15_A396EmprCod ;
   private String[] P02H15_A1142MaqFCod ;
   private String[] P02H15_A602MaqCod ;
   private int[] P02H16_A6454MaqConFas ;
   private boolean[] P02H16_n6454MaqConFas ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pmconfa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmconfa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmconfa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmconfa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02H12", "SELECT T1.EmprCod, T1.MaqFCod, T2.MaqConFas, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.MaqFCod = ? ORDER BY T1.EmprCod, T1.MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02H13", "SELECT EmprCod, MaqCod, MaqConFas FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02H14", "UPDATE TXPMAQUIN SET MaqConFas=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
         ,new ForEachCursor("P02H15", "SELECT EmprCod, MaqFCod, MaqCod FROM TXPMAQFAS WHERE (EmprCod = ? AND MaqFCod = ?) AND (EmprCod = ? and MaqFCod = ?) ORDER BY EmprCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02H16", "SELECT MaqConFas FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02H17", "UPDATE TXPMAQUIN SET MaqConFas=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
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

