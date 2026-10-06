package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmsolgen extends GXProcedure
{
   public pmsolgen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmsolgen.class ), "" );
   }

   public pmsolgen( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmsolgen.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pmsolgen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmsolgen.this.A9428SMCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pmsolgen.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      pmsolgen.this.A396EmprCod = GXv_char2[0] ;
      pmsolgen.this.AV9EmprNom = GXv_char3[0] ;
      pmsolgen.this.AV10UsurCod = GXv_char4[0] ;
      /* Using cursor P03MU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9519SMUsuCre = P03MU2_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P03MU2_n9519SMUsuCre[0] ;
         A9523SMTxt = P03MU2_A9523SMTxt[0] ;
         n9523SMTxt = P03MU2_n9523SMTxt[0] ;
         A9520SMMaqCod = P03MU2_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P03MU2_n9520SMMaqCod[0] ;
         A9518SMFchCre = P03MU2_A9518SMFchCre[0] ;
         n9518SMFchCre = P03MU2_n9518SMFchCre[0] ;
         A9517SMDsc = P03MU2_A9517SMDsc[0] ;
         n9517SMDsc = P03MU2_n9517SMDsc[0] ;
         A9522SMEst = P03MU2_A9522SMEst[0] ;
         n9522SMEst = P03MU2_n9522SMEst[0] ;
         A9522SMEst = httpContext.getMessage( "G", "") ;
         n9522SMEst = false ;
         /* Using cursor P03MU3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9522SMEst), A9522SMEst, A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P03MU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9520SMMaqCod = P03MU4_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P03MU4_n9520SMMaqCod[0] ;
         A9523SMTxt = P03MU4_A9523SMTxt[0] ;
         n9523SMTxt = P03MU4_n9523SMTxt[0] ;
         A9519SMUsuCre = P03MU4_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P03MU4_n9519SMUsuCre[0] ;
         A9518SMFchCre = P03MU4_A9518SMFchCre[0] ;
         n9518SMFchCre = P03MU4_n9518SMFchCre[0] ;
         A9522SMEst = P03MU4_A9522SMEst[0] ;
         n9522SMEst = P03MU4_n9522SMEst[0] ;
         A9517SMDsc = P03MU4_A9517SMDsc[0] ;
         n9517SMDsc = P03MU4_n9517SMDsc[0] ;
         /*
            INSERT RECORD ON TABLE TXPMORDEN

         */
         GXt_int5 = AV11OMCod ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MNTORD", ""), GXv_int6) ;
         pmsolgen.this.GXt_int5 = GXv_int6[0] ;
         AV11OMCod = GXt_int5 ;
         A9425OMCod = AV11OMCod ;
         A9445OMEst = httpContext.getMessage( "P", "") ;
         A9438OMFchPre = GXutil.serverDate( context, remoteHandle, pr_default) ;
         A9426OMMaqCod = A9520SMMaqCod ;
         A9433OMTxt = A9523SMTxt ;
         A9437OMUsuCre = AV10UsurCod ;
         A9436OMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
         /* Using cursor P03MU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A9426OMMaqCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod), A9433OMTxt, A9436OMFchCre, A9437OMUsuCre, A9438OMFchPre, A9445OMEst});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
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
         httpContext.wjLoc = formatLink("app.mantenimientomaquina.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "I", "")))}, new String[] {"Mode","EmprCod","OMCod","Accion"})  ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmsolgen.this.A396EmprCod;
      this.aP1[0] = pmsolgen.this.A9428SMCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmsolgen");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV9EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV10UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P03MU2_A396EmprCod = new String[] {""} ;
      P03MU2_A9428SMCod = new int[1] ;
      P03MU2_n9428SMCod = new boolean[] {false} ;
      P03MU2_A9519SMUsuCre = new String[] {""} ;
      P03MU2_n9519SMUsuCre = new boolean[] {false} ;
      P03MU2_A9523SMTxt = new String[] {""} ;
      P03MU2_n9523SMTxt = new boolean[] {false} ;
      P03MU2_A9520SMMaqCod = new String[] {""} ;
      P03MU2_n9520SMMaqCod = new boolean[] {false} ;
      P03MU2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P03MU2_n9518SMFchCre = new boolean[] {false} ;
      P03MU2_A9517SMDsc = new String[] {""} ;
      P03MU2_n9517SMDsc = new boolean[] {false} ;
      P03MU2_A9522SMEst = new String[] {""} ;
      P03MU2_n9522SMEst = new boolean[] {false} ;
      A9519SMUsuCre = "" ;
      A9523SMTxt = "" ;
      A9520SMMaqCod = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9517SMDsc = "" ;
      A9522SMEst = "" ;
      P03MU4_A396EmprCod = new String[] {""} ;
      P03MU4_A9428SMCod = new int[1] ;
      P03MU4_n9428SMCod = new boolean[] {false} ;
      P03MU4_A9520SMMaqCod = new String[] {""} ;
      P03MU4_n9520SMMaqCod = new boolean[] {false} ;
      P03MU4_A9523SMTxt = new String[] {""} ;
      P03MU4_n9523SMTxt = new boolean[] {false} ;
      P03MU4_A9519SMUsuCre = new String[] {""} ;
      P03MU4_n9519SMUsuCre = new boolean[] {false} ;
      P03MU4_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P03MU4_n9518SMFchCre = new boolean[] {false} ;
      P03MU4_A9522SMEst = new String[] {""} ;
      P03MU4_n9522SMEst = new boolean[] {false} ;
      P03MU4_A9517SMDsc = new String[] {""} ;
      P03MU4_n9517SMDsc = new boolean[] {false} ;
      GXv_int6 = new int[1] ;
      A9445OMEst = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9426OMMaqCod = "" ;
      A9433OMTxt = "" ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmsolgen__default(),
         new Object[] {
             new Object[] {
            P03MU2_A396EmprCod, P03MU2_A9428SMCod, P03MU2_A9519SMUsuCre, P03MU2_n9519SMUsuCre, P03MU2_A9523SMTxt, P03MU2_n9523SMTxt, P03MU2_A9520SMMaqCod, P03MU2_n9520SMMaqCod, P03MU2_A9518SMFchCre, P03MU2_n9518SMFchCre,
            P03MU2_A9517SMDsc, P03MU2_n9517SMDsc, P03MU2_A9522SMEst, P03MU2_n9522SMEst
            }
            , new Object[] {
            }
            , new Object[] {
            P03MU4_A396EmprCod, P03MU4_A9428SMCod, P03MU4_A9520SMMaqCod, P03MU4_n9520SMMaqCod, P03MU4_A9523SMTxt, P03MU4_n9523SMTxt, P03MU4_A9519SMUsuCre, P03MU4_n9519SMUsuCre, P03MU4_A9518SMFchCre, P03MU4_n9518SMFchCre,
            P03MU4_A9522SMEst, P03MU4_n9522SMEst, P03MU4_A9517SMDsc, P03MU4_n9517SMDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9428SMCod ;
   private int GX_INS1232 ;
   private int AV11OMCod ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int A9425OMCod ;
   private String A396EmprCod ;
   private String AV8Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9EmprNom ;
   private String GXv_char3[] ;
   private String AV10UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A9519SMUsuCre ;
   private String A9520SMMaqCod ;
   private String A9517SMDsc ;
   private String A9522SMEst ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A9437OMUsuCre ;
   private String Gx_emsg ;
   private java.util.Date A9518SMFchCre ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9438OMFchPre ;
   private boolean n9428SMCod ;
   private boolean n9519SMUsuCre ;
   private boolean n9523SMTxt ;
   private boolean n9520SMMaqCod ;
   private boolean n9518SMFchCre ;
   private boolean n9517SMDsc ;
   private boolean n9522SMEst ;
   private String A9523SMTxt ;
   private String A9433OMTxt ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MU2_A396EmprCod ;
   private int[] P03MU2_A9428SMCod ;
   private boolean[] P03MU2_n9428SMCod ;
   private String[] P03MU2_A9519SMUsuCre ;
   private boolean[] P03MU2_n9519SMUsuCre ;
   private String[] P03MU2_A9523SMTxt ;
   private boolean[] P03MU2_n9523SMTxt ;
   private String[] P03MU2_A9520SMMaqCod ;
   private boolean[] P03MU2_n9520SMMaqCod ;
   private java.util.Date[] P03MU2_A9518SMFchCre ;
   private boolean[] P03MU2_n9518SMFchCre ;
   private String[] P03MU2_A9517SMDsc ;
   private boolean[] P03MU2_n9517SMDsc ;
   private String[] P03MU2_A9522SMEst ;
   private boolean[] P03MU2_n9522SMEst ;
   private String[] P03MU4_A396EmprCod ;
   private int[] P03MU4_A9428SMCod ;
   private boolean[] P03MU4_n9428SMCod ;
   private String[] P03MU4_A9520SMMaqCod ;
   private boolean[] P03MU4_n9520SMMaqCod ;
   private String[] P03MU4_A9523SMTxt ;
   private boolean[] P03MU4_n9523SMTxt ;
   private String[] P03MU4_A9519SMUsuCre ;
   private boolean[] P03MU4_n9519SMUsuCre ;
   private java.util.Date[] P03MU4_A9518SMFchCre ;
   private boolean[] P03MU4_n9518SMFchCre ;
   private String[] P03MU4_A9522SMEst ;
   private boolean[] P03MU4_n9522SMEst ;
   private String[] P03MU4_A9517SMDsc ;
   private boolean[] P03MU4_n9517SMDsc ;
}

final  class pmsolgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MU2", "SELECT EmprCod, SMCod, SMUsuCre, SMTxt, SMMaqCod, SMFchCre, SMDsc, SMEst FROM TXPMSOLIC WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03MU3", "UPDATE TXPMSOLIC SET SMEst=?  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMSOLIC")
         ,new ForEachCursor("P03MU4", "SELECT EmprCod, SMCod, SMMaqCod, SMTxt, SMUsuCre, SMFchCre, SMEst, SMDsc FROM TXPMSOLIC WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03MU5", "INSERT INTO TXPMORDEN(EmprCod, OMCod, OMMaqCod, SMCod, OMTxt, OMFchCre, OMUsuCre, OMFchPre, OMEst, PMCod, OMOpeRes, OMFchCer, OMNot, OMPri, OMTipoId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMORDEN")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setVarchar(5, (String)parms[5], 2000, false);
               stmt.setDateTime(6, (java.util.Date)parms[6], false);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setDate(8, (java.util.Date)parms[8]);
               stmt.setString(9, (String)parms[9], 1);
               return;
      }
   }

}

