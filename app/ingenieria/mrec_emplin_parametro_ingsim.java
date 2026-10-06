package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_emplin_parametro_ingsim extends GXProcedure
{
   public mrec_emplin_parametro_ingsim( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_emplin_parametro_ingsim.class ), "" );
   }

   public mrec_emplin_parametro_ingsim( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          String aP1 ,
                          String aP2 )
   {
      mrec_emplin_parametro_ingsim.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int[] aP3 )
   {
      mrec_emplin_parametro_ingsim.this.Gx_mode = aP0;
      mrec_emplin_parametro_ingsim.this.AV8EmprCod = aP1;
      mrec_emplin_parametro_ingsim.this.AV9ContCod = aP2;
      mrec_emplin_parametro_ingsim.this.AV10ContVal = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         /* Using cursor P09S72 */
         pr_default.execute(0, new Object[] {AV8EmprCod, AV9ContCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A313ContCod = P09S72_A313ContCod[0] ;
            A396EmprCod = P09S72_A396EmprCod[0] ;
            A316ContVal = P09S72_A316ContVal[0] ;
            AV10ContVal = A316ContVal ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P09S73 */
         pr_default.execute(1, new Object[] {AV8EmprCod, AV9ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized DELETE. */
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_emplin_parametro_ingsim");
      }
      else
      {
         AV16GXLvl21 = (byte)(0) ;
         /* Optimized UPDATE. */
         /* Using cursor P09S74 */
         pr_default.execute(2, new Object[] {Integer.valueOf(AV10ContVal), AV8EmprCod, AV9ContCod});
         if ( (pr_default.getStatus(2) != 101) )
         {
            AV16GXLvl21 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
         if ( AV16GXLvl21 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPEMPLIN

            */
            A396EmprCod = AV8EmprCod ;
            A313ContCod = httpContext.getMessage( "INGSIM", "") ;
            A314ContDsc = httpContext.getMessage( "Simular datos máq.", "") ;
            A316ContVal = AV10ContVal ;
            /* Using cursor P09S75 */
            pr_default.execute(3, new Object[] {A396EmprCod, A313ContCod, A314ContDsc, Integer.valueOf(A316ContVal)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec_emplin_parametro_ingsim");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = mrec_emplin_parametro_ingsim.this.AV10ContVal;
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
      P09S72_A313ContCod = new String[] {""} ;
      P09S72_A396EmprCod = new String[] {""} ;
      P09S72_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      A396EmprCod = "" ;
      A314ContDsc = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_emplin_parametro_ingsim__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_emplin_parametro_ingsim__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_emplin_parametro_ingsim__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_emplin_parametro_ingsim__default(),
         new Object[] {
             new Object[] {
            P09S72_A313ContCod, P09S72_A396EmprCod, P09S72_A316ContVal
            }
            , new Object[] {
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

   private byte AV16GXLvl21 ;
   private short Gx_err ;
   private int AV10ContVal ;
   private int A316ContVal ;
   private int GX_INS41 ;
   private String Gx_mode ;
   private String AV8EmprCod ;
   private String AV9ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A396EmprCod ;
   private String A314ContDsc ;
   private String Gx_emsg ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09S72_A313ContCod ;
   private String[] P09S72_A396EmprCod ;
   private int[] P09S72_A316ContVal ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class mrec_emplin_parametro_ingsim__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_emplin_parametro_ingsim__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_emplin_parametro_ingsim__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec_emplin_parametro_ingsim__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09S72", "SELECT ContCod, EmprCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09S73", "DELETE FROM TXPEMPLIN  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new UpdateCursor("P09S74", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new UpdateCursor("P09S75", "INSERT INTO TXPEMPLIN(EmprCod, ContCod, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContCtrl, ContClaseD, ContFecUti, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContNumIni, ContAplica, ContFecFUt, ContNumlas, ContIdSerL, Contnumcer, Contmedio) VALUES(?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 20);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

